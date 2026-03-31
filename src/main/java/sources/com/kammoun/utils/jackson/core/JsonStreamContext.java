package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.core.io.CharTypes;
import com.kammoun.utils.jackson.core.io.ContentReference;
import org.slf4j.Logger;

public abstract class JsonStreamContext {
    public static final int TYPE_ROOT = 0;
    public static final int TYPE_ARRAY = 1;
    public static final int TYPE_OBJECT = 2;
    protected int _type;
    protected int _index;
    protected int _nestingDepth;

    public JsonStreamContext() {
    }

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public JsonStreamContext(int i, int i2) {
        this._type = i;
        this._index = i2;
    }

    public abstract JsonStreamContext getParent();

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final int getNestingDepth() {
        return this._nestingDepth;
    }

    @Deprecated
    public final String getTypeDesc() {
        switch (this._type) {
            case 0:
                return Logger.ROOT_LOGGER_NAME;
            case 1:
                return "ARRAY";
            case 2:
                return "OBJECT";
            default:
                return "?";
        }
    }

    public String typeDesc() {
        switch (this._type) {
            case 0:
                return "root";
            case 1:
                return "Array";
            case 2:
                return "Object";
            default:
                return "?";
        }
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public final int getCurrentIndex() {
        if (this._index < 0) {
            return 0;
        }
        return this._index;
    }

    public boolean hasCurrentIndex() {
        return this._index >= 0;
    }

    public boolean hasPathSegment() {
        if (this._type == 2) {
            return hasCurrentName();
        }
        if (this._type == 1) {
            return hasCurrentIndex();
        }
        return false;
    }

    public abstract String getCurrentName();

    public boolean hasCurrentName() {
        return getCurrentName() != null;
    }

    public Object getCurrentValue() {
        return null;
    }

    public void setCurrentValue(Object obj) {
    }

    public JsonPointer pathAsPointer() {
        return JsonPointer.forPath(this, false);
    }

    public JsonPointer pathAsPointer(boolean z) {
        return JsonPointer.forPath(this, z);
    }

    public JsonLocation startLocation(ContentReference contentReference) {
        return JsonLocation.NA;
    }

    @Deprecated
    public JsonLocation getStartLocation(Object obj) {
        return JsonLocation.NA;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        switch (this._type) {
            case 0:
                sb.append("/");
                break;
            case 1:
                sb.append('[');
                sb.append(getCurrentIndex());
                sb.append(']');
                break;
            case 2:
            default:
                sb.append('{');
                String currentName = getCurrentName();
                if (currentName != null) {
                    sb.append('\"');
                    CharTypes.appendQuoted(sb, currentName);
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
                break;
        }
        return sb.toString();
    }
}
