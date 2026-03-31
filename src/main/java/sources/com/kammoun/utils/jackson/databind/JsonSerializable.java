package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public interface JsonSerializable {

    public static abstract class Base implements JsonSerializable {
        public boolean isEmpty(SerializerProvider serializerProvider) {
            return false;
        }
    }

    void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException;
}
