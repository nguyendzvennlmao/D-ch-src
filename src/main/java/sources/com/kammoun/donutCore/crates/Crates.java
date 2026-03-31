package com.kammoun.donutCore.crates;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.crates.handlers.RewardHandler;
import com.kammoun.donutCore.crates.helper.MessageHelper;
import com.kammoun.donutCore.crates.managers.DataManager;
import com.kammoun.donutCore.crates.managers.HologramManager;
import com.kammoun.donutCore.crates.managers.KeyManager;
import com.kammoun.donutCore.crates.managers.SettingsManager;
import com.kammoun.donutCore.crates.managers.crate.CrateManager;
import com.kammoun.donutCore.crates.tasks.AutoKeyTask;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class Crates extends DonutModule {
    private static Crates instance;
    private CrateManager crateManager;
    private SettingsManager settingsManager;
    private DataManager dataManager;
    private KeyManager keyManager;
    private HologramManager hologramManager;
    private RewardHandler rewardHandler;
    private MessageHelper messageHelper;
    private AutoKeyTask autoKeyTaskInstance;
    private SchedulerUtil.Task autoKeyTask;
    private static int bFfKMibgR7 = 0;
    private transient int wIRZYanwTb = 659662102;
    private static String[] nothing_to_see_here = new String[15];

    public Crates() {
        super("Crates", 1095143273);
        tcpfumtzxrdjsabv(1165380731 ^ 1354999175, 513783374);
        int parseInt = 628023217 ^ (867943274 ^ Integer.parseInt("503268201"));
        this.wIRZYanwTb = 659662102 ^ bFfKMibgR7;
        int i = 2128738896 ^ (1215707113 ^ parseInt);
    }

    @Override
    public void onModuleEnable(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.Crates.onModuleEnable(int):void");
    }

    @Override
    public void onModuleDisable(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.Crates.onModuleDisable(int):void");
    }

    @Override
    public void reload(int i) {
        int i2;
        int i3 = 933776142 ^ (152870716 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 991655081) {
            int i4 = 490908898 ^ i3;
            if (this.crateManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -787606599) {
                    int i5 = 42425830 ^ i4;
                    this.crateManager.reload(1572243865);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -986383223) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -986383223 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1134260070 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 1440620987 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    i3 = 2017153159 ^ i5;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -787606599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1833864382 ^ i4)) {
                        int i7 = 804091209 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1702991893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1201934403 ^ i4)) {
                            break;
                        }
                    }
                }
                int i8 = 1732161277 ^ i4;
                throw new RuntimeException("double");
            }
            i3 = 2059144545 ^ i4;
            if (this.settingsManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 82737330) {
                    i4 = 869401579 ^ i3;
                    this.settingsManager.reloadSettings(394147927);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1702991893) {
                        i3 = 1071767286 ^ i4;
                        if (this.autoKeyTask == null) {
                            i2 = 1622516217 ^ i3;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1701875802) {
                            int i9 = 642109382 ^ i3;
                            this.autoKeyTask.cancel(1520188267);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1465839211) {
                                i2 = 1190161983 ^ i9;
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1465839211 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1688511363 ^ i9)) {
                                        int i10 = 15418295 ^ i9;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1701875802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1758732225 ^ i3)) {
                                    int i11 = 1699221990 ^ i3;
                                    throw new IllegalAccessException("double");
                                }
                            }
                        }
                        int autoKeyTime = this.settingsManager.getAutoKeyTime(99429282);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1625137041) {
                            i3 = 449337145 ^ i2;
                            if (autoKeyTime <= (919856331 ^ i3)) {
                                tcpfumtzxrdjsabv(i3, 1738313531);
                                return;
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1231083943) {
                                i3 = 207244801 ^ i3;
                                this.autoKeyTaskInstance = new AutoKeyTask(this.keyManager, this.settingsManager, autoKeyTime, 1585823350);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -733129135) {
                                    i2 = 229292891 ^ i3;
                                    this.autoKeyTask = SchedulerUtil.runTimer(this.autoKeyTaskInstance, autoKeyTime * 20, autoKeyTime * 20, 2041710047);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1189573495) {
                                        int i12 = 1718385249 ^ i2;
                                        return;
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1189573495 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (345257619 ^ i2)) {
                                int i13 = 1468889205 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1625137041 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (685617989 ^ i2)) {
                                    int i14 = 111798717 ^ i2;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -787606599) {
                            int i72 = 804091209 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1702991893) {
                                break;
                                break;
                            }
                            continue;
                        }
                    }
                    int i82 = 1732161277 ^ i4;
                    throw new RuntimeException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -733129135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1288359475 ^ i3)) {
                        int i15 = 297667868 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1231083943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (456355310 ^ i3)) {
                            int i16 = 119790893 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1971626110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (168797794 ^ i3)) {
                                int i17 = 1213339125 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 82737330 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1924126561 ^ i3)) {
                                    int i18 = 1649449615 ^ i3;
                                    throw new IllegalAccessException();
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                    case 221348263:
                        i3 = 204725533 ^ i3;
                        break;
                    case 1793098801:
                    case 2102131467:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 991655081 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (737342652 ^ i3)) {
                int i19 = 771618644 ^ i3;
                throw new RuntimeException("double");
            }
        }
    }

    @Generated
    public CrateManager getCrateManager(int i) {
        int i2 = 488186556 ^ (1669824444 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 978271547) {
            int i3 = 1392436721 ^ i2;
            return this.crateManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1380445519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1760456027 ^ i2)) {
                int i4 = 907626099 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 978271547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1778740407 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 609483383 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public SettingsManager getSettingsManager() {
        int i = 112507683 ^ (404664107 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1005417848) {
            int i2 = 971362520 ^ i;
            return this.settingsManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -188484679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1165105784 ^ i)) {
                int i3 = 1706877395 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1005417848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (824471471 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 757474773 ^ i;
        throw new IOException();
    }

    @Generated
    public DataManager getDataManager() {
        int i = 330493191 ^ (1131036408 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1216039618) {
            int i2 = 1898784883 ^ i;
            return this.dataManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1055782567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1679782797 ^ i)) {
                int i3 = 91441927 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1216039618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (241839022 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2023434693 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public KeyManager getKeyManager(int i) {
        int i2 = 616958782 ^ (849945759 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2110040112) {
            int i3 = 289353811 ^ i2;
            return this.keyManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -197317976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1528093339 ^ i2)) {
                int i4 = 345827243 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2110040112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (149996425 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1577590589 ^ i2;
        throw new IOException();
    }

    @Generated
    public HologramManager getHologramManager() {
        int i = 181563486 ^ (212914831 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -39271504) {
            int i2 = 1073603180 ^ i;
            return this.hologramManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 38260945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (235092652 ^ i)) {
                int i3 = 131777049 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -39271504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1658722601 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1516276417 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public RewardHandler getRewardHandler(int i) {
        int i2 = 1804321172 ^ (1424024657 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 904198929) {
            int i3 = 976439236 ^ i2;
            return this.rewardHandler;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -461454032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (309500091 ^ i2)) {
                int i4 = 945032450 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 904198929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1146735522 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 95646296 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public MessageHelper getMessageHelper(int i) {
        int i2 = 1575954653 ^ (1974820473 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1938923495) {
            int i3 = 936164431 ^ i2;
            return this.messageHelper;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 839615072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (604858799 ^ i2)) {
                int i4 = 1327049426 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1938923495 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (285750612 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1611710238 ^ i2;
        throw new IOException();
    }

    @Generated
    public AutoKeyTask getAutoKeyTaskInstance(int i) {
        int i2 = 1555556198 ^ (564160449 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637652995) {
            int i3 = 1834896755 ^ i2;
            return this.autoKeyTaskInstance;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 637652995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (244363740 ^ i2)) {
                int i4 = 87248286 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1291041688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1438212817 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2036924651 ^ i2;
        throw new IOException();
    }

    @Generated
    public SchedulerUtil.Task getAutoKeyTask() {
        int i = 369809118 ^ (454191185 ^ 433568423);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1502076608) {
            int i2 = 32456981 ^ i;
            return this.autoKeyTask;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1459475992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (516857037 ^ i)) {
                int i3 = 1155765270 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1502076608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1203508866 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1625104443 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public static Crates getInstance(int i) {
        int i2 = 519014880 ^ (967418334 ^ (1280136375 ^ 1048977329));
        return instance;
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
        bFfKMibgR7 = 2110838967 ^ new Random(7551921396498803222L).nextInt();
    }

    public static String czkisbzeaz(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] grqvsftmtrmloix() {
        return new byte[]{31, 1, 102, 23, 48, 101, 97, 104, 84, 99, 21, 48, 117, 36, 76, 117, 81, 123, 65, 20, 125, 34, 82, 30, 82, 99, 80, 15, 90, 87, 26, 108, 60, 123, 93, 36, 25, 25, 97, 98, 28, 87};
    }

    private static byte[] xxqvvcytuymmnts() {
        return new byte[]{-48, -55, 86, 67, 9, 33, 83, 62, 96, 36, 36, 98, 69, 96, 117, 108, 99, 45, 117, 74, 76, 112, 98, 93, 107, 61, 98, 65, 110, 23, 43, 47, 12, 97, 100, 113, 43, 92, 85, 48, 45, 20, 47, 83, 95, 15, 2, 43, 85, 54, 101, 56};
    }

    private static byte[] rwtxfkmztmmrgrj() {
        return new byte[]{-48, -53, 81, 71, 6, 32, 80, 59, 100, 35, 36, 96, 66, 100};
    }

    private static byte[] ojelmqccxdoixaa() {
        return new byte[]{-48, -50, 82, 64, 7, 47, 84, 63, 96, 47, 36, 101};
    }

    private static byte[] qtbwhjdkvghqrtz() {
        return new byte[]{-48, -52, 84, 96, 5, 34, 81, 50, 108, 116, 36, 97, 71, 123, 121, 41, 97, 46, 121, 69, 76, 98, 96, 67, 103, 124, 96, 91, 98, 26, 43, 55, 14, 101, 104, 111, 41, 71, 89, 54};
    }

    private static byte[] zbntsrcrabgaxdz() {
        return new byte[]{-41, -54, 81, 77, 4, 39, 84, 59, 100, 33, 33, 98, 76, 99, 124, 111, 99, 44, 119, 79, 74, 119, 102, 74, 103, 124, 96, 90, 110, 18, 35, 57, 12, 58, 111, 113, 47, 3, 86, 34, 40, 10, 42, 95};
    }

    private static byte[] byrjksgzatlcgjf() {
        return new byte[]{-42, -58, 87, 64, 4, 39, 85, 60, 102, 32, 45, 100, 65, 99, 124, 110, 100, 42, 118, 94, 76, Byte.MAX_VALUE, 102, 67, 102, 37, 98, 87, 98, 8, 46, 117, 12, 44, 104, 100, 46, 64, 80, 34, 40, 2, 43, 26, 84, 89, 8, 57, 85, 48};
    }

    private static byte[] xkqjxrzsiexikoo() {
        return new byte[]{-48, -57, 94, 65, 2, 35, 87, 60, 98, 37, 36, 108, 77, 98, 126, 110, 103, 62, 119, 84, 76, 114, 106, 70, 96, 50, 102, 23, 108, 6, 43, 39, 4, 47, 111, 100, 47, 73, 87, 126, 45, 23, 39, 89, 84, 79};
    }

    private static byte[] vkrvansrrohhoak() {
        return new byte[]{-48, -55, 80, 64, 2, 32, 85, 48, 102, 38, 36, 98, 67, 99, 126, 109, 101, 33, 115, 74, 76, 120, 100, 71, 96, 59, 100, 88, 104, 75, 43, 56, 10, 61, 111, 114, 45, 84, 83, 54, 45, 78, 41, 76, 84, 77, 4, 48};
    }

    private static byte[] ucmzncfnidfzdcl() {
        return new byte[]{-48, -50, 86, 71, 0, 46, 84, 57, 101, 39, 36, 101};
    }

    private static int tcpfumtzxrdjsabv(int i, int i2) {
        return i ^ i2;
    }
}
