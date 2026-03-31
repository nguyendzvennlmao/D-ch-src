package com.kammoun.donutCore.sell.model;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.sell.service.Enums.Category;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public class SellCategory {
    private final Category key;
    private KItem progressIcon;
    private KItem categoriesIcon;
    private double baseMultiplier;
    private int inventorySlot;
    private String progressTitle;
    private final Map<Material, Double> allowedItems;

    private static int f851oFYz54cIb = 0;
    private transient int IA16B345t8 = 36119803;
    private static byte[] nrqlzyabxe;
    private static String[] nothing_to_see_here = new String[15];

    public SellCategory(com.kammoun.donutCore.sell.service.Enums.Category r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.model.SellCategory.<init>(com.kammoun.donutCore.sell.service.Enums.Category, int):void");
    }

    public void addAllowedItem(Material material, double d, int i) {
        int i2 = 1001837688 ^ (1938778180 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1215608114) {
            i2 = 138514755 ^ i2;
            this.allowedItems.put(material, Double.valueOf(d));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 175652650) {
                int i3 = 734940306 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1215608114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1286800038 ^ i2)) {
                int i4 = 2079927967 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 175652650 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (423546124 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1868486159 ^ i2;
        throw new IllegalAccessException();
    }

    public static com.kammoun.donutCore.sell.model.SellCategory fromConfig(com.kammoun.donutCore.sell.service.Enums.Category r6, org.bukkit.configuration.ConfigurationSection r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.model.SellCategory.fromConfig(com.kammoun.donutCore.sell.service.Enums.Category, org.bukkit.configuration.ConfigurationSection, int):com.kammoun.donutCore.sell.model.SellCategory");
    }

    public double getPrice(@NotNull Material material, int i) {
        int i2 = 2004068381 ^ (813057564 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 831923418) {
            int i3 = 610426133 ^ i2;
            return this.allowedItems.getOrDefault(material, Double.valueOf(0.0d)).doubleValue();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 310692979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (329369188 ^ i2)) {
                int i4 = 650698681 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 831923418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1980901743 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1727864863 ^ i2;
        throw new IOException();
    }

    @Generated
    public Category getKey(int i) {
        int i2 = 571974855 ^ (1541003467 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -943016781) {
            int i3 = 396398691 ^ i2;
            return this.key;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2060335019 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (207400626 ^ i2)) {
                int i4 = 721058474 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -943016781 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (539055729 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 406559578 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public KItem getProgressIcon(int i) {
        int i2 = 1634735955 ^ (1880956699 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2100226416) {
            int i3 = 1843606238 ^ i2;
            return this.progressIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -305627037 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1825403711 ^ i2)) {
                int i4 = 1811199741 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2100226416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (846559272 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1492234816 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public KItem getCategoriesIcon(int i) {
        int i2 = 340554652 ^ (332371210 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 900096096) {
            int i3 = 1084222851 ^ i2;
            return this.categoriesIcon;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 900096096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (879902993 ^ i2)) {
                int i4 = 1177633625 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 827919482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1974687202 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2065010004 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public double getBaseMultiplier() {
        int i = 703434478 ^ (337709861 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -404915575) {
            int i2 = 494824468 ^ i;
            return this.baseMultiplier;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 204347945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (774101039 ^ i)) {
                int i3 = 682162308 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -404915575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (396276699 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1404033651 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getInventorySlot(int i) {
        int i2 = 476120170 ^ (260313436 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1768817312) {
            int i3 = 1489714208 ^ i2;
            return this.inventorySlot;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1355291746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (549375398 ^ i2)) {
                int i4 = 1715494111 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1768817312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1667714499 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 448390271 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getProgressTitle(int i) {
        int i2 = 403713440 ^ (1426474589 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1628048186) {
            int i3 = 951553718 ^ i2;
            return this.progressTitle;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1531543925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (553491513 ^ i2)) {
                int i4 = 1531009433 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1628048186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1246940081 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1675162142 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Map getAllowedItems(int i) {
        int i2 = 1986736324 ^ (726035948 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -522994286) {
            int i3 = 15854388 ^ i2;
            return this.allowedItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -413342670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1873417382 ^ i2)) {
                int i4 = 1536284992 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -522994286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (286952358 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 872875169 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public void setProgressIcon(KItem kItem) {
        int i = 537365825 ^ (1088893316 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 247247611) {
            int i2 = 491421482 ^ i;
            this.progressIcon = kItem;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 247247611 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1256249164 ^ i)) {
                int i3 = 566321390 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -454079573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (474990431 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 837866631 ^ i;
        throw new IOException();
    }

    @Generated
    public void setCategoriesIcon(KItem kItem) {
        int i = 1897948178 ^ (1794200046 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -684655824) {
            int i2 = 1335967500 ^ i;
            this.categoriesIcon = kItem;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1439104174 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2006117111 ^ i)) {
                int i3 = 1992882297 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -684655824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (505554300 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1084473944 ^ i;
        throw new IOException();
    }

    @Generated
    public void setBaseMultiplier(double d) {
        int i = 240767320 ^ (1446368943 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -891720854) {
            int i2 = 1972669211 ^ i;
            this.baseMultiplier = d;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -891720854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (380982676 ^ i)) {
                int i3 = 377738454 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1719481265 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (446329460 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 204676218 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public void setInventorySlot(int i) {
        int i2 = 2141999466 ^ (1085317951 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -245447047) {
            int i3 = 1659984562 ^ i2;
            this.inventorySlot = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -245447047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1856141470 ^ i2)) {
                int i4 = 1143740793 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -422308886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1316552855 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1622289391 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setProgressTitle(String str) {
        int i = 220918102 ^ (1304953427 ^ 20392602);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 246336762) {
            int i2 = 1814011366 ^ i;
            this.progressTitle = str;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1850876873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1512898754 ^ i)) {
                int i3 = 1923383489 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 246336762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2097631043 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1180485779 ^ i;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = " ⠁⡼⠋⠀⣆⠀⠀⣰⣿⣫⣾⢿⣿⣿⠍⢠⠠⠀⠀⢀⠰⢾⣺⣻⣿⣿⣿⣷⡀⠀";
        nothing_to_see_here[1] = "⣥⠀⠀⠀⠁⠀⠠⢻⢬⠁⣠⣾⠛⠁⠀⠀⠀⠀⠀⠀⠀⠐⠱⠏⡉⠙⣿⣿⡇⠀";
        nothing_to_see_here[2] = "⢳⠀⢰⡖⠀⠀⠈⠀⣺⢰⣿⢻⣾⣶⣿⣿⣶⣶⣤⣤⣴⣾⣿⣷⣼⡆⢸⣿⣧⠀";
        nothing_to_see_here[3] = "⠈⠀⠜⠈⣀⣔⣦⢨⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⣼⠛⢹⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⢋⡿⡿⣯⣭⡟⣟⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡘⠀";
        nothing_to_see_here[5] = "⡀⠐⠀⠀⠀⣿⣯⡿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣉⢽⣿⡆⠀⠀";
        nothing_to_see_here[6] = "⢳⠀⠄⠀⢀⣿⣿⣿⣿⣿⣿⣿⠙⠉⠉⠉⠛⣻⢛⣿⠛⠃⠀⠐⠛⠻⣿⡇⠀⠀";
        nothing_to_see_here[7] = "⣾⠄⠀⠀⢸⣿⣿⡿⠟⠛⠁⢀⠀⢀⡄⣀⣠⣾⣿⣿⡠⣴⣎⣀⣠⣠⣿⡇⠀⠀";
        nothing_to_see_here[8] = "⣧⠀⣴⣄⣽⣿⣿⣿⣶⣶⣖⣶⣬⣾⣿⣾⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⣿⣶⣈⡯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣹⢧⣿⣿⣿⣄⠙⢿⣿⣿⣿⠇⠀⠀";
        nothing_to_see_here[10] = "⠹⣿⣿⣧⢌⢽⣻⢿⣯⣿⣿⣿⣿⠟⣠⡘⠿⠟⠛⠛⠟⠛⣧⡈⠻⣾⣿⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠈⠉⣷⡿⣽⠶⡾⢿⣿⣿⣿⢃⣤⣿⣷⣤⣤⣄⣄⣠⣼⡿⢷⢀⣿⡏⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⢀⣿⣷⠌⣈⣏⣝⠽⡿⣷⣾⣏⣀⣉⣉⣀⣀⣀⣠⣠⣄⡸⣾⣿⠃⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⣰⡿⣿⣧⡐⠄⠱⣿⣺⣽⢟⣿⣿⢿⣿⣍⠉⢀⣀⣐⣼⣯⡗⠟⡏⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⣰⣿⠀⣿⣿⣴⡀⠂⠘⢹⣭⡂⡚⠿⢿⣿⣿⣿⡿⢿⢿⡿⠿⢁⣴⣿⣷⣶⣦⣤";
        nrqlzyabxe = sikukwycrsjqkeb();
        f851oFYz54cIb = 1036169692 ^ new Random(-4663210849399272182L).nextInt();
    }

    public static String mafogzkoeb(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ nrqlzyabxe[i3 % nrqlzyabxe.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] sikukwycrsjqkeb() {
        return new byte[]{18, 51, 120, 45, 36, 106, 93, 62, 67, 68, 61, 124, 9, 86, 114, 19, 22, 85, 81, 53, 6, 57, 34, 114, 48, 46, 4, 17, 125, 110, 90, 71, 114, 120, 111, 45, 65, 12, 100, 53, 8, 16, 87, 21, 93, 1, 25, 12, 21, 38, 17, 24, 86, 94, 87, 50, 17, 11, 92, 81, 117, 29, 73, 116, 97, 90, Byte.MAX_VALUE, 13, 56, 102, 114, 126, 106, 39, 120, 93, 64, 20, 20, 87, 89, 11, 81, 59, 20, 107, 23, 13, 8, 101, 1, 74, 26, 123, 1};
    }

    private static byte[] wqdklanktsdeikd() {
        return new byte[]{-38, -4, 64, 111, 28, 46, 110, 101, 123, 21, 13, 54, 59, 11, 68, 83, 34, 30, 103, 40, 62, 98, 26, 39, 3, 117, 60, 73};
    }

    private static byte[] dqfujrstgujdoag() {
        return new byte[]{-35, -1, 75, 116, 18, 52, 104, 99, 118, 27, 12, 56, 58, 11, 68, 69, 35, 73, 100, 113, 55, 115, 17, 58, 6, 121, 49, 83};
    }

    private static byte[] kvmmzljrpbljwuu() {
        return new byte[]{-35, -8, 77, 116, 21, 51, 108, 122, 117, 17, 12, 38, 60, 18, 67, 75, 39, 21, 103, 124, 55, 32, 23, 49, 1, 117, 53, 76, 75, 42};
    }

    private static byte[] hlocwjsmykizsig() {
        return new byte[]{-35, -4, 76, 69, 22, 41, 107, 102, 116, 22, 12, 62, 61, 11, 64, 81, 32, 17};
    }

    private static byte[] vpyjughatvizvhm() {
        return new byte[]{-37, -11, 74, 122, 16, 56, 109, 121, 113, 22, 4, 99, 60, 15, 65, 86, 34, 11, 102, 120, 52, 101, 22, 49, 0, 118, 54, 79, 68, 57, 111, 1};
    }

    private static byte[] scsgpczdxioqnbb() {
        return new byte[]{-40, -8, 76, Byte.MAX_VALUE, 23, 60, 110, 120, 123, 21, 9, 47, 56, 10, 69, 82, 36, 4, 101, 100, 50, 123, 17, 104, 3, 117, 60, 70, 73, 53, 107, 26};
    }

    private static byte[] zbtqwrxaiaurgly() {
        return new byte[]{-39, -2, 75, 107, 28, 33, 101, 101, 112, 22, 15, 61, 63, 11, 75, 88, 34, 21, 100, 42, 53, 123, 26, 34, 8, 110, 55, 72, 79, 56};
    }

    private static int eimrtqdyretacfwe(int i, int i2) {
        return i ^ i2;
    }
}
