package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;

public class BooleanNode extends ValueNode {
    private static final long serialVersionUID = 2;
    public static final BooleanNode TRUE = new BooleanNode(true);
    public static final BooleanNode FALSE = new BooleanNode(false);
    private final boolean _value;

    protected BooleanNode(boolean z) {
        this._value = z;
    }

    protected Object readResolve() {
        return this._value ? TRUE : FALSE;
    }

    public static BooleanNode getTrue() {
        return TRUE;
    }

    public static BooleanNode getFalse() {
        return FALSE;
    }

    public static BooleanNode valueOf(boolean z) {
        return z ? TRUE : FALSE;
    }

    @Override
    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    @Override
    public JsonToken asToken() {
        return this._value ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    @Override
    public boolean booleanValue() {
        return this._value;
    }

    @Override
    public String asText() {
        return this._value ? "true" : "false";
    }

    @Override
    public boolean asBoolean() {
        return this._value;
    }

    @Override
    public boolean asBoolean(boolean z) {
        return this._value;
    }

    @Override
    public int asInt(int i) {
        return this._value ? 1 : 0;
    }

    @Override
    public long asLong(long j) {
        return this._value ? 1L : 0L;
    }

    @Override
    public double asDouble(double d) {
        return this._value ? 1.0d : 0.0d;
    }

    @Override
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(this._value);
    }

    @Override
    public int hashCode() {
        return this._value ? 3 : 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof BooleanNode) && this._value == ((BooleanNode) obj)._value;
    }
}
