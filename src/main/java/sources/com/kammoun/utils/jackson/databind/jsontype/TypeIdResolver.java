package com.kammoun.utils.jackson.databind.jsontype;

import com.kammoun.utils.jackson.annotation.JsonTypeInfo;
import com.kammoun.utils.jackson.databind.DatabindContext;
import com.kammoun.utils.jackson.databind.JavaType;
import java.io.IOException;

public interface TypeIdResolver {
    void init(JavaType javaType);

    String idFromValue(Object obj);

    String idFromValueAndType(Object obj, Class<?> cls);

    String idFromBaseType();

    JavaType typeFromId(DatabindContext databindContext, String str) throws IOException;

    String getDescForKnownTypeIds();

    JsonTypeInfo.Id getMechanism();
}
