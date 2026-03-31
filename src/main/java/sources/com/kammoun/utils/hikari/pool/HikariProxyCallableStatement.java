package com.kammoun.utils.hikari.pool;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Wrapper;
import java.util.Calendar;
import java.util.Map;

public final class HikariProxyCallableStatement extends ProxyCallableStatement implements Wrapper, AutoCloseable, Statement, PreparedStatement, CallableStatement {
    @Override
    public boolean isWrapperFor(Class cls) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).isWrapperFor(cls);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public ResultSet executeQuery(String str) throws SQLException {
        try {
            return super.executeQuery(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int executeUpdate(String str) throws SQLException {
        try {
            return super.executeUpdate(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getMaxFieldSize();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setMaxFieldSize(int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setMaxFieldSize(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getMaxRows() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getMaxRows();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setMaxRows(int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setMaxRows(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setEscapeProcessing(boolean z) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setEscapeProcessing(z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getQueryTimeout();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setQueryTimeout(int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setQueryTimeout(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void cancel() throws SQLException {
        try {
            ((CallableStatement) this.delegate).cancel();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getWarnings();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void clearWarnings() throws SQLException {
        try {
            ((CallableStatement) this.delegate).clearWarnings();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCursorName(String str) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setCursorName(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean execute(String str) throws SQLException {
        try {
            return super.execute(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        try {
            return super.getResultSet();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getUpdateCount() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getUpdateCount();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getMoreResults();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setFetchDirection(int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setFetchDirection(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getFetchDirection() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getFetchDirection();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setFetchSize(int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setFetchSize(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getFetchSize() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getFetchSize();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getResultSetConcurrency();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getResultSetType() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getResultSetType();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void addBatch(String str) throws SQLException {
        try {
            ((CallableStatement) this.delegate).addBatch(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void clearBatch() throws SQLException {
        try {
            ((CallableStatement) this.delegate).clearBatch();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int[] executeBatch() throws SQLException {
        try {
            return super.executeBatch();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        try {
            return super.getConnection();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean getMoreResults(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getMoreResults(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        try {
            return super.getGeneratedKeys();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int executeUpdate(String str, int i) throws SQLException {
        try {
            return super.executeUpdate(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int executeUpdate(String str, int[] iArr) throws SQLException {
        try {
            return super.executeUpdate(str, iArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int executeUpdate(String str, String[] strArr) throws SQLException {
        try {
            return super.executeUpdate(str, strArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean execute(String str, int i) throws SQLException {
        try {
            return super.execute(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean execute(String str, int[] iArr) throws SQLException {
        try {
            return super.execute(str, iArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean execute(String str, String[] strArr) throws SQLException {
        try {
            return super.execute(str, strArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getResultSetHoldability();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isClosed() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).isClosed();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setPoolable(boolean z) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setPoolable(z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isPoolable() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).isPoolable();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void closeOnCompletion() throws SQLException {
        try {
            ((CallableStatement) this.delegate).closeOnCompletion();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public boolean isCloseOnCompletion() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).isCloseOnCompletion();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public long getLargeUpdateCount() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getLargeUpdateCount();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void setLargeMaxRows(long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setLargeMaxRows(j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public long getLargeMaxRows() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getLargeMaxRows();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long[] executeLargeBatch() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).executeLargeBatch();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long executeLargeUpdate(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).executeLargeUpdate(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long executeLargeUpdate(String str, int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).executeLargeUpdate(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long executeLargeUpdate(String str, int[] iArr) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).executeLargeUpdate(str, iArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long executeLargeUpdate(String str, String[] strArr) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).executeLargeUpdate(str, strArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public String enquoteLiteral(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).enquoteLiteral(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public String enquoteIdentifier(String str, boolean z) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).enquoteIdentifier(str, z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public boolean isSimpleIdentifier(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).isSimpleIdentifier(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public String enquoteNCharLiteral(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).enquoteNCharLiteral(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        try {
            return super.executeQuery();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int executeUpdate() throws SQLException {
        try {
            return super.executeUpdate();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNull(int i, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNull(i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBoolean(int i, boolean z) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBoolean(i, z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setByte(int i, byte b) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setByte(i, b);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setShort(int i, short s) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setShort(i, s);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setInt(int i, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setInt(i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setLong(int i, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setLong(i, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setFloat(int i, float f) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setFloat(i, f);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setDouble(int i, double d) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setDouble(i, d);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBigDecimal(int i, BigDecimal bigDecimal) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBigDecimal(i, bigDecimal);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setString(int i, String str) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setString(i, str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBytes(int i, byte[] bArr) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBytes(i, bArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setDate(int i, Date date) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setDate(i, date);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTime(int i, Time time) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTime(i, time);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTimestamp(int i, Timestamp timestamp) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTimestamp(i, timestamp);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setAsciiStream(int i, InputStream inputStream, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setAsciiStream(i, inputStream, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setUnicodeStream(int i, InputStream inputStream, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setUnicodeStream(i, inputStream, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBinaryStream(int i, InputStream inputStream, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBinaryStream(i, inputStream, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void clearParameters() throws SQLException {
        try {
            ((CallableStatement) this.delegate).clearParameters();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setObject(int i, Object obj, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(i, obj, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setObject(int i, Object obj) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(i, obj);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean execute() throws SQLException {
        try {
            return super.execute();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void addBatch() throws SQLException {
        try {
            ((CallableStatement) this.delegate).addBatch();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCharacterStream(int i, Reader reader, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setCharacterStream(i, reader, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setRef(int i, Ref ref) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setRef(i, ref);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBlob(int i, Blob blob) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBlob(i, blob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setClob(int i, Clob clob) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setClob(i, clob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setArray(int i, Array array) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setArray(i, array);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getMetaData();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setDate(int i, Date date, Calendar calendar) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setDate(i, date, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTime(int i, Time time, Calendar calendar) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTime(i, time, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTimestamp(int i, Timestamp timestamp, Calendar calendar) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTimestamp(i, timestamp, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNull(int i, int i2, String str) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNull(i, i2, str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setURL(int i, URL url) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setURL(i, url);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getParameterMetaData();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setRowId(int i, RowId rowId) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setRowId(i, rowId);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNString(int i, String str) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNString(i, str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNCharacterStream(int i, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNCharacterStream(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNClob(int i, NClob nClob) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNClob(i, nClob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setClob(int i, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setClob(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBlob(int i, InputStream inputStream, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBlob(i, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNClob(int i, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNClob(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setSQLXML(int i, SQLXML sqlxml) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setSQLXML(i, sqlxml);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setObject(int i, Object obj, int i2, int i3) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(i, obj, i2, i3);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setAsciiStream(int i, InputStream inputStream, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setAsciiStream(i, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBinaryStream(int i, InputStream inputStream, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBinaryStream(i, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCharacterStream(int i, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setCharacterStream(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setAsciiStream(int i, InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setAsciiStream(i, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBinaryStream(int i, InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBinaryStream(i, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCharacterStream(int i, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setCharacterStream(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNCharacterStream(int i, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNCharacterStream(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setClob(int i, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setClob(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBlob(int i, InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBlob(i, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNClob(int i, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNClob(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void setObject(int i, Object obj, SQLType sQLType, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(i, obj, sQLType, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void setObject(int i, Object obj, SQLType sQLType) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(i, obj, sQLType);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long executeLargeUpdate() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).executeLargeUpdate();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void registerOutParameter(int i, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void registerOutParameter(int i, int i2, int i3) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(i, i2, i3);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean wasNull() throws SQLException {
        try {
            return ((CallableStatement) this.delegate).wasNull();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getString(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getString(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean getBoolean(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBoolean(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte getByte(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getByte(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public short getShort(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getShort(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getInt(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getInt(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long getLong(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getLong(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public float getFloat(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getFloat(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public double getDouble(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getDouble(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int i, int i2) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBigDecimal(i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte[] getBytes(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBytes(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getDate(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTime(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTimestamp(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getObject(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBigDecimal(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(int i, Map map) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getObject(i, (Map<String, Class<?>>) map);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Ref getRef(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getRef(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Blob getBlob(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBlob(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Clob getClob(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getClob(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Array getArray(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getArray(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(int i, Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getDate(i, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(int i, Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTime(i, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(int i, Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTimestamp(i, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void registerOutParameter(int i, int i2, String str) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(i, i2, str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void registerOutParameter(String str, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void registerOutParameter(String str, int i, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(str, i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void registerOutParameter(String str, int i, String str2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(str, i, str2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public URL getURL(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getURL(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setURL(String str, URL url) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setURL(str, url);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNull(String str, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNull(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBoolean(String str, boolean z) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBoolean(str, z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setByte(String str, byte b) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setByte(str, b);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setShort(String str, short s) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setShort(str, s);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setInt(String str, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setInt(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setLong(String str, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setLong(str, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setFloat(String str, float f) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setFloat(str, f);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setDouble(String str, double d) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setDouble(str, d);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBigDecimal(String str, BigDecimal bigDecimal) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBigDecimal(str, bigDecimal);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setString(String str, String str2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setString(str, str2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBytes(String str, byte[] bArr) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBytes(str, bArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setDate(String str, Date date) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setDate(str, date);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTime(String str, Time time) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTime(str, time);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTimestamp(String str, Timestamp timestamp) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTimestamp(str, timestamp);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setAsciiStream(String str, InputStream inputStream, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setAsciiStream(str, inputStream, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBinaryStream(String str, InputStream inputStream, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBinaryStream(str, inputStream, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setObject(String str, Object obj, int i, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(str, obj, i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setObject(String str, Object obj, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(str, obj, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setObject(String str, Object obj) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(str, obj);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCharacterStream(String str, Reader reader, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setCharacterStream(str, reader, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setDate(String str, Date date, Calendar calendar) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setDate(str, date, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTime(String str, Time time, Calendar calendar) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTime(str, time, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setTimestamp(String str, Timestamp timestamp, Calendar calendar) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setTimestamp(str, timestamp, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNull(String str, int i, String str2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNull(str, i, str2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getString(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getString(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean getBoolean(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBoolean(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte getByte(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getByte(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public short getShort(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getShort(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getInt(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getInt(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long getLong(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getLong(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public float getFloat(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getFloat(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public double getDouble(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getDouble(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte[] getBytes(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBytes(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getDate(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTime(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTimestamp(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getObject(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBigDecimal(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(String str, Map map) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getObject(str, (Map<String, Class<?>>) map);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Ref getRef(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getRef(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Blob getBlob(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getBlob(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Clob getClob(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getClob(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Array getArray(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getArray(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(String str, Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getDate(str, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(String str, Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTime(str, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(String str, Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getTimestamp(str, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public URL getURL(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getURL(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public RowId getRowId(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getRowId(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public RowId getRowId(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getRowId(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setRowId(String str, RowId rowId) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setRowId(str, rowId);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNString(String str, String str2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNString(str, str2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNCharacterStream(String str, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNCharacterStream(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNClob(String str, NClob nClob) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNClob(str, nClob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setClob(String str, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setClob(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBlob(String str, InputStream inputStream, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBlob(str, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNClob(String str, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNClob(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public NClob getNClob(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getNClob(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public NClob getNClob(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getNClob(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setSQLXML(String str, SQLXML sqlxml) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setSQLXML(str, sqlxml);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public SQLXML getSQLXML(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getSQLXML(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public SQLXML getSQLXML(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getSQLXML(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getNString(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getNString(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getNString(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getNString(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getNCharacterStream(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getNCharacterStream(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getNCharacterStream(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getNCharacterStream(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getCharacterStream(int i) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getCharacterStream(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getCharacterStream(String str) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getCharacterStream(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBlob(String str, Blob blob) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBlob(str, blob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setClob(String str, Clob clob) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setClob(str, clob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setAsciiStream(String str, InputStream inputStream, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setAsciiStream(str, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBinaryStream(String str, InputStream inputStream, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBinaryStream(str, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCharacterStream(String str, Reader reader, long j) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setCharacterStream(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setAsciiStream(String str, InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setAsciiStream(str, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBinaryStream(String str, InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBinaryStream(str, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setCharacterStream(String str, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setCharacterStream(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNCharacterStream(String str, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNCharacterStream(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setClob(String str, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setClob(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setBlob(String str, InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setBlob(str, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setNClob(String str, Reader reader) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setNClob(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public Object getObject(int i, Class cls) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getObject(i, cls);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public Object getObject(String str, Class cls) throws SQLException {
        try {
            return ((CallableStatement) this.delegate).getObject(str, cls);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void setObject(String str, Object obj, SQLType sQLType, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(str, obj, sQLType, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void setObject(String str, Object obj, SQLType sQLType) throws SQLException {
        try {
            ((CallableStatement) this.delegate).setObject(str, obj, sQLType);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void registerOutParameter(int i, SQLType sQLType) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(i, sQLType);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void registerOutParameter(int i, SQLType sQLType, int i2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(i, sQLType, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void registerOutParameter(int i, SQLType sQLType, String str) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(i, sQLType, str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void registerOutParameter(String str, SQLType sQLType) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(str, sQLType);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void registerOutParameter(String str, SQLType sQLType, int i) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(str, sQLType, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void registerOutParameter(String str, SQLType sQLType, String str2) throws SQLException {
        try {
            ((CallableStatement) this.delegate).registerOutParameter(str, sQLType, str2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public HikariProxyCallableStatement(ProxyConnection proxyConnection, CallableStatement callableStatement) {
        super(proxyConnection, callableStatement);
    }
}
