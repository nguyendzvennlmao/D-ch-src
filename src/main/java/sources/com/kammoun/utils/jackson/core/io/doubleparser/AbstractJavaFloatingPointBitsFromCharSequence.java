package com.kammoun.utils.jackson.core.io.doubleparser;

abstract class AbstractJavaFloatingPointBitsFromCharSequence extends AbstractFloatValueParser {
    private static int skipWhitespace(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    abstract long nan();

    abstract long negativeInfinity();

    private long parseDecFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        long j = 0;
        int i7 = -1;
        boolean z4 = false;
        char c = 0;
        while (i < i3) {
            c = charSequence.charAt(i);
            if (!FastDoubleSwar.isDigit(c)) {
                if (c != '.') {
                    break;
                }
                z4 |= i7 >= 0;
                i7 = i;
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
            c = charAt(charSequence, i, i3);
            boolean z5 = c == '-';
            if (z5 || c == '+') {
                i++;
                c = charAt(charSequence, i, i3);
            }
            z4 |= !FastDoubleSwar.isDigit(c);
            do {
                if (i9 < 1024) {
                    i9 = ((10 * i9) + c) - 48;
                }
                i++;
                c = charAt(charSequence, i, i3);
            } while (FastDoubleSwar.isDigit(c));
            if (z5) {
                i9 = -i9;
            }
            i5 += i9;
        }
        if ((c | '\"') == 102) {
            i++;
        }
        int skipWhitespace = skipWhitespace(charSequence, i, i3);
        if (z4 || skipWhitespace < i3 || (!z2 && i4 == 0)) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        int i10 = 0;
        if (i4 > 19) {
            j = 0;
            int i11 = i;
            while (i11 < i8) {
                char charAt = charSequence.charAt(i11);
                if (charAt != '.') {
                    if (Long.compareUnsigned(j, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j = ((10 * j) + charAt) - 48;
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
        return valueOfFloatLiteral(charSequence, i2, i3, z, j, i5, z3, i6);
    }

    public final long parseFloatingPointLiteral(CharSequence charSequence, int i, int i2) {
        int checkBounds = checkBounds(charSequence.length(), i, i2);
        int skipWhitespace = skipWhitespace(charSequence, i, checkBounds);
        if (skipWhitespace == checkBounds) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        char charAt = charSequence.charAt(skipWhitespace);
        boolean z = charAt == '-';
        if (z || charAt == '+') {
            skipWhitespace++;
            charAt = charAt(charSequence, skipWhitespace, checkBounds);
            if (charAt == 0) {
                throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
            }
        }
        if (charAt >= 'I') {
            return parseNaNOrInfinity(charSequence, skipWhitespace, checkBounds, z);
        }
        boolean z2 = charAt == '0';
        if (z2) {
            skipWhitespace++;
            if ((charAt(charSequence, skipWhitespace, checkBounds) | ' ') == 120) {
                return parseHexFloatLiteral(charSequence, skipWhitespace + 1, i, checkBounds, z);
            }
        }
        return parseDecFloatLiteral(charSequence, skipWhitespace, i, checkBounds, z, z2);
    }

    private long parseHexFloatLiteral(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        int i4;
        boolean z2;
        long j = 0;
        int i5 = 0;
        int i6 = -1;
        boolean z3 = false;
        char c = 0;
        while (i < i3) {
            c = charSequence.charAt(i);
            int lookupHex = lookupHex(c);
            if (lookupHex < 0) {
                if (lookupHex != -4) {
                    break;
                }
                z3 |= i6 >= 0;
                i6 = i;
                while (i < i3 - 8) {
                    long tryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(charSequence, i + 1);
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
            c = charAt(charSequence, i, i3);
            boolean z5 = c == '-';
            if (z5 || c == '+') {
                i++;
                c = charAt(charSequence, i, i3);
            }
            z3 |= !FastDoubleSwar.isDigit(c);
            do {
                if (i8 < 1024) {
                    i8 = ((10 * i8) + c) - 48;
                }
                i++;
                c = charAt(charSequence, i, i3);
            } while (FastDoubleSwar.isDigit(c));
            if (z5) {
                i8 = -i8;
            }
            i5 += i8;
        }
        if ((c | '\"') == 102) {
            i++;
        }
        int skipWhitespace = skipWhitespace(charSequence, i, i3);
        if (z3 || skipWhitespace < i3 || i4 == 0 || !z4) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        int i9 = 0;
        if (i4 > 16) {
            j = 0;
            skipWhitespace = i;
            while (skipWhitespace < i7) {
                int lookupHex2 = lookupHex(charSequence.charAt(skipWhitespace));
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
        return valueOfHexLiteral(charSequence, i2, i3, z, j, i5, z2, (((i6 - skipWhitespace) + i9) * 4) + i8);
    }

    private long parseNaNOrInfinity(CharSequence charSequence, int i, int i2, boolean z) {
        if (charSequence.charAt(i) == 'N') {
            if (i + 2 < i2 && charSequence.charAt(i + 1) == 'a' && charSequence.charAt(i + 2) == 'N' && skipWhitespace(charSequence, i + 3, i2) == i2) {
                return nan();
            }
        } else if (i + 7 < i2 && charSequence.charAt(i) == 'I' && charSequence.charAt(i + 1) == 'n' && charSequence.charAt(i + 2) == 'f' && charSequence.charAt(i + 3) == 'i' && charSequence.charAt(i + 4) == 'n' && charSequence.charAt(i + 5) == 'i' && charSequence.charAt(i + 6) == 't' && charSequence.charAt(i + 7) == 'y' && skipWhitespace(charSequence, i + 8, i2) == i2) {
            return z ? negativeInfinity() : positiveInfinity();
        }
        throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
    }

    abstract long positiveInfinity();

    abstract long valueOfFloatLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    abstract long valueOfHexLiteral(CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);
}
