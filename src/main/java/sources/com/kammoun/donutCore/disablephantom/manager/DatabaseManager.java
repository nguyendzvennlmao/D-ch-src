package com.kammoun.donutCore.disablephantom.manager;

import com.kammoun.donutCore.api.database.SqliteHelper;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class DatabaseManager extends SqliteHelper {
    private static int sAaQrbsVek = 0;
    private transient int rJmmxswTMY = 1675968250;
    private static String[] nothing_to_see_here = new String[15];

    public DatabaseManager(com.kammoun.donutCore.api.module.DonutModule r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.disablephantom.manager.DatabaseManager.<init>(com.kammoun.donutCore.api.module.DonutModule, int):void");
    }

    public boolean togglePhantom(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.disablephantom.manager.DatabaseManager.togglePhantom(java.util.UUID, int):boolean");
    }

    public boolean isPhantomDisabled(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.disablephantom.manager.DatabaseManager.isPhantomDisabled(java.util.UUID, int):boolean");
    }

    @Override
    public void onCreate(java.sql.Connection r6, int r7) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.disablephantom.manager.DatabaseManager.onCreate(java.sql.Connection, int):void");
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
        sAaQrbsVek = (-294315933) ^ new Random(5840550312477288693L).nextInt();
    }

    public static String gysxsfnqhu(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] djapacgxevclvir() {
        return new byte[]{26, 75, 71, 33, 5, 17, 98, 18, 116, 33, 59, 15, 52, 31, 113, 50, 75, 44, 119, Byte.MAX_VALUE, 25, 36, 2, 83, 123, 19, 31, 50, 32, 81, 108, 11, 36, 22, 75, 88, 41, 71, 76, 117, 85, 89, 121, 114, 99, 29, 108, 87, 52, 80, 101, 99, 100, 121, 66, 69, 78, 107, 37, 93, 51, 55, 68, 120, 84, 96, 120, 103, 82, 22, 91, 1, 56, 111, 115, 41, 28, 107, 46, 12, 15, 87, 105, 47, 58, 42, 114, 75, 112, 73, 69, 77, 49, 73, 40, 51, 98, 119, 55, 64, 102, 64, 80, 53, 99, 44, 30, 90, 125, 126, 72, 71, 76, 8, 117, 79};
    }

    private static byte[] douqdrqykyfzggu() {
        return new byte[]{-43, Byte.MIN_VALUE, 114, 83, 55, 96, 91, 105, 69, 83, 10, 111, 1, 108, 67, 38, 114, 93, 70, 26, 40, 95, 55, 40, 73, 7, 38, 117, 17, 14, 93, 94, 17, 78, 121, 24, 16, 31, 125, 47, 100, 50, 76, 55, 81, 76, 85, 20, 5, 19, 84, 62, 81, 33, 112, 22, 119, 47, 20, 74, 2, 84, 113, 6, 102, 17, 65, 2, 99, 100, 106, 21, 13, 44, 65, 104, 37, 53, 31, 95, 62, 67, 92, 36, 8, 62, 75, 67, 65, 69};
    }

    private static byte[] ubrzlrpukbxpwfg() {
        return new byte[]{-43, -115, 112, 88, 50, 103, 84, 113, 76, 92, 10, 100, 3, 123, 70, 42, 125, 85, 79, 9, 40, 73, 53, 44, 76, 11, 41, 114, 24, 1, 93, 83, 19, 72, 124, 20, 31, 24, 116, 32, 100, 63, 78, 49, 84, 64, 90, 19, 12, 28, 84, 51, 83, 39, 117, 26, 120, 40, 29, 69, 2, 38, 115, 61, 99, 45, 78, 62, 106, 74, 106, 20, 15, Byte.MAX_VALUE, 68, 117, 42, 50, 22, 71, 62, 15, 94, 125, 13, 126, 68, 30, 72, 21, 116, 93, 6, 89, 31, 93, 84, 6, 15, 52, 87, 44, 103, 64, 84, 71, 40, 74, 69, 110, 121, 65, 123, 20, 66, 87, 44, 68, Byte.MAX_VALUE, 48, 52, 19};
    }

    private static byte[] trvhphjqhbnoztn() {
        return new byte[]{-47, -124, 116, 75, 61, 108, 83, 111, 65, 81, 11, Byte.MAX_VALUE, 13, 115, 73, 35, 122, 125, 66, 38, 42, 110, 58, 10, 74, 64, 42, 107, 16, 7, 85, 87, 28, 7, 122, 43, 28, 37, Byte.MAX_VALUE, 3, 109, 44, 72, 99, 86, 88, 92, 12, 13, 9, 93, 60, 85, 56, 119, 26, 125, 63, 29, 58, 2, 117, 113, 40, 100, 39, 65, 43, 106, 78, 106, 90, 13, 56, 64, 99, 36, 115, 31, 106, 58, 42, 89, 89, 3, 64, 74, 63, 65, 92, 112, 8, 2, 5, 16, 98, 83, 34, 2, 85, 86, 78, 105, 45, 91, 34, 47, 84};
    }

    private static byte[] nhzrkutovgoovdj() {
        return new byte[]{-43, -123, 119, 113, 61, 65, 80, 84, 69, 114, 10, 92, 4, 71, 73, 110, 121, 125};
    }

    private static byte[] faogwmkabmitqrv() {
        return new byte[]{-46, -122, 126, 125, 53, 77, 82, 85, 69, 118, 9, 84, 12, 67, 68, 103, Byte.MAX_VALUE, 121};
    }

    private static byte[] yfkgqzoqjomcsge() {
        return new byte[]{-36, -127, 116, 68, 60, 108, 86, 107, 67, 92, 14, Byte.MAX_VALUE, 2, 114, 73, 38, 126, Byte.MAX_VALUE, 79, 35, 42, 97, 59, 10, 79, 68, 40, 102, 21, 7, 90, 86, 28, 2, 126, 41, 17, 32, Byte.MAX_VALUE, 12, 108, 44, 77, 103, 84, 85, 89, 12, 2, 8, 93, 57, 81, 58, 122, 31, 125, 48, 28, 58, 7, 113, 115, 37, 97, 39, 78, 42, 106, 75, 110, 88, 0, 61, 64, 108, 37, 115, 26, 110, 56, 39, 92, 89, 12, 65, 74, 58, 69, 94, 125, 13, 2, 10, 17, 98, 86, 38, 0, 88, 83, 78, 102, 44, 91, 39, 43, 86};
    }

    private static byte[] gmadvakfvsnnpwj() {
        return new byte[]{-35, -126, 116, 82, 52, 116, 81, 98, 67, 89, 13, 104, 4, 107, 70, 33, 126, 79, 78, 8, 42, 86, 51, 40, 72, 99, 40, 43, 22, 43, 92, 124, 19, 5, 126, 33, 16, 62, Byte.MAX_VALUE, 17, 100, 78, 74, 2, 84, 124, 90, 45, 4, 50, 82, 4, 81, 29, 123, 83, 125, 43, 20, 2, 0, 99, 115, 47, 98, 39, 72, 57, 101, 72, 110, 105, 1, 42, 64, 124, 45, 40, 29, 77, 56, 7, 95, 114, 10, 124, 69, 11, 69, 94, 124, 83, 2, 12, 25, 113, 81, 43, 0, 29, 80, 83, 96, 82, 84, 94, 43, 63, 68, 11, 123, 63, 125, 126, 70, 40, 45, 90, 113, 33, 53, 22, 85, 8, 65, 54, 2, 105, 7, 125, 64, 76, 120, 84, 64, 7, 47, 69, 50, 59, 76, 0, 42, 78, 25, 34, 95, 98, 21, 13, 120, 9, 30, 23, 122, 53, 101, 9, 78, 35, 86, 70, 85, 4, 7, 4, 84, 116, 87, 14, 117, 51, 120, 23, 21, 32, 4, 65, 113, 14, 109, 24, 75, 126, 99, 26};
    }

    private static int izuapkvekbjledcp(int i, int i2) {
        return i2 ^ i;
    }
}
