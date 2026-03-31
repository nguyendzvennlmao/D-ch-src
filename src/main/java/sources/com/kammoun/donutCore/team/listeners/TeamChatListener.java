package com.kammoun.donutCore.team.listeners;

import com.kammoun.donutCore.team.TeamPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.event.Listener;

public class TeamChatListener implements Listener {
    private final TeamPlugin teamPlugin;

    private static int f1167FNw81ktC6 = 0;
    private transient int ujcII8CThC = 2105101556;
    private static String[] nothing_to_see_here = new String[15];

    public TeamChatListener(com.kammoun.donutCore.team.TeamPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.listeners.TeamChatListener.<init>(com.kammoun.donutCore.team.TeamPlugin, int):void");
    }

    @org.bukkit.event.EventHandler
    public void onPlayerChat(org.bukkit.event.player.AsyncPlayerChatEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.listeners.TeamChatListener.onPlayerChat(org.bukkit.event.player.AsyncPlayerChatEvent):void");
    }

    private void sendTeamMessage(com.kammoun.donutCore.team.models.Team r6, org.bukkit.entity.Player r7, java.lang.String r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.listeners.TeamChatListener.sendTeamMessage(com.kammoun.donutCore.team.models.Team, org.bukkit.entity.Player, java.lang.String, int):void");
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
        f1167FNw81ktC6 = 1397437803 ^ new Random(3347036638814049554L).nextInt();
    }

    public static String qzclocirpt(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] yafywuddjsnzouc() {
        return new byte[]{107, 50, 31, 35, 52, 5, 43, 76, 40, 11, 97, 32, 12, 49, 80, 62, 72, 81, 2, 46, 53, 42, 68, 103};
    }

    private static byte[] evhkcmesxbzsdon() {
        return new byte[]{-96, -12, 45, 107, 6, 88, 30, 16, 29, 65, 83, 96, 62, 96, 101, 96, 125, 13, 48, 96};
    }

    private static byte[] iqjzutjtucfinrg() {
        return new byte[]{-83, -2, 45, 104, 3, 67, 19, 20, 24, 82, 82, 107, 60, 99, 102, 116, 124, 28};
    }

    private static int whlemoeqqtqirgwy(int i, int i2) {
        return i2 ^ i;
    }
}
