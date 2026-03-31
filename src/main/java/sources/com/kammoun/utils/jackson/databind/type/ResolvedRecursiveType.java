package com.kammoun.utils.jackson.databind.type;

import com.kammoun.utils.jackson.databind.JavaType;

public class ResolvedRecursiveType extends IdentityEqualityType {
    private static final long serialVersionUID = 1;
    protected JavaType _referencedType;

    public ResolvedRecursiveType(Class<?> cls, TypeBindings typeBindings) {
        super(cls, typeBindings, null, null, 0, null, null, false);
    }

    public void setReference(JavaType javaType) {
        if (this._referencedType != null) {
            throw new IllegalStateException("Trying to re-set self reference; old value = " + this._referencedType + ", new = " + javaType);
        }
        this._referencedType = javaType;
    }

    @Override
    public JavaType getSuperClass() {
        return this._referencedType != null ? this._referencedType.getSuperClass() : super.getSuperClass();
    }

    public JavaType getSelfReferencedType() {
        return this._referencedType;
    }

    @Override
    public TypeBindings getBindings() {
        return this._referencedType != null ? this._referencedType.getBindings() : super.getBindings();
    }

    @Override
    public StringBuilder getGenericSignature(StringBuilder sb) {
        return this._referencedType != null ? this._referencedType.getErasedSignature(sb) : sb.append("?");
    }

    @Override
    public StringBuilder getErasedSignature(StringBuilder sb) {
        return this._referencedType != null ? this._referencedType.getErasedSignature(sb) : sb;
    }

    @Override
    public JavaType withContentType(JavaType javaType) {
        return this;
    }

    @Override
    public JavaType withTypeHandler(Object obj) {
        return this;
    }

    @Override
    public JavaType withContentTypeHandler(Object obj) {
        return this;
    }

    @Override
    public JavaType withValueHandler(Object obj) {
        return this;
    }

    @Override
    public JavaType withContentValueHandler(Object obj) {
        return this;
    }

    @Override
    public JavaType withStaticTyping() {
        return this;
    }

    @Override
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override
    public boolean isContainerType() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder append = new StringBuilder(40).append("[recursive type; ");
        if (this._referencedType == null) {
            append.append("UNRESOLVED");
        } else {
            append.append(this._referencedType.getRawClass().getName());
        }
        return append.toString();
    }
}
