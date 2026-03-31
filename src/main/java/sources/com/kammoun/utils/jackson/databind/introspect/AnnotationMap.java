package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

public final class AnnotationMap implements Annotations {
    protected HashMap<Class<?>, Annotation> _annotations;

    public AnnotationMap() {
    }

    public static AnnotationMap of(Class<?> cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new AnnotationMap(hashMap);
    }

    public AnnotationMap(HashMap<Class<?>, Annotation> hashMap) {
        this._annotations = hashMap;
    }

    @Override
    public <A extends Annotation> A get(Class<A> cls) {
        if (this._annotations == null) {
            return null;
        }
        return (A) this._annotations.get(cls);
    }

    @Override
    public boolean has(Class<?> cls) {
        if (this._annotations == null) {
            return false;
        }
        return this._annotations.containsKey(cls);
    }

    @Override
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this._annotations == null) {
            return false;
        }
        for (Class<? extends Annotation> cls : clsArr) {
            if (this._annotations.containsKey(cls)) {
                return true;
            }
        }
        return false;
    }

    public Iterable<Annotation> annotations() {
        return (this._annotations == null || this._annotations.size() == 0) ? Collections.emptyList() : this._annotations.values();
    }

    public static AnnotationMap merge(AnnotationMap annotationMap, AnnotationMap annotationMap2) {
        if (annotationMap == null || annotationMap._annotations == null || annotationMap._annotations.isEmpty()) {
            return annotationMap2;
        }
        if (annotationMap2 == null || annotationMap2._annotations == null || annotationMap2._annotations.isEmpty()) {
            return annotationMap;
        }
        HashMap hashMap = new HashMap();
        for (Annotation annotation : annotationMap2._annotations.values()) {
            hashMap.put(annotation.annotationType(), annotation);
        }
        for (Annotation annotation2 : annotationMap._annotations.values()) {
            hashMap.put(annotation2.annotationType(), annotation2);
        }
        return new AnnotationMap(hashMap);
    }

    @Override
    public int size() {
        if (this._annotations == null) {
            return 0;
        }
        return this._annotations.size();
    }

    public boolean addIfNotPresent(Annotation annotation) {
        if (this._annotations != null && this._annotations.containsKey(annotation.annotationType())) {
            return false;
        }
        _add(annotation);
        return true;
    }

    public boolean add(Annotation annotation) {
        return _add(annotation);
    }

    public String toString() {
        return this._annotations == null ? "[null]" : this._annotations.toString();
    }

    protected final boolean _add(Annotation annotation) {
        if (this._annotations == null) {
            this._annotations = new HashMap<>();
        }
        Annotation put = this._annotations.put(annotation.annotationType(), annotation);
        return put == null || !put.equals(annotation);
    }
}
