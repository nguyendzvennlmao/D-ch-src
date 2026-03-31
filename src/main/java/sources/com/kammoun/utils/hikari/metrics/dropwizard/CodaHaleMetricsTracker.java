package com.kammoun.utils.hikari.metrics.dropwizard;

import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.kammoun.utils.hikari.metrics.IMetricsTracker;
import com.kammoun.utils.hikari.metrics.PoolStats;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class CodaHaleMetricsTracker implements IMetricsTracker {
    private final String poolName;
    private final Timer connectionObtainTimer;
    private final Histogram connectionUsage;
    private final Histogram connectionCreation;
    private final Meter connectionTimeoutMeter;
    private final MetricRegistry registry;
    private static final String METRIC_CATEGORY = "pool";
    private static final String METRIC_NAME_WAIT = "Wait";
    private static final String METRIC_NAME_USAGE = "Usage";
    private static final String METRIC_NAME_CONNECT = "ConnectionCreation";
    private static final String METRIC_NAME_TIMEOUT_RATE = "ConnectionTimeoutRate";
    private static final String METRIC_NAME_TOTAL_CONNECTIONS = "TotalConnections";
    private static final String METRIC_NAME_IDLE_CONNECTIONS = "IdleConnections";
    private static final String METRIC_NAME_ACTIVE_CONNECTIONS = "ActiveConnections";
    private static final String METRIC_NAME_PENDING_CONNECTIONS = "PendingConnections";
    private static final String METRIC_NAME_MAX_CONNECTIONS = "MaxConnections";
    private static final String METRIC_NAME_MIN_CONNECTIONS = "MinConnections";

    public CodaHaleMetricsTracker(String str, PoolStats poolStats, MetricRegistry metricRegistry) {
        this.poolName = str;
        this.registry = metricRegistry;
        this.connectionObtainTimer = metricRegistry.timer(MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_WAIT}));
        this.connectionUsage = metricRegistry.histogram(MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_USAGE}));
        this.connectionCreation = metricRegistry.histogram(MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_CONNECT}));
        this.connectionTimeoutMeter = metricRegistry.meter(MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_TIMEOUT_RATE}));
        String name = MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_TOTAL_CONNECTIONS});
        Objects.requireNonNull(poolStats);
        metricRegistry.register(name, poolStats::getTotalConnections);
        String name2 = MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_IDLE_CONNECTIONS});
        Objects.requireNonNull(poolStats);
        metricRegistry.register(name2, poolStats::getIdleConnections);
        String name3 = MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_ACTIVE_CONNECTIONS});
        Objects.requireNonNull(poolStats);
        metricRegistry.register(name3, poolStats::getActiveConnections);
        String name4 = MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_PENDING_CONNECTIONS});
        Objects.requireNonNull(poolStats);
        metricRegistry.register(name4, poolStats::getPendingThreads);
        String name5 = MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_MAX_CONNECTIONS});
        Objects.requireNonNull(poolStats);
        metricRegistry.register(name5, poolStats::getMaxConnections);
        String name6 = MetricRegistry.name(str, new String[]{METRIC_CATEGORY, METRIC_NAME_MIN_CONNECTIONS});
        Objects.requireNonNull(poolStats);
        metricRegistry.register(name6, poolStats::getMinConnections);
    }

    @Override
    public void close() {
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_WAIT}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_USAGE}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_CONNECT}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_TIMEOUT_RATE}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_TOTAL_CONNECTIONS}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_IDLE_CONNECTIONS}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_ACTIVE_CONNECTIONS}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_PENDING_CONNECTIONS}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_MAX_CONNECTIONS}));
        this.registry.remove(MetricRegistry.name(this.poolName, new String[]{METRIC_CATEGORY, METRIC_NAME_MIN_CONNECTIONS}));
    }

    @Override
    public void recordConnectionAcquiredNanos(long j) {
        this.connectionObtainTimer.update(j, TimeUnit.NANOSECONDS);
    }

    @Override
    public void recordConnectionUsageMillis(long j) {
        this.connectionUsage.update(j);
    }

    @Override
    public void recordConnectionTimeout() {
        this.connectionTimeoutMeter.mark();
    }

    @Override
    public void recordConnectionCreatedMillis(long j) {
        this.connectionCreation.update(j);
    }

    public Timer getConnectionAcquisitionTimer() {
        return this.connectionObtainTimer;
    }

    public Histogram getConnectionDurationHistogram() {
        return this.connectionUsage;
    }

    public Histogram getConnectionCreationHistogram() {
        return this.connectionCreation;
    }
}
