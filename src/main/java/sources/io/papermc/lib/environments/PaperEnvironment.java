package io.papermc.lib.environments;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class PaperEnvironment extends SpigotEnvironment {

    private static int f1346yvakuFAIF = 0;
    private transient int sw3B3W9dES = 463910401;
    private static String uciamvoksl;
    private static String[] nothing_to_see_here = new String[15];

    public PaperEnvironment() {
        throw new UnsupportedOperationException("Method not decompiled: io.papermc.lib.environments.PaperEnvironment.<init>():void");
    }

    @Override
    public String getName() {
        int i = 90776296 ^ (1943483602 ^ 992334493);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1826497850) {
            return suxdlutyoj(fsennmpmdswfxtq(), 348017603 ^ i);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1826497850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1162334158 ^ i)) {
                int i2 = 337233868 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -919815390 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1967985006 ^ i)) {
                    break;
                }
            }
        }
        int i3 = 768623059 ^ i;
        throw new RuntimeException();
    }

    @Override
    public boolean isPaper(int i) {
        int i2 = 1842037241 ^ (1324353433 ^ 992334493);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1057708056) {
            return (byte) (481721909 ^ (78179017 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1057708056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2064636676 ^ i2)) {
                int i3 = 1811660667 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -441192032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (938978292 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 2054389929 ^ i2;
        throw new RuntimeException();
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
        uciamvoksl = ByteBuffer.wrap(dlhfdnusanvkpkx()).asCharBuffer().toString();
        f1346yvakuFAIF = (-1274915838) ^ new Random(-70573180774706379L).nextInt();
    }

    public static String suxdlutyoj(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = uciamvoksl.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] fsennmpmdswfxtq() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
    }

    private static byte[] dlhfdnusanvkpkx() {
        return new byte[]{49, 100, 57, 84, 54, 67, 53, 93, 49, 64};
    }

    private static int qcbkcdslvcjhdcee(int i, int i2) {
        return i ^ i2;
    }
}
