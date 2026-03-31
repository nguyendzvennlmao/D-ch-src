package com.kammoun.donutCore.itemcontrol.config;

import com.kammoun.donutCore.itemcontrol.enums.BanType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ItemControlConfig {
    private final JavaPlugin plugin;
    private final File configFile;
    private FileConfiguration config;
    private final Map<Material, Long> globalCooldowns;
    private final Map<Material, Set<BanType>> globalBans;
    private final Map<String, Map<Material, Set<BanType>>> regionBans;
    private final Map<String, String> messages;
    private static int YscZjEHTDh = 0;
    private transient int m8sA4Wf8IH = 421716196;
    private static String nfharnmjpx;
    private static String[] nothing_to_see_here = new String[15];

    public ItemControlConfig(JavaPlugin javaPlugin, int i) {
        int i2 = 1891273789 ^ (1544451507 ^ 682001797);
        int parseInt = 5531816 ^ (1950855316 ^ Integer.parseInt("1879155767"));
        this.m8sA4Wf8IH = 421716196 ^ YscZjEHTDh;
        int lyopkpawzgzbuhqo = 2119127132 ^ lyopkpawzgzbuhqo(parseInt, 78028736);
        this.plugin = javaPlugin;
        this.configFile = new File(javaPlugin.getDataFolder(), "ItemControl/config.yml");
        this.globalCooldowns = new HashMap();
        this.globalBans = new HashMap();
        this.regionBans = new HashMap();
        this.messages = new HashMap();
        loadConfig(971293364);
        int i3 = 1935078016 ^ (1476122750 ^ (77336141 ^ (638600598 ^ (832657398 ^ (1134623819 ^ (722874989 ^ lyopkpawzgzbuhqo))))));
    }

    public void loadConfig(int i) {
        int i2 = 16756415 ^ (1360410731 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1453070210) {
            int i3 = 1298120374 ^ i2;
            if (this.configFile.exists() != (126630982 ^ i3)) {
                i2 = lyopkpawzgzbuhqo(i3, 579182867);
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1013047856) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1013047856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (739464661 ^ i3)) {
                            int i4 = 1567939201 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 225033026 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1150629269 ^ i3)) {
                                break;
                            }
                        }
                    }
                    int i5 = 445165062 ^ i3;
                    throw new RuntimeException("double");
                }
                int i6 = 243357282 ^ i3;
                this.configFile.getParentFile().mkdirs();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1214992672) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1214992672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (430192250 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1956895740 ^ i6;
                    throw new RuntimeException("double");
                }
                i2 = 1421809391 ^ i6;
                this.plugin.saveResource(gqhkcgmysx(uzpixkmhuraoavg(), i2), (byte) (1571978443 ^ i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -309074342) {
                    i2 = 2025578910 ^ i2;
                }
            }
            this.config = YamlConfiguration.loadConfiguration(this.configFile);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 676129449) {
                i2 = 906553316 ^ i2;
                loadCooldowns(1976859277);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1744054904) {
                    int i8 = 863850922 ^ i2;
                    loadGlobalBans(2040529096);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 65099993) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 65099993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1303196413 ^ i8)) {
                                break;
                            }
                        }
                        int i9 = 128320978 ^ i8;
                        throw new IOException("double");
                    }
                    int i10 = 734029841 ^ i8;
                    loadRegionBans(1635147009);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1575098448) {
                        i10 = 477300528 ^ i10;
                        loadMessages(1781470052);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1099292208) {
                            int i11 = 1449292626 ^ i10;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1099292208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (493789880 ^ i10)) {
                            int i12 = 1363937197 ^ i10;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1575098448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1320702539 ^ i10)) {
                                break;
                            }
                        }
                    }
                    int i13 = 358795467 ^ i10;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -309074342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1853334331 ^ i2)) {
                int i14 = 2093748532 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1744054904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (996707485 ^ i2)) {
                    int i15 = 751578620 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 676129449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (945325574 ^ i2)) {
                        int i16 = 1838670645 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1453070210 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (827961016 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i17 = 681247434 ^ i2;
        throw new IllegalAccessException();
    }

    private void loadCooldowns(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.config.ItemControlConfig.loadCooldowns(int):void");
    }

    private void loadGlobalBans(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.config.ItemControlConfig.loadGlobalBans(int):void");
    }

    private void loadRegionBans(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.config.ItemControlConfig.loadRegionBans(int):void");
    }

    private void loadMessages(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.config.ItemControlConfig.loadMessages(int):void");
    }

    public String getMessage(String str, int i) {
        int i2 = 399771579 ^ (137260016 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637780856) {
            int i3 = 1590213155 ^ i2;
            return this.messages.getOrDefault(str, "&cMessage not found: " + str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637780856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1269191858 ^ i2)) {
                int i4 = 1235894620 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -800714142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (576458569 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 251002033 ^ i2;
        throw new RuntimeException();
    }

    public String getMessage(String str, String[] strArr, int i) {
        int i2;
        int i3 = 160004917 ^ (1613369616 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1798574069) {
            int i4 = 922351191 ^ i3;
            String message = getMessage(str, 1112270736);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 587481778) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 587481778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (467404807 ^ i4)) {
                        break;
                    }
                }
                int i5 = 681727607 ^ i4;
                throw new RuntimeException("double");
            }
            i3 = 1103765519 ^ i4;
            int i6 = (byte) (95070297 ^ i3);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 760562376) {
                int i7 = 458323755 ^ i3;
                while (i6 < strArr.length) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -136381552) {
                        int i8 = 135750584 ^ i7;
                        if (i6 + ((byte) (384613579 ^ i8)) >= strArr.length) {
                            i2 = 1645329349 ^ i8;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1218058672) {
                            i2 = 1659793417 ^ i8;
                            message = message.replace("{" + strArr[i6] + "}", strArr[i6 + ((byte) (1946340546 ^ i2))]);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1609144805) {
                                i2 = 16763852 ^ i2;
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1609144805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1462717426 ^ i2)) {
                                        int i9 = 1067553702 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1477953413 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1942153968 ^ i2)) {
                                            int i10 = 1977418302 ^ i2;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1218058672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1818994216 ^ i8)) {
                                    int i11 = 853207838 ^ i8;
                                    throw new IOException("double");
                                }
                            }
                        }
                        i6 += 1962739469 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1477953413) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1609144805) {
                                    int i92 = 1067553702 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1477953413) {
                                        int i102 = 1977418302 ^ i2;
                                        throw new IOException("double");
                                    }
                                    continue;
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                case 44714320:
                                    i2 = 303096108 ^ i2;
                                    break;
                                case 1522028674:
                                default:
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 529698352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (750353680 ^ i2)) {
                                            int i12 = 632792658 ^ i2;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                    break;
                                case 1739442567:
                                case 1752735902:
                                    break;
                            }
                        }
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2) != 124553998) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        } catch (IllegalAccessException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case 930033947:
                                    i7 = 1331441180 ^ i2;
                                    break;
                                case 1265876850:
                                    i7 = lyopkpawzgzbuhqo(i2, 1625276369);
                                    break;
                                default:
                                    throw new IllegalAccessException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1301168633) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1265876850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2106023512 ^ i7)) {
                                        int i13 = 2004725578 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1301168633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1500803423 ^ i7)) {
                                            int i14 = 502348169 ^ i7;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i7)) {
                                    case 13130315:
                                        i7 = 927602509 ^ i7;
                                        break;
                                    case 1688460614:
                                    case 2115081783:
                                        break;
                                }
                            }
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -136381552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1645470364 ^ i7)) {
                                int i15 = 1360116674 ^ i7;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
                lyopkpawzgzbuhqo(i7, 487165620);
                return message;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 760562376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (518349568 ^ i3)) {
                int i16 = 894608715 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1798574069 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1603477607 ^ i3)) {
                    break;
                }
            }
        }
        int i17 = 1413826142 ^ i3;
        throw new IOException();
    }

    public long getCooldown(Material material, int i) {
        int i2 = 968555841 ^ (553323838 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 333390552) {
            int i3 = 897675664 ^ i2;
            return this.globalCooldowns.getOrDefault(material, 0L).longValue();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 333390552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (159522016 ^ i2)) {
                int i4 = 893660409 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1076580775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1892516078 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 870873451 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isGloballyBanned(org.bukkit.Material r6, com.kammoun.donutCore.itemcontrol.enums.BanType r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.config.ItemControlConfig.isGloballyBanned(org.bukkit.Material, com.kammoun.donutCore.itemcontrol.enums.BanType, int):boolean");
    }

    public boolean isRegionBanned(java.lang.String r6, org.bukkit.Material r7, com.kammoun.donutCore.itemcontrol.enums.BanType r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.itemcontrol.config.ItemControlConfig.isRegionBanned(java.lang.String, org.bukkit.Material, com.kammoun.donutCore.itemcontrol.enums.BanType, int):boolean");
    }

    public void reload(int i) {
        int i2 = 1936338980 ^ (1467546799 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -112802439) {
            i2 = 537960404 ^ i2;
            loadConfig(971293364);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -104711208) {
                int i3 = 859173715 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -112802439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2028262085 ^ i2)) {
                int i4 = 23190324 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -104711208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (676434798 ^ i2)) {
                    int i5 = 700571909 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1617797441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (189827004 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2007530216 ^ i2;
        throw new IOException();
    }

    public void saveConfig() {
        int i = 1530659830 ^ (538439698 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 9387523) {
            ?? r0 = 1866406093 ^ i;
            i = r0;
            try {
                this.config.save(this.configFile);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2037905512) {
                    i = 762532950 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 317545177) {
                        int i2 = 174180863 ^ i;
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2) == 234149665) {
                                throw new RuntimeException();
                            }
                            throw null;
                        } catch (RuntimeException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1693996799:
                                    i = 640956417 ^ i2;
                                    break;
                                case 1105401121:
                                    i = 1030270853 ^ i2;
                                    break;
                                default:
                                    throw new RuntimeException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1431934712) {
                                int i3 = 685571870 ^ i;
                                return;
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                    case 2037905512:
                        i = lyopkpawzgzbuhqo(i, 1632091190);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1934236123) {
                            int i4 = 985746759 ^ i;
                            this.plugin.getLogger().severe("Could not save config.yml: " + r0.getMessage());
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1522502686) {
                                int i5 = 1763720259 ^ i4;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1522502686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (544319723 ^ i4)) {
                                    int i6 = 1536451798 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -331247111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (217199067 ^ i4)) {
                                        int i7 = 1165610612 ^ i4;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        throw new IllegalAccessException("Error in hash");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1693996799 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (204264316 ^ i)) {
                int i8 = 1151816146 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1105401121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (360155111 ^ i)) {
                    int i9 = 506045105 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1431934712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (121670764 ^ i)) {
                        int i10 = 2022748266 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 317545177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1742088571 ^ i)) {
                            int i11 = 1432157116 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 9387523 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (56912888 ^ i)) {
                                int i12 = 183610789 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1934236123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (204852159 ^ i)) {
                                    int i13 = 1341584966 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2037905512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1647323003 ^ i)) {
                                        int i14 = 1132542082 ^ i;
                                        throw new RuntimeException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Generated
    public JavaPlugin getPlugin() {
        int i = 2017000076 ^ (1931791030 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2127486736) {
            int i2 = 260387007 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -48716536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (589352961 ^ i)) {
                int i3 = 737395776 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2127486736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1444528799 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1875927978 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public File getConfigFile() {
        int i = 129372603 ^ (1796114868 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1139515045) {
            int i2 = 492013935 ^ i;
            return this.configFile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1139515045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1238149949 ^ i)) {
                int i3 = 1199740897 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1451764259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1706411773 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 423627473 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 543951329 ^ (1790530621 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1887809598) {
            int i2 = 56113117 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1782845142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2063921068 ^ i)) {
                int i3 = 1332808852 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1887809598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1872407746 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1132368103 ^ i;
        throw new IOException();
    }

    @Generated
    public Map<Material, Long> getGlobalCooldowns() {
        int i = 2129272355 ^ (1433984088 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2058964231) {
            int i2 = 1279511905 ^ i;
            return this.globalCooldowns;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -413607437 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1847823954 ^ i)) {
                int i3 = 1827344323 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2058964231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (303854795 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1875789958 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Map<Material, Set<BanType>> getGlobalBans() {
        int i = 2052900082 ^ (1818638094 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1745305280) {
            int i2 = 1858275489 ^ i;
            return this.globalBans;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1745305280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (32326665 ^ i)) {
                int i3 = 1376661476 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 505379787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (605651519 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1432039100 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public Map<String, Map<Material, Set<BanType>>> getRegionBans() {
        int i = 413816836 ^ (1819831552 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2134968579) {
            int i2 = 2061654787 ^ i;
            return this.regionBans;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2134968579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1715160787 ^ i)) {
                int i3 = 243460191 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1470901992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1934214432 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 292523266 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public Map<String, String> getMessages() {
        int i = 1364192124 ^ (721816485 ^ 456791076);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 195012587) {
            int i2 = 164625521 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 195012587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1334378360 ^ i)) {
                int i3 = 1090484253 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1172325475 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1944869464 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1389637881 ^ i;
        throw new RuntimeException();
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
        nfharnmjpx = ByteBuffer.wrap(tvgmhseucvmjdnz()).asCharBuffer().toString();
        YscZjEHTDh = (-774025420) ^ new Random(-4096083554334291872L).nextInt();
    }

    public static String gqhkcgmysx(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = nfharnmjpx.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] uzpixkmhuraoavg() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, 0};
    }

    private static byte[] bekrmfnwfbxbrtj() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 22};
    }

    private static byte[] arreenkrrwdfsqy() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 31};
    }

    private static byte[] gfpsvhvljlluaah() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 42};
    }

    private static byte[] itjwtzsixqpoakz() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 53};
    }

    private static byte[] zzsdifzrtvrmrda() {
        return new byte[]{0, 0, 0, 52, 0, 0, 0, 68};
    }

    private static byte[] ztuqrjtyypzcrvu() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 120};
    }

    private static byte[] kwzvkjsgipzozqh() {
        return new byte[]{0, 0, 0, 25, 0, 0, 0, -121};
    }

    private static byte[] qiobcmexczhatgn() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, -96};
    }

    private static byte[] ydovtjdstvqttds() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -85};
    }

    private static byte[] qwpvvggoqtlsfnp() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, -63};
    }

    private static byte[] zzdimpdyklayvbb() {
        return new byte[]{0, 0, 0, 28, 0, 0, 0, -50};
    }

    private static byte[] wsgrimmwxukhwre() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, -22};
    }

    private static byte[] asblbljkvxwgzyp() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, -14};
    }

    private static byte[] ogwnkpcqbkjgdzr() {
        return new byte[]{0, 0, 0, 19, 0, 0, 1, 2};
    }

    private static byte[] cjlfvublatjdcjf() {
        return new byte[]{0, 0, 0, 18, 0, 0, 1, 21};
    }

    private static byte[] elhnjtfnsgkiacw() {
        return new byte[]{0, 0, 0, 37, 0, 0, 1, 39};
    }

    private static byte[] ucurxyndrjjmqid() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, 76};
    }

    private static byte[] embygzrnboblodh() {
        return new byte[]{0, 0, 0, 32, 0, 0, 1, 92};
    }

    private static byte[] tvgmhseucvmjdnz() {
        return new byte[]{49, 124, 55, 69, 57, 82, 56, 89, 52, 112, 49, 90, 55, 95, 57, 67, 56, 70, 52, 92, 49, 89, 55, 30, 57, 84, 56, 91, 52, 93, 49, 83, 55, 88, 57, 80, 56, 26, 52, 74, 49, 88, 55, 93, 49, 84, 49, 90, 48, 87, 50, 91, 52, 81, 49, 88, 49, 66, 48, 86, 50, 68, 49, 84, 54, 92, 55, 93, 50, 87, 56, 85, 49, 95, 54, 29, 55, 80, 50, 84, 56, 90, 49, 64, 49, 68, 54, 85, 50, 81, 54, 90, 56, 89, 49, 88, 54, 29, 50, 84, 54, 82, 56, 88, 49, 69, 49, 85, 50, 92, 54, 87, 55, 85, 54, 84, 49, 89, 50, 68, 54, 86, 55, 20, 54, 81, 49, 85, 50, 71, 54, 81, 55, 79, 54, 85, 49, 16, 50, 80, 54, 97, 55, 86, 54, 69, 49, 22, 50, 94, 54, 77, 55, 74, 54, 68, 49, 22, 50, 68, 54, 89, 55, 80, 54, 68, 49, 22, 50, 72, 54, 76, 55, 80, 54, 93, 49, 83, 50, 78, 54, 24, 55, 91, 54, 85, 49, 80, 50, 92, 54, 74, 55, 92, 54, 16, 49, 67, 50, 64, 54, 81, 55, 87, 54, 87, 49, 22, 50, 71, 54, 80, 55, 80, 54, 67, 49, 22, 50, 90, 54, 76, 55, 92, 54, 93, 49, 22, 50, 82, 54, 95, 55, 88, 54, 89, 49, 88, 50, 18, 49, 90, 56, 88, 53, 91, 56, 85, 54, 88, 57, 95, 55, 24, 53, 74, 51, 83, 49, 85, 56, 88, 53, 84, 56, 87, 54, 84, 57, 92, 49, 31, 56, 86, 53, 118, 56, 92, 54, 95, 57, 94, 55, 92, 53, 95, 51, 67, 49, 75, 56, 86, 53, 65, 56, 90, 54, 94, 57, 86, 55, 21, 53, 74, 51, 83, 49, 85, 56, 88, 53, 84, 56, 87, 54, 84, 57, 92, 55, 20, 49, 89, 49, 69, 57, 81, 50, 95, 56, 28, 48, 83, 49, 88, 52, 92, 50, 86, 49, 85, 49, 85, 49, 22, 49, 82, 57, 96, 50, 90, 56, 88, 48, 66, 49, 25, 52, 91, 50, 76, 49, 85, 49, 92, 57, 20, 50, 91, 56, 66, 48, 17, 49, 91, 52, 83, 50, 86, 49, 94, 49, 84, 57, 80, 50, 19, 53, 93, 55, 94, 55, 27, 55, 73, 51, 80, 51, 69, 49, 90, 54, 94, 57, 64, 53, 64, 55, 88, 55, 89, 55, 87, 53, 21, 55, 82, 55, 111, 55, 86, 51, 64, 51, 23, 49, 83, 54, 88, 57, 93, 53, 20, 55, 69, 55, 22, 55, 81, 51, 84, 51, 65, 49, 82, 54, 23, 57, 67, 53, 86, 55, 67, 55, 91, 55, 80, 51, 70, 51, 68, 49, 94, 54, 88, 57, 93, 53, 18, 56, 92, 53, 87, 54, 70, 55, 64, 55, 89, 49, 82, 50, 83, 53, 68, 50, 64, 57, 85, 49, 87, 51, 72, 55, 83, 50, 66, 57, 20, 49, 88, 51, 94, 55, 66, 50, 29, 57, 95, 49, 89, 51, 68, 55, 88, 50, 84, 50, 22, 57, 90, 49, 102, 51, 93, 55, 87, 50, 73, 57, 92, 49, 68, 51, 17, 55, 88, 50, 95, 57, 77, 49, 22, 51, 87, 55, 89, 50, 69, 57, 87, 49, 82, 51, 16, 49, 90, 57, 69, 55, 83, 49, 93, 49, 26, 49, 81, 57, 80, 55, 88, 49, 94, 49, 82, 49, 87, 57, 28, 55, 68, 49, 85, 49, 80, 49, 90, 57, 94, 55, 88, 49, 21, 57, 82, 55, 98, 49, 88, 49, 94, 49, 64, 57, 17, 55, 95, 49, 68, 49, 82, 49, 94, 57, 17, 55, 95, 49, 67, 49, 23, 49, 81, 57, 80, 55, 88, 49, 94, 49, 82, 49, 87, 57, 17, 55, 95, 49, 94, 49, 23, 49, 71, 57, 89, 55, 95, 49, 67, 49, 23, 49, 65, 57, 84, 55, 81, 49, 89, 49, 88, 49, 93, 57, 16, 49, 84, 53, 90, 52, 92, 51, 88, 55, 83, 49, 88, 53, 66, 52, 93, 51, 25, 55, 84, 49, 91, 53, 80, 52, 82, 51, 70, 55, 82, 49, 83, 49, 17, 53, 84, 52, 112, 51, 91, 55, 88, 49, 91, 53, 81, 52, 92, 51, 67, 55, 89, 49, 23, 53, 86, 52, 95, 51, 81, 55, 86, 49, 69, 53, 80, 52, 87, 51, 20, 55, 81, 49, 88, 53, 71, 52, 19, 51, 79, 55, 71, 49, 91, 53, 84, 52, 74, 51, 81, 55, 69, 49, 74, 53, 20};
    }

    private static int lyopkpawzgzbuhqo(int i, int i2) {
        return i2 ^ i;
    }
}
