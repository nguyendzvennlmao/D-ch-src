package com.kammoun.utils.jackson.databind.jsontype;

import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import java.util.Collection;

public interface TypeResolverBuilder<T extends TypeResolverBuilder<T>> {
    Class<?> getDefaultImpl();

    TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    T init(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver);

    default T init(JsonTypeInfo.Value value, TypeIdResolver typeIdResolver) {
        return init(value.getIdType(), typeIdResolver);
    }

    T inclusion(JsonTypeInfo.As as);

    T typeProperty(String str);

    T defaultImpl(Class<?> cls);

    T typeIdVisibility(boolean z);

    default T withDefaultImpl(Class<?> cls) {
        return defaultImpl(cls);
    }

    default T withSettings(JsonTypeInfo.Value value) {
        throw new IllegalStateException("TypeResolveBuilder implementation " + getClass().getName() + " must implement `withSettings()`");
    }
}
