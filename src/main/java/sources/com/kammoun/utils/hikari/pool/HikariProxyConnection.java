package com.kammoun.utils.hikari.pool;

import com.kammoun.utils.hikari.util.FastList;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.ShardingKey;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Wrapper;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public final class HikariProxyConnection extends ProxyConnection implements Wrapper, AutoCloseable, Connection {
    @Override
    public Statement createStatement() throws SQLException {
        try {
            return super.createStatement();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String str) throws SQLException {
        try {
            return super.prepareStatement(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public CallableStatement prepareCall(String str) throws SQLException {
        try {
            return super.prepareCall(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String nativeSQL(String str) throws SQLException {
        try {
            return this.delegate.nativeSQL(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setAutoCommit(boolean z) throws SQLException {
        try {
            super.setAutoCommit(z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        try {
            return this.delegate.getAutoCommit();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void commit() throws SQLException {
        try {
            super.commit();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void rollback() throws SQLException {
        try {
            super.rollback();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isClosed() throws SQLException {
        try {
            return super.isClosed();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        try {
            return super.getMetaData();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setReadOnly(boolean z) throws SQLException {
        try {
            super.setReadOnly(z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        try {
            return this.delegate.isReadOnly();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCatalog(String str) throws SQLException {
        try {
            super.setCatalog(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getCatalog() throws SQLException {
        try {
            return this.delegate.getCatalog();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTransactionIsolation(int i) throws SQLException {
        try {
            super.setTransactionIsolation(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        try {
            return this.delegate.getTransactionIsolation();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        try {
            return this.delegate.getWarnings();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void clearWarnings() throws SQLException {
        try {
            this.delegate.clearWarnings();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Statement createStatement(int i, int i2) throws SQLException {
        try {
            return super.createStatement(i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String str, int i, int i2) throws SQLException {
        try {
            return super.prepareStatement(str, i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public CallableStatement prepareCall(String str, int i, int i2) throws SQLException {
        try {
            return super.prepareCall(str, i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Map getTypeMap() throws SQLException {
        try {
            return this.delegate.getTypeMap();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTypeMap(Map map) throws SQLException {
        try {
            this.delegate.setTypeMap(map);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setHoldability(int i) throws SQLException {
        try {
            this.delegate.setHoldability(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getHoldability() throws SQLException {
        try {
            return this.delegate.getHoldability();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        try {
            return this.delegate.setSavepoint();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Savepoint setSavepoint(String str) throws SQLException {
        try {
            return this.delegate.setSavepoint(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        try {
            super.rollback(savepoint);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        try {
            this.delegate.releaseSavepoint(savepoint);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Statement createStatement(int i, int i2, int i3) throws SQLException {
        try {
            return super.createStatement(i, i2, i3);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String str, int i, int i2, int i3) throws SQLException {
        try {
            return super.prepareStatement(str, i, i2, i3);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public CallableStatement prepareCall(String str, int i, int i2, int i3) throws SQLException {
        try {
            return super.prepareCall(str, i, i2, i3);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String str, int i) throws SQLException {
        try {
            return super.prepareStatement(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String str, int[] iArr) throws SQLException {
        try {
            return super.prepareStatement(str, iArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public PreparedStatement prepareStatement(String str, String[] strArr) throws SQLException {
        try {
            return super.prepareStatement(str, strArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Clob createClob() throws SQLException {
        try {
            return this.delegate.createClob();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Blob createBlob() throws SQLException {
        try {
            return this.delegate.createBlob();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public NClob createNClob() throws SQLException {
        try {
            return this.delegate.createNClob();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        try {
            return this.delegate.createSQLXML();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isValid(int i) throws SQLException {
        try {
            return this.delegate.isValid(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setClientInfo(String str, String str2) throws SQLClientInfoException {
        this.delegate.setClientInfo(str, str2);
    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        this.delegate.setClientInfo(properties);
    }

    @Override
    public String getClientInfo(String str) throws SQLException {
        try {
            return this.delegate.getClientInfo(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        try {
            return this.delegate.getClientInfo();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Array createArrayOf(String str, Object[] objArr) throws SQLException {
        try {
            return this.delegate.createArrayOf(str, objArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Struct createStruct(String str, Object[] objArr) throws SQLException {
        try {
            return this.delegate.createStruct(str, objArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setSchema(String str) throws SQLException {
        try {
            super.setSchema(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public String getSchema() throws SQLException {
        try {
            return this.delegate.getSchema();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void abort(Executor executor) throws SQLException {
        try {
            this.delegate.abort(executor);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNetworkTimeout(Executor executor, int i) throws SQLException {
        try {
            super.setNetworkTimeout(executor, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public int getNetworkTimeout() throws SQLException {
        try {
            return this.delegate.getNetworkTimeout();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void beginRequest() throws SQLException {
        try {
            this.delegate.beginRequest();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void endRequest() throws SQLException {
        try {
            this.delegate.endRequest();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public boolean setShardingKeyIfValid(ShardingKey shardingKey, ShardingKey shardingKey2, int i) throws SQLException {
        try {
            return this.delegate.setShardingKeyIfValid(shardingKey, shardingKey2, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public boolean setShardingKeyIfValid(ShardingKey shardingKey, int i) throws SQLException {
        try {
            return this.delegate.setShardingKeyIfValid(shardingKey, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void setShardingKey(ShardingKey shardingKey, ShardingKey shardingKey2) throws SQLException {
        try {
            this.delegate.setShardingKey(shardingKey, shardingKey2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void setShardingKey(ShardingKey shardingKey) throws SQLException {
        try {
            this.delegate.setShardingKey(shardingKey);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public HikariProxyConnection(PoolEntry poolEntry, Connection connection, FastList fastList, ProxyLeakTask proxyLeakTask, boolean z, boolean z2) {
        super(poolEntry, connection, fastList, proxyLeakTask, z, z2);
    }
}
