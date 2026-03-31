package com.kammoun.donutCore.shop;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.shop.commands.Shop;
import com.kammoun.donutCore.shop.listener.ShopListener;
import com.kammoun.donutCore.shop.managers.CategoryManager;
import com.kammoun.donutCore.shop.managers.ConfigManager;
import com.kammoun.donutCore.shop.managers.PurchaseManager;
import com.kammoun.donutCore.shop.utils.VaultHooks;
import com.kammoun.donutCore.stats.StatsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class ShopPlugin extends DonutModule {
    private CategoryManager categoryManager;
    private ConfigManager configManager;
    private PurchaseManager purchaseManager;
    private VaultHooks vaultHooks;
    private final StatsPlugin statsPlugin;
    private static ShopPlugin instance;
    private static int VtsBzLSWPh = 0;

    private transient int f1014PskehCcm3 = 93577470;
    private static byte[] pnfzfipluw;
    private static String[] nothing_to_see_here = new String[15];

    public ShopPlugin(StatsPlugin statsPlugin, int i) {
        super("Shop", 1095143273);
        qamczkifawudibnr(574385644 ^ 1580866120, 891758872);
        int parseInt = 137281237 ^ (197211714 ^ Integer.parseInt("1255069227"));
        this.f1014PskehCcm3 = 93577470 ^ VtsBzLSWPh;
        this.statsPlugin = statsPlugin;
        int i2 = 13338637 ^ (1855268796 ^ (1113530017 ^ parseInt));
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1722526564 ^ (849686452 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 347110513) {
            int i3 = 1257713303 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1124665547) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 136144681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1408887097 ^ i3)) {
                        int i4 = 1258513545 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1124665547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (691120215 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 1557426368 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i6 = 1749162263 ^ i3;
            saveConfig(physjpcnuq(vvzmfcdvykjdbws(), i6), 1620467835);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 18464880) {
                i6 = 198846868 ^ i6;
                saveConfig(physjpcnuq(cwfhjypetkndnhz(), i6), 1620467835);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1606978768) {
                    i2 = 25761262 ^ i6;
                    saveConfig(physjpcnuq(hcpsbwhgmczisrk(), i2), 1620467835);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1400906656) {
                        i6 = 1391028991 ^ i2;
                        saveConfig(physjpcnuq(tzcptldndyviahd(), i6), 1620467835);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -993299366) {
                            i6 = 1192708680 ^ i6;
                            this.configManager = new ConfigManager(this, 1520474996);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -59693544) {
                                i2 = 2122151593 ^ i6;
                                this.categoryManager = new CategoryManager(this, 1744358403);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 261788499) {
                                    i6 = 923013742 ^ i2;
                                    this.categoryManager.loadCategories(473496026);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1212547038) {
                                        i6 = 1097039937 ^ i6;
                                        this.purchaseManager = new PurchaseManager(this.configManager, 1300314197);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1129971160) {
                                            i6 = 378225939 ^ i6;
                                            this.vaultHooks = new VaultHooks();
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 150743728) {
                                                i6 = 1973866726 ^ i6;
                                                getApi(2142241109).getCommand(physjpcnuq(mgwgqtfgvpjgimb(), i6)).setExecutor(new Shop(this, 1465832763));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1513443965) {
                                                    i6 = 446929917 ^ i6;
                                                    getApi(2142241109).getServer().getPluginManager().registerEvents(new ShopListener(this, 1290339320), getApi(2142241109));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1893102187) {
                                                        int i7 = 1327063720 ^ i6;
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1212547038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (195075847 ^ i6)) {
                    int i8 = 1563663730 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -59693544 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (785908109 ^ i6)) {
                        int i9 = 1839103814 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 150743728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1427275913 ^ i6)) {
                            int i10 = 1261972847 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1513443965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1401379701 ^ i6)) {
                                int i11 = 669672575 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1893102187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1338865448 ^ i6)) {
                                    int i12 = 1992653282 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1606978768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (742605339 ^ i6)) {
                                        int i13 = 81603617 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 18464880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1143642960 ^ i6)) {
                                            int i14 = 1627357603 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -993299366 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (771845867 ^ i6)) {
                                                int i15 = 1038501441 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1129971160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1781476395 ^ i6)) {
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
            }
            int i16 = 705722024 ^ i6;
            throw new RuntimeException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 347110513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (970264962 ^ i2)) {
                int i17 = 1901586747 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 261788499 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1060512032 ^ i2)) {
                    int i18 = 394605505 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1400906656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (541791408 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i19 = 1780395254 ^ i2;
        throw new RuntimeException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1075670766 ^ (704580637 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -69776024) {
            int i3 = 511369006 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -69776024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1357057344 ^ i2)) {
                int i4 = 797615937 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 134329368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1387179776 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 219291163 ^ i2;
        throw new IOException();
    }

    @Override
    public void reload(int i) {
        int i2 = 1189538046 ^ (1716760261 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1318163670) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1318163670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (18391218 ^ i2)) {
                    break;
                }
            }
            int i3 = 655207836 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1528640806 ^ i2;
        this.configManager.loadConfig(220994212);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1770504728) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1770504728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (417459053 ^ i4)) {
                    break;
                }
            }
            int i5 = 558921945 ^ i4;
            throw new IOException("double");
        }
        int i6 = 663412371 ^ i4;
        this.categoryManager.reloadCategories(318272833);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1439774337) {
            int i7 = 1909303682 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1439774337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1124458484 ^ i6)) {
                int i8 = 613019516 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -608404846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (44802791 ^ i6)) {
                    break;
                }
            }
        }
        int i9 = 2096799903 ^ i6;
        throw new RuntimeException();
    }

    @Generated
    public CategoryManager getCategoryManager(int i) {
        int i2 = 215656163 ^ (1069843475 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 741690738) {
            int i3 = 1280269018 ^ i2;
            return this.categoryManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 741690738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1381193433 ^ i2)) {
                int i4 = 321490655 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1313840032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (655495653 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 296600130 ^ i2;
        throw new IOException();
    }

    @Generated
    public ConfigManager getConfigManager(int i) {
        int i2 = 1488700294 ^ (1256868488 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 642257539) {
            int i3 = 708306795 ^ i2;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 642257539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (332638505 ^ i2)) {
                int i4 = 3163271 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2012686810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1967325345 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1220067671 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public PurchaseManager getPurchaseManager(int i) {
        int i2 = 470855578 ^ (950346426 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1855441934) {
            int i3 = 534684302 ^ i2;
            return this.purchaseManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1855441934 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1147038801 ^ i2)) {
                int i4 = 777225316 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1872570242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (5913167 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1305001178 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public VaultHooks getVaultHooks(int i) {
        int i2 = 1713243871 ^ (1154773727 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1567098126) {
            int i3 = 862868582 ^ i2;
            return this.vaultHooks;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 971332035 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (626858281 ^ i2)) {
                int i4 = 981504530 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1567098126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1323520075 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1640683359 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public StatsPlugin getStatsPlugin(int i) {
        int i2 = 1131719726 ^ (2060389651 ^ 1989708638);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2031702810) {
            int i3 = 1626753870 ^ i2;
            return this.statsPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2031702810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (693776070 ^ i2)) {
                int i4 = 533641149 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2125138281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1499785287 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1760048777 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public static ShopPlugin getInstance(int i) {
        int i2 = 1675797514 ^ (110177576 ^ (354846121 ^ 1930128288));
        return instance;
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
        pnfzfipluw = xeogervzozuzllh();
        VtsBzLSWPh = (-602082172) ^ new Random(6501343689634030132L).nextInt();
    }

    public static String physjpcnuq(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ pnfzfipluw[i3 % pnfzfipluw.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] xeogervzozuzllh() {
        return new byte[]{10, 78, 84, 68, 75, 33, 18, 96, 55, 89, 75, 15, 20, 52, 94, 93, 43, 55, 87, 65, Byte.MAX_VALUE, 18, 108, 13, 17, 121, 29, 34, 62, 20, 103, 70, 118, 20, 87, 45, 51, 84, 42, 49, 26, 109, 6, 33, 16, 97, 41, 19, 104, 15, 57, 52, 117, 53, 25, 48, 69, 68, 116, 121, 43, 37, 4, 82, 96, 106, 115, 126, 8, 105, 46, 11, 33, 118, 105, 55, 39};
    }

    private static byte[] tzcptldndyviahd() {
        return new byte[]{-59, -123, 108, 17, Byte.MAX_VALUE, 117, 34, 39, 6, 9, 122, 92, 44, 109, 106, 26, 27, 109, 102, 17, 78, 85, 84, 20, 37, 34, 45, 116, 15, 85, 86, 26, 78, 71, 99, 106, 3, 74, 27, 119, 43, 49, 62, 120, 36, 36, 25, 14, 89, 67, 8, 109, 77, 111};
    }

    private static byte[] vvzmfcdvykjdbws() {
        return new byte[]{-58, -126, 100, 31, 122, 113, 34, 38, 4, 12, 115, 89, 37, 107, 108, 28, 27, 102, 102, 21, 79, 83, 95, 18, 41, 45, 44, 124, 12, 67, 87, 83, 71, 86, 103, 119, 0, 11, 18, 112, 43, 115, 52, 107, 32, 52, 24, 78};
    }

    private static byte[] cwfhjypetkndnhz() {
        return new byte[]{-58, -127, 100, 31, 124, 114, 33, 32, 1, 14, 123, 88, 44, 108, 108, 28, 31, 104, 101, 20, 79, 89, 91, 16, 34, 43, 43, Byte.MAX_VALUE, 14, 75, 95, 21, 68, 10, 99, 104, 1, 12, 26, 102, 45, 47, 53, 59, 38, 42, 25, 78, 80, 84};
    }

    private static byte[] mgwgqtfgvpjgimb() {
        return new byte[]{-59, -120, 97, 15, 120, 121, 33, 62, 2, 27};
    }

    private static byte[] hcpsbwhgmczisrk() {
        return new byte[]{-59, -122, 97, 22, 122, 115, 33, 39, 5, 13, 124, 93, 37, 106, 109, 28, 24, 108, 102, 19, 74, 80, 93, 17, 34, 45, 47, 118, 9, 64, 86, 5, 69, 10, 100, 108, 2, 11, 31, 111, 43, 46, 53, 60, 34, 41, 30, 75, 89, 82};
    }

    private static int qamczkifawudibnr(int i, int i2) {
        return i ^ i2;
    }
}
