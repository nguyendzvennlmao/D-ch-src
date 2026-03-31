package com.kammoun.utils.jackson.databind.cfg;

public enum EnumFeature implements DatatypeFeature {
    READ_ENUM_KEYS_USING_INDEX(false),
    WRITE_ENUMS_TO_LOWERCASE(false);

    private static final int FEATURE_INDEX = 0;
    private final boolean _enabledByDefault;
    private final int _mask = 1 << ordinal();

    EnumFeature(boolean z) {
        this._enabledByDefault = z;
    }

    @Override
    public boolean enabledByDefault() {
        return this._enabledByDefault;
    }

    @Override
    public boolean enabledIn(int i) {
        return (i & this._mask) != 0;
    }

    @Override
    public int getMask() {
        return this._mask;
    }

    @Override
    public int featureIndex() {
        return 0;
    }
}
