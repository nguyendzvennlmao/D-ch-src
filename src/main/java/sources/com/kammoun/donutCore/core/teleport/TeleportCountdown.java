package com.kammoun.donutCore.core.teleport;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.core.CorePlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TeleportCountdown implements Listener {
    private final CorePlugin plugin;
    private final Map<UUID, SchedulerUtil.Task> tasks;
    private static int kxVWIa8wPy = 0;
    private transient int IjlTnZsXAp = 2134612305;
    private static String lriffgpukg;
    private static String[] nothing_to_see_here = new String[19];

    public TeleportCountdown(CorePlugin corePlugin, int i) {
        argklpquzauwhxux(1089646782 ^ 1705651633, 1003237956);
        int parseInt = 384654019 ^ (1619878416 ^ Integer.parseInt("1760860056"));
        this.IjlTnZsXAp = 2134612305 ^ kxVWIa8wPy;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 188747061:
                    parseInt = 882358749 ^ parseInt;
                    break;
                case 1089193897:
                    break;
                case 1325993716:
                case 1803999952:
                default:
                    throw new IllegalAccessException();
            }
        }
        this.tasks = new ConcurrentHashMap();
        this.plugin = corePlugin;
        Bukkit.getPluginManager().registerEvents(this, corePlugin.getApi(2142241109));
        int i2 = 2103145645 ^ (1923474755 ^ (1497990708 ^ (778013905 ^ parseInt)));
    }

    public void teleportWithCountdown(org.bukkit.entity.Player r8, org.bukkit.Location r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.teleport.TeleportCountdown.teleportWithCountdown(org.bukkit.entity.Player, org.bukkit.Location, int):void");
    }

    private void cancelExistingTask(Player player, int i) {
        int i2 = 1242230023 ^ (1778515830 ^ 1963077210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1471553190) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1471553190 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1797436795 ^ i2)) {
                    break;
                }
            }
            int i3 = 873692080 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1132677365 ^ i2;
        SchedulerUtil.Task remove = this.tasks.remove(player.getUniqueId());
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1269586192) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1269586192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1109717396 ^ i4)) {
                    break;
                }
            }
            int i5 = 343996682 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 100723716 ^ i4;
        if (remove == null) {
            argklpquzauwhxux(i6, 1612915480);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -2074818864) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2058494445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (779096368 ^ i6)) {
                    int i7 = 25118184 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -2074818864 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (625237881 ^ i6)) {
                        break;
                    }
                }
            }
            int i8 = 2118725258 ^ i6;
            throw new IllegalAccessException();
        }
        int i9 = 1000811410 ^ i6;
        remove.cancel(1520188267);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1500355137) {
            int i10 = 1535379594 ^ i9;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1500355137 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1098180400 ^ i9)) {
                break;
            }
        }
        int i11 = 420356492 ^ i9;
        throw new IllegalAccessException("double");
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent playerMoveEvent) {
        int i = 589607137 ^ (1457926689 ^ 1963077210);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 101016784) {
            int i2 = 327258307 ^ i;
            Player player = playerMoveEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1710628152) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1710628152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (183618934 ^ i2)) {
                        break;
                    }
                }
                int i3 = 533839913 ^ i2;
                throw new IllegalAccessException("double");
            }
            int i4 = 44919666 ^ i2;
            UUID uniqueId = player.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1889355432) {
                i4 = 2045122247 ^ i4;
                if (this.tasks.containsKey(uniqueId) == (1745502700 ^ i4)) {
                    argklpquzauwhxux(i4, 1053743888);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1079119715) {
                    i = 1370415698 ^ i4;
                    if (hasPlayerMoved(playerMoveEvent.getFrom(), playerMoveEvent.getTo(), 227786666) == (967091134 ^ i)) {
                        argklpquzauwhxux(i, 1868577090);
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -853205519) {
                        int i5 = 743234198 ^ i;
                        cancelExistingTask(player, 10855859);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1354512064) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1354512064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (265676775 ^ i5)) {
                                    break;
                                }
                            }
                            int i6 = 1981221404 ^ i5;
                            throw new RuntimeException("double");
                        }
                        i = 474335236 ^ i5;
                        this.plugin.getMessageSender(1613368349).sendMessage(player, pknbdkwaam(cgxysvsfuuugcvo(), i), new String[(byte) (162378028 ^ i)], 1707865585);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1299024224) {
                            int i7 = 1600728016 ^ i;
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1889355432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2072658839 ^ i4)) {
                    int i8 = 1743939726 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1079119715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1105139146 ^ i4)) {
                        break;
                    }
                }
            }
            int i9 = 2104630258 ^ i4;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1299024224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (268380124 ^ i)) {
                int i10 = 1033752291 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1239099422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (471855218 ^ i)) {
                    int i11 = 938548497 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -853205519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (826032839 ^ i)) {
                        int i12 = 390176713 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 101016784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (4572145 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 1445935260 ^ i;
        throw new RuntimeException();
    }

    private boolean hasPlayerMoved(org.bukkit.Location r6, org.bukkit.Location r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.teleport.TeleportCountdown.hasPlayerMoved(org.bukkit.Location, org.bukkit.Location, int):boolean");
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
        lriffgpukg = ByteBuffer.wrap(zrhbhafzikiajmz()).asCharBuffer().toString();
        kxVWIa8wPy = 2044724269 ^ new Random(-4648382510689529972L).nextInt();
    }

    public static String pknbdkwaam(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = lriffgpukg.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] synrlsifzfukcti() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 0};
    }

    private static byte[] uozsximoalmfbhd() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 18};
    }

    private static byte[] mimbdrzmeqfueaw() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 29};
    }

    private static byte[] deumwvqhpzpfolo() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, 47};
    }

    private static byte[] xqtqdmbqhpucoym() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 64};
    }

    private static byte[] fzixreunthkfezi() {
        return new byte[]{0, 0, 0, 17, 0, 0, 0, 82};
    }

    private static byte[] qjyenfsjfboigjd() {
        return new byte[]{0, 0, 0, 27, 0, 0, 0, 99};
    }

    private static byte[] cgxysvsfuuugcvo() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 126};
    }

    private static byte[] zrhbhafzikiajmz() {
        return new byte[]{56, 67, 51, 92, 48, 91, 55, 87, 52, 72, 55, 92, 57, 66, 55, 67, 50, 25, 56, 84, 51, 86, 48, 66, 55, 92, 52, 76, 55, 87, 57, 95, 55, 64, 50, 90, 56, 18, 51, 90, 48, 88, 55, 71, 52, 86, 55, 71, 57, 84, 55, 88, 50, 67, 56, 89, 51, 28, 51, 66, 51, 83, 56, 88, 54, 83, 48, 67, 54, 92, 54, 74, 52, 66, 54, 29, 51, 85, 51, 87, 56, 90, 54, 85, 48, 86, 54, 95, 54, 84, 52, 83, 54, 84, 50, 68, 49, 85, 54, 95, 57, 81, 48, 64, 50, 95, 49, 66, 54, 71, 57, 25, 48, 83, 50, 95, 49, 93, 54, 67, 57, 88, 48, 85, 50, 68, 49, 85, 49, 70, 50, 93, 52, 91, 56, 92, 48, 69, 49, 93, 50, 74, 52, 67, 56, 20, 48, 86, 49, 83, 50, 86, 52, 84, 56, 92, 48, 89, 49, 94, 50, 93, 52, 83, 50, 68, 50, 82, 51, 92, 53, 84, 57, 66, 50, 95, 50, 69, 51, 68, 53, 28, 57, 81, 50, 95, 50, 90, 51, 64, 53, 93, 57, 87, 50, 68, 50, 82, 49, 70, 55, 82, 56, 89, 57, 92, 57, 65, 49, 93, 55, 69, 56, 65, 57, 23, 57, 69, 49, 87, 55, 91, 56, 80, 57, 73, 57, 94, 49, 64, 55, 67, 56, 24, 57, 90, 57, 94, 49, 71, 55, 89, 56, 65, 57, 93, 57, 94, 49, 69, 55, 89, 49, 66, 50, 86, 55, 84, 48, 87, 56, 65, 54, 93, 51, 69, 56, 68, 50, 21, 49, 85, 50, 82, 55, 86, 48, 81, 56, 84, 54, 94, 51, 91, 56, 85, 50, 92};
    }

    private static int argklpquzauwhxux(int i, int i2) {
        return i ^ i2;
    }
}
