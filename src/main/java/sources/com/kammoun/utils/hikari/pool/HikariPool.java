package com.kammoun.utils.hikari.pool;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.kammoun.utils.hikari.HikariConfig;
import com.kammoun.utils.hikari.HikariPoolMXBean;
import com.kammoun.utils.hikari.metrics.MetricsTrackerFactory;
import com.kammoun.utils.hikari.metrics.PoolStats;
import com.kammoun.utils.hikari.metrics.dropwizard.CodahaleHealthChecker;
import com.kammoun.utils.hikari.metrics.dropwizard.CodahaleMetricsTrackerFactory;
import com.kammoun.utils.hikari.metrics.micrometer.MicrometerMetricsTrackerFactory;
import com.kammoun.utils.hikari.pool.PoolBase;
import com.kammoun.utils.hikari.util.ClockSource;
import com.kammoun.utils.hikari.util.ConcurrentBag;
import com.kammoun.utils.hikari.util.SuspendResumeLock;
import com.kammoun.utils.hikari.util.UtilityElf;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import io.micrometer.core.instrument.MeterRegistry;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class HikariPool extends PoolBase implements HikariPoolMXBean, ConcurrentBag.IBagStateListener {
    private final Logger logger;
    public static final int POOL_NORMAL = 0;
    public static final int POOL_SUSPENDED = 1;
    public static final int POOL_SHUTDOWN = 2;
    public volatile int poolState;
    private final long aliveBypassWindowMs;
    private final long housekeepingPeriodMs;
    private static final String EVICTED_CONNECTION_MESSAGE = "(connection was evicted)";
    private static final String DEAD_CONNECTION_MESSAGE = "(connection is dead)";
    private final PoolEntryCreator poolEntryCreator;
    private final PoolEntryCreator postFillPoolEntryCreator;
    private final AtomicInteger addConnectionQueueDepth;
    private final ThreadPoolExecutor addConnectionExecutor;
    private final ThreadPoolExecutor closeConnectionExecutor;
    private final ConcurrentBag<PoolEntry> connectionBag;
    private final ProxyLeakTaskFactory leakTaskFactory;
    private final SuspendResumeLock suspendResumeLock;
    private final ScheduledExecutorService houseKeepingExecutorService;
    private ScheduledFuture<?> houseKeeperTask;

    private class CustomDiscardPolicy implements RejectedExecutionHandler {
        private CustomDiscardPolicy() {
        }

        @Override
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            HikariPool.this.addConnectionQueueDepth.decrementAndGet();
        }
    }

    private final class HouseKeeper implements Runnable {
        private volatile long previous;
        private final AtomicReferenceFieldUpdater<PoolBase, String> catalogUpdater = AtomicReferenceFieldUpdater.newUpdater(PoolBase.class, String.class, "catalog");

        private HouseKeeper() {
            this.previous = ClockSource.plusMillis(ClockSource.currentTime(), -HikariPool.this.housekeepingPeriodMs);
        }

        @Override
        public void run() {
            try {
                HikariPool.this.connectionTimeout = HikariPool.this.config.getConnectionTimeout();
                HikariPool.this.validationTimeout = HikariPool.this.config.getValidationTimeout();
                HikariPool.this.leakTaskFactory.updateLeakDetectionThreshold(HikariPool.this.config.getLeakDetectionThreshold());
                if (HikariPool.this.config.getCatalog() != null && !HikariPool.this.config.getCatalog().equals(HikariPool.this.catalog)) {
                    this.catalogUpdater.set(HikariPool.this, HikariPool.this.config.getCatalog());
                }
                long idleTimeout = HikariPool.this.config.getIdleTimeout();
                long currentTime = ClockSource.currentTime();
                if (ClockSource.plusMillis(currentTime, 128L) < ClockSource.plusMillis(this.previous, HikariPool.this.housekeepingPeriodMs)) {
                    HikariPool.this.logger.warn("{} - Retrograde clock change detected (housekeeper delta={}), soft-evicting connections from pool.", HikariPool.this.poolName, ClockSource.elapsedDisplayString(this.previous, currentTime));
                    this.previous = currentTime;
                    HikariPool.this.softEvictConnections();
                    return;
                }
                if (currentTime > ClockSource.plusMillis(this.previous, (3 * HikariPool.this.housekeepingPeriodMs) / 2)) {
                    HikariPool.this.logger.warn("{} - Thread starvation or clock leap detected (housekeeper delta={}).", HikariPool.this.poolName, ClockSource.elapsedDisplayString(this.previous, currentTime));
                }
                this.previous = currentTime;
                String str = "Pool ";
                if (idleTimeout > 0 && HikariPool.this.config.getMinimumIdle() < HikariPool.this.config.getMaximumPoolSize()) {
                    HikariPool.this.logPoolState("Before cleanup ");
                    str = "After cleanup  ";
                    List<PoolEntry> values = HikariPool.this.connectionBag.values(0);
                    int size = values.size() - HikariPool.this.config.getMinimumIdle();
                    for (PoolEntry poolEntry : values) {
                        if (size > 0 && ClockSource.elapsedMillis(poolEntry.lastAccessed, currentTime) > idleTimeout && HikariPool.this.connectionBag.reserve(poolEntry)) {
                            HikariPool.this.closeConnection(poolEntry, "(connection has passed idleTimeout)");
                            size--;
                        }
                    }
                }
                HikariPool.this.logPoolState(str);
                HikariPool.this.fillPool(true);
            } catch (Exception e) {
                HikariPool.this.logger.error("Unexpected exception in housekeeping task", (Throwable) e);
            }
        }
    }

    public final class KeepaliveTask implements Runnable {
        private final PoolEntry poolEntry;

        KeepaliveTask(PoolEntry poolEntry) {
            this.poolEntry = poolEntry;
        }

        @Override
        public void run() {
            if (HikariPool.this.connectionBag.reserve(this.poolEntry)) {
                if (HikariPool.this.isConnectionDead(this.poolEntry.connection)) {
                    HikariPool.this.softEvictConnection(this.poolEntry, HikariPool.DEAD_CONNECTION_MESSAGE, true);
                    HikariPool.this.addBagItem(HikariPool.this.connectionBag.getWaitingThreadCount());
                } else {
                    HikariPool.this.connectionBag.unreserve(this.poolEntry);
                    HikariPool.this.logger.debug("{} - keepalive: connection {} is alive", HikariPool.this.poolName, this.poolEntry.connection);
                }
            }
        }
    }

    public final class MaxLifetimeTask implements Runnable {
        private final PoolEntry poolEntry;

        MaxLifetimeTask(PoolEntry poolEntry) {
            this.poolEntry = poolEntry;
        }

        @Override
        public void run() {
            if (HikariPool.this.softEvictConnection(this.poolEntry, "(connection has passed maxLifetime)", false)) {
                HikariPool.this.addBagItem(HikariPool.this.connectionBag.getWaitingThreadCount());
            }
        }
    }

    public final class PoolEntryCreator implements Callable<Boolean> {
        private final String loggingPrefix;

        PoolEntryCreator(HikariPool hikariPool) {
            this(null);
        }

        PoolEntryCreator(String str) {
            this.loggingPrefix = str;
        }

        @Override
        public Boolean call() {
            long j = 10;
            boolean z = false;
            while (shouldContinueCreating()) {
                try {
                    PoolEntry createPoolEntry = HikariPool.this.createPoolEntry();
                    if (createPoolEntry != null) {
                        z = true;
                        j = 10;
                        HikariPool.this.connectionBag.add(createPoolEntry);
                        HikariPool.this.logger.debug("{} - Added connection {}", HikariPool.this.poolName, createPoolEntry.connection);
                    } else {
                        j = Math.min(TimeUnit.SECONDS.toMillis(5L), j * 2);
                        if (this.loggingPrefix != null) {
                            HikariPool.this.logger.debug("{} - Connection add failed, sleeping with backoff: {}ms", HikariPool.this.poolName, Long.valueOf(j));
                        }
                    }
                    UtilityElf.quietlySleep(j);
                } catch (Throwable th) {
                    HikariPool.this.addConnectionQueueDepth.decrementAndGet();
                    if (z && this.loggingPrefix != null) {
                        HikariPool.this.logPoolState(this.loggingPrefix);
                    }
                    throw th;
                }
            }
            HikariPool.this.addConnectionQueueDepth.decrementAndGet();
            if (z && this.loggingPrefix != null) {
                HikariPool.this.logPoolState(this.loggingPrefix);
            }
            return Boolean.FALSE;
        }

        private synchronized boolean shouldContinueCreating() {
            return HikariPool.this.poolState == 0 && HikariPool.this.getTotalConnections() < HikariPool.this.config.getMaximumPoolSize() && (HikariPool.this.getIdleConnections() < HikariPool.this.config.getMinimumIdle() || HikariPool.this.connectionBag.getWaitingThreadCount() > HikariPool.this.getIdleConnections());
        }
    }

    public static class PoolInitializationException extends RuntimeException {
        private static final long serialVersionUID = 929872118275916520L;

        public PoolInitializationException(Throwable th) {
            super("Failed to initialize pool: " + th.getMessage(), th);
        }
    }

    public HikariPool(HikariConfig hikariConfig) {
        super(hikariConfig);
        this.logger = LoggerFactory.getLogger((Class<?>) HikariPool.class);
        this.aliveBypassWindowMs = Long.getLong("com.kammoun.utils.hikari.aliveBypassWindowMs", TimeUnit.MILLISECONDS.toMillis(500L)).longValue();
        this.housekeepingPeriodMs = Long.getLong("com.kammoun.utils.hikari.housekeeping.periodMs", TimeUnit.SECONDS.toMillis(30L)).longValue();
        this.poolEntryCreator = new PoolEntryCreator(this);
        this.postFillPoolEntryCreator = new PoolEntryCreator("After adding ");
        this.addConnectionQueueDepth = new AtomicInteger();
        this.connectionBag = new ConcurrentBag<>(this);
        this.suspendResumeLock = hikariConfig.isAllowPoolSuspension() ? new SuspendResumeLock() : SuspendResumeLock.FAUX_LOCK;
        this.houseKeepingExecutorService = initializeHouseKeepingExecutorService();
        checkFailFast();
        if (hikariConfig.getMetricsTrackerFactory() != null) {
            setMetricsTrackerFactory(hikariConfig.getMetricsTrackerFactory());
        } else {
            setMetricRegistry(hikariConfig.getMetricRegistry());
        }
        setHealthCheckRegistry(hikariConfig.getHealthCheckRegistry());
        handleMBeans(this, true);
        ThreadFactory threadFactory = hikariConfig.getThreadFactory();
        int maximumPoolSize = hikariConfig.getMaximumPoolSize();
        this.addConnectionExecutor = UtilityElf.createThreadPoolExecutor(new LinkedBlockingQueue(16), this.poolName + " connection adder", threadFactory, new CustomDiscardPolicy());
        this.closeConnectionExecutor = UtilityElf.createThreadPoolExecutor(maximumPoolSize, this.poolName + " connection closer", threadFactory, new ThreadPoolExecutor.CallerRunsPolicy());
        this.leakTaskFactory = new ProxyLeakTaskFactory(hikariConfig.getLeakDetectionThreshold(), this.houseKeepingExecutorService);
        this.houseKeeperTask = this.houseKeepingExecutorService.scheduleWithFixedDelay(new HouseKeeper(), 100L, this.housekeepingPeriodMs, TimeUnit.MILLISECONDS);
        if (!Boolean.getBoolean("com.kammoun.utils.hikari.blockUntilFilled") || hikariConfig.getInitializationFailTimeout() <= 1) {
            return;
        }
        this.addConnectionExecutor.setMaximumPoolSize(Math.min(16, Runtime.getRuntime().availableProcessors()));
        this.addConnectionExecutor.setCorePoolSize(Math.min(16, Runtime.getRuntime().availableProcessors()));
        long currentTime = ClockSource.currentTime();
        while (ClockSource.elapsedMillis(currentTime) < hikariConfig.getInitializationFailTimeout() && getTotalConnections() < hikariConfig.getMinimumIdle()) {
            UtilityElf.quietlySleep(TimeUnit.MILLISECONDS.toMillis(100L));
        }
        this.addConnectionExecutor.setCorePoolSize(1);
        this.addConnectionExecutor.setMaximumPoolSize(1);
    }

    public Connection getConnection() throws SQLException {
        return getConnection(this.connectionTimeout);
    }

    public Connection getConnection(long j) throws SQLException {
        this.suspendResumeLock.acquire();
        long currentTime = ClockSource.currentTime();
        long j2 = j;
        do {
            try {
                try {
                    PoolEntry borrow = this.connectionBag.borrow(j2, TimeUnit.MILLISECONDS);
                    if (borrow == null) {
                        break;
                    }
                    long currentTime2 = ClockSource.currentTime();
                    if (!borrow.isMarkedEvicted() && (ClockSource.elapsedMillis(borrow.lastAccessed, currentTime2) <= this.aliveBypassWindowMs || !isConnectionDead(borrow.connection))) {
                        this.metricsTracker.recordBorrowStats(borrow, currentTime);
                        Connection createProxyConnection = borrow.createProxyConnection(this.leakTaskFactory.schedule(borrow));
                        this.suspendResumeLock.release();
                        return createProxyConnection;
                    }
                    closeConnection(borrow, borrow.isMarkedEvicted() ? EVICTED_CONNECTION_MESSAGE : DEAD_CONNECTION_MESSAGE);
                    j2 = j - ClockSource.elapsedMillis(currentTime);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new SQLException(this.poolName + " - Interrupted during connection acquisition", e);
                }
            } catch (Throwable th) {
                this.suspendResumeLock.release();
                throw th;
            }
        } while (j2 > 0);
        this.metricsTracker.recordBorrowTimeoutStats(currentTime);
        throw createTimeoutException(currentTime);
    }

    public synchronized void shutdown() throws InterruptedException {
        try {
            this.poolState = 2;
            if (this.addConnectionExecutor == null) {
                logPoolState("After shutdown ");
                handleMBeans(this, false);
                this.metricsTracker.close();
                return;
            }
            logPoolState("Before shutdown ");
            if (this.houseKeeperTask != null) {
                this.houseKeeperTask.cancel(false);
                this.houseKeeperTask = null;
            }
            softEvictConnections();
            this.addConnectionExecutor.shutdown();
            if (!this.addConnectionExecutor.awaitTermination(getLoginTimeout(), TimeUnit.SECONDS)) {
                this.logger.warn("Timed-out waiting for add connection executor to shutdown");
            }
            destroyHouseKeepingExecutorService();
            this.connectionBag.close();
            ThreadPoolExecutor createThreadPoolExecutor = UtilityElf.createThreadPoolExecutor(this.config.getMaximumPoolSize(), this.poolName + " connection assassinator", this.config.getThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());
            try {
                long currentTime = ClockSource.currentTime();
                do {
                    abortActiveConnections(createThreadPoolExecutor);
                    softEvictConnections();
                    if (getTotalConnections() <= 0) {
                        break;
                    }
                } while (ClockSource.elapsedMillis(currentTime) < TimeUnit.SECONDS.toMillis(10L));
                createThreadPoolExecutor.shutdown();
                if (!createThreadPoolExecutor.awaitTermination(10L, TimeUnit.SECONDS)) {
                    this.logger.warn("Timed-out waiting for connection assassin to shutdown");
                }
                shutdownNetworkTimeoutExecutor();
                this.closeConnectionExecutor.shutdown();
                if (!this.closeConnectionExecutor.awaitTermination(10L, TimeUnit.SECONDS)) {
                    this.logger.warn("Timed-out waiting for close connection executor to shutdown");
                }
                logPoolState("After shutdown ");
                handleMBeans(this, false);
                this.metricsTracker.close();
            } catch (Throwable th) {
                createThreadPoolExecutor.shutdown();
                if (!createThreadPoolExecutor.awaitTermination(10L, TimeUnit.SECONDS)) {
                    this.logger.warn("Timed-out waiting for connection assassin to shutdown");
                }
                throw th;
            }
        } catch (Throwable th2) {
            logPoolState("After shutdown ");
            handleMBeans(this, false);
            this.metricsTracker.close();
            throw th2;
        }
    }

    public void evictConnection(Connection connection) {
        ProxyConnection proxyConnection = (ProxyConnection) connection;
        proxyConnection.cancelLeakTask();
        try {
            softEvictConnection(proxyConnection.getPoolEntry(), "(connection evicted by user)", !connection.isClosed());
        } catch (SQLException e) {
        }
    }

    public void setMetricRegistry(Object obj) {
        if (obj != null && UtilityElf.safeIsAssignableFrom(obj, "com.codahale.metrics.MetricRegistry")) {
            setMetricsTrackerFactory(new CodahaleMetricsTrackerFactory((MetricRegistry) obj));
        } else if (obj == null || !UtilityElf.safeIsAssignableFrom(obj, "io.micrometer.core.instrument.MeterRegistry")) {
            setMetricsTrackerFactory(null);
        } else {
            setMetricsTrackerFactory(new MicrometerMetricsTrackerFactory((MeterRegistry) obj));
        }
    }

    public void setMetricsTrackerFactory(MetricsTrackerFactory metricsTrackerFactory) {
        if (metricsTrackerFactory != null) {
            this.metricsTracker = new PoolBase.MetricsTrackerDelegate(metricsTrackerFactory.create(this.config.getPoolName(), getPoolStats()));
        } else {
            this.metricsTracker = new PoolBase.NopMetricsTrackerDelegate();
        }
    }

    public void setHealthCheckRegistry(Object obj) {
        if (obj != null) {
            CodahaleHealthChecker.registerHealthChecks(this, this.config, (HealthCheckRegistry) obj);
        }
    }

    @Override
    public void addBagItem(int i) {
        int i2 = this.addConnectionQueueDepth.get();
        if (i - i2 < 0) {
            this.logger.debug("{} - Add connection elided, waiting={}, adders pending/running={}", this.poolName, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            this.addConnectionQueueDepth.incrementAndGet();
            this.addConnectionExecutor.submit(this.poolEntryCreator);
        }
    }

    @Override
    public int getActiveConnections() {
        return this.connectionBag.getCount(1);
    }

    @Override
    public int getIdleConnections() {
        return this.connectionBag.getCount(0);
    }

    @Override
    public int getTotalConnections() {
        return this.connectionBag.size();
    }

    @Override
    public int getThreadsAwaitingConnection() {
        return this.connectionBag.getWaitingThreadCount();
    }

    @Override
    public void softEvictConnections() {
        this.connectionBag.values().forEach(poolEntry -> {
            softEvictConnection(poolEntry, "(connection evicted)", false);
        });
    }

    @Override
    public synchronized void suspendPool() {
        if (this.suspendResumeLock == SuspendResumeLock.FAUX_LOCK) {
            throw new IllegalStateException(this.poolName + " - is not suspendable");
        }
        if (this.poolState != 1) {
            this.suspendResumeLock.suspend();
            this.poolState = 1;
        }
    }

    @Override
    public synchronized void resumePool() {
        if (this.poolState == 1) {
            this.poolState = 0;
            fillPool(false);
            this.suspendResumeLock.resume();
        }
    }

    void logPoolState(String... strArr) {
        if (this.logger.isDebugEnabled()) {
            Logger logger = this.logger;
            Object[] objArr = new Object[6];
            objArr[0] = this.poolName;
            objArr[1] = strArr.length > 0 ? strArr[0] : JsonProperty.USE_DEFAULT_NAME;
            objArr[2] = Integer.valueOf(getTotalConnections());
            objArr[3] = Integer.valueOf(getActiveConnections());
            objArr[4] = Integer.valueOf(getIdleConnections());
            objArr[5] = Integer.valueOf(getThreadsAwaitingConnection());
            logger.debug("{} - {}stats (total={}, active={}, idle={}, waiting={})", objArr);
        }
    }

    @Override
    public void recycle(PoolEntry poolEntry) {
        this.metricsTracker.recordConnectionUsage(poolEntry);
        this.connectionBag.requite(poolEntry);
    }

    public void closeConnection(PoolEntry poolEntry, String str) {
        if (this.connectionBag.remove(poolEntry)) {
            Connection close = poolEntry.close();
            this.closeConnectionExecutor.execute(() -> {
                quietlyCloseConnection(close, str);
                if (this.poolState == 0) {
                    fillPool(false);
                }
            });
        }
    }

    int[] getPoolStateCounts() {
        return this.connectionBag.getStateCounts();
    }

    private PoolEntry createPoolEntry() {
        try {
            PoolEntry newPoolEntry = newPoolEntry();
            long maxLifetime = this.config.getMaxLifetime();
            if (maxLifetime > 0) {
                newPoolEntry.setFutureEol(this.houseKeepingExecutorService.schedule(new MaxLifetimeTask(newPoolEntry), maxLifetime - (maxLifetime > 10000 ? ThreadLocalRandom.current().nextLong(maxLifetime / 40) : 0L), TimeUnit.MILLISECONDS));
            }
            long keepaliveTime = this.config.getKeepaliveTime();
            if (keepaliveTime > 0) {
                long nextLong = keepaliveTime - ThreadLocalRandom.current().nextLong(keepaliveTime / 10);
                newPoolEntry.setKeepalive(this.houseKeepingExecutorService.scheduleWithFixedDelay(new KeepaliveTask(newPoolEntry), nextLong, nextLong, TimeUnit.MILLISECONDS));
            }
            return newPoolEntry;
        } catch (PoolBase.ConnectionSetupException e) {
            if (this.poolState != 0) {
                return null;
            }
            this.logger.error("{} - Error thrown while acquiring connection from data source", this.poolName, e.getCause());
            this.lastConnectionFailure.set(e);
            return null;
        } catch (Exception e2) {
            if (this.poolState != 0) {
                return null;
            }
            this.logger.debug("{} - Cannot acquire connection from data source", this.poolName, e2);
            return null;
        }
    }

    private synchronized void fillPool(boolean z) {
        int i = this.addConnectionQueueDepth.get();
        if (getTotalConnections() < this.config.getMaximumPoolSize() && (getIdleConnections() < this.config.getMinimumIdle() || this.connectionBag.getWaitingThreadCount() - i > getIdleConnections())) {
            this.addConnectionQueueDepth.incrementAndGet();
            this.addConnectionExecutor.submit(z ? this.postFillPoolEntryCreator : this.poolEntryCreator);
        } else if (z) {
            this.logger.debug("{} - Fill pool skipped, pool has sufficient level or currently being filled (queueDepth={}).", this.poolName, Integer.valueOf(i));
        }
    }

    private void abortActiveConnections(ExecutorService executorService) {
        for (PoolEntry poolEntry : this.connectionBag.values(1)) {
            Connection close = poolEntry.close();
            try {
                try {
                    close.abort(executorService);
                    this.connectionBag.remove(poolEntry);
                } catch (Throwable th) {
                    quietlyCloseConnection(close, "(connection aborted during shutdown)");
                    this.connectionBag.remove(poolEntry);
                }
            } catch (Throwable th2) {
                this.connectionBag.remove(poolEntry);
                throw th2;
            }
        }
    }

    private void checkFailFast() {
        long initializationFailTimeout = this.config.getInitializationFailTimeout();
        if (initializationFailTimeout < 0) {
            return;
        }
        long currentTime = ClockSource.currentTime();
        do {
            PoolEntry createPoolEntry = createPoolEntry();
            if (createPoolEntry != null) {
                if (this.config.getMinimumIdle() <= 0) {
                    quietlyCloseConnection(createPoolEntry.close(), "(initialization check complete and minimumIdle is zero)");
                    return;
                } else {
                    this.connectionBag.add(createPoolEntry);
                    this.logger.info("{} - Added connection {}", this.poolName, createPoolEntry.connection);
                    return;
                }
            }
            if (getLastConnectionFailure() instanceof PoolBase.ConnectionSetupException) {
                throwPoolInitializationException(getLastConnectionFailure().getCause());
            }
            UtilityElf.quietlySleep(TimeUnit.SECONDS.toMillis(1L));
        } while (ClockSource.elapsedMillis(currentTime) < initializationFailTimeout);
        if (initializationFailTimeout > 0) {
            throwPoolInitializationException(getLastConnectionFailure());
        }
    }

    private void throwPoolInitializationException(Throwable th) {
        this.logger.error("{} - Exception during pool initialization.", this.poolName, th);
        destroyHouseKeepingExecutorService();
        throw new PoolInitializationException(th);
    }

    private boolean softEvictConnection(PoolEntry poolEntry, String str, boolean z) {
        poolEntry.markEvicted();
        if (!z && !this.connectionBag.reserve(poolEntry)) {
            return false;
        }
        closeConnection(poolEntry, str);
        return true;
    }

    private ScheduledExecutorService initializeHouseKeepingExecutorService() {
        if (this.config.getScheduledExecutor() != null) {
            return this.config.getScheduledExecutor();
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, (ThreadFactory) Optional.ofNullable(this.config.getThreadFactory()).orElseGet(() -> {
            return new UtilityElf.DefaultThreadFactory(this.poolName + " housekeeper", true);
        }), new ThreadPoolExecutor.DiscardPolicy());
        scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        return scheduledThreadPoolExecutor;
    }

    private void destroyHouseKeepingExecutorService() {
        if (this.config.getScheduledExecutor() == null) {
            this.houseKeepingExecutorService.shutdownNow();
        }
    }

    private PoolStats getPoolStats() {
        return new PoolStats(TimeUnit.SECONDS.toMillis(1L)) {
            @Override
            protected void update() {
                this.pendingThreads = HikariPool.this.getThreadsAwaitingConnection();
                this.idleConnections = HikariPool.this.getIdleConnections();
                this.totalConnections = HikariPool.this.getTotalConnections();
                this.activeConnections = HikariPool.this.getActiveConnections();
                this.maxConnections = HikariPool.this.config.getMaximumPoolSize();
                this.minConnections = HikariPool.this.config.getMinimumIdle();
            }
        };
    }

    private SQLException createTimeoutException(long j) {
        logPoolState("Timeout failure ");
        this.metricsTracker.recordConnectionTimeout();
        String str = null;
        Exception lastConnectionFailure = getLastConnectionFailure();
        if (lastConnectionFailure instanceof SQLException) {
            str = ((SQLException) lastConnectionFailure).getSQLState();
        }
        SQLTransientConnectionException sQLTransientConnectionException = new SQLTransientConnectionException(this.poolName + " - Connection is not available, request timed out after " + ClockSource.elapsedMillis(j) + "ms.", str, lastConnectionFailure);
        if (lastConnectionFailure instanceof SQLException) {
            sQLTransientConnectionException.setNextException((SQLException) lastConnectionFailure);
        }
        return sQLTransientConnectionException;
    }

    @Override
    public DataSource getUnwrappedDataSource() {
        return super.getUnwrappedDataSource();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
