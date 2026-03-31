package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public class VirtualAnnotatedMember extends AnnotatedMember implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _declaringClass;
    protected final JavaType _type;
    protected final String _name;

    public VirtualAnnotatedMember(TypeResolutionContext typeResolutionContext, Class<?> cls, String str, JavaType javaType) {
        super(typeResolutionContext, null);
        this._declaringClass = cls;
        this._type = javaType;
        this._name = str;
    }

    @Override
    public Annotated withAnnotations(AnnotationMap annotationMap) {
        return this;
    }

    @Override
    public Field getAnnotated() {
        return null;
    }

    @Override
    public int getModifiers() {
        return 0;
    }

    @Override
    public String getName() {
        return this._name;
    }

    @Override
    public Class<?> getRawType() {
        return this._type.getRawClass();
    }

    @Override
    public JavaType getType() {
        return this._type;
    }

    @Override
    public Class<?> getDeclaringClass() {
        return this._declaringClass;
    }

    @Override
    public Member getMember() {
        return null;
    }

    @Override
    public void setValue(Object obj, Object obj2) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot set virtual property '" + this._name + "'");
    }

    @Override
    public Object getValue(Object obj) throws IllegalArgumentException {
        throw new IllegalArgumentException("Cannot get virtual property '" + this._name + "'");
    }

    public int getAnnotationCount() {
        return 0;
    }

    @Override
    public int hashCode() {
        return this._name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ClassUtil.hasClass(obj, getClass())) {
            return false;
        }
        VirtualAnnotatedMember virtualAnnotatedMember = (VirtualAnnotatedMember) obj;
        return virtualAnnotatedMember._declaringClass == this._declaringClass && virtualAnnotatedMember._name.equals(this._name);
    }

    @Override
    public String toString() {
        return "[virtual " + getFullName() + "]";
    }
}
