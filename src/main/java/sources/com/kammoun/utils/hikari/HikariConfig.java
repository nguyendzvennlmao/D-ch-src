package com.kammoun.utils.hikari;

import com.codahale.metrics.health.HealthCheckRegistry;
import com.kammoun.utils.hikari.metrics.MetricsTrackerFactory;
import com.kammoun.utils.hikari.util.PropertyElf;
import com.kammoun.utils.hikari.util.UtilityElf;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AccessControlException;
import java.util.Iterator;
import java.util.Properties;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HikariConfig implements HikariConfigMXBean {
    private static final long DEFAULT_KEEPALIVE_TIME = 0;
    private static final int DEFAULT_POOL_SIZE = 10;
    private volatile String catalog;
    private volatile long connectionTimeout;
    private volatile long validationTimeout;
    private volatile long idleTimeout;
    private volatile long leakDetectionThreshold;
    private volatile long maxLifetime;
    private volatile int maxPoolSize;
    private volatile int minIdle;
    private volatile String username;
    private volatile String password;
    private long initializationFailTimeout;
    private String connectionInitSql;
    private String connectionTestQuery;
    private String dataSourceClassName;
    private String dataSourceJndiName;
    private String driverClassName;
    private String exceptionOverrideClassName;
    private String jdbcUrl;
    private String poolName;
    private String schema;
    private String transactionIsolationName;
    private boolean isAutoCommit;
    private boolean isReadOnly;
    private boolean isIsolateInternalQueries;
    private boolean isRegisterMbeans;
    private boolean isAllowPoolSuspension;
    private DataSource dataSource;
    private Properties dataSourceProperties;
    private ThreadFactory threadFactory;
    private ScheduledExecutorService scheduledExecutor;
    private MetricsTrackerFactory metricsTrackerFactory;
    private Object metricRegistry;
    private Object healthCheckRegistry;
    private Properties healthCheckProperties;
    private long keepaliveTime;
    private volatile boolean sealed;
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) HikariConfig.class);
    private static final char[] ID_CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final long CONNECTION_TIMEOUT = TimeUnit.SECONDS.toMillis(30);
    private static final long VALIDATION_TIMEOUT = TimeUnit.SECONDS.toMillis(5);
    private static final long SOFT_TIMEOUT_FLOOR = Long.getLong("com.kammoun.utils.hikari.timeoutMs.floor", 250).longValue();
    private static final long IDLE_TIMEOUT = TimeUnit.MINUTES.toMillis(10);
    private static final long MAX_LIFETIME = TimeUnit.MINUTES.toMillis(30);
    private static boolean unitTest = false;

    public HikariConfig() {
        this.dataSourceProperties = new Properties();
        this.healthCheckProperties = new Properties();
        this.minIdle = -1;
        this.maxPoolSize = -1;
        this.maxLifetime = MAX_LIFETIME;
        this.connectionTimeout = CONNECTION_TIMEOUT;
        this.validationTimeout = VALIDATION_TIMEOUT;
        this.idleTimeout = IDLE_TIMEOUT;
        this.initializationFailTimeout = 1L;
        this.isAutoCommit = true;
        this.keepaliveTime = DEFAULT_KEEPALIVE_TIME;
        String property = System.getProperty("hikaricp.configurationFile");
        if (property != null) {
            loadProperties(property);
        }
    }

    public HikariConfig(Properties properties) {
        this();
        PropertyElf.setTargetFromProperties(this, properties);
    }

    public HikariConfig(String str) {
        this();
        loadProperties(str);
    }

    @Override
    public String getCatalog() {
        return this.catalog;
    }

    @Override
    public void setCatalog(String str) {
        this.catalog = str;
    }

    @Override
    public long getConnectionTimeout() {
        return this.connectionTimeout;
    }

    @Override
    public void setConnectionTimeout(long j) {
        if (j == DEFAULT_KEEPALIVE_TIME) {
            this.connectionTimeout = 2147483647L;
        } else {
            if (j < SOFT_TIMEOUT_FLOOR) {
                throw new IllegalArgumentException("connectionTimeout cannot be less than " + SOFT_TIMEOUT_FLOOR + "ms");
            }
            this.connectionTimeout = j;
        }
    }

    @Override
    public long getIdleTimeout() {
        return this.idleTimeout;
    }

    @Override
    public void setIdleTimeout(long j) {
        if (j < DEFAULT_KEEPALIVE_TIME) {
            throw new IllegalArgumentException("idleTimeout cannot be negative");
        }
        this.idleTimeout = j;
    }

    @Override
    public long getLeakDetectionThreshold() {
        return this.leakDetectionThreshold;
    }

    @Override
    public void setLeakDetectionThreshold(long j) {
        this.leakDetectionThreshold = j;
    }

    @Override
    public long getMaxLifetime() {
        return this.maxLifetime;
    }

    @Override
    public void setMaxLifetime(long j) {
        this.maxLifetime = j;
    }

    @Override
    public int getMaximumPoolSize() {
        return this.maxPoolSize;
    }

    @Override
    public void setMaximumPoolSize(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("maxPoolSize cannot be less than 1");
        }
        this.maxPoolSize = i;
    }

    @Override
    public int getMinimumIdle() {
        return this.minIdle;
    }

    @Override
    public void setMinimumIdle(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("minimumIdle cannot be negative");
        }
        this.minIdle = i;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String str) {
        this.password = str;
    }

    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String str) {
        this.username = str;
    }

    @Override
    public long getValidationTimeout() {
        return this.validationTimeout;
    }

    @Override
    public void setValidationTimeout(long j) {
        if (j < SOFT_TIMEOUT_FLOOR) {
            throw new IllegalArgumentException("validationTimeout cannot be less than " + SOFT_TIMEOUT_FLOOR + "ms");
        }
        this.validationTimeout = j;
    }

    public String getConnectionTestQuery() {
        return this.connectionTestQuery;
    }

    public void setConnectionTestQuery(String str) {
        checkIfSealed();
        this.connectionTestQuery = str;
    }

    public String getConnectionInitSql() {
        return this.connectionInitSql;
    }

    public void setConnectionInitSql(String str) {
        checkIfSealed();
        this.connectionInitSql = str;
    }

    public DataSource getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        checkIfSealed();
        this.dataSource = dataSource;
    }

    public String getDataSourceClassName() {
        return this.dataSourceClassName;
    }

    public void setDataSourceClassName(String str) {
        checkIfSealed();
        this.dataSourceClassName = str;
    }

    public void addDataSourceProperty(String str, Object obj) {
        checkIfSealed();
        this.dataSourceProperties.put(str, obj);
    }

    public String getDataSourceJNDI() {
        return this.dataSourceJndiName;
    }

    public void setDataSourceJNDI(String str) {
        checkIfSealed();
        this.dataSourceJndiName = str;
    }

    public Properties getDataSourceProperties() {
        return this.dataSourceProperties;
    }

    public void setDataSourceProperties(Properties properties) {
        checkIfSealed();
        this.dataSourceProperties.putAll(properties);
    }

    public String getDriverClassName() {
        return this.driverClassName;
    }

    public void setDriverClassName(String str) {
        checkIfSealed();
        Class<?> attemptFromContextLoader = attemptFromContextLoader(str);
        if (attemptFromContextLoader == null) {
            try {
                attemptFromContextLoader = getClass().getClassLoader().loadClass(str);
                LOGGER.debug("Driver class {} found in the HikariConfig class classloader {}", str, getClass().getClassLoader());
            } catch (ClassNotFoundException e) {
                LOGGER.error("Failed to load driver class {} from HikariConfig class classloader {}", str, getClass().getClassLoader());
            }
        }
        if (attemptFromContextLoader == null) {
            throw new RuntimeException("Failed to load driver class " + str + " in either of HikariConfig class loader or Thread context classloader");
        }
        try {
            attemptFromContextLoader.getConstructor(new Class[0]).newInstance(new Object[0]);
            this.driverClassName = str;
        } catch (Exception e2) {
            throw new RuntimeException("Failed to instantiate class " + str, e2);
        }
    }

    public String getJdbcUrl() {
        return this.jdbcUrl;
    }

    public void setJdbcUrl(String str) {
        checkIfSealed();
        this.jdbcUrl = str;
    }

    public boolean isAutoCommit() {
        return this.isAutoCommit;
    }

    public void setAutoCommit(boolean z) {
        checkIfSealed();
        this.isAutoCommit = z;
    }

    public boolean isAllowPoolSuspension() {
        return this.isAllowPoolSuspension;
    }

    public void setAllowPoolSuspension(boolean z) {
        checkIfSealed();
        this.isAllowPoolSuspension = z;
    }

    public long getInitializationFailTimeout() {
        return this.initializationFailTimeout;
    }

    public void setInitializationFailTimeout(long j) {
        checkIfSealed();
        this.initializationFailTimeout = j;
    }

    public boolean isIsolateInternalQueries() {
        return this.isIsolateInternalQueries;
    }

    public void setIsolateInternalQueries(boolean z) {
        checkIfSealed();
        this.isIsolateInternalQueries = z;
    }

    public MetricsTrackerFactory getMetricsTrackerFactory() {
        return this.metricsTrackerFactory;
    }

    public void setMetricsTrackerFactory(MetricsTrackerFactory metricsTrackerFactory) {
        if (this.metricRegistry != null) {
            throw new IllegalStateException("cannot use setMetricsTrackerFactory() and setMetricRegistry() together");
        }
        this.metricsTrackerFactory = metricsTrackerFactory;
    }

    public Object getMetricRegistry() {
        return this.metricRegistry;
    }

    public void setMetricRegistry(Object obj) {
        if (this.metricsTrackerFactory != null) {
            throw new IllegalStateException("cannot use setMetricRegistry() and setMetricsTrackerFactory() together");
        }
        if (obj != null) {
            obj = getObjectOrPerformJndiLookup(obj);
            if (!UtilityElf.safeIsAssignableFrom(obj, "com.codahale.metrics.MetricRegistry") && !UtilityElf.safeIsAssignableFrom(obj, "io.micrometer.core.instrument.MeterRegistry")) {
                throw new IllegalArgumentException("Class must be instance of com.codahale.metrics.MetricRegistry or io.micrometer.core.instrument.MeterRegistry");
            }
        }
        this.metricRegistry = obj;
    }

    public Object getHealthCheckRegistry() {
        return this.healthCheckRegistry;
    }

    public void setHealthCheckRegistry(Object obj) {
        checkIfSealed();
        if (obj != null) {
            obj = getObjectOrPerformJndiLookup(obj);
            if (!(obj instanceof HealthCheckRegistry)) {
                throw new IllegalArgumentException("Class must be an instance of com.codahale.metrics.health.HealthCheckRegistry");
            }
        }
        this.healthCheckRegistry = obj;
    }

    public Properties getHealthCheckProperties() {
        return this.healthCheckProperties;
    }

    public void setHealthCheckProperties(Properties properties) {
        checkIfSealed();
        this.healthCheckProperties.putAll(properties);
    }

    public void addHealthCheckProperty(String str, String str2) {
        checkIfSealed();
        this.healthCheckProperties.setProperty(str, str2);
    }

    public long getKeepaliveTime() {
        return this.keepaliveTime;
    }

    public void setKeepaliveTime(long j) {
        this.keepaliveTime = j;
    }

    public boolean isReadOnly() {
        return this.isReadOnly;
    }

    public void setReadOnly(boolean z) {
        checkIfSealed();
        this.isReadOnly = z;
    }

    public boolean isRegisterMbeans() {
        return this.isRegisterMbeans;
    }

    public void setRegisterMbeans(boolean z) {
        checkIfSealed();
        this.isRegisterMbeans = z;
    }

    @Override
    public String getPoolName() {
        return this.poolName;
    }

    public void setPoolName(String str) {
        checkIfSealed();
        this.poolName = str;
    }

    public ScheduledExecutorService getScheduledExecutor() {
        return this.scheduledExecutor;
    }

    public void setScheduledExecutor(ScheduledExecutorService scheduledExecutorService) {
        checkIfSealed();
        this.scheduledExecutor = scheduledExecutorService;
    }

    public String getTransactionIsolation() {
        return this.transactionIsolationName;
    }

    public String getSchema() {
        return this.schema;
    }

    public void setSchema(String str) {
        checkIfSealed();
        this.schema = str;
    }

    public String getExceptionOverrideClassName() {
        return this.exceptionOverrideClassName;
    }

    public void setExceptionOverrideClassName(String str) {
        checkIfSealed();
        Class<?> attemptFromContextLoader = attemptFromContextLoader(str);
        if (attemptFromContextLoader == null) {
            try {
                attemptFromContextLoader = getClass().getClassLoader().loadClass(str);
                LOGGER.debug("SQLExceptionOverride class {} found in the HikariConfig class classloader {}", str, getClass().getClassLoader());
            } catch (ClassNotFoundException e) {
                LOGGER.error("Failed to load SQLExceptionOverride class {} from HikariConfig class classloader {}", str, getClass().getClassLoader());
            }
        }
        if (attemptFromContextLoader == null) {
            throw new RuntimeException("Failed to load SQLExceptionOverride class " + str + " in either of HikariConfig class loader or Thread context classloader");
        }
        try {
            attemptFromContextLoader.getConstructor(new Class[0]).newInstance(new Object[0]);
            this.exceptionOverrideClassName = str;
        } catch (Exception e2) {
            throw new RuntimeException("Failed to instantiate class " + str, e2);
        }
    }

    public void setTransactionIsolation(String str) {
        checkIfSealed();
        this.transactionIsolationName = str;
    }

    public ThreadFactory getThreadFactory() {
        return this.threadFactory;
    }

    public void setThreadFactory(ThreadFactory threadFactory) {
        checkIfSealed();
        this.threadFactory = threadFactory;
    }

    public void seal() {
        this.sealed = true;
    }

    public void copyStateTo(HikariConfig hikariConfig) {
        for (Field field : HikariConfig.class.getDeclaredFields()) {
            if (!Modifier.isFinal(field.getModifiers())) {
                field.setAccessible(true);
                try {
                    field.set(hikariConfig, field.get(this));
                } catch (Exception e) {
                    throw new RuntimeException("Failed to copy HikariConfig state: " + e.getMessage(), e);
                }
            }
        }
        hikariConfig.sealed = false;
    }

    private Class<?> attemptFromContextLoader(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        try {
            Class<?> loadClass = contextClassLoader.loadClass(str);
            LOGGER.debug("Driver class {} found in Thread context class loader {}", str, contextClassLoader);
            return loadClass;
        } catch (ClassNotFoundException e) {
            LOGGER.debug("Driver class {} not found in Thread context class loader {}, trying classloader {}", str, contextClassLoader, getClass().getClassLoader());
            return null;
        }
    }

    public void validate() {
        if (this.poolName == null) {
            this.poolName = generatePoolName();
        } else if (this.isRegisterMbeans && this.poolName.contains(":")) {
            throw new IllegalArgumentException("poolName cannot contain ':' when used with JMX");
        }
        this.catalog = UtilityElf.getNullIfEmpty(this.catalog);
        this.connectionInitSql = UtilityElf.getNullIfEmpty(this.connectionInitSql);
        this.connectionTestQuery = UtilityElf.getNullIfEmpty(this.connectionTestQuery);
        this.transactionIsolationName = UtilityElf.getNullIfEmpty(this.transactionIsolationName);
        this.dataSourceClassName = UtilityElf.getNullIfEmpty(this.dataSourceClassName);
        this.dataSourceJndiName = UtilityElf.getNullIfEmpty(this.dataSourceJndiName);
        this.driverClassName = UtilityElf.getNullIfEmpty(this.driverClassName);
        this.jdbcUrl = UtilityElf.getNullIfEmpty(this.jdbcUrl);
        if (this.dataSource != null) {
            if (this.dataSourceClassName != null) {
                LOGGER.warn("{} - using dataSource and ignoring dataSourceClassName.", this.poolName);
            }
        } else if (this.dataSourceClassName != null) {
            if (this.driverClassName != null) {
                LOGGER.error("{} - cannot use driverClassName and dataSourceClassName together.", this.poolName);
                throw new IllegalStateException("cannot use driverClassName and dataSourceClassName together.");
            }
            if (this.jdbcUrl != null) {
                LOGGER.warn("{} - using dataSourceClassName and ignoring jdbcUrl.", this.poolName);
            }
        } else if (this.jdbcUrl == null && this.dataSourceJndiName == null) {
            if (this.driverClassName != null) {
                LOGGER.error("{} - jdbcUrl is required with driverClassName.", this.poolName);
                throw new IllegalArgumentException("jdbcUrl is required with driverClassName.");
            }
            LOGGER.error("{} - dataSource or dataSourceClassName or jdbcUrl is required.", this.poolName);
            throw new IllegalArgumentException("dataSource or dataSourceClassName or jdbcUrl is required.");
        }
        validateNumerics();
        if (LOGGER.isDebugEnabled() || unitTest) {
            logConfiguration();
        }
    }

    private void validateNumerics() {
        if (this.maxLifetime != DEFAULT_KEEPALIVE_TIME && this.maxLifetime < TimeUnit.SECONDS.toMillis(30L)) {
            LOGGER.warn("{} - maxLifetime is less than 30000ms, setting to default {}ms.", this.poolName, Long.valueOf(MAX_LIFETIME));
            this.maxLifetime = MAX_LIFETIME;
        }
        if (this.keepaliveTime != DEFAULT_KEEPALIVE_TIME && this.keepaliveTime < TimeUnit.SECONDS.toMillis(30L)) {
            LOGGER.warn("{} - keepaliveTime is less than 30000ms, disabling it.", this.poolName);
            this.keepaliveTime = DEFAULT_KEEPALIVE_TIME;
        }
        if (this.keepaliveTime != DEFAULT_KEEPALIVE_TIME && this.maxLifetime != DEFAULT_KEEPALIVE_TIME && this.keepaliveTime >= this.maxLifetime) {
            LOGGER.warn("{} - keepaliveTime is greater than or equal to maxLifetime, disabling it.", this.poolName);
            this.keepaliveTime = DEFAULT_KEEPALIVE_TIME;
        }
        if (this.leakDetectionThreshold > DEFAULT_KEEPALIVE_TIME && !unitTest && (this.leakDetectionThreshold < TimeUnit.SECONDS.toMillis(2L) || (this.leakDetectionThreshold > this.maxLifetime && this.maxLifetime > DEFAULT_KEEPALIVE_TIME))) {
            LOGGER.warn("{} - leakDetectionThreshold is less than 2000ms or more than maxLifetime, disabling it.", this.poolName);
            this.leakDetectionThreshold = DEFAULT_KEEPALIVE_TIME;
        }
        if (this.connectionTimeout < SOFT_TIMEOUT_FLOOR) {
            LOGGER.warn("{} - connectionTimeout is less than {}ms, setting to {}ms.", this.poolName, Long.valueOf(SOFT_TIMEOUT_FLOOR), Long.valueOf(CONNECTION_TIMEOUT));
            this.connectionTimeout = CONNECTION_TIMEOUT;
        }
        if (this.validationTimeout < SOFT_TIMEOUT_FLOOR) {
            LOGGER.warn("{} - validationTimeout is less than {}ms, setting to {}ms.", this.poolName, Long.valueOf(SOFT_TIMEOUT_FLOOR), Long.valueOf(VALIDATION_TIMEOUT));
            this.validationTimeout = VALIDATION_TIMEOUT;
        }
        if (this.maxPoolSize < 1) {
            this.maxPoolSize = 10;
        }
        if (this.minIdle < 0 || this.minIdle > this.maxPoolSize) {
            this.minIdle = this.maxPoolSize;
        }
        if (this.idleTimeout + TimeUnit.SECONDS.toMillis(1L) > this.maxLifetime && this.maxLifetime > DEFAULT_KEEPALIVE_TIME && this.minIdle < this.maxPoolSize) {
            LOGGER.warn("{} - idleTimeout is close to or more than maxLifetime, disabling it.", this.poolName);
            this.idleTimeout = DEFAULT_KEEPALIVE_TIME;
            return;
        }
        if (this.idleTimeout != DEFAULT_KEEPALIVE_TIME && this.idleTimeout < TimeUnit.SECONDS.toMillis(10L) && this.minIdle < this.maxPoolSize) {
            LOGGER.warn("{} - idleTimeout is less than 10000ms, setting to default {}ms.", this.poolName, Long.valueOf(IDLE_TIMEOUT));
            this.idleTimeout = IDLE_TIMEOUT;
        } else {
            if (this.idleTimeout == IDLE_TIMEOUT || this.idleTimeout == DEFAULT_KEEPALIVE_TIME || this.minIdle != this.maxPoolSize) {
                return;
            }
            LOGGER.warn("{} - idleTimeout has been set but has no effect because the pool is operating as a fixed size pool.", this.poolName);
        }
    }

    private void checkIfSealed() {
        if (this.sealed) {
            throw new IllegalStateException("The configuration of the pool is sealed once started. Use HikariConfigMXBean for runtime changes.");
        }
    }

    private void logConfiguration() {
        LOGGER.debug("{} - configuration:", this.poolName);
        Iterator it = new TreeSet(PropertyElf.getPropertyNames(HikariConfig.class)).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Object property = PropertyElf.getProperty(str, this);
                if ("dataSourceProperties".equals(str)) {
                    Properties copyProperties = PropertyElf.copyProperties(this.dataSourceProperties);
                    copyProperties.setProperty("password", "<masked>");
                    property = copyProperties;
                }
                if ("initializationFailTimeout".equals(str) && this.initializationFailTimeout == Long.MAX_VALUE) {
                    property = "infinite";
                } else if ("transactionIsolation".equals(str) && this.transactionIsolationName == null) {
                    property = "default";
                } else if (str.matches("scheduledExecutorService|threadFactory") && property == null) {
                    property = "internal";
                } else if (str.contains("jdbcUrl") && (property instanceof String)) {
                    property = ((String) property).replaceAll("([?&;]password=)[^&#;]*(.*)", "$1<masked>$2");
                } else if (str.contains("password")) {
                    property = "<masked>";
                } else if (property instanceof String) {
                    property = "\"" + property + "\"";
                } else if (property == null) {
                    property = "none";
                }
                LOGGER.debug("{}{}", (str + "................................................").substring(0, 32), property);
            } catch (Exception e) {
            }
        }
    }

    private void loadProperties(String str) {
        File file = new File(str);
        try {
            InputStream fileInputStream = file.isFile() ? new FileInputStream(file) : getClass().getResourceAsStream(str);
            try {
                if (fileInputStream == null) {
                    throw new IllegalArgumentException("Cannot find property file: " + str);
                }
                Properties properties = new Properties();
                properties.load(fileInputStream);
                PropertyElf.setTargetFromProperties(this, properties);
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read property file", e);
        }
    }

    private String generatePoolName() {
        String str;
        try {
            synchronized (System.getProperties()) {
                String valueOf = String.valueOf(Integer.getInteger("com.kammoun.utils.hikari.pool_number", 0).intValue() + 1);
                System.setProperty("com.kammoun.utils.hikari.pool_number", valueOf);
                str = "HikariPool-" + valueOf;
            }
            return str;
        } catch (AccessControlException e) {
            ThreadLocalRandom current = ThreadLocalRandom.current();
            StringBuilder sb = new StringBuilder("HikariPool-");
            for (int i = 0; i < 4; i++) {
                sb.append(ID_CHARACTERS[current.nextInt(62)]);
            }
            LOGGER.info("assigned random pool name '{}' (security manager prevented access to system properties)", sb);
            return sb.toString();
        }
    }

    private Object getObjectOrPerformJndiLookup(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        try {
            return new InitialContext().lookup((String) obj);
        } catch (NamingException e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }
}
