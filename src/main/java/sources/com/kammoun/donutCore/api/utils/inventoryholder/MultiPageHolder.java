package com.kammoun.donutCore.api.utils.inventoryholder;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class MultiPageHolder implements InventoryHolder {
    private final int currentPage;
    private final int maxPage;
    private Inventory inventory;
    private static int lYGl39gin2 = 0;
    private transient int JZgnlofqpE = 858182811;
    private static String ehmvpgczth;
    private static String[] nothing_to_see_here = new String[15];

    public MultiPageHolder(int i, int i2) {
        int i3 = 1576703724 ^ (168913711 ^ 1602843153);
        int parseInt = 1610735452 ^ (1294594701 ^ Integer.parseInt("625648131"));
        this.JZgnlofqpE = 858182811 ^ lYGl39gin2;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 4128452:
                    parseInt = 1236165635 ^ parseInt;
                    break;
                case 186210496:
                case 988779444:
                    break;
                case 1323029881:
                default:
                    throw new IllegalAccessException();
            }
        }
        this.currentPage = i;
        this.maxPage = i2;
        int i4 = 1837062729 ^ (626744645 ^ (664479166 ^ parseInt));
    }

    @NotNull
    public Inventory getInventory() {
        int i = 2024904570 ^ (1800241599 ^ 308898516);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 212590728) {
            int i2 = 1278151547 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 212590728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1967099323 ^ i)) {
                int i3 = 1525749391 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1842592594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1935745597 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1518187309 ^ i;
        throw new IOException();
    }

    @Generated
    public int getCurrentPage() {
        int i = 2074204836 ^ (1095777794 ^ 308898516);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1153725329) {
            int i2 = 1462530817 ^ i;
            return this.currentPage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -39326821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (796032762 ^ i)) {
                int i3 = 2013894454 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1153725329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (656474976 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 799837669 ^ i;
        throw new IOException();
    }

    @Generated
    public int getMaxPage() {
        int i = 897423541 ^ (995999504 ^ 308898516);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -498439288) {
            int i2 = 1755576362 ^ i;
            return this.maxPage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -498439288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (559789353 ^ i)) {
                int i3 = 1663484468 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1487557925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1648168901 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1697855898 ^ i;
        throw new IllegalAccessException();
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
        ehmvpgczth = ByteBuffer.wrap(kbouvyldjaarrpn()).asCharBuffer().toString();
        lYGl39gin2 = (-1783002880) ^ new Random(5677978520737354014L).nextInt();
    }

    public static String iphoswytjt(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ehmvpgczth.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] kbouvyldjaarrpn() {
        return new byte[0];
    }
}
