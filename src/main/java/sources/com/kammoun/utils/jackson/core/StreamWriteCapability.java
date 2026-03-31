package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.core.util.JacksonFeature;

public enum StreamWriteCapability implements JacksonFeature {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    StreamWriteCapability(boolean z) {
        this._defaultState = z;
    }

    @Override
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    @Override
    public boolean enabledIn(int i) {
        return (i & this._mask) != 0;
    }

    @Override
    public int getMask() {
        return this._mask;
    }
}
