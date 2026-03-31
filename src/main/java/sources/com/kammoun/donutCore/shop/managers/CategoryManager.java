package com.kammoun.donutCore.shop.managers;

import com.kammoun.donutCore.shop.ShopPlugin;
import com.kammoun.donutCore.shop.utils.holders.Category;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;
import lombok.Generated;
import org.bukkit.entity.Player;

public class CategoryManager {
    private final ShopPlugin plugin;
    private final HashMap<String, Category> categoriesMap;

    private static int f1025KHIuLgTsq = 0;
    private transient int slea9WcvE4 = 1306281119;
    private static String pmgoxxvmlu;
    private static String[] nothing_to_see_here = new String[13];

    public CategoryManager(ShopPlugin shopPlugin, int i) {
        int i2 = 165195796 ^ (483828130 ^ 993557221);
        int parseInt = 124495539 ^ (663843148 ^ Integer.parseInt("248298668"));
        this.slea9WcvE4 = 1306281119 ^ f1025KHIuLgTsq;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 159990214:
                    parseInt = 976155369 ^ parseInt;
                    break;
                case 604411936:
                case 696566146:
                    break;
                case 2038072069:
                default:
                    throw new IllegalAccessException();
            }
        }
        this.categoriesMap = new HashMap<>();
        this.plugin = shopPlugin;
        int i3 = 1128489705 ^ (827298660 ^ (602127219 ^ parseInt));
    }

    public void loadCategories(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.managers.CategoryManager.loadCategories(int):void");
    }

    public void reloadCategories(int i) {
        int i2 = 1742484937 ^ (637173404 ^ 912985763);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1570099277) {
            i2 = 30194287 ^ i2;
            loadCategories(473496026);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1408238389) {
                int i3 = 535592732 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1399587883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (963621592 ^ i2)) {
                int i4 = 1802285406 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1570099277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (21138345 ^ i2)) {
                    int i5 = 2115659657 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1408238389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (107898244 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1075661933 ^ i2;
        throw new IllegalAccessException();
    }

    public Category getCategory(String str, int i) {
        int i2 = 1815487199 ^ (1251988791 ^ 912985763);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2045261224) {
            int i3 = 491990253 ^ i2;
            return this.categoriesMap.get(str.toLowerCase().replace(pvhrtppong(jlhibqokjnzppvx(), i3), pvhrtppong(yfdxebqunreficl(), i3)));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2045261224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1784959218 ^ i2)) {
                int i4 = 97596116 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1821289776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (248343947 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1471148479 ^ i2;
        throw new RuntimeException();
    }

    public boolean isValidCategoryName(String str, int i) {
        int i2 = 702875597 ^ (1500927431 ^ 912985763);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 935519562) {
            int i3 = 1380157070 ^ i2;
            return this.categoriesMap.containsKey(str.toLowerCase().replace(pvhrtppong(fcdsfbyaxumckdd(), i3), pvhrtppong(oevkipfzdmnewbp(), i3)));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 935519562 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1715794080 ^ i2)) {
                int i4 = 300632079 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1512124104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (541965962 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1204814903 ^ i2;
        throw new RuntimeException();
    }

    public void openInventory(Player player, String str, int i) {
        int i2 = 1547021969 ^ (1497744949 ^ 912985763);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1730465735) {
            i2 = 1346579385 ^ i2;
            Category category = getCategory(str, 537132561);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 448949747) {
                i2 = 492554866 ^ i2;
                if (category != null) {
                    i2 = 1083875979 ^ i2;
                    openInventory(player, category, 406150239);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -188143047) {
                        int i3 = 1810547658 ^ i2;
                        return;
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -266584477) {
                    int i4 = 1259018913 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -266584477 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1849942068 ^ i2)) {
                int i5 = 201468256 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1471878295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (187735086 ^ i2)) {
                    int i6 = 858186072 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -188143047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (578752636 ^ i2)) {
                        int i7 = 1904618485 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 448949747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1507521211 ^ i2)) {
                            int i8 = 194231912 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1730465735 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (450592093 ^ i2)) {
                                int i9 = 1349219288 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1415629718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (444192001 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i10 = 1332989082 ^ i2;
        throw new IOException();
    }

    public void openInventory(org.bukkit.entity.Player r6, com.kammoun.donutCore.shop.utils.holders.Category r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.shop.managers.CategoryManager.openInventory(org.bukkit.entity.Player, com.kammoun.donutCore.shop.utils.holders.Category, int):void");
    }

    @Generated
    public ShopPlugin getPlugin(int i) {
        int i2 = 2003887282 ^ (1423274742 ^ 912985763);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1368078536) {
            int i3 = 780149616 ^ i2;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -629809991 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (251177263 ^ i2)) {
                int i4 = 1562999735 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1368078536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (908196603 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1675526895 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public HashMap getCategoriesMap(int i) {
        int i2 = 477737381 ^ (1246386416 ^ 912985763);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 46612403) {
            int i3 = 1514161038 ^ i2;
            return this.categoriesMap;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 46612403 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (629911958 ^ i2)) {
                int i4 = 2001047878 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -792386623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1485343189 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 995464220 ^ i2;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀    ";
        nothing_to_see_here[2] = "⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀⡏⠀⠀⠀⠀⠀⢷     ";
        nothing_to_see_here[3] = "⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[4] = "⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀OK⠀ ⡇    ";
        nothing_to_see_here[5] = "⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[6] = "⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼     ";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀     ";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[9] = "⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[10] = "⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[11] = "⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[12] = "⣿⣿⣧⣀⣿.........⣀⣰⣏⣘⣆⣀⠀⠀       ";
        pmgoxxvmlu = ByteBuffer.wrap(tbixoxdnhkndwkr()).asCharBuffer().toString();
        f1025KHIuLgTsq = (-854880722) ^ new Random(-3324284146862461159L).nextInt();
    }

    public static String pvhrtppong(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = pmgoxxvmlu.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] aipbepeetmpuhxy() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 0};
    }

    private static byte[] ifpdosvsqrbrjuq() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 4};
    }

    private static byte[] dfseteceuswyeic() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 14};
    }

    private static byte[] pfqxyufodgyowrr() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 18};
    }

    private static byte[] jlhibqokjnzppvx() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 18};
    }

    private static byte[] yfdxebqunreficl() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 22};
    }

    private static byte[] fcdsfbyaxumckdd() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 22};
    }

    private static byte[] oevkipfzdmnewbp() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 26};
    }

    private static byte[] tbixoxdnhkndwkr() {
        return new byte[]{57, 25, 51, 65, 49, 90, 54, 84, 49, 91, 55, 83, 54, 66, 52, 81, 54, 80, 49, 87, 55, 64, 54, 95, 52, 81, 54, 68, 49, 31, 48, 78, 53, 95, 48, 95, 50, 28, 55, 79, 54, 92, 50, 94, 51, 26, 55, 65, 53, 88, 51, 85};
    }

    private static int mrekpseyrycmdymh(int i, int i2) {
        return i2 ^ i;
    }
}
