package com.kammoun.donutCore.home.commands;

import com.kammoun.donutCore.home.HomePlugin;
import com.kammoun.donutCore.home.managers.HomeManager;
import com.kammoun.donutCore.home.managers.MessagesManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.command.CommandExecutor;

public class SetHomeCommand implements CommandExecutor {
    private final HomePlugin plugin;
    private final HomeManager homeManager;
    private final MessagesManager messagesManager;
    private static int BK2e8Bm072 = 0;
    private transient int UDGsd3q1u9 = 1018982994;
    private static String dwzdtnorgz;
    private static String[] nothing_to_see_here = new String[13];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$home$managers$HomeManager$HomeResult;
        private static int FVW685c7pP = 0;

        private transient int f6057empJjmKM = 1351728341;
        private static String fbxaibolek;
        private static String[] nothing_to_see_here;

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.commands.SetHomeCommand.AnonymousClass1.m192clinit():void");
        }

        public static String geuudaiuwv(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = fbxaibolek.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] pvlzglbuylyxaoj() {
            return new byte[0];
        }

        private static int ircwoijcuitonjda(int i, int i2) {
            return i ^ i2;
        }
    }

    public SetHomeCommand(HomePlugin homePlugin, HomeManager homeManager, MessagesManager messagesManager, int i) {
        int i2 = 1469435413 ^ (68180057 ^ 1548971713);
        int parseInt = 1303751238 ^ (5187767 ^ Integer.parseInt("1110211196"));
        this.UDGsd3q1u9 = 1018982994 ^ BK2e8Bm072;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 119065332:
                default:
                    throw new IOException();
                case 246451783:
                    parseInt = 1741157300 ^ parseInt;
                    break;
                case 602099871:
                    break;
                case 1252337915:
            }
        }
        this.plugin = homePlugin;
        this.homeManager = homeManager;
        this.messagesManager = messagesManager;
        int i3 = 178034804 ^ (1203476504 ^ (1978264063 ^ (1296932882 ^ parseInt)));
    }

    public boolean onCommand(org.bukkit.command.CommandSender r7, org.bukkit.command.Command r8, java.lang.String r9, java.lang.String[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.commands.SetHomeCommand.onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):boolean");
    }

    private boolean isValidHomeName(java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.commands.SetHomeCommand.isValidHomeName(java.lang.String, int):boolean");
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
        dwzdtnorgz = ByteBuffer.wrap(voshdfynqunfmrs()).asCharBuffer().toString();
        BK2e8Bm072 = (-1251701483) ^ new Random(831267479505513306L).nextInt();
    }

    public static String xkvlvvrjdj(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = dwzdtnorgz.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] mtmdslmhbsduexa() {
        return new byte[]{0, 0, 0, 47, 0, 0, 0, 0};
    }

    private static byte[] olajpxvqssulovu() {
        return new byte[]{0, 0, 0, 36, 0, 0, 0, 47};
    }

    private static byte[] gcmknaakzqeolox() {
        return new byte[]{0, 0, 0, 41, 0, 0, 0, 83};
    }

    private static byte[] xayqokmmybshxah() {
        return new byte[]{0, 0, 0, 64, 0, 0, 0, 124};
    }

    private static byte[] ipdnakgzdzmvxeu() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, -68};
    }

    private static byte[] nhoayuiqhdygrrg() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, -44};
    }

    private static byte[] voshdfynqunfmrs() {
        return new byte[]{49, -109, 57, 86, 56, 105, 56, 87, 53, 66, 49, 70, 57, 21, 56, 84, 56, 89, 53, 67, 49, 85, 57, 21, 56, 89, 56, 75, 53, 23, 49, 71, 57, 65, 56, 89, 56, 84, 53, 91, 49, 20, 57, 89, 56, 95, 56, 89, 53, 83, 49, 93, 57, 91, 56, 87, 56, 22, 53, 23, 49, 100, 57, 89, 56, 85, 56, 89, 53, 68, 49, 81, 57, 21, 56, 68, 56, 74, 53, 78, 49, 20, 57, 84, 56, 87, 56, 89, 53, 94, 49, 90, 57, 27, 49, -106, 53, 80, 50, 118, 53, 92, 57, 85, 49, 72, 53, 19, 50, 73, 53, 94, 57, 88, 49, 72, 53, 86, 50, 75, 53, 65, 57, 25, 49, 82, 53, 82, 50, 87, 53, 18, 57, 76, 49, 66, 53, 86, 50, 25, 53, 70, 57, 81, 49, 88, 53, 64, 50, 25, 53, 81, 57, 86, 49, 92, 53, 94, 50, 88, 53, 92, 57, 93, 49, 16, 52, -107, 57, 87, 54, 107, 48, 91, 53, 65, 50, 25, 52, 82, 50, 95, 52, 91, 52, 21, 57, 64, 54, 18, 48, 92, 53, 85, 50, 79, 52, 83, 50, 16, 52, 69, 52, 87, 57, 70, 54, 95, 48, 93, 53, 71, 50, 74, 52, 95, 50, 95, 52, 91, 52, 18, 57, 64, 54, 93, 48, 20, 53, 71, 50, 92, 52, 66, 50, 16, 52, 93, 52, 93, 57, 89, 54, 87, 48, 71, 53, 21, 49, -98, 50, 83, 53, 123, 54, 89, 50, 68, 49, 88, 50, 92, 53, 91, 54, 83, 50, 18, 49, 81, 50, 95, 53, 95, 54, 82, 50, 18, 49, 87, 50, 81, 53, 95, 54, 82, 50, 19, 49, 25, 50, 101, 53, 65, 54, 82, 50, 18, 49, 86, 50, 94, 53, 94, 54, 78, 50, 18, 49, 85, 50, 85, 53, 70, 54, 67, 50, 87, 49, 75, 50, 67, 53, 30, 54, 23, 50, 92, 49, 76, 50, 93, 53, 80, 54, 82, 50, 64, 49, 74, 50, 28, 53, 18, 54, 86, 50, 92, 49, 93, 50, 16, 53, 71, 54, 89, 50, 86, 49, 92, 50, 66, 53, 65, 54, 84, 50, 93, 49, 75, 50, 85, 53, 65, 54, 25, 49, -97, 56, 81, 48, 102, 50, 65, 57, 89, 49, 95, 56, 87, 48, 9, 50, 18, 57, 23, 49, 75, 56, 87, 48, 71, 50, 90, 57, 87, 49, 85, 56, 87, 48, 19, 50, 14, 57, 86, 49, 89, 56, 95, 48, 86, 50, 12, 49, 105, 55, 111, 54, 86, 54, 25, 54, 73, 49, 118, 55, 25, 54, 109, 54, 4, 54, 30, 49, 14, 55, 107, 54, 106, 54, 31, 54, 23};
    }

    private static int camyhlvekhwmdwlh(int i, int i2) {
        return i2 ^ i;
    }
}
