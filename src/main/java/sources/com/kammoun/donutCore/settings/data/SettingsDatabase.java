package com.kammoun.donutCore.settings.data;

import com.kammoun.donutCore.api.database.SqliteHelper;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class SettingsDatabase extends SqliteHelper {

    private static int f891zFE9c7TOa = 0;
    private transient int vcIjtFjcpu = 706326128;
    private static String[] nothing_to_see_here = new String[15];

    public SettingsDatabase(com.kammoun.donutCore.api.module.DonutModule r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.data.SettingsDatabase.<init>(com.kammoun.donutCore.api.module.DonutModule, int):void");
    }

    @Override
    public void onCreate(java.sql.Connection r6, int r7) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.data.SettingsDatabase.onCreate(java.sql.Connection, int):void");
    }

    public void saveSettings(com.kammoun.donutCore.settings.models.PlayerSettings r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.data.SettingsDatabase.saveSettings(com.kammoun.donutCore.settings.models.PlayerSettings, int):void");
    }

    public com.kammoun.donutCore.settings.models.PlayerSettings loadSettings(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.data.SettingsDatabase.loadSettings(java.util.UUID, int):com.kammoun.donutCore.settings.models.PlayerSettings");
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        f891zFE9c7TOa = (-1634436105) ^ new Random(-6922769559742651461L).nextInt();
    }

    public static String vbyunwkaag(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] nriojmddzzinrto() {
        return new byte[]{25, 116, 46, 46, 63, 32, 68, 63, 70, 120, 29, 3, 88, 120, 122, 58, 126, 34, 102, 30, 95, 95, 94, 19, 107, 43, 71, 86, 6, 19, 28, 7, 55, 116, 83, 118, 71, 85, 28, 42, 75, 122, 89, 49, 116, 39, 72, 23, 97, 78, 57, 105, 40, 111, 83, 37, 94, 63, 35, 42, 53, 8, 77, 85, 79, 20, 126, 94, 28, 36, 111, 113, 2, 59, 25, 95, 65, 93, 5, 62, 3, 120, Byte.MAX_VALUE, 93, 79, 6, 118, 76, 13, 109, 43, 32, 9, 119, 30};
    }

    private static byte[] npjpigxzfdjzdbp() {
        return new byte[]{-34, -68, 27, 44};
    }

    private static byte[] tnegpwspvmoqbal() {
        return new byte[]{-46, -72, 27, 111, 14, 98, 112, 96, 115, 47, 40, 23, 105, 27, 78, 73, 75, 73, 83, 126, 110, 72, 106, 117, 94, 74, 114, 43, 55, 105, 40, 112, 2, 21, 102, 27, 118, 66, 40, 87, 126, 12, 108, 92, 69, 48, 124, 111, 84, 50, 12, 9, 25, 120, 103, 93, 107, 89, 22, 82, 4, 115};
    }

    private static byte[] ivzjuhvyppftnhe() {
        return new byte[]{-42, -78, 29, 43};
    }

    private static byte[] rqsoewodisdqxly() {
        return new byte[]{-45, -65, 24, 55, 8, 56};
    }

    private static byte[] yirohvimvoieqli() {
        return new byte[]{-45, -65, 24, 59, 8, 81, 114, 72, 114, 24, 43, 115, 111, 7, 76, 70, 74, 68, 80, 11, 104, 35, 104, 111, 95, 89, 113, 34, 49, 126, 42, 114, 3, 20, 101, 99};
    }

    private static byte[] qizouqgpwudoxav() {
        return new byte[]{-42, -67, 29, 95, 6, 93, 125, 93, 114, 12, 44, 103, 107, 20, 67, 41, 71, 90, 82, 97, 110, 61, 109, 100, 82, 56, 126, 55, 50, 110, 45, 112, 4, 21, 106, 0, 126, 54, 40, 68, 122, 31, 106, 76, 77, 64, 113, 114, 85, 54, 8, 17, 27, 16, 106, 69, 103, 46, 23, 51, 4, 75, 126, 24, 118, 78, 71, 11, 40, 60, 94, 103, 49, 85, 32, 45, 120, 32, 49, 90, 50, 11, 76, 54, 118, 21, 79, 85, 57, 99, 26, 63, 58, 111, 39, 101, 77, 81, 26, 46, 17, 49, 12, 49, 65, 96, 58, 47, 76, 7, 11, 1, 17, 29, 39, 56, 102, 71, 39, 47, 26, 4, 101, 87, 42, 75, 62, 47, 64, 66, 71, 53, 102, 107, 19, 88, 67, 38, 5, 10, 22, 42, 36, 17, 119, 67, 80, 87, 91, 37};
    }

    private static byte[] zfwpqrpvnunwnsh() {
        return new byte[]{-42, -70, 22, 55, 8, 54};
    }

    private static byte[] yrxtnqmunzjgzzy() {
        return new byte[]{-42, -72, 22, 38};
    }

    private static byte[] hhvgeluezoabams() {
        return new byte[]{-42, -70, 23, 54, 6, 50, 124, 54};
    }

    private static byte[] oziqkypyiqiahml() {
        return new byte[]{-42, -68, 23, 62, 14, 43, 119, 47, 112, 115};
    }

    private static byte[] tupwawkwzuuidye() {
        return new byte[]{-43, -65, 29, 98, 10, 98, 116, 103, 114, 46};
    }

    private static byte[] ovavpcbjezlkplo() {
        return new byte[]{-44, -68, 24, 59, 10, 52};
    }

    private static byte[] gkzxeqzkrkppvvo() {
        return new byte[]{-42, -68, 27, 72, 13, 84, 113, 67, 116, 12, 42, 117, 109, 30, 75, 47, 78, 58, 87, 9, 106, 44, 108, 112, 94, 84, 117, 42, 49, 6, 41, 101, 6, 13, 99, 5, 118, 59, 41, 90, 121, 25, 108, 94, 70, 69, Byte.MAX_VALUE, 103, 84, 40, 8, 8, 24, 20, 98, 92, 107, 77, 17, 72, 0, 24, Byte.MAX_VALUE, 51, 120, 105, 75, 41, 45, 67, 95, 6, 51, 44, 44, 31, 115, 25, 48, 103, 49, 45, 72, 72, 122, 9, 71, 89, 61, 96};
    }

    private static int pelarriborkvlprg(int i, int i2) {
        return i2 ^ i;
    }
}
