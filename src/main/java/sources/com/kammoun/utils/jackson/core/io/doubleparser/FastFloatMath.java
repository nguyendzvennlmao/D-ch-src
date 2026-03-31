package com.kammoun.utils.jackson.core.io.doubleparser;

class FastFloatMath {
    private static final int FLOAT_EXPONENT_BIAS = 127;
    private static final int FLOAT_SIGNIFICAND_WIDTH = 24;
    private static final int FLOAT_MIN_EXPONENT_POWER_OF_TEN = -45;
    private static final int FLOAT_MAX_EXPONENT_POWER_OF_TEN = 38;
    private static final int FLOAT_MIN_EXPONENT_POWER_OF_TWO = -126;
    private static final int FLOAT_MAX_EXPONENT_POWER_OF_TWO = 127;
    private static final float[] FLOAT_POWER_OF_TEN = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    private FastFloatMath() {
    }

    public static float tryDecFloatToFloatTruncated(boolean z, long j, int i, boolean z2, int i2) {
        float tryDecToFloatWithFastAlgorithm;
        if (j == 0) {
            return z ? -0.0f : 0.0f;
        }
        if (z2) {
            if (FLOAT_MIN_EXPONENT_POWER_OF_TEN <= i2 && i2 <= FLOAT_MAX_EXPONENT_POWER_OF_TEN) {
                float tryDecToFloatWithFastAlgorithm2 = tryDecToFloatWithFastAlgorithm(z, j, i2);
                float tryDecToFloatWithFastAlgorithm3 = tryDecToFloatWithFastAlgorithm(z, j + 1, i2);
                if (!Float.isNaN(tryDecToFloatWithFastAlgorithm2) && tryDecToFloatWithFastAlgorithm3 == tryDecToFloatWithFastAlgorithm2) {
                    return tryDecToFloatWithFastAlgorithm2;
                }
            }
            tryDecToFloatWithFastAlgorithm = Float.NaN;
        } else {
            tryDecToFloatWithFastAlgorithm = (FLOAT_MIN_EXPONENT_POWER_OF_TEN > i || i > FLOAT_MAX_EXPONENT_POWER_OF_TEN) ? Float.NaN : tryDecToFloatWithFastAlgorithm(z, j, i);
        }
        return tryDecToFloatWithFastAlgorithm;
    }

    public static float tryHexFloatToFloatTruncated(boolean z, long j, int i, boolean z2, int i2) {
        int i3 = z2 ? i2 : i;
        if (FLOAT_MIN_EXPONENT_POWER_OF_TWO > i3 || i3 > 127) {
            return Float.NaN;
        }
        float fastScalb = fastScalb(((float) j) + (j < 0 ? 1.8446744E19f : 0.0f), i3);
        return z ? -fastScalb : fastScalb;
    }

    static float tryDecToFloatWithFastAlgorithm(boolean z, long j, int i) {
        if (-10 <= i && i <= 10 && Long.compareUnsigned(j, 16777215L) <= 0) {
            float f = (float) j;
            float f2 = i < 0 ? f / FLOAT_POWER_OF_TEN[-i] : f * FLOAT_POWER_OF_TEN[i];
            return z ? -f2 : f2;
        }
        long j2 = FastDoubleMath.MANTISSA_64[i - (-325)];
        long j3 = ((217706 * i) >> 16) + 127 + 64;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long unsignedMultiplyHigh = FastIntegerMath.unsignedMultiplyHigh(j << numberOfLeadingZeros, j2);
        long j4 = unsignedMultiplyHigh >>> 63;
        long j5 = unsignedMultiplyHigh >>> ((int) (j4 + 38));
        int i2 = numberOfLeadingZeros + ((int) (1 ^ j4));
        if ((unsignedMultiplyHigh & 274877906943L) == 274877906943L) {
            return Float.NaN;
        }
        if ((unsignedMultiplyHigh & 274877906943L) == 0 && (j5 & 3) == 1) {
            return Float.NaN;
        }
        long j6 = (j5 + 1) >>> 1;
        if (j6 >= 16777216) {
            j6 = 8388608;
            i2--;
        }
        long j7 = j6 & (-8388609);
        long j8 = j3 - i2;
        if (j8 < 1 || j8 > 254) {
            return Float.NaN;
        }
        return Float.intBitsToFloat((int) (j7 | (j8 << 23) | (z ? 2147483648L : 0L)));
    }

    static float fastScalb(float f, int i) {
        return f * Float.intBitsToFloat((i + 127) << 23);
    }
}
