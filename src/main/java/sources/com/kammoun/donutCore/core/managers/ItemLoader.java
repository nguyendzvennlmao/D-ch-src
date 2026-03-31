package com.kammoun.donutCore.core.managers;

import com.kammoun.donutCore.core.CorePlugin;
import com.kammoun.donutCore.core.models.ItemConfig;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;

public class ItemLoader {
    private final CorePlugin plugin;
    private final HashMap<String, ItemConfig> helpConfig;
    private final HashMap<String, ItemConfig> mediaConfig;
    private final HashMap<String, ItemConfig> rulesConfig;
    private static int BJsLtpfSqG = 0;
    private transient int zJG2bRQsTu = 1372264932;
    private static byte[] gikohzppxh;
    private static String[] nothing_to_see_here = new String[18];

    public ItemLoader(CorePlugin corePlugin, int i) {
        ofohgdeipmgxviox(644975330 ^ 1247376417, 1241733701);
        int parseInt = 1966173879 ^ (1342518092 ^ Integer.parseInt("52427133"));
        this.zJG2bRQsTu = 1372264932 ^ BJsLtpfSqG;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 167028968:
                    parseInt = 1232532665 ^ parseInt;
                    break;
                case 572856611:
                default:
                    throw new IOException();
                case 648672873:
                    break;
                case 1818325179:
            }
        }
        this.helpConfig = new HashMap<>();
        this.mediaConfig = new HashMap<>();
        this.rulesConfig = new HashMap<>();
        this.plugin = corePlugin;
        int i2 = 1651682497 ^ (1507113869 ^ (396358778 ^ (50844949 ^ (2070269650 ^ parseInt))));
    }

    public void loadHelpItems(int i) {
        int i2 = 1383743 ^ (1602518141 ^ 925341437);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1169669627) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1169669627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1543554219 ^ i2)) {
                    break;
                }
            }
            int i3 = 961439448 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 856880656 ^ i2;
        FileConfiguration helpGuiConfig = this.plugin.getConfigurationManager(2125977720).getHelpGuiConfig(1912967603);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -585101958) {
            i4 = 660780936 ^ i4;
            helpGuiConfig.getConfigurationSection(ycuxejurnl(bskyblhlapwgixw(), i4)).getKeys((byte) (2093397543 ^ i4)).forEach(str -> {
                int i5 = 455732171 ^ (1499371302 ^ 925341437);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1433972605) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1433972605 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1692960733 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 684058246 ^ i5;
                    throw new IOException("double");
                }
                int i7 = 743145922 ^ i5;
                String str = "items." + str;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -925147502) {
                    i7 = 98183432 ^ i7;
                    Material valueOf = Material.valueOf(helpGuiConfig.getString(str + ".material"));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -435546414) {
                        int i8 = 1798284974 ^ i7;
                        String string = helpGuiConfig.getString(str + ".displayName");
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1082711135) {
                            i7 = 741132321 ^ i8;
                            List stringList = helpGuiConfig.getStringList(str + ".lore");
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -569285976) {
                                i8 = 1880855289 ^ i7;
                                String string2 = helpGuiConfig.getString(str + ".command");
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1590556003) {
                                    i7 = 20180017 ^ i8;
                                    int i9 = helpGuiConfig.getInt(str + ".slot");
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1465029867) {
                                        i7 = 996422472 ^ i7;
                                        ItemConfig itemConfig = new ItemConfig(str, valueOf, string, stringList, i9, string2, 1650629224);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1938616662) {
                                            i7 = 53533586 ^ i7;
                                            this.helpConfig.put(str, itemConfig);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1779051974) {
                                                int i10 = 536419952 ^ i7;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1590556003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1680348431 ^ i8)) {
                                int i11 = 109132393 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1782391226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (848697668 ^ i8)) {
                                    int i12 = 1739592388 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1082711135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (650242383 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i13 = 1661431359 ^ i8;
                        throw new IOException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1938616662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1286007473 ^ i7)) {
                        int i14 = 119046384 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1779051974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (695171701 ^ i7)) {
                            int i15 = 1085008266 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1465029867 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (777262800 ^ i7)) {
                                int i16 = 838268032 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -569285976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1262709796 ^ i7)) {
                                    int i17 = 1490095932 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -925147502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (518654223 ^ i7)) {
                                        int i18 = 1938253518 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -435546414 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (524239919 ^ i7)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i19 = 1016634219 ^ i7;
                throw new RuntimeException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -432688837) {
                int i5 = 780011493 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -585101958 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1364801452 ^ i4)) {
                int i6 = 1856296170 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -432688837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1449845161 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 2044724129 ^ i4;
        throw new RuntimeException();
    }

    public void loadMediaItems(int i) {
        int i2 = 2118583494 ^ (1649646454 ^ 925341437);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1503152745) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1503152745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1784840502 ^ i2)) {
                    break;
                }
            }
            int i3 = 583291065 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1185009822 ^ i2;
        FileConfiguration mediaGuiConfig = this.plugin.getConfigurationManager(2125977720).getMediaGuiConfig(1870663829);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1821822619) {
            i4 = 1829559047 ^ i4;
            mediaGuiConfig.getConfigurationSection(ycuxejurnl(igrqvwwbhcjoalf(), i4)).getKeys((byte) (10355412 ^ i4)).forEach(str -> {
                int i5 = 684799210 ^ (213697357 ^ 925341437);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1705833776) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1705833776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1255668903 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 919511730 ^ i5;
                    throw new IllegalAccessException("double");
                }
                int i7 = 582859569 ^ i5;
                String str = "items." + str;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1883319463) {
                    i7 = 1818426519 ^ i7;
                    Material valueOf = Material.valueOf(mediaGuiConfig.getString(str + ".material"));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -324454430) {
                        i7 = 720498420 ^ i7;
                        String string = mediaGuiConfig.getString(str + ".displayName");
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1155121085) {
                            int i8 = 2064916874 ^ i7;
                            List stringList = mediaGuiConfig.getStringList(str + ".lore");
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1669811216) {
                                i7 = 350829723 ^ i8;
                                String string2 = mediaGuiConfig.getString(str + ".command");
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -993089336) {
                                    int i9 = 1055931166 ^ i7;
                                    int i10 = mediaGuiConfig.getInt(str + ".slot");
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 860844089) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 860844089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (314841991 ^ i9)) {
                                                break;
                                            }
                                        }
                                        int i11 = 89357567 ^ i9;
                                        throw new RuntimeException("double");
                                    }
                                    i8 = 1356697725 ^ i9;
                                    ItemConfig itemConfig = new ItemConfig(str, valueOf, string, stringList, i10, string2, 1650629224);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1247546413) {
                                        int i12 = 1398845919 ^ i8;
                                        this.mediaConfig.put(str, itemConfig);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 782662953) {
                                            int i13 = 2138585167 ^ i12;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 782662953 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1121426417 ^ i12)) {
                                                break;
                                            }
                                        }
                                        int i14 = 1597909133 ^ i12;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1247546413 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1966405913 ^ i8)) {
                                    int i15 = 1977644132 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1669811216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (724408960 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                            int i16 = 382236480 ^ i8;
                            throw new RuntimeException("double");
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1155121085 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2085506342 ^ i7)) {
                        int i17 = 1460592296 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -324454430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1328638839 ^ i7)) {
                            int i18 = 389692879 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -993089336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (917662606 ^ i7)) {
                                int i19 = 1768100242 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1883319463 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (270832499 ^ i7)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i20 = 1151903937 ^ i7;
                throw new RuntimeException();
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 82843296) {
                int i5 = 1652809729 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1821822619 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2059366539 ^ i4)) {
                int i6 = 1961996828 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 284104363 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (746484381 ^ i4)) {
                    int i7 = 234991928 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 82843296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1523149112 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1592288310 ^ i4;
        throw new RuntimeException();
    }

    public void loadRulesItems(int i) {
        int i2 = 569881134 ^ (1951292891 ^ 925341437);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 351520835) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 351520835 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1816710127 ^ i2)) {
                    break;
                }
            }
            int i3 = 1713087520 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1925015015 ^ i2;
        FileConfiguration rulesGuiConfig = this.plugin.getConfigurationManager(2125977720).getRulesGuiConfig(1467783229);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -2129074312) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1031660206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1778090739 ^ i4)) {
                    int i5 = 1696238065 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2129074312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (161166810 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 170618127 ^ i4;
            throw new IllegalAccessException();
        }
        int i7 = 1863848181 ^ i4;
        rulesGuiConfig.getConfigurationSection(ycuxejurnl(asxveqdzfnbajae(), i7)).getKeys((byte) (2134576154 ^ i7)).forEach(str -> {
            int i8 = 141192117 ^ (1933949905 ^ 925341437);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1614951626) {
                int i9 = 425750185 ^ i8;
                String str = "items." + str;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1421786750) {
                    i8 = 1768504366 ^ i9;
                    Material valueOf = Material.valueOf(rulesGuiConfig.getString(str + ".material"));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -536305423) {
                        int i10 = 876234526 ^ i8;
                        String string = rulesGuiConfig.getString(str + ".displayName");
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1104844800) {
                            i8 = 864122654 ^ i10;
                            List stringList = rulesGuiConfig.getStringList(str + ".lore");
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -573497103) {
                                int i11 = 1610489947 ^ i8;
                                String string2 = rulesGuiConfig.getString(str + ".command");
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 572531243) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 572531243 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1009682385 ^ i11)) {
                                            break;
                                        }
                                    }
                                    int i12 = 1210946917 ^ i11;
                                    throw new RuntimeException("double");
                                }
                                i9 = 2085566960 ^ i11;
                                int i13 = rulesGuiConfig.getInt(str + ".slot");
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1067848280) {
                                    i8 = 2048630333 ^ i9;
                                    ItemConfig itemConfig = new ItemConfig(str, valueOf, string, stringList, i13, string2, 1650629224);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 277158979) {
                                        i10 = 520177582 ^ i8;
                                        this.rulesConfig.put(str, itemConfig);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -393273037) {
                                            int i14 = 322619846 ^ i10;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1104844800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1219915421 ^ i10)) {
                                int i15 = 25938036 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1901686531 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (951365993 ^ i10)) {
                                    int i16 = 1152481397 ^ i10;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -393273037 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (622838368 ^ i10)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i17 = 1748451780 ^ i10;
                        throw new IOException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1067848280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1517955284 ^ i9)) {
                        int i18 = 1488403987 ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1421786750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1775478881 ^ i9)) {
                            break;
                        }
                    }
                }
                int i19 = 433815514 ^ i9;
                throw new IOException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1614951626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (613214798 ^ i8)) {
                    int i20 = 1213713403 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -573497103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1410130459 ^ i8)) {
                        int i21 = 1380208731 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 277158979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (169577770 ^ i8)) {
                            int i22 = 210841259 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -536305423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2066219753 ^ i8)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i23 = 1847255851 ^ i8;
            throw new IllegalAccessException();
        });
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -103259949) {
            int i8 = 661344176 ^ i7;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -103259949 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (533211446 ^ i7)) {
                break;
            }
        }
        int i9 = 1407509343 ^ i7;
        throw new IllegalAccessException("double");
    }

    @Generated
    public CorePlugin getPlugin() {
        int i = 2115449771 ^ (155696129 ^ 925341437);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 62442170) {
            int i2 = 46700242 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 62442170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (207507103 ^ i)) {
                int i3 = 1528884387 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 368868394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (769428043 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 417258504 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public HashMap getHelpConfig(int i) {
        int i2 = 1320845575 ^ (1693541494 ^ 925341437);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -345793440) {
            int i3 = 812471753 ^ i2;
            return this.helpConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1745433129 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1512827829 ^ i2)) {
                int i4 = 333882401 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -345793440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2001066541 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 235511540 ^ i2;
        throw new IOException();
    }

    @Generated
    public HashMap getMediaConfig(int i) {
        int i2 = 891683854 ^ (1939429973 ^ 925341437);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1933163213) {
            int i3 = 1367480383 ^ i2;
            return this.mediaConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 14058697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1807994628 ^ i2)) {
                int i4 = 1584037718 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1933163213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (512312061 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 344000797 ^ i2;
        throw new IOException();
    }

    @Generated
    public HashMap getRulesConfig(int i) {
        int i2 = 39053860 ^ (898177318 ^ 925341437);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 132853752) {
            int i3 = 148437174 ^ i2;
            return this.rulesConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1093462600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (781097461 ^ i2)) {
                int i4 = 84317028 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 132853752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (760418066 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1520579096 ^ i2;
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
        gikohzppxh = ujinuqfetiavdek();
        BJsLtpfSqG = (-1128070062) ^ new Random(-4056438298949238110L).nextInt();
    }

    public static String ycuxejurnl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ gikohzppxh[i3 % gikohzppxh.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ujinuqfetiavdek() {
        return new byte[]{42, 40, 75, 64, 104, 126, 104, 109, 4, 125, 34, 126, 7, 126, 1, 44, 6, 21, 101, 109, 20, 54, 25, 95, 73, 103, 68, 68, 122, 107, 48, 85, 120, 7, 56, 34, 29, 113, 21, 96, 52, 6, 84, 35, 99, 121, 88, 96, 109, 114, 87, 2, 40, 7, 118, 96, 80, 2, 84, 35, 5, 35, 69, 108, 37, 78, 43, 96, 23, 25, 35, 37, 77, 18, 9, 18, 95, 46, 92, 84, 98, 95, 14, 23, 74, 34, 48, 95, 75, 82, 3};
    }

    private static byte[] bskyblhlapwgixw() {
        return new byte[]{-26, -25, 114, 26, 91, 51, 95, 61, 48, 35, 16, 61};
    }

    private static byte[] igrqvwwbhcjoalf() {
        return new byte[]{-27, -25, 120, 28, 93, 62, 89, 58, 53, 32, 17, 56};
    }

    private static byte[] asxveqdzfnbajae() {
        return new byte[]{-26, -26, 120, 29, 93, 61, 94, 57, 49, 36, 16, 60};
    }

    private static int ofohgdeipmgxviox(int i, int i2) {
        return i2 ^ i;
    }
}
