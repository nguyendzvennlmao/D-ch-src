package com.kammoun.donutCore.team.models.Enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public final class Permissions {
    public static final Permissions EDIT_HOME;
    public static final Permissions MANAGE_MEMBERS;
    public static final Permissions TOGGLE_PVP;
    public static final Permissions VISIT_HOME;
    public static final Permissions USE_TEAM_CHAT;
    private static final Permissions[] $VALUES;
    private static String hnrgddgwwz;

    public static Permissions[] values() {
        int i = 454830453 ^ (2038176593 ^ (784735158 ^ 898761960));
        return (Permissions[]) $VALUES.clone();
    }

    public static Permissions valueOf(String str) {
        int i = 1580765318 ^ (1943961776 ^ 898761960);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1012881680) {
            int i2 = 596467878 ^ i;
            return (Permissions) Enum.valueOf(Permissions.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1012881680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1209297417 ^ i)) {
                int i3 = 1311397761 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -540302399 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1136463832 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1100824570 ^ i;
        throw new IllegalAccessException();
    }

    private Permissions(String str, int i) {
        odzglluedbbuvuql(1918466785 ^ 1094384701, 1230240593);
        odzglluedbbuvuql(1147515644 ^ (1140328693 ^ Integer.parseInt("2108540804")), 1692969513);
    }

    private static Permissions[] $values() {
        int i = 1765817897 ^ (1466492870 ^ (145914607 ^ 898761960));
        Permissions[] permissionsArr = new Permissions[(byte) (50898925 ^ i)];
        permissionsArr[(byte) (50898920 ^ i)] = EDIT_HOME;
        permissionsArr[(byte) (50898921 ^ i)] = MANAGE_MEMBERS;
        permissionsArr[(byte) (50898922 ^ i)] = TOGGLE_PVP;
        permissionsArr[(byte) (50898923 ^ i)] = VISIT_HOME;
        permissionsArr[(byte) (50898924 ^ i)] = USE_TEAM_CHAT;
        return permissionsArr;
    }

    static {
        int parseInt = 1993663499 ^ (1028163181 ^ Integer.parseInt("2108540804"));
        hnrgddgwwz = ByteBuffer.wrap(ldqczphfkoptzrt()).asCharBuffer().toString();
        int i = 1335145533 ^ parseInt;
        EDIT_HOME = new Permissions(flwxhvlhkt(ptsxtskbohonnqs(), i), (byte) (2040861151 ^ i));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -852979973) {
            int i2 = 1388612312 ^ i;
            MANAGE_MEMBERS = new Permissions(flwxhvlhkt(puigovtouzdxybi(), i2), (byte) (727816966 ^ i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1527568441) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1527568441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (673139681 ^ i2)) {
                        break;
                    }
                }
                int i3 = 422182291 ^ i2;
                throw new IllegalAccessException("double");
            }
            i = 120771534 ^ i2;
            TOGGLE_PVP = new Permissions(flwxhvlhkt(afmelabxzfkawyt(), i), (byte) (743655627 ^ i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1654277705) {
                int i4 = 174583962 ^ i;
                VISIT_HOME = new Permissions(flwxhvlhkt(lkscumhvoxtfgzp(), i4), (byte) (640989264 ^ i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 832946841) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 832946841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1995043067 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1709361449 ^ i4;
                    throw new IllegalAccessException("double");
                }
                i = 2119146196 ^ i4;
                USE_TEAM_CHAT = new Permissions(flwxhvlhkt(gyncprurlcfzqqb(), i), (byte) (1484464771 ^ i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1009183686) {
                    int i6 = 926683467 ^ i;
                    $VALUES = $values();
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -852979973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1081252820 ^ i)) {
                int i7 = 1409910424 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1009183686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (773137354 ^ i)) {
                    int i8 = 2063841355 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1654277705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2139506664 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i9 = 1653816078 ^ i;
        throw new IOException();
    }

    public static String flwxhvlhkt(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = hnrgddgwwz.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] afmelabxzfkawyt() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 0};
    }

    private static byte[] gyncprurlcfzqqb() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 10};
    }

    private static byte[] ptsxtskbohonnqs() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 23};
    }

    private static byte[] puigovtouzdxybi() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 32};
    }

    private static byte[] lkscumhvoxtfgzp() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 46};
    }

    private static byte[] ldqczphfkoptzrt() {
        return new byte[]{55, 96, 51, 121, 53, 114, 54, 117, 53, 123, 52, 118, 54, 106, 53, 102, 50, 99, 55, 100, 49, 97, 56, 103, 52, 115, 52, 104, 55, 97, 49, 113, 56, 117, 52, 123, 52, 104, 55, 118, 49, 124, 56, 117, 52, 98, 50, 117, 52, 116, 56, Byte.MAX_VALUE, 49, 101, 53, 110, 50, 120, 52, Byte.MAX_VALUE, 56, 123, 49, 116, 55, Byte.MAX_VALUE, 55, 121, 49, 120, 57, 119, 55, 112, 50, 114, 56, 110, 54, 116, 54, 114, 55, Byte.MAX_VALUE, 55, 122, 49, 115, 57, 100, 55, 100, 54, 98, 48, 112, 56, 106, 50, Byte.MAX_VALUE, 55, 98, 52, 111, 57, 112, 57, 125, 54, 122, 54, 113};
    }

    private static int odzglluedbbuvuql(int i, int i2) {
        return i ^ i2;
    }
}
