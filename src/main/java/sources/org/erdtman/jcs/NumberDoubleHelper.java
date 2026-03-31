package org.erdtman.jcs;

class NumberDoubleHelper {
    static final long kSignMask = Long.MIN_VALUE;
    static final long kExponentMask = 9218868437227405312L;
    static final long kSignificandMask = 4503599627370495L;
    static final long kHiddenBit = 4503599627370496L;
    private static final int kSignificandSize = 52;
    private static final int kExponentBias = 1075;
    private static final int kDenormalExponent = -1074;
    static final boolean $assertionsDisabled;

    NumberDoubleHelper() {
    }

    static NumberDiyFp asDiyFp(long j) {
        if ($assertionsDisabled || !isSpecial(j)) {
            return new NumberDiyFp(significand(j), exponent(j));
        }
        throw new AssertionError();
    }

    public static NumberDiyFp asNormalizedDiyFp(long j) {
        long significand = significand(j);
        int exponent = exponent(j);
        if (!$assertionsDisabled && significand == 0) {
            throw new AssertionError();
        }
        while ((significand & kHiddenBit) == 0) {
            significand <<= 1;
            exponent--;
        }
        return new NumberDiyFp(significand << 11, exponent - 11);
    }

    static int exponent(long j) {
        return isDenormal(j) ? kDenormalExponent : ((int) (((j & kExponentMask) >>> 52) & 4294967295L)) - kExponentBias;
    }

    static long significand(long j) {
        long j2 = j & kSignificandMask;
        return !isDenormal(j) ? j2 + kHiddenBit : j2;
    }

    static boolean isDenormal(long j) {
        return (j & kExponentMask) == 0;
    }

    static boolean isSpecial(long j) {
        return (j & kExponentMask) == kExponentMask;
    }

    static boolean isNan(long j) {
        return (j & kExponentMask) == kExponentMask && (j & kSignificandMask) != 0;
    }

    static boolean isInfinite(long j) {
        return (j & kExponentMask) == kExponentMask && (j & kSignificandMask) == 0;
    }

    static int sign(long j) {
        return (j & kSignMask) == 0 ? 1 : -1;
    }

    public static void normalizedBoundaries(long j, NumberDiyFp numberDiyFp, NumberDiyFp numberDiyFp2) {
        NumberDiyFp asDiyFp = asDiyFp(j);
        boolean z = asDiyFp.f() == kHiddenBit;
        numberDiyFp2.setF((asDiyFp.f() << 1) + 1);
        numberDiyFp2.setE(asDiyFp.e() - 1);
        numberDiyFp2.normalize();
        if (!z || asDiyFp.e() == kDenormalExponent) {
            numberDiyFp.setF((asDiyFp.f() << 1) - 1);
            numberDiyFp.setE(asDiyFp.e() - 1);
        } else {
            numberDiyFp.setF((asDiyFp.f() << 2) - 1);
            numberDiyFp.setE(asDiyFp.e() - 2);
        }
        numberDiyFp.setF(numberDiyFp.f() << (numberDiyFp.e() - numberDiyFp2.e()));
        numberDiyFp.setE(numberDiyFp2.e());
    }

    static {
        $assertionsDisabled = !NumberDoubleHelper.class.desiredAssertionStatus();
    }
}
