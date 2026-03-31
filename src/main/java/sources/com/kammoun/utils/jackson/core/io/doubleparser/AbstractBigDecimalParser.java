package com.kammoun.utils.jackson.core.io.doubleparser;

abstract class AbstractBigDecimalParser extends AbstractNumberParser {
    public static final int MANY_DIGITS_THRESHOLD = 32;
    static final int RECURSION_THRESHOLD = 400;
    protected static final long MAX_EXPONENT_NUMBER = 2147483647L;
    protected static final int MAX_DIGITS_WITHOUT_LEADING_ZEROS = 646456993;

    public static boolean hasManyDigits(int i) {
        return i >= 32;
    }

    public static void checkParsedBigDecimalBounds(boolean z, int i, int i2, int i3, long j) {
        if (z || i < i2) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        if (j <= -2147483648L || j > MAX_EXPONENT_NUMBER || i3 > MAX_DIGITS_WITHOUT_LEADING_ZEROS) {
            throw new NumberFormatException(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
        }
    }
}
