package com.kammoun.utils.hikari.pool;

import com.kammoun.utils.hikari.HikariConfig;
import com.kammoun.utils.hikari.SQLExceptionOverride;
import com.kammoun.utils.hikari.metrics.IMetricsTracker;
import com.kammoun.utils.hikari.pool.HikariPool;
import com.kammoun.utils.hikari.util.ClockSource;
import com.kammoun.utils.hikari.util.DriverDataSource;
import com.kammoun.utils.hikari.util.PropertyElf;
import com.kammoun.utils.hikari.util.UtilityElf;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PoolBase {
    public final HikariConfig config;
    IMetricsTrackerDelegate metricsTracker;
    protected final String poolName;
    volatile String catalog;
    final AtomicReference<Exception> lastConnectionFailure;
    long connectionTimeout;
    long validationTimeout;
    SQLExceptionOverride exceptionOverride;
    private static final String[] RESET_STATES = {"readOnly", "autoCommit", "isolation", "catalog", "netTimeout", "schema"};
    private static final int UNINITIALIZED = -1;
    private static final int TRUE = 1;
    private static final int FALSE = 0;
    private int defaultTransactionIsolation;
    private int transactionIsolation;
    private Executor netTimeoutExecutor;
    private DataSource dataSource;
    private final String schema;
    private final boolean isReadOnly;
    private final boolean isAutoCommit;
    private final boolean isUseJdbc4Validation;
    private final boolean isIsolateInternalQueries;
    private volatile boolean isValidChecked;
    private final Logger logger = LoggerFactory.getLogger((Class<?>) PoolBase.class);
    private int networkTimeout = -1;
    private int isQueryTimeoutSupported = -1;
    private int isNetworkTimeoutSupported = -1;

    public static class ConnectionSetupException extends Exception {
        private static final long serialVersionUID = 929872118275916521L;

        ConnectionSetupException(Throwable th) {
            super(th);
        }
    }

    public interface IMetricsTrackerDelegate extends AutoCloseable {
        default void recordConnectionUsage(PoolEntry poolEntry) {
        }

        default void recordConnectionCreated(long j) {
        }

        default void recordBorrowTimeoutStats(long j) {
        }

        default void recordBorrowStats(PoolEntry poolEntry, long j) {
        }

        default void recordConnectionTimeout() {
        }

        @Override
        default void close() {
        }
    }

    static class MetricsTrackerDelegate implements IMetricsTrackerDelegate {
        final IMetricsTracker tracker;

        public MetricsTrackerDelegate(IMetricsTracker iMetricsTracker) {
            this.tracker = iMetricsTracker;
        }

        @Override
        public void recordConnectionUsage(PoolEntry poolEntry) {
            this.tracker.recordConnectionUsageMillis(poolEntry.getMillisSinceBorrowed());
        }

        @Override
        public void recordConnectionCreated(long j) {
            this.tracker.recordConnectionCreatedMillis(j);
        }

        @Override
        public void recordBorrowTimeoutStats(long j) {
            this.tracker.recordConnectionAcquiredNanos(ClockSource.elapsedNanos(j));
        }

        @Override
        public void recordBorrowStats(PoolEntry poolEntry, long j) {
            long currentTime = ClockSource.currentTime();
            poolEntry.lastBorrowed = currentTime;
            this.tracker.recordConnectionAcquiredNanos(ClockSource.elapsedNanos(j, currentTime));
        }

        @Override
        public void recordConnectionTimeout() {
            this.tracker.recordConnectionTimeout();
        }

        @Override
        public void close() {
            this.tracker.close();
        }
    }

    static final class NopMetricsTrackerDelegate implements IMetricsTrackerDelegate {
    }

    public static class SynchronousExecutor implements Executor {
        private SynchronousExecutor() {
        }

        @Override
        public void execute(Runnable runnable) {
            try {
                runnable.run();
            } catch (Exception e) {
                LoggerFactory.getLogger((Class<?>) PoolBase.class).debug("Failed to execute: {}", runnable, e);
            }
        }
    }

    public PoolBase(HikariConfig hikariConfig) {
        this.config = hikariConfig;
        this.catalog = hikariConfig.getCatalog();
        this.schema = hikariConfig.getSchema();
        this.isReadOnly = hikariConfig.isReadOnly();
        this.isAutoCommit = hikariConfig.isAutoCommit();
        this.exceptionOverride = (SQLExceptionOverride) UtilityElf.createInstance(hikariConfig.getExceptionOverrideClassName(), SQLExceptionOverride.class, new Object[0]);
        this.transactionIsolation = UtilityElf.getTransactionIsolation(hikariConfig.getTransactionIsolation());
        this.isUseJdbc4Validation = hikariConfig.getConnectionTestQuery() == null;
        this.isIsolateInternalQueries = hikariConfig.isIsolateInternalQueries();
        this.poolName = hikariConfig.getPoolName();
        this.connectionTimeout = hikariConfig.getConnectionTimeout();
        this.validationTimeout = hikariConfig.getValidationTimeout();
        this.lastConnectionFailure = new AtomicReference<>();
        initializeDataSource();
    }

    public String toString() {
        return this.poolName;
    }

    abstract void recycle(PoolEntry poolEntry);

    public void quietlyCloseConnection(Connection connection, String str) {
        if (connection != null) {
            try {
                this.logger.debug("{} - Closing connection {}: {}", this.poolName, connection, str);
                try {
                    try {
                        setNetworkTimeout(connection, TimeUnit.SECONDS.toMillis(15L));
                        if (connection != null) {
                            connection.close();
                        }
                    } catch (SQLException e) {
                    }
                } catch (Throwable th) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                this.logger.debug("{} - Closing connection {} failed", this.poolName, connection, e2);
            }
        }
    }

    public boolean isConnectionDead(Connection connection) {
        try {
            try {
                setNetworkTimeout(connection, this.validationTimeout);
                int max = ((int) Math.max(1000L, this.validationTimeout)) / 1000;
                if (this.isUseJdbc4Validation) {
                    return !connection.isValid(max);
                }
                Statement createStatement = connection.createStatement();
                try {
                    if (this.isNetworkTimeoutSupported != 1) {
                        setQueryTimeout(createStatement, max);
                    }
                    createStatement.execute(this.config.getConnectionTestQuery());
                    if (createStatement != null) {
                        createStatement.close();
                    }
                    setNetworkTimeout(connection, this.networkTimeout);
                    if (!this.isIsolateInternalQueries || this.isAutoCommit) {
                        return false;
                    }
                    connection.rollback();
                    return false;
                } catch (Throwable th) {
                    if (createStatement != null) {
                        try {
                            createStatement.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } finally {
                setNetworkTimeout(connection, this.networkTimeout);
                if (this.isIsolateInternalQueries && !this.isAutoCommit) {
                    connection.rollback();
                }
            }
        } catch (Exception e) {
            this.lastConnectionFailure.set(e);
            this.logger.warn("{} - Failed to validate connection {} ({}). Possibly consider using a shorter maxLifetime value.", this.poolName, connection, e.getMessage());
            return true;
        }
    }

    public Exception getLastConnectionFailure() {
        return this.lastConnectionFailure.get();
    }

    public DataSource getUnwrappedDataSource() {
        return this.dataSource;
    }

    public PoolEntry newPoolEntry() throws Exception {
        return new PoolEntry(newConnection(), this, this.isReadOnly, this.isAutoCommit);
    }

    public void resetConnectionState(Connection connection, ProxyConnection proxyConnection, int i) throws SQLException {
        int i2 = 0;
        if ((i & 1) != 0 && proxyConnection.getReadOnlyState() != this.isReadOnly) {
            connection.setReadOnly(this.isReadOnly);
            i2 = 0 | 1;
        }
        if ((i & 2) != 0 && proxyConnection.getAutoCommitState() != this.isAutoCommit) {
            connection.setAutoCommit(this.isAutoCommit);
            i2 |= 2;
        }
        if ((i & 4) != 0 && proxyConnection.getTransactionIsolationState() != this.transactionIsolation) {
            connection.setTransactionIsolation(this.transactionIsolation);
            i2 |= 4;
        }
        if ((i & 8) != 0 && this.catalog != null && !this.catalog.equals(proxyConnection.getCatalogState())) {
            connection.setCatalog(this.catalog);
            i2 |= 8;
        }
        if ((i & 16) != 0 && proxyConnection.getNetworkTimeoutState() != this.networkTimeout) {
            setNetworkTimeout(connection, this.networkTimeout);
            i2 |= 16;
        }
        if ((i & 32) != 0 && this.schema != null && !this.schema.equals(proxyConnection.getSchemaState())) {
            connection.setSchema(this.schema);
            i2 |= 32;
        }
        if (i2 == 0 || !this.logger.isDebugEnabled()) {
            return;
        }
        this.logger.debug("{} - Reset ({}) on connection {}", this.poolName, stringFromResetBits(i2), connection);
    }

    public void shutdownNetworkTimeoutExecutor() {
        if (this.netTimeoutExecutor instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) this.netTimeoutExecutor).shutdownNow();
        }
    }

    public long getLoginTimeout() {
        try {
            return this.dataSource != null ? this.dataSource.getLoginTimeout() : TimeUnit.SECONDS.toSeconds(5L);
        } catch (SQLException e) {
            return TimeUnit.SECONDS.toSeconds(5L);
        }
    }

    public void handleMBeans(HikariPool hikariPool, boolean z) {
        ObjectName objectName;
        ObjectName objectName2;
        if (this.config.isRegisterMbeans()) {
            try {
                MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
                if ("true".equals(System.getProperty("hikaricp.jmx.register2.0"))) {
                    objectName = new ObjectName("com.kammoun.utils.hikari:type=PoolConfig,name=" + this.poolName);
                    objectName2 = new ObjectName("com.kammoun.utils.hikari:type=Pool,name=" + this.poolName);
                } else {
                    objectName = new ObjectName("com.kammoun.utils.hikari:type=PoolConfig (" + this.poolName + ")");
                    objectName2 = new ObjectName("com.kammoun.utils.hikari:type=Pool (" + this.poolName + ")");
                }
                if (z) {
                    if (platformMBeanServer.isRegistered(objectName)) {
                        this.logger.error("{} - JMX name ({}) is already registered.", this.poolName, this.poolName);
                    } else {
                        platformMBeanServer.registerMBean(this.config, objectName);
                        platformMBeanServer.registerMBean(hikariPool, objectName2);
                    }
                } else if (platformMBeanServer.isRegistered(objectName)) {
                    platformMBeanServer.unregisterMBean(objectName);
                    platformMBeanServer.unregisterMBean(objectName2);
                }
            } catch (Exception e) {
                Logger logger = this.logger;
                Object[] objArr = new Object[3];
                objArr[0] = this.poolName;
                objArr[1] = z ? "register" : "unregister";
                objArr[2] = e;
                logger.warn("{} - Failed to {} management beans.", objArr);
            }
        }
    }

    private void initializeDataSource() {
        String jdbcUrl = this.config.getJdbcUrl();
        String username = this.config.getUsername();
        String password = this.config.getPassword();
        String dataSourceClassName = this.config.getDataSourceClassName();
        String driverClassName = this.config.getDriverClassName();
        String dataSourceJNDI = this.config.getDataSourceJNDI();
        Properties dataSourceProperties = this.config.getDataSourceProperties();
        DataSource dataSource = this.config.getDataSource();
        if (dataSourceClassName != null && dataSource == null) {
            dataSource = (DataSource) UtilityElf.createInstance(dataSourceClassName, DataSource.class, new Object[0]);
            PropertyElf.setTargetFromProperties(dataSource, dataSourceProperties);
        } else if (jdbcUrl != null && dataSource == null) {
            dataSource = new DriverDataSource(jdbcUrl, driverClassName, dataSourceProperties, username, password);
        } else if (dataSourceJNDI != null && dataSource == null) {
            try {
                dataSource = (DataSource) new InitialContext().lookup(dataSourceJNDI);
            } catch (NamingException e) {
                throw new HikariPool.PoolInitializationException(e);
            }
        }
        if (dataSource != null) {
            setLoginTimeout(dataSource);
            createNetworkTimeoutExecutor(dataSource, dataSourceClassName, jdbcUrl);
        }
        this.dataSource = dataSource;
    }

    private Connection newConnection() throws Exception {
        long currentTime = ClockSource.currentTime();
        try {
            try {
                String username = this.config.getUsername();
                Connection connection = username == null ? this.dataSource.getConnection() : this.dataSource.getConnection(username, this.config.getPassword());
                if (connection == null) {
                    throw new SQLTransientConnectionException("DataSource returned null unexpectedly");
                }
                setupConnection(connection);
                this.lastConnectionFailure.set(null);
                if (this.metricsTracker != null) {
                    this.metricsTracker.recordConnectionCreated(ClockSource.elapsedMillis(currentTime));
                }
                return connection;
            } catch (Exception e) {
                if (0 != 0) {
                    quietlyCloseConnection(null, "(Failed to create/setup connection)");
                } else if (getLastConnectionFailure() == null) {
                    this.logger.debug("{} - Failed to create/setup connection: {}", this.poolName, e.getMessage());
                }
                this.lastConnectionFailure.set(e);
                throw e;
            }
        } catch (Throwable th) {
            if (this.metricsTracker != null) {
                this.metricsTracker.recordConnectionCreated(ClockSource.elapsedMillis(currentTime));
            }
            throw th;
        }
    }

    private void setupConnection(Connection connection) throws ConnectionSetupException {
        try {
            if (this.networkTimeout == -1) {
                this.networkTimeout = getAndSetNetworkTimeout(connection, this.validationTimeout);
            } else {
                setNetworkTimeout(connection, this.validationTimeout);
            }
            if (connection.isReadOnly() != this.isReadOnly) {
                connection.setReadOnly(this.isReadOnly);
            }
            if (connection.getAutoCommit() != this.isAutoCommit) {
                connection.setAutoCommit(this.isAutoCommit);
            }
            checkDriverSupport(connection);
            if (this.transactionIsolation != this.defaultTransactionIsolation) {
                connection.setTransactionIsolation(this.transactionIsolation);
            }
            if (this.catalog != null) {
                connection.setCatalog(this.catalog);
            }
            if (this.schema != null) {
                connection.setSchema(this.schema);
            }
            executeSql(connection, this.config.getConnectionInitSql(), true);
            setNetworkTimeout(connection, this.networkTimeout);
        } catch (SQLException e) {
            throw new ConnectionSetupException(e);
        }
    }

    private void checkDriverSupport(Connection connection) throws SQLException {
        if (this.isValidChecked) {
            return;
        }
        checkValidationSupport(connection);
        checkDefaultIsolation(connection);
        this.isValidChecked = true;
    }

    private void checkValidationSupport(Connection connection) throws SQLException {
        try {
            if (this.isUseJdbc4Validation) {
                connection.isValid(1);
            } else {
                executeSql(connection, this.config.getConnectionTestQuery(), false);
            }
        } catch (AbstractMethodError | Exception e) {
            Logger logger = this.logger;
            Object[] objArr = new Object[3];
            objArr[0] = this.poolName;
            objArr[1] = this.isUseJdbc4Validation ? " isValid() for connection, configure" : JsonProperty.USE_DEFAULT_NAME;
            objArr[2] = e.getMessage();
            logger.error("{} - Failed to execute{} connection test query ({}).", objArr);
            throw e;
        }
    }

    private void checkDefaultIsolation(Connection connection) throws SQLException {
        try {
            this.defaultTransactionIsolation = connection.getTransactionIsolation();
            if (this.transactionIsolation == -1) {
                this.transactionIsolation = this.defaultTransactionIsolation;
            }
        } catch (SQLException e) {
            this.logger.warn("{} - Default transaction isolation level detection failed ({}).", this.poolName, e.getMessage());
            if (e.getSQLState() != null && !e.getSQLState().startsWith("08")) {
                throw e;
            }
        }
    }

    private void setQueryTimeout(Statement statement, int i) {
        if (this.isQueryTimeoutSupported != 0) {
            try {
                statement.setQueryTimeout(i);
                this.isQueryTimeoutSupported = 1;
            } catch (Exception e) {
                if (this.isQueryTimeoutSupported == -1) {
                    this.isQueryTimeoutSupported = 0;
                    this.logger.info("{} - Failed to set query timeout for statement. ({})", this.poolName, e.getMessage());
                }
            }
        }
    }

    private int getAndSetNetworkTimeout(Connection connection, long j) {
        if (this.isNetworkTimeoutSupported == 0) {
            return 0;
        }
        try {
            int networkTimeout = connection.getNetworkTimeout();
            connection.setNetworkTimeout(this.netTimeoutExecutor, (int) j);
            this.isNetworkTimeoutSupported = 1;
            return networkTimeout;
        } catch (AbstractMethodError | Exception e) {
            if (this.isNetworkTimeoutSupported != -1) {
                return 0;
            }
            this.isNetworkTimeoutSupported = 0;
            this.logger.info("{} - Driver does not support get/set network timeout for connections. ({})", this.poolName, e.getMessage());
            if (this.validationTimeout < TimeUnit.SECONDS.toMillis(1L)) {
                this.logger.warn("{} - A validationTimeout of less than 1 second cannot be honored on drivers without setNetworkTimeout() support.", this.poolName);
                return 0;
            }
            if (this.validationTimeout % TimeUnit.SECONDS.toMillis(1L) == 0) {
                return 0;
            }
            this.logger.warn("{} - A validationTimeout with fractional second granularity cannot be honored on drivers without setNetworkTimeout() support.", this.poolName);
            return 0;
        }
    }

    private void setNetworkTimeout(Connection connection, long j) throws SQLException {
        if (this.isNetworkTimeoutSupported == 1) {
            connection.setNetworkTimeout(this.netTimeoutExecutor, (int) j);
        }
    }

    private void executeSql(Connection connection, String str, boolean z) throws SQLException {
        if (str != null) {
            Statement createStatement = connection.createStatement();
            try {
                createStatement.execute(str);
                if (createStatement != null) {
                    createStatement.close();
                }
                if (!this.isIsolateInternalQueries || this.isAutoCommit) {
                    return;
                }
                if (z) {
                    connection.commit();
                } else {
                    connection.rollback();
                }
            } catch (Throwable th) {
                if (createStatement != null) {
                    try {
                        createStatement.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private void createNetworkTimeoutExecutor(DataSource dataSource, String str, String str2) {
        if ((str != null && str.contains("Mysql")) || ((str2 != null && str2.contains("mysql")) || (dataSource != null && dataSource.getClass().getName().contains("Mysql")))) {
            this.netTimeoutExecutor = new SynchronousExecutor();
            return;
        }
        ThreadFactory threadFactory = this.config.getThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool(threadFactory != null ? threadFactory : new UtilityElf.DefaultThreadFactory(this.poolName + " network timeout executor", true));
        threadPoolExecutor.setKeepAliveTime(15L, TimeUnit.SECONDS);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.netTimeoutExecutor = threadPoolExecutor;
    }

    private void setLoginTimeout(DataSource dataSource) {
        if (this.connectionTimeout != 2147483647L) {
            try {
                dataSource.setLoginTimeout(Math.max(1, (int) TimeUnit.MILLISECONDS.toSeconds(500 + this.connectionTimeout)));
            } catch (Exception e) {
                this.logger.info("{} - Failed to set login timeout for data source. ({})", this.poolName, e.getMessage());
            }
        }
    }

    private String stringFromResetBits(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < RESET_STATES.length; i2++) {
            if ((i & (1 << i2)) != 0) {
                sb.append(RESET_STATES[i2]).append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
