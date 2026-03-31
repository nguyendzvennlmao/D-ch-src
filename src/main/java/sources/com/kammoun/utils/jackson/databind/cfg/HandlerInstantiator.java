package com.kammoun.utils.jackson.databind.cfg;

import com.kammoun.utils.jackson.annotation.ObjectIdGenerator;
import com.kammoun.utils.jackson.annotation.ObjectIdResolver;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.KeyDeserializer;
import com.kammoun.utils.jackson.databind.PropertyNamingStrategy;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.deser.ValueInstantiator;
import com.kammoun.utils.jackson.databind.introspect.Annotated;
import com.kammoun.utils.jackson.databind.introspect.BeanPropertyDefinition;
import com.kammoun.utils.jackson.databind.jsontype.TypeIdResolver;
import com.kammoun.utils.jackson.databind.jsontype.TypeResolverBuilder;
import com.kammoun.utils.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.kammoun.utils.jackson.databind.util.Converter;

public abstract class HandlerInstantiator {
    public abstract JsonDeserializer<?> deserializerInstance(DeserializationConfig deserializationConfig, Annotated annotated, Class<?> cls);

    public abstract KeyDeserializer keyDeserializerInstance(DeserializationConfig deserializationConfig, Annotated annotated, Class<?> cls);

    public abstract JsonSerializer<?> serializerInstance(SerializationConfig serializationConfig, Annotated annotated, Class<?> cls);

    public abstract TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> mapperConfig, Annotated annotated, Class<?> cls);

    public abstract TypeIdResolver typeIdResolverInstance(MapperConfig<?> mapperConfig, Annotated annotated, Class<?> cls);

    public ValueInstantiator valueInstantiatorInstance(MapperConfig<?> mapperConfig, Annotated annotated, Class<?> cls) {
        return null;
    }

    public ObjectIdGenerator<?> objectIdGeneratorInstance(MapperConfig<?> mapperConfig, Annotated annotated, Class<?> cls) {
        return null;
    }

    public ObjectIdResolver resolverIdGeneratorInstance(MapperConfig<?> mapperConfig, Annotated annotated, Class<?> cls) {
        return null;
    }

    public PropertyNamingStrategy namingStrategyInstance(MapperConfig<?> mapperConfig, Annotated annotated, Class<?> cls) {
        return null;
    }

    public Converter<?, ?> converterInstance(MapperConfig<?> mapperConfig, Annotated annotated, Class<?> cls) {
        return null;
    }

    public VirtualBeanPropertyWriter virtualPropertyWriterInstance(MapperConfig<?> mapperConfig, Class<?> cls) {
        return null;
    }

    public Object includeFilterInstance(SerializationConfig serializationConfig, BeanPropertyDefinition beanPropertyDefinition, Class<?> cls) {
        return null;
    }
}
