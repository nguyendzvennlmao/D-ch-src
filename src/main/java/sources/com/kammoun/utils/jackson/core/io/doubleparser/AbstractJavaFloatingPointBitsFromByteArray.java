package com.kammoun.utils.jackson.core.io.doubleparser;

abstract class AbstractJavaFloatingPointBitsFromByteArray extends AbstractFloatValueParser {
    private static int skipWhitespace(byte[] bArr, int i, int i2) {
        while (i < i2 && (bArr[i] & 255) <= 32) {
            i++;
        }
        return i;
    }

    abstract long nan();

    abstract long negativeInfinity();

    private long parseDecFloatLiteral(byte[] bArr, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int tryToParseFourDigits;
        long j = 0;
        int i7 = -1;
        boolean z4 = false;
        byte b = 0;
        while (i < i3) {
            b = bArr[i];
            if (!FastDoubleSwar.isDigit(b)) {
                if (b != 46) {
                    break;
                }
                z4 |= i7 >= 0;
                i7 = i;
                while (i < i3 - 4 && (tryToParseFourDigits = FastDoubleSwar.tryToParseFourDigits(bArr, i + 1)) >= 0) {
                    j = (10000 * j) + tryToParseFourDigits;
                    i += 4;
                }
            } else {
                j = ((10 * j) + b) - 48;
            }
            i++;
        }
        int i8 = i;
        if (i7 < 0) {
            i4 = i - i;
            i7 = i;
            i5 = 0;
        } else {
            i4 = (i - i) - 1;
            i5 = (i7 - i) + 1;
        }
        int i9 = 0;
        if ((b | 32) == 101) {
            i++;
            b = charAt(bArr, i, i3);
            boolean z5 = b == 45;
            if (z5 || b == 43) {
                i++;
                b = charAt(bArr, i, i3);
            }
            z4 |= !FastDoubleSwar.isDigit(b);
            do {
                if (i9 < 1024) {
                    i9 = ((10 * i9) + b) - 48;
                }
                i++;
                b = charAt(bArr, i, i3);
            } while (FastDoubleSwar.isDigit(b));
            if (z5) {
                i9 = -i9;
            }
            i5 += i9;
        }
        if ((b | 34) == 102) {
            i++;
        }
        int skipWhitespace = skipWhitespace(bArr, i, i3);
        if (z4 || skipWhitespace < i3 || (!z2 && i4 == 0)) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        int i10 = 0;
        if (i4 > 19) {
            j = 0;
            int i11 = i;
            while (i11 < i8) {
                byte b2 = bArr[i11];
                if (b2 != 46) {
                    if (Long.compareUnsigned(j, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j = ((10 * j) + b2) - 48;
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
        return valueOfFloatLiteral(bArr, i2, i3, z, j, i5, z3, i6);
    }

    public long parseFloatingPointLiteral(byte[] bArr, int i, int i2) {
        int checkBounds = checkBounds(bArr.length, i, i2);
        int skipWhitespace = skipWhitespace(bArr, i, checkBounds);
        if (skipWhitespace == checkBounds) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        byte b = bArr[skipWhitespace];
        boolean z = b == 45;
        if (z || b == 43) {
            skipWhitespace++;
            b = charAt(bArr, skipWhitespace, checkBounds);
            if (b == 0) {
                throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
            }
        }
        if (b >= 73) {
            return parseNaNOrInfinity(bArr, skipWhitespace, checkBounds, z);
        }
        boolean z2 = b == 48;
        if (z2) {
            skipWhitespace++;
            if ((charAt(bArr, skipWhitespace, checkBounds) | 32) == 120) {
                return parseHexFloatingPointLiteral(bArr, skipWhitespace + 1, i, checkBounds, z);
            }
        }
        return parseDecFloatLiteral(bArr, skipWhitespace, i, checkBounds, z, z2);
    }

    private long parseHexFloatingPointLiteral(byte[] bArr, int i, int i2, int i3, boolean z) {
        int i4;
        boolean z2;
        long j = 0;
        int i5 = 0;
        int i6 = -1;
        boolean z3 = false;
        byte b = 0;
        while (i < i3) {
            b = bArr[i];
            int lookupHex = lookupHex(b);
            if (lookupHex < 0) {
                if (lookupHex != -4) {
                    break;
                }
                z3 |= i6 >= 0;
                i6 = i;
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
        boolean z4 = (b | 32) == 112;
        if (z4) {
            i++;
            b = charAt(bArr, i, i3);
            boolean z5 = b == 45;
            if (z5 || b == 43) {
                i++;
                b = charAt(bArr, i, i3);
            }
            z3 |= !FastDoubleSwar.isDigit(b);
            do {
                if (i8 < 1024) {
                    i8 = ((10 * i8) + b) - 48;
                }
                i++;
                b = charAt(bArr, i, i3);
            } while (FastDoubleSwar.isDigit(b));
            if (z5) {
                i8 = -i8;
            }
            i5 += i8;
        }
        if ((b | 34) == 102) {
            i++;
        }
        int skipWhitespace = skipWhitespace(bArr, i, i3);
        if (z3 || skipWhitespace < i3 || i4 == 0 || !z4) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        int i9 = 0;
        if (i4 > 16) {
            j = 0;
            skipWhitespace = i;
            while (skipWhitespace < i7) {
                int lookupHex2 = lookupHex(bArr[skipWhitespace]);
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
        return valueOfHexLiteral(bArr, i2, i3, z, j, i5, z2, (((i6 - skipWhitespace) + i9) * 4) + i8);
    }

    private long parseNaNOrInfinity(byte[] bArr, int i, int i2, boolean z) {
        if (bArr[i] == 78) {
            if (i + 2 < i2 && bArr[i + 1] == 97 && bArr[i + 2] == 78 && skipWhitespace(bArr, i + 3, i2) == i2) {
                return nan();
            }
        } else if (i + 7 < i2 && FastDoubleSwar.readLongLE(bArr, i) == 8751735898823355977L && skipWhitespace(bArr, i + 8, i2) == i2) {
            return z ? negativeInfinity() : positiveInfinity();
        }
        throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
    }

    abstract long positiveInfinity();

    abstract long valueOfFloatLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    abstract long valueOfHexLiteral(byte[] bArr, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);
}
