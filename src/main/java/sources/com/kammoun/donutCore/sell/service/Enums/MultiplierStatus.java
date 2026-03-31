package com.kammoun.donutCore.sell.service.Enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public final class MultiplierStatus {
    public static final MultiplierStatus WORKING;
    public static final MultiplierStatus INCOMPLETE;
    public static final MultiplierStatus COMPLETE;
    private static final MultiplierStatus[] $VALUES;
    private static String edpvjmqqyt;

    public static MultiplierStatus[] values() {
        int i = 592160845 ^ (1927266182 ^ (1035414227 ^ 1945173709));
        return (MultiplierStatus[]) $VALUES.clone();
    }

    public static MultiplierStatus valueOf(String str) {
        int i = 1114990965 ^ (1351343923 ^ 1945173709);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 141706331) {
            int i2 = 779035464 ^ i;
            return (MultiplierStatus) Enum.valueOf(MultiplierStatus.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2064342554 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (30602073 ^ i)) {
                int i3 = 892115119 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 141706331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1350887176 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 867188913 ^ i;
        throw new RuntimeException();
    }

    private MultiplierStatus(java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.service.Enums.MultiplierStatus.<init>(java.lang.String, int):void");
    }

    private static MultiplierStatus[] $values() {
        int i = 931367805 ^ (964638613 ^ (1640883942 ^ 1945173709));
        MultiplierStatus[] multiplierStatusArr = new MultiplierStatus[(byte) (482452672 ^ i)];
        multiplierStatusArr[(byte) (482452675 ^ i)] = WORKING;
        multiplierStatusArr[(byte) (482452674 ^ i)] = INCOMPLETE;
        multiplierStatusArr[(byte) (482452673 ^ i)] = COMPLETE;
        return multiplierStatusArr;
    }

    static {
        int parseInt = 2137973234 ^ (1395055693 ^ Integer.parseInt("1640141264"));
        edpvjmqqyt = ByteBuffer.wrap(rtoccjzzxjhvfjy()).asCharBuffer().toString();
        int i = 506487205 ^ parseInt;
        WORKING = new MultiplierStatus(xnqmuielgi(wvsuqbygukefvwf(), i), (byte) (1404751306 ^ i));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1646891438) {
            int i2 = 153035527 ^ i;
            INCOMPLETE = new MultiplierStatus(xnqmuielgi(qxanvnunxuerody(), i2), (byte) (1520824012 ^ i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -718309782) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -718309782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1487601444 ^ i2)) {
                        break;
                    }
                }
                int i3 = 584604130 ^ i2;
                throw new IllegalAccessException("double");
            }
            i = 644370917 ^ i2;
            COMPLETE = new MultiplierStatus(xnqmuielgi(tvxmdwtgyqsguzq(), i), (byte) (2093858602 ^ i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -429000381) {
                int i4 = 1560771551 ^ i;
                $VALUES = $values();
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1646891438 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1917103645 ^ i)) {
                int i5 = 1647276659 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 240527289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (231561590 ^ i)) {
                    int i6 = 844739098 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -429000381 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2007458189 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i7 = 321551484 ^ i;
        throw new IOException();
    }

    public static String xnqmuielgi(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = edpvjmqqyt.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= bytes2.length) {
                return new String(bytes2, StandardCharsets.UTF_16BE);
            }
            bytes2[i5] = (byte) (bytes2[i5] ^ bytes[i5 % bytes.length]);
            i4 = i5 + 1;
        }
    }

    private static byte[] tvxmdwtgyqsguzq() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 0};
    }

    private static byte[] qxanvnunxuerody() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 8};
    }

    private static byte[] wvsuqbygukefvwf() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 18};
    }

    private static byte[] rtoccjzzxjhvfjy() {
        return new byte[]{50, 115, 57, 124, 56, 120, 56, 102, 48, 124, 50, 117, 57, 103, 56, 112, 49, 124, 50, 126, 56, 113, 52, Byte.MAX_VALUE, 49, 126, 49, 101, 50, 124, 56, 119, 52, 100, 49, 118, 49, 99, 48, 123, 55, 103, 49, 120, 48, Byte.MAX_VALUE, 49, 122, 48, 115};
    }
}
