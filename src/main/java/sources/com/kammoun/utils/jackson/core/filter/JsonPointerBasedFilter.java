package com.kammoun.utils.jackson.core.filter;

import com.kammoun.utils.jackson.core.JsonPointer;

public class JsonPointerBasedFilter extends TokenFilter {
    protected final JsonPointer _pathToMatch;
    protected final boolean _includeAllElements;

    public JsonPointerBasedFilter(String str) {
        this(JsonPointer.compile(str), false);
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer) {
        this(jsonPointer, false);
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer, boolean z) {
        this._pathToMatch = jsonPointer;
        this._includeAllElements = z;
    }

    protected JsonPointerBasedFilter construct(JsonPointer jsonPointer, boolean z) {
        return new JsonPointerBasedFilter(jsonPointer, z);
    }

    @Override
    public TokenFilter includeElement(int i) {
        JsonPointer matchElement = (!this._includeAllElements || this._pathToMatch.mayMatchElement()) ? this._pathToMatch.matchElement(i) : this._pathToMatch.tail();
        if (matchElement == null) {
            return null;
        }
        return matchElement.matches() ? TokenFilter.INCLUDE_ALL : construct(matchElement, this._includeAllElements);
    }

    @Override
    public TokenFilter includeProperty(String str) {
        JsonPointer matchProperty = this._pathToMatch.matchProperty(str);
        if (matchProperty == null) {
            return null;
        }
        return matchProperty.matches() ? TokenFilter.INCLUDE_ALL : construct(matchProperty, this._includeAllElements);
    }

    @Override
    public TokenFilter filterStartArray() {
        return this;
    }

    @Override
    public TokenFilter filterStartObject() {
        return this;
    }

    @Override
    protected boolean _includeScalar() {
        return this._pathToMatch.matches();
    }

    @Override
    public String toString() {
        return "[JsonPointerFilter at: " + this._pathToMatch + "]";
    }
}
