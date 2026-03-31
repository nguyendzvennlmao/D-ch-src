package io.papermc.lib.features.asyncteleport;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.lib.PaperLib;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;

public class AsyncTeleportPaper implements AsyncTeleport {
    private static int mRBw3mgf3i = 0;
    private transient int bxjGFQgX37 = 155736274;
    private static String[] nothing_to_see_here = new String[19];

    public AsyncTeleportPaper() {
        int i = 1959720791 ^ (1639366060 ^ 498185007);
        int parseInt = 646805975 ^ (897795962 ^ Integer.parseInt("466077561"));
        this.bxjGFQgX37 = 155736274 ^ mRBw3mgf3i;
        int i2 = 1919061965 ^ parseInt;
    }

    @Override
    public CompletableFuture teleportAsync(Entity entity, Location location, PlayerTeleportEvent.TeleportCause teleportCause, int i) {
        int i2 = 2106225890 ^ (1408832310 ^ 303889621);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -478357495) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -478357495 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1252761274 ^ i2)) {
                    int i3 = 700941350 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1490350889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (316314813 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1702917474 ^ i2;
            throw new IllegalAccessException();
        }
        int i5 = 508160002 ^ i2;
        int blockX = location.getBlockX() >> ((byte) (572945159 ^ i5));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 288593945) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 288593945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (495426629 ^ i5)) {
                    break;
                }
            }
            int i6 = 1513665423 ^ i5;
            throw new IllegalAccessException("double");
        }
        int i7 = 1493724294 ^ i5;
        int blockZ = location.getBlockZ() >> ((byte) (2066620289 ^ i7));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -646906837) {
            return PaperLib.getChunkAtAsyncUrgently(location.getWorld(), blockX, blockZ, (byte) (723164772 ^ (1345618400 ^ i7)), 144228831).thenApply(chunk -> {
                int i8 = 2141806044 ^ (1378710562 ^ 458531847);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1232834615) {
                    int i9 = 1264019559 ^ i8;
                    return Boolean.valueOf(entity.teleport(location, teleportCause));
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1232834615 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (530655000 ^ i8)) {
                        int i10 = 1673525560 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -331404045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1167326821 ^ i8)) {
                            break;
                        }
                    }
                }
                int i11 = 1966702902 ^ i8;
                throw new IllegalAccessException();
            });
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -646906837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1099734599 ^ i7)) {
                break;
            }
        }
        int i8 = 1034642770 ^ i7;
        throw new IOException("double");
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
        mRBw3mgf3i = (-2005793057) ^ new Random(-6436334142227515871L).nextInt();
    }

    public static String kgxleozaah(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] gdwvqdkucygsiau() {
        return new byte[]{30, 28, 92, 60, 117, 4, 122, 113, 84, 91, 46, 123, 75, 3, 124, 65, 40, 66, 18};
    }
}
