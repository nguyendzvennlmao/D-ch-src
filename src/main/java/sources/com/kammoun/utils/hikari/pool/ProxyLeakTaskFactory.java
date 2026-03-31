package com.kammoun.utils.hikari.pool;

import java.util.concurrent.ScheduledExecutorService;

public class ProxyLeakTaskFactory {
    private ScheduledExecutorService executorService;
    private long leakDetectionThreshold;

    public ProxyLeakTaskFactory(long j, ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
        this.leakDetectionThreshold = j;
    }

    public ProxyLeakTask schedule(PoolEntry poolEntry) {
        return this.leakDetectionThreshold == 0 ? ProxyLeakTask.NO_LEAK : scheduleNewTask(poolEntry);
    }

    public void updateLeakDetectionThreshold(long j) {
        this.leakDetectionThreshold = j;
    }

    private ProxyLeakTask scheduleNewTask(PoolEntry poolEntry) {
        ProxyLeakTask proxyLeakTask = new ProxyLeakTask(poolEntry);
        proxyLeakTask.schedule(this.executorService, this.leakDetectionThreshold);
        return proxyLeakTask;
    }
}
