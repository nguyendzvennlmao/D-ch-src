package com.kammoun.utils.jackson.core.io.doubleparser;

import java.math.BigInteger;
import java.util.Map;

public class ParseDigitsTaskByteArray {
    static final boolean $assertionsDisabled;

    private ParseDigitsTaskByteArray() {
    }

    public static BigInteger parseDigitsIterative(byte[] bArr, int i, int i2) {
        if (!$assertionsDisabled && bArr == null) {
            throw new AssertionError("str==null");
        }
        int i3 = i2 - i;
        BigSignificand bigSignificand = new BigSignificand(FastIntegerMath.estimateNumBits(i3));
        int i4 = i + (i3 & 7);
        int tryToParseUpTo7Digits = FastDoubleSwar.tryToParseUpTo7Digits(bArr, i, i4);
        boolean z = tryToParseUpTo7Digits >= 0;
        bigSignificand.add(tryToParseUpTo7Digits);
        for (int i5 = i4; i5 < i2; i5 += 8) {
            int tryToParseEightDigits = FastDoubleSwar.tryToParseEightDigits(bArr, i5);
            z &= tryToParseEightDigits >= 0;
            bigSignificand.fma(100000000, tryToParseEightDigits);
        }
        if (z) {
            return bigSignificand.toBigInteger();
        }
        throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
    }

    public static BigInteger parseDigitsRecursive(byte[] bArr, int i, int i2, Map<Integer, BigInteger> map, int i3) {
        if (!$assertionsDisabled && bArr == null) {
            throw new AssertionError("str==null");
        }
        if (!$assertionsDisabled && map == null) {
            throw new AssertionError("powersOfTen==null");
        }
        if (i2 - i <= i3) {
            return parseDigitsIterative(bArr, i, i2);
        }
        int splitFloor16 = FastIntegerMath.splitFloor16(i, i2);
        return parseDigitsRecursive(bArr, splitFloor16, i2, map, i3).add(FftMultiplier.multiply(parseDigitsRecursive(bArr, i, splitFloor16, map, i3), map.get(Integer.valueOf(i2 - splitFloor16))));
    }

    static {
        $assertionsDisabled = !ParseDigitsTaskByteArray.class.desiredAssertionStatus();
    }
}
