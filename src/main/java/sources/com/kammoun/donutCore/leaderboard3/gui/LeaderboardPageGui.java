package com.kammoun.donutCore.leaderboard3.gui;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3;
import com.kammoun.donutCore.leaderboard3.config.LeaderboardPageConfig;
import com.kammoun.donutCore.leaderboard3.manager.LeaderboardManager;
import com.kammoun.donutCore.leaderboard3.model.LeaderboardEntry;
import com.kammoun.donutCore.leaderboard3.model.LeaderboardType;
import com.kammoun.donutCore.leaderboard3.utils.LeaderboardUtils;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class LeaderboardPageGui implements InventoryHolder {
    private final LeaderBoardPlugin3 plugin;
    private final LeaderboardManager manager;
    private final LeaderboardType type;
    private final int page;
    private final int maxPage;
    private Inventory inventory;
    private int prevSlot;
    private int nextSlot;
    private int backSlot;
    private int searchSlot;
    private KItem prevItem;
    private KItem nextItem;
    private KItem searchItem;
    private KItem refreshItem;
    private static int K3UDR0CcCW = 0;
    private transient int qj7uFAleIf = 76112761;
    private static String[] nothing_to_see_here = new String[18];

    public LeaderboardPageGui(LeaderBoardPlugin3 leaderBoardPlugin3, LeaderboardManager leaderboardManager, LeaderboardType leaderboardType, int i, int i2, int i3) {
        int i4 = 1599886022 ^ (491498351 ^ 2112066138);
        int parseInt = 17078481 ^ (1873944244 ^ Integer.parseInt("1363340694"));
        this.qj7uFAleIf = 76112761 ^ K3UDR0CcCW;
        int bwacfdppznxlfgtt = 1449302354 ^ bwacfdppznxlfgtt(parseInt, 609771092);
        this.plugin = leaderBoardPlugin3;
        this.manager = leaderboardManager;
        this.type = leaderboardType;
        this.page = i;
        this.maxPage = i2;
        loadItems(947880127);
        int i5 = 65477815 ^ (860496169 ^ (525329600 ^ (921991593 ^ (1980853196 ^ (413148421 ^ bwacfdppznxlfgtt)))));
    }

    private void loadItems(int i) {
        int i2 = 1914197599 ^ (77298167 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2001236950) {
            int i3 = 381242960 ^ i2;
            FileConfiguration loadGui = LeaderboardUtils.loadGui(this.plugin, fzmjqeshyn(cxigxyfxouvditm(), qqclvjyjostlszi(), i3), 1547631071);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1031667370) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1482177875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (69371227 ^ i3)) {
                        int i4 = 1163318288 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1031667370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (662398475 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 1635094231 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 309776134 ^ i3;
            this.prevItem = KItem.fromConfig(loadGui.getConfigurationSection(fzmjqeshyn(yhltvkfiqjzwlaa(), qqclvjyjostlszi(), i2)), 2126963651);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1362393446) {
                i2 = 854923158 ^ i2;
                this.nextItem = KItem.fromConfig(loadGui.getConfigurationSection(fzmjqeshyn(osbvrkbxfjyyavs(), qqclvjyjostlszi(), i2)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 962804267) {
                    int i6 = 881412702 ^ i2;
                    this.searchItem = KItem.fromConfig(loadGui.getConfigurationSection(fzmjqeshyn(srsghebmuboktod(), qqclvjyjostlszi(), i6)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1658230566) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1658230566 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (255757459 ^ i6)) {
                                break;
                            }
                        }
                        int i7 = 1198893821 ^ i6;
                        throw new RuntimeException("double");
                    }
                    i2 = 1247580150 ^ i6;
                    this.refreshItem = KItem.fromConfig(loadGui.getConfigurationSection(fzmjqeshyn(tiiopkjxwgsirsu(), qqclvjyjostlszi(), i2)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -808642712) {
                        int i8 = 1928504647 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -808642712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (413041014 ^ i2)) {
                int i9 = 1694132794 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 962804267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (628882465 ^ i2)) {
                    int i10 = 913883487 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1362393446 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1808560233 ^ i2)) {
                        int i11 = 1923587225 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2001236950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2068879982 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = 962161941 ^ i2;
        throw new RuntimeException();
    }

    public void open(Player player, int i) {
        int i2 = 1576878927 ^ (1236282890 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1631216831) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1631216831 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1930872154 ^ i2)) {
                    break;
                }
            }
            int i3 = 1572453802 ^ i2;
            throw new IOException("double");
        }
        int i4 = 577297808 ^ i2;
        LeaderboardPageConfig pageConfig = this.plugin.getPageConfig(1273184043);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1920763968) {
            int i5 = 775586300 ^ i4;
            String titleTemplate = pageConfig.getTitleTemplate(364600687);
            String fzmjqeshyn = fzmjqeshyn(glxtzwiimtzqfcc(), qqclvjyjostlszi(), i5);
            LeaderboardType leaderboardType = this.type;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -61376479) {
                i4 = 74502501 ^ i5;
                String replace = titleTemplate.replace(fzmjqeshyn, leaderboardType.getDisplayName());
                String fzmjqeshyn2 = fzmjqeshyn(rnfhlqnynnmiwax(), qqclvjyjostlszi(), i4);
                int i6 = this.page + ((byte) (1006255712 ^ i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -539888887) {
                    int i7 = 935189391 ^ i4;
                    String replace2 = replace.replace(fzmjqeshyn2, String.valueOf(i6));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1648308080) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1648308080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1055805275 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 1795669439 ^ i7;
                        throw new RuntimeException("double");
                    }
                    i4 = 91975173 ^ i7;
                    String color = ChatFormater.color(replace2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1239703384) {
                        int i9 = 919722900 ^ i4;
                        this.inventory = Bukkit.createInventory(this, pageConfig.getSize(330793396), color);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -9796615) {
                            int i10 = 383033228 ^ i9;
                            this.prevSlot = pageConfig.getPrevSlot(2027446107);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1238269849) {
                                i4 = 1117164707 ^ i10;
                                this.nextSlot = pageConfig.getNextSlot(482062667);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1568332419) {
                                    i10 = 1879978156 ^ i4;
                                    this.backSlot = pageConfig.getBackSlot(1806047850);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -586457120) {
                                        int i11 = 510882667 ^ i10;
                                        this.searchSlot = pageConfig.getSearchSlot(761465721);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 781239480) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 781239480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1664388335 ^ i11)) {
                                                    break;
                                                }
                                            }
                                            int i12 = 1768621132 ^ i11;
                                            throw new IOException("double");
                                        }
                                        i5 = 261430944 ^ i11;
                                        placeNavItems(pageConfig, 965926576);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1379414456) {
                                            int i13 = 267530653 ^ i5;
                                            renderEntries(player, pageConfig, 1479942584);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != 766098768) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 766098768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (265279127 ^ i13)) {
                                                        break;
                                                    }
                                                }
                                                int i14 = 243868986 ^ i13;
                                                throw new RuntimeException("double");
                                            }
                                            i9 = 10594381 ^ i13;
                                            renderPositionItem(player, pageConfig, 158683245);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 681901880) {
                                                int i15 = 1726522191 ^ i9;
                                                player.openInventory(this.inventory);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 534897987) {
                                                    int i16 = 382126355 ^ i15;
                                                    return;
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 534897987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (2130416663 ^ i15)) {
                                                        break;
                                                    }
                                                }
                                                int i17 = 988076545 ^ i15;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -586457120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1600041145 ^ i10)) {
                                    int i18 = 222147333 ^ i10;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1238269849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1178513811 ^ i10)) {
                                        break;
                                    }
                                }
                            }
                            int i19 = 1887053473 ^ i10;
                            throw new RuntimeException("double");
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 681901880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (845704085 ^ i9)) {
                                int i20 = 762510195 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -9796615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1338393486 ^ i9)) {
                                    break;
                                }
                            }
                        }
                        int i21 = 539802576 ^ i9;
                        throw new IllegalAccessException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -61376479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1866508240 ^ i5)) {
                    int i22 = 784549260 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1379414456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (817101636 ^ i5)) {
                        break;
                    }
                }
            }
            int i23 = 724334549 ^ i5;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1920763968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1859823783 ^ i4)) {
                int i24 = 579556162 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1568332419 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1208357408 ^ i4)) {
                    int i25 = 989215208 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -539888887 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (493507184 ^ i4)) {
                        int i26 = 1500136292 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1445483045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1267071958 ^ i4)) {
                            int i27 = 654964392 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1239703384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1600928778 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i28 = 309350767 ^ i4;
        throw new IOException();
    }

    private void placeNavItems(LeaderboardPageConfig leaderboardPageConfig, int i) {
        int i2;
        int i3 = 1359169884 ^ (2116635614 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1174332792) {
            int i4 = 1254455040 ^ i3;
            int size = leaderboardPageConfig.getSize(330793396);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 332750202) {
                int i5 = 983685675 ^ i4;
                if (this.page <= (2027647364 ^ i5)) {
                    i2 = 24627610 ^ i5;
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -958690269) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -958690269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (471884671 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1532471846 ^ i5;
                        throw new RuntimeException("double");
                    }
                    int i7 = 1330029192 ^ i5;
                    placeItem(this.prevItem, this.prevSlot, size, 1549612599);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1125214111) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1125214111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1455492214 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 1351456703 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 1311861522 ^ i7;
                }
                if (this.page + ((byte) (2041362463 ^ i2)) < this.maxPage) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -848969485) {
                        i3 = 1134859188 ^ i2;
                        placeItem(this.nextItem, this.nextSlot, size, 1549612599);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -801022639) {
                            i2 = 1897627028 ^ i3;
                            placeItem(this.searchItem, this.searchSlot, size, 1549612599);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1486533106) {
                                i4 = 1326316975 ^ i2;
                                placeItem(this.refreshItem, leaderboardPageConfig.getRefreshSlot(1837390982), size, 1549612599);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 552950920) {
                                    int i9 = 1201978309 ^ i4;
                                    return;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -848969485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1453940654 ^ i2)) {
                            int i10 = 1538450045 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1486533106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1679604950 ^ i2)) {
                                int i11 = 1300584647 ^ i2;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 197057814:
                            i2 = 851439136 ^ i2;
                            break;
                        case 367766911:
                            break;
                        case 619047727:
                        default:
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 500204194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (211036539 ^ i2)) {
                                    int i12 = 1877192624 ^ i2;
                                    throw new RuntimeException("double");
                                }
                            }
                            break;
                        case 634636469:
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 332750202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (665477848 ^ i4)) {
                    int i13 = 1087186104 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 552950920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1533237110 ^ i4)) {
                        int i14 = 104165432 ^ i4;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -801022639 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (424796501 ^ i3)) {
                int i15 = 1204186359 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1174332792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (214128745 ^ i3)) {
                    break;
                }
            }
        }
        int i16 = 858083700 ^ i3;
        throw new IOException("double");
    }

    private void placeItem(KItem kItem, int i, int i2, int i3) {
        int i4 = 720871320 ^ (477392420 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2001634168) {
            int i5 = 1746961881 ^ i4;
            if (kItem == null) {
                int i6 = 873075188 ^ i5;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -910863805) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -910863805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (323077532 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1034304380 ^ i5;
                throw new RuntimeException("double");
            }
            i4 = 1482213 ^ i5;
            if (i < (2032154541 ^ i4)) {
                bwacfdppznxlfgtt(i4, 874286097);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -922632853) {
                i4 = 868729098 ^ i4;
                if (i < i2) {
                    int bwacfdppznxlfgtt = bwacfdppznxlfgtt(i4, 1319609536);
                    this.inventory.setItem(i, kItem.getItemStack(1475551979));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(bwacfdppznxlfgtt) == 570594104) {
                        int i8 = 2023448513 ^ bwacfdppznxlfgtt;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(bwacfdppznxlfgtt) == 570594104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(bwacfdppznxlfgtt) == (1051904764 ^ bwacfdppznxlfgtt)) {
                            break;
                        }
                    }
                    int i9 = 117708406 ^ bwacfdppznxlfgtt;
                    throw new RuntimeException("double");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1463792954) {
                    int i10 = 131812635 ^ i4;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -922632853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1624322478 ^ i4)) {
                int i11 = 2056736148 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2001634168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1452992895 ^ i4)) {
                    int i12 = 857092397 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1463792954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1143429862 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i13 = 1684268648 ^ i4;
        throw new IOException();
    }

    private void renderEntries(org.bukkit.entity.Player r8, com.kammoun.donutCore.leaderboard3.config.LeaderboardPageConfig r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.gui.LeaderboardPageGui.renderEntries(org.bukkit.entity.Player, com.kammoun.donutCore.leaderboard3.config.LeaderboardPageConfig, int):void");
    }

    private void renderPositionItem(org.bukkit.entity.Player r7, com.kammoun.donutCore.leaderboard3.config.LeaderboardPageConfig r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.gui.LeaderboardPageGui.renderPositionItem(org.bukkit.entity.Player, com.kammoun.donutCore.leaderboard3.config.LeaderboardPageConfig, int):void");
    }

    private ItemStack buildEntryHead(ItemStack itemStack, LeaderboardEntry leaderboardEntry, String str, List list, int i) {
        int i2 = 2072977102 ^ (1788362665 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1273497007) {
            int i3 = 1186217306 ^ i2;
            String formatValue = this.manager.formatValue(leaderboardEntry.getValue(269385613), this.type.getStatsType(), 2017463351);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2118774653) {
                int i4 = 613579592 ^ i3;
                String fzmjqeshyn = fzmjqeshyn(ybtawoovoixpgab(), qqclvjyjostlszi(), i4);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1524249918) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1524249918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1802541624 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1117658398 ^ i4;
                    throw new IOException("double");
                }
                i3 = 954626238 ^ i4;
                String replace = str.replace(fzmjqeshyn, String.valueOf(leaderboardEntry.getRank(1120705898)));
                String fzmjqeshyn2 = fzmjqeshyn(pdkhkmmhxdqbofz(), qqclvjyjostlszi(), i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1645629235) {
                    int i6 = 774522699 ^ i3;
                    String replace2 = replace.replace(fzmjqeshyn2, leaderboardEntry.getName(1132305765));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 323253610) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 323253610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (202610608 ^ i6)) {
                                int i7 = 35960593 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1979221437 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1055068381 ^ i6)) {
                                    break;
                                }
                            }
                        }
                        int i8 = 1834105758 ^ i6;
                        throw new RuntimeException("double");
                    }
                    i2 = 935556005 ^ i6;
                    String color = ChatFormater.color(replace2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1386223549) {
                        i3 = 1978479341 ^ i2;
                        String[] strArr = new String[(byte) (4640739 ^ i3)];
                        strArr[(byte) (4640741 ^ i3)] = fzmjqeshyn(rzhpgpslfawojkb(), qqclvjyjostlszi(), i3);
                        byte b = (byte) (4640740 ^ i3);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 37125928) {
                            i3 = 328012936 ^ i3;
                            strArr[b] = String.valueOf(leaderboardEntry.getRank(1120705898));
                            strArr[(byte) (332127087 ^ i3)] = fzmjqeshyn(ahxedbabjljmpbj(), qqclvjyjostlszi(), i3);
                            strArr[(byte) (332127086 ^ i3)] = leaderboardEntry.getName(1132305765);
                            strArr[(byte) (332127081 ^ i3)] = fzmjqeshyn(kzfwlidmlkflxoh(), qqclvjyjostlszi(), i3);
                            strArr[(byte) (332127080 ^ i3)] = formatValue;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1637950616) {
                                int i9 = 1588009578 ^ i3;
                                List formatLore = LeaderboardUtils.formatLore(list, strArr, 1675394578);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1801848890) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1801848890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (56758380 ^ i9)) {
                                            break;
                                        }
                                    }
                                    int i10 = 1803005250 ^ i9;
                                    throw new IOException("double");
                                }
                                i3 = 1450629693 ^ i9;
                                LeaderboardUtils.applyMeta(itemStack, color, formatLore, 2074582176);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -657401392) {
                                    int i11 = 1784345714 ^ i3;
                                    return itemStack;
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1645629235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1359961779 ^ i3)) {
                    int i12 = 1238235535 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 37125928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (10821731 ^ i3)) {
                        int i13 = 1268380085 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1637950616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (116912008 ^ i3)) {
                            int i14 = 1506407416 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2118774653 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1301418512 ^ i3)) {
                                int i15 = 1996449396 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -657401392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (33603625 ^ i3)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i16 = 511670008 ^ i3;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1273497007 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2000008971 ^ i2)) {
                int i17 = 1446157503 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1386223549 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (582107058 ^ i2)) {
                    break;
                }
            }
        }
        int i18 = 260771929 ^ i2;
        throw new IllegalAccessException("double");
    }

    private List getPageEntries(int i) {
        int i2 = 1446725377 ^ (1503844222 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1080193681) {
            int i3 = 1061124800 ^ i2;
            List cache = this.manager.getCache(this.type, 1762046311);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1181113200) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1181113200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1673256518 ^ i3)) {
                        break;
                    }
                }
                int i4 = 301601551 ^ i3;
                throw new IOException("double");
            }
            i2 = 1938626894 ^ i3;
            int playersPerPage = this.page * this.manager.getPlayersPerPage(589811394);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 636579555) {
                i2 = 5033425 ^ i2;
                if (playersPerPage < cache.size()) {
                    int i5 = 1476359828 ^ i2;
                    return cache.subList(playersPerPage, Math.min(playersPerPage + this.manager.getPlayersPerPage(589811394), cache.size()));
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 664207467) {
                    int i6 = 838882903 ^ i2;
                    return Collections.emptyList();
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1080193681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1668295516 ^ i2)) {
                int i7 = 436904169 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 664207467 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1457335039 ^ i2)) {
                    int i8 = 1601193121 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1737706295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1438249937 ^ i2)) {
                        int i9 = 1181667419 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 636579555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1859560676 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 755101208 ^ i2;
        throw new RuntimeException();
    }

    @NotNull
    public Inventory getInventory() {
        int i = 1653470548 ^ (1588671814 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -582422024) {
            int i2 = 866030566 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -582422024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (94439720 ^ i)) {
                int i3 = 2038532801 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1102868169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (47322713 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1014319492 ^ i;
        throw new IOException();
    }

    @Generated
    public LeaderBoardPlugin3 getPlugin() {
        int i = 748723465 ^ (1145009347 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2018623290) {
            int i2 = 46967831 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2018623290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1355270145 ^ i)) {
                int i3 = 470797294 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1848958850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1507193339 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 272454549 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public LeaderboardManager getManager() {
        int i = 1851054313 ^ (1470538127 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -214091176) {
            int i2 = 1600163939 ^ i;
            return this.manager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -214091176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (119008814 ^ i)) {
                int i3 = 25262765 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 138000706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (621476964 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 592323466 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public LeaderboardType getType(int i) {
        int i2 = 2110931341 ^ (228087096 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1090628414) {
            int i3 = 74097825 ^ i2;
            return this.type;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1649708598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (502086561 ^ i2)) {
                int i4 = 765792679 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1090628414 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1843783033 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 662002786 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getPage(int i) {
        int i2 = 414593171 ^ (596809377 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -443825928) {
            int i3 = 486188736 ^ i2;
            return this.page;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 39778040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1878962810 ^ i2)) {
                int i4 = 215201775 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -443825928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1379892929 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 548432277 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getMaxPage(int i) {
        int i2 = 404385440 ^ (888860646 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1537932120) {
            int i3 = 1738617710 ^ i2;
            return this.maxPage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1537932120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (791240555 ^ i2)) {
                int i4 = 562604632 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1721983019 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (844701193 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2129040258 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getPrevSlot(int i) {
        int i2 = 189678946 ^ (336009919 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -958132351) {
            int i3 = 1729864507 ^ i2;
            return this.prevSlot;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -29813158 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (425637207 ^ i2)) {
                int i4 = 512541588 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -958132351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (318829807 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 723011198 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getNextSlot(int i) {
        int i2 = 1519430453 ^ (1461270668 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1357016225) {
            int i3 = 94572422 ^ i2;
            return this.nextSlot;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2113540241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1797097 ^ i2)) {
                int i4 = 1929776021 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1357016225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1937497895 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1201868799 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getBackSlot(int i) {
        int i2 = 1699926467 ^ (1427595318 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1098678592) {
            int i3 = 882598616 ^ i2;
            return this.backSlot;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1098678592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (710882905 ^ i2)) {
                int i4 = 317644645 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 442001409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (524700453 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1825657017 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getSearchSlot(int i) {
        int i2 = 13881874 ^ (2130663773 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -842355950) {
            int i3 = 1963489257 ^ i2;
            return this.searchSlot;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -842355950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1686237465 ^ i2)) {
                int i4 = 641645085 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1703482457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1993519884 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 996197098 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public KItem getPrevItem() {
        int i = 100934263 ^ (672643024 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1278368848) {
            int i2 = 475100811 ^ i;
            return this.prevItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1278368848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1540542469 ^ i)) {
                int i3 = 1523260624 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1363548152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1837802579 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1850574230 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KItem getNextItem() {
        int i = 429972074 ^ (806096774 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1908956680) {
            int i2 = 1418409542 ^ i;
            return this.nextItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1908956680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (942512581 ^ i)) {
                int i3 = 79296098 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -711857094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (634038589 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2124080410 ^ i;
        throw new IOException();
    }

    @Generated
    public KItem getSearchItem() {
        int i = 209116078 ^ (478179383 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1155813983) {
            int i2 = 737237238 ^ i;
            return this.searchItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -460232176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (834736291 ^ i)) {
                int i3 = 1341702915 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1155813983 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1573983354 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1319965431 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KItem getRefreshItem() {
        int i = 803167888 ^ (1188458723 ^ 664133165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1961329394) {
            int i2 = 396631112 ^ i;
            return this.refreshItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -909680462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (461612464 ^ i)) {
                int i3 = 671692410 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1961329394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (527697218 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1075134156 ^ i;
        throw new RuntimeException();
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
        K3UDR0CcCW = 159852246 ^ new Random(6654233986423688692L).nextInt();
    }

    public static String fzmjqeshyn(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] qqclvjyjostlszi() {
        return new byte[]{72, 71, 92, 49, 76, 16, 86, 18, 98, 42, 45, 79, 68, 20, 47, 58, 125, 56, 96, 44, 45, 76, 5, 22, 54, 28, 93, 88, 53, 11, 66, 99, 84, 62, 110, 108, 73, 121, 92, 25, 125, 23, 6, 93, 10, 66, 124, 43, 7, 66, 84, 38, 55, 111, 111, 76, 90, 123, 122, Byte.MAX_VALUE, 64, 1, 49, 46, 115, 24, 109, 123, 40, 81, 44, 122, 105, 33, 68, 125, 69, 36, 95, 70, 46, 85, 104, 52, 32, 42, 69, 44, 58, 39, 14, 21, 52, 82, 28};
    }

    private static byte[] yhltvkfiqjzwlaa() {
        return new byte[]{-121, -116, 104, 79, Byte.MAX_VALUE, 64, 101, 81, 87, 118, 28, 28, 112, 69, 28, Byte.MAX_VALUE, 78, 100, 85, 118, 28, 22, 49, 8, 5, 125, 110, 31, 0, 91, 115, 33};
    }

    private static byte[] osbvrkbxfjyyavs() {
        return new byte[]{-121, -113, 111, 79, 117, 71, 101, 86, 84, 122, 28, 31, 119, 69, 22, 120, 78, 99, 86, 122, 28, 21, 54, 8, 15, 100, 110, 15, 3, 74, 115, 32};
    }

    private static byte[] cxigxyfxouvditm() {
        return new byte[]{-121, -118, 108, 115, 123, 65, 102, 71, 86, 122, 28, 83, 116, 95, 24, 103, 77, 102};
    }

    private static byte[] tiiopkjxwgsirsu() {
        return new byte[]{-126, -117, 105, 79, 117, 84, 99, 64, 81, 115, 30, 9, 115, 3, 31, 93, 74, 110, 84, 121, 24, 9, 60, 67, 3, 88, 110, 4};
    }

    private static byte[] srsghebmuboktod() {
        return new byte[]{-121, -116, 108, 75, Byte.MAX_VALUE, 87, 101, 78, 83, 114, 28, 8, 116, 9, 28, 90, 78, 100, 81, 120, 28, 10, 53, 70, 5, 71};
    }

    private static byte[] rnfhlqnynnmiwax() {
        return new byte[]{-121, -120, 108, 34, 126, 85, 99, 68, 83, 126, 28, 26, 116, 7};
    }

    private static byte[] glxtzwiimtzqfcc() {
        return new byte[]{-121, -120, 106, 34, 124, 82, 111, 92, 84, 110, 28, 26, 114, 7};
    }

    private static byte[] jdadwzlfjtoxdna() {
        return new byte[]{-121, -127, 100, 73, 125, 13, 97, 106};
    }

    private static byte[] dkdapfepoufcqqo() {
        return new byte[]{-121, -115, 109, 71, 123, 7, 100, 100};
    }

    private static byte[] zpsijaijljgctub() {
        return new byte[]{-125, -118, 106, 44, 117, 86, 110, 73, 91, 126, 31, 0, 124, 72, 25, 112, 74, 36};
    }

    private static byte[] vbmqtiahxgftvoc() {
        return new byte[]{-121, -113, 111, 38, Byte.MAX_VALUE, 87, 111, 95, 90, 122, 28, 12, 119, 85, 28, 81, 68, 117, 88, 100, 28, 11, 54, 65, 5, 13};
    }

    private static byte[] sfoysyasxopxfrk() {
        return new byte[]{-121, -113, 111, 38, Byte.MAX_VALUE, 82, 111, 74, 90, 119, 28, 13, 119, 67, 28, 43};
    }

    private static byte[] qmxvyjimsxbxmlh() {
        return new byte[]{-121, -113, 111, 38, Byte.MAX_VALUE, 84, 111, 68, 90, 104, 28, 17, 119, 82, 28, 103, 68, 110, 88, 115, 28, 94};
    }

    private static byte[] vvmozrspzsddyoj() {
        return new byte[]{-121, -127, 108, 34, 116, 87, 96, 73, 83, 114, 28, 15, 116, 71, 23, Byte.MAX_VALUE, 75, 42};
    }

    private static byte[] ahxedbabjljmpbj() {
        return new byte[]{-123, -117, 110, 37, 126, 73, 102, 75, 87, 116, 30, 24, 117, 3};
    }

    private static byte[] kzfwlidmlkflxoh() {
        return new byte[]{-123, -117, 110, 37, 126, 81, 102, 75, 87, 117, 30, 8, 117, 67, 24, 47};
    }

    private static byte[] ybtawoovoixpgab() {
        return new byte[]{-121, -116, 110, 36, 124, 90, 103, 71, 91, 114, 28, 16, 118, 1};
    }

    private static byte[] rzhpgpslfawojkb() {
        return new byte[]{-126, -114, 104, 36, 123, 86, 103, 71, 84, 112, 29, 19, 112, 0};
    }

    private static byte[] pdkhkmmhxdqbofz() {
        return new byte[]{-121, Byte.MIN_VALUE, 109, 34, Byte.MAX_VALUE, 79, 96, 64, 91, 119, 28, 18, 117, 7};
    }

    private static int bwacfdppznxlfgtt(int i, int i2) {
        return i2 ^ i;
    }
}
