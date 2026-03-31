package com.kammoun.donutCore.api.runables;

import com.kammoun.donutCore.DonutCore;
import com.kammoun.utils.lib.folialib.FoliaLib;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.paper.threadedregions.scheduler.AsyncScheduler;
import io.papermc.paper.threadedregions.scheduler.EntityScheduler;
import io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

public final class SchedulerUtil {
    private static int Rio8S2wZID = 0;
    private transient int KKhftU5hbJ = 1299405223;
    private static byte[] grymufawbm;
    private static String[] nothing_to_see_here = new String[13];

    public static class Task {
        private final Object internalTask;
        private static int MdtiiCCW27 = 0;

        private transient int f21ckRA2chmM = 1553519435;
        private static String siukgqsfhu;
        private static String[] nothing_to_see_here = new String[17];

        Task(java.lang.Object r5, int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.Task.<init>(java.lang.Object, int):void");
        }

        public void cancel(int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.Task.cancel(int):void");
        }

        public Object getInternalTask() {
            int i = 574348712 ^ (1327079674 ^ 1436903412);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1002908367) {
                int i2 = 1345666381 ^ i;
                return this.internalTask;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1167146843 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (651170634 ^ i)) {
                    int i3 = 939469290 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1002908367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (681752329 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 122935388 ^ i;
            throw new IllegalAccessException();
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
            siukgqsfhu = ByteBuffer.wrap(yvqbwzhtckhicqe()).asCharBuffer().toString();
            MdtiiCCW27 = (-401993573) ^ new Random(-3638950173862824212L).nextInt();
        }

        public static String yddgomieia(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = siukgqsfhu.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] yvqbwzhtckhicqe() {
            return new byte[0];
        }

        private static int ggjsgwuamjfzqubo(int i, int i2) {
            return i2 ^ i;
        }
    }

    public SchedulerUtil() {
        ozsgzpxufkopqicy(463183654 ^ 1644414849, 1389790605);
        int parseInt = 84565289 ^ (1495548343 ^ Integer.parseInt("2002829748"));
        this.KKhftU5hbJ = 1299405223 ^ Rio8S2wZID;
        ozsgzpxufkopqicy(parseInt, 2038544147);
    }

    private static FoliaLib getFoliaImpl(int i) {
        int i2 = 2038926443 ^ (520460976 ^ (536388952 ^ 1767808501));
        return DonutCore.getInstance(2058184626).getFoliaLib(1574428320);
    }

    public static boolean isFolia(int i) {
        int i2 = 15237017 ^ (1156315756 ^ (911076019 ^ 1767808501));
        return getFoliaImpl(1603120384).isFolia();
    }

    public static void run(java.lang.Runnable r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.run(java.lang.Runnable, int):void");
    }

    public static com.kammoun.donutCore.api.runables.SchedulerUtil.Task runAsync(java.lang.Runnable r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.runAsync(java.lang.Runnable, int):com.kammoun.donutCore.api.runables.SchedulerUtil$Task");
    }

    public static Task runAsyncLater(Runnable runnable, long j) {
        int i = 2062148746 ^ (1868507546 ^ 1767808501);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -415070421) {
            i = 1811553845 ^ i;
            if (isFolia(860867585) == (387075792 ^ i)) {
                int ozsgzpxufkopqicy = ozsgzpxufkopqicy(i, 1424721445);
                BukkitScheduler scheduler = Bukkit.getScheduler();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozsgzpxufkopqicy) == 533612458) {
                    ozsgzpxufkopqicy = 1759685418 ^ ozsgzpxufkopqicy;
                    Task task = new Task(scheduler.runTaskLaterAsynchronously(DonutCore.getInstance(2058184626), runnable, j), 1932356249);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozsgzpxufkopqicy) == 1490755321) {
                        int i2 = 693991072 ^ ozsgzpxufkopqicy;
                        return task;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozsgzpxufkopqicy) == 533612458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozsgzpxufkopqicy) == (1294255202 ^ ozsgzpxufkopqicy)) {
                        int i3 = 862537745 ^ ozsgzpxufkopqicy;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozsgzpxufkopqicy) == 1490755321 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ozsgzpxufkopqicy) == (328600739 ^ ozsgzpxufkopqicy)) {
                            break;
                        }
                    }
                }
                int i4 = 1569290146 ^ ozsgzpxufkopqicy;
                throw new IllegalAccessException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1198360960) {
                int i5 = 665449856 ^ i;
                AsyncScheduler asyncScheduler = Bukkit.getAsyncScheduler();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2049058175) {
                    i5 = 1626635990 ^ i5;
                    Task task2 = new Task(asyncScheduler.runDelayed(DonutCore.getInstance(2058184626), scheduledTask -> {
                        int i6 = 1372930631 ^ (1632514838 ^ 1767808501);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -835754718) {
                            int i7 = 1350291902 ^ i6;
                            runnable.run();
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -835754718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2021000701 ^ i6)) {
                                int i8 = 410223361 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1307699408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (304729714 ^ i6)) {
                                    break;
                                }
                            }
                        }
                        int i9 = 1760402711 ^ i6;
                        throw new IllegalAccessException();
                    }, j * 50, TimeUnit.MILLISECONDS), 1932356249);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2105660366) {
                        int i6 = 273438854 ^ i5;
                        return task2;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2049058175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1266446551 ^ i5)) {
                        int i7 = 943806936 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2105660366 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (615775625 ^ i5)) {
                            break;
                        }
                    }
                }
                int i8 = 1991609456 ^ i5;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1198360960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (104586100 ^ i)) {
                int i9 = 418714743 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -415070421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (352141542 ^ i)) {
                    int i10 = 1070794470 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1894402 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (308552503 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i11 = 2023628471 ^ i;
        throw new IllegalAccessException();
    }

    public static Task runLater(Runnable runnable, long j, int i) {
        int i2 = 49612013 ^ (1192335812 ^ 1767808501);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1708132065) {
            i2 = 516443282 ^ i2;
            if (isFolia(860867585) == (846351438 ^ i2)) {
                int i3 = 977792592 ^ i2;
                BukkitScheduler scheduler = Bukkit.getScheduler();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1101861104) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1101861104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1073673441 ^ i3)) {
                            break;
                        }
                    }
                    int i4 = 1412345582 ^ i3;
                    throw new IllegalAccessException("double");
                }
                i2 = 1799673071 ^ i3;
                Task task = new Task(scheduler.runTaskLater(DonutCore.getInstance(2058184626), runnable, j), 1932356249);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 462141323) {
                    int i5 = 1162140207 ^ i2;
                    return task;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1819123087) {
                int i6 = 593028090 ^ i2;
                GlobalRegionScheduler globalRegionScheduler = Bukkit.getGlobalRegionScheduler();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1990885984) {
                    i6 = 984244286 ^ i6;
                    Task task2 = new Task(globalRegionScheduler.runDelayed(DonutCore.getInstance(2058184626), scheduledTask -> {
                        int i7 = 268014335 ^ (1819858496 ^ 1767808501);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1459538512) {
                            int i8 = 1516459249 ^ i7;
                            runnable.run();
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1459538512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (733477049 ^ i7)) {
                                int i9 = 698524843 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2048627238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1771030498 ^ i7)) {
                                    break;
                                }
                            }
                        }
                        int i10 = 1867920966 ^ i7;
                        throw new IOException();
                    }, j), 1932356249);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1543928913) {
                        int i7 = 1396105090 ^ i6;
                        return task2;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1543928913 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (891380553 ^ i6)) {
                        int i8 = 1111639054 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -978288573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (613158031 ^ i6)) {
                            int i9 = 1327260867 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1990885984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1746962136 ^ i6)) {
                                break;
                            }
                        }
                    }
                }
                int i10 = 1882075105 ^ i6;
                throw new IOException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1708132065 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1622680891 ^ i2)) {
                int i11 = 1736722176 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1819123087 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1961614112 ^ i2)) {
                    int i12 = 1971223900 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 462141323 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (815709379 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i13 = 50735923 ^ i2;
        throw new RuntimeException("double");
    }

    public static com.kammoun.donutCore.api.runables.SchedulerUtil.Task runTimer(java.lang.Runnable r8, long r9, long r11, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.runTimer(java.lang.Runnable, long, long, int):com.kammoun.donutCore.api.runables.SchedulerUtil$Task");
    }

    public static Task runTimer(Player player, Runnable runnable, long j, long j2, int i) {
        int i2;
        long j3;
        int i3;
        int i4 = 1996259638 ^ (240431669 ^ 1767808501);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1883932752) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1883932752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (316341873 ^ i4)) {
                    break;
                }
            }
            int i5 = 1310326452 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 1429386476 ^ i4;
        if (isFolia(860867585) != (1153702426 ^ i6)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 639684818) {
                int i7 = 745502013 ^ i6;
                EntityScheduler scheduler = player.getScheduler();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1163622715) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1163622715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (114931183 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 890479288 ^ i7;
                    throw new IOException("double");
                }
                i6 = 9699024 ^ i7;
                DonutCore donutCore = DonutCore.getInstance(2058184626);
                Consumer consumer = scheduledTask -> {
                    int i9 = 1016823712 ^ (1685992035 ^ 1767808501);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1914797647) {
                        int i10 = 1956458968 ^ i9;
                        runnable.run();
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1914797647 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (247702466 ^ i9)) {
                            int i11 = 1282960976 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 691474290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (690240240 ^ i9)) {
                                break;
                            }
                        }
                    }
                    int i12 = 1737126377 ^ i9;
                    throw new IOException();
                };
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1103400891) {
                    int i9 = 853465891 ^ i6;
                    if ((j > 1L ? 1 : (j == 1L ? 0 : -1)) < (1525041876 ^ i9)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -684566878) {
                            int i10 = 385070889 ^ i9;
                            j3 = 1;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 1622142954) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1622142954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1319249886 ^ i10)) {
                                        break;
                                    }
                                }
                                int i11 = 715667281 ^ i10;
                                throw new RuntimeException("double");
                            }
                            int i12 = 468898846 ^ i10;
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) != 172996288) {
                                    throw null;
                                }
                                throw new IllegalAccessException();
                            } catch (IllegalAccessException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -1086763238:
                                        i6 = 1317241955 ^ i12;
                                        break;
                                    case -199832926:
                                        i6 = 1206285524 ^ i12;
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -886739968) {
                                    i3 = 62803544 ^ i6;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2051658907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1124733206 ^ i9)) {
                                int i13 = 448249919 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -684566878 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (535153978 ^ i9)) {
                                    int i14 = 1023012948 ^ i9;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    } else {
                        i2 = ozsgzpxufkopqicy(i9, 1736873616);
                        j3 = j;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -351870431) {
                            i3 = 666517404 ^ i2;
                        }
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -690544960) {
                        i9 = 1972623691 ^ i3;
                        Task task = new Task(scheduler.runAtFixedRate(donutCore, consumer, (Runnable) null, j3, j2), 1932356249);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2051658907) {
                            int i15 = 945835921 ^ i9;
                            return task;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2051658907) {
                                int i132 = 448249919 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -684566878) {
                                    int i142 = 1023012948 ^ i9;
                                    throw new RuntimeException("double");
                                }
                                continue;
                            }
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -690544960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1579824483 ^ i3)) {
                                int i16 = 1940347010 ^ i3;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -199832926 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (636102270 ^ i6)) {
                    int i17 = 372101790 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -886739968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (958735154 ^ i6)) {
                        int i18 = 927604784 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1128992874 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1779873183 ^ i6)) {
                            int i19 = 119022513 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -536384142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (674680016 ^ i6)) {
                                int i20 = 2138567576 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1086763238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (433038028 ^ i6)) {
                                    int i21 = 2001950228 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1103400891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1534468543 ^ i6)) {
                                        int i22 = 223253930 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 639684818 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (889997271 ^ i6)) {
                                            int i23 = 1347879905 ^ i6;
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            i2 = 822525103 ^ i6;
            BukkitScheduler scheduler2 = Bukkit.getScheduler();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1374341717) {
                i6 = 700599067 ^ i2;
                Task task2 = new Task(scheduler2.runTaskTimer(DonutCore.getInstance(2058184626), runnable, j, j2), 1932356249);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -536384142) {
                    int i24 = 342462371 ^ i6;
                    return task2;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -199832926) {
                        int i172 = 372101790 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -886739968) {
                            continue;
                        } else {
                            int i182 = 927604784 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1128992874) {
                                continue;
                            } else {
                                int i192 = 119022513 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -536384142) {
                                    continue;
                                } else {
                                    int i202 = 2138567576 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1086763238) {
                                        continue;
                                    } else {
                                        int i212 = 2001950228 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1103400891) {
                                            continue;
                                        } else {
                                            int i222 = 223253930 ^ i6;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 639684818) {
                                                int i232 = 1347879905 ^ i6;
                                                throw new IllegalAccessException();
                                            }
                                            continue;
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
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1186224110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1511069896 ^ i2)) {
                int i25 = 1272423074 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -351870431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (517934751 ^ i2)) {
                    int i26 = 426478608 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1374341717 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (948210076 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i27 = 1809401097 ^ i2;
        throw new IllegalAccessException("double");
    }

    public static void runAtLocation(org.bukkit.Location r5, java.lang.Runnable r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.runAtLocation(org.bukkit.Location, java.lang.Runnable, int):void");
    }

    public static void runAtEntity(org.bukkit.entity.Entity r5, java.lang.Runnable r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.runAtEntity(org.bukkit.entity.Entity, java.lang.Runnable, int):void");
    }

    public static void cancel(java.lang.Object r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.runables.SchedulerUtil.cancel(java.lang.Object, int):void");
    }

    public static boolean isFoliaServer() {
        int i = 1562774896 ^ (1707487886 ^ (1899561609 ^ 1767808501));
        return isFolia(860867585);
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀    ";
        nothing_to_see_here[2] = "⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀⡏⠀⠀⠀⠀⠀⢷     ";
        nothing_to_see_here[3] = "⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[4] = "⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀OK⠀ ⡇    ";
        nothing_to_see_here[5] = "⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[6] = "⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼     ";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀     ";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[9] = "⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[10] = "⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[11] = "⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[12] = "⣿⣿⣧⣀⣿.........⣀⣰⣏⣘⣆⣀⠀⠀       ";
        grymufawbm = fyqqywirpbbjwgd();
        Rio8S2wZID = (-922729281) ^ new Random(2239694277433904687L).nextInt();
    }

    public static String ylmwfaames(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ grymufawbm[i3 % grymufawbm.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] fyqqywirpbbjwgd() {
        return new byte[]{51, 13, 102, 104, 86, 33, 104, 11, 91, 30, 40, 117, 68, 84, 13, 115, 13, 92, 111, 53, 82, 40, 57, 94, 1, 92, 76, 24, 57, 110, 126, 102, 101, 118, 97, 76, 60, 48, 34, 83, 101, 15, 75, 2, 13, 15, 36, 32, 88, 121, 17, 68, 83, 64, 124, 104, 65, 60, 29, 118, 72, 68, 5, 87, 88, 30, 65, 65, 64, 116, 48, 6, 86, 39, 97, 99, 123, 31, 95, 83, 62, 43, 88, 50, 126, 13, 37, 111, 2, 87, 64, 87, 15, 26, 55, 20, 119, 33, 72, 87, 60, 19};
    }

    private static int ozsgzpxufkopqicy(int i, int i2) {
        return i2 ^ i;
    }
}
