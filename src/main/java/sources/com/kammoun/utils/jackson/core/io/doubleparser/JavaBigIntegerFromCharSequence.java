package com.kammoun.utils.jackson.core.io.doubleparser;

import java.math.BigInteger;

class JavaBigIntegerFromCharSequence extends AbstractBigIntegerParser {
    public BigInteger parseBigIntegerString(CharSequence charSequence, int i, int i2, int i3) throws NumberFormatException {
        try {
            int checkBounds = AbstractNumberParser.checkBounds(charSequence.length(), i, i2);
            int i4 = i;
            char charAt = charSequence.charAt(i4);
            boolean z = charAt == '-';
            if (z || charAt == '+') {
                i4++;
                if (charAt(charSequence, i4, checkBounds) == 0) {
                    throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
                }
            }
            switch (i3) {
                case 10:
                    return parseDecDigits(charSequence, i4, checkBounds, z);
                case 16:
                    return parseHexDigits(charSequence, i4, checkBounds, z);
                default:
                    return new BigInteger(charSequence.subSequence(i, i2).toString(), i3);
            }
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    private BigInteger parseDecDigits(CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (hasManyDigits(i3)) {
            return parseManyDecDigits(charSequence, i, i2, z);
        }
        int i4 = i + (i3 & 7);
        long tryToParseUpTo7Digits = FastDoubleSwar.tryToParseUpTo7Digits(charSequence, i, i4);
        boolean z2 = tryToParseUpTo7Digits >= 0;
        for (int i5 = i4; i5 < i2; i5 += 8) {
            int tryToParseEightDigits = FastDoubleSwar.tryToParseEightDigits(charSequence, i5);
            z2 &= tryToParseEightDigits >= 0;
            tryToParseUpTo7Digits = (tryToParseUpTo7Digits * 100000000) + tryToParseEightDigits;
        }
        if (z2) {
            return BigInteger.valueOf(z ? -tryToParseUpTo7Digits : tryToParseUpTo7Digits);
        }
        throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
    }

    private BigInteger parseHexDigits(CharSequence charSequence, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(charSequence, i, i2);
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
            int lookupHex = lookupHex(charSequence.charAt(skipZeroes));
            i4 = 1 + 1;
            bArr[1] = (byte) lookupHex;
            z2 = lookupHex < 0;
        }
        int i5 = skipZeroes + ((i2 - skipZeroes) & 7);
        while (skipZeroes < i5) {
            char charAt = charSequence.charAt(skipZeroes);
            char charAt2 = charSequence.charAt(skipZeroes + 1);
            int lookupHex2 = lookupHex(charAt);
            int lookupHex3 = lookupHex(charAt2);
            int i6 = i4;
            i4++;
            bArr[i6] = (byte) ((lookupHex2 << 4) | lookupHex3);
            z2 |= lookupHex3 < 0 || lookupHex2 < 0;
            skipZeroes += 2;
        }
        while (skipZeroes < i2) {
            long tryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(charSequence, skipZeroes);
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

    private BigInteger parseManyDecDigits(CharSequence charSequence, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(charSequence, i, i2);
        checkDecBigIntegerBounds(i2 - skipZeroes);
        BigInteger parseDigitsRecursive = ParseDigitsTaskCharSequence.parseDigitsRecursive(charSequence, skipZeroes, i2, FastIntegerMath.fillPowersOf10Floor16(skipZeroes, i2), 400);
        return z ? parseDigitsRecursive.negate() : parseDigitsRecursive;
    }

    private int skipZeroes(CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) == '0') {
            i++;
        }
        return i;
    }
}
