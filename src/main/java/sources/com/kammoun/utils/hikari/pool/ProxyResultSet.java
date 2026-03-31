package com.kammoun.utils.hikari.pool;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ProxyResultSet implements ResultSet {
    protected final ProxyConnection connection;
    protected final ProxyStatement statement;
    final ResultSet delegate;

    public ProxyResultSet(ProxyConnection proxyConnection, ProxyStatement proxyStatement, ResultSet resultSet) {
        this.connection = proxyConnection;
        this.statement = proxyStatement;
        this.delegate = resultSet;
    }

    public final SQLException checkException(SQLException sQLException) {
        return this.connection.checkException(sQLException);
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + System.identityHashCode(this) + " wrapping " + this.delegate;
    }

    @Override
    public final Statement getStatement() throws SQLException {
        return this.statement;
    }

    @Override
    public void updateRow() throws SQLException {
        this.connection.markCommitStateDirty();
        this.delegate.updateRow();
    }

    @Override
    public void insertRow() throws SQLException {
        this.connection.markCommitStateDirty();
        this.delegate.insertRow();
    }

    @Override
    public void deleteRow() throws SQLException {
        this.connection.markCommitStateDirty();
        this.delegate.deleteRow();
    }

    @Override
    public final <T> T unwrap(Class<T> cls) throws SQLException {
        if (cls.isInstance(this.delegate)) {
            return (T) this.delegate;
        }
        if (this.delegate != null) {
            return (T) this.delegate.unwrap(cls);
        }
        throw new SQLException("Wrapped ResultSet is not an instance of " + cls);
    }
}
