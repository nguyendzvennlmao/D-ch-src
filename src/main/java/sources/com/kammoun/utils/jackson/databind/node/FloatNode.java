package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.io.NumberOutput;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FloatNode extends NumericNode {
    protected final float _value;

    public FloatNode(float f) {
        this._value = f;
    }

    public static FloatNode valueOf(float f) {
        return new FloatNode(f);
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.FLOAT;
    }

    @Override
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override
    public boolean isFloat() {
        return true;
    }

    @Override
    public boolean canConvertToInt() {
        return this._value >= -2.14748365E9f && this._value <= 2.14748365E9f;
    }

    @Override
    public boolean canConvertToLong() {
        return this._value >= -9.223372E18f && this._value <= 9.223372E18f;
    }

    @Override
    public boolean canConvertToExactIntegral() {
        return (Float.isNaN(this._value) || Float.isInfinite(this._value) || this._value != ((float) Math.round(this._value))) ? false : true;
    }

    @Override
    public Number numberValue() {
        return Float.valueOf(this._value);
    }

    @Override
    public short shortValue() {
        return (short) this._value;
    }

    @Override
    public int intValue() {
        return (int) this._value;
    }

    @Override
    public long longValue() {
        return this._value;
    }

    @Override
    public float floatValue() {
        return this._value;
    }

    @Override
    public double doubleValue() {
        return this._value;
    }

    @Override
    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    @Override
    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    @Override
    public String asText() {
        return NumberOutput.toString(this._value);
    }

    @Override
    public boolean isNaN() {
        return Float.isNaN(this._value) || Float.isInfinite(this._value);
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
        if (obj != null && (obj instanceof FloatNode)) {
            return Float.compare(this._value, ((FloatNode) obj)._value) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }
}
