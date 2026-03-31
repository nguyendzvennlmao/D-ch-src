package com.kammoun.donutCore.core.managers;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class CoreSettings {
    private final JavaPlugin plugin;
    private boolean mediaEnabled;
    private boolean helpEnabled;
    private boolean marketEnabled;
    private boolean ranksEnabled;
    private boolean rulesEnabled;
    private boolean billfordEnabled;
    private boolean chatEnabled;
    private boolean spawnEnabled;
    private boolean afkEnabled;
    private boolean economyEnabled;
    private boolean nightvisionEnabled;
    private boolean isStoreEnabled;
    private boolean isDiscordEnabled;
    private String databaseType;
    private String sqliteFile;
    private String mysqlHost;
    private int mysqlPort;
    private String mysqlDatabase;
    private String mysqlUsername;
    private String mysqlPassword;
    private boolean spawnGui;
    private int maxPlayersPerSpawn;
    private boolean autojoin;
    private boolean afkGui;
    private int maxPlayersPerAfk;
    private int teleportCountdown;
    private static int WV93z1Jniv = 0;
    private transient int g6ZOlXKC79 = 713144504;
    private static String[] nothing_to_see_here = new String[19];

    public CoreSettings(org.bukkit.plugin.java.JavaPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.CoreSettings.<init>(org.bukkit.plugin.java.JavaPlugin, int):void");
    }

    private void loadSettings(int i) {
        int i2 = 1280456324 ^ (443299345 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -338321677) {
            int i3 = 1192173836 ^ i2;
            this.plugin.saveDefaultConfig();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -743663983) {
                i2 = 742502409 ^ i3;
                FileConfiguration config = this.plugin.getConfig();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1314842920) {
                    i2 = 68807531 ^ i2;
                    this.mediaEnabled = config.getBoolean(cnayiwltcj(qcrospulzttnsje(), nbyhlcaohjffzoi(), i2), (byte) (304990641 ^ i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1855042176) {
                        i3 = 1900863850 ^ i2;
                        this.helpEnabled = config.getBoolean(cnayiwltcj(lrqnjnvoktxiobu(), nbyhlcaohjffzoi(), i3), (byte) (1667311835 ^ i3));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 453592787) {
                            int i4 = 1693832824 ^ i3;
                            this.marketEnabled = config.getBoolean(cnayiwltcj(inmklzsqpwrlacu(), nbyhlcaohjffzoi(), i4), (byte) (127205027 ^ i4));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1017640208) {
                                int i5 = 43142760 ^ i4;
                                this.ranksEnabled = config.getBoolean(cnayiwltcj(jgepnuzipuvppet(), nbyhlcaohjffzoi(), i5), (byte) (84324555 ^ i5));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 674596432) {
                                    int i6 = 1683445485 ^ i5;
                                    this.rulesEnabled = config.getBoolean(cnayiwltcj(sdnkefgpkmmzpkq(), nbyhlcaohjffzoi(), i6), (byte) (1632757286 ^ i6));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 177156411) {
                                        int i7 = 91223200 ^ i6;
                                        this.billfordEnabled = config.getBoolean(cnayiwltcj(uebfivrwjyqkkvk(), nbyhlcaohjffzoi(), i7), (byte) (1681789574 ^ i7));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 569414715) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 569414715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1527757253 ^ i7)) {
                                                    break;
                                                }
                                            }
                                            int i8 = 1751435344 ^ i7;
                                            throw new RuntimeException("double");
                                        }
                                        i3 = 163092257 ^ i7;
                                        this.chatEnabled = config.getBoolean(cnayiwltcj(hjfiudmanfkfehl(), nbyhlcaohjffzoi(), i3), (byte) (1837532583 ^ i3));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1815358771) {
                                            int i9 = 1467138235 ^ i3;
                                            this.spawnEnabled = config.getBoolean(cnayiwltcj(tikopplahwbzzmt(), nbyhlcaohjffzoi(), i9), (byte) (989087004 ^ i9));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -677238551) {
                                                i4 = 1065409081 ^ i9;
                                                this.afkEnabled = config.getBoolean(cnayiwltcj(iwnwggfpbewkbzc(), nbyhlcaohjffzoi(), i4), (byte) (91528997 ^ i4));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 732231968) {
                                                    i2 = 1450744209 ^ i4;
                                                    this.economyEnabled = config.getBoolean(cnayiwltcj(eaenmjgxxzspcuz(), nbyhlcaohjffzoi(), i2), (byte) (1393297076 ^ i2));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1738525270) {
                                                        i6 = 1990924913 ^ i2;
                                                        this.nightvisionEnabled = config.getBoolean(cnayiwltcj(jttzwvuoxwxtuyr(), nbyhlcaohjffzoi(), i6), (byte) (631708869 ^ i6));
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 758703649) {
                                                            int i10 = 360187946 ^ i6;
                                                            this.isDiscordEnabled = config.getBoolean(cnayiwltcj(feuvkvfkuicdtij(), nbyhlcaohjffzoi(), i10), (byte) (819926255 ^ i10));
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -2030524559) {
                                                                i2 = 1395858487 ^ i10;
                                                                this.isStoreEnabled = config.getBoolean(cnayiwltcj(tuwavaezhrocrbf(), nbyhlcaohjffzoi(), i2), (byte) (1676413144 ^ i2));
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 526403275) {
                                                                    i3 = 1416843828 ^ i2;
                                                                    this.databaseType = config.getString(cnayiwltcj(pptixtcrapccwgg(), nbyhlcaohjffzoi(), i3), cnayiwltcj(faryaeldziwjbxn(), nbyhlcaohjffzoi(), i3));
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1124411543) {
                                                                        int i11 = 1212465745 ^ i3;
                                                                        this.sqliteFile = config.getString(cnayiwltcj(qjljunocubxfvvs(), nbyhlcaohjffzoi(), i11), cnayiwltcj(bwkeshkmynvceoy(), nbyhlcaohjffzoi(), i11));
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -19085853) {
                                                                            i3 = 617777736 ^ i11;
                                                                            this.mysqlHost = config.getString(cnayiwltcj(nkoaqqwihccbrwo(), nbyhlcaohjffzoi(), i3), cnayiwltcj(znoozjuhfcasrfq(), nbyhlcaohjffzoi(), i3));
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -666331230) {
                                                                                i10 = 763653577 ^ i3;
                                                                                this.mysqlPort = config.getInt(cnayiwltcj(gfyizyxvgeuvxoj(), nbyhlcaohjffzoi(), i10), (short) (1988981719 ^ i10));
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1267992085) {
                                                                                    i2 = 328706491 ^ i10;
                                                                                    this.mysqlDatabase = config.getString(cnayiwltcj(mxlgdldrjtltlgq(), nbyhlcaohjffzoi(), i2), cnayiwltcj(hvmpwnpicbacrtb(), nbyhlcaohjffzoi(), i2));
                                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 685159475) {
                                                                                        int i12 = 1122371201 ^ i2;
                                                                                        this.mysqlUsername = config.getString(cnayiwltcj(cxdrbmwvupnguio(), nbyhlcaohjffzoi(), i12), cnayiwltcj(xmyovxxgvazfsma(), nbyhlcaohjffzoi(), i12));
                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1072070713) {
                                                                                            i12 = 1070845405 ^ i12;
                                                                                            this.mysqlPassword = config.getString(cnayiwltcj(deunwjycvfmmnrg(), nbyhlcaohjffzoi(), i12), cnayiwltcj(sjsfhhculnegawe(), nbyhlcaohjffzoi(), i12));
                                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1049039152) {
                                                                                                i2 = 1009332614 ^ i12;
                                                                                                this.spawnGui = config.getBoolean(cnayiwltcj(nfwufovvckqrbaw(), nbyhlcaohjffzoi(), i2), (byte) (604384349 ^ i2));
                                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 540107489) {
                                                                                                    i11 = 1473234889 ^ i2;
                                                                                                    this.maxPlayersPerSpawn = config.getInt(cnayiwltcj(itoebvzmyxdctmv(), nbyhlcaohjffzoi(), i11), (byte) (1942612903 ^ i11));
                                                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1638966101) {
                                                                                                        int i13 = 105955832 ^ i11;
                                                                                                        this.autojoin = config.getBoolean(cnayiwltcj(obnkcadjjosfome(), nbyhlcaohjffzoi(), i13), (byte) (1972972140 ^ i13));
                                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -1396092053) {
                                                                                                            while (true) {
                                                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1396092053 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1690521849 ^ i13)) {
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            int i14 = 990663045 ^ i13;
                                                                                                            throw new RuntimeException("double");
                                                                                                        }
                                                                                                        i9 = 1155701437 ^ i13;
                                                                                                        this.afkGui = config.getBoolean(cnayiwltcj(msecvqbgwypjduf(), nbyhlcaohjffzoi(), i9), (byte) (830189777 ^ i9));
                                                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1948416383) {
                                                                                                            i2 = 377910697 ^ i9;
                                                                                                            this.maxPlayersPerAfk = config.getInt(cnayiwltcj(objmvibmlsxavlw(), nbyhlcaohjffzoi(), i2), (byte) (670942539 ^ i2));
                                                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1072573385) {
                                                                                                                i5 = 1520299559 ^ i2;
                                                                                                                this.teleportCountdown = config.getInt(cnayiwltcj(nuheonozvaoyihe(), nbyhlcaohjffzoi(), i5), (byte) (2103454555 ^ i5));
                                                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -352232717) {
                                                                                                                    int i15 = 1380490092 ^ i5;
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        while (true) {
                                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1049039152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1704153153 ^ i12)) {
                                                                                                int i16 = 1738495882 ^ i12;
                                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1072070713 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (2126198688 ^ i12)) {
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        int i17 = 368722317 ^ i12;
                                                                                        throw new IllegalAccessException("double");
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        while (true) {
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1638966101 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (725139389 ^ i11)) {
                                                                                int i18 = 1290233816 ^ i11;
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -19085853 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1841401036 ^ i11)) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        int i19 = 747102940 ^ i11;
                                                                        throw new IllegalAccessException("double");
                                                                    }
                                                                }
                                                            }
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1267992085 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (717254923 ^ i10)) {
                                                                    int i20 = 579148223 ^ i10;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -2030524559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1967548050 ^ i10)) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            int i21 = 1904916940 ^ i10;
                                                            throw new IllegalAccessException("double");
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1948416383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1188303022 ^ i9)) {
                                                    int i22 = 57396545 ^ i9;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -677238551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (845551076 ^ i9)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i23 = 206918572 ^ i9;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 177156411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (874531510 ^ i6)) {
                                            int i24 = 736442259 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 758703649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1121710977 ^ i6)) {
                                                break;
                                            }
                                        }
                                    }
                                    int i25 = 2070511755 ^ i6;
                                    throw new IOException("double");
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -352232717 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1613700938 ^ i5)) {
                                        int i26 = 743405069 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 674596432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1562688608 ^ i5)) {
                                            break;
                                        }
                                    }
                                }
                                int i27 = 1562159897 ^ i5;
                                throw new RuntimeException("double");
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1017640208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (749563033 ^ i4)) {
                                    int i28 = 1524844549 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 732231968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1753622179 ^ i4)) {
                                        break;
                                    }
                                }
                            }
                            int i29 = 1422648929 ^ i4;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1124411543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1079172381 ^ i3)) {
                    int i30 = 1012538731 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -666331230 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2049805973 ^ i3)) {
                        int i31 = 2122423372 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1815358771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (301435623 ^ i3)) {
                            int i32 = 1261114418 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -743663983 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1713321893 ^ i3)) {
                                int i33 = 2063873280 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 453592787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1401840604 ^ i3)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i34 = 569831351 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1072573385 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1992876423 ^ i2)) {
                int i35 = 767312119 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 540107489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1614646932 ^ i2)) {
                    int i36 = 1963656337 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 685159475 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (953133941 ^ i2)) {
                        int i37 = 1525770982 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2034598289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1159293804 ^ i2)) {
                            int i38 = 2084257231 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1738525270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2083590884 ^ i2)) {
                                int i39 = 110548632 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1855042176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (353332271 ^ i2)) {
                                    int i40 = 1174585013 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1314842920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (543670762 ^ i2)) {
                                        int i41 = 1995169506 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 526403275 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (308724473 ^ i2)) {
                                            int i42 = 389795952 ^ i2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -338321677 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1993626205 ^ i2)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i43 = 1408725629 ^ i2;
        throw new IOException();
    }

    public void reloadSettings(int i) {
        int i2 = 1268037008 ^ (1794309172 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1360516984) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1360516984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1772323514 ^ i2)) {
                    break;
                }
            }
            int i3 = 529013210 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 2022077248 ^ i2;
        this.plugin.reloadConfig();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1792782981) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1792782981 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1453386655 ^ i4)) {
                    break;
                }
            }
            int i5 = 1740203129 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 1071888344 ^ i4;
        loadSettings(1394205874);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1782182842) {
            int i7 = 610589237 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1226777107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (907353514 ^ i6)) {
                int i8 = 917390819 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1782182842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1591281686 ^ i6)) {
                    break;
                }
            }
        }
        int i9 = 2077628084 ^ i6;
        throw new IllegalAccessException();
    }

    @Generated
    public JavaPlugin getPlugin() {
        int i = 221663608 ^ (2011490823 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1934605918) {
            int i2 = 215185319 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -366216038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (617811821 ^ i)) {
                int i3 = 1382774555 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1934605918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1289027402 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 686255527 ^ i;
        throw new IOException();
    }

    @Generated
    public boolean isMediaEnabled(int i) {
        int i2 = 290254027 ^ (1707527462 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -25914062) {
            int i3 = 191605832 ^ i2;
            return this.mediaEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1523976334 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1824452436 ^ i2)) {
                int i4 = 53881114 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -25914062 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1992241347 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1021173697 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isHelpEnabled(int i) {
        int i2 = 1543027668 ^ (2013575991 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1170578752) {
            int i3 = 1438159628 ^ i2;
            return this.helpEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -402586334 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2014205448 ^ i2)) {
                int i4 = 70076544 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1170578752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2100297494 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 239120447 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isMarketEnabled() {
        int i = 1763343361 ^ (416868880 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -734975278) {
            int i2 = 274152046 ^ i;
            return this.marketEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -734975278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (805703966 ^ i)) {
                int i3 = 1273152244 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1451817378 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1425354919 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 32919332 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isRanksEnabled() {
        int i = 1079601788 ^ (801822754 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 649595050) {
            int i2 = 308135931 ^ i;
            return this.ranksEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1269418126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2037012660 ^ i)) {
                int i3 = 339702222 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 649595050 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (333473837 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1982830291 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isRulesEnabled(int i) {
        int i2 = 1433740253 ^ (151314844 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1179940781) {
            int i3 = 1604748809 ^ i2;
            return this.rulesEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1179940781 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (979750674 ^ i2)) {
                int i4 = 818621005 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1151318041 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1231577101 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1906271915 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isBillfordEnabled() {
        int i = 1928802937 ^ (1855094510 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1190134047) {
            int i2 = 1524727191 ^ i;
            return this.billfordEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1190134047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (419135955 ^ i)) {
                int i3 = 119613110 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1845760603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2104488160 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1332869426 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public boolean isChatEnabled() {
        int i = 1699276812 ^ (1204575624 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1308636792) {
            int i2 = 1666793769 ^ i;
            return this.chatEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1308636792 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1078156324 ^ i)) {
                int i3 = 99700096 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1422540595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1543424665 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1010296243 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public boolean isSpawnEnabled() {
        int i = 469042922 ^ (781608534 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -247554120) {
            int i2 = 2004374277 ^ i;
            return this.spawnEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -247554120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (37358840 ^ i)) {
                int i3 = 1245235511 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1258030995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1606111164 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 864366578 ^ i;
        throw new IOException();
    }

    @Generated
    public boolean isAfkEnabled(int i) {
        int i2 = 1771618580 ^ (1386447663 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2080404608) {
            int i3 = 560408457 ^ i2;
            return this.afkEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2000242743 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1226805593 ^ i2)) {
                int i4 = 905368502 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2080404608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1845518671 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 290038612 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isEconomyEnabled() {
        int i = 1115128979 ^ (509143100 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1151402205) {
            int i2 = 1567083010 ^ i;
            return this.economyEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1151402205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (409015062 ^ i)) {
                int i3 = 1266329540 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1348513585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1653063688 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2133715665 ^ i;
        throw new IOException();
    }

    @Generated
    public boolean isNightvisionEnabled() {
        int i = 254494322 ^ (1448486098 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1848733861) {
            int i2 = 1243393223 ^ i;
            return this.nightvisionEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1054086815 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1419509818 ^ i)) {
                int i3 = 1465933848 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1848733861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1768449337 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2100238382 ^ i;
        throw new IOException();
    }

    @Generated
    public boolean isStoreEnabled() {
        int i = 1347227935 ^ (1258588383 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2140580775) {
            int i2 = 227238181 ^ i;
            return this.isStoreEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -332243599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1492196339 ^ i)) {
                int i3 = 481943586 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2140580775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1930643881 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 486729912 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isDiscordEnabled() {
        int i = 1675673905 ^ (1908591715 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -885657399) {
            int i2 = 1389778562 ^ i;
            return this.isDiscordEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1569146075 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (739815558 ^ i)) {
                int i3 = 1089875473 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -885657399 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1959984477 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1759907903 ^ i;
        throw new IOException();
    }

    @Generated
    public String getDatabaseType() {
        int i = 1397251074 ^ (249398910 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1232385605) {
            int i2 = 59887775 ^ i;
            return this.databaseType;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1232385605 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (172531637 ^ i)) {
                int i3 = 153716525 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1442460349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1088314890 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1613804823 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getSqliteFile() {
        int i = 1534017893 ^ (2074705279 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1544845960) {
            int i2 = 92652496 ^ i;
            return this.sqliteFile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1544845960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2027361595 ^ i)) {
                int i3 = 1300184502 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1882874888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (82033878 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1296688081 ^ i;
        throw new IOException();
    }

    @Generated
    public String getMysqlHost() {
        int i = 854426040 ^ (443456498 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 507332616) {
            int i2 = 1587413124 ^ i;
            return this.mysqlHost;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -355644374 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1415047283 ^ i)) {
                int i3 = 118199710 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 507332616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (918071607 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1281054714 ^ i;
        throw new IOException();
    }

    @Generated
    public int getMysqlPort() {
        int i = 1170082177 ^ (939507072 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -936887726) {
            int i2 = 1679423862 ^ i;
            return this.mysqlPort;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -936887726 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (141679782 ^ i)) {
                int i3 = 1382142081 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -387452447 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (855743652 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1757349678 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getMysqlDatabase() {
        int i = 1363797753 ^ (1323679311 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1488494615) {
            int i2 = 1679181432 ^ i;
            return this.mysqlDatabase;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1488494615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (258297485 ^ i)) {
                int i3 = 332961881 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2013959126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (520024698 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1900187031 ^ i;
        throw new IOException();
    }

    @Generated
    public String getMysqlUsername() {
        int i = 770689718 ^ (805218519 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1252952401) {
            int i2 = 988119147 ^ i;
            return this.mysqlUsername;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1652389368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (426273512 ^ i)) {
                int i3 = 1391621590 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1252952401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1770208847 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2110933567 ^ i;
        throw new IOException();
    }

    @Generated
    public String getMysqlPassword() {
        int i = 200237311 ^ (1424265783 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1569059813) {
            int i2 = 118968835 ^ i;
            return this.mysqlPassword;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1698653181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1225111077 ^ i)) {
                int i3 = 479681767 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1569059813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1332976279 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1240473113 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isSpawnGui() {
        int i = 1024590866 ^ (2089616781 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1457362595) {
            int i2 = 165380578 ^ i;
            return this.spawnGui;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 402758067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (899288414 ^ i)) {
                int i3 = 524342032 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1457362595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1270976400 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 645307595 ^ i;
        throw new IOException();
    }

    @Generated
    public int getMaxPlayersPerSpawn(int i) {
        int i2 = 1614123224 ^ (918834534 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -307529813) {
            int i3 = 513530933 ^ i2;
            return this.maxPlayersPerSpawn;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 427136515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1885041901 ^ i2)) {
                int i4 = 327556161 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -307529813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (264689324 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 411004960 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isAutojoin() {
        int i = 870505710 ^ (75155584 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -421185240) {
            int i2 = 540138731 ^ i;
            return this.autojoin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -412361103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1083727030 ^ i)) {
                int i3 = 1298882071 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -421185240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (330143411 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 736797258 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isAfkGui() {
        int i = 476147701 ^ (291108679 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 870408137) {
            int i2 = 1411636315 ^ i;
            return this.afkGui;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 870408137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1754384813 ^ i)) {
                int i3 = 1914805927 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1828733677 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (644136089 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1793012541 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getMaxPlayersPerAfk(int i) {
        int i2 = 1384664440 ^ (160501224 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2098225445) {
            int i3 = 89716925 ^ i2;
            return this.maxPlayersPerAfk;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2098225445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1007761000 ^ i2)) {
                int i4 = 657318183 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1473750221 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (354714659 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1200598600 ^ i2;
        throw new IOException();
    }

    @Generated
    public int getTeleportCountdown() {
        int i = 1779346958 ^ (1839627282 ^ 725922635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1734544057) {
            int i2 = 1771493103 ^ i;
            return this.teleportCountdown;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 735428034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (90820707 ^ i)) {
                int i3 = 1000141609 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1734544057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1859504881 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1389256144 ^ i;
        throw new IllegalAccessException();
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
        WV93z1Jniv = 345174488 ^ new Random(-7185995967269561861L).nextInt();
    }

    public static String cnayiwltcj(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] nbyhlcaohjffzoi() {
        return new byte[]{107, 2, 114, 67, 52, 71, 59, 63, 62, 113, 7, 86, 27, Byte.MAX_VALUE, 40, Byte.MAX_VALUE, 69, 70, 87, 125, 40, 100, 21, 95, 91, 31, Byte.MAX_VALUE, 13, 46, 100, 109, 55, 60, 126, 2, 32, 69, 84, 68, 46, 100, 91, 98, 19, 108, 66, 54, 55, 97, 68, 72, 116, 115, 120};
    }

    private static byte[] tuwavaezhrocrbf() {
        return new byte[]{-92, -53, 69, 19, 0, 19, 8, 111, 10, 48, 54, 21, 44, 59, 28, 43, 118, 4, 99, 102, 25, 33, 34, 29, 111, 65, 76, 78, 26, 52, 92, 47, 11, 45, 54, Byte.MAX_VALUE, 118, 4, 112, 121, 85, 1, 85, 64, 88, 23};
    }

    private static byte[] qcrospulzttnsje() {
        return new byte[]{-90, -51, 70, 28, 13, 18, 13, 106, 14, 54, 55, 23, 34, 52, 24, 44, 113, 5, 100, 99, 28, 48, 44, 10, 109, 79, 79, 87, 30, 49, 84, 32, 12, 45, 54, 126, 118, 5, 112, 117, 93, 7, 84, 66, 92, 21};
    }

    private static byte[] lrqnjnvoktxiobu() {
        return new byte[]{-92, -53, 68, 18, 7, 19, 10, 102, 13, 49, 54, 21, 45, 58, 27, 43, 116, 13, 100, 103, 25, 58, 35, 13, 104, 66, 78, 69, 29, 126, 92, 100, 10, 39, 49, 112, 116, 14, 119, 118, 85, 8, 84, 64};
    }

    private static byte[] eaenmjgxxzspcuz() {
        return new byte[]{-92, -50, 75, 22, 6, 27, 12, 110, 9, 50, 54, 16, 34, 62, 26, 35, 114, 5, 96, 100, 25, 50, 44, 15, 105, 73, 72, 83, 25, 60, 92, 105, 5, 52, 48, 55, 114, 1, 115, 119, 85, 9, 91, 66, 94, 23, 1, 98, 86, 23};
    }

    private static byte[] jttzwvuoxwxtuyr() {
        return new byte[]{-93, -50, 67, 18, 4, 26, 3, 104, 6, 51, 52, 18, 44, 61, 16, 34, 115, 13, 97, 96, 25, 61, 37, 14, 99, 78, 71, 83, 29, 33, 90, 113, 4, 47, 52, 107, 115, 14, 117, 118, 84, 13, 90, 11, 84, 17, 5, 104, 86, 21, 112, 46, 69, 44, 93, 84, 67, 16};
    }

    private static byte[] hjfiudmanfkfehl() {
        return new byte[]{-92, -59, 65, 18, 1, 17, 9, 107, 6, 55, 54, 27, 40, 58, 29, 41, 119, 0, 111, 97, 25, 63, 38, 0, 110, 77, 77, 76, 22, 120, 92, 106, 15, 39, 55, 114, 119, 3, 124, 112, 85, 6, 81, 64};
    }

    private static byte[] tikopplahwbzzmt() {
        return new byte[]{-84, -59, 75, 21, 12, 21, 11, 110, 11, 60, 63, 26, 43, 53, 31, 42, 117, 0, 110, 107, 17, 39, 45, 24, 107, 78, 74, 67, 22, 51, 93, 33, 11, 43, 50, 123, 124, 13, 125, 124, 92, 0, 82, 70, 89, 31};
    }

    private static byte[] cxdrbmwvupnguio() {
        return new byte[]{-93, -54, 66, 31, 3, 31, 12, 126, 15, 38, 48, 4, 35, 41, 17, 59, 112, 18, 97, 100, 24, 49, 34, 31, 108, 89, 78, 74, 25, 56, 85, 46, 5, 60, 55, 98, 115, 6, 116, 100, 83, 12, 85, 71, 93, 25, 1, 98};
    }

    private static byte[] xmyovxxgvazfsma() {
        return new byte[]{-93, -54, 66, 9, 3, 17, 12, 101, 15, 51};
    }

    private static byte[] mxlgdldrjtltlgq() {
        return new byte[]{-92, -53, 75, 17, 6, 19, 12, 125, 9, 32, 54, 2, 34, 40, 26, 57, 114, 21, 96, 99, 25, 63, 44, 16, 105, 89, 72, 74, 25, 56, 92, 47, 5, 44, 48, 116, 114, 22, 115, Byte.MAX_VALUE, 85, 15, 91, 68, 94, 4, 1, 100};
    }

    private static byte[] hvmpwnpicbacrtb() {
        return new byte[]{-92, -53, 75, 17, 6, 29, 12, 103, 9, 52, 54, 20, 34, 58, 26, 39, 114, 0, 96, 46, 25, 61, 44, 27, 105, 79};
    }

    private static byte[] feuvkvfkuicdtij() {
        return new byte[]{-83, -52, 75, 28, 6, 20, 9, 107, 10, 61, 54, 26, 34, 63, 30, 40, 112, 1, 111, 98, 17, 57, 39, 0, 105, 89, 75, 86, 31, 50, 84, 119, 10, 40, 55, 58, 125, 0, 125, 121, 86, 12, 80, 68, 88, 22, 7, 107, 88, 18};
    }

    private static byte[] iwnwggfpbewkbzc() {
        return new byte[]{-84, -52, 71, 23, 12, 27, 2, 104, 7, 52, 50, 17, 35, 52, 17, 44, 124, 4, 98, 97, 16, 60, 44, 15, 98, 69, 74, 17, 22, 56, 84, 111, 5, 46, 55, 112, 125, 1, 125, 125, 93, 14};
    }

    private static byte[] nkoaqqwihccbrwo() {
        return new byte[]{-92, -56, 64, 16, 7, 20, 10, 120, 13, 34, 54, 1, 41, 41, 27, 62, 116, 16, 100, 97, 25, 60, 39, 17, 104, 94, 78, 79, 29, 58, 92, 44, 14, 33, 49, 125, 116, 20, 119, 104};
    }

    private static byte[] znoozjuhfcasrfq() {
        return new byte[]{-92, -56, 64, 24, 7, 26, 10, 111, 13, 34, 54, 15, 41, 32, 27, 34, 116, 6, 100, 59};
    }

    private static byte[] deunwjycvfmmnrg() {
        return new byte[]{-95, -51, 71, 16, 0, 23, 11, 122, 6, 36, 55, 1, 44, 42, 25, 60, 116, 27, 99, 99, 29, 62, 33, 23, 107, 93, 71, 72, 30, 61, 90, 45, 13, 62, 51, 121, 113, 23, 113, 106, 80, 29, 82, 77, 84, 4, 6, 102};
    }

    private static byte[] sjsfhhculnegawe() {
        return new byte[]{-95, -51, 71, 4, 0, 23, 11, 125, 6, 54, 55, 20, 44, 36, 25, 61, 116, 26};
    }

    private static byte[] nfwufovvckqrbaw() {
        return new byte[]{-93, -51, 70, 3, 12, 3, 8, 106, 6, 48, 55, 12, 40, 106, 28, 43, 113, 11, 97, 36};
    }

    private static byte[] sdnkefgpkmmzpkq() {
        return new byte[]{-92, -53, 65, 23, 3, 23, 12, 108, 6, 50, 54, 21, 40, 63, 31, 47, 114, 7, 111, 100, 25, 32, 38, 24, 108, 70, 72, 90, 22, 32, 92, 47, 15, 41, 53, 123, 114, 7, 124, 123, 85, 1, 81, 68, 91, 19};
    }

    private static byte[] jgepnuzipuvppet() {
        return new byte[]{-83, -55, 65, 23, 0, 23, 14, 106, 6, 49, 52, 17, 47, 56, 29, 46, 125, 1, 100, 97, 28, 35, 32, 10, 99, 69, 76, 84, 26, 34, 88, 45, 4, 47, 49, 124, 113, 0, 113, 120, 92, 3, 81, 68, 88, 19};
    }

    private static byte[] qjljunocubxfvvs() {
        return new byte[]{-89, -52, 70, 18, 4, 31, 12, 114, 15, 38, 53, 5, 47, 43, 24, 53, 114, 26, 102, 101, 26, 38, 33, 27, 107, 74, 72, 93, 31, 38, 95, 99, 8, 101, 50, Byte.MAX_VALUE, 114, 4, 117, 116, 86, 15};
    }

    private static byte[] bwkeshkmynvceoy() {
        return new byte[]{-89, -52, 70, 18, 4, 31, 12, 114, 15, 38};
    }

    private static byte[] inmklzsqpwrlacu() {
        return new byte[]{-92, -49, 69, 23, 4, 23, 11, 108, 8, 52, 53, 20, 41, 61, 29, 42, 119, 3, 102, 97, 31, 59, 37, 11, 107, 95, 73, 87, 28, 54, 95, 115, 9, 96, 48, 115, 116, 8, 115, 125, 84, 12, 82, 77, 90, 22, 4, 100};
    }

    private static byte[] pptixtcrapccwgg() {
        return new byte[]{-84, -50, 65, 22, 13, 22, 8, 115, 15, 41, 52, 7, 42, 39, 24, 63, 125, 18, 110, 96, 27, 33, 44, 22, 104, 87, 78, 81};
    }

    private static byte[] faryaeldziwjbxn() {
        return new byte[]{-84, -50, 65, 1, 13, 6, 8, 107, 15, 33, 52, 17, 42, 35};
    }

    private static byte[] obnkcadjjosfome() {
        return new byte[]{-92, -60, 69, 16, 13, 5, 9, 122, 10, 47, 54, 5, 44, 34, 17, 33, 119, 25};
    }

    private static byte[] objmvibmlsxavlw() {
        return new byte[]{-93, -54, 66, 23, 0, 20, 14, Byte.MAX_VALUE, 11, 106, 48, 22, 34, 39, 26, 43, 125, 10, 97, 47, 24, 47, 33, 30, 110, 10, 74, 75, 25, 49, 84, 113, 14, 102, 58, 116, 115, 5, 116, 124};
    }

    private static byte[] uebfivrwjyqkkvk() {
        return new byte[]{-92, -53, 74, 20, 3, 26, 2, 107, 9, 48, 54, 21, 35, 60, 31, 34, 124, 0, 96, 102, 25, 48, 45, 7, 108, 75, 70, 84, 25, 55, 92, 110, 4, 61, 53, 124, 124, 79, 115, 126, 85, 3, 90, 67, 91, 24, 15, 110, 86, 20, 121, 38};
    }

    private static byte[] gfyizyxvgeuvxoj() {
        return new byte[]{-92, -60, 74, 31, 13, 30, 15, 125, 13, 39, 54, 13, 35, 38, 17, 52, 113, 21, 100, 100, 25, 48, 45, 30, 98, 84, 75, 74, 29, 63, 92, 32, 4, 54, 59, 119, 113, 16, 119, 109};
    }

    private static byte[] nuheonozvaoyihe() {
        return new byte[]{-89, -52, 66, 4, 0, 23, 15, 102, 11, 44, 53, 23, 43, 35, 28, 56, 113, 7, 98, 107, 26, 33, 37, 9, 111, 70, 75, 93, 27, 44, 95, 105, 12, 63, 54, 97, 113, 76, 113, 117, 86, 5, 82, 85, 88, 25, 2, 118, 84, 24, 122, 42, 67, 60, 95, 89};
    }

    private static byte[] msecvqbgwypjduf() {
        return new byte[]{-83, -50, 66, 19, 12, 24, 12, 99, 8, 100, 52, 1, 42, 50, 17, 33};
    }

    private static byte[] itoebvzmyxdctmv() {
        return new byte[]{-92, -60, 70, 28, 2, 23, 9, Byte.MAX_VALUE, 6, 105, 54, 31, 47, 33, 30, 47, 119, 7, 111, 45, 25, 47, 33, 30, 109, 3, 77, 69, 22, 52, 92, 124, 8, 97, 52, 98, 119, 28, 124, 122, 85, 21, 86, 79};
    }

    private static int yegqqgaekakzpocd(int i, int i2) {
        return i2 ^ i;
    }
}
