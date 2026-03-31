package com.kammoun.utils.jackson.databind.deser.impl;

import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class UnsupportedTypeDeserializer extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;
    protected final JavaType _type;
    protected final String _message;

    public UnsupportedTypeDeserializer(JavaType javaType, String str) {
        super(javaType);
        this._type = javaType;
        this._message = str;
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object embeddedObject;
        if (jsonParser.currentToken() == JsonToken.VALUE_EMBEDDED_OBJECT && ((embeddedObject = jsonParser.getEmbeddedObject()) == null || this._type.getRawClass().isAssignableFrom(embeddedObject.getClass()))) {
            return embeddedObject;
        }
        deserializationContext.reportBadDefinition(this._type, this._message);
        return null;
    }
}
