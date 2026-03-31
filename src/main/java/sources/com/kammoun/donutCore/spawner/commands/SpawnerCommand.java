package com.kammoun.donutCore.spawner.commands;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.spawner.SpawnerPlugin;
import com.kammoun.donutCore.spawner.manager.SpawnerManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class SpawnerCommand extends KCommand {
    private final SpawnerPlugin plugin;

    private static int f10511daVWCJ7N = 0;
    private transient int htqDorJBDq = 488563914;
    private static String wgmlscfclb;
    private static String[] nothing_to_see_here = new String[15];

    public SpawnerCommand(SpawnerPlugin spawnerPlugin, int i) {
        super("spawner", "donutspawners.admin", false, 1862853155);
        int i2 = 1390422779 ^ 903341810;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 133987430:
                    int i3 = 753442390 ^ i2;
                    break;
                case 269274680:
                case 816052980:
                    break;
                case 1886603817:
                default:
                    throw new RuntimeException();
            }
        }
        int parseInt = 1226639580 ^ (1314942513 ^ Integer.parseInt("1285698738"));
        this.htqDorJBDq = 488563914 ^ f10511daVWCJ7N;
        this.plugin = spawnerPlugin;
        int i4 = 871002363 ^ (1646977820 ^ (2081365296 ^ parseInt));
    }

    @Override
    public void execute(org.bukkit.command.CommandSender r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.commands.SpawnerCommand.execute(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleGive(org.bukkit.command.CommandSender r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.commands.SpawnerCommand.handleGive(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleReload(CommandSender commandSender, int i) {
        int i2 = 1292005333 ^ (798957959 ^ 1122325710);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 62969057) {
            int i3 = 1475171395 ^ i2;
            this.plugin.getSpawnerConfigManager(579818845).reload(1314393881);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1129679109) {
                i3 = 1488345261 ^ i3;
                SpawnerManager.getInstance(932047160).loadSpawners(new File(this.plugin.getModuleDataFolder(493044696), zzndyzzjah(afnzsfnmhndymuw(), i3)), 1859303389);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2031661969) {
                    i2 = 78294418 ^ i3;
                    commandSender.sendMessage(zzndyzzjah(cxobhrklnozxpis(), i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1548607233) {
                        int i4 = 330587810 ^ i2;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2031661969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1934813496 ^ i3)) {
                    int i5 = 1096402369 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1129679109 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1176469336 ^ i3)) {
                        break;
                    }
                }
            }
            int i6 = 715780738 ^ i3;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1548607233 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (593506784 ^ i2)) {
                int i7 = 2016593048 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1041290735 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1711672836 ^ i2)) {
                    int i8 = 1050940085 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 62969057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1238095644 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i9 = 458404687 ^ i2;
        throw new IllegalAccessException();
    }

    private void handleList(org.bukkit.command.CommandSender r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.commands.SpawnerCommand.handleList(org.bukkit.command.CommandSender, int):void");
    }

    private void sendHelp(CommandSender commandSender, int i) {
        int i2 = 1348615700 ^ (1741502570 ^ 1122325710);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1437428349) {
            int i3 = 638782421 ^ i2;
            commandSender.sendMessage(zzndyzzjah(ywdumfqnhfqdohu(), i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1697985750) {
                i3 = 1602056742 ^ i3;
                commandSender.sendMessage(zzndyzzjah(sjjosrmjkcraypg(), i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1629575704) {
                    i2 = 709090535 ^ i3;
                    commandSender.sendMessage(zzndyzzjah(zknuexgunhjtfdl(), i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 859815201) {
                        i2 = 2080048513 ^ i2;
                        commandSender.sendMessage(zzndyzzjah(kifsgfvifbrsryd(), i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -320368342) {
                            int i4 = 1697369878 ^ i2;
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1697985750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1405890250 ^ i3)) {
                    int i5 = 1139964149 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1629575704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (385372581 ^ i3)) {
                        break;
                    }
                }
            }
            int i6 = 1329579461 ^ i3;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -320368342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1210483153 ^ i2)) {
                int i7 = 511002722 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1437428349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1903286611 ^ i2)) {
                    int i8 = 319979904 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 859815201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (656605191 ^ i2)) {
                        int i9 = 479244767 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -977671783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1592749289 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 706056395 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    public List onTab(CommandSender commandSender, String[] strArr, int i) {
        int xwdcezwghtioidwc;
        int xwdcezwghtioidwc2;
        int i2;
        int i3;
        int i4 = 800993472 ^ (44877315 ^ 1122325710);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2143096939) {
            int i5 = 422752636 ^ i4;
            ArrayList arrayList = new ArrayList();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1238852725) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1238852725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1768048861 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1709276152 ^ i5;
                throw new IllegalAccessException("double");
            }
            int i7 = 721746479 ^ i5;
            if (strArr.length == ((byte) (1572989279 ^ i7))) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -300987662) {
                    int i8 = 610435049 ^ i7;
                    arrayList.add(zzndyzzjah(scbjznwzcqlpnzd(), i8));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -853756485) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -853756485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1288817263 ^ i8)) {
                                break;
                            }
                        }
                        int i9 = 2089120428 ^ i8;
                        throw new RuntimeException("double");
                    }
                    i3 = 1552763227 ^ i8;
                    arrayList.add(zzndyzzjah(tvoelwippdumzgh(), i3));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 695664481) {
                        i4 = 2123226631 ^ i3;
                        arrayList.add(zzndyzzjah(qtdfvtmmxtgrpdh(), i4));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -585625766) {
                            i2 = 573765851 ^ i4;
                            Stream stream = arrayList.stream();
                            Predicate predicate = str -> {
                                int i10 = 1366579434 ^ (236445735 ^ 1610330116);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 79709768) {
                                    return str.toLowerCase().startsWith(strArr[(byte) (1384329945 ^ (1377516048 ^ i10))].toLowerCase());
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 79709768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (2009631190 ^ i10)) {
                                        int i11 = 37785150 ^ i10;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1810262326 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1737441516 ^ i10)) {
                                            break;
                                        }
                                    }
                                }
                                int i12 = 1623283407 ^ i10;
                                throw new IllegalAccessException();
                            };
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -862991997) {
                                i3 = 412050463 ^ i2;
                                Stream filter = stream.filter(predicate);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 150268283) {
                                    i7 = 209152385 ^ i3;
                                    List list = (List) filter.collect(Collectors.toList());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1800381811) {
                                        int i10 = 1474142284 ^ i7;
                                        return list;
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -685656158 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1625245677 ^ i2)) {
                                    int i11 = 1191589140 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -862991997 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (504413692 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                            int i12 = 1272342120 ^ i2;
                            throw new IOException("double");
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 194178008 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1260151843 ^ i3)) {
                            int i13 = 1504517424 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 150268283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (444501018 ^ i3)) {
                                int i14 = 928653943 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 695664481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (160852143 ^ i3)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i15 = 1177735498 ^ i3;
                    throw new IOException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1800381811 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1297973928 ^ i7)) {
                        int i16 = 1901861194 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -300987662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (482258163 ^ i7)) {
                            int i17 = 1408155400 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -148938519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (394917493 ^ i7)) {
                                break;
                            }
                        }
                    }
                }
                int i18 = 2133865916 ^ i7;
                throw new IOException("double");
            }
            i4 = 1364823557 ^ i7;
            if (strArr.length != ((byte) (211314521 ^ i4))) {
                xwdcezwghtioidwc = xwdcezwghtioidwc(i4, 1640707113);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1690516184) {
                i3 = 233454112 ^ i4;
                if (strArr[(byte) (24272251 ^ i3)].equalsIgnoreCase(zzndyzzjah(dlzzctcdiqmhrfa(), i3)) != (24272251 ^ i3)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 194178008) {
                        i4 = 5414408 ^ i3;
                        Stream stream2 = Bukkit.getOnlinePlayers().stream();
                        Function function = (v0) -> {
                            return v0.getName();
                        };
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 151395224) {
                            xwdcezwghtioidwc = 1583141610 ^ i4;
                            Stream map = stream2.map(function);
                            Predicate predicate2 = str2 -> {
                                int i19 = 1452589947 ^ (478596866 ^ 1610330116);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -1353849880) {
                                    return str2.toLowerCase().startsWith(strArr[(byte) (1531467721 ^ (1319234485 ^ i19))].toLowerCase());
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -1353849880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1889912030 ^ i19)) {
                                        int i20 = 191650615 ^ i19;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -633160126 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1013560396 ^ i19)) {
                                            break;
                                        }
                                    }
                                }
                                int i21 = 660161196 ^ i19;
                                throw new IllegalAccessException();
                            };
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == -69169974) {
                                int i19 = 235554802 ^ xwdcezwghtioidwc;
                                Stream filter2 = map.filter(predicate2);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) != -1951222950) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -1951222950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (1535851472 ^ i19)) {
                                            break;
                                        }
                                    }
                                    int i20 = 187237979 ^ i19;
                                    throw new RuntimeException("double");
                                }
                                int i21 = 479061777 ^ i19;
                                List list2 = (List) filter2.collect(Collectors.toList());
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == 1876790226) {
                                    int i22 = 1686703567 ^ i21;
                                    return list2;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == 1876790226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == (1675103693 ^ i21)) {
                                        break;
                                    }
                                }
                                int i23 = 2061391298 ^ i21;
                                throw new IllegalAccessException("double");
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == 1788517267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == (949606053 ^ xwdcezwghtioidwc)) {
                                    int i24 = 1359192885 ^ xwdcezwghtioidwc;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == -69169974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == (236800923 ^ xwdcezwghtioidwc)) {
                                        int i25 = 1867046404 ^ xwdcezwghtioidwc;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == -710760687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == (192666868 ^ xwdcezwghtioidwc)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            int i26 = 904214370 ^ xwdcezwghtioidwc;
                            throw new IllegalAccessException("double");
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 194178008) {
                            int i132 = 1504517424 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 150268283) {
                                int i142 = 928653943 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 695664481) {
                                    break;
                                    break;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    }
                    int i152 = 1177735498 ^ i3;
                    throw new IOException("double");
                }
                xwdcezwghtioidwc = xwdcezwghtioidwc(i3, 1814105609);
            }
            if (strArr.length == ((byte) (1834177393 ^ xwdcezwghtioidwc))) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == 1788517267) {
                    int i27 = 935565919 ^ xwdcezwghtioidwc;
                    if (strArr[(byte) (1519438125 ^ i27)].equalsIgnoreCase(zzndyzzjah(qwdvirfxxrsoflx(), i27)) != (1519438125 ^ i27)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i27) != -729396886) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i27) == -729396886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i27) == (128487380 ^ i27)) {
                                    break;
                                }
                            }
                            int i28 = 1479908570 ^ i27;
                            throw new RuntimeException("double");
                        }
                        int i29 = 19887607 ^ i27;
                        Stream stream3 = SpawnerManager.getInstance(932047160).getAllSpawners(2052443589).stream();
                        Function function2 = (v0) -> {
                            return v0.getName();
                        };
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) != -570562862) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == -570562862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i29) == (1106736977 ^ i29)) {
                                    break;
                                }
                            }
                            int i30 = 1728497470 ^ i29;
                            throw new RuntimeException("double");
                        }
                        int i31 = 1150897611 ^ i29;
                        Stream map2 = stream3.map(function2);
                        Predicate predicate3 = str3 -> {
                            int i32 = 426784284 ^ (1290471444 ^ 1610330116);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == 1392799840) {
                                return str3.toLowerCase().startsWith(strArr[(byte) (1594031538 ^ (1432515516 ^ i32))].toLowerCase());
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == 1392799840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == (468854401 ^ i32)) {
                                    int i33 = 1224915992 ^ i32;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == -132649598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i32) == (7069604 ^ i32)) {
                                        break;
                                    }
                                }
                            }
                            int i34 = 2003367265 ^ i32;
                            throw new IllegalAccessException();
                        };
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i31) != -113801080) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i31) == -113801080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i31) == (896774788 ^ i31)) {
                                    break;
                                }
                            }
                            int i32 = 1441956220 ^ i31;
                            throw new IOException("double");
                        }
                        int i33 = 985876547 ^ i31;
                        Stream filter3 = map2.filter(predicate3);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i33) != 791530129) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i33) == 791530129 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i33) == (1777088669 ^ i33)) {
                                    break;
                                }
                            }
                            int i34 = 895576277 ^ i33;
                            throw new IOException("double");
                        }
                        int i35 = 1292799562 ^ i33;
                        List list3 = (List) filter3.collect(Collectors.toList());
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i35) == 1197062339) {
                            int i36 = 1673672502 ^ i35;
                            return list3;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i35) == 1197062339 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i35) == (1776243360 ^ i35)) {
                                break;
                            }
                        }
                        int i37 = 1381846425 ^ i35;
                        throw new RuntimeException("double");
                    }
                    xwdcezwghtioidwc2 = xwdcezwghtioidwc(i27, 1031376565);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == 1788517267) {
                        int i242 = 1359192885 ^ xwdcezwghtioidwc;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == -69169974) {
                            int i252 = 1867046404 ^ xwdcezwghtioidwc;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc) == -710760687) {
                                break;
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
                int i262 = 904214370 ^ xwdcezwghtioidwc;
                throw new IllegalAccessException("double");
            }
            xwdcezwghtioidwc2 = xwdcezwghtioidwc(xwdcezwghtioidwc, 179967210);
            if (strArr.length != ((byte) (1743341468 ^ xwdcezwghtioidwc2))) {
                xwdcezwghtioidwc(xwdcezwghtioidwc2, 1256695801);
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc2) != 1061829827) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc2) == 1061829827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(xwdcezwghtioidwc2) == (1358803533 ^ xwdcezwghtioidwc2)) {
                            break;
                        }
                    }
                    int i38 = 1664782374 ^ xwdcezwghtioidwc2;
                    throw new IOException("double");
                }
                int i39 = 1078705940 ^ xwdcezwghtioidwc2;
                if (strArr[(byte) (664991884 ^ i39)].equalsIgnoreCase(zzndyzzjah(sdwejqvpusgorgg(), i39)) != (664991884 ^ i39)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i39) != 1024967777) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i39) == 1024967777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i39) == (2094734254 ^ i39)) {
                                break;
                            }
                        }
                        int i40 = 948148197 ^ i39;
                        throw new RuntimeException("double");
                    }
                    int i41 = 562029134 ^ i39;
                    arrayList.add(zzndyzzjah(hfoqypfuoppgpje(), i41));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i41) != 921228816) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i41) == 921228816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i41) == (1064877847 ^ i41)) {
                                break;
                            }
                        }
                        int i42 = 1464426192 ^ i41;
                        throw new IllegalAccessException("double");
                    }
                    i7 = 943650527 ^ i41;
                    arrayList.add(zzndyzzjah(qzsvchrjqqudrcp(), i7));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -148938519) {
                        i2 = 1678236393 ^ i7;
                        arrayList.add(zzndyzzjah(eczovchaewraqzq(), i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -685656158) {
                            i4 = 534190199 ^ i2;
                            arrayList.add(zzndyzzjah(mmgcpyjkqphmowm(), i4));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 697922586) {
                                int i43 = 1748881122 ^ i4;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -685656158) {
                                int i112 = 1191589140 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -862991997) {
                                    break;
                                    break;
                                }
                                continue;
                            }
                        }
                        int i122 = 1272342120 ^ i2;
                        throw new IOException("double");
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1800381811) {
                            int i162 = 1901861194 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -300987662) {
                                int i172 = 1408155400 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -148938519) {
                                    break;
                                    break;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    }
                    int i182 = 2133865916 ^ i7;
                    throw new IOException("double");
                }
                xwdcezwghtioidwc(i39, 179050733);
            }
            return arrayList;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 151395224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1324559768 ^ i4)) {
                int i44 = 1836153320 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -585625766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (992745530 ^ i4)) {
                    int i45 = 1337274301 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2143096939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (817190739 ^ i4)) {
                        int i46 = 1587074810 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 697922586 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1314064024 ^ i4)) {
                            int i47 = 1500691197 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1690516184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1317709427 ^ i4)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i48 = 2099826856 ^ i4;
        throw new RuntimeException();
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
        wgmlscfclb = ByteBuffer.wrap(thinhtadpbzhtsj()).asCharBuffer().toString();
        f10511daVWCJ7N = (-838379701) ^ new Random(4096936999778725596L).nextInt();
    }

    public static String zzndyzzjah(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = wgmlscfclb.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] xvdvmawezipiedq() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 0};
    }

    private static byte[] rjyxmxcezzdblke() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 6};
    }

    private static byte[] lkmxsahvizzllot() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 10};
    }

    private static byte[] qlaxgzvmfkctbye() {
        return new byte[]{0, 0, 0, 47, 0, 0, 0, 14};
    }

    private static byte[] imjzoyfwaysescr() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, 61};
    }

    private static byte[] gxnzjiqgxriuosz() {
        return new byte[]{0, 0, 0, 65, 0, 0, 0, 78};
    }

    private static byte[] yoxdjhfswbuawpq() {
        return new byte[]{0, 0, 0, 19, 0, 0, 0, -113};
    }

    private static byte[] vyjegcvevkxpufa() {
        return new byte[]{0, 0, 0, 26, 0, 0, 0, -94};
    }

    private static byte[] cxobhrklnozxpis() {
        return new byte[]{0, 0, 0, 33, 0, 0, 0, -68};
    }

    private static byte[] afnzsfnmhndymuw() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, -35};
    }

    private static byte[] tqlcsgfzgnuusxn() {
        return new byte[]{0, 0, 0, 23, 0, 0, 0, -23};
    }

    private static byte[] zknuexgunhjtfdl() {
        return new byte[]{0, 0, 0, 42, 0, 0, 1, 0};
    }

    private static byte[] sjjosrmjkcraypg() {
        return new byte[]{0, 0, 0, 59, 0, 0, 1, 42};
    }

    private static byte[] ywdumfqnhfqdohu() {
        return new byte[]{0, 0, 0, 21, 0, 0, 1, 101};
    }

    private static byte[] kifsgfvifbrsryd() {
        return new byte[]{0, 0, 0, 42, 0, 0, 1, 122};
    }

    private static byte[] mmgcpyjkqphmowm() {
        return new byte[]{0, 0, 0, 2, 0, 0, 1, -92};
    }

    private static byte[] tvoelwippdumzgh() {
        return new byte[]{0, 0, 0, 6, 0, 0, 1, -90};
    }

    private static byte[] qtdfvtmmxtgrpdh() {
        return new byte[]{0, 0, 0, 4, 0, 0, 1, -84};
    }

    private static byte[] qzsvchrjqqudrcp() {
        return new byte[]{0, 0, 0, 1, 0, 0, 1, -80};
    }

    private static byte[] hfoqypfuoppgpje() {
        return new byte[]{0, 0, 0, 1, 0, 0, 1, -79};
    }

    private static byte[] scbjznwzcqlpnzd() {
        return new byte[]{0, 0, 0, 4, 0, 0, 1, -78};
    }

    private static byte[] dlzzctcdiqmhrfa() {
        return new byte[]{0, 0, 0, 4, 0, 0, 1, -74};
    }

    private static byte[] qwdvirfxxrsoflx() {
        return new byte[]{0, 0, 0, 4, 0, 0, 1, -70};
    }

    private static byte[] sdwejqvpusgorgg() {
        return new byte[]{0, 0, 0, 4, 0, 0, 1, -66};
    }

    private static byte[] eczovchaewraqzq() {
        return new byte[]{0, 0, 0, 2, 0, 0, 1, -62};
    }

    private static byte[] thinhtadpbzhtsj() {
        return new byte[]{57, 68, 55, 87, 56, 90, 49, 92, 56, 88, 54, 83, 50, 87, 48, 80, 55, 71, 49, 87, 51, 88, 48, 90, 50, 65, 48, 68, 49, -105, 50, 86, 48, 108, 51, 67, 57, 88, 49, 87, 50, 80, 48, 3, 51, 16, 57, 22, 49, 67, 50, 69, 48, 88, 51, 71, 57, 87, 49, 85, 50, 71, 48, 25, 51, 87, 57, 80, 49, 70, 50, 80, 48, 25, 51, 12, 57, 73, 49, 92, 50, 84, 48, 64, 51, 85, 57, 75, 49, 14, 50, 21, 48, 5, 51, 68, 57, 64, 49, 64, 50, 80, 48, 7, 51, 16, 57, 5, 49, 81, 50, 88, 48, 86, 51, 69, 57, 87, 49, 68, 50, 11, 49, -107, 49, 90, 53, 126, 57, 95, 55, 78, 49, 83, 49, 85, 53, 94, 57, 85, 55, 24, 49, 83, 49, 84, 53, 88, 57, 68, 55, 86, 49, 70, 49, 24, 49, -108, 51, 90, 49, 123, 52, 90, 54, 79, 49, 82, 51, 85, 49, 91, 52, 80, 54, 25, 49, 64, 51, 73, 49, 83, 52, 67, 54, 87, 49, 86, 51, 75, 49, 18, 52, 64, 54, 64, 49, 67, 51, 92, 49, 19, 52, 20, 54, 108, 49, 64, 51, 92, 49, 18, 52, 27, 54, 74, 49, 67, 51, 88, 49, 69, 52, 90, 54, 92, 49, 65, 51, 25, 49, 94, 52, 93, 54, 74, 49, 71, 51, 25, 49, 70, 52, 91, 54, 25, 49, 64, 51, 92, 49, 87, 52, 20, 54, 88, 49, 69, 51, 88, 49, 91, 52, 88, 54, 88, 49, 81, 51, 85, 49, 87, 52, 20, 54, 77, 49, 74, 51, 73, 49, 87, 52, 71, 54, 23, 49, -111, 57, 87, 56, 100, 53, 84, 50, 86, 49, 79, 57, 81, 56, 70, 53, 24, 50, 89, 49, 89, 57, 64, 56, 20, 53, 94, 50, 88, 49, 67, 57, 90, 56, 80, 53, 25, 55, -110, 51, 82, 49, 121, 54, 94, 53, 88, 53, 70, 49, 95, 56, 66, 51, 21, 55, 88, 51, 68, 49, 75, 54, 71, 53, 23, 53, 81, 49, 84, 56, 22, 51, 69, 55, 90, 51, 66, 49, 81, 54, 71, 53, 94, 53, 69, 49, 84, 56, 23, 55, -108, 48, 85, 52, 101, 56, 65, 54, 86, 51, 71, 52, 90, 54, 93, 49, 68, 55, 19, 48, 87, 52, 89, 56, 95, 54, 81, 51, 89, 52, 83, 54, 77, 49, 68, 55, 82, 48, 64, 52, 95, 56, 94, 54, 89, 51, 16, 52, 70, 54, 93, 49, 90, 55, 92, 48, 85, 52, 82, 56, 84, 54, 83, 51, 17, 55, 74, 48, 72, 50, 89, 54, 66, 56, 89, 57, 85, 56, 64, 56, 69, 53, 22, 55, 64, 48, 85, 50, 84, 49, -105, 55, 92, 57, -97, 49, 89, 55, 116, 49, 70, 55, 88, 57, 81, 49, 89, 55, 84, 49, 82, 55, 85, 57, 93, 49, 21, 55, 102, 49, 64, 55, 88, 57, 79, 49, 91, 55, 80, 49, 66, 55, 74, 57, 2, 54, -109, 52, 4, 52, 24, 56, 66, 50, 70, 52, 85, 51, 67, 55, 86, 49, 87, 54, 70, 52, 19, 52, 69, 56, 84, 50, 90, 52, 91, 51, 85, 55, 92, 49, 18, 54, -109, 52, 85, 52, 26, 56, 17, 50, 100, 52, 81, 51, 88, 55, 87, 49, 83, 54, 80, 52, 19, 52, 84, 56, 94, 50, 88, 52, 82, 51, 93, 55, 95, 49, 71, 54, 70, 52, 82, 52, 67, 56, 88, 50, 89, 52, 90, 50, -105, 51, 1, 57, 25, 57, 69, 51, 66, 48, 82, 54, 78, 54, 87, 54, 86, 50, 66, 51, 22, 57, 81, 57, 95, 51, 68, 48, 86, 54, 25, 54, 5, 54, 67, 50, 92, 51, 87, 57, 79, 57, 83, 51, 64, 48, 13, 54, 25, 54, 5, 54, 71, 50, 73, 51, 70, 57, 83, 57, 8, 51, 18, 48, 15, 54, 88, 54, 84, 54, 92, 50, 69, 51, 88, 57, 66, 57, 8, 51, 18, 48, -108, 54, 95, 54, 20, 54, 19, 50, 119, 51, 95, 57, 64, 57, 83, 51, 18, 48, 82, 54, 25, 54, 74, 54, 67, 50, 81, 51, 65, 57, 88, 57, 83, 51, 64, 49, -108, 57, 93, 51, -111, 52, 89, 49, 100, 49, 67, 57, 89, 51, 65, 52, 91, 49, 82, 49, 65, 57, 24, 51, 117, 52, 90, 49, 90, 49, 94, 57, 89, 51, 88, 52, 81, 49, 68, 49, 9, 49, -110, 55, 7, 53, 25, 54, 69, 57, 67, 49, 84, 55, 71, 53, 88, 54, 83, 57, 65, 49, 21, 55, 92, 53, 95, 54, 69, 57, 71, 49, 21, 55, -105, 53, 80, 54, 27, 57, 19, 49, 121, 55, 89, 53, 69, 54, 66, 57, 19, 49, 84, 55, 92, 53, 90, 54, 22, 57, 64, 49, 69, 55, 81, 53, 65, 54, 88, 57, 86, 49, 71, 55, 16, 53, 66, 54, 79, 57, 67, 49, 80, 55, 67, 49, 7, 54, 4, 54, 64, 51, 93, 50, 84, 57, 88, 50, 87, 50, 87, 49, 89, 51, 94, 52, 67, 57, 65, 49, 5, 49, 0, 50, 87, 52, 89, 55, 64, 52, 85, 50, 83, 50, 94, 50, 68, 53, 84, 49, 82, 49, 80, 52, 69, 56, 84, 54, 81, 52, 80, 57, 71, 56, 93, 49, 4, 50, 4};
    }

    private static int xwdcezwghtioidwc(int i, int i2) {
        return i2 ^ i;
    }
}
