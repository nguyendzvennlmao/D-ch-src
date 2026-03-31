package com.kammoun.donutCore.clearlag.task;

import com.kammoun.donutCore.clearlag.managers.ConfigManager;
import com.kammoun.donutCore.clearlag.managers.MessageManager;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ClearTask implements Runnable {
    private final ConfigManager config;
    private final MessageManager messages;
    private static int RfQMmWbPEu = 0;

    private transient int f170AVPvvwUMf = 52335878;
    private static byte[] audngitikz;
    private static String[] nothing_to_see_here = new String[13];

    public ClearTask(com.kammoun.donutCore.clearlag.ClearLag r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.clearlag.task.ClearTask.<init>(com.kammoun.donutCore.clearlag.ClearLag, int):void");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.clearlag.task.ClearTask.run():void");
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
        audngitikz = zpgiywdwkqljdxk();
        RfQMmWbPEu = 126679755 ^ new Random(-6398169900554384602L).nextInt();
    }

    public static String igzbkixbns(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ audngitikz[i3 % audngitikz.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] zpgiywdwkqljdxk() {
        return new byte[]{35, 82, 117, 3, 113, 93, 13, 94, 67, 9, 23, 63, 54, 9, 96, 108, 83, 92, 7, 5, 94, 3, 49, 6, 76, 21, 58, 75, 70, 55, 11, 66, 79, 39, 114, 91, 18, 109, 35, 4, 65, 92, 20, 88, 54, 115, 109, 65, 24, 84, 5, 15, 66, 65, 118};
    }

    private static int srsljialadoxmylb(int i, int i2) {
        return i ^ i2;
    }
}
