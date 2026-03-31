package com.kammoun.donutCore.stats;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.stats.commands.StatsCommand;
import com.kammoun.donutCore.stats.commands.StatsManagerCommand;
import com.kammoun.donutCore.stats.data.StatsDatabase;
import com.kammoun.donutCore.stats.listeners.StatsListener;
import com.kammoun.donutCore.stats.manager.StatsManager;
import com.kammoun.donutCore.stats.menu.StatsMenu;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class StatsPlugin extends DonutModule {
    private StatsDatabase database;
    private StatsManager statsManager;
    private StatsMenu statsMenu;
    private String shardsPlaceholder;
    private static StatsPlugin instance;
    private static int Tj7IgWqj08 = 0;

    private transient int f1117AUrehrUCH = 737225503;
    private static String[] nothing_to_see_here = new String[18];

    public StatsPlugin() {
        super("Stats", 1095143273);
        int i = 222632099 ^ (398202111 ^ 702740243);
        int parseInt = 492796748 ^ (2074837673 ^ Integer.parseInt("1441727146"));
        this.f1117AUrehrUCH = 737225503 ^ Tj7IgWqj08;
        int ygqbakqxaviyxyxz = 1370940889 ^ ygqbakqxaviyxyxz(parseInt, 1913698068);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 746531559 ^ (795588063 ^ 1800802613);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1108635755) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1108635755 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (165860376 ^ i2)) {
                    break;
                }
            }
            int i3 = 747589857 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1462256555 ^ i2;
        saveConfig(qiaosdfzdt(ggtchexagmkhyxa(), uafbcudxhsibflv(), i4), 1620467835);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -78222031) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -78222031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1836999500 ^ i4)) {
                    break;
                }
            }
            int i5 = 1408312281 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 230475904 ^ i4;
        instance = this;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1766840015) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1766840015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (679540776 ^ i6)) {
                    break;
                }
            }
            int i7 = 1615707438 ^ i6;
            throw new RuntimeException("double");
        }
        int i8 = 930078132 ^ i6;
        this.shardsPlaceholder = getConfig(127597628).getString(qiaosdfzdt(ugzvhlgforhyfvj(), uafbcudxhsibflv(), i8), qiaosdfzdt(cbxvqrtcdxexrqg(), uafbcudxhsibflv(), i8));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 768525456) {
            int i9 = 1343379476 ^ i8;
            this.database = new StatsDatabase(this, 267686524);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1386478542) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1386478542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (820435530 ^ i9)) {
                        break;
                    }
                }
                int i10 = 852388512 ^ i9;
                throw new IOException("double");
            }
            i8 = 741745023 ^ i9;
            this.statsManager = new StatsManager(this, 1661835331);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -856879157) {
                int i11 = 566198192 ^ i8;
                this.statsMenu = new StatsMenu(this.api, 2123666040);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != -1055460790) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1055460790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1618684648 ^ i11)) {
                            break;
                        }
                    }
                    int i12 = 1603004764 ^ i11;
                    throw new IllegalAccessException("double");
                }
                i8 = 1076016605 ^ i11;
                registerCommand((KCommand) new StatsCommand(this, 282810276), qiaosdfzdt(kgiphhsrnjgwikm(), uafbcudxhsibflv(), i8), 800215123);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1073521504) {
                    int i13 = 1469971227 ^ i8;
                    registerCommand((KCommand) new StatsManagerCommand(this, 882045744), qiaosdfzdt(odbtvetempkbmnu(), uafbcudxhsibflv(), i13), 800215123);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != 2095875194) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2095875194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (2090188935 ^ i13)) {
                                break;
                            }
                        }
                        int i14 = 702710321 ^ i13;
                        throw new RuntimeException("double");
                    }
                    i8 = 1029251958 ^ i13;
                    registerEvent(new StatsListener(this, 224679343), 1095327048);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1775919157) {
                        int i15 = 2078699786 ^ i8;
                        registerEvent(this.statsMenu, 1095327048);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1226184600) {
                            int i16 = 687808993 ^ i15;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1226184600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1592936735 ^ i15)) {
                                break;
                            }
                        }
                        int i17 = 1906103472 ^ i15;
                        throw new IOException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 250550417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (392486619 ^ i8)) {
                int i18 = 1539249954 ^ i8;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1775919157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (511790687 ^ i8)) {
                    int i19 = 529467837 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -856879157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1262357179 ^ i8)) {
                        int i20 = 782432729 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 768525456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (627160657 ^ i8)) {
                            int i21 = 1843240678 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1073521504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1335760756 ^ i8)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i22 = 1314709149 ^ i8;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int i) {
        int ygqbakqxaviyxyxz;
        int i2;
        int i3 = 256352867 ^ (875665014 ^ 1800802613);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -2130630398) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2130630398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1209302925 ^ i3)) {
                    break;
                }
            }
            int i4 = 829910300 ^ i3;
            throw new IOException("double");
        }
        int i5 = 336286118 ^ i3;
        if (this.statsManager != null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 559653938) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 559653938 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (708729372 ^ i5)) {
                        break;
                    }
                }
                int i6 = 178253077 ^ i5;
                throw new IllegalAccessException("double");
            }
            i2 = 998108626 ^ i5;
            this.statsManager.savePlayersOnDisable(662806742);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -88814941) {
                ygqbakqxaviyxyxz = 1692164543 ^ i2;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 929386193 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (585588902 ^ i2)) {
                    int i7 = 458006907 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -88814941 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (378104294 ^ i2)) {
                        break;
                    }
                }
            }
            int i8 = 1700014961 ^ i2;
            throw new IllegalAccessException();
        }
        ygqbakqxaviyxyxz = ygqbakqxaviyxyxz(i5, 1604422765);
        if (this.database == null) {
            int i9 = 811149743 ^ ygqbakqxaviyxyxz;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ygqbakqxaviyxyxz) != -598227112) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ygqbakqxaviyxyxz) == -598227112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ygqbakqxaviyxyxz) == (1644337357 ^ ygqbakqxaviyxyxz)) {
                    break;
                }
            }
            int i10 = 1812936888 ^ ygqbakqxaviyxyxz;
            throw new IOException("double");
        }
        i2 = 1030115633 ^ ygqbakqxaviyxyxz;
        this.database.closeConnection(1119968866);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 929386193) {
            int i11 = 222263454 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 929386193) {
                int i72 = 458006907 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -88814941) {
                    break;
                    break;
                }
                continue;
            }
        }
        int i82 = 1700014961 ^ i2;
        throw new IllegalAccessException();
    }

    @Override
    public void reload(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.stats.StatsPlugin.reload(int):void");
    }

    @Generated
    public StatsDatabase getDatabase(int i) {
        int i2 = 83243609 ^ (1684797922 ^ 1800802613);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1583273072) {
            int i3 = 373797670 ^ i2;
            return this.database;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -329036480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1442482923 ^ i2)) {
                int i4 = 55481709 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1583273072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1418672466 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 26785800 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public StatsManager getStatsManager(int i) {
        int i2 = 1133987288 ^ (1671369787 ^ 1800802613);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1525810866) {
            int i3 = 38174778 ^ i2;
            return this.statsManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1220937570 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2019624276 ^ i2)) {
                int i4 = 80747642 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1525810866 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1231193394 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1974748450 ^ i2;
        throw new IOException();
    }

    @Generated
    public StatsMenu getStatsMenu(int i) {
        int i2 = 665032682 ^ (118233889 ^ 1800802613);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1607266290) {
            int i3 = 864059942 ^ i2;
            return this.statsMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1010237757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (622759668 ^ i2)) {
                int i4 = 1399858037 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1607266290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1490562309 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1076425169 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getShardsPlaceholder(int i) {
        int i2 = 609900378 ^ (1674619895 ^ 1800802613);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1726442689) {
            int i3 = 1820079772 ^ i2;
            return this.shardsPlaceholder;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 84334626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1413258816 ^ i2)) {
                int i4 = 665000325 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1726442689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1585832838 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2073376526 ^ i2;
        throw new IOException();
    }

    @Generated
    public static StatsPlugin getInstance(int i) {
        int i2 = 1483362514 ^ (1929512976 ^ (733710294 ^ 1084701226));
        return instance;
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠿⠟⠛⠻⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣆⣀⣀⠀⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠻⣿⣿⣿⠅⠛⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[5] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢼⣿⣿⣿⣃⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[6] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣟⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣛⣛⣫⡄⠀⢸⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡆⠸⣿⣿⣿⡷⠂⠨⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⡇⢀⣿⡿⠋⠁⢀⡶⠪⣉⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣷⣿⣿⣷⣦⡙⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣷⣦⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        Tj7IgWqj08 = (-1735647137) ^ new Random(6336353979760045313L).nextInt();
    }

    public static String qiaosdfzdt(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] uafbcudxhsibflv() {
        return new byte[]{58, 22, 81, 122, 4, 45, 126, 79, 5, 105, 109, 43, 28, 25, 56, 9, 36, 99, 66, 121, 123, 61, 35, 79, 51, 36, 19, 107, 7, 23, 42, 65, 21, 88, 78, 101, 17, 92, 106, 97, 43, 93, 68, 106, 85, 41, 100, 88, 87, 53, 80, 1, 110, 99};
    }

    private static byte[] kgiphhsrnjgwikm() {
        return new byte[]{-16, -39, 99, 63, 60, 105, 73, 28, 49, 41, 93, 106};
    }

    private static byte[] ugzvhlgforhyfvj() {
        return new byte[]{-3, -33, 97, 63, 49, 115, 70, 28, 60, 45, 93, 121, 41, 92, 0, 22, 29, 37, 114, 35, 78, 106, 27, 30, 10, 119, 35, 53, 50, 78, 18, 31, 44, 10, 126, 54, 36, 24};
    }

    private static byte[] cbxvqrtcdxexrqg() {
        return new byte[]{-3, -33, 97, 105, 49, 104, 70, 21, 60, 62, 93, 111, 41, 75, 0, 72, 29, 10, 114, 57, 78, 106, 27, 17, 10, 103, 35, 56, 50, 4};
    }

    private static byte[] ggtchexagmkhyxa() {
        return new byte[]{-11, -39, 103, 14, 61, 110, 74, 22, 50, 126, 92, 104, 42, 5, 1, 108, 16, 39, 117, 40, 74, 121, 21, 15, 10, 95, 39, 62, 48, 73, 27, 4, 35, 69, 119, 42, 37, 1, 93, 61};
    }

    private static byte[] odbtvetempkbmnu() {
        return new byte[]{-11, -38, 98, 60, 51, 107, 72, 28, 55, 46, 92, 107, 47, 65, 15, 90, 18, 63, 112, 43, 74, 105, 16, 31, 4, 100};
    }

    private static int ygqbakqxaviyxyxz(int i, int i2) {
        return i2 ^ i;
    }
}
