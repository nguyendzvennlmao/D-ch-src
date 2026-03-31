package com.kammoun.utils.hikari.metrics.dropwizard;

import com.codahale.metrics.MetricRegistry;
import com.kammoun.utils.hikari.metrics.IMetricsTracker;
import com.kammoun.utils.hikari.metrics.MetricsTrackerFactory;
import com.kammoun.utils.hikari.metrics.PoolStats;

public final class CodahaleMetricsTrackerFactory implements MetricsTrackerFactory {
    private final MetricRegistry registry;

    public CodahaleMetricsTrackerFactory(MetricRegistry metricRegistry) {
        this.registry = metricRegistry;
    }

    public MetricRegistry getRegistry() {
        return this.registry;
    }

    @Override
    public IMetricsTracker create(String str, PoolStats poolStats) {
        return new CodaHaleMetricsTracker(str, poolStats, this.registry);
    }
}
