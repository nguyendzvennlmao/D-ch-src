package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.databind.JavaType;
import com.kammoun.utils.jackson.databind.type.TypeFactory;

public interface Converter<IN, OUT> {

    public static abstract class None implements Converter<Object, Object> {
    }

    OUT convert(IN in);

    JavaType getInputType(TypeFactory typeFactory);

    JavaType getOutputType(TypeFactory typeFactory);
}
