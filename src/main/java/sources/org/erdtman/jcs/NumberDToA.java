package org.erdtman.jcs;

import java.math.BigInteger;

class NumberDToA {
    static final int DTOSTR_STANDARD = 0;
    static final int DTOSTR_STANDARD_EXPONENTIAL = 1;
    static final int DTOSTR_FIXED = 2;
    static final int DTOSTR_EXPONENTIAL = 3;
    static final int DTOSTR_PRECISION = 4;
    private static final int Frac_mask = 1048575;
    private static final int Exp_shift = 20;
    private static final int Exp_msk1 = 1048576;
    private static final int Bias = 1023;
    private static final int P = 53;
    private static final int Exp_shift1 = 20;
    private static final int Exp_mask = 2146435072;
    private static final int Bndry_mask = 1048575;
    private static final int Log2P = 1;
    private static final int Sign_bit = Integer.MIN_VALUE;
    private static final int Exp_11 = 1072693248;
    private static final int Ten_pmax = 22;
    private static final int Quick_max = 14;
    private static final int Bletch = 16;
    private static final int Frac_mask1 = 1048575;
    private static final int Int_max = 14;
    private static final int n_bigtens = 5;
    private static final double[] tens = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
    private static final double[] bigtens = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
    private static final int[] dtoaModes = {0, 0, 3, 2, 2};

    NumberDToA() {
    }

    private static int lo0bits(int i) {
        int i2 = i;
        if ((i2 & 7) != 0) {
            if ((i2 & 1) != 0) {
                return 0;
            }
            return (i2 & 2) != 0 ? 1 : 2;
        }
        int i3 = 0;
        if ((i2 & 65535) == 0) {
            i3 = 16;
            i2 >>>= 16;
        }
        if ((i2 & 255) == 0) {
            i3 += 8;
            i2 >>>= 8;
        }
        if ((i2 & 15) == 0) {
            i3 += 4;
            i2 >>>= 4;
        }
        if ((i2 & 3) == 0) {
            i3 += 2;
            i2 >>>= 2;
        }
        if ((i2 & 1) == 0) {
            i3++;
            if (((i2 >>> 1) & 1) == 0) {
                return 32;
            }
        }
        return i3;
    }

    private static int hi0bits(int i) {
        int i2 = 0;
        if ((i & (-65536)) == 0) {
            i2 = 16;
            i <<= 16;
        }
        if ((i & (-16777216)) == 0) {
            i2 += 8;
            i <<= 8;
        }
        if ((i & (-268435456)) == 0) {
            i2 += 4;
            i <<= 4;
        }
        if ((i & (-1073741824)) == 0) {
            i2 += 2;
            i <<= 2;
        }
        if ((i & Sign_bit) == 0) {
            i2++;
            if ((i & 1073741824) == 0) {
                return 32;
            }
        }
        return i2;
    }

    private static void stuffBits(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static BigInteger d2b(double d, int[] iArr, int[] iArr2) {
        byte[] bArr;
        int i;
        int i2;
        long doubleToLongBits = Double.doubleToLongBits(d);
        int i3 = (int) (doubleToLongBits >>> 32);
        int i4 = (int) doubleToLongBits;
        int i5 = i3 & 1048575;
        int i6 = (i3 & Integer.MAX_VALUE) >>> 20;
        if (i6 != 0) {
            i5 |= Exp_msk1;
        }
        if (i4 != 0) {
            bArr = new byte[8];
            i = lo0bits(i4);
            int i7 = i4 >>> i;
            if (i != 0) {
                stuffBits(bArr, 4, i7 | (i5 << (32 - i)));
                i5 >>= i;
            } else {
                stuffBits(bArr, 4, i7);
            }
            stuffBits(bArr, 0, i5);
            i2 = i5 != 0 ? 2 : 1;
        } else {
            bArr = new byte[4];
            int lo0bits = lo0bits(i5);
            i5 >>>= lo0bits;
            stuffBits(bArr, 0, i5);
            i = lo0bits + 32;
            i2 = 1;
        }
        if (i6 != 0) {
            iArr[0] = ((i6 - 1023) - 52) + i;
            iArr2[0] = 53 - i;
        } else {
            iArr[0] = ((i6 - 1023) - 52) + 1 + i;
            iArr2[0] = (32 * i2) - hi0bits(i5);
        }
        return new BigInteger(bArr);
    }

    static int word0(double d) {
        return (int) (Double.doubleToLongBits(d) >> 32);
    }

    static double setWord0(double d, int i) {
        return Double.longBitsToDouble((i << 32) | (Double.doubleToLongBits(d) & 4294967295L));
    }

    static int word1(double d) {
        return (int) Double.doubleToLongBits(d);
    }

    static BigInteger pow5mult(BigInteger bigInteger, int i) {
        return bigInteger.multiply(BigInteger.valueOf(5L).pow(i));
    }

    static boolean roundOff(StringBuilder sb) {
        int length = sb.length();
        while (length != 0) {
            length--;
            char charAt = sb.charAt(length);
            if (charAt != '9') {
                sb.setCharAt(length, (char) (charAt + 1));
                sb.setLength(length + 1);
                return false;
            }
        }
        sb.setLength(0);
        return true;
    }

    static int JS_dtoa(double r7, int r9, boolean r10, int r11, boolean[] r12, java.lang.StringBuilder r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.erdtman.jcs.NumberDToA.JS_dtoa(double, int, boolean, int, boolean[], java.lang.StringBuilder):int");
    }

    private static void stripTrailingZeroes(StringBuilder sb) {
        int length = sb.length();
        do {
            int i = length;
            length--;
            if (i <= 0) {
                break;
            }
        } while (sb.charAt(length) == '0');
        sb.setLength(length + 1);
    }

    public static void JS_dtostr(StringBuilder sb, int i, int i2, double d) {
        boolean[] zArr = new boolean[1];
        if (i == 2 && (d >= 1.0E21d || d <= -1.0E21d)) {
            i = 0;
        }
        int JS_dtoa = JS_dtoa(d, dtoaModes[i], i >= 2, i2, zArr, sb);
        int length = sb.length();
        if (JS_dtoa != 9999) {
            boolean z = false;
            int i3 = 0;
            switch (i) {
                case 0:
                    if (JS_dtoa < -5 || JS_dtoa > 21) {
                        z = true;
                        break;
                    } else {
                        i3 = JS_dtoa;
                        break;
                    }
                    break;
                case 1:
                    z = true;
                    break;
                case 2:
                    if (i2 >= 0) {
                        i3 = JS_dtoa + i2;
                        break;
                    } else {
                        i3 = JS_dtoa;
                        break;
                    }
                case 3:
                    i3 = i2;
                    z = true;
                    break;
                case 4:
                    i3 = i2;
                    if (JS_dtoa < -5 || JS_dtoa > i2) {
                        z = true;
                        break;
                    }
                    break;
            }
            if (length < i3) {
                int i4 = i3;
                length = i3;
                do {
                    sb.append('0');
                } while (sb.length() != i4);
            }
            if (z) {
                if (length != 1) {
                    sb.insert(1, '.');
                }
                sb.append('e');
                if (JS_dtoa - 1 >= 0) {
                    sb.append('+');
                }
                sb.append(JS_dtoa - 1);
            } else if (JS_dtoa != length) {
                if (JS_dtoa > 0) {
                    sb.insert(JS_dtoa, '.');
                } else {
                    for (int i5 = 0; i5 < 1 - JS_dtoa; i5++) {
                        sb.insert(0, '0');
                    }
                    sb.insert(1, '.');
                }
            }
        }
        if (zArr[0]) {
            if (word0(d) == Sign_bit && word1(d) == 0) {
                return;
            }
            if ((word0(d) & Exp_mask) != Exp_mask || (word1(d) == 0 && (word0(d) & 1048575) == 0)) {
                sb.insert(0, '-');
            }
        }
    }
}
