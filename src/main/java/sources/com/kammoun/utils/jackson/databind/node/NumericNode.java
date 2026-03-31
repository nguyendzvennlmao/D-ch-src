package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonParser;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class NumericNode extends ValueNode {
    private static final long serialVersionUID = 1;

    @Override
    public final JsonNodeType getNodeType() {
        return JsonNodeType.NUMBER;
    }

    @Override
    public abstract JsonParser.NumberType numberType();

    @Override
    public abstract Number numberValue();

    @Override
    public abstract int intValue();

    @Override
    public abstract long longValue();

    @Override
    public abstract double doubleValue();

    @Override
    public abstract BigDecimal decimalValue();

    @Override
    public abstract BigInteger bigIntegerValue();

    @Override
    public abstract boolean canConvertToInt();

    @Override
    public abstract boolean canConvertToLong();

    @Override
    public abstract String asText();

    @Override
    public final int asInt() {
        return intValue();
    }

    @Override
    public final int asInt(int i) {
        return intValue();
    }

    @Override
    public final long asLong() {
        return longValue();
    }

    @Override
    public final long asLong(long j) {
        return longValue();
    }

    @Override
    public final double asDouble() {
        return doubleValue();
    }

    @Override
    public final double asDouble(double d) {
        return doubleValue();
    }

    public boolean isNaN() {
        return false;
    }
}
