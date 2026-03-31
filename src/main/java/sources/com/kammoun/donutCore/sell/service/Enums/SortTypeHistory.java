package com.kammoun.donutCore.sell.service.Enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class SortTypeHistory {
    public static final SortTypeHistory Amount;
    public static final SortTypeHistory Name;
    private static final SortTypeHistory[] $VALUES;
    private static byte[] fkowpsyjsh;

    public static SortTypeHistory[] values() {
        int i = 2123911769 ^ (781124860 ^ (1680733659 ^ 1995596788));
        return (SortTypeHistory[]) $VALUES.clone();
    }

    public static SortTypeHistory valueOf(String str) {
        int i = 792600442 ^ (1383986156 ^ 1995596788);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1569487632) {
            int i2 = 50024131 ^ i;
            return (SortTypeHistory) Enum.valueOf(SortTypeHistory.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1247153416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1585093731 ^ i)) {
                int i3 = 543797379 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1569487632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (124421183 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1231679527 ^ i;
        throw new RuntimeException();
    }

    private SortTypeHistory(String str, int i) {
        xjjlevbanitlluxr(1795792231 ^ 8868361, 377959155);
        int parseInt = 1130115820 ^ (1683852341 ^ Integer.parseInt("1510490948"));
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 37955177:
                    int i2 = 1736610982 ^ parseInt;
                    return;
                case 644922351:
                default:
                    throw new IOException();
                case 858081751:
                case 1354220110:
                    return;
            }
        }
    }

    public com.kammoun.donutCore.sell.service.Enums.SortTypeHistory next() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.service.Enums.SortTypeHistory.next():com.kammoun.donutCore.sell.service.Enums.SortTypeHistory");
    }

    private static SortTypeHistory[] $values() {
        int i = 1031891279 ^ (170380403 ^ (395025387 ^ 1995596788));
        SortTypeHistory[] sortTypeHistoryArr = new SortTypeHistory[(byte) (1457478945 ^ i)];
        sortTypeHistoryArr[(byte) (1457478947 ^ i)] = Amount;
        sortTypeHistoryArr[(byte) (1457478946 ^ i)] = Name;
        return sortTypeHistoryArr;
    }

    static {
        int parseInt = 1902541696 ^ (545289804 ^ Integer.parseInt("1510490948"));
        fkowpsyjsh = xlnugnicqccqzhk();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) != 1601336384) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1601336384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (529914014 ^ parseInt)) {
                    break;
                }
            }
            int i = 580888651 ^ parseInt;
            throw new RuntimeException("double");
        }
        int i2 = 1081919393 ^ parseInt;
        Amount = new SortTypeHistory(dvpciuiaca(tuvigkipeuyotml(), i2), (byte) (1267894569 ^ i2));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1553221962) {
            i2 = 680284181 ^ i2;
            Name = new SortTypeHistory(dvpciuiaca(oebwvhbflqduemc(), i2), (byte) (1662966077 ^ i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 418826723) {
                int i3 = 2093013360 ^ i2;
                $VALUES = $values();
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1553221962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1012221863 ^ i2)) {
                int i4 = 1627007594 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 418826723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (96966170 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 50932468 ^ i2;
        throw new IllegalAccessException();
    }

    public static String dvpciuiaca(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ fkowpsyjsh[i3 % fkowpsyjsh.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] xlnugnicqccqzhk() {
        return new byte[]{100, 13, 21, 20, 122, 77, 19, 13, 95, 24, 23, 39, 32, 76, 69, 22, 118, 16, 1, 61, 83, 98, 8, 64, 90, 101, 19, 86, 4, 125, 111, 82, 73, 104, 81, 50, 25, 22, 76, 96, 61, 125, 116, 72, 38, 73, 114, 14, 120, 24, 27, 51, 6, 32, 104, 123, 3, 51, 59, 97, 118, 40, 58, 48, 101, 21, 39, 108, 9, 27, 108, 110, 68, 35, 3, 33, 1, 58, 86, Byte.MAX_VALUE, 27, 120, 49, 7, 111, 73, 47, 53, 6, 26, 61, 23, 115, 107, 99, 17, 93, 35, 93, 18, 69, 96, 36, 85, 8, 34, 60, 94, 118, Byte.MAX_VALUE, 69, 96, 82, 40, 83, 96, 63, 96, 117, 99, 27, 91, 95, 84, 32, 6};
    }

    private static byte[] oebwvhbflqduemc() {
        return new byte[]{-85, -60, 35, 104, 67, 26, 37, 80, 104, 75};
    }

    private static byte[] tuvigkipeuyotml() {
        return new byte[]{-85, -64, 35, 98, 66, 25, 39, 87, 105, 84, 38, 123, 22, 15};
    }

    private static int xjjlevbanitlluxr(int i, int i2) {
        return i ^ i2;
    }
}
