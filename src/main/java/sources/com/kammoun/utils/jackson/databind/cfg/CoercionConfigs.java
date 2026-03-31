package com.kammoun.utils.jackson.databind.cfg;

import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.DeserializationFeature;
import com.kammoun.utils.jackson.databind.MapperFeature;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CoercionConfigs implements Serializable {
    private static final long serialVersionUID = 1;
    private static final int TARGET_TYPE_COUNT = LogicalType.values().length;
    protected CoercionAction _defaultAction;
    protected final MutableCoercionConfig _defaultCoercions;
    protected MutableCoercionConfig[] _perTypeCoercions;
    protected Map<Class<?>, MutableCoercionConfig> _perClassCoercions;

    public CoercionConfigs() {
        this(CoercionAction.TryConvert, new MutableCoercionConfig(), null, null);
    }

    protected CoercionConfigs(CoercionAction coercionAction, MutableCoercionConfig mutableCoercionConfig, MutableCoercionConfig[] mutableCoercionConfigArr, Map<Class<?>, MutableCoercionConfig> map) {
        this._defaultCoercions = mutableCoercionConfig;
        this._defaultAction = coercionAction;
        this._perTypeCoercions = mutableCoercionConfigArr;
        this._perClassCoercions = map;
    }

    public CoercionConfigs copy() {
        MutableCoercionConfig[] mutableCoercionConfigArr;
        HashMap hashMap;
        if (this._perTypeCoercions == null) {
            mutableCoercionConfigArr = null;
        } else {
            int length = this._perTypeCoercions.length;
            mutableCoercionConfigArr = new MutableCoercionConfig[length];
            for (int i = 0; i < length; i++) {
                mutableCoercionConfigArr[i] = _copy(this._perTypeCoercions[i]);
            }
        }
        if (this._perClassCoercions == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (Map.Entry<Class<?>, MutableCoercionConfig> entry : this._perClassCoercions.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().copy());
            }
        }
        return new CoercionConfigs(this._defaultAction, this._defaultCoercions.copy(), mutableCoercionConfigArr, hashMap);
    }

    private static MutableCoercionConfig _copy(MutableCoercionConfig mutableCoercionConfig) {
        if (mutableCoercionConfig == null) {
            return null;
        }
        return mutableCoercionConfig.copy();
    }

    public MutableCoercionConfig defaultCoercions() {
        return this._defaultCoercions;
    }

    public MutableCoercionConfig findOrCreateCoercion(LogicalType logicalType) {
        if (this._perTypeCoercions == null) {
            this._perTypeCoercions = new MutableCoercionConfig[TARGET_TYPE_COUNT];
        }
        MutableCoercionConfig mutableCoercionConfig = this._perTypeCoercions[logicalType.ordinal()];
        if (mutableCoercionConfig == null) {
            MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
            int ordinal = logicalType.ordinal();
            MutableCoercionConfig mutableCoercionConfig2 = new MutableCoercionConfig();
            mutableCoercionConfig = mutableCoercionConfig2;
            mutableCoercionConfigArr[ordinal] = mutableCoercionConfig2;
        }
        return mutableCoercionConfig;
    }

    public MutableCoercionConfig findOrCreateCoercion(Class<?> cls) {
        if (this._perClassCoercions == null) {
            this._perClassCoercions = new HashMap();
        }
        MutableCoercionConfig mutableCoercionConfig = this._perClassCoercions.get(cls);
        if (mutableCoercionConfig == null) {
            mutableCoercionConfig = new MutableCoercionConfig();
            this._perClassCoercions.put(cls, mutableCoercionConfig);
        }
        return mutableCoercionConfig;
    }

    public CoercionAction findCoercion(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        MutableCoercionConfig mutableCoercionConfig;
        CoercionAction findAction;
        MutableCoercionConfig mutableCoercionConfig2;
        CoercionAction findAction2;
        if (this._perClassCoercions != null && cls != null && (mutableCoercionConfig2 = this._perClassCoercions.get(cls)) != null && (findAction2 = mutableCoercionConfig2.findAction(coercionInputShape)) != null) {
            return findAction2;
        }
        if (this._perTypeCoercions != null && logicalType != null && (mutableCoercionConfig = this._perTypeCoercions[logicalType.ordinal()]) != null && (findAction = mutableCoercionConfig.findAction(coercionInputShape)) != null) {
            return findAction;
        }
        CoercionAction findAction3 = this._defaultCoercions.findAction(coercionInputShape);
        if (findAction3 != null) {
            return findAction3;
        }
        switch (coercionInputShape) {
            case EmptyArray:
                return deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? CoercionAction.AsNull : CoercionAction.Fail;
            case Float:
                if (logicalType == LogicalType.Integer) {
                    return deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT) ? CoercionAction.TryConvert : CoercionAction.Fail;
                }
                break;
            case Integer:
                if (logicalType == LogicalType.Enum && deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                    return CoercionAction.Fail;
                }
                break;
        }
        boolean _isScalarType = _isScalarType(logicalType);
        return (!_isScalarType || deserializationConfig.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS) || (logicalType == LogicalType.Float && coercionInputShape == CoercionInputShape.Integer)) ? coercionInputShape == CoercionInputShape.EmptyString ? logicalType == LogicalType.OtherScalar ? CoercionAction.TryConvert : (_isScalarType || deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) ? CoercionAction.AsNull : CoercionAction.Fail : this._defaultAction : CoercionAction.Fail;
    }

    public CoercionAction findCoercionFromBlankString(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        MutableCoercionConfig mutableCoercionConfig;
        MutableCoercionConfig mutableCoercionConfig2;
        Boolean bool = null;
        CoercionAction coercionAction2 = null;
        if (this._perClassCoercions != null && cls != null && (mutableCoercionConfig2 = this._perClassCoercions.get(cls)) != null) {
            bool = mutableCoercionConfig2.getAcceptBlankAsEmpty();
            coercionAction2 = mutableCoercionConfig2.findAction(CoercionInputShape.EmptyString);
        }
        if (this._perTypeCoercions != null && logicalType != null && (mutableCoercionConfig = this._perTypeCoercions[logicalType.ordinal()]) != null) {
            if (bool == null) {
                bool = mutableCoercionConfig.getAcceptBlankAsEmpty();
            }
            if (coercionAction2 == null) {
                coercionAction2 = mutableCoercionConfig.findAction(CoercionInputShape.EmptyString);
            }
        }
        if (bool == null) {
            bool = this._defaultCoercions.getAcceptBlankAsEmpty();
        }
        if (coercionAction2 == null) {
            coercionAction2 = this._defaultCoercions.findAction(CoercionInputShape.EmptyString);
        }
        if (Boolean.FALSE.equals(bool)) {
            return coercionAction;
        }
        if (coercionAction2 != null) {
            return coercionAction2;
        }
        if (!_isScalarType(logicalType) && !deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return coercionAction;
        }
        return CoercionAction.AsNull;
    }

    protected boolean _isScalarType(LogicalType logicalType) {
        return logicalType == LogicalType.Float || logicalType == LogicalType.Integer || logicalType == LogicalType.Boolean || logicalType == LogicalType.DateTime;
    }
}
