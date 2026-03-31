package com.kammoun.donutCore.settings;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.settings.commands.Settings;
import com.kammoun.donutCore.settings.gui.SettingsGUI;
import com.kammoun.donutCore.settings.listeners.ChainmailRespawnListener;
import com.kammoun.donutCore.settings.listeners.FastCrystalHandler;
import com.kammoun.donutCore.settings.listeners.SettingsHandler;
import com.kammoun.donutCore.settings.listeners.SettingsListener;
import com.kammoun.donutCore.settings.manager.ConfigManager;
import com.kammoun.donutCore.settings.manager.SettingsManager;
import com.kammoun.donutCore.settings.packets.PacketManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class SettingsPlugin extends DonutModule {
    private ConfigManager configManager;
    private SettingsManager settingsManager;
    private SettingsGUI settingsGUI;
    private SettingsHandler settingsHandler;
    private static SettingsPlugin instance;
    private static int rtgbCLWEWx = 0;
    private transient int dOWKe4fSI2 = 1297928101;
    private static String[] nothing_to_see_here = new String[15];

    public SettingsPlugin() {
        super("Settings", 1095143273);
        int i = 635577566 ^ 1918276296;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                case 166623102:
                    int i2 = 1964833685 ^ i;
                    break;
                case 661069775:
                default:
                    throw new IllegalAccessException();
                case 709679299:
                case 1989376848:
                    break;
            }
        }
        int parseInt = 216845696 ^ (130901225 ^ Integer.parseInt("696902890"));
        this.dOWKe4fSI2 = 1297928101 ^ rtgbCLWEWx;
        int i3 = 1116879783 ^ (1962965331 ^ parseInt);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 538392606 ^ (1560500698 ^ 423558448);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 559212451) {
            i2 = 337031615 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2115933605) {
                i2 = 323484307 ^ i2;
                saveConfig(uwqbehohkf(fgcqonvzoyrlynf(), zovbpgawbqkmjnr(), i2), 1620467835);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 467582659) {
                    i2 = 753854836 ^ i2;
                    this.configManager = new ConfigManager(this, 1787244219);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2091513186) {
                        i2 = 392335258 ^ i2;
                        this.settingsGUI = new SettingsGUI(this.api, 1092202545);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -943879758) {
                            i2 = 2001017501 ^ i2;
                            this.settingsManager = new SettingsManager(this, 2989810);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2106940761) {
                                int i3 = 1013607110 ^ i2;
                                registerCommand((KCommand) new Settings(this, 986566851), uwqbehohkf(biktmicyirwfaub(), zovbpgawbqkmjnr(), i3), 800215123);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1631188120) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1631188120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2039970802 ^ i3)) {
                                            break;
                                        }
                                    }
                                    int i4 = 959637142 ^ i3;
                                    throw new IllegalAccessException("double");
                                }
                                int i5 = 100284813 ^ i3;
                                registerEvent(new SettingsListener(this, 2038131486), 1095327048);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1323841792) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1323841792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (524163723 ^ i5)) {
                                            break;
                                        }
                                    }
                                    int i6 = 2034597132 ^ i5;
                                    throw new IllegalAccessException("double");
                                }
                                int i7 = 1469225230 ^ i5;
                                this.settingsHandler = new SettingsHandler(this, 923194050);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 226692978) {
                                    int i8 = 742416552 ^ i7;
                                    registerEvent(this.settingsHandler, 1095327048);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1870662195) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1870662195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1503869477 ^ i8)) {
                                                break;
                                            }
                                        }
                                        int i9 = 333879265 ^ i8;
                                        throw new IllegalAccessException("double");
                                    }
                                    i7 = 1963625757 ^ i8;
                                    registerEvent(this.settingsGUI, 1095327048);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -942382376) {
                                        i2 = 840498985 ^ i7;
                                        registerEvent(new ChainmailRespawnListener(this, 263784156), 1095327048);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1460902801) {
                                            int i10 = 257824680 ^ i2;
                                            registerEvent(new FastCrystalHandler(this, 1001282021), 1095327048);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 769861329) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 769861329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1423678395 ^ i10)) {
                                                        break;
                                                    }
                                                }
                                                int i11 = 111778060 ^ i10;
                                                throw new RuntimeException("double");
                                            }
                                            int i12 = 230047914 ^ i10;
                                            new PacketManager(this, 1589378164).registerAll(1829593214);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1079059329) {
                                                int i13 = 931639222 ^ i12;
                                                return;
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -60006864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (539986589 ^ i12)) {
                                                    int i14 = 1366619528 ^ i12;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1079059329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1357310399 ^ i12)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i15 = 2049890847 ^ i12;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -942382376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2008258028 ^ i7)) {
                                        int i16 = 885050213 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 226692978 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (450287401 ^ i7)) {
                                            break;
                                        }
                                    }
                                }
                                int i17 = 1183458374 ^ i7;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -943879758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1650469306 ^ i2)) {
                int i18 = 1383602355 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 467582659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2047746267 ^ i2)) {
                    int i19 = 664630255 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 559212451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (134124281 ^ i2)) {
                        int i20 = 417859499 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2091513186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2145063771 ^ i2)) {
                            int i21 = 112196422 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2106940761 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (608234775 ^ i2)) {
                                int i22 = 1636410260 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2115933605 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2025608902 ^ i2)) {
                                    int i23 = 1884270073 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1460902801 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (527415303 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i24 = 2128277672 ^ i2;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 700139378 ^ (1180269171 ^ 423558448);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1226440309) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1226440309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1524680585 ^ i2)) {
                    break;
                }
            }
            int i3 = 1383465626 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 663540064 ^ i2;
        if (this.settingsManager == null) {
            int i5 = 350909026 ^ i4;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1971287414) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1971287414 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (78406672 ^ i4)) {
                    break;
                }
            }
            int i6 = 1444510032 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i7 = 2090342044 ^ i4;
        this.settingsManager.saveAllSettings(75663006);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1849704041) {
            int i8 = 1752327422 ^ i7;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1849704041 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (650690851 ^ i7)) {
                int i9 = 1238243750 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 768809370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1915201603 ^ i7)) {
                    break;
                }
            }
        }
        int i10 = 1866136724 ^ i7;
        throw new IOException();
    }

    @Override
    public void reload(int i) {
        int i2;
        int i3;
        int i4 = 953757816 ^ (167106731 ^ 423558448);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1083223833) {
            int i5 = 1695546278 ^ i4;
            if (this.configManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1760522794) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1760522794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1015330034 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 824761266 ^ i5;
                    throw new IOException("double");
                }
                i3 = 1575477794 ^ i5;
                this.configManager.reload(375600402);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2016386248) {
                    i2 = 1133517959 ^ i3;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -393316863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1767875143 ^ i3)) {
                        int i7 = 2096605965 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2016386248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1022685704 ^ i3)) {
                            break;
                        }
                    }
                }
                int i8 = 1055467612 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 511180453 ^ i5;
            if (this.settingsGUI == null) {
                i4 = swaugmilmhvgbnoh(i2, 1943824396);
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1689221374) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1689221374 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (137841675 ^ i2)) {
                            break;
                        }
                    }
                    int i9 = 2066440905 ^ i2;
                    throw new IllegalAccessException("double");
                }
                int i10 = 201571533 ^ i2;
                this.settingsGUI.load(797630875);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -78814870) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -78814870 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1999264441 ^ i10)) {
                            break;
                        }
                    }
                    int i11 = 1367654309 ^ i10;
                    throw new IllegalAccessException("double");
                }
                i4 = 2145375425 ^ i10;
            }
            if (this.settingsHandler == null) {
                int i12 = 249462380 ^ i4;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 95668065) {
                i3 = 497530412 ^ i4;
                this.settingsHandler.reloadConfig(1948272745);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -393316863) {
                    int i13 = 326748224 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -393316863) {
                        int i72 = 2096605965 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2016386248) {
                            break;
                            break;
                        }
                        continue;
                    }
                }
                int i82 = 1055467612 ^ i3;
                throw new IllegalAccessException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 95668065 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1606138472 ^ i4)) {
                int i14 = 209913380 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1083223833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (591360297 ^ i4)) {
                    break;
                }
            }
        }
        int i15 = 1802930180 ^ i4;
        throw new RuntimeException();
    }

    public static boolean isModuleEnabled(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.SettingsPlugin.isModuleEnabled(int):boolean");
    }

    @Generated
    public ConfigManager getConfigManager(int i) {
        int i2 = 711904153 ^ (4139276 ^ 423558448);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1686569687) {
            int i3 = 705656377 ^ i2;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1686569687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1563674583 ^ i2)) {
                int i4 = 13205975 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -888976160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1335837428 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2102694867 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public SettingsManager getSettingsManager(int i) {
        int i2 = 432390350 ^ (795031256 ^ 423558448);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2092980529) {
            int i3 = 1764771471 ^ i2;
            return this.settingsManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2092980529 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (515635883 ^ i2)) {
                int i4 = 315688463 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893545802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1032077695 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 146353918 ^ i2;
        throw new IOException();
    }

    @Generated
    public SettingsGUI getSettingsGUI(int i) {
        int i2 = 1841355433 ^ (1340630427 ^ 423558448);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -659419119) {
            int i3 = 1793308748 ^ i2;
            return this.settingsGUI;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1884302734 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1961173945 ^ i2)) {
                int i4 = 539081517 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -659419119 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1626591906 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 477241001 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public SettingsHandler getSettingsHandler(int i) {
        int i2 = 2039838406 ^ (340509470 ^ 423558448);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1493022909) {
            int i3 = 1706986403 ^ i2;
            return this.settingsHandler;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1963582888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (834071468 ^ i2)) {
                int i4 = 487914109 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1493022909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1143618008 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1321867706 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public static SettingsPlugin getInstance(int i) {
        int i2 = 1281195330 ^ (320019026 ^ (1637470000 ^ 1415721621));
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
        rtgbCLWEWx = (-503846738) ^ new Random(-3945050353338114442L).nextInt();
    }

    public static String uwqbehohkf(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] zovbpgawbqkmjnr() {
        return new byte[]{61, 71, 23, 102, 44, 115, 8, 38, 103, 124, 48, 98, 65, 64, 49, 26, 124, 45, 66, 56, 54, 113, 125, 13, 21, 111, 6, 25, 121, 115, 101, 98, 63, 48, 74, 77, 19, 25, 93, 90, 58, 100, 29, 68, 6, 110, 124, 63, 58, 94};
    }

    private static byte[] fgcqonvzoyrlynf() {
        return new byte[]{-14, -114, 33, 60, 28, 42, 56, 125, 81, 34, 1, 61, 119, 30, 1, 2, 76, 97, 116, 109, 7, 43};
    }

    private static byte[] biktmicyirwfaub() {
        return new byte[]{-16, -117, 37, 44, 27, 36, 59, 107, 80, 59, 3, 57, 120, 25, 3, 78, 69, 105};
    }

    private static int swaugmilmhvgbnoh(int i, int i2) {
        return i2 ^ i;
    }
}
