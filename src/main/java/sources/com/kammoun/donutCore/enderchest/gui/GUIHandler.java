package com.kammoun.donutCore.enderchest.gui;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class GUIHandler {
    private final LegacyComponentSerializer serializer;

    private static int f5747RpntOab2 = 0;
    private transient int EtAoPFuw1O = 1104648927;
    private static String zqzmcawlhv;
    private static String[] nothing_to_see_here = new String[13];

    public GUIHandler() {
        jsxeaftwcvrhidwb(186987394 ^ 1391743317, 1538932021);
        int parseInt = 741335009 ^ (1270650808 ^ Integer.parseInt("1710757819"));
        this.EtAoPFuw1O = 1104648927 ^ f5747RpntOab2;
        int jsxeaftwcvrhidwb = 418806204 ^ jsxeaftwcvrhidwb(parseInt, 1523265485);
        this.serializer = LegacyComponentSerializer.legacyAmpersand();
        int i = 916039561 ^ jsxeaftwcvrhidwb;
    }

    public net.kyori.adventure.text.Component colorize(java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.gui.GUIHandler.colorize(java.lang.String, int):net.kyori.adventure.text.Component");
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
        zqzmcawlhv = ByteBuffer.wrap(wgukkmucsdpecjb()).asCharBuffer().toString();
        f5747RpntOab2 = (-1333246649) ^ new Random(-8616595065750480133L).nextInt();
    }

    public static String oyhdrgyplp(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = zqzmcawlhv.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] wgukkmucsdpecjb() {
        return new byte[0];
    }

    private static int jsxeaftwcvrhidwb(int i, int i2) {
        return i ^ i2;
    }
}
