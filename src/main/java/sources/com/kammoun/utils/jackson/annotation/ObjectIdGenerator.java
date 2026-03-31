package com.kammoun.utils.jackson.annotation;

import java.io.Serializable;

public abstract class ObjectIdGenerator<T> implements Serializable {

    public static final class IdKey implements Serializable {
        private static final long serialVersionUID = 1;
        public final Class<?> type;
        public final Class<?> scope;
        public final Object key;
        private final int hashCode;

        public IdKey(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("Can not construct IdKey for null key");
            }
            this.type = cls;
            this.scope = cls2;
            this.key = obj;
            int hashCode = obj.hashCode() + cls.getName().hashCode();
            this.hashCode = cls2 != null ? hashCode ^ cls2.getName().hashCode() : hashCode;
        }

        public int hashCode() {
            return this.hashCode;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            IdKey idKey = (IdKey) obj;
            return idKey.key.equals(this.key) && idKey.type == this.type && idKey.scope == this.scope;
        }

        public String toString() {
            Object[] objArr = new Object[3];
            objArr[0] = this.key;
            objArr[1] = this.type == null ? "NONE" : this.type.getName();
            objArr[2] = this.scope == null ? "NONE" : this.scope.getName();
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", objArr);
        }
    }

    public abstract Class<?> getScope();

    public abstract boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator);

    public boolean maySerializeAsObject() {
        return false;
    }

    public boolean isValidReferencePropertyName(String str, Object obj) {
        return false;
    }

    public abstract ObjectIdGenerator<T> forScope(Class<?> cls);

    public abstract ObjectIdGenerator<T> newForSerialization(Object obj);

    public abstract IdKey key(Object obj);

    public abstract T generateId(Object obj);
}
