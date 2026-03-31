package com.kammoun.donutCore.rtp;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.rtp.command.RtpCommand;
import com.kammoun.donutCore.rtp.config.ConfigManager;
import com.kammoun.donutCore.rtp.gui.RtpGui;
import com.kammoun.donutCore.rtp.listener.WarmupListener;
import com.kammoun.donutCore.rtp.service.CooldownService;
import com.kammoun.donutCore.rtp.service.QueueService;
import com.kammoun.donutCore.rtp.service.TeleportService;
import com.kammoun.donutCore.rtp.service.WarmupService;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;

public class Rtp extends DonutModule {
    private ConfigManager configManager;
    private CooldownService cooldownService;
    private WarmupService warmupService;
    private QueueService queueService;
    private TeleportService teleportService;
    private RtpGui rtpGui;
    private WarmupListener warmupListener;

    private static int f7543kyN5yrt8 = 0;
    private transient int dGmICYf1HN = 1846531677;
    private static byte[] wzpprmtzmd;
    private static String[] nothing_to_see_here = new String[19];

    public Rtp() {
        super("Rtp", 1095143273);
        spiyrqywgoalkqfn(628039130 ^ 2121428923, 865459273);
        int parseInt = 1187786283 ^ (1608362248 ^ Integer.parseInt("1905862923"));
        this.dGmICYf1HN = 1846531677 ^ f7543kyN5yrt8;
        int i = 1531800601 ^ (1069908201 ^ parseInt);
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 417441786 ^ (1657116645 ^ 653800207);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -421521278) {
            i2 = 1676981926 ^ i2;
            this.configManager = new ConfigManager(this.api, 685877290);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -112874063) {
                int i3 = 277345693 ^ i2;
                this.cooldownService = new CooldownService(this.configManager, 1082967239);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2105147737) {
                    int i4 = 687753397 ^ i3;
                    this.warmupService = new WarmupService(this.configManager, 1693295291);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 982009072) {
                        i3 = 1317297786 ^ i4;
                        this.queueService = new QueueService(this.configManager, 2139201547);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1319810850) {
                            int i5 = 22549732 ^ i3;
                            this.teleportService = new TeleportService(this.configManager, this.cooldownService, this.warmupService, this.queueService, 1356989913);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1147801602) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1147801602 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1305233806 ^ i5)) {
                                        break;
                                    }
                                }
                                int i6 = 367974962 ^ i5;
                                throw new IOException("double");
                            }
                            int i7 = 1078644344 ^ i5;
                            this.rtpGui = new RtpGui(this.api, 1916189782);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1178362816) {
                                int i8 = 1756107297 ^ i7;
                                this.rtpGui.setTeleportService(this.teleportService, 512190915);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 56423115) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 56423115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1745715130 ^ i8)) {
                                            break;
                                        }
                                    }
                                    int i9 = 1059566588 ^ i8;
                                    throw new RuntimeException("double");
                                }
                                i2 = 650967863 ^ i8;
                                this.warmupListener = new WarmupListener(this.warmupService, 51051032);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893070194) {
                                    int i10 = 100130112 ^ i2;
                                    Bukkit.getPluginManager().registerEvents(this.warmupListener, this.api);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 444973426) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 444973426 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (450457918 ^ i10)) {
                                                break;
                                            }
                                        }
                                        int i11 = 1195854970 ^ i10;
                                        throw new RuntimeException("double");
                                    }
                                    int i12 = 1135911111 ^ i10;
                                    RtpCommand rtpCommand = new RtpCommand(this.teleportService, this.rtpGui, 303603436);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 119588680) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 119588680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (406598116 ^ i12)) {
                                                break;
                                            }
                                        }
                                        int i13 = 914012414 ^ i12;
                                        throw new RuntimeException("double");
                                    }
                                    int i14 = 1920967395 ^ i12;
                                    PluginCommand command = this.api.getCommand(zgzqobtrak(cvaaftpzvulvush(), i14));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -1797402541) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1797402541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (2111667009 ^ i14)) {
                                                break;
                                            }
                                        }
                                        int i15 = 1769186803 ^ i14;
                                        throw new IOException("double");
                                    }
                                    i4 = 687313505 ^ i14;
                                    if (command == null) {
                                        spiyrqywgoalkqfn(i4, 1769118755);
                                        return;
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -748600486) {
                                        i2 = 696177566 ^ i4;
                                        command.setExecutor(rtpCommand);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1734877269) {
                                            i7 = 208567308 ^ i2;
                                            command.setTabCompleter(rtpCommand);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -68927541) {
                                                int i16 = 1281504177 ^ i7;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1178362816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2078526014 ^ i7)) {
                                    int i17 = 568625709 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -68927541 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (872069726 ^ i7)) {
                                        break;
                                    }
                                }
                            }
                            int i18 = 1305473471 ^ i7;
                            throw new IOException("double");
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -748600486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (8240568 ^ i4)) {
                            int i19 = 2133246242 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 982009072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1141343506 ^ i4)) {
                                int i20 = 1498357332 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1728732607 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1982701738 ^ i4)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i21 = 1153448111 ^ i4;
                    throw new IllegalAccessException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1319810850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (401266657 ^ i3)) {
                        int i22 = 947355510 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2105147737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1702215524 ^ i3)) {
                            break;
                        }
                    }
                }
                int i23 = 1332041022 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893070194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (625004918 ^ i2)) {
                int i24 = 1049834463 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -421521278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (477765541 ^ i2)) {
                    int i25 = 1699214640 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1734877269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (374484430 ^ i2)) {
                        int i26 = 1934076706 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -112874063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (67762551 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i27 = 405147487 ^ i2;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.Rtp.onModuleDisable(int):void");
    }

    @Override
    public void reload(int i) {
        int i2 = 2077397601 ^ (909317780 ^ 653800207);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1489878995) {
            i2 = 1761830976 ^ i2;
            if (this.configManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 282525136) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 282525136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (792868463 ^ i2)) {
                            break;
                        }
                    }
                    int i3 = 75157481 ^ i2;
                    throw new IllegalAccessException("double");
                }
                i2 = 190936766 ^ i2;
                this.configManager.reload(1002010975);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1272793120) {
                    int i4 = 2028914486 ^ i2;
                    return;
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 33108900:
                        int i5 = 1938796936 ^ i2;
                        return;
                    case 1179587659:
                    case 2006431008:
                        return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1934921325 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1104730095 ^ i2)) {
                int i6 = 1453806010 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1489878995 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (460825510 ^ i2)) {
                    int i7 = 1938839307 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1272793120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1909152762 ^ i2)) {
                        int i8 = 1060319942 ^ i2;
                        throw new IOException();
                    }
                }
            }
        }
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
        wzpprmtzmd = mrhmaulxnduldjj();
        f7543kyN5yrt8 = 389824630 ^ new Random(6239973069927271586L).nextInt();
    }

    public static String zgzqobtrak(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ wzpprmtzmd[i3 % wzpprmtzmd.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] mrhmaulxnduldjj() {
        return new byte[]{28, 32, 79, 103, 65, 79, 126, 88, 103, 32, 117, 4, 80, 90, 86, 99, 68, 71, 93, 29, 107, 50, 104, 28, 102, 34, 2, 81, 124, 118, 84, 111, 106, 25, 12, 88, 57, 52, 79, 41, 16, 22, 42, 36, 112, 96, 34, 46, 108, 105, 102, 60, 62, 87, 73, 20, 1, 107, 23, 48};
    }

    private static byte[] cvaaftpzvulvush() {
        return new byte[]{-45, -26, 125, 39, 121, 11, 70, 27};
    }

    private static int spiyrqywgoalkqfn(int i, int i2) {
        return i2 ^ i;
    }
}
