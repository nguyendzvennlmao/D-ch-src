package com.kammoun.donutCore.core.utils.Enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class MessageType {
    public static final MessageType CHAT;
    public static final MessageType ACTIONBAR;
    public static final MessageType BOTH;
    private static final MessageType[] $VALUES;
    private static byte[] ytpwkexndg;

    public static MessageType[] values() {
        int i = 671584675 ^ (1249226961 ^ (1881923307 ^ 1351947508));
        return (MessageType[]) $VALUES.clone();
    }

    public static MessageType valueOf(String str) {
        int i = 1049448169 ^ (1668827029 ^ 1351947508);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1795222592) {
            int i2 = 315177206 ^ i;
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1795222592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1351929639 ^ i)) {
                int i3 = 1276062282 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -45536272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (110693786 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1699194592 ^ i;
        throw new RuntimeException();
    }

    private MessageType(String str, int i) {
        int i2 = 1047799443 ^ 847137961;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 17856937:
                    break;
                case 122954202:
                    int i3 = 1840770175 ^ i2;
                    break;
                case 347465772:
                default:
                    throw new RuntimeException();
                case 1907838213:
            }
        }
        pssjssbnsfkrpnnn(1609058612 ^ (1777386853 ^ Integer.parseInt("1470433812")), 2098401065);
    }

    private static MessageType[] $values() {
        int i = 164221057 ^ (1664679360 ^ (769512031 ^ 1351947508));
        MessageType[] messageTypeArr = new MessageType[(byte) (398060521 ^ i)];
        messageTypeArr[(byte) (398060522 ^ i)] = CHAT;
        messageTypeArr[(byte) (398060523 ^ i)] = ACTIONBAR;
        messageTypeArr[(byte) (398060520 ^ i)] = BOTH;
        return messageTypeArr;
    }

    static {
        int parseInt = 1155724223 ^ (2137340015 ^ Integer.parseInt("1470433812"));
        ytpwkexndg = dtrmxremifvvnfj();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1628835363) {
            parseInt = 1362707451 ^ parseInt;
            CHAT = new MessageType(qvabhoggrf(xneekpzocfhfqiw(), parseInt), (byte) (1025212991 ^ parseInt));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -388230663) {
                int i = 68461737 ^ parseInt;
                ACTIONBAR = new MessageType(qvabhoggrf(kampaffptemiaei(), i), (byte) (957294231 ^ i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -931580751) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 916321547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1732837768 ^ i)) {
                            int i2 = 1487242253 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -931580751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1724477660 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i3 = 1850081091 ^ i;
                    throw new RuntimeException("double");
                }
                int i4 = 1400396875 ^ i;
                BOTH = new MessageType(qvabhoggrf(oelgdummawtfilq(), i4), (byte) (1786215135 ^ i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1404819179) {
                    int i5 = 212124796 ^ i4;
                    $VALUES = $values();
                    return;
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1404819179 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (658344862 ^ i4)) {
                            break;
                        }
                    }
                    int i6 = 532617141 ^ i4;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -388230663 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (427313134 ^ parseInt)) {
                int i7 = 963483292 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1628835363 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (709891292 ^ parseInt)) {
                    break;
                }
            }
        }
        int i8 = 1831604753 ^ parseInt;
        throw new IOException();
    }

    public static String qvabhoggrf(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ytpwkexndg[i3 % ytpwkexndg.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] dtrmxremifvvnfj() {
        return new byte[]{3, 59, 31, 55, 105, 119, 2, 114, 33, 111, 112, 101, 5, 5, 24, 77, 55, 115, 98, 75, 58, 105, 67, 86, 48, 59, 70, 59, 64, 38, 68, 69, 43, 108, 41, 115, 89, 109, 69, 7, 62, 14, 72, 92, 69, 68, 43, 87, 99, 7};
    }

    private static byte[] xneekpzocfhfqiw() {
        return new byte[]{-52, -12, 45, 65, 91, 14, 48, 10, 24, 10};
    }

    private static byte[] kampaffptemiaei() {
        return new byte[]{-60, -15, 40, 68, 80, 0, 48, 21, 17, 31, 69, 29, 55, 114, 44, 61, 4, 2, 91, 44};
    }

    private static byte[] oelgdummawtfilq() {
        return new byte[]{-52, -13, 39, 67, 91, 9, 55, 23, 18, 20};
    }

    private static int pssjssbnsfkrpnnn(int i, int i2) {
        return i ^ i2;
    }
}
