package com.kammoun.donutCore.crates.managers.crate;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.crates.managers.DataManager;
import com.kammoun.donutCore.crates.managers.HologramManager;
import com.kammoun.donutCore.crates.models.Crate;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Location;

public class CrateManager {
    private final DonutModule plugin;
    private final HashMap<Location, Crate> loadedCrates;
    private final ConfigManager configManager;
    private final DataManager dataManager;
    private final HologramManager hologramManager;
    private static int EQRkhYydi5 = 0;
    private transient int dSNgNlyBfY = 2031151915;
    private static byte[] yeqydkhdzp;
    private static String[] nothing_to_see_here = new String[13];

    public CrateManager(DonutModule donutModule, DataManager dataManager, HologramManager hologramManager, int i) {
        lrqevztprnocrhyq(1494417742 ^ 1808295759, 1288838294);
        int parseInt = 319018464 ^ (992047601 ^ Integer.parseInt("1445715590"));
        this.dSNgNlyBfY = 2031151915 ^ EQRkhYydi5;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 70394765:
                    parseInt = 1202704371 ^ parseInt;
                    break;
                case 112203951:
                    break;
                case 596176908:
                case 1988697229:
                default:
                    throw new IllegalAccessException();
            }
        }
        this.loadedCrates = new HashMap<>();
        this.plugin = donutModule;
        this.dataManager = dataManager;
        this.hologramManager = hologramManager;
        this.configManager = new ConfigManager(donutModule, 887423521);
        int i2 = 1452955636 ^ (934818992 ^ (1421994379 ^ (201203074 ^ (2065325480 ^ (764961728 ^ parseInt)))));
    }

    public void loadPlacedCrates(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.crate.CrateManager.loadPlacedCrates(int):void");
    }

    public void placeCrate(Location location, Crate crate, int i) {
        int i2 = 665967054 ^ (1563683281 ^ 254376304);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1386591365) {
            i2 = 793490886 ^ i2;
            this.loadedCrates.put(location, crate);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -687348406) {
                i2 = 575181649 ^ i2;
                SchedulerUtil.runAsync(()
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.crate.CrateManager.placeCrate(org.bukkit.Location, com.kammoun.donutCore.crates.models.Crate, int):void");
            }

            public void breakCrate(Location location, int i) {
                int i2 = 855991955 ^ (1645639285 ^ 254376304);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -237810510) {
                    int i3 = 2099424501 ^ i2;
                    Crate remove = this.loadedCrates.remove(location);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 415640345) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 415640345 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2098385666 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 1091487560 ^ i3;
                        throw new RuntimeException("double");
                    }
                    i2 = 659109066 ^ i3;
                    SchedulerUtil.runAsync(()
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.crate.CrateManager.breakCrate(org.bukkit.Location, int):void");
                }

                public Crate getCrateAt(Location location, int i) {
                    int i2 = 476116140 ^ (1110323270 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1958875950) {
                        int i3 = 396025551 ^ i2;
                        return this.loadedCrates.get(location);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 938154666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1502321562 ^ i2)) {
                            int i4 = 716806009 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1958875950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1919243404 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 902440130 ^ i2;
                    throw new RuntimeException();
                }

                public boolean isCrateLocation(Location location, int i) {
                    int i2 = 1276385566 ^ (385284609 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1369648262) {
                        int i3 = 290090130 ^ i2;
                        return this.loadedCrates.containsKey(location);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 605009898 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (67793350 ^ i2)) {
                            int i4 = 1681321658 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1369648262 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (245636385 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 612227775 ^ i2;
                    throw new RuntimeException();
                }

                public Crate getCrateById(String str, int i) {
                    int i2 = 1914950554 ^ (1781568543 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1177421912) {
                        int i3 = 1938762255 ^ i2;
                        return this.configManager.getCrateById(str, 88632608);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 631810003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1189567132 ^ i2)) {
                            int i4 = 62874531 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1177421912 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (252291151 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 15836244 ^ i2;
                    throw new IllegalAccessException();
                }

                public void reload(int r6) {
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.crate.CrateManager.reload(int):void");
                }

                @Generated
                public DonutModule getPlugin() {
                    int i = 1918034324 ^ (1361511012 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1659163649) {
                        int i2 = 441718381 ^ i;
                        return this.plugin;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1659163649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1285217730 ^ i)) {
                            int i3 = 927331166 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1337694359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (980928166 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 315167280 ^ i;
                    throw new IOException();
                }

                @Generated
                public HashMap<Location, Crate> getLoadedCrates() {
                    int i = 48435293 ^ (987986819 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1186425487) {
                        int i2 = 477253096 ^ i;
                        return this.loadedCrates;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1524300337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (791120227 ^ i)) {
                            int i3 = 433112921 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1186425487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1202750702 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 1124039141 ^ i;
                    throw new IOException();
                }

                @Generated
                public ConfigManager getConfigManager(int i) {
                    int i2 = 758102672 ^ (568118227 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 516964760) {
                        int i3 = 2110215699 ^ i2;
                        return this.configManager;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 516964760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (463091268 ^ i2)) {
                            int i4 = 1502840624 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -253038333 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1318608418 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i5 = 2046749463 ^ i2;
                    throw new IOException();
                }

                @Generated
                public DataManager getDataManager() {
                    int i = 2033568114 ^ (984739305 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1701506906) {
                        int i2 = 674023853 ^ i;
                        return this.dataManager;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 604807731 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (204462671 ^ i)) {
                            int i3 = 224883258 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1701506906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (525937752 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 255828780 ^ i;
                    throw new IOException();
                }

                @Generated
                public HologramManager getHologramManager() {
                    int i = 1259670450 ^ (464274342 ^ 254376304);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -58619102) {
                        int i2 = 1964431591 ^ i;
                        return this.hologramManager;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1412910105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (933875272 ^ i)) {
                            int i3 = 381429129 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -58619102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (817698695 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i4 = 1592671181 ^ i;
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
                    yeqydkhdzp = xocjmmcbcfsdrdh();
                    EQRkhYydi5 = (-681430708) ^ new Random(3629207965991989749L).nextInt();
                }

                public static String tkzbzbmmes(byte[] bArr, int i) {
                    byte[] bytes = Integer.toString(i).getBytes();
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 >= bArr.length) {
                            return new String(bArr, StandardCharsets.UTF_16);
                        }
                        bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                        bArr[i3] = (byte) (bArr[i3] ^ yeqydkhdzp[i3 % yeqydkhdzp.length]);
                        i2 = i3 + 1;
                    }
                }

                private static byte[] xocjmmcbcfsdrdh() {
                    return new byte[]{62, 7, 69, 62, 18, 8, 1, 92, 58, 58, 104, 71, 124, 43, 19, 109, 51, 4, 64, 109, 60, 57, 65, 115, 2, 24, 18, 92, 33, 117, 103, 116, 40, 125, 17, 121, 126, 125, 102, 72, 107, 67, 63, 61, 75, 121, 94, 118, 13, 104, 115, 118, 37, 82, 17, 27};
                }

                private static byte[] cnvowbpmfzohxza() {
                    return new byte[]{-15, -55, 116, 75, 34, Byte.MAX_VALUE, 48, 41, 14, 75, 89, 34, 77, 95, 35, Byte.MAX_VALUE, 2, 123, 116, 11, 13, 71, 112, 15, 50, 10, 35, 21, 21, 45, 86, 36, 25, 47, 33, 46, 79, 32, 82, 35, 90, 17, 14, 126, 123, 42, 111, 59, 57, 57, 66, 52, 20, 67, 33, 126, 15, 118, 113, 79, 35, 107, 48, 40, 10, 40, 89, 9, 72, 112, 34, 46, 2, 89, 112, 59, 13, 32, 117, 122, 51, 9, 35, 82, 17, 103, 86, 12, 28, 7, 32, 12, 79, 108, 86, 2, 90, 90, 11, 52, 122, 104, 111, 120, 61, 122, 66, 14, 17, 40, 32, 110, 15, 22, 117, 117, 35, 17, 53, 85, 11, 43, 89, 73, 76, 57, 34, 21, 7, 126, 113, 24, 13, 40, 113, 59, 51, 1, 38, 85, 16, 100, 86, 122};
                }

                private static byte[] wehujllgqbmmkod() {
                    return new byte[]{-14, -49, 125, 78, 39, 123, 54, 32, 10, 77, 95, 43, 72, 91, 37, 122, 3, 114, 114, 8, 4, 66, 116, 8, 53, 8, 34, 30, 22, 33, 83, 32, 30, 41, 33, 44, 76, 46, 94, 35, 94, 22, 8, Byte.MAX_VALUE, 123, 42, 105, 58, 57, 56, 69, 50, 21, 66, 35, 123, 6, 123, 112, 77, 37, 106, 49, 43, 13, 34, 92, 5, 74, 115, 35, 47, 1, 95, 120, 61, 9, 47, 118, 126, 50, 10, 37, 91, 21, 96, 81, 2, 24, 3, 35, 10, 70, 105, 83, 6, 92, 83, 15, 50, 124, 97, 106, 124, 59, Byte.MAX_VALUE, 67, 7, 23, 43, 41, 107, 11, 17, 114, 119, 34, 26, 54, 89, 14, 47, 94, 79, 76, 59, 33, 27, 11, 126, 117, 31, 11, 41, 113, 59, 53, 0, 38, 84, 23, 98, 87, 123};
                }

                private static byte[] kshplsxetvwswbs() {
                    return new byte[]{-15, -49, 119, 64, 36, Byte.MAX_VALUE, 57, 55, 11, 78, 95, 39, 75, 73, 42, 117, 11, 124, 113, 20, 14, 90, 119, 5, 58, 0, 35, 29, 22, 43, 80, 35, 17, 38, 41, 45, 79, 46, 84, 32, 93, 25, 7, 119, 122, 41, 105, 48, 58, 59, 74, 61, 29, 67, 32, 4, 12, 71, 115, 104, 42, 66, 48, 1, 13, 108, 95, 93, 69, 51, 43, 36, 2, 31, 114, 122, 10, 121, 121, 103, 51, 9, 37, 20, 22, 111, 94, 108, 16, 47, 32, 60, 76, 43, 80, 5, 83, 30, 14, 83, 124, 34, 105, 36, 52, 121, 75, 103, 20, 51, 35, 109, 8, 114, 125, 83, 35, 124, 54, 61, 13, 44, 81, 87, 68, 37, 34, 118, 1, 19, 118, 107, 4, 45, 112, 98, 53, 21, 37, 70, 24, 109, 95, 122, 25, 102, 35, 110, 72, 123, 94, 89};
                }

                private static byte[] fkrauvxbsufqkqv() {
                    return new byte[]{-8, -49, 117, 90, 32, 108, 52, 43, 8, 67, 95, 35, 77, 92, 39, 120, 0, 70, 120, 54, 12, 105, 115, 36, 55, 78, 32, 0, 22, 26, 86, 37, 28, 58, 34, 42, 70, 62, 86, 28, 89, 4, 10, 46, 121, 18, 105, 3, 60, 14, 71, 99, 22, 3, 41, 94, 14, 87, 119, 126, 39, 94, 51, 59, 13, 99, 89, 17, 72, 62, 32, 98, 11, 19, 112, 99, 14, 45, 116, 23, 48, 104, 37, 41, 16, 21, 83, 4, 27, 111, 41, 57, 78, 35, 84, 14, 94, 28, 13, 97, 124, 105, 111, 121, 57, 125, 64, 123, 29, 69, 33, 107, 12, 125, 112, 73, 32, 16, 54, 20, 11, 40, 92, 79, 79, 57, 43, 101, 3, 21, 114, 24, 9, 68, 115, 15, 53, 8, 35, 23, 21, 96, 84, 123, 16, 106, 33, 119, 76, 105, 83, 58, 89, 53, 8, 73, 122, 107, 106, 57, 62, 122, 75, 124, 21, 67, 35, 16};
                }

                private static byte[] tzmqviotgvsqliz() {
                    return new byte[]{-15, -51, 117, 85, 42, Byte.MAX_VALUE, 53, 33, 15, 79, 80, 60, 78, 75, 34, 120, 3, Byte.MAX_VALUE, 120, 16, 8, 93, 116, 13, 58, 116, 32, 64, 16, 106, 87, 101, 16, 111, 37, 14, 75, 31, 94, 63, 89, 58, 14, 40, 123, 49, 102, 40, 57, 56, 70, 37, 29, 15, 35, 75, 15, 109, 117, 101, 42, 72, 53, 12, 15, 126, 80, 26, 78, 108, 34, 120, 3, 107, 120, 23, 8, 77, 116, 17, 58, 101, 32, 72, 16, 55, 87, 35, 16, 61, 37, 36, 75, 41, 94, 80, 89, 74, 14, 40, 123, 126, 102, 100, 57, 24, 70, 8, 29, 46, 35, 15, 15, 74, 117, 38, 42, 7, 53, 77, 15, 53, 80, 95, 78, 94, 34, 22, 3, 120, 120, Byte.MAX_VALUE, 8, 113, 116, 99, 58, 29, 32, 72, 16, Byte.MAX_VALUE, 87, 108, 16, 14, 37, 6, 75, 9, 94, 80, 89, 13, 14, 40, 123, 124, 102, 100, 57, 102};
                }

                private static byte[] dglvkkzrhhhnffh() {
                    return new byte[]{-11, -49, 118, 88, 38, 120, 48, 38, 13, 74, 95, 55, 73, 75, 38, 124, 5, 112, 117, 21, 15, 89, 117, 8, 51, 122, 37, 65, 22, 108, 82, 105, 29, 108, 39, 8, 75, 24, 85, 50, 95, 59, 14, 43, 124, 60, 105, 41, 56, 61, 70, 36, 19, 0, 36, 72, 13, 109, 113, 104, 35, 76, 54, 8, 13, 125, 93, 22, 73, 105, 37, 122, 6, 100, 115, 16, 8, 73, 112, 23, 53, 104, 37, 79, 20, 54, 82, 42, 30, 56, 36, 34, 77, 44, 82, 93, 90, 72, 8, 40, 124, 117, 107, 98, 56, 24, 69, 15, 16, 33, 34, 14, 10, 74, 116, 40, 37, 0, 54, 79, 15, 49, 93, 86, 74, 93, 38, 20, 0, 117, 116, 120, 13, 118, 118, 102, 53, 22, 39, 72, 20, 123, 81, 99, 29, 11, 34, 2, 74, 12, 87, 94, 92, 12, 8, 46, 126, 112, 107, 103, 59, 96};
                }

                private static byte[] tkctnbzexszwljb() {
                    return new byte[]{-15, -52, 124, 83, 33, 105, 55, 40, 3, 66, 89, 39, 69, 86, 32, 124, 5, 68, 121, 56, 13, 108, 120, 40, 49, 76, 36, 8, 24, 19, 86, 35, 17, 55, 34, 41, 72, 57, 95, 20, 90, 4, 6, 37, 120, 27, 104, 3, 52, 5, 66, 98, 28, 9, 34, 88, 8, 86, 124, 115, 35, 89, 56, 59, 9, 98, 94, 19, 69, 50, 34, 100, 10, 28, 115, 99, 10, 41, 120, 29, 51, 100, 43, 33, 18, 22, 81, 1, 17, 100, 32, 58, 71, 42, 85, 11, 93, 31, 6, 96, 122, 109, 103, 115, 62, 121, 69, 121, 28, 75, 32, 110, 7, 113, 118, 75, 36, 24, 56, 29, 11, 46, 81, 66, 79, 58, 37, 98, 10, 29, 113, 24, 5, 79, 114, 6, 52, 8, 43, 28, 16, 97, 94, 113, 27, 108, 39, 118, 71, 100, 87, 61, 82, 53, 12, 72, 125, 105, 103, 53, 60, 124, 74, 115, 22, 67, 39, 20};
                }

                private static byte[] wbcnhhvhebzqjio() {
                    return new byte[]{-15, -55, 114, 64, 38, 113, 51, 55, 9, 78, 89, 36, 75, 72, 39, 122, 1, 117, 115, 18, 13, 92, 118, 11, 54, 15, 32, 20, 18, 40, 86, 36, 31, 41, 37, 43, 76, 33, 85, 38, 90, 17, 8, 120, Byte.MAX_VALUE, 47, 108, 58, 62, 60, 66, 52, 18, 69, 37, 4, 12, 72, 118, 96, 35, 75, 54, 7, 14, 105, 90, 83, 79, 58, 34, 36, 4, 31, 116, 122, 14, 120, 114, 110, 51, 9, 37, 17, 21, 110, 85, 108, 27, 47, 32, 58, 73, 43, 82, 11, 89, 30, 12, 83, 122, 33, 105, 37, 57, 118, 65, 110, 22, 53, 32, 107, 9, 124, 113, 92, 32, 117, 50, 62, 11, 43, 95, 88, 72, 35, 33, 121, 0, 21, 113, 99, 11, 34, 117, 100, 48, 31, 33, 65, 16, 100, 80, 124, 28, 102, 35, 97, 77, 115, 87, 80};
                }

                private static int lrqevztprnocrhyq(int i, int i2) {
                    return i2 ^ i;
                }
            }
