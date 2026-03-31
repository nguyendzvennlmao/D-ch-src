package com.kammoun.donutCore.settings.manager;

import com.kammoun.donutCore.settings.SettingsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;

public class ConfigManager {
    private final SettingsPlugin plugin;
    private boolean cooldownEnabled;
    private long cooldownDuration;
    private String cooldownMessage;
    private String statusOn;
    private String statusOff;
    private Material respawnHelmet;
    private Material respawnChestplate;
    private Material respawnLeggings;
    private Material respawnBoots;
    private Map<Integer, ItemStack> respawnItems;
    private static int atjgBFyYCO = 0;
    private transient int QS6aUz30yA = 1858602484;
    private static byte[] hgfbjiuuhy;
    private static String[] nothing_to_see_here = new String[15];

    public ConfigManager(SettingsPlugin settingsPlugin, int i) {
        int i2 = 990353072 ^ (266146498 ^ 523359620);
        int parseInt = 1389121610 ^ (828573920 ^ Integer.parseInt("1212418396"));
        this.QS6aUz30yA = 1858602484 ^ atjgBFyYCO;
        int htopsbvxxypwuylo = 967620461 ^ htopsbvxxypwuylo(parseInt, 1590421988);
        this.plugin = settingsPlugin;
        loadConfig(738898059);
        int i3 = 1106395223 ^ (1318061275 ^ htopsbvxxypwuylo);
    }

    public void loadConfig(int i) {
        int i2 = 1482813200 ^ (1820618470 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1513143342) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1513143342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (802253251 ^ i2)) {
                    break;
                }
            }
            int i3 = 1937116268 ^ i2;
            throw new IOException("double");
        }
        int i4 = 669640317 ^ i2;
        FileConfiguration config = this.plugin.getConfig(127597628);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1702858693) {
            int i5 = 246170984 ^ i4;
            this.cooldownEnabled = config.getBoolean(uewoainaal(ytaqgtqgpgrtree(), i5), (byte) (2113686382 ^ i5));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -270378117) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -270378117 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (944941127 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1368462667 ^ i5;
                throw new IllegalAccessException("double");
            }
            int i7 = 423491438 ^ i5;
            this.cooldownDuration = config.getLong(uewoainaal(aykevkecztledwk(), i7), 3L) * 1000;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 638443531) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 638443531 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1678942241 ^ i7)) {
                        break;
                    }
                }
                int i8 = 1211922521 ^ i7;
                throw new IOException("double");
            }
            i4 = 2092216737 ^ i7;
            this.cooldownMessage = config.getString(uewoainaal(lmerluwjsfkwmsl(), i4), uewoainaal(hxipxddifjldzfq(), i4));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1012372224) {
                int i9 = 305347505 ^ i4;
                this.statusOn = config.getString(uewoainaal(qiwlhdywswaggfm(), i9), uewoainaal(sfskwhozdbkrlsy(), i9));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1378988168) {
                    i9 = 127725705 ^ i9;
                    this.statusOff = config.getString(uewoainaal(lapwrtpuyfmsbog(), i9), uewoainaal(nfudrbntbpvsqcx(), i9));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1859531968) {
                        i4 = 2019105527 ^ i9;
                        loadRespawnKit(config, 493450752);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1407261829) {
                            int i10 = 1545180549 ^ i4;
                            return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1378988168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (469601515 ^ i9)) {
                        int i11 = 1841897334 ^ i9;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1859531968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1121384553 ^ i9)) {
                            break;
                        }
                    }
                }
                int i12 = 1249481907 ^ i9;
                throw new IllegalAccessException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1288851281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1492356515 ^ i4)) {
                int i13 = 221953689 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1407261829 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (553853915 ^ i4)) {
                    int i14 = 1801520230 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1012372224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (610462467 ^ i4)) {
                        int i15 = 750242950 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1702858693 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1026748847 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i16 = 2116486228 ^ i4;
        throw new IllegalAccessException();
    }

    private void loadRespawnKit(org.bukkit.configuration.file.FileConfiguration r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.manager.ConfigManager.loadRespawnKit(org.bukkit.configuration.file.FileConfiguration, int):void");
    }

    private Material parseMaterial(String str, int i) {
        int i2 = 560659353 ^ (1698704755 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 599128881) {
            i2 = 1619948709 ^ i2;
            if (str == null) {
                int i3 = 853972384 ^ i2;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 667311642) {
                i2 = 279608309 ^ i2;
                if (str.equalsIgnoreCase(uewoainaal(muervqkvxfjmzjx(), i2)) != (1414705206 ^ i2)) {
                    int i4 = 575467093 ^ i2;
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1567260238) {
                    int i5 = 1290370434 ^ i2;
                    if (str.equalsIgnoreCase(uewoainaal(kszjfjbedijkfik(), i5)) == (414961076 ^ i5)) {
                        int htopsbvxxypwuylo = htopsbvxxypwuylo(i5, 714463488);
                        i5 = htopsbvxxypwuylo;
                        try {
                            Material valueOf = Material.valueOf(str.toUpperCase());
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1854888543) {
                                i5 = 2108749709 ^ i5;
                                return valueOf;
                            }
                        } catch (IllegalArgumentException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1854888543:
                                    i2 = htopsbvxxypwuylo(i5, 1708872327);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1079365222) {
                                        int i6 = 1780941536 ^ i2;
                                        this.plugin.getLogger(583940502).warning("Invalid material in respawn-kit config: " + str);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -292411751) {
                                            int i7 = 1008623246 ^ i6;
                                            return null;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -292411751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1121297042 ^ i6)) {
                                                int i8 = 1556163825 ^ i6;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    throw new IllegalAccessException("Error in hash");
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -975278688) {
                        int i9 = 1856345047 ^ i5;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -975278688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1686472798 ^ i5)) {
                            int i10 = 1672118217 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1854888543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1152323005 ^ i5)) {
                                int i11 = 1569758262 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2096568778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (182291947 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i12 = 953005396 ^ i5;
                    throw new IOException("double");
                }
            }
            return null;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1079365222 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1680578534 ^ i2)) {
                int i13 = 148499994 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1567260238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1251903880 ^ i2)) {
                    int i14 = 1091340411 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 667311642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (251100447 ^ i2)) {
                        int i15 = 1500875840 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 599128881 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1821204481 ^ i2)) {
                            int i16 = 2134754467 ^ i2;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    public void reload(int i) {
        int i2 = 1062673414 ^ (89737853 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -762183750) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -731644264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1103131212 ^ i2)) {
                    int i3 = 889426536 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -762183750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (405182385 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1433704324 ^ i2;
            throw new IllegalAccessException();
        }
        int i5 = 1340223817 ^ i2;
        loadConfig(738898059);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1384090128) {
            int i6 = 255619437 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1384090128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1616699121 ^ i5)) {
                break;
            }
        }
        int i7 = 422839410 ^ i5;
        throw new IOException("double");
    }

    @Generated
    public boolean isCooldownEnabled() {
        int i = 201093606 ^ (695478656 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 379686738) {
            int i2 = 261747596 ^ i;
            return this.cooldownEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 379686738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (410818393 ^ i)) {
                int i3 = 950452031 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1785598770 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (800506878 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1594102291 ^ i;
        throw new IOException();
    }

    @Generated
    public long getCooldownDuration() {
        int i = 1812312262 ^ (1588897956 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1754558606) {
            int i2 = 1825213300 ^ i;
            return this.cooldownDuration;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -247474991 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1709004420 ^ i)) {
                int i3 = 1704578575 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1754558606 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (166522489 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 80899512 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getCooldownMessage() {
        int i = 1214859900 ^ (1268176768 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 488612739) {
            int i2 = 102870860 ^ i;
            return this.cooldownMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 739432931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (192055644 ^ i)) {
                int i3 = 1125353517 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 488612739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (926285832 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 330182641 ^ i;
        throw new IOException();
    }

    @Generated
    public String getStatusOn(int i) {
        int i2 = 489816149 ^ (1062164840 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 285836682) {
            int i3 = 1887204948 ^ i2;
            return this.statusOn;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1830144215 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2066645410 ^ i2)) {
                int i4 = 766917493 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 285836682 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (624854868 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1880275550 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getStatusOff(int i) {
        int i2 = 1921603106 ^ (93268954 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1160731744) {
            int i3 = 420824865 ^ i2;
            return this.statusOff;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1160731744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2137723712 ^ i2)) {
                int i4 = 1972393983 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1920637608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (537446947 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 605158982 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public Material getRespawnHelmet(int i) {
        int i2 = 267894706 ^ (125497081 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1183434299) {
            int i3 = 168056103 ^ i2;
            return this.respawnHelmet;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 380333827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (318410859 ^ i2)) {
                int i4 = 2025006116 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1183434299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (372746008 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2054047979 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Material getRespawnChestplate(int i) {
        int i2 = 1691121591 ^ (1574467121 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -901562286) {
            int i3 = 1592361311 ^ i2;
            return this.respawnChestplate;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1024412328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1667451260 ^ i2)) {
                int i4 = 1416948507 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -901562286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1686251088 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1765324303 ^ i2;
        throw new IOException();
    }

    @Generated
    public Material getRespawnLeggings(int i) {
        int i2 = 644772014 ^ (1407308208 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1365359472) {
            int i3 = 1146602147 ^ i2;
            return this.respawnLeggings;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1944039030 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1957979843 ^ i2)) {
                int i4 = 1311259708 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1365359472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1608444427 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 797795473 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public Material getRespawnBoots(int i) {
        int i2 = 2058133714 ^ (1823078337 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1295387397) {
            int i3 = 2006863264 ^ i2;
            return this.respawnBoots;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 238787064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1922546709 ^ i2)) {
                int i4 = 1226701762 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1295387397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1871394020 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 553037421 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Map getRespawnItems(int i) {
        int i2 = 1979508606 ^ (1609166793 ^ 1616669068);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1380649434) {
            int i3 = 1280876076 ^ i2;
            return this.respawnItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 814741688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2125614203 ^ i2)) {
                int i4 = 616208016 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1380649434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2123870702 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1711632039 ^ i2;
        throw new IOException();
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        hgfbjiuuhy = ldmsdwwmdhrmncq();
        atjgBFyYCO = 165219730 ^ new Random(2038170260004130110L).nextInt();
    }

    public static String uewoainaal(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ hgfbjiuuhy[i3 % hgfbjiuuhy.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ldmsdwwmdhrmncq() {
        return new byte[]{90, 34, 5, 41, 65, 16, 22, 40, 14, 82, 111, 34, 53, 95, 17, 77, 102, 24, 59, 43, 68, 10, 9, 122, 37, 122, 102, 52, 14, 87, 74, 32, 65, 45, 29, 48, 19, 123, 52, 76, 41, 30, 28, 44, 120, 90, 99, 66, 110, 116, 81, 114, 47, 77, 83, 121, 71, 118, 2, 82, 14, 95, 57, 113, 50, 29, 30, 118, 22, 87, 103, 23, 80, 106, 49, 101, 106, 82, 100, 46, 3, 8, 46, 105, 95, 32, 97, 3, 60, 121, 93, 122, 43, 49, 12, 94, 23, 34, 15, 88, 3, 43, 114, 109, 7, 89, 52, 67, 29, 73, 126, 23, 124, 35, 40, 75};
    }

    private static byte[] lmerluwjsfkwmsl() {
        return new byte[]{-112, -20, 53, 121, 115, 75, 37, Byte.MAX_VALUE, 58, 10, 94, 118, 6, 2, 37, 9, 94, 66, 15, 52, 116, 84, 59, 43, 22, 49, 82, 115, 63, 6, 121, 117, 117, 123};
    }

    private static byte[] hxipxddifjldzfq() {
        return new byte[]{-112, -20, 53, 60, 115, 7, 37, 86, 58, 32, 94, 43, 6, 91, 37, 78, 94, 28, 15, 74, 116, 85, 59, 43, 22, 35, 82, 115, 63, 2, 121, 50, 117, 105, 37, 101, 39, 35, 4, 11, 27, 10, 47, 49, 76, 26, 82, 27, 93, 43, 101, 36, 23, 92, 103, 104, 119, 54, 48, 3, 61, 4, 13, 42, 3, 67, 45, 32, 34, 23, 95, 3, 100, 57, 1, 51, 88, 0, 87, 121, 55, 78, 31, 60, 108, 50, 85, 83, 4, 37, 105, 42, 27, 108, 62, 13, 36, 115, 59, 2, 50, 124, 65, Byte.MAX_VALUE, 51, 25, 12, 18, 41, 12, 78, 80, 78, 126, 27, 29, 110, 113, 52, 106, 114, 2, 34, 122, 54, 1, 91, 114, 5, 5, 35, 23, 85, 1};
    }

    private static byte[] lapwrtpuyfmsbog() {
        return new byte[]{-106, -18, 55, 110, 117, 85, 34, 112, 56, 20, 92, 101, 1, 24, 32, 87, 95, 65, 9, 126, 118, 88};
    }

    private static byte[] nfudrbntbpvsqcx() {
        return new byte[]{-106, -18, 55, 59, 117, 66, 34, 55, 56, 12, 92, 95, 1, 45, 32, 63};
    }

    private static byte[] aykevkecztledwk() {
        return new byte[]{-107, -21, 60, 122, 117, 78, 46, 118, 57, 9, 94, 112, 12, 0, 37, 11, 94, 71, 12, 50, 117, 88, 48, 63, 17, 57, 94, 100, 57, 20, 123, Byte.MAX_VALUE, 120, 114, 41, 111};
    }

    private static byte[] ytaqgtqgpgrtree() {
        return new byte[]{-106, -20, 52, 121, 119, 71, 32, 116, 54, 13, 93, 119, 4, 3, 39, 2, 80, 69, 3, 54, 118, 94, 56, 39, 19, 35, 80, 101, 54, 8, 120, 116, 112, 122};
    }

    private static byte[] qiwlhdywswaggfm() {
        return new byte[]{-107, -22, 55, 105, 118, 87, 35, 123, 63, 23, 88, 101, 6, 27, 34, 86, 84, 70, 10, 114};
    }

    private static byte[] sfskwhozdbkrlsy() {
        return new byte[]{-107, -22, 55, 60, 118, 66, 35, 60, 63, 15, 88, 95, 6, 38};
    }

    private static byte[] jujhyblonhyllgc() {
        return new byte[]{-106, -20, 54, 125, 118, 76, 37, 115, 63, 30, 93, 125, 6, 30};
    }

    private static byte[] mpryjsawatzyppi() {
        return new byte[]{-107, -18, 61, 107, 117, 71, 34, 108, 63, 17, 87, 115, 1, 26, 37, 20, 87, 6, 3, 112, 112, 81, 61, 57, 20, 103, 94, 102, 58, 10, 126, 120, 112, 106, 37, 115};
    }

    private static byte[] urggbitpwcksqyr() {
        return new byte[]{-107, -18, 61, 90, 117, 106, 34, 94, 63, 40, 87, 92, 1, 32, 37, 59, 87, 98, 3, 87, 112, 103, 61, 15, 20, 6, 94, 75, 58, 49, 126, 68};
    }

    private static byte[] vzbkmiirxgeqxvh() {
        return new byte[]{-107, -20, 48, 99, 118, 71, 36, 111, 58, 19, 94, 118, 13, 31, 35, 17, 82, 1, 10, 113, 113, 91, 62, 60, 23, 96, 82, 108, 63, 22, 114, 114, 115, 114, 41, 119};
    }

    private static byte[] vxcyjtgvmxiulbe() {
        return new byte[]{-100, -22, 50, 105, 112, 67, 32, 110, 60, 26, 88, 116, 7, 25, 39, 21, 83, 7, 3, 119, 115, 81, 56, 56, 19, 97, 84, 111, 57, 8, 120, 116, 119, 104, 40, 118, 43, 60, 3, 18, 24, 73, 42, 109, 74, 7};
    }

    private static byte[] bhbxhhaxebipquz() {
        return new byte[]{-100, -22, 50, 88, 112, 110, 32, 92, 60, 35, 88, 91, 7, 35, 39, 58, 83, 99, 3, 80, 115, 103, 56, 15, 19, 7, 84, 73, 57, 51, 120, 69, 119, 75, 40, 78, 43, 13, 3, 42, 24, 109};
    }

    private static byte[] cumompljxzwstvy() {
        return new byte[]{-112, -24, 50, 107, 115, 68, 36, 109, 58, 23, 88, 115, 7, 25, 35, 21, 82, 0, 12, 112, 118, 82, 59, 56, 17, 97, 81, 104, 60, 3, 120, 113, 117, Byte.MAX_VALUE, 42, 105, 33, 36, 6, 29, 29, 88};
    }

    private static byte[] sjxpvxpbgceyypu() {
        return new byte[]{-112, -24, 50, 90, 115, 105, 36, 95, 58, 46, 88, 92, 7, 35, 35, 58, 82, 100, 12, 87, 118, 100, 59, 0, 17, 10, 81, 67, 60, 33, 120, 95, 117, 86, 42, 71, 33, 25};
    }

    private static byte[] wawicsqndvrixwq() {
        return new byte[]{-107, -27, 54, 110, 120, 67, 46, 104, 63, 27, 94, 123, 6, 29, 40, 21, 94, 6, 10, 121, 117, 91, 58, 59, 28, 98, 94, 111, 63, 11, 123, 116, 114, 117, 36, 99, 43, 60};
    }

    private static byte[] itvltbjoysqikzg() {
        return new byte[]{-107, -27, 54, 95, 120, 110, 46, 90, 63, 34, 94, 84, 6, 39, 40, 58, 94, 98, 10, 94, 117, 109, 58, 7, 28, 9, 94, 75, 63, 35, 123, 93, 114, 76};
    }

    private static byte[] owwkfutrwrmoapm() {
        return new byte[]{-107, -22, 55, 112, 120, 64, 37, 107, 55, 3, 94, 103, 7, 2, 40, 29, 85, 67};
    }

    private static byte[] rjxfwipimowexbn() {
        return new byte[]{-107, -22, 55, 92, 120, 104, 37, 77};
    }

    private static byte[] muervqkvxfjmzjx() {
        return new byte[]{-107, -23, 52, 83, 118, 111, 35, 84, 62, 33};
    }

    private static byte[] kszjfjbedijkfik() {
        return new byte[]{-112, -20, 49, 81, 119, 104, 38, 77};
    }

    private static int htopsbvxxypwuylo(int i, int i2) {
        return i2 ^ i;
    }
}
