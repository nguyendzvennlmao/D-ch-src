package com.kammoun.donutCore.stats.listeners;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import com.kammoun.donutCore.stats.StatsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class StatsListener implements Listener {
    private final StatsPlugin plugin;
    private static int laftXi0FVk = 0;

    private transient int f1136Hij2BRq8p = 1729979799;
    private static String gbceakeuqx;
    private static String[] nothing_to_see_here = new String[18];

    public StatsListener(StatsPlugin statsPlugin, int i) {
        hvhgolqctwjnekus(1097403317 ^ 1243673050, 55007088);
        int parseInt = 1457442245 ^ (1776223523 ^ Integer.parseInt("923756025"));
        this.f1136Hij2BRq8p = 1729979799 ^ laftXi0FVk;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 126732867:
                    parseInt = 2019833105 ^ parseInt;
                    break;
                case 156699712:
                    break;
                case 788243019:
                case 1086032504:
                default:
                    throw new IOException();
            }
        }
        this.plugin = statsPlugin;
        int i2 = 255704133 ^ (1702713417 ^ parseInt);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 976603416 ^ (890056234 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1783648518) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1783648518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1937360365 ^ i)) {
                    break;
                }
            }
            int i2 = 1161162059 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 879007949 ^ i;
        Player player = playerJoinEvent.getPlayer();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 915105939) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1143469577 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1549882530 ^ i3)) {
                    int i4 = 1615991855 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 915105939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1132872420 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 1686977328 ^ i3;
            throw new IOException();
        }
        int i6 = 1126811709 ^ i3;
        this.plugin.getStatsManager(666148966).loadPlayerStats(player, 2122862432);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 801450361) {
            int i7 = 226253806 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 801450361 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1553168025 ^ i6)) {
                break;
            }
        }
        int i8 = 73092340 ^ i6;
        throw new IllegalAccessException("double");
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 2051326612 ^ (1105494825 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 829069955) {
            int i2 = 460733054 ^ i;
            Player player = playerQuitEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -354727565) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -354727565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (911193535 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1091907741 ^ i2;
                throw new IOException("double");
            }
            i = 1101432677 ^ i2;
            this.plugin.getStatsManager(666148966).unloadPlayerStats(player, 1632594531);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -403738023) {
                int i4 = 701013462 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1448370968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1842078222 ^ i)) {
                int i5 = 2071923464 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 829069955 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1748327842 ^ i)) {
                    int i6 = 712354312 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -403738023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1075785194 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i7 = 1304175483 ^ i;
        throw new IOException();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent blockBreakEvent) {
        int i = 218161747 ^ (749214799 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -516986997) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -516986997 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1752553010 ^ i)) {
                    break;
                }
            }
            int i2 = 1987978741 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 285030499 ^ i;
        Player player = blockBreakEvent.getPlayer();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1724294291) {
            i3 = 2076306311 ^ i3;
            this.plugin.getStatsManager(666148966).incrementBlocksBroken(player, 795624209);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1194723160) {
                int i4 = 1678578325 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1724294291 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1888075894 ^ i3)) {
                int i5 = 798135989 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1734251517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1348661785 ^ i3)) {
                    int i6 = 641827702 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1194723160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2141116999 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 2146961726 ^ i3;
        throw new IllegalAccessException();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockPlace(BlockPlaceEvent blockPlaceEvent) {
        int i = 1793026107 ^ (1418583197 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 519909979) {
            i = 1369151873 ^ i;
            Player player = blockPlaceEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1843265967) {
                int i2 = 1906180327 ^ i;
                this.plugin.getStatsManager(666148966).incrementBlocksPlaced(player, 516757957);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 517077354) {
                    int i3 = 602352402 ^ i2;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 517077354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1064098048 ^ i2)) {
                        break;
                    }
                }
                int i4 = 211909270 ^ i2;
                throw new IllegalAccessException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 32023035 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1361581131 ^ i)) {
                int i5 = 116292442 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 519909979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1114939506 ^ i)) {
                    int i6 = 956472733 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1843265967 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (266632379 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i7 = 1347340529 ^ i;
        throw new IOException();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerDeath(PlayerDeathEvent playerDeathEvent) {
        int i = 344649053 ^ (88631587 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1652339866) {
            int i2 = 283199197 ^ i;
            Player entity = playerDeathEvent.getEntity();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -445218190) {
                i2 = 1811578692 ^ i2;
                this.plugin.getStatsManager(666148966).incrementDeaths(entity, 524200479);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1163560879) {
                    int i3 = 581353280 ^ i2;
                    Player killer = entity.getKiller();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1349483952) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1349483952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1363384016 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 556492739 ^ i3;
                        throw new RuntimeException("double");
                    }
                    i2 = 462234682 ^ i3;
                    if (killer == null) {
                        hvhgolqctwjnekus(i2, 521860502);
                        return;
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1945740160) {
                        i = 546427974 ^ i2;
                        this.plugin.getStatsManager(666148966).incrementKills(killer, 740958659);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2004287921) {
                            int i5 = 1066082768 ^ i;
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1945740160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2131044959 ^ i2)) {
                    int i6 = 67060951 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -445218190 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2048302540 ^ i2)) {
                        int i7 = 1566367984 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1163560879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1882168219 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i8 = 315589621 ^ i2;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2004287921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (920636013 ^ i)) {
                int i9 = 1305570044 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1652339866 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (139993935 ^ i)) {
                    int i10 = 114441265 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1959915728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (734978863 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i11 = 597312355 ^ i;
        throw new IOException("double");
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEntityDeath(EntityDeathEvent entityDeathEvent) {
        int i = 1853108193 ^ (1899882639 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 371633178) {
            i = 1831364334 ^ i;
            if (entityDeathEvent.getEntity().getKiller() != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2137365353) {
                    i = 1462494613 ^ i;
                    Player killer = entityDeathEvent.getEntity().getKiller();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -969230397) {
                        i = 183596406 ^ i;
                        if ((entityDeathEvent.getEntity() instanceof Player) != (1916150670 ^ i)) {
                            hvhgolqctwjnekus(i, 1162324299);
                            return;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1850663821) {
                            i = 1715126384 ^ i;
                            this.plugin.getStatsManager(666148966).incrementMobKills(killer, 202161924);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1603854352) {
                                int i2 = 595421499 ^ i;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -969230397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1216541186 ^ i)) {
                        int i3 = 195595588 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1603854352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1453114060 ^ i)) {
                            int i4 = 593015720 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1850663821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1666650791 ^ i)) {
                                int i5 = 768063567 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2137365353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (126602034 ^ i)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i6 = 1090767240 ^ i;
                throw new IOException();
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                    case 215659599:
                        int i7 = 412957096 ^ i;
                        return;
                    case 620241612:
                    case 1925747366:
                        return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 371633178 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1893335598 ^ i)) {
                int i8 = 1510948596 ^ i;
                throw new IllegalAccessException("double");
            }
        }
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerChat(AsyncPlayerChatEvent asyncPlayerChatEvent) {
        int i = 941773204 ^ (1818212633 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1334301440) {
            i = 330236825 ^ i;
            Player player = asyncPlayerChatEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -754987064) {
                i = 138811282 ^ i;
                this.plugin.getStatsManager(666148966).incrementChatMessages(player, 280616157);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1865452712) {
                    int i2 = 1109409099 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1334301440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (741734249 ^ i)) {
                int i3 = 52711927 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1865452712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (258811648 ^ i)) {
                    int i4 = 2053221575 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -754987064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1106039351 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1933983812 ^ i;
        throw new RuntimeException();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerJumpEvent playerJumpEvent) {
        int i = 29290749 ^ (1572452162 ^ 1569526509);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 206744208) {
            i = 1558366173 ^ i;
            Player player = playerJumpEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -347827078) {
                i = 453288227 ^ i;
                this.plugin.getStatsManager(666148966).incrementJumps(player, 1223026127);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 862035298) {
                    int i2 = 958636869 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -347827078 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1187558874 ^ i)) {
                int i3 = 1506676807 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 206744208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (631677659 ^ i)) {
                    int i4 = 611024214 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -92502197 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1972184009 ^ i)) {
                        int i5 = 810534447 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 862035298 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1378563687 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 1766105400 ^ i;
        throw new IllegalAccessException();
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
        gbceakeuqx = ByteBuffer.wrap(emusmwxtpqocgsp()).asCharBuffer().toString();
        laftXi0FVk = (-1024245760) ^ new Random(5080808559204986761L).nextInt();
    }

    public static String bzntfpvlro(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = gbceakeuqx.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] emusmwxtpqocgsp() {
        return new byte[0];
    }

    private static int hvhgolqctwjnekus(int i, int i2) {
        return i2 ^ i;
    }
}
