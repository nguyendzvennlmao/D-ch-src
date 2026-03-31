package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.JsonSerializable;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Objects;

public class POJONode extends ValueNode {
    private static final long serialVersionUID = 2;
    protected final Object _value;

    public POJONode(Object obj) {
        this._value = obj;
    }

    @Override
    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    @Override
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override
    public byte[] binaryValue() throws IOException {
        return this._value instanceof byte[] ? (byte[]) this._value : super.binaryValue();
    }

    @Override
    public String asText() {
        return this._value == null ? "null" : this._value.toString();
    }

    @Override
    @Deprecated
    public String asText(String str) {
        return this._value == null ? str : this._value.toString();
    }

    @Override
    public boolean asBoolean(boolean z) {
        return (this._value == null || !(this._value instanceof Boolean)) ? z : ((Boolean) this._value).booleanValue();
    }

    @Override
    public int asInt(int i) {
        return this._value instanceof Number ? ((Number) this._value).intValue() : i;
    }

    @Override
    public long asLong(long j) {
        return this._value instanceof Number ? ((Number) this._value).longValue() : j;
    }

    @Override
    public double asDouble(double d) {
        return this._value instanceof Number ? ((Number) this._value).doubleValue() : d;
    }

    @Override
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._value == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else if (this._value instanceof JsonSerializable) {
            ((JsonSerializable) this._value).serialize(jsonGenerator, serializerProvider);
        } else {
            serializerProvider.defaultSerializeValue(this._value, jsonGenerator);
        }
    }

    public Object getPojo() {
        return this._value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof POJONode)) {
            return _pojoEquals((POJONode) obj);
        }
        return false;
    }

    protected boolean _pojoEquals(POJONode pOJONode) {
        return this._value == null ? pOJONode._value == null : this._value.equals(pOJONode._value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this._value);
    }
}
