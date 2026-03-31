package com.kammoun.utils.jackson.databind.deser.impl;

import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.deser.NullValueProvider;
import com.kammoun.utils.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsConstantProvider implements NullValueProvider, Serializable {
    private static final long serialVersionUID = 1;
    private static final NullsConstantProvider SKIPPER = new NullsConstantProvider(null);
    private static final NullsConstantProvider NULLER = new NullsConstantProvider(null);
    protected final Object _nullValue;
    protected final AccessPattern _access;

    protected NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        this._access = this._nullValue == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    public static NullsConstantProvider forValue(Object obj) {
        return obj == null ? NULLER : new NullsConstantProvider(obj);
    }

    public static boolean isSkipper(NullValueProvider nullValueProvider) {
        return nullValueProvider == SKIPPER;
    }

    public static boolean isNuller(NullValueProvider nullValueProvider) {
        return nullValueProvider == NULLER;
    }

    @Override
    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    @Override
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
