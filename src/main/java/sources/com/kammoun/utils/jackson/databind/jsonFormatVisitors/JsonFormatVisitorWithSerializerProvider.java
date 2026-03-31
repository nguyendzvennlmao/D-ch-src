package com.kammoun.utils.jackson.databind.jsonFormatVisitors;

import com.kammoun.utils.jackson.databind.SerializerProvider;

public interface JsonFormatVisitorWithSerializerProvider {
    SerializerProvider getProvider();

    void setProvider(SerializerProvider serializerProvider);
}
