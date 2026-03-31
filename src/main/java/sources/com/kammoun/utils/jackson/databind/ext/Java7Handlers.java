package com.kammoun.utils.jackson.databind.ext;

import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonSerializer;

public abstract class Java7Handlers {
    private static final Java7Handlers IMPL = new Java7HandlersImpl();

    public static Java7Handlers instance() {
        return IMPL;
    }

    public abstract Class<?> getClassJavaNioFilePath();

    public abstract JsonDeserializer<?> getDeserializerForJavaNioFilePath(Class<?> cls);

    public abstract JsonSerializer<?> getSerializerForJavaNioFilePath(Class<?> cls);
}
