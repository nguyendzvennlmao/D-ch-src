package com.kammoun.utils.hikari.pool;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Wrapper;
import java.util.Calendar;
import java.util.Map;

public final class HikariProxyResultSet extends ProxyResultSet implements Wrapper, AutoCloseable, ResultSet {
    @Override
    public boolean isWrapperFor(Class cls) throws SQLException {
        try {
            return this.delegate.isWrapperFor(cls);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void close() throws Exception {
        this.delegate.close();
    }

    @Override
    public boolean next() throws SQLException {
        try {
            return this.delegate.next();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean wasNull() throws SQLException {
        try {
            return this.delegate.wasNull();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getString(int i) throws SQLException {
        try {
            return this.delegate.getString(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean getBoolean(int i) throws SQLException {
        try {
            return this.delegate.getBoolean(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte getByte(int i) throws SQLException {
        try {
            return this.delegate.getByte(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public short getShort(int i) throws SQLException {
        try {
            return this.delegate.getShort(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getInt(int i) throws SQLException {
        try {
            return this.delegate.getInt(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long getLong(int i) throws SQLException {
        try {
            return this.delegate.getLong(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public float getFloat(int i) throws SQLException {
        try {
            return this.delegate.getFloat(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public double getDouble(int i) throws SQLException {
        try {
            return this.delegate.getDouble(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int i, int i2) throws SQLException {
        try {
            return this.delegate.getBigDecimal(i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte[] getBytes(int i) throws SQLException {
        try {
            return this.delegate.getBytes(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(int i) throws SQLException {
        try {
            return this.delegate.getDate(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(int i) throws SQLException {
        try {
            return this.delegate.getTime(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(int i) throws SQLException {
        try {
            return this.delegate.getTimestamp(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public InputStream getAsciiStream(int i) throws SQLException {
        try {
            return this.delegate.getAsciiStream(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public InputStream getUnicodeStream(int i) throws SQLException {
        try {
            return this.delegate.getUnicodeStream(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public InputStream getBinaryStream(int i) throws SQLException {
        try {
            return this.delegate.getBinaryStream(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getString(String str) throws SQLException {
        try {
            return this.delegate.getString(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean getBoolean(String str) throws SQLException {
        try {
            return this.delegate.getBoolean(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte getByte(String str) throws SQLException {
        try {
            return this.delegate.getByte(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public short getShort(String str) throws SQLException {
        try {
            return this.delegate.getShort(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getInt(String str) throws SQLException {
        try {
            return this.delegate.getInt(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public long getLong(String str) throws SQLException {
        try {
            return this.delegate.getLong(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public float getFloat(String str) throws SQLException {
        try {
            return this.delegate.getFloat(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public double getDouble(String str) throws SQLException {
        try {
            return this.delegate.getDouble(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String str, int i) throws SQLException {
        try {
            return this.delegate.getBigDecimal(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public byte[] getBytes(String str) throws SQLException {
        try {
            return this.delegate.getBytes(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(String str) throws SQLException {
        try {
            return this.delegate.getDate(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(String str) throws SQLException {
        try {
            return this.delegate.getTime(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(String str) throws SQLException {
        try {
            return this.delegate.getTimestamp(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public InputStream getAsciiStream(String str) throws SQLException {
        try {
            return this.delegate.getAsciiStream(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public InputStream getUnicodeStream(String str) throws SQLException {
        try {
            return this.delegate.getUnicodeStream(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public InputStream getBinaryStream(String str) throws SQLException {
        try {
            return this.delegate.getBinaryStream(str);
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
    public String getCursorName() throws SQLException {
        try {
            return this.delegate.getCursorName();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        try {
            return this.delegate.getMetaData();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(int i) throws SQLException {
        try {
            return this.delegate.getObject(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(String str) throws SQLException {
        try {
            return this.delegate.getObject(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int findColumn(String str) throws SQLException {
        try {
            return this.delegate.findColumn(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getCharacterStream(int i) throws SQLException {
        try {
            return this.delegate.getCharacterStream(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getCharacterStream(String str) throws SQLException {
        try {
            return this.delegate.getCharacterStream(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal(int i) throws SQLException {
        try {
            return this.delegate.getBigDecimal(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public BigDecimal getBigDecimal(String str) throws SQLException {
        try {
            return this.delegate.getBigDecimal(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isBeforeFirst() throws SQLException {
        try {
            return this.delegate.isBeforeFirst();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isAfterLast() throws SQLException {
        try {
            return this.delegate.isAfterLast();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isFirst() throws SQLException {
        try {
            return this.delegate.isFirst();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean isLast() throws SQLException {
        try {
            return this.delegate.isLast();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void beforeFirst() throws SQLException {
        try {
            this.delegate.beforeFirst();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void afterLast() throws SQLException {
        try {
            this.delegate.afterLast();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean first() throws SQLException {
        try {
            return this.delegate.first();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean last() throws SQLException {
        try {
            return this.delegate.last();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getRow() throws SQLException {
        try {
            return this.delegate.getRow();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean absolute(int i) throws SQLException {
        try {
            return this.delegate.absolute(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean relative(int i) throws SQLException {
        try {
            return this.delegate.relative(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean previous() throws SQLException {
        try {
            return this.delegate.previous();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setFetchDirection(int i) throws SQLException {
        try {
            this.delegate.setFetchDirection(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getFetchDirection() throws SQLException {
        try {
            return this.delegate.getFetchDirection();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void setFetchSize(int i) throws SQLException {
        try {
            this.delegate.setFetchSize(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getFetchSize() throws SQLException {
        try {
            return this.delegate.getFetchSize();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getType() throws SQLException {
        try {
            return this.delegate.getType();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public int getConcurrency() throws SQLException {
        try {
            return this.delegate.getConcurrency();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean rowUpdated() throws SQLException {
        try {
            return this.delegate.rowUpdated();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean rowInserted() throws SQLException {
        try {
            return this.delegate.rowInserted();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public boolean rowDeleted() throws SQLException {
        try {
            return this.delegate.rowDeleted();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNull(int i) throws SQLException {
        try {
            this.delegate.updateNull(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBoolean(int i, boolean z) throws SQLException {
        try {
            this.delegate.updateBoolean(i, z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateByte(int i, byte b) throws SQLException {
        try {
            this.delegate.updateByte(i, b);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateShort(int i, short s) throws SQLException {
        try {
            this.delegate.updateShort(i, s);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateInt(int i, int i2) throws SQLException {
        try {
            this.delegate.updateInt(i, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateLong(int i, long j) throws SQLException {
        try {
            this.delegate.updateLong(i, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateFloat(int i, float f) throws SQLException {
        try {
            this.delegate.updateFloat(i, f);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateDouble(int i, double d) throws SQLException {
        try {
            this.delegate.updateDouble(i, d);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBigDecimal(int i, BigDecimal bigDecimal) throws SQLException {
        try {
            this.delegate.updateBigDecimal(i, bigDecimal);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateString(int i, String str) throws SQLException {
        try {
            this.delegate.updateString(i, str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBytes(int i, byte[] bArr) throws SQLException {
        try {
            this.delegate.updateBytes(i, bArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateDate(int i, Date date) throws SQLException {
        try {
            this.delegate.updateDate(i, date);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateTime(int i, Time time) throws SQLException {
        try {
            this.delegate.updateTime(i, time);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateTimestamp(int i, Timestamp timestamp) throws SQLException {
        try {
            this.delegate.updateTimestamp(i, timestamp);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateAsciiStream(int i, InputStream inputStream, int i2) throws SQLException {
        try {
            this.delegate.updateAsciiStream(i, inputStream, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBinaryStream(int i, InputStream inputStream, int i2) throws SQLException {
        try {
            this.delegate.updateBinaryStream(i, inputStream, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateCharacterStream(int i, Reader reader, int i2) throws SQLException {
        try {
            this.delegate.updateCharacterStream(i, reader, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateObject(int i, Object obj, int i2) throws SQLException {
        try {
            this.delegate.updateObject(i, obj, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateObject(int i, Object obj) throws SQLException {
        try {
            this.delegate.updateObject(i, obj);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNull(String str) throws SQLException {
        try {
            this.delegate.updateNull(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBoolean(String str, boolean z) throws SQLException {
        try {
            this.delegate.updateBoolean(str, z);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateByte(String str, byte b) throws SQLException {
        try {
            this.delegate.updateByte(str, b);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateShort(String str, short s) throws SQLException {
        try {
            this.delegate.updateShort(str, s);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateInt(String str, int i) throws SQLException {
        try {
            this.delegate.updateInt(str, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateLong(String str, long j) throws SQLException {
        try {
            this.delegate.updateLong(str, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateFloat(String str, float f) throws SQLException {
        try {
            this.delegate.updateFloat(str, f);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateDouble(String str, double d) throws SQLException {
        try {
            this.delegate.updateDouble(str, d);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBigDecimal(String str, BigDecimal bigDecimal) throws SQLException {
        try {
            this.delegate.updateBigDecimal(str, bigDecimal);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateString(String str, String str2) throws SQLException {
        try {
            this.delegate.updateString(str, str2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBytes(String str, byte[] bArr) throws SQLException {
        try {
            this.delegate.updateBytes(str, bArr);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateDate(String str, Date date) throws SQLException {
        try {
            this.delegate.updateDate(str, date);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateTime(String str, Time time) throws SQLException {
        try {
            this.delegate.updateTime(str, time);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateTimestamp(String str, Timestamp timestamp) throws SQLException {
        try {
            this.delegate.updateTimestamp(str, timestamp);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateAsciiStream(String str, InputStream inputStream, int i) throws SQLException {
        try {
            this.delegate.updateAsciiStream(str, inputStream, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBinaryStream(String str, InputStream inputStream, int i) throws SQLException {
        try {
            this.delegate.updateBinaryStream(str, inputStream, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateCharacterStream(String str, Reader reader, int i) throws SQLException {
        try {
            this.delegate.updateCharacterStream(str, reader, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateObject(String str, Object obj, int i) throws SQLException {
        try {
            this.delegate.updateObject(str, obj, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateObject(String str, Object obj) throws SQLException {
        try {
            this.delegate.updateObject(str, obj);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void insertRow() throws SQLException {
        try {
            super.insertRow();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateRow() throws SQLException {
        try {
            super.updateRow();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void deleteRow() throws SQLException {
        try {
            super.deleteRow();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void refreshRow() throws SQLException {
        try {
            this.delegate.refreshRow();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void cancelRowUpdates() throws SQLException {
        try {
            this.delegate.cancelRowUpdates();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void moveToInsertRow() throws SQLException {
        try {
            this.delegate.moveToInsertRow();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void moveToCurrentRow() throws SQLException {
        try {
            this.delegate.moveToCurrentRow();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(int i, Map map) throws SQLException {
        try {
            return this.delegate.getObject(i, (Map<String, Class<?>>) map);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Ref getRef(int i) throws SQLException {
        try {
            return this.delegate.getRef(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Blob getBlob(int i) throws SQLException {
        try {
            return this.delegate.getBlob(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Clob getClob(int i) throws SQLException {
        try {
            return this.delegate.getClob(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Array getArray(int i) throws SQLException {
        try {
            return this.delegate.getArray(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Object getObject(String str, Map map) throws SQLException {
        try {
            return this.delegate.getObject(str, (Map<String, Class<?>>) map);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Ref getRef(String str) throws SQLException {
        try {
            return this.delegate.getRef(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Blob getBlob(String str) throws SQLException {
        try {
            return this.delegate.getBlob(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Clob getClob(String str) throws SQLException {
        try {
            return this.delegate.getClob(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Array getArray(String str) throws SQLException {
        try {
            return this.delegate.getArray(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(int i, Calendar calendar) throws SQLException {
        try {
            return this.delegate.getDate(i, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Date getDate(String str, Calendar calendar) throws SQLException {
        try {
            return this.delegate.getDate(str, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(int i, Calendar calendar) throws SQLException {
        try {
            return this.delegate.getTime(i, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Time getTime(String str, Calendar calendar) throws SQLException {
        try {
            return this.delegate.getTime(str, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(int i, Calendar calendar) throws SQLException {
        try {
            return this.delegate.getTimestamp(i, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Timestamp getTimestamp(String str, Calendar calendar) throws SQLException {
        try {
            return this.delegate.getTimestamp(str, calendar);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public URL getURL(int i) throws SQLException {
        try {
            return this.delegate.getURL(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public URL getURL(String str) throws SQLException {
        try {
            return this.delegate.getURL(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateRef(int i, Ref ref) throws SQLException {
        try {
            this.delegate.updateRef(i, ref);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateRef(String str, Ref ref) throws SQLException {
        try {
            this.delegate.updateRef(str, ref);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBlob(int i, Blob blob) throws SQLException {
        try {
            this.delegate.updateBlob(i, blob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBlob(String str, Blob blob) throws SQLException {
        try {
            this.delegate.updateBlob(str, blob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateClob(int i, Clob clob) throws SQLException {
        try {
            this.delegate.updateClob(i, clob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateClob(String str, Clob clob) throws SQLException {
        try {
            this.delegate.updateClob(str, clob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateArray(int i, Array array) throws SQLException {
        try {
            this.delegate.updateArray(i, array);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateArray(String str, Array array) throws SQLException {
        try {
            this.delegate.updateArray(str, array);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public RowId getRowId(int i) throws SQLException {
        try {
            return this.delegate.getRowId(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public RowId getRowId(String str) throws SQLException {
        try {
            return this.delegate.getRowId(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateRowId(int i, RowId rowId) throws SQLException {
        try {
            this.delegate.updateRowId(i, rowId);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateRowId(String str, RowId rowId) throws SQLException {
        try {
            this.delegate.updateRowId(str, rowId);
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
    public boolean isClosed() throws SQLException {
        try {
            return this.delegate.isClosed();
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNString(int i, String str) throws SQLException {
        try {
            this.delegate.updateNString(i, str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNString(String str, String str2) throws SQLException {
        try {
            this.delegate.updateNString(str, str2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNClob(int i, NClob nClob) throws SQLException {
        try {
            this.delegate.updateNClob(i, nClob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNClob(String str, NClob nClob) throws SQLException {
        try {
            this.delegate.updateNClob(str, nClob);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public NClob getNClob(int i) throws SQLException {
        try {
            return this.delegate.getNClob(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public NClob getNClob(String str) throws SQLException {
        try {
            return this.delegate.getNClob(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public SQLXML getSQLXML(int i) throws SQLException {
        try {
            return this.delegate.getSQLXML(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public SQLXML getSQLXML(String str) throws SQLException {
        try {
            return this.delegate.getSQLXML(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateSQLXML(int i, SQLXML sqlxml) throws SQLException {
        try {
            this.delegate.updateSQLXML(i, sqlxml);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateSQLXML(String str, SQLXML sqlxml) throws SQLException {
        try {
            this.delegate.updateSQLXML(str, sqlxml);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getNString(int i) throws SQLException {
        try {
            return this.delegate.getNString(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public String getNString(String str) throws SQLException {
        try {
            return this.delegate.getNString(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getNCharacterStream(int i) throws SQLException {
        try {
            return this.delegate.getNCharacterStream(i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public Reader getNCharacterStream(String str) throws SQLException {
        try {
            return this.delegate.getNCharacterStream(str);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNCharacterStream(int i, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateNCharacterStream(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNCharacterStream(String str, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateNCharacterStream(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateAsciiStream(int i, InputStream inputStream, long j) throws SQLException {
        try {
            this.delegate.updateAsciiStream(i, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBinaryStream(int i, InputStream inputStream, long j) throws SQLException {
        try {
            this.delegate.updateBinaryStream(i, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateCharacterStream(int i, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateCharacterStream(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateAsciiStream(String str, InputStream inputStream, long j) throws SQLException {
        try {
            this.delegate.updateAsciiStream(str, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBinaryStream(String str, InputStream inputStream, long j) throws SQLException {
        try {
            this.delegate.updateBinaryStream(str, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateCharacterStream(String str, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateCharacterStream(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBlob(int i, InputStream inputStream, long j) throws SQLException {
        try {
            this.delegate.updateBlob(i, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBlob(String str, InputStream inputStream, long j) throws SQLException {
        try {
            this.delegate.updateBlob(str, inputStream, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateClob(int i, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateClob(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateClob(String str, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateClob(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNClob(int i, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateNClob(i, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNClob(String str, Reader reader, long j) throws SQLException {
        try {
            this.delegate.updateNClob(str, reader, j);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNCharacterStream(int i, Reader reader) throws SQLException {
        try {
            this.delegate.updateNCharacterStream(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNCharacterStream(String str, Reader reader) throws SQLException {
        try {
            this.delegate.updateNCharacterStream(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateAsciiStream(int i, InputStream inputStream) throws SQLException {
        try {
            this.delegate.updateAsciiStream(i, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBinaryStream(int i, InputStream inputStream) throws SQLException {
        try {
            this.delegate.updateBinaryStream(i, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateCharacterStream(int i, Reader reader) throws SQLException {
        try {
            this.delegate.updateCharacterStream(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateAsciiStream(String str, InputStream inputStream) throws SQLException {
        try {
            this.delegate.updateAsciiStream(str, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBinaryStream(String str, InputStream inputStream) throws SQLException {
        try {
            this.delegate.updateBinaryStream(str, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateCharacterStream(String str, Reader reader) throws SQLException {
        try {
            this.delegate.updateCharacterStream(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBlob(int i, InputStream inputStream) throws SQLException {
        try {
            this.delegate.updateBlob(i, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateBlob(String str, InputStream inputStream) throws SQLException {
        try {
            this.delegate.updateBlob(str, inputStream);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateClob(int i, Reader reader) throws SQLException {
        try {
            this.delegate.updateClob(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateClob(String str, Reader reader) throws SQLException {
        try {
            this.delegate.updateClob(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNClob(int i, Reader reader) throws SQLException {
        try {
            this.delegate.updateNClob(i, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    @Override
    public void updateNClob(String str, Reader reader) throws SQLException {
        try {
            this.delegate.updateNClob(str, reader);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public Object getObject(int i, Class cls) throws SQLException {
        try {
            return this.delegate.getObject(i, cls);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public Object getObject(String str, Class cls) throws SQLException {
        try {
            return this.delegate.getObject(str, cls);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void updateObject(int i, Object obj, SQLType sQLType, int i2) throws SQLException {
        try {
            this.delegate.updateObject(i, obj, sQLType, i2);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void updateObject(String str, Object obj, SQLType sQLType, int i) throws SQLException {
        try {
            this.delegate.updateObject(str, obj, sQLType, i);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void updateObject(int i, Object obj, SQLType sQLType) throws SQLException {
        try {
            this.delegate.updateObject(i, obj, sQLType);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public void updateObject(String str, Object obj, SQLType sQLType) throws SQLException {
        try {
            this.delegate.updateObject(str, obj, sQLType);
        } catch (SQLException e) {
            throw checkException(e);
        }
    }

    public HikariProxyResultSet(ProxyConnection proxyConnection, ProxyStatement proxyStatement, ResultSet resultSet) {
        super(proxyConnection, proxyStatement, resultSet);
    }
}
