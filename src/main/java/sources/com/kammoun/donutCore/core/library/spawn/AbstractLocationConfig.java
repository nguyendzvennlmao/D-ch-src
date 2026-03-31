package com.kammoun.donutCore.core.library.spawn;

import com.kammoun.donutCore.core.models.SpawnData;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class AbstractLocationConfig {
    protected final JavaPlugin plugin;
    protected final File configFile;
    protected FileConfiguration config;
    protected final Map<Integer, SpawnData> dataMap;
    private static int QiAFI3oO4E = 0;
    private transient int Rw0N0i12fD = 1057974181;
    private static String ljrgyijalh;
    private static String[] nothing_to_see_here = new String[15];

    protected abstract String getConfigSectionName(int i);

    protected abstract String getResourcePath(int i);

    protected abstract String getConfigFileName(int i);

    public AbstractLocationConfig(JavaPlugin javaPlugin, String str, String str2, int i) {
        czdhuddxuhnatlud(740125873 ^ 202056654, 149657967);
        int parseInt = 228236970 ^ (2008693996 ^ Integer.parseInt("1390244950"));
        this.Rw0N0i12fD = 1057974181 ^ QiAFI3oO4E;
        this.plugin = javaPlugin;
        this.configFile = new File(String.valueOf(javaPlugin.getDataFolder()) + "/Core/" + str, str2);
        this.dataMap = new HashMap();
        loadConfig(459342648);
        loadData(1467808465);
        int i2 = 106150138 ^ (311458083 ^ (1044898835 ^ (259334277 ^ (422232400 ^ (686929035 ^ (1770857388 ^ parseInt))))));
    }

    private void loadConfig(int i) {
        int i2;
        int i3 = 2033159154 ^ (917384032 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -450754669) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -450754669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2126487701 ^ i3)) {
                    break;
                }
            }
            int i4 = 1491062208 ^ i3;
            throw new IllegalAccessException("double");
        }
        int i5 = 1534818473 ^ i3;
        if (this.configFile.exists() != (668940379 ^ i5)) {
            i2 = 372408127 ^ i5;
        } else {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1056555737) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1056555737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (955612271 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1555650173 ^ i5;
                throw new IllegalAccessException("double");
            }
            int i7 = 1664062893 ^ i5;
            this.plugin.saveResource("Core/" + getResourcePath(1884899235) + "/" + getConfigFileName(401753549), (byte) (1156623862 ^ i7));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 663056306) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 663056306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (985725218 ^ i7)) {
                        break;
                    }
                }
                int i8 = 958228211 ^ i7;
                throw new IOException("double");
            }
            i2 = 1964894866 ^ i7;
        }
        this.config = YamlConfiguration.loadConfiguration(this.configFile);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1888863455) {
            int i9 = 28444038 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1888863455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (273979993 ^ i2)) {
                int i10 = 1726113959 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2097539311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1423437420 ^ i2)) {
                    break;
                }
            }
        }
        int i11 = 218714637 ^ i2;
        throw new IOException();
    }

    public void saveSpawn(com.kammoun.donutCore.core.models.SpawnData r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.library.spawn.AbstractLocationConfig.saveSpawn(com.kammoun.donutCore.core.models.SpawnData, int):void");
    }

    public void loadData(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.library.spawn.AbstractLocationConfig.loadData(int):void");
    }

    public void deleteSpawn(int i) {
        int i2 = 55719453 ^ (1366516755 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 136680307) {
            i2 = 1242264457 ^ i2;
            this.config.set(getConfigSectionName(1550138668) + "." + i, (Object) null);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1484656441) {
                i2 = 139179753 ^ i2;
                saveConfig(968233697);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 438548593) {
                    int i3 = 1273147747 ^ i2;
                    this.dataMap.remove(Integer.valueOf(i));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1161180011) {
                        int i4 = 672914472 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1161180011 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (475800565 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 1150155593 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 136680307 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1639148317 ^ i2)) {
                int i6 = 1313571365 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 99144234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1824800149 ^ i2)) {
                    int i7 = 1189827594 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 438548593 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (205862807 ^ i2)) {
                        int i8 = 1679415151 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1484656441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (948727967 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 160584356 ^ i2;
        throw new IOException();
    }

    public SpawnData getSpawn(int i) {
        int i2 = 1188222268 ^ (1100558200 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1552887519) {
            int i3 = 1110181115 ^ i2;
            return this.dataMap.get(Integer.valueOf(i));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1552887519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2099654933 ^ i2)) {
                int i4 = 1519812363 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1307511045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1479341396 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 915342649 ^ i2;
        throw new IOException();
    }

    public boolean hasSpawn(int i) {
        int i2 = 1389813063 ^ (1049952308 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -80615270) {
            int i3 = 1299165253 ^ i2;
            return this.dataMap.containsKey(Integer.valueOf(i));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -80615270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1042426919 ^ i2)) {
                int i4 = 2012277933 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1874040144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1342960687 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1757608173 ^ i2;
        throw new IllegalAccessException();
    }

    public void reloadConfig(int i) {
        int i2 = 1199304624 ^ (1151259429 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2046367831) {
            int i3 = 1676229201 ^ i2;
            this.config = YamlConfiguration.loadConfiguration(this.configFile);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1722862302) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -466431695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (477308684 ^ i3)) {
                        int i4 = 18609094 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1722862302 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2042978878 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 1952962636 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 1313181708 ^ i3;
            this.dataMap.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -345787072) {
                i2 = 1010187328 ^ i2;
                loadData(1467808465);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 181557057) {
                    int i6 = 500961486 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -345787072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1505152176 ^ i2)) {
                int i7 = 1567033601 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2046367831 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (265682208 ^ i2)) {
                    int i8 = 1424914347 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 181557057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (823198323 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i9 = 1029434922 ^ i2;
        throw new IllegalAccessException();
    }

    private void saveConfig(int i) {
        int i2 = 512173322 ^ (1748291589 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 749775738) {
            ?? r0 = 35572441 ^ i2;
            int i3 = r0;
            try {
                this.config.save(this.configFile);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1011285426) {
                    i3 = 514192899 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -915845718) {
                        int i4 = 148011934 ^ i3;
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4) == 249495244) {
                                throw new IllegalAccessException();
                            }
                            throw null;
                        } catch (IllegalAccessException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1879404198:
                                    i2 = 589834540 ^ i4;
                                    break;
                                case -762815685:
                                    i2 = 143028320 ^ i4;
                                    break;
                                default:
                                    throw new RuntimeException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1766074309) {
                                int i5 = 819983158 ^ i2;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1011285426 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1816420138 ^ i3)) {
                        int i6 = 1722672334 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 272908682 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (641314532 ^ i3)) {
                            int i7 = 1457943133 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -915845718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1320167519 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i8 = 1568743318 ^ i3;
                throw new IOException();
            } catch (IOException e2) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                    case 1011285426:
                        int i9 = 1743934807 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 64247561) {
                            int i10 = 865327478 ^ i9;
                            this.plugin.getLogger().severe("Could not save " + getConfigFileName(401753549) + ": " + r0.getMessage());
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1622500168) {
                                int i11 = 1373756326 ^ i10;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1622500168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1554446104 ^ i10)) {
                                    int i12 = 1137578171 ^ i10;
                                    throw new IOException("double");
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 64247561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1894170728 ^ i9)) {
                                    int i13 = 578491919 ^ i9;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1879404198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (427761114 ^ i9)) {
                                        int i14 = 1259238872 ^ i9;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        throw new RuntimeException("Error in hash");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 749775738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2001033430 ^ i2)) {
                int i15 = 918431958 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1766074309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1160650614 ^ i2)) {
                    int i16 = 588069592 ^ i2;
                    throw new IOException("double");
                }
            }
        }
    }

    @Generated
    public JavaPlugin getPlugin() {
        int i = 1429482744 ^ (916728912 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2052127166) {
            int i2 = 1073360545 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2055107403 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1445957399 ^ i)) {
                int i3 = 75348045 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2052127166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2077047895 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2132941221 ^ i;
        throw new IOException();
    }

    @Generated
    public File getConfigFile() {
        int i = 1997327212 ^ (1502078895 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -311007976) {
            int i2 = 98917006 ^ i;
            return this.configFile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -311007976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1765425273 ^ i)) {
                int i3 = 1063494823 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1034112664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1269150463 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1197879984 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 1201104774 ^ (1882546885 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 608119064) {
            int i2 = 1606463822 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 608119064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1888245977 ^ i)) {
                int i3 = 781138082 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -633691286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1354872294 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1849894331 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Map getDataMap(int i) {
        int i2 = 431013169 ^ (1573998915 ^ 858120288);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1172283245) {
            int i3 = 1186478882 ^ i2;
            return this.dataMap;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1172283245 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (140646619 ^ i2)) {
                int i4 = 1608094541 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1881032319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1525513000 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 665452173 ^ i2;
        throw new IllegalAccessException();
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
        ljrgyijalh = ByteBuffer.wrap(fcxmryahkpoqxrj()).asCharBuffer().toString();
        QiAFI3oO4E = 16309493 ^ new Random(4064463900642086102L).nextInt();
    }

    public static String svlgeeahou(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ljrgyijalh.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] erdkpvbsbjsmaoj() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 0};
    }

    private static byte[] wxidrhwpmscibmb() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 1};
    }

    private static byte[] xdxjkfdoepmbmcf() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 6};
    }

    private static byte[] hsuiskpokitgdyb() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 7};
    }

    private static byte[] unyrvcqdhpdrycr() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 12};
    }

    private static byte[] mdbxfdphayjisww() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 13};
    }

    private static byte[] zbsmhrzlsczbkgi() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 18};
    }

    private static byte[] ertmxtxklwsvojb() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 19};
    }

    private static byte[] mrqbayrsniebgdv() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 20};
    }

    private static byte[] fnwhjltjyrwupdx() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 23};
    }

    private static byte[] jnimbxlgkwekiww() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 24};
    }

    private static byte[] paycavogrsjusft() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 25};
    }

    private static byte[] olyfbfmxsrbbfna() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 26};
    }

    private static byte[] vyzcoxgtswxieiq() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 31};
    }

    private static byte[] wdyzjklruitpgco() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 32};
    }

    private static byte[] txwaaoonyuciyav() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 33};
    }

    private static byte[] jhpaqfkdxzikewe() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 38};
    }

    private static byte[] klimockncgqwuxt() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 39};
    }

    private static byte[] rsslkkxdsuvrcpy() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 40};
    }

    private static byte[] lrvbuptdsoccuyr() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 41};
    }

    private static byte[] ssrohuhjutidlbp() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 42};
    }

    private static byte[] zcutkhkxnqlvkkc() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 47};
    }

    private static byte[] owqwjsklncvmhhy() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 50};
    }

    private static byte[] lkryvxmztifiwcp() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 55};
    }

    private static byte[] dovktlmvdkshcqk() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 60};
    }

    private static byte[] ihkqwuxecnjwooj() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 61};
    }

    private static byte[] prouknibqltnrzx() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 62};
    }

    private static byte[] xccodobxnpwnkht() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 63};
    }

    private static byte[] fcxmryahkpoqxrj() {
        return new byte[]{49, 77, 54, 65, 57, 90, 50, 64, 48, 84, 52, 94, 49, 75, 55, 66, 55, 93, 52, 75, 52, 95, 50, 83, 49, 64, 49, 78, 56, 93, 55, 66, 57, 84, 55, 81, 56, 79, 49, 74, 49, 76, 57, 82, 54, 68, 53, 64, 53, 73, 50, 72, 49, 67, 52, 89, 52, 74, 49, 94, 51, 85, 49, 79, 50, 75, 49, 68, 54, 88, 51, 68, 51, 90, 56, 84, 51, 76, 52, 77, 49, 75, 49, 73, 56, 67, 52, 95, 51, 70, 55, 88, 49, 92, 49, 72, 51, 89, 56, 78, 49, 71, 55, 87, 52, 71, 49, 88, 52, 86, 54, 64, 53, 95, 57, 76, 49, 85, 51, 94, 49, 78, 55, 64, 52, 74, 49, 72};
    }

    private static int czdhuddxuhnatlud(int i, int i2) {
        return i2 ^ i;
    }
}
