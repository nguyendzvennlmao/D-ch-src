package com.kammoun.utils.jackson.databind.ext;

import com.kammoun.utils.jackson.databind.JsonDeserializer;
import com.kammoun.utils.jackson.databind.JsonSerializer;
import java.nio.file.Path;

public class Java7HandlersImpl extends Java7Handlers {
    private final Class<?> _pathClass = Path.class;

    @Override
    public Class<?> getClassJavaNioFilePath() {
        return this._pathClass;
    }

    @Override
    public JsonDeserializer<?> getDeserializerForJavaNioFilePath(Class<?> cls) {
        if (cls == this._pathClass) {
            return new NioPathDeserializer();
        }
        return null;
    }

    @Override
    public JsonSerializer<?> getSerializerForJavaNioFilePath(Class<?> cls) {
        if (this._pathClass.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }
}
