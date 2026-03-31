package com.kammoun.utils.hikari.util;

import java.sql.SQLException;
import java.sql.SQLTransientException;
import java.util.concurrent.Semaphore;

public class SuspendResumeLock {
    public static final SuspendResumeLock FAUX_LOCK = new SuspendResumeLock(false) {
        @Override
        public void acquire() {
        }

        @Override
        public void release() {
        }

        @Override
        public void suspend() {
        }

        @Override
        public void resume() {
        }
    };
    private static final int MAX_PERMITS = 10000;
    private final Semaphore acquisitionSemaphore;

    public SuspendResumeLock() {
        this(true);
    }

    private SuspendResumeLock(boolean z) {
        this.acquisitionSemaphore = z ? new Semaphore(MAX_PERMITS, true) : null;
    }

    public void acquire() throws SQLException {
        if (this.acquisitionSemaphore.tryAcquire()) {
            return;
        }
        if (Boolean.getBoolean("com.kammoun.utils.hikari.throwIfSuspended")) {
            throw new SQLTransientException("The pool is currently suspended and configured to throw exceptions upon acquisition");
        }
        this.acquisitionSemaphore.acquireUninterruptibly();
    }

    public void release() {
        this.acquisitionSemaphore.release();
    }

    public void suspend() {
        this.acquisitionSemaphore.acquireUninterruptibly(MAX_PERMITS);
    }

    public void resume() {
        this.acquisitionSemaphore.release(MAX_PERMITS);
    }
}
