package com.kammoun.utils.jackson.core.json;

import com.kammoun.utils.jackson.core.FormatFeature;
import com.kammoun.utils.jackson.core.JsonGenerator;

public enum JsonWriteFeature implements FormatFeature {
    QUOTE_FIELD_NAMES(true, JsonGenerator.Feature.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, JsonGenerator.Feature.ESCAPE_NON_ASCII),
    WRITE_HEX_UPPER_CASE(true, JsonGenerator.Feature.WRITE_HEX_UPPER_CASE),
    ESCAPE_FORWARD_SLASHES(false, JsonGenerator.Feature.ESCAPE_FORWARD_SLASHES);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();
    private final JsonGenerator.Feature _mappedFeature;

    public static int collectDefaults() {
        int i = 0;
        for (JsonWriteFeature jsonWriteFeature : values()) {
            if (jsonWriteFeature.enabledByDefault()) {
                i |= jsonWriteFeature.getMask();
            }
        }
        return i;
    }

    JsonWriteFeature(boolean z, JsonGenerator.Feature feature) {
        this._defaultState = z;
        this._mappedFeature = feature;
    }

    @Override
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    @Override
    public int getMask() {
        return this._mask;
    }

    @Override
    public boolean enabledIn(int i) {
        return (i & this._mask) != 0;
    }

    public JsonGenerator.Feature mappedFeature() {
        return this._mappedFeature;
    }
}
