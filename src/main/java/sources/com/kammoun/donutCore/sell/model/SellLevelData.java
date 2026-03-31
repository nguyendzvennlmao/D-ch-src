package com.kammoun.donutCore.sell.model;

import com.kammoun.donutCore.sell.SellPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class SellLevelData {
    private double requiredAmount;
    private double progress;
    private int level;
    public static final int PROGRESS_BAR_LENGTH = 20;
    private static int gtTP1VbCN7 = 0;
    private transient int pVshlEugUX = 2057331408;
    private static String zmlikadrsy;
    private static String[] nothing_to_see_here = new String[15];

    public SellLevelData(int r5, double r6, double r8, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.model.SellLevelData.<init>(int, double, double, int):void");
    }

    public int getProgressPercentage(int i) {
        int i2 = 1649954309 ^ (1945802675 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1287336966) {
            i2 = 406808088 ^ i2;
            if ((this.requiredAmount > 0.0d ? 1 : (this.requiredAmount == 0.0d ? 0 : -1)) > (1314389863 ^ i2)) {
                i2 = 260507316 ^ i2;
                double d = (this.progress / this.requiredAmount) * 100.0d;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 243781274) {
                    int i3 = 599839835 ^ i2;
                    return (int) Math.min(d, 100.0d);
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1925184314) {
                return (byte) (1847796709 ^ (544529638 ^ i2));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1897470987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1220295662 ^ i2)) {
                int i4 = 636201625 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 243781274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1106655754 ^ i2)) {
                    int i5 = 1498284178 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1287336966 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1574521296 ^ i2)) {
                        int i6 = 1393641333 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1925184314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1468579995 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 587449547 ^ i2;
        throw new RuntimeException();
    }

    public String getProgressBar(int i) {
        int i2 = 521725297 ^ (738896015 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1497339461) {
            i2 = 1255727566 ^ i2;
            float progressPercentage = getProgressPercentage(226886789);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -267950135) {
                i2 = 22355379 ^ i2;
                int i3 = (int) ((progressPercentage / 100.0f) * 20.0f);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -89159087) {
                    int i4 = 973046766 ^ i2;
                    return yovynsnpcs(gcgrhiudhpmdwpd(), i4).repeat(i3) + yovynsnpcs(grfeovvfiszlepz(), i4).repeat(((byte) (111833776 ^ i4)) - i3);
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 894670112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (889163437 ^ i2)) {
                int i5 = 1026755682 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -267950135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (192028091 ^ i2)) {
                    int i6 = 725089159 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1497339461 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (502140415 ^ i2)) {
                        int i7 = 1687479380 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -89159087 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2069134740 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 1797788262 ^ i2;
        throw new IOException();
    }

    public void addProgress(double d, int i) {
        int i2 = 253656706 ^ (1433655013 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -314620560) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -314620560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1275489656 ^ i2)) {
                    break;
                }
            }
            int i3 = 585713469 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1686392369 ^ i2;
        this.progress += d;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -920832773) {
            int i5 = 1836867615 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1560398848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1197484448 ^ i4)) {
                int i6 = 1420571789 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -920832773 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1865146076 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1740693758 ^ i4;
        throw new IOException();
    }

    public boolean isDone(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.model.SellLevelData.isDone(int):boolean");
    }

    public double getCurrentMultiplier(int i) {
        int i2 = 1162621994 ^ (1175123217 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 610537362) {
            int i3 = 389442864 ^ i2;
            return 1.0d + (this.level * 0.1d);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 610537362 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1402451307 ^ i2)) {
                int i4 = 1193734378 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1646828014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (200956456 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1006045221 ^ i2;
        throw new IOException();
    }

    public void levelUp(int i) {
        int i2 = 87042752 ^ (130159929 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 700709250) {
            i2 = 473404486 ^ i2;
            this.progress = 0.0d;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -931177550) {
                int i3 = 1925754074 ^ i2;
                this.level += (byte) (734480301 ^ i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1580875105) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1580875105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (734883791 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 360342025 ^ i3;
                    throw new RuntimeException("double");
                }
                i2 = 381487565 ^ i3;
                this.requiredAmount = ((Long) SellPlugin.getInstance(854149756).getConfigManager(1299309642).getLevelPrices(1851686263).get(this.level)).longValue();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -338529527) {
                    int i5 = 1984084453 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -931177550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (148658129 ^ i2)) {
                int i6 = 1190818755 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -338529527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1228097366 ^ i2)) {
                    int i7 = 1469565715 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 700709250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1825558070 ^ i2)) {
                        int i8 = 2086603710 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1506262050 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (206984996 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 441539477 ^ i2;
        throw new IOException();
    }

    @Generated
    public double getRequiredAmount() {
        int i = 1994964464 ^ (1283795603 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -314655405) {
            int i2 = 1858480872 ^ i;
            return this.requiredAmount;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -314655405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (467856427 ^ i)) {
                int i3 = 1089706589 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1693455856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (119382099 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 733419184 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public double getProgress(int i) {
        int i2 = 2102386802 ^ (1812934245 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1269532942) {
            int i3 = 1160734864 ^ i2;
            return this.progress;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1269532942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (314564500 ^ i2)) {
                int i4 = 1531566429 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1657851280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2015559742 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1457139016 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getLevel(int i) {
        int i2 = 201790633 ^ (2084056417 ^ 1204437193);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1079261175) {
            int i3 = 1841230881 ^ i2;
            return this.level;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -765695742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (659599128 ^ i2)) {
                int i4 = 1079935794 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1079261175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (622853265 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1248679390 ^ i2;
        throw new IllegalAccessException();
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
        zmlikadrsy = ByteBuffer.wrap(tvvxbqeipmcnaen()).asCharBuffer().toString();
        gtTP1VbCN7 = (-88352153) ^ new Random(4805832410995349168L).nextInt();
    }

    public static String yovynsnpcs(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = zmlikadrsy.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] gcgrhiudhpmdwpd() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 0};
    }

    private static byte[] grfeovvfiszlepz() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 11};
    }

    private static byte[] tvvxbqeipmcnaen() {
        return new byte[]{49, 23, 49, 27, 51, 3, 55, 6, 52, 87, 49, 8, 56, 11, 51, 1, 54, 18, 49, 92, 49, 24, 49, 23, 49, 94, 51, 21, 55, 91, 52, 17};
    }

    private static int dppyppdffifaghae(int i, int i2) {
        return i ^ i2;
    }
}
