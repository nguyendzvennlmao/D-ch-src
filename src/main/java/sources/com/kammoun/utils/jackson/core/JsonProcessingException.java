package com.kammoun.utils.jackson.core;

public class JsonProcessingException extends JacksonException {
    private static final long serialVersionUID = 123;
    protected JsonLocation _location;

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, th);
        this._location = jsonLocation;
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    protected JsonProcessingException(String str, Throwable th) {
        this(str, null, th);
    }

    public JsonProcessingException(Throwable th) {
        this(null, null, th);
    }

    @Override
    public JsonLocation getLocation() {
        return this._location;
    }

    public void clearLocation() {
        this._location = null;
    }

    @Override
    public String getOriginalMessage() {
        return super.getMessage();
    }

    @Override
    public Object getProcessor() {
        return null;
    }

    protected String getMessageSuffix() {
        return null;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location != null || messageSuffix != null) {
            StringBuilder sb = new StringBuilder(100);
            sb.append(message);
            if (messageSuffix != null) {
                sb.append(messageSuffix);
            }
            if (location != null) {
                sb.append('\n');
                sb.append(" at ");
                sb.append(location.toString());
            }
            message = sb.toString();
        }
        return message;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
