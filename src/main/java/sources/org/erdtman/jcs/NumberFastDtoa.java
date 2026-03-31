package org.erdtman.jcs;

import com.kammoun.donutCore.sell.model.SellLevelData;
import com.kammoun.utils.jackson.core.io.doubleparser.AbstractBigDecimalParser;
import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;

class NumberFastDtoa {
    static final int kFastDtoaMaximalLength = 17;
    static final int minimal_target_exponent = -60;
    static final int maximal_target_exponent = -32;
    static final int kTen4 = 10000;
    static final int kTen5 = 100000;
    static final int kTen6 = 1000000;
    static final int kTen7 = 10000000;
    static final int kTen8 = 100000000;
    static final int kTen9 = 1000000000;
    static final boolean $assertionsDisabled;

    NumberFastDtoa() {
    }

    static boolean roundWeed(NumberFastDtoaBuilder numberFastDtoaBuilder, long j, long j2, long j3, long j4, long j5) {
        long j6 = j - j5;
        long j7 = j + j5;
        while (j3 < j6 && j2 - j3 >= j4 && (j3 + j4 < j6 || j6 - j3 >= (j3 + j4) - j6)) {
            numberFastDtoaBuilder.decreaseLast();
            j3 += j4;
        }
        return (j3 >= j7 || j2 - j3 < j4 || (j3 + j4 >= j7 && j7 - j3 <= (j3 + j4) - j7)) && 2 * j5 <= j3 && j3 <= j2 - (4 * j5);
    }

    static long biggestPowerTen(int i, int i2) {
        int i3;
        int i4;
        switch (i2) {
            case 30:
            case 31:
            case AbstractBigDecimalParser.MANY_DIGITS_THRESHOLD:
                if (kTen9 <= i) {
                    i3 = kTen9;
                    i4 = 9;
                    break;
                }
            case 27:
            case 28:
            case 29:
                if (kTen8 <= i) {
                    i3 = kTen8;
                    i4 = 8;
                    break;
                }
            case 24:
            case 25:
            case 26:
                if (kTen7 <= i) {
                    i3 = kTen7;
                    i4 = 7;
                    break;
                }
            case SellLevelData.PROGRESS_BAR_LENGTH:
            case 21:
            case 22:
            case 23:
                if (kTen6 <= i) {
                    i3 = kTen6;
                    i4 = 6;
                    break;
                }
            case 17:
            case 18:
            case 19:
                if (kTen5 <= i) {
                    i3 = kTen5;
                    i4 = 5;
                    break;
                }
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
                if (kTen4 <= i) {
                    i3 = kTen4;
                    i4 = 4;
                    break;
                }
            case 10:
            case 11:
            case 12:
            case StdKeyDeserializer.TYPE_URI:
                if (1000 <= i) {
                    i3 = 1000;
                    i4 = 3;
                    break;
                }
            case 7:
            case 8:
            case 9:
                if (100 <= i) {
                    i3 = 100;
                    i4 = 2;
                    break;
                }
            case 4:
            case 5:
            case 6:
                if (10 <= i) {
                    i3 = 10;
                    i4 = 1;
                    break;
                }
            case 1:
            case 2:
            case 3:
                if (1 <= i) {
                    i3 = 1;
                    i4 = 0;
                    break;
                }
            case 0:
                i3 = 0;
                i4 = -1;
                break;
            default:
                i3 = 0;
                i4 = 0;
                break;
        }
        return (i3 << 32) | (4294967295L & i4);
    }

    private static boolean uint64_lte(long j, long j2) {
        if (j != j2) {
            if (!(((j < j2) ^ (j < 0)) ^ (j2 < 0))) {
                return false;
            }
        }
        return true;
    }

    static boolean digitGen(NumberDiyFp numberDiyFp, NumberDiyFp numberDiyFp2, NumberDiyFp numberDiyFp3, NumberFastDtoaBuilder numberFastDtoaBuilder, int i) {
        if (!$assertionsDisabled && (numberDiyFp.e() != numberDiyFp2.e() || numberDiyFp2.e() != numberDiyFp3.e())) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && !uint64_lte(numberDiyFp.f() + 1, numberDiyFp3.f() - 1)) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && (minimal_target_exponent > numberDiyFp2.e() || numberDiyFp2.e() > maximal_target_exponent)) {
            throw new AssertionError();
        }
        long j = 1;
        NumberDiyFp numberDiyFp4 = new NumberDiyFp(numberDiyFp.f() - 1, numberDiyFp.e());
        NumberDiyFp numberDiyFp5 = new NumberDiyFp(numberDiyFp3.f() + 1, numberDiyFp3.e());
        NumberDiyFp minus = NumberDiyFp.minus(numberDiyFp5, numberDiyFp4);
        NumberDiyFp numberDiyFp6 = new NumberDiyFp(1 << (-numberDiyFp2.e()), numberDiyFp2.e());
        int f = (int) ((numberDiyFp5.f() >>> (-numberDiyFp6.e())) & 4294967295L);
        long f2 = numberDiyFp5.f() & (numberDiyFp6.f() - 1);
        long biggestPowerTen = biggestPowerTen(f, 64 - (-numberDiyFp6.e()));
        int i2 = (int) ((biggestPowerTen >>> 32) & 4294967295L);
        int i3 = ((int) (biggestPowerTen & 4294967295L)) + 1;
        while (i3 > 0) {
            numberFastDtoaBuilder.append((char) (48 + (f / i2)));
            f %= i2;
            i3--;
            long j2 = (f << (-numberDiyFp6.e())) + f2;
            if (j2 < minus.f()) {
                numberFastDtoaBuilder.point = (numberFastDtoaBuilder.end - i) + i3;
                return roundWeed(numberFastDtoaBuilder, NumberDiyFp.minus(numberDiyFp5, numberDiyFp2).f(), minus.f(), j2, i2 << (-numberDiyFp6.e()), 1L);
            }
            i2 /= 10;
        }
        do {
            long j3 = f2 * 5;
            j *= 5;
            minus.setF(minus.f() * 5);
            minus.setE(minus.e() + 1);
            numberDiyFp6.setF(numberDiyFp6.f() >>> 1);
            numberDiyFp6.setE(numberDiyFp6.e() + 1);
            numberFastDtoaBuilder.append((char) (48 + ((int) ((j3 >>> (-numberDiyFp6.e())) & 4294967295L))));
            f2 = j3 & (numberDiyFp6.f() - 1);
            i3--;
        } while (f2 >= minus.f());
        numberFastDtoaBuilder.point = (numberFastDtoaBuilder.end - i) + i3;
        return roundWeed(numberFastDtoaBuilder, NumberDiyFp.minus(numberDiyFp5, numberDiyFp2).f() * j, minus.f(), f2, numberDiyFp6.f(), j);
    }

    static boolean grisu3(double d, NumberFastDtoaBuilder numberFastDtoaBuilder) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        NumberDiyFp asNormalizedDiyFp = NumberDoubleHelper.asNormalizedDiyFp(doubleToLongBits);
        NumberDiyFp numberDiyFp = new NumberDiyFp();
        NumberDiyFp numberDiyFp2 = new NumberDiyFp();
        NumberDoubleHelper.normalizedBoundaries(doubleToLongBits, numberDiyFp, numberDiyFp2);
        if (!$assertionsDisabled && numberDiyFp2.e() != asNormalizedDiyFp.e()) {
            throw new AssertionError();
        }
        NumberDiyFp numberDiyFp3 = new NumberDiyFp();
        int cachedPower = NumberCachedPowers.getCachedPower(asNormalizedDiyFp.e() + 64, minimal_target_exponent, maximal_target_exponent, numberDiyFp3);
        if (!$assertionsDisabled && (minimal_target_exponent > asNormalizedDiyFp.e() + numberDiyFp3.e() + 64 || maximal_target_exponent < asNormalizedDiyFp.e() + numberDiyFp3.e() + 64)) {
            throw new AssertionError();
        }
        NumberDiyFp times = NumberDiyFp.times(asNormalizedDiyFp, numberDiyFp3);
        if ($assertionsDisabled || times.e() == numberDiyFp2.e() + numberDiyFp3.e() + 64) {
            return digitGen(NumberDiyFp.times(numberDiyFp, numberDiyFp3), times, NumberDiyFp.times(numberDiyFp2, numberDiyFp3), numberFastDtoaBuilder, cachedPower);
        }
        throw new AssertionError();
    }

    public static boolean dtoa(double d, NumberFastDtoaBuilder numberFastDtoaBuilder) {
        if (!$assertionsDisabled && d <= 0.0d) {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && Double.isNaN(d)) {
            throw new AssertionError();
        }
        if ($assertionsDisabled || !Double.isInfinite(d)) {
            return grisu3(d, numberFastDtoaBuilder);
        }
        throw new AssertionError();
    }

    public static String numberToString(double d) {
        NumberFastDtoaBuilder numberFastDtoaBuilder = new NumberFastDtoaBuilder();
        if (numberToString(d, numberFastDtoaBuilder)) {
            return numberFastDtoaBuilder.format();
        }
        return null;
    }

    public static boolean numberToString(double d, NumberFastDtoaBuilder numberFastDtoaBuilder) {
        numberFastDtoaBuilder.reset();
        if (d < 0.0d) {
            numberFastDtoaBuilder.append('-');
            d = -d;
        }
        return dtoa(d, numberFastDtoaBuilder);
    }

    static {
        $assertionsDisabled = !NumberFastDtoa.class.desiredAssertionStatus();
    }
}
