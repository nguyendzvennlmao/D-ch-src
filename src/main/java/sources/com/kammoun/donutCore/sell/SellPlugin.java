package com.kammoun.donutCore.sell;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.sell.commands.SellCommand;
import com.kammoun.donutCore.sell.config.ConfigManager;
import com.kammoun.donutCore.sell.database.SellDB;
import com.kammoun.donutCore.sell.listener.CategoryMenuListener;
import com.kammoun.donutCore.sell.listener.PlayerJoin;
import com.kammoun.donutCore.sell.listener.SellMenuListener;
import com.kammoun.donutCore.sell.managers.CategoryMenuManager;
import com.kammoun.donutCore.sell.managers.PlayerManager;
import com.kammoun.donutCore.sell.menus.SellHistory;
import com.kammoun.donutCore.sell.menus.SellMenu;
import com.kammoun.donutCore.sell.menus.WorthMenu;
import com.kammoun.donutCore.sell.packet.WorthPacket;
import com.kammoun.donutCore.stats.StatsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class SellPlugin extends DonutModule {
    private static SellPlugin instance;
    private SellDB sellDB;
    private PlayerManager playerManager;
    private SellMenu sellMenu;
    private ConfigManager configManager;
    private SellHistory sellHistory;
    private CategoryMenuManager categoryMenuManager;
    private WorthPacket worthPacket;
    private WorthMenu worthMenu;
    private final StatsPlugin statsPlugin;
    private boolean sellMultiplierEnabled;
    private static int UyqfkYflRK = 0;
    private transient int yCeNsAbbnl = 659329808;
    private static String[] nothing_to_see_here = new String[17];

    public SellPlugin(com.kammoun.donutCore.stats.StatsPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.SellPlugin.<init>(com.kammoun.donutCore.stats.StatsPlugin, int):void");
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1723543880 ^ (94045469 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 338996497) {
            int i3 = 986392204 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1033004688) {
                int i4 = 1988753461 ^ i3;
                saveConfig(ekshyidnen(prwiebqwheeeqeh(), xutjpluwuztyzte(), i4), 1620467835);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1981962459) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1981962459 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1603632802 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1680038533 ^ i4;
                    throw new IOException("double");
                }
                int i6 = 1191904087 ^ i4;
                saveConfig(ekshyidnen(qoijdtvzkqjaqmw(), xutjpluwuztyzte(), i6), 1620467835);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1316635233) {
                    int i7 = 1372206737 ^ i6;
                    saveConfig(ekshyidnen(xpvgetorwuontmr(), xutjpluwuztyzte(), i7), 1620467835);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1070860565) {
                        int i8 = 355908727 ^ i7;
                        saveConfig(ekshyidnen(wsdbksqqvvarzum(), xutjpluwuztyzte(), i8), 1620467835);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1771967827) {
                            int i9 = 488332680 ^ i8;
                            saveConfig(ekshyidnen(cbberiionfuylum(), xutjpluwuztyzte(), i9), 1620467835);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -2126186221) {
                                i2 = 175745555 ^ i9;
                                saveConfig(ekshyidnen(bbodjpygpcwrrbv(), xutjpluwuztyzte(), i2), 1620467835);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -762730101) {
                                    int i10 = 2044088176 ^ i2;
                                    saveConfig(ekshyidnen(jktpznbhnqkaifc(), xutjpluwuztyzte(), i10), 1620467835);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 473682440) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 473682440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (867278745 ^ i10)) {
                                                break;
                                            }
                                        }
                                        int i11 = 1777394681 ^ i10;
                                        throw new IOException("double");
                                    }
                                    i7 = 1705651393 ^ i10;
                                    saveConfig(ekshyidnen(clpgwwlciablhiq(), xutjpluwuztyzte(), i7), 1620467835);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 829076483) {
                                        int i12 = 1614139809 ^ i7;
                                        saveConfig(ekshyidnen(ahprmswrikgyopl(), xutjpluwuztyzte(), i12), 1620467835);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 818166024) {
                                            int i13 = 284569223 ^ i12;
                                            this.sellMultiplierEnabled = getConfig(127597628).getBoolean(ekshyidnen(qhhnnolcecbveln(), xutjpluwuztyzte(), i13), (byte) (384739751 ^ i13));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1217049296) {
                                                i6 = 359034143 ^ i13;
                                                this.sellDB = new SellDB(this, 267686524);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 474359240) {
                                                    i12 = 721802667 ^ i6;
                                                    this.playerManager = new PlayerManager();
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1147701393) {
                                                        int i14 = 1700244996 ^ i12;
                                                        this.sellMenu = new SellMenu(this.api, 1522262427);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != 1859516594) {
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1859516594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (774409585 ^ i14)) {
                                                                    break;
                                                                }
                                                            }
                                                            int i15 = 23567076 ^ i14;
                                                            throw new IllegalAccessException("double");
                                                        }
                                                        i9 = 1445056963 ^ i14;
                                                        this.configManager = new ConfigManager(this.api, 881738401);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -539265368) {
                                                            i13 = 753707119 ^ i9;
                                                            this.sellHistory = new SellHistory(this.api, this, 1738799992);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1195493935) {
                                                                int i16 = 880632482 ^ i13;
                                                                this.categoryMenuManager = new CategoryMenuManager(this, 434403153);
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) != 458563776) {
                                                                    while (true) {
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 458563776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (1386695900 ^ i16)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    int i17 = 2005316414 ^ i16;
                                                                    throw new IOException("double");
                                                                }
                                                                i6 = 28463072 ^ i16;
                                                                this.worthMenu = new WorthMenu(this.api, this, 2086159624);
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 382164928) {
                                                                    i13 = 2077005148 ^ i6;
                                                                    this.api.getServer().getPluginManager().registerEvents(new PlayerJoin(this, 1875986166), this.api);
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -928778973) {
                                                                        i6 = 1212586660 ^ i13;
                                                                        this.api.getServer().getPluginManager().registerEvents(new SellMenuListener(this, 736412258), this.api);
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1969807359) {
                                                                            i3 = 282107941 ^ i6;
                                                                            this.api.getServer().getPluginManager().registerEvents(new CategoryMenuListener(this, 523526450), this.api);
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 202514729) {
                                                                                i8 = 1842173972 ^ i3;
                                                                                if (this.sellMultiplierEnabled == (1280252977 ^ i8)) {
                                                                                    i12 = yksqtrdkihtgpcrh(i8, 2061129126);
                                                                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1652089226) {
                                                                                    i2 = 1831589865 ^ i8;
                                                                                    this.api.getCommand(ekshyidnen(occqxnjbdsewqig(), xutjpluwuztyzte(), i2)).setExecutor(new SellCommand(this, 278108655));
                                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 187064001) {
                                                                                        i12 = 401703503 ^ i2;
                                                                                    }
                                                                                }
                                                                                SellCommand sellCommand = new SellCommand(this, 278108655);
                                                                                String[] strArr = new String[(byte) (915753364 ^ i12)];
                                                                                strArr[(byte) (915753367 ^ i12)] = ekshyidnen(phpolvbbqvtsdxw(), xutjpluwuztyzte(), i12);
                                                                                strArr[(byte) (915753366 ^ i12)] = ekshyidnen(cwjbcnjheehbidb(), xutjpluwuztyzte(), i12);
                                                                                strArr[(byte) (915753365 ^ i12)] = ekshyidnen(ohssxkfeghehdbx(), xutjpluwuztyzte(), i12);
                                                                                registerCommand(sellCommand, strArr, 641726055);
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1263907655) {
                                                                                    i13 = 1397606766 ^ i12;
                                                                                    this.worthPacket = new WorthPacket();
                                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 784598987) {
                                                                                        int i18 = 459708591 ^ i13;
                                                                                        this.worthPacket.register(this.api, this, 552914795);
                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) != -168770893) {
                                                                                            while (true) {
                                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == -168770893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (427227134 ^ i18)) {
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            int i19 = 2117066766 ^ i18;
                                                                                            throw new RuntimeException("double");
                                                                                        }
                                                                                        i8 = 1020371189 ^ i18;
                                                                                        loadOnlinePlayers(942618743);
                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 327009562) {
                                                                                            int i20 = 883075368 ^ i8;
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
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1195493935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1466438159 ^ i13)) {
                                                    int i21 = 765751611 ^ i13;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1217049296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1373860366 ^ i13)) {
                                                        int i22 = 701872438 ^ i13;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 784598987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (462345897 ^ i13)) {
                                                            int i23 = 1416245987 ^ i13;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -928778973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (2086589256 ^ i13)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            int i24 = 272939577 ^ i13;
                                            throw new IllegalAccessException();
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 818166024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1644011491 ^ i12)) {
                                                int i25 = 209865311 ^ i12;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1147701393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (2140110050 ^ i12)) {
                                                    int i26 = 1167737448 ^ i12;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1263907655 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (112559809 ^ i12)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        int i27 = 124418873 ^ i12;
                                        throw new IOException("double");
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -2126186221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1134354204 ^ i9)) {
                                    int i28 = 879542058 ^ i9;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -539265368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (73319547 ^ i9)) {
                                        break;
                                    }
                                }
                            }
                            int i29 = 1194820318 ^ i9;
                            throw new RuntimeException("double");
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 327009562 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1864291867 ^ i8)) {
                                int i30 = 690462772 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1652089226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (19092830 ^ i8)) {
                                    int i31 = 11226870 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1771967827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1760319702 ^ i8)) {
                                        int i32 = 582940981 ^ i8;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1234662309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (403694095 ^ i8)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i33 = 433797908 ^ i8;
                        throw new IOException("double");
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1070860565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1409665222 ^ i7)) {
                            int i34 = 84506317 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 829076483 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2064490915 ^ i7)) {
                                break;
                            }
                        }
                    }
                    int i35 = 1793353663 ^ i7;
                    throw new IllegalAccessException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 382164928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (667029166 ^ i6)) {
                        int i36 = 591555611 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1316635233 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1085553308 ^ i6)) {
                            int i37 = 293413544 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 474359240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1706595219 ^ i6)) {
                                int i38 = 2118406488 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1969807359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1633707834 ^ i6)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i39 = 1772891464 ^ i6;
                throw new IOException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 202514729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (448502590 ^ i3)) {
                    int i40 = 2002196709 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1033004688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1403174901 ^ i3)) {
                        break;
                    }
                }
            }
            int i41 = 562800506 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 187064001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1029156576 ^ i2)) {
                int i42 = 499396920 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -762730101 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1301974844 ^ i2)) {
                    int i43 = 530085988 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 338996497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1617181046 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i44 = 1849830372 ^ i2;
        throw new IOException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1975573696 ^ (515974836 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1429920793) {
            i2 = 262002348 ^ i2;
            this.sellDB.saveAll(this.playerManager.getSellPlayers(858772414).values(), 729062920);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 701786489) {
                int i3 = 2035421146 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1429920793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1778417623 ^ i2)) {
                int i4 = 244664079 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 701786489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1677766895 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 390680146 ^ i2;
        throw new IOException();
    }

    @Override
    public void reload(int i) {
        int i2 = 1656080920 ^ (1366131820 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1812497381) {
            i2 = 648093196 ^ i2;
            this.sellDB.saveAll(this.playerManager.getSellPlayers(858772414).values(), 729062920);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1493201798) {
                int i3 = 1839504010 ^ i2;
                this.playerManager.getSellPlayers(858772414).clear();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -874817495) {
                    i3 = 470762452 ^ i3;
                    loadOnlinePlayers(942618743);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 731989641) {
                        int i4 = 2074247621 ^ i3;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -874817495 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (590563140 ^ i3)) {
                        int i5 = 835778282 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -155891550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (549194618 ^ i3)) {
                            int i6 = 1841133694 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 731989641 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (275623354 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i7 = 1592904357 ^ i3;
                throw new IOException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1812497381 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1100070266 ^ i2)) {
                int i8 = 799898545 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1493201798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1862259021 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 530548201 ^ i2;
        throw new IOException("double");
    }

    private void loadOnlinePlayers(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.SellPlugin.loadOnlinePlayers(int):void");
    }

    @Generated
    public SellDB getSellDB(int i) {
        int i2 = 31226091 ^ (1689407206 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 642039761) {
            int i3 = 675195683 ^ i2;
            return this.sellDB;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1739712200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1527974471 ^ i2)) {
                int i4 = 369646283 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 642039761 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1505263201 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1201631043 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public PlayerManager getPlayerManager(int i) {
        int i2 = 1849686985 ^ (166438612 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 865593169) {
            int i3 = 643884155 ^ i2;
            return this.playerManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 865593169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (935932610 ^ i2)) {
                int i4 = 496902035 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 9487496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1593750286 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 596059710 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public SellMenu getSellMenu(int i) {
        int i2 = 1222175198 ^ (2120586478 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1193351621) {
            int i3 = 382494275 ^ i2;
            return this.sellMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 247321635 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (197787827 ^ i2)) {
                int i4 = 968346113 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1193351621 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (140558691 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1089870298 ^ i2;
        throw new IOException();
    }

    @Generated
    public ConfigManager getConfigManager(int i) {
        int i2 = 1182599756 ^ (1600172266 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -975644022) {
            int i3 = 2025836609 ^ i2;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -975644022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (597044203 ^ i2)) {
                int i4 = 787107134 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2513025 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (665309119 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1563225539 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public SellHistory getSellHistory(int i) {
        int i2 = 145575912 ^ (1862388084 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 810629977) {
            int i3 = 1800075268 ^ i2;
            return this.sellHistory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 810629977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (326203737 ^ i2)) {
                int i4 = 94803560 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1778842490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (406934631 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1531372905 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public CategoryMenuManager getCategoryMenuManager(int i) {
        int i2 = 204691235 ^ (309761251 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -15003206) {
            int i3 = 1331278574 ^ i2;
            return this.categoryMenuManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2049538360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1468305386 ^ i2)) {
                int i4 = 732680441 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -15003206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2133676665 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1603703509 ^ i2;
        throw new IOException();
    }

    @Generated
    public WorthPacket getWorthPacket() {
        int i = 1588091695 ^ (118575186 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1057139632) {
            int i2 = 1509796668 ^ i;
            return this.worthPacket;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 252710322 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (463672611 ^ i)) {
                int i3 = 1133470005 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1057139632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (133542000 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 249425519 ^ i;
        throw new IOException();
    }

    @Generated
    public WorthMenu getWorthMenu(int i) {
        int i2 = 275481339 ^ (1867839563 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -187770311) {
            int i3 = 415544396 ^ i2;
            return this.worthMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -187770311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1811451843 ^ i2)) {
                int i4 = 1335185308 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 854292569 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1467562179 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 339826376 ^ i2;
        throw new IOException();
    }

    @Generated
    public StatsPlugin getStatsPlugin(int i) {
        int i2 = 2129643955 ^ (1693162229 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -585656950) {
            int i3 = 1330670517 ^ i2;
            return this.statsPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1483421664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1097266497 ^ i2)) {
                int i4 = 42175035 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -585656950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (39421076 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2053931529 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isSellMultiplierEnabled(int i) {
        int i2 = 916231783 ^ (1187949692 ^ 1101439479);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1885020319) {
            int i3 = 2014283194 ^ i2;
            return this.sellMultiplierEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1339617970 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1683573713 ^ i2)) {
                int i4 = 181309319 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1885020319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (303080044 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1431287819 ^ i2;
        throw new IOException();
    }

    @Generated
    public static SellPlugin getInstance(int i) {
        int i2 = 1776533464 ^ (30245232 ^ (676864028 ^ 1726624487));
        return instance;
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
        UyqfkYflRK = (-1944816424) ^ new Random(5275986977050712321L).nextInt();
    }

    public static String ekshyidnen(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] xutjpluwuztyzte() {
        return new byte[]{50, 84, 26, 46, 13, 110, 76, 77, 84, 42, 32, 126, 21, 67, 71, 41, 8, 15, 66, 58, 17, 72, 40, 17, 107, 117, 34, 87, 115, 51, 35, 122, 126, 68, 60, 87, 11, 39, 122, 42, 126, 46, 64, 113, 34, 8, 103, 52, 66, 96, 99, 42, 92, 69, 100, 31, 48, 111, 8, 4, 69, 34, 2, 80, 11, 100, 93, 123, 92, 104, 27, 40, 91};
    }

    private static byte[] wsdbksqqvvarzum() {
        return new byte[]{-3, -109, 41, 91, 60, 43, 116, 19, 101, 57, 17, 53, 38, 94, 118, 84, 48, 77, 115, 98, 32, 4, 27, 74, 90, 53, 26, 12, 66, 110, 18, 39, 77, 4, 13, 72, 51, 115, 75, 108, 79, 121, 115, 51, 19, 75, 95, 45, 115, 45, 82, Byte.MAX_VALUE, 111, 27};
    }

    private static byte[] qhhnnolcecbveln() {
        return new byte[]{-1, -109, 46, 106, 62, 50, 123, 20, 100, 117, 24, 103, 34, 29, 126, 107, 61, 83, 113, 118, 37, 22, 27, 88, 92, 44, 18, 13, 75, 98, 20, 59, 71, 93, 9, 2, 56, 113, 78, 124, 77, 117, 119, 40, 18, 94, 95, 100};
    }

    private static byte[] phpolvbbqvtsdxw() {
        return new byte[]{-11, -102, 47, 110, 56, 50, Byte.MAX_VALUE, 9, 99, 103, 17, 35};
    }

    private static byte[] cwjbcnjheehbidb() {
        return new byte[]{-11, -102, 47, 106, 56, 56, Byte.MAX_VALUE, 23, 99, Byte.MAX_VALUE};
    }

    private static byte[] ohssxkfeghehdbx() {
        return new byte[]{-11, -102, 47, 106, 56, 56, Byte.MAX_VALUE, 23, 99, Byte.MAX_VALUE, 17, 35, 34, 31, 116, 105, 62, 76, 123, 100, 36, 13, 29, 91};
    }

    private static byte[] jktpznbhnqkaifc() {
        return new byte[]{-7, -110, 40, 88, 61, 40, 124, 17, 97, 52, 18, 60, 37, 95, 119, 81, 61, 67, 112, 103, 33, 15, 24, 77, 94, 60, 16, 10, 67, 105, 19, 42, 75, 15, 14, 73, 59, 123, 74, 109, 75, 114, 114, 51, 18, 21, 87, 120, 119, 52, 81, 119};
    }

    private static byte[] clpgwwlciablhiq() {
        return new byte[]{-3, -100, 43, 93, 63, 47, 123, 22, 109, 59, 17, 58, 36, 88, 117, 80, 63, 72, 123, 96, 32, 11, 25, 76, 89, 49, 21, 9, 74, 108, 18, 40, 79, 2, 14, 76, 60, 123, 67, 125, 79, 109, 113, 48, 16, 78, 80, 103, 123, 58, 82, 51, 109, 8, 86, 70, 7, 49};
    }

    private static byte[] qoijdtvzkqjaqmw() {
        return new byte[]{-5, -101, 43, 93, 56, 43, Byte.MAX_VALUE, 21, 98, 58, 16, 60, 33, 89, 119, 87, 57, 76, 117, 102, 32, 8, 29, 72, 88, 52, 20, 12, 67, 107, 23, 42, 78, 5, 13, 78, 60, 117, 75, 114, 75, 113, 115, 35, 20, 84, 87, 118, 118, 123, 83, 96, 109, 30, 83, 67};
    }

    private static byte[] bbodjpygpcwrrbv() {
        return new byte[]{-2, -101, 47, 91, 60, 47, 126, 23, 108, 56, 18, 61, 32, 94, 118, 80, 58, 73, 122, 99, 35, 12, 29, 74, 90, 49, 16, 8, 75, 111, 17, 47, 75, 4, 13, 76, 57, 121, 66, 112, 76, 124, 117, 109, 19, 69, 85, 106, 122, 57};
    }

    private static byte[] xpvgetorwuontmr() {
        return new byte[]{-2, -101, 43, 90, 59, 41, 122, 20, 99, 58, 18, 61, 36, 95, 113, 86, 62, 74, 117, 97, 35, 12, 25, 75, 93, 55, 20, 11, 68, 109, 17, 47, 79, 5, 10, 74, 61, 117, 77, 114, 76, 113, 113, 41, 20, 20, 81, 125, 117, 58, 81, 118};
    }

    private static byte[] prwiebqwheeeqeh() {
        return new byte[]{-3, -109, 47, 81, 62, 46, 116, 20, 96, 62, 17, 53, 32, 84, 116, 81, 48, 74, 118, 101, 32, 4, 29, 64, 88, 48, 26, 11, 71, 105, 18, 39, 75, 14, 15, 77, 51, 118, 78, 107, 79, 123, 117, 38, 17, 79, 95, 42, 118, 42, 82, Byte.MAX_VALUE, 105, 17};
    }

    private static byte[] occqxnjbdsewqig() {
        return new byte[]{-7, -99, 42, 111, 56, 56, 117, 16, 102, 115, 22, 35, 39, 3, 116, 124, 57, 73, 119, 101};
    }

    private static byte[] ahprmswrikgyopl() {
        return new byte[]{-3, -101, 40, 91, 58, 43, 123, 17, 103, 60, 16, 63, 39, 91, 119, 83, 61, 73, 115, 102, 35, 14, 31, 72, 92, 48, 17, 10, 67, 104, 17, 40, 78, 1, 9, 75, 58, 103, 72, 119, 73, 106, 119, 45, 17, 86, 87, 104, 112, 36, 83, 51, 105, 15, 85, 66, 2, 49};
    }

    private static byte[] cbberiionfuylum() {
        return new byte[]{-3, -109, 34, 88, 58, 42, 124, 23, 99, 61, 17, 53, 45, 93, 112, 85, 56, 73, 117, 102, 32, 4, 16, 73, 92, 52, 18, 8, 68, 106, 18, 39, 70, 7, 11, 73, 59, 114, 77, 115, 79, 101, 120, 40, 21, 23, 87, 126, 117, 61, 82, 126};
    }

    private static int yksqtrdkihtgpcrh(int i, int i2) {
        return i ^ i2;
    }
}
