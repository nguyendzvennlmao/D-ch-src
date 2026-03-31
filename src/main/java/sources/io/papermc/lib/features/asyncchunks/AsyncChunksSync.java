package io.papermc.lib.features.asyncchunks;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import io.papermc.lib.PaperLib;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import org.bukkit.World;

public class AsyncChunksSync implements AsyncChunks {
    private static int YauV9m3Oj8 = 0;

    private transient int f1368ofbQgmGsQ = 1090645006;
    private static String eeayswktmn;
    private static String[] nothing_to_see_here = new String[15];

    public AsyncChunksSync() {
        uhxbfcxldkxbmbzx(616217969 ^ 184943397, 1187760688);
        int parseInt = 1194587239 ^ (1198163575 ^ Integer.parseInt("1764623988"));
        this.f1368ofbQgmGsQ = 1090645006 ^ YauV9m3Oj8;
        uhxbfcxldkxbmbzx(parseInt, 1776521284);
    }

    @Override
    public CompletableFuture getChunkAtAsync(World world, int i, int i2, boolean z, boolean z2, int i3) {
        int i4 = 935593186 ^ (595083185 ^ 249455335);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -753742432) {
            i4 = 918563866 ^ i4;
            if (z == (748844462 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1695788401) {
                    i4 = 2061669991 ^ i4;
                    if (PaperLib.isChunkGenerated(world, i, i2, 1479564906) != (1447093193 ^ i4)) {
                        int i5 = 43271288 ^ i4;
                        return CompletableFuture.completedFuture(world.getChunkAt(i, i2));
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1308156342) {
                        int i6 = 775088864 ^ i4;
                        return CompletableFuture.completedFuture(null);
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                    case 108718243:
                        int i7 = 2021052959 ^ i4;
                        break;
                    case 522993433:
                        break;
                    case 1633908240:
                    case 2105526742:
                    default:
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1499120246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1930314433 ^ i4)) {
                                int i8 = 274126352 ^ i4;
                                throw new IllegalAccessException("double");
                            }
                        }
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1695788401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (976679057 ^ i4)) {
                int i9 = 1806125600 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -753742432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (203309223 ^ i4)) {
                    int i10 = 1539993654 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1308156342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1551483588 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i11 = 1817167522 ^ i4;
        throw new RuntimeException();
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
        eeayswktmn = ByteBuffer.wrap(ootslcmfztjpaoo()).asCharBuffer().toString();
        YauV9m3Oj8 = 1789357095 ^ new Random(-6324374079959660171L).nextInt();
    }

    public static String kjwdnutlav(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = eeayswktmn.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ootslcmfztjpaoo() {
        return new byte[0];
    }

    private static int uhxbfcxldkxbmbzx(int i, int i2) {
        return i ^ i2;
    }
}
