package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.io.schubfach.DoubleToDecimal;
import com.kammoun.utils.jackson.core.io.schubfach.FloatToDecimal;

public final class NumberOutput {
    private static int MILLION = 1000000;
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    private static long MAX_INT_AS_LONG = 2147483647L;
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs;
    private static final String[] sSmallIntStrs2;

    public static int outputInt(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i2);
            }
            i2++;
            cArr[i2] = '-';
            i = -i;
        }
        if (i < MILLION) {
            if (i >= 1000) {
                int divBy1000 = divBy1000(i);
                return _full3(i - (divBy1000 * 1000), cArr, _leading3(divBy1000, cArr, i2));
            }
            if (i >= 10) {
                return _leading3(i, cArr, i2);
            }
            cArr[i2] = (char) (48 + i);
            return i2 + 1;
        }
        if (i < BILLION) {
            int divBy10002 = divBy1000(i);
            int i4 = i - (divBy10002 * 1000);
            int divBy10003 = divBy1000(divBy10002);
            return _full3(i4, cArr, _full3(divBy10002 - (divBy10003 * 1000), cArr, _leading3(divBy10003, cArr, i2)));
        }
        int i5 = i - BILLION;
        if (i5 >= BILLION) {
            i5 -= BILLION;
            int i6 = i2;
            i3 = i2 + 1;
            cArr[i6] = '2';
        } else {
            int i7 = i2;
            i3 = i2 + 1;
            cArr[i7] = '1';
        }
        return _outputFullBillion(i5, cArr, i3);
    }

    public static int outputInt(int i, byte[] bArr, int i2) {
        int i3;
        int _full3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return _outputSmallestI(bArr, i2);
            }
            i2++;
            bArr[i2] = 45;
            i = -i;
        }
        if (i < MILLION) {
            if (i >= 1000) {
                int divBy1000 = divBy1000(i);
                _full3 = _full3(i - (divBy1000 * 1000), bArr, _leading3(divBy1000, bArr, i2));
            } else if (i < 10) {
                int i4 = i2;
                _full3 = i2 + 1;
                bArr[i4] = (byte) (48 + i);
            } else {
                _full3 = _leading3(i, bArr, i2);
            }
            return _full3;
        }
        if (i < BILLION) {
            int divBy10002 = divBy1000(i);
            int i5 = i - (divBy10002 * 1000);
            int divBy10003 = divBy1000(divBy10002);
            return _full3(i5, bArr, _full3(divBy10002 - (divBy10003 * 1000), bArr, _leading3(divBy10003, bArr, i2)));
        }
        int i6 = i - BILLION;
        if (i6 >= BILLION) {
            i6 -= BILLION;
            int i7 = i2;
            i3 = i2 + 1;
            bArr[i7] = 50;
        } else {
            int i8 = i2;
            i3 = i2 + 1;
            bArr[i8] = 49;
        }
        return _outputFullBillion(i6, bArr, i3);
    }

    public static int outputLong(long j, char[] cArr, int i) {
        int _outputFullBillion;
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i);
            }
            i++;
            cArr[i] = '-';
            j = -j;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, cArr, i);
        }
        long j2 = j / BILLION_L;
        long j3 = j - (j2 * BILLION_L);
        if (j2 < BILLION_L) {
            _outputFullBillion = _outputUptoBillion((int) j2, cArr, i);
        } else {
            long j4 = j2 / BILLION_L;
            long j5 = j2 - (j4 * BILLION_L);
            _outputFullBillion = _outputFullBillion((int) j5, cArr, _leading3((int) j4, cArr, i));
        }
        return _outputFullBillion((int) j3, cArr, _outputFullBillion);
    }

    public static int outputLong(long j, byte[] bArr, int i) {
        int _outputFullBillion;
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                return _outputSmallestL(bArr, i);
            }
            i++;
            bArr[i] = 45;
            j = -j;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, bArr, i);
        }
        long j2 = j / BILLION_L;
        long j3 = j - (j2 * BILLION_L);
        if (j2 < BILLION_L) {
            _outputFullBillion = _outputUptoBillion((int) j2, bArr, i);
        } else {
            long j4 = j2 / BILLION_L;
            long j5 = j2 - (j4 * BILLION_L);
            _outputFullBillion = _outputFullBillion((int) j5, bArr, _leading3((int) j4, bArr, i));
        }
        return _outputFullBillion((int) j3, bArr, _outputFullBillion);
    }

    static int divBy1000(int i) {
        return (int) ((i * 274877907) >>> 38);
    }

    public static String toString(int i) {
        if (i < sSmallIntStrs.length) {
            if (i >= 0) {
                return sSmallIntStrs[i];
            }
            int i2 = (-i) - 1;
            if (i2 < sSmallIntStrs2.length) {
                return sSmallIntStrs2[i2];
            }
        }
        return Integer.toString(i);
    }

    public static String toString(long j) {
        return (j > 2147483647L || j < -2147483648L) ? Long.toString(j) : toString((int) j);
    }

    public static String toString(double d) {
        return toString(d, false);
    }

    public static String toString(double d, boolean z) {
        return z ? DoubleToDecimal.toString(d) : Double.toString(d);
    }

    public static String toString(float f) {
        return toString(f, false);
    }

    public static String toString(float f, boolean z) {
        return z ? FloatToDecimal.toString(f) : Float.toString(f);
    }

    public static boolean notFinite(double d) {
        return !Double.isFinite(d);
    }

    public static boolean notFinite(float f) {
        return !Float.isFinite(f);
    }

    private static int _outputUptoBillion(int i, char[] cArr, int i2) {
        if (i < MILLION) {
            if (i < 1000) {
                return _leading3(i, cArr, i2);
            }
            int divBy1000 = divBy1000(i);
            return _outputUptoMillion(cArr, i2, divBy1000, i - (divBy1000 * 1000));
        }
        int divBy10002 = divBy1000(i);
        int i3 = i - (divBy10002 * 1000);
        int divBy10003 = divBy1000(divBy10002);
        int i4 = divBy10002 - (divBy10003 * 1000);
        int _leading3 = _leading3(divBy10003, cArr, i2);
        int i5 = TRIPLET_TO_CHARS[i4];
        int i6 = _leading3 + 1;
        cArr[_leading3] = (char) (i5 >> 16);
        int i7 = i6 + 1;
        cArr[i6] = (char) ((i5 >> 8) & 127);
        int i8 = i7 + 1;
        cArr[i7] = (char) (i5 & 127);
        int i9 = TRIPLET_TO_CHARS[i3];
        int i10 = i8 + 1;
        cArr[i8] = (char) (i9 >> 16);
        int i11 = i10 + 1;
        cArr[i10] = (char) ((i9 >> 8) & 127);
        int i12 = i11 + 1;
        cArr[i11] = (char) (i9 & 127);
        return i12;
    }

    private static int _outputFullBillion(int i, char[] cArr, int i2) {
        int divBy1000 = divBy1000(i);
        int i3 = i - (divBy1000 * 1000);
        int divBy10002 = divBy1000(divBy1000);
        int i4 = TRIPLET_TO_CHARS[divBy10002];
        int i5 = i2 + 1;
        cArr[i2] = (char) (i4 >> 16);
        int i6 = i5 + 1;
        cArr[i5] = (char) ((i4 >> 8) & 127);
        int i7 = i6 + 1;
        cArr[i6] = (char) (i4 & 127);
        int i8 = TRIPLET_TO_CHARS[divBy1000 - (divBy10002 * 1000)];
        int i9 = i7 + 1;
        cArr[i7] = (char) (i8 >> 16);
        int i10 = i9 + 1;
        cArr[i9] = (char) ((i8 >> 8) & 127);
        int i11 = i10 + 1;
        cArr[i10] = (char) (i8 & 127);
        int i12 = TRIPLET_TO_CHARS[i3];
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 >> 16);
        int i14 = i13 + 1;
        cArr[i13] = (char) ((i12 >> 8) & 127);
        int i15 = i14 + 1;
        cArr[i14] = (char) (i12 & 127);
        return i15;
    }

    private static int _outputUptoBillion(int i, byte[] bArr, int i2) {
        if (i < MILLION) {
            if (i < 1000) {
                return _leading3(i, bArr, i2);
            }
            int divBy1000 = divBy1000(i);
            return _outputUptoMillion(bArr, i2, divBy1000, i - (divBy1000 * 1000));
        }
        int divBy10002 = divBy1000(i);
        int i3 = i - (divBy10002 * 1000);
        int divBy10003 = divBy1000(divBy10002);
        int i4 = divBy10002 - (divBy10003 * 1000);
        int _leading3 = _leading3(divBy10003, bArr, i2);
        int i5 = TRIPLET_TO_CHARS[i4];
        int i6 = _leading3 + 1;
        bArr[_leading3] = (byte) (i5 >> 16);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i5 >> 8);
        int i8 = i7 + 1;
        bArr[i7] = (byte) i5;
        int i9 = TRIPLET_TO_CHARS[i3];
        int i10 = i8 + 1;
        bArr[i8] = (byte) (i9 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i9 >> 8);
        int i12 = i11 + 1;
        bArr[i11] = (byte) i9;
        return i12;
    }

    private static int _outputFullBillion(int i, byte[] bArr, int i2) {
        int divBy1000 = divBy1000(i);
        int i3 = i - (divBy1000 * 1000);
        int divBy10002 = divBy1000(divBy1000);
        int i4 = divBy1000 - (divBy10002 * 1000);
        int i5 = TRIPLET_TO_CHARS[divBy10002];
        int i6 = i2 + 1;
        bArr[i2] = (byte) (i5 >> 16);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i5 >> 8);
        int i8 = i7 + 1;
        bArr[i7] = (byte) i5;
        int i9 = TRIPLET_TO_CHARS[i4];
        int i10 = i8 + 1;
        bArr[i8] = (byte) (i9 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i9 >> 8);
        int i12 = i11 + 1;
        bArr[i11] = (byte) i9;
        int i13 = TRIPLET_TO_CHARS[i3];
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 16);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 8);
        int i16 = i15 + 1;
        bArr[i15] = (byte) i13;
        return i16;
    }

    private static int _outputUptoMillion(char[] cArr, int i, int i2, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                i++;
                cArr[i] = (char) (i4 >> 16);
            }
            int i5 = i;
            i++;
            cArr[i5] = (char) ((i4 >> 8) & 127);
        }
        int i6 = i;
        int i7 = i + 1;
        cArr[i6] = (char) (i4 & 127);
        int i8 = TRIPLET_TO_CHARS[i3];
        int i9 = i7 + 1;
        cArr[i7] = (char) (i8 >> 16);
        int i10 = i9 + 1;
        cArr[i9] = (char) ((i8 >> 8) & 127);
        int i11 = i10 + 1;
        cArr[i10] = (char) (i8 & 127);
        return i11;
    }

    private static int _outputUptoMillion(byte[] bArr, int i, int i2, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                i++;
                bArr[i] = (byte) (i4 >> 16);
            }
            int i5 = i;
            i++;
            bArr[i5] = (byte) (i4 >> 8);
        }
        int i6 = i;
        int i7 = i + 1;
        bArr[i6] = (byte) i4;
        int i8 = TRIPLET_TO_CHARS[i3];
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 >> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 8);
        int i11 = i10 + 1;
        bArr[i10] = (byte) i8;
        return i11;
    }

    private static int _leading3(int i, char[] cArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        if (i > 9) {
            if (i > 99) {
                i2++;
                cArr[i2] = (char) (i3 >> 16);
            }
            int i4 = i2;
            i2++;
            cArr[i4] = (char) ((i3 >> 8) & 127);
        }
        int i5 = i2;
        int i6 = i2 + 1;
        cArr[i5] = (char) (i3 & 127);
        return i6;
    }

    private static int _leading3(int i, byte[] bArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        if (i > 9) {
            if (i > 99) {
                i2++;
                bArr[i2] = (byte) (i3 >> 16);
            }
            int i4 = i2;
            i2++;
            bArr[i4] = (byte) (i3 >> 8);
        }
        int i5 = i2;
        int i6 = i2 + 1;
        bArr[i5] = (byte) i3;
        return i6;
    }

    private static int _full3(int i, char[] cArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 >> 16);
        int i5 = i4 + 1;
        cArr[i4] = (char) ((i3 >> 8) & 127);
        int i6 = i5 + 1;
        cArr[i5] = (char) (i3 & 127);
        return i6;
    }

    private static int _full3(int i, byte[] bArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i3;
        return i6;
    }

    private static int _outputSmallestL(char[] cArr, int i) {
        int length = SMALLEST_LONG.length();
        SMALLEST_LONG.getChars(0, length, cArr, i);
        return i + length;
    }

    private static int _outputSmallestL(byte[] bArr, int i) {
        int length = SMALLEST_LONG.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i;
            i++;
            bArr[i3] = (byte) SMALLEST_LONG.charAt(i2);
        }
        return i;
    }

    private static int _outputSmallestI(char[] cArr, int i) {
        int length = SMALLEST_INT.length();
        SMALLEST_INT.getChars(0, length, cArr, i);
        return i + length;
    }

    private static int _outputSmallestI(byte[] bArr, int i) {
        int length = SMALLEST_INT.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i;
            i++;
            bArr[i3] = (byte) SMALLEST_INT.charAt(i2);
        }
        return i;
    }

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                for (int i4 = 0; i4 < 10; i4++) {
                    int i5 = i;
                    i++;
                    TRIPLET_TO_CHARS[i5] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                }
            }
        }
        sSmallIntStrs = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        sSmallIntStrs2 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }
}
