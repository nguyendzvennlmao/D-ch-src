package com.kammoun.utils.jackson.databind.cfg;

import com.kammoun.utils.jackson.databind.DeserializationConfig;
import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import com.kammoun.utils.jackson.databind.SerializationConfig;
import com.kammoun.utils.jackson.databind.util.LookupCache;
import com.kammoun.utils.jackson.databind.util.TypeKey;
import java.io.Serializable;

public interface CacheProvider extends Serializable {
    LookupCache<JavaType, JsonDeserializer<Object>> forDeserializerCache(DeserializationConfig deserializationConfig);

    LookupCache<TypeKey, JsonSerializer<Object>> forSerializerCache(SerializationConfig serializationConfig);

    LookupCache<Object, JavaType> forTypeFactory();
}
