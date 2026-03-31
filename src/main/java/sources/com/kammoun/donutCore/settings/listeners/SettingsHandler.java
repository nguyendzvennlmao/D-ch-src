package com.kammoun.donutCore.settings.listeners;

import com.kammoun.donutCore.combat.utils.WorldGuardUtil;
import com.kammoun.donutCore.settings.SettingsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class SettingsHandler implements Listener {
    private final SettingsPlugin plugin;
    private List<String> playerVisibilityWorlds;
    private List<String> playerVisibilityRegions;
    private WorldGuardUtil worldGuardUtil;
    private static final double MOB_SPAWN_CHECK_DISTANCE = 128.0d;
    private static int iWVqbjEe1J = 0;

    private transient int f958ZeHoPtXqT = 1691350970;
    private static String qxdnwauajj;
    private static String[] nothing_to_see_here = new String[15];

    public SettingsHandler(SettingsPlugin settingsPlugin, int i) {
        int i2 = 500729017 ^ (1709338139 ^ 45774158);
        int parseInt = 130230964 ^ (1537379025 ^ Integer.parseInt("652296073"));
        this.f958ZeHoPtXqT = 1691350970 ^ iWVqbjEe1J;
        int rwqxzusrstgwfdrr = 1056379980 ^ rwqxzusrstgwfdrr(parseInt, 1171626789);
        this.plugin = settingsPlugin;
        loadConfig(711580302);
        initWorldGuard(899618349);
        Bukkit.getPluginManager().registerEvents(this, settingsPlugin.getApi(2142241109));
        int i3 = 1069565148 ^ (2024854456 ^ (189766389 ^ (795536840 ^ rwqxzusrstgwfdrr)));
    }

    private void initWorldGuard(int i) {
        int i2 = 774709300 ^ (705511925 ^ 1955720178);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2054401637) {
            i2 = 470189631 ^ i2;
            if (Bukkit.getPluginManager().getPlugin(pjjmljibmk(uoxtgknwaqkadwi(), i2)) == null) {
                rwqxzusrstgwfdrr(i2, 1528169073);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1706582115) {
                i2 = 1614279129 ^ i2;
                this.worldGuardUtil = new WorldGuardUtil();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1678241448) {
                    int i3 = 992080808 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1678241448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (921411890 ^ i2)) {
                int i4 = 1193021371 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2054401637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (813216479 ^ i2)) {
                    int i5 = 954125140 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1706582115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (56511815 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 424716014 ^ i2;
        throw new IOException();
    }

    private void loadConfig(int i) {
        int i2 = 786217643 ^ (528269090 ^ 1955720178);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 697267162) {
            int i3 = 800299774 ^ i2;
            this.playerVisibilityWorlds = this.plugin.getConfig(127597628).getStringList(pjjmljibmk(hteoyjgtghdjtpf(), i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1410573355) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1410573355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1236526658 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1799627243 ^ i3;
                throw new IOException("double");
            }
            i2 = 205532063 ^ i3;
            this.playerVisibilityRegions = this.plugin.getConfig(127597628).getStringList(pjjmljibmk(urmsgeyonljjxos(), i2));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 907213011) {
                int i5 = 1986836718 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 907213011 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2089792441 ^ i2)) {
                int i6 = 68291259 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2055782496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1345644419 ^ i2)) {
                    int i7 = 1411314788 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 697267162 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (407050575 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 421847882 ^ i2;
        throw new RuntimeException();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 1369193269 ^ (1861796638 ^ 1955720178);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1604886218) {
            i = 2045738622 ^ i;
            Player player = playerJoinEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1865192135) {
                i = 1329390620 ^ i;
                updatePlayerVisibility(player, 383784965);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -382448165) {
                    int i2 = 440774217 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -382448165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1893389541 ^ i)) {
                int i3 = 997549055 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1865192135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1310346476 ^ i)) {
                    int i4 = 840042314 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1604886218 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1697328016 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1034856181 ^ i;
        throw new IllegalAccessException();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onWorldChange(PlayerChangedWorldEvent playerChangedWorldEvent) {
        int i = 821095255 ^ (1481072466 ^ 1955720178);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -516751432) {
            i = 641984754 ^ i;
            Player player = playerChangedWorldEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -751978455) {
                i = 950023783 ^ i;
                updatePlayerVisibility(player, 383784965);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 371985168) {
                    int i2 = 517667265 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -516751432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1496970428 ^ i)) {
                int i3 = 492256259 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -751978455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1075870641 ^ i)) {
                    int i4 = 1933742752 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -520370920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (94809714 ^ i)) {
                        int i5 = 1744268035 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 371985168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1782744777 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 1506635370 ^ i;
        throw new IllegalAccessException();
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
    public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.listeners.SettingsHandler.onPlayerMove(org.bukkit.event.player.PlayerMoveEvent):void");
    }

    @EventHandler
    public void onPlayerPublicChatReceive(AsyncPlayerChatEvent asyncPlayerChatEvent) {
        int i = 1247308692 ^ (1891137029 ^ 1955720178);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1938797338) {
            i = 206112811 ^ i;
            asyncPlayerChatEvent.getRecipients().removeIf(
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.listeners.SettingsHandler.onPlayerPublicChatReceive(org.bukkit.event.player.AsyncPlayerChatEvent):void");
        }

        public void togglePlayerVisibility(java.util.UUID r6, boolean r7, int r8) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.listeners.SettingsHandler.togglePlayerVisibility(java.util.UUID, boolean, int):void");
        }

        private void updatePlayerVisibility(org.bukkit.entity.Player r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.listeners.SettingsHandler.updatePlayerVisibility(org.bukkit.entity.Player, int):void");
        }

        private boolean isPlayerVisibilityWorld(String str, int i) {
            int i2 = 1248592680 ^ (848707583 ^ 1955720178);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1667152168) {
                i2 = 852103406 ^ i2;
                if (this.playerVisibilityWorlds != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -183615911) {
                        int i3 = 355107824 ^ i2;
                        if (this.playerVisibilityWorlds.isEmpty() == (730547259 ^ i3)) {
                            rwqxzusrstgwfdrr(i3, 430384175);
                            return this.playerVisibilityWorlds.contains(str);
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1549410777) {
                            i2 = 942151370 ^ i3;
                            return (byte) (329470704 ^ i2);
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1549410777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1840702589 ^ i3)) {
                                break;
                            }
                        }
                        int i4 = 15358272 ^ i3;
                        throw new IOException("double");
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 156847544:
                            i2 = 755143994 ^ i2;
                            break;
                        case 1015965327:
                        case 1925064456:
                            break;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -183615911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1566470375 ^ i2)) {
                    int i5 = 843535420 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1659201656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1067460754 ^ i2)) {
                        int i6 = 1798375671 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1855782751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (496555874 ^ i2)) {
                            int i7 = 46100159 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1667152168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (919990295 ^ i2)) {
                                int i8 = 1485515803 ^ i2;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }

        private boolean isInVisibilityRegion(org.bukkit.entity.Player r6, org.bukkit.Location r7, int r8) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.listeners.SettingsHandler.isInVisibilityRegion(org.bukkit.entity.Player, org.bukkit.Location, int):boolean");
        }

        private boolean isInVisibilityRegion(Player player, int i) {
            int i2 = 328544818 ^ (1338900573 ^ 1955720178);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1180093673) {
                int i3 = 24597760 ^ i2;
                return isInVisibilityRegion(player, player.getLocation(), 1954916064);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1307337961 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1658826214 ^ i2)) {
                    int i4 = 961517321 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1180093673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (507951176 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 112803452 ^ i2;
            throw new IOException();
        }

        private boolean isPlayerVisibilityAllowed(Player player, int i) {
            int i2 = 959029999 ^ (836819717 ^ 1955720178);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -490434365) {
                i2 = 1650794660 ^ i2;
                if (this.playerVisibilityRegions != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -236087840) {
                        i2 = 1951735322 ^ i2;
                        if (this.playerVisibilityRegions.isEmpty() == (1785244838 ^ i2)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1397056819) {
                                int i3 = 225846487 ^ i2;
                                return isInVisibilityRegion(player, 543594287);
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                case 237675753:
                                    int i4 = 929125608 ^ i2;
                                    break;
                                case 1108727230:
                                case 1843798847:
                                    break;
                            }
                        }
                        return isPlayerVisibilityWorld(player.getWorld().getName(), 883948344);
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -236087840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2032815276 ^ i2)) {
                            int i5 = 478163525 ^ i2;
                            throw new IOException("double");
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 177706097:
                            int i6 = 1127500530 ^ i2;
                            break;
                        case 207091581:
                            break;
                        case 1555316597:
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -490434365 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1744157770 ^ i2)) {
                    int i7 = 1318363974 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -397426062 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1755110782 ^ i2)) {
                        int i8 = 121426349 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1397056819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (178846296 ^ i2)) {
                            int i9 = 1345706406 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 955532171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (163349558 ^ i2)) {
                                int i10 = 1706319703 ^ i2;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }

        public void reloadConfig(int i) {
            int i2 = 368715185 ^ (443597090 ^ 1955720178);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -656901365) {
                i2 = 1745945102 ^ i2;
                loadConfig(711580302);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1739560072) {
                    int i3 = 999862330 ^ i2;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1739560072 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (786609392 ^ i2)) {
                    int i4 = 2127436406 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -656901365 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1524627984 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1025038527 ^ i2;
            throw new IllegalAccessException();
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
            qxdnwauajj = ByteBuffer.wrap(ewyywgkryaucoba()).asCharBuffer().toString();
            iWVqbjEe1J = (-827284654) ^ new Random(-6613779854905512399L).nextInt();
        }

        public static String pjjmljibmk(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = qxdnwauajj.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] uoxtgknwaqkadwi() {
            return new byte[]{0, 0, 0, 10, 0, 0, 0, 0};
        }

        private static byte[] hteoyjgtghdjtpf() {
            return new byte[]{0, 0, 0, 24, 0, 0, 0, 10};
        }

        private static byte[] urmsgeyonljjxos() {
            return new byte[]{0, 0, 0, 25, 0, 0, 0, 34};
        }

        private static byte[] ewyywgkryaucoba() {
            return new byte[]{49, 111, 50, 92, 57, 65, 53, 89, 48, 84, 49, Byte.MAX_VALUE, 50, 70, 57, 82, 53, 71, 48, 84, 49, 71, 56, 90, 57, 82, 52, 77, 48, 80, 49, 69, 56, 27, 57, 69, 52, 93, 48, 70, 49, 94, 56, 84, 57, 90, 52, 88, 48, 92, 49, 67, 56, 79, 57, 29, 52, 67, 48, 90, 49, 69, 56, 90, 57, 87, 52, 71, 49, 71, 50, 88, 48, 80, 52, 74, 54, 87, 49, 69, 50, 25, 48, 71, 52, 90, 54, 65, 49, 94, 50, 86, 48, 88, 52, 95, 54, 91, 49, 67, 50, 77, 48, 31, 52, 65, 54, 87, 49, 80, 50, 93, 48, 94, 52, 93, 54, 65};
        }

        private static int rwqxzusrstgwfdrr(int i, int i2) {
            return i2 ^ i;
        }
    }
