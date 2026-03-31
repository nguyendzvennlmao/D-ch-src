package com.kammoun.utils.hikari;

public interface HikariConfigMXBean {
    long getConnectionTimeout();

    void setConnectionTimeout(long j);

    long getValidationTimeout();

    void setValidationTimeout(long j);

    long getIdleTimeout();

    void setIdleTimeout(long j);

    long getLeakDetectionThreshold();

    void setLeakDetectionThreshold(long j);

    long getMaxLifetime();

    void setMaxLifetime(long j);

    int getMinimumIdle();

    void setMinimumIdle(int i);

    int getMaximumPoolSize();

    void setMaximumPoolSize(int i);

    void setPassword(String str);

    void setUsername(String str);

    String getPoolName();

    String getCatalog();

    void setCatalog(String str);
}
