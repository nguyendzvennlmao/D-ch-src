package com.kammoun.donutCore.fly;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.fly.cmd.CommandHandler;
import com.kammoun.donutCore.fly.listener.EventListener;
import com.kammoun.donutCore.fly.manager.DatabaseManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;

public class FlyPlugin extends DonutModule {
    private DatabaseManager databaseManager;
    private List<String> blacklistedWorlds;
    private List<String> enabledWorlds;
    private final HashSet<UUID> flyEnabledPlayers;
    private boolean chatMessagesEnabled;
    private String enableMessage;
    private String disableMessage;
    private String notAllowedWorldMessage;
    private String noPermissionMessage;
    private String enableSound;
    private String disableSound;
    private boolean usePermission;
    private String flyPermission;
    private boolean disableFlyOnDamage;
    private boolean disableFlyOnCombat;
    private static FlyPlugin instance;
    private static int kRMvntUAZy = 0;
    private transient int edhJGxFTIV = 2088550115;
    private static String[] nothing_to_see_here = new String[15];

    public FlyPlugin() {
        super("Fly", 1095143273);
        qfwcbrztgvvgcqtf(1215385099 ^ 269875390, 1821149476);
        int parseInt = 447528850 ^ (1519132092 ^ Integer.parseInt("1959304639"));
        this.edhJGxFTIV = 2088550115 ^ kRMvntUAZy;
        int qfwcbrztgvvgcqtf = 397529665 ^ qfwcbrztgvvgcqtf(parseInt, 922634240);
        this.flyEnabledPlayers = new HashSet<>();
        int i = 2010967530 ^ qfwcbrztgvvgcqtf;
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1638959959 ^ (1855755954 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 745111017) {
            i2 = 504377400 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -588710871) {
                i2 = 2012613837 ^ i2;
                loadConfiguration(1160452671);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1666751042) {
                    i2 = 2047155405 ^ i2;
                    this.databaseManager = new DatabaseManager(this, 267686524);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1284473815) {
                        i2 = 1920686493 ^ i2;
                        registerCommand(new CommandHandler(this, this.databaseManager, 934156205), qgzvevmyzz(nbgbevjnafnmseo(), tgpyyiwpxaruvsq(), i2), 1506108676);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 548057282) {
                            i2 = 48775418 ^ i2;
                            registerEvent(new EventListener(this, this.databaseManager, 1685751011), 1095327048);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 937998098) {
                                int i3 = 1996232588 ^ i2;
                                return;
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 548057282 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1129361765 ^ i2)) {
                int i4 = 595886553 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2146956431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1767796602 ^ i2)) {
                    int i5 = 1817098802 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1284473815 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (564903750 ^ i2)) {
                        int i6 = 907253249 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1666751042 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (800816978 ^ i2)) {
                            int i7 = 608789243 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 937998098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1729204877 ^ i2)) {
                                int i8 = 657209281 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -588710871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1288267990 ^ i2)) {
                                    int i9 = 1402435266 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 745111017 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1867443708 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i10 = 421361312 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1272508160 ^ (1975956763 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1510260200) {
            i2 = 1839473680 ^ i2;
            if (this.databaseManager == null) {
                i2 = qfwcbrztgvvgcqtf(i2, 1635578199);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -925212005) {
                int i3 = 714915659 ^ i2;
                this.databaseManager.closeConnection(1119968866);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1673553726) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1673553726 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1631061055 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 536708406 ^ i3;
                    throw new RuntimeException("double");
                }
                i2 = 1272991260 ^ i3;
            }
            this.flyEnabledPlayers.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1019353056) {
                int i5 = 1490197435 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1019353056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1108798 ^ i2)) {
                int i6 = 2060424809 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1510260200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1275431687 ^ i2)) {
                    int i7 = 1121050409 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 94975482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (233642305 ^ i2)) {
                        int i8 = 2081445270 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -925212005 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1423066203 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 1023068804 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void reload(int i) {
        int i2 = 35037753 ^ (980031427 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1762902768) {
            i2 = 139721739 ^ i2;
            loadConfiguration(1160452671);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -730604216) {
                int i3 = 2009611215 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1762902768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (14103992 ^ i2)) {
                int i4 = 455809873 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -730604216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1027650288 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 455848428 ^ i2;
        throw new RuntimeException();
    }

    private void loadConfiguration(int i) {
        int i2 = 1291668356 ^ (718771442 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1683974514) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1683974514 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (368944325 ^ i2)) {
                    break;
                }
            }
            int i3 = 1208872907 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 2043193031 ^ i2;
        this.blacklistedWorlds = getConfig(127597628).getStringList(qgzvevmyzz(kkaqwpsovzchmpq(), tgpyyiwpxaruvsq(), i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1441112247) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1441112247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (180681071 ^ i4)) {
                    break;
                }
            }
            int i5 = 883968347 ^ i4;
            throw new IOException("double");
        }
        int i6 = 1593755623 ^ i4;
        this.enabledWorlds = getConfig(127597628).getStringList(qgzvevmyzz(nfitwnegduwnerk(), tgpyyiwpxaruvsq(), i6));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1575772275) {
            int i7 = 171224063 ^ i6;
            this.chatMessagesEnabled = getConfig(127597628).getBoolean(qgzvevmyzz(yptxkddtdswnkdf(), tgpyyiwpxaruvsq(), i7), (byte) (1636378608 ^ i7));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 206126987) {
                i6 = 1036888070 ^ i7;
                this.enableMessage = getConfig(127597628).getString(qgzvevmyzz(vkeciifbsxeufwq(), tgpyyiwpxaruvsq(), i6), qgzvevmyzz(tszbtndpybhvfkq(), tgpyyiwpxaruvsq(), i6));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -500924486) {
                    i7 = 389505963 ^ i6;
                    this.disableMessage = getConfig(127597628).getString(qgzvevmyzz(gsrapbynpxisbal(), tgpyyiwpxaruvsq(), i7), qgzvevmyzz(rllpnwytgtqfljs(), tgpyyiwpxaruvsq(), i7));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1537172194) {
                        int i8 = 9575654 ^ i7;
                        this.notAllowedWorldMessage = getConfig(127597628).getString(qgzvevmyzz(phruprrcfmeienh(), tgpyyiwpxaruvsq(), i8), qgzvevmyzz(zyryqycduhqvelm(), tgpyyiwpxaruvsq(), i8));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1594852818) {
                            int i9 = 847804014 ^ i8;
                            this.noPermissionMessage = getConfig(127597628).getString(qgzvevmyzz(dmywcmyvpyowsyb(), tgpyyiwpxaruvsq(), i9), qgzvevmyzz(oelsclvoudcbquk(), tgpyyiwpxaruvsq(), i9));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -884197725) {
                                i6 = 1919823382 ^ i9;
                                this.enableSound = getConfig(127597628).getString(qgzvevmyzz(efwdwrmubgadbii(), tgpyyiwpxaruvsq(), i6), qgzvevmyzz(qpubfrlctcjotoj(), tgpyyiwpxaruvsq(), i6));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1480410640) {
                                    i9 = 2015817278 ^ i6;
                                    this.disableSound = getConfig(127597628).getString(qgzvevmyzz(rvooyfhtaveycut(), tgpyyiwpxaruvsq(), i9), qgzvevmyzz(uayvlrruzpfghqg(), tgpyyiwpxaruvsq(), i9));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1727383581) {
                                        i9 = 311849117 ^ i9;
                                        this.usePermission = getConfig(127597628).getBoolean(qgzvevmyzz(mxfucyhooavwxqv(), tgpyyiwpxaruvsq(), i9), (byte) (1639396960 ^ i9));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 230273803) {
                                            int i10 = 1600208214 ^ i9;
                                            this.flyPermission = getConfig(127597628).getString(qgzvevmyzz(pvwaqssrefldvbv(), tgpyyiwpxaruvsq(), i10), qgzvevmyzz(gmfpwvinsquzlrh(), tgpyyiwpxaruvsq(), i10));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -156214855) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -156214855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (238017803 ^ i10)) {
                                                        break;
                                                    }
                                                }
                                                int i11 = 891251798 ^ i10;
                                                throw new IOException("double");
                                            }
                                            i7 = 2028564921 ^ i10;
                                            this.disableFlyOnDamage = getConfig(127597628).getBoolean(qgzvevmyzz(ufrzrkortvaucwf(), tgpyyiwpxaruvsq(), i7), (byte) (1178565262 ^ i7));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 838587506) {
                                                i8 = 112441715 ^ i7;
                                                this.disableFlyOnCombat = getConfig(127597628).getBoolean(qgzvevmyzz(groywxxttyawkdw(), tgpyyiwpxaruvsq(), i8), (byte) (1082967037 ^ i8));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 73801706) {
                                                    int i12 = 557634889 ^ i8;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -884197725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1385739089 ^ i9)) {
                                    int i13 = 1653759555 ^ i9;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1727383581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1421743931 ^ i9)) {
                                        int i14 = 98427884 ^ i9;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 230273803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (323884318 ^ i9)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            int i15 = 1264894542 ^ i9;
                            throw new RuntimeException("double");
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1594852818 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (916666714 ^ i8)) {
                                int i16 = 1577364406 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 73801706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (122450487 ^ i8)) {
                                    break;
                                }
                            }
                        }
                        int i17 = 249658720 ^ i8;
                        throw new RuntimeException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1537172194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (888828455 ^ i7)) {
                    int i18 = 567995992 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 206126987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1039981824 ^ i7)) {
                        int i19 = 1191401537 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 838587506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (748694050 ^ i7)) {
                            break;
                        }
                    }
                }
            }
            int i20 = 1918869248 ^ i7;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1480410640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (910000347 ^ i6)) {
                int i21 = 1686088349 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -500924486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1020916374 ^ i6)) {
                    int i22 = 1960009345 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 226538915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1097273779 ^ i6)) {
                        int i23 = 366137096 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1575772275 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1319704666 ^ i6)) {
                            break;
                        }
                    }
                }
            }
        }
        int i24 = 1068157973 ^ i6;
        throw new RuntimeException();
    }

    public boolean isWorldBlacklisted(String str, int i) {
        int i2 = 1359248449 ^ (1182336123 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -287157487) {
            int i3 = 853068370 ^ i2;
            return this.blacklistedWorlds.contains(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2015625600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1220846623 ^ i2)) {
                int i4 = 1459550934 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -287157487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (6202018 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1322777029 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isWorldEnabled(java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.FlyPlugin.isWorldEnabled(java.lang.String, int):boolean");
    }

    public boolean hasFlyEnabled(UUID uuid, int i) {
        int i2 = 193527452 ^ (138114260 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1217773697) {
            int i3 = 341008877 ^ i2;
            return this.flyEnabledPlayers.contains(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1217773697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (229848130 ^ i2)) {
                int i4 = 1810538003 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -368128023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (161772095 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 733039050 ^ i2;
        throw new IllegalAccessException();
    }

    public void addFlyPlayer(UUID uuid, int i) {
        int i2 = 1529218945 ^ (178980946 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -647893925) {
            i2 = 924338595 ^ i2;
            this.flyEnabledPlayers.add(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1638113602) {
                int i3 = 754488588 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -647893925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (583410886 ^ i2)) {
                int i4 = 1805475669 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1638113602 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (103700215 ^ i2)) {
                    int i5 = 1501556374 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 107415843 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1627996444 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 836052540 ^ i2;
        throw new RuntimeException();
    }

    public void removeFlyPlayer(UUID uuid, int i) {
        int i2 = 1705029243 ^ (164314572 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 911544186) {
            i2 = 1734901910 ^ i2;
            this.flyEnabledPlayers.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 219220937) {
                int i3 = 1522177412 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -658135061 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (467530799 ^ i2)) {
                int i4 = 1337906762 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 911544186 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1382659863 ^ i2)) {
                    int i5 = 510952314 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 219220937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1988266661 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1152496054 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public DatabaseManager getDatabaseManager() {
        int i = 1053148246 ^ (1461503552 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 465666674) {
            int i2 = 838609192 ^ i;
            return this.databaseManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1809790157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1647889232 ^ i)) {
                int i3 = 1331496399 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 465666674 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1396896406 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 611734298 ^ i;
        throw new IOException();
    }

    @Generated
    public List<String> getBlacklistedWorlds() {
        int i = 363304823 ^ (1429261467 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1370705315) {
            int i2 = 1519947534 ^ i;
            return this.blacklistedWorlds;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1370705315 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1360565482 ^ i)) {
                int i3 = 1766476557 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2055785007 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (923933347 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 485502349 ^ i;
        throw new IOException();
    }

    @Generated
    public List<String> getEnabledWorlds() {
        int i = 1230910374 ^ (953165197 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -646372454) {
            int i2 = 541628696 ^ i;
            return this.enabledWorlds;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -616699045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1157243149 ^ i)) {
                int i3 = 1905865264 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -646372454 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (545564160 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1562640947 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public HashSet<UUID> getFlyEnabledPlayers() {
        int i = 995044995 ^ (1791148137 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -647567981) {
            int i2 = 147799134 ^ i;
            return this.flyEnabledPlayers;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -647567981 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1675391252 ^ i)) {
                int i3 = 1557262641 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1625356445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (236748503 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 371744787 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isChatMessagesEnabled(int i) {
        int i2 = 1219501066 ^ (1432881263 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1144442391) {
            int i3 = 1561382862 ^ i2;
            return this.chatMessagesEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1397706651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (818930229 ^ i2)) {
                int i4 = 708513818 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1144442391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1342474611 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1549740978 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getEnableMessage(int i) {
        int i2 = 1289461562 ^ (1505994594 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -37203967) {
            int i3 = 836315620 ^ i2;
            return this.enableMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1929453344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1548997485 ^ i2)) {
                int i4 = 1213613146 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -37203967 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (37265439 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1203594767 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getDisableMessage(int i) {
        int i2 = 988477609 ^ (584269572 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1798852695) {
            int i3 = 1735338575 ^ i2;
            return this.disableMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1346437678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (960194025 ^ i2)) {
                int i4 = 350737965 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1798852695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (845900771 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 721056817 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getNotAllowedWorldMessage(int i) {
        int i2 = 119584748 ^ (937356796 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -755285440) {
            int i3 = 558593851 ^ i2;
            return this.notAllowedWorldMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -660538471 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (545020594 ^ i2)) {
                int i4 = 756072567 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -755285440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (232212300 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1892020056 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getNoPermissionMessage(int i) {
        int i2 = 536839958 ^ (1939339875 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 910850410) {
            int i3 = 1163785250 ^ i2;
            return this.noPermissionMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 910850410 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (576384828 ^ i2)) {
                int i4 = 687098787 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 480630904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (388452372 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 811281333 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getEnableSound(int i) {
        int i2 = 553565362 ^ (481753512 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1219773936) {
            int i3 = 151594578 ^ i2;
            return this.enableSound;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1219773936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (273373450 ^ i2)) {
                int i4 = 1768421917 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -16611200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2011839333 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1163453581 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getDisableSound(int i) {
        int i2 = 1687421782 ^ (1560663153 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1719194632) {
            int i3 = 619699434 ^ i2;
            return this.disableSound;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1090925399 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1522831059 ^ i2)) {
                int i4 = 1166385272 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1719194632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1230272015 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 569463791 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isUsePermission(int i) {
        int i2 = 1591778904 ^ (826983934 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 677072882) {
            int i3 = 1755381625 ^ i2;
            return this.usePermission;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 677072882 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2102035487 ^ i2)) {
                int i4 = 1701552922 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1834791993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (934113383 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1095124638 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getFlyPermission(int i) {
        int i2 = 1066605258 ^ (1927622176 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1052259731) {
            int i3 = 454028506 ^ i2;
            return this.flyPermission;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1052259731 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (914767401 ^ i2)) {
                int i4 = 2114185862 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -423144637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1496543868 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1543886560 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isDisableFlyOnDamage(int i) {
        int i2 = 13907776 ^ (1288602772 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 903613539) {
            int i3 = 526478503 ^ i2;
            return this.disableFlyOnDamage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -824743589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1684644606 ^ i2)) {
                int i4 = 139843271 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 903613539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1232133462 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1693865127 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isDisableFlyOnCombat(int i) {
        int i2 = 1135664459 ^ (149813858 ^ 715207256);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 266382219) {
            int i3 = 304269447 ^ i2;
            return this.disableFlyOnCombat;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1627983949 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (535064833 ^ i2)) {
                int i4 = 2083565063 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 266382219 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (401983166 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 910641095 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public static FlyPlugin getInstance(int i) {
        int i2 = 423920139 ^ (1468446964 ^ (175710411 ^ 1457360059));
        return instance;
    }

    static {
        nothing_to_see_here[0] = " ⠁⡼⠋⠀⣆⠀⠀⣰⣿⣫⣾⢿⣿⣿⠍⢠⠠⠀⠀⢀⠰⢾⣺⣻⣿⣿⣿⣷⡀⠀";
        nothing_to_see_here[1] = "⣥⠀⠀⠀⠁⠀⠠⢻⢬⠁⣠⣾⠛⠁⠀⠀⠀⠀⠀⠀⠀⠐⠱⠏⡉⠙⣿⣿⡇⠀";
        nothing_to_see_here[2] = "⢳⠀⢰⡖⠀⠀⠈⠀⣺⢰⣿⢻⣾⣶⣿⣿⣶⣶⣤⣤⣴⣾⣿⣷⣼⡆⢸⣿⣧⠀";
        nothing_to_see_here[3] = "⠈⠀⠜⠈⣀⣔⣦⢨⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⣼⠛⢹⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⢋⡿⡿⣯⣭⡟⣟⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡘⠀";
        nothing_to_see_here[5] = "⡀⠐⠀⠀⠀⣿⣯⡿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣉⢽⣿⡆⠀⠀";
        nothing_to_see_here[6] = "⢳⠀⠄⠀⢀⣿⣿⣿⣿⣿⣿⣿⠙⠉⠉⠉⠛⣻⢛⣿⠛⠃⠀⠐⠛⠻⣿⡇⠀⠀";
        nothing_to_see_here[7] = "⣾⠄⠀⠀⢸⣿⣿⡿⠟⠛⠁⢀⠀⢀⡄⣀⣠⣾⣿⣿⡠⣴⣎⣀⣠⣠⣿⡇⠀⠀";
        nothing_to_see_here[8] = "⣧⠀⣴⣄⣽⣿⣿⣿⣶⣶⣖⣶⣬⣾⣿⣾⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⣿⣶⣈⡯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣹⢧⣿⣿⣿⣄⠙⢿⣿⣿⣿⠇⠀⠀";
        nothing_to_see_here[10] = "⠹⣿⣿⣧⢌⢽⣻⢿⣯⣿⣿⣿⣿⠟⣠⡘⠿⠟⠛⠛⠟⠛⣧⡈⠻⣾⣿⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠈⠉⣷⡿⣽⠶⡾⢿⣿⣿⣿⢃⣤⣿⣷⣤⣤⣄⣄⣠⣼⡿⢷⢀⣿⡏⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⢀⣿⣷⠌⣈⣏⣝⠽⡿⣷⣾⣏⣀⣉⣉⣀⣀⣀⣠⣠⣄⡸⣾⣿⠃⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⣰⡿⣿⣧⡐⠄⠱⣿⣺⣽⢟⣿⣿⢿⣿⣍⠉⢀⣀⣐⣼⣯⡗⠟⡏⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⣰⣿⠀⣿⣿⣴⡀⠂⠘⢹⣭⡂⡚⠿⢿⣿⣿⣿⡿⢿⢿⡿⠿⢁⣴⣿⣷⣶⣦⣤";
        kRMvntUAZy = 1124253198 ^ new Random(-5471398238820529843L).nextInt();
    }

    public static String qgzvevmyzz(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] tgpyyiwpxaruvsq() {
        return new byte[]{36, 58, 64, 5, 30, 32, 9, 122, 63, 57, 104, 95, 118, 74, 76, 81, 35, 24, 68, 27, 42, 36, 42, 26, 10, 89, 58, 114, 66, 72, 109, 120, 81, 77, 46, 122, 114, 52, 34, 90, 70, 13, 81, 68, 11, 98, 49, 54, 27, 117, 85, 114, 52, 78, 30, 47, 117, 29, 62, 98, 45, 78, 37, 99, 55, 73, 53, 12, 5, 99, 100, 86, 102, 103, 44, 98, 34, 92, 33, 72, 84};
    }

    private static byte[] nbgbevjnafnmseo() {
        return new byte[]{-21, -12, 116, 81, 44, 120, 49, 58};
    }

    private static byte[] nfitwnegduwnerk() {
        return new byte[]{-21, -3, 112, 87, 43, 118, 61, 41, 8, 107, 89, 11, 70, 24, 121, 13, 23, 7, 115, 92, 27, 115, 26, 95, 63, 13, 14, 36, 117, 11};
    }

    private static byte[] vkeciifbsxeufwq() {
        return new byte[]{-21, -16, 116, 95, 39, 124, 62, 56, 8, Byte.MAX_VALUE, 89, 11, 66, 26, 117, 13, 20, 90, 115, 0, 27, 116, 30, 67, 51, 1, 13, 33, 117, 17, 92, 40};
    }

    private static byte[] tszbtndpybhvfkq() {
        return new byte[]{-21, -16, 116, 20, 39, 120, 62, 13, 8, 96, 89, 3, 66, 26, 117, 0, 20, 93, 115, 14, 27, 116, 30, 67, 51, 1, 13, 33, 117, 17, 92, 40, 101, 30, 23, 98};
    }

    private static byte[] mxfucyhooavwxqv() {
        return new byte[]{-21, -13, 115, 79, 45, 124, 63, 55, 9, 124, 89, 0, 69, 29, Byte.MAX_VALUE, 15, 21, 82, 114, 4, 27, 103, 25, 80, 57, 5, 12, 102, 116, 9, 92, 43, 98, 6, 29, 46, 68, 100, 20, 24, 119, 72, 98, 20, 56, 52, 7, 97};
    }

    private static byte[] efwdwrmubgadbii() {
        return new byte[]{-21, -3, 117, 70, 43, 126, 58, 60, 15, 102, 80, 14, 70, 12, 125, 76, 16, 77, 117, 77, 31, 117, 31, 73, 57, 6, 10, 38};
    }

    private static byte[] qpubfrlctcjotoj() {
        return new byte[]{-21, -3, 117, 112, 43, 95, 58, 29, 15, 65, 80, 62, 70, 38, 125, 61, 16, 109, 117, 123, 31, 68, 31, 110, 57, 56, 10, 10, 122, 56, 93, 3, 96, 61, 29, 15, 67, 83, 23, 37, 115, 110, 98, 53, 59, 12, 9, 83, 43, 9, 100, 2, 7, 53, 47, 66, 64, 125};
    }

    private static byte[] rvooyfhtaveycut() {
        return new byte[]{-21, -4, 115, 71, 43, 121, 57, 56, 15, 103, 89, 2, 69, 8, 121, 73, 19, 75, 116, 66, 27, 110, 25, 74, 63, 13, 10, 41, 114, 29};
    }

    private static byte[] uayvlrruzpfghqg() {
        return new byte[]{-21, -4, 115, 113, 43, 88, 57, 25, 15, 64, 89, 50, 69, 34, 121, 56, 19, 102, 116, Byte.MAX_VALUE, 27, 88, 25, 102, 63, 48, 10, 7, 114, 42, 92, 4, 98, 61, 27, 7};
    }

    private static byte[] ufrzrkortvaucwf() {
        return new byte[]{-21, -12, 119, 78, 43, 115, 60, 60, 9, Byte.MAX_VALUE, 89, 7, 65, 28, 121, 0, 22, 89, 114, 7, 27, 113, 29, 75, 63, 28, 15, 33, 116, 24, 92, 37, 102, 16, 27, 97, 71, 105, 20, 6, 119, 17, 102, 24, 62, 53, 4, 105, 45, 38, 100, 36, 3, 19};
    }

    private static byte[] groywxxttyawkdw() {
        return new byte[]{-21, -11, 120, 68, 39, 115, 62, 62, 12, 122, 89, 6, 78, 22, 117, 0, 20, 91, 119, 2, 27, 112, 18, 65, 51, 28, 13, 35, 113, 29, 92, 36, 105, 26, 23, 97, 69, 107, 17, 3, 119, 16, 105, 21, 50, 59, 6, 107, 40, 108, 100, 41, 12, 29, 39, 116, 66, 64, 13, 58, 28, 11, 29, 63, 14, 81, 2, 88, 54, 59, 85, 8, 94, 32, 21, 32, 21, 47, 18, 16, 101, 102, 2, 23, 60, 6, 23, 90, 73, 103, 8, 53, 103, 38, 115, 27, 102, 103};
    }

    private static byte[] pvwaqssrefldvbv() {
        return new byte[]{-21, -11, 117, 66, 44, 116, 61, 55, 9, 122, 89, 6, 67, 16, 126, 7, 23, 82, 114, 2, 27, 100, 31, 75, 56, 26, 14, 38, 116, 22, 92, 59, 100, 10, 28, 34, 70, 98, 20, 3};
    }

    private static byte[] gmfpwvinsquzlrh() {
        return new byte[]{-21, -11, 117, 87, 44, 125, 61, 58, 9, 32, 89, 26, 67, 13, 126, 5};
    }

    private static byte[] yptxkddtdswnkdf() {
        return new byte[]{-21, -13, 115, 94, 45, 114, 49, 63, 15, 115, 89, 8, 69, 27, Byte.MAX_VALUE, 3, 27, 93, 116, 12, 27, 113, 25, 68, 57, 15, 2, 48};
    }

    private static byte[] dmywcmyvpyowsyb() {
        return new byte[]{-24, -11, 115, 94, 39, 112, 49, 48, 12, 120, 90, 14, 69, 27, 117, 1, 27, 82, 119, 7, 24, 122, 25, 67, 51, 65, 2, 59, 113, 31, 95, 58, 98, 22, 23, 38, 74, 126, 17, 27, 116, 84, 98, 29, 50, 57};
    }

    private static byte[] oelsclvoudcbquk() {
        return new byte[]{-24, -11, 115, 21, 39, 118, 49, 26, 12, 100, 90, 26, 69, 92, 117, 0, 27, 78, 119, 71, 24, 51, 25, 88, 51, 76, 2, 35, 113, 27, 95, 62, 98, 30, 23, 111, 74, 125, 17, 13, 116, 79, 98, 31, 50, 62, 9, 124, 40, 52, 103, 43, 7, 23, 39, 116, 77, 4, 13, 36, 31, 17, 22, 117, 14, 9, 13, 70, 54, 52, 86, 70, 85, 55, 21, 59, 26, 28, 18, 91};
    }

    private static byte[] phruprrcfmeienh() {
        return new byte[]{-21, -9, 119, 91, 46, 124, 49, 61, 13, 124, 89, 12, 65, 30, 124, 13, 27, 95, 118, 3, 27, 120, 29, 70, 58, 20, 2, 107, 112, 31, 92, 38, 102, 18, 30, 44, 74, 119, 16, 9, 119, 91, 102, 90, 59, 44, 9, 109, 41, 49, 100, 44, 3, 25};
    }

    private static byte[] zyryqycduhqvelm() {
        return new byte[]{-21, -9, 119, 16, 46, 122, 49, 23, 13, 96, 89, 24, 65, 89, 124, 11, 27, 77, 118, 67, 27, 49, 29, 93, 58, 64, 2, 51, 112, 13, 92, 47, 102, 94, 30, 37, 74, 108, 16, 21, 119, 31, 102, 30, 59, 53, 9, 34, 41, 55, 100, 40, 3, 20, 46, 101, 77, 9, 12, 35, 28, 19, 18, 34, 7, 28, 13, 92, 55, 116};
    }

    private static byte[] kkaqwpsovzchmpq() {
        return new byte[]{-30, -4, 115, 81, 46, 126, 62, 34, 12, 98, 81, 7, 64, 22, 126, 15, 26, 88, 124, 86, 25, 63, 26, 95, 61, 15, 9, 56, 123, 23, 91, 44, 99, 9};
    }

    private static byte[] gsrapbynpxisbal() {
        return new byte[]{-21, -9, 118, 93, 38, 125, 49, 58, 11, 114, 89, 12, 64, 24, 116, 12, 27, 88, 112, 13, 27, 114, 28, 70, 50, 18, 2, 32, 118, 18, 92, 38, 103, 29};
    }

    private static byte[] rllpnwytgtqfljs() {
        return new byte[]{-21, -9, 118, 22, 38, 123, 49, 15, 11, 109, 89, 4, 64, 24, 116, 1, 27, 95, 112, 3, 27, 114, 28, 70, 50, 18, 2, 32, 118, 18, 92, 38, 103, 29, 22, 38, 74, 38};
    }

    private static int qfwcbrztgvvgcqtf(int i, int i2) {
        return i2 ^ i;
    }
}
