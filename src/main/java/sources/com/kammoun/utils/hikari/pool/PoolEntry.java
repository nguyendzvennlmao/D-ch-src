package com.kammoun.utils.hikari.pool;

import com.kammoun.utils.hikari.util.ClockSource;
import com.kammoun.utils.hikari.util.ConcurrentBag;
import com.kammoun.utils.hikari.util.FastList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PoolEntry implements ConcurrentBag.IConcurrentBagEntry {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) PoolEntry.class);
    private static final AtomicIntegerFieldUpdater<PoolEntry> stateUpdater = AtomicIntegerFieldUpdater.newUpdater(PoolEntry.class, "state");
    Connection connection;
    long lastBorrowed;
    private volatile boolean evict;
    private volatile ScheduledFuture<?> endOfLife;
    private volatile ScheduledFuture<?> keepalive;
    private final HikariPool hikariPool;
    private final boolean isReadOnly;
    private final boolean isAutoCommit;
    private volatile int state = 0;
    long lastAccessed = ClockSource.currentTime();
    private final FastList<Statement> openStatements = new FastList<>(Statement.class, 16);

    public PoolEntry(Connection connection, PoolBase poolBase, boolean z, boolean z2) {
        this.connection = connection;
        this.hikariPool = (HikariPool) poolBase;
        this.isReadOnly = z;
        this.isAutoCommit = z2;
    }

    public void recycle() {
        if (this.connection != null) {
            this.lastAccessed = ClockSource.currentTime();
            this.hikariPool.recycle(this);
        }
    }

    public void setFutureEol(ScheduledFuture<?> scheduledFuture) {
        this.endOfLife = scheduledFuture;
    }

    public void setKeepalive(ScheduledFuture<?> scheduledFuture) {
        this.keepalive = scheduledFuture;
    }

    public Connection createProxyConnection(ProxyLeakTask proxyLeakTask) {
        return ProxyFactory.getProxyConnection(this, this.connection, this.openStatements, proxyLeakTask, this.isReadOnly, this.isAutoCommit);
    }

    public void resetConnectionState(ProxyConnection proxyConnection, int i) throws SQLException {
        this.hikariPool.resetConnectionState(this.connection, proxyConnection, i);
    }

    public String getPoolName() {
        return this.hikariPool.toString();
    }

    public boolean isMarkedEvicted() {
        return this.evict;
    }

    public void markEvicted() {
        this.evict = true;
    }

    public void evict(String str) {
        this.hikariPool.closeConnection(this, str);
    }

    public long getMillisSinceBorrowed() {
        return ClockSource.elapsedMillis(this.lastBorrowed);
    }

    public PoolBase getPoolBase() {
        return this.hikariPool;
    }

    public String toString() {
        return this.connection + ", accessed " + ClockSource.elapsedDisplayString(this.lastAccessed, ClockSource.currentTime()) + " ago, " + stateToString();
    }

    @Override
    public int getState() {
        return stateUpdater.get(this);
    }

    @Override
    public boolean compareAndSet(int i, int i2) {
        return stateUpdater.compareAndSet(this, i, i2);
    }

    @Override
    public void setState(int i) {
        stateUpdater.set(this, i);
    }

    public Connection close() {
        ScheduledFuture<?> scheduledFuture = this.endOfLife;
        if (scheduledFuture != null && !scheduledFuture.isDone() && !scheduledFuture.cancel(false)) {
            LOGGER.warn("{} - maxLifeTime expiration task cancellation unexpectedly returned false for connection {}", getPoolName(), this.connection);
        }
        ScheduledFuture<?> scheduledFuture2 = this.keepalive;
        if (scheduledFuture2 != null && !scheduledFuture2.isDone() && !scheduledFuture2.cancel(false)) {
            LOGGER.warn("{} - keepalive task cancellation unexpectedly returned false for connection {}", getPoolName(), this.connection);
        }
        Connection connection = this.connection;
        this.connection = null;
        this.endOfLife = null;
        this.keepalive = null;
        return connection;
    }

    private String stateToString() {
        switch (this.state) {
            case -2:
                return "RESERVED";
            case -1:
                return "REMOVED";
            case 0:
                return "NOT_IN_USE";
            case 1:
                return "IN_USE";
            default:
                return "Invalid";
        }
    }
}
