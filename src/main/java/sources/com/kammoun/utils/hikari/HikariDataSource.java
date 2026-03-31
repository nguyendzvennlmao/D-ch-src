package com.kammoun.utils.hikari;

import com.kammoun.utils.hikari.metrics.MetricsTrackerFactory;
import com.kammoun.utils.hikari.pool.HikariPool;
import java.io.Closeable;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HikariDataSource extends HikariConfig implements DataSource, Closeable {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) HikariDataSource.class);
    private final AtomicBoolean isShutdown;
    private final HikariPool fastPathPool;
    private volatile HikariPool pool;

    public HikariDataSource() {
        this.isShutdown = new AtomicBoolean();
        this.fastPathPool = null;
    }

    public HikariDataSource(HikariConfig hikariConfig) {
        this.isShutdown = new AtomicBoolean();
        hikariConfig.validate();
        hikariConfig.copyStateTo(this);
        LOGGER.info("{} - Starting...", hikariConfig.getPoolName());
        HikariPool hikariPool = new HikariPool(this);
        this.fastPathPool = hikariPool;
        this.pool = hikariPool;
        LOGGER.info("{} - Start completed.", hikariConfig.getPoolName());
        seal();
    }

    @Override
    public Connection getConnection() throws SQLException {
        if (isClosed()) {
            throw new SQLException("HikariDataSource " + this + " has been closed.");
        }
        if (this.fastPathPool != null) {
            return this.fastPathPool.getConnection();
        }
        HikariPool hikariPool = this.pool;
        if (hikariPool == null) {
            synchronized (this) {
                hikariPool = this.pool;
                if (hikariPool == null) {
                    validate();
                    LOGGER.info("{} - Starting...", getPoolName());
                    try {
                        HikariPool hikariPool2 = new HikariPool(this);
                        hikariPool = hikariPool2;
                        this.pool = hikariPool2;
                        seal();
                        LOGGER.info("{} - Start completed.", getPoolName());
                    } catch (HikariPool.PoolInitializationException e) {
                        if (e.getCause() instanceof SQLException) {
                            throw ((SQLException) e.getCause());
                        }
                        throw e;
                    }
                }
            }
        }
        return hikariPool.getConnection();
    }

    @Override
    public Connection getConnection(String str, String str2) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            return hikariPool.getUnwrappedDataSource().getLogWriter();
        }
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) throws SQLException {
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            hikariPool.getUnwrappedDataSource().setLogWriter(printWriter);
        }
    }

    @Override
    public void setLoginTimeout(int i) throws SQLException {
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            hikariPool.getUnwrappedDataSource().setLoginTimeout(i);
        }
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            return hikariPool.getUnwrappedDataSource().getLoginTimeout();
        }
        return 0;
    }

    @Override
    public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public <T> T unwrap(Class<T> cls) throws SQLException {
        if (cls.isInstance(this)) {
            return this;
        }
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            ?? r0 = (T) hikariPool.getUnwrappedDataSource();
            if (cls.isInstance(r0)) {
                return r0;
            }
            if (r0 != 0) {
                return (T) r0.unwrap(cls);
            }
        }
        throw new SQLException("Wrapped DataSource is not an instance of " + cls);
    }

    @Override
    public boolean isWrapperFor(Class<?> cls) throws SQLException {
        if (cls.isInstance(this)) {
            return true;
        }
        HikariPool hikariPool = this.pool;
        if (hikariPool == null) {
            return false;
        }
        DataSource unwrappedDataSource = hikariPool.getUnwrappedDataSource();
        if (cls.isInstance(unwrappedDataSource)) {
            return true;
        }
        if (unwrappedDataSource != null) {
            return unwrappedDataSource.isWrapperFor(cls);
        }
        return false;
    }

    @Override
    public void setMetricRegistry(Object obj) {
        boolean z = getMetricRegistry() != null;
        super.setMetricRegistry(obj);
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            if (z) {
                throw new IllegalStateException("MetricRegistry can only be set one time");
            }
            hikariPool.setMetricRegistry(super.getMetricRegistry());
        }
    }

    @Override
    public void setMetricsTrackerFactory(MetricsTrackerFactory metricsTrackerFactory) {
        boolean z = getMetricsTrackerFactory() != null;
        super.setMetricsTrackerFactory(metricsTrackerFactory);
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            if (z) {
                throw new IllegalStateException("MetricsTrackerFactory can only be set one time");
            }
            hikariPool.setMetricsTrackerFactory(super.getMetricsTrackerFactory());
        }
    }

    @Override
    public void setHealthCheckRegistry(Object obj) {
        boolean z = getHealthCheckRegistry() != null;
        super.setHealthCheckRegistry(obj);
        HikariPool hikariPool = this.pool;
        if (hikariPool != null) {
            if (z) {
                throw new IllegalStateException("HealthCheckRegistry can only be set one time");
            }
            hikariPool.setHealthCheckRegistry(super.getHealthCheckRegistry());
        }
    }

    public boolean isRunning() {
        return this.pool != null && this.pool.poolState == 0;
    }

    public HikariPoolMXBean getHikariPoolMXBean() {
        return this.pool;
    }

    public HikariConfigMXBean getHikariConfigMXBean() {
        return this;
    }

    public void evictConnection(Connection connection) {
        HikariPool hikariPool;
        if (isClosed() || (hikariPool = this.pool) == null || !connection.getClass().getName().startsWith("com.kammoun.utils.hikari")) {
            return;
        }
        hikariPool.evictConnection(connection);
    }

    @Override
    public void close() {
        HikariPool hikariPool;
        if (this.isShutdown.getAndSet(true) || (hikariPool = this.pool) == null) {
            return;
        }
        try {
            LOGGER.info("{} - Shutdown initiated...", getPoolName());
            hikariPool.shutdown();
            LOGGER.info("{} - Shutdown completed.", getPoolName());
        } catch (InterruptedException e) {
            LOGGER.warn("{} - Interrupted during closing", getPoolName(), e);
            Thread.currentThread().interrupt();
        }
    }

    public boolean isClosed() {
        return this.isShutdown.get();
    }

    public String toString() {
        return "HikariDataSource (" + this.pool + ")";
    }
}
