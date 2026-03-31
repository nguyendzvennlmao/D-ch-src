package com.kammoun.donutCore.core.managers;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ConfigurationManager {
    private final JavaPlugin plugin;
    private FileConfiguration config;
    private FileConfiguration messageConfig;
    private FileConfiguration spawnGuiConfig;
    private FileConfiguration afkGuiConfig;
    private FileConfiguration mediaGuiConfig;
    private FileConfiguration helpGuiConfig;
    private FileConfiguration rulesGuiConfig;
    private static int Gp5Afgz6RG = 0;
    private transient int h2A7q7HXWX = 9549765;
    private static String ldhmdggoid;
    private static String[] nothing_to_see_here = new String[19];

    public ConfigurationManager(JavaPlugin javaPlugin, int i) {
        pbaobcwukkbtywge(444531290 ^ 1144319890, 1899650155);
        int parseInt = 2019559175 ^ (349196329 ^ Integer.parseInt("1136780941"));
        this.h2A7q7HXWX = 9549765 ^ Gp5Afgz6RG;
        this.plugin = javaPlugin;
        loadConfigurations(1426911471);
        int i2 = 180632573 ^ (95227134 ^ (2090670897 ^ (1945913422 ^ parseInt)));
    }

    public void loadConfigurations(int i) {
        int i2 = 119223163 ^ (435547320 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1196137491) {
            i2 = 848718000 ^ i2;
            this.config = loadConfig(lnugoblrxv(hkqxbfyxqupqmey(), i2), 1357203171);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -738666094) {
                int i3 = 1571013385 ^ i2;
                this.messageConfig = loadConfig(lnugoblrxv(slakddxyimnqofu(), i3), 1357203171);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1055310296) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1055310296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (665589442 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 191473736 ^ i3;
                    throw new RuntimeException("double");
                }
                int i5 = 932071128 ^ i3;
                this.spawnGuiConfig = loadConfig(lnugoblrxv(rgpjbggwpkwoijd(), i5), 1357203171);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2104166631) {
                    i5 = 155219712 ^ i5;
                    this.afkGuiConfig = loadConfig(lnugoblrxv(uosuvzksorwavby(), i5), 1357203171);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -929607911) {
                        i2 = 590486695 ^ i5;
                        this.mediaGuiConfig = loadConfig(lnugoblrxv(bnvixsxptgmqung(), i2), 1357203171);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -788026848) {
                            i2 = 554814136 ^ i2;
                            this.helpGuiConfig = loadConfig(lnugoblrxv(zxpzlvkyavsctyv(), i2), 1357203171);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -645267487) {
                                int i6 = 1567166881 ^ i2;
                                this.rulesGuiConfig = loadConfig(lnugoblrxv(xljrrxpdgtdtjtw(), i6), 1357203171);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 851538667) {
                                    int i7 = 1925450745 ^ i6;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 851538667 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1806825227 ^ i6)) {
                                        break;
                                    }
                                }
                                int i8 = 1869822089 ^ i6;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2104166631 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2010668535 ^ i5)) {
                        int i9 = 903571213 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -929607911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (32522153 ^ i5)) {
                            break;
                        }
                    }
                }
                int i10 = 225073679 ^ i5;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -645267487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2089986741 ^ i2)) {
                int i11 = 2044429415 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1196137491 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (714417288 ^ i2)) {
                    int i12 = 582778433 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1528746720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1889142311 ^ i2)) {
                        int i13 = 1322912267 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -788026848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1014984939 ^ i2)) {
                            int i14 = 617796961 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -738666094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (420419967 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i15 = 15518806 ^ i2;
        throw new RuntimeException();
    }

    private FileConfiguration loadConfig(String str, int i) {
        int i2 = 1310990623 ^ (1062561679 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1001870984) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1001870984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1014798676 ^ i2)) {
                    break;
                }
            }
            int i3 = 2120621222 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1680588288 ^ i2;
        File file = new File(String.valueOf(this.plugin.getDataFolder()) + "/Core", str);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 451585675) {
            i4 = 433200891 ^ i4;
            if (file.exists() == (2056210986 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -730181293) {
                    i4 = 719505513 ^ i4;
                    this.plugin.saveResource("Core/" + str, (byte) (1349354051 ^ i4));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2090069478) {
                        int i5 = 505239494 ^ i4;
                        return YamlConfiguration.loadConfiguration(file);
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                    case 225830206:
                        int i6 = 889167791 ^ i4;
                        break;
                    case 1180952522:
                    case 1771075880:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 451585675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (84409662 ^ i4)) {
                int i7 = 657510630 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1938205738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (862812005 ^ i4)) {
                    int i8 = 527689161 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2090069478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1247744703 ^ i4)) {
                        int i9 = 1377894389 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -730181293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (821270432 ^ i4)) {
                            int i10 = 244681761 ^ i4;
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @Generated
    public JavaPlugin getPlugin() {
        int i = 367206126 ^ (931002139 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1530253918) {
            int i2 = 550771783 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1530253918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1815452052 ^ i)) {
                int i3 = 1832096070 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1570058341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1430365028 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1542313084 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 624512472 ^ (58142478 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2108787526) {
            int i2 = 273800549 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 12623762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1286868765 ^ i)) {
                int i3 = 1886319177 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2108787526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (24017583 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 235587009 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public FileConfiguration getMessageConfig(int i) {
        int i2 = 817097130 ^ (1637742164 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 961388025) {
            int i3 = 1874363086 ^ i2;
            return this.messageConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 961388025 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1755360389 ^ i2)) {
                int i4 = 1665163371 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1149864842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (279977689 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2048797910 ^ i2;
        throw new IOException();
    }

    @Generated
    public FileConfiguration getSpawnGuiConfig(int i) {
        int i2 = 238381356 ^ (1497483792 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 194542569) {
            int i3 = 312569394 ^ i2;
            return this.spawnGuiConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1634530695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1752150579 ^ i2)) {
                int i4 = 1199580910 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 194542569 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1522435281 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 746710970 ^ i2;
        throw new IOException();
    }

    @Generated
    public FileConfiguration getAfkGuiConfig(int i) {
        int i2 = 836907085 ^ (1313055828 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1295106752) {
            int i3 = 1607411046 ^ i2;
            return this.afkGuiConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1295106752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1336416088 ^ i2)) {
                int i4 = 1148494469 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1287067150 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1718966893 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 240500550 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public FileConfiguration getMediaGuiConfig(int i) {
        int i2 = 1734213179 ^ (2123064609 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2122955483) {
            int i3 = 2138114106 ^ i2;
            return this.mediaGuiConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2063467768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (282253161 ^ i2)) {
                int i4 = 1928066594 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2122955483 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1211243385 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 723653885 ^ i2;
        throw new IOException();
    }

    @Generated
    public FileConfiguration getHelpGuiConfig(int i) {
        int i2 = 958743937 ^ (117364466 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1323432338) {
            int i3 = 2041576637 ^ i2;
            return this.helpGuiConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2086790023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1215680550 ^ i2)) {
                int i4 = 2101713861 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1323432338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1667601440 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 233142189 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public FileConfiguration getRulesGuiConfig(int i) {
        int i2 = 1997499987 ^ (1576078120 ^ 1980214337);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -405911086) {
            int i3 = 420227574 ^ i2;
            return this.rulesGuiConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 799999586 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1964283302 ^ i2)) {
                int i4 = 1272490277 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -405911086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1581561686 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 303495839 ^ i2;
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
        ldhmdggoid = ByteBuffer.wrap(gerfqkbnfhxzvkw()).asCharBuffer().toString();
        Gp5Afgz6RG = (-1723553932) ^ new Random(-112587238112984347L).nextInt();
    }

    public static String lnugoblrxv(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ldhmdggoid.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] hkqxbfyxqupqmey() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 0};
    }

    private static byte[] bnvixsxptgmqung() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 10};
    }

    private static byte[] uosuvzksorwavby() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, 28};
    }

    private static byte[] rgpjbggwpkwoijd() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 44};
    }

    private static byte[] slakddxyimnqofu() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 62};
    }

    private static byte[] zxpzlvkyavsctyv() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, 74};
    }

    private static byte[] xljrrxpdgtdtjtw() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 91};
    }

    private static byte[] gerfqkbnfhxzvkw() {
        return new byte[]{49, 86, 49, 87, 50, 89, 57, 82, 55, 93, 49, 82, 49, 22, 50, 78, 57, 89, 55, 88, 52, 84, 56, 70, 54, 94, 53, 70, 54, 27, 51, 85, 51, 83, 55, 81, 53, 95, 52, 82, 56, 30, 54, 80, 53, 64, 54, 93, 51, 22, 51, 79, 55, 88, 53, 90, 57, 82, 55, 64, 52, 89, 56, 64, 53, 22, 53, 86, 53, 82, 48, 83, 51, 24, 57, 82, 55, 64, 52, 89, 56, 29, 53, 64, 53, 90, 53, 88, 56, 86, 48, 66, 50, 89, 57, 74, 53, 23, 49, 67, 55, 66, 48, 88, 57, 66, 56, 95, 48, 26, 50, 87, 57, 76, 53, 81, 49, 30, 55, 75, 48, 84, 57, 89, 49, 94, 49, 92, 49, 64, 55, 75, 55, 80, 51, 86, 57, 84, 51, 68, 56, 25, 49, 74, 49, 84, 49, 95, 57, 94, 51, 69, 56, 90, 51, 75, 56, 22, 57, 91, 48, 93, 51, 95, 56, 72, 57, 20, 51, 87, 56, 70, 51, 81, 56, 23, 57, 74, 48, 85, 51, 95, 49, 80, 49, 66, 48, 92, 53, 67, 54, 22, 49, 69, 49, 66, 48, 89, 53, 85, 54, 74, 49, 26, 49, 80, 48, 64, 53, 89, 54, 23, 49, 78, 49, 90, 48, 89};
    }

    private static int pbaobcwukkbtywge(int i, int i2) {
        return i ^ i2;
    }
}
