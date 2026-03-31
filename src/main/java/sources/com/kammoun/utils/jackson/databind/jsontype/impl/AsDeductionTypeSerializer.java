package com.kammoun.utils.jackson.databind.jsontype.impl;

import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.core.JsonGenerator;
import com.kammoun.utils.jackson.core.JsonToken;
import com.kammoun.utils.jackson.core.type.WritableTypeId;
import com.kammoun.utils.jackson.databind.BeanProperty;
import java.io.IOException;

public class AsDeductionTypeSerializer extends TypeSerializerBase {
    private static final AsDeductionTypeSerializer INSTANCE = new AsDeductionTypeSerializer();

    protected AsDeductionTypeSerializer() {
        super(null, null);
    }

    public static AsDeductionTypeSerializer instance() {
        return INSTANCE;
    }

    @Override
    public AsDeductionTypeSerializer forProperty(BeanProperty beanProperty) {
        return this;
    }

    @Override
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    @Override
    public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        if (!writableTypeId.valueShape.isStructStart()) {
            return null;
        }
        if (!jsonGenerator.canWriteTypeId()) {
            return jsonGenerator.writeTypePrefix(writableTypeId);
        }
        writableTypeId.wrapperWritten = false;
        if (writableTypeId.valueShape == JsonToken.START_OBJECT) {
            jsonGenerator.writeStartObject(writableTypeId.forValue);
        } else if (writableTypeId.valueShape == JsonToken.START_ARRAY) {
            jsonGenerator.writeStartArray(writableTypeId.forValue);
        }
        return writableTypeId;
    }

    @Override
    public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        if (writableTypeId == null) {
            return null;
        }
        return jsonGenerator.writeTypeSuffix(writableTypeId);
    }
}
