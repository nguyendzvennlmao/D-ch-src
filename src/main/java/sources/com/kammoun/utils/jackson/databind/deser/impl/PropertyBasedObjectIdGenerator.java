package com.kammoun.utils.jackson.databind.deser.impl;

import com.kammoun.utils.jackson.annotation.ObjectIdGenerator;
import com.kammoun.utils.jackson.annotation.ObjectIdGenerators;

public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators.PropertyGenerator {
    private static final long serialVersionUID = 1;

    public PropertyBasedObjectIdGenerator(Class<?> cls) {
        super(cls);
    }

    @Override
    public Object generateId(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls);
    }

    @Override
    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }

    @Override
    public ObjectIdGenerator.IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this._scope, obj);
    }
}
