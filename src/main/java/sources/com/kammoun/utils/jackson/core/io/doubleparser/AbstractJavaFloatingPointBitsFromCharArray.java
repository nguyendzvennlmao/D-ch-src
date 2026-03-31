package com.kammoun.utils.jackson.core.io.doubleparser;

abstract class AbstractJavaFloatingPointBitsFromCharArray extends AbstractFloatValueParser {
    private static final boolean CONDITIONAL_COMPILATION_PARSE_EIGHT_HEX_DIGITS = true;

    private static int skipWhitespace(char[] cArr, int i, int i2) {
        while (i < i2 && cArr[i] <= ' ') {
            i++;
        }
        return i;
    }

    abstract long nan();

    abstract long negativeInfinity();

    private long parseDecFloatLiteral(char[] cArr, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int tryToParseFourDigits;
        long j = 0;
        int i7 = -1;
        boolean z4 = false;
        char c = 0;
        int min = Math.min(i3 - 4, 1073741824);
        while (i < i3) {
            c = cArr[i];
            if (!FastDoubleSwar.isDigit(c)) {
                if (c != '.') {
                    break;
                }
                z4 |= i7 >= 0;
                i7 = i;
                while (i < min && (tryToParseFourDigits = FastDoubleSwar.tryToParseFourDigits(cArr, i + 1)) >= 0) {
                    j = (10000 * j) + tryToParseFourDigits;
                    i += 4;
                }
            } else {
                j = ((10 * j) + c) - 48;
            }
            i++;
        }
        int i8 = i;
        if (i7 < 0) {
            i4 = i8 - i;
            i7 = i8;
            i5 = 0;
        } else {
            i4 = (i8 - i) - 1;
            i5 = (i7 - i8) + 1;
        }
        int i9 = 0;
        if ((c | ' ') == 101) {
            i++;
            c = charAt(cArr, i, i3);
            boolean z5 = c == '-';
            if (z5 || c == '+') {
                i++;
                c = charAt(cArr, i, i3);
            }
            z4 |= !FastDoubleSwar.isDigit(c);
            do {
                if (i9 < 1024) {
                    i9 = ((10 * i9) + c) - 48;
                }
                i++;
                c = charAt(cArr, i, i3);
            } while (FastDoubleSwar.isDigit(c));
            if (z5) {
                i9 = -i9;
            }
            i5 += i9;
        }
        if ((c | '\"') == 102) {
            i++;
        }
        int skipWhitespace = skipWhitespace(cArr, i, i3);
        if (z4 || skipWhitespace < i3 || (!z2 && i4 == 0)) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        int i10 = 0;
        if (i4 > 19) {
            j = 0;
            int i11 = i;
            while (i11 < i8) {
                char c2 = cArr[i11];
                if (c2 != '.') {
                    if (Long.compareUnsigned(j, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j = ((10 * j) + c2) - 48;
                } else {
                    i10++;
                }
                i11++;
            }
            z3 = i11 < i8;
            i6 = (i7 - i11) + i10 + i9;
        } else {
            z3 = false;
            i6 = 0;
        }
        return valueOfFloatLiteral(cArr, i2, i3, z, j, i5, z3, i6);
    }

    public long parseFloatingPointLiteral(char[] cArr, int i, int i2) {
        int checkBounds = checkBounds(cArr.length, i, i2);
        int skipWhitespace = skipWhitespace(cArr, i, checkBounds);
        if (skipWhitespace == checkBounds) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        char c = cArr[skipWhitespace];
        boolean z = c == '-';
        if (z || c == '+') {
            skipWhitespace++;
            c = charAt(cArr, skipWhitespace, checkBounds);
            if (c == 0) {
                throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
            }
        }
        if (c >= 'I') {
            return parseNaNOrInfinity(cArr, skipWhitespace, checkBounds, z);
        }
        boolean z2 = c == '0';
        if (z2) {
            skipWhitespace++;
            if ((charAt(cArr, skipWhitespace, checkBounds) | ' ') == 120) {
                return parseHexFloatLiteral(cArr, skipWhitespace + 1, i, checkBounds, z);
            }
        }
        return parseDecFloatLiteral(cArr, skipWhitespace, i, checkBounds, z, z2);
    }

    private long parseHexFloatLiteral(char[] cArr, int i, int i2, int i3, boolean z) {
        int i4;
        boolean z2;
        long j = 0;
        int i5 = 0;
        int i6 = -1;
        boolean z3 = false;
        char c = 0;
        while (i < i3) {
            c = cArr[i];
            int lookupHex = lookupHex(c);
            if (lookupHex < 0) {
                if (lookupHex != -4) {
                    break;
                }
                z3 |= i6 >= 0;
                i6 = i;
                while (i < i3 - 8) {
                    long tryToParseEightHexDigits = tryToParseEightHexDigits(cArr, i + 1);
                    if (tryToParseEightHexDigits >= 0) {
                        j = (j << 32) + tryToParseEightHexDigits;
                        i += 8;
                    }
                }
            } else {
                j = (j << 4) | lookupHex;
            }
            i++;
        }
        int i7 = i;
        if (i6 < 0) {
            i4 = i7 - i;
            i6 = i7;
        } else {
            i4 = (i7 - i) - 1;
            i5 = Math.min((i6 - i) + 1, 1024) * 4;
        }
        int i8 = 0;
        boolean z4 = (c | ' ') == 112;
        if (z4) {
            i++;
            c = charAt(cArr, i, i3);
            boolean z5 = c == '-';
            if (z5 || c == '+') {
                i++;
                c = charAt(cArr, i, i3);
            }
            z3 |= !FastDoubleSwar.isDigit(c);
            do {
                if (i8 < 1024) {
                    i8 = ((10 * i8) + c) - 48;
                }
                i++;
                c = charAt(cArr, i, i3);
            } while (FastDoubleSwar.isDigit(c));
            if (z5) {
                i8 = -i8;
            }
            i5 += i8;
        }
        if ((c | '\"') == 102) {
            i++;
        }
        int skipWhitespace = skipWhitespace(cArr, i, i3);
        if (z3 || skipWhitespace < i3 || i4 == 0 || !z4) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        int i9 = 0;
        if (i4 > 16) {
            j = 0;
            skipWhitespace = i;
            while (skipWhitespace < i7) {
                int lookupHex2 = lookupHex(cArr[skipWhitespace]);
                if (lookupHex2 < 0) {
                    i9++;
                } else {
                    if (Long.compareUnsigned(j, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j = (j << 4) | lookupHex2;
                }
                skipWhitespace++;
            }
            z2 = skipWhitespace < i7;
        } else {
            z2 = false;
        }
        return valueOfHexLiteral(cArr, i2, i3, z, j, i5, z2, (((i6 - skipWhitespace) + i9) * 4) + i8);
    }

    private long parseNaNOrInfinity(char[] cArr, int i, int i2, boolean z) {
        if (cArr[i] == 'N') {
            if (i + 2 < i2 && cArr[i + 1] == 'a' && cArr[i + 2] == 'N' && skipWhitespace(cArr, i + 3, i2) == i2) {
                return nan();
            }
        } else if (i + 7 < i2 && cArr[i] == 'I' && cArr[i + 1] == 'n' && cArr[i + 2] == 'f' && cArr[i + 3] == 'i' && cArr[i + 4] == 'n' && cArr[i + 5] == 'i' && cArr[i + 6] == 't' && cArr[i + 7] == 'y' && skipWhitespace(cArr, i + 8, i2) == i2) {
            return z ? negativeInfinity() : positiveInfinity();
        }
        throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
    }

    abstract long positiveInfinity();

    private long tryToParseEightHexDigits(char[] cArr, int i) {
        return FastDoubleSwar.tryToParseEightHexDigits(cArr, i);
    }

    abstract long valueOfFloatLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    abstract long valueOfHexLiteral(char[] cArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);
}
