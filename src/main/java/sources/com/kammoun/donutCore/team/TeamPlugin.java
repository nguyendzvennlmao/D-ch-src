package com.kammoun.donutCore.team;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.team.commands.TeamCommand;
import com.kammoun.donutCore.team.data.TeamTable;
import com.kammoun.donutCore.team.gui.TeamMainMenu;
import com.kammoun.donutCore.team.listeners.PlayerJoin;
import com.kammoun.donutCore.team.listeners.PvPListener;
import com.kammoun.donutCore.team.listeners.TeamChatListener;
import com.kammoun.donutCore.team.manager.ConfigManager;
import com.kammoun.donutCore.team.manager.RequestManager;
import com.kammoun.donutCore.team.manager.TeamsManager;
import com.kammoun.donutCore.team.manager.TeleportManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;

public class TeamPlugin extends DonutModule {
    private TeamTable teamTable;
    private TeamsManager teamsManager;
    private ConfigManager configManager;
    private TeleportManager teleportManager;
    private RequestManager requestManager;
    private TeamMainMenu teamMainMenu;
    private static TeamPlugin instance;
    private static int ZdKVfbfRfj = 0;
    private transient int LIMsN1LQxF = 669906743;
    private static String kaquvbbxob;
    private static String[] nothing_to_see_here = new String[19];

    public TeamPlugin() {
        super("Team", 1095143273);
        int i = 154107435 ^ (2065732644 ^ 892051485);
        int parseInt = 1767950865 ^ (597171926 ^ Integer.parseInt("232562389"));
        this.LIMsN1LQxF = 669906743 ^ ZdKVfbfRfj;
        int i2 = 324445095 ^ (640207594 ^ parseInt);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1721090006 ^ (1959327385 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 356571617) {
            int i3 = 1454412443 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1597747909) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1597747909 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2008758558 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1694912692 ^ i3;
                throw new IOException("double");
            }
            int i5 = 38076769 ^ i3;
            this.teamTable = new TeamTable(this, 267686524);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1293138381) {
                i5 = 556739031 ^ i5;
                this.teamsManager = new TeamsManager(this, 1553838071);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1147860854) {
                    int i6 = 2072058654 ^ i5;
                    this.configManager = new ConfigManager(this, 1350696689);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1738395769) {
                        i5 = 571600571 ^ i6;
                        this.teleportManager = new TeleportManager(this, 1910892283);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1997710752) {
                            i5 = 577816283 ^ i5;
                            this.requestManager = new RequestManager(this, 571750910);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1687458681) {
                                int i7 = 329157707 ^ i5;
                                this.teamMainMenu = new TeamMainMenu(this.api, 405239939);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -127864543) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -127864543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (659542262 ^ i7)) {
                                            break;
                                        }
                                    }
                                    int i8 = 1961002167 ^ i7;
                                    throw new IllegalAccessException("double");
                                }
                                i2 = 1345901320 ^ i7;
                                registerCommand((KCommand) new TeamCommand(this, 1279999147), hpzekmgqjm(qjibwywwerwffdh(), i2), 800215123);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2040949091) {
                                    i6 = 972930743 ^ i2;
                                    registerEvent(new PlayerJoin(this, 982449606), 1095327048);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1236558630) {
                                        int i9 = 1552684437 ^ i6;
                                        registerEvent(new PvPListener(this, 1431122459), 1095327048);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1378562160) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1378562160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (795714733 ^ i9)) {
                                                    break;
                                                }
                                            }
                                            int i10 = 1480932940 ^ i9;
                                            throw new IOException("double");
                                        }
                                        i5 = 689489687 ^ i9;
                                        registerEvent(new TeamChatListener(this, 1045067547), 1095327048);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 451741897) {
                                            int i11 = 1523160230 ^ i5;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1236558630 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1379084855 ^ i6)) {
                            int i12 = 1349809877 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1738395769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1861973108 ^ i6)) {
                                break;
                            }
                        }
                    }
                    int i13 = 1485585086 ^ i6;
                    throw new IOException("double");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1293138381 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (511440406 ^ i5)) {
                    int i14 = 738996366 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 451741897 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (811597192 ^ i5)) {
                        int i15 = 1134066937 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1147860854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (18684581 ^ i5)) {
                            int i16 = 809565517 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1687458681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1043873162 ^ i5)) {
                                int i17 = 314063734 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1997710752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1134038791 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i18 = 857617137 ^ i5;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 356571617 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (571644620 ^ i2)) {
                int i19 = 770005932 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2040949091 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (825917745 ^ i2)) {
                    break;
                }
            }
        }
        int i20 = 884048612 ^ i2;
        throw new RuntimeException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1464004194 ^ (1871893808 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1093355784) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1093355784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (382570716 ^ i2)) {
                    break;
                }
            }
            int i3 = 1537225743 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 111597186 ^ i2;
        this.teamsManager.unloadAllTeams(13975473);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1948122392) {
            int i5 = 670320386 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1270859017 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (204013056 ^ i4)) {
                int i6 = 133707757 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1948122392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (255384741 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1624154519 ^ i4;
        throw new IllegalAccessException();
    }

    @Override
    public void reload(int i) {
        int i2 = 132952422 ^ (540964840 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1187207192) {
            int i3 = 1855986954 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -868462661 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1018940807 ^ i2)) {
                int i4 = 986206512 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1187207192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (844979387 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 213316560 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public TeamTable getTeamTable(int i) {
        int i2 = 476163435 ^ (163734313 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 716497289) {
            int i3 = 1306207804 ^ i2;
            return this.teamTable;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 716497289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (684936387 ^ i2)) {
                int i4 = 1723939554 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1148047467 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1152080453 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1760650470 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeamsManager getTeamsManager(int i) {
        int i2 = 418264960 ^ (928468540 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -94282120) {
            int i3 = 455409392 ^ i2;
            return this.teamsManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 591833592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (386676523 ^ i2)) {
                int i4 = 131383249 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -94282120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (302925850 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1431327558 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public ConfigManager getConfigManager(int i) {
        int i2 = 1117838286 ^ (26323548 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1641996533) {
            int i3 = 831143770 ^ i2;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1641996533 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1556561663 ^ i2)) {
                int i4 = 2090117905 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 309388762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1974705965 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2025838247 ^ i2;
        throw new IOException();
    }

    @Generated
    public TeleportManager getTeleportManager(int i) {
        int i2 = 648920329 ^ (1311146984 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1007459182) {
            int i3 = 144755544 ^ i2;
            return this.teleportManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2030748078 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (615121216 ^ i2)) {
                int i4 = 709741208 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1007459182 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1554508746 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1125212499 ^ i2;
        throw new IOException();
    }

    @Generated
    public RequestManager getRequestManager(int i) {
        int i2 = 1492361953 ^ (2020557709 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2092066568) {
            int i3 = 901995018 ^ i2;
            return this.requestManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 760694953 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1831215073 ^ i2)) {
                int i4 = 175996287 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2092066568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (671265794 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1212494684 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public TeamMainMenu getTeamMainMenu(int i) {
        int i2 = 339884086 ^ (1834060779 ^ 821383795);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1329007986) {
            int i3 = 2023698867 ^ i2;
            return this.teamMainMenu;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1949400855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2125481769 ^ i2)) {
                int i4 = 2087884423 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1329007986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1043874306 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1485550558 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public static TeamPlugin getInstance(int i) {
        int i2 = 334812080 ^ (96376699 ^ (493666620 ^ 387491140));
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
        kaquvbbxob = ByteBuffer.wrap(bryxnkfxavpnglk()).asCharBuffer().toString();
        ZdKVfbfRfj = 2045594004 ^ new Random(2024605557466112959L).nextInt();
    }

    public static String hpzekmgqjm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = kaquvbbxob.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] qjibwywwerwffdh() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 0};
    }

    private static byte[] bryxnkfxavpnglk() {
        return new byte[]{49, 76, 54, 80, 55, 82, 49, 94};
    }
}
