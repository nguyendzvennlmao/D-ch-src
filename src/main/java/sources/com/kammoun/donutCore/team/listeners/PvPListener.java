package com.kammoun.donutCore.team.listeners;

import com.kammoun.donutCore.team.TeamPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.event.Listener;

public class PvPListener implements Listener {
    private final TeamPlugin teamPlugin;
    private static int X1U6wxmYMS = 0;
    private transient int LEgDww3gll = 1393552783;
    private static String qktmfdpdpr;
    private static String[] nothing_to_see_here = new String[13];

    public PvPListener(TeamPlugin teamPlugin, int i) {
        int i2 = 495784039 ^ (1607308937 ^ 1728461742);
        int parseInt = 139662052 ^ (962714489 ^ Integer.parseInt("343176413"));
        this.LEgDww3gll = 1393552783 ^ X1U6wxmYMS;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 137964522:
                    parseInt = 1091693608 ^ parseInt;
                    break;
                case 698918417:
                default:
                    throw new RuntimeException();
                case 704723538:
                    break;
                case 1543309374:
            }
        }
        this.teamPlugin = teamPlugin;
        int i3 = 1522280194 ^ (760503241 ^ parseInt);
    }

    @org.bukkit.event.EventHandler
    public void onPlayerDamageTeam(org.bukkit.event.entity.EntityDamageByEntityEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.listeners.PvPListener.onPlayerDamageTeam(org.bukkit.event.entity.EntityDamageByEntityEvent):void");
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⣠⣶⡾⠏⠉⠙⠳⢦⡀⠀⠀⠀⢠⠞⠉⠙⠲⡀⠀    ";
        nothing_to_see_here[2] = "⠀⠀⠀⣴⠿⠏⠀⠀⠀⠀⠀⠀⢳⡀⠀⡏⠀⠀⠀⠀⠀⢷     ";
        nothing_to_see_here[3] = "⠀⠀⢠⣟⣋⡀⢀⣀⣀⡀⠀⣀⡀⣧⠀⢸⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[4] = "⠀⠀⢸⣯⡭⠁⠸⣛⣟⠆⡴⣻⡲⣿⠀⣸⠀⠀OK⠀ ⡇    ";
        nothing_to_see_here[5] = "⠀⠀⣟⣿⡭⠀⠀⠀⠀⠀⢱⠀⠀⣿⠀⢹⠀⠀⠀⠀⠀ ⡇    ";
        nothing_to_see_here[6] = "⠀⠀⠙⢿⣯⠄⠀⠀⠀⢀⡀⠀⠀⡿⠀⠀⡇⠀⠀⠀⠀⡼     ";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠹⣶⠆⠀⠀⠀⠀⠀⡴⠃⠀⠀⠘⠤⣄⣠⠞⠀     ";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⢸⣷⡦⢤⡤⢤⣞⣁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[9] = "⠀⠀⢀⣤⣴⣿⣏⠁⠀⠀⠸⣏⢯⣷⣖⣦⡀⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[10] = "⢀⣾⣽⣿⣿⣿⣿⠛⢲⣶⣾⢉⡷⣿⣿⠵⣿⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[11] = "⣼⣿⠍⠉⣿⡭⠉⠙⢺⣇⣼⡏⠀⠀⠀⣄⢸⠀⠀⠀⠀⠀⠀    ";
        nothing_to_see_here[12] = "⣿⣿⣧⣀⣿.........⣀⣰⣏⣘⣆⣀⠀⠀       ";
        qktmfdpdpr = ByteBuffer.wrap(aiinbdyhfckunmk()).asCharBuffer().toString();
        X1U6wxmYMS = 2038247720 ^ new Random(1757241741160551357L).nextInt();
    }

    public static String qjqfzdphlm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = qktmfdpdpr.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] aiinbdyhfckunmk() {
        return new byte[0];
    }

    private static int ymlxlaqwutkpozcu(int i, int i2) {
        return i2 ^ i;
    }
}
