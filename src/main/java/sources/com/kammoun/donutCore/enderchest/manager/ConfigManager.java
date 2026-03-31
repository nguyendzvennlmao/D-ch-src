package com.kammoun.donutCore.enderchest.manager;

import com.kammoun.donutCore.enderchest.CustomEnderChest;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigManager {
    private final CustomEnderChest plugin;
    private FileConfiguration config;
    private FileConfiguration messages;
    private String guiTitle;
    private boolean showPlayerName;
    private int defaultSize;
    private String prefix;
    private static int rd5t4viGiG = 0;
    private transient int knAFmhehxU = 716941854;
    private static byte[] bjlrciddjd;
    private static String[] nothing_to_see_here = new String[13];

    public ConfigManager(CustomEnderChest customEnderChest, int i) {
        int i2 = 544010104 ^ (650528763 ^ 1944697763);
        int parseInt = 1986185751 ^ (79920414 ^ Integer.parseInt("132293673"));
        this.knAFmhehxU = 716941854 ^ rd5t4viGiG;
        int wnanasqzsxlcajab = 1914989603 ^ wnanasqzsxlcajab(parseInt, 598773171);
        this.plugin = customEnderChest;
        int i3 = 1456311055 ^ wnanasqzsxlcajab;
    }

    public void loadConfigs(int i) {
        int i2 = 1687259205 ^ (1163946471 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -606935293) {
            i2 = 527317803 ^ i2;
            this.config = this.plugin.getConfig(127597628);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 547569243) {
                i2 = 1221594686 ^ i2;
                File file = new File(this.plugin.getDataFolder(44993446), myyhbsgzts(nmqsiduzqpordfx(), i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1713590185) {
                    i2 = 856069590 ^ i2;
                    if (file.exists() == (532872227 ^ i2)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -31989480) {
                            i2 = 59415602 ^ i2;
                            this.plugin.getApi(2142241109).saveResource(myyhbsgzts(ifyupgbecipdnov(), i2), (byte) (474505233 ^ i2));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -498925432) {
                                i2 = 165219635 ^ i2;
                                this.messages = YamlConfiguration.loadConfiguration(file);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1400149744) {
                                    i2 = 1283800500 ^ i2;
                                    loadSettings(1655858949);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -928873294) {
                                        int i3 = 1489085622 ^ i2;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                            case 227137345:
                                i2 = 173248769 ^ i2;
                                break;
                            case 599270116:
                                break;
                            case 2083308067:
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -928873294 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1054331929 ^ i2)) {
                    int i4 = 915539032 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 547569243 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1125219667 ^ i2)) {
                        int i5 = 662424649 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 246391040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (48517686 ^ i2)) {
                            int i6 = 169883414 ^ i2;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1400149744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (783731156 ^ i2)) {
                int i7 = 480554349 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1713590185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (310754311 ^ i2)) {
                    int i8 = 450600377 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -606935293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (542654314 ^ i2)) {
                        int i9 = 1645494403 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -498925432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1643002899 ^ i2)) {
                            int i10 = 547159119 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -31989480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1964413015 ^ i2)) {
                                int i11 = 1461468922 ^ i2;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }

    private void loadSettings(int i) {
        int i2 = 840125849 ^ (1396848537 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -556385775) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -556385775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2105915968 ^ i2)) {
                    break;
                }
            }
            int i3 = 1346263368 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1768558926 ^ i2;
        this.guiTitle = this.config.getString(myyhbsgzts(ezixxgcqdgnkilq(), i4), myyhbsgzts(gclsqivsnbufwbk(), i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1786335134) {
            int i5 = 1714559063 ^ i4;
            this.showPlayerName = this.config.getBoolean(myyhbsgzts(ernmaokdhbgvhoa(), i5), (byte) (880987738 ^ i5));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1542032679) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1542032679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2040398554 ^ i5)) {
                        break;
                    }
                }
                int i6 = 975041366 ^ i5;
                throw new IllegalAccessException("double");
            }
            int i7 = 89486855 ^ i5;
            this.defaultSize = this.config.getInt(myyhbsgzts(sqtbvdizndstikk(), i7), (byte) (836220999 ^ i7));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1900166431) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1900166431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (218051739 ^ i7)) {
                        break;
                    }
                }
                int i8 = 951333010 ^ i7;
                throw new IllegalAccessException("double");
            }
            i4 = 2139343226 ^ i7;
            this.prefix = this.messages.getString(myyhbsgzts(ukswgjpjwhbwxvw(), i4), myyhbsgzts(dsezjbgcpcghrhp(), i4));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1923320114) {
                int i9 = 1572407898 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1923320114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1320138575 ^ i4)) {
                int i10 = 1334106147 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1786335134 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (356755401 ^ i4)) {
                    int i11 = 166301178 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1620321312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1092505404 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i12 = 1360345724 ^ i4;
        throw new RuntimeException();
    }

    public void reloadConfigs(int i) {
        int i2 = 1453116822 ^ (717146381 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 894291657) {
            int i3 = 1606011465 ^ i2;
            this.config = this.plugin.getConfig(127597628);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -930898813) {
                i3 = 1229341282 ^ i3;
                File file = new File(this.plugin.getDataFolder(44993446), myyhbsgzts(hoqajxqrlzbwcdp(), i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2102292591) {
                    i3 = 154065563 ^ i3;
                    this.messages = YamlConfiguration.loadConfiguration(file);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -876127415) {
                        i2 = 1562736091 ^ i3;
                        loadSettings(1655858949);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 585954707) {
                            int i4 = 2121602729 ^ i2;
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2102292591 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (563614541 ^ i3)) {
                    int i5 = 340345072 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -930898813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2019226923 ^ i3)) {
                        int i6 = 749082102 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -876127415 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (290631329 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 1059187932 ^ i3;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 585954707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1795069052 ^ i2)) {
                int i8 = 2060344736 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 894291657 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (811501837 ^ i2)) {
                    break;
                }
            }
        }
        int i9 = 1405441404 ^ i2;
        throw new IOException("double");
    }

    public String getMessage(String str, int i) {
        int i2 = 928473241 ^ (1616185314 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1817104840) {
            return this.messages.getString(str, myyhbsgzts(bgnkfpsdsecttzh(), 1286018147 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1817104840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1509671771 ^ i2)) {
                int i3 = 430041074 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 158757586 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1187793955 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 374176353 ^ i2;
        throw new RuntimeException();
    }

    public String getMessageWithPrefix(String str, int i) {
        int i2 = 1911923290 ^ (688868283 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 327853336) {
            int i3 = 174886961 ^ i2;
            return this.prefix + " " + getMessage(str, 330977111);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 327853336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1925606598 ^ i2)) {
                int i4 = 748162076 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1089348752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1829134825 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 967831534 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public CustomEnderChest getPlugin() {
        int i = 1887747463 ^ (1937249614 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -877089702) {
            int i2 = 1473944143 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1970044448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (214710078 ^ i)) {
                int i3 = 30416045 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -877089702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1265910235 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1175379759 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 1737986988 ^ (2022707102 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 744557442) {
            int i2 = 2079312463 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -216049159 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1921207401 ^ i)) {
                int i3 = 15135936 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 744557442 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2124984912 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 253065290 ^ i;
        throw new IOException();
    }

    @Generated
    public FileConfiguration getMessages() {
        int i = 1073584590 ^ (331809045 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1249301301) {
            int i2 = 75068767 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1774025165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1552082604 ^ i)) {
                int i3 = 1630722270 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1249301301 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1216432598 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2044795364 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getGuiTitle(int i) {
        int i2 = 625729249 ^ (1797956217 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1487532336) {
            int i3 = 1002865388 ^ i2;
            return this.guiTitle;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2036472241 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1966780993 ^ i2)) {
                int i4 = 1079279625 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1487532336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (262696867 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2110004747 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isShowPlayerName() {
        int i = 353664914 ^ (1599262600 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2039977280) {
            int i2 = 1309898133 ^ i;
            return this.showPlayerName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2039977280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (564430898 ^ i)) {
                int i3 = 723359559 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -151796118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1697983595 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1625889437 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getDefaultSize(int i) {
        int i2 = 944123060 ^ (2060755268 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1060534896) {
            int i3 = 362577468 ^ i2;
            return this.defaultSize;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1060534896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1788021249 ^ i2)) {
                int i4 = 2121970030 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1814721648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (821075055 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 619938216 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getPrefix() {
        int i = 309628877 ^ (312981235 ^ 1519107394);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -758897694) {
            int i2 = 1245926290 ^ i;
            return this.prefix;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2132885648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1875806864 ^ i)) {
                int i3 = 972382465 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -758897694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (312900560 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1622790011 ^ i;
        throw new RuntimeException();
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
        bjlrciddjd = wpxvlosjqeyoccp();
        rd5t4viGiG = (-2106269657) ^ new Random(4457524262129968713L).nextInt();
    }

    public static String myyhbsgzts(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ bjlrciddjd[i3 % bjlrciddjd.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] wpxvlosjqeyoccp() {
        return new byte[]{109, 104, 91, 44, 86, 37, 3, 110, 14, 101, 62, 91, 51, 71, 91, Byte.MAX_VALUE, 12, 65};
    }

    private static byte[] ifyupgbecipdnov() {
        return new byte[]{-89, -96, 111, 90, 102, 101, 49, 46, 61, 37, 9, 0, 6, 26, 110, 8, 63, 28, 89, 59, 111, 124, 102, 98, 49, 30, 61, 57, 9, 10, 6, 4, 110, 57, 63, 93, 89, 50, 111, 124, 102, 99, 49, 46, 61, 48, 9, 8, 6, 18, 110, 62, 63, 92, 89, 38, 111, 116, 102, 124};
    }

    private static byte[] nmqsiduzqpordfx() {
        return new byte[]{-92, -94, 106, 113, 96, 121, 53, 37, 59, 33, 11, 11, 3, 22, 98, 44, 52, 7, 90, 115, 106, 101, 96, 113, 53, 58};
    }

    private static byte[] ezixxgcqdgnkilq() {
        return new byte[]{-94, -92, 99, 124, 101, 98, 51, 63, 58, Byte.MAX_VALUE, 15, 28, 11, 25, 104, 57, 60, 21, 89, 57};
    }

    private static byte[] gclsqivsnbufwbk() {
        return new byte[]{-94, -92, 99, 61, 101, 33, 51, 19, 58, 63, 15, 12, 11, 21, 104, 63, 60, 58, 89, 52, 106, 122, 110, 97, 48, 40, 62, 125, 10, 66, 2, 84, 99, 51, 63, 3, 93, 60, 111, 121, 103, 111, 59, 60, 61, 37, 14, 30};
    }

    private static byte[] ukswgjpjwhbwxvw() {
        return new byte[]{-94, -92, 106, 104, 103, 98, 53, 51, 61, 59, 15, 1, 2, 11};
    }

    private static byte[] dsezjbgcpcghrhp() {
        return new byte[]{-94, -92, 106, 62, 103, 40, 53, 13, 61, 123, 15, 94, 2, 48, 106, 63, 58, 10, 94, 36, 106, 112, 103, 124, 50, 30, 56, 30, 13, 69, 2, 76, 106, 22};
    }

    private static byte[] ernmaokdhbgvhoa() {
        return new byte[]{-85, -81, 107, 114, 110, 103, 52, 52, 55, 115, 6, 24, 10, 23, 108, 39, 63, 15, 85, 15, 107, 101, 110, 126, 52, 60, 55, 36, 6, 14, 10, 13, 108, 23, 63, 22, 85, 49, 107, 120, 110, 119};
    }

    private static byte[] sqtbvdizndstikk() {
        return new byte[]{-85, -92, 109, 122, 100, 113, 51, 58, 62, 60, 13, 24, 1, 25, 106, 59, 62, 46, 85, 40, 109, 119, 100, 110, 51, 57};
    }

    private static byte[] hoqajxqrlzbwcdp() {
        return new byte[]{-85, -90, 107, 120, 99, 117, 49, 40, 62, 46, 15, 10, 10, 21, 110, 40, 57, 2, 85, 119, 107, 108, 99, 125, 49, 55};
    }

    private static byte[] bgnkfpsdsecttzh() {
        return new byte[0];
    }

    private static int wnanasqzsxlcajab(int i, int i2) {
        return i ^ i2;
    }
}
