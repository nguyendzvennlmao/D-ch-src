package com.kammoun.donutCore.sell.managers;

import com.kammoun.donutCore.sell.SellPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class CategoryMenuManager {
    private static final int[] SLOTS;
    private final SellPlugin sellPlugin;
    private static int cfTPEVZDx7 = 0;

    private transient int f810rZHStJM0k = 682340882;
    private static String[] nothing_to_see_here = new String[15];

    public CategoryMenuManager(SellPlugin sellPlugin, int i) {
        int i2 = 1676209461 ^ (1888557271 ^ 169230062);
        int parseInt = 5312902 ^ (1368982923 ^ Integer.parseInt("1218961153"));
        this.f810rZHStJM0k = 682340882 ^ cfTPEVZDx7;
        int elmaogolqkjuswje = 113722314 ^ elmaogolqkjuswje(parseInt, 226126790);
        this.sellPlugin = sellPlugin;
        int i3 = 1643961492 ^ elmaogolqkjuswje;
    }

    public void openCategoriesMenu(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.managers.CategoryMenuManager.openCategoriesMenu(org.bukkit.entity.Player, int):void");
    }

    public void openCategoryMenu(org.bukkit.entity.Player r9, com.kammoun.donutCore.sell.service.Enums.Category r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.managers.CategoryMenuManager.openCategoryMenu(org.bukkit.entity.Player, com.kammoun.donutCore.sell.service.Enums.Category, int):void");
    }

    public void openCategoryItemsDisplay(org.bukkit.entity.Player r7, com.kammoun.donutCore.sell.model.SellCategory r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.managers.CategoryMenuManager.openCategoryItemsDisplay(org.bukkit.entity.Player, com.kammoun.donutCore.sell.model.SellCategory, int, int):void");
    }

    private org.bukkit.inventory.ItemStack getCategoryIconItemStack(com.kammoun.donutCore.sell.model.SellPlayerData r6, com.kammoun.donutCore.sell.model.SellCategory r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.managers.CategoryMenuManager.getCategoryIconItemStack(com.kammoun.donutCore.sell.model.SellPlayerData, com.kammoun.donutCore.sell.model.SellCategory, int):org.bukkit.inventory.ItemStack");
    }

    private org.bukkit.inventory.ItemStack getProgressItem(com.kammoun.donutCore.sell.model.SellPlayerData r11, com.kammoun.donutCore.sell.service.Enums.Category r12, long r13, int r15, int r16) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.managers.CategoryMenuManager.getProgressItem(com.kammoun.donutCore.sell.model.SellPlayerData, com.kammoun.donutCore.sell.service.Enums.Category, long, int, int):org.bukkit.inventory.ItemStack");
    }

    private org.bukkit.inventory.ItemStack getIcon(com.kammoun.donutCore.sell.model.SellPlayerData r6, com.kammoun.donutCore.sell.model.SellCategory r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.managers.CategoryMenuManager.getIcon(com.kammoun.donutCore.sell.model.SellPlayerData, com.kammoun.donutCore.sell.model.SellCategory, int):org.bukkit.inventory.ItemStack");
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        int parseInt = 476277305 ^ (1497563436 ^ Integer.parseInt("1218961153"));
        cfTPEVZDx7 = 1276499131 ^ new Random(-8513855756749640221L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) != 1815978144) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -2112719829 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1034643411 ^ parseInt)) {
                    int i = 228606812 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1815978144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1641456499 ^ parseInt)) {
                        break;
                    }
                }
            }
            int i2 = 1974666194 ^ parseInt;
            throw new RuntimeException();
        }
        int i3 = 2110126737 ^ parseInt;
        int[] iArr = new int[(byte) (1883393681 ^ i3)];
        iArr[(byte) (1883393669 ^ i3)] = (byte) (1883393679 ^ i3);
        iArr[(byte) (1883393668 ^ i3)] = (byte) (1883393686 ^ i3);
        iArr[(byte) (1883393671 ^ i3)] = (byte) (1883393689 ^ i3);
        iArr[(byte) (1883393670 ^ i3)] = (byte) (1883393696 ^ i3);
        iArr[(byte) (1883393665 ^ i3)] = (byte) (1883393699 ^ i3);
        iArr[(byte) (1883393664 ^ i3)] = (byte) (1883393698 ^ i3);
        iArr[(byte) (1883393667 ^ i3)] = (byte) (1883393691 ^ i3);
        iArr[(byte) (1883393666 ^ i3)] = (byte) (1883393680 ^ i3);
        iArr[(byte) (1883393677 ^ i3)] = (byte) (1883393673 ^ i3);
        iArr[(byte) (1883393676 ^ i3)] = (byte) (1883393672 ^ i3);
        iArr[(byte) (1883393679 ^ i3)] = (byte) (1883393675 ^ i3);
        iArr[(byte) (1883393678 ^ i3)] = (byte) (1883393682 ^ i3);
        iArr[(byte) (1883393673 ^ i3)] = (byte) (1883393701 ^ i3);
        iArr[(byte) (1883393672 ^ i3)] = (byte) (1883393708 ^ i3);
        iArr[(byte) (1883393675 ^ i3)] = (byte) (1883393711 ^ i3);
        iArr[(byte) (1883393674 ^ i3)] = (byte) (1883393710 ^ i3);
        iArr[(byte) (1883393685 ^ i3)] = (byte) (1883393703 ^ i3);
        iArr[(byte) (1883393684 ^ i3)] = (byte) (1883393692 ^ i3);
        iArr[(byte) (1883393687 ^ i3)] = (byte) (1883393685 ^ i3);
        iArr[(byte) (1883393686 ^ i3)] = (byte) (1883393666 ^ i3);
        SLOTS = iArr;
    }

    public static String oqzzruelmb(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] nvathkvhdudisqs() {
        return new byte[]{25, 80, 16, 63, 11, 110, 94, 21, 118, 121, 107, 126, 39, 92, 68, 88, 63, 76, 68, 113, 126, 106, 11, 50, 117, 27, 109, 25, 15, 56, 114, 4, 109, 42, 68, 59, 8, 29, 11, 57, 48, 51, 110, 64, 93, 125, 76, 3, 39, 83, 82, 97, 24, 45, 19, 43, 72, 91, 14, 1, 85, 23, 80, 51, 121, 43, 52, 92, 87, 5, 21, 7, 98, 57, 126, 31, 1, 80, 105, 68, 60, 24, 52, 32, 5, 87, 60, 95, 4, 125, 6, 109, 98, 14, 114, 29, 38, 121, 90, 42, 2, 119};
    }

    private static byte[] ejbpcvewvknmsow() {
        return new byte[]{-42, -103, 37, 44, 56, 43, 105, 84, 71, 38, 90, 47, 18, 24, 119, 8, 8, 12, 117, 50, 79, 113, 62, 102, 70, 79, 90, 88, 62, 45};
    }

    private static byte[] jaozpizsgvmonvx() {
        return new byte[]{-33, -104, 41, 41, 56, 39, 106, 80, 78, 46, 92, 32, 20, 29, 125, 9, 8, 7, 124, 53, 71, 124};
    }

    private static byte[] njdphxlwahtfnrd() {
        return new byte[]{-47, -99, 34, 42, 61, 51, 107, 80, 65, 35, 89, 56, 23, 3, 116, 29, 15, 23, 114, 42, 76, 63, 61, 112, 64, 14};
    }

    private static byte[] ndtwqvkebpyntgp() {
        return new byte[]{-47, -99, 34, 42, 61, 112, 107, 20, 65, 41};
    }

    private static byte[] lbjjuejshvteneq() {
        return new byte[]{-43, -101, 41, 35, 56, 51, 102, 71, 78, 46, 95, 35, 30, 6, 119, 14, 8, 19, 118, 104, 71, 32, 56, 113, 77, 73, 85, 69, 59, 117, 75, 18};
    }

    private static byte[] ppfnhvmcbgfirga() {
        return new byte[]{-34, -106, 41, 44, 51, 54, 110, 80, 64, 44, 82, 51, 17, 13, 113, 24, 15, 22, 125, 33, 71, 57, 51, 117, 69, 14};
    }

    private static byte[] trtxbysojiodfpy() {
        return new byte[]{-34, -106, 41, 44, 51, 117, 110, 20, 64, 38};
    }

    private static byte[] jwtpggldiwuxegb() {
        return new byte[]{-42, -105, 41, 47, 57, 60, 111, 86, 79, 51, 90, 52, 30, 12, 118, 7, 14, 14, 125, 100, 79, 33, 50, 119, 71, 79, 92, 65, 54, 116, 67, 25};
    }

    private static byte[] dznhjzixbwhiwki() {
        return new byte[]{-43, -97, 35, 43, 62, 42, 109, 80, 67, 34, 89, 41, 20, 31, 113, 9, 12, 8, 113, 54, 76, Byte.MAX_VALUE};
    }

    private static byte[] duesqbrlhljbbcn() {
        return new byte[]{-43, -97, 35, 43, 62, 116, 109, 19, 67, 43};
    }

    private static byte[] gsvsloufnwadakq() {
        return new byte[]{-42, -100, 40, 41, 50, 47, 111, 80, 65, 39, 90, 42, 31, 29, 125, 12, 14, 8, 115, 51, 79, 116, 51, 99, 76, 75, 92, 92, 56, 44};
    }

    private static byte[] ojprrjbkqofkiag() {
        return new byte[]{-42, -99, 35, 45, 57, 48, 103, 83, 66, 45, 90, 56, 20, 2, 118, 27, 6, 19, 112, 32, 79, 61, 56, 119, 71, 13};
    }

    private static byte[] qzfkhsrgigknpyb() {
        return new byte[]{-42, -99, 35, 45, 57, 115, 103, 23, 66, 39};
    }

    private static byte[] msvooqxegpjlngy() {
        return new byte[]{-42, -105, 36, 40, 59, 38, 106, 86, 70, 47, 90, 33, 19, 28, 116, 5, 11, 14, 116, 59, 79, Byte.MAX_VALUE, 63, 98, 69, 66, 89, 90, 63, 36};
    }

    private static byte[] vgidgqwfeomgcoa() {
        return new byte[]{-46, -103, 33, 40, 63, 39, 104, 84, 67, 35, 93, 40, 21, 26, 125, 11, 12, 10, 113, 52, 79, 125};
    }

    private static byte[] alqoxlgzajbltft() {
        return new byte[]{-34, -101, 34, 38};
    }

    private static byte[] rpufajttosjqigz() {
        return new byte[]{-42, -105, 61, 22, 62, -37, 123, 35, 66, 43, 88, -58, 10, 106, 119, 56, 3, 32};
    }

    private static byte[] dwqbyufwcelbyey() {
        return new byte[]{-42, -105, 34, 100, 33, 64, 123, 43, 93, 68, 94, 19};
    }

    private static byte[] bxlvxfofezzecpo() {
        return new byte[]{-33, -106, 34, 41, 59, 63, 108, 116, 70, 47, 82, 39, 23, 2, 118, 5, 11, 11, 124, 38, 76, 122, 59, 67, 71, 78, 93, 85, 54, 111, 66, 83, 95, 119, 112, 121, 48, 93};
    }

    private static byte[] ihbfrvtoesapikl() {
        return new byte[]{-46, -98, 41, 44, 51, 49, 111, 7, 78, 33, 90, 103};
    }

    private static byte[] mzskehjgvplnnov() {
        return new byte[]{-47, -106, 37, 45, 62, Byte.MAX_VALUE, 108, 21, 68, Byte.MAX_VALUE, 82, 45, 19, 80, 118, 82, 15, 72, 114, 110, 75, 51, 62, 32};
    }

    private static byte[] vzxrpdhfwctjflc() {
        return new byte[]{-42, -105, 33, 47, 57, 62, 109, 113, 69, 34, 90, 45, 22, 4, 118, 4, 12, 10, 119, 42, 79, 114, 58, 71, 71, 73, 94, 92, 60, 104, 67, 91, 92, 115, 118, 122, 59, 85};
    }

    private static int elmaogolqkjuswje(int i, int i2) {
        return i ^ i2;
    }
}
