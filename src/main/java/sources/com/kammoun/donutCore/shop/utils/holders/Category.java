package com.kammoun.donutCore.shop.utils.holders;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.shop.utils.others.ShopInventoryHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Category {
    private final String title;
    private final int size;
    private final ArrayList<ShopItem> shopItems;
    private final KItem backItem;
    private static int ZttMgYBIQK = 0;
    private transient int YNj90HmeLr = 874880287;
    private static String[] nothing_to_see_here = new String[17];

    public Category(java.lang.String r5, java.lang.String r6, int r7, java.util.ArrayList<com.kammoun.donutCore.shop.utils.holders.ShopItem> r8, com.kammoun.donutCore.api.utils.items.KItem r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.utils.holders.Category.<init>(java.lang.String, int, java.util.ArrayList, com.kammoun.donutCore.api.utils.items.KItem, int):void");
    }

    public Inventory getCategoryInventory(int i) {
        int i2;
        int i3 = 1856108643 ^ (2107638209 ^ 1963288675);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 807702027) {
            i3 = 752688240 ^ i3;
            ShopInventoryHolder shopInventoryHolder = new ShopInventoryHolder(this, 425428926);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1456237962) {
                int i4 = 686221379 ^ i3;
                Inventory createInventory = Bukkit.createInventory(shopInventoryHolder, this.size, ChatFormater.color(this.title));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 301674387) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 301674387 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2118288658 ^ i4)) {
                            int i5 = 416154950 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1206782527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1453534843 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i6 = 1322223052 ^ i4;
                    throw new IllegalAccessException("double");
                }
                i3 = 1774435830 ^ i4;
                Iterator<ShopItem> it = this.shopItems.iterator();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1608957984) {
                    int i7 = 1908724690 ^ i3;
                    while (true) {
                        i2 = i7;
                        if (it.hasNext() == (2050493398 ^ i2)) {
                            wolfqcelncjyysqt(i2, 1295660398);
                            return createInventory;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -775921997) {
                            int i8 = 1975793749 ^ i2;
                            ShopItem next = it.next();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2145491992) {
                                i3 = 11647973 ^ i8;
                                createInventory.setItem(next.getIcon(2132423279).getSlot(1791774489).intValue(), getShopItem(next, 1217765389));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2053915440) {
                                    i2 = 1658712189 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1820573915) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1820573915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (141024859 ^ i2)) {
                                                int i9 = 2064928329 ^ i2;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                            case 71796004:
                                                i2 = 1651170176 ^ i2;
                                                break;
                                            case 377633384:
                                            case 1511949333:
                                                break;
                                        }
                                    }
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2) != 250974982) {
                                            throw null;
                                        }
                                        throw new IllegalAccessException();
                                    } catch (IllegalAccessException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -1882348832:
                                                i8 = 675447048 ^ i2;
                                                break;
                                            case 2144672984:
                                                i8 = 910268111 ^ i2;
                                                break;
                                            default:
                                                throw new IOException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -841373023) {
                                            i7 = wolfqcelncjyysqt(i8, 1132674690);
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2145491992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (271238730 ^ i8)) {
                                                    int i10 = 1239902418 ^ i8;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -841373023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1292331548 ^ i8)) {
                                                        int i11 = 2114036070 ^ i8;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -775921997 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2050705794 ^ i2)) {
                            int i12 = 1115831495 ^ i2;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1456237962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1163452899 ^ i3)) {
                int i13 = 1403219519 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 807702027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1585230249 ^ i3)) {
                    int i14 = 918518898 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2053915440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (40414041 ^ i3)) {
                        int i15 = 96086416 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2144672984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1436950671 ^ i3)) {
                            int i16 = 1565855740 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1608957984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1143212268 ^ i3)) {
                                int i17 = 1903114236 ^ i3;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }

    public com.kammoun.donutCore.shop.utils.holders.ShopItem getClickedShopItem(org.bukkit.inventory.ItemStack r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.utils.holders.Category.getClickedShopItem(org.bukkit.inventory.ItemStack, int):com.kammoun.donutCore.shop.utils.holders.ShopItem");
    }

    public static com.kammoun.donutCore.shop.utils.holders.Category fromString(org.bukkit.configuration.ConfigurationSection r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.utils.holders.Category.fromString(org.bukkit.configuration.ConfigurationSection, int):com.kammoun.donutCore.shop.utils.holders.Category");
    }

    private org.bukkit.inventory.ItemStack getShopItem(com.kammoun.donutCore.shop.utils.holders.ShopItem r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.utils.holders.Category.getShopItem(com.kammoun.donutCore.shop.utils.holders.ShopItem, int):org.bukkit.inventory.ItemStack");
    }

    @Generated
    public String getTitle() {
        int i = 1143234058 ^ (1895511706 ^ 1963288675);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 248514458) {
            int i2 = 1808717476 ^ i;
            return this.title;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 248514458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1338581998 ^ i)) {
                int i3 = 1615405350 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1353102009 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1373707321 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 68595118 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getSize() {
        int i = 333639680 ^ (1467639482 ^ 1963288675);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1930430775) {
            int i2 = 1504114455 ^ i;
            return this.size;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1930430775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (510276980 ^ i)) {
                int i3 = 946222721 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1104694899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1397879497 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 977707735 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public ArrayList<ShopItem> getShopItems() {
        int i = 593909350 ^ (2051994329 ^ 1963288675);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1634625249) {
            int i2 = 1976183785 ^ i;
            return this.shopItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -817940054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (333489990 ^ i)) {
                int i3 = 1695637342 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1634625249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1904288288 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1223329573 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KItem getBackItem(int i) {
        int i2 = 75124043 ^ (279785827 ^ 1963288675);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 244359771) {
            int i3 = 115891632 ^ i2;
            return this.backItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 970084315 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1148533621 ^ i2)) {
                int i4 = 51076316 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 244359771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (883883247 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1975051141 ^ i2;
        throw new IOException();
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
        nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
        nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
        nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
        nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
        nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
        nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
        nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
        nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
        nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
        nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
        nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
        nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
        nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
        nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
        ZttMgYBIQK = (-615392208) ^ new Random(-8136134381184827144L).nextInt();
    }

    public static String avisukcxqw(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] lplxybffhyflwks() {
        return new byte[]{116, 9, 22, 34, 28, 18, 19, 9, 93, 116, 109, 121, 15, 18, 79, 125, 77, 49, 88, 43, 36, 33, 95, 57, 4, 69, 113, 126, 19, 110, 45, 12, 83, 56, 116, 30, 121, 54, 65, 82, 105, 43, 15, 29, 84, 35, 86, 95, 101, 104, 4, 77, 20, 50, 3, 81, 94, 90, 117, 107, 108, 22, 3, 90, 118, 72, 30, 104, 20, 104, 22, 43, 113, 120, 90, 97, 54, Byte.MAX_VALUE, 12, 73};
    }

    private static byte[] gufzpcptywixarh() {
        return new byte[]{-69, -58, 35, 120, 41, 66, 37, 95, 108, 43, 92, 100, 58, 90, 122, 45, 123, 99, 105, 122};
    }

    private static byte[] xuzmzdsexfzveie() {
        return new byte[]{-69, -59, 37, 122, 40, 84, 34, 94, 108, 45, 92, 57};
    }

    private static byte[] tnokdgtwssjggjv() {
        return new byte[]{-78, -61, 46, 64, 36, 66, 37, 68, 106, 32, 88, 36};
    }

    private static byte[] mexakfrihptjkfx() {
        return new byte[]{-65, -49, 39, 67, 47, 66, 33, 67, 105, 36};
    }

    private static byte[] wdegkrxlrkarobf() {
        return new byte[]{-68, -59, 33, 112, 44, 66, 33, 93, 100, 41, 94, 99, 63, 82, 126, 46, 122, 111, 110, 125};
    }

    private static byte[] fedbrvnvorhyjzg() {
        return new byte[]{-67, -61, 32, 55, 44, 86, 38, 74, 108, 42, 88, 44, 63, 71, 123, 109};
    }

    private static byte[] bvuihaqceskqewy() {
        return new byte[]{-68, -58, 36, 49, 45, 70, 32, Byte.MAX_VALUE, 110, 55, 93, 50, 58, 3, 125, 62, 121, 112, 110, 114, 22, 119, 110, 110, 55, 75, 66, 104, 35, 122, 24, 92, 97, 47, 64, 8, 79, 118, 115, 21, 88, 112, 60, 74, 103, 112, 102, 72};
    }

    private static int wolfqcelncjyysqt(int i, int i2) {
        return i2 ^ i;
    }
}
