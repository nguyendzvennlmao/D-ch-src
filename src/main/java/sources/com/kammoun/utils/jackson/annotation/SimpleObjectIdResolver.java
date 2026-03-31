package com.kammoun.utils.jackson.annotation;

import com.kammoun.utils.jackson.annotation.ObjectIdGenerator;
import java.util.HashMap;
import java.util.Map;

public class SimpleObjectIdResolver implements ObjectIdResolver {
    protected Map<ObjectIdGenerator.IdKey, Object> _items;

    @Override
    public void bindItem(ObjectIdGenerator.IdKey idKey, Object obj) {
        if (this._items == null) {
            this._items = new HashMap();
        } else {
            Object obj2 = this._items.get(idKey);
            if (obj2 != null) {
                if (obj2 != obj) {
                    throw new IllegalStateException("Already had POJO for id (" + idKey.key.getClass().getName() + ") [" + idKey + "]");
                }
                return;
            }
        }
        this._items.put(idKey, obj);
    }

    @Override
    public Object resolveId(ObjectIdGenerator.IdKey idKey) {
        if (this._items == null) {
            return null;
        }
        return this._items.get(idKey);
    }

    @Override
    public boolean canUseFor(ObjectIdResolver objectIdResolver) {
        return objectIdResolver.getClass() == getClass();
    }

    @Override
    public ObjectIdResolver newForDeserialization(Object obj) {
        return new SimpleObjectIdResolver();
    }
}
