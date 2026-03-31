package com.kammoun.utils.jackson.core.io.doubleparser;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

class JavaBigIntegerFromByteArray extends AbstractBigIntegerParser {
    public BigInteger parseBigIntegerString(byte[] bArr, int i, int i2, int i3) throws NumberFormatException {
        try {
            int checkBounds = AbstractNumberParser.checkBounds(bArr.length, i, i2);
            int i4 = i;
            byte b = bArr[i4];
            boolean z = b == 45;
            if (z || b == 43) {
                i4++;
                if (charAt(bArr, i4, checkBounds) == 0) {
                    throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
                }
            }
            switch (i3) {
                case 10:
                    return parseDecDigits(bArr, i4, checkBounds, z);
                case 16:
                    return parseHexDigits(bArr, i4, checkBounds, z);
                default:
                    return new BigInteger(new String(bArr, i, i2, StandardCharsets.ISO_8859_1), i3);
            }
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    private BigInteger parseDecDigits(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - i;
        if (hasManyDigits(i3)) {
            return parseManyDecDigits(bArr, i, i2, z);
        }
        int i4 = i + (i3 & 7);
        long tryToParseUpTo7Digits = FastDoubleSwar.tryToParseUpTo7Digits(bArr, i, i4);
        boolean z2 = tryToParseUpTo7Digits >= 0;
        for (int i5 = i4; i5 < i2; i5 += 8) {
            int tryToParseEightDigitsUtf8 = FastDoubleSwar.tryToParseEightDigitsUtf8(bArr, i5);
            z2 &= tryToParseEightDigitsUtf8 >= 0;
            tryToParseUpTo7Digits = (tryToParseUpTo7Digits * 100000000) + tryToParseEightDigitsUtf8;
        }
        if (z2) {
            return BigInteger.valueOf(z ? -tryToParseUpTo7Digits : tryToParseUpTo7Digits);
        }
        throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
    }

    private BigInteger parseHexDigits(byte[] bArr, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(bArr, i, i2);
        int i3 = i2 - skipZeroes;
        if (i3 <= 0) {
            return BigInteger.ZERO;
        }
        checkHexBigIntegerBounds(i3);
        byte[] bArr2 = new byte[((i3 + 1) >> 1) + 1];
        int i4 = 1;
        boolean z2 = false;
        if ((i3 & 1) != 0) {
            skipZeroes++;
            int lookupHex = lookupHex(bArr[skipZeroes]);
            i4 = 1 + 1;
            bArr2[1] = (byte) lookupHex;
            z2 = lookupHex < 0;
        }
        int i5 = skipZeroes + ((i2 - skipZeroes) & 7);
        while (skipZeroes < i5) {
            byte b = bArr[skipZeroes];
            byte b2 = bArr[skipZeroes + 1];
            int lookupHex2 = lookupHex(b);
            int lookupHex3 = lookupHex(b2);
            int i6 = i4;
            i4++;
            bArr2[i6] = (byte) ((lookupHex2 << 4) | lookupHex3);
            z2 |= lookupHex2 < 0 || lookupHex3 < 0;
            skipZeroes += 2;
        }
        while (skipZeroes < i2) {
            long tryToParseEightHexDigits = FastDoubleSwar.tryToParseEightHexDigits(bArr, skipZeroes);
            FastDoubleSwar.writeIntBE(bArr2, i4, (int) tryToParseEightHexDigits);
            z2 |= tryToParseEightHexDigits < 0;
            skipZeroes += 8;
            i4 += 4;
        }
        if (z2) {
            throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
        }
        BigInteger bigInteger = new BigInteger(bArr2);
        return z ? bigInteger.negate() : bigInteger;
    }

    private BigInteger parseManyDecDigits(byte[] bArr, int i, int i2, boolean z) {
        int skipZeroes = skipZeroes(bArr, i, i2);
        checkDecBigIntegerBounds(i2 - skipZeroes);
        BigInteger parseDigitsRecursive = ParseDigitsTaskByteArray.parseDigitsRecursive(bArr, skipZeroes, i2, FastIntegerMath.fillPowersOf10Floor16(skipZeroes, i2), 400);
        return z ? parseDigitsRecursive.negate() : parseDigitsRecursive;
    }

    private int skipZeroes(byte[] bArr, int i, int i2) {
        while (i < i2 - 8 && FastDoubleSwar.isEightZeroes(bArr, i)) {
            i += 8;
        }
        while (i < i2 && bArr[i] == 48) {
            i++;
        }
        return i;
    }
}
