package com.kammoun.donutCore.tpa.commands;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.tpa.TeleportPlugin;
import com.kammoun.donutCore.tpa.manager.TeleportManager;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class TpaAccept extends KCommand {
    protected final TeleportPlugin plugin;
    protected final TeleportManager manager;
    private static int emZZQUiGE1 = 0;
    private transient int SBUAQFWkQ6 = 2034127691;
    private static String[] nothing_to_see_here = new String[15];

    public TpaAccept(TeleportPlugin teleportPlugin, int i) {
        super("tpaaccept", 1543881941);
        etzqbomxenqdphsk(276441212 ^ 1001034630, 1034401653);
        int parseInt = 1986628258 ^ (63781986 ^ Integer.parseInt("1674820175"));
        this.SBUAQFWkQ6 = 2034127691 ^ emZZQUiGE1;
        this.plugin = teleportPlugin;
        this.manager = teleportPlugin.getTeleportManager(325711881);
        int i2 = 1649560776 ^ (1365409272 ^ (368114734 ^ (2011527215 ^ parseInt)));
    }

    @Override
    public void execute(org.bukkit.command.CommandSender r7, java.lang.String[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.commands.TpaAccept.execute(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    @Override
    public java.util.List onTab(org.bukkit.command.CommandSender r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.commands.TpaAccept.onTab(org.bukkit.command.CommandSender, java.lang.String[], int):java.util.List");
    }

    static {
        nothing_to_see_here[0] = " ⠁⡼⠋⠀⣆⠀⠀⣰⣿⣫⣾⢿⣿⣿⠍⢠⠠⠀⠀⢀⠰⢾⣺⣻⣿⣿⣿⣷⡀⠀";
        nothing_to_see_here[1] = "⣥⠀⠀⠀⠁⠀⠠⢻⢬⠁⣠⣾⠛⠁⠀⠀⠀⠀⠀⠀⠀⠐⠱⠏⡉⠙⣿⣿⡇⠀";
        nothing_to_see_here[2] = "⢳⠀⢰⡖⠀⠀⠈⠀⣺⢰⣿⢻⣾⣶⣿⣿⣶⣶⣤⣤⣴⣾⣿⣷⣼⡆⢸⣿⣧⠀";
        nothing_to_see_here[3] = "⠈⠀⠜⠈⣀⣔⣦⢨⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⣼⠛⢹⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⢋⡿⡿⣯⣭⡟⣟⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡘⠀";
        nothing_to_see_here[5] = "⡀⠐⠀⠀⠀⣿⣯⡿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣉⢽⣿⡆⠀⠀";
        nothing_to_see_here[6] = "⢳⠀⠄⠀⢀⣿⣿⣿⣿⣿⣿⣿⠙⠉⠉⠉⠛⣻⢛⣿⠛⠃⠀⠐⠛⠻⣿⡇⠀⠀";
        nothing_to_see_here[7] = "⣾⠄⠀⠀⢸⣿⣿⡿⠟⠛⠁⢀⠀⢀⡄⣀⣠⣾⣿⣿⡠⣴⣎⣀⣠⣠⣿⡇⠀⠀";
        nothing_to_see_here[8] = "⣧⠀⣴⣄⣽⣿⣿⣿⣶⣶⣖⣶⣬⣾⣿⣾⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⣿⣶⣈⡯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣹⢧⣿⣿⣿⣄⠙⢿⣿⣿⣿⠇⠀⠀";
        nothing_to_see_here[10] = "⠹⣿⣿⣧⢌⢽⣻⢿⣯⣿⣿⣿⣿⠟⣠⡘⠿⠟⠛⠛⠟⠛⣧⡈⠻⣾⣿⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠈⠉⣷⡿⣽⠶⡾⢿⣿⣿⣿⢃⣤⣿⣷⣤⣤⣄⣄⣠⣼⡿⢷⢀⣿⡏⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⢀⣿⣷⠌⣈⣏⣝⠽⡿⣷⣾⣏⣀⣉⣉⣀⣀⣀⣠⣠⣄⡸⣾⣿⠃⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⣰⡿⣿⣧⡐⠄⠱⣿⣺⣽⢟⣿⣿⢿⣿⣍⠉⢀⣀⣐⣼⣯⡗⠟⡏⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⣰⣿⠀⣿⣿⣴⡀⠂⠘⢹⣭⡂⡚⠿⢿⣿⣿⣿⡿⢿⢿⡿⠿⢁⣴⣿⣷⣶⣦⣤";
        emZZQUiGE1 = 1089617763 ^ new Random(1205062736591195686L).nextInt();
    }

    public static String kfnfbcjdyu(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] uxmdfiahnkluclt() {
        return new byte[]{112, 110, 36, 13, 72, 26, 109, 12, 37, 105, 49, 108, 24, 125, 73, 114, 126, 65, 103, 18, 79, 21, 91, 76, 63, 68, 18, 39, 50, 109, 68, 84, 5, 46, 94, 4, 93, 37, 104, 7, 47, 17, 87, 80, 69, 31, 58, 105, 4, 109, 2, 50, 110, 35, 91, 106, 72, 37, 30, 103, 61, 83, 33, 101, 66, 4, 16, 122, 118, 106};
    }

    private static byte[] sdsovsbndbbylnp() {
        return new byte[]{-65, -89, 21, 29, 121, 83, 92, 89, 19, 63, 0, 35, 41, 45, 120, 57, 79, 93};
    }

    private static byte[] byggqcszjmknzeg() {
        return new byte[]{-65, -91, 21, 27, Byte.MAX_VALUE, 94, 93, 84, 16, 57, 0, 33, 41, 43, 126, 52, 78, 80};
    }

    private static int etzqbomxenqdphsk(int i, int i2) {
        return i ^ i2;
    }
}
