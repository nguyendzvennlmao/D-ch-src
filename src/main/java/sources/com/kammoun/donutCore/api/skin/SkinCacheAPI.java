package com.kammoun.donutCore.api.skin;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SkinCacheAPI {
    private static SkinCacheAPI instance;
    private final SkinService service;
    private static int xxuvlJiWOr = 0;

    private transient int f735vgL77fni = 1626662297;
    private static String[] nothing_to_see_here = new String[19];

    private SkinCacheAPI(@NotNull SkinService skinService, int i) {
        int i2 = 1570228443 ^ (1821140723 ^ 969569436);
        int parseInt = 756259025 ^ (986096322 ^ Integer.parseInt("520413351"));
        this.f735vgL77fni = 1626662297 ^ xxuvlJiWOr;
        this.service = skinService;
        int i3 = 975690936 ^ (1569838406 ^ (2121906134 ^ parseInt));
    }

    public static SkinCacheAPI getInstance(int i) {
        int i2 = 1771607849 ^ (836132937 ^ (211984354 ^ 519338540));
        if (instance != null) {
            gjwehcfdcnqfhedw(i2, 1422602200);
            return instance;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1354798450) {
            throw new IllegalStateException(nrvqhtbcyt(omrfuxddvcqabaq(), wmfrndjrnvigvqb(), 657085098 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -157684816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1816103110 ^ i2)) {
                int i3 = 1673623837 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1354798450 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1884489709 ^ i2)) {
                    int i4 = 963454504 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1771175971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (899332589 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i5 = 202978232 ^ i2;
        throw new IllegalAccessException();
    }

    public static CompletableFuture init(@NotNull Plugin plugin, int i) {
        int i2 = 1111736972 ^ (148356224 ^ 519338540);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1560272638) {
            i2 = 606087280 ^ i2;
            if (instance == null) {
                int i3 = 835664577 ^ i2;
                SkinService skinService = new SkinService(plugin, 1342108230);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 209237130) {
                    int i4 = 262419564 ^ i3;
                    return skinService.initialize(1252133734).thenApply(r5 -> {
                        int i5 = 775426049 ^ (1333281955 ^ 519338540);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -39750541) {
                            i5 = 923159798 ^ i5;
                            instance = new SkinCacheAPI(skinService, 2120807887);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1167266754) {
                                int i6 = 37835967 ^ i5;
                                return instance;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1469691450 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (891987367 ^ i5)) {
                                int i7 = 1228042020 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1167266754 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (65200687 ^ i5)) {
                                    int i8 = 384359799 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -39750541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1608595356 ^ i5)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i9 = 466689993 ^ i5;
                        throw new RuntimeException();
                    });
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 209237130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1593529854 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1708837713 ^ i3;
                throw new RuntimeException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2113838461) {
                int i6 = 411823765 ^ i2;
                return CompletableFuture.completedFuture(instance);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2113838461 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (95892447 ^ i2)) {
                int i7 = 1752299976 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1560272638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1869159114 ^ i2)) {
                    int i8 = 2139911023 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1901664234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (839360161 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i9 = 948446763 ^ i2;
        throw new IllegalAccessException();
    }

    public static boolean isInitialized(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.skin.SkinCacheAPI.isInitialized(int):boolean");
    }

    public void getSkin(@NotNull UUID uuid, @NotNull Consumer consumer, int i) {
        int i2 = 1351508614 ^ (1737049413 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1212007346) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1212007346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1949809334 ^ i2)) {
                    break;
                }
            }
            int i3 = 1164740638 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1524694472 ^ i2;
        this.service.getSkin(uuid, consumer, 344964146);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1623577104) {
            int i5 = 687536602 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1623577104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (838541484 ^ i4)) {
                int i6 = 1909506054 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -655498463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (841959926 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 40031322 ^ i4;
        throw new IOException();
    }

    public void getSkin(@NotNull Player player, @NotNull Consumer<SkinData> consumer) {
        int i = 2004021203 ^ (1001490327 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1776304247) {
            i = 1739145045 ^ i;
            this.service.getSkin(player.getUniqueId(), consumer, 344964146);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1420409566) {
                int i2 = 1946551633 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 191262633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1335368991 ^ i)) {
                int i3 = 1071584130 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1776304247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1273644263 ^ i)) {
                    int i4 = 1158201037 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1420409566 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (224150172 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1673188491 ^ i;
        throw new IllegalAccessException();
    }

    public CompletableFuture getSkin(@NotNull UUID uuid, int i) {
        int i2 = 300486198 ^ (1706079747 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1388919808) {
            int i3 = 1323621885 ^ i2;
            return this.service.getSkin(uuid, 1634044407);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 636474346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (511605319 ^ i2)) {
                int i4 = 853718826 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1388919808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (892142603 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1640470581 ^ i2;
        throw new RuntimeException();
    }

    public CompletableFuture<SkinData> getSkin(@NotNull Player player) {
        int i = 1689828247 ^ (1583643626 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 652410434) {
            int i2 = 1265469210 ^ i;
            return this.service.getSkin(player.getUniqueId(), 1634044407);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2106508944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (107180246 ^ i)) {
                int i3 = 1695712707 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 652410434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1759612427 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1825579149 ^ i;
        throw new IOException();
    }

    public void getPlayerHeadTexture(@NotNull UUID uuid, @NotNull Consumer<String> consumer) {
        int i = 775354986 ^ (1034674803 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1827421539) {
            i = 2001045353 ^ i;
            this.service.getPlayerHeadTexture(uuid, consumer, 990495169);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -692058584) {
                int i2 = 831695067 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1515536625 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (786582177 ^ i)) {
                int i3 = 1999799360 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -692058584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1901365413 ^ i)) {
                    int i4 = 43559194 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1827421539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (227702422 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1471808885 ^ i;
        throw new RuntimeException();
    }

    public void getPlayerHeadTexture(@NotNull Player player, @NotNull Consumer<String> consumer) {
        int i = 1147243060 ^ (1904415015 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1594893618) {
            i = 1754432888 ^ i;
            this.service.getPlayerHeadTexture(player.getUniqueId(), consumer, 990495169);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 461639409) {
                int i2 = 2133307248 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 461639409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1662453550 ^ i)) {
                int i3 = 746501418 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1594893618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (508304650 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 562086410 ^ i;
        throw new IOException();
    }

    public CompletableFuture<String> getPlayerHeadTexture(@NotNull UUID uuid) {
        int i = 176891222 ^ (300436221 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 723484915) {
            int i2 = 1598140247 ^ i;
            return this.service.getPlayerHeadTexture(uuid, 1794132302);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 723484915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (350808930 ^ i)) {
                int i3 = 1760463350 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -787285431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (921322631 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1107171869 ^ i;
        throw new IllegalAccessException();
    }

    public CompletableFuture<String> getPlayerHeadTexture(@NotNull Player player) {
        int i = 897541055 ^ (1915394733 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -894749383) {
            int i2 = 357209677 ^ i;
            return this.service.getPlayerHeadTexture(player.getUniqueId(), 1794132302);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -894749383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (992026940 ^ i)) {
                int i3 = 1478905608 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1627359057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (460539338 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 273338004 ^ i;
        throw new RuntimeException();
    }

    @Nullable
    public String getTextureUrl(@NotNull UUID uuid) {
        int i = 1270713564 ^ (987439995 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2066841744) {
            int i2 = 575245403 ^ i;
            return this.service.getTextureUrl(uuid, 1089724340);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2066841744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (336835251 ^ i)) {
                int i3 = 529540683 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1769857609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1209706540 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1960705614 ^ i;
        throw new IOException();
    }

    @Nullable
    public String getTextureUrl(@NotNull Player player) {
        int i = 1131620241 ^ (509245032 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 424571489) {
            int i2 = 1043688207 ^ i;
            return this.service.getTextureUrl(player.getUniqueId(), 1089724340);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 424571489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1055831048 ^ i)) {
                int i3 = 1718143123 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -387634664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1029294482 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1905660818 ^ i;
        throw new IOException();
    }

    public CompletableFuture<String> getTextureUrlAsync(@NotNull UUID uuid) {
        int i = 1808087838 ^ (1145211747 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1942389182) {
            int i2 = 1910202096 ^ i;
            return this.service.getTextureUrlAsync(uuid, 1135980256);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1942389182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (447012443 ^ i)) {
                int i3 = 1128612677 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 48466369 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1272163709 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1332029706 ^ i;
        throw new IOException();
    }

    public CompletableFuture<String> getTextureUrlAsync(@NotNull Player player) {
        int i = 491592361 ^ (1273688605 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1161541641) {
            int i2 = 608188779 ^ i;
            return this.service.getTextureUrlAsync(player.getUniqueId(), 1135980256);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1731883856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (414367178 ^ i)) {
                int i3 = 1868447056 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1161541641 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1626525004 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 546516357 ^ i;
        throw new IOException();
    }

    public void cacheOnlinePlayer(@NotNull Player player) {
        int i = 273191040 ^ (1085453513 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 2010505185) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2010505185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (298239556 ^ i)) {
                    break;
                }
            }
            int i2 = 1157936564 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 587363124 ^ i;
        this.service.cacheOnlinePlayer(player, 1356271962);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1875265088) {
            int i4 = 669851144 ^ i3;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1353627137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (312541652 ^ i3)) {
                int i5 = 1044568681 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1875265088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (520841628 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 657670176 ^ i3;
        throw new RuntimeException();
    }

    public void preload(@NotNull UUID uuid) {
        int i = 484948123 ^ (665248211 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 705574890) {
            i = 1043973421 ^ i;
            this.service.preloadFromStorage(uuid, 1952204191);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -608166269) {
                int i2 = 143574695 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1615451205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2022891887 ^ i)) {
                int i3 = 1567487011 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -608166269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (391261657 ^ i)) {
                    int i4 = 1333595569 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 705574890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (82005472 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 137977366 ^ i;
        throw new RuntimeException();
    }

    public void invalidate(@NotNull UUID uuid) {
        int i = 1390394643 ^ (677773706 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 633936224) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 633936224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1327684962 ^ i)) {
                    int i2 = 1128294999 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -488937007 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2005739389 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 1223156933 ^ i;
            throw new IllegalAccessException();
        }
        int i4 = 1181373145 ^ i;
        this.service.invalidate(uuid, 359162513);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 379293610) {
            int i5 = 2122849487 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 379293610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1074874340 ^ i4)) {
                break;
            }
        }
        int i6 = 1759253772 ^ i4;
        throw new IOException("double");
    }

    public void invalidate(@NotNull Player player) {
        int i = 1420341092 ^ (214432686 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 863919097) {
            i = 2119645310 ^ i;
            this.service.invalidate(player.getUniqueId(), 359162513);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1043884022) {
                int i2 = 1080352710 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1025415624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (552333836 ^ i)) {
                int i3 = 1346154457 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 863919097 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (996667584 ^ i)) {
                    int i4 = 1879501957 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1043884022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (698952763 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 775095454 ^ i;
        throw new IOException();
    }

    public int getCacheSize() {
        int i = 417089414 ^ (713822535 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1652968354) {
            int i2 = 602196635 ^ i;
            return this.service.getCacheSize(217225675);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1652968354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (734767953 ^ i)) {
                int i3 = 56201968 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2107645819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (935539775 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1265625591 ^ i;
        throw new RuntimeException();
    }

    SkinService getService() {
        int i = 269837482 ^ (1724786611 ^ 2113970101);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1189012832) {
            int i2 = 129477188 ^ i;
            return this.service;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1189012832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (558007741 ^ i)) {
                int i3 = 1611814060 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2070132544 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1055380825 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1865395791 ^ i;
        throw new RuntimeException();
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
        xxuvlJiWOr = (-767313488) ^ new Random(1709718060737438145L).nextInt();
    }

    public static String nrvqhtbcyt(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] wmfrndjrnvigvqb() {
        return new byte[]{34, 67, 50, 21, 96, 40, 84, 56, 113, 43, 68, 126, 46, 61, 86, 111, 64, 28, 17, 74, 102, 67, 11, 125, 90, 110, 122, 57, 92, 10, 93, 5, 62, 104, 76, 61, 111, 74, 44, 106, 74, 27, 109, 97, 125, 116, 4, 73, 105, 116, 41, 40, 12, 19, 110, 12, 75, 26, 26};
    }

    private static byte[] omrfuxddvcqabaq() {
        return new byte[]{-19, -124, 1, 116, 80, 115, 109, 102, 66, 119, 117, 5, 29, 110, 102, 60, 121, 67, 34, 29, 87, 58, 56, 31, 106, 23, 67, 46, 111, 80, 108, 92, 13, 41, 124, 45, 86, 19, 31, 55, 123, 87, 94, 115, 77, 38, 61, 27, 90, 35, 24, 126, 63, 1, 94, 85, 114, 67, 41, 121, 114, 126, 38, 59, 24, 5, 1, 42, 24, 31, 79, 108, 14, 1, 95, 20, 37, 8, 121, 116, 114, 112, 78, 9, 94, 38, 0, 7, 57, 79, 52, 85, 91, 21, 13, 54, 115, 117, 89, 59, 42, 52, 82, 44, 68, 92, 112, 59, 71, 90, 25, 100, 32, 21, 60, 85, 35, 68, 17, 31, 3, 68, 83, 110, 100, 32, 72, 108, 119, 32, 31, 112, 101, 58, 112, 69, 40, 19, 85, 88, 58, 101, 105, 58, 74, 96, 101, 79, 110, 68, 15, 36, Byte.MAX_VALUE, 33};
    }

    private static int gjwehcfdcnqfhedw(int i, int i2) {
        return i ^ i2;
    }
}
