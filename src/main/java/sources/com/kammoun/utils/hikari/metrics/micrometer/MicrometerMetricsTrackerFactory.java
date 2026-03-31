package com.kammoun.utils.hikari.metrics.micrometer;

import com.kammoun.utils.hikari.metrics.IMetricsTracker;
import com.kammoun.utils.hikari.metrics.MetricsTrackerFactory;
import com.kammoun.utils.hikari.metrics.PoolStats;
import io.micrometer.core.instrument.MeterRegistry;

public class MicrometerMetricsTrackerFactory implements MetricsTrackerFactory {
    private final MeterRegistry registry;

    public MicrometerMetricsTrackerFactory(MeterRegistry meterRegistry) {
        this.registry = meterRegistry;
    }

    @Override
    public IMetricsTracker create(String str, PoolStats poolStats) {
        return new MicrometerMetricsTracker(str, poolStats, this.registry);
    }
}
