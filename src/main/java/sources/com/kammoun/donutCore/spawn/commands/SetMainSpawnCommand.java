package com.kammoun.donutCore.spawn.commands;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.spawn.SpawnPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.command.CommandSender;

public class SetMainSpawnCommand extends KCommand {
    private final SpawnPlugin plugin;
    private static int QbDKm8uKU9 = 0;
    private transient int YF3Uf0zyyV = 1647816554;
    private static byte[] dyxveedrhi;
    private static String[] nothing_to_see_here = new String[17];

    public SetMainSpawnCommand(SpawnPlugin spawnPlugin, int i) {
        super("setmainspawn", "spawn.admin", false, 1862853155);
        int i2 = 636252529 ^ (1616718937 ^ 80423873);
        int parseInt = 1306509427 ^ (761674766 ^ Integer.parseInt("566463124"));
        this.YF3Uf0zyyV = 1647816554 ^ QbDKm8uKU9;
        this.plugin = spawnPlugin;
        int i3 = 1253602767 ^ (1611698643 ^ (857923325 ^ parseInt));
    }

    @Override
    public void execute(org.bukkit.command.CommandSender r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawn.commands.SetMainSpawnCommand.execute(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    @Override
    public List onTab(CommandSender commandSender, String[] strArr, int i) {
        int i2 = 1314643391 ^ (1350837431 ^ 281917050);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1888648080) {
            int i3 = 1705241848 ^ i2;
            if (strArr.length != ((byte) (1806803851 ^ i3))) {
                int i4 = 1431688322 ^ i3;
                return new ArrayList();
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1569528915) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1569528915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (734062267 ^ i3)) {
                        break;
                    }
                }
                int i5 = 88281957 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i6 = 1369328183 ^ i3;
            ArrayList arrayList = new ArrayList();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -780186135) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -780186135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (18612893 ^ i6)) {
                        break;
                    }
                }
                int i7 = 62415354 ^ i6;
                throw new RuntimeException("double");
            }
            int i8 = 382076981 ^ i6;
            arrayList.add(czielcmpva(tzfhvtnjfeazhun(), i8));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1733233729) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1733233729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (736723402 ^ i8)) {
                        break;
                    }
                }
                int i9 = 1450763593 ^ i8;
                throw new IOException("double");
            }
            i2 = 1561252643 ^ i8;
            arrayList.addAll(this.plugin.getSpawns(871924923).keySet());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1892051621) {
                int i10 = 2053909984 ^ i2;
                return arrayList;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1888648080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (159292838 ^ i2)) {
                int i11 = 696591358 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1549335128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (180427217 ^ i2)) {
                    int i12 = 86203247 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1892051621 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1823277107 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i13 = 1070767400 ^ i2;
        throw new IllegalAccessException();
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
        dyxveedrhi = vrlhtrupbwvjsoz();
        QbDKm8uKU9 = (-177211721) ^ new Random(9151661819454472356L).nextInt();
    }

    public static String czielcmpva(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ dyxveedrhi[i3 % dyxveedrhi.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] vrlhtrupbwvjsoz() {
        return new byte[]{105, 47, 98, 33, 88, 101, 105, 72, 95, 85, 25, 42, 58, 106, 52, 60, 61, 35, 101, 91, 7, 69, 25, 67, 12, 91, 109, 52, 70, 36, 74, 83, 90, 79, 40, 104, 106, 100, 68, 106, 80, 3, 80, 107, 25, 94, 84, 64, 73, 56, 10, 83, 112, 110, 69, 21, 117, 46, 50, 104, 1, 4, 71, 21, 16, 89, 96, 90, 41, 17, 71, 49, 62, 56, 125, 36, 83, 48, 34, 66, 85, 15, 11, 41, 99, 70, 41, 108};
    }

    private static byte[] igzvpcscchrlwmt() {
        return new byte[]{-81, -28, 86, 69, 105, 32, 95, 29, 106, 26, 45, 112};
    }

    private static byte[] dudtqvgafmdmyev() {
        return new byte[]{-91, -31, 81, 49, 104, 63, 92, 55, 106, 9, 43, 119, 9, 37, 4, 37, 8, 99, 80, 5, 53, 21, 42, 12, 60, 7, 88, 118, 115, 101, 120, 66, 105, 26, 24, 48, 95, 58, 113, 120, 98, 87, 99, 37, 41, 2, 97, 19, 124, Byte.MAX_VALUE, 56, 22, 67, 61, 117, 12, 64, 106, 7, 50, 51, 92, 116, 80, 32, 64, 85, 9, 28, 76, 117, 109, 13, 99, 77, 124, 102, 110, 23, 20, 103, 31};
    }

    private static byte[] qjgiavzpivgczah() {
        return new byte[]{-90, -29, 86, 49, 97, 123, 94, 78, 105, 0, 40, 53, 14, Byte.MAX_VALUE, 13, 41, 10, 58, 83, 89, 54, 16, 45, 90, 53, 75, 90, 38, 112, 57, 123, 81, 110, 28};
    }

    private static byte[] tzfhvtnjfeazhun() {
        return new byte[]{-96, -27, 81, 71, 106, 32, 88, 27, 103, 21, 44, 119};
    }

    private static int quzmjifjcwgubfoj(int i, int i2) {
        return i2 ^ i;
    }
}
