package com.kammoun.donutCore.sell.model;

import com.kammoun.donutCore.sell.service.Enums.Category;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Material;

public class SellPlayerData {
    private final UUID uuid;
    private final HashMap<Material, Long> soldItems;
    private HashMap<Category, SellLevelData> levels;
    private static int Snmk4KioCG = 0;
    private transient int sYLgboPq6A = 759038178;
    private static byte[] igtmlbwpof;
    private static String[] nothing_to_see_here = new String[15];

    public SellPlayerData(UUID uuid, UUID uuid2, HashMap<Material, Long> hashMap) {
        dbicvacsjzxczyjf(773405658 ^ 864883057, 1184067205);
        int parseInt = 437264518 ^ (1039380605 ^ Integer.parseInt("2095371477"));
        this.sYLgboPq6A = 759038178 ^ Snmk4KioCG;
        int dbicvacsjzxczyjf = 1521910214 ^ dbicvacsjzxczyjf(parseInt, 1306702059);
        this.levels = new HashMap<>();
        this.uuid = uuid;
        this.soldItems = uuid2;
        int i = 2002951804 ^ (975095568 ^ (905300467 ^ dbicvacsjzxczyjf));
    }

    public void addSoldItem(org.bukkit.inventory.ItemStack r6, com.kammoun.donutCore.sell.model.SellCategory r7, double r8, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.model.SellPlayerData.addSoldItem(org.bukkit.inventory.ItemStack, com.kammoun.donutCore.sell.model.SellCategory, double, int):void");
    }

    public long getTotalSoldItems() {
        int i = 1361783523 ^ (694435705 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1399833098) {
            int i2 = 1779766151 ^ i;
            return this.soldItems.values().stream().mapToLong((v0) -> {
                return v0.longValue();
            }).sum();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 63397425 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1266906113 ^ i)) {
                int i3 = 805602072 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1399833098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1370777465 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 953190852 ^ i;
        throw new IllegalAccessException();
    }

    public long getSoldAmount(Material material, int i) {
        int i2 = 787354055 ^ (1309799046 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1763150638) {
            int i3 = 562134595 ^ i2;
            return this.soldItems.getOrDefault(material, 0L).longValue();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1696364853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (173497765 ^ i2)) {
                int i4 = 401497280 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1763150638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1830666047 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1029415112 ^ i2;
        throw new RuntimeException();
    }

    public List getSoldMaterials(int i) {
        int i2 = 797190409 ^ (2059036578 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 954538883) {
            int i3 = 1349852017 ^ i2;
            return this.soldItems.keySet().stream().toList();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 954538883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (109890111 ^ i2)) {
                int i4 = 534285407 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1152532471 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (245409265 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 826403955 ^ i2;
        throw new IllegalAccessException();
    }

    public SellLevelData getLevelData(Category category, int i) {
        int i2 = 1947410642 ^ (1528283129 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -382494848) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -382494848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1104187508 ^ i2)) {
                    break;
                }
            }
            int i3 = 2087902805 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1833793543 ^ i2;
        if (this.levels.containsKey(category) == (1886063351 ^ i4)) {
            int i5 = 1970013898 ^ i4;
            return null;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2091362373) {
            int i6 = 1953391314 ^ i4;
            return this.levels.get(category);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2091362373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (614530420 ^ i4)) {
                int i7 = 1420486585 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 674783720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (957997921 ^ i4)) {
                    break;
                }
            }
        }
        int i8 = 313214272 ^ i4;
        throw new IOException();
    }

    @Generated
    public UUID getUuid(int i) {
        int i2 = 276738442 ^ (2076607482 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -858325670) {
            int i3 = 179460785 ^ i2;
            return this.uuid;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1723586350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1828628324 ^ i2)) {
                int i4 = 490731583 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -858325670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1199156178 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 39766473 ^ i2;
        throw new IOException();
    }

    @Generated
    public HashMap getSoldItems(int i) {
        int i2 = 1818203323 ^ (1162620954 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -645248048) {
            int i3 = 1520112462 ^ i2;
            return this.soldItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -645248048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1691181026 ^ i2)) {
                int i4 = 732248327 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 223531426 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1271687743 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 59941800 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public HashMap getLevels(int i) {
        int i2 = 1292323049 ^ (1058853455 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 30129130) {
            int i3 = 785466749 ^ i2;
            return this.levels;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 30129130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (856518657 ^ i2)) {
                int i4 = 268715654 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2000785411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (759868383 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1876150202 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setLevels(HashMap hashMap, int i) {
        int i2 = 594316686 ^ (1559871555 ^ 841149915);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1841103026) {
            int i3 = 972690158 ^ i2;
            this.levels = hashMap;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1569876029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (474428733 ^ i2)) {
                int i4 = 185393512 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1841103026 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1820636093 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 581239046 ^ i2;
        throw new IOException();
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        igtmlbwpof = bvokinqotjsawap();
        Snmk4KioCG = (-1030702334) ^ new Random(8880996439404104441L).nextInt();
    }

    public static String mrxkexgoie(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ igtmlbwpof[i3 % igtmlbwpof.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] bvokinqotjsawap() {
        return new byte[]{97, 48, 2, 6, 105, 98, 93, 73, 93, 99, 42, 55, 32, 15, 50, 2, 93, 24, 33, 81, 13, 23, 70, 32, 116, 68, 71, 37, 29, 20, 20, 89, 5, 75, 34, 66, 37, 16, 120, 101, 40, 61, 45, 35, 68, 125, 118, 34, 70, 10, 74, 100, 100, 124, 100, 91, 91, 9, 112, 70, 44, 5, 1, 56, 5, 21, 15, 15, 11, 89, 83, 54, 103, 76, 45, 102, 15, 27, 47, 42, 21, 91, 10, 33, 69, 96, 71, 44, 95, 14, 66, 86, 19, 9, 12, 94, 110, 6, 30, 38, 116, 126, 4, 40, 54, 47, 94, 84, 67, 75, 107, 32, 96, 76, 23, 67, 57, 17, 45, 60};
    }

    private static int dbicvacsjzxczyjf(int i, int i2) {
        return i ^ i2;
    }
}
