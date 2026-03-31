package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.io.doubleparser.JavaBigDecimalParser;
import java.math.BigDecimal;

public final class BigDecimalParser {
    static final int MAX_CHARS_TO_REPORT = 1000;

    private BigDecimalParser() {
    }

    public static BigDecimal parse(String str) {
        return parse(str.toCharArray());
    }

    public static BigDecimal parse(char[] cArr, int i, int i2) {
        try {
            return i2 < 500 ? new BigDecimal(cArr, i, i2) : JavaBigDecimalParser.parseBigDecimal(cArr, i, i2);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, new String(cArr, i, i2));
        }
    }

    public static BigDecimal parse(char[] cArr) {
        return parse(cArr, 0, cArr.length);
    }

    public static BigDecimal parseWithFastParser(String str) {
        try {
            return JavaBigDecimalParser.parseBigDecimal(str);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, str);
        }
    }

    public static BigDecimal parseWithFastParser(char[] cArr, int i, int i2) {
        try {
            return JavaBigDecimalParser.parseBigDecimal(cArr, i, i2);
        } catch (ArithmeticException | NumberFormatException e) {
            throw _parseFailure(e, new String(cArr, i, i2));
        }
    }

    private static NumberFormatException _parseFailure(Exception exc, String str) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Not a valid number representation";
        }
        return new NumberFormatException("Value " + _getValueDesc(str) + " can not be deserialized as `java.math.BigDecimal`, reason: " + message);
    }

    private static String _getValueDesc(String str) {
        int length = str.length();
        return length <= 1000 ? String.format("\"%s\"", str) : String.format("\"%s\" (truncated to %d chars (from %d))", str.substring(0, 1000), 1000, Integer.valueOf(length));
    }
}
