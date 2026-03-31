package com.kammoun.utils.jackson.databind.type;

import com.kammoun.utils.jackson.databind.JavaType;
import java.util.Objects;

public class IterationType extends SimpleType {
    private static final long serialVersionUID = 1;
    protected final JavaType _iteratedType;

    protected IterationType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, Objects.hashCode(javaType2), obj, obj2, z);
        this._iteratedType = javaType2;
    }

    protected IterationType(TypeBase typeBase, JavaType javaType) {
        super(typeBase);
        this._iteratedType = javaType;
    }

    public static IterationType upgradeFrom(JavaType javaType, JavaType javaType2) {
        Objects.requireNonNull(javaType2);
        if (javaType instanceof TypeBase) {
            return new IterationType((TypeBase) javaType, javaType2);
        }
        throw new IllegalArgumentException("Cannot upgrade from an instance of " + javaType.getClass());
    }

    public static IterationType construct(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        return new IterationType(cls, typeBindings, javaType, javaTypeArr, javaType2, null, null, false);
    }

    @Override
    public JavaType withContentType(JavaType javaType) {
        return this._iteratedType == javaType ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override
    public IterationType withTypeHandler(Object obj) {
        return obj == this._typeHandler ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType, this._valueHandler, obj, this._asStatic);
    }

    @Override
    public IterationType withContentTypeHandler(Object obj) {
        return obj == this._iteratedType.getTypeHandler() ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override
    public IterationType withValueHandler(Object obj) {
        return obj == this._valueHandler ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType, obj, this._typeHandler, this._asStatic);
    }

    @Override
    public IterationType withContentValueHandler(Object obj) {
        return obj == this._iteratedType.getValueHandler() ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override
    public IterationType withStaticTyping() {
        return this._asStatic ? this : new IterationType(this._class, this._bindings, this._superClass, this._superInterfaces, this._iteratedType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
    }

    @Override
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new IterationType(cls, this._bindings, javaType, javaTypeArr, this._iteratedType, this._valueHandler, this._typeHandler, this._asStatic);
    }

    @Override
    protected String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this._iteratedType != null && _hasNTypeParameters(1)) {
            sb.append('<');
            sb.append(this._iteratedType.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    @Override
    public JavaType getContentType() {
        return this._iteratedType;
    }

    @Override
    public boolean hasContentType() {
        return true;
    }

    @Override
    public boolean isIterationType() {
        return true;
    }

    @Override
    public StringBuilder getErasedSignature(StringBuilder sb) {
        return _classSignature(this._class, sb, true);
    }

    @Override
    public StringBuilder getGenericSignature(StringBuilder sb) {
        _classSignature(this._class, sb, false);
        sb.append('<');
        StringBuilder genericSignature = this._iteratedType.getGenericSignature(sb);
        genericSignature.append(">;");
        return genericSignature;
    }
}
