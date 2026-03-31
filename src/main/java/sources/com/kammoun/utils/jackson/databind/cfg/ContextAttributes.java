package com.kammoun.utils.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class ContextAttributes {

    public static class Impl extends ContextAttributes implements Serializable {
        private static final long serialVersionUID = 1;
        protected static final Impl EMPTY = new Impl(Collections.emptyMap());
        protected static final Object NULL_SURROGATE = new Object();
        protected final Map<?, ?> _shared;
        protected transient Map<Object, Object> _nonShared;

        protected Impl(Map<?, ?> map) {
            this._shared = map;
            this._nonShared = null;
        }

        protected Impl(Map<?, ?> map, Map<Object, Object> map2) {
            this._shared = map;
            this._nonShared = map2;
        }

        public static ContextAttributes getEmpty() {
            return EMPTY;
        }

        @Override
        public ContextAttributes withSharedAttribute(Object obj, Object obj2) {
            Map<Object, Object> hashMap = this == EMPTY ? new HashMap(8) : _copy(this._shared);
            hashMap.put(obj, obj2);
            return new Impl(hashMap);
        }

        @Override
        public ContextAttributes withSharedAttributes(Map<?, ?> map) {
            return new Impl(map);
        }

        @Override
        public ContextAttributes withoutSharedAttribute(Object obj) {
            if (!this._shared.isEmpty() && this._shared.containsKey(obj)) {
                if (this._shared.size() == 1) {
                    return EMPTY;
                }
                Map<Object, Object> _copy = _copy(this._shared);
                _copy.remove(obj);
                return new Impl(_copy);
            }
            return this;
        }

        @Override
        public Object getAttribute(Object obj) {
            Object obj2;
            if (this._nonShared == null || (obj2 = this._nonShared.get(obj)) == null) {
                return this._shared.get(obj);
            }
            if (obj2 == NULL_SURROGATE) {
                return null;
            }
            return obj2;
        }

        @Override
        public ContextAttributes withPerCallAttribute(Object obj, Object obj2) {
            if (obj2 == null) {
                if (!this._shared.containsKey(obj)) {
                    if (this._nonShared == null || !this._nonShared.containsKey(obj)) {
                        return this;
                    }
                    this._nonShared.remove(obj);
                    return this;
                }
                obj2 = NULL_SURROGATE;
            }
            if (this._nonShared == null) {
                return nonSharedInstance(obj, obj2);
            }
            this._nonShared.put(obj, obj2);
            return this;
        }

        protected ContextAttributes nonSharedInstance(Object obj, Object obj2) {
            HashMap hashMap = new HashMap();
            if (obj2 == null) {
                obj2 = NULL_SURROGATE;
            }
            hashMap.put(obj, obj2);
            return new Impl(this._shared, hashMap);
        }

        private Map<Object, Object> _copy(Map<?, ?> map) {
            return new HashMap(map);
        }
    }

    public static ContextAttributes getEmpty() {
        return Impl.getEmpty();
    }

    public abstract ContextAttributes withSharedAttribute(Object obj, Object obj2);

    public abstract ContextAttributes withSharedAttributes(Map<?, ?> map);

    public abstract ContextAttributes withoutSharedAttribute(Object obj);

    public abstract Object getAttribute(Object obj);

    public abstract ContextAttributes withPerCallAttribute(Object obj, Object obj2);
}
