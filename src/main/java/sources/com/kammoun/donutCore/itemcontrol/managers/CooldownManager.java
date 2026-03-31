package com.kammoun.donutCore.itemcontrol.managers;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Material;

public class CooldownManager {
    private final Map<UUID, Map<Material, Long>> playerCooldowns;
    private static int nZAlUnuaq6 = 0;
    private transient int Ev5p3OuPGQ = 449529108;
    private static byte[] kiadbpuiny;
    private static String[] nothing_to_see_here = new String[17];

    public CooldownManager() {
        int i = 1946905926 ^ (51519421 ^ 621398471);
        int parseInt = 2085894975 ^ (1540227473 ^ Integer.parseInt("1972011410"));
        this.Ev5p3OuPGQ = 449529108 ^ nZAlUnuaq6;
        this.playerCooldowns = new ConcurrentHashMap();
        int i2 = 1163082653 ^ (2103441117 ^ (1888408725 ^ parseInt));
    }

    public void setCooldown(UUID uuid, Material material, long j, int i) {
        int i2 = 463671124 ^ (1274495103 ^ 9664643);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2043036350) {
            i2 = 658709704 ^ i2;
            Map<Material, Long> computeIfAbsent = this.playerCooldowns.computeIfAbsent(uuid, uuid2 -> {
                int i3 = 935297411 ^ (1082648636 ^ 441990551);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1795334467) {
                    int i4 = 497933309 ^ i3;
                    return new ConcurrentHashMap();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2039710037 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1611412321 ^ i3)) {
                        int i5 = 469583008 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1795334467 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2030792789 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 1950302199 ^ i3;
                throw new IllegalAccessException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1138664701) {
                i2 = 208622871 ^ i2;
                computeIfAbsent.put(material, Long.valueOf(System.currentTimeMillis() + j));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -547621957) {
                    int i3 = 1714536352 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2043036350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (26330470 ^ i2)) {
                int i4 = 1425124202 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -547621957 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1744591816 ^ i2)) {
                    int i5 = 1925871003 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -287961416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1097050937 ^ i2)) {
                        int i6 = 1331697134 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1138664701 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (8602180 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 418526951 ^ i2;
        throw new IOException();
    }

    public boolean hasCooldown(java.util.UUID r6, org.bukkit.Material r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.managers.CooldownManager.hasCooldown(java.util.UUID, org.bukkit.Material, int):boolean");
    }

    public long getRemainingCooldown(java.util.UUID r6, org.bukkit.Material r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.managers.CooldownManager.getRemainingCooldown(java.util.UUID, org.bukkit.Material, int):long");
    }

    public long getLastUsageTime(java.util.UUID r5, org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.managers.CooldownManager.getLastUsageTime(java.util.UUID, org.bukkit.Material, int):long");
    }

    public void clearCooldown(java.util.UUID r5, org.bukkit.Material r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.managers.CooldownManager.clearCooldown(java.util.UUID, org.bukkit.Material, int):void");
    }

    public void clearAllCooldowns(UUID uuid, int i) {
        int i2 = 1196309777 ^ (2067702743 ^ 9664643);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -417385943) {
            i2 = 1499860087 ^ i2;
            this.playerCooldowns.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 741298579) {
                int i3 = 171258439 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2105983915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1056557291 ^ i2)) {
                int i4 = 1533841379 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -417385943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1575976360 ^ i2)) {
                    int i5 = 446330123 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 741298579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (525892504 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1866454616 ^ i2;
        throw new IOException();
    }

    public void clearAll(int i) {
        int i2 = 1564807921 ^ (1806207429 ^ 9664643);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1275650631) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1275650631 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1179268548 ^ i2)) {
                    break;
                }
            }
            int i3 = 1540373169 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 227354452 ^ i2;
        this.playerCooldowns.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -543283431) {
            int i5 = 666897146 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -543283431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1546704754 ^ i4)) {
                int i6 = 2009669929 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -509710136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (590211287 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1558987346 ^ i4;
        throw new IOException();
    }

    public void cleanup(int i) {
        int i2 = 1639576328 ^ (1797510818 ^ 9664643);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1347086664) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1347086664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1285292539 ^ i2)) {
                    break;
                }
            }
            int i3 = 928301421 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 687461443 ^ i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 394546001) {
            i4 = 1267105488 ^ i4;
            this.playerCooldowns.forEach((uuid, map) -> {
                int i5 = 810325492 ^ (1754298794 ^ 441990551);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 338071114) {
                    i5 = 1160699098 ^ i5;
                    map.entrySet().removeIf(entry -> {
                        byte b;
                        int i6 = 465079408 ^ (1528163386 ^ 441990551);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -676663574) {
                            int i7 = 1408855100 ^ i6;
                            if ((((Long) entry.getValue()).longValue() > currentTimeMillis ? 1 : (((Long) entry.getValue()).longValue() == currentTimeMillis ? 0 : -1)) > (151794145 ^ i7)) {
                                int dnsejacdkeailgdf = dnsejacdkeailgdf(i7, 185556405);
                                b = (byte) (33778772 ^ dnsejacdkeailgdf);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dnsejacdkeailgdf) != 270230176) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dnsejacdkeailgdf) == 270230176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(dnsejacdkeailgdf) == (984430967 ^ dnsejacdkeailgdf)) {
                                            break;
                                        }
                                    }
                                    int i8 = 407418609 ^ dnsejacdkeailgdf;
                                    throw new RuntimeException("double");
                                }
                                int i9 = 1919273063 ^ dnsejacdkeailgdf;
                            } else {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1214353160) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1214353160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (771797940 ^ i7)) {
                                            break;
                                        }
                                    }
                                    int i10 = 428634101 ^ i7;
                                    throw new RuntimeException("double");
                                }
                                int i11 = 1409577667 ^ i7;
                                b = (byte) (1560822563 ^ i11);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -398321390) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -398321390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (521902565 ^ i11)) {
                                            break;
                                        }
                                    }
                                    int i12 = 124427732 ^ i11;
                                    throw new IOException("double");
                                }
                                int dnsejacdkeailgdf2 = dnsejacdkeailgdf(i11, 877062103);
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(dnsejacdkeailgdf2) != 201864916) {
                                        throw null;
                                    }
                                    throw new IllegalAccessException();
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case 918910626:
                                            i6 = 540608470 ^ dnsejacdkeailgdf2;
                                            break;
                                        case 1249191851:
                                            i6 = dnsejacdkeailgdf(dnsejacdkeailgdf2, 263130615);
                                            break;
                                        default:
                                            throw new RuntimeException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 923617299) {
                                        int i13 = 377949489 ^ i6;
                                    }
                                }
                            }
                            return b;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 923617299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (6524060 ^ i6)) {
                                int i14 = 1291023077 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -676663574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1308608225 ^ i6)) {
                                    int i15 = 1333614373 ^ i6;
                                    throw new IOException("double");
                                }
                            }
                        }
                    });
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1028679832) {
                        int i6 = 1809222916 ^ i5;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1028679832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1840987942 ^ i5)) {
                        int i7 = 69341977 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 338071114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (46943572 ^ i5)) {
                            break;
                        }
                    }
                }
                int i8 = 450011709 ^ i5;
                throw new IOException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1270332883) {
                int i5 = 2125546576 ^ i4;
                this.playerCooldowns.entrySet().removeIf(entry -> {
                    int i6 = 2123183183 ^ (874805538 ^ 441990551);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2020898862) {
                        int i7 = 1817308273 ^ i6;
                        return ((Map) entry.getValue()).isEmpty();
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2020898862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (952839806 ^ i6)) {
                            int i8 = 2079327185 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -452664231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (412821079 ^ i6)) {
                                break;
                            }
                        }
                    }
                    int i9 = 1745447862 ^ i6;
                    throw new RuntimeException();
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1103257776) {
                    int i6 = 1708501640 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1103257776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (175245105 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1885328070 ^ i5;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1270332883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1305247102 ^ i4)) {
                int i8 = 1212181106 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 394546001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (339785965 ^ i4)) {
                    break;
                }
            }
        }
        int i9 = 444564526 ^ i4;
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
        kiadbpuiny = eiptnhbpqqefmqo();
        nZAlUnuaq6 = (-1270849537) ^ new Random(-8518840488735945561L).nextInt();
    }

    public static String pwjupylgbg(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ kiadbpuiny[i3 % kiadbpuiny.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] eiptnhbpqqefmqo() {
        return new byte[]{122, 22, 40, 13};
    }

    private static int dnsejacdkeailgdf(int i, int i2) {
        return i ^ i2;
    }
}
