package io.papermc.lib.features.asyncchunks;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import org.bukkit.Chunk;
import org.bukkit.World;

public interface AsyncChunks {
    public static final String udzxawtzjk = ByteBuffer.wrap(bveroloznngdvrx()).asCharBuffer().toString();

    default CompletableFuture<Chunk> getChunkAtAsync(World world, int i, int i2, boolean z) {
        int i3 = 693195368 ^ (244961975 ^ 1135514389);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 590388819) {
            return getChunkAtAsync(world, i, i2, z, (byte) (27842302 ^ (1708049716 ^ i3)), 1004736626);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 590388819 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1485286004 ^ i3)) {
                int i4 = 1032369246 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 222738416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2030138669 ^ i3)) {
                    break;
                }
            }
        }
        int i5 = 1101701184 ^ i3;
        throw new IllegalAccessException();
    }

    CompletableFuture getChunkAtAsync(World world, int i, int i2, boolean z, boolean z2, int i3);

    static String yerrxvbzfc(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = udzxawtzjk.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] bveroloznngdvrx() {
        return new byte[0];
    }
}
