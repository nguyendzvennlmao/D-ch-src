package com.kammoun.utils.jackson.databind.util;

import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonProcessingException;
import com.kammoun.utils.jackson.core.JsonStreamContext;
import com.kammoun.utils.jackson.core.io.ContentReference;
import com.kammoun.utils.jackson.core.json.JsonReadContext;

public class TokenBufferReadContext extends JsonStreamContext {
    protected final JsonStreamContext _parent;
    protected final JsonLocation _startLocation;
    protected String _currentName;
    protected Object _currentValue;

    protected TokenBufferReadContext(JsonStreamContext jsonStreamContext, ContentReference contentReference) {
        super(jsonStreamContext);
        this._parent = jsonStreamContext.getParent();
        this._currentName = jsonStreamContext.getCurrentName();
        this._currentValue = jsonStreamContext.getCurrentValue();
        if (jsonStreamContext instanceof JsonReadContext) {
            this._startLocation = ((JsonReadContext) jsonStreamContext).startLocation(contentReference);
        } else {
            this._startLocation = JsonLocation.NA;
        }
    }

    @Deprecated
    protected TokenBufferReadContext(JsonStreamContext jsonStreamContext, Object obj) {
        this(jsonStreamContext, obj instanceof ContentReference ? (ContentReference) obj : ContentReference.rawReference(obj));
    }

    protected TokenBufferReadContext(JsonStreamContext jsonStreamContext, JsonLocation jsonLocation) {
        super(jsonStreamContext);
        this._parent = jsonStreamContext.getParent();
        this._currentName = jsonStreamContext.getCurrentName();
        this._currentValue = jsonStreamContext.getCurrentValue();
        this._startLocation = jsonLocation;
    }

    protected TokenBufferReadContext() {
        super(0, -1);
        this._parent = null;
        this._startLocation = JsonLocation.NA;
    }

    protected TokenBufferReadContext(TokenBufferReadContext tokenBufferReadContext, int i, int i2) {
        super(i, i2);
        this._parent = tokenBufferReadContext;
        this._startLocation = tokenBufferReadContext._startLocation;
    }

    @Override
    public Object getCurrentValue() {
        return this._currentValue;
    }

    @Override
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public static TokenBufferReadContext createRootContext(JsonStreamContext jsonStreamContext) {
        return jsonStreamContext == null ? new TokenBufferReadContext() : new TokenBufferReadContext(jsonStreamContext, ContentReference.unknown());
    }

    public TokenBufferReadContext createChildArrayContext() {
        this._index++;
        return new TokenBufferReadContext(this, 1, -1);
    }

    public TokenBufferReadContext createChildObjectContext() {
        this._index++;
        return new TokenBufferReadContext(this, 2, -1);
    }

    public TokenBufferReadContext parentOrCopy() {
        return this._parent instanceof TokenBufferReadContext ? (TokenBufferReadContext) this._parent : this._parent == null ? new TokenBufferReadContext() : new TokenBufferReadContext(this._parent, this._startLocation);
    }

    @Override
    public String getCurrentName() {
        return this._currentName;
    }

    @Override
    public boolean hasCurrentName() {
        return this._currentName != null;
    }

    @Override
    public JsonStreamContext getParent() {
        return this._parent;
    }

    public void setCurrentName(String str) throws JsonProcessingException {
        this._currentName = str;
    }

    public void updateForValue() {
        this._index++;
    }
}
