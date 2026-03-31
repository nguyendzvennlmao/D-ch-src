package com.kammoun.utils.hikari.pool;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProxyLeakTask implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) ProxyLeakTask.class);
    static final ProxyLeakTask NO_LEAK = new ProxyLeakTask() {
        @Override
        void schedule(ScheduledExecutorService scheduledExecutorService, long j) {
        }

        @Override
        public void run() {
        }

        @Override
        public void cancel() {
        }
    };
    private ScheduledFuture<?> scheduledFuture;
    private String connectionName;
    private Exception exception;
    private String threadName;
    private boolean isLeaked;

    public ProxyLeakTask(PoolEntry poolEntry) {
        this.exception = new Exception("Apparent connection leak detected");
        this.threadName = Thread.currentThread().getName();
        this.connectionName = poolEntry.connection.toString();
    }

    private ProxyLeakTask() {
    }

    public void schedule(ScheduledExecutorService scheduledExecutorService, long j) {
        this.scheduledFuture = scheduledExecutorService.schedule(this, j, TimeUnit.MILLISECONDS);
    }

    @Override
    public void run() {
        this.isLeaked = true;
        StackTraceElement[] stackTrace = this.exception.getStackTrace();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length - 5];
        System.arraycopy(stackTrace, 5, stackTraceElementArr, 0, stackTraceElementArr.length);
        this.exception.setStackTrace(stackTraceElementArr);
        LOGGER.warn("Connection leak detection triggered for {} on thread {}, stack trace follows", this.connectionName, this.threadName, this.exception);
    }

    public void cancel() {
        this.scheduledFuture.cancel(false);
        if (this.isLeaked) {
            LOGGER.info("Previously reported leaked connection {} on thread {} was returned to the pool (unleaked)", this.connectionName, this.threadName);
        }
    }
}
