package com.kammoun.utils.hikari.metrics.dropwizard;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.kammoun.utils.hikari.HikariConfig;
import com.kammoun.utils.hikari.pool.HikariPool;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;

public final class CodahaleHealthChecker {

    public static class Connection99Percent extends HealthCheck {
        private final Timer waitTimer;
        private final long expected99thPercentile;

        Connection99Percent(Timer timer, long j) {
            this.waitTimer = timer;
            this.expected99thPercentile = j;
        }

        protected HealthCheck.Result check() throws Exception {
            long millis = TimeUnit.NANOSECONDS.toMillis(Math.round(this.waitTimer.getSnapshot().get99thPercentile()));
            return millis <= this.expected99thPercentile ? HealthCheck.Result.healthy() : HealthCheck.Result.unhealthy("99th percentile connection wait time of %dms exceeds the threshold %dms", new Object[]{Long.valueOf(millis), Long.valueOf(this.expected99thPercentile)});
        }
    }

    public static class ConnectivityHealthCheck extends HealthCheck {
        private final HikariPool pool;
        private final long checkTimeoutMs;

        ConnectivityHealthCheck(HikariPool hikariPool, long j) {
            this.pool = hikariPool;
            this.checkTimeoutMs = (j <= 0 || j == 2147483647L) ? TimeUnit.SECONDS.toMillis(10L) : j;
        }

        protected HealthCheck.Result check() throws Exception {
            try {
                Connection connection = this.pool.getConnection(this.checkTimeoutMs);
                try {
                    HealthCheck.Result healthy = HealthCheck.Result.healthy();
                    if (connection != null) {
                        connection.close();
                    }
                    return healthy;
                } finally {
                }
            } catch (SQLException e) {
                return HealthCheck.Result.unhealthy(e);
            }
        }
    }

    public static void registerHealthChecks(HikariPool hikariPool, HikariConfig hikariConfig, HealthCheckRegistry healthCheckRegistry) {
        Properties healthCheckProperties = hikariConfig.getHealthCheckProperties();
        MetricRegistry metricRegistry = (MetricRegistry) hikariConfig.getMetricRegistry();
        healthCheckRegistry.register(MetricRegistry.name(hikariConfig.getPoolName(), new String[]{"pool", "ConnectivityCheck"}), new ConnectivityHealthCheck(hikariPool, Long.parseLong(healthCheckProperties.getProperty("connectivityCheckTimeoutMs", String.valueOf(hikariConfig.getConnectionTimeout())))));
        long parseLong = Long.parseLong(healthCheckProperties.getProperty("expected99thPercentileMs", "0"));
        if (metricRegistry == null || parseLong <= 0) {
            return;
        }
        SortedMap timers = metricRegistry.getTimers((str, metric) -> {
            return str.equals(MetricRegistry.name(hikariConfig.getPoolName(), new String[]{"pool", "Wait"}));
        });
        if (timers.isEmpty()) {
            return;
        }
        healthCheckRegistry.register(MetricRegistry.name(hikariConfig.getPoolName(), new String[]{"pool", "Connection99Percent"}), new Connection99Percent((Timer) ((Map.Entry) timers.entrySet().iterator().next()).getValue(), parseLong));
    }

    private CodahaleHealthChecker() {
    }
}
