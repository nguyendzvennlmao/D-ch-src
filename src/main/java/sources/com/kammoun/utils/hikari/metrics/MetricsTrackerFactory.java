package com.kammoun.utils.hikari.metrics;

public interface MetricsTrackerFactory {
    IMetricsTracker create(String str, PoolStats poolStats);
}
