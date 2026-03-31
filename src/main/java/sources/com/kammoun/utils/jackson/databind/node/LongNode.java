package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.io.NumberOutput;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class LongNode extends NumericNode {
    protected final long _value;

    public LongNode(long j) {
        this._value = j;
    }

    public static LongNode valueOf(long j) {
        return new LongNode(j);
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.LONG;
    }

    @Override
    public boolean isIntegralNumber() {
        return true;
    }

    @Override
    public boolean isLong() {
        return true;
    }

    @Override
    public boolean canConvertToInt() {
        return this._value >= -2147483648L && this._value <= 2147483647L;
    }

    @Override
    public boolean canConvertToLong() {
        return true;
    }

    @Override
    public Number numberValue() {
        return Long.valueOf(this._value);
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
        return (float) this._value;
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
        return BigInteger.valueOf(this._value);
    }

    @Override
    public String asText() {
        return NumberOutput.toString(this._value);
    }

    @Override
    public boolean asBoolean(boolean z) {
        return this._value != 0;
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
        return obj != null && (obj instanceof LongNode) && ((LongNode) obj)._value == this._value;
    }

    @Override
    public int hashCode() {
        return ((int) this._value) ^ ((int) (this._value >> 32));
    }
}
