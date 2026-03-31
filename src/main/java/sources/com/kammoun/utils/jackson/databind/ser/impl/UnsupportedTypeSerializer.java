package com.kammoun.utils.jackson.databind.ser.impl;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class UnsupportedTypeSerializer extends StdSerializer<Object> {
    private static final long serialVersionUID = 1;
    protected final JavaType _type;
    protected final String _message;

    public UnsupportedTypeSerializer(JavaType javaType, String str) {
        super(Object.class);
        this._type = javaType;
        this._message = str;
    }

    @Override
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.reportBadDefinition(this._type, this._message);
    }
}
