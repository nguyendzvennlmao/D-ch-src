package com.kammoun.donutCore.api.utils.location;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.lib.PaperLib;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;

public final class SafeLocationFinder {
    private final Plugin plugin;
    private final int maxAttempts;
    private final Set<Material> blacklistedBlocks;
    private static int UUUxTLHZoG = 0;

    private transient int f144OWHmsAqma = 2050170601;
    private static String oywufsrdgt;
    private static String[] nothing_to_see_here = new String[18];

    public SafeLocationFinder(Plugin plugin, Plugin plugin2, int i, Set<Material> set) {
        lfbmqbenugrohymw(774164085 ^ 1751182369, 1121442003);
        int parseInt = 77553820 ^ (488724724 ^ Integer.parseInt("489538287"));
        this.f144OWHmsAqma = 2050170601 ^ UUUxTLHZoG;
        int lfbmqbenugrohymw = 1863204952 ^ lfbmqbenugrohymw(parseInt, 187548278);
        this.plugin = plugin;
        this.maxAttempts = plugin2;
        this.blacklistedBlocks = i;
        int i2 = 1499005202 ^ (1517156828 ^ (672678966 ^ lfbmqbenugrohymw));
    }

    public SafeLocationFinder(Plugin plugin, int i, int i2) {
        this(plugin, i, Set.of(), 1707731379);
        int i3 = 313986657 ^ (1750188293 ^ 1578240335);
        int parseInt = 2033041395 ^ (1089780535 ^ Integer.parseInt("489538287"));
        this.f144OWHmsAqma = 2050170601 ^ UUUxTLHZoG;
        int i4 = 1968128300 ^ (2095890338 ^ parseInt);
    }

    public CompletableFuture findAsync(World world, int i, int i2, int i3, int i4, int i5) {
        int i6 = 1326429456 ^ (2082789609 ^ 368329233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 922320705) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2019707672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1317229156 ^ i6)) {
                    int i7 = 702036555 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 922320705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (130534004 ^ i6)) {
                        break;
                    }
                }
            }
            int i8 = 1987603078 ^ i6;
            throw new IllegalAccessException();
        }
        int i9 = 1995065605 ^ i6;
        CompletableFuture completableFuture = new CompletableFuture();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -2119485590) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -2119485590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (960865792 ^ i9)) {
                    break;
                }
            }
            int i10 = 1988496409 ^ i9;
            throw new RuntimeException("double");
        }
        int i11 = 205227154 ^ i9;
        AtomicInteger atomicInteger = new AtomicInteger((byte) (1544479359 ^ i11));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -529067014) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -529067014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (303594861 ^ i11)) {
                    break;
                }
            }
            int i12 = 1321395675 ^ i11;
            throw new IllegalAccessException("double");
        }
        int i13 = 1940559683 ^ i11;
        tryNext(world, i, i2, i3, i4, completableFuture, atomicInteger, 2040918473);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2099489249) {
            int i14 = 1062716321 ^ i13;
            return completableFuture;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2099489249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (610991728 ^ i13)) {
                break;
            }
        }
        int i15 = 2039256427 ^ i13;
        throw new IOException("double");
    }

    private void tryNext(World world, int i, int i2, int i3, int i4, CompletableFuture completableFuture, AtomicInteger atomicInteger, int i5) {
        int i6;
        int i7 = 1478232550 ^ (339826028 ^ 368329233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -850856742) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -850856742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (905890271 ^ i7)) {
                    break;
                }
            }
            int i8 = 1546976859 ^ i7;
            throw new IOException("double");
        }
        int i9 = 1172673026 ^ i7;
        if (atomicInteger.getAndIncrement() < this.maxAttempts) {
            int i10 = 795410074 ^ i9;
            int random = i + ((int) (Math.random() * ((i2 - i) + ((byte) (858026498 ^ i10)))));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -1725722599) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1725722599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (349008623 ^ i10)) {
                        break;
                    }
                }
                int i11 = 570822211 ^ i10;
                throw new RuntimeException("double");
            }
            int i12 = 646737235 ^ i10;
            int random2 = i3 + ((int) (Math.random() * ((i4 - i3) + ((byte) (363339601 ^ i12)))));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != -1388250496) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1388250496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (2089139560 ^ i12)) {
                        break;
                    }
                }
                int i13 = 302989735 ^ i12;
                throw new RuntimeException("double");
            }
            i6 = 782237496 ^ i12;
            CompletableFuture<Void> thenAccept = PaperLib.getChunkAtAsync(world, random >> ((byte) (993517676 ^ i6)), random2 >> ((byte) (993517676 ^ i6)), (byte) (993517673 ^ i6), 1146275792).thenAccept(chunk -> {
                int i14 = 1289578069 ^ (683497728 ^ 368329233);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -1935414749) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1935414749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (898616221 ^ i14)) {
                            int i15 = 2105431312 ^ i14;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 330079536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (790125114 ^ i14)) {
                                break;
                            }
                        }
                    }
                    int i16 = 331227906 ^ i14;
                    throw new IOException();
                }
                int i17 = 1172871837 ^ i14;
                this.plugin.getServer().getRegionScheduler().execute(this.plugin, world, random >> ((byte) (880601053 ^ i17)), random2 >> ((byte) (880601053 ^ i17)), () -> {
                    int i18 = 2102938969 ^ (1945926414 ^ 368329233);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -628907472) {
                        i18 = 1564930626 ^ i18;
                        int findSafeY = findSafeY(world, random, random2, 1495578460);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 817115170) {
                            i18 = 1703995940 ^ i18;
                            if (findSafeY != ((byte) ((-596012065) ^ i18))) {
                                int i19 = 924495858 ^ i18;
                                completableFuture.complete(new Location(world, random + 0.5d, findSafeY, random2 + 0.5d));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -1528422768) {
                                    int i20 = 133181758 ^ i19;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -1528422768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1862597125 ^ i19)) {
                                        break;
                                    }
                                }
                                int i21 = 1049935862 ^ i19;
                                throw new IOException("double");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 473129217) {
                                int i22 = 1134807529 ^ i18;
                                SchedulerUtil.runAsync(() -> {
                                    int i23 = 1198252711 ^ (290618382 ^ 368329233);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == 510584258) {
                                        int i24 = 1058906926 ^ i23;
                                        tryNext(world, i, i2, i3, i4, completableFuture, atomicInteger, 2040918473);
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == 510584258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == (1559658708 ^ i23)) {
                                            int i25 = 1603549471 ^ i23;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == -427557709 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i23) == (1935852857 ^ i23)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i26 = 2102641157 ^ i23;
                                    throw new RuntimeException();
                                }, 1163669431);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 19738187) {
                                    int i23 = 521016593 ^ i22;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == 19738187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i22) == (1001853359 ^ i22)) {
                                        break;
                                    }
                                }
                                int i24 = 363458617 ^ i22;
                                throw new IOException("double");
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -111311165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1715933771 ^ i18)) {
                            int i25 = 1788856728 ^ i18;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -628907472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (773208688 ^ i18)) {
                                int i26 = 808826788 ^ i18;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 817115170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1257062500 ^ i18)) {
                                    int i27 = 1015131836 ^ i18;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 473129217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (776391187 ^ i18)) {
                                        int i28 = 1247610963 ^ i18;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -1687709856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (309111193 ^ i18)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i29 = 329530692 ^ i18;
                    throw new RuntimeException();
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1545126199) {
                    int i18 = 906589311 ^ i17;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1545126199 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (305701155 ^ i17)) {
                        break;
                    }
                }
                int i19 = 1511212781 ^ i17;
                throw new RuntimeException("double");
            });
            Function<Throwable, ? extends Void> function = th -> {
                int i14 = 1160837964 ^ (338353571 ^ 368329233);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != 661858290) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 661858290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1056820510 ^ i14)) {
                            int i15 = 1665667609 ^ i14;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1869046122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1755934058 ^ i14)) {
                                break;
                            }
                        }
                    }
                    int i16 = 47694640 ^ i14;
                    throw new IOException();
                }
                int i17 = 1366525429 ^ i14;
                SchedulerUtil.runAsync(() -> {
                    int i18 = 1333869138 ^ (500592926 ^ 368329233);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1025002218) {
                        int i19 = 806743637 ^ i18;
                        tryNext(world, i, i2, i3, i4, completableFuture, atomicInteger, 2040918473);
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -1112065981 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (972318441 ^ i18)) {
                            int i20 = 1240652429 ^ i18;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1025002218 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (388450114 ^ i18)) {
                                break;
                            }
                        }
                    }
                    int i21 = 973058817 ^ i18;
                    throw new IOException();
                }, 1163669431);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1393620904) {
                    int i18 = 1483803942 ^ i17;
                    return null;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1393620904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (375339880 ^ i17)) {
                        break;
                    }
                }
                int i19 = 1136809956 ^ i17;
                throw new RuntimeException("double");
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -641793215) {
                i6 = 2087977637 ^ i6;
                thenAccept.exceptionally(function);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 975115882) {
                    int i14 = 1110879008 ^ i6;
                    return;
                }
            }
        } else {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -496737080) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -496737080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1173186507 ^ i9)) {
                        break;
                    }
                }
                int i15 = 739432596 ^ i9;
                throw new IOException("double");
            }
            i6 = 961463517 ^ i9;
            completableFuture.complete(null);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 672285217) {
                int i16 = 327938037 ^ i6;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 672285217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (108397965 ^ i6)) {
                int i17 = 996138590 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 975115882 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (474946246 ^ i6)) {
                    int i18 = 1465775915 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1270006391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (261803771 ^ i6)) {
                        int i19 = 634622831 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -641793215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (952474722 ^ i6)) {
                            break;
                        }
                    }
                }
            }
        }
        int i20 = 1315807372 ^ i6;
        throw new RuntimeException();
    }

    private int findSafeY(org.bukkit.World r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.location.SafeLocationFinder.findSafeY(org.bukkit.World, int, int, int):int");
    }

    private int scanTopDown(World world, int i, int i2, int i3, int i4, int i5) {
        int i6 = 623025127 ^ (603133952 ^ 368329233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1725034576) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1725034576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (353118601 ^ i6)) {
                    int i7 = 1143858999 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -419070815 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (215244295 ^ i6)) {
                        break;
                    }
                }
            }
            int i8 = 719202478 ^ i6;
            throw new IllegalAccessException("double");
        }
        int i9 = 840506901 ^ i6;
        int i10 = i3;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 166133529) {
            int i11 = 315565973;
            while (true) {
                int i12 = i11 ^ i9;
                if (i10 < i4) {
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12)) {
                            case 78152343:
                                i12 = 252925922 ^ i12;
                                break;
                            case 148048819:
                                break;
                            case 766258077:
                            case 1522849633:
                            default:
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1767821038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (975284879 ^ i12)) {
                                        int i13 = 442383480 ^ i12;
                                        throw new IOException("double");
                                    }
                                }
                                break;
                        }
                    }
                    return (byte) ((-1021357973) ^ i12);
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1616919631) {
                    int i14 = 1137790843 ^ i12;
                    if (isSafe(world, i, i10, i2, 719825529) == (1881323277 ^ i14)) {
                        i9 = lfbmqbenugrohymw(i14, 1827368550);
                        i10 += (-482990444) ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -431043752) {
                            int i15 = 1740832547 ^ i9;
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i15) != 241557792) {
                                    throw null;
                                }
                                throw new RuntimeException();
                            } catch (RuntimeException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -1113062326:
                                        i9 = 1198248407 ^ i15;
                                        break;
                                    case -665243069:
                                        i9 = 1809184534 ^ i15;
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -2030662928) {
                                    i11 = 590162216;
                                }
                            }
                        }
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -2129282965) {
                            return i10 + ((byte) (1389635107 ^ (586584367 ^ i14)));
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -2129282965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1682172830 ^ i14)) {
                                int i16 = 1511100696 ^ i14;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1113062326 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1551042267 ^ i12)) {
                            int i17 = 1568287226 ^ i12;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1616919631 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (166778212 ^ i12)) {
                                int i18 = 570364699 ^ i12;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -665243069 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1046697660 ^ i9)) {
                int i19 = 819383986 ^ i9;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -2030662928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (758618183 ^ i9)) {
                    int i20 = 1793794330 ^ i9;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 166133529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1547232293 ^ i9)) {
                        int i21 = 188279096 ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -431043752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1257358152 ^ i9)) {
                            int i22 = 1972483627 ^ i9;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }

    private int scanBottomUp(World world, int i, int i2, int i3, int i4, int i5) {
        int i6 = 1079561043 ^ (1804783848 ^ 368329233);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -235745967) {
            i6 = 643286254 ^ i6;
            int i7 = i3;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1018369504) {
                i6 = 880452926 ^ i6;
                while (i7 <= i4) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1620689873) {
                        i6 = 1025523893 ^ i6;
                        if (isSafe(world, i, i7, i2, 719825529) != (288585935 ^ i6)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1986279816) {
                                return i7 + ((byte) (12519113 ^ (294419975 ^ i6)));
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1986279816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2007194697 ^ i6)) {
                                    int i8 = 2005074006 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1043824357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2046409150 ^ i6)) {
                                        int i9 = 262929930 ^ i6;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                case 22260514:
                                    i6 = 936358205 ^ i6;
                                    break;
                                case 554741476:
                                case 1069223202:
                                    break;
                            }
                        }
                        i7 += 654100979 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 937840529) {
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                case 193585592:
                                    i6 = 2087111611 ^ i6;
                                    break;
                                case 574711937:
                                    break;
                                case 2052599209:
                            }
                        }
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) != 260718327) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        } catch (IllegalAccessException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1043824357:
                                    i6 = 1399671174 ^ i6;
                                    break;
                                case -724561334:
                                    i6 = lfbmqbenugrohymw(i6, 1909349356);
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1520618793) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -942972253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (125310491 ^ i6)) {
                                        int i10 = 1484298610 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1520618793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (321061090 ^ i6)) {
                                            int i11 = 822870186 ^ i6;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                    case 66275067:
                                        i6 = 122118623 ^ i6;
                                        break;
                                    case 690907390:
                                        break;
                                    case 1694315469:
                                }
                            }
                        }
                    }
                }
                return (byte) ((-2029612117) ^ (1424643118 ^ i6));
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1018369504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (885861178 ^ i6)) {
                    int i12 = 1197462524 ^ i6;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 937840529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (904391109 ^ i6)) {
                int i13 = 284803096 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1620689873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1042838418 ^ i6)) {
                    int i14 = 415452516 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 100152896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1035499017 ^ i6)) {
                        int i15 = 671925798 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -235745967 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1949753385 ^ i6)) {
                            int i16 = 855836848 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -724561334 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1407798224 ^ i6)) {
                                int i17 = 1874238879 ^ i6;
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean isSafe(org.bukkit.World r6, int r7, int r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.location.SafeLocationFinder.isSafe(org.bukkit.World, int, int, int, int):boolean");
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
        oywufsrdgt = ByteBuffer.wrap(dmmnwyzwfkcxmkh()).asCharBuffer().toString();
        UUUxTLHZoG = 608635392 ^ new Random(1395639940323834056L).nextInt();
    }

    public static String okuiashsgf(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = oywufsrdgt.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] bmqlojboenrnqtp() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 0};
    }

    private static byte[] gapdzprzspasniz() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 4};
    }

    private static byte[] nogqlxfdfrgnsww() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 8};
    }

    private static byte[] pzkdvticnnoytql() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 13};
    }

    private static byte[] wewulmndzzvatcg() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 17};
    }

    private static byte[] docagndpqrmzzil() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 21};
    }

    private static byte[] wjaglbuzaxmiuwp() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 25};
    }

    private static byte[] dmmnwyzwfkcxmkh() {
        return new byte[]{52, 122, 54, 121, 51, 97, 49, 121, 49, 124, 57, 117, 52, 100, 56, 116, 55, 116, 57, 112, 48, 116, 50, 116, 56, 118, 50, 118, 51, 120, 49, 96, 56, 118, 53, Byte.MAX_VALUE, 52, 113, 55, 98, 56, 119, 49, 116, 55, 112, 48, 102, 53, 124, 52, Byte.MAX_VALUE, 53, 117, 53, 96, 48, 115};
    }

    private static int lfbmqbenugrohymw(int i, int i2) {
        return i ^ i2;
    }
}
