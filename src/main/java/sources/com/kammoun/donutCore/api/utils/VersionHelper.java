package com.kammoun.donutCore.api.utils;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.jetbrains.annotations.NotNull;

public final class VersionHelper {
    private static final String PACKAGE_NAME;
    public static final String NMS_VERSION;
    private static final int V1_21_4 = 1214;
    private static final int V1_21_2 = 1212;
    private static final int V1_20_5 = 1205;
    private static final int V1_19_4 = 1194;
    private static final int V1_18_1 = 1181;
    private static final int V1_17 = 1170;
    private static final int V1_13 = 1130;
    private static final int V1_14 = 1140;
    private static final int V1_16 = 1160;
    private static final int V1_16_5 = 1165;
    private static final int V1_12 = 1120;
    public static final int CURRENT_VERSION;
    private static final boolean IS_PAPER;
    public static final boolean HAS_TOOLTIP_STYLE;
    public static final boolean HAS_DATA_COMPONENTS;
    public static final boolean HAS_ARMOR_TRIMS;
    public static final boolean HAS_PLAYER_PROFILES;
    public static final boolean HAS_OBFUSCATED_NAMES;
    public static final boolean IS_COMPONENT;
    public static final boolean IS_ITEM_LEGACY;
    public static final boolean IS_PDC_VERSION;
    public static final boolean IS_SKULL_OWNER_LEGACY;
    public static final boolean IS_CUSTOM_MODEL_DATA;
    public static final boolean IS_CUSTOM_MODEL_DATA_COMPONENT;
    public static final boolean IS_HEX_VERSION;
    private static List<InventoryType> CHEST_INVENTORY_TYPES;
    private static List<InventoryType> VALID_INVENTORY_TYPES;
    private static int Lul70LjN7R = 0;
    private transient int HblP0SvgTH = 592886182;
    private static byte[] ueveehmdbo;
    private static String[] nothing_to_see_here;

    public VersionHelper() {
        int i = 1959034941 ^ (1487400362 ^ 44966498);
        int parseInt = 9031670 ^ (1231376360 ^ Integer.parseInt("1730269163"));
        this.HblP0SvgTH = 592886182 ^ Lul70LjN7R;
        juwrxyasalwipzbd(parseInt, 639688000);
    }

    private static java.util.List getChestInventoryTypes(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.VersionHelper.getChestInventoryTypes(int):java.util.List");
    }

    public static java.util.List<org.bukkit.event.inventory.InventoryType> getValidInventoryTypes() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.VersionHelper.getValidInventoryTypes():java.util.List");
    }

    private static boolean checkPaper(int i) {
        int i2;
        int i3 = 157827889 ^ (970751964 ^ (436154204 ^ 870500108));
        int i4 = i3;
        try {
            Class.forName(bpxbmxhdbj(ayjpmiyohfrqpkt(), i4));
        } catch (ClassNotFoundException e) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                case -716266008:
                    i2 = 1093451029 ^ i4;
                    break;
                case -484521469:
                    i2 = juwrxyasalwipzbd(i4, 669429992);
                    break;
                default:
                    throw new IOException("Error in hash");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -601141950) {
                return (byte) (225815781 ^ (1458619725 ^ i2));
            }
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -716266008) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1753224533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1883379722 ^ i4)) {
                    int i5 = 1687538025 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -716266008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1933456187 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 1962051028 ^ i4;
            throw new RuntimeException("double");
        }
        i2 = 1724517885 ^ i4;
        ?? r0 = (byte) (2086918465 ^ i2);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -484521469) {
            i4 = 244065301 ^ i2;
            return r0;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -601141950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1455807385 ^ i2)) {
                int i7 = 1136794443 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -484521469 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1424922645 ^ i2)) {
                    int i8 = 324289126 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1806526248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (16014624 ^ i2)) {
                        int i9 = 419381218 ^ i2;
                        throw new IOException();
                    }
                }
            }
        }
    }

    private static int getCurrentVersion(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.VersionHelper.getCurrentVersion(int):int");
    }

    public static String getNmsVersion() {
        int i = 833299197 ^ (1800558365 ^ (440318034 ^ 870500108));
        String name = Bukkit.getServer().getClass().getPackage().getName();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1725409805) {
            int i2 = 126821137 ^ i;
            return name.substring(name.lastIndexOf((byte) (1957308801 ^ i2)) + ((byte) (1957308846 ^ i2)));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1521398405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (531050745 ^ i)) {
                int i3 = 417680938 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1725409805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (70407316 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1788080467 ^ i;
        throw new IllegalAccessException();
    }

    public static Class<?> getNMSClass(String str, String str2) throws ClassNotFoundException {
        int i = 229042528 ^ (1020687723 ^ 870500108);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 345167928) {
            i = 444525953 ^ i;
            if (HAS_OBFUSCATED_NAMES == (418166406 ^ i)) {
                int i2 = 13336640 ^ i;
                return Class.forName("net.minecraft.server." + NMS_VERSION + "." + str2);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -949636048) {
                int i3 = 51692870 ^ i;
                return Class.forName("net.minecraft." + str + "." + str2);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1053182416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (771482465 ^ i)) {
                int i4 = 44257548 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 345167928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1963528628 ^ i)) {
                    int i5 = 74487327 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -949636048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1219039159 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i6 = 920876876 ^ i;
        throw new RuntimeException();
    }

    public static Class<?> getCraftClass(@NotNull String str) throws ClassNotFoundException {
        int i = 990952424 ^ (2084980543 ^ 870500108);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1516118309) {
            int i2 = 1778318369 ^ i;
            return Class.forName("org.bukkit.craftbukkit." + NMS_VERSION + "." + str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -363446320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (645454081 ^ i)) {
                int i3 = 457994560 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1516118309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (743165189 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1289261937 ^ i;
        throw new IllegalAccessException();
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.VersionHelper.m35clinit():void");
    }

    public static String bpxbmxhdbj(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ueveehmdbo[i3 % ueveehmdbo.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] dwelqnpajveuove() {
        return new byte[]{41, 44, 28, 97, 43, 17, 40, 117};
    }

    private static byte[] ayjpmiyohfrqpkt() {
        return new byte[]{-29, -25, 43, 49, 24, 73, 30, 46, 24, 54, 40, 50, 24, 71, 31, 48, 31, 105, 40, 39, 28, 77, 27, 59, 31, 105, 45, 33, 31, 73, 27, 45, 30, 99, 42, 63, 31, 11, 31, 54, 26, 122, 42, 39, 26, 64, 28, 48, 26, 49, 43, 7, 29, 65, 28, 49, 30, 122, 47, 36, 29, 100, 25, 46, 29, 117, 47, 52, 28, 78, 30, 35};
    }

    private static byte[] twclxgjgqjzoeoa() {
        return new byte[]{-26, -29, 47, 104};
    }

    private static byte[] kzpvjjtzctsqzeb() {
        return new byte[]{-26, -25, 37, 16, 27, 77, 17, 49, 30, 112, 45, 49, 18, 3, 24, 40, 16, 114, 43, 37, 26, 5, 17, 53, 25, 122, 37, 36, 28, 83, 25, 40, 16, 123, 44, 36, 18, 69, 31, 101, 24, 107, 37, 54, 27, 80, 17, 50, 30, 121, 45, 39, 18, 3, 24, 48, 16, 120, 43, 35, 26, 86, 17, 46, 25, 112, 37, 62, 28, 0};
    }

    private static byte[] mqtleuhxbmivcbb() {
        return new byte[]{-26, -26, 47, 124};
    }

    private static byte[] iqrhtenfgnnoutb() {
        return new byte[0];
    }

    private static byte[] alowncypvordoqr() {
        return new byte[]{-26, -31, 42, 47, 18, 66, 28, 63, 16, 110, 46, 62, 19, 71, 30, 47};
    }

    private static byte[] yavjofzkjbjmjay() {
        return new byte[]{-26, -31, 42, 119};
    }

    private static byte[] oqpkfefvutktfvz() {
        return new byte[0];
    }

    private static byte[] iebifqihnlkxxsb() {
        return new byte[]{-26, -28, 42, 123, 24, 22, 24, 126, 24, 107, 43, 50, 25, 80, 16, 54, 30, 116, 45, 57, 29, 77, 27, 115, 25, 71, 45, 52, 28, 12, 26, 26, 17, 50, 43, 12, 26, 66, 30, 108, 26, 61, 44, 126, 26, 31, 31, Byte.MAX_VALUE, 27, 111, 36, 48, 28, 84, 25, 33, 31, 118, 47, 103, 27, 122, 25, 106, 30, 70, 46, 54, 19, 10, 31, 109, 24, 36};
    }

    private static byte[] zylchwwogsyzvei() {
        return new byte[]{-27, -32, 45, 39, 30, 65, 28, 49, 26, 125, 47, 56};
    }

    private static int juwrxyasalwipzbd(int i, int i2) {
        return i2 ^ i;
    }
}
