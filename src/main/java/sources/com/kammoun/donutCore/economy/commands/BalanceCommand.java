package com.kammoun.donutCore.economy.commands;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.economy.EconomyPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class BalanceCommand extends KCommand {
    private final EconomyPlugin plugin;
    private static int ISDyB5vppo = 0;
    private transient int Q8IE4pw8Zt = 810466839;
    private static String[] nothing_to_see_here = new String[17];

    public BalanceCommand(com.kammoun.donutCore.economy.EconomyPlugin r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.economy.commands.BalanceCommand.<init>(com.kammoun.donutCore.economy.EconomyPlugin, int):void");
    }

    @Override
    public void execute(org.bukkit.command.CommandSender r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.economy.commands.BalanceCommand.execute(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    @Override
    public java.util.List onTab(org.bukkit.command.CommandSender r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.economy.commands.BalanceCommand.onTab(org.bukkit.command.CommandSender, java.lang.String[], int):java.util.List");
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
        ISDyB5vppo = 1388957117 ^ new Random(-2716460384847841004L).nextInt();
    }

    public static String twckauoftf(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] kqwtotahnfczgox() {
        return new byte[]{87, 100, 89, 8, 111, 59, 101, 86, 43, 107, 47, 44, 50, 34, 31, 101, 37, 10, 25, 96, 116, 58, 85, 98, 17, 97, 61, 88, 58, 47, 117, 18, 12, 56, 121, 9, 64, 26, 93, 49, 90, 43, 103, 19, 96, 15, 41, 65, 40, 89, 46, 23, 23, 118, 67, 16, 84};
    }

    private static byte[] naumbemdfpvhjjs() {
        return new byte[]{-101, -86, 106, 28, 95, 108, 85, 9, 28, 51, 29, 104, 1, 125, 47, 39, 21, 29};
    }

    private static byte[] byuwjfgsrrkxmrh() {
        return new byte[]{-112, -86, 97, 28, 90, 115, 82, 13, 18, 59, 23, 100, 7, Byte.MAX_VALUE, 40, 32, 28, 30};
    }

    private static byte[] srqfqguzmirkvjm() {
        return new byte[]{-104, -87, 96, -104, 86, 107, 83, 49, 30, 49, 30, 119, 11, 102, 38, 118, 19, 90, 44, 61, 69, 101, 108, 56, 40, 51, 11, 5, 15, 121, 68, 0, 53, 108, 64, 91, 118, 71, 104, 35, 107, 118, 94, 74, 89, 80, 31, 11, 29, 75, 31, 71, 46, 36, 122, 3, 98, 17, 81, 24, 57, 56, 2, 54, 111, 56, 93, 126, 25, 121, 19, 13, 92, 98, 51, 70, 86, 38, 15, 30, 83, 70, 88, 120, 97, 122, 25, 104};
    }

    private static byte[] efxnpwdbbppokow() {
        return new byte[]{-104, -87, 107, 24, 91, 104, 85, 15, 24, 53, 29, 107, 7, 120, 45, 33, 17, 28};
    }

    private static byte[] zbaxrjgomvjjfgb() {
        return new byte[]{-101, -81, 108, 92, 86, 106, 81, 0, 27, 55, 27, 118, 3, 118, 45, 40, 28, 20, 43, 54, 65, 106, 108, 60, 37, 57, 13, 4, 14, 121, 68, 78, 62, 34, 64, 86, 114, 90, 104, 104, 99, 124, 83, 88, 80, 78};
    }

    private static byte[] qqkbnumwigzkofg() {
        return new byte[]{-97, -82, 108, 31, 94, 109, 80, 11, 29, 50, 26, 108, 0, 125, 40, 36, 21, 25};
    }

    private static byte[] ylgrcrwljsopble() {
        return new byte[]{-99, -84, 104, 88, 87, 97, 80, 11, 25, 49, 24, 114, 7, 119, 38, 41, 23, 22, 45, 53, 69, 110, 109, 55, 36, 50, 15, 2, 13, 125, 64, 79, 53, 35, 75, 84, 116, 89, 108, 108, 98, 119, 82, 83, 82, 72};
    }

    private static int uixtqhahehnjlkny(int i, int i2) {
        return i2 ^ i;
    }
}
