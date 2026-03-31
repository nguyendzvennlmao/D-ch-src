package com.kammoun.utils.jackson.databind.ser.std;

import com.kammoun.utils.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class ToStringSerializer extends ToStringSerializerBase {
    public static final ToStringSerializer instance = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    public ToStringSerializer(Class<?> cls) {
        super(cls);
    }

    @Override
    public final String valueToString(Object obj) {
        return obj.toString();
    }
}
