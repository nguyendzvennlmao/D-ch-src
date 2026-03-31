package com.kammoun.utils.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Arrays;

public class CoercionConfig implements Serializable {
    private static final long serialVersionUID = 1;
    private static final int INPUT_SHAPE_COUNT = CoercionInputShape.values().length;
    protected Boolean _acceptBlankAsEmpty;
    protected final CoercionAction[] _coercionsByShape;

    public CoercionConfig() {
        this._coercionsByShape = new CoercionAction[INPUT_SHAPE_COUNT];
        this._acceptBlankAsEmpty = null;
    }

    public CoercionConfig(CoercionConfig coercionConfig) {
        this._acceptBlankAsEmpty = coercionConfig._acceptBlankAsEmpty;
        this._coercionsByShape = (CoercionAction[]) Arrays.copyOf(coercionConfig._coercionsByShape, coercionConfig._coercionsByShape.length);
    }

    public CoercionAction findAction(CoercionInputShape coercionInputShape) {
        return this._coercionsByShape[coercionInputShape.ordinal()];
    }

    public Boolean getAcceptBlankAsEmpty() {
        return this._acceptBlankAsEmpty;
    }
}
