package com.kammoun.donutCore.combat;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.combat.commands.CombatManagerCMD;
import com.kammoun.donutCore.combat.config.CombatConfig;
import com.kammoun.donutCore.combat.listener.CombatCommandListener;
import com.kammoun.donutCore.combat.listener.CombatItemListener;
import com.kammoun.donutCore.combat.listener.CombatListener;
import com.kammoun.donutCore.combat.listener.CombatLogoutListener;
import com.kammoun.donutCore.combat.listener.CombatMovementListener;
import com.kammoun.donutCore.combat.manager.CombatManager;
import com.kammoun.donutCore.combat.utils.WorldGuardUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.entity.Player;

public class CombatPlugin extends DonutModule {
    private static CombatPlugin instance;
    private CombatConfig combatConfig;
    private CombatManager combatManager;
    private WorldGuardUtil worldGuardUtil;
    private boolean serverStopping;
    private static int Mq7qwEP3uT = 0;
    private transient int YiiysxHlVd = 611855265;
    private static String[] nothing_to_see_here = new String[15];

    public CombatPlugin() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.CombatPlugin.<init>():void");
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 410660887 ^ (264445593 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -499341334) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -499341334 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (469885939 ^ i2)) {
                    int i3 = 2111169455 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1558423862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1695967616 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 209258139 ^ i2;
            throw new RuntimeException("double");
        }
        int i5 = 1145998386 ^ i2;
        instance = this;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1068972424) {
            int i6 = 1143203482 ^ i5;
            this.worldGuardUtil = new WorldGuardUtil();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -514329942) {
                i6 = 1995789700 ^ i6;
                this.combatConfig = new CombatConfig(this, 1220172148);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1459445385) {
                    i5 = 1373028911 ^ i6;
                    this.combatManager = new CombatManager(this, 1925896432);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -666152973) {
                        int i7 = 1720211497 ^ i5;
                        registerEvent(new CombatListener(this, 1716610683), 1095327048);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -334917960) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -334917960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1517187815 ^ i7)) {
                                    break;
                                }
                            }
                            int i8 = 1891776073 ^ i7;
                            throw new IllegalAccessException("double");
                        }
                        int i9 = 836986769 ^ i7;
                        registerEvent(new CombatLogoutListener(this, 99660500), 1095327048);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1662169649) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1662169649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1892991204 ^ i9)) {
                                    break;
                                }
                            }
                            int i10 = 136459373 ^ i9;
                            throw new RuntimeException("double");
                        }
                        i6 = 29349072 ^ i9;
                        registerEvent(new CombatMovementListener(this, 1320978752), 1095327048);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1860965553) {
                            i5 = 1806088926 ^ i6;
                            registerEvent(new CombatCommandListener(this, 857210962), 1095327048);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 869909058) {
                                i5 = 1167168054 ^ i5;
                                registerEvent(new CombatItemListener(this, 1909764554), 1095327048);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 525685744) {
                                    i5 = 1551402491 ^ i5;
                                    CombatManagerCMD combatManagerCMD = new CombatManagerCMD();
                                    String[] strArr = new String[(byte) (1603415942 ^ i5)];
                                    strArr[(byte) (1603415941 ^ i5)] = dsnmkleftv(bnfjswwprmsgpge(), baxxjqtoubdjxdh(), i5);
                                    strArr[(byte) (1603415940 ^ i5)] = dsnmkleftv(xqikzvwuaqotvhh(), baxxjqtoubdjxdh(), i5);
                                    strArr[(byte) (1603415943 ^ i5)] = dsnmkleftv(navotvmfrooheaj(), baxxjqtoubdjxdh(), i5);
                                    registerCommand(combatManagerCMD, strArr, 641726055);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -57574358) {
                                        int i11 = 200385884 ^ i5;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -514329942 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1326881137 ^ i6)) {
                    int i12 = 799900770 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1860965553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (112322527 ^ i6)) {
                        int i13 = 1213988326 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1459445385 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (781333732 ^ i6)) {
                            break;
                        }
                    }
                }
            }
            int i14 = 804150728 ^ i6;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -57574358 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1963627335 ^ i5)) {
                int i15 = 1687213933 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -666152973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1279763958 ^ i5)) {
                    int i16 = 1431452526 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1068972424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (13131832 ^ i5)) {
                        int i17 = 1024265062 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 525685744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1946539222 ^ i5)) {
                            int i18 = 662462843 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 869909058 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (778016632 ^ i5)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i19 = 1683745753 ^ i5;
        throw new RuntimeException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 649780425 ^ (345586992 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -823468973) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -823468973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1244816011 ^ i2)) {
                    break;
                }
            }
            int i3 = 1888393232 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 107880846 ^ i2;
        this.serverStopping = (byte) (2142468613 ^ i4);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -40120285) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -40120285 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1961788169 ^ i4)) {
                    break;
                }
            }
            int i5 = 400708580 ^ i4;
            throw new IOException("double");
        }
        int i6 = 1599955767 ^ i4;
        if (this.combatManager == null) {
            zujovehquhyrllfq(i6, 1346916669);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 124832153) {
            i6 = 1270360222 ^ i6;
            this.combatManager.clearAll(1975220600);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1521585515) {
                int i7 = 468744611 ^ i6;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 124832153 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (715327507 ^ i6)) {
                int i8 = 1458908775 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1521585515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1900315259 ^ i6)) {
                    break;
                }
            }
        }
        int i9 = 1433907700 ^ i6;
        throw new RuntimeException();
    }

    @Override
    public void reload(int i) {
        int i2 = 158980277 ^ (1530241000 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -845682320) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -845682320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1929717580 ^ i2)) {
                    break;
                }
            }
            int i3 = 1852659182 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 2027429882 ^ i2;
        loadConfig(392005859);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 190256803) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 190256803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1422080446 ^ i4)) {
                    break;
                }
            }
            int i5 = 293027714 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 415827383 ^ i4;
        if (this.combatConfig != null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -853591269) {
                int i7 = 1086234642 ^ i6;
                this.combatConfig.loadConfiguration(1334980401);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -924173431) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -924173431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1271046819 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 1816977202 ^ i7;
                    throw new IOException("double");
                }
                i6 = 2001230313 ^ i7;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1923675330 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (664024198 ^ i6)) {
                    int i9 = 1762419801 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -853591269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (714859027 ^ i6)) {
                        break;
                    }
                }
            }
            int i10 = 2130949733 ^ i6;
            throw new IOException();
        }
        i6 = zujovehquhyrllfq(i6, 938932731);
        getLogger(583940502).info(dsnmkleftv(sqchberlfyaiuqj(), baxxjqtoubdjxdh(), i6));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1923675330) {
            int i11 = 693122532 ^ i6;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1923675330) {
                int i92 = 1762419801 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -853591269) {
                    break;
                    break;
                }
                continue;
            }
        }
        int i102 = 2130949733 ^ i6;
        throw new IOException();
    }

    public boolean isInCombat(org.bukkit.entity.Player r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.CombatPlugin.isInCombat(org.bukkit.entity.Player):boolean");
    }

    public boolean isInCombat(UUID uuid) {
        byte b;
        int i = 1183873186 ^ (2067473233 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1297150973) {
            i = 661466528 ^ i;
            if (this.combatManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1983487742) {
                    i = 1934847304 ^ i;
                    if (this.combatManager.isInCombat(uuid, 1458518918) != (577479016 ^ i)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 324864833) {
                            i = 1541905122 ^ i;
                            b = (byte) (2039233419 ^ i);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -866001837) {
                                int zujovehquhyrllfq = zujovehquhyrllfq(i, 159035935);
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(zujovehquhyrllfq) != 182311526) {
                                        throw null;
                                    }
                                    throw new IllegalAccessException();
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -2018227029:
                                            i = 1208996908 ^ zujovehquhyrllfq;
                                            break;
                                        case 601317377:
                                            i = 478392761 ^ zujovehquhyrllfq;
                                            break;
                                        default:
                                            throw new IllegalAccessException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -943002167) {
                                        zujovehquhyrllfq(i, 664987275);
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                            case 45132498:
                                i = 1472043061 ^ i;
                                break;
                            case 1447660459:
                            default:
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2018227029 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (230783260 ^ i)) {
                                        int i2 = 1096171472 ^ i;
                                        throw new IOException("double");
                                    }
                                }
                                break;
                            case 1520884140:
                            case 2090928560:
                                break;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1983487742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (763298800 ^ i)) {
                        int i3 = 438857566 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1364079893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (440667884 ^ i)) {
                            int i4 = 1579491207 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -943002167 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (722938787 ^ i)) {
                                int i5 = 1425091285 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -86124144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (596404502 ^ i)) {
                                    int i6 = 628595192 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 601317377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (380691283 ^ i)) {
                                        int i7 = 2075486413 ^ i;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -866001837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (121116370 ^ i)) {
                                            int i8 = 989266497 ^ i;
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                i = 619640189 ^ i;
            }
            b = (byte) (1976973661 ^ i);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1364079893) {
                int i9 = 1787658863 ^ i;
                return b;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1983487742) {
                    int i32 = 438857566 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1364079893) {
                        continue;
                    } else {
                        int i42 = 1579491207 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -943002167) {
                            continue;
                        } else {
                            int i52 = 1425091285 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -86124144) {
                                continue;
                            } else {
                                int i62 = 628595192 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 601317377) {
                                    continue;
                                } else {
                                    int i72 = 2075486413 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -866001837) {
                                        int i82 = 989266497 ^ i;
                                        throw new RuntimeException();
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1297150973 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1819826450 ^ i)) {
                int i10 = 858587196 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 324864833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (712771872 ^ i)) {
                    break;
                }
            }
        }
        int i11 = 2143260275 ^ i;
        throw new IOException("double");
    }

    public void setCombat(Player player) {
        int i = 43870267 ^ (1039834966 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1530238733) {
            i = 1142488277 ^ i;
            if (this.combatManager == null) {
                int i2 = 1625756117 ^ i;
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2079486375) {
                i = 1450156945 ^ i;
                this.combatManager.setCombat(player, 740687228);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 930124499) {
                    int i3 = 914928196 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2079486375 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1982399542 ^ i)) {
                int i4 = 1881247866 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 930124499 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (404917793 ^ i)) {
                    int i5 = 1889908667 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1530238733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1247413529 ^ i)) {
                        int i6 = 334126223 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2093678350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1513224785 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1812470245 ^ i;
        throw new IllegalAccessException();
    }

    public void setCombat(Player player, Player player2) {
        int i = 842011530 ^ (1126979648 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -686322231) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -686322231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (863431747 ^ i)) {
                    break;
                }
            }
            int i2 = 181715948 ^ i;
            throw new IOException("double");
        }
        int i3 = 1645407154 ^ i;
        if (this.combatManager == null) {
            int i4 = 1350958955 ^ i3;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -947859366) {
            i3 = 1936920775 ^ i3;
            this.combatManager.setCombat(player, player2, 1904427035);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1545098849) {
                int i5 = 603385772 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1545098849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1298419080 ^ i3)) {
                int i6 = 1955786922 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1135553280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1083889337 ^ i3)) {
                    int i7 = 2145620136 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -947859366 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1337952590 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1696856603 ^ i3;
        throw new IOException();
    }

    public void removeCombat(Player player, boolean z) {
        int i = 1875297543 ^ (1996881864 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1712585246) {
            i = 883585986 ^ i;
            if (this.combatManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1019190259) {
                    i = 339891636 ^ i;
                    this.combatManager.removeCombat(player, z, 1461998274);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1632815533) {
                        int i2 = 1197379391 ^ i;
                        return;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                    case 146145363:
                        int i3 = 1394399883 ^ i;
                        return;
                    case 392834658:
                        return;
                    case 1682830067:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1537650775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (694719406 ^ i)) {
                int i4 = 924469528 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1632815533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1625303763 ^ i)) {
                    int i5 = 603914030 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1712585246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (685962010 ^ i)) {
                        int i6 = 1832701064 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1019190259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1767267602 ^ i)) {
                            int i7 = 1017243641 ^ i;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    public int getRemainingTime(org.bukkit.entity.Player r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.CombatPlugin.getRemainingTime(org.bukkit.entity.Player):int");
    }

    @Generated
    public CombatConfig getCombatConfig(int i) {
        int i2 = 227860379 ^ (753699278 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1412915507) {
            int i3 = 363385499 ^ i2;
            return this.combatConfig;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -109971989 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (646897096 ^ i2)) {
                int i4 = 1789839847 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1412915507 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1787832295 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1584495156 ^ i2;
        throw new IOException();
    }

    @Generated
    public CombatManager getCombatManager(int i) {
        int i2 = 984627752 ^ (818523764 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 205091194) {
            int i3 = 313911550 ^ i2;
            return this.combatManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 205091194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1558968208 ^ i2)) {
                int i4 = 481318011 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1718208886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (662734546 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1615551962 ^ i2;
        throw new IOException();
    }

    @Generated
    public WorldGuardUtil getWorldGuardUtil(int i) {
        int i2 = 1587730735 ^ (1447614722 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 413520626) {
            int i3 = 83895798 ^ i2;
            return this.worldGuardUtil;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 816119106 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (951571138 ^ i2)) {
                int i4 = 1322368448 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 413520626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (336877325 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1422376000 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isServerStopping(int i) {
        int i2 = 248028566 ^ (548208039 ^ 1274985075);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 752275987) {
            int i3 = 472149981 ^ i2;
            return this.serverStopping;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -839537413 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (419333643 ^ i2)) {
                int i4 = 974712398 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 752275987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (579312683 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1479212227 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public static CombatPlugin getInstance(int i) {
        int i2 = 210141296 ^ (1227391869 ^ (1658676953 ^ 1871090130));
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
        Mq7qwEP3uT = 76549914 ^ new Random(1159825627242015174L).nextInt();
    }

    public static String dsnmkleftv(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] baxxjqtoubdjxdh() {
        return new byte[]{43, 96, 38, 88, 40, 78, 71, 93, 15, 118, 66, 64, 19, 25, 96, 19, 39, 49, 61, 75, 6, 3, 72, 100, 47, 30, 118, 95, 62, 88, 82, 54, 50, 96, 47, 69, 65, 105, 5, 81, 46, 15, 79, 72, 73, 18, 90, 101, 15, 15, 3, 124, 7, 55, 84, 79, 43, 123, 90, 94, 43, 54, 95, 29, 24, 81, 20, 89, 6, 105, 118};
    }

    private static byte[] bnfjswwprmsgpge() {
        return new byte[]{-28, -87, 22, 8, 28, 16, 114, 9, 59, 37, 115, 23, 35, 94, 84, 79, 18, 105, 9, 20, 55, 84, 120, 48, 27, 74, 67, 20};
    }

    private static byte[] xqikzvwuaqotvhh() {
        return new byte[]{-28, -87, 22, 8, 28, 16, 114, 9, 59, 37, 115, 23, 35, 94, 84, 79, 18, 111, 9, 8};
    }

    private static byte[] navotvmfrooheaj() {
        return new byte[]{-28, -87, 22, 8, 28, 16, 114, 9, 59, 37, 115, 23, 35, 94, 84, 67, 18, 108, 9, 23, 55, 92, 120, 57};
    }

    private static byte[] sqchberlfyaiuqj() {
        return new byte[]{-28, -84, 23, 55, 26, 61, 118, 0, 59, 43, 115, 17, 34, 76, 82, 87, 22, 94, 9, 91, 55, 115, 121, 63, 29, 67, 71, 15, 10, 9, 99, 113, 3, 116, 29, 22, 112, 52, 49, 15, 31, 90, 126, 21, 123, 69, 107, 34, 59, 77, 50, 46, 54, 119, 102, 22, 26, 38, 110, 0, 26, 37, 110, 91, 42, 4, 37, 7, 50, 54, 71, 121, 81, 118, 106, 125, Byte.MAX_VALUE, 17, 105, 30};
    }

    private static int zujovehquhyrllfq(int i, int i2) {
        return i2 ^ i;
    }
}
