package com.kammoun.utils.jackson.databind.introspect;

import com.kammoun.utils.jackson.databind.BeanDescription;
import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.cfg.MapperConfig;

public abstract class ClassIntrospector {

    public interface MixInResolver {
        Class<?> findMixInClassFor(Class<?> cls);

        MixInResolver copy();
    }

    public abstract ClassIntrospector copy();

    public abstract BeanDescription forSerialization(SerializationConfig serializationConfig, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forDeserialization(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver, BeanDescription beanDescription);

    @Deprecated
    public abstract BeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forCreation(DeserializationConfig deserializationConfig, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver);

    public abstract BeanDescription forDirectClassAnnotations(MapperConfig<?> mapperConfig, JavaType javaType, MixInResolver mixInResolver);
}
