package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.databind.JsonSerializable;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public class RawValue implements JsonSerializable {
    protected Object _value;

    public RawValue(String str) {
        this._value = str;
    }

    public RawValue(SerializableString serializableString) {
        this._value = serializableString;
    }

    public RawValue(JsonSerializable jsonSerializable) {
        this._value = jsonSerializable;
    }

    protected RawValue(Object obj, boolean z) {
        this._value = obj;
    }

    public Object rawValue() {
        return this._value;
    }

    @Override
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._value instanceof JsonSerializable) {
            ((JsonSerializable) this._value).serialize(jsonGenerator, serializerProvider);
        } else {
            _serialize(jsonGenerator);
        }
    }

    @Override
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (this._value instanceof JsonSerializable) {
            ((JsonSerializable) this._value).serializeWithType(jsonGenerator, serializerProvider, typeSerializer);
        } else if (this._value instanceof SerializableString) {
            serialize(jsonGenerator, serializerProvider);
        }
    }

    public void serialize(JsonGenerator jsonGenerator) throws IOException {
        if (this._value instanceof JsonSerializable) {
            jsonGenerator.writeObject(this._value);
        } else {
            _serialize(jsonGenerator);
        }
    }

    protected void _serialize(JsonGenerator jsonGenerator) throws IOException {
        if (this._value instanceof SerializableString) {
            jsonGenerator.writeRawValue((SerializableString) this._value);
        } else {
            jsonGenerator.writeRawValue(String.valueOf(this._value));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawValue)) {
            return false;
        }
        RawValue rawValue = (RawValue) obj;
        if (this._value == rawValue._value) {
            return true;
        }
        return this._value != null && this._value.equals(rawValue._value);
    }

    public int hashCode() {
        if (this._value == null) {
            return 0;
        }
        return this._value.hashCode();
    }

    public String toString() {
        return String.format("[RawValue of type %s]", ClassUtil.classNameOf(this._value));
    }
}
