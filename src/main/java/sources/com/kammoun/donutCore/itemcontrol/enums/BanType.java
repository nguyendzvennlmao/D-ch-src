package com.kammoun.donutCore.itemcontrol.enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class BanType {
    public static final BanType USE;
    public static final BanType WEAR;
    public static final BanType PICKUP;
    public static final BanType DROP;
    public static final BanType HOLD;
    public static final BanType PLACE;
    public static final BanType BREAK;
    public static final BanType CRAFT;
    public static final BanType CONSUME;
    private static final BanType[] $VALUES;

    public static BanType[] values() {
        int i = 2005929254 ^ (1624341885 ^ (696949780 ^ 937647422));
        return (BanType[]) $VALUES.clone();
    }

    public static BanType valueOf(String str) {
        int i = 679228719 ^ (1747579435 ^ 937647422);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1112223277) {
            int i2 = 1459428396 ^ i;
            return (BanType) Enum.valueOf(BanType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 173813937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (288292997 ^ i)) {
                int i3 = 1949331481 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1112223277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1625569849 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1717233306 ^ i;
        throw new IOException();
    }

    private BanType(String str, int i) {
        tzvgrulpurkomeri(329639206 ^ 654866806, 592481249);
        int parseInt = 698931392 ^ (1433913411 ^ Integer.parseInt("1797392178"));
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 242895387:
                    int i2 = 1437427461 ^ parseInt;
                    return;
                case 1751322557:
                    return;
                case 1976074169:
                default:
                    throw new RuntimeException();
                case 2007877821:
            }
        }
    }

    private static BanType[] $values() {
        int i = 68408176 ^ (1326774901 ^ (295139718 ^ 937647422));
        BanType[] banTypeArr = new BanType[(byte) (1836256692 ^ i)];
        banTypeArr[(byte) (1836256701 ^ i)] = USE;
        banTypeArr[(byte) (1836256700 ^ i)] = WEAR;
        banTypeArr[(byte) (1836256703 ^ i)] = PICKUP;
        banTypeArr[(byte) (1836256702 ^ i)] = DROP;
        banTypeArr[(byte) (1836256697 ^ i)] = HOLD;
        banTypeArr[(byte) (1836256696 ^ i)] = PLACE;
        banTypeArr[(byte) (1836256699 ^ i)] = BREAK;
        banTypeArr[(byte) (1836256698 ^ i)] = CRAFT;
        banTypeArr[(byte) (1836256693 ^ i)] = CONSUME;
        return banTypeArr;
    }

    static {
        int parseInt = 306265266 ^ (1417027135 ^ (472873746 ^ Integer.parseInt("1797392178")));
        USE = new BanType(bgqydoxwya(rjwuqpevnefvvpf(), ldlxjbevahdqtjm(), parseInt), (byte) (825908909 ^ parseInt));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1982663319) {
            int i = 1176836176 ^ parseInt;
            WEAR = new BanType(bgqydoxwya(nfchevsgfgzhejp(), ldlxjbevahdqtjm(), i), (byte) (1998538492 ^ i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1191561237) {
                parseInt = 993369907 ^ i;
                PICKUP = new BanType(bgqydoxwya(hjuwgyfyjfhanle(), ldlxjbevahdqtjm(), parseInt), (byte) (1277876684 ^ parseInt));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1633078898) {
                    int i2 = 905911195 ^ parseInt;
                    DROP = new BanType(bgqydoxwya(metgrwqtciguzwb(), ldlxjbevahdqtjm(), i2), (byte) (2044052054 ^ i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -827452757) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -827452757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1824320312 ^ i2)) {
                                break;
                            }
                        }
                        int i3 = 882644148 ^ i2;
                        throw new IllegalAccessException("double");
                    }
                    parseInt = 343757423 ^ i2;
                    HOLD = new BanType(bgqydoxwya(buagroguznakjto(), ldlxjbevahdqtjm(), parseInt), (byte) (1839763518 ^ parseInt));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1833206227) {
                        i = 2143477977 ^ parseInt;
                        PLACE = new BanType(bgqydoxwya(azwbaacndketfur(), ldlxjbevahdqtjm(), i), (byte) (308965606 ^ i));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1823242472) {
                            parseInt = 1887735798 ^ i;
                            BREAK = new BanType(bgqydoxwya(wnytkvmtidwdmlg(), ldlxjbevahdqtjm(), parseInt), (byte) (1659830035 ^ parseInt));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 393738411) {
                                i = 1077734849 ^ parseInt;
                                CRAFT = new BanType(bgqydoxwya(bvtctjaqltndjfo(), ldlxjbevahdqtjm(), i), (byte) (584192723 ^ i));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 378574497) {
                                    int i4 = 1657365085 ^ i;
                                    CONSUME = new BanType(bgqydoxwya(dbadfqqkjcfmsqk(), ldlxjbevahdqtjm(), i4), (byte) (1075540097 ^ i4));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 14386250) {
                                        int i5 = 292603044 ^ i4;
                                        $VALUES = $values();
                                        return;
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 14386250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1455113236 ^ i4)) {
                                                break;
                                            }
                                        }
                                        int i6 = 1612206428 ^ i4;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1823242472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1225839958 ^ i)) {
                    int i7 = 440084936 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1191561237 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (815087713 ^ i)) {
                        int i8 = 1430232201 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 378574497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (269340234 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i9 = 1952116019 ^ i;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 393738411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (616608086 ^ parseInt)) {
                int i10 = 1288143317 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1633078898 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (553642509 ^ parseInt)) {
                    int i11 = 1290933092 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1833206227 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (511271746 ^ parseInt)) {
                        int i12 = 471846924 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1982663319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (672834349 ^ parseInt)) {
                            int i13 = 1670809101 ^ parseInt;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1956798102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (782957204 ^ parseInt)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i14 = 853623298 ^ parseInt;
        throw new RuntimeException();
    }

    public static String bgqydoxwya(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ldlxjbevahdqtjm() {
        return new byte[]{52, 39, 28, 93, 28, 62, 9, 62, 114, 36, 125, 69, 24, 98, 43, 30, 65, 42, 57, 55, 32, 1, 122, 8, 116, 81, 105, 88, 5, 55, 46, 93, 107, 121, 16, 116, 115, 119, 47, 79, 76, 14, 80, 56, 84, 78, 76, 117, 38, 89, 56, 55, 38, 68, 79, 56, 29, 1, 24, 112, 15, 99, 122, 30, 17, 58, 12, 22, 7, 17, 105, 101, 90, 42, 56, 52, 17, 85, 46, 45, 76, 54, 2, 25, 85, 122, 60, 93, 47, 9, 102, 46, 72, 37, 125, 95, 83, 111, 53, 49, 112, 42, 104, 118, 126, 83, 66, 17, 17, 66, 67, 61};
    }

    private static byte[] rjwuqpevnefvvpf() {
        return new byte[]{-14, -22, 41, 49, 44, 85, 48, 75};
    }

    private static byte[] buagroguznakjto() {
        return new byte[]{-5, -32, 47, 44, 43, 71, 58, 71, 67, 84};
    }

    private static byte[] hjuwgyfyjfhanle() {
        return new byte[]{-5, -22, 43, 58, 36, 64, 63, 75, 74, 89, 76, 34, 47, 5};
    }

    private static byte[] bvtctjaqltndjfo() {
        return new byte[]{-1, -32, 40, 47, 37, 94, 62, 77, 70, 87, 69, 37};
    }

    private static byte[] metgrwqtciguzwb() {
        return new byte[]{-8, -24, 40, 45, 44, 89, 59, 65, 71, 71};
    }

    private static byte[] nfchevsgfgzhejp() {
        return new byte[]{-5, -31, 37, 50, 41, 72, 49, 75, 75, 69};
    }

    private static byte[] wnytkvmtidwdmlg() {
        return new byte[]{-5, -18, 41, 38, 36, 95, 57, 75, 65, 82, 76, 56};
    }

    private static byte[] dbadfqqkjcfmsqk() {
        return new byte[]{-5, -24, 43, 43, 41, 69, 57, 65, 66, 66, 76, 32, 47, 26, 30, 111};
    }

    private static byte[] azwbaacndketfur() {
        return new byte[]{-7, -24, 36, 52, 42, 71, 63, 79, 65, 84, 77, 56};
    }

    private static int tzvgrulpurkomeri(int i, int i2) {
        return i2 ^ i;
    }
}
