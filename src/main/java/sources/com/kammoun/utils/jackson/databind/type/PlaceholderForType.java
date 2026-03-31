package com.kammoun.utils.jackson.databind.type;

import com.kammoun.utils.jackson.databind.JavaType;

public class PlaceholderForType extends IdentityEqualityType {
    private static final long serialVersionUID = 1;
    protected final int _ordinal;
    protected JavaType _actualType;

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), null, 1, null, null, false);
        this._ordinal = i;
    }

    public JavaType actualType() {
        return this._actualType;
    }

    public void actualType(JavaType javaType) {
        this._actualType = javaType;
    }

    @Override
    protected String buildCanonicalName() {
        return toString();
    }

    @Override
    public StringBuilder getGenericSignature(StringBuilder sb) {
        return getErasedSignature(sb);
    }

    @Override
    public StringBuilder getErasedSignature(StringBuilder sb) {
        sb.append('$').append(this._ordinal + 1);
        return sb;
    }

    @Override
    public JavaType withTypeHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    @Override
    public JavaType withContentTypeHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    @Override
    public JavaType withValueHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    @Override
    public JavaType withContentValueHandler(Object obj) {
        return (JavaType) _unsupported();
    }

    @Override
    public JavaType withContentType(JavaType javaType) {
        return (JavaType) _unsupported();
    }

    @Override
    public JavaType withStaticTyping() {
        return (JavaType) _unsupported();
    }

    @Override
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return (JavaType) _unsupported();
    }

    @Override
    public boolean isContainerType() {
        return false;
    }

    @Override
    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    private <T> T _unsupported() {
        throw new UnsupportedOperationException("Operation should not be attempted on " + getClass().getName());
    }
}
