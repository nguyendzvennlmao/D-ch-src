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
import org.bukkit.command.TabCompleter;

public class HomeCommand implements CommandExecutor, TabCompleter {
    private final HomePlugin plugin;
    private final HomeManager homeManager;
    private final MessagesManager messagesManager;
    private static int D5fBO4aFbo = 0;
    private transient int Mb7GTjMBT0 = 2004596288;
    private static String ujxzgyuzbw;
    private static String[] nothing_to_see_here = new String[15];

    static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$home$managers$HomeManager$HomeResult;
        private static int dniyCd4yAA = 0;
        private transient int mqIvL6kBar = 205814237;
        private static String[] nothing_to_see_here = new String[17];

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.commands.HomeCommand.AnonymousClass1.m189clinit():void");
        }

        public static String dosvrwkwsf(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] qudhytdrjwdjmbo() {
            return new byte[]{85, 103, 102, 16, 95, 52, 72, 116, 119, 111, 2, 101, 24, 61, 64};
        }

        private static int abgeszoxkzrgrurl(int i, int i2) {
            return i ^ i2;
        }
    }

    public HomeCommand(HomePlugin homePlugin, HomeManager homeManager, MessagesManager messagesManager, int i) {
        int i2 = 138113539 ^ (1741598766 ^ 2044530535);
        int parseInt = 1188473662 ^ (186046169 ^ Integer.parseInt("1541976237"));
        this.Mb7GTjMBT0 = 2004596288 ^ D5fBO4aFbo;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 56014073:
                default:
                    throw new IOException();
                case 183442327:
                    parseInt = 1066583989 ^ parseInt;
                    break;
                case 949459520:
                case 1080221943:
                    break;
            }
        }
        this.plugin = homePlugin;
        this.homeManager = homeManager;
        this.messagesManager = messagesManager;
        int i3 = 1838523286 ^ (1511969550 ^ (67284831 ^ (991123470 ^ parseInt)));
    }

    public boolean onCommand(org.bukkit.command.CommandSender r7, org.bukkit.command.Command r8, java.lang.String r9, java.lang.String[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.commands.HomeCommand.onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):boolean");
    }

    public java.util.List<java.lang.String> onTabComplete(org.bukkit.command.CommandSender r6, org.bukkit.command.Command r7, java.lang.String r8, java.lang.String[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.commands.HomeCommand.onTabComplete(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):java.util.List");
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
        ujxzgyuzbw = ByteBuffer.wrap(jqnrvxcrypsvntu()).asCharBuffer().toString();
        D5fBO4aFbo = (-188755364) ^ new Random(4723602552149746678L).nextInt();
    }

    public static String bahdeufykw(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ujxzgyuzbw.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] dlrchiwzqkilpgx() {
        return new byte[]{0, 0, 0, 47, 0, 0, 0, 0};
    }

    private static byte[] ryjsnwmrlwgzztq() {
        return new byte[]{0, 0, 0, 36, 0, 0, 0, 47};
    }

    private static byte[] jqnrvxcrypsvntu() {
        return new byte[]{49, -106, 55, 86, 49, 108, 51, 89, 48, 65, 49, 67, 55, 21, 49, 81, 51, 87, 48, 64, 49, 80, 55, 21, 49, 92, 51, 69, 48, 20, 49, 66, 55, 65, 49, 92, 51, 90, 48, 88, 49, 17, 55, 89, 49, 90, 51, 87, 48, 80, 49, 88, 55, 91, 49, 82, 51, 24, 48, 20, 49, 97, 55, 89, 49, 80, 51, 87, 48, 71, 49, 84, 55, 21, 49, 65, 51, 68, 48, 77, 49, 17, 55, 84, 49, 82, 51, 87, 48, 93, 49, 95, 55, 27, 51, -97, 53, 80, 57, 123, 55, 93, 56, 89, 51, 64, 52, 23, 51, 72, 53, 95, 57, 85, 55, 74, 56, 80, 51, 75, 52, 68, 51, 24, 53, 80, 57, 85, 55, 93, 56, 21, 51, 76, 52, 68, 51, 93, 53, 19, 57, 64, 55, 91, 56, 92, 51, 74, 52, 23, 51, 91, 53, 92, 57, 89, 55, 94, 56, 84, 51, 87, 52, 83, 51, 25};
    }

    private static int mucesuqcjhiuaejm(int i, int i2) {
        return i ^ i2;
    }
}
