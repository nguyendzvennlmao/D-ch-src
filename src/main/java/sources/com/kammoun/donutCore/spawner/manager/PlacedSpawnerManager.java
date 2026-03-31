package com.kammoun.donutCore.spawner.manager;

import com.kammoun.donutCore.spawner.models.PlacedSpawner;
import de.oliver.fancyholograms.api.FancyHologramsPlugin;
import de.oliver.fancyholograms.api.HologramManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import org.bukkit.Location;

public class PlacedSpawnerManager {
    private static PlacedSpawnerManager instance;
    private final Map<String, PlacedSpawner> activeSpawners;
    private static int reUpzTpNjl = 0;
    private transient int SmsVubwQwd = 181261500;
    private static String wwbupnhqlk;
    private static String[] nothing_to_see_here = new String[19];

    private PlacedSpawnerManager() {
        int i = 1309238096 ^ (27435707 ^ 853832524);
        int parseInt = 1393242788 ^ (242813728 ^ Integer.parseInt("540904227"));
        this.SmsVubwQwd = 181261500 ^ reUpzTpNjl;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 46798700:
                    parseInt = 1428927722 ^ parseInt;
                    break;
                case 666188521:
                default:
                    throw new IOException();
                case 1601137652:
                    break;
                case 2123280230:
            }
        }
        this.activeSpawners = new ConcurrentHashMap();
        int i2 = 1161863398 ^ (960804737 ^ parseInt);
    }

    public static com.kammoun.donutCore.spawner.manager.PlacedSpawnerManager getInstance(int r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.PlacedSpawnerManager.getInstance(int):com.kammoun.donutCore.spawner.manager.PlacedSpawnerManager");
    }

    public void addSpawner(org.bukkit.Location r8, com.kammoun.donutCore.spawner.models.Spawner r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.PlacedSpawnerManager.addSpawner(org.bukkit.Location, com.kammoun.donutCore.spawner.models.Spawner, int, int):void");
    }

    public PlacedSpawner getSpawner(Location location, int i) {
        int i2 = 1517826036 ^ (148037046 ^ 1117537845);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2118802504) {
            int i3 = 1939685898 ^ i2;
            return this.activeSpawners.get(locationToKey(location, 609371152));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 492811243 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (609796476 ^ i2)) {
                int i4 = 966894354 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2118802504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (840049770 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1063679098 ^ i2;
        throw new RuntimeException();
    }

    public void removeSpawner(Location location, int i) {
        int i2 = 1039662442 ^ (550729899 ^ 1117537845);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -37347422) {
            int i3 = 1988113550 ^ i2;
            String locationToKey = locationToKey(location, 609371152);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1237826513) {
                i3 = 690683111 ^ i3;
                PlacedSpawner placedSpawner = this.activeSpawners.get(locationToKey);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 9460968) {
                    i3 = 1851733075 ^ i3;
                    if (placedSpawner != null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1919549043) {
                            i3 = 1694523535 ^ i3;
                            if (placedSpawner.getHologram(1382913359) != null) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1516960264) {
                                    i3 = 1165414849 ^ i3;
                                    HologramManager hologramManager = FancyHologramsPlugin.get().getHologramManager();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1910273026) {
                                        i2 = 1580825085 ^ i3;
                                        hologramManager.removeHologram(placedSpawner.getHologram(1382913359));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2145928216) {
                                            i3 = 571191024 ^ i2;
                                            placedSpawner.setHologram(null, 497409280);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1874146199) {
                                                i3 = 1511035884 ^ i3;
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                    case 98952128:
                                        i3 = 1666487584 ^ i3;
                                        break;
                                    case 1035559656:
                                    case 1270869385:
                                        break;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1874146199 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1652207243 ^ i3)) {
                                int i4 = 2037395403 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1919549043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (939752365 ^ i3)) {
                                    int i5 = 1488571489 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1087263499 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1772894126 ^ i3)) {
                                        int i6 = 1078868874 ^ i3;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    } else {
                        i3 = 106231215 ^ i3;
                    }
                    this.activeSpawners.remove(locationToKey);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1087263499) {
                        int i7 = 1231589295 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1874146199) {
                            int i42 = 2037395403 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1919549043) {
                                continue;
                            } else {
                                int i52 = 1488571489 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1087263499) {
                                    int i62 = 1078868874 ^ i3;
                                    throw new IllegalAccessException("double");
                                }
                                continue;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 9460968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1302589700 ^ i3)) {
                        int i8 = 1937429449 ^ i3;
                        throw new RuntimeException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1516960264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (119313854 ^ i3)) {
                    int i9 = 751279652 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1910273026 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2018680547 ^ i3)) {
                        int i10 = 502883202 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1237826513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (569563357 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i11 = 793352583 ^ i3;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2145928216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1415462312 ^ i2)) {
                int i12 = 146773674 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -37347422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1477562007 ^ i2)) {
                    break;
                }
            }
        }
        int i13 = 1879122120 ^ i2;
        throw new IOException("double");
    }

    public boolean hasSpawner(Location location) {
        int i = 1401862383 ^ (2133456679 ^ 1117537845);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1910001643) {
            int i2 = 2024275704 ^ i;
            return this.activeSpawners.containsKey(locationToKey(location, 609371152));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1259882456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (489875539 ^ i)) {
                int i3 = 270771946 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1910001643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (250496226 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1179417400 ^ i;
        throw new RuntimeException();
    }

    public Collection getAllSpawners(int i) {
        int i2 = 2030330613 ^ (1611616184 ^ 1117537845);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -591701054) {
            int i3 = 1349612032 ^ i2;
            return this.activeSpawners.values();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -591701054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (396449924 ^ i2)) {
                int i4 = 359454403 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1597033408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (229987022 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 751532464 ^ i2;
        throw new RuntimeException();
    }

    private String locationToKey(Location location, int i) {
        int i2 = 984696893 ^ (708270714 ^ 1117537845);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1865243758) {
            i2 = 1248200586 ^ i2;
            String name = location.getWorld().getName();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1008558144) {
                i2 = 388096593 ^ i2;
                int blockX = location.getBlockX();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2062388552) {
                    int i3 = 1334879678 ^ i2;
                    int blockY = location.getBlockY();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 107520186) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 107520186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1955062749 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 1728862629 ^ i3;
                        throw new IOException("double");
                    }
                    i2 = 1662165124 ^ i3;
                    String str = name + ":" + blockX + ":" + blockY + ":" + location.getBlockZ();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 519939225) {
                        int i5 = 1188532252 ^ i2;
                        return str;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2062388552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (211697643 ^ i2)) {
                int i6 = 1817762554 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1008558144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1911812954 ^ i2)) {
                    int i7 = 930777492 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1865243758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2062864524 ^ i2)) {
                        int i8 = 823606921 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 519939225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1365240485 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 1753529712 ^ i2;
        throw new RuntimeException();
    }

    public void clear(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.PlacedSpawnerManager.clear(int):void");
    }

    @Generated
    public Map getActiveSpawners(int i) {
        int i2 = 1043943297 ^ (1614575688 ^ 1117537845);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -456421408) {
            int i3 = 107963706 ^ i2;
            return this.activeSpawners;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -676288976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (163483996 ^ i2)) {
                int i4 = 1962046337 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -456421408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1252633253 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1781475633 ^ i2;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀";
        nothing_to_see_here[5] = "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀";
        nothing_to_see_here[6] = "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀";
        nothing_to_see_here[7] = "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀";
        nothing_to_see_here[8] = "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀";
        nothing_to_see_here[10] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[11] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[12] = "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀";
        nothing_to_see_here[13] = "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀";
        nothing_to_see_here[18] = "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        wwbupnhqlk = ByteBuffer.wrap(htbwcfckuhcrpob()).asCharBuffer().toString();
        reUpzTpNjl = 1702588517 ^ new Random(-677211941511715021L).nextInt();
    }

    public static String hqytcrjjxt(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = wwbupnhqlk.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] htbwcfckuhcrpob() {
        return new byte[0];
    }

    private static int aftopmqhtpuojerl(int i, int i2) {
        return i ^ i2;
    }
}
