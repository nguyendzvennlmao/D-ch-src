package com.kammoun.donutCore.fly.manager;

import com.kammoun.donutCore.api.database.SqliteHelper;
import com.kammoun.donutCore.api.module.DonutModule;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.Random;

public class DatabaseManager extends SqliteHelper {

    private static int f597rajKzVPSX = 0;
    private transient int VvdgxI6ylz = 1119039991;
    private static byte[] dtpwkxsepd;
    private static String[] nothing_to_see_here = new String[17];

    public DatabaseManager(DonutModule donutModule, int i) {
        super(donutModule, 267686524);
        qgupsderhemmyyaj(361182789 ^ 1475814736, 2108658072);
        int parseInt = 1029351766 ^ (1986705916 ^ Integer.parseInt("1961857575"));
        this.VvdgxI6ylz = 1119039991 ^ f597rajKzVPSX;
        ?? r0 = 45545095 ^ (627064029 ^ parseInt);
        int i2 = r0;
        try {
            connectDataBase(1631272013);
            i2 = 790848819 ^ i2;
            int i3 = 745967932 ^ i2;
        } catch (SQLException e) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                case -1068874056:
                    int qgupsderhemmyyaj = 1058444380 ^ qgupsderhemmyyaj(i2, 1658194190);
                    donutModule.getLogger(583940502).severe("Failed to connect fly database: " + r0.getMessage());
                    int i4 = 1287346794 ^ qgupsderhemmyyaj;
                    throw new RuntimeException((Throwable) r0);
                default:
                    throw new IllegalAccessException("Error in hash");
            }
        }
    }

    public boolean toggleFly(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.manager.DatabaseManager.toggleFly(java.util.UUID, int):boolean");
    }

    public boolean isFlyDisabled(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.manager.DatabaseManager.isFlyDisabled(java.util.UUID, int):boolean");
    }

    public void setFlyDisabled(java.util.UUID r6, boolean r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.manager.DatabaseManager.setFlyDisabled(java.util.UUID, boolean, int):void");
    }

    public boolean isFlyEnabled(java.util.UUID r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.manager.DatabaseManager.isFlyEnabled(java.util.UUID):boolean");
    }

    @Override
    public void onCreate(java.sql.Connection r6, int r7) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.manager.DatabaseManager.onCreate(java.sql.Connection, int):void");
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
        nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
        nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
        nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
        nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
        nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
        nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
        nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
        nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
        nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
        nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
        nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
        nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
        nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
        nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
        dtpwkxsepd = drcgkwpxiczqoem();
        f597rajKzVPSX = 388486374 ^ new Random(8075307302282895945L).nextInt();
    }

    public static String vlauvlhwac(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ dtpwkxsepd[i3 % dtpwkxsepd.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] drcgkwpxiczqoem() {
        return new byte[]{24, 56, 37, 21, 41, 105, 15, 33, 36, 115, 118, 88, 50, 55, 80, 96, 62, 105, 22, 64, 103, 101, 66, 111, 74, 57, 36, 64, 90, 119, 53, Byte.MAX_VALUE, 104, 114, 71, 25, 117, 116, 108, 72, 1, 118, 55, 114, 99, 45, 13, 99, 101, 13, 104, 57, 94, 117, 25, 92, 35, 116, 67, 48, 111, 10, 13, 24, 20, 55, 31, 53, Byte.MAX_VALUE, 86, 24, 26, 126, 29, 118, 14, 114, 99, 49, 89, 65, 42, 44, 119, 33, 45, 21, 122, 103, 88, 120, 18, 95, 32, 43, 15, 47, 95, 111, 26, 118, 35, 17, 28, 44, 125, 62, 58, 87, 40, 122, 4, 102, 123, 79, 68, 74, 66, 38, 71, 35, 97};
    }

    private static byte[] otmzuvbbxqwvquh() {
        return new byte[]{-41, -2, 23, 101, 31, 21, 60, 71, 22, 7, 71, 51, 0, 90, 102, 114, 13, 19, 36, 35, 86, 124, 112, 4, 124, 78, 23, 37, 104, 10, 4, 7, 90, 8, 113, 110, 70, 97, 94, 48, 48, 1, 5, 31, 85, 80, 62, 118, 87, 122, 89, 108, 108, 53, 47, 49, 16, 50, 113, 100, 94, 71, 63, 85, 34, 108, 44, 110, 77, 0, 41, 80, 76, 4, 64, 20, 65, 35, 3, 29, 112, 122, 30, 42, 23, 51, 38, 111, 85, 13, 73, 66, 109, 106, 29, 92, 28, 8, 93, 71, 71, Byte.MAX_VALUE, 35, 65, 26, 102, 13, 47, 101, 79, 75, 124, 84, 14, 121, 35, 121, 50, 20, 37, 18, 120, 42, 41, 19, 24, 26, 112, 61, 48, 21, 117, 68, 72, 4, 62};
    }

    private static byte[] tcdhikzxtjnzwuz() {
        return new byte[]{-33, -2, 20, 64, 28, 56, 56, 99, 22, 43, 79, 11, 3, 110, 104, 50, 15, 63};
    }

    private static byte[] thtrwdrhtonfdnj() {
        return new byte[]{-47, -12, 16, 126, 27, 31, 59, 93, 21, 1, 69, 46, 10, 81, 99, 116, 14, 60, 33, 26, 82, 46, 112, 61, 126, 107, 21, 27, 105, 39, 13, 41, 91, 102, 119, 110, 66, 21, 89, 63, 51, 8, 3, 98, 82, 92, 62, 58, 93, 70, 91, 82, 110, 55, 46, 10, 22, 56, 113, 119, 91, 83, 60, 65, 39, 101, 39, 116, 76, 66, 40, 124, 73, 102, 67, 115, 64, 2, 5, 44, 112, 61, 31, 55, 25, 106, 38, 39, 87, 13, 79, 1, 106, 37, 25, 28, 27, 80, 94, 22};
    }

    private static byte[] xfjkflzigpxhlxb() {
        return new byte[]{-46, -14, 21, 99, 25, 30, 61, 94, 23, 2, 67, 60, 0, 66, 98, 114, 13, 28, 34, 39, 87, 24, 114, 16, 120, 42, 23, 50, 111, 43, 7, 54, 90, 31, 116, 89, 65, 36, 92, 14, 49, 48, 5, 40, 80, 119, 56, 52, 87, 78, 90, 43, 109, 17, 45, 33, 19, 3, 115, 80, 93, 124, 62, 12, 33, 114, 45, 112, 77, 13, 43, 77, 74, 8, 70, 1, 66, 113, 3, 85, 114, 37};
    }

    private static byte[] odxwpthjgptgwgc() {
        return new byte[]{-46, -10, 16, 113, 24, 26, 61, 91, 16, 7, 67, 44, 3, 85, 98, 118, 10, 60, 35, 30, 86, 32, 112, 56, 126, 106, 17, 27, 107, 36, 7, 45, 92, 99, 114, 104, 68, 16, 94, 49, 53, 10, 2, 101, 82, 93, 63, 57, 81, 69, 93, 81, 111, 48, 43, 15, 23, 49, 118, 115, 94, 85, 63, 64, 32, 97, 42, 113, 78, 64, 42, 123, 74, 100, 67, 124, 67, 7, 3, 42, 117, 59, 25, 53, 16, 110, 39, 37, 83, 13, 77, 5, 110, 43, 25, 25, 27, 81, 90, 22};
    }

    private static byte[] cybreddbregffmw() {
        return new byte[]{-34, -13, 23, 65, 28, 57, 59, 101, 21, 42, 66, 8, 2, 110, 105, 49, 9, 60};
    }

    private static byte[] kyngjqcbawjxnyq() {
        return new byte[]{-44, -9, 20, 108, 17, 20, 54, 68, 17, 5, 68, 58, 3, 83, 104, 115, 7, 16, 35, 33, 85, 117, 115, 13, 114, 79, 29, 38, 111, 8, 7, 14, 89, 1, Byte.MAX_VALUE, 111, 76, 98, 89, 50, 51, 8, 6, 22, 91, 81, 52, 117, 80, 120, 90, 101, 111, 60, 33, 48, 26, 49, 118, 102, 93, 78, 60, 92, 44, 109, 38, 109, 74, 2, 42, 89, 79, 13, 78, 21, 75, 32, 4, 31, 115, 115, 29, 35, 25, 50, 44, 108, 82, 15, 74, 75, 110, 99, 19, 93, 22, 11, 90, 69, 68, 118, 32, 72, 20, 103, 7, 44, 98, 77, 72, 117, 87, 7, 119, 34, 115, 49, 19, 39, 17, 113, 41, 32, 29, 25, 16, 115, 58, 50, 22, 124, 71, 65, 10, 63};
    }

    private static byte[] nhumwryirxspxjv() {
        return new byte[]{-41, -10, 18, 104, 24, 21, 60, 93, 19, 15, 71, 61, 5, 75, 97, 121, 13, 31, 33, 43, 86, 27, 117, 27, 123, 32, 23, 54, 109, 34, 4, 55, 95, 20, 118, 83, 70, 33, 91, 5, 48, 51, 0, 34, 82, 122, 62, 52, 82, 71, 89, 40, 105, 27, 40, 45, 16, 1, 116, 91, 94, 126, 58, 1, 37, 123, 44, 112, 72, 6, 41, 79, 73, 4, 71, 10, 65, 115, 6, 95, 112, 32};
    }

    private static byte[] stbztmkeaynjqlv() {
        return new byte[]{-44, -10, 23, 103, 26, 9, 61, 80, 17, 3, 68, 61, 0, 67, 99, 114, 12, 9, 35, 48, 85, 22, 112, 18, 121, 78, 22, 84, 111, 15, 7, 8, 90, 99, 116, 101, 71, 15, 89, 45, 51, 103, 5, 6, 80, 71, 63, 30, 80, 111, 90, 92, 108, 23, 42, 78, 17, 6, 118, 109, 93, 66, 63, 118, 39, 118, 45, 100, 74, 19, 42, 95, 76, 69, 69, 82, 64, 48, 4, 27, 115, 59, 30, 110, 18, 106, 39, 59, 82, 0, 74, 71, 109, 49, 24, 107, 29, 42, 90, 121, 68, 81, 35, 101, 31, 14, 12, 92, 98, 49, 72, 6, 84, 124, 124, 95, 120, 86, 19, 38, 17, 2, 42, 64, 22, 106, 27, 28, 58, 66, 22, 27, 68, 73, 1, 78, 98, 17, 11, 1, 36, 93, 85, 48, 113, 52, 120, 126, 17, 16, 104, 36, 7, 34, 91, 37, 117, 73, 64, 101, 94, 59, 51, 8, 4, 15, 81, 85, 56, 23, 87, 125, 90, 70, 109, 103, 43, 38, 22, 10, 113, 85, 93, 27, 62, 100, 38, 86, 42, 72, 77, 43, 42, 11, 77, 107, 68, Byte.MAX_VALUE, 71, 20, 3, 41, 115, 78, 31, 9, 19, 77, 32, 107, 85, 89, 74, 10, 108, 41};
    }

    private static int qgupsderhemmyyaj(int i, int i2) {
        return i2 ^ i;
    }
}
