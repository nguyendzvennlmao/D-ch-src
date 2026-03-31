package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.core.type.ResolvedType;
import com.kammoun.utils.jackson.databind.type.TypeBindings;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;

public abstract class JavaType extends ResolvedType implements Serializable, Type {
    private static final long serialVersionUID = 1;
    protected final Class<?> _class;
    protected final int _hash;
    protected final Object _valueHandler;
    protected final Object _typeHandler;
    protected final boolean _asStatic;

    public JavaType(Class<?> cls, int i, Object obj, Object obj2, boolean z) {
        this._class = cls;
        this._hash = (31 * i) + cls.hashCode();
        this._valueHandler = obj;
        this._typeHandler = obj2;
        this._asStatic = z;
    }

    public JavaType(JavaType javaType) {
        this._class = javaType._class;
        this._hash = javaType._hash;
        this._valueHandler = javaType._valueHandler;
        this._typeHandler = javaType._typeHandler;
        this._asStatic = javaType._asStatic;
    }

    public abstract JavaType withContentType(JavaType javaType);

    public abstract JavaType withStaticTyping();

    public abstract JavaType withTypeHandler(Object obj);

    public abstract JavaType withContentTypeHandler(Object obj);

    public abstract JavaType withValueHandler(Object obj);

    public abstract JavaType withContentValueHandler(Object obj);

    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType javaType2 = this;
        Object typeHandler = javaType.getTypeHandler();
        if (typeHandler != this._typeHandler) {
            javaType2 = javaType2.withTypeHandler(typeHandler);
        }
        Object valueHandler = javaType.getValueHandler();
        if (valueHandler != this._valueHandler) {
            javaType2 = javaType2.withValueHandler(valueHandler);
        }
        return javaType2;
    }

    public abstract JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr);

    @Deprecated
    public JavaType forcedNarrowBy(Class<?> cls) {
        return cls == this._class ? this : _narrow(cls);
    }

    @Deprecated
    protected JavaType _narrow(Class<?> cls) {
        return this;
    }

    @Override
    public final Class<?> getRawClass() {
        return this._class;
    }

    @Override
    public final boolean hasRawClass(Class<?> cls) {
        return this._class == cls;
    }

    public boolean hasContentType() {
        return true;
    }

    public final boolean isTypeOrSubTypeOf(Class<?> cls) {
        return this._class == cls || cls.isAssignableFrom(this._class);
    }

    public final boolean isTypeOrSuperTypeOf(Class<?> cls) {
        return this._class == cls || this._class.isAssignableFrom(cls);
    }

    @Override
    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    @Override
    public boolean isConcrete() {
        if ((this._class.getModifiers() & 1536) == 0) {
            return true;
        }
        return this._class.isPrimitive();
    }

    @Override
    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    @Override
    public boolean isArrayType() {
        return false;
    }

    @Override
    public final boolean isEnumType() {
        return ClassUtil.isEnumType(this._class);
    }

    public final boolean isEnumImplType() {
        return ClassUtil.isEnumType(this._class) && this._class != Enum.class;
    }

    public final boolean isRecordType() {
        return ClassUtil.isRecordType(this._class);
    }

    public boolean isIterationType() {
        return false;
    }

    @Override
    public final boolean isInterface() {
        return this._class.isInterface();
    }

    @Override
    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    @Override
    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    @Override
    public abstract boolean isContainerType();

    @Override
    public boolean isCollectionLikeType() {
        return false;
    }

    @Override
    public boolean isMapLikeType() {
        return false;
    }

    public final boolean isJavaLangObject() {
        return this._class == Object.class;
    }

    public final boolean useStaticType() {
        return this._asStatic;
    }

    @Override
    public boolean hasGenericTypes() {
        return containedTypeCount() > 0;
    }

    @Override
    public JavaType getKeyType() {
        return null;
    }

    @Override
    public JavaType getContentType() {
        return null;
    }

    @Override
    public JavaType getReferencedType() {
        return null;
    }

    @Override
    public abstract int containedTypeCount();

    @Override
    public abstract JavaType containedType(int i);

    @Override
    @Deprecated
    public abstract String containedTypeName(int i);

    @Override
    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    public JavaType containedTypeOrUnknown(int i) {
        JavaType containedType = containedType(i);
        return containedType == null ? TypeFactory.unknownType() : containedType;
    }

    public abstract TypeBindings getBindings();

    public abstract JavaType findSuperType(Class<?> cls);

    public abstract JavaType getSuperClass();

    public abstract List<JavaType> getInterfaces();

    public abstract JavaType[] findTypeParameters(Class<?> cls);

    public <T> T getValueHandler() {
        return (T) this._valueHandler;
    }

    public <T> T getTypeHandler() {
        return (T) this._typeHandler;
    }

    public Object getContentValueHandler() {
        return null;
    }

    public Object getContentTypeHandler() {
        return null;
    }

    public boolean hasValueHandler() {
        return this._valueHandler != null;
    }

    public boolean hasHandlers() {
        return (this._typeHandler == null && this._valueHandler == null) ? false : true;
    }

    public String getGenericSignature() {
        StringBuilder sb = new StringBuilder(40);
        getGenericSignature(sb);
        return sb.toString();
    }

    public abstract StringBuilder getGenericSignature(StringBuilder sb);

    public String getErasedSignature() {
        StringBuilder sb = new StringBuilder(40);
        getErasedSignature(sb);
        return sb.toString();
    }

    public abstract StringBuilder getErasedSignature(StringBuilder sb);

    public abstract String toString();

    public abstract boolean equals(Object obj);

    public int hashCode() {
        return this._hash;
    }
}
