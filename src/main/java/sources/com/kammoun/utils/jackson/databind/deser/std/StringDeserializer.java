package com.kammoun.utils.jackson.databind.deser.std;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.databind.DeserializationContext;
import com.kammoun.utils.jackson.databind.JsonMappingException;
import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;
import com.kammoun.utils.jackson.databind.jsontype.TypeDeserializer;
import com.kammoun.utils.jackson.databind.type.LogicalType;
import java.io.IOException;

@JacksonStdImpl
public class StringDeserializer extends StdScalarDeserializer<String> {
    private static final long serialVersionUID = 1;
    public static final StringDeserializer instance = new StringDeserializer();

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    @Override
    public LogicalType logicalType() {
        return LogicalType.Textual;
    }

    @Override
    public boolean isCachable() {
        return true;
    }

    @Override
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.VALUE_STRING) ? jsonParser.getText() : jsonParser.hasToken(JsonToken.START_ARRAY) ? _deserializeFromArray(jsonParser, deserializationContext) : _parseString(jsonParser, deserializationContext, this);
    }

    @Override
    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return deserialize(jsonParser, deserializationContext);
    }
}
