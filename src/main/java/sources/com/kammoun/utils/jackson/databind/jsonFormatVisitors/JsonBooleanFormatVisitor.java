package com.kammoun.utils.jackson.databind.jsonFormatVisitors;

import com.kammoun.utils.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor;

public interface JsonBooleanFormatVisitor extends JsonValueFormatVisitor {

    public static class Base extends JsonValueFormatVisitor.Base implements JsonBooleanFormatVisitor {
    }
}
