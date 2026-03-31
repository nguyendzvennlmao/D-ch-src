package com.kammoun.utils.hikari.metrics;

import com.kammoun.utils.hikari.util.ClockSource;
import java.util.concurrent.atomic.AtomicLong;

public abstract class PoolStats {
    private final AtomicLong reloadAt = new AtomicLong();
    private final long timeoutMs;
    protected volatile int totalConnections;
    protected volatile int idleConnections;
    protected volatile int activeConnections;
    protected volatile int pendingThreads;
    protected volatile int maxConnections;
    protected volatile int minConnections;

    public PoolStats(long j) {
        this.timeoutMs = j;
    }

    public int getTotalConnections() {
        if (shouldLoad()) {
            update();
        }
        return this.totalConnections;
    }

    public int getIdleConnections() {
        if (shouldLoad()) {
            update();
        }
        return this.idleConnections;
    }

    public int getActiveConnections() {
        if (shouldLoad()) {
            update();
        }
        return this.activeConnections;
    }

    public int getPendingThreads() {
        if (shouldLoad()) {
            update();
        }
        return this.pendingThreads;
    }

    public int getMaxConnections() {
        if (shouldLoad()) {
            update();
        }
        return this.maxConnections;
    }

    public int getMinConnections() {
        if (shouldLoad()) {
            update();
        }
        return this.minConnections;
    }

    protected abstract void update();

    private boolean shouldLoad() {
        long currentTime;
        long j;
        do {
            currentTime = ClockSource.currentTime();
            j = this.reloadAt.get();
            if (j > currentTime) {
                return false;
            }
        } while (!this.reloadAt.compareAndSet(j, ClockSource.plusMillis(currentTime, this.timeoutMs)));
        return true;
    }
}
