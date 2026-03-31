package com.kammoun.utils.hikari.pool;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ProxyPreparedStatement extends ProxyStatement implements PreparedStatement {
    public ProxyPreparedStatement(ProxyConnection proxyConnection, PreparedStatement preparedStatement) {
        super(proxyConnection, preparedStatement);
    }

    public boolean execute() throws SQLException {
        this.connection.markCommitStateDirty();
        return ((PreparedStatement) this.delegate).execute();
    }

    public ResultSet executeQuery() throws SQLException {
        this.connection.markCommitStateDirty();
        return ProxyFactory.getProxyResultSet(this.connection, this, ((PreparedStatement) this.delegate).executeQuery());
    }

    public int executeUpdate() throws SQLException {
        this.connection.markCommitStateDirty();
        return ((PreparedStatement) this.delegate).executeUpdate();
    }

    public long executeLargeUpdate() throws SQLException {
        this.connection.markCommitStateDirty();
        return ((PreparedStatement) this.delegate).executeLargeUpdate();
    }
}
