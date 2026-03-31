package com.kammoun.utils.hikari.metrics;

public interface IMetricsTracker extends AutoCloseable {
    default void recordConnectionCreatedMillis(long j) {
    }

    default void recordConnectionAcquiredNanos(long j) {
    }

    default void recordConnectionUsageMillis(long j) {
    }

    default void recordConnectionTimeout() {
    }

    @Override
    default void close() {
    }
}
