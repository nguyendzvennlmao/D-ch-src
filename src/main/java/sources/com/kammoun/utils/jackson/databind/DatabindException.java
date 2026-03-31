package com.kammoun.utils.jackson.databind;

import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonProcessingException;

public abstract class DatabindException extends JsonProcessingException {
    private static final long serialVersionUID = 3;

    public DatabindException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public DatabindException(String str) {
        super(str);
    }

    public DatabindException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public DatabindException(String str, Throwable th) {
        this(str, null, th);
    }

    public abstract void prependPath(Object obj, String str);

    public abstract void prependPath(Object obj, int i);
}
