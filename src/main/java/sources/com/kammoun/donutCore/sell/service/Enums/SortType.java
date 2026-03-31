package com.kammoun.donutCore.sell.service.Enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.Generated;

public final class SortType {
    public static final SortType PRICE_HIGH;
    public static final SortType PRICE_LOW;
    public static final SortType NAME_ASC;
    public static final SortType NAME_DESC;
    private final String displayName;
    private final List<String> lore;
    private static final SortType[] $VALUES;

    public static SortType[] values() {
        int i = 278539737 ^ (747445310 ^ (1510942185 ^ 1458802030));
        return (SortType[]) $VALUES.clone();
    }

    public static SortType valueOf(String str) {
        int i = 854132556 ^ (113818384 ^ 1458802030);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 378636691) {
            int i2 = 141827102 ^ i;
            return (SortType) Enum.valueOf(SortType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 378636691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (550464833 ^ i)) {
                int i3 = 1323119583 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1429301603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (511581981 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1083360412 ^ i;
        throw new IOException();
    }

    private SortType(java.lang.String r5, int r6, java.lang.String r7, java.util.List r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.service.Enums.SortType.<init>(java.lang.String, int, java.lang.String, java.util.List):void");
    }

    public SortType next() {
        int i = 845177645 ^ (113805377 ^ 1181457212);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1776582013) {
            i = 2136506295 ^ i;
            SortType[] values = values();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1826127672) {
                return values[(ordinal() + ((byte) (1459625737 ^ (1520111855 ^ i)))) % values.length];
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1776582013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1915371628 ^ i)) {
                int i2 = 2045361723 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1207895998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (977510914 ^ i)) {
                    int i3 = 711458310 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1826127672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (670147370 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i4 = 1719512442 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getDisplayName() {
        int i = 670988373 ^ (727085923 ^ 1181457212);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1444708434) {
            int i2 = 2108596393 ^ i;
            return this.displayName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1444708434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1426494944 ^ i)) {
                int i3 = 2107633533 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1150712551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (975075082 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 88291272 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public List<String> getLore() {
        int i = 373847503 ^ (117710633 ^ 1181457212);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1187017006) {
            int i2 = 1312814178 ^ i;
            return this.lore;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1187017006 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1581446013 ^ i)) {
                int i3 = 1353258530 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -926929472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (250412069 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 736830298 ^ i;
        throw new IOException();
    }

    private static SortType[] $values() {
        int i = 2112405363 ^ (398419401 ^ (1571103245 ^ 1458802030));
        SortType[] sortTypeArr = new SortType[(byte) (1627485661 ^ i)];
        sortTypeArr[(byte) (1627485657 ^ i)] = PRICE_HIGH;
        sortTypeArr[(byte) (1627485656 ^ i)] = PRICE_LOW;
        sortTypeArr[(byte) (1627485659 ^ i)] = NAME_ASC;
        sortTypeArr[(byte) (1627485658 ^ i)] = NAME_DESC;
        return sortTypeArr;
    }

    static {
        int parseInt = 627330322 ^ (1612790987 ^ (2085754271 ^ Integer.parseInt("1099034200")));
        PRICE_HIGH = new SortType(hthbcrnovw(nrjjnxnnfmdpagx(), twgywxlrndlvlaq(), parseInt), (byte) (2023131678 ^ parseInt), hthbcrnovw(ghmiiilywwvydcl(), twgywxlrndlvlaq(), parseInt), List.of(hthbcrnovw(kpchuutpkrtmdhw(), twgywxlrndlvlaq(), parseInt), hthbcrnovw(gksqbcatxiyvvjf(), twgywxlrndlvlaq(), parseInt), hthbcrnovw(kgwukfckwvzvwbx(), twgywxlrndlvlaq(), parseInt), hthbcrnovw(kozfwglguuxzaal(), twgywxlrndlvlaq(), parseInt)));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -994815757) {
            int i = 683473850 ^ parseInt;
            PRICE_LOW = new SortType(hthbcrnovw(jchykyjskqfkrze(), twgywxlrndlvlaq(), i), (byte) (1344958885 ^ i), hthbcrnovw(vojsmqbqfgeehrp(), twgywxlrndlvlaq(), i), List.of(hthbcrnovw(orhzapyahatqkhi(), twgywxlrndlvlaq(), i), hthbcrnovw(etcilmougtadiyy(), twgywxlrndlvlaq(), i), hthbcrnovw(urqekzoljwdrndf(), twgywxlrndlvlaq(), i), hthbcrnovw(wvrllwezvaornki(), twgywxlrndlvlaq(), i)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -2125230814) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2125230814 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1908255419 ^ i)) {
                        break;
                    }
                }
                int i2 = 146554941 ^ i;
                throw new RuntimeException("double");
            }
            parseInt = 2107768142 ^ i;
            NAME_ASC = new SortType(hthbcrnovw(qucoejjrocbczxn(), twgywxlrndlvlaq(), parseInt), (byte) (764120296 ^ parseInt), hthbcrnovw(thlolxkpfzzzcwf(), twgywxlrndlvlaq(), parseInt), List.of(hthbcrnovw(ubyxoozyetyubag(), twgywxlrndlvlaq(), parseInt), hthbcrnovw(ghixzvvpvvdlfbt(), twgywxlrndlvlaq(), parseInt), hthbcrnovw(rmfoqrszhfgtefc(), twgywxlrndlvlaq(), parseInt), hthbcrnovw(ydwqtcsboqincby(), twgywxlrndlvlaq(), parseInt)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1817995089) {
                int i3 = 1171370370 ^ parseInt;
                NAME_DESC = new SortType(hthbcrnovw(qvhfkweogmzgpae(), twgywxlrndlvlaq(), i3), (byte) (1750744427 ^ i3), hthbcrnovw(umyzrteurhmcgss(), twgywxlrndlvlaq(), i3), List.of(hthbcrnovw(pmjpecpmedfwlzo(), twgywxlrndlvlaq(), i3), hthbcrnovw(ouvbxwgrnqdeaxg(), twgywxlrndlvlaq(), i3), hthbcrnovw(fjocvdlquurjyon(), twgywxlrndlvlaq(), i3), hthbcrnovw(avcwipxuqfxkjnv(), twgywxlrndlvlaq(), i3)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1121053507) {
                    int i4 = 852550022 ^ i3;
                    $VALUES = $values();
                    return;
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1121053507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1023878014 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 732721402 ^ i3;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1817995089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (790526989 ^ parseInt)) {
                int i6 = 1346228292 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -994815757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (549475782 ^ parseInt)) {
                    int i7 = 1920851827 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -732502158 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (551687741 ^ parseInt)) {
                        break;
                    }
                }
            }
        }
        int i8 = 470384997 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String hthbcrnovw(byte[] bArr, byte[] bArr2, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3 % bArr2.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] twgywxlrndlvlaq() {
        return new byte[]{44, 4, 45, 86, 73, 125, 107, 3, 58, 16, 43, 125, 39, 87, 27, 68, 5, 14, 99, 33, 89, 114, 85, 118, 11, 94, 14, 124, 57, 20, 32, 52, 11, 16, 15, 4, 87, 56, 33, 118, 48, 33, 100, 3, 26, 105, 37, 118, 45, 77, 112, 102, 10, 79, 11, 6, 105, 72, 80, 14, 51, 34, 39, 95, 89, 7, 6, 56, 17, 110, 59, 32, 96, 37, 68, 116};
    }

    private static byte[] nrjjnxnnfmdpagx() {
        return new byte[]{-32, -53, 31, 53, 120, 28, 90, 124, 13, 107, 25, 8, 21, 59, 42, 63, 52, 113, 84, 94, 107, 10};
    }

    private static byte[] ghmiiilywwvydcl() {
        return new byte[]{-32, -53, 31, 45, 120, 39, 90, 82, 13, 64, 25, 40, 21, 23, 42, 3, 52, 24, 84, 73, 107, 48, 103, 44, 58, 14, 63, 47};
    }

    private static byte[] kpchuutpkrtmdhw() {
        return new byte[]{-32, -53, 31, 67, 120, 109, 90, 5, 13, 24, 25, 43, 21, 93, 42, 79, 52, 14, 116, 59, 107, 98, 103, 13, 58, 4, 63, 45, 14, 68, 18, 97, 57, 80, 62, 67, 102, 46, 22, 30, 2, 99, 86, 89, 43, 57, 20, 37};
    }

    private static byte[] gksqbcatxiyvvjf() {
        return new byte[]{-32, -53, 31, 67, 120, 40, 122, 23, 13, 8, 25, 1, 21, 11, 42, 0, 52, 93, 84, 106, 107, 54, 103, 101, 58, 61, 63, 56, 14, 69, 18, 103, 57, 70};
    }

    private static byte[] kgwukfckwvzvwbx() {
        return new byte[]{-32, -53, 31, 67, 120, 40, 122, 23, 13, 8, 25, 3, 21, 5, 42, 26, 52, 93, 84, 57, 107, 3, 103, 104, 58, 55};
    }

    private static byte[] kozfwglguuxzaal() {
        return new byte[]{-32, -53, 31, 67, 120, 40, 122, 23, 13, 8, 25, 3, 21, 5, 42, 26, 52, 93, 84, 57, 107, 24, 103, 104, 58, 44};
    }

    private static byte[] jchykyjskqfkrze() {
        return new byte[]{-29, -56, 25, 50, 112, 26, 83, 114, 2, 103, 26, 11, 19, 60, 34, 61, 61, 121, 91, 66};
    }

    private static byte[] vojsmqbqfgeehrp() {
        return new byte[]{-29, -56, 25, 46, 112, 39, 83, 76, 2, 65, 26, 61, 19, 23, 34, 81, 61, 102, 91, 103, 104, 40, 97, 33, 50, 14};
    }

    private static byte[] orhzapyahatqkhi() {
        return new byte[]{-29, -56, 25, 68, 112, 46, 115, 25, 2, 4, 26, 6, 19, 10, 34, 22, 61, 94, 91, 112, 104, 50, 97, 54, 50, 75, 54, 20, 1, 82, 17, 110, 63, 71, 54, 84};
    }

    private static byte[] etcilmougtadiyy() {
        return new byte[]{-29, -56, 25, 68, 112, 107, 83, 11, 2, 20, 26, 40, 19, 90, 34, 73, 61, 0, 123, 55, 104, 97, 97, 14, 50, 4, 54, 51, 1, 69, 17, 116, 63, 80, 54, 17, 111, 80, 25, 48, 1, 123, 80, 84, 35, 57};
    }

    private static byte[] urqekzoljwdrndf() {
        return new byte[]{-29, -56, 25, 68, 112, 46, 115, 25, 2, 4, 26, 0, 19, 2, 34, 28, 61, 83, 91, 53, 104, 0, 97, 111, 50, 49};
    }

    private static byte[] wvrllwezvaornki() {
        return new byte[]{-29, -56, 25, 68, 112, 46, 115, 25, 2, 4, 26, 0, 19, 2, 34, 28, 61, 83, 91, 53, 104, 27, 97, 111, 50, 42};
    }

    private static byte[] qucoejjrocbczxn() {
        return new byte[]{-27, -51, 25, 41, 123, 12, 89, 119, 2, 98, 29, 22, 22, 36, 43, 37, 60, 117};
    }

    private static byte[] thlolxkpfzzzcwf() {
        return new byte[]{-27, -51, 25, 41, 123, 44, 89, 87, 2, 66, 29, 105, 22, 36, 43, 91, 60, 108};
    }

    private static byte[] ubyxoozyetyubag() {
        return new byte[]{-27, -51, 25, 65, 123, 43, 121, 24, 2, 7, 29, 1, 22, 12, 43, 17, 60, 94, 84, 114, 109, 48, 103, 50, 57, 71, 54, 27, 15, 82, 17, 111, 59, 65, 54, 89};
    }

    private static byte[] ghixzvvpvvdlfbt() {
        return new byte[]{-27, -51, 25, 65, 123, 43, 121, 24, 2, 7, 29, 5, 22, 10, 43, 1, 60, 83, 84, 100, 109, 55, 103, 102, 57, 55, 54, 57, 15, 73, 17, 101, 59, 71};
    }

    private static byte[] rmfoqrszhfgtefc() {
        return new byte[]{-27, -51, 25, 65, 123, 110, 89, 10, 2, 23, 29, 47, 22, 92, 43, 78, 60, 0, 116, 53, 109, 99, 103, 8, 57, 6, 54, 38, 15, 69, 17, 38, 59, 99, 54, 17, 96, 84};
    }

    private static byte[] ydwqtcsboqincby() {
        return new byte[]{-27, -51, 25, 65, 123, 43, 121, 24, 2, 7, 29, 7, 22, 4, 43, 27, 60, 83, 84, 55, 109, 25, 103, 107, 57, 38};
    }

    private static byte[] qvhfkweogmzgpae() {
        return new byte[]{-29, -52, 24, 40, 126, 8, 95, 122, 8, 97, 26, 21, 18, 35, 44, 53, 49, 105, 81, 86};
    }

    private static byte[] umyzrteurhmcgss() {
        return new byte[]{-29, -52, 24, 40, 126, 40, 95, 90, 8, 65, 26, 106, 18, 61, 44, 93, 49, 123};
    }

    private static byte[] pmjpecpmedfwlzo() {
        return new byte[]{-29, -52, 24, 64, 126, 47, Byte.MAX_VALUE, 21, 8, 4, 26, 2, 18, 14, 44, 23, 49, 82, 81, 112, 104, 54, 96, 50, 60, 74, 58, 24, 11, 82, 17, 106, 62, 67, 56, 85};
    }

    private static byte[] ouvbxwgrnqdeaxg() {
        return new byte[]{-29, -52, 24, 64, 126, 47, Byte.MAX_VALUE, 21, 8, 4, 26, 6, 18, 8, 44, 7, 49, 95, 81, 102, 104, 49, 96, 102, 60, 58, 58, 58, 11, 73, 17, 96, 62, 69};
    }

    private static byte[] fjocvdlquurjyon() {
        return new byte[]{-29, -52, 24, 64, 126, 47, Byte.MAX_VALUE, 21, 8, 4, 26, 4, 18, 6, 44, 29, 49, 95, 81, 53, 104, 4, 96, 107, 60, 48};
    }

    private static byte[] avcwipxuqfxkjnv() {
        return new byte[]{-29, -52, 24, 64, 126, 106, 95, 7, 8, 20, 26, 44, 18, 94, 44, 72, 49, 12, 113, 55, 104, 101, 96, 8, 60, 11, 58, 37, 11, 69, 17, 35, 62, 122, 56, 29, 99, 77};
    }
}
