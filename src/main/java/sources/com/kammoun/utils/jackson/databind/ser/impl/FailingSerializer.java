package com.kammoun.utils.jackson.databind.ser.impl;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.databind.SerializerProvider;
import com.kammoun.utils.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

public class FailingSerializer extends StdSerializer<Object> {
    protected final String _msg;

    public FailingSerializer(String str) {
        super(Object.class);
        this._msg = str;
    }

    @Override
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.reportMappingProblem(this._msg, new Object[0]);
    }
}
