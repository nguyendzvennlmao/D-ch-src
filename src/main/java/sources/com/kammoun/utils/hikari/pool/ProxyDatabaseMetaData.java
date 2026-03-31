package com.kammoun.utils.hikari.pool;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ProxyDatabaseMetaData implements DatabaseMetaData {
    protected final ProxyConnection connection;
    protected final DatabaseMetaData delegate;

    public ProxyDatabaseMetaData(ProxyConnection proxyConnection, DatabaseMetaData databaseMetaData) {
        this.connection = proxyConnection;
        this.delegate = databaseMetaData;
    }

    public final SQLException checkException(SQLException sQLException) {
        return this.connection.checkException(sQLException);
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + System.identityHashCode(this) + " wrapping " + this.delegate.toString();
    }

    @Override
    public final Connection getConnection() {
        return this.connection;
    }

    @Override
    public ResultSet getProcedures(String str, String str2, String str3) throws SQLException {
        ResultSet procedures = this.delegate.getProcedures(str, str2, str3);
        Statement statement = procedures.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, procedures);
    }

    @Override
    public ResultSet getProcedureColumns(String str, String str2, String str3, String str4) throws SQLException {
        ResultSet procedureColumns = this.delegate.getProcedureColumns(str, str2, str3, str4);
        Statement statement = procedureColumns.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, procedureColumns);
    }

    @Override
    public ResultSet getTables(String str, String str2, String str3, String[] strArr) throws SQLException {
        ResultSet tables = this.delegate.getTables(str, str2, str3, strArr);
        Statement statement = tables.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, tables);
    }

    @Override
    public ResultSet getSchemas() throws SQLException {
        ResultSet schemas = this.delegate.getSchemas();
        Statement statement = schemas.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, schemas);
    }

    @Override
    public ResultSet getCatalogs() throws SQLException {
        ResultSet catalogs = this.delegate.getCatalogs();
        Statement statement = catalogs.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, catalogs);
    }

    @Override
    public ResultSet getTableTypes() throws SQLException {
        ResultSet tableTypes = this.delegate.getTableTypes();
        Statement statement = tableTypes.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, tableTypes);
    }

    @Override
    public ResultSet getColumns(String str, String str2, String str3, String str4) throws SQLException {
        ResultSet columns = this.delegate.getColumns(str, str2, str3, str4);
        Statement statement = columns.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, columns);
    }

    @Override
    public ResultSet getColumnPrivileges(String str, String str2, String str3, String str4) throws SQLException {
        ResultSet columnPrivileges = this.delegate.getColumnPrivileges(str, str2, str3, str4);
        Statement statement = columnPrivileges.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, columnPrivileges);
    }

    @Override
    public ResultSet getTablePrivileges(String str, String str2, String str3) throws SQLException {
        ResultSet tablePrivileges = this.delegate.getTablePrivileges(str, str2, str3);
        Statement statement = tablePrivileges.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, tablePrivileges);
    }

    @Override
    public ResultSet getBestRowIdentifier(String str, String str2, String str3, int i, boolean z) throws SQLException {
        ResultSet bestRowIdentifier = this.delegate.getBestRowIdentifier(str, str2, str3, i, z);
        Statement statement = bestRowIdentifier.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, bestRowIdentifier);
    }

    @Override
    public ResultSet getVersionColumns(String str, String str2, String str3) throws SQLException {
        ResultSet versionColumns = this.delegate.getVersionColumns(str, str2, str3);
        Statement statement = versionColumns.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, versionColumns);
    }

    @Override
    public ResultSet getPrimaryKeys(String str, String str2, String str3) throws SQLException {
        ResultSet primaryKeys = this.delegate.getPrimaryKeys(str, str2, str3);
        Statement statement = primaryKeys.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, primaryKeys);
    }

    @Override
    public ResultSet getImportedKeys(String str, String str2, String str3) throws SQLException {
        ResultSet importedKeys = this.delegate.getImportedKeys(str, str2, str3);
        Statement statement = importedKeys.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, importedKeys);
    }

    @Override
    public ResultSet getExportedKeys(String str, String str2, String str3) throws SQLException {
        ResultSet exportedKeys = this.delegate.getExportedKeys(str, str2, str3);
        Statement statement = exportedKeys.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, exportedKeys);
    }

    @Override
    public ResultSet getCrossReference(String str, String str2, String str3, String str4, String str5, String str6) throws SQLException {
        ResultSet crossReference = this.delegate.getCrossReference(str, str2, str3, str4, str5, str6);
        Statement statement = crossReference.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, crossReference);
    }

    @Override
    public ResultSet getTypeInfo() throws SQLException {
        ResultSet typeInfo = this.delegate.getTypeInfo();
        Statement statement = typeInfo.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, typeInfo);
    }

    @Override
    public ResultSet getIndexInfo(String str, String str2, String str3, boolean z, boolean z2) throws SQLException {
        ResultSet indexInfo = this.delegate.getIndexInfo(str, str2, str3, z, z2);
        Statement statement = indexInfo.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, indexInfo);
    }

    @Override
    public ResultSet getUDTs(String str, String str2, String str3, int[] iArr) throws SQLException {
        ResultSet uDTs = this.delegate.getUDTs(str, str2, str3, iArr);
        Statement statement = uDTs.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, uDTs);
    }

    @Override
    public ResultSet getSuperTypes(String str, String str2, String str3) throws SQLException {
        ResultSet superTypes = this.delegate.getSuperTypes(str, str2, str3);
        Statement statement = superTypes.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, superTypes);
    }

    @Override
    public ResultSet getSuperTables(String str, String str2, String str3) throws SQLException {
        ResultSet superTables = this.delegate.getSuperTables(str, str2, str3);
        Statement statement = superTables.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, superTables);
    }

    @Override
    public ResultSet getAttributes(String str, String str2, String str3, String str4) throws SQLException {
        ResultSet attributes = this.delegate.getAttributes(str, str2, str3, str4);
        Statement statement = attributes.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, attributes);
    }

    @Override
    public ResultSet getSchemas(String str, String str2) throws SQLException {
        ResultSet schemas = this.delegate.getSchemas(str, str2);
        Statement statement = schemas.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, schemas);
    }

    @Override
    public ResultSet getClientInfoProperties() throws SQLException {
        ResultSet clientInfoProperties = this.delegate.getClientInfoProperties();
        Statement statement = clientInfoProperties.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, clientInfoProperties);
    }

    @Override
    public ResultSet getFunctions(String str, String str2, String str3) throws SQLException {
        ResultSet functions = this.delegate.getFunctions(str, str2, str3);
        Statement statement = functions.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, functions);
    }

    @Override
    public ResultSet getFunctionColumns(String str, String str2, String str3, String str4) throws SQLException {
        ResultSet functionColumns = this.delegate.getFunctionColumns(str, str2, str3, str4);
        Statement statement = functionColumns.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, functionColumns);
    }

    public ResultSet getPseudoColumns(String str, String str2, String str3, String str4) throws SQLException {
        ResultSet pseudoColumns = this.delegate.getPseudoColumns(str, str2, str3, str4);
        Statement statement = pseudoColumns.getStatement();
        if (statement != null) {
            statement = ProxyFactory.getProxyStatement(this.connection, statement);
        }
        return ProxyFactory.getProxyResultSet(this.connection, (ProxyStatement) statement, pseudoColumns);
    }

    @Override
    public final <T> T unwrap(Class<T> cls) throws SQLException {
        if (cls.isInstance(this.delegate)) {
            return (T) this.delegate;
        }
        if (this.delegate != null) {
            return (T) this.delegate.unwrap(cls);
        }
        throw new SQLException("Wrapped DatabaseMetaData is not an instance of " + cls);
    }
}
