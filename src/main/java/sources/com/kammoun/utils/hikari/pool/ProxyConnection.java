package com.kammoun.utils.hikari.pool;

import com.kammoun.utils.hikari.SQLExceptionOverride;
import com.kammoun.utils.hikari.util.FastList;
import java.lang.reflect.Proxy;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ProxyConnection implements Connection {
    static final int DIRTY_BIT_READONLY = 1;
    static final int DIRTY_BIT_AUTOCOMMIT = 2;
    static final int DIRTY_BIT_ISOLATION = 4;
    static final int DIRTY_BIT_CATALOG = 8;
    static final int DIRTY_BIT_NETTIMEOUT = 16;
    static final int DIRTY_BIT_SCHEMA = 32;
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) ProxyConnection.class);
    private static final Set<String> ERROR_STATES = new HashSet();
    private static final Set<Integer> ERROR_CODES;
    protected Connection delegate;
    private final PoolEntry poolEntry;
    private final ProxyLeakTask leakTask;
    private final FastList<Statement> openStatements;
    private int dirtyBits;
    private boolean isCommitStateDirty;
    private boolean isReadOnly;
    private boolean isAutoCommit;
    private int networkTimeout;
    private int transactionIsolation;
    private String dbcatalog;
    private String dbschema;

    public static final class ClosedConnection {
        static final Connection CLOSED_CONNECTION = getClosedConnection();

        private ClosedConnection() {
        }

        private static Connection getClosedConnection() {
            return (Connection) Proxy.newProxyInstance(Connection.class.getClassLoader(), new Class[]{Connection.class}, (obj, method, objArr) -> {
                String name = method.getName();
                if ("isClosed".equals(name)) {
                    return Boolean.TRUE;
                }
                if ("isValid".equals(name)) {
                    return Boolean.FALSE;
                }
                if (!"abort".equals(name) && !"close".equals(name)) {
                    if ("toString".equals(name)) {
                        return ClosedConnection.class.getCanonicalName();
                    }
                    throw new SQLException("Connection is closed");
                }
                return Void.TYPE;
            });
        }
    }

    public ProxyConnection(PoolEntry poolEntry, Connection connection, FastList<Statement> fastList, ProxyLeakTask proxyLeakTask, boolean z, boolean z2) {
        this.poolEntry = poolEntry;
        this.delegate = connection;
        this.openStatements = fastList;
        this.leakTask = proxyLeakTask;
        this.isReadOnly = z;
        this.isAutoCommit = z2;
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + System.identityHashCode(this) + " wrapping " + this.delegate;
    }

    public final boolean getAutoCommitState() {
        return this.isAutoCommit;
    }

    public final String getCatalogState() {
        return this.dbcatalog;
    }

    public final String getSchemaState() {
        return this.dbschema;
    }

    public final int getTransactionIsolationState() {
        return this.transactionIsolation;
    }

    public final boolean getReadOnlyState() {
        return this.isReadOnly;
    }

    public final int getNetworkTimeoutState() {
        return this.networkTimeout;
    }

    public final PoolEntry getPoolEntry() {
        return this.poolEntry;
    }

    public final SQLException checkException(SQLException sQLException) {
        boolean z = false;
        SQLException sQLException2 = sQLException;
        SQLExceptionOverride sQLExceptionOverride = this.poolEntry.getPoolBase().exceptionOverride;
        for (int i = 0; this.delegate != ClosedConnection.CLOSED_CONNECTION && sQLException2 != null && i < 10; i++) {
            String sQLState = sQLException2.getSQLState();
            if ((sQLState == null || !sQLState.startsWith("08")) && !(sQLException2 instanceof SQLTimeoutException) && !ERROR_STATES.contains(sQLState) && !ERROR_CODES.contains(Integer.valueOf(sQLException2.getErrorCode()))) {
                sQLException2 = sQLException2.getNextException();
            } else if (sQLExceptionOverride == null || sQLExceptionOverride.adjudicate(sQLException2) != SQLExceptionOverride.Override.DO_NOT_EVICT) {
                z = true;
            }
        }
        if (z) {
            SQLException sQLException3 = sQLException2 != null ? sQLException2 : sQLException;
            LOGGER.warn("{} - Connection {} marked as broken because of SQLSTATE({}), ErrorCode({})", this.poolEntry.getPoolName(), this.delegate, sQLException3.getSQLState(), Integer.valueOf(sQLException3.getErrorCode()), sQLException3);
            this.leakTask.cancel();
            this.poolEntry.evict("(connection is broken)");
            this.delegate = ClosedConnection.CLOSED_CONNECTION;
        }
        return sQLException;
    }

    public final synchronized void untrackStatement(Statement statement) {
        this.openStatements.remove(statement);
    }

    public final void markCommitStateDirty() {
        if (this.isAutoCommit) {
            return;
        }
        this.isCommitStateDirty = true;
    }

    public void cancelLeakTask() {
        this.leakTask.cancel();
    }

    private synchronized <T extends Statement> T trackStatement(T t) {
        this.openStatements.add(t);
        return t;
    }

    private synchronized void closeStatements() {
        int size = this.openStatements.size();
        if (size > 0) {
            for (int i = 0; i < size && this.delegate != ClosedConnection.CLOSED_CONNECTION; i++) {
                try {
                    Statement statement = this.openStatements.get(i);
                    if (statement != null) {
                        statement.close();
                    }
                } catch (SQLException e) {
                    LOGGER.warn("{} - Connection {} marked as broken because of an exception closing open statements during Connection.close()", this.poolEntry.getPoolName(), this.delegate);
                    this.leakTask.cancel();
                    this.poolEntry.evict("(exception closing Statements during Connection.close())");
                    this.delegate = ClosedConnection.CLOSED_CONNECTION;
                }
            }
            this.openStatements.clear();
        }
    }

    @Override
    public final void close() throws SQLException {
        closeStatements();
        if (this.delegate != ClosedConnection.CLOSED_CONNECTION) {
            this.leakTask.cancel();
            try {
                if (this.isCommitStateDirty && !this.isAutoCommit) {
                    this.delegate.rollback();
                    LOGGER.debug("{} - Executed rollback on connection {} due to dirty commit state on close().", this.poolEntry.getPoolName(), this.delegate);
                }
                if (this.dirtyBits != 0) {
                    this.poolEntry.resetConnectionState(this, this.dirtyBits);
                }
                this.delegate.clearWarnings();
            } catch (SQLException e) {
                if (!this.poolEntry.isMarkedEvicted()) {
                    throw checkException(e);
                }
            } finally {
                this.delegate = ClosedConnection.CLOSED_CONNECTION;
                this.poolEntry.recycle();
            }
        }
    }

    @Override
    public boolean isClosed() throws SQLException {
        return this.delegate == ClosedConnection.CLOSED_CONNECTION;
    }

    @Override
    public Statement createStatement() throws SQLException {
        return ProxyFactory.getProxyStatement(this, trackStatement(this.delegate.createStatement()));
    }

    @Override
    public Statement createStatement(int i, int i2) throws SQLException {
        return ProxyFactory.getProxyStatement(this, trackStatement(this.delegate.createStatement(i, i2)));
    }

    @Override
    public Statement createStatement(int i, int i2, int i3) throws SQLException {
        return ProxyFactory.getProxyStatement(this, trackStatement(this.delegate.createStatement(i, i2, i3)));
    }

    @Override
    public CallableStatement prepareCall(String str) throws SQLException {
        return ProxyFactory.getProxyCallableStatement(this, (CallableStatement) trackStatement(this.delegate.prepareCall(str)));
    }

    @Override
    public CallableStatement prepareCall(String str, int i, int i2) throws SQLException {
        return ProxyFactory.getProxyCallableStatement(this, (CallableStatement) trackStatement(this.delegate.prepareCall(str, i, i2)));
    }

    @Override
    public CallableStatement prepareCall(String str, int i, int i2, int i3) throws SQLException {
        return ProxyFactory.getProxyCallableStatement(this, (CallableStatement) trackStatement(this.delegate.prepareCall(str, i, i2, i3)));
    }

    @Override
    public PreparedStatement prepareStatement(String str) throws SQLException {
        return ProxyFactory.getProxyPreparedStatement(this, (PreparedStatement) trackStatement(this.delegate.prepareStatement(str)));
    }

    @Override
    public PreparedStatement prepareStatement(String str, int i) throws SQLException {
        return ProxyFactory.getProxyPreparedStatement(this, (PreparedStatement) trackStatement(this.delegate.prepareStatement(str, i)));
    }

    @Override
    public PreparedStatement prepareStatement(String str, int i, int i2) throws SQLException {
        return ProxyFactory.getProxyPreparedStatement(this, (PreparedStatement) trackStatement(this.delegate.prepareStatement(str, i, i2)));
    }

    @Override
    public PreparedStatement prepareStatement(String str, int i, int i2, int i3) throws SQLException {
        return ProxyFactory.getProxyPreparedStatement(this, (PreparedStatement) trackStatement(this.delegate.prepareStatement(str, i, i2, i3)));
    }

    @Override
    public PreparedStatement prepareStatement(String str, int[] iArr) throws SQLException {
        return ProxyFactory.getProxyPreparedStatement(this, (PreparedStatement) trackStatement(this.delegate.prepareStatement(str, iArr)));
    }

    @Override
    public PreparedStatement prepareStatement(String str, String[] strArr) throws SQLException {
        return ProxyFactory.getProxyPreparedStatement(this, (PreparedStatement) trackStatement(this.delegate.prepareStatement(str, strArr)));
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        markCommitStateDirty();
        return ProxyFactory.getProxyDatabaseMetaData(this, this.delegate.getMetaData());
    }

    @Override
    public void commit() throws SQLException {
        this.delegate.commit();
        this.isCommitStateDirty = false;
    }

    @Override
    public void rollback() throws SQLException {
        this.delegate.rollback();
        this.isCommitStateDirty = false;
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        this.delegate.rollback(savepoint);
        this.isCommitStateDirty = false;
    }

    @Override
    public void setAutoCommit(boolean z) throws SQLException {
        this.delegate.setAutoCommit(z);
        this.isAutoCommit = z;
        this.dirtyBits |= 2;
    }

    @Override
    public void setReadOnly(boolean z) throws SQLException {
        this.delegate.setReadOnly(z);
        this.isReadOnly = z;
        this.isCommitStateDirty = false;
        this.dirtyBits |= 1;
    }

    @Override
    public void setTransactionIsolation(int i) throws SQLException {
        this.delegate.setTransactionIsolation(i);
        this.transactionIsolation = i;
        this.dirtyBits |= 4;
    }

    @Override
    public void setCatalog(String str) throws SQLException {
        this.delegate.setCatalog(str);
        this.dbcatalog = str;
        this.dirtyBits |= 8;
    }

    public void setNetworkTimeout(Executor executor, int i) throws SQLException {
        this.delegate.setNetworkTimeout(executor, i);
        this.networkTimeout = i;
        this.dirtyBits |= 16;
    }

    public void setSchema(String str) throws SQLException {
        this.delegate.setSchema(str);
        this.dbschema = str;
        this.dirtyBits |= 32;
    }

    @Override
    public final boolean isWrapperFor(Class<?> cls) throws SQLException {
        return cls.isInstance(this.delegate) || (this.delegate != null && this.delegate.isWrapperFor(cls));
    }

    @Override
    public final <T> T unwrap(Class<T> cls) throws SQLException {
        if (cls.isInstance(this.delegate)) {
            return (T) this.delegate;
        }
        if (this.delegate != null) {
            return (T) this.delegate.unwrap(cls);
        }
        throw new SQLException("Wrapped connection is not an instance of " + cls);
    }

    static {
        ERROR_STATES.add("0A000");
        ERROR_STATES.add("57P01");
        ERROR_STATES.add("57P02");
        ERROR_STATES.add("57P03");
        ERROR_STATES.add("01002");
        ERROR_STATES.add("JZ0C0");
        ERROR_STATES.add("JZ0C1");
        ERROR_CODES = new HashSet();
        ERROR_CODES.add(500150);
        ERROR_CODES.add(2399);
    }
}
