package com.kammoun.donutCore.rtp.listener;

import com.kammoun.donutCore.rtp.service.WarmupService;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class WarmupListener implements Listener {
    private final WarmupService warmupService;
    private static int dEeKQmEGIq = 0;
    private transient int zx85xcP1FJ = 1012720172;
    private static String[] nothing_to_see_here = new String[18];

    public WarmupListener(WarmupService warmupService, int i) {
        int i2 = 548273179 ^ (1353502441 ^ 806612448);
        int parseInt = 1379696453 ^ (1123204386 ^ Integer.parseInt("1356602741"));
        this.zx85xcP1FJ = 1012720172 ^ dEeKQmEGIq;
        int wcxupbzvwyhwoply = 1190845055 ^ wcxupbzvwyhwoply(parseInt, 1291088447);
        this.warmupService = warmupService;
        int i3 = 766536135 ^ wcxupbzvwyhwoply;
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
    public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.listener.WarmupListener.onPlayerMove(org.bukkit.event.player.PlayerMoveEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
    public void onPlayerDamage(org.bukkit.event.entity.EntityDamageEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.rtp.listener.WarmupListener.onPlayerDamage(org.bukkit.event.entity.EntityDamageEvent):void");
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerTeleport(PlayerTeleportEvent playerTeleportEvent) {
        int i = 1083205201 ^ (131520858 ^ 1129765080);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 545472152) {
            i = 850112330 ^ i;
            if (this.warmupService.shouldCancelOnTeleport(1356689407) != (918276249 ^ i)) {
                int i2 = 2125063632 ^ i;
                Player player = playerTeleportEvent.getPlayer();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1083271754) {
                    i = 1784815110 ^ i2;
                    if (this.warmupService.hasWarmup(player.getUniqueId(), 1221369944) == (577778511 ^ i)) {
                        int i3 = 1012287653 ^ i;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 327260793) {
                        i2 = 1656504265 ^ i;
                        if (playerTeleportEvent.getCause() == PlayerTeleportEvent.TeleportCause.PLUGIN) {
                            wcxupbzvwyhwoply(i2, 1592424300);
                            return;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 106980402) {
                            i2 = 696345318 ^ i2;
                            this.warmupService.cancelWarmup(player, ipmmcfkvof(nvjzlgstxgdaaqf(), udeggzpanvojzrl(), i2), 1932742771);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1248555779) {
                                int i4 = 2003506570 ^ i2;
                                return;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1248555779 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (914483049 ^ i2)) {
                        int i5 = 110852921 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1083271754 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (688266402 ^ i2)) {
                            int i6 = 1614180775 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 106980402 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (580290956 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
                int i7 = 1637221924 ^ i2;
                throw new IllegalAccessException("double");
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1243724599) {
                int i8 = 1516568084 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1243724599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (711741352 ^ i)) {
                int i9 = 170226482 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 545472152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (92910723 ^ i)) {
                    int i10 = 524800519 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1727640683 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1030347253 ^ i)) {
                        int i11 = 843163945 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 327260793 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (151608140 ^ i)) {
                            int i12 = 439655609 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -248258736 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2136418608 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i13 = 696607154 ^ i;
        throw new RuntimeException();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 1979375490 ^ (384762773 ^ 1129765080);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 35137145) {
            i = 1613013547 ^ i;
            Player player = playerQuitEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 54343458) {
                i = 1855178338 ^ i;
                this.warmupService.cancelWarmup(player.getUniqueId(), 1185135967);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2007172145) {
                    int i2 = 1724954780 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 54343458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1012511890 ^ i)) {
                int i3 = 1383413518 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 35137145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1159202081 ^ i)) {
                    int i4 = 1536962534 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2007172145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (897428754 ^ i)) {
                        int i5 = 1654545103 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1093058770 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (580770634 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 1992468764 ^ i;
        throw new IOException();
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
        dEeKQmEGIq = (-898776312) ^ new Random(8375591526700862546L).nextInt();
    }

    public static String ipmmcfkvof(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] udeggzpanvojzrl() {
        return new byte[]{24, 39, 7, 31, 123, 95, 17, 118, 78, Byte.MAX_VALUE, 119, 42, 98, 87, 117, 46, 67, 97, 64, 114, 5, 46, 31, 68, 105, 28, 38, 118, 74, 102, 60, 13, 106, 74, 120, 34, 91, 89, 103, 88, 102, 64, 76, 116, 47};
    }

    private static byte[] oepfggwdrevzlkr() {
        return new byte[]{-41, -18, 52, 75, 66, 1, 37, 53, 126, 47, 70, 120};
    }

    private static byte[] pyarvipdssotzan() {
        return new byte[]{-47, -17, 63, 75, 76, 10, 36, 34, 125, 41, 64, 117, 82, 5, 65, Byte.MAX_VALUE};
    }

    private static byte[] nvjzlgstxgdaaqf() {
        return new byte[]{-41, -17, 49, 93, 77, 2, 35, 40, 126, 34, 70, 109, 84, 14, 67, 100, 113, 39, 112, 47, 52, 125};
    }

    private static int wcxupbzvwyhwoply(int i, int i2) {
        return i2 ^ i;
    }
}
