package com.kammoun.donutCore.spawn.listener;

import com.kammoun.donutCore.spawn.SpawnPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.event.Listener;

public class SpawnListener implements Listener {
    private final SpawnPlugin plugin;
    private static int A1iQJPdF2v = 0;
    private transient int RQTMzUxLm4 = 888857573;
    private static byte[] clcslzambi;
    private static String[] nothing_to_see_here = new String[15];

    public SpawnListener(SpawnPlugin spawnPlugin, int i) {
        zsrkappfssmmotmg(1335712355 ^ 1592828672, 856199112);
        int parseInt = 1476097927 ^ (113485556 ^ Integer.parseInt("1935517656"));
        this.RQTMzUxLm4 = 888857573 ^ A1iQJPdF2v;
        this.plugin = spawnPlugin;
        int i2 = 731049556 ^ (840024112 ^ (1920910910 ^ parseInt));
    }

    @org.bukkit.event.EventHandler
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnListener.onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent):void");
    }

    @org.bukkit.event.EventHandler
    public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnListener.onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
    public void onPlayerRespawn(org.bukkit.event.player.PlayerRespawnEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnListener.onPlayerRespawn(org.bukkit.event.player.PlayerRespawnEvent):void");
    }

    private void handleRandomRespawn(org.bukkit.event.player.PlayerRespawnEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnListener.handleRandomRespawn(org.bukkit.event.player.PlayerRespawnEvent, int):void");
    }

    private void teleportPlayerToSpawn(org.bukkit.event.player.PlayerJoinEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.listener.SpawnListener.teleportPlayerToSpawn(org.bukkit.event.player.PlayerJoinEvent, int):void");
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
        clcslzambi = tptpxuojnzpcano();
        A1iQJPdF2v = 1393901277 ^ new Random(7917283733859302825L).nextInt();
    }

    public static String kindiqakce(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ clcslzambi[i3 % clcslzambi.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] tptpxuojnzpcano() {
        return new byte[]{31, 83, 74, 79, 76, 81, 81, 122, 88, 117, 44, 63, 76, 10, 122, 54, 63, 26, 33, 71, 56, 109, 71, 19, 58, 124, 31, 49, 44, 43, 79, 121, 114, 19, 79, 28, 60, 16, 121, 112, 12, 119, 121, 36, 100, 28, 120, 89, 34, 119, 27, 21, 46, 46, 106, 22, 25, 68, 121, 74, 34, 89, 45, 64, 96, 82, 77, 46, 72, 62, 114, 72, 84, 93, 47, 57, 3, 20, 64, 34, 117, 65, 48, 36, 116, 48, 24, 32, 7, 70, 70, 7, 109, 80, 79, 109, 126, 121, 3, 27, 93, 7};
    }

    private static byte[] mhsuajfulpgejwa() {
        return new byte[]{-48, -104, Byte.MAX_VALUE, 37, 117, 44, 101, 11, 96, 15, 29, 94, 121, 124, 67, 34, 11, 124, 25, 58, 9, 10, 114, 114, 3, 4, 43, 82, 20, 93, 126, 16, 71, 2, 118, 118, 8, 69, 65, 46, 61, 38, 76, 53, 93, 73, 76, 2, 26, 44, 42, 64, 27, 107, 83, 70, 45, 31, 65, 28, 19, 77, 24, 31, 89, 4, 121, 110, 112, 38, 67, 26, 97, 3, 22, 117, 55, 78, 120, 126, 68, 89, 5, 53, 77, 125, 44, 113, 63, 18, 119, 86, 88, 17, 118, 59, 74, 63, 59, 87, 108, 90, 42, 12, 115, 17, 120, 69, 105, 54, 105, 46, 25, 46, 117, 85, 78, 99, 7, 78, 16, 31, 13, 62, 126, 75, 14, 43, 39, 98, 29, 63, 122, 59, 75, 90, 123, 73, 4, 95, 72, 42};
    }

    private static byte[] zangznvpiifljqp() {
        return new byte[]{-46, -103, 124, 95, 126, 25, 98, 33, 106, 39, 25, 112, 121, 93, 66, 119, 8, 13};
    }

    private static byte[] nkukbnqkdwhnymi() {
        return new byte[]{-48, -99, 124, 90, 120, 17, 104, 47, 107, 37, 29, 119, 122, 95, 78, 116, 6, 6};
    }

    private static byte[] dbzhjlsjqncyswo() {
        return new byte[]{-48, -97, 124, 82, 122, 23, 97, 33, 105, 44, 29, 117, 122, 87, 76, 114, 15, 8};
    }

    private static byte[] jolauizrmfuttfq() {
        return new byte[]{-45, -101, 122, 51, 121, 61, 104, 1, 105, 11};
    }

    private static byte[] yqncudcujnycqvf() {
        return new byte[]{-48, -104, 121, 34, 116, 44, 101, 14, 97, 3, 29, 94, Byte.MAX_VALUE, 123, 66, 34, 11, 121, 24, 54, 9, 10, 116, 117, 2, 4, 43, 87, 21, 81, 126, 16, 65, 5, 119, 119, 8, 78, 64, 49, 61, 55, 74, 123, 92, 75, 76, 15, 27, 99, 42, 85, 29, 119, 82, 15, 45, 29, 64, 31, 19, 3, 30, 18, 88, 7, 121, 122, 113, 88, 67, 29, 103, 5, 23, 100, 55, 74, 121, 123, 68, 39, 3, 119, 76, 122, 44, 97, 62, 19, 119, 68, 94, 8};
    }

    private static byte[] pcixcwcncuhkvzu() {
        return new byte[]{-39, -101, 125, 7, 125, 23, 100, 40, 108, 62, 27, 109, 116, 85, 78, 119};
    }

    private static byte[] jywkuqsjzkklnrr() {
        return new byte[]{-48, -98, 121, 35, 117, 33, 101, 11, 107, 6, 29, 88, Byte.MAX_VALUE, 122, 67, 47, 11, 124, 18, 51, 9, 12, 116, 116, 3, 9, 43, 82, 31, 84, 126, 22, 65, 4, 118, 90, 8, 69, 74, 47, 61, 33, 74, 124, 93, 69, 76, 63, 17, 35, 42, 84, 29, 105, 83, 67, 45, 7, 74, 21, 19, 46, 30, 25, 89, 7, 121, 120, 123, 99, 67, 31, 103, 14, 22, 48, 55, 84, 115, 97, 68, 6, 3, 118, 77, 36, 44, 118, 52, 2, 119, 65, 94, 71, 118, 43, 74, 44, 48, 68, 108, 81, 44, 11, 115, 22, 120, 55, 98, 46, 105, 52, 31, 120, 117, 95, 78, 117, 12, 69, 16, 38, 11, 63, 126, 85, 14, 62, 44, 105, 29, 122, 124, 43, 75, 7, 123, 65, 15, 82, 72, 98, 63, 14, 64, 69, 80, 100, 75, 36, 19, 100, 40, 2, 23, 89, 94, 74, 42, 16, 72, 27, 17, 5, 20, 84, 84, 17, 126, 112, 121, 126, 65, 19, 109, 13, 27, 45, 48, 75, 113, 113, 70, 27, 9, 117, 64, 36, 43, 120, 54, 26, 117, 16, 84, 7, 123, 54, 77, 38, 50, 79, 110, 89, 38, 0, 126, 85};
    }

    private static byte[] ehvsaeizmbmpfkj() {
        return new byte[]{-48, -103, 115, 44, 122, 45, 100, 10, 110, 6, 25, 83, 116, 123, 66, 46, 10, 126, 16, 55, 1, 6, 113, 123, 15, 8, 41, 87, 25, 92, 119, 18, 74, 6, 122, 100, 13, 74, 64, 104, 58, 57, 76, 112, 82, 65, 77, 9, 26, 37, 35, 0, 27, 107, 91, 83, 32, 29, 79, 5, 23, 2, 27, 81, 85, 7, 117, 119, 112, 104, 71, 31, 101, 28, 22, 104, 53, 67, 117, 121, 67, 81};
    }

    private static byte[] dzlxnnnjgviptdi() {
        return new byte[]{-45, -100, 126, 37, 117, 36, 96, 14, 110, 15, 30, 90, 120, 124, 67, 42, 14, 121, 23, 58, 10, 14, 115, 114, 3, 12, 46, 87, 26, 93, 125, 20, 70, 2, 118, 89, 13, 68, 79, 36, 62, 34, 77, 101, 93, 66, 73, 26, 20, 59, 41, 106, 26, 113, 83, 117, 40, 16, 79, 1, 16, 25, 25, 16, 89, 20, 124, 113, 126, 59, 64, 30, 96, 13, 22, 100, 50, 86, 118, Byte.MAX_VALUE, 71, 93, 4, 53, 77, 114, 41, 122, 49, 23, 116, 71, 89, 17, 118, 53, 79, 38, 53, 68};
    }

    private static byte[] vljlkcniwzpgrkn() {
        return new byte[]{-41, -103, 115, 38, 117, 39, 96, 11, 109, 1, 25, 83, 126, 116, 72, 42, 11, 125, 23, 55, 1, 12, 126, 113, 11, 9, 42, 80, 25, 92, 125, 29, 64, 2, 123, 122, 10, 64, 64, 54, 53, 101, 72, 100, 81, 79, 77, 13, 16, 62, 41, 75, 26, 105, 92, 66, 32, 4, 64, 1, 19, 77, 24, 4, 85, 14, Byte.MAX_VALUE, 100, 122, Byte.MAX_VALUE, 70, 28, 98, 31, 22, 101, 58, 6, 113, 98, 64, 24, 5, 61, 70, 111, 42, 112, 51, 31, 112, 94, 84, 0, 118, 62, 79, 46, 54, 70, 104, 30, 45, 25, 120, 17, 120, 68, 103, 63, 97, 43, 21, 108, 125, 71, 79, 101, 10, 81, 19, 94, 10, 56, 115, 73, 12, 44, 38, 112, 21, 119, 126, 106, 71, 81, 122, 5, 14, 90, 75, 49, 56, 35, 79, 102, 93, 64, 65, 75, 19, 34, 46, 87, 27, 55, 88, 31, 43, 89, 77, 79};
    }

    private static byte[] sbilgxdyyfnxgdm() {
        return new byte[]{-40, -107, 122, 39, Byte.MAX_VALUE, 45, 99, 12, 96, 14, 21, 90, Byte.MAX_VALUE, 126, 66, 41, 12, 112, 24, 59, 8, 13, 116, 123, 8, 14, 39, 95, 21, 85, 124, 23, 74, 1, 124, 106, 5, 70, 73, 99, 63, 41, 75, 118, 92, 73, 65, 5, 17, 38, 35, 70, 29, 117, 83, 68, 41, 87, 74, 23, 16, 3, 21, 13, 89, 10, 126, 120, 112, 126, 65, 80, 109, 73, 31, 42, 48, 92, 114, 125, 77, 25, 9, 109, 71, 102, 32, 96, 52, 94, Byte.MAX_VALUE, 73, 93, 10, 124, 57, 76, 38, 59, 2, 100, 68, 44, 16, 114, 28, Byte.MAX_VALUE, 30, 104, 45, 104, 102, 31, 102, 126, 77, 66, 47, 6, 93, 18, 27, 0, 45, 116, 71, 3, 33, 47, 34, 31, 119, 125, 47, 74, 76, 118, 77, 15, 86, 65, 46, 63, 59};
    }

    private static byte[] ebogomkxumpgkcz() {
        return new byte[]{-45, -97, 126, 32, Byte.MAX_VALUE, 36, 99, 6, 106, 5, 31, 94, 120, 126, 75, 41, 6, 122, 19, 49, 12, 10, 116, 114, 8, 4, 45, 84, 31, 81, 123, 23, 67, 1, 118, 96, 14, 76, 77, 100, 63, 36, 75, 120, 86, 74, 75, 66, 22, 37, 42, 73, 23, Byte.MAX_VALUE, 88, 77, 45, 31, 74, 9, 16, 64, 31, 95, 83, 70, 121, 110, 121, 105, 75, 27, 102, 28, 27, 110, 48, 77, 114, 114, 71, 29, 3, 119, 64, 35, 41, 116, 62, 27, 116, 70, 89, 68, 124, 46, 76, 33, 49, 71, 110, 87, 43, 15, 123, 16, 117, 67, 99, 37, 108, 46, 31, 109, 126, 82, 72, 112, 12, 71, 21, 27, 9, 49, 126, 15, 8, 97, 43, 43};
    }

    private static byte[] dyxzmoophoomffq() {
        return new byte[]{-48, -98, 114, 45, 120, 33, 102, 8, 110, 6, 30, 82, 117, 121, 78, 44, 8, 126, 16, 48, 0, 7, 115, 119, 13, 10, 41, 87, 30, 93, 118, 16, 70, 4, 120, 122, 13, 78, 65, 40, 56, 58, 78, 118, 82, 95, 74, 65, 27, 43, 47, 67, 25, 107, 91, 4, 33, 31, 77, 27, 21, 10, 27, 94, 82, 11, 116, 116, 124, 106, 69, 22, 101, 0, 23, 114, 55, 12, 119, 53, 67, 3, 2, 119, 77, 109, 44, 103, 48, 0, 119, 92, 85, 7, 123, 62, 73, 110, 53, 88, 111, 94, 38, 9, 126, 28, 123, 8, 96, 37, 96, 108, 24, 121, 123, 88, 76, 116, 13, 82, 24, 18, 12, 45, 112, 75};
    }

    private static int zsrkappfssmmotmg(int i, int i2) {
        return i ^ i2;
    }
}
