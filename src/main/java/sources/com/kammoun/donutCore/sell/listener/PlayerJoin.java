package com.kammoun.donutCore.sell.listener;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.sell.SellPlugin;
import com.kammoun.donutCore.sell.model.SellPlayerData;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoin implements Listener {
    private final SellPlugin sellPlugin;
    private static int GLvmJkSLfh = 0;
    private transient int O1rsmi7dut = 1048923085;
    private static String[] nothing_to_see_here = new String[17];

    public PlayerJoin(com.kammoun.donutCore.sell.SellPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.sell.listener.PlayerJoin.<init>(com.kammoun.donutCore.sell.SellPlugin, int):void");
    }

    @EventHandler
    public void onPlayerSellJoin(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        int i = 1327512647 ^ (1729796630 ^ 244733811);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 895977745) {
            int i2 = 1144337477 ^ i;
            UUID uniqueId = asyncPlayerPreLoginEvent.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 349055803) {
                i2 = 1295818625 ^ i2;
                SellPlayerData load = this.sellPlugin.getSellDB(1138394613).load(uniqueId, 882453180);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2099959601) {
                    i = 2026307511 ^ i2;
                    this.sellPlugin.getPlayerManager(1017589848).addPlayer(uniqueId, load, 924835351);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1155716470) {
                        int i3 = 1313807323 ^ i;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2099959601 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1893838495 ^ i2)) {
                    int i4 = 473890042 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 349055803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1755349734 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 699630649 ^ i2;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -916065200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1158596798 ^ i)) {
                int i6 = 1002338394 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1155716470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1671670836 ^ i)) {
                    int i7 = 2093895840 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 895977745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1329466637 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i8 = 808071602 ^ i;
        throw new IOException();
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 1647653108 ^ (987202063 ^ 244733811);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1280889790) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1280889790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (144924190 ^ i)) {
                    break;
                }
            }
            int i2 = 1368717315 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 342009666 ^ i;
        UUID uniqueId = playerJoinEvent.getPlayer().getUniqueId();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 280106578) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 280106578 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1351495440 ^ i3)) {
                    break;
                }
            }
            int i4 = 585395491 ^ i3;
            throw new IllegalAccessException("double");
        }
        int i5 = 1783327995 ^ i3;
        if (this.sellPlugin.getPlayerManager(1017589848).hasPlayer(uniqueId, 274195306) != (677195313 ^ i5)) {
            tumaryiwlydhbvqz(i5, 1993608839);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1122595209) {
            i5 = 1691626607 ^ i5;
            SchedulerUtil.runAsync(() -> {
                int i6 = 1793214662 ^ (815553446 ^ 244733811);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1488838502) {
                    int i7 = 1975979416 ^ i6;
                    SellPlayerData load = this.sellPlugin.getSellDB(1138394613).load(uniqueId, 882453180);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 159009881) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 159009881 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1385748335 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 1831024850 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    i6 = 2139045603 ^ i7;
                    this.sellPlugin.getPlayerManager(1017589848).addPlayer(uniqueId, load, 924835351);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -226247870) {
                        int i9 = 1603162620 ^ i6;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1488838502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1239895551 ^ i6)) {
                        int i10 = 1475857585 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 250688672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (737237999 ^ i6)) {
                            int i11 = 562778054 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -226247870 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1938962661 ^ i6)) {
                                break;
                            }
                        }
                    }
                }
                int i12 = 188932490 ^ i6;
                throw new IllegalAccessException();
            }, 1163669431);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1682445042) {
                int i6 = 301998824 ^ i5;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1122595209 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1982727275 ^ i5)) {
                int i7 = 530080230 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1682445042 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1895242833 ^ i5)) {
                    break;
                }
            }
        }
        int i8 = 1154076590 ^ i5;
        throw new IllegalAccessException();
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 1972036259 ^ (621342217 ^ 244733811);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -257761590) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -257761590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1919659188 ^ i)) {
                    break;
                }
            }
            int i2 = 1012312394 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 883437963 ^ i;
        UUID uniqueId = playerQuitEvent.getPlayer().getUniqueId();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1440961171) {
            i3 = 122034129 ^ i3;
            SellPlayerData player = this.sellPlugin.getPlayerManager(1017589848).getPlayer(uniqueId, 1614039046);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1876159515) {
                i3 = 1777571306 ^ i3;
                if (player != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 542065480) {
                        i3 = 1302075377 ^ i3;
                        SchedulerUtil.runAsync(() -> {
                            int i4 = 542309810 ^ (890097251 ^ 244733811);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -565500656) {
                                i4 = 2016110465 ^ i4;
                                this.sellPlugin.getSellDB(1138394613).save(player, 1672798114);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 521148699) {
                                    i4 = 1950118667 ^ i4;
                                    this.sellPlugin.getPlayerManager(1017589848).removePlayer(uniqueId, 880875825);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1091337920) {
                                        int i5 = 810674079 ^ i4;
                                        return;
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1091337920 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1548507856 ^ i4)) {
                                    int i6 = 527474052 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -565500656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1079818365 ^ i4)) {
                                        int i7 = 1737704644 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1014807993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1507905789 ^ i4)) {
                                            int i8 = 562526088 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 521148699 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (597636167 ^ i4)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            int i9 = 1586982359 ^ i4;
                            throw new IOException();
                        }, 1163669431);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1286601922) {
                            int i4 = 244186484 ^ i3;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                        case 63524331:
                            int i5 = 1125247621 ^ i3;
                            return;
                        case 603198710:
                            return;
                        case 609558487:
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 542065480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (683219158 ^ i3)) {
                int i6 = 1171720082 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1440961171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1237600798 ^ i3)) {
                    int i7 = 795589249 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1286601922 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1204643957 ^ i3)) {
                        int i8 = 1107381425 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1876159515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1489705685 ^ i3)) {
                            int i9 = 1039201676 ^ i3;
                            throw new IllegalAccessException();
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
        GLvmJkSLfh = 883046413 ^ new Random(-9215602496629268241L).nextInt();
    }

    public static String kjgxfometb(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] zqlwbnoqomtunxr() {
        return new byte[]{124, 120, 83, 56, 69, 94, 21, 100, 82, 70, 121, 36, 35, 111, 76, 91, 81, 20, 9, 124, 22, 115, 16, 85, 70, 72, Byte.MAX_VALUE, 18, 98, 18, 16, 17, 26, 48, 34, 37, 43, 123, 8, 32, 77, 88, 44, 10, 40, 30, 39, 34, 107, 111, 60, 126, 22, 121, 123, 90, 31, 94, 65, 115, 103, 48, 33, 114, 122};
    }

    private static int tumaryiwlydhbvqz(int i, int i2) {
        return i ^ i2;
    }
}
