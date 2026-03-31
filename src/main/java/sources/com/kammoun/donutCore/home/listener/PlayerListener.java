package com.kammoun.donutCore.home.listener;

import com.kammoun.donutCore.home.HomePlugin;
import com.kammoun.donutCore.home.managers.HomeCacheManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
    private final HomeCacheManager cacheManager;
    private static int MMd4ixkX4a = 0;
    private transient int ikIqWkV4DD = 1491291260;
    private static String badftaeecz;
    private static String[] nothing_to_see_here = new String[15];

    public PlayerListener(com.kammoun.donutCore.home.managers.HomeCacheManager r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.listener.PlayerListener.<init>(com.kammoun.donutCore.home.managers.HomeCacheManager, int):void");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 90699312 ^ (1101182342 ^ 1301527424);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1253556656) {
            i = 1288934558 ^ i;
            CompletableFuture loadPlayerAsync = this.cacheManager.loadPlayerAsync(playerJoinEvent.getPlayer().getUniqueId(), 1523171675);
            Consumer consumer = homePlayer -> {
                int i2 = 892500997 ^ (1902411957 ^ 359725052);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993319838) {
                    int i3 = 978824106 ^ i2;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1535969075 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2107599431 ^ i2)) {
                        int i4 = 1064141909 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993319838 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (171473321 ^ i2)) {
                            break;
                        }
                    }
                }
                int i5 = 287238866 ^ i2;
                throw new RuntimeException();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 741041474) {
                i = 1907531695 ^ i;
                loadPlayerAsync.thenAccept(consumer);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1581279175) {
                    int i2 = 2122862699 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1253556656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1778488434 ^ i)) {
                int i3 = 351349922 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 741041474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1570295128 ^ i)) {
                    int i4 = 60687067 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1581279175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (95372601 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1042365239 ^ i;
        throw new RuntimeException();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 600758757 ^ (539906761 ^ 1301527424);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1939440994) {
            int i2 = 78130329 ^ i;
            this.cacheManager.unloadPlayer(playerQuitEvent.getPlayer().getUniqueId(), 728381193);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1457054122) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1457054122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (245880487 ^ i2)) {
                        break;
                    }
                }
                int i3 = 714819555 ^ i2;
                throw new IOException("double");
            }
            i = 541948980 ^ i2;
            HomePlugin.getInstance(1471891934).getHomeManager(377037609).clearPlayerPendingAction(playerQuitEvent.getPlayer().getUniqueId(), 996633683);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1421017099) {
                int i4 = 995593575 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1939440994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (952269718 ^ i)) {
                int i5 = 708591665 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1421017099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1463495353 ^ i)) {
                    break;
                }
            }
        }
        int i6 = 541464198 ^ i;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        badftaeecz = ByteBuffer.wrap(funqhygyzkbhtsz()).asCharBuffer().toString();
        MMd4ixkX4a = 1993598896 ^ new Random(8780748010979906396L).nextInt();
    }

    public static String cjufdpxajn(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = badftaeecz.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] funqhygyzkbhtsz() {
        return new byte[0];
    }
}
