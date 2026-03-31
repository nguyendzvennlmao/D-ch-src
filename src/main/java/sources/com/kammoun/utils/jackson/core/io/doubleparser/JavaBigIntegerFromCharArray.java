package com.kammoun.utils.jackson.core.io.doubleparser;

import java.math.BigInteger;

class JavaBigIntegerFromCharArray extends AbstractBigIntegerParser {
    public BigInteger parseBigIntegerString(char[] cArr, int i, int i2, int i3) throws NumberFormatException {
        try {
            int checkBounds = AbstractNumberParser.checkBounds(cArr.length, i, i2);
            int i4 = i;
            char c = cArr[i4];
            boolean z = c == '-';
            if (z || c == '+') {
                i4++;
                if (charAt(cArr, i4, checkBounds) == 0) {
                    throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
                }
            }
            switch (i3) {
                case 10:
                    return parseDecDigits(cArr, i4, checkBounds, z);
                case 16:
                    return parseHexDigits(cArr, i4, checkBounds, z);
                default:
                    return new BigInteger(new String(cArr, i, i2), i3);
            }
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    private BigInteger parseDecDigits(char[] cArr, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (hasManyDigits(i3)) {
            return parseManyDecDigits(cArr, i, i2, z);
        }
        int i4 = i + (i3 & 7);
        long tryToParseUpTo7Digits = FastDoubleSwar.tryToParseUpTo7Digits(cArr, i, i4);
        boolean z2 = tryToParseUpTo7Digits >= 0;
        for (int i5 = i4; i5 < i2; i5 += 8) {
            int tryToParseEightDigits = FastDoubleSwar.tryToParseEightDigits(cArr, i5);
            z2 &= tryToParseEightDigits >= 0;
            tryToParseUpTo7Digits = (tryToParseUpTo7Digits * 100000000) + tryToParseEightDigits;
        }
        if (z2) {
            return BigInteger.valueOf(z ? -tryToParseUpTo7Digits : tryToParseUpTo7Digits);
        }
        throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
    }

    private BigInteger parseHexDigits(char[] cArr, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(cArr, i, i2);
        int i3 = i2 - skipZeroes;
        if (i3 <= 0) {
            return BigInteger.ZERO;
        }
        checkHexBigIntegerBounds(i3);
        byte[] bArr = new byte[((i3 + 1) >> 1) + 1];
        int i4 = 1;
        boolean z2 = false;
        if ((i3 & 1) != 0) {
            skipZeroes++;
            int lookupHex = lookupHex(cArr[skipZeroes]);
            i4 = 1 + 1;
            bArr[1] = (byte) lookupHex;
            z2 = lookupHex < 0;
        }
        int i5 = skipZeroes + ((i2 - skipZeroes) & 7);
        while (skipZeroes < i5) {
            char c = cArr[skipZeroes];
            char c2 = cArr[skipZeroes + 1];
            int lookupHex2 = lookupHex(c);
            int lookupHex3 = lookupHex(c2);
            int i6 = i4;
            i4++;
            bArr[i6] = (byte) ((lookupHex2 << 4) | lookupHex3);
            z2 |= lookupHex2 < 0 || lookupHex3 < 0;
            skipZeroes += 2;
        }
        while (skipZeroes < i2) {
            long tryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(cArr, skipZeroes);
            FastDoubleSwar.writeIntBE(bArr, i4, (int) tryToParseEightHexDigits);
            z2 |= tryToParseEightHexDigits < 0;
            skipZeroes += 8;
            i4 += 4;
        }
        if (z2) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        BigInteger bigInteger = new BigInteger(bArr);
        return z ? bigInteger.negate() : bigInteger;
    }

    private BigInteger parseManyDecDigits(char[] cArr, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(cArr, i, i2);
        checkDecBigIntegerBounds(i2 - skipZeroes);
        BigInteger parseDigitsRecursive = ParseDigitsTaskCharArray.parseDigitsRecursive(cArr, skipZeroes, i2, FastIntegerMath.fillPowersOf10Floor16(skipZeroes, i2), 400);
        return z ? parseDigitsRecursive.negate() : parseDigitsRecursive;
    }

    private int skipZeroes(char[] cArr, int i, int i2) {
        while (i < i2 - 8 && FastDoubleSwar.isEightZeroes(cArr, i)) {
            i += 8;
        }
        while (i < i2 && cArr[i] == '0') {
            i++;
        }
        return i;
    }
}
