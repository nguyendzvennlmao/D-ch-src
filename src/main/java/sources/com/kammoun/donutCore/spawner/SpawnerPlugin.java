package com.kammoun.donutCore.spawner;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.sell.SellPlugin;
import com.kammoun.donutCore.spawner.commands.SpawnerCommand;
import com.kammoun.donutCore.spawner.database.SpawnerDatabase;
import com.kammoun.donutCore.spawner.events.SpawnerEvents;
import com.kammoun.donutCore.spawner.manager.PlacedSpawnerManager;
import com.kammoun.donutCore.spawner.manager.SpawnerConfigManager;
import com.kammoun.donutCore.spawner.manager.SpawnerManager;
import com.kammoun.donutCore.spawner.manager.SpawnerTickManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class SpawnerPlugin extends DonutModule {
    private SpawnerConfigManager spawnerConfigManager;
    private SpawnerDatabase database;
    private SpawnerTickManager tickManager;
    private final SellPlugin sellPlugin;
    private static SpawnerPlugin instance;
    private static int CwTN4zuYok = 0;
    private transient int xHrPObdxca = 1067541781;
    private static String qiyvrbxjdq;
    private static String[] nothing_to_see_here = new String[19];

    public SpawnerPlugin(com.kammoun.donutCore.sell.SellPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.SpawnerPlugin.<init>(com.kammoun.donutCore.sell.SellPlugin, int):void");
    }

    @Override
    public void onModuleEnable(int i) {
        int ftgusbryqjdnwlzv;
        int i2;
        int i3;
        int i4 = 1297466733 ^ (1656070304 ^ 646448202);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1262685240) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1262685240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (97521706 ^ i4)) {
                    break;
                }
            }
            int i5 = 2069211980 ^ i4;
            throw new IOException("double");
        }
        int i6 = 1396158135 ^ i4;
        instance = this;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -755074686) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -755074686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (503424946 ^ i6)) {
                    break;
                }
            }
            int i7 = 1287447763 ^ i6;
            throw new RuntimeException("double");
        }
        int i8 = 1022656773 ^ i6;
        saveConfig(mqvxvuqabf(meqnquvwqjrumel(), i8), 1620467835);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 895119787) {
            i8 = 815515054 ^ i8;
            this.spawnerConfigManager = new SpawnerConfigManager(this, 1384120027);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1316725542) {
                i8 = 1566117400 ^ i8;
                File file = new File(getModuleDataFolder(493044696), mqvxvuqabf(uakymmsvsxjapgo(), i8));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1531718680) {
                    int i9 = 1358521954 ^ i8;
                    SpawnerManager.getInstance(932047160).loadSpawners(file, 1859303389);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -595124470) {
                        ?? r0 = 1529699565 ^ i9;
                        i8 = r0;
                        try {
                            this.database = new SpawnerDatabase(this, 267686524);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 99481696) {
                                i8 = 188326177 ^ i8;
                                SchedulerUtil.runAsync(() -> {
                                    int i10 = 1932539605 ^ (1876896302 ^ 646448202);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -751254135) {
                                        i10 = 1537002758 ^ i10;
                                        this.database.loadSpawners(936049408);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 266251707) {
                                            int i11 = 701563702 ^ i10;
                                            return;
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -751254135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1657258298 ^ i10)) {
                                            int i12 = 1305095355 ^ i10;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 266251707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1226905108 ^ i10)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i13 = 1976352277 ^ i10;
                                    throw new RuntimeException();
                                }, 1163669431);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1545662824) {
                                    i8 = 1768973185 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 396619107) {
                                        int i10 = 176643813 ^ i8;
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10) == 174029870) {
                                                throw new IOException();
                                            }
                                            throw null;
                                        } catch (IOException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case 1134107211:
                                                    i3 = ftgusbryqjdnwlzv(i10, 1625780355);
                                                    break;
                                                case 1778887137:
                                                    i3 = 634693366 ^ i10;
                                                    break;
                                                default:
                                                    throw new IOException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1151508048) {
                                                i8 = ftgusbryqjdnwlzv(i3, 164238147);
                                                this.tickManager = new SpawnerTickManager(this.spawnerConfigManager, 1961652171);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 183632968) {
                                                    i2 = 410846212 ^ i8;
                                                    SchedulerUtil.runLater(() -> {
                                                        int i11 = 255524846 ^ (379044434 ^ 646448202);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -114700367) {
                                                            int i12 = 2039315147 ^ i11;
                                                            this.tickManager.start(905453213);
                                                            return;
                                                        }
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 893524458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1751844803 ^ i11)) {
                                                                int i13 = 1149757092 ^ i11;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -114700367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (276727076 ^ i11)) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        int i14 = 1809780946 ^ i11;
                                                        throw new IOException();
                                                    }, 40L, 1577269415);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -921033624) {
                                                        i3 = 2298118 ^ i2;
                                                        registerEvent(new SpawnerEvents(this, 1568417193), 1095327048);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -939348904) {
                                                            i8 = 1119301394 ^ i3;
                                                            registerCommand((KCommand) new SpawnerCommand(this, 96235249), mqvxvuqabf(dkgdluymvvwzmgl(), i8), 800215123);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -574892854) {
                                                                i9 = 1948791784 ^ i8;
                                                                SchedulerUtil.runTimer(() -> {
                                                                    int i11 = 1367350706 ^ (1068318607 ^ 646448202);
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1160328122) {
                                                                        while (true) {
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1160328122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (764628073 ^ i11)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        int i12 = 1978212355 ^ i11;
                                                                        throw new IOException("double");
                                                                    }
                                                                    int i13 = 1879541543 ^ i11;
                                                                    if (this.database == null) {
                                                                        ftgusbryqjdnwlzv(i13, 142601137);
                                                                        return;
                                                                    }
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -988476799) {
                                                                        i13 = 352357068 ^ i13;
                                                                        SchedulerUtil.runAsync(() -> {
                                                                            int i14 = 2010038719 ^ (1767288065 ^ 646448202);
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1065138271) {
                                                                                int i15 = 1430172101 ^ i14;
                                                                                this.database.saveAll(1272087521);
                                                                                return;
                                                                            }
                                                                            while (true) {
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1065138271 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1494362003 ^ i14)) {
                                                                                    int i16 = 2128933899 ^ i14;
                                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1769392523 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (247300690 ^ i14)) {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                            int i17 = 1712749757 ^ i14;
                                                                            throw new IOException();
                                                                        }, 1163669431);
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1829854433) {
                                                                            int i14 = 494887293 ^ i13;
                                                                            return;
                                                                        }
                                                                    }
                                                                    while (true) {
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1829854433 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (23615570 ^ i13)) {
                                                                            int i15 = 736712802 ^ i13;
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -988476799 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (328468890 ^ i13)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    int i16 = 1369862420 ^ i13;
                                                                    throw new IOException();
                                                                }, 6000L, 6000L, 2041710047);
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2096778121) {
                                                                    int i11 = 2083006761 ^ i9;
                                                                    return;
                                                                }
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2096778121) {
                                                                        int i12 = 2094403151 ^ i9;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1155454296) {
                                                                            continue;
                                                                        } else {
                                                                            int i13 = 819879561 ^ i9;
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -595124470) {
                                                                                int i14 = 984178830 ^ i9;
                                                                                throw new IllegalAccessException("double");
                                                                            }
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1545662824) {
                                                                    int i15 = 1629393140 ^ i8;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -574892854) {
                                                                        continue;
                                                                    } else {
                                                                        int i16 = 1382766628 ^ i8;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 99481696) {
                                                                            continue;
                                                                        } else {
                                                                            int i17 = 2027658430 ^ i8;
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1316725542) {
                                                                                int i18 = 842598522 ^ i8;
                                                                                throw new RuntimeException("double");
                                                                            }
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1892281493) {
                                                            int i19 = 824128158 ^ i2;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1778887137) {
                                                                continue;
                                                            } else {
                                                                int i20 = 1803455634 ^ i2;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -921033624) {
                                                                    int i21 = 903343484 ^ i2;
                                                                    throw new IOException("double");
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 895119787) {
                                                        int i22 = 874125751 ^ i8;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 183632968) {
                                                            continue;
                                                        } else {
                                                            int i23 = 1476713110 ^ i8;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1134107211) {
                                                                continue;
                                                            } else {
                                                                int i24 = 882887631 ^ i8;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 396619107) {
                                                                    continue;
                                                                } else {
                                                                    int i25 = 906624507 ^ i8;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1531718680) {
                                                                        int i26 = 1789654720 ^ i8;
                                                                        throw new RuntimeException();
                                                                    }
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1151508048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1429811285 ^ i3)) {
                                                    int i27 = 201762750 ^ i3;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -939348904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (157185849 ^ i3)) {
                                                        int i28 = 1863724484 ^ i3;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1648688446 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (655864706 ^ i3)) {
                                                            int i29 = 1327281754 ^ i3;
                                                            throw new RuntimeException("double");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                case 99481696:
                                    ftgusbryqjdnwlzv = 534264300 ^ i8;
                                    break;
                                case 1545662824:
                                    ftgusbryqjdnwlzv = ftgusbryqjdnwlzv(i8, 350329037);
                                    break;
                                default:
                                    throw new IllegalAccessException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ftgusbryqjdnwlzv) == -80988416) {
                                i2 = 1854096525 ^ ftgusbryqjdnwlzv;
                                getLogger(583940502).severe("Failed to initialize database: " + r0.getMessage());
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1892281493) {
                                    i9 = 2038241478 ^ i2;
                                    r0.printStackTrace();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1155454296) {
                                        i8 = 163944994 ^ i9;
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1892281493 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1277530385 ^ i2)) {
                                        int i192 = 824128158 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1778887137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (847054739 ^ i2)) {
                                            int i202 = 1803455634 ^ i2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -921033624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (923029827 ^ i2)) {
                                                int i212 = 903343484 ^ i2;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ftgusbryqjdnwlzv) == -80988416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ftgusbryqjdnwlzv) == (1144589810 ^ ftgusbryqjdnwlzv)) {
                                        int i30 = 2144650504 ^ ftgusbryqjdnwlzv;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2096778121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1778874060 ^ i9)) {
                            int i122 = 2094403151 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1155454296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (2105082066 ^ i9)) {
                                int i132 = 819879561 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -595124470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (64101034 ^ i9)) {
                                    int i142 = 984178830 ^ i9;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1545662824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (391332489 ^ i8)) {
                    int i152 = 1629393140 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -574892854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1234807673 ^ i8)) {
                        int i162 = 1382766628 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 99481696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (431393470 ^ i8)) {
                            int i172 = 2027658430 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1316725542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (738524080 ^ i8)) {
                                int i182 = 842598522 ^ i8;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 895119787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (371952538 ^ i8)) {
                int i222 = 874125751 ^ i8;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 183632968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1874028822 ^ i8)) {
                    int i232 = 1476713110 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1134107211 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (810112068 ^ i8)) {
                        int i242 = 882887631 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 396619107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (755916809 ^ i8)) {
                            int i252 = 906624507 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1531718680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (677724907 ^ i8)) {
                                int i262 = 1789654720 ^ i8;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onModuleDisable(int i) {
        int ftgusbryqjdnwlzv;
        int i2 = 700308338 ^ (2045739785 ^ 646448202);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1227693685) {
            int i3 = 1488000615 ^ i2;
            if (this.tickManager == null) {
                i2 = ftgusbryqjdnwlzv(i3, 677885445);
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1935299249) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1935299249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1251319795 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 518458954 ^ i3;
                    throw new RuntimeException("double");
                }
                i2 = 1800707487 ^ i3;
                this.tickManager.stop(859955427);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 704560714) {
                    i2 = 1127426970 ^ i2;
                }
            }
            if (this.database == null) {
                ftgusbryqjdnwlzv = ftgusbryqjdnwlzv(i2, 2062741255);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 812114584) {
                int i5 = 1751549589 ^ i2;
                this.database.saveAll(1272087521);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1934874163) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1934874163 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1001956372 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 821592401 ^ i5;
                    throw new IllegalAccessException("double");
                }
                i2 = 1639923770 ^ i5;
                this.database.closeConnection(1119968866);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2125060064) {
                    ftgusbryqjdnwlzv = 1932208552 ^ i2;
                }
            }
            PlacedSpawnerManager.getInstance(1417101256).clear(740616538);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ftgusbryqjdnwlzv) == -403662173) {
                int i7 = 1833048273 ^ ftgusbryqjdnwlzv;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ftgusbryqjdnwlzv) == -403662173 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ftgusbryqjdnwlzv) == (160147530 ^ ftgusbryqjdnwlzv)) {
                    break;
                }
            }
            int i8 = 1991329795 ^ ftgusbryqjdnwlzv;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 704560714 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (729957238 ^ i2)) {
                int i9 = 1562061251 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1227693685 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (137483498 ^ i2)) {
                    int i10 = 607821482 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 812114584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1120049473 ^ i2)) {
                        int i11 = 859856655 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2125060064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1471812780 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = 1088851769 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    public void reload(int i) {
        int i2 = 1297601756 ^ (910369233 ^ 646448202);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -320370118) {
            i2 = 1882504118 ^ i2;
            this.spawnerConfigManager.reload(1314393881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1833064329) {
                i2 = 131381387 ^ i2;
                File file = new File(getModuleDataFolder(493044696), mqvxvuqabf(vcympeexxlseztb(), i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1407685585) {
                    int i3 = 930839265 ^ i2;
                    SpawnerManager.getInstance(932047160).loadSpawners(file, 1859303389);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -398703400) {
                        int i4 = 1775738998 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -398703400 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (112710079 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 1032250315 ^ i3;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1833064329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (23185773 ^ i2)) {
                int i6 = 467226518 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1407685585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1863919600 ^ i2)) {
                    int i7 = 953856009 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -320370118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2063265171 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 64464890 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public SpawnerConfigManager getSpawnerConfigManager(int i) {
        int i2 = 1588501157 ^ (2078428276 ^ 646448202);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 505844952) {
            int i3 = 1647287999 ^ i2;
            return this.spawnerConfigManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 505844952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1414006357 ^ i2)) {
                int i4 = 422629414 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 257581347 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (790683844 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 824874611 ^ i2;
        throw new IOException();
    }

    @Generated
    public SpawnerDatabase getDatabase(int i) {
        int i2 = 2106213992 ^ (2030702686 ^ 646448202);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 272798689) {
            int i3 = 773880731 ^ i2;
            return this.database;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1631670072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1840465343 ^ i2)) {
                int i4 = 2142821379 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 272798689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (680033256 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 435053629 ^ i2;
        throw new IOException();
    }

    @Generated
    public SpawnerTickManager getTickManager() {
        int i = 1676439845 ^ (536402669 ^ 646448202);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -723157998) {
            int i2 = 175804086 ^ i;
            return this.tickManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -723157998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1697162111 ^ i)) {
                int i3 = 1364084374 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2026829406 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (504505379 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2118393684 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public SellPlugin getSellPlugin(int i) {
        int i2 = 1845936943 ^ (1660571289 ^ 646448202);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1403277281) {
            int i3 = 1996481179 ^ i2;
            return this.sellPlugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -463774918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (17114816 ^ i2)) {
                int i4 = 213554353 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1403277281 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1707553061 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 49053085 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public static SpawnerPlugin getInstance(int i) {
        int i2 = 442908823 ^ (1259426 ^ (154163945 ^ 422142303));
        return instance;
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
        qiyvrbxjdq = ByteBuffer.wrap(hmjoublywsiajxy()).asCharBuffer().toString();
        CwTN4zuYok = (-1556946432) ^ new Random(978169682228736986L).nextInt();
    }

    public static String mqvxvuqabf(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = qiyvrbxjdq.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] uakymmsvsxjapgo() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 0};
    }

    private static byte[] dkgdluymvvwzmgl() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 12};
    }

    private static byte[] meqnquvwqjrumel() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 19};
    }

    private static byte[] vcympeexxlseztb() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 31};
    }

    private static byte[] hmjoublywsiajxy() {
        return new byte[]{49, 74, 49, 68, 54, 85, 56, 68, 53, 95, 57, 84, 52, 68, 52, 75, 51, 27, 49, 64, 49, 89, 54, 88, 49, 70, 51, 72, 55, 84, 49, 70, 50, 87, 49, 80, 51, 74, 49, 68, 50, 66, 53, 81, 50, 64, 48, 87, 49, 82, 50, 64, 53, 67, 50, 25, 48, 64, 49, 90, 50, 94, 55, 66, 50, 72, 51, 80, 54, 70, 48, 89, 49, 87, 56, 65, 49, 69, 49, 30, 55, 72, 50, 85, 51, 93};
    }

    private static int ftgusbryqjdnwlzv(int i, int i2) {
        return i ^ i2;
    }
}
