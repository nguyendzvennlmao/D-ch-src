package com.kammoun.utils.hikari.pool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ProxyStatement implements Statement {
    protected final ProxyConnection connection;
    final Statement delegate;
    private boolean isClosed;
    private ResultSet proxyResultSet;

    public ProxyStatement(ProxyConnection proxyConnection, Statement statement) {
        this.connection = proxyConnection;
        this.delegate = statement;
    }

    public final SQLException checkException(SQLException sQLException) {
        return this.connection.checkException(sQLException);
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + System.identityHashCode(this) + " wrapping " + this.delegate.toString();
    }

    @Override
    public final void close() throws SQLException {
        synchronized (this) {
            if (this.isClosed) {
                return;
            }
            this.isClosed = true;
            this.connection.untrackStatement(this.delegate);
            try {
                this.delegate.close();
            } catch (SQLException e) {
                throw this.connection.checkException(e);
            }
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return this.connection;
    }

    @Override
    public boolean execute(String str) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.execute(str);
    }

    @Override
    public boolean execute(String str, int i) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.execute(str, i);
    }

    @Override
    public ResultSet executeQuery(String str) throws SQLException {
        this.connection.markCommitStateDirty();
        return ProxyFactory.getProxyResultSet(this.connection, this, this.delegate.executeQuery(str));
    }

    @Override
    public int executeUpdate(String str) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeUpdate(str);
    }

    @Override
    public int[] executeBatch() throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeBatch();
    }

    @Override
    public int executeUpdate(String str, int i) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeUpdate(str, i);
    }

    @Override
    public int executeUpdate(String str, int[] iArr) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeUpdate(str, iArr);
    }

    @Override
    public int executeUpdate(String str, String[] strArr) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeUpdate(str, strArr);
    }

    @Override
    public boolean execute(String str, int[] iArr) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.execute(str, iArr);
    }

    @Override
    public boolean execute(String str, String[] strArr) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.execute(str, strArr);
    }

    public long[] executeLargeBatch() throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeLargeBatch();
    }

    public long executeLargeUpdate(String str) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeLargeUpdate(str);
    }

    public long executeLargeUpdate(String str, int i) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeLargeUpdate(str, i);
    }

    public long executeLargeUpdate(String str, int[] iArr) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeLargeUpdate(str, iArr);
    }

    public long executeLargeUpdate(String str, String[] strArr) throws SQLException {
        this.connection.markCommitStateDirty();
        return this.delegate.executeLargeUpdate(str, strArr);
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        ResultSet resultSet = this.delegate.getResultSet();
        if (resultSet == null) {
            this.proxyResultSet = null;
        } else if (this.proxyResultSet == null || ((ProxyResultSet) this.proxyResultSet).delegate != resultSet) {
            this.proxyResultSet = ProxyFactory.getProxyResultSet(this.connection, this, resultSet);
        }
        return this.proxyResultSet;
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        ResultSet generatedKeys = this.delegate.getGeneratedKeys();
        if (this.proxyResultSet == null || ((ProxyResultSet) this.proxyResultSet).delegate != generatedKeys) {
            this.proxyResultSet = ProxyFactory.getProxyResultSet(this.connection, this, generatedKeys);
        }
        return this.proxyResultSet;
    }

    @Override
    public final <T> T unwrap(Class<T> cls) throws SQLException {
        if (cls.isInstance(this.delegate)) {
            return (T) this.delegate;
        }
        if (this.delegate != null) {
            return (T) this.delegate.unwrap(cls);
        }
        throw new SQLException("Wrapped statement is not an instance of " + cls);
    }
}
