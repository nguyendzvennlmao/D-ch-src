package com.kammoun.utils.hikari.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DriverDataSource implements DataSource {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) DriverDataSource.class);
    private static final String PASSWORD = "password";
    private static final String USER = "user";
    private final String jdbcUrl;
    private final Properties driverProperties = new Properties();
    private Driver driver;

    public DriverDataSource(String str, String str2, Properties properties, String str3, String str4) {
        this.jdbcUrl = str;
        for (Map.Entry entry : properties.entrySet()) {
            this.driverProperties.setProperty(entry.getKey().toString(), entry.getValue().toString());
        }
        if (str3 != null) {
            this.driverProperties.put(USER, this.driverProperties.getProperty(USER, str3));
        }
        if (str4 != null) {
            this.driverProperties.put(PASSWORD, this.driverProperties.getProperty(PASSWORD, str4));
        }
        if (str2 != null) {
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (true) {
                if (!drivers.hasMoreElements()) {
                    break;
                }
                Driver nextElement = drivers.nextElement();
                if (nextElement.getClass().getName().equals(str2)) {
                    this.driver = nextElement;
                    break;
                }
            }
            if (this.driver == null) {
                LOGGER.warn("Registered driver with driverClassName={} was not found, trying direct instantiation.", str2);
                Class<?> cls = null;
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                try {
                    if (contextClassLoader != null) {
                        try {
                            cls = contextClassLoader.loadClass(str2);
                            LOGGER.debug("Driver class {} found in Thread context class loader {}", str2, contextClassLoader);
                        } catch (ClassNotFoundException e) {
                            LOGGER.debug("Driver class {} not found in Thread context class loader {}, trying classloader {}", str2, contextClassLoader, getClass().getClassLoader());
                        }
                    }
                    if (cls == null) {
                        cls = getClass().getClassLoader().loadClass(str2);
                        LOGGER.debug("Driver class {} found in the HikariConfig class classloader {}", str2, getClass().getClassLoader());
                    }
                } catch (ClassNotFoundException e2) {
                    LOGGER.debug("Failed to load driver class {} from HikariConfig class classloader {}", str2, getClass().getClassLoader());
                }
                if (cls != null) {
                    try {
                        this.driver = (Driver) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e3) {
                        LOGGER.warn("Failed to create instance of driver class {}, trying jdbcUrl resolution", str2, e3);
                    }
                }
            }
        }
        String replaceAll = str.replaceAll("([?&;]password=)[^&#;]*(.*)", "$1<masked>$2");
        try {
            if (this.driver == null) {
                this.driver = DriverManager.getDriver(str);
                LOGGER.debug("Loaded driver with class name {} for jdbcUrl={}", this.driver.getClass().getName(), replaceAll);
            } else if (!this.driver.acceptsURL(str)) {
                throw new RuntimeException("Driver " + str2 + " claims to not accept jdbcUrl, " + replaceAll);
            }
        } catch (SQLException e4) {
            throw new RuntimeException("Failed to get driver instance for jdbcUrl=" + replaceAll, e4);
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return this.driver.connect(this.jdbcUrl, this.driverProperties);
    }

    @Override
    public Connection getConnection(String str, String str2) throws SQLException {
        Properties properties = (Properties) this.driverProperties.clone();
        if (str != null) {
            properties.put(USER, str);
            if (properties.containsKey("username")) {
                properties.put("username", str);
            }
        }
        if (str2 != null) {
            properties.put(PASSWORD, str2);
        }
        return this.driver.connect(this.jdbcUrl, properties);
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public void setLoginTimeout(int i) throws SQLException {
        DriverManager.setLoginTimeout(i);
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return DriverManager.getLoginTimeout();
    }

    @Override
    public java.util.logging.Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return this.driver.getParentLogger();
    }

    @Override
    public <T> T unwrap(Class<T> cls) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public boolean isWrapperFor(Class<?> cls) throws SQLException {
        return false;
    }
}
