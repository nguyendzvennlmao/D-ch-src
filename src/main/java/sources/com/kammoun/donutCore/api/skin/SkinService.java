package com.kammoun.donutCore.api.skin;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Logger;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SkinService {
    private final Plugin plugin;
    private final SkinCache cache;
    private final SkinStorage storage;
    private final Map<UUID, CompletableFuture<SkinData>> pendingFetches;
    private static int yUzvZmr5iH = 0;
    private transient int KWS0IuyRSi = 12347;
    private static String[] nothing_to_see_here = new String[17];

    public SkinService(@NotNull Plugin plugin, int i) {
        int i2 = 5333151 ^ 455313304;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 86934767:
                    int i3 = 984749819 ^ i2;
                    break;
                case 703574379:
                case 1571282436:
                    break;
                case 1689179776:
                default:
                    throw new IOException();
            }
        }
        int parseInt = 902415764 ^ (1219920136 ^ Integer.parseInt("1556067680"));
        this.KWS0IuyRSi = 12347 ^ yUzvZmr5iH;
        this.plugin = plugin;
        this.cache = new ConcurrentSkinCache();
        this.storage = new SQLiteSkinStorage(plugin.getDataFolder(), plugin.getLogger(), 935655647);
        this.pendingFetches = new ConcurrentHashMap();
        int i4 = 1880281439 ^ (2014948660 ^ (1517795209 ^ (139581923 ^ (1789044021 ^ (242964362 ^ parseInt)))));
    }

    public CompletableFuture initialize(int i) {
        int i2 = 1832840869 ^ (1481676136 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2119916354) {
            int i3 = 2022392801 ^ i2;
            return this.storage.initialize(1538837833);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2119916354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2011715154 ^ i2)) {
                int i4 = 793877770 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1174322103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1391805263 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 34373477 ^ i2;
        throw new RuntimeException();
    }

    public void getSkin(@NotNull UUID uuid, @NotNull Consumer consumer, int i) {
        int i2 = 1422508528 ^ (312294613 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -410031103) {
            int i3 = 560190690 ^ i2;
            SkinData skinData = this.cache.get(uuid, 783769656);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -325989616) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -325989616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (857983687 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1959352114 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 1443434739 ^ i3;
            if (skinData != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1557744778) {
                    i2 = 659157039 ^ i2;
                    if (skinData.isDefault(202556199) != (1825757630 ^ i2)) {
                        i2 = 194418931 ^ i2;
                        fetchSkinAsync(uuid, 1351025785).thenAccept(consumer);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 975309419) {
                            int i5 = 1944079317 ^ i2;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 975309419 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1147978341 ^ i2)) {
                                int i6 = 1273584248 ^ i2;
                                throw new RuntimeException("double");
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1721159155) {
                        i2 = 946179069 ^ i2;
                        consumer.accept(skinData);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1514499558) {
                            int i7 = 1467880173 ^ i2;
                            return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1514499558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1714509316 ^ i2)) {
                        int i8 = 1391687063 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1557744778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (387394822 ^ i2)) {
                            break;
                        }
                    }
                }
                int i9 = 1994254975 ^ i2;
                throw new IllegalAccessException("double");
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 41741075:
                        i2 = 752838876 ^ i2;
                        break;
                    case 969863782:
                    case 1989950596:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1524607808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1346856508 ^ i2)) {
                int i10 = 1169558729 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 508167536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (38570517 ^ i2)) {
                    int i11 = 631023738 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -410031103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (238810369 ^ i2)) {
                        int i12 = 1938187563 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1721159155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (310791301 ^ i2)) {
                            int i13 = 39467204 ^ i2;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    public java.util.concurrent.CompletableFuture getSkin(@org.jetbrains.annotations.NotNull java.util.UUID r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SkinService.getSkin(java.util.UUID, int):java.util.concurrent.CompletableFuture");
    }

    public void getPlayerHeadTexture(@NotNull UUID uuid, @NotNull Consumer consumer, int i) {
        int i2 = 881018771 ^ (1482106910 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1282672320) {
            i2 = 1451808773 ^ i2;
            getSkin(uuid, skinData -> {
                int i3 = 1545272483 ^ (454185130 ^ 2057642142);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -311663431) {
                    int i4 = 1696726277 ^ i3;
                    consumer.accept(skinData.textureValue());
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -311663431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1308035061 ^ i3)) {
                        int i5 = 1382048518 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1000108910 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1933340610 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 575608226 ^ i3;
                throw new IllegalAccessException();
            }, 344964146);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 130890090) {
                int i3 = 657784885 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 130890090 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (261254867 ^ i2)) {
                int i4 = 1812937276 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1046821059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1495885115 ^ i2)) {
                    int i5 = 1976686873 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1282672320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2026510360 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2054684044 ^ i2;
        throw new RuntimeException();
    }

    public CompletableFuture getPlayerHeadTexture(@NotNull UUID uuid, int i) {
        int i2 = 1437849296 ^ (1688021143 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1549760274) {
            int i3 = 1307620913 ^ i2;
            return getSkin(uuid, 1634044407).thenApply((v0) -> {
                return v0.textureValue();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 869975704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (685697944 ^ i2)) {
                int i4 = 738346431 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1549760274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (763768067 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1237292838 ^ i2;
        throw new RuntimeException();
    }

    @Nullable
    public String getTextureUrl(@NotNull UUID uuid, int i) {
        int i2 = 1918910806 ^ (667734377 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 2018247889) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2018247889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1487843893 ^ i2)) {
                    break;
                }
            }
            int i3 = 1979055463 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 806962745 ^ i2;
        SkinData skinData = this.cache.get(uuid, 783769656);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -125422312) {
            i4 = 346296430 ^ i4;
            if (skinData != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1571206760) {
                    int i5 = 1618507679 ^ i4;
                    return skinData.getTextureUrl();
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                    case 112094105:
                        int i6 = 312653336 ^ i4;
                        break;
                    case 1561910926:
                        break;
                    case 1620870033:
                }
            }
            return null;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1571206760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1641376839 ^ i4)) {
                int i7 = 706851644 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -125422312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1137770346 ^ i4)) {
                    int i8 = 2086426033 ^ i4;
                    throw new IllegalAccessException();
                }
            }
        }
    }

    public CompletableFuture getTextureUrlAsync(@NotNull UUID uuid, int i) {
        int i2 = 942929611 ^ (1087153558 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 315760576) {
            int i3 = 1543600068 ^ i2;
            return getSkin(uuid, 1634044407).thenApply((v0) -> {
                return v0.getTextureUrl();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 315760576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (259303077 ^ i2)) {
                int i4 = 263584988 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -220618270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1647874380 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 119262668 ^ i2;
        throw new RuntimeException();
    }

    public void cacheOnlinePlayer(@NotNull Player player, int i) {
        int i2 = 993547075 ^ (1870421345 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1997075513) {
            i2 = 1187112199 ^ i2;
            SchedulerUtil.runAsync(() -> {
                int i3 = 159303211 ^ (1931755518 ^ 2057638053);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 134171520) {
                    i3 = 1934125586 ^ i3;
                    String extractTextureFromPlayerProfile = extractTextureFromPlayerProfile(player, 878593065);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1648616685) {
                        i3 = 110385996 ^ i3;
                        if (extractTextureFromPlayerProfile != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1457602189) {
                                i3 = 699386322 ^ i3;
                                String signaturePaper = MojangUtils.getSignaturePaper(player, 455739825);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -463433758) {
                                    i3 = 1158209033 ^ i3;
                                    SkinData of = SkinData.of(player.getUniqueId(), extractTextureFromPlayerProfile, signaturePaper, 517111308);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -869892184) {
                                        i3 = 1789008226 ^ i3;
                                        this.cache.put(of);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1724468037) {
                                            i3 = 773304879 ^ i3;
                                            this.storage.save(of, 1858485300);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -376756798) {
                                                int i4 = 1290492326 ^ i3;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                case 49612794:
                                    int i5 = 1694098736 ^ i3;
                                    return;
                                case 214939733:
                                case 1595124892:
                                    return;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1648616685 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (305535635 ^ i3)) {
                            int i6 = 933117088 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1457602189 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1800602479 ^ i3)) {
                                int i7 = 229058529 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -376756798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2016409962 ^ i3)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i8 = 920295876 ^ i3;
                    throw new IOException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -463433758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1490095569 ^ i3)) {
                        int i9 = 1764339821 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1898845968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (240789222 ^ i3)) {
                            int i10 = 259274067 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -869892184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (220789130 ^ i3)) {
                                int i11 = 1732219528 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 134171520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (656280856 ^ i3)) {
                                    int i12 = 1696459169 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1724468037 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1839133362 ^ i3)) {
                                        int i13 = 906516963 ^ i3;
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                    }
                }
            }, 1163669431);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1091034115) {
                int i3 = 142437564 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1091034115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1025602514 ^ i2)) {
                int i4 = 20604407 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1997075513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1584691775 ^ i2)) {
                    int i5 = 296251609 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 49068515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1295198134 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 227260018 ^ i2;
        throw new IOException();
    }

    public void preloadFromStorage(@NotNull UUID uuid, int i) {
        int i2 = 1591998331 ^ (824299715 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1422280472) {
            i2 = 70884149 ^ i2;
            this.storage.load(uuid, 1219033093).thenAccept(optional -> {
                int i3 = 790493545 ^ (156855367 ^ 2057638053);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -418632614) {
                    int i4 = 1391177077 ^ i3;
                    SkinCache skinCache = this.cache;
                    Objects.requireNonNull(skinCache);
                    optional.ifPresent(skinCache::put);
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1884375024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1248271171 ^ i3)) {
                        int i5 = 42751173 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -418632614 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2002218392 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 2122460184 ^ i3;
                throw new RuntimeException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1963630272) {
                int i3 = 957506002 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1422280472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1455999201 ^ i2)) {
                int i4 = 2096311078 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1114009553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1831899388 ^ i2)) {
                    int i5 = 1342755414 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1963630272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1260150119 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 35122957 ^ i2;
        throw new IllegalAccessException();
    }

    public void invalidate(@NotNull UUID uuid, int i) {
        int i2 = 985844906 ^ (681824496 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1176528891) {
            i2 = 1076745886 ^ i2;
            this.cache.invalidate(uuid, 1327502718);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1196348169) {
                int i3 = 1446094075 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1176528891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (906340383 ^ i2)) {
                int i4 = 1695793442 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -154929965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1417921455 ^ i2)) {
                    int i5 = 219146134 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1196348169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (511822672 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 742848879 ^ i2;
        throw new IllegalAccessException();
    }

    public int getCacheSize(int i) {
        int i2 = 5405813 ^ (721753866 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1886134574) {
            int i3 = 865487552 ^ i2;
            return this.cache.size(730557599);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 320964819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1968350603 ^ i2)) {
                int i4 = 162112240 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1886134574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (730395302 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 7969808 ^ i2;
        throw new IOException();
    }

    public CompletableFuture<Void> shutdown() {
        int i = 1839514070 ^ (536888020 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1207132871) {
            i = 1694438618 ^ i;
            this.cache.clear(1747337627);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1611383830) {
                i = 1569767288 ^ i;
                this.pendingFetches.clear();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1936834600) {
                    int i2 = 2080857794 ^ i;
                    return this.storage.shutdown(963954779);
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1611383830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1061366466 ^ i)) {
                int i3 = 250755455 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1936834600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (445894760 ^ i)) {
                    int i4 = 1953022999 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1207132871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2133850067 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 277244282 ^ i;
        throw new IOException();
    }

    private CompletableFuture fetchSkinAsync(@NotNull UUID uuid, int i) {
        int i2 = 7687045 ^ (572716813 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -946511510) {
            int i3 = 1508174974 ^ i2;
            return this.pendingFetches.computeIfAbsent(uuid, this::doFetch);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -946511510 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (200424028 ^ i2)) {
                int i4 = 1641738641 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 145883800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1158295028 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 59854648 ^ i2;
        throw new RuntimeException();
    }

    private java.util.concurrent.CompletableFuture<com.kammoun.donutCore.api.skin.SkinData> doFetch(@org.jetbrains.annotations.NotNull java.util.UUID r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SkinService.doFetch(java.util.UUID):java.util.concurrent.CompletableFuture");
    }

    private CompletableFuture fetchFromOnlinePlayer(@NotNull Player player, int i) {
        int i2 = 1488736086 ^ (1471829578 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1390916149) {
            i2 = 1116509207 ^ i2;
            CompletableFuture supplyAsync = CompletableFuture.supplyAsync(() -> {
                int i3 = 558754903 ^ (1894705277 ^ 2057638053);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1479582841) {
                    i3 = 1732687124 ^ i3;
                    String extractTextureFromPlayerProfile = extractTextureFromPlayerProfile(player, 878593065);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1644498138) {
                        i3 = 1778694033 ^ i3;
                        if (extractTextureFromPlayerProfile != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 841003089) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 841003089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1895977483 ^ i3)) {
                                        break;
                                    }
                                }
                                int i4 = 455971855 ^ i3;
                                throw new RuntimeException("double");
                            }
                            i3 = 635948925 ^ i3;
                            String signaturePaper = MojangUtils.getSignaturePaper(player, 455739825);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 488557496) {
                                int i5 = 1124558506 ^ i3;
                                SkinData of = SkinData.of(player.getUniqueId(), extractTextureFromPlayerProfile, signaturePaper, 517111308);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 86376170) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 86376170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1535848403 ^ i5)) {
                                            int i6 = 55173098 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1803735760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1341632749 ^ i5)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i7 = 415502006 ^ i5;
                                    throw new RuntimeException("double");
                                }
                                int i8 = 1378563207 ^ i5;
                                this.cache.put(of);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1803789616) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1803789616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (366546501 ^ i8)) {
                                            break;
                                        }
                                    }
                                    int i9 = 1794189393 ^ i8;
                                    throw new IllegalAccessException("double");
                                }
                                i3 = 1386313653 ^ i8;
                                this.storage.save(of, 1858485300);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 24635258) {
                                    i3 = 19786293 ^ i3;
                                    this.pendingFetches.remove(player.getUniqueId());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 135837394) {
                                        int i10 = 1282624640 ^ i3;
                                        return of;
                                    }
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                case 164690926:
                                    break;
                                case 170118391:
                                    int i11 = 316368526 ^ i3;
                                    break;
                                case 528096017:
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1644498138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (710092983 ^ i3)) {
                        int i12 = 1082998199 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1527020511 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2017814645 ^ i3)) {
                            int i13 = 2115264911 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 135837394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (171038669 ^ i3)) {
                                int i14 = 1893293962 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 24635258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1682690110 ^ i3)) {
                                    int i15 = 1824801444 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1479582841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1242977107 ^ i3)) {
                                        int i16 = 106475674 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 488557496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (264175519 ^ i3)) {
                                            int i17 = 293309557 ^ i3;
                                            throw new IOException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });
            BiConsumer biConsumer = (skinData, th) -> {
                int i3 = 401411753 ^ (1708294024 ^ 2057638053);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1154681888) {
                    int i4 = 34671171 ^ i3;
                    this.pendingFetches.remove(player.getUniqueId());
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1154681888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1578032231 ^ i3)) {
                        int i5 = 728699898 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1415274040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (342524888 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 482016874 ^ i3;
                throw new IOException();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1182995087) {
                i2 = 1151267892 ^ i2;
                CompletableFuture whenComplete = supplyAsync.whenComplete(biConsumer);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1651815213) {
                    int i3 = 1816274492 ^ i2;
                    return whenComplete;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -6652624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (804363689 ^ i2)) {
                int i4 = 1905394128 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1390916149 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (121956488 ^ i2)) {
                    int i5 = 480688247 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1651815213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1140442593 ^ i2)) {
                        int i6 = 159408469 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1182995087 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (52995550 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1835186740 ^ i2;
        throw new RuntimeException();
    }

    private CompletableFuture fetchFromStorageOrDefault(@NotNull UUID uuid, int i) {
        int i2 = 661591497 ^ (560930643 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -450309637) {
            int i3 = 1795337977 ^ i2;
            CompletableFuture load = this.storage.load(uuid, 1219033093);
            Function function = optional -> {
                int i4 = 118061918 ^ (1331767980 ^ 2057638053);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1771435335) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1771435335 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (865713494 ^ i4)) {
                            int i5 = 82544526 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1466232630 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1473648740 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i6 = 1164919522 ^ i4;
                    throw new IOException("double");
                }
                int i7 = 1394956333 ^ i4;
                if (optional.isPresent() == (1642600826 ^ i7)) {
                    int i8 = 369209790 ^ i7;
                    return SkinData.createDefault(uuid, 594877991);
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 255904723) {
                    i7 = 101888327 ^ i7;
                    SkinData skinData = (SkinData) optional.get();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1070940651) {
                        i7 = 642424284 ^ i7;
                        this.cache.put(skinData);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 226602762) {
                            int i9 = 346249208 ^ i7;
                            return skinData;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1070940651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (252986325 ^ i7)) {
                        int i10 = 1970193402 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1085454813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2030116883 ^ i7)) {
                            int i11 = 2105276213 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 255904723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1663854368 ^ i7)) {
                                int i12 = 929800793 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 226602762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (976299447 ^ i7)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i13 = 1012682607 ^ i7;
                throw new RuntimeException();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1120033232) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1120033232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1346944406 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1014239403 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 656525547 ^ i3;
            CompletableFuture thenApply = load.thenApply(function);
            BiConsumer biConsumer = (skinData, th) -> {
                int i5 = 213161406 ^ (849499073 ^ 2057638053);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 631158482) {
                    int i6 = 410597377 ^ i5;
                    this.pendingFetches.remove(uuid);
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 631158482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (394937187 ^ i5)) {
                        int i7 = 1622474337 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -430475558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1808781335 ^ i5)) {
                            break;
                        }
                    }
                }
                int i8 = 457304090 ^ i5;
                throw new RuntimeException();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2076974743) {
                i2 = 375111717 ^ i2;
                CompletableFuture whenComplete = thenApply.whenComplete(biConsumer);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 921559105) {
                    int i5 = 863014561 ^ i2;
                    return whenComplete;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 921559105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1694484363 ^ i2)) {
                int i6 = 1014190603 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -450309637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (168209203 ^ i2)) {
                    int i7 = 745191137 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2076974743 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1815804199 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 852586786 ^ i2;
        throw new RuntimeException();
    }

    @Nullable
    private String extractTextureFromPlayerProfile(@NotNull Player player, int i) {
        int i2 = 1215443900 ^ (1655991868 ^ 2057638053);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2095421142) {
            ?? r0 = 1807977339 ^ i2;
            i2 = r0;
            try {
                String skinBase64Paper = MojangUtils.getSkinBase64Paper(player, 442488052);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -586796303) {
                    i2 = 1036561711 ^ i2;
                    return skinBase64Paper;
                }
            } catch (Exception e) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                    case -586796303:
                        int i3 = 667353787 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -482466008) {
                            int i4 = 729110390 ^ i3;
                            int i5 = i4;
                            try {
                                String str = (String) MojangUtils.getSkinRawValue(player.getName(), 1110222693).join();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1198220135) {
                                    i5 = 987161402 ^ i5;
                                    return str;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -664506758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (448873180 ^ i5)) {
                                        int i6 = 2118073463 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1198220135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (805273360 ^ i5)) {
                                            int i7 = 1147854093 ^ i5;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                    case -1198220135:
                                        int kjjvywrcjqbuntck = kjjvywrcjqbuntck(i5, 989644979);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(kjjvywrcjqbuntck) == 1869797632) {
                                            int i8 = 1253163424 ^ kjjvywrcjqbuntck;
                                            Logger logger = this.plugin.getLogger();
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 989647874) {
                                                i2 = 688443400 ^ i8;
                                                String str2 = "Failed to extract texture from PlayerProfile for " + player.getName() + ": " + r0.getMessage();
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1924813891) {
                                                    int i9 = 719311606 ^ i2;
                                                    logger.warning(str2);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 608486386) {
                                                        int i10 = 528750001 ^ i9;
                                                        return null;
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 608486386 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (642694793 ^ i9)) {
                                                            int i11 = 545219708 ^ i9;
                                                            throw new RuntimeException("double");
                                                        }
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 989647874 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1145164157 ^ i8)) {
                                                        int i12 = 2119827813 ^ i8;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(kjjvywrcjqbuntck) == 1869797632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(kjjvywrcjqbuntck) == (150452314 ^ kjjvywrcjqbuntck)) {
                                                    int i13 = 485457626 ^ kjjvywrcjqbuntck;
                                                    throw new IllegalAccessException("double");
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        throw new IllegalAccessException("Error in hash");
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1847821640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1550636229 ^ i3)) {
                                    int i14 = 1542598564 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -482466008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1879466469 ^ i3)) {
                                        int i15 = 207503032 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 860052360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (874384471 ^ i3)) {
                                            int i16 = 2128127923 ^ i3;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        throw new RuntimeException("Error in hash");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2095421142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1647155814 ^ i2)) {
                int i17 = 437509866 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -586796303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2116547192 ^ i2)) {
                    int i18 = 836781719 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1924813891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1506819351 ^ i2)) {
                        int i19 = 2085897862 ^ i2;
                        throw new RuntimeException();
                    }
                }
            }
        }
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
        yUzvZmr5iH = 1991214070 ^ new Random(8528770813464868200L).nextInt();
    }

    public static String klsrraqivj(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] dolcnwhkrtvkywy() {
        return new byte[]{31, 116, 105, 58, 95, 107, 117, 70, 39, 19, 81, 75, 63, 53, 104, 41, 111, 53, 109, 13, 106, 87, 26, 94, 118, 84, 11, 54, 66, 7, 2, 121, 101, 61, 4, 7, 17, 37, 33, 101, 20, 79, 7, 46, 6, 11, 75, 49, 112, 42, 82, 66, 71, 112, 76, 94, 21, 68, 57, 51, 110, 17, 74, 34, 102};
    }

    private static int kjjvywrcjqbuntck(int i, int i2) {
        return i ^ i2;
    }
}
