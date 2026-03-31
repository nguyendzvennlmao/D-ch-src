package com.kammoun.utils.jackson.databind.jsonFormatVisitors;

import com.kammoun.utils.jackson.databind.jsonFormatVisitors.JsonValueFormatVisitor;

public interface JsonStringFormatVisitor extends JsonValueFormatVisitor {

    public static class Base extends JsonValueFormatVisitor.Base implements JsonStringFormatVisitor {
    }
}
