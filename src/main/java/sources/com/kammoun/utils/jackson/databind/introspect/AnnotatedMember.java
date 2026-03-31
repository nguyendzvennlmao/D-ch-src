package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

public abstract class AnnotatedMember extends Annotated implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient TypeResolutionContext _typeContext;
    protected final transient AnnotationMap _annotations;

    public AnnotatedMember(TypeResolutionContext typeResolutionContext, AnnotationMap annotationMap) {
        this._typeContext = typeResolutionContext;
        this._annotations = annotationMap;
    }

    public AnnotatedMember(AnnotatedMember annotatedMember) {
        this._typeContext = annotatedMember._typeContext;
        this._annotations = annotatedMember._annotations;
    }

    public abstract Annotated withAnnotations(AnnotationMap annotationMap);

    public abstract Class<?> getDeclaringClass();

    public abstract Member getMember();

    public String getFullName() {
        return getDeclaringClass().getName() + "#" + getName();
    }

    @Deprecated
    public TypeResolutionContext getTypeContext() {
        return this._typeContext;
    }

    @Override
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        if (this._annotations == null) {
            return null;
        }
        return (A) this._annotations.get(cls);
    }

    @Override
    public final boolean hasAnnotation(Class<?> cls) {
        if (this._annotations == null) {
            return false;
        }
        return this._annotations.has(cls);
    }

    @Override
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this._annotations == null) {
            return false;
        }
        return this._annotations.hasOneOf(clsArr);
    }

    @Override
    @Deprecated
    public Iterable<Annotation> annotations() {
        return this._annotations == null ? Collections.emptyList() : this._annotations.annotations();
    }

    public AnnotationMap getAllAnnotations() {
        return this._annotations;
    }

    public final void fixAccess(boolean z) {
        Member member = getMember();
        if (member != null) {
            ClassUtil.checkAndFixAccess(member, z);
        }
    }

    public abstract void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException;

    public abstract Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException;
}
