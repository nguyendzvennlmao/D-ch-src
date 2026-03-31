package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class BigIntegerNode extends NumericNode {
    private static final BigInteger MIN_INTEGER = BigInteger.valueOf(-2147483648L);
    private static final BigInteger MAX_INTEGER = BigInteger.valueOf(2147483647L);
    private static final BigInteger MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
    protected final BigInteger _value;

    public BigIntegerNode(BigInteger bigInteger) {
        this._value = bigInteger;
    }

    public static BigIntegerNode valueOf(BigInteger bigInteger) {
        return new BigIntegerNode(bigInteger);
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.BIG_INTEGER;
    }

    @Override
    public boolean isIntegralNumber() {
        return true;
    }

    @Override
    public boolean isBigInteger() {
        return true;
    }

    @Override
    public boolean canConvertToInt() {
        return this._value.compareTo(MIN_INTEGER) >= 0 && this._value.compareTo(MAX_INTEGER) <= 0;
    }

    @Override
    public boolean canConvertToLong() {
        return this._value.compareTo(MIN_LONG) >= 0 && this._value.compareTo(MAX_LONG) <= 0;
    }

    @Override
    public Number numberValue() {
        return this._value;
    }

    @Override
    public short shortValue() {
        return this._value.shortValue();
    }

    @Override
    public int intValue() {
        return this._value.intValue();
    }

    @Override
    public long longValue() {
        return this._value.longValue();
    }

    @Override
    public BigInteger bigIntegerValue() {
        return this._value;
    }

    @Override
    public float floatValue() {
        return this._value.floatValue();
    }

    @Override
    public double doubleValue() {
        return this._value.doubleValue();
    }

    @Override
    public BigDecimal decimalValue() {
        return new BigDecimal(this._value);
    }

    @Override
    public String asText() {
        return this._value.toString();
    }

    @Override
    public boolean asBoolean(boolean z) {
        return !BigInteger.ZERO.equals(this._value);
    }

    @Override
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(this._value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BigIntegerNode)) {
            return Objects.equals(((BigIntegerNode) obj)._value, this._value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this._value);
    }
}
