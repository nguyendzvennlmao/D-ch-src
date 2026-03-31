package com.kammoun.donutCore.billford.models.enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import lombok.Generated;

public final class Messages {
    public static final Messages NO_PRESET_CONFIGURED;
    public static final Messages PRESET_NOT_FOUND;
    public static final Messages NO_REQUIRED_ITEMS;
    public static final Messages NO_TRADE_ITEM;
    public static final Messages INVENTORY_FULL;
    public static final Messages PRESET_CHANGE;
    private String defaultMessage;
    private String path;
    private static final Messages[] $VALUES;
    private static String cbxlgtltmt;

    public static Messages[] values() {
        int i = 392773182 ^ (1971410803 ^ (648350115 ^ 416385545));
        return (Messages[]) $VALUES.clone();
    }

    public static Messages valueOf(String str) {
        int i = 2106495043 ^ (592256353 ^ 416385545);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 814758234) {
            int i2 = 1405798466 ^ i;
            return (Messages) Enum.valueOf(Messages.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 814758234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (265748488 ^ i)) {
                int i3 = 1474622537 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1362724024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1113219292 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1209541265 ^ i;
        throw new RuntimeException();
    }

    private Messages(String str, int i, String str2, String str3) {
        int i2 = 966865449 ^ 1344484850;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 208373434:
                    int i3 = 1241440633 ^ i2;
                    break;
                case 542148306:
                default:
                    throw new IOException();
                case 1286261525:
                    break;
                case 1668998691:
            }
        }
        int fxndnhaesanlhgck = 1652667310 ^ fxndnhaesanlhgck(944618762 ^ (396289232 ^ Integer.parseInt("263176056")), 2038234224);
        this.defaultMessage = str2;
        this.path = str3;
        int i4 = 1789306460 ^ (1569671558 ^ fxndnhaesanlhgck);
    }

    public java.lang.String getMessage(org.bukkit.configuration.ConfigurationSection r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.models.enums.Messages.getMessage(org.bukkit.configuration.ConfigurationSection):java.lang.String");
    }

    @Generated
    public String getDefaultMessage() {
        int i = 447893619 ^ (1774039453 ^ 290082529);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 304969851) {
            int i2 = 196941561 ^ i;
            return this.defaultMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1338363827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (349351680 ^ i)) {
                int i3 = 595394201 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 304969851 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1207895305 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1680253405 ^ i;
        throw new IOException();
    }

    @Generated
    public String getPath() {
        int i = 1206439064 ^ (2047548974 ^ 290082529);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1699537593) {
            int i2 = 1672990619 ^ i;
            return this.path;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1699537593 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (213960530 ^ i)) {
                int i3 = 1878936612 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2029166178 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1642862715 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1138126103 ^ i;
        throw new IOException();
    }

    private static Messages[] $values() {
        int i = 347362514 ^ (1430877602 ^ (1464922676 ^ 416385545));
        Messages[] messagesArr = new Messages[(byte) (243030347 ^ i)];
        messagesArr[(byte) (243030349 ^ i)] = NO_PRESET_CONFIGURED;
        messagesArr[(byte) (243030348 ^ i)] = PRESET_NOT_FOUND;
        messagesArr[(byte) (243030351 ^ i)] = NO_REQUIRED_ITEMS;
        messagesArr[(byte) (243030350 ^ i)] = NO_TRADE_ITEM;
        messagesArr[(byte) (243030345 ^ i)] = INVENTORY_FULL;
        messagesArr[(byte) (243030344 ^ i)] = PRESET_CHANGE;
        return messagesArr;
    }

    static {
        int parseInt = 2143011373 ^ (1738147378 ^ Integer.parseInt("263176056"));
        cbxlgtltmt = ByteBuffer.wrap(ymncxgntmayjayx()).asCharBuffer().toString();
        int i = 1175582397 ^ parseInt;
        NO_PRESET_CONFIGURED = new Messages(mawgmiyqdo(ziufhjffqvvjtyi(), i), (byte) (1369411034 ^ i), mawgmiyqdo(vwubhyaecukkval(), i), mawgmiyqdo(iugaofrrbjmgdmf(), i));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1929613614) {
            i = 514554527 ^ i;
            PRESET_NOT_FOUND = new Messages(mawgmiyqdo(svvscgkffyndsig(), i), (byte) (1328871236 ^ i), mawgmiyqdo(cctrojvrussbbrr(), i), mawgmiyqdo(zgipvnhtdjgtdey(), i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2041035306) {
                int i2 = 528263272 ^ i;
                NO_REQUIRED_ITEMS = new Messages(mawgmiyqdo(giqnjyyfpynrkcv(), i2), (byte) (1346920239 ^ i2), mawgmiyqdo(xjldhfzvxqfxtht(), i2), mawgmiyqdo(cmtsywvcizgquse(), i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -2109539990) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2109539990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1987302488 ^ i2)) {
                            break;
                        }
                    }
                    int i3 = 620356188 ^ i2;
                    throw new IOException("double");
                }
                int i4 = 1812081260 ^ i2;
                NO_TRADE_ITEM = new Messages(mawgmiyqdo(adbbvaeckxrymex(), i4), (byte) (1011512642 ^ i4), mawgmiyqdo(ycdkjeqvwcmeypf(), i4), mawgmiyqdo(hqdolhemiiujnlz(), i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -497833463) {
                    i4 = 1979501505 ^ i4;
                    INVENTORY_FULL = new Messages(mawgmiyqdo(loplcjvetkscqiv(), i4), (byte) (1236713092 ^ i4), mawgmiyqdo(dbkleegfjpgmrbo(), i4), mawgmiyqdo(biyehshbsnkahpj(), i4));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1303770114) {
                        i = 1875815525 ^ i4;
                        PRESET_CHANGE = new Messages(mawgmiyqdo(ecxqfpgbjuefpax(), i), (byte) (645403360 ^ i), mawgmiyqdo(ingtqrftsjmbqzi(), i), mawgmiyqdo(zohjoqfakzvvtgi(), i));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 868259625) {
                            int i5 = 1897234356 ^ i;
                            $VALUES = $values();
                            return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -497833463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1846036868 ^ i4)) {
                        int i6 = 1991647881 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1303770114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1997176411 ^ i4)) {
                            break;
                        }
                    }
                }
                int i7 = 927680790 ^ i4;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1929613614 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (723745106 ^ i)) {
                int i8 = 1647921294 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 868259625 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1604938606 ^ i)) {
                    int i9 = 2096375211 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1150588278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1755902564 ^ i)) {
                        int i10 = 772491914 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2041035306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (251451614 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i11 = 879382790 ^ i;
        throw new IllegalAccessException();
    }

    public static String mawgmiyqdo(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = cbxlgtltmt.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] svvscgkffyndsig() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, 0};
    }

    private static byte[] cctrojvrussbbrr() {
        return new byte[]{0, 0, 0, 45, 0, 0, 0, 16};
    }

    private static byte[] zgipvnhtdjgtdey() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, 61};
    }

    private static byte[] ecxqfpgbjuefpax() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 77};
    }

    private static byte[] ingtqrftsjmbqzi() {
        return new byte[]{0, 0, 0, 42, 0, 0, 0, 90};
    }

    private static byte[] zohjoqfakzvvtgi() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, -124};
    }

    private static byte[] ziufhjffqvvjtyi() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, -110};
    }

    private static byte[] vwubhyaecukkval() {
        return new byte[]{0, 0, 0, 48, 0, 0, 0, -90};
    }

    private static byte[] iugaofrrbjmgdmf() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, -42};
    }

    private static byte[] loplcjvetkscqiv() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, -22};
    }

    private static byte[] dbkleegfjpgmrbo() {
        return new byte[]{0, 0, 0, 54, 0, 0, 0, -8};
    }

    private static byte[] biyehshbsnkahpj() {
        return new byte[]{0, 0, 0, 14, 0, 0, 1, 46};
    }

    private static byte[] giqnjyyfpynrkcv() {
        return new byte[]{0, 0, 0, 17, 0, 0, 1, 60};
    }

    private static byte[] xjldhfzvxqfxtht() {
        return new byte[]{0, 0, 0, 53, 0, 0, 1, 77};
    }

    private static byte[] cmtsywvcizgquse() {
        return new byte[]{0, 0, 0, 17, 0, 0, 1, -126};
    }

    private static byte[] adbbvaeckxrymex() {
        return new byte[]{0, 0, 0, 13, 0, 0, 1, -109};
    }

    private static byte[] ycdkjeqvwcmeypf() {
        return new byte[]{0, 0, 0, 49, 0, 0, 1, -96};
    }

    private static byte[] hqdolhemiiujnlz() {
        return new byte[]{0, 0, 0, 13, 0, 0, 1, -47};
    }

    private static byte[] ymncxgntmayjayx() {
        return new byte[]{49, 99, 50, 106, 56, 114, 49, 97, 51, 114, 49, 103, 50, 103, 56, 121, 49, 125, 51, 99, 49, 108, 50, 126, 56, 120, 49, 103, 51, 121, 49, 119, 49, 21, 50, 27, 56, 82, 49, 2, 51, 7, 49, 1, 50, 8, 56, 5, 49, 102, 51, 95, 49, 86, 50, 24, 56, 86, 49, 81, 51, 67, 49, 90, 50, 78, 56, 82, 49, 18, 51, 71, 49, 65, 50, 93, 56, 68, 49, 87, 51, 67, 49, 19, 50, 91, 56, 88, 49, 71, 51, 91, 49, 87, 50, 24, 56, 89, 49, 93, 51, 67, 49, 19, 50, 90, 56, 82, 49, 18, 51, 81, 49, 92, 50, 77, 56, 89, 49, 86, 51, 22, 49, 67, 50, 74, 56, 82, 49, 65, 51, 82, 49, 71, 50, 21, 56, 89, 49, 93, 51, 67, 49, 30, 50, 94, 56, 88, 49, 71, 51, 89, 49, 87, 54, 100, 53, 102, 48, 118, 51, 101, 53, 115, 52, 97, 52, 111, 51, 112, 54, 125, 54, 117, 53, 122, 48, 116, 51, 115, 54, 18, 53, 2, 48, 21, 51, 90, 53, 116, 52, 92, 52, 92, 51, 95, 54, 83, 54, 91, 53, 70, 48, 87, 51, 22, 53, 16, 52, 2, 52, 64, 51, 65, 54, 80, 54, 71, 53, 81, 48, 71, 51, 22, 53, 85, 52, 93, 52, 81, 51, 93, 54, 82, 54, 81, 53, 80, 48, 19, 51, 66, 53, 89, 52, 15, 52, 16, 51, 22, 54, 69, 54, 70, 53, 81, 48, 64, 51, 83, 53, 66, 52, 16, 54, 68, 53, 70, 48, 86, 51, 69, 53, 83, 52, 65, 52, 29, 51, 80, 54, 93, 54, 85, 53, 90, 48, 84, 51, 83, 53, 82, 49, 125, 54, 118, 52, 110, 49, 96, 51, 102, 49, 118, 54, 106, 52, 116, 49, 100, 51, 107, 49, 112, 54, 118, 52, Byte.MAX_VALUE, 49, 118, 51, 125, 49, 116, 54, 108, 52, 99, 49, 117, 51, 112, 49, 21, 54, 26, 52, 84, 49, 0, 51, 4, 49, 1, 54, 9, 52, 3, 49, 126, 51, 91, 49, 19, 54, 88, 52, 82, 49, 68, 51, 93, 49, 69, 54, 92, 52, 17, 49, 114, 51, 93, 49, 95, 54, 85, 52, 87, 49, 95, 51, 70, 49, 87, 54, 25, 52, 65, 49, 66, 51, 81, 49, 64, 54, 92, 52, 69, 49, 16, 51, 93, 49, 64, 54, 25, 52, 82, 49, 95, 51, 90, 49, 85, 54, 80, 52, 86, 49, 69, 51, 70, 49, 86, 54, 93, 52, 16, 49, 93, 54, 86, 52, 28, 49, 64, 51, 70, 49, 86, 54, 74, 52, 84, 49, 68, 51, 25, 49, 80, 54, 86, 52, 95, 49, 86, 51, 93, 49, 84, 54, 76, 52, 67, 49, 85, 51, 80, 49, 123, 51, 120, 55, 103, 51, 117, 56, 118, 49, 102, 51, 121, 55, 99, 51, 105, 56, 103, 49, 116, 51, 99, 55, 125, 51, 124, 49, 20, 51, 21, 55, 84, 51, 0, 56, 8, 49, 0, 51, 6, 55, 3, 51, 105, 56, 87, 49, 71, 51, 68, 55, 17, 51, 89, 56, 86, 49, 68, 51, 83, 55, 95, 51, 68, 56, 87, 49, 64, 51, 79, 55, 17, 51, 89, 56, 75, 49, 18, 51, 80, 55, 68, 51, 92, 56, 84, 49, 19, 51, 22, 55, 124, 51, 81, 56, 83, 49, 87, 51, 22, 55, 66, 51, 95, 56, 85, 49, 87, 51, 22, 55, 66, 51, 64, 56, 89, 49, 81, 51, 83, 55, 17, 51, 86, 56, 81, 49, 64, 51, 69, 55, 69, 51, 30, 49, 91, 51, 88, 55, 71, 51, 85, 56, 86, 49, 70, 51, 89, 55, 67, 51, 73, 56, 21, 49, 84, 51, 67, 55, 93, 51, 92, 49, 125, 52, 121, 57, 109, 48, 96, 51, 114, 49, 98, 52, 99, 57, 123, 48, 96, 51, 114, 49, 119, 52, 105, 57, 123, 48, 102, 51, 114, 49, 126, 52, 101, 49, 21, 52, 21, 57, 87, 48, 2, 51, 7, 49, 1, 52, 6, 57, 0, 48, 102, 51, 95, 49, 90, 52, 69, 57, 18, 48, 66, 51, 69, 49, 86, 52, 69, 57, 87, 48, 70, 51, 23, 49, 91, 52, 87, 57, 65, 48, 18, 51, 89, 49, 92, 52, 22, 57, 64, 48, 87, 51, 70, 49, 70, 52, 95, 57, 64, 48, 87, 51, 83, 49, 19, 52, 95, 57, 70, 48, 87, 51, 90, 49, 64, 52, 22, 57, 81, 48, 93, 51, 89, 49, 85, 52, 95, 57, 85, 48, 71, 51, 69, 49, 86, 52, 82, 57, 19, 49, 93, 52, 89, 57, 31, 48, 64, 51, 82, 49, 66, 52, 67, 57, 91, 48, 64, 51, 82, 49, 87, 52, 27, 57, 91, 48, 70, 51, 82, 49, 94, 52, 69, 49, 126, 49, 126, 53, 110, 50, 98, 52, 99, 49, 113, 49, 117, 53, 116, 50, 105, 52, 120, 49, 100, 49, 116, 53, 124, 49, 22, 49, 18, 53, 84, 50, 6, 52, 1, 49, 2, 49, 1, 53, 3, 50, 98, 52, 89, 49, 89, 49, 66, 53, 17, 50, 70, 52, 67, 49, 85, 49, 66, 53, 84, 50, 66, 52, 17, 49, 88, 49, 80, 53, 66, 50, 22, 52, 95, 49, 95, 49, 17, 53, 69, 50, 68, 52, 80, 49, 84, 49, 84, 53, 17, 50, 95, 52, 69, 49, 85, 49, 92, 53, 17, 50, 85, 52, 94, 49, 94, 49, 87, 53, 88, 50, 81, 52, 68, 49, 66, 49, 84, 53, 85, 50, 23, 49, 94, 49, 94, 53, 28, 50, 66, 52, 67, 49, 81, 49, 85, 53, 84, 50, 27, 52, 88, 49, 68, 49, 84, 53, 92};
    }

    private static int fxndnhaesanlhgck(int i, int i2) {
        return i2 ^ i;
    }
}
