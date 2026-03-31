package com.kammoun.utils.hikari.util;

import com.kammoun.utils.hikari.util.ConcurrentBag.IConcurrentBagEntry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcurrentBag<T extends IConcurrentBagEntry> implements AutoCloseable {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) ConcurrentBag.class);
    private final ThreadLocal<List<Object>> threadList;
    private final IBagStateListener listener;
    private volatile boolean closed;
    private final boolean weakThreadLocals = useWeakThreadLocals();
    private final SynchronousQueue<T> handoffQueue = new SynchronousQueue<>(true);
    private final AtomicInteger waiters = new AtomicInteger();
    private final CopyOnWriteArrayList<T> sharedList = new CopyOnWriteArrayList<>();

    public interface IBagStateListener {
        void addBagItem(int i);
    }

    public interface IConcurrentBagEntry {
        public static final int STATE_NOT_IN_USE = 0;
        public static final int STATE_IN_USE = 1;
        public static final int STATE_REMOVED = -1;
        public static final int STATE_RESERVED = -2;

        boolean compareAndSet(int i, int i2);

        void setState(int i);

        int getState();
    }

    public ConcurrentBag(IBagStateListener iBagStateListener) {
        this.listener = iBagStateListener;
        if (this.weakThreadLocals) {
            this.threadList = ThreadLocal.withInitial(() -> {
                return new ArrayList(16);
            });
        } else {
            this.threadList = ThreadLocal.withInitial(() -> {
                return new FastList(IConcurrentBagEntry.class, 16);
            });
        }
    }

    public T borrow(long j, TimeUnit timeUnit) throws InterruptedException {
        List<Object> list = this.threadList.get();
        for (int size = list.size() - 1; size >= 0; size--) {
            Object remove = list.remove(size);
            T t = (T) (this.weakThreadLocals ? (IConcurrentBagEntry) ((WeakReference) remove).get() : (IConcurrentBagEntry) remove);
            if (t != null && t.compareAndSet(0, 1)) {
                return t;
            }
        }
        int incrementAndGet = this.waiters.incrementAndGet();
        try {
            Iterator<T> it = this.sharedList.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next.compareAndSet(0, 1)) {
                    if (incrementAndGet > 1) {
                        this.listener.addBagItem(incrementAndGet - 1);
                    }
                    return next;
                }
            }
            this.listener.addBagItem(incrementAndGet);
            long nanos = timeUnit.toNanos(j);
            do {
                long currentTime = ClockSource.currentTime();
                T poll = this.handoffQueue.poll(nanos, TimeUnit.NANOSECONDS);
                if (poll == null || poll.compareAndSet(0, 1)) {
                    this.waiters.decrementAndGet();
                    return poll;
                }
                nanos -= ClockSource.elapsedNanos(currentTime);
            } while (nanos > 10000);
            this.waiters.decrementAndGet();
            return null;
        } finally {
            this.waiters.decrementAndGet();
        }
    }

    public void requite(T t) {
        t.setState(0);
        int i = 0;
        while (this.waiters.get() > 0) {
            if (t.getState() != 0 || this.handoffQueue.offer(t)) {
                return;
            }
            if ((i & 255) == 255) {
                LockSupport.parkNanos(TimeUnit.MICROSECONDS.toNanos(10L));
            } else {
                Thread.yield();
            }
            i++;
        }
        List<Object> list = this.threadList.get();
        if (list.size() < 50) {
            list.add(this.weakThreadLocals ? new WeakReference(t) : t);
        }
    }

    public void add(T t) {
        if (this.closed) {
            LOGGER.info("ConcurrentBag has been closed, ignoring add()");
            throw new IllegalStateException("ConcurrentBag has been closed, ignoring add()");
        }
        this.sharedList.add(t);
        while (this.waiters.get() > 0 && t.getState() == 0 && !this.handoffQueue.offer(t)) {
            Thread.yield();
        }
    }

    public boolean remove(T t) {
        if (!t.compareAndSet(1, -1) && !t.compareAndSet(-2, -1) && !this.closed) {
            LOGGER.warn("Attempt to remove an object from the bag that was not borrowed or reserved: {}", t);
            return false;
        }
        boolean remove = this.sharedList.remove(t);
        if (!remove && !this.closed) {
            LOGGER.warn("Attempt to remove an object from the bag that does not exist: {}", t);
        }
        this.threadList.get().remove(t);
        return remove;
    }

    @Override
    public void close() {
        this.closed = true;
    }

    public List<T> values(int i) {
        List<T> list = (List) this.sharedList.stream().filter(iConcurrentBagEntry -> {
            return iConcurrentBagEntry.getState() == i;
        }).collect(Collectors.toList());
        Collections.reverse(list);
        return list;
    }

    public List<T> values() {
        return (List) this.sharedList.clone();
    }

    public boolean reserve(T t) {
        return t.compareAndSet(0, -2);
    }

    public void unreserve(T t) {
        if (!t.compareAndSet(-2, 0)) {
            LOGGER.warn("Attempt to relinquish an object to the bag that was not reserved: {}", t);
            return;
        }
        while (this.waiters.get() > 0 && !this.handoffQueue.offer(t)) {
            Thread.yield();
        }
    }

    public int getWaitingThreadCount() {
        return this.waiters.get();
    }

    public int getCount(int i) {
        int i2 = 0;
        Iterator<T> it = this.sharedList.iterator();
        while (it.hasNext()) {
            if (it.next().getState() == i) {
                i2++;
            }
        }
        return i2;
    }

    public int[] getStateCounts() {
        int[] iArr = new int[6];
        Iterator<T> it = this.sharedList.iterator();
        while (it.hasNext()) {
            int state = it.next().getState();
            iArr[state] = iArr[state] + 1;
        }
        iArr[4] = this.sharedList.size();
        iArr[5] = this.waiters.get();
        return iArr;
    }

    public int size() {
        return this.sharedList.size();
    }

    public void dumpState() {
        this.sharedList.forEach(iConcurrentBagEntry -> {
            LOGGER.info(iConcurrentBagEntry.toString());
        });
    }

    private boolean useWeakThreadLocals() {
        try {
            return System.getProperty("com.kammoun.utils.hikari.useWeakReferences") != null ? Boolean.getBoolean("com.kammoun.utils.hikari.useWeakReferences") : getClass().getClassLoader() != ClassLoader.getSystemClassLoader();
        } catch (SecurityException e) {
            return true;
        }
    }
}
