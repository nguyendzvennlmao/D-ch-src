package com.kammoun.utils.jackson.databind.jsontype.impl;

import com.kammoun.utils.jackson.databind.DatabindContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.jsontype.TypeIdResolver;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import java.io.IOException;

public abstract class TypeIdResolverBase implements TypeIdResolver {
    protected final TypeFactory _typeFactory;
    protected final JavaType _baseType;

    protected TypeIdResolverBase() {
        this(null, null);
    }

    public TypeIdResolverBase(JavaType javaType, TypeFactory typeFactory) {
        this._baseType = javaType;
        this._typeFactory = typeFactory;
    }

    @Override
    public void init(JavaType javaType) {
    }

    @Override
    public String idFromBaseType() {
        return idFromValueAndType(null, this._baseType.getRawClass());
    }

    @Override
    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        throw new IllegalStateException("Sub-class " + getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }

    @Override
    public String getDescForKnownTypeIds() {
        return null;
    }
}
