package com.kammoun.utils.hikari.util;

import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class UtilityElf {

    public static final class DefaultThreadFactory implements ThreadFactory {
        private final String threadName;
        private final boolean daemon;

        public DefaultThreadFactory(String str, boolean z) {
            this.threadName = str;
            this.daemon = z;
        }

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.threadName);
            thread.setDaemon(this.daemon);
            return thread;
        }
    }

    private UtilityElf() {
    }

    public static String getNullIfEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        return str.trim();
    }

    public static void quietlySleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean safeIsAssignableFrom(Object obj, String str) {
        try {
            return Class.forName(str).isAssignableFrom(obj.getClass());
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static <T> T createInstance(String str, Class<T> cls, Object... objArr) {
        if (str == null) {
            return null;
        }
        try {
            Class<?> loadClass = UtilityElf.class.getClassLoader().loadClass(str);
            if (objArr.length == 0) {
                return cls.cast(loadClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            return cls.cast(loadClass.getConstructor(clsArr).newInstance(objArr));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ThreadPoolExecutor createThreadPoolExecutor(int i, String str, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        if (threadFactory == null) {
            threadFactory = new DefaultThreadFactory(str, true);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(i), threadFactory, rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor createThreadPoolExecutor(BlockingQueue<Runnable> blockingQueue, String str, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        if (threadFactory == null) {
            threadFactory = new DefaultThreadFactory(str, true);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, blockingQueue, threadFactory, rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static int getTransactionIsolation(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return IsolationLevel.valueOf(str.toUpperCase(Locale.ENGLISH)).getLevelId();
        } catch (IllegalArgumentException e) {
            try {
                int parseInt = Integer.parseInt(str);
                for (IsolationLevel isolationLevel : IsolationLevel.values()) {
                    if (isolationLevel.getLevelId() == parseInt) {
                        return isolationLevel.getLevelId();
                    }
                }
                throw new IllegalArgumentException("Invalid transaction isolation value: " + str);
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Invalid transaction isolation value: " + str, e2);
            }
        }
    }
}
