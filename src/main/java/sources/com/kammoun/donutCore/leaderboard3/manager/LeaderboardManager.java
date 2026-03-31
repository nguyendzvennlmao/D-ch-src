package com.kammoun.donutCore.leaderboard3.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.utils.NumberUtils;
import com.kammoun.donutCore.api.utils.time.TimeUtils;
import com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3;
import com.kammoun.donutCore.leaderboard3.gui.LeaderboardMenuGui;
import com.kammoun.donutCore.leaderboard3.gui.LeaderboardPageGui;
import com.kammoun.donutCore.leaderboard3.model.LeaderboardEntry;
import com.kammoun.donutCore.leaderboard3.model.LeaderboardType;
import com.kammoun.donutCore.stats.models.StatsType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.entity.Player;

public class LeaderboardManager {
    private final LeaderBoardPlugin3 plugin;
    private final Map<LeaderboardType, List<LeaderboardEntry>> cache;

    private static int f698UuhZKhjzy = 0;
    private transient int XCf389bSFf = 8555139;
    private static byte[] npvweygfub;
    private static String[] nothing_to_see_here = new String[18];

    public LeaderboardManager(LeaderBoardPlugin3 leaderBoardPlugin3, int i) {
        int i2 = 180400067 ^ (329851693 ^ 1348437769);
        int parseInt = 507395474 ^ (1671289989 ^ Integer.parseInt("882240240"));
        this.XCf389bSFf = 8555139 ^ f698UuhZKhjzy;
        int sgcoxibbalqscadz = 1237260065 ^ sgcoxibbalqscadz(parseInt, 1082443123);
        this.cache = new ConcurrentHashMap();
        this.plugin = leaderBoardPlugin3;
        int i3 = 303774902 ^ (2140305820 ^ sgcoxibbalqscadz);
    }

    public void updateCache(int i) {
        int i2 = 149467277 ^ (1776919858 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 406282553) {
            i2 = 1958635753 ^ i2;
            SchedulerUtil.runAsync(() -> {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.manager.LeaderboardManager.lambda$updateCache$2():void");
            }, 1163669431);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1111218574) {
                int i3 = 863212059 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 643348139 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1067142362 ^ i2)) {
                int i4 = 1668932928 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 406282553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (16793910 ^ i2)) {
                    int i5 = 1377623610 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1111218574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1622621865 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 513372195 ^ i2;
        throw new IllegalAccessException();
    }

    public List getCache(LeaderboardType leaderboardType, int i) {
        int i2 = 607094702 ^ (1921699955 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1525321176) {
            int i3 = 1431393819 ^ i2;
            return this.cache.getOrDefault(leaderboardType, Collections.emptyList());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1525321176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (454079678 ^ i2)) {
                int i4 = 856535325 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 262128370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (494580159 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1871573049 ^ i2;
        throw new RuntimeException();
    }

    public String formatValue(double d, StatsType statsType, int i) {
        int i2 = 1559312166 ^ (666726866 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -899810463) {
            i2 = 1665443323 ^ i2;
            if (statsType != StatsType.PLAY_TIME) {
                sgcoxibbalqscadz(i2, 1498066085);
                return NumberUtils.formatDouble(d, 1827184238);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -797387590) {
                int i3 = 1737847518 ^ i2;
                return TimeUtils.formatTimeDonut((long) d, 1780052838);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 439202192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1407260476 ^ i2)) {
                int i4 = 390093273 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -321699255 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1168214810 ^ i2)) {
                    int i5 = 46866900 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -797387590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1447859484 ^ i2)) {
                        int i6 = 1094771859 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -899810463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1975484944 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 939244658 ^ i2;
        throw new IllegalAccessException();
    }

    public int getPlayersPerPage(int i) {
        int i2 = 473813453 ^ (1703150138 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -571387015) {
            int i3 = 1594336577 ^ i2;
            return this.plugin.getConfig(127597628).getInt(aplkztuwku(dbxjanrjoojikhb(), i3), (byte) (1689882407 ^ i3));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 634157427 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (11685955 ^ i2)) {
                int i4 = 313796119 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -571387015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1048214176 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 666169215 ^ i2;
        throw new IOException();
    }

    public String getPlayerNameByPosition(int i, LeaderboardType leaderboardType, int i2) {
        int i3 = 2046498525 ^ (551209429 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -651086720) {
            i3 = 1502628054 ^ i3;
            List cache = getCache(leaderboardType, 1762046311);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 364081714) {
                int i4 = 1779210301 ^ i3;
                int i5 = i - ((byte) (683341434 ^ i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1171764185) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1171764185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (389731502 ^ i4)) {
                            break;
                        }
                    }
                    int i6 = 1306665757 ^ i4;
                    throw new RuntimeException("double");
                }
                int i7 = 201667029 ^ i4;
                if (i5 >= (616548270 ^ i7)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 637418865) {
                        i7 = 681614258 ^ i7;
                        if (i5 < cache.size()) {
                            sgcoxibbalqscadz(i7, 2062097222);
                            return ((LeaderboardEntry) cache.get(i5)).getName(1132305765);
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1627054304) {
                            int i8 = 1700432710 ^ i7;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 637418865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (714809553 ^ i7)) {
                            int i9 = 124475419 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1627054304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (477222775 ^ i7)) {
                                break;
                            }
                        }
                    }
                    int i10 = 14542781 ^ i7;
                    throw new IOException("double");
                }
                sgcoxibbalqscadz(i7, 1308233972);
                return null;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1213056301 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1418881725 ^ i3)) {
                int i11 = 127859840 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1244576467 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1752151924 ^ i3)) {
                    int i12 = 1351492673 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 364081714 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1429679139 ^ i3)) {
                        int i13 = 1128033093 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -651086720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1178021358 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i14 = 459006219 ^ i3;
        throw new RuntimeException();
    }

    public double getValueByPosition(int i, LeaderboardType leaderboardType, int i2) {
        int i3 = 123101216 ^ (1681495061 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 188771689) {
            int i4 = 1500417842 ^ i3;
            List cache = getCache(leaderboardType, 1762046311);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1070328581) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1070328581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2008117086 ^ i4)) {
                        break;
                    }
                }
                int i5 = 1404291404 ^ i4;
                throw new IllegalAccessException("double");
            }
            i3 = 1833507471 ^ i4;
            int i6 = i - ((byte) (357537809 ^ i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1434664832) {
                int i7 = 598281111 ^ i3;
                if (i6 < (921080711 ^ i7)) {
                    int i8 = 1340642207 ^ i7;
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1221288903) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1221288903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (463653487 ^ i7)) {
                                break;
                            }
                        }
                        int i9 = 1362377091 ^ i7;
                        throw new IOException("double");
                    }
                    i3 = 582457626 ^ i7;
                    if (i6 < cache.size()) {
                        int i10 = 295876708 ^ i3;
                        return ((LeaderboardEntry) cache.get(i6)).getValue(269385613);
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1568123672) {
                        int i11 = 1834945157 ^ i3;
                    }
                }
                return 0.0d;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -932183869 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1986805564 ^ i3)) {
                int i12 = 793269645 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 188771689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1855937084 ^ i3)) {
                    int i13 = 969469894 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1568123672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1510914896 ^ i3)) {
                        int i14 = 1437433432 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1434664832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1133804137 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i15 = 567234559 ^ i3;
        throw new IllegalAccessException();
    }

    public int getMaxPage(LeaderboardType leaderboardType, int i) {
        int i2 = 1148373152 ^ (907293351 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2096620295) {
            int i3 = 2105862649 ^ i2;
            return (int) Math.ceil(getCache(leaderboardType, 1762046311).size() / getPlayersPerPage(589811394));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2096620295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (49020059 ^ i2)) {
                int i4 = 396438428 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1865372466 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1281585146 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 773672272 ^ i2;
        throw new RuntimeException();
    }

    public void openMenu(Player player, int i) {
        int i2 = 438534707 ^ (825518965 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1216382707) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1216382707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1617981160 ^ i2)) {
                    int i3 = 2113182850 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -483856174 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (174499945 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1139379707 ^ i2;
            throw new IOException();
        }
        int i5 = 1480068680 ^ i2;
        new LeaderboardMenuGui(this.plugin, 2091218117).open(player, 535899301);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1992231759) {
            int i6 = 1833762956 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1992231759 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1334065637 ^ i5)) {
                break;
            }
        }
        int i7 = 1388732934 ^ i5;
        throw new IllegalAccessException("double");
    }

    public void openPage(Player player, LeaderboardType leaderboardType, int i, int i2) {
        int i3 = 2067274785 ^ (164791915 ^ 1107818904);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -2023022959) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1518582309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (312774084 ^ i3)) {
                    int i4 = 1675656855 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2023022959 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1882380656 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 116503729 ^ i3;
            throw new RuntimeException();
        }
        int i6 = 1518871833 ^ i3;
        new LeaderboardPageGui(this.plugin, this, leaderboardType, i, getMaxPage(leaderboardType, 1108589143), 990904705).open(player, 1552623405);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1395275355) {
            int i7 = 516607600 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1395275355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1607179070 ^ i6)) {
                break;
            }
        }
        int i8 = 361705404 ^ i6;
        throw new IOException("double");
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠿⠟⠛⠻⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣆⣀⣀⠀⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠻⣿⣿⣿⠅⠛⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[5] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢼⣿⣿⣿⣃⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[6] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣟⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣛⣛⣫⡄⠀⢸⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡆⠸⣿⣿⣿⡷⠂⠨⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⡇⢀⣿⡿⠋⠁⢀⡶⠪⣉⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣷⣿⣿⣷⣦⡙⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣷⣦⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        npvweygfub = ityjpcblyvuydyl();
        f698UuhZKhjzy = 2097494389 ^ new Random(4118562581042942108L).nextInt();
    }

    public static String aplkztuwku(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ npvweygfub[i3 % npvweygfub.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ityjpcblyvuydyl() {
        return new byte[]{86, 61, 69, 70, 10, 87, 16, 91, 126, 44, 40, 1, 24, 16, 50, 76, 69, 31, 105, 89, 111, 62, 94, 24, 110, 58, 123, 24, 1, 35, 103, 122, 62, 24, 108, 113};
    }

    private static byte[] kqliflbowtgvpld() {
        return new byte[]{-103, -16, 119, 36, 58, 8, 40, 3, 73, 114, 25, 92, 42, 80, 2, 19};
    }

    private static byte[] wcfcogwueuhgxgn() {
        return new byte[]{-103, -10, 125, 28, 58, 0, 37, 0, 72, 117, 25, 80, 32, 4, 2, 9, 112, 78, 95, 18, 94, 111};
    }

    private static byte[] dbxjanrjoojikhb() {
        return new byte[]{-103, -12, 125, 15, 50, 3, 34, 14, 79, 97, 25, 82, 32, 91, 10, 7, 119, 6, 88, 29, 94, 109, 102, 83, 86, 47, 73, 92, 48, 118, 86, 43, 6, 68};
    }

    private static int sgcoxibbalqscadz(int i, int i2) {
        return i ^ i2;
    }
}
