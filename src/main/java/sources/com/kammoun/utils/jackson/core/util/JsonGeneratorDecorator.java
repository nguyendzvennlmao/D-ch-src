package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.core.JsonGenerator;

public interface JsonGeneratorDecorator {
    JsonGenerator decorate(JsonFactory jsonFactory, JsonGenerator jsonGenerator);
}
