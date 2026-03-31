package com.kammoun.utils.jackson.core.exc;

import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonProcessingException;
import com.kammoun.utils.jackson.core.util.RequestPayload;

public abstract class StreamReadException extends JsonProcessingException {
    static final long serialVersionUID = 2;
    protected transient JsonParser _processor;
    protected RequestPayload _requestPayload;

    protected StreamReadException(String str) {
        this(null, str, null, null);
    }

    public StreamReadException(JsonParser jsonParser, String str) {
        this(jsonParser, str, _currentLocation(jsonParser), null);
    }

    protected StreamReadException(JsonParser jsonParser, String str, Throwable th) {
        this(jsonParser, str, _currentLocation(jsonParser), th);
    }

    protected StreamReadException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        this(jsonParser, str, jsonLocation, null);
    }

    protected StreamReadException(String str, JsonLocation jsonLocation, Throwable th) {
        this(null, str, jsonLocation, th);
    }

    public StreamReadException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
        this._processor = jsonParser;
    }

    public abstract StreamReadException withParser(JsonParser jsonParser);

    public abstract StreamReadException withRequestPayload(RequestPayload requestPayload);

    @Override
    public JsonParser getProcessor() {
        return this._processor;
    }

    public RequestPayload getRequestPayload() {
        return this._requestPayload;
    }

    public String getRequestPayloadAsString() {
        if (this._requestPayload != null) {
            return this._requestPayload.toString();
        }
        return null;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload != null) {
            message = message + "\nRequest payload : " + this._requestPayload.toString();
        }
        return message;
    }

    public static JsonLocation _currentLocation(JsonParser jsonParser) {
        if (jsonParser == null) {
            return null;
        }
        return jsonParser.currentLocation();
    }
}
