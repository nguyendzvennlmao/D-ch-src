package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.io.doubleparser.JavaBigIntegerParser;
import java.math.BigInteger;

public final class BigIntegerParser {
    private BigIntegerParser() {
    }

    public static BigInteger parseWithFastParser(String str) {
        try {
            return JavaBigIntegerParser.parseBigInteger(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Value \"" + (str.length() <= 1000 ? str : str.substring(0, 1000) + " [truncated]") + "\" can not be represented as `java.math.BigInteger`, reason: " + e.getMessage());
        }
    }

    public static BigInteger parseWithFastParser(String str, int i) {
        try {
            return JavaBigIntegerParser.parseBigInteger(str, i);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Value \"" + (str.length() <= 1000 ? str : str.substring(0, 1000) + " [truncated]") + "\" can not be represented as `java.math.BigInteger` with radix " + i + ", reason: " + e.getMessage());
        }
    }
}
