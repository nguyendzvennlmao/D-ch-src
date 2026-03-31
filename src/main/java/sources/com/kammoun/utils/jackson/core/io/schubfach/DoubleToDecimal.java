package com.kammoun.utils.jackson.core.io.schubfach;

public final class DoubleToDecimal {
    static final int P = 53;
    private static final int W = 11;
    static final int Q_MIN = -1074;
    static final int Q_MAX = 971;
    static final int E_MIN = -323;
    static final int E_MAX = 309;
    static final long C_TINY = 3;
    static final int K_MIN = -324;
    static final int K_MAX = 292;
    static final int H = 17;
    private static final long C_MIN = 4503599627370496L;
    private static final int BQ_MASK = 2047;
    private static final long T_MASK = 4503599627370495L;
    private static final long MASK_63 = Long.MAX_VALUE;
    private static final int MASK_28 = 268435455;
    private static final int NON_SPECIAL = 0;
    private static final int PLUS_ZERO = 1;
    private static final int MINUS_ZERO = 2;
    private static final int PLUS_INF = 3;
    private static final int MINUS_INF = 4;
    private static final int NAN = 5;
    public final int MAX_CHARS = 24;
    private final byte[] bytes = new byte[24];
    private int index;

    private DoubleToDecimal() {
    }

    public static String toString(double d) {
        return new DoubleToDecimal().toDecimalString(d);
    }

    private String toDecimalString(double d) {
        switch (toDecimal(d)) {
            case 0:
                return charsToString();
            case 1:
                return "0.0";
            case 2:
                return "-0.0";
            case 3:
                return "Infinity";
            case 4:
                return "-Infinity";
            default:
                return "NaN";
        }
    }

    private int toDecimal(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        long j = doubleToRawLongBits & T_MASK;
        int i = ((int) (doubleToRawLongBits >>> 52)) & BQ_MASK;
        if (i >= BQ_MASK) {
            if (j != 0) {
                return 5;
            }
            return doubleToRawLongBits > 0 ? 3 : 4;
        }
        this.index = -1;
        if (doubleToRawLongBits < 0) {
            append(45);
        }
        if (i == 0) {
            return j != 0 ? j < C_TINY ? toDecimal(Q_MIN, 10 * j, -1) : toDecimal(Q_MIN, j, 0) : doubleToRawLongBits == 0 ? 1 : 2;
        }
        int i2 = 1075 - i;
        long j2 = C_MIN | j;
        if ((0 < i2) & (i2 < 53)) {
            long j3 = j2 >> i2;
            if ((j3 << i2) == j2) {
                return toChars(j3, 0);
            }
        }
        return toDecimal(-i2, j2, 0);
    }

    private int toDecimal(int i, long j, int i2) {
        long j2;
        int flog10threeQuartersPow2;
        int i3 = ((int) j) & 1;
        long j3 = j << 2;
        long j4 = j3 + 2;
        if ((j != C_MIN) || (i == Q_MIN)) {
            j2 = j3 - 2;
            flog10threeQuartersPow2 = MathUtils.flog10pow2(i);
        } else {
            j2 = j3 - 1;
            flog10threeQuartersPow2 = MathUtils.flog10threeQuartersPow2(i);
        }
        int flog2pow10 = i + MathUtils.flog2pow10(-flog10threeQuartersPow2) + 2;
        long g1 = MathUtils.g1(flog10threeQuartersPow2);
        long g0 = MathUtils.g0(flog10threeQuartersPow2);
        long rop = rop(g1, g0, j3 << flog2pow10);
        long rop2 = rop(g1, g0, j2 << flog2pow10);
        long rop3 = rop(g1, g0, j4 << flog2pow10);
        long j5 = rop >> 2;
        if (j5 >= 100) {
            long multiplyHigh = 10 * MathUtils.multiplyHigh(j5, 1844674407370955168L);
            long j6 = multiplyHigh + 10;
            boolean z = rop2 + ((long) i3) <= (multiplyHigh << 2);
            if (z != ((j6 << 2) + ((long) i3) <= rop3)) {
                return toChars(z ? multiplyHigh : j6, flog10threeQuartersPow2);
            }
        }
        long j7 = j5 + 1;
        boolean z2 = rop2 + ((long) i3) <= (j5 << 2);
        if (z2 != ((j7 << 2) + ((long) i3) <= rop3)) {
            return toChars(z2 ? j5 : j7, flog10threeQuartersPow2 + i2);
        }
        long j8 = rop - ((j5 + j7) << 1);
        return toChars((j8 < 0 || (j8 == 0 && (j5 & 1) == 0)) ? j5 : j7, flog10threeQuartersPow2 + i2);
    }

    private static long rop(long j, long j2, long j3) {
        long multiplyHigh = ((j * j3) >>> 1) + MathUtils.multiplyHigh(j2, j3);
        return (MathUtils.multiplyHigh(j, j3) + (multiplyHigh >>> 63)) | (((multiplyHigh & MASK_63) + MASK_63) >>> 63);
    }

    private int toChars(long j, int i) {
        int flog10pow2 = MathUtils.flog10pow2(64 - Long.numberOfLeadingZeros(j));
        if (j >= MathUtils.pow10(flog10pow2)) {
            flog10pow2++;
        }
        long pow10 = j * MathUtils.pow10(17 - flog10pow2);
        int i2 = i + flog10pow2;
        long multiplyHigh = MathUtils.multiplyHigh(pow10, 193428131138340668L) >>> 20;
        int i3 = (int) (pow10 - (100000000 * multiplyHigh));
        int i4 = (int) ((multiplyHigh * 1441151881) >>> 57);
        int i5 = (int) (multiplyHigh - (100000000 * i4));
        return (0 >= i2 || i2 > 7) ? (-3 >= i2 || i2 > 0) ? toChars3(i4, i5, i3, i2) : toChars2(i4, i5, i3, i2) : toChars1(i4, i5, i3, i2);
    }

    private int toChars1(int i, int i2, int i3, int i4) {
        appendDigit(i);
        int y = y(i2);
        int i5 = 1;
        while (i5 < i4) {
            int i6 = 10 * y;
            appendDigit(i6 >>> 28);
            y = i6 & MASK_28;
            i5++;
        }
        append(46);
        while (i5 <= 8) {
            int i7 = 10 * y;
            appendDigit(i7 >>> 28);
            y = i7 & MASK_28;
            i5++;
        }
        lowDigits(i3);
        return 0;
    }

    private int toChars2(int i, int i2, int i3, int i4) {
        appendDigit(0);
        append(46);
        while (i4 < 0) {
            appendDigit(0);
            i4++;
        }
        appendDigit(i);
        append8Digits(i2);
        lowDigits(i3);
        return 0;
    }

    private int toChars3(int i, int i2, int i3, int i4) {
        appendDigit(i);
        append(46);
        append8Digits(i2);
        lowDigits(i3);
        exponent(i4 - 1);
        return 0;
    }

    private void lowDigits(int i) {
        if (i != 0) {
            append8Digits(i);
        }
        removeTrailingZeroes();
    }

    private void append8Digits(int i) {
        int y = y(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 10 * y;
            appendDigit(i3 >>> 28);
            y = i3 & MASK_28;
        }
    }

    private void removeTrailingZeroes() {
        while (this.bytes[this.index] == 48) {
            this.index--;
        }
        if (this.bytes[this.index] == 46) {
            this.index++;
        }
    }

    private int y(int i) {
        return ((int) (MathUtils.multiplyHigh((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private void exponent(int i) {
        append(69);
        if (i < 0) {
            append(45);
            i = -i;
        }
        if (i < 10) {
            appendDigit(i);
            return;
        }
        if (i >= 100) {
            int i2 = (i * 1311) >>> 17;
            appendDigit(i2);
            i -= 100 * i2;
        }
        int i3 = (i * 103) >>> 10;
        appendDigit(i3);
        appendDigit(i - (10 * i3));
    }

    private void append(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.index + 1;
        this.index = i2;
        bArr[i2] = (byte) i;
    }

    private void appendDigit(int i) {
        byte[] bArr = this.bytes;
        int i2 = this.index + 1;
        this.index = i2;
        bArr[i2] = (byte) (48 + i);
    }

    private String charsToString() {
        return new String(this.bytes, 0, 0, this.index + 1);
    }
}
