package com.kammoun.utils.jackson.databind.introspect;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class AnnotatedMethodMap implements Iterable<AnnotatedMethod> {
    protected Map<MemberKey, AnnotatedMethod> _methods;

    public AnnotatedMethodMap() {
    }

    public AnnotatedMethodMap(Map<MemberKey, AnnotatedMethod> map) {
        this._methods = map;
    }

    public int size() {
        if (this._methods == null) {
            return 0;
        }
        return this._methods.size();
    }

    public AnnotatedMethod find(String str, Class<?>[] clsArr) {
        if (this._methods == null) {
            return null;
        }
        return this._methods.get(new MemberKey(str, clsArr));
    }

    public AnnotatedMethod find(Method method) {
        if (this._methods == null) {
            return null;
        }
        return this._methods.get(new MemberKey(method));
    }

    @Override
    public Iterator<AnnotatedMethod> iterator() {
        return this._methods == null ? Collections.emptyIterator() : this._methods.values().iterator();
    }
}
