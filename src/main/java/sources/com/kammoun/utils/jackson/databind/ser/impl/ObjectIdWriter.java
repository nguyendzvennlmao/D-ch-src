package com.kammoun.utils.jackson.databind.ser.impl;

import com.kammoun.utils.jackson.annotation.ObjectIdGenerator;
import com.kammoun.utils.jackson.core.SerializableString;
import com.kammoun.utils.jackson.core.io.SerializedString;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.PropertyName;

public final class ObjectIdWriter {
    public final JavaType idType;
    public final SerializableString propertyName;
    public final ObjectIdGenerator<?> generator;
    public final JsonSerializer<Object> serializer;
    public final boolean alwaysAsId;

    protected ObjectIdWriter(JavaType javaType, SerializableString serializableString, ObjectIdGenerator<?> objectIdGenerator, JsonSerializer<?> jsonSerializer, boolean z) {
        this.idType = javaType;
        this.propertyName = serializableString;
        this.generator = objectIdGenerator;
        this.serializer = jsonSerializer;
        this.alwaysAsId = z;
    }

    public static ObjectIdWriter construct(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z) {
        String simpleName = propertyName == null ? null : propertyName.getSimpleName();
        return new ObjectIdWriter(javaType, simpleName == null ? null : new SerializedString(simpleName), objectIdGenerator, null, z);
    }

    public ObjectIdWriter withSerializer(JsonSerializer<?> jsonSerializer) {
        return new ObjectIdWriter(this.idType, this.propertyName, this.generator, jsonSerializer, this.alwaysAsId);
    }

    public ObjectIdWriter withAlwaysAsId(boolean z) {
        return z == this.alwaysAsId ? this : new ObjectIdWriter(this.idType, this.propertyName, this.generator, this.serializer, z);
    }
}
