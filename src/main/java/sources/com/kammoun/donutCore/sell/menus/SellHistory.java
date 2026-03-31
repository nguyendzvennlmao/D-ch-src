package com.kammoun.donutCore.sell.menus;

import com.kammoun.donutCore.api.utils.NumberUtils;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.sell.SellPlugin;
import com.kammoun.donutCore.sell.model.SellCategory;
import com.kammoun.donutCore.sell.model.SellPlayerData;
import com.kammoun.donutCore.sell.service.Enums.SortTypeHistory;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class SellHistory extends KMenu implements Listener {
    private final SellPlugin sellPlugin;
    private List<String> spentLore;
    private KItem sortItem;
    private static int yGJr2disoS = 0;

    private transient int f827uU1O9Nbfl = 1448018187;
    private static byte[] wklkvxlypk;
    private static String[] nothing_to_see_here = new String[19];

    public static class SellHistoryHolder implements InventoryHolder {
        private final SortTypeHistory sortType;
        private final int currentPage;
        private final int maxPage;

        private static int f835RiB9V7lpm = 0;
        private transient int bH895Hz5RP = 768367154;
        private static String[] nothing_to_see_here = new String[15];

        public SellHistoryHolder(com.kammoun.donutCore.sell.service.Enums.SortTypeHistory r5, int r6, int r7, int r8) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.SellHistory.SellHistoryHolder.<init>(com.kammoun.donutCore.sell.service.Enums.SortTypeHistory, int, int, int):void");
        }

        @NotNull
        public Inventory getInventory() {
            int i = 1264212643 ^ (430989617 ^ 1620347482);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1812623807) {
                int i2 = 1953517289 ^ i;
                return null;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1812623807 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (815538198 ^ i)) {
                    int i3 = 659562886 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 813168906 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1790939728 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1295017550 ^ i;
            throw new RuntimeException();
        }

        @Generated
        public SortTypeHistory getSortType(int i) {
            int i2 = 1526050219 ^ (2142765559 ^ 1620347482);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 784937010) {
                int i3 = 1272127527 ^ i2;
                return this.sortType;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 784937010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1088545091 ^ i2)) {
                    int i4 = 1746837063 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1884303624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1987915775 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 138099384 ^ i2;
            throw new IllegalAccessException();
        }

        @Generated
        public int getCurrentPage(int i) {
            int i2 = 1513272220 ^ (848241717 ^ 1620347482);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1095298968) {
                int i3 = 1459540345 ^ i2;
                return this.currentPage;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1095298968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (199274956 ^ i2)) {
                    int i4 = 1247081675 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -155294638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (572361041 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 780517673 ^ i2;
            throw new RuntimeException();
        }

        @Generated
        public int getMaxPage(int i) {
            int i2 = 1247078667 ^ (1933076908 ^ 1620347482);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -809478166) {
                int i3 = 417233808 ^ i2;
                return this.maxPage;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -809478166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (576272860 ^ i2)) {
                    int i4 = 1052753273 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 154372970 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (750507022 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 887140257 ^ i2;
            throw new IllegalAccessException();
        }

        static {
            nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
            nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
            nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
            nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
            nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
            f835RiB9V7lpm = 1977651794 ^ new Random(7603771341336249679L).nextInt();
        }

        public static String akawcxnizz(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] monlmhuzyhprlrm() {
            return new byte[]{37, 7, 83, 107, 32, 85, 71, 62, 46, 53, 14, 63, 38, 71, 88, 36, 50, 51, 95, 51, 82, 2, 71, 27, 33, 12, 43, 86, 50, 99, 122, 77, 25, 38, 17, 28, 13, 31, 23, 56, 125, 15, 118, 85, 113, 20, 2, 119, 117, 45, 25, 104, 23, 25, 7, 120, 73, 63, 31, 32, 32, 84, 96, 69, 118, 71, 90, 4, 50, 125, 107, 101, 61, 42, 119, 90, 48, 126, 70, 11, 24, 107, 50, 100, 42, 36, 100, 73, 36, 116, 91, 26};
        }

        private static int lkasgqxirzpchtzq(int i, int i2) {
            return i ^ i2;
        }
    }

    public SellHistory(JavaPlugin javaPlugin, SellPlugin sellPlugin, int i) {
        super(javaPlugin, "Sell/Gui's/SellHistory.yml", 1546437752);
        int i2 = 1366210929 ^ 1307264627;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 84607219:
                    break;
                case 121864854:
                    int i3 = 1190803919 ^ i2;
                    break;
                case 224875366:
                case 1436933948:
                default:
                    throw new IOException();
            }
        }
        int parseInt = 266102582 ^ (417757440 ^ Integer.parseInt("1296423163"));
        this.f827uU1O9Nbfl = 1448018187 ^ yGJr2disoS;
        int iwtfeasolijuxvst = 1812823122 ^ iwtfeasolijuxvst(parseInt, 1540452414);
        this.sellPlugin = sellPlugin;
        this.spentLore = getConfig(533900686).getStringList("Spent-Lore");
        this.sortItem = KItem.fromConfig(getConfig(533900686).getConfigurationSection("Items.Sort"), 2126963651);
        javaPlugin.getServer().getPluginManager().registerEvents(this, javaPlugin);
        int i4 = 252025886 ^ (799177976 ^ (1274123757 ^ (734160618 ^ iwtfeasolijuxvst)));
    }

    public void openInventory(org.bukkit.entity.Player r7, int r8, com.kammoun.donutCore.sell.service.Enums.SortTypeHistory r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.SellHistory.openInventory(org.bukkit.entity.Player, int, com.kammoun.donutCore.sell.service.Enums.SortTypeHistory, int):void");
    }

    private ItemStack getSortItem(SortTypeHistory sortTypeHistory, int i) {
        int i2 = 975989712 ^ (1552166848 ^ 1114174796);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637897441) {
            int i3 = 230305362 ^ i2;
            ItemStack itemStack = this.sortItem.getItemStack(1475551979);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1272248433) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1272248433 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1130123882 ^ i3)) {
                        break;
                    }
                }
                int i4 = 185496535 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i5 = 698736085 ^ i3;
            ItemMeta itemMeta = itemStack.getItemMeta();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 117053144) {
                i2 = 615195580 ^ i5;
                if (itemMeta != null) {
                    int iwtfeasolijuxvst = iwtfeasolijuxvst(i2, 1841477142);
                    List lore = itemMeta.getLore();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) != 1303821194) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == -2138304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == (1607859657 ^ iwtfeasolijuxvst)) {
                                int i6 = 1063803547 ^ iwtfeasolijuxvst;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == 1303821194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == (707103121 ^ iwtfeasolijuxvst)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 1777979848 ^ iwtfeasolijuxvst;
                        throw new RuntimeException("double");
                    }
                    i5 = 750562512 ^ iwtfeasolijuxvst;
                    if (lore == null) {
                        i2 = iwtfeasolijuxvst(i5, 2136679265);
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 676584715) {
                        i5 = 1917773927 ^ i5;
                        Stream map = lore.stream().map(str -> {
                            int i8 = 1615937895 ^ (158328629 ^ 338162759);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -389377877) {
                                return ChatFormater.color(str.replace(cziawyepag(kjxqyahivozcoze(), 375852159 ^ i8), sortTypeHistory.toString()));
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -389377877 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (821354612 ^ i8)) {
                                    int i9 = 1860655776 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1542648659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1343007503 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                            int i10 = 1940331658 ^ i8;
                            throw new IOException();
                        });
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1172005328) {
                            i2 = 1068577298 ^ i5;
                            lore = map.toList();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1202523809) {
                                i2 = 849672468 ^ i2;
                            }
                        }
                    }
                    itemMeta.setLore(lore);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -762657280) {
                        i2 = 761017670 ^ i2;
                        itemStack.setItemMeta(itemMeta);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1200919503) {
                            int i8 = 1444738095 ^ i2;
                            return itemStack;
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 597887801) {
                    int i9 = 999262863 ^ i2;
                    return itemStack;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1172005328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1781825959 ^ i5)) {
                    int i10 = 796661473 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 117053144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1855157535 ^ i5)) {
                        int i11 = 1658763385 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 676584715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1409830834 ^ i5)) {
                            break;
                        }
                    }
                }
            }
            int i12 = 353935875 ^ i5;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -762657280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (169566029 ^ i2)) {
                int i13 = 157275292 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637897441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2017003085 ^ i2)) {
                    int i14 = 1375103386 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 143445323 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (769743478 ^ i2)) {
                        int i15 = 1277575217 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1200919503 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1948729730 ^ i2)) {
                            int i16 = 1538140925 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1202523809 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1163278933 ^ i2)) {
                                int i17 = 817082699 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 597887801 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1937289966 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i18 = 1197960344 ^ i2;
        throw new IOException();
    }

    private ItemStack getSpentItem(Material material, SellPlayerData sellPlayerData, int i) {
        int i2 = 1633190598 ^ (1234531770 ^ 1114174796);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1428689283) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1428689283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (474201043 ^ i2)) {
                    break;
                }
            }
            int i3 = 1131491469 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1728426897 ^ i2;
        ItemStack itemStack = new ItemStack(material);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1829080328) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1829080328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1333044999 ^ i4)) {
                    break;
                }
            }
            int i5 = 1242269935 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 1128311796 ^ i4;
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1996542634) {
            i6 = 1101332925 ^ i6;
            if (itemMeta != null) {
                int iwtfeasolijuxvst = iwtfeasolijuxvst(i6, 1003160579);
                Stream<R> map = this.spentLore.stream().map(str -> {
                    int i7 = 1580021266 ^ (1182994279 ^ 1114174796);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -701079094) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -701079094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (253924996 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 1100104822 ^ i7;
                        throw new IOException("double");
                    }
                    int i9 = 1241445789 ^ i7;
                    String cziawyepag = cziawyepag(veksevkmtplhyrb(), i9);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1715352288) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -393366943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1912069123 ^ i9)) {
                                int i10 = 1312284940 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1715352288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1043195308 ^ i9)) {
                                    break;
                                }
                            }
                        }
                        int i11 = 1638540778 ^ i9;
                        throw new IllegalAccessException();
                    }
                    int i12 = 354444245 ^ i9;
                    String replace = str.replace(cziawyepag, NumberUtils.formatDouble(getItemTotalSoldPrice(sellPlayerData, itemStack, 1027311458), 1827184238));
                    String cziawyepag2 = cziawyepag(qlmjjpvfjxeznzs(), i12);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 818074504) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 818074504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (467418583 ^ i12)) {
                                break;
                            }
                        }
                        int i13 = 377435114 ^ i12;
                        throw new RuntimeException("double");
                    }
                    int i14 = 1804329555 ^ i12;
                    String replace2 = replace.replace(cziawyepag2, NumberUtils.formatDouble(sellPlayerData.getSoldAmount(material, 1992213565), 1827184238));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1822277907) {
                        int i15 = 1350700654 ^ i14;
                        return ChatFormater.color(replace2);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1822277907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (542923742 ^ i14)) {
                            break;
                        }
                    }
                    int i16 = 909959130 ^ i14;
                    throw new RuntimeException("double");
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == -1536098471) {
                    iwtfeasolijuxvst = 1686739789 ^ iwtfeasolijuxvst;
                    List list = map.toList();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == -2143541966) {
                        iwtfeasolijuxvst = 661495913 ^ iwtfeasolijuxvst;
                        itemMeta.setLore(list);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == -1152309637) {
                            iwtfeasolijuxvst = 1497613230 ^ iwtfeasolijuxvst;
                            itemStack.setItemMeta(itemMeta);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == 1901017865) {
                                int i7 = 1231608122 ^ iwtfeasolijuxvst;
                                return itemStack;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == -1152309637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == (2017859311 ^ iwtfeasolijuxvst)) {
                        int i8 = 1693668899 ^ iwtfeasolijuxvst;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == -1536098471 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == (172291489 ^ iwtfeasolijuxvst)) {
                            int i9 = 2060209521 ^ iwtfeasolijuxvst;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == -2143541966 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == (488218224 ^ iwtfeasolijuxvst)) {
                                int i10 = 303118633 ^ iwtfeasolijuxvst;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == 973730523 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == (1476702685 ^ iwtfeasolijuxvst)) {
                                    int i11 = 1883547365 ^ iwtfeasolijuxvst;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == 1901017865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(iwtfeasolijuxvst) == (802572169 ^ iwtfeasolijuxvst)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                int i12 = 2052655512 ^ iwtfeasolijuxvst;
                throw new RuntimeException();
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2049498944) {
                int i13 = 1925010583 ^ i6;
                return itemStack;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2049498944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (498216911 ^ i6)) {
                int i14 = 458285530 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1996542634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1618039513 ^ i6)) {
                    int i15 = 36076881 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -272466949 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (900116464 ^ i6)) {
                        break;
                    }
                }
            }
        }
        int i16 = 304400727 ^ i6;
        throw new IOException("double");
    }

    private double getItemTotalSoldPrice(SellPlayerData sellPlayerData, ItemStack itemStack, int i) {
        int i2 = 337686507 ^ (2097983501 ^ 1114174796);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1512527185) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1512527185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (84118842 ^ i2)) {
                    break;
                }
            }
            int i3 = 374549439 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 2139877709 ^ i2;
        SellCategory categoryForItem = this.sellPlugin.getConfigManager(1299309642).getCategoryConfigLoader(1765237940).getCategoryForItem(itemStack.getType(), 704769776);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1502027974) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -237303016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1500881115 ^ i4)) {
                    int i5 = 525852705 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1502027974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (694036804 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 1607912276 ^ i4;
            throw new RuntimeException();
        }
        int i7 = 12103551 ^ i4;
        double price = categoryForItem.getPrice(itemStack.getType(), 1510155842) * sellPlayerData.getSoldAmount(itemStack.getType(), 1992213565);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1547852606) {
            int i8 = 1246549499 ^ i7;
            return price;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1547852606 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (123496714 ^ i7)) {
                break;
            }
        }
        int i9 = 607775368 ^ i7;
        throw new RuntimeException("double");
    }

    @EventHandler
    public void onHistoryMenuClick(InventoryClickEvent inventoryClickEvent) {
        int i = 1275997064 ^ (855121554 ^ 1114174796);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -453639503) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1920560827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1444918003 ^ i)) {
                    int i2 = 1919129481 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -453639503 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (553116134 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 2015128637 ^ i;
            throw new IOException();
        }
        int i4 = 1571804005 ^ i;
        handleClick(inventoryClickEvent, 743228312);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 159947163) {
            int i5 = 259931876 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 159947163 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1310822368 ^ i4)) {
                break;
            }
        }
        int i6 = 345164324 ^ i4;
        throw new IOException("double");
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.menus.SellHistory.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 1085542221 ^ (521415548 ^ 1114174796);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -297366552) {
            int i3 = 1726658722 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -653046021 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1475188524 ^ i2)) {
                int i4 = 916360107 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -297366552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (515247605 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1665799802 ^ i2;
        throw new IOException();
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
        wklkvxlypk = gqixogekeqqkiin();
        yGJr2disoS = (-1669987180) ^ new Random(1701002982462503691L).nextInt();
    }

    public static String cziawyepag(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ wklkvxlypk[i3 % wklkvxlypk.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] gqixogekeqqkiin() {
        return new byte[]{41, 54, 85, 1, 55, 83, 2, 36, 107, 82, 101, 91, 100, 120, 120, 106, 13, 78, 19, 44, 17, 33, 103, 16, 96, 11, 4, 23, 24, 78, 71, 89, 117, 113, 26, 79, 66, 63, 103, 84, 125, 106, 100, 22, 82, 55, 12, 56, 46, 63, 52, 33, 11, 76, 106, 106, 83, 56, 66, 8, 43, 115, 17, 97, 75};
    }

    private static byte[] kjxqyahivozcoze() {
        return new byte[]{-26, -15, 101, 23, 3, 20, 49, 115, 90, 24, 84, 23, 84, 102, 76, 42, 62, 15, 34, 100, 32, 124, 87, 6};
    }

    private static byte[] veksevkmtplhyrb() {
        return new byte[]{-28, -5, 103, 16, 2, 17, 58, 99, 93, 4, 87, 7, 80, 57, 73, 119};
    }

    private static byte[] qlmjjpvfjxeznzs() {
        return new byte[]{-26, -7, 103, 22, 2, 11, 49, 120, 88, 12, 85, 28, 86, 35, 65, 45, 60, 88};
    }

    private static byte[] fttijwdwjqjbszz() {
        return new byte[]{-18, -16, 103, 17, 0, 18, 58, 118, 88, 12, 92, 12, 81, 106};
    }

    private static int iwtfeasolijuxvst(int i, int i2) {
        return i2 ^ i;
    }
}
