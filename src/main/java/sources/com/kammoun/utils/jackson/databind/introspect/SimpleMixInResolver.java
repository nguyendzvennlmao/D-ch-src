package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.introspect.ClassIntrospector;
import com.kammoun.utils.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SimpleMixInResolver implements ClassIntrospector.MixInResolver, Serializable {
    private static final long serialVersionUID = 1;
    protected final ClassIntrospector.MixInResolver _overrides;
    protected Map<ClassKey, Class<?>> _localMixIns;

    public SimpleMixInResolver(ClassIntrospector.MixInResolver mixInResolver) {
        this._overrides = mixInResolver;
    }

    protected SimpleMixInResolver(ClassIntrospector.MixInResolver mixInResolver, Map<ClassKey, Class<?>> map) {
        this._overrides = mixInResolver;
        this._localMixIns = map;
    }

    public SimpleMixInResolver withOverrides(ClassIntrospector.MixInResolver mixInResolver) {
        return new SimpleMixInResolver(mixInResolver, this._localMixIns);
    }

    public SimpleMixInResolver withoutLocalDefinitions() {
        return new SimpleMixInResolver(this._overrides, null);
    }

    public void setLocalDefinitions(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this._localMixIns = null;
            return;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
            hashMap.put(new ClassKey(entry.getKey()), entry.getValue());
        }
        this._localMixIns = hashMap;
    }

    public void addLocalDefinition(Class<?> cls, Class<?> cls2) {
        if (this._localMixIns == null) {
            this._localMixIns = new HashMap();
        }
        this._localMixIns.put(new ClassKey(cls), cls2);
    }

    @Override
    public SimpleMixInResolver copy() {
        return new SimpleMixInResolver(this._overrides == null ? null : this._overrides.copy(), this._localMixIns == null ? null : new HashMap(this._localMixIns));
    }

    @Override
    public Class<?> findMixInClassFor(Class<?> cls) {
        Class<?> findMixInClassFor = this._overrides == null ? null : this._overrides.findMixInClassFor(cls);
        if (findMixInClassFor == null && this._localMixIns != null) {
            findMixInClassFor = this._localMixIns.get(new ClassKey(cls));
        }
        return findMixInClassFor;
    }

    public int localSize() {
        if (this._localMixIns == null) {
            return 0;
        }
        return this._localMixIns.size();
    }

    public boolean hasMixIns() {
        if (this._localMixIns != null) {
            return true;
        }
        if (this._overrides == null) {
            return false;
        }
        if (this._overrides instanceof SimpleMixInResolver) {
            return ((SimpleMixInResolver) this._overrides).hasMixIns();
        }
        return true;
    }
}
