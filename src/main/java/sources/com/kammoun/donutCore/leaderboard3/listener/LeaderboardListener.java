package com.kammoun.donutCore.leaderboard3.listener;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3;
import com.kammoun.donutCore.leaderboard3.gui.LeaderboardMenuGui;
import com.kammoun.donutCore.leaderboard3.gui.LeaderboardPageGui;
import com.kammoun.donutCore.leaderboard3.manager.LeaderboardManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.InventoryHolder;

public class LeaderboardListener implements Listener {
    private final LeaderBoardPlugin3 plugin;
    private final LeaderboardManager manager;
    private static int B6anSzgGoB = 0;
    private transient int uCecZHPILY = 1365434247;
    private static byte[] jlwzklsxhr;
    private static String[] nothing_to_see_here = new String[17];

    public LeaderboardListener(com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3 r5, com.kammoun.donutCore.leaderboard3.manager.LeaderboardManager r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.listener.LeaderboardListener.<init>(com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3, com.kammoun.donutCore.leaderboard3.manager.LeaderboardManager, int):void");
    }

    @org.bukkit.event.EventHandler
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.listener.LeaderboardListener.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent inventoryCloseEvent) {
        int i = 834212124 ^ (490763736 ^ 1066023831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1684342120) {
            i = 2092644432 ^ i;
            Player player = inventoryCloseEvent.getPlayer();
            if ((player instanceof Player) == (1875404547 ^ i)) {
                soyhsainjxdwtbuc(i, 228059119);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2118334491) {
                i = 1697248044 ^ i;
                Player player2 = player;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1460445560) {
                    i = 550524740 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1368267609) {
                        int i2 = 1438779900 ^ i;
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2) == 132654967) {
                                throw new RuntimeException();
                            }
                            throw null;
                        } catch (RuntimeException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1444814840:
                                    i = soyhsainjxdwtbuc(i2, 1392008388);
                                    break;
                                case -6400837:
                                    i = 943172178 ^ i2;
                                    break;
                                default:
                                    throw new RuntimeException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1042482730) {
                                int i3 = 319045133 ^ i;
                                if ((inventoryCloseEvent.getInventory().getHolder() instanceof LeaderboardPageGui) != (1421893320 ^ i3)) {
                                    i = soyhsainjxdwtbuc(i3, 1202289657);
                                    SchedulerUtil.runLater(() -> {
                                        int i4 = 594174327 ^ (1455563737 ^ 1066023831);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1360251338) {
                                            i4 = 1239233185 ^ i4;
                                            InventoryHolder holder = player2.getOpenInventory().getTopInventory().getHolder();
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 536501440) {
                                                i4 = 1027291135 ^ i4;
                                                if ((holder instanceof LeaderboardPageGui) == (1053064295 ^ i4)) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -165420231) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -165420231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (355305379 ^ i4)) {
                                                                break;
                                                            }
                                                        }
                                                        int i5 = 290032234 ^ i4;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                    int i6 = 1000461722 ^ i4;
                                                    if ((holder instanceof LeaderboardMenuGui) != (90548733 ^ i6)) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 724389864) {
                                                            int i7 = 883937757 ^ i6;
                                                            return;
                                                        }
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 724389864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1330849524 ^ i6)) {
                                                                break;
                                                            }
                                                        }
                                                        int i8 = 1081049629 ^ i6;
                                                        throw new IOException("double");
                                                    }
                                                    i4 = 90701684 ^ i6;
                                                    this.manager.openMenu(player2, 1646499794);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1225800) {
                                                        int i9 = 666456965 ^ i4;
                                                        return;
                                                    }
                                                }
                                                while (true) {
                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                        case 161255363:
                                                            int i10 = 252576839 ^ i4;
                                                            return;
                                                        case 613885524:
                                                            return;
                                                        case 1808781366:
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1037576289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (476500992 ^ i4)) {
                                                int i11 = 345991539 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1225800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (236967656 ^ i4)) {
                                                    int i12 = 444800395 ^ i4;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1360251338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1880689845 ^ i4)) {
                                                        int i13 = 1622839577 ^ i4;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 536501440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1542466334 ^ i4)) {
                                                            int i14 = 1954968917 ^ i4;
                                                            throw new IllegalAccessException();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }, 1L, 1577269415);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1689704056) {
                                        int i4 = 1515478637 ^ i;
                                        return;
                                    }
                                } else {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1509755326) {
                                        int i5 = 1575075119 ^ i3;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -6400837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2071933889 ^ i3)) {
                                            int i6 = 546913478 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1444814840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (952780718 ^ i3)) {
                                                int i7 = 514811972 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 318506851 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2128301019 ^ i3)) {
                                                    int i8 = 1957093821 ^ i3;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1509755326 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (995595177 ^ i3)) {
                                                        int i9 = 579854889 ^ i3;
                                                        throw new IOException("double");
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
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2118334491 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (308961927 ^ i)) {
                int i10 = 186338997 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1240193762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1270509177 ^ i)) {
                    int i11 = 1077151065 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1689704056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1127943844 ^ i)) {
                        int i12 = 1413729190 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1368267609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1588628563 ^ i)) {
                            int i13 = 733575832 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1684342120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1089083790 ^ i)) {
                                int i14 = 1655935865 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1460445560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1308014 ^ i)) {
                                    int i15 = 286620740 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1042482730 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1012073548 ^ i)) {
                                        int i16 = 2016229529 ^ i;
                                        throw new IllegalAccessException();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
        nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
        nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
        nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
        nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
        nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
        nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
        nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
        nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
        nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
        nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
        nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
        nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
        nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
        nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
        jlwzklsxhr = znumqigdiyqpizc();
        B6anSzgGoB = (-1178769084) ^ new Random(1923452617417237109L).nextInt();
    }

    public static String fjpfnxzfco(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ jlwzklsxhr[i3 % jlwzklsxhr.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] znumqigdiyqpizc() {
        return new byte[]{115, 75, Byte.MAX_VALUE, 57, 121, 76, 24, 12, 49, 80, 23, 71, 88, 38, 61, 59, 41, 46, 41, 8, 60, 32, 32, 41, 30, 2, 122, 47, 60, 13, 67, 30, 38, 77, 44, 65, 75, 5, 53, 99, 48, 108, 110, 95, 18, 81, 124, 63, 107, 16, 101, 54, 23, 15, 24, 124, Byte.MAX_VALUE, 20, 115, 4, 100, 62, 46, 46, 14, 31, 24, 112, 55, 5, 98, 10, 95, 95, 117, 14, 18, 114, 110, 71, 47, 42, 39, 82, 112, 98, 79, 87, 87, 52, 46, 58, 110, 8, 18, 119, 72, 111, 104, 48, 73, 79, 74, 84, 100, 8, 122, 85, 69, 38, 108, 23, 60, 41, 116};
    }

    private static int soyhsainjxdwtbuc(int i, int i2) {
        return i ^ i2;
    }
}
