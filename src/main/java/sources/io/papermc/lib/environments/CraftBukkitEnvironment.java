package io.papermc.lib.environments;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class CraftBukkitEnvironment extends Environment {

    private static int f1326MLaHa2hdw = 0;

    private transient int f1333jGDDde4W4 = 1487934886;
    private static byte[] nlbqxzskek;
    private static String[] nothing_to_see_here = new String[15];

    public CraftBukkitEnvironment() {
        throw new UnsupportedOperationException("Method not decompiled: io.papermc.lib.environments.CraftBukkitEnvironment.<init>():void");
    }

    @Override
    public String getName() {
        int i = 749196913 ^ (900790958 ^ 2101484769);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 581534195) {
            return zohmgtdxvx(jmjngudggtodjbd(), 1905106741 ^ i);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1362790312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (384312219 ^ i)) {
                int i2 = 2079973127 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 581534195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1555198124 ^ i)) {
                    break;
                }
            }
        }
        int i3 = 477366770 ^ i;
        throw new IllegalAccessException();
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
        nlbqxzskek = ougxbdkueinvzdy();
        f1326MLaHa2hdw = 1613173528 ^ new Random(762159628207850554L).nextInt();
    }

    public static String zohmgtdxvx(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ nlbqxzskek[i3 % nlbqxzskek.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] ougxbdkueinvzdy() {
        return new byte[]{78, 11, 102, 69, 20, 22, 118, 83, 84, 41, 85, 118, 68, 49, 22, 87, 67, 16, 9, 105, 90, 63, 3, 40, 6, 27, 101, 55, 124, 22, 54, 11, 59, 95, 102, 58, 53, 23, 33, 8, 93, 99, 125, 12, 113, 125, 27, 114, 121, 123, 27, 76, 5, 121, 65, 123, 96, 40, 113, 40, 10, 3, 7, 105, 43, 32, 48, 10, 108, 36, 48, 74, 44, 2, 68, 94, 125, 101, 57, 26, 80, 31, 102, 16, 81, 56, 94, 96, 77, 114, 60, 106, 1, 57};
    }

    private static byte[] jmjngudggtodjbd() {
        return new byte[]{-125, -62, 80, 51, 38, 86, 71, 0, 103, 124, 99, 52, 113, 65, 36, 19, 113, 72, 58, 52, 108, 99, 49, 110};
    }

    private static int nvmcrxjqomoozxsg(int i, int i2) {
        return i2 ^ i;
    }
}
