package com.kammoun.donutCore.core.commands.Admin;

import com.kammoun.donutCore.core.library.commands.PikzCommand;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class SetAfkCommand extends PikzCommand {
    private static int llAW79vAip = 0;

    private transient int f231s57sU477q = 546365443;
    private static byte[] ocqblyjjen;
    private static String[] nothing_to_see_here = new String[15];

    public SetAfkCommand(com.kammoun.donutCore.core.CorePlugin r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.commands.Admin.SetAfkCommand.<init>(com.kammoun.donutCore.core.CorePlugin, java.lang.String, int):void");
    }

    @Override
    public boolean execute(org.bukkit.command.CommandSender r9, java.lang.String r10, java.lang.String[] r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.commands.Admin.SetAfkCommand.execute(org.bukkit.command.CommandSender, java.lang.String, java.lang.String[]):boolean");
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
        ocqblyjjen = ubtfyiwcxicpcml();
        llAW79vAip = 890819645 ^ new Random(4740562213528928134L).nextInt();
    }

    public static String uwjbsbzqfx(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ocqblyjjen[i3 % ocqblyjjen.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ubtfyiwcxicpcml() {
        return new byte[]{88, 91, 121, 117, 116, 95, 10, 95, 67, 20, 50, 90, 99, 44, 32, 62, 50, 26};
    }

    private static byte[] jeprfdylwajbilm() {
        return new byte[]{-105, -107, 79, 32, 66, 5, 62, 0, 119, 84, 3, 31, 85, 126, 22, 100, 6, 89, 108, 11, 72, 106, 66, 29, 60, 15, 119, 81, 6, 14, 82, 123, 22, 100};
    }

    private static byte[] jzkmanspegkuwaa() {
        return new byte[]{-105, -107, 73, -30, 65, 4, 56, 43, 123, 97, 3, 32, 83, 60, 21, 96, 0, 90, 96, 6, 72, 39, 68, 27, 63, 14, 113, 78, 10, 7, 82, 124, 16, 98, 7, 75, 106, 26, 65, 63, 69, 78, 58, 6, 118, 95, 0, 79, 91, 124, 17, 122, 2, 88, 109, 17, 75, 37, 76, 2, 59, 26, 115, 72, 7, 27, 81, 57, 24, 105, 3, 66, 104, 24, 76, 44, 70, 8, 50, 0, 114, 64, 2, 14, 86, 58};
    }

    private static byte[] aozuqttcgzfkznc() {
        return new byte[]{-98, -112, 64, -27, 67, 9, 60, 61, 123, 95, 6, 2, 84, 124, 21, 109, 5, 24, 96, 79, 64, 109, 67, 25, 60, 13, 123, 88, 6, 2, 84, 125, 21, 99, 5, 2, 96, 83, 64, 35, 67, 12, 60, 3, 123, 98, 6, 22, 84, 118, 21, 106, 5, 71, 96, 29, 64, 124};
    }

    private static byte[] qpvqlxmnpwjkzta() {
        return new byte[]{-98, -100, 76, 45, 64, 6, 51, 64, 114, 92, 10, 10, 85, 106, 22, 106, 0, 66, 96, 16, 76, 48, 64, 0, 51, 2, 114, 66};
    }

    private static byte[] yndhwwlyiyaoqtj() {
        return new byte[]{-98, -100, 76, 102, 64, 25, 51, 8, 114, 94, 10, 2, 85, 113, 22, 116, 0, 88, 96, 10, 76, 44, 64, 7, 51, 72};
    }

    private static byte[] bjulpbqongyifur() {
        return new byte[]{-98, -100, 76, 39, 64, 6, 51, 3, 114, 89, 10, 27, 85, 123, 22, 104, 0, 89, 96, 6, 76, 109, 64, 26, 51, 8, 114, 88, 10, 14, 85, 126, 22, 108};
    }

    private static byte[] jjgfwdvnxdqbnik() {
        return new byte[]{-105, -107, 65, -21, 76, 9, 50, 36, 115, 78, 3, 29, 91, 116, 24, 103, 10, 65, 104, 11, 72, 100, 76, 39, 50, 44, 123, 109, 2, 78, 82, 115, 24, 114, 10, 66, 96, 11, 73, 36, 69, 28, 50, 72, 123, 1, 10, 56, 83, 116, 17, 106, 10, 66, 96, 29, 65, 34, 68, 75, 59, 27, 123, 94, 10, 10, 91, 62, 16, 107, 3, 11, 96, 21, 65, 40, 76, 2, 58, 7, 114, 64, 10, 67, 91, 119, 24, 121, 2, 67, 105, 8, 65, 41, 76, 24, 50, 67};
    }

    private static int tlyvdcittrcrkezd(int i, int i2) {
        return i ^ i2;
    }
}
