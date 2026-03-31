package com.kammoun.donutCore.home.managers;

import com.kammoun.donutCore.home.HomePlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lombok.Generated;

public class ConfigManager {
    private final HomePlugin plugin;
    private List<String> blockedWorlds;
    private int homeTeleportDelay;
    private int maxHomesPerPlayer;
    private final Map<Integer, String> homePerPermissions;
    private static int Z8GHmsVNU9 = 0;
    private transient int Y0J0MyZNHk = 957796157;
    private static byte[] cccllwtgvd;
    private static String[] nothing_to_see_here = new String[15];

    public ConfigManager(com.kammoun.donutCore.home.HomePlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.ConfigManager.<init>(com.kammoun.donutCore.home.HomePlugin, int):void");
    }

    public void loadConfig(int i) {
        int i2 = 746623000 ^ (1424786180 ^ 1737492728);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2040032) {
            i2 = 377922061 ^ i2;
            this.homeTeleportDelay = this.plugin.getConfig(127597628).getInt(igsgourwnt(nvlqlmdxfnkxgdg(), i2), (byte) (159037932 ^ i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1272303432) {
                i2 = 1558710036 ^ i2;
                this.maxHomesPerPlayer = (byte) (1435680509 ^ i2);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1399457814) {
                    i2 = 1199056964 ^ i2;
                    this.blockedWorlds = this.plugin.getConfig(127597628).getStringList(igsgourwnt(fpsbpsxjzpoicbm(), i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1756056120) {
                        i2 = 321721406 ^ i2;
                        loadHomePermissions(1299167084);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 238818360) {
                            int i3 = 1218442624 ^ i2;
                            return;
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2040032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1880409297 ^ i2)) {
                int i4 = 536769624 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1399457814 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1580994819 ^ i2)) {
                    int i5 = 1249412806 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1254340666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (509790477 ^ i2)) {
                        int i6 = 1526105502 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 238818360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1393729079 ^ i2)) {
                            int i7 = 1489993095 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1272303432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2040511722 ^ i2)) {
                                int i8 = 1394805392 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1756056120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (852173937 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i9 = 888151616 ^ i2;
        throw new IOException();
    }

    private void loadHomePermissions(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.ConfigManager.loadHomePermissions(int):void");
    }

    @Generated
    public HomePlugin getPlugin() {
        int i = 421114951 ^ (738789929 ^ 1737492728);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1811565390) {
            int i2 = 1559666905 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1940959864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (912687937 ^ i)) {
                int i3 = 1099067124 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1811565390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (758145738 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 872658379 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public List getBlockedWorlds(int i) {
        int i2 = 222191784 ^ (895003905 ^ 1737492728);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -4838774) {
            int i3 = 250114940 ^ i2;
            return this.blockedWorlds;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -4838774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (532778499 ^ i2)) {
                int i4 = 1636834374 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1997164182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (250813529 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 280963659 ^ i2;
        throw new IOException();
    }

    @Generated
    public int getHomeTeleportDelay(int i) {
        int i2 = 489805737 ^ (905412666 ^ 1737492728);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2058550106) {
            int i3 = 1114360572 ^ i2;
            return this.homeTeleportDelay;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2058550106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1139634656 ^ i2)) {
                int i4 = 547488333 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1777118392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1741441667 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 430514084 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getMaxHomesPerPlayer(int i) {
        int i2 = 523867151 ^ (1147141374 ^ 1737492728);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -407699383) {
            int i3 = 1489228023 ^ i2;
            return this.maxHomesPerPlayer;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 565020659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1830644977 ^ i2)) {
                int i4 = 1287899153 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -407699383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1986566110 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1540747001 ^ i2;
        throw new IOException();
    }

    @Generated
    public Map getHomePerPermissions(int i) {
        int i2 = 1185170319 ^ (750681949 ^ 1737492728);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1817289040) {
            int i3 = 1945601836 ^ i2;
            return this.homePerPermissions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1817289040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (404642889 ^ i2)) {
                int i4 = 48053176 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -202532813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1134833671 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1542171542 ^ i2;
        throw new RuntimeException();
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
        cccllwtgvd = fqalsbxbylascrq();
        Z8GHmsVNU9 = 252025256 ^ new Random(4963885889459087308L).nextInt();
    }

    public static String igsgourwnt(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ cccllwtgvd[i3 % cccllwtgvd.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] fqalsbxbylascrq() {
        return new byte[]{62, 53, 63, 84, 95, 71, 18, 15, 6, 90, 44, 91, 80, 54, 110, 55, 91, 8, 103, 54, 122, 71, 79, 64, 82, 27, 22, 43, 43, 98, 56, 17, 9, 7, 63, 66, 24, 123, 19, 97, 47, 30, 28, 31, 23, 62, 27, 88, 91, Byte.MAX_VALUE, 123, 4, 117, 81, 35, 68, 93, 62, 18, 96, 61, 85, 87, 125, 85, 83, 6, 48, 57, 103, 68, 1, 61, 62, 73, 62, 98, 124, 62, 60, 83, 27, 6, 95, 21, 48, 77, 12, 111, 42, 55, 99, 21, 64, 75, 17, 125, 11, 29, 100, 118, 89, 5, 29, 109, 85};
    }

    private static byte[] fpsbpsxjzpoicbm() {
        return new byte[]{-13, -5, 8, 37, 105, 24, 42, 89, 49, 10, 29, 7, 99, 101, 93, 107, 98, 18, 84, 80, 77, 27, 121, 1, 106, 78, 33, 124, 26, 38};
    }

    private static byte[] nvlqlmdxfnkxgdg() {
        return new byte[]{-15, -1, 6, 23, 108, 21, 43, 73, 63, 31, 25, 11, 96, 107, 89, 105, 105, 66, 86, 45, 67, 19, 124, 18, 107, 69, 47, 123, 30, 34, 8, 15, 62, 74, 13, 20, 41, 99, 42, 37, 28, 76, 37, 65, 46, 106, 46, 17, 107, 35, 76, 79, 71, 28, 18, 92, 100, 103, 33, 57, 4, 74, 110, 63, 96, 15, 54, 96, 14, 49, 118, 86, 12, 111, 112, 125};
    }

    private static byte[] yycnbquoqmsxgzr() {
        return new byte[]{-9, -3, 12, 8, 109, 26, 32, 80, 51, 8, 27, 69, 100, 116, 92, 96, 105, 79, 80, 108, 73, 26, 125, 1, 96, 90, 35, 117, 28, 62, 12, 77, 59, 70};
    }

    private static byte[] cprrojecyezvchf() {
        return new byte[]{-12, -7, 13, 37, 110, 30, 35, 78, 54, 2, 31, 13, 98, 39, 88, 104, 111, 87, 83, 113, 72, 85, 126, 26, 99, 64, 38, 126, 24, 52, 10, 0, 63, 17, 11, 26, 44, 39, 33, 62, 30, 77, 45, 6, 39, 122, 40, 15, 105, 60, 77, 88, 65, 8, 23, 4, 111, Byte.MAX_VALUE, 35, 63, 12, 14, 103, 39, 102, 18, 52, 38, 15, 118, 112, 66, 9, 104, 123, 111, 83, 62, 15, 97, 99, 64, 53, 3, 39, 32};
    }

    private static int ksjlnnfntxoqcjqn(int i, int i2) {
        return i ^ i2;
    }
}
