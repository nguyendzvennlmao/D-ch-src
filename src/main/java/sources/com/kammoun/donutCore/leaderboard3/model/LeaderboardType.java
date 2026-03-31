package com.kammoun.donutCore.leaderboard3.model;

import com.kammoun.donutCore.stats.models.StatsType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import lombok.Generated;

public final class LeaderboardType {
    public static final LeaderboardType MONEY;
    public static final LeaderboardType KILLS;
    public static final LeaderboardType DEATHS;
    public static final LeaderboardType MOBS_KILLED;
    public static final LeaderboardType BLOCKS_BROKEN;
    public static final LeaderboardType BLOCKS_PLACED;
    public static final LeaderboardType PLAY_TIME;
    public static final LeaderboardType SHARDS;
    public static final LeaderboardType MONEY_SPENT;
    public static final LeaderboardType SELLS_MADE;
    private final String displayName;
    private final StatsType statsType;
    private static final LeaderboardType[] $VALUES;

    public static LeaderboardType[] values() {
        int i = 125714786 ^ (1708485875 ^ (1601441734 ^ 67007684));
        return (LeaderboardType[]) $VALUES.clone();
    }

    public static LeaderboardType valueOf(String str) {
        int i = 1528694268 ^ (274276755 ^ 67007684);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1170900314) {
            int i2 = 276991569 ^ i;
            return (LeaderboardType) Enum.valueOf(LeaderboardType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1042352174 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (591599064 ^ i)) {
                int i3 = 1981839090 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1170900314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1737001636 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1140157278 ^ i;
        throw new RuntimeException();
    }

    private LeaderboardType(String str, int i, String str2, StatsType statsType) {
        qwruzloprhlsftjx(439959384 ^ 773047796, 1114533804);
        int qwruzloprhlsftjx = 1416086432 ^ qwruzloprhlsftjx(857689470 ^ (1112204537 ^ Integer.parseInt("118570119")), 2027405112);
        this.displayName = str2;
        this.statsType = statsType;
        int i2 = 1370876332 ^ (622975495 ^ qwruzloprhlsftjx);
    }

    public String getColumnName() {
        int i = 1139866443 ^ (1121696526 ^ 1265578938);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1378066426) {
            int i2 = 143039612 ^ i;
            return this.statsType.getColumnName();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 370637850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1291124934 ^ i)) {
                int i3 = 1610442009 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1378066426 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1689049369 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1627314619 ^ i;
        throw new RuntimeException();
    }

    public static com.kammoun.donutCore.leaderboard3.model.LeaderboardType fromName(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.model.LeaderboardType.fromName(java.lang.String):com.kammoun.donutCore.leaderboard3.model.LeaderboardType");
    }

    @Generated
    public String getDisplayName() {
        int i = 1052761088 ^ (1115328942 ^ 1265578938);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1118572383) {
            int i2 = 924214262 ^ i;
            return this.displayName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1118572383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (65007511 ^ i)) {
                int i3 = 1115014871 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 98627344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (314172101 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 865789313 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public StatsType getStatsType() {
        int i = 2020833728 ^ (93041635 ^ 1265578938);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1262498615) {
            int i2 = 1853690034 ^ i;
            return this.statsType;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1262498615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1262638459 ^ i)) {
                int i3 = 1586118401 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -950580902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1393266533 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 431355299 ^ i;
        throw new RuntimeException();
    }

    private static LeaderboardType[] $values() {
        int i = 1001637582 ^ (2003660397 ^ (1047055619 ^ 67007684));
        LeaderboardType[] leaderboardTypeArr = new LeaderboardType[(byte) (1900548462 ^ i)];
        leaderboardTypeArr[(byte) (1900548452 ^ i)] = MONEY;
        leaderboardTypeArr[(byte) (1900548453 ^ i)] = KILLS;
        leaderboardTypeArr[(byte) (1900548454 ^ i)] = DEATHS;
        leaderboardTypeArr[(byte) (1900548455 ^ i)] = MOBS_KILLED;
        leaderboardTypeArr[(byte) (1900548448 ^ i)] = BLOCKS_BROKEN;
        leaderboardTypeArr[(byte) (1900548449 ^ i)] = BLOCKS_PLACED;
        leaderboardTypeArr[(byte) (1900548450 ^ i)] = PLAY_TIME;
        leaderboardTypeArr[(byte) (1900548451 ^ i)] = SHARDS;
        leaderboardTypeArr[(byte) (1900548460 ^ i)] = MONEY_SPENT;
        leaderboardTypeArr[(byte) (1900548461 ^ i)] = SELLS_MADE;
        return leaderboardTypeArr;
    }

    static {
        int parseInt = 271739157 ^ (1991847868 ^ (416611820 ^ Integer.parseInt("118570119")));
        MONEY = new LeaderboardType(kbokfdxaor(gpddrrdgdzfrjxj(), lxoeczxqntlwams(), parseInt), (byte) (2035189698 ^ parseInt), kbokfdxaor(njfkwtxvrluwrmu(), lxoeczxqntlwams(), parseInt), StatsType.MONEY);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -898351597) {
            parseInt = 1644796843 ^ parseInt;
            KILLS = new LeaderboardType(kbokfdxaor(izkdsqekgddivwm(), lxoeczxqntlwams(), parseInt), (byte) (457645160 ^ parseInt), kbokfdxaor(grmvjegyoedchzr(), lxoeczxqntlwams(), parseInt), StatsType.KILLS);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -633806008) {
                parseInt = 468622206 ^ parseInt;
                DEATHS = new LeaderboardType(kbokfdxaor(vklmpgzojwkukwf(), lxoeczxqntlwams(), parseInt), (byte) (11110165 ^ parseInt), kbokfdxaor(rnravbrgsrmszmw(), lxoeczxqntlwams(), parseInt), StatsType.DEATHS);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 88881336) {
                    int i = 495460493 ^ parseInt;
                    MOBS_KILLED = new LeaderboardType(kbokfdxaor(jqjqazjkdfwevvv(), lxoeczxqntlwams(), i), (byte) (488744857 ^ i), kbokfdxaor(ocubdcnrgjmicdm(), lxoeczxqntlwams(), i), StatsType.MOB_KILLS);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -385008432) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -385008432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1018317508 ^ i)) {
                                break;
                            }
                        }
                        int i2 = 1652926995 ^ i;
                        throw new RuntimeException("double");
                    }
                    int i3 = 997287243 ^ i;
                    BLOCKS_BROKEN = new LeaderboardType(kbokfdxaor(boimlbhrchtdnbu(), lxoeczxqntlwams(), i3), (byte) (642826965 ^ i3), kbokfdxaor(sgazlirpmdzzrhd(), lxoeczxqntlwams(), i3), StatsType.BLOCKS_BROKEN);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 847648393) {
                        int i4 = 420065150 ^ i3;
                        BLOCKS_PLACED = new LeaderboardType(kbokfdxaor(txskyxhfceeslom(), lxoeczxqntlwams(), i4), (byte) (1062825386 ^ i4), kbokfdxaor(arawmsrnthbfcps(), lxoeczxqntlwams(), i4), StatsType.BLOCKS_PLACED);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -87331463) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -87331463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (132153957 ^ i4)) {
                                    int i5 = 669313909 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 708041840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2086573059 ^ i4)) {
                                        break;
                                    }
                                }
                            }
                            int i6 = 1229366705 ^ i4;
                            throw new IllegalAccessException("double");
                        }
                        int i7 = 1702214091 ^ i4;
                        PLAY_TIME = new LeaderboardType(kbokfdxaor(oltycuxvjtcurid(), lxoeczxqntlwams(), i7), (byte) (1512887394 ^ i7), kbokfdxaor(pevjijnqblszspi(), lxoeczxqntlwams(), i7), StatsType.PLAY_TIME);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -781802718) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -781802718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1689621836 ^ i7)) {
                                    break;
                                }
                            }
                            int i8 = 905158878 ^ i7;
                            throw new IOException("double");
                        }
                        i3 = 1378033770 ^ i7;
                        SHARDS = new LeaderboardType(kbokfdxaor(jlkxesjwtfkzubp(), lxoeczxqntlwams(), i3), (byte) (135263241 ^ i3), kbokfdxaor(ennhydpyaqxwzxc(), lxoeczxqntlwams(), i3), StatsType.SHARDS);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1082105968) {
                            parseInt = 396739866 ^ i3;
                            MONEY_SPENT = new LeaderboardType(kbokfdxaor(cdodlxoqupqbjrt(), lxoeczxqntlwams(), parseInt), (byte) (531247388 ^ parseInt), kbokfdxaor(kpveqssvlqzcram(), lxoeczxqntlwams(), parseInt), StatsType.MONEY_SPENT);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -44988256) {
                                parseInt = 1840359550 ^ parseInt;
                                SELLS_MADE = new LeaderboardType(kbokfdxaor(dzfgorscguedgek(), lxoeczxqntlwams(), parseInt), (byte) (1914411363 ^ parseInt), kbokfdxaor(yyyjnzbbstniugc(), lxoeczxqntlwams(), parseInt), StatsType.MONEY_MADE);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1864578221) {
                                    int i9 = 2002641636 ^ parseInt;
                                    $VALUES = $values();
                                    return;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 847648393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2036285625 ^ i3)) {
                            int i10 = 1208777303 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1082105968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (572915786 ^ i3)) {
                                break;
                            }
                        }
                    }
                    int i11 = 2058833983 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -633806008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1368045347 ^ parseInt)) {
                int i12 = 929599652 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -898351597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1376458725 ^ parseInt)) {
                    int i13 = 886991207 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 88881336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1147555607 ^ parseInt)) {
                        int i14 = 1556926599 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1864578221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (432742068 ^ parseInt)) {
                            int i15 = 990909131 ^ parseInt;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -44988256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1648199412 ^ parseInt)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i16 = 938310852 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String kbokfdxaor(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] lxoeczxqntlwams() {
        return new byte[]{15, 115};
    }

    private static byte[] cdodlxoqupqbjrt() {
        return new byte[]{-60, -65, 62, 12, 59, 11, 60, 5, 63, 3, 60, 27, 61, 24, 56, 19, 55, 19, 58, 5, 62, 15, 59, 16};
    }

    private static byte[] kpveqssvlqzcram() {
        return new byte[]{-60, -65, 35, 76, 38, 75, 62, 63, 34, 65, 62, -51, 61, 103, 56, 51, 42, 91, 39, 71, 60, 53, 38, 95};
    }

    private static byte[] dzfgorscguedgek() {
        return new byte[]{-64, -75, 62, 20, 59, 7, 62, 12, 56, 15, 62, 25, 62, 24, 59, 15, 62, 1, 56, 7, 62, 15};
    }

    private static byte[] yyyjnzbbstniugc() {
        return new byte[]{-64, -75, 62, 52, 38, 69, 60, -33, 58, -36, 62, 57, 62, 103, 38, 79, 35, 64, 37, 70, 35, 77};
    }

    private static byte[] jlkxesjwtfkzubp() {
        return new byte[]{-64, -65, 58, 18, 57, 8, 61, 6, 57, 16, 60, 2, 61, 22};
    }

    private static byte[] ennhydpyaqxwzxc() {
        return new byte[]{-64, -65, 58, 50, 59, -36, 32, 71, 59, -62, 33, 67, 61, 54};
    }

    private static byte[] vklmpgzojwkukwf() {
        return new byte[]{-64, -67, 62, 6, 63, 7, 57, 5, 62, 22, 62, 10, 63, 17};
    }

    private static byte[] rnravbrgsrmszmw() {
        return new byte[]{-64, -67, 35, 71, 34, 69, 36, 68, 35, 89, 60, -34, 63, 49};
    }

    private static byte[] boimlbhrchtdnbu() {
        return new byte[]{-57, -72, 61, 9, 61, 9, 54, 10, 62, 6, 59, 10, 55, 18, 57, 21, 57, 0, 57, 21, 61, 4, 61, 14, 54, 0, 62, 11};
    }

    private static byte[] sgazlirpmdzzrhd() {
        return new byte[]{-57, -72, 63, -46, 63, -38, 43, 74, 35, 65, 38, 74, 55, 50, 57, 106, 59, -37, 59, -57, 32, 68, 32, 78, 43, 66, 60, 49};
    }

    private static byte[] gpddrrdgdzfrjxj() {
        return new byte[]{-61, -68, 60, 11, 62, 4, 54, 11, 54, 14, 61, 26};
    }

    private static byte[] njfkwtxvrluwrmu() {
        return new byte[]{-61, -68, 33, 75, 35, 68, 52, 49, 43, 76, 63, -52};
    }

    private static byte[] izkdsqekgddivwm() {
        return new byte[]{-59, -71, 56, 14, 59, 15, 62, 9, 62, 11, 58, 23};
    }

    private static byte[] grmvjegyoedchzr() {
        return new byte[]{-59, -71, 37, 78, 57, 44, 60, -38, 60, -40, 58, 55};
    }

    private static byte[] jqjqazjkdfwevvv() {
        return new byte[]{-59, -76, 55, 9, 59, 8, 55, 4, 55, 20, 55, 20, 56, 12, 59, 2, 58, 7, 59, 7, 55, 1, 59, 3};
    }

    private static byte[] ocubdcnrgjmicdm() {
        return new byte[]{-59, -76, 42, 73, 38, 72, 53, -33, 55, 52, 55, 107, 37, 76, 57, 33, 56, -44, 57, -44, 42, 67, 38, 66};
    }

    private static byte[] txskyxhfceeslom() {
        return new byte[]{-64, -68, 57, 3, 55, 13, 58, 15, 54, 1, 62, 8, 57, 18, 55, 30, 58, 16, 54, 14, 62, 2, 57, 2, 55, 4, 58, 4};
    }

    private static byte[] arawmsrnthbfcps() {
        return new byte[]{-64, -68, 59, -40, 53, -34, 39, 79, 43, 70, 35, 72, 57, 50, 55, 97, 39, 88, 52, -35, 35, 67, 36, 69, 42, 70, 39, 69};
    }

    private static byte[] oltycuxvjtcurid() {
        return new byte[]{-64, -71, 62, 17, 55, 7, 56, 1, 54, 28, 62, 25, 62, 21, 55, 2, 56, 13, 54, 0};
    }

    private static byte[] pevjijnqblszspi() {
        return new byte[]{-64, -71, 35, 89, 53, -44, 37, 64, 52, -54, 62, 102, 35, 90, 53, 33, 37, 77, 43, 66};
    }

    private static int qwruzloprhlsftjx(int i, int i2) {
        return i2 ^ i;
    }
}
