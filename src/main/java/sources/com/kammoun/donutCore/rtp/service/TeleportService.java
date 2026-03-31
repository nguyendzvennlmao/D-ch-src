package com.kammoun.donutCore.rtp.service;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.rtp.config.ConfigManager;
import com.kammoun.donutCore.rtp.model.TeleportRegion;
import com.kammoun.donutCore.rtp.util.ChatUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.lib.PaperLib;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class TeleportService {
    private final ConfigManager configManager;
    private final CooldownService cooldownService;
    private final WarmupService warmupService;
    private final QueueService queueService;
    private final Plugin plugin;
    private static int UxZ14mChyU = 0;
    private transient int WGNgNZyiFJ = 1567234409;
    private static String[] nothing_to_see_here = new String[19];

    public TeleportService(ConfigManager configManager, CooldownService cooldownService, WarmupService warmupService, QueueService queueService, int i) {
        int i2 = 469701936 ^ (496192817 ^ 1475908317);
        int parseInt = 81636647 ^ (1854721953 ^ Integer.parseInt("1002809434"));
        this.WGNgNZyiFJ = 1567234409 ^ UxZ14mChyU;
        this.configManager = configManager;
        this.cooldownService = cooldownService;
        this.warmupService = warmupService;
        this.queueService = queueService;
        this.plugin = configManager.getPlugin(1485195813);
        int i3 = 2051316099 ^ (268313149 ^ (79922078 ^ (1784564800 ^ (1657985452 ^ (1788900106 ^ (1238184537 ^ parseInt))))));
    }

    public void teleport(org.bukkit.entity.Player r7, java.lang.String r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.TeleportService.teleport(org.bukkit.entity.Player, java.lang.String, int):void");
    }

    private void executeTeleport(Player player, String str, int i) {
        int i2 = 1912919953 ^ (2031441184 ^ 669085810);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1736939033) {
            i2 = 704517356 ^ i2;
            TeleportRegion region = this.configManager.getRegion(str, 1794939453);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 678900088) {
                i2 = 1809832655 ^ i2;
                if (region != null) {
                    i2 = 1403364991 ^ i2;
                    findSafeLocationAsync(region, player, 956139685).whenComplete((location, th) -> {
                        int i3 = 1775356768 ^ (1215280696 ^ 669085810);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 855140688) {
                            i3 = 544830988 ^ i3;
                            SchedulerUtil.run(()
                            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.TeleportService.lambda$executeTeleport$4(org.bukkit.entity.Player, org.bukkit.Location, java.lang.Throwable):void");
                        });
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -341519111) {
                            int i3 = 1892228312 ^ i2;
                            return;
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1988749059) {
                        i2 = 212828102 ^ i2;
                        ChatUtil.sendMessage(player, ainmctjakj(ycjnpkhuyinwosy(), rnpsmgmeafofwwv(), i2), 431932631);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 334633267) {
                            i2 = 19261324 ^ i2;
                            this.queueService.markProcessingComplete();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 450700627) {
                                int i4 = 1030532957 ^ i2;
                                return;
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1988749059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (341635742 ^ i2)) {
                    int i5 = 2082986172 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1844195898 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (305214654 ^ i2)) {
                        int i6 = 723291043 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 334633267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (395203695 ^ i2)) {
                            int i7 = 1061269490 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 678900088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1541747525 ^ i2)) {
                                int i8 = 570808299 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -341519111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1275018073 ^ i2)) {
                                    int i9 = 1907718092 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1736939033 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (707421087 ^ i2)) {
                                        int i10 = 1175050693 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -239575110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (84568167 ^ i2)) {
                                            int i11 = 605993259 ^ i2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 450700627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1676966287 ^ i2)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i12 = 1813618932 ^ i2;
            throw new RuntimeException();
        }

        private CompletableFuture findSafeLocationAsync(TeleportRegion teleportRegion, Player player, int i) {
            int i2 = 1568570669 ^ (878794047 ^ 669085810);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2012398338) {
                i2 = 269650252 ^ i2;
                CompletableFuture completableFuture = new CompletableFuture();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -144275102) {
                    i2 = 672138657 ^ i2;
                    AtomicInteger atomicInteger = new AtomicInteger((byte) (1996280973 ^ i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1209621397) {
                        i2 = 520508794 ^ i2;
                        tryNextLocation(teleportRegion, completableFuture, atomicInteger, 937375527);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1339297723) {
                            int i3 = 1005793705 ^ i2;
                            return completableFuture;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1873968398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (69123933 ^ i2)) {
                    int i4 = 1038141607 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1209621397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (199020143 ^ i2)) {
                        int i5 = 506671437 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1339297723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1398728463 ^ i2)) {
                            int i6 = 258407671 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -144275102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1519249445 ^ i2)) {
                                int i7 = 1324612118 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2012398338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1154721838 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i8 = 1225598156 ^ i2;
            throw new RuntimeException();
        }

        private void tryNextLocation(TeleportRegion teleportRegion, CompletableFuture completableFuture, AtomicInteger atomicInteger, int i) {
            int i2;
            int i3 = 1891837166 ^ (1416301361 ^ 669085810);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 441122152) {
                i3 = 1063077875 ^ i3;
                if (atomicInteger.getAndIncrement() < this.configManager.getMaxAttempts(206260709)) {
                    int mraebgllbcftifjx = mraebgllbcftifjx(i3, 327723566);
                    int randomX = teleportRegion.getRandomX(1214411961);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(mraebgllbcftifjx) != 2095420289) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(mraebgllbcftifjx) == 2095420289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(mraebgllbcftifjx) == (455788610 ^ mraebgllbcftifjx)) {
                                break;
                            }
                        }
                        int i4 = 1838118762 ^ mraebgllbcftifjx;
                        throw new IllegalAccessException("double");
                    }
                    i3 = 2063277520 ^ mraebgllbcftifjx;
                    int randomZ = teleportRegion.getRandomZ(1412801902);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1422033662) {
                        int i5 = 1659052360 ^ i3;
                        World world = teleportRegion.getWorld(1539291296);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1138460863) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1138460863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1829153712 ^ i5)) {
                                    break;
                                }
                            }
                            int i6 = 324772165 ^ i5;
                            throw new IllegalAccessException("double");
                        }
                        i2 = 1044794645 ^ i5;
                        CompletableFuture<Void> thenAccept = PaperLib.getChunkAtAsync(world, randomX >> ((byte) (163759097 ^ i2)), randomZ >> ((byte) (163759097 ^ i2)), (byte) (163759100 ^ i2), 1146275792).thenAccept(chunk -> {
                            int i7 = 220882490 ^ (553734021 ^ 669085810);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1582485096) {
                                i7 = 1606158414 ^ i7;
                                Bukkit.getRegionScheduler().execute(this.plugin, world, randomX >> ((byte) (1417040263 ^ i7)), randomZ >> ((byte) (1417040263 ^ i7)), ()
                                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.TeleportService.lambda$tryNextLocation$8(org.bukkit.World, int, int, com.kammoun.donutCore.rtp.model.TeleportRegion, java.util.concurrent.CompletableFuture, java.util.concurrent.atomic.AtomicInteger, org.bukkit.Chunk):void");
                            });
                            Function<Throwable, ? extends Void> function = th -> {
                                int i7 = 1217907120 ^ (628992090 ^ 669085810);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1347980482) {
                                    i7 = 80855323 ^ i7;
                                    SchedulerUtil.runAsync(() -> {
                                        int i8 = 247893127 ^ (1387396937 ^ 669085810);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -592437789) {
                                            int i9 = 219035401 ^ i8;
                                            tryNextLocation(teleportRegion, completableFuture, atomicInteger, 937375527);
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1262377557 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1583402987 ^ i8)) {
                                                int i10 = 1870347483 ^ i8;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -592437789 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (910735287 ^ i8)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i11 = 1646295417 ^ i8;
                                        throw new IOException();
                                    }, 1163669431);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1993770010) {
                                        int i8 = 626257528 ^ i7;
                                        return null;
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1993770010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1163730563 ^ i7)) {
                                        int i9 = 519351953 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1548351451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1500222381 ^ i7)) {
                                            int i10 = 933970189 ^ i7;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1347980482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1420569856 ^ i7)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                int i11 = 493783103 ^ i7;
                                throw new IOException();
                            };
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1310072808) {
                                int i7 = 1913908936 ^ i2;
                                thenAccept.exceptionally(function);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -561419861) {
                                    int i8 = 110739219 ^ i7;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -561419861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (33145706 ^ i7)) {
                                        break;
                                    }
                                }
                                int i9 = 1139019584 ^ i7;
                                throw new IOException("double");
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 232071275) {
                                    int i10 = 1030234631 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1310072808) {
                                        break;
                                        break;
                                    }
                                    continue;
                                }
                            }
                            int i11 = 373211838 ^ i2;
                            throw new IllegalAccessException("double");
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -526335247) {
                        i2 = 1571732563 ^ i3;
                        completableFuture.complete(null);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 232071275) {
                            int i12 = 1330184284 ^ i2;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 232071275 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1287239355 ^ i2)) {
                                int i102 = 1030234631 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1310072808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (214197047 ^ i2)) {
                                    break;
                                }
                            }
                        }
                        int i112 = 373211838 ^ i2;
                        throw new IllegalAccessException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2006786697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (640103866 ^ i3)) {
                        int i13 = 2052698852 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -526335247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (450100960 ^ i3)) {
                            int i14 = 1290745977 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 441122152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1661127245 ^ i3)) {
                                int i15 = 1684131638 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1422033662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (691729617 ^ i3)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i16 = 1327921055 ^ i3;
                throw new IllegalAccessException();
            }

            private int findSafeY(TeleportRegion teleportRegion, World world, int i, int i2, int i3) {
                int i4 = 488458466 ^ (1353284059 ^ 669085810);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1386875483) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1386875483 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1506619387 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1798399646 ^ i4;
                    throw new RuntimeException("double");
                }
                int i6 = 1359825397 ^ i4;
                World.Environment environment = world.getEnvironment();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -624933391) {
                    int i7 = 1408281482 ^ i6;
                    int minY = teleportRegion.getMinY(1626500905);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1162156451) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1162156451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (403768152 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 254802236 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    int i9 = 171104931 ^ i7;
                    int maxY = teleportRegion.getMaxY(978274185);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 349424827) {
                        i9 = 1771115910 ^ i9;
                        if (environment != World.Environment.NORMAL) {
                            i6 = mraebgllbcftifjx(i9, 40027155);
                            if (environment != World.Environment.NETHER) {
                                int i10 = 809370472 ^ i6;
                                if (environment != World.Environment.THE_END) {
                                    mraebgllbcftifjx(i10, 895692526);
                                    return scanTopDown(teleportRegion, world, i, i2, maxY, minY, 1161950973);
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -893559983) {
                                    int i11 = 614264766 ^ i10;
                                    return scanBottomUp(teleportRegion, world, i, i2, Math.max(minY, (int) ((byte) (499860708 ^ i11))), Math.min(maxY, (int) ((byte) (499860622 ^ i11))), 1150426753);
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -893559983 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1039832606 ^ i10)) {
                                        break;
                                    }
                                }
                                int i12 = 715253350 ^ i10;
                                throw new RuntimeException("double");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1263353872) {
                                int i13 = 1650731612 ^ i6;
                                return scanBottomUp(teleportRegion, world, i, i2, Math.max(minY, (int) ((byte) (1796047486 ^ i13))), Math.min(maxY, (int) ((byte) (1796047398 ^ i13))), 1150426753);
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1482383496) {
                            i6 = 1414447441 ^ i9;
                            int min = Math.min(maxY - ((byte) (1598401858 ^ i6)), world.getMaxHeight() - ((byte) (1598401858 ^ i6)));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -97687038) {
                                int i14 = 953797834 ^ i6;
                                return scanTopDown(teleportRegion, world, i, i2, min, Math.max(minY, world.getMinHeight()), 1161950973);
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1482383496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1108507041 ^ i9)) {
                            int i15 = 490475263 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 349424827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (54461326 ^ i9)) {
                                break;
                            }
                        }
                    }
                    int i16 = 1115685347 ^ i9;
                    throw new RuntimeException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -97687038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (624809925 ^ i6)) {
                        int i17 = 101296846 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -624933391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (177197491 ^ i6)) {
                            int i18 = 1526234090 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -296081760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (561383386 ^ i6)) {
                                int i19 = 94707906 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1263353872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (210184441 ^ i6)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i20 = 595638633 ^ i6;
                throw new IllegalAccessException();
            }

            private int scanTopDown(TeleportRegion teleportRegion, World world, int i, int i2, int i3, int i4, int i5) {
                int i6;
                int i7 = 829837585 ^ (1013384249 ^ 669085810);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1468082897) {
                    i7 = 138311374 ^ i7;
                    int i8 = i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 376609953) {
                        int i9 = 1255631543 ^ i7;
                        while (true) {
                            i6 = i9;
                            if (i8 < i4) {
                                return (byte) ((-1112853353) ^ (709751371 ^ i6));
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1086966043) {
                                i6 = 1872675151 ^ i6;
                                if (isSafeLocation(teleportRegion, world, i, i8, i2, 1853588307) != (126351468 ^ i6)) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1010811744) {
                                        return i8 + ((byte) (1397637332 ^ (1422506169 ^ i6)));
                                    }
                                }
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                        case 118456162:
                                            i6 = 1877210628 ^ i6;
                                            break;
                                        case 1162126492:
                                            break;
                                        case 1971309109:
                                    }
                                }
                                i8 += (-1751387753) ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1126200131) {
                                    int mraebgllbcftifjx = mraebgllbcftifjx(i6, 586541785);
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(mraebgllbcftifjx) != 8053127) {
                                            throw null;
                                        }
                                        throw new RuntimeException();
                                    } catch (RuntimeException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case 115459939:
                                                i6 = mraebgllbcftifjx(mraebgllbcftifjx, 25429524);
                                                break;
                                            case 1418667402:
                                                i6 = 734648905 ^ mraebgllbcftifjx;
                                                break;
                                            default:
                                                throw new IllegalAccessException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 180484035) {
                                            i9 = mraebgllbcftifjx(i6, 155256795);
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1086966043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (523142779 ^ i6)) {
                                                    int i10 = 1897686601 ^ i6;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 180484035 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1408397822 ^ i6)) {
                                                        int i11 = 436485909 ^ i6;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 312892226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1810648821 ^ i6)) {
                                int i12 = 1902132432 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1010811744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1629339029 ^ i6)) {
                                    int i13 = 2029528976 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1126200131 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1312342142 ^ i6)) {
                                        int i14 = 1664639991 ^ i6;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 115459939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (633220109 ^ i7)) {
                        int i15 = 1971685626 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1468082897 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1344742974 ^ i7)) {
                            int i16 = 2824043 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1418667402 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (547002146 ^ i7)) {
                                int i17 = 501676985 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 376609953 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1395366337 ^ i7)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i18 = 1397377313 ^ i7;
                throw new IOException();
            }

            private int scanBottomUp(com.kammoun.donutCore.rtp.model.TeleportRegion r9, org.bukkit.World r10, int r11, int r12, int r13, int r14, int r15) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.TeleportService.scanBottomUp(com.kammoun.donutCore.rtp.model.TeleportRegion, org.bukkit.World, int, int, int, int, int):int");
            }

            private boolean isSafeLocation(com.kammoun.donutCore.rtp.model.TeleportRegion r6, org.bukkit.World r7, int r8, int r9, int r10, int r11) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.TeleportService.isSafeLocation(com.kammoun.donutCore.rtp.model.TeleportRegion, org.bukkit.World, int, int, int, int):boolean");
            }

            private void applyTeleportEffects(org.bukkit.entity.Player r9, int r10) {
                throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.service.TeleportService.applyTeleportEffects(org.bukkit.entity.Player, int):void");
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
                UxZ14mChyU = (-1351126414) ^ new Random(-1561281328412458685L).nextInt();
            }

            public static String ainmctjakj(byte[] bArr, byte[] bArr2, int i) {
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

            private static byte[] rnpsmgmeafofwwv() {
                return new byte[]{58, 78, 10, 36, 62, 115, 28, 47, 90, 8, 53, 60, 97, 45, 81, 8, 15, 62, 35, 109, 88, 110, 4, 45, 69, 13, 44, 67, 89, 93, 9, 13, 89, 103, 61, 75, 91, 69, 113, 123, 11, 34, 9, 96, 79, 22, 124, 11, 62, 126, 126, 72, 72, 41, 9, 32, 50, 109, 113, 84, 87, 66, 11, 120, 106, 78, 92, 68, 64, 47, 12, 83, 86, 86, 90, 34, 52, 102, 46, 19, 43, 69, 92, 40, 91, 19, 70, 8, 29, 111, 2, 81, 56, 21, 69, 34, 70, 80, 58, 69, 123, 8, 12, 16, 39, 59, 126, 20, 109, 72, 68, 74, 82, 99, 115, 71, 3};
            }

            private static byte[] entwmpniffshhkg() {
                return new byte[]{-16, Byte.MIN_VALUE, 60, 105, 12, 38, 45, 123, 99, 89, 4, 122, 88, 112, 97, 75, 55, 115, 23, 113, 110, 49, 54, 124, 116, 92, 21, 27, 104, 14, 48, 91};
            }

            private static byte[] qbqmjigvwjpeuwp() {
                return new byte[]{-10, -127, 61, 105, 9, 34, 37, 123, 99, 90, 7, 124, 86, 123, 102, 78, 54, 114, 26, 119, 106, 45, 51, 97, 114, 90, 21, 24, 96, 15, 59, 78, 110, 45};
            }

            private static byte[] dcaujscfbapnzgy() {
                return new byte[]{-11, -123, 61, 102, 7, 35, 42, 112, 107, 95, 4, 120, 86, 116, 104, 79, 57, 121, 18, 114, 105, 60, 51, 122, 124, 81, 26, 28, 104, 10, 56, 93};
            }

            private static byte[] xsjidcuqvuatdfj() {
                return new byte[]{-11, -121, 62, Byte.MAX_VALUE, 12, 40, 41, 117, 108, 85, 3, 108, 89, 112, 101, 74, 58, 102, 18, 118, 108, 55, 54, 122, 112, 76, 26, 27, 111, 31, 49, 90};
            }

            private static byte[] qneyuvojkgtugro() {
                return new byte[]{-11, -121, 62, 104, 12, 46, 41, 119, 108, 92};
            }

            private static byte[] cwahxcvxahilexs() {
                return new byte[]{-11, -125, 62, 100, 14, 48, 36, 102, 107, 22, 4, 109, 85, 112, 97, 80, 55, 107, 18, 57, 105, 51, 48, 104, 117, 84, 20, 84, 104, 15, 56, 70, 109, 37, 13, 29, 99, 15, 64, 56};
            }

            private static byte[] ycjnpkhuyinwosy() {
                return new byte[]{-11, -121, 63, 48, 10, 36, 45, 69, 99, 89, 4, 109, 84, 118, 101, 83, 62, 104, 26, 121, 105, 54, 49, 112, 113, 77, 29, 91, 96, 15, 56, 84, 108, 32, 9, 17, 106, 25, 72, 110};
            }

            private static byte[] ydcxsndydfveepa() {
                return new byte[]{-11, -123, 63, 83, 8, 14, 45, 92, 109, 98, 4, 71, 84, 91, 103, 123};
            }

            private static byte[] ybgogkovzxajopn() {
                return new byte[]{-14, -122, 56, 80, 11, 8, 45, 73, 104, 123};
            }

            private static byte[] ktchmtpcwhvywwb() {
                return new byte[]{-10, -125, 61, 91, 10, 2, 36, 74, 99, 123};
            }

            private static byte[] uexvtfzjgrpfzuy() {
                return new byte[]{-11, -119, 51, 93, 7, 3, 47, 74, 106, 112};
            }

            private static byte[] najkttxukeguayy() {
                return new byte[]{-4, -120, 59, 95, 10, 6, 46, 74, 109, 113};
            }

            private static byte[] cvhbtcmfzbsesjm() {
                return new byte[]{-10, -124, 63, 85, 7, 14, 43, 69, 104, 120};
            }

            private static byte[] gulnxytjqenceut() {
                return new byte[]{-11, -119, 50, 81, 9, 10, 47, 79, 104, 126};
            }

            private static byte[] dfkzqluvllpusnb() {
                return new byte[]{-11, -119, 59, 81, 9, 7, 36, 91, 111, 117, 4, 69};
            }

            private static int mraebgllbcftifjx(int i, int i2) {
                return i2 ^ i;
            }
        }
