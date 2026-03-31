package com.kammoun.utils.hikari.pool;

import java.sql.CallableStatement;

public abstract class ProxyCallableStatement extends ProxyPreparedStatement implements CallableStatement {
    public ProxyCallableStatement(ProxyConnection proxyConnection, CallableStatement callableStatement) {
        super(proxyConnection, callableStatement);
    }
}
