package com.kammoun.utils.jackson.core.json;

import com.kammoun.utils.jackson.core.JsonLocation;
import com.kammoun.utils.jackson.core.JsonParseException;
import com.kammoun.utils.jackson.core.JsonParser;
import com.kammoun.utils.jackson.core.JsonProcessingException;
import com.kammoun.utils.jackson.core.JsonStreamContext;
import com.kammoun.utils.jackson.core.io.ContentReference;

public final class JsonReadContext extends JsonStreamContext {
    protected final JsonReadContext _parent;
    protected DupDetector _dups;
    protected JsonReadContext _child;
    protected String _currentName;
    protected Object _currentValue;
    protected int _lineNr;
    protected int _columnNr;

    public JsonReadContext(JsonReadContext jsonReadContext, int i, DupDetector dupDetector, int i2, int i3, int i4) {
        this._parent = jsonReadContext;
        this._dups = dupDetector;
        this._type = i2;
        this._lineNr = i3;
        this._columnNr = i4;
        this._index = -1;
        this._nestingDepth = i;
    }

    @Deprecated
    public JsonReadContext(JsonReadContext jsonReadContext, DupDetector dupDetector, int i, int i2, int i3) {
        this._parent = jsonReadContext;
        this._dups = dupDetector;
        this._type = i;
        this._lineNr = i2;
        this._columnNr = i3;
        this._index = -1;
        this._nestingDepth = jsonReadContext == null ? 0 : jsonReadContext._nestingDepth + 1;
    }

    public void reset(int i, int i2, int i3) {
        this._type = i;
        this._index = -1;
        this._lineNr = i2;
        this._columnNr = i3;
        this._currentName = null;
        this._currentValue = null;
        if (this._dups != null) {
            this._dups.reset();
        }
    }

    public JsonReadContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    @Override
    public Object getCurrentValue() {
        return this._currentValue;
    }

    @Override
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public static JsonReadContext createRootContext(int i, int i2, DupDetector dupDetector) {
        return new JsonReadContext(null, 0, dupDetector, 0, i, i2);
    }

    public static JsonReadContext createRootContext(DupDetector dupDetector) {
        return new JsonReadContext(null, 0, dupDetector, 0, 1, 0);
    }

    public JsonReadContext createChildArrayContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext == null) {
            JsonReadContext jsonReadContext2 = new JsonReadContext(this, this._nestingDepth + 1, this._dups == null ? null : this._dups.child(), 1, i, i2);
            jsonReadContext = jsonReadContext2;
            this._child = jsonReadContext2;
        } else {
            jsonReadContext.reset(1, i, i2);
        }
        return jsonReadContext;
    }

    public JsonReadContext createChildObjectContext(int i, int i2) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext != null) {
            jsonReadContext.reset(2, i, i2);
            return jsonReadContext;
        }
        JsonReadContext jsonReadContext2 = new JsonReadContext(this, this._nestingDepth + 1, this._dups == null ? null : this._dups.child(), 2, i, i2);
        this._child = jsonReadContext2;
        return jsonReadContext2;
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
    public JsonReadContext getParent() {
        return this._parent;
    }

    @Override
    public JsonLocation startLocation(ContentReference contentReference) {
        return new JsonLocation(contentReference, -1L, this._lineNr, this._columnNr);
    }

    @Override
    @Deprecated
    public JsonLocation getStartLocation(Object obj) {
        return startLocation(ContentReference.rawReference(obj));
    }

    public JsonReadContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    public boolean expectComma() {
        int i = this._index + 1;
        this._index = i;
        return this._type != 0 && i > 0;
    }

    public void setCurrentName(String str) throws JsonProcessingException {
        this._currentName = str;
        if (this._dups != null) {
            _checkDup(this._dups, str);
        }
    }

    private void _checkDup(DupDetector dupDetector, String str) throws JsonProcessingException {
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            throw new JsonParseException(source instanceof JsonParser ? (JsonParser) source : null, "Duplicate field '" + str + "'");
        }
    }
}
