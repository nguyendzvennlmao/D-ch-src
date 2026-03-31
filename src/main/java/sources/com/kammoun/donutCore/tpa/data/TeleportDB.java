package com.kammoun.donutCore.tpa.data;

import com.kammoun.donutCore.api.database.SqliteHelper;
import com.kammoun.donutCore.api.module.DonutModule;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.Random;

public class TeleportDB extends SqliteHelper {
    private static int a7PQpYYIc3 = 0;
    private transient int f8bu4HqBaM = 1856485778;
    private static String[] nothing_to_see_here = new String[13];

    public TeleportDB(DonutModule donutModule, int i) {
        super(donutModule, 267686524);
        xtzlzyrauboumwuf(1061775331 ^ 926700593, 1732217445);
        int parseInt = 1842319980 ^ (2012840401 ^ Integer.parseInt("1971104266"));
        this.f8bu4HqBaM = 1856485778 ^ a7PQpYYIc3;
        int xtzlzyrauboumwuf = 608041712 ^ xtzlzyrauboumwuf(parseInt, 1751705254);
        int i2 = xtzlzyrauboumwuf;
        try {
            connectDataBase(1631272013);
            xtzlzyrauboumwuf = 2103931169 ^ i2;
            i2 = xtzlzyrauboumwuf;
            xtzlzyrauboumwuf(i2, 2120275471);
        } catch (SQLException e) {
            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                case 419245833:
                    ?? r13 = xtzlzyrauboumwuf;
                    int xtzlzyrauboumwuf2 = 1739646595 ^ xtzlzyrauboumwuf(i2, 412171110);
                    throw new RuntimeException((Throwable) r13);
                default:
                    throw new IOException("Error in hash");
            }
        }
    }

    @Override
    public void onCreate(java.sql.Connection r6, int r7) throws java.sql.SQLException {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.data.TeleportDB.onCreate(java.sql.Connection, int):void");
    }

    public com.kammoun.donutCore.tpa.model.TeleportPlayer load(java.util.UUID r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.data.TeleportDB.load(java.util.UUID, int):com.kammoun.donutCore.tpa.model.TeleportPlayer");
    }

    public void savePlayer(com.kammoun.donutCore.tpa.model.TeleportPlayer r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.data.TeleportDB.savePlayer(com.kammoun.donutCore.tpa.model.TeleportPlayer, int):void");
    }

    public void saveAll(java.util.Collection r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.data.TeleportDB.saveAll(java.util.Collection, int):void");
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
        a7PQpYYIc3 = 651443946 ^ new Random(-2805122983867685742L).nextInt();
    }

    public static String wqqrsoexrd(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ipujmvfswdqitjk() {
        return new byte[]{2, 105, 79, 13, 25, 88, 84, 20, 20, 108, 67, 63, 111, 89, 109, 106, 95, 76, 50, 9, 39, 70, 67, 109, 65, 96, 102, 37, 90, 73, 68, 95, 77, 59, 111, 122, 35, 86, 24, 18, 123, 86, 109, 14, 31, 70, 47, 61, 126, 120, 118, 117, 84, 123, 34, 30, 4, 25, 55, 72, 119, 86, 6, 53, 120, 3, 73, 87, 32, 97, 50, 64, 92, 126, 37, 103, 12, 47, 72, 40, 60, 21, 75, 111, 101, 111, 21};
    }

    private static byte[] openbyccldephlb() {
        return new byte[]{-51, -95, 119, 122, 32, 61, 101, 104, 32, 26, 114, 92, 87, 40, 84, 125, 110, 33, 6, Byte.MAX_VALUE, 22, 51, 123, 21, 120, 18, 87, 60, 110, 55, 117, 46, 117, 47, 86, 3, 18, 32, 44, 113, 74, 65, 85, Byte.MAX_VALUE, 38, 41, 30, 77, 74, 28, 71, 22, 108, 28, 27, 9, 53, 112, 3, 19, 70, 0, 62, 120, 65, 81, 120, 28, 20, 9, 3, 36, 100, 47, 28, 36, 61, 98, 124, 118, 13, 76, 115, 60, 92, 43, 36, 19, 93, 45, 60, 123, 96, 41, 45, 103, 93, 90, 11, 46, 104, 59, 82, 25, 117, 102, 56, 118, 114, 21, 92, 4, 88, 122, 28, 88, 120, 77, 107, 83, 10, 120, 66, 103, 111, 93, 35, 43, 98, 55, 63, 73, 126, 105, 4, 48, 73, 111, 65, 8, 74, 112, 38, 73, 32, 44, 121, 26, 98, 97, 4, 14, 59, 34, 110, 95, 80, 78, 116, 57, 79, 87, 95, 24, 22, 61, 25, 74, 33, 51, 94, 30, 87, 100, 59, 31, 126, 122, 45, 67, 101, 119, 44, 8, 122, 73, 94, 63, 89, 15, 110, 62, 10, 108, 30, 36, 114, 17, 117, 4, 87, 70, 98, 93, 125, 42, 124, 77, 91, 2, 18, 45, 32, 99, 66, 32, 92, 121, 43, 93, 30, 94, 70, 28, 79, 3, 101, 29, 22, 104, 53, 123, 15, 40, 78, 46, 55, 44, 76, 118, 120, 47, 24, 26, 11, 59, 109, 2, 17, 17, 61, 86, 112, 53, 5, 25};
    }

    private static byte[] ncxsxargqoysvcv() {
        return new byte[]{-51, -94, 126, 102, 41, 45, 97, 108, 38, 27, 114, 72, 94, 53, 93, 122, 106, 44, 0, 107, 22, 51, 114, 10, 113, 24, 83, 84, 104, 41, 117, 46, 124, 47, 95, 30, 22, 50, 42, 97, 74, 61, 92, 100, 47, 51, 26, 88, 76, 31, 71, 4, 101, 16, 18, 122, 49, 1, 5, 46, 70, 50, 55, 76, 72, 108, 124, 34, 18, 6, 3, 32, 109, 9, 21, 119, 57, 93, 122, 72, 13, 110, 122, 26, 85, Byte.MAX_VALUE, 32, 102, 91, 17, 60, 76, 105, 21, 36, 65, 89, 5, 13, 2, 104, 10, 91, 2, 124, 118, 60, 103, 116, 24, 92, 27, 81, 57, 21, 25, 124, 80, 109, 40, 10, 19, 75, 94, 102, 122, 39, 10, 100, Byte.MAX_VALUE, 63, 126, 119, 66, 13, 7, 77, 6, 71, 70, 74, 43, 47, 28, 41, 56, 125, 120};
    }

    private static byte[] lwjumnubxfpszsg() {
        return new byte[]{-51, -90, 122, 97, 40, 60, 102, 100, 37, 2, 114, 71, 90, 36, 92, 12, 109, 56};
    }

    private static byte[] gokpfjtfsyxfuew() {
        return new byte[]{-50, -89, 124, 105, 45, 49, 96, 103, 34, 3, 113, 79, 92, 60, 89, 7, 107, 49};
    }

    private static byte[] rznfbsjsenyvupk() {
        return new byte[]{-50, -89, 124, 96, 43, 48, 100, 97, 34, 1, 114, 94, 86, 46, 85, 11, 107, 47, 0, 125, 20, 44, 113, 1};
    }

    private static byte[] euifgyzbqhpdiat() {
        return new byte[]{-51, -81, 122, 117, 41, 34, 99, 126, 37, 24, 114, 84, 90, 60, 93, 126, 104, 60, 3, 118, 22, 43, 118, 19, 113, 116, 81, 76, 107, 20, 117, 7, 120, 115, 95, 43, 20, 29, 41, 124, 74, 60, 88, 90, 47, 6, 24, 112, 79, 32, 71, 34, 97, 45, 18, 89, 51, 0, 6, 47, 70, 14, 51, 104, 72, 66, 126, 11, 17, 35, 3, 81, 105, 112, 21, Byte.MAX_VALUE, 59, 41, 121, 53, 13, 19, 126, 114, 85, 100, 34, 18, 88, 94, 60, 111, 109, 43, 36, 0, 91, 57, 14, 17, 104, 26, 95, 40, 124, 74, 62, 87, 119, 49, 92, 44, 85, Byte.MAX_VALUE, 21, 59, 126, 40, 110, 53, 10, 18, 79, 59, 102, 12, 37, 6, 103, 19, 63, 6, 115, 75, 13, 26, 79, 11, 68, 36, 74, 79, 43, 112, 41, 35, Byte.MAX_VALUE, 29, 103, 114, 4, 21, 54, 88, 103, 52, 86, 43, 113, 77, 79, 72, 82, 109, 31, 61, 31, 90, 36, 50, 94, 25, 90, 118, 50, 24, 120, 9, 40, 12, 101, 85, 33, 62, 115, 103, 88, 21, 92, 63, 110, 16, 7, 92, 23, 92, 116, 0, 112, 1, 87, 93, 111, 39, 116, 35, 122, 71, 94, 25, 18, 42, 45, 15, 75, 66, 90, 23, 46, 87, 30, 80, 75, 25, 70, 0, 99, 29, 19, 125, 53, 101, 2, 40, 71, 55, 49, 73, 73, 97, 120, 58, 21, 109, 2, 17, 107, 63, 20, 53, 61, 122, 125, 108, 12, 69, 124, 51, 84, 58, 36, 21, 92, 42, 61, 125, 111, 44, 37, 122, 93, 40, 10, 27, 105, 8, 93, 51, 125, 70, 56, 77, 115, 38, 93, 89, 87, Byte.MAX_VALUE, 20, 75, 120, 93, 106, 40, 11, 11, 77, 91, 103, 118, 35, 3, 99, 9, 62, Byte.MAX_VALUE, 113, 89, 12, 114, 73, 42, 64, 29, 75, 117, 41, 81, 40, 115, 121, 42, 99, 82, 5, 40, 52, 94, 102, 69, 80, 91, 117, 44, 78, 78, 80, 116, 30, 44, 25, 81, 32, 53};
    }

    private static byte[] eqkybrmmchsyzkb() {
        return new byte[]{-51, -89, 126, 112, 44, 34, 99, 113, 38, 24, 114, 92, 91, 56, 89, 125, 105, 55, 3, 118, 22, 38, 118, 22, 118, 118, 84, 68, 107, 20, 112, 11, 121, 117, 89, 45, 18, 21, 41, 121, 78, 49, 90, 93, 45, 3, 30, 120, 74, 36, 66, 44, 98, 46, 19, 92, 53, 13, 2, 42, 64, 1, 52, 104, 73, 71, 125, 7, 20, 37, 4, 90, 109, 112, 20, Byte.MAX_VALUE, 57, 36, Byte.MAX_VALUE, 50, 14, 27, 122, 114, 81, 101, 33, 28, 95, 93, 60, 103, 105, 46, 33, 0, 91, 54, 13, 17, 104, 18, 94, 44, 120, 73, 63, 92, 119, 49, 92, 33, 85, 122, 18, 57, 123, 32, 110, 53, 15, 30, 78, 61, 96, 10, 35, 14, 103, 22, 59, 11, 113, 76, 15, 31, 73, 3, 65, 32, 79, 65, 40, 115, 40, 38, 121, 16, 99, 119, 2, 26, 49, 88, 102, 49, 85, 39, 116, 75, 72, 67, 86, 109, 30, 61, 29, 87, 34, 53, 93, 17, 94, 118, 54, 25, 123, 7, 47, 15, 101, 93, 37, 59, 118, 103, 88, 26, 95, 63, 110, 24, 6, 88, 19, 95, 117, 11, 112, 1, 87, 80, 111, 34, 115, 33, Byte.MAX_VALUE, 79, 94, 25, 23, 38, 44, 9, 77, 68, 92, 31, 46, 82, 26, 93, 73, 30, 68, 5, 101, 21, 22, 121, 48, 107, 1, 43, 70, 50, 55, 68, 77, 100, 126, 53, 18, 109, 3, 20, 104, 51, 17, 51, 58, 113, 121, 108, 13, 69, 126, 62, 82, 61, 39, 29, 88, 42, 57, 124, 108, 34, 34, 121, 93, 32, 14, 30, 108, 8, 93, 60, 126, 70, 56, 69, 114, 34, 89, 86, 86, 116, 20, 75, 120, 92, 106, 45, 12, 9, 72, 83, 103, 118, 38, 15, 98, 15, 56, 121, 119, 81, 12, 119, 77, 39, 66, 26, 73, 112, 47, 89, 45, 119, 124, 36, 96, 81, 4, 45, 50, 83, 98, 64, 86, 84, 114, 44, 79, 75, 83, 120, 27, 42, 30, 90, 36, 53};
    }

    private static int xtzlzyrauboumwuf(int i, int i2) {
        return i2 ^ i;
    }
}
