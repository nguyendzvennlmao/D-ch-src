package com.kammoun.utils.jackson.core.io.doubleparser;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

final class JavaBigDecimalFromCharSequence extends AbstractBigDecimalParser {
    public BigDecimal parseBigDecimalString(CharSequence charSequence, int i, int i2) {
        int i3;
        long j;
        int i4;
        int tryToParseFourDigits;
        try {
            int checkBounds = checkBounds(charSequence.length(), i, i2);
            if (hasManyDigits(i2)) {
                return parseBigDecimalStringWithManyDigits(charSequence, i, i2);
            }
            long j2 = 0;
            int i5 = -1;
            int i6 = i;
            char charAt = charAt(charSequence, i6, checkBounds);
            boolean z = false;
            boolean z2 = charAt == '-';
            if (z2 || charAt == '+') {
                i6++;
                charAt = charAt(charSequence, i6, checkBounds);
                if (charAt == 0) {
                    throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
                }
            }
            int i7 = i6;
            while (i6 < checkBounds) {
                charAt = charSequence.charAt(i6);
                if (!FastDoubleSwar.isDigit(charAt)) {
                    if (charAt != '.') {
                        break;
                    }
                    z |= i5 >= 0;
                    i5 = i6;
                    while (i6 < checkBounds - 4 && (tryToParseFourDigits = FastDoubleSwar.tryToParseFourDigits(charSequence, i6 + 1)) >= 0) {
                        j2 = (10000 * j2) + tryToParseFourDigits;
                        i6 += 4;
                    }
                } else {
                    j2 = ((10 * j2) + charAt) - 48;
                }
                i6++;
            }
            int i8 = i6;
            if (i5 < 0) {
                i3 = i8 - i7;
                i5 = i8;
                j = 0;
            } else {
                i3 = (i8 - i7) - 1;
                j = (i5 - i8) + 1;
            }
            long j3 = 0;
            if ((charAt | ' ') == 101) {
                i4 = i6;
                i6++;
                char charAt2 = charAt(charSequence, i6, checkBounds);
                boolean z3 = charAt2 == '-';
                if (z3 || charAt2 == '+') {
                    i6++;
                    charAt2 = charAt(charSequence, i6, checkBounds);
                }
                z |= !FastDoubleSwar.isDigit(charAt2);
                do {
                    if (j3 < 2147483647L) {
                        j3 = ((10 * j3) + charAt2) - 48;
                    }
                    i6++;
                    charAt2 = charAt(charSequence, i6, checkBounds);
                } while (FastDoubleSwar.isDigit(charAt2));
                if (z3) {
                    j3 = -j3;
                }
                j += j3;
            } else {
                i4 = checkBounds;
            }
            checkParsedBigDecimalBounds(z | (i3 == 0), i6, checkBounds, i3, j);
            if (i3 < 19) {
                return new BigDecimal(z2 ? -j2 : j2).scaleByPowerOfTen((int) j);
            }
            return valueOfBigDecimalString(charSequence, i7, i5, i5 + 1, i4, z2, (int) j);
        } catch (ArithmeticException e) {
            NumberFormatException numberFormatException = new NumberFormatException(AbstractNumberParser.VALUE_EXCEEDS_LIMITS);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    BigDecimal parseBigDecimalStringWithManyDigits(CharSequence charSequence, int i, int i2) {
        int i3;
        long j;
        int i4;
        int i5 = -1;
        int i6 = -1;
        int i7 = i + i2;
        int i8 = i;
        char charAt = charAt(charSequence, i8, i7);
        boolean z = false;
        boolean z2 = charAt == '-';
        if (z2 || charAt == '+') {
            i8++;
            charAt = charAt(charSequence, i8, i7);
            if (charAt == 0) {
                throw new NumberFormatException(AbstractNumberParser.SYNTAX_ERROR);
            }
        }
        int i9 = i8;
        while (i8 < i7 - 8 && FastDoubleSwar.isEightZeroes(charSequence, i8)) {
            i8 += 8;
        }
        while (i8 < i7 && charSequence.charAt(i8) == '0') {
            i8++;
        }
        int i10 = i8;
        while (i8 < i7 - 8 && FastDoubleSwar.isEightDigits(charSequence, i8)) {
            i8 += 8;
        }
        while (i8 < i7) {
            char charAt2 = charSequence.charAt(i8);
            charAt = charAt2;
            if (!FastDoubleSwar.isDigit(charAt2)) {
                break;
            }
            i8++;
        }
        if (charAt == '.') {
            int i11 = i8;
            i8++;
            i5 = i11;
            while (i8 < i7 - 8 && FastDoubleSwar.isEightZeroes(charSequence, i8)) {
                i8 += 8;
            }
            while (i8 < i7 && charSequence.charAt(i8) == '0') {
                i8++;
            }
            i6 = i8;
            while (i8 < i7 - 8 && FastDoubleSwar.isEightDigits(charSequence, i8)) {
                i8 += 8;
            }
            while (i8 < i7) {
                char charAt3 = charSequence.charAt(i8);
                charAt = charAt3;
                if (!FastDoubleSwar.isDigit(charAt3)) {
                    break;
                }
                i8++;
            }
        }
        int i12 = i8;
        if (i5 < 0) {
            i3 = i12 - i10;
            i5 = i12;
            i6 = i12;
            j = 0;
        } else {
            i3 = i10 == i5 ? i12 - i6 : (i12 - i10) - 1;
            j = (i5 - i12) + 1;
        }
        long j2 = 0;
        if ((charAt | ' ') == 101) {
            i4 = i8;
            i8++;
            char charAt4 = charAt(charSequence, i8, i7);
            boolean z3 = charAt4 == '-';
            if (z3 || charAt4 == '+') {
                i8++;
                charAt4 = charAt(charSequence, i8, i7);
            }
            z = !FastDoubleSwar.isDigit(charAt4);
            do {
                if (j2 < 2147483647L) {
                    j2 = ((10 * j2) + charAt4) - 48;
                }
                i8++;
                charAt4 = charAt(charSequence, i8, i7);
            } while (FastDoubleSwar.isDigit(charAt4));
            if (z3) {
                j2 = -j2;
            }
            j += j2;
        } else {
            i4 = i7;
        }
        checkParsedBigDecimalBounds(z | (i9 == i5 && i5 == i4), i8, i7, i3, j);
        return valueOfBigDecimalString(charSequence, i10, i5, i6, i4, z2, (int) j);
    }

    BigDecimal valueOfBigDecimalString(CharSequence charSequence, int i, int i2, int i3, int i4, boolean z, int i5) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger parseDigitsIterative;
        int i6 = (i4 - i2) - 1;
        int i7 = i4 - i3;
        int i8 = i2 - i;
        NavigableMap<Integer, BigInteger> navigableMap = null;
        if (i8 <= 0) {
            bigInteger = BigInteger.ZERO;
        } else if (i8 > 400) {
            navigableMap = FastIntegerMath.createPowersOfTenFloor16Map();
            FastIntegerMath.fillPowersOfNFloor16Recursive(navigableMap, i, i2);
            bigInteger = ParseDigitsTaskCharSequence.parseDigitsRecursive(charSequence, i, i2, navigableMap, 400);
        } else {
            bigInteger = ParseDigitsTaskCharSequence.parseDigitsIterative(charSequence, i, i2);
        }
        if (i6 > 0) {
            if (i7 > 400) {
                if (navigableMap == null) {
                    navigableMap = FastIntegerMath.createPowersOfTenFloor16Map();
                }
                FastIntegerMath.fillPowersOfNFloor16Recursive(navigableMap, i3, i4);
                parseDigitsIterative = ParseDigitsTaskCharSequence.parseDigitsRecursive(charSequence, i3, i4, navigableMap, 400);
            } else {
                parseDigitsIterative = ParseDigitsTaskCharSequence.parseDigitsIterative(charSequence, i3, i4);
            }
            bigInteger2 = bigInteger.signum() == 0 ? parseDigitsIterative : FftMultiplier.multiply(bigInteger, FastIntegerMath.computePowerOfTen(navigableMap, i6)).add(parseDigitsIterative);
        } else {
            bigInteger2 = bigInteger;
        }
        return new BigDecimal(z ? bigInteger2.negate() : bigInteger2, -i5);
    }
}
