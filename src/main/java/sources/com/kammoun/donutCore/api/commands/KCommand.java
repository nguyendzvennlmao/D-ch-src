package com.kammoun.donutCore.api.commands;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public abstract class KCommand implements CommandExecutor, TabCompleter {
    private final String commandName;
    private final String permission;
    private final boolean playerOnly;
    private final List<KSubCommand> subCommands;
    private static int SpcaSMxvmE = 0;
    private transient int vpFOxxtv53 = 1961085819;
    private static String[] nothing_to_see_here = new String[15];

    public KCommand(String str, String str2, boolean z, int i) {
        int i2 = 890789861 ^ (1209283937 ^ 195280484);
        int parseInt = 1325646 ^ (1414619376 ^ Integer.parseInt("585797214"));
        this.vpFOxxtv53 = 1961085819 ^ SpcaSMxvmE;
        int usxhlniyvpkwstxy = 1977296087 ^ usxhlniyvpkwstxy(parseInt, 1715654146);
        this.subCommands = new ArrayList();
        this.commandName = str;
        this.permission = str2;
        this.playerOnly = z;
        int i3 = 1931216736 ^ (241867713 ^ (180607491 ^ (6052032 ^ usxhlniyvpkwstxy)));
    }

    public KCommand(String str, int i) {
        this(str, null, true, 1862853155);
        int i2 = 144030207 ^ (1515130971 ^ 849190521);
        int parseInt = 1914627010 ^ (817060417 ^ Integer.parseInt("585797214"));
        this.vpFOxxtv53 = 1961085819 ^ SpcaSMxvmE;
        int usxhlniyvpkwstxy = 332296393 ^ usxhlniyvpkwstxy(parseInt, 304367591);
    }

    public abstract void execute(CommandSender commandSender, String[] strArr, int i);

    public abstract List onTab(CommandSender commandSender, String[] strArr, int i);

    public void addSubCommand(KSubCommand[] kSubCommandArr, int i) {
        int i2 = 1277219722 ^ (1176909329 ^ 1267330646);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 209215082) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 209215082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1474341507 ^ i2)) {
                    break;
                }
            }
            int i3 = 1263405538 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 492171360 ^ i2;
        this.subCommands.addAll(Arrays.asList(kSubCommandArr));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -422060694) {
            int i5 = 2124226290 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 306129657 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1488248293 ^ i4)) {
                int i6 = 314479198 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -422060694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (662292352 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 1483013746 ^ i4;
        throw new RuntimeException();
    }

    public final boolean onCommand(@org.jetbrains.annotations.NotNull org.bukkit.command.CommandSender r6, @org.jetbrains.annotations.NotNull org.bukkit.command.Command r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.commands.KCommand.onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):boolean");
    }

    public final java.util.List<java.lang.String> onTabComplete(@org.jetbrains.annotations.NotNull org.bukkit.command.CommandSender r6, @org.jetbrains.annotations.NotNull org.bukkit.command.Command r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.commands.KCommand.onTabComplete(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):java.util.List");
    }

    public boolean isPlayerOnline(java.lang.String r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.commands.KCommand.isPlayerOnline(java.lang.String):boolean");
    }

    public Player getOnlinePlayer(String str) {
        int i = 1598391255 ^ (1928817720 ^ 1267330646);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 836242891) {
            int i2 = 1144711557 ^ i;
            return Bukkit.getPlayer(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 269435361 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1107489226 ^ i)) {
                int i3 = 1890975646 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 836242891 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1384815880 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2004600387 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getCommandName(int i) {
        int i2 = 1875975401 ^ (823502673 ^ 1267330646);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1435848848) {
            int i3 = 276356490 ^ i2;
            return this.commandName;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 699155232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (189579595 ^ i2)) {
                int i4 = 540946068 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1435848848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (996094639 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 731141504 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getPermission() {
        int i = 907668531 ^ (1480888507 ^ 1267330646);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 782538481) {
            int i2 = 923231654 ^ i;
            return this.permission;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 782538481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (193216875 ^ i)) {
                int i3 = 1144670391 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1767916608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1327080563 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1282069410 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isPlayerOnly() {
        int i = 437975950 ^ (209148333 ^ 1267330646);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -282958934) {
            int i2 = 249167379 ^ i;
            return this.playerOnly;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -282958934 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1433874195 ^ i)) {
                int i3 = 77992446 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1712483534 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (480908817 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2137632347 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public List<KSubCommand> getSubCommands() {
        int i = 1029812354 ^ (1398529136 ^ 1267330646);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 765203745) {
            int i2 = 723884503 ^ i;
            return this.subCommands;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 765203745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (20267352 ^ i)) {
                int i3 = 1493153768 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1957747608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2058291222 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1037547888 ^ i;
        throw new RuntimeException();
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
        SpcaSMxvmE = (-677622520) ^ new Random(1964892139128925038L).nextInt();
    }

    public static String jnbzwgiksp(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] pqsbdlelsaxvfyb() {
        return new byte[]{71, 10, 92, 82, 9, 106, 124, 70, 78, 84, 87, 63, 9, 124, 17, 107, 30, 21, 125, 4, 49, 2, 43, 40, 4, 76, 80, 82, 95, 103, 113, 21, 36, 93, 28, 2, 53, 35, 79, 102, 65, 10, 88, 25, 51, 91, 59, 17, 117, 47, 49, 62, 118, 86, 96, 70, 39, 116, 78, 117, 1, 57, 21, 112, 29, 46, 46, 68, 34, 38, 34, 43, 5, 58, 36, 107, 104, 51, 82, 99, 88, 66, 2, 45, 124, 72, 110, 125, 33, 40, 100, 10, 30, 36, 74, 81, 53, 50, 98, 90, 18, 48, 72, 76, 51, 28, 103, 85, 46, 119, 24, 73};
    }

    private static byte[] beuapchkzfnymlm() {
        return new byte[]{-120, -62, 109, -61, 58, 62, 76, 42, 121, 12, 102, 97, 56, 57, 34, 124, 46, 78, 74, 91, 0, 88, 26, 115, 55, 26, 96, 4, 104, 51, 64, 2, 21, 8, 47, 84, 5, 117, 120, 118, 112, 82, 105, 65, 0, 0, 11, 80, 66, 63, 0, 107, 71, 5, 83, 81, 23, 41, 121, 61, 48, 107, 36, 37, 46, 108, 30, 8, 21, 115, 19, 120, 52, 44, 23, 62, 88, 114, 101, 115, 105, 20, 51, 59, 79, 15, 94, 41, 22, 121, 85, 68, 47, 119, 121, 20, 5, 36};
    }

    private static int usxhlniyvpkwstxy(int i, int i2) {
        return i ^ i2;
    }
}
