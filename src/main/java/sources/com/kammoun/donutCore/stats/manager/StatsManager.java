package com.kammoun.donutCore.stats.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.stats.StatsPlugin;
import com.kammoun.donutCore.stats.models.StatsHolder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class StatsManager {
    private final StatsPlugin plugin;
    private final Map<UUID, StatsHolder> loadedStats;
    private final Map<UUID, Long> joinTimes;
    private final Object playtimeLock;
    private SchedulerUtil.Task autoSaveTask;
    private static int r74T2hDbQ4 = 0;
    private transient int PM3zGoIFIn = 2012765139;
    private static byte[] ewyeqkwwmm;
    private static String[] nothing_to_see_here = new String[15];

    public StatsManager(com.kammoun.donutCore.stats.StatsPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.manager.StatsManager.<init>(com.kammoun.donutCore.stats.StatsPlugin, int):void");
    }

    public CompletableFuture loadPlayerStats(Player player, int i) {
        int i2 = 812042829 ^ (262574134 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -337270783) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -337270783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1096078456 ^ i2)) {
                    break;
                }
            }
            int i3 = 2068724647 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1345045968 ^ i2;
        UUID uniqueId = player.getUniqueId();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1790674563) {
            int i5 = 412988823 ^ i4;
            return CompletableFuture.supplyAsync(() -> {
                int i6 = 1959957261 ^ (741980086 ^ 45936507);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -759276030) {
                    i6 = 1553442206 ^ i6;
                    StatsHolder loadStats = this.plugin.getDatabase(3993225).loadStats(uniqueId, 49900057);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 906195696) {
                        i6 = 1187768942 ^ i6;
                        this.plugin.getDatabase(3993225).savePlayerName(uniqueId, player.getName(), 1155840407);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 6037890) {
                            i6 = 521689718 ^ i6;
                            this.loadedStats.put(uniqueId, loadStats);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -123801038) {
                                int i7 = 805418583 ^ i6;
                                this.joinTimes.put(uniqueId, Long.valueOf(System.currentTimeMillis()));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 2022916235) {
                                    int i8 = 1491750415 ^ i7;
                                    return loadStats;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 2022916235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1350400268 ^ i7)) {
                                        break;
                                    }
                                }
                                int i9 = 1870076007 ^ i7;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 6037890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (706382606 ^ i6)) {
                        int i10 = 1217208894 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1077858063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (289383714 ^ i6)) {
                            int i11 = 1978889432 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 906195696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (445372672 ^ i6)) {
                                int i12 = 601910952 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -759276030 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (353503086 ^ i6)) {
                                    int i13 = 1454102893 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -123801038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1250777210 ^ i6)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                int i14 = 992952805 ^ i6;
                throw new IllegalAccessException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1790674563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1143671788 ^ i4)) {
                int i6 = 86119586 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1370084805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1953470627 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 529880171 ^ i4;
        throw new IllegalAccessException();
    }

    public void savePlayerStats(Player player, int i) {
        int i2 = 1961509864 ^ (1853857708 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1052141064) {
            i2 = 12429552 ^ i2;
            UUID uniqueId = player.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -995828104) {
                int i3 = 1247883101 ^ i2;
                StatsHolder statsHolder = this.loadedStats.get(uniqueId);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1750227822) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1750227822 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (110529741 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 806095490 ^ i3;
                    throw new IOException("double");
                }
                i2 = 1602098205 ^ i3;
                if (statsHolder == null) {
                    ejbedfzuqglxikwf(i2, 1334467637);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1818035320) {
                    int i5 = 598159033 ^ i2;
                    updatePlayTime(player, 405310699);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1902408113) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1902408113 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (872640892 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 2030380326 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    int i7 = 35951806 ^ i5;
                    if (statsHolder.isDirty(2090094130) == (738728584 ^ i7)) {
                        ejbedfzuqglxikwf(i7, 1846142514);
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1614861377) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1614861377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (308458368 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 761240751 ^ i7;
                        throw new RuntimeException("double");
                    }
                    i2 = 354237034 ^ i7;
                    SchedulerUtil.runAsync(() -> {
                        int i9 = 66717992 ^ (1749464240 ^ 45936507);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1208129307) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1208129307 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1270967867 ^ i9)) {
                                    break;
                                }
                            }
                            int i10 = 556584098 ^ i9;
                            throw new IOException("double");
                        }
                        int i11 = 1017933638 ^ i9;
                        this.plugin.getDatabase(3993225).saveStats(statsHolder, 270836101);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1386091222) {
                            i11 = 2045888217 ^ i11;
                            statsHolder.markClean(174329766);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1659886561) {
                                int i12 = 254522185 ^ i11;
                                return;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1659886561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1900752179 ^ i11)) {
                                int i13 = 75167812 ^ i11;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 464667049 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1124029842 ^ i11)) {
                                    int i14 = 1795988281 ^ i11;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1386091222 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (131919092 ^ i11)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i15 = 116449809 ^ i11;
                        throw new IOException();
                    }, 1163669431);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -928446703) {
                        int i9 = 2064964696 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1052141064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (369303322 ^ i2)) {
                int i10 = 1784371564 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1818035320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (892441293 ^ i2)) {
                    int i11 = 843483945 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -928446703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1263069549 ^ i2)) {
                        int i12 = 1375961614 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -995828104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2016302532 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 2084268135 ^ i2;
        throw new RuntimeException();
    }

    public void savePlayersOnDisable(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.manager.StatsManager.savePlayersOnDisable(int):void");
    }

    public void unloadPlayerStats(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.manager.StatsManager.unloadPlayerStats(org.bukkit.entity.Player, int):void");
    }

    public StatsHolder getStats(Player player, int i) {
        int i2 = 1187039202 ^ (1019232657 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -974960573) {
            int i3 = 670358843 ^ i2;
            return this.loadedStats.get(player.getUniqueId());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -96099942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (40122774 ^ i2)) {
                int i4 = 1175883070 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -974960573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (220368241 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1429476533 ^ i2;
        throw new RuntimeException();
    }

    public StatsHolder getStats(UUID uuid, int i) {
        int i2 = 1365225188 ^ (1811088437 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1065210543) {
            int i3 = 1063738974 ^ i2;
            return this.loadedStats.get(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1001971616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1821617163 ^ i2)) {
                int i4 = 1223784533 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1065210543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1575201879 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 145758904 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isStatsLoaded(UUID uuid, int i) {
        int i2 = 156665734 ^ (2135338550 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1520028069) {
            int i3 = 1652225715 ^ i2;
            return this.loadedStats.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1520028069 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1427071319 ^ i2)) {
                int i4 = 1762247703 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1229880384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1601489606 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1503910546 ^ i2;
        throw new RuntimeException();
    }

    public void updatePlayTime(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.manager.StatsManager.updatePlayTime(org.bukkit.entity.Player, int):void");
    }

    public void saveAllOnlinePlayers(int i) {
        int i2 = 626820464 ^ (2033540601 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -156647534) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -156647534 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1904277263 ^ i2)) {
                    break;
                }
            }
            int i3 = 993054517 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1354682690 ^ i2;
        Iterator it = Bukkit.getOnlinePlayers().iterator();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1935619456) {
            i4 = 1001917031 ^ i4;
            while (it.hasNext() != (903081175 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1365285191) {
                    i4 = 433646102 ^ i4;
                    Player player = (Player) it.next();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1616393737) {
                        i4 = 1974429383 ^ i4;
                        savePlayerStats(player, 1855472050);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -853344206) {
                            int i5 = 596429285 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -783986917) {
                                int ejbedfzuqglxikwf = ejbedfzuqglxikwf(i5, 113252377);
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(ejbedfzuqglxikwf) == 33727548) {
                                        throw new IllegalAccessException();
                                    }
                                    throw null;
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -414871597:
                                            i4 = 1080872567 ^ ejbedfzuqglxikwf;
                                            break;
                                        case 678910355:
                                            i4 = ejbedfzuqglxikwf(ejbedfzuqglxikwf, 1502254271);
                                            break;
                                        default:
                                            throw new IOException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -467403671) {
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                            case 32068900:
                                            default:
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -414871597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (443028649 ^ i4)) {
                                                        int i6 = 1079050770 ^ i4;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                                break;
                                            case 88116133:
                                                i4 = 156734298 ^ i4;
                                                break;
                                            case 999204662:
                                                break;
                                            case 1641043193:
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -783986917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1435872280 ^ i5)) {
                                        int i7 = 1210256388 ^ i5;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1365285191 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1906209476 ^ i4)) {
                            int i8 = 1024477760 ^ i4;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
            int i9 = 1829325002 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -467403671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (83154114 ^ i4)) {
                int i10 = 1652017874 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -853344206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (620342138 ^ i4)) {
                    int i11 = 540312734 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1616393737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (361109419 ^ i4)) {
                        int i12 = 278838308 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 678910355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1188381794 ^ i4)) {
                            int i13 = 1998162493 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1935619456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1504592467 ^ i4)) {
                                int i14 = 1841515945 ^ i4;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }

    private void startAutoSave(int i) {
        int i2 = 451487412 ^ (279293223 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1199777600) {
            i2 = 1537304845 ^ i2;
            long j = this.plugin.getConfig(127597628).getInt(vizrcdqswd(dikamuashdlzxyt(), i2), 1397850437 ^ i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1702334678) {
                int i3 = 417737095 ^ i2;
                this.autoSaveTask = SchedulerUtil.runTimer(() -> {
                    int i4 = 1637277701 ^ (289815270 ^ 45936507);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1822315325) {
                        i4 = 956685772 ^ i4;
                        int i5 = (byte) (1265231956 ^ i4);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1531921058) {
                            i4 = 1861140420 ^ i4;
                            Iterator it = Bukkit.getOnlinePlayers().iterator();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 742046849) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 742046849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (726816597 ^ i4)) {
                                        break;
                                    }
                                }
                                int i6 = 1030589112 ^ i4;
                                throw new RuntimeException("double");
                            }
                            int i7 = 652650004;
                            while (true) {
                                int i8 = i7 ^ i4;
                                if (it.hasNext() == (56750468 ^ i8)) {
                                    i4 = ejbedfzuqglxikwf(i8, 2077630957);
                                    if (i5 <= (2025312361 ^ i4)) {
                                        int i9 = 1651751086 ^ i4;
                                        return;
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -977370293) {
                                        int i10 = 1651751086 ^ i4;
                                        return;
                                    }
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 454003744) {
                                    i4 = 829153102 ^ i8;
                                    Player player = (Player) it.next();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1873709487) {
                                        int i11 = 2145213457 ^ i4;
                                        StatsHolder stats = getStats(player, 939705030);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1857787610) {
                                            int i12 = 1060219367 ^ i11;
                                            if (stats == null) {
                                                i4 = 435095605 ^ i12;
                                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1758012957) {
                                                i4 = 2107016777 ^ i12;
                                                updatePlayTime(player, 405310699);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2072177576) {
                                                    i4 = 326835076 ^ i4;
                                                    if (stats.isDirty(2090094130) != (470501105 ^ i4)) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -530958456) {
                                                            int i13 = 1858090576 ^ i4;
                                                            savePlayerStats(player, 1855472050);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1772387061) {
                                                                i4 = 1601154796 ^ i13;
                                                                i5 += 765779532 ^ i4;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1831268969) {
                                                                    i4 = 1185746244 ^ i4;
                                                                }
                                                            } else {
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1772387061 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1040958693 ^ i13)) {
                                                                        int i14 = 620312509 ^ i13;
                                                                        throw new IOException("double");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                            case 106284409:
                                                                i4 = 1996658168 ^ i4;
                                                                break;
                                                            case 711947560:
                                                            case 1226655927:
                                                                break;
                                                            case 2125825876:
                                                            default:
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1431546466 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1845554806 ^ i4)) {
                                                                        int i15 = 1870468980 ^ i4;
                                                                        throw new IOException("double");
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1758012957 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (450555956 ^ i12)) {
                                                        int i16 = 1178898304 ^ i12;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1481545803) {
                                                int ejbedfzuqglxikwf = ejbedfzuqglxikwf(i4, 1125350964);
                                                try {
                                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(ejbedfzuqglxikwf) == 229869500) {
                                                        throw new RuntimeException();
                                                    }
                                                    throw null;
                                                } catch (RuntimeException e) {
                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                        case 1087728105:
                                                            i4 = 782942577 ^ ejbedfzuqglxikwf;
                                                            break;
                                                        case 1431546466:
                                                            i4 = 1276778752 ^ ejbedfzuqglxikwf;
                                                            break;
                                                        default:
                                                            throw new IllegalAccessException("Error in hash");
                                                    }
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 897802848) {
                                                        i7 = 97623496;
                                                    } else {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 897802848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1283499675 ^ i4)) {
                                                                int i17 = 1099031530 ^ i4;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1873709487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2067904310 ^ i4)) {
                                                                    int i18 = 66246491 ^ i4;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1481545803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (358233451 ^ i4)) {
                                                                        int i19 = 679688677 ^ i4;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1831268969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (15655107 ^ i4)) {
                                                                            int i20 = 1358979687 ^ i4;
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -702331336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (14035565 ^ i4)) {
                                                                                int i21 = 1793676718 ^ i4;
                                                                                throw new IOException("double");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1857787610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1874489692 ^ i11)) {
                                                    int i22 = 297138739 ^ i11;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1087728105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1817711910 ^ i11)) {
                                                        int i23 = 2054096844 ^ i11;
                                                        throw new IOException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 454003744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (630791755 ^ i8)) {
                                            int i24 = 1657497084 ^ i8;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1531921058 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (283431114 ^ i4)) {
                            int i25 = 789325312 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2072177576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (11315833 ^ i4)) {
                                int i26 = 1589666278 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -977370293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1193039031 ^ i4)) {
                                    int i27 = 1618616326 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1822315325 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1296759846 ^ i4)) {
                                        int i28 = 1229359699 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -530958456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1321857799 ^ i4)) {
                                            int i29 = 1790514690 ^ i4;
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }, j, j, 2041710047);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1572414226) {
                    int i4 = 2038245857 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1572414226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1328573689 ^ i3)) {
                        break;
                    }
                }
                int i5 = 307213837 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1702334678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1070159366 ^ i2)) {
                int i6 = 2112010296 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1199777600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (103310724 ^ i2)) {
                    int i7 = 1446765358 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1773114343 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1527950532 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 810231230 ^ i2;
        throw new RuntimeException();
    }

    public void stopAutoSave() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.manager.StatsManager.stopAutoSave():void");
    }

    public void incrementKills(Player player, int i) {
        int i2 = 1179353045 ^ (715414274 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1922981219) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1922981219 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (649326904 ^ i2)) {
                    break;
                }
            }
            int i3 = 1314619772 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 434357724 ^ i2;
        StatsHolder stats = getStats(player, 939705030);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1115655293) {
            i4 = 1527688088 ^ i4;
            if (stats == null) {
                ejbedfzuqglxikwf(i4, 442210219);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1710567233) {
                int i5 = 424820504 ^ i4;
                stats.incrementKills(842542724);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1352345727) {
                    int i6 = 50964659 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1352345727 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1537593808 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1835719484 ^ i5;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1710567233 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1332061071 ^ i4)) {
                int i8 = 814472849 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1115655293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1341072484 ^ i4)) {
                    break;
                }
            }
        }
        int i9 = 1689851791 ^ i4;
        throw new IllegalAccessException();
    }

    public void incrementDeaths(Player player, int i) {
        int i2 = 1056138419 ^ (343389848 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1103227521) {
            int i3 = 2073790806 ^ i2;
            StatsHolder stats = getStats(player, 939705030);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1659002830) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1659002830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (362131618 ^ i3)) {
                        break;
                    }
                }
                int i4 = 846313365 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 879754284 ^ i3;
            if (stats == null) {
                ejbedfzuqglxikwf(i2, 264371520);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1046626643) {
                i2 = 553500114 ^ i2;
                stats.incrementDeaths(1281486729);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 965717954) {
                    int i5 = 792477842 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1046626643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1018116158 ^ i2)) {
                int i6 = 1628227425 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 965717954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (869549637 ^ i2)) {
                    int i7 = 267687522 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1103227521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1850552489 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 706179220 ^ i2;
        throw new IOException();
    }

    public void incrementBlocksBroken(Player player, int i) {
        int i2 = 246757012 ^ (1117310769 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1955116786) {
            i2 = 1325681612 ^ i2;
            StatsHolder stats = getStats(player, 939705030);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 212527248) {
                int i3 = 1953071736 ^ i2;
                if (stats == null) {
                    ejbedfzuqglxikwf(i3, 1252267255);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1343816877) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1343816877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1679587950 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1543389286 ^ i3;
                    throw new IllegalAccessException("double");
                }
                int i5 = 1603419482 ^ i3;
                stats.incrementBlocksBroken(574004129);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1400312193) {
                    int i6 = 355871149 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1400312193 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2007832818 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1148495027 ^ i5;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1955116786 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (270835019 ^ i2)) {
                int i8 = 1906922943 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 212527248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1227779549 ^ i2)) {
                    int i9 = 1670521902 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -87663383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1234144596 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i10 = 1873926586 ^ i2;
        throw new IllegalAccessException();
    }

    public void incrementBlocksPlaced(Player player, int i) {
        int i2 = 897774552 ^ (573507678 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1467439128) {
            i2 = 1326220583 ^ i2;
            StatsHolder stats = getStats(player, 939705030);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -789803310) {
                i2 = 2101434187 ^ i2;
                if (stats != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 988165257) {
                        i2 = 255742727 ^ i2;
                        stats.incrementBlocksPlaced(1582011806);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1125428401) {
                            int i3 = 990600660 ^ i2;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 172518821:
                        case 205776868:
                            int i4 = 875892435 ^ i2;
                            return;
                        case 1319250220:
                            return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 988165257 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1575031445 ^ i2)) {
                    int i5 = 329414897 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -789803310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1886684271 ^ i2)) {
                        break;
                    }
                }
            }
            int i6 = 1444615397 ^ i2;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1125428401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1430245287 ^ i2)) {
                int i7 = 1094218226 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1467439128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (884015675 ^ i2)) {
                    int i8 = 764694916 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1689370096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1782390586 ^ i2)) {
                        int i9 = 1859473703 ^ i2;
                        throw new RuntimeException();
                    }
                }
            }
        }
    }

    public void incrementMobKills(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.manager.StatsManager.incrementMobKills(org.bukkit.entity.Player, int):void");
    }

    public void incrementItemsCrafted(Player player) {
        int i = 1591181824 ^ (575290574 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -250966613) {
            int i2 = 27564627 ^ i;
            StatsHolder stats = getStats(player, 939705030);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -64069837) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -64069837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (600767673 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1787066265 ^ i2;
                throw new RuntimeException("double");
            }
            i = 2048490980 ^ i2;
            if (stats == null) {
                ejbedfzuqglxikwf(i, 1130738888);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 753250320) {
                i = 2120478864 ^ i;
                stats.incrementItemsCrafted(1213183524);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -537250669) {
                    int i4 = 1023820888 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -537250669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (935944427 ^ i)) {
                int i5 = 2063770185 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 935859794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2126691746 ^ i)) {
                    int i6 = 666039554 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 753250320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1351612041 ^ i)) {
                        int i7 = 329888627 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -250966613 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2033496906 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 225064678 ^ i;
        throw new IOException();
    }

    public void incrementJumps(Player player, int i) {
        int i2 = 204911173 ^ (345491793 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -789798024) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -789798024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1342075493 ^ i2)) {
                    int i3 = 1669234956 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1060896981 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2054473174 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 196725344 ^ i2;
            throw new IOException();
        }
        int i5 = 1109146931 ^ i2;
        StatsHolder stats = getStats(player, 939705030);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1072870686) {
            i5 = 604019960 ^ i5;
            if (stats == null) {
                int i6 = 68766273 ^ i5;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -536236765) {
                int i7 = 842436876 ^ i5;
                stats.incrementJumps(503022072);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1908221250) {
                    int i8 = 909105997 ^ i7;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1908221250 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1344390165 ^ i7)) {
                        break;
                    }
                }
                int i9 = 635117991 ^ i7;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1072870686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (803313744 ^ i5)) {
                int i10 = 491244246 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -536236765 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (318593364 ^ i5)) {
                    break;
                }
            }
        }
        int i11 = 1107146245 ^ i5;
        throw new IllegalAccessException("double");
    }

    public void incrementChatMessages(Player player, int i) {
        int i2 = 982862068 ^ (428083823 ^ 45936507);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 225275649) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 225275649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (948043001 ^ i2)) {
                    break;
                }
            }
            int i3 = 798320149 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 162678585 ^ i2;
        StatsHolder stats = getStats(player, 939705030);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1090475721) {
            i4 = 352014609 ^ i4;
            if (stats != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -416948671) {
                    int i5 = 2102769966 ^ i4;
                    stats.incrementChatMessages(292329888);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 227022642) {
                        int i6 = 709735677 ^ i5;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1608888539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1010229844 ^ i5)) {
                            int i7 = 345957570 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 227022642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1033144279 ^ i5)) {
                                break;
                            }
                        }
                    }
                    int i8 = 1191729005 ^ i5;
                    throw new IllegalAccessException("double");
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                    case 100341559:
                        int i9 = 1461194195 ^ i4;
                        return;
                    case 525398543:
                    case 1432459280:
                        return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -416948671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1698562837 ^ i4)) {
                int i10 = 1088079812 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1090475721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1462182449 ^ i4)) {
                    int i11 = 408899378 ^ i4;
                    throw new IOException();
                }
            }
        }
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
        ewyeqkwwmm = wlyrnejtypxevph();
        r74T2hDbQ4 = (-1028108547) ^ new Random(8043538024201151908L).nextInt();
    }

    public static String vizrcdqswd(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ewyeqkwwmm[i3 % ewyeqkwwmm.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] wlyrnejtypxevph() {
        return new byte[]{74, 120, 78, 95, 115, 58, 89, 96, 100, 20, 86, 36, 36, 4, 41, 17, 72, 9, 32, 38, 73, 67, 92, 125, 65, 26, 125, 114, 60, 68, 58, 118, 26, 114, 107, 121, 101, 69, 91, 17, 5, 16, 39, 97, 113, 3};
    }

    private static byte[] dikamuashdlzxyt() {
        return new byte[]{-123, -76, 119, 9, 75, 125, 105, 45, 84, 74, 103, 58, 29, 64, 17, 66, 120, 70, 16, 114, 120, 93, 101, 35, 121, 70, 77, 63, 12, 16, 11, 55, 35, 51, 83, 42, 85, 16};
    }

    private static int ejbedfzuqglxikwf(int i, int i2) {
        return i ^ i2;
    }
}
