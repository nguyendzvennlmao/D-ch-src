package com.kammoun.donutCore.portals.listener;

import com.kammoun.donutCore.portals.PortalPlugin;
import com.kammoun.donutCore.portals.helper.PortalHelper;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PortalListener implements Listener {
    private final PortalPlugin plugin;

    private static int f7326NoA9Sxmo = 0;
    private transient int RFOCU7K2qQ = 741857049;
    private static String[] nothing_to_see_here = new String[18];

    public PortalListener(PortalPlugin portalPlugin, int i) {
        hxbtesntaofzfkaj(817923355 ^ 1134293354, 1580154369);
        int parseInt = 1156996693 ^ (412327230 ^ Integer.parseInt("1896974619"));
        this.RFOCU7K2qQ = 741857049 ^ f7326NoA9Sxmo;
        int hxbtesntaofzfkaj = 933534275 ^ hxbtesntaofzfkaj(parseInt, 996236757);
        this.plugin = portalPlugin;
        int i2 = 33420465 ^ hxbtesntaofzfkaj;
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 963213622 ^ (1077889013 ^ 1930560191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1377952736) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1377952736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (28505410 ^ i)) {
                    break;
                }
            }
            int i2 = 689921830 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 1123993613 ^ i;
        Player player = playerQuitEvent.getPlayer();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1171760010) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -603167615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (903420726 ^ i3)) {
                    int i4 = 192898975 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1171760010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1614513542 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 90249724 ^ i3;
            throw new IllegalAccessException();
        }
        int i6 = 1363727447 ^ i3;
        this.plugin.getPlayerRegions(814862755).remove(player);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -812580560) {
            int i7 = 578006198 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -812580560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (345950964 ^ i6)) {
                break;
            }
        }
        int i8 = 1846174730 ^ i6;
        throw new RuntimeException("double");
    }

    @org.bukkit.event.EventHandler
    public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.portals.listener.PortalListener.onPlayerMove(org.bukkit.event.player.PlayerMoveEvent):void");
    }

    private void processRegions(Player player, Set set, int i) {
        int i2 = 319492932 ^ (1426852867 ^ 1930560191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1465323583) {
            i2 = 1090672829 ^ i2;
            Map playerRegions = this.plugin.getPlayerRegions(814862755);
            Function function = player2 -> {
                int i3 = 1920668186 ^ (522327334 ^ 1596315046);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1813605167) {
                    int i4 = 1969397630 ^ i3;
                    return ConcurrentHashMap.newKeySet();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 955412258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (442688807 ^ i3)) {
                        int i5 = 51799353 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1813605167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1670287000 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 190488122 ^ i3;
                throw new IllegalAccessException();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1598412245) {
                int i3 = 173302944 ^ i2;
                Set set2 = (Set) playerRegions.computeIfAbsent(player, function);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -233238741) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -233238741 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1404007269 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1188015283 ^ i3;
                    throw new IOException("double");
                }
                i2 = 1893111854 ^ i3;
                HashSet hashSet = new HashSet(set2);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1957547608) {
                    int i5 = 199663082 ^ i2;
                    hashSet.removeAll(set);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 731455752) {
                        i2 = 1142886468 ^ i5;
                        Objects.requireNonNull(set2);
                        hashSet.forEach((v1) -> {
                            r0.remove(v1);
                        });
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 190948138) {
                            i5 = 1628055022 ^ i2;
                            HashSet hashSet2 = new HashSet(set);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 53513305) {
                                i2 = 930470617 ^ i5;
                                hashSet2.removeAll(set2);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1197581680) {
                                    int i6 = 1076208649 ^ i2;
                                    hashSet2.forEach(str -> {
                                        int i7 = 927377047 ^ (1439847676 ^ 1930560191);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1942518112) {
                                            int i8 = 1018390794 ^ i7;
                                            set2.add(str);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1772932849) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1772932849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (277186706 ^ i8)) {
                                                        break;
                                                    }
                                                }
                                                int i9 = 822126653 ^ i8;
                                                throw new RuntimeException("double");
                                            }
                                            int i10 = 2021317893 ^ i8;
                                            Stream stream = this.plugin.getPortals(1835478590).values().stream();
                                            Predicate predicate = portal -> {
                                                int i11 = 2044009964 ^ (454939048 ^ 1596315046);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -278343919) {
                                                    int i12 = 1402463112 ^ i11;
                                                    return portal.getRegionName(1701012675).equalsIgnoreCase(str);
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1943524179 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (2042298683 ^ i11)) {
                                                        int i13 = 161161688 ^ i11;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -278343919 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (757193043 ^ i11)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                int i14 = 2007116189 ^ i11;
                                                throw new IOException();
                                            };
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1434835238) {
                                                i10 = 1842318846 ^ i10;
                                                Stream filter = stream.filter(predicate);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1006221015) {
                                                    i7 = 1392567443 ^ i10;
                                                    Optional findFirst = filter.findFirst();
                                                    Consumer consumer = portal2 -> {
                                                        int i11 = 1493434279 ^ (1646075715 ^ 1930560191);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1080496858) {
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1080496858 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (141875746 ^ i11)) {
                                                                    break;
                                                                }
                                                            }
                                                            int i12 = 656875679 ^ i11;
                                                            throw new RuntimeException("double");
                                                        }
                                                        int i13 = 1530784114 ^ i11;
                                                        PortalHelper.executeCommand(this.plugin.getApi(2142241109), player, portal2.getCommand(136098012), 747895548);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1719117496) {
                                                            i13 = 532009973 ^ i13;
                                                            if (portal2.isMessagesEnabled(488896315) == (210032860 ^ i13)) {
                                                                hxbtesntaofzfkaj(i13, 18529975);
                                                                return;
                                                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1680262880) {
                                                                i13 = 618944472 ^ i13;
                                                                PortalHelper.sendMessage(player, portal2.getMessage(646347513), 1570370358);
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1124366369) {
                                                                    int i14 = 637462895 ^ i13;
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1680262880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (409099029 ^ i13)) {
                                                                int i15 = 1312524471 ^ i13;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1719117496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1947703891 ^ i13)) {
                                                                    int i16 = 2096612337 ^ i13;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1124366369 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1628853309 ^ i13)) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int i17 = 1547938550 ^ i13;
                                                        throw new RuntimeException();
                                                    };
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1543597491) {
                                                        i7 = 743679521 ^ i7;
                                                        findFirst.ifPresent(consumer);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1050434746) {
                                                            int i11 = 759656136 ^ i7;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1434835238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (173156922 ^ i10)) {
                                                    int i12 = 752996810 ^ i10;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1006221015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1006732767 ^ i10)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i13 = 691717957 ^ i10;
                                            throw new IllegalAccessException("double");
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1543597491 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (192345978 ^ i7)) {
                                                int i14 = 391672215 ^ i7;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1050434746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1628980820 ^ i7)) {
                                                    int i15 = 8447632 ^ i7;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1420241659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (827914910 ^ i7)) {
                                                        int i16 = 1601697929 ^ i7;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1942518112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1688801594 ^ i7)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        int i17 = 1678800402 ^ i7;
                                        throw new IllegalAccessException();
                                    });
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1179419942) {
                                        int i7 = 844609884 ^ i6;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1179419942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1472023412 ^ i6)) {
                                            break;
                                        }
                                    }
                                    int i8 = 1996102221 ^ i6;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 731455752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1256816128 ^ i5)) {
                            int i9 = 1188632380 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 53513305 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1394769242 ^ i5)) {
                                int i10 = 423243061 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 722382907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1822115076 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i11 = 597924855 ^ i5;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1465323583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (113210788 ^ i2)) {
                int i12 = 1198767577 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1197581680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1197980699 ^ i2)) {
                    int i13 = 1550496553 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1957547608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (340612140 ^ i2)) {
                        int i14 = 1292320653 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1598412245 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1598712624 ^ i2)) {
                            int i15 = 1786366714 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 190948138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1968002288 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i16 = 1851249857 ^ i2;
        throw new IOException();
    }

    @org.bukkit.event.EventHandler
    public void onPlayerPortal(org.bukkit.event.player.PlayerPortalEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.portals.listener.PortalListener.onPlayerPortal(org.bukkit.event.player.PlayerPortalEvent):void");
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
        f7326NoA9Sxmo = 10844318 ^ new Random(-657400418149553883L).nextInt();
    }

    public static String wmnhjdlzxv(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] qzdiahbmmowixuz() {
        return new byte[]{43, 7, 93, 102, 104, 46, 118, 7, 22, 62, 124, 74, 31, 88, 41, 26, 24, 43, 5, 125, 70, 95, 70, 79, 71, 94};
    }

    private static int hxbtesntaofzfkaj(int i, int i2) {
        return i2 ^ i;
    }
}
