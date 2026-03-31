package com.kammoun.donutCore.stats.models;

import com.kammoun.donutCore.api.utils.VaultService;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Bukkit;

public class StatsHolder {
    private UUID playerUUID;
    private int kills;
    private int blocksBroken;
    private int blocksPlaced;
    private int deaths;
    private int mobKills;
    private long playTime;
    private int itemsCrafted;
    private int jumps;
    private int chatMessages;
    private double money;
    private double shards;
    private double moneySpent;
    private double moneyMade;
    private long lastUpdated;
    private transient boolean dirty;
    private static int TZlnVlbekD = 0;
    private transient int f5K2XoT5ZN = 468405797;
    private static String evtkfjiopc;
    private static String[] nothing_to_see_here = new String[13];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$stats$models$StatsType;
        private static int p8mbEfs0ji = 0;
        private transient int oiwJKWDCA9 = 492805151;
        private static byte[] zehcrnazwj;
        private static String[] nothing_to_see_here;

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.AnonymousClass1.m395clinit():void");
        }

        public static String qckbhuzffx(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ zehcrnazwj[i3 % zehcrnazwj.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] wrqlunbwaevenhf() {
            return new byte[]{3, 100, 104, 63, 2, 59, 50, 28, 21, 30, 29, 46, 24, 50, 53, 92, 46, 48, 41, 21, 42, 53, 111, 74, 66, 92, 63, 46, 99, 73, 69, 33, 10, 86, 37, 39, 53, 12, 115, 107, 105, 50, 103, 36, 16, 91, 76, 15, 119, 44, 26, 59, 35, 21, 27, 3, 103, 8, Byte.MAX_VALUE, 18, 66, 55, 76, 21, 75, 9, 102, 62, 99, 111, 40, 21, 46, 21, 35, 15, 118, 14, 59, 67, 83, 89};
        }

        private static int gmllcmlwzojwukma(int i, int i2) {
            return i ^ i2;
        }
    }

    public StatsHolder(java.util.UUID r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.<init>(java.util.UUID, int):void");
    }

    public StatsHolder(UUID uuid, int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, double d, double d2, double d3, double d4, long j2, int i9) {
        bbxxhcacmqxhonjd(1770755773 ^ 1283259110, 144508547);
        int parseInt = 1359177697 ^ (1057822373 ^ Integer.parseInt("1130634140"));
        this.f5K2XoT5ZN = 468405797 ^ TZlnVlbekD;
        this.dirty = false;
        this.playerUUID = uuid;
        this.kills = i;
        this.blocksBroken = i2;
        this.blocksPlaced = i3;
        this.deaths = i4;
        this.mobKills = i5;
        this.playTime = j;
        this.itemsCrafted = i6;
        this.jumps = i7;
        this.chatMessages = i8;
        this.money = d;
        this.shards = d2;
        this.moneySpent = d3;
        this.moneyMade = d4;
        this.lastUpdated = j2;
        this.dirty = false;
        int i10 = 886503147 ^ (1248407903 ^ (841378852 ^ (873955134 ^ (1334230393 ^ (2088411104 ^ (559431557 ^ (950689333 ^ (571490599 ^ (2041458237 ^ (1711250464 ^ (1455765848 ^ (1097039258 ^ (577116915 ^ (1092449988 ^ (1021920815 ^ (1868589811 ^ (2010572655 ^ (902120649 ^ parseInt))))))))))))))))));
    }

    public void incrementMoneyMade(double d, int i) {
        int i2 = 1823530339 ^ (1322031024 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1654146882) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1654146882 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1591574288 ^ i2)) {
                    break;
                }
            }
            int i3 = 1123948302 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 758326907 ^ i2;
        this.moneyMade += d;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 184644763) {
            i4 = 252003069 ^ i4;
            markDirty(819637619);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1932223347) {
                int i5 = 1090362354 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1932223347 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1277856641 ^ i4)) {
                int i6 = 816394659 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 184644763 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (418116284 ^ i4)) {
                    int i7 = 1107204010 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1959247073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1242720400 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1787555582 ^ i4;
        throw new IllegalAccessException();
    }

    public void incrementMoneySpent(double d, int i) {
        int i2 = 964608556 ^ (96274921 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1755033614) {
            i2 = 1137147968 ^ i2;
            this.moneySpent += d;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1990701584) {
                i2 = 1648482372 ^ i2;
                markDirty(819637619);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1688825901) {
                    int i3 = 1781186817 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1755033614 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1201190427 ^ i2)) {
                int i4 = 1743476468 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1688825901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1720891054 ^ i2)) {
                    int i5 = 1338021924 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1990701584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1303727323 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 270708672 ^ i2;
        throw new IllegalAccessException();
    }

    public void incrementKills(int i) {
        int i2 = 702723457 ^ (373461260 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1938082382) {
            i2 = 1658868143 ^ i2;
            this.kills += (byte) (862926616 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1686521655) {
                int i3 = 115043215 ^ i2;
                markDirty(819637619);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1381833551) {
                    int i4 = 1773800836 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1381833551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (768865430 ^ i3)) {
                        break;
                    }
                }
                int i5 = 177292785 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -529364846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (289987725 ^ i2)) {
                int i6 = 136744998 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1938082382 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1748343455 ^ i2)) {
                    int i7 = 1900491243 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1686521655 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1756379405 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1934848668 ^ i2;
        throw new IOException();
    }

    public void incrementBlocksBroken(int i) {
        int i2 = 177864369 ^ (1630648417 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 741877592) {
            i2 = 2093612264 ^ i2;
            this.blocksBroken += (byte) (2035218434 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -898121701) {
                i2 = 1670479191 ^ i2;
                markDirty(819637619);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -688117088) {
                    int i3 = 2141126775 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 704915739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1055258771 ^ i2)) {
                int i4 = 867676857 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -898121701 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (699270238 ^ i2)) {
                    int i5 = 1418670825 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -688117088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1163103986 ^ i2)) {
                        int i6 = 144274273 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 741877592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1992133309 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 942850292 ^ i2;
        throw new IOException();
    }

    public void incrementBlocksPlaced(int i) {
        int i2 = 1067449680 ^ (389748983 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 878525666) {
            i2 = 127162232 ^ i2;
            this.blocksPlaced += (byte) (1092612325 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 150964002) {
                i2 = 2005319833 ^ i2;
                markDirty(819637619);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1261861911) {
                    int i3 = 1789802925 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 150964002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (993420923 ^ i2)) {
                int i4 = 320366599 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 878525666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2134466078 ^ i2)) {
                    int i5 = 598908463 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1261861911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (533136280 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1310723018 ^ i2;
        throw new RuntimeException();
    }

    public void incrementDeaths(int i) {
        int i2 = 623608667 ^ (803429876 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 658302115) {
            i2 = 1509400782 ^ i2;
            this.deaths += (byte) (1024474203 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -394140975) {
                i2 = 630770602 ^ i2;
                markDirty(819637619);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1001930880) {
                    int i3 = 690272291 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 658302115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1627081164 ^ i2)) {
                int i4 = 1044066795 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1922924903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (746750351 ^ i2)) {
                    int i5 = 1682087901 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -394140975 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1973362562 ^ i2)) {
                        int i6 = 994008814 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1001930880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1483272120 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1497950459 ^ i2;
        throw new IOException();
    }

    public void incrementMobKills(int i) {
        int i2 = 1939580618 ^ (1641880593 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -481310973) {
            int i3 = 2037090519 ^ i2;
            this.mobKills += (byte) (84045878 ^ i3);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 672367032) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 672367032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (369586528 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1444087911 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 1351215838 ^ i3;
            markDirty(819637619);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1403201718) {
                int i5 = 2098835064 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1150395529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1621270975 ^ i2)) {
                int i6 = 1707651550 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -481310973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1883554439 ^ i2)) {
                    int i7 = 1110837356 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1403201718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (341187790 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 88985352 ^ i2;
        throw new RuntimeException();
    }

    public void incrementPlayTime(long j, int i) {
        int i2 = 257867315 ^ (571413283 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 469203290) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469203290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2038514540 ^ i2)) {
                    int i3 = 1989393177 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1956119216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (84641342 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1147301142 ^ i2;
            throw new RuntimeException();
        }
        int i5 = 1141857874 ^ i2;
        this.playTime += j;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 999132104) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 999132104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1167324027 ^ i5)) {
                    break;
                }
            }
            int i6 = 1217648682 ^ i5;
            throw new IllegalAccessException("double");
        }
        int i7 = 96062467 ^ i5;
        markDirty(819637619);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 373550032) {
            int i8 = 207322412 ^ i7;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 373550032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (97599706 ^ i7)) {
                break;
            }
        }
        int i9 = 173222490 ^ i7;
        throw new IOException("double");
    }

    public void incrementItemsCrafted(int i) {
        int i2 = 1372733035 ^ (1454806586 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1247761235) {
            i2 = 409590073 ^ i2;
            this.itemsCrafted += (byte) (1898066770 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1995335013) {
                int i3 = 1993191545 ^ i2;
                markDirty(819637619);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1065097552) {
                    int i4 = 1099136848 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1065097552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2116667678 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1693504999 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1995335013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (54051251 ^ i2)) {
                int i6 = 1510171460 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1247761235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2072890726 ^ i2)) {
                    int i7 = 825413129 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 862446546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (912294615 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1264067061 ^ i2;
        throw new IllegalAccessException();
    }

    public void incrementJumps(int i) {
        int i2 = 905298295 ^ (623927994 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -145289293) {
            i2 = 1980871498 ^ i2;
            this.jumps += (byte) (150688445 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1205507552) {
                i2 = 455342121 ^ i2;
                markDirty(819637619);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1631234904) {
                    int i3 = 2057633814 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1205507552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (755230917 ^ i2)) {
                int i4 = 1426013285 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1273844763 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (16536203 ^ i2)) {
                    int i5 = 776974845 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1631234904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (446758315 ^ i2)) {
                        int i6 = 457121653 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -145289293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (769687293 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1348093226 ^ i2;
        throw new RuntimeException();
    }

    public void incrementChatMessages(int i) {
        int i2 = 1750451130 ^ (637142836 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 470037929) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 470037929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (247775101 ^ i2)) {
                    break;
                }
            }
            int i3 = 1815229475 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1358033355 ^ i2;
        this.chatMessages += (byte) (1936815999 ^ i4);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1685341197) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1685341197 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (981526407 ^ i4)) {
                    int i5 = 1946670732 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 563793353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2119702775 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 1551367724 ^ i4;
            throw new RuntimeException();
        }
        int i7 = 130360134 ^ i4;
        markDirty(819637619);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1516068413) {
            int i8 = 1351028097 ^ i7;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1516068413 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (231050885 ^ i7)) {
                break;
            }
        }
        int i9 = 268112611 ^ i7;
        throw new IllegalAccessException("double");
    }

    public double getKDRatio(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.getKDRatio(int):double");
    }

    public double getShards(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.getShards(org.bukkit.entity.Player, int):double");
    }

    public double getMoney(int i) {
        int i2 = 1984624759 ^ (2125616962 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 918513779) {
            i2 = 1479193921 ^ i2;
            if (VaultService.isEconomySetup(2004595323) == (1056790607 ^ i2)) {
                int i3 = 1823947948 ^ i2;
                return 0.0d;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -135609735) {
                int i4 = 658651184 ^ i2;
                return VaultService.getEconomy(438814804).getBalance(Bukkit.getOfflinePlayer(this.playerUUID));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -135609735 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1037530831 ^ i2)) {
                int i5 = 2042564548 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 918513779 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1078081511 ^ i2)) {
                    int i6 = 1284027888 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1840044262 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (947723031 ^ i2)) {
                        int i7 = 884237143 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -839187464 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (866337673 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 588859001 ^ i2;
        throw new IOException();
    }

    public void markClean(int i) {
        int i2 = 578430240 ^ (1221825972 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 607622520) {
            i2 = 500946605 ^ i2;
            this.dirty = (byte) (425534466 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -890691568) {
                int i3 = 607644964 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -346666703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1059705246 ^ i2)) {
                int i4 = 1959271699 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -890691568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (238496468 ^ i2)) {
                    int i5 = 2031497749 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 607622520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (726211229 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 117711327 ^ i2;
        throw new IllegalAccessException();
    }

    private void markDirty(int i) {
        int i2 = 730969696 ^ (868863519 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1279667677) {
            i2 = 121034668 ^ i2;
            this.dirty = (byte) (1900146153 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1978699965) {
                i2 = 306124393 ^ i2;
                this.lastUpdated = System.currentTimeMillis();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469228555) {
                    int i3 = 1757342652 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1978699965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (835618132 ^ i2)) {
                int i4 = 800544271 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1279667677 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1114470703 ^ i2)) {
                    int i5 = 1893961572 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469228555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (419052223 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 416068715 ^ i2;
        throw new IOException();
    }

    public void setStat(com.kammoun.donutCore.stats.models.StatsType r6, double r7, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.setStat(com.kammoun.donutCore.stats.models.StatsType, double, int):void");
    }

    public void addStat(com.kammoun.donutCore.stats.models.StatsType r6, double r7, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.addStat(com.kammoun.donutCore.stats.models.StatsType, double, int):void");
    }

    public void removeStat(com.kammoun.donutCore.stats.models.StatsType r6, double r7, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.removeStat(com.kammoun.donutCore.stats.models.StatsType, double, int):void");
    }

    public double getStat(com.kammoun.donutCore.stats.models.StatsType r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.getStat(com.kammoun.donutCore.stats.models.StatsType, int):double");
    }

    @Generated
    public UUID getPlayerUUID(int i) {
        int i2 = 9550725 ^ (926201268 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -867016622) {
            int i3 = 1373065516 ^ i2;
            return this.playerUUID;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1122560304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1644744017 ^ i2)) {
                int i4 = 1728970003 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -867016622 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1597434402 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1173277436 ^ i2;
        throw new IOException();
    }

    @Generated
    public int getKills(int i) {
        int i2 = 1207988792 ^ (1389477953 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1476951533) {
            int i3 = 133084214 ^ i2;
            return this.kills;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1476951533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2053877306 ^ i2)) {
                int i4 = 201995318 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1736301661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1080146040 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 37221217 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getBlocksBroken(int i) {
        int i2 = 777523424 ^ (255505380 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2054097402) {
            int i3 = 864312303 ^ i2;
            return this.blocksBroken;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2054097402 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1307269741 ^ i2)) {
                int i4 = 283814998 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -431106429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2016322235 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1938488820 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getBlocksPlaced(int i) {
        int i2 = 564373513 ^ (408981653 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1083976390) {
            int i3 = 879377307 ^ i2;
            return this.blocksPlaced;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1083976390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (960734512 ^ i2)) {
                int i4 = 362991395 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 473041379 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1290889416 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2079369109 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getDeaths(int i) {
        int i2 = 1287694211 ^ (211436254 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1940732721) {
            int i3 = 1028015622 ^ i2;
            return this.deaths;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1717630208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1811934799 ^ i2)) {
                int i4 = 1486913151 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1940732721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1564450460 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 326945252 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getMobKills(int i) {
        int i2 = 1587936215 ^ (1090284070 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2085183917) {
            int i3 = 1745699161 ^ i2;
            return this.mobKills;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2085183917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1831747750 ^ i2)) {
                int i4 = 1595724184 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1008954216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (860020958 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1612825783 ^ i2;
        throw new IOException();
    }

    @Generated
    public long getPlayTime(int i) {
        int i2 = 1094723243 ^ (2118814901 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993391830) {
            int i3 = 1918509818 ^ i2;
            return this.playTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993391830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1463071941 ^ i2)) {
                int i4 = 527673152 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469653241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (369901346 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 604272649 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getItemsCrafted(int i) {
        int i2 = 2004592117 ^ (1468494315 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1989980458) {
            int i3 = 1208590592 ^ i2;
            return this.itemsCrafted;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1989980458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1658949307 ^ i2)) {
                int i4 = 1187416524 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 919714088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (459501108 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 121795498 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getJumps(int i) {
        int i2 = 163718785 ^ (1509184420 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -255215375) {
            int i3 = 1670879929 ^ i2;
            return this.jumps;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -327848646 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1643267901 ^ i2)) {
                int i4 = 1202224487 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -255215375 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (917031925 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1505417660 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getChatMessages(int i) {
        int i2 = 1466927117 ^ (1010378021 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 735017112) {
            int i3 = 848011735 ^ i2;
            return this.chatMessages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1080920543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2121079701 ^ i2)) {
                int i4 = 1110126754 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 735017112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (593880304 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 686114282 ^ i2;
        throw new IOException();
    }

    @Generated
    public double getShards(int i) {
        int i2 = 1380500168 ^ (374025234 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1365600009) {
            int i3 = 681137176 ^ i2;
            return this.shards;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1365600009 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (291574617 ^ i2)) {
                int i4 = 1657447402 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 363841480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1189095894 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 985124402 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public double getMoneySpent(int i) {
        int i2 = 100312098 ^ (1922839637 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -900820384) {
            int i3 = 310095791 ^ i2;
            return this.moneySpent;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -900820384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1070452548 ^ i2)) {
                int i4 = 103958331 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1502867224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (717704413 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 429782197 ^ i2;
        throw new IOException();
    }

    @Generated
    public double getMoneyMade(int i) {
        int i2 = 1204831588 ^ (1136322848 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1378841595) {
            int i3 = 1044512322 ^ i2;
            return this.moneyMade;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1608482326 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2003215466 ^ i2)) {
                int i4 = 1643121142 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1378841595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (984396343 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 558657464 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public long getLastUpdated(int i) {
        int i2 = 412732599 ^ (1124025376 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1571924639) {
            int i3 = 1066787180 ^ i2;
            return this.lastUpdated;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1571924639 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (778919443 ^ i2)) {
                int i4 = 1769266413 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1591827968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2055301492 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 735072705 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setPlayerUUID(UUID uuid) {
        int i = 2032657134 ^ (895902557 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 326507585) {
            int i2 = 554870192 ^ i;
            this.playerUUID = uuid;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 326507585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (73707193 ^ i)) {
                int i3 = 1109790902 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 467874240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (65760265 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1544180994 ^ i;
        throw new IOException();
    }

    @Generated
    public void setKills(int i) {
        int i2 = 291686928 ^ (1464156473 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1078347921) {
            int i3 = 1661960574 ^ i2;
            this.kills = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1480213346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1230457006 ^ i2)) {
                int i4 = 891300420 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1078347921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (135980082 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1072167299 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public void setBlocksBroken(int i) {
        int i2 = 1761902030 ^ (1660421627 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 781832307) {
            int i3 = 1596994482 ^ i2;
            this.blocksBroken = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 781832307 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (611660696 ^ i2)) {
                int i4 = 2050341666 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -686273055 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (552932541 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2106301465 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setBlocksPlaced(int i) {
        int i2 = 524383528 ^ (376331160 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 939746395) {
            int i3 = 905098769 ^ i2;
            this.blocksPlaced = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 939746395 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (804483512 ^ i2)) {
                int i4 = 2113233318 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1751722798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1464502073 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 250194478 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public void setDeaths(int i) {
        int i2 = 1113019464 ^ (408714912 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1591523687) {
            int i3 = 1202773429 ^ i2;
            this.deaths = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1666864333 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1995008703 ^ i2)) {
                int i4 = 348919700 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1591523687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (737720477 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 799049600 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setMobKills(int i) {
        int i2 = 1665730200 ^ (703657918 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 615880937) {
            int i3 = 1649482590 ^ i2;
            this.mobKills = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 615880937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2096999920 ^ i2)) {
                int i4 = 1850481036 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 909984282 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1743261058 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 175121226 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setPlayTime(long j) {
        int i = 581724372 ^ (763253021 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 267116435) {
            int i2 = 308896333 ^ i;
            this.playTime = j;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 267116435 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1430080650 ^ i)) {
                int i3 = 1878925292 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1667183109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (176957658 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 286097902 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public void setItemsCrafted(int i) {
        int i2 = 216903206 ^ (667753020 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 679457034) {
            int i3 = 541916366 ^ i2;
            this.itemsCrafted = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 706238331 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (159796168 ^ i2)) {
                int i4 = 334870871 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 679457034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1766796787 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1327495628 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public void setJumps(int i) {
        int i2 = 822192663 ^ (466685998 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 671072274) {
            int i3 = 186295762 ^ i2;
            this.jumps = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2133520002 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1497800070 ^ i2)) {
                int i4 = 785045149 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 671072274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (198446387 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 781997301 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setChatMessages(int i) {
        int i2 = 1379400620 ^ (793491987 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1701307360) {
            int i3 = 573423251 ^ i2;
            this.chatMessages = i;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1701307360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1503682425 ^ i2)) {
                int i4 = 1532528831 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1946818375 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1050405589 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 774065779 ^ i2;
        throw new IOException();
    }

    @Generated
    public void setMoney(double d) {
        int i = 997244430 ^ (691845029 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -484811645) {
            int i2 = 464238387 ^ i;
            this.money = d;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -484811645 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (924395681 ^ i)) {
                int i3 = 522256715 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1044899099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1501834232 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1390981031 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public void setShards(double d) {
        int i = 273016471 ^ (1760996204 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1260356096) {
            int i2 = 429881030 ^ i;
            this.shards = d;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2015086640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (517302410 ^ i)) {
                int i3 = 1752055899 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1260356096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (346811962 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 265934503 ^ i;
        throw new IOException();
    }

    @Generated
    public void setMoneySpent(double d) {
        int i = 928664580 ^ (707792294 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1708647221) {
            int i2 = 1053303523 ^ i;
            this.moneySpent = d;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1708647221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1606369321 ^ i)) {
                int i3 = 1354924275 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1818823634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (116432300 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2037698160 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public void setMoneyMade(double d) {
        int i = 1831902493 ^ (757096284 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1912341457) {
            int i2 = 686394564 ^ i;
            this.moneyMade = d;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 917530096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2058576259 ^ i)) {
                int i3 = 107775906 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1912341457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1743731249 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1771206293 ^ i;
        throw new IOException();
    }

    @Generated
    public void setLastUpdated(long j) {
        int i = 1816208235 ^ (1915930092 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2098911773) {
            int i2 = 460195164 ^ i;
            this.lastUpdated = j;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1502940931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (207443589 ^ i)) {
                int i3 = 24124945 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2098911773 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1571836324 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1519313091 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public void setDirty(boolean z) {
        int i = 1397367623 ^ (1337397669 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1768716597) {
            int i2 = 964193931 ^ i;
            this.dirty = z;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1768716597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (242242685 ^ i)) {
                int i3 = 1515418260 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1565586066 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (758766832 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 3437569 ^ i;
        throw new RuntimeException();
    }

    @lombok.Generated
    public StatsHolder(java.util.UUID r5, int r6, int r7, int r8, int r9, int r10, long r11, int r13, int r14, int r15, double r16, double r18, double r20, double r22, long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.models.StatsHolder.<init>(java.util.UUID, int, int, int, int, int, long, int, int, int, double, double, double, double, long, boolean):void");
    }

    @Generated
    public boolean isDirty(int i) {
        int i2 = 1798668271 ^ (1249193161 ^ 1848590907);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2071496938) {
            int i3 = 1730800523 ^ i2;
            return this.dirty;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2071496938 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1464268799 ^ i2)) {
                int i4 = 624463527 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1110955185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1209065720 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1576619765 ^ i2;
        throw new IOException();
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
        evtkfjiopc = ByteBuffer.wrap(kpweaukdcjuhway()).asCharBuffer().toString();
        TZlnVlbekD = (-176105502) ^ new Random(-7324280581943698096L).nextInt();
    }

    public static String shjgduvazv(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = evtkfjiopc.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] lyqyuytaygbflha() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 0};
    }

    private static byte[] kpweaukdcjuhway() {
        return new byte[]{49, 97, 53, 91, 56, 89, 55, 90, 54, 84, 49, 89, 53, 88, 56, 84, 55, 93, 54, 84, 49, 67, 53, 118, 56, 104, 55, 112};
    }

    private static int bbxxhcacmqxhonjd(int i, int i2) {
        return i ^ i2;
    }
}
