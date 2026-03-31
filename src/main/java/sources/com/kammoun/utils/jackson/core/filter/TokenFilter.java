package com.kammoun.utils.jackson.core.filter;

import com.kammoun.utils.jackson.core.JsonParser;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TokenFilter {
    public static final TokenFilter INCLUDE_ALL = new TokenFilter();

    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    public TokenFilter filterStartObject() {
        return this;
    }

    public TokenFilter filterStartArray() {
        return this;
    }

    public void filterFinishObject() {
    }

    public void filterFinishArray() {
    }

    public TokenFilter includeProperty(String str) {
        return this;
    }

    public TokenFilter includeElement(int i) {
        return this;
    }

    public TokenFilter includeRootValue(int i) {
        return this;
    }

    public boolean includeValue(JsonParser jsonParser) throws IOException {
        return _includeScalar();
    }

    public boolean includeBoolean(boolean z) {
        return _includeScalar();
    }

    public boolean includeNull() {
        return _includeScalar();
    }

    public boolean includeString(String str) {
        return _includeScalar();
    }

    public boolean includeString(Reader reader, int i) {
        return _includeScalar();
    }

    public boolean includeNumber(int i) {
        return _includeScalar();
    }

    public boolean includeNumber(long j) {
        return _includeScalar();
    }

    public boolean includeNumber(float f) {
        return _includeScalar();
    }

    public boolean includeNumber(double d) {
        return _includeScalar();
    }

    public boolean includeNumber(BigDecimal bigDecimal) {
        return _includeScalar();
    }

    public boolean includeNumber(BigInteger bigInteger) {
        return _includeScalar();
    }

    public boolean includeBinary() {
        return _includeScalar();
    }

    public boolean includeRawValue() {
        return _includeScalar();
    }

    public boolean includeEmbeddedValue(Object obj) {
        return _includeScalar();
    }

    public boolean includeEmptyArray(boolean z) {
        return false;
    }

    public boolean includeEmptyObject(boolean z) {
        return false;
    }

    public String toString() {
        return this == INCLUDE_ALL ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }

    protected boolean _includeScalar() {
        return true;
    }
}
