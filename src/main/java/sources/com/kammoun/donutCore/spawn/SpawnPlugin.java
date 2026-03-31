package com.kammoun.donutCore.spawn;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.utils.location.Klocation;
import com.kammoun.donutCore.spawn.commands.BuildCommand;
import com.kammoun.donutCore.spawn.commands.SetMainSpawnCommand;
import com.kammoun.donutCore.spawn.listener.SpawnListener;
import com.kammoun.donutCore.spawn.listener.SpawnProtectionListener;
import com.kammoun.donutCore.spawn.service.RandomRespawnService;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lombok.Generated;

public class SpawnPlugin extends DonutModule {
    private final Map<String, Klocation> spawns;
    private int teleportDelay;
    private boolean teleportOnFirstJoin;
    private boolean teleportOnRespawn;
    private boolean teleportOnJoin;
    private String joinMessage;
    private boolean joinMessageEnabled;
    private String leaveMessage;
    private boolean leaveMessageEnabled;
    private String firstJoinMessage;
    private boolean firstJoinMessageEnabled;
    private boolean protectionEnabled;
    private boolean blockBreakProtection;
    private boolean blockPlaceProtection;
    private boolean pvpProtection;
    private boolean mobSpawningProtection;
    private boolean explosionProtection;
    private boolean weatherChangeProtection;
    private boolean timeChangeProtection;
    private boolean hungerProtection;
    private boolean fallDamageProtection;
    private boolean fireProtection;
    private boolean dropProtection;
    private List<String> bypassPermissions;
    private double protectionRadius;
    private boolean randomRespawnEnabled;
    private RandomRespawnService randomRespawnService;
    private static int E8QjmWkbX6 = 0;

    private transient int f1041I3ic7w4uw = 639506552;
    private static String iebawwrgfm;
    private static String[] nothing_to_see_here = new String[13];

    public SpawnPlugin() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.SpawnPlugin.<init>():void");
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1339992731 ^ (1871277852 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1595437960) {
            i2 = 893108085 ^ i2;
            loadConfigSettings(1489553680);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -154826719) {
                int i3 = 1512911025 ^ i2;
                registerCommands(1252434752);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 665587115) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 665587115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2140528797 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 2113172547 ^ i3;
                    throw new IOException("double");
                }
                i2 = 327101879 ^ i3;
                registerListeners(366037201);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1135255533) {
                    i2 = 735183299 ^ i2;
                    if (getMainSpawn(927603613) != null) {
                        int i5 = 1236595302 ^ i2;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -490377718) {
                        int i6 = 1680103673 ^ i2;
                        getLogger(583940502).warning(qjmuopdsyg(euisavaetxuuvgv(), i6));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1008227903) {
                            int i7 = 764455583 ^ i6;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1008227903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1118716072 ^ i6)) {
                                break;
                            }
                        }
                        int i8 = 2019869331 ^ i6;
                        throw new RuntimeException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -490377718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (129453693 ^ i2)) {
                int i9 = 1856228340 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1595437960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (358742550 ^ i2)) {
                    int i10 = 1007985734 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1135255533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1747920427 ^ i2)) {
                        int i11 = 225786620 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -154826719 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1811375991 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = 1902663987 ^ i2;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1980584684 ^ (1960004789 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1263971705) {
            i2 = 1779799705 ^ i2;
            this.spawns.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469375410) {
                int i3 = 1917402497 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469375410 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1054540323 ^ i2)) {
                int i4 = 594240099 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1984694855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1563221349 ^ i2)) {
                    int i5 = 1839424009 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1263971705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1548381503 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 246362080 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void reload(int i) {
        int i2 = 1941181453 ^ (998239853 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469339315) {
            int i3 = 1051931589 ^ i2;
            this.spawns.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -295693670) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -295693670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (6853626 ^ i3)) {
                        break;
                    }
                }
                int i4 = 881665692 ^ i3;
                throw new RuntimeException("double");
            }
            int i5 = 539468207 ^ i3;
            loadConfig(392005859);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -279109661) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1690155200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (565688771 ^ i5)) {
                        int i6 = 1791821200 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -279109661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1623895759 ^ i5)) {
                            break;
                        }
                    }
                }
                int i7 = 1247386812 ^ i5;
                throw new RuntimeException("double");
            }
            i2 = 2039777448 ^ i5;
            loadConfigSettings(1489553680);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 603544224) {
                int i8 = 387408828 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 603544224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1502830774 ^ i2)) {
                int i9 = 699503623 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469339315 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (768971367 ^ i2)) {
                    break;
                }
            }
        }
        int i10 = 87868470 ^ i2;
        throw new IllegalAccessException();
    }

    private void registerCommands(int i) {
        int i2 = 1814578681 ^ (697430119 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1886122819) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1886122819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (836469999 ^ i2)) {
                    break;
                }
            }
            int i3 = 727643093 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 771148923 ^ i2;
        registerCommand((KCommand) new SetMainSpawnCommand(this, 1057448457), qjmuopdsyg(whaeblkxtrkhsbu(), i4), 800215123);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 534614170) {
            i4 = 2030653924 ^ i4;
            registerCommand((KCommand) new BuildCommand(), qjmuopdsyg(fttikxznxadvcbm(), i4), 800215123);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -677961799) {
                int i5 = 1576312725 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 534614170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (319904900 ^ i4)) {
                int i6 = 1860833375 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -677961799 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1608086774 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 711470493 ^ i4;
        throw new RuntimeException();
    }

    private void registerListeners(int i) {
        int i2 = 696000683 ^ (1787303158 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1107819867) {
            int i3 = 1744303926 ^ i2;
            registerEvent(new SpawnListener(this, 1686596622), 1095327048);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 2109228264) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2109228264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (862063448 ^ i3)) {
                        break;
                    }
                }
                int i4 = 467898731 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 854111211 ^ i3;
            if (this.protectionEnabled != (1029684086 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -352461903) {
                    i2 = 117453107 ^ i2;
                    registerEvent(new SpawnProtectionListener(this, 908933641), 1095327048);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -755215831) {
                        int i5 = 1946094652 ^ i2;
                        return;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 115951211:
                        int i6 = 1962884367 ^ i2;
                        return;
                    case 240303843:
                        return;
                    case 438011087:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -755215831 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1393005961 ^ i2)) {
                int i7 = 354727571 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1107819867 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1327189601 ^ i2)) {
                    int i8 = 2104118063 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -352461903 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (431976793 ^ i2)) {
                        int i9 = 463662458 ^ i2;
                        throw new RuntimeException();
                    }
                }
            }
        }
    }

    private void loadConfigSettings(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.SpawnPlugin.loadConfigSettings(int):void");
    }

    public Klocation getSpawn(String str, int i) {
        int i2 = 471635664 ^ (580631525 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1449183720) {
            int i3 = 2123963048 ^ i2;
            return this.spawns.get(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1449183720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (563775915 ^ i2)) {
                int i4 = 1755769168 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1566040923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1696718946 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1624364458 ^ i2;
        throw new IOException();
    }

    public Klocation getMainSpawn(int i) {
        int i2 = 974580951 ^ (480445316 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1745429800) {
            return getSpawn(qjmuopdsyg(eyncudruvlwqhzw(), 493098129 ^ i2), 963313746);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2094431840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2007436143 ^ i2)) {
                int i3 = 75839353 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1745429800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1103568038 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1225996225 ^ i2;
        throw new IllegalAccessException();
    }

    public void setSpawn(String str, Klocation klocation, int i) {
        int stooyyyduwujlkuo;
        int i2 = 1758411783 ^ (543645878 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 417643067) {
            int i3 = 1466492684 ^ i2;
            this.spawns.put(str, klocation);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1549565351) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1549565351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (92546660 ^ i3)) {
                        break;
                    }
                }
                int i4 = 873802393 ^ i3;
                throw new IOException("double");
            }
            i2 = 454921807 ^ i3;
            String str2 = "spawns." + str + ".location";
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2068836385) {
                int i5 = 267577389 ^ i2;
                getConfig(127597628).set(str2 + ".world", klocation.getWorldName(1398379797));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 81310025) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 81310025 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2031966884 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 1631580686 ^ i5;
                    throw new RuntimeException("double");
                }
                i2 = 28310818 ^ i5;
                getConfig(127597628).set(str2 + ".x", Double.valueOf(klocation.getX(399861716)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 161962073) {
                    int i7 = 1529408258 ^ i2;
                    getConfig(127597628).set(str2 + ".y", Double.valueOf(klocation.getY(1975753800)));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -790626229) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -790626229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1856947826 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 44816279 ^ i7;
                        throw new IOException("double");
                    }
                    i2 = 1668475056 ^ i7;
                    getConfig(127597628).set(str2 + ".z", Double.valueOf(klocation.getZ(1858809803)));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -881375800) {
                        i2 = 1818946877 ^ i2;
                        getConfig(127597628).set(str2 + ".yaw", Float.valueOf(klocation.getYaw(1230124394)));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1474286557) {
                            int i9 = 1809768110 ^ i2;
                            getConfig(127597628).set(str2 + ".pitch", Float.valueOf(klocation.getPitch(562066967)));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -153691824) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -153691824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (700660546 ^ i9)) {
                                        break;
                                    }
                                }
                                int i10 = 1849506105 ^ i9;
                                throw new RuntimeException("double");
                            }
                            int i11 = 1205727234 ^ i9;
                            List stringList = getConfig(127597628).getStringList(qjmuopdsyg(clkayevqvwreajs(), i11));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -935765694) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1977148273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (841765481 ^ i11)) {
                                        int i12 = 674850636 ^ i11;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -935765694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (725784588 ^ i11)) {
                                            break;
                                        }
                                    }
                                }
                                int i13 = 1975555557 ^ i11;
                                throw new IOException("double");
                            }
                            int i14 = 2123896262 ^ i11;
                            if (stringList.contains(str) != (664747758 ^ i14)) {
                                stooyyyduwujlkuo = stooyyyduwujlkuo(i14, 301408283);
                            } else {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != 1023014769) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1023014769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1663597914 ^ i14)) {
                                            break;
                                        }
                                    }
                                    int i15 = 512424045 ^ i14;
                                    throw new IOException("double");
                                }
                                i2 = 621220013 ^ i14;
                                stringList.add(str);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 348221976) {
                                    int i16 = 881584456 ^ i2;
                                    getConfig(127597628).set(qjmuopdsyg(xcupstfcagmlwti(), i16), stringList);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) != -1331808167) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -1331808167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (374759630 ^ i16)) {
                                                break;
                                            }
                                        }
                                        int i17 = 1298971507 ^ i16;
                                        throw new IllegalAccessException("double");
                                    }
                                    stooyyyduwujlkuo = 8116734 ^ i16;
                                }
                            }
                            saveConfigToDisk(817234375);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(stooyyyduwujlkuo) == -1287587927) {
                                int i18 = 416481947 ^ stooyyyduwujlkuo;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(stooyyyduwujlkuo) == -1287587927 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(stooyyyduwujlkuo) == (1261301579 ^ stooyyyduwujlkuo)) {
                                    break;
                                }
                            }
                            int i19 = 1074496533 ^ stooyyyduwujlkuo;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -881375800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1217277144 ^ i2)) {
                int i20 = 1152263157 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 348221976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1981013187 ^ i2)) {
                    int i21 = 1099664748 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 161962073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2135405624 ^ i2)) {
                        int i22 = 799721419 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2068836385 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (269382707 ^ i2)) {
                            int i23 = 624758126 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 417643067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1443442752 ^ i2)) {
                                int i24 = 1880580537 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1474286557 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (413195427 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i25 = 580156789 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isInSpawnRadius(org.bukkit.Location r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.SpawnPlugin.isInSpawnRadius(org.bukkit.Location, int):boolean");
    }

    public boolean hasProtectionBypass(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.SpawnPlugin.hasProtectionBypass(org.bukkit.entity.Player, int):boolean");
    }

    public com.kammoun.donutCore.api.utils.location.Klocation getFirstAvailableSpawn(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.SpawnPlugin.getFirstAvailableSpawn(int):com.kammoun.donutCore.api.utils.location.Klocation");
    }

    @Generated
    public Map getSpawns(int i) {
        int i2 = 1976579336 ^ (257707423 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1983538422) {
            int i3 = 235408563 ^ i2;
            return this.spawns;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1983538422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (277347579 ^ i2)) {
                int i4 = 1026717586 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -108659054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1920117192 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1082309106 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getTeleportDelay(int i) {
        int i2 = 323681927 ^ (933881811 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2059310352) {
            int i3 = 1977480886 ^ i2;
            return this.teleportDelay;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2059310352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (560383956 ^ i2)) {
                int i4 = 1460235894 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -732880733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (841334617 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1485806896 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isTeleportOnFirstJoin(int i) {
        int i2 = 1004287814 ^ (1280296083 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -516308710) {
            int i3 = 45712016 ^ i2;
            return this.teleportOnFirstJoin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -185215590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1302714697 ^ i2)) {
                int i4 = 679492221 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -516308710 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (345816415 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1391735717 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isTeleportOnRespawn(int i) {
        int i2 = 210253259 ^ (624556154 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 271069752) {
            int i3 = 168998582 ^ i2;
            return this.teleportOnRespawn;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1086162824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (57753327 ^ i2)) {
                int i4 = 29670931 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 271069752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1273965467 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 148657562 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isTeleportOnJoin(int i) {
        int i2 = 1500826116 ^ (1533653220 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1296926897) {
            int i3 = 1728435083 ^ i2;
            return this.teleportOnJoin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1969427690 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1341363583 ^ i2)) {
                int i4 = 1664144350 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1296926897 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (192667650 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 887591637 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getJoinMessage(int i) {
        int i2 = 1310176290 ^ (794674081 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1475732394) {
            int i3 = 1675147095 ^ i2;
            return this.joinMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1227905297 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1764485652 ^ i2)) {
                int i4 = 1740027123 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1475732394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1529083742 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 260201907 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isJoinMessageEnabled(int i) {
        int i2 = 1656851147 ^ (427105344 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2147292182) {
            int i3 = 1311362797 ^ i2;
            return this.joinMessageEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -246637440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2111945608 ^ i2)) {
                int i4 = 1969027532 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2147292182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (337879771 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1531588955 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getLeaveMessage(int i) {
        int i2 = 153213062 ^ (1344195421 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1805729429) {
            int i3 = 2008308703 ^ i2;
            return this.leaveMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1805729429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2104124806 ^ i2)) {
                int i4 = 2095324585 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 704389008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (813647560 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 959317240 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isLeaveMessageEnabled(int i) {
        int i2 = 2044646963 ^ (796815154 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -391931973) {
            int i3 = 1735722457 ^ i2;
            return this.leaveMessageEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -754206352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (791458209 ^ i2)) {
                int i4 = 1861633887 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -391931973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1893242371 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1850973248 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getFirstJoinMessage(int i) {
        int i2 = 193193564 ^ (1460365978 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1176356477) {
            int i3 = 1148290065 ^ i2;
            return this.firstJoinMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1176356477 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (18416866 ^ i2)) {
                int i4 = 1046479519 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1704060663 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (606376394 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 32266859 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isFirstJoinMessageEnabled(int i) {
        int i2 = 1242087774 ^ (1124593531 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 366947993) {
            int i3 = 1503384155 ^ i2;
            return this.firstJoinMessageEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -654197693 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2057747536 ^ i2)) {
                int i4 = 592507408 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 366947993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (290476594 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1930903578 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isProtectionEnabled() {
        int i = 1854525075 ^ (1396629425 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1340156256) {
            int i2 = 370693254 ^ i;
            return this.protectionEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 14447248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1029508741 ^ i)) {
                int i3 = 680462353 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1340156256 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (604675817 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2039277942 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isBlockBreakProtection(int i) {
        int i2 = 1939425543 ^ (1364270304 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1273294984) {
            int i3 = 709295325 ^ i2;
            return this.blockBreakProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 433264225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (948377508 ^ i2)) {
                int i4 = 1639558286 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1273294984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1575920666 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1690332135 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isBlockPlaceProtection(int i) {
        int i2 = 60530832 ^ (2099933242 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1473717534) {
            int i3 = 783972492 ^ i2;
            return this.blockPlaceProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -570745213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (523818830 ^ i2)) {
                int i4 = 2107487880 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1473717534 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1311334405 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 584613053 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isPvpProtection(int i) {
        int i2 = 1217173103 ^ (1578261490 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -380619943) {
            int i3 = 378694186 ^ i2;
            return this.pvpProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1573085705 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1014639279 ^ i2)) {
                int i4 = 396666564 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -380619943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (52194665 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 452073283 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isMobSpawningProtection(int i) {
        int i2 = 655114817 ^ (1645374533 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1968648083) {
            int i3 = 2077237325 ^ i2;
            return this.mobSpawningProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1968648083 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1569836280 ^ i2)) {
                int i4 = 2023198335 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1412026888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2126402529 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1653942575 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isExplosionProtection(int i) {
        int i2 = 82841630 ^ (1663988290 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1666534738) {
            int i3 = 1319851011 ^ i2;
            return this.explosionProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 370142536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1993962794 ^ i2)) {
                int i4 = 1674249485 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1666534738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1153538435 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 373957848 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isWeatherChangeProtection(int i) {
        int i2 = 932007794 ^ (1007943862 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 23863697) {
            int i3 = 392011871 ^ i2;
            return this.weatherChangeProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1149164695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (293523448 ^ i2)) {
                int i4 = 1038329370 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 23863697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1321526874 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1306689244 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isTimeChangeProtection(int i) {
        int i2 = 1128716405 ^ (895859857 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -323127150) {
            int i3 = 748042592 ^ i2;
            return this.timeChangeProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -323127150 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2132219729 ^ i2)) {
                int i4 = 1885778599 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2012433517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (217868911 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 274988524 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isHungerProtection(int i) {
        int i2 = 250307503 ^ (1962490934 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1925930118) {
            int i3 = 38028371 ^ i2;
            return this.hungerProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1625914910 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1407170899 ^ i2)) {
                int i4 = 854666359 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1925930118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (4474821 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 962260128 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isFallDamageProtection(int i) {
        int i2 = 1683932782 ^ (1126347629 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1715861416) {
            int i3 = 1717891461 ^ i2;
            return this.fallDamageProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1432517507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (389451220 ^ i2)) {
                int i4 = 332168519 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1715861416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1229236349 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1088415110 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isFireProtection(int i) {
        int i2 = 980683673 ^ (1763604165 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -956975789) {
            int i3 = 1995085259 ^ i2;
            return this.fireProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -956975789 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (823649558 ^ i2)) {
                int i4 = 1114407984 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1906383624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1931522317 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1936837841 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isDropProtection(int i) {
        int i2 = 1282565990 ^ (88188035 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 339230875) {
            int i3 = 1721924934 ^ i2;
            return this.dropProtection;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 556509864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (650117747 ^ i2)) {
                int i4 = 1408591822 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 339230875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (236865811 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 236392135 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public List<String> getBypassPermissions() {
        int i = 801682394 ^ (1989130482 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1751251213) {
            int i2 = 1483782692 ^ i;
            return this.bypassPermissions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1751251213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1658537710 ^ i)) {
                int i3 = 1889072968 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1411110865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1089514001 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 759211976 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public double getProtectionRadius() {
        int i = 1289240103 ^ (1773533103 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1992823792) {
            int i2 = 5971748 ^ i;
            return this.protectionRadius;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1947265744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (407739893 ^ i)) {
                int i3 = 1047413677 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1992823792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1555945207 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1925225330 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isRandomRespawnEnabled(int i) {
        int i2 = 484999972 ^ (772014341 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -893235528) {
            int i3 = 19524366 ^ i2;
            return this.randomRespawnEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1014163768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1252694726 ^ i2)) {
                int i4 = 396692776 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -893235528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (340499216 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1693698381 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public RandomRespawnService getRandomRespawnService(int i) {
        int i2 = 676093993 ^ (610650986 ^ 733268982);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1022035369) {
            int i3 = 1192825470 ^ i2;
            return this.randomRespawnService;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 69441115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1513522265 ^ i2)) {
                int i4 = 121684929 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1022035369 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (591972297 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 807844927 ^ i2;
        throw new IOException();
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
        iebawwrgfm = ByteBuffer.wrap(aqkgutugngdsnqr()).asCharBuffer().toString();
        E8QjmWkbX6 = 514741380 ^ new Random(-8768128210805842343L).nextInt();
    }

    public static String qjmuopdsyg(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = iebawwrgfm.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] euisavaetxuuvgv() {
        return new byte[]{0, 0, 0, 54, 0, 0, 0, 0};
    }

    private static byte[] fttikxznxadvcbm() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 54};
    }

    private static byte[] whaeblkxtrkhsbu() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 59};
    }

    private static byte[] ltetbertvfsbbhr() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, 71};
    }

    private static byte[] rvyzbximvslnnrz() {
        return new byte[]{0, 0, 0, 21, 0, 0, 0, 93};
    }

    private static byte[] rqknddwyhgsgusw() {
        return new byte[]{0, 0, 0, 35, 0, 0, 0, 114};
    }

    private static byte[] tymlegpfnncylvk() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, -107};
    }

    private static byte[] lbqmkprdhvuhifu() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, -90};
    }

    private static byte[] rkcibvyvkuovbtb() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -74};
    }

    private static byte[] vcfutxmnicnjsow() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, -52};
    }

    private static byte[] idxfvmtqfsgquof() {
        return new byte[]{0, 0, 0, 21, 0, 0, 0, -37};
    }

    private static byte[] tbzlykevktzuzvh() {
        return new byte[]{0, 0, 0, 29, 0, 0, 0, -16};
    }

    private static byte[] oindrxjnzwkrsqn() {
        return new byte[]{0, 0, 0, 22, 0, 0, 1, 13};
    }

    private static byte[] jbffyxrejebaexw() {
        return new byte[]{0, 0, 0, 14, 0, 0, 1, 35};
    }

    private static byte[] fhfkmruzcsgmkdo() {
        return new byte[]{0, 0, 0, 20, 0, 0, 1, 49};
    }

    private static byte[] dotjwqdklzmeydb() {
        return new byte[]{0, 0, 0, 22, 0, 0, 1, 69};
    }

    private static byte[] lmgpllsbycmjjed() {
        return new byte[]{0, 0, 0, 19, 0, 0, 1, 91};
    }

    private static byte[] forffipjklsibkl() {
        return new byte[]{0, 0, 0, 6, 0, 0, 1, 110};
    }

    private static byte[] oerikdffhftxdli() {
        return new byte[]{0, 0, 0, 25, 0, 0, 1, 116};
    }

    private static byte[] mpkoysooyajnaeo() {
        return new byte[]{0, 0, 0, 17, 0, 0, 1, -115};
    }

    private static byte[] leipqpasrtbirpi() {
        return new byte[]{0, 0, 0, 27, 0, 0, 1, -98};
    }

    private static byte[] uitwrbadgballuf() {
        return new byte[]{0, 0, 0, 37, 0, 0, 1, -71};
    }

    private static byte[] nioluocrpznmpjf() {
        return new byte[]{0, 0, 0, 69, 0, 0, 1, -34};
    }

    private static byte[] nduxoxqrpqamhqo() {
        return new byte[]{0, 0, 0, 22, 0, 0, 2, 35};
    }

    private static byte[] uheycebhftzvrif() {
        return new byte[]{0, 0, 0, 6, 0, 0, 2, 57};
    }

    private static byte[] uvumxuluhpujdrn() {
        return new byte[]{0, 0, 0, 14, 0, 0, 2, 63};
    }

    private static byte[] ymmiyduaojjsiss() {
        return new byte[]{0, 0, 0, 21, 0, 0, 2, 77};
    }

    private static byte[] wippqwuebqmmvft() {
        return new byte[]{0, 0, 0, 14, 0, 0, 2, 98};
    }

    private static byte[] xhfnkjwznegxjbg() {
        return new byte[]{0, 0, 0, 22, 0, 0, 2, 112};
    }

    private static byte[] fsdbyrzvqaqwtdv() {
        return new byte[]{0, 0, 0, 33, 0, 0, 2, -122};
    }

    private static byte[] hcluhyxkzyxojbc() {
        return new byte[]{0, 0, 0, 23, 0, 0, 2, -89};
    }

    private static byte[] hdcghopvelgmfge() {
        return new byte[]{0, 0, 0, 18, 0, 0, 2, -66};
    }

    private static byte[] jfelhvpkqmkesep() {
        return new byte[]{0, 0, 0, 27, 0, 0, 2, -48};
    }

    private static byte[] csxspnxewaywsql() {
        return new byte[]{0, 0, 0, 22, 0, 0, 2, -21};
    }

    private static byte[] ddschonkpganwgz() {
        return new byte[]{0, 0, 0, 22, 0, 0, 3, 1};
    }

    private static byte[] eyncudruvlwqhzw() {
        return new byte[]{0, 0, 0, 5, 0, 0, 3, 23};
    }

    private static byte[] clkayevqvwreajs() {
        return new byte[]{0, 0, 0, 6, 0, 0, 3, 28};
    }

    private static byte[] xcupstfcagmlwti() {
        return new byte[]{0, 0, 0, 6, 0, 0, 3, 34};
    }

    private static byte[] xcffzicyebuqtnt() {
        return new byte[]{0, 0, 0, 30, 0, 0, 3, 40};
    }

    private static byte[] aqkgutugngdsnqr() {
        return new byte[]{57, 121, 55, 86, 49, 90, 51, 93, 54, 25, 52, 68, 55, 65, 51, 82, 51, 65, 57, 90, 55, 23, 49, 93, 51, 92, 54, 77, 52, 23, 55, 66, 51, 86, 51, 66, 57, 21, 55, 23, 49, 102, 51, 64, 54, 92, 52, 23, 55, 30, 51, 64, 51, 83, 57, 64, 55, 90, 49, 82, 51, 90, 54, 87, 52, 68, 55, 65, 51, 82, 51, 65, 57, 90, 55, 23, 49, 71, 51, 92, 54, 25, 52, 84, 55, 94, 51, 93, 51, 80, 57, 93, 55, 80, 49, 70, 51, 65, 54, 92, 52, 23, 55, 88, 51, 71, 51, 24, 57, 90, 56, 76, 57, 95, 53, 85, 57, 93, 49, 66, 52, 85, 53, 66, 56, 88, 57, 84, 49, 88, 52, 94, 53, 69, 56, 69, 57, 84, 49, 70, 52, 94, 49, 67, 48, 83, 48, 86, 48, 92, 49, 87, 49, 92, 48, 31, 48, 74, 48, 93, 49, 75, 49, 65, 48, 83, 48, 79, 48, 86, 49, 22, 49, 84, 48, 92, 48, 89, 48, 90, 49, 84, 49, 84, 48, 86, 49, 91, 53, 87, 56, 75, 50, 75, 56, 82, 49, 81, 53, 87, 56, 75, 50, 22, 56, 89, 49, 89, 53, 91, 56, 86, 50, 22, 56, 94, 49, 83, 53, 65, 56, 75, 50, 89, 56, 84, 49, 83, 49, 16, 53, 87, 56, 29, 50, 72, 56, 95, 49, 87, 53, 75, 56, 93, 50, 74, 56, 22, 49, 22, 53, 20, 56, 89, 50, 80, 56, 82, 49, 69, 53, 18, 56, 82, 50, 87, 56, 90, 49, 88, 53, 87, 56, 92, 50, 24, 56, 71, 49, 94, 53, 87, 56, 24, 50, 75, 56, 86, 49, 68, 53, 68, 56, 93, 50, 74, 56, 18, 50, 64, 57, 71, 49, 95, 50, 69, 49, 84, 50, 83, 57, 65, 49, 89, 50, 94, 49, 95, 50, 30, 57, 71, 49, 81, 50, 85, 49, 88, 50, 69, 57, 70, 56, 64, 53, 81, 50, 92, 49, 87, 57, 72, 52, 90, 52, 64, 48, 69, 50, 20, 56, 91, 53, 90, 50, 29, 49, 88, 57, 87, 52, 92, 52, 92, 49, 66, 49, 71, 50, 94, 53, 67, 56, 83, 49, 81, 49, 65, 50, 88, 53, 88, 56, 88, 49, 28, 49, 87, 50, 93, 53, 88, 56, 85, 49, 89, 49, 24, 50, 83, 53, 69, 56, 83, 49, 83, 49, 94, 52, 73, 53, 75, 57, 95, 57, 65, 50, 81, 57, 86, 57, 77, 48, 80, 53, 93, 52, 87, 53, 23, 57, 86, 57, 92, 50, 70, 57, 80, 49, 85, 48, 80, 51, 67, 56, 75, 51, 89, 49, 95, 48, 80, 51, 67, 56, 22, 51, 82, 49, 87, 48, 92, 51, 94, 56, 22, 51, 93, 49, 86, 48, 84, 51, 82, 56, 84, 51, 93, 49, 92, 50, 64, 56, 67, 55, 92, 49, 71, 52, 80, 50, 83, 56, 69, 55, 90, 49, 92, 52, 91, 50, 30, 56, 83, 55, 74, 49, 67, 52, 84, 50, 67, 56, 66, 55, 30, 49, 67, 52, 80, 50, 66, 56, 92, 55, 90, 49, 64, 52, 70, 50, 89, 56, 94, 55, 93, 49, 64, 50, 68, 55, 87, 55, 94, 48, 80, 48, 66, 50, 95, 55, 64, 55, 70, 48, 24, 48, 93, 50, 94, 55, 31, 55, 84, 48, 92, 48, 64, 50, 67, 55, 70, 55, 31, 48, 95, 48, 93, 50, 89, 55, 92, 49, 69, 52, 88, 53, 88, 49, 83, 50, 86, 49, 90, 52, 20, 53, 68, 49, 82, 50, 74, 49, 71, 52, 88, 53, 65, 49, 89, 57, 69, 52, 74, 49, 93, 52, 69, 53, 92, 53, 87, 56, 69, 50, 93, 49, 90, 57, 91, 52, 22, 49, 91, 52, 69, 53, 92, 53, 89, 56, 28, 50, 80, 49, 71, 57, 90, 52, 72, 50, 64, 48, 64, 51, 92, 48, 68, 55, 83, 50, 83, 48, 70, 51, 90, 48, 95, 55, 88, 50, 30, 48, 70, 51, 90, 48, 93, 55, 83, 50, 29, 48, 81, 51, 91, 48, 81, 55, 88, 50, 87, 48, 87, 55, 64, 57, 86, 56, 91, 48, 81, 52, 71, 52, 86, 51, 74, 55, 68, 52, 25, 55, 91, 57, 93, 56, 26, 48, 70, 52, 82, 52, 74, 51, 72, 55, 81, 52, 67, 55, 90, 52, 71, 49, 72, 56, 88, 55, 78, 55, 90, 52, 66, 49, 69, 54, 68, 50, 94, 51, 71, 50, 87, 49, 86, 54, 66, 50, 88, 51, 92, 50, 92, 49, 27, 54, 65, 50, 84, 51, 82, 50, 70, 49, 93, 54, 83, 50, 67, 51, 30, 50, 81, 49, 93, 54, 87, 50, 95, 51, 84, 50, 87, 57, 67, 52, 75, 50, 89, 56, 69, 54, 92, 51, 87, 57, 70, 54, 81, 49, 89, 57, 93, 52, 23, 50, 94, 56, 68, 54, 87, 51, 83, 57, 87, 54, 74, 49, 88, 53, 93, 51, 67, 51, 66, 56, 89, 49, 82, 53, 93, 51, 67, 51, 31, 56, 94, 49, 92, 53, 74, 51, 67, 51, 69, 56, 21, 49, 95, 53, 87, 51, 89, 51, 95, 56, 22, 49, 88, 53, 93, 51, 67, 51, 66, 56, 89, 49, 82, 53, 93, 49, 19, 53, 89, 51, 103, 51, 84, 56, 84, 49, 86, 53, 87, 51, 93, 51, 84, 56, 24, 49, 19, 53, 93, 51, 21, 51, 65, 56, 84, 49, 84, 53, 65, 51, 85, 51, 67, 56, 29, 49, 21, 53, 30, 51, 81, 51, 69, 56, 87, 49, 21, 53, 76, 51, 88, 51, 84, 56, 24, 49, 70, 53, 93, 51, 66, 51, 71, 56, 93, 49, 71, 53, 25, 57, 98, 53, 86, 56, 94, 52, 87, 53, 86, 48, 88, 55, 24, 48, 70, 51, 80, 57, 67, 53, 71, 56, 81, 52, 68, 53, 87, 48, 21, 55, 81, 48, 71, 51, 21, 57, 85, 53, 89, 56, 81, 52, 81, 
        53, 85, 48, 80, 55, 92, 48, 20, 51, 87, 57, 69, 53, 67, 56, 16, 52, 80, 53, 86, 48, 91, 55, 94, 48, 93, 51, 82, 57, 69, 53, 69, 56, 81, 52, 71, 53, 80, 48, 90, 55, 86, 48, 20, 51, 92, 57, 67, 53, 23, 56, 89, 52, 93, 53, 79, 48, 84, 55, 84, 48, 93, 51, 81, 57, 30, 53, 23, 56, 116, 52, 90, 53, 74, 48, 84, 55, 90, 48, 88, 51, 92, 57, 94, 53, 80, 56, 16, 52, 90, 53, 77, 48, 27, 56, 84, 54, 85, 50, 75, 48, 68, 57, 89, 57, 81, 48, 87, 56, 67, 55, 23, 56, 85, 54, 85, 50, 89, 48, 65, 57, 93, 57, 24, 48, 87, 56, 94, 55, 88, 56, 91, 54, 92, 50, 93, 48, 83, 49, 71, 56, 65, 55, 85, 51, 71, 57, 87, 49, 71, 49, 65, 55, 81, 56, 89, 55, 83, 54, 65, 53, 88, 52, 74, 53, 67, 54, 27, 49, 81, 55, 81, 56, 89, 55, 87, 54, 72, 49, 70, 49, 69, 51, 94, 52, 67, 53, 87, 49, 85, 49, 67, 51, 88, 52, 88, 53, 92, 49, 24, 49, 82, 51, 73, 52, 71, 53, 94, 49, 89, 49, 68, 51, 88, 52, 88, 53, 92, 49, 69, 49, 73, 49, 67, 52, 93, 48, 70, 49, 81, 49, 90, 49, 69, 52, 91, 48, 93, 49, 90, 49, 23, 49, 65, 52, 68, 48, 66, 50, 93, 56, 86, 48, 68, 55, 74, 49, 81, 50, 87, 56, 86, 48, 68, 55, 23, 49, 92, 50, 85, 56, 82, 48, 65, 55, 92, 49, 30, 50, 93, 56, 86, 48, 68, 55, 74, 49, 81, 50, 87, 56, 86, 50, 22, 56, 86, 48, 18, 55, 73, 49, 92, 50, 81, 56, 74, 48, 82, 55, 75, 49, 21, 50, 16, 56, 21, 48, 84, 55, 81, 49, 81, 50, 67, 56, 19, 48, 91, 55, 92, 49, 86, 50, 68, 56, 19, 48, 67, 55, 81, 49, 85, 50, 16, 56, 64, 48, 82, 55, 75, 49, 70, 50, 85, 56, 65, 48, 22, 57, 65, 49, 69, 54, 93, 53, 70, 57, 92, 49, 82, 55, 66, 50, 92, 50, 86, 57, 95, 49, 25, 54, 95, 53, 93, 57, 91, 49, 28, 55, 69, 50, 69, 50, 88, 57, 70, 49, 89, 54, 91, 53, 92, 57, 94, 49, 70, 50, 66, 51, 93, 57, 71, 55, 93, 49, 85, 50, 68, 51, 91, 57, 92, 55, 86, 49, 24, 50, 85, 51, 92, 57, 82, 55, 90, 49, 90, 50, 85, 51, 86, 50, 95, 50, 92, 51, 66, 57, 75, 53, 83, 50, 85, 57, 86, 49, 74, 56, 27, 50, 84, 50, 80, 51, 67, 57, 75, 53, 70, 50, 31, 57, 89, 49, 86, 56, 92, 50, 92, 50, 23, 51, 84, 57, 86, 53, 83, 50, 80, 57, 95, 49, 92, 56, 81, 50, 64, 52, 67, 50, 94, 50, 71, 57, 84, 50, 83, 52, 69, 50, 88, 50, 92, 57, 95, 50, 30, 52, 83, 50, 93, 50, 92, 57, 82, 50, 91, 52, 28, 50, 65, 50, 95, 57, 80, 50, 83, 52, 84, 52, 71, 57, 68, 52, 88, 56, 66, 56, 81, 55, 90, 54, 64, 55, 81, 54, 87, 52, 89, 57, 24, 52, 81, 56, 87, 56, 88, 55, 85, 54, 25, 55, 92, 54, 89, 52, 90, 57, 87, 52, 80, 56, 83, 50, 100, 53, 64, 54, 87, 57, 68, 50, 92, 49, 103, 57, 67, 54, 85, 50, 71, 50, 90, 49, 71, 57, 99, 55, 66, 54, 84, 56, 71, 51, 87, 48, 68, 49, 122, 50, 89, 48, 18, 49, 68, 50, 82, 49, 88, 50, 95, 48, 86, 49, 18, 50, 64, 49, 68, 50, 87, 48, 69, 49, 92, 50, 19, 49, 88, 50, 89, 48, 81, 49, 83, 50, 71, 49, 93, 50, 89, 48, 92, 49, 18, 50, 85, 49, 91, 50, 67, 48, 92, 49, 86, 50, 18};
    }

    private static int stooyyyduwujlkuo(int i, int i2) {
        return i2 ^ i;
    }
}
