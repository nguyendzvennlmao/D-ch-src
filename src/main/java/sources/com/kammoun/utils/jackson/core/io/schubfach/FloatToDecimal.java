package com.kammoun.utils.jackson.core.io.schubfach;

public final class FloatToDecimal {
    static final int P = 24;
    private static final int W = 8;
    static final int Q_MIN = -149;
    static final int Q_MAX = 104;
    static final int E_MIN = -44;
    static final int E_MAX = 39;
    static final int C_TINY = 8;
    static final int K_MIN = -45;
    static final int K_MAX = 31;
    static final int H = 9;
    private static final int C_MIN = 8388608;
    private static final int BQ_MASK = 255;
    private static final int T_MASK = 8388607;
    private static final long MASK_32 = 4294967295L;
    private static final int MASK_28 = 268435455;
    private static final int NON_SPECIAL = 0;
    private static final int PLUS_ZERO = 1;
    private static final int MINUS_ZERO = 2;
    private static final int PLUS_INF = 3;
    private static final int MINUS_INF = 4;
    private static final int NAN = 5;
    public final int MAX_CHARS = 15;
    private final byte[] bytes = new byte[15];
    private int index;

    private FloatToDecimal() {
    }

    public static String toString(float f) {
        return new FloatToDecimal().toDecimalString(f);
    }

    private String toDecimalString(float f) {
        switch (toDecimal(f)) {
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

    private int toDecimal(float f) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i = floatToRawIntBits & T_MASK;
        int i2 = (floatToRawIntBits >>> 23) & BQ_MASK;
        if (i2 >= BQ_MASK) {
            if (i != 0) {
                return 5;
            }
            return floatToRawIntBits > 0 ? 3 : 4;
        }
        this.index = -1;
        if (floatToRawIntBits < 0) {
            append(45);
        }
        if (i2 == 0) {
            return i != 0 ? i < 8 ? toDecimal(Q_MIN, 10 * i, -1) : toDecimal(Q_MIN, i, 0) : floatToRawIntBits == 0 ? 1 : 2;
        }
        int i3 = 150 - i2;
        int i4 = C_MIN | i;
        if ((0 < i3) & (i3 < P)) {
            int i5 = i4 >> i3;
            if ((i5 << i3) == i4) {
                return toChars(i5, 0);
            }
        }
        return toDecimal(-i3, i4, 0);
    }

    private int toDecimal(int i, int i2, int i3) {
        long j;
        int flog10threeQuartersPow2;
        int i4 = i2 & 1;
        long j2 = i2 << 2;
        long j3 = j2 + 2;
        if ((i2 != C_MIN) || (i == Q_MIN)) {
            j = j2 - 2;
            flog10threeQuartersPow2 = MathUtils.flog10pow2(i);
        } else {
            j = j2 - 1;
            flog10threeQuartersPow2 = MathUtils.flog10threeQuartersPow2(i);
        }
        int flog2pow10 = i + MathUtils.flog2pow10(-flog10threeQuartersPow2) + 33;
        long g1 = MathUtils.g1(flog10threeQuartersPow2) + 1;
        int rop = rop(g1, j2 << flog2pow10);
        int rop2 = rop(g1, j << flog2pow10);
        int rop3 = rop(g1, j3 << flog2pow10);
        int i5 = rop >> 2;
        if (i5 >= 100) {
            int i6 = 10 * ((int) ((i5 * 1717986919) >>> 34));
            int i7 = i6 + 10;
            boolean z = rop2 + i4 <= (i6 << 2);
            if (z != ((i7 << 2) + i4 <= rop3)) {
                return toChars(z ? i6 : i7, flog10threeQuartersPow2);
            }
        }
        int i8 = i5 + 1;
        boolean z2 = rop2 + i4 <= (i5 << 2);
        if (z2 != ((i8 << 2) + i4 <= rop3)) {
            return toChars(z2 ? i5 : i8, flog10threeQuartersPow2 + i3);
        }
        int i9 = rop - ((i5 + i8) << 1);
        return toChars((i9 < 0 || (i9 == 0 && (i5 & 1) == 0)) ? i5 : i8, flog10threeQuartersPow2 + i3);
    }

    private static int rop(long j, long j2) {
        long multiplyHigh = MathUtils.multiplyHigh(j, j2);
        return (int) ((multiplyHigh >>> 31) | (((multiplyHigh & MASK_32) + MASK_32) >>> 32));
    }

    private int toChars(int i, int i2) {
        int flog10pow2 = MathUtils.flog10pow2(32 - Integer.numberOfLeadingZeros(i));
        if (i >= MathUtils.pow10(flog10pow2)) {
            flog10pow2++;
        }
        int pow10 = (int) (i * MathUtils.pow10(9 - flog10pow2));
        int i3 = i2 + flog10pow2;
        int i4 = (int) ((pow10 * 1441151881) >>> 57);
        int i5 = pow10 - (100000000 * i4);
        return (0 >= i3 || i3 > 7) ? (-3 >= i3 || i3 > 0) ? toChars3(i4, i5, i3) : toChars2(i4, i5, i3) : toChars1(i4, i5, i3);
    }

    private int toChars1(int i, int i2, int i3) {
        appendDigit(i);
        int y = y(i2);
        int i4 = 1;
        while (i4 < i3) {
            int i5 = 10 * y;
            appendDigit(i5 >>> 28);
            y = i5 & MASK_28;
            i4++;
        }
        append(46);
        while (i4 <= 8) {
            int i6 = 10 * y;
            appendDigit(i6 >>> 28);
            y = i6 & MASK_28;
            i4++;
        }
        removeTrailingZeroes();
        return 0;
    }

    private int toChars2(int i, int i2, int i3) {
        appendDigit(0);
        append(46);
        while (i3 < 0) {
            appendDigit(0);
            i3++;
        }
        appendDigit(i);
        append8Digits(i2);
        removeTrailingZeroes();
        return 0;
    }

    private int toChars3(int i, int i2, int i3) {
        appendDigit(i);
        append(46);
        append8Digits(i2);
        removeTrailingZeroes();
        exponent(i3 - 1);
        return 0;
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
        int i2 = (i * 103) >>> 10;
        appendDigit(i2);
        appendDigit(i - (10 * i2));
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
