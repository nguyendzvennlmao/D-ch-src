package com.kammoun.donutCore.api.database;

import com.kammoun.donutCore.api.module.DonutModule;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

public abstract class SqliteHelper {
    protected final DonutModule donutModule;
    private Connection connection;
    private final String dbName = "database.db";
    private static int V0Ya8rv5PQ = 0;
    private transient int T5bDu4bEmp = 661315955;
    private static String[] nothing_to_see_here = new String[13];

    public SqliteHelper(DonutModule donutModule, int i) {
        int i2 = 1124242430 ^ (1804777792 ^ 632619089);
        int parseInt = 262144308 ^ (402836432 ^ Integer.parseInt("445112331"));
        this.T5bDu4bEmp = 661315955 ^ V0Ya8rv5PQ;
        int yfczybiwoscgicqh = 1518690594 ^ yfczybiwoscgicqh(parseInt, 1008189954);
        this.dbName = "database.db";
        this.donutModule = donutModule;
        int i3 = 1739073871 ^ (165389844 ^ yfczybiwoscgicqh);
    }

    public abstract void onCreate(Connection connection, int i) throws SQLException;

    public synchronized void connectDataBase(int r6) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.database.SqliteHelper.connectDataBase(int):void");
    }

    public synchronized java.sql.Connection getConnection(int r5) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.database.SqliteHelper.getConnection(int):java.sql.Connection");
    }

    public synchronized void closeConnection(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.database.SqliteHelper.closeConnection(int):void");
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀    ";
        nothing_to_see_here[2] = "⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀⡏⠀⠀⠀⠀⠀⢷     ";
        nothing_to_see_here[3] = "⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[4] = "⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀OK⠀ ⡇    ";
        nothing_to_see_here[5] = "⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[6] = "⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼     ";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀     ";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[9] = "⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[10] = "⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[11] = "⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[12] = "⣿⣿⣧⣀⣿.........⣀⣰⣏⣘⣆⣀⠀⠀       ";
        V0Ya8rv5PQ = (-233519329) ^ new Random(2887543116281372847L).nextInt();
    }

    public static String rvqmjwtkck(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] xojnnazsycnhroo() {
        return new byte[]{104, 32, 40, 18, 60, 18, 84, 40, 77, 26, 11, 51, 73, 70, 108, 109, 47, 66, 35, 34, 103, 86, 108, 2, 30, 99, 41, 103, 71, 63, 111, 91, 11, 125, 61, 116, 14, 17, 64, 91, 86, 18, 16, 31, 97, 75, 100, 100};
    }

    private static byte[] hbbrzhukbobjcma() {
        return new byte[]{-81, -22, 31, 71, 14, 76, 108, 113, 123, 80, 62, 97};
    }

    private static byte[] lgoqaitzsiaylva() {
        return new byte[]{-89, -21, 16, 67, 14, 66, 100, 109, 120, 72, 58, 101, 113, 18, 94, 47, 31, 22, 22, 63, 86, 6, 84, 85};
    }

    private static byte[] dnhoivamkkjwote() {
        return new byte[]{-95, -17, 17, 119, 12, 122, 100, 93, 120, 68, 59, 126, Byte.MAX_VALUE, 19, 85, 125, 22, 61, 20, 86, 94, 34, 92, 120, 46, 122, 28, 52, 119, 116, 89, 2, 50, 59, 4, 36, 57, 83, 121, 77, 102, 69, 32, 73, 84, 8, 84, 125, 94, 118, 17, 77, 5, 82, 99, 118, 116, 72, 59, 36};
    }

    private static byte[] ehvfzyqouwpuzhz() {
        return new byte[]{-89, -22, 28, 76, 12, 85, 103, 120, 116, 13, 58, 117, 125, 6, 92, 52, 28, 28, 26, 111, 86, 6, 88, 29, 46, 28, 26, 20, 126, 68, 94, 45};
    }

    private static int yfczybiwoscgicqh(int i, int i2) {
        return i ^ i2;
    }
}
