package com.kammoun.donutCore.core.utils;

import com.kammoun.donutCore.core.CorePlugin;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class MessageSender {
    private final CorePlugin plugin;

    private static int f376FKej1qZ29 = 0;

    private transient int f3858ZXfsWuIT = 1424238800;
    private static String hnrvhttetz;
    private static String[] nothing_to_see_here = new String[15];

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$core$utils$Enums$MessageType;
        private static int Exe07V3NNC = 0;
        private transient int YLd4NZnn4l = 459677756;
        private static String[] nothing_to_see_here = new String[13];

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.utils.MessageSender.AnonymousClass1.m124clinit():void");
        }

        public static String ortuvimhks(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] ipgwwmlslyatrzh() {
            return new byte[]{99, 68, 120, 4, 62, 122, 27, 29, 79, 65, 17, 71, 58, 98, 29, 68, 108, 68, 45, 64, 67, 115, 60, 80, 126, 62, 83, 4, 15, 16, 40, 98, 52, 17, 111, 16, 65, 124, 116, 119, 100, 39, 39, 97, 51, 123, 62, 49, 122, 101, 3, 95, 30, 15, 80, 90, 11, 32, 77, 66, 1, 23, 126, 118, 21, 80, 29, 63, 105, 22, 118, 48, 33, 76, 126, 38, 7, 38, 118, 7, 43, 87, 67, 7, 89, 120, 9, 89, 27, 126, 126, 74, 85, 12, 94, 87, 83, 44, 39, 1, 125, 95, 34, 108, 90, 39, 67, 97, 43, 32, 113, 120, 73, 94, 4};
        }

        private static int yzbyedsglmxcvutk(int i, int i2) {
            return i2 ^ i;
        }
    }

    public MessageSender(com.kammoun.donutCore.core.CorePlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.utils.MessageSender.<init>(com.kammoun.donutCore.core.CorePlugin, int):void");
    }

    public void sendMessage(org.bukkit.entity.Player r7, java.lang.String r8, java.lang.String[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.utils.MessageSender.sendMessage(org.bukkit.entity.Player, java.lang.String, java.lang.String[], int):void");
    }

    public static java.lang.String replacePlaceholders(java.lang.String r5, java.lang.String[] r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.utils.MessageSender.replacePlaceholders(java.lang.String, java.lang.String[], int):java.lang.String");
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
        hnrvhttetz = ByteBuffer.wrap(tafmcoimuivvbxv()).asCharBuffer().toString();
        f376FKej1qZ29 = 1537893000 ^ new Random(4559575358010247041L).nextInt();
    }

    public static String qckppnvikt(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = hnrvhttetz.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] xlapjrskumfeaes() {
        return new byte[]{0, 0, 0, 101, 0, 0, 0, 0};
    }

    private static byte[] scyuktitfgfhqgh() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 101};
    }

    private static byte[] tafmcoimuivvbxv() {
        return new byte[]{54, 112, 52, 66, 53, 66, 51, 71, 51, 89, 51, 89, 55, 21, 49, 67, 51, 95, 54, 82, 52, 84, 53, 84, 51, 91, 51, 89, 51, 88, 55, 81, 49, 86, 51, 65, 54, 64, 52, 23, 53, 80, 51, 65, 51, 68, 51, 85, 55, 76, 49, 19, 51, 91, 54, 82, 52, 68, 53, 17, 51, 82, 51, 88, 51, 20, 55, 90, 49, 87, 51, 87, 54, 19, 52, 89, 53, 68, 51, 94, 51, 84, 51, 81, 55, 71, 49, 19, 51, 92, 54, 85, 52, 23, 53, 84, 51, 95, 51, 83, 51, 89, 55, 80, 49, 93, 51, 71, 54, 64, 52, 25, 53, 17, 51, 122, 51, 66, 51, 20, 55, 70, 49, 91, 51, 92, 54, 70, 52, 91, 53, 85, 51, 19, 51, 84, 51, 81, 55, 21, 49, 67, 51, 82, 54, 90, 52, 69, 53, 66, 51, 19, 51, 89, 51, 82, 55, 21, 49, 67, 51, 95, 54, 82, 52, 84, 53, 84, 51, 91, 51, 89, 51, 88, 55, 81, 49, 86, 51, 65, 54, 19, 52, 86, 53, 95, 51, 87, 51, 22, 51, 66, 55, 84, 49, 95, 51, 70, 54, 86, 52, 25, 49, 119, 51, 124, 52, 115, 56, 103};
    }

    private static int tczagcveqhsgjbhq(int i, int i2) {
        return i ^ i2;
    }
}
