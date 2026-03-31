package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.io.NumberOutput;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class DoubleNode extends NumericNode {
    protected final double _value;

    public DoubleNode(double d) {
        this._value = d;
    }

    public static DoubleNode valueOf(double d) {
        return new DoubleNode(d);
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override
    public JsonParser.NumberType numberType() {
        return JsonParser.NumberType.DOUBLE;
    }

    @Override
    public boolean isFloatingPointNumber() {
        return true;
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    public boolean canConvertToInt() {
        return this._value >= -2.147483648E9d && this._value <= 2.147483647E9d;
    }

    @Override
    public boolean canConvertToLong() {
        return this._value >= -9.223372036854776E18d && this._value <= 9.223372036854776E18d;
    }

    @Override
    public boolean canConvertToExactIntegral() {
        return (Double.isNaN(this._value) || Double.isInfinite(this._value) || this._value != Math.rint(this._value)) ? false : true;
    }

    @Override
    public Number numberValue() {
        return Double.valueOf(this._value);
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
        return (long) this._value;
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
        return decimalValue().toBigInteger();
    }

    @Override
    public String asText() {
        return NumberOutput.toString(this._value);
    }

    @Override
    public boolean isNaN() {
        return Double.isNaN(this._value) || Double.isInfinite(this._value);
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
        if (obj != null && (obj instanceof DoubleNode)) {
            return Double.compare(this._value, ((DoubleNode) obj)._value) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }
}
