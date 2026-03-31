package com.kammoun.donutCore.home.data;

import com.kammoun.donutCore.api.database.SqliteHelper;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class DataBaseManager extends SqliteHelper {
    private static int tAGvtQd04h = 0;

    private transient int f618UenwZxZcK = 2036084753;
    private static String gfdtfzdkck;
    private static String[] nothing_to_see_here = new String[18];

    public DataBaseManager(com.kammoun.donutCore.api.module.DonutModule r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.data.DataBaseManager.<init>(com.kammoun.donutCore.api.module.DonutModule, int):void");
    }

    @Override
    public void onCreate(java.sql.Connection r6, int r7) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.data.DataBaseManager.onCreate(java.sql.Connection, int):void");
    }

    public com.kammoun.donutCore.home.models.HomePlayer getHomePlayer(java.util.UUID r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.data.DataBaseManager.getHomePlayer(java.util.UUID, int):com.kammoun.donutCore.home.models.HomePlayer");
    }

    public void addHome(java.util.UUID r6, com.kammoun.donutCore.home.models.Home r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.data.DataBaseManager.addHome(java.util.UUID, com.kammoun.donutCore.home.models.Home, int):void");
    }

    public void removeHome(java.util.UUID r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.data.DataBaseManager.removeHome(java.util.UUID, java.lang.String, int):void");
    }

    public int getHomeCount(java.util.UUID r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.data.DataBaseManager.getHomeCount(java.util.UUID):int");
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
        gfdtfzdkck = ByteBuffer.wrap(vkiiqxuveklvkhm()).asCharBuffer().toString();
        tAGvtQd04h = 1104728526 ^ new Random(-3692720708932328854L).nextInt();
    }

    public static String kjojpvhqrh(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = gfdtfzdkck.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] glimlyggudgjzgx() {
        return new byte[]{0, 0, 0, -64, 0, 0, 0, 0};
    }

    private static byte[] xvbbzbrdkrjpeqn() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, -64};
    }

    private static byte[] fqgfasapzitdpob() {
        return new byte[]{0, 0, 0, 96, 0, 0, 0, -56};
    }

    private static byte[] csvuksrfehonuhy() {
        return new byte[]{0, 0, 0, 10, 0, 0, 1, 40};
    }

    private static byte[] wigvkfqumlrfmsd() {
        return new byte[]{0, 0, 0, 9, 0, 0, 1, 50};
    }

    private static byte[] feuldmigptonmdb() {
        return new byte[]{0, 0, 0, 112, 0, 0, 1, 59};
    }

    private static byte[] bzocueksiffxecb() {
        return new byte[]{0, 0, 0, 58, 0, 0, 1, -85};
    }

    private static byte[] tmeslsmuyscppcm() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, -27};
    }

    private static byte[] pjrstiasbjpphsv() {
        return new byte[]{0, 0, 0, 58, 0, 0, 1, -22};
    }

    private static byte[] vkiiqxuveklvkhm() {
        return new byte[]{55, 117, 53, 101, 48, 113, 50, 114, 54, 99, 54, 112, 55, 16, 52, 102, 51, 119, 55, 116, 53, 123, 48, 113, 50, 19, 54, 126, 54, 115, 55, 16, 52, 124, 51, 121, 55, 98, 53, 23, 48, 113, 50, 107, 54, 126, 54, 102, 55, 100, 52, 97, 51, 22, 55, 94, 53, 88, 48, 89, 50, 86, 54, 68, 54, 21, 55, 24, 52, 66, 51, 90, 55, 87, 53, 78, 48, 81, 50, 65, 54, 104, 54, 64, 55, 69, 52, 91, 51, 82, 55, 22, 53, 99, 48, 113, 50, 107, 54, 99, 54, 21, 55, 126, 52, 125, 51, 98, 55, 22, 53, 121, 48, 97, 50, Byte.MAX_VALUE, 54, 123, 54, 25, 55, 88, 52, 93, 51, 91, 55, 83, 53, 104, 48, 90, 50, 82, 54, 90, 54, 80, 55, 16, 52, 102, 51, 115, 55, 110, 53, 99, 48, 20, 50, 125, 54, 120, 54, 97, 55, 16, 52, 124, 51, 99, 55, 122, 53, 123, 48, 24, 50, 95, 54, 88, 54, 86, 55, 81, 52, 70, 51, 95, 55, 89, 53, 89, 48, 20, 50, 103, 54, 114, 54, 109, 55, 100, 52, 18, 51, 120, 55, 121, 53, 99, 48, 20, 50, 125, 54, 98, 54, 121, 55, 124, 52, 30, 51, 85, 55, 68, 53, 82, 48, 85, 50, 71, 54, 82, 54, 81, 55, 111, 52, 83, 51, 66, 55, 22, 53, 99, 48, 125, 50, 126, 54, 114, 54, 102, 55, 100, 52, 115, 51, 123, 55, 102, 53, 23, 48, 112, 50, 118, 54, 113, 54, 116, 55, 101, 52, 126, 51, 98, 55, 22, 53, 116, 48, 97, 50, 97, 54, 101, 54, 112, 55, 126, 52, 102, 51, 105, 55, 98, 53, 126, 48, 121, 50, 118, 54, 100, 54, 97, 55, 113, 52, Byte.MAX_VALUE, 51, 102, 55, 26, 53, 103, 48, 102, 50, 122, 54, 122, 54, 116, 55, 98, 52, 107, 51, 22, 55, 125, 53, 114, 48, 109, 50, 19, 54, 31, 54, 69, 55, 92, 52, 83, 51, 79, 55, 83, 53, 69, 48, 107, 50, 70, 54, 66, 54, 92, 55, 84, 52, 30, 51, 22, 55, 94, 53, 88, 48, 89, 50, 86, 54, 104, 54, 91, 55, 81, 52, 95, 51, 83, 55, 31, 53, 30, 48, 15, 49, 95, 56, 92, 50, 85, 49, 82, 52, 76, 49, 90, 56, 92, 50, 88, 52, 100, 53, 117, 52, 116, 50, 116, 48, 119, 55, 97, 48, 20, 56, 90, 49, 95, 52, 90, 53, 85, 52, 103, 50, 95, 48, 85, 55, 88, 48, 81, 56, 30, 49, 16, 52, 91, 53, 95, 52, 91, 50, 80, 48, 64, 55, 92, 48, 91, 56, 92, 49, 28, 52, 23, 53, 83, 52, 74, 50, 84, 48, 85, 55, 65, 48, 81, 56, 86, 49, 111, 52, 86, 53, 68, 52, 24, 50, 119, 48, 102, 55, 122, 48, 121, 56, 18, 49, 88, 52, 88, 53, 93, 52, 93, 50, 66, 48, 20, 55, 98, 48, 124, 56, 119, 49, 98, 52, 114, 53, 16, 52, 72, 50, 93, 48, 85, 55, 76, 48, 81, 56, 64, 49, 111, 52, 66, 53, 69, 52, 81, 50, 85, 48, 20, 55, 8, 48, 20, 56, 13, 49, 16, 52, 120, 53, 98, 52, 124, 50, 116, 48, 102, 55, 21, 48, 118, 56, 107, 49, 16, 52, 84, 53, 66, 52, 93, 50, 80, 48, 64, 55, 80, 48, 80, 56, 109, 49, 81, 52, 67, 53, 16, 52, 121, 50, 98, 48, 119, 55, 14, 49, 85, 50, 69, 52, 92, 51, 80, 49, 67, 49, 83, 50, 83, 52, 102, 51, 80, 49, 67, 49, 81, 50, 90, 53, 84, 55, 85, 54, 105, 49, 87, 50, 84, 53, 84, 55, 85, 49, 112, 52, 118, 54, 96, 48, 125, 55, 103, 49, 109, 52, 24, 54, 124, 48, 106, 55, 21, 49, 107, 52, 125, 54, 99, 48, 116, 55, 116, 49, 122, 52, 125, 54, 19, 48, 113, 55, 123, 49, 109, 52, 119, 54, 19, 48, 80, 55, 90, 49, 84, 52, 93, 54, 64, 48, 24, 55, 29, 49, 73, 52, 84, 54, 82, 48, 65, 55, 80, 49, 75, 52, 103, 54, 70, 48, 77, 55, 92, 49, 93, 52, 20, 54, 19, 48, 80, 55, 90, 49, 84, 52, 93, 54, 108, 48, 86, 55, 84, 49, 84, 52, 93, 54, 31, 48, 24, 55, 89, 49, 86, 52, 91, 54, 82, 48, 76, 55, 92, 49, 86, 52, 86, 54, 31, 48, 24, 55, 86, 49, 75, 52, 93, 54, 82, 48, 76, 55, 80, 49, 93, 52, 103, 54, 82, 48, 76, 55, 28, 49, 25, 52, 110, 54, 114, 48, 116, 55, 96, 49, 124, 52, 107, 54, 19, 48, 16, 55, 10, 49, 21, 52, 24, 54, 12, 48, 20, 55, 21, 49, 6, 52, 20, 54, 19, 48, 123, 55, 96, 49, 107, 52, 106, 54, 118, 48, 118, 55, 97, 49, 102, 52, 108, 54, 122, 48, 117, 55, 112, 49, 106, 52, 108, 54, 114, 48, 117, 55, 101, 49, 16, 52, 3, 49, 113, 48, 124, 49, 117, 56, 114, 54, 97, 49, 112, 48, 25, 49, Byte.MAX_VALUE, 56, 101, 54, 122, 49, 120, 48, 25, 49, 81, 56, 88, 54, 88, 49, 80, 48, 74, 49, 25, 56, 96, 54, 125, 49, 112, 48, 107, 49, 124, 56, 23, 54, 69, 49, 89, 48, 88, 49, 64, 56, 82, 54, 71, 49, 106, 48, 76, 49, 76, 56, 94, 54, 81, 49, 21, 48, 4, 49, 25, 56, 8, 54, 21, 49, 116, 48, 119, 49, 125, 56, 23, 54, 93, 49, 90, 48, 84, 49, 92, 56, 104, 54, 91, 49, 84, 48, 84, 49, 92, 56, 23, 54, 8, 49, 21, 48, 6, 49, 2, 52, 85, 52, 88, 57, 66, 49, 90, 54, 64, 49, 100, 50, 116, 55, 126, 51, 115, 49, 122, 49, 99, 50, 17, 55, 113, 51, 121, 49, 108, 
        49, 121, 50, 101, 55, 26, 51, 28, 49, 16, 49, 23, 50, 80, 55, 65, 51, 22, 49, 90, 49, 88, 50, 68, 55, 92, 51, 66, 49, 25, 49, 113, 50, 99, 55, 125, 51, 123, 49, 25, 49, 95, 50, 94, 55, 95, 51, 83, 49, 74, 49, 23, 50, 102, 55, 122, 51, 115, 49, 107, 49, 114, 50, 17, 55, 66, 51, 90, 49, 88, 49, 78, 50, 84, 55, 64, 51, 105, 49, 76, 49, 66, 50, 88, 55, 86, 51, 22, 49, 4, 49, 23, 50, 14, 55, 9};
    }

    private static int neyaemujcxvdgqze(int i, int i2) {
        return i2 ^ i;
    }
}
