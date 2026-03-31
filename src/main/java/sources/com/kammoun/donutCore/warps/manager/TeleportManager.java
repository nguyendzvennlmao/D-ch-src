package com.kammoun.donutCore.warps.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.warps.Warp;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TeleportManager implements Listener {
    private final Warp plugin;
    private final HashMap<UUID, SchedulerUtil.Task> tasks;
    private static int HZc3pdG6Fq = 0;
    private transient int bJOevUIN4Z = 157098814;
    private static String[] nothing_to_see_here = new String[15];

    public TeleportManager(Warp warp) {
        int i = 1666694630 ^ (126450131 ^ 1958523880);
        int parseInt = 1893230460 ^ (254977520 ^ Integer.parseInt("1871230289"));
        this.bJOevUIN4Z = 157098814 ^ HZc3pdG6Fq;
        int nnkpnhtbqtkjyqfd = 1644765916 ^ nnkpnhtbqtkjyqfd(parseInt, 2041304622);
        this.tasks = new HashMap<>();
        this.plugin = warp;
        int i2 = 1828279500 ^ (1522370075 ^ nnkpnhtbqtkjyqfd);
    }

    public void teleportWithCountdown(org.bukkit.entity.Player r9, java.lang.String r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.warps.manager.TeleportManager.teleportWithCountdown(org.bukkit.entity.Player, java.lang.String):void");
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent playerMoveEvent) {
        int i;
        int i2 = 959585266 ^ (2090426362 ^ 1359547816);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1525527296) {
            int i3 = 897123897 ^ i2;
            Player player = playerMoveEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 249199817) {
                int i4 = 744744771 ^ i3;
                UUID uniqueId = player.getUniqueId();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1841645264) {
                    i4 = 1039491286 ^ i4;
                    if (this.tasks.containsKey(uniqueId) == (810403852 ^ i4)) {
                        nnkpnhtbqtkjyqfd(i4, 539018266);
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2106703775) {
                        i2 = 610544546 ^ i4;
                        Location from = playerMoveEvent.getFrom();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1588650640) {
                            i4 = 1966342402 ^ i2;
                            Location to = playerMoveEvent.getTo();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 149886307) {
                                i4 = 1533728947 ^ i4;
                                if (from.getBlockX() != to.getBlockX()) {
                                    i3 = nnkpnhtbqtkjyqfd(i4, 1294007479);
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -742797063) {
                                    i2 = 1828751101 ^ i4;
                                    if (from.getBlockY() != to.getBlockY()) {
                                        i3 = 538999370 ^ i2;
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1145182446) {
                                        i = 1231530418 ^ i2;
                                        if (from.getBlockZ() == to.getBlockZ()) {
                                            nnkpnhtbqtkjyqfd(i, 243079494);
                                            return;
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -260003200) {
                                            i3 = 1766315000 ^ i;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 265077401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (545093779 ^ i)) {
                                                int i5 = 1799655127 ^ i;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1458796016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1782070584 ^ i)) {
                                                    int i6 = 541228678 ^ i;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1165312841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1592732910 ^ i)) {
                                                        int i7 = 672826734 ^ i;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -260003200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2019789089 ^ i)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        int i8 = 551861560 ^ i;
                                        throw new RuntimeException("double");
                                    }
                                }
                                SchedulerUtil.Task remove = this.tasks.remove(uniqueId);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1161939645) {
                                    i = 1610182337 ^ i3;
                                    if (remove == null) {
                                        nnkpnhtbqtkjyqfd(i, 952345727);
                                        return;
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1165312841) {
                                        i = 156708922 ^ i;
                                        remove.cancel(1520188267);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 265077401) {
                                            int i9 = 264405231 ^ i;
                                            player.sendMessage(ChatFormater.color(this.plugin.getConfig(127597628).getString(hesamtogmr(akmpmxfjlpmqhkn(), ewsuqlymogglsax(), i9))));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1910031841) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1910031841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1025117410 ^ i9)) {
                                                        break;
                                                    }
                                                }
                                                int i10 = 1189961377 ^ i9;
                                                throw new RuntimeException("double");
                                            }
                                            i = 619017730 ^ i9;
                                            player.sendActionBar(ChatFormater.color(this.plugin.getConfig(127597628).getString(hesamtogmr(dsjqocxgerokteb(), ewsuqlymogglsax(), i))));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1458796016) {
                                                int i11 = 1942676147 ^ i;
                                                player.playSound(player.getLocation(), this.plugin.getConfig(127597628).getString(hesamtogmr(cqysgnxfcojzjvy(), ewsuqlymogglsax(), i11)), 1.0f, 1.0f);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -928751509) {
                                                    int i12 = 1769570331 ^ i11;
                                                    return;
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -928751509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1024420444 ^ i11)) {
                                                        break;
                                                    }
                                                }
                                                int i13 = 1199989351 ^ i11;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 265077401) {
                                            int i52 = 1799655127 ^ i;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1458796016) {
                                                int i62 = 541228678 ^ i;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1165312841) {
                                                    int i72 = 672826734 ^ i;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -260003200) {
                                                        break;
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    int i82 = 551861560 ^ i;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2106703775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2078712203 ^ i4)) {
                        int i14 = 712513298 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1841645264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2056061132 ^ i4)) {
                            int i15 = 1760520985 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -742797063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1018690801 ^ i4)) {
                                int i16 = 98612309 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 149886307 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1963143333 ^ i4)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i17 = 2040032086 ^ i4;
                throw new IllegalAccessException();
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1161939645 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (943894972 ^ i3)) {
                    int i18 = 473581733 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 249199817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (599511186 ^ i3)) {
                        int i19 = 1595115035 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2090311504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1261052905 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i20 = 247563466 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1588650640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1095064018 ^ i2)) {
                int i21 = 1972388453 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1525527296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1302661208 ^ i2)) {
                    int i22 = 586707182 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1145182446 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (924091828 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i23 = 1234860332 ^ i2;
        throw new IllegalAccessException("double");
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        HZc3pdG6Fq = (-877057221) ^ new Random(8276596629000630096L).nextInt();
    }

    public static String hesamtogmr(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ewsuqlymogglsax() {
        return new byte[]{Byte.MAX_VALUE, 77, 58, 119, 76, 6, 106, 6, 63, 96, 80, 33, 4, 114, 124, 112, 90, 55, 57, 98, 93, 5, 124, 111, 24, 94, 27, 36, 72, 53, 21, 64, 107, 62, 110, 104, 112, 86, 6, 17, 22, 38, 11, 21, 16, 88, 5, 30, 45, 7, 77, 94, 56, 27, 44, 64, 61, 57, 62, 121, 56, 92, 29, 48, 94, 119, 97, 23, 3, 48, 4, 96, 119, 17, 91, 87, 1, 71, 105, 102, 10, 2, 77, 24, 85, 118, 108, 119, 29, 33, 118, 116, 33, 71, 115, 109, 101, 63, 75, 65, 62, 13, 17, 94};
    }

    private static byte[] rvkggtzzcfqrdxu() {
        return new byte[]{-76, -123, 3, 43, 121, 83, 90, 66, 10, 38, 103, 121, 53, 32, 76, 37, 109, 113, 12, 123, 100, 64, 73, 58, 40, 5, 46, 116, Byte.MAX_VALUE, 124, 36, 26, 91, 124, 89, 41, 69, 76, 63, 77, 35, 115, 59, 81, 37, 30, 50, 70, 28, 85, 125, 11};
    }

    private static byte[] sssqyxudywjwupu() {
        return new byte[]{-76, -123, 3, 99, 121, 85, 90, 94, 10, 32, 103, 118, 53, 51, 76, 36, 109, 109, 12, 34, 100, 90, 73, 122};
    }

    private static byte[] mnfretiofiswyih() {
        return new byte[]{-76, Byte.MIN_VALUE, 12, 50, 125, 91, 90, 64, 13, 59, 98, 115, 50, 48, 78, 110, 105, 113, 12, 53, 107, 95, 77, 56, 40, 29, 41, 126, 122, 113, 35, 5, 89, 103, 93, 52, 69, 3};
    }

    private static byte[] zbnirndgopxegvx() {
        return new byte[]{-80, -127, 11, 40, 121, 83, 94, 65, 7, 43, 97, 115, 53, 39, 73, 37, 110, 112, 1, 116, 108, 66, 77, 56, 45, 2, 47, 117, 112, 125, 36, 28, 90, 126, 91, 44, 68, 79, 62, 68, 39, 112, 58, 84, 37, 27, 49, 75, 21, 88, 124, 8};
    }

    private static byte[] ywtvdrezskmfcqv() {
        return new byte[]{-80, -127, 11, 96, 121, 85, 94, 93, 7, 45, 97, 124, 53, 52, 73, 36, 110, 108, 1, 45, 108, 88, 77, 120};
    }

    private static byte[] uiqariaiwrewncp() {
        return new byte[]{-80, -124, 15, 42, 126, 91, 95, 70, 9, 38, 97, 118, 49, 37, 78, 45, 111, 119, 15, 121, 108, 71, 73, 58, 42, 10, 46, 114, 126, 112, 36, 25, 94, 124, 92, 36, 69, 72, 48, 87, 39, 101, 62, 70, 34, 3, 48, 72, 27, 65, 124, 27};
    }

    private static byte[] ebydmajjgkcmqgy() {
        return new byte[]{-80, -124, 15, 98, 126, 73, 95, 84, 9, 39, 97, 103, 49, 103};
    }

    private static byte[] jbhsmfxvahxfujo() {
        return new byte[]{-77, Byte.MIN_VALUE, 11, 51, 117, 92, 93, 74, 15, 60, 98, 116, 51, 56, 73, 105, 99, 115, 11, 53, 108, 94, 69, 63, 47, 23, 43, 121, 122, 118, 34, 13, 94, 108, 87, 60};
    }

    private static byte[] wygioytlofferpo() {
        return new byte[]{-77, -126, 14, 49, 120, 84, 88, 82, 11, 54, 98, 97, 48, 47, 72, 53, 104, 123, 13, 124, 111, 81, 72, 40, 44, 27, 41, 125, 124, 114, 39, 25, 95, 99, 90, 49};
    }

    private static byte[] dsjqocxgerokteb() {
        return new byte[]{-80, -118, 8, 41, 120, 90, 95, 69, 13, 34, 104, 114, 55, 33, 69, 32, 106, 118, 8, 116, 111, 66, 72, 51, 45, 2, 41, 112, 112, 119, 38, 27, 82, 121, 94, 46, 65, 67, 52, 65, 34, 126, 62, 75, 34, 10, 61, 73, 30, 95, 116, 7, 8, 76, 29, 28, 15, 39, 10, 45, 13, 3, 47, 119, 102, 32, 82, 78, 58, 96, 52, 60, 70, 93};
    }

    private static byte[] akmpmxfjlpmqhkn() {
        return new byte[]{-74, -123, 15, 44, 126, 87, 82, 76, 13, 36, 103, 117, 50, 39, 72, 45, 99, 118, 14, 123, 104, 71, 78, 62, 32, 11, 41, 118, Byte.MAX_VALUE, 112, 35, 29, 95, 116, 87, 46, 71, 76, 51, 68, 36, 115, 51, 66, 34, 12, 50, 78, 27, 89, 121, 10, 1, 76, 27, 19, 8, 34, 12, 32, 0, 10, 47, 113, 105, 39, 87, 72, 55, 109, 61, 60, 64, 82};
    }

    private static byte[] cqysgnxfcojzjvy() {
        return new byte[]{-77, -126, 9, 53, Byte.MAX_VALUE, 81, 83, 68, 15, 55, 98, 117, 55, 48, 79, 102, 99, 116, 9, 62, 111, 89, 79, 59, 43, 22, 34, 124, 120, 126, 39, 4, 88, 34, 93, 51, 73, 0, 54, 70, 36, 117, 56, 65, 35, 12, 60, 69, 29, 91, Byte.MAX_VALUE, 10};
    }

    private static int nnkpnhtbqtkjyqfd(int i, int i2) {
        return i ^ i2;
    }
}
