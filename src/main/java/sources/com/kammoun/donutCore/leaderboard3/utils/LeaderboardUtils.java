package com.kammoun.donutCore.leaderboard3.utils;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.skin.PlayerHeadUtil;
import com.kammoun.donutCore.api.skin.SkinCacheAPI;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public final class LeaderboardUtils {
    private static int tCzRE5JFbJ = 0;

    private transient int f704C5We6CR1t = 174293172;
    private static byte[] cazaewfttt;
    private static String[] nothing_to_see_here = new String[13];

    private LeaderboardUtils() {
        hhoibsebwnonlozt(1774200967 ^ 1485185522, 564525632);
        int parseInt = 1051161398 ^ (1087099208 ^ Integer.parseInt("1854886219"));
        this.f704C5We6CR1t = 174293172 ^ tCzRE5JFbJ;
        int i = 1692878182 ^ parseInt;
    }

    public static FileConfiguration loadGui(LeaderBoardPlugin3 leaderBoardPlugin3, String str, int i) {
        int i2 = 72973812 ^ (967490779 ^ 1439694626);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1105326187) {
            i2 = 1161659536 ^ i2;
            File file = new File(leaderBoardPlugin3.getModuleDataFolder(493044696), "Gui/" + str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1745736937) {
                int i3 = 461661841 ^ i2;
                return YamlConfiguration.loadConfiguration(file);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1745736937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2090276644 ^ i2)) {
                int i4 = 1688679516 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1105326187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (865472204 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 786533183 ^ i2;
        throw new RuntimeException();
    }

    public static org.bukkit.inventory.ItemStack buildItem(org.bukkit.configuration.ConfigurationSection r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.utils.LeaderboardUtils.buildItem(org.bukkit.configuration.ConfigurationSection):org.bukkit.inventory.ItemStack");
    }

    public static void applyMeta(ItemStack itemStack, String str, List list, int i) {
        int i2 = 971241646 ^ (939472635 ^ 1439694626);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -560362566) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -560362566 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1045585280 ^ i2)) {
                    break;
                }
            }
            int i3 = 1448453662 ^ i2;
            throw new IOException("double");
        }
        int i4 = 687769564 ^ i2;
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1720863397) {
            int i5 = 1653294642 ^ i4;
            if (itemMeta == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1925741368) {
                    int i6 = 1061819778 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1925741368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1939190146 ^ i5)) {
                        break;
                    }
                }
                int i7 = 537943466 ^ i5;
                throw new IOException("double");
            }
            i4 = 2121217544 ^ i5;
            itemMeta.setDisplayName(str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2119054475) {
                i4 = 792044070 ^ i4;
                itemMeta.setLore(list);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 132326842) {
                    i4 = 1412309211 ^ i4;
                    itemStack.setItemMeta(itemMeta);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1500372128) {
                        int i8 = 119812183 ^ i4;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2119054475 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1554336871 ^ i4)) {
                int i9 = 68976796 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2003249369 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (465064357 ^ i4)) {
                    int i10 = 1738584431 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1720863397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (503993278 ^ i4)) {
                        int i11 = 494407732 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1615617576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (682799196 ^ i4)) {
                            int i12 = 1776683332 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1500372128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (93381729 ^ i4)) {
                                int i13 = 1507872064 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 132326842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1858495671 ^ i4)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i14 = 1721787537 ^ i4;
        throw new IOException();
    }

    public static List formatLore(List list, String[] strArr, int i) {
        int i2 = 1199108257 ^ (935418521 ^ 1439694626);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 733128913) {
            i2 = 429616682 ^ i2;
            Stream map = list.stream().map(str -> {
                int i3;
                int i4 = 1473224086 ^ (777318965 ^ 1439694626);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1654948873) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1654948873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (623374244 ^ i4)) {
                            int i5 = 1455778982 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1827960451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (264807653 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i6 = 685057659 ^ i4;
                    throw new RuntimeException("double");
                }
                int i7 = 1759293814 ^ i4;
                int i8 = (byte) (1149772279 ^ i7);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 608243642) {
                    int i9 = 1805795802 ^ i7;
                    while (true) {
                        i7 = i9;
                        if (i8 + ((byte) (791306284 ^ i7)) >= strArr.length) {
                            int i10 = 1119153917 ^ i7;
                            return ChatFormater.color(str);
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 2035482985) {
                            i7 = 1225417502 ^ i7;
                            str = str.replace(strArr[i8], strArr[i8 + ((byte) (1713374002 ^ i7))]);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 822090139) {
                                int i11 = 1195531933 ^ i7;
                                i8 += 560094636 ^ i11;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 185789809) {
                                    int i12 = 921019448 ^ i11;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) != 228025365) {
                                            throw null;
                                        }
                                        throw new RuntimeException();
                                    } catch (RuntimeException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -1136669520:
                                                i3 = 491884063 ^ i12;
                                                break;
                                            case 1612994250:
                                                i3 = 1188232528 ^ i12;
                                                break;
                                            default:
                                                throw new IOException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1454619720) {
                                            i9 = hhoibsebwnonlozt(i3, 637278116);
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1454619720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1251974743 ^ i3)) {
                                                    int i13 = 666302861 ^ i3;
                                                    throw new IllegalAccessException("double");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 185789809 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (115908542 ^ i11)) {
                                            int i14 = 1081426157 ^ i11;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 608243642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1742221184 ^ i7)) {
                        int i15 = 223768516 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 822090139 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1570180551 ^ i7)) {
                            int i16 = 1811139450 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 2035482985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (255274097 ^ i7)) {
                                int i17 = 447889231 ^ i7;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -412493439) {
                i2 = 882459678 ^ i2;
                List list2 = (List) map.collect(Collectors.toList());
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1134819696) {
                    int i3 = 1800798889 ^ i2;
                    return list2;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -412493439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1344731341 ^ i2)) {
                int i4 = 1502902376 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 733128913 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1377126542 ^ i2)) {
                    int i5 = 1534047910 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1134819696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1922240919 ^ i2)) {
                        int i6 = 1372410164 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 420736059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1493121540 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1525699664 ^ i2;
        throw new IllegalAccessException();
    }

    public static void fetchHeadAsync(UUID uuid, Consumer consumer, int i) {
        int i2 = 642082890 ^ (1391960889 ^ 1439694626);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 199860873) {
            i2 = 1593088688 ^ i2;
            if (Bukkit.getServer().getOnlineMode() == (2139729633 ^ i2)) {
                i2 = hhoibsebwnonlozt(i2, 896878403);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -62032117) {
                int i3 = 1774812589 ^ i2;
                if (SkinCacheAPI.isInitialized(1157693229) != (373347148 ^ i3)) {
                    i2 = hhoibsebwnonlozt(i3, 368470587);
                    CompletableFuture createHeadAsync = PlayerHeadUtil.createHeadAsync(uuid, 2141002607);
                    Consumer consumer2 = itemStack -> {
                        int i4 = 1219587093 ^ (428681526 ^ 1439694626);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 664653832) {
                            int i5 = 243498933 ^ i4;
                            SchedulerUtil.run(() -> {
                                int i6 = 1866282806 ^ (1650559542 ^ 1439694626);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -996536046) {
                                    int i7 = 1265433671 ^ i6;
                                    consumer.accept(itemStack);
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1610747096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1680646855 ^ i6)) {
                                        int i8 = 439699097 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -996536046 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1551226578 ^ i6)) {
                                            break;
                                        }
                                    }
                                }
                                int i9 = 1431602237 ^ i6;
                                throw new IllegalAccessException();
                            }, 1403588420);
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 664653832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (60327691 ^ i4)) {
                                int i6 = 975933262 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1401302432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1338331592 ^ i4)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 422802278 ^ i4;
                        throw new IllegalAccessException();
                    };
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 498453432) {
                        i2 = 489785732 ^ i2;
                        CompletableFuture<Void> thenAccept = createHeadAsync.thenAccept(consumer2);
                        Function<Throwable, ? extends Void> function = th -> {
                            int i4 = 616032987 ^ (2096948897 ^ 1439694626);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1814534848) {
                                i4 = 1752398264 ^ i4;
                                SchedulerUtil.run(() -> {
                                    int i5 = 1279512314 ^ (630446747 ^ 1439694626);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -520136167) {
                                        int i6 = 859884882 ^ i5;
                                        consumer.accept(buildOfflineHead(uuid, 1147054195));
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2063151240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1959940941 ^ i5)) {
                                            int i7 = 1006038717 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -520136167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (781233480 ^ i5)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i8 = 1159129916 ^ i5;
                                    throw new IOException();
                                }, 1403588420);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 800872195) {
                                    int i5 = 307437968 ^ i4;
                                    return null;
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1121625213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1722529893 ^ i4)) {
                                    int i6 = 1182769341 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1814534848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (992584698 ^ i4)) {
                                        int i7 = 627203587 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 800872195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1490269495 ^ i4)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            int i8 = 468314489 ^ i4;
                            throw new IllegalAccessException();
                        };
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -197556328) {
                            i3 = 806858086 ^ i2;
                            thenAccept.exceptionally(function);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1954868393) {
                                int i4 = 1694115460 ^ i3;
                                return;
                            }
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1308190112) {
                    i2 = 1555839726 ^ i3;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1954868393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (7611221 ^ i3)) {
                        int i5 = 1665623175 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -210523029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (438999853 ^ i3)) {
                            int i6 = 1472539616 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1308190112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1726716667 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i7 = 559643168 ^ i3;
                throw new IOException("double");
            }
            SchedulerUtil.run(() -> {
                int i8 = 233296297 ^ (1076219354 ^ 1439694626);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1066460536) {
                    int i9 = 312409916 ^ i8;
                    consumer.accept(buildOfflineHead(uuid, 1147054195));
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1419305832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2017959112 ^ i8)) {
                        int i10 = 1137785881 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1066460536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1143381048 ^ i8)) {
                            break;
                        }
                    }
                }
                int i11 = 1409824391 ^ i8;
                throw new IllegalAccessException();
            }, 1403588420);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1474776338) {
                int i8 = 882023471 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -197556328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1729354575 ^ i2)) {
                int i9 = 284407583 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -62032117 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (400342078 ^ i2)) {
                    int i10 = 1155319109 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1398134922 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (569710567 ^ i2)) {
                        int i11 = 757605399 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1474776338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (679389008 ^ i2)) {
                            int i12 = 377138926 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 199860873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (465270654 ^ i2)) {
                                int i13 = 34997611 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 498453432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (924269 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i14 = 742963267 ^ i2;
        throw new RuntimeException();
    }

    public static ItemStack buildOfflineHead(UUID uuid, int i) {
        int i2 = 2059022146 ^ (590849529 ^ 1439694626);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1645456584) {
            int i3 = 1377420297 ^ i2;
            ItemStack itemStack = new ItemStack(Material.PLAYER_HEAD);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -220361598) {
                i3 = 1073389223 ^ i3;
                SkullMeta itemMeta = itemStack.getItemMeta();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 218724795) {
                    i2 = 364377960 ^ i3;
                    if (itemMeta != null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1598635269) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1598635269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1000388572 ^ i2)) {
                                    break;
                                }
                            }
                            int i4 = 1005996962 ^ i2;
                            throw new IllegalAccessException("double");
                        }
                        int i5 = 1479859110 ^ i2;
                        itemMeta.setOwningPlayer(Bukkit.getOfflinePlayer(uuid));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1628446665) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1628446665 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (318878394 ^ i5)) {
                                    break;
                                }
                            }
                            int i6 = 648648875 ^ i5;
                            throw new IOException("double");
                        }
                        int i7 = 2103351728 ^ i5;
                        itemStack.setItemMeta(itemMeta);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1947938230) {
                            int i8 = 2028444698 ^ i7;
                            return itemStack;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1947938230 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (682307703 ^ i7)) {
                                break;
                            }
                        }
                        int i9 = 1384808472 ^ i7;
                        throw new RuntimeException("double");
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                            case 15480622:
                                int i10 = 1569578508 ^ i2;
                                break;
                            case 1354836101:
                                break;
                            case 1925624774:
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1289237145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1346933675 ^ i3)) {
                    int i11 = 619537289 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 218724795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1344739371 ^ i3)) {
                        int i12 = 1012570909 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -220361598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1038001385 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i13 = 2122444862 ^ i3;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1645456584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (637972785 ^ i2)) {
                int i14 = 1682659985 ^ i2;
                throw new RuntimeException("double");
            }
        }
    }

    public static java.util.List defaultDisplaySlots(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.utils.LeaderboardUtils.defaultDisplaySlots(int):java.util.List");
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
        cazaewfttt = icjltrteqzxhumn();
        tCzRE5JFbJ = 503920518 ^ new Random(223125099850873807L).nextInt();
    }

    public static String mygayqijjw(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ cazaewfttt[i3 % cazaewfttt.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] icjltrteqzxhumn() {
        return new byte[]{71, 16, 66, 51, 71, 38, 98, 63, 81, 16, 31, 86, 115, 86, 102, 88, 91, 109, 76, 103, 91, 55, 27, 4, 1, 82, 60, 34, 6, 78, 68, 15, 115, 8, 14, 70, 41};
    }

    private static int hhoibsebwnonlozt(int i, int i2) {
        return i2 ^ i;
    }
}
