package com.kammoun.donutCore.team.gui;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class KickConfirm extends ConfirmationMenu implements Listener {
    private final OfflinePlayer targetPlayer;
    private static int gSaXN5h7Ie = 0;
    private transient int jBXbIkEBzy = 1288192786;
    private static byte[] mdbbnbzouj;
    private static String[] nothing_to_see_here = new String[15];

    public KickConfirm(org.bukkit.OfflinePlayer r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.KickConfirm.<init>(org.bukkit.OfflinePlayer, int):void");
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent inventoryClickEvent) {
        int i = 1031320124 ^ (165039235 ^ 1479462928);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1677817211) {
            i = 864790207 ^ i;
            handleClick(inventoryClickEvent, 1096720832);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -128171902) {
                int i2 = 815217308 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1677817211 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2117182468 ^ i)) {
                int i3 = 199148724 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -128171902 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1596025918 ^ i)) {
                    int i4 = 2049947212 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2095420515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1902495248 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 69455954 ^ i;
        throw new RuntimeException();
    }

    @Override
    public void onConfirm(org.bukkit.entity.Player r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.KickConfirm.onConfirm(org.bukkit.entity.Player, int):void");
    }

    @Override
    public void onDecline(Player player, int i) {
        int i2 = 898906794 ^ (552200315 ^ 1479462928);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1788352010) {
            i2 = 2053856814 ^ i2;
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0f, 1.0f);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1178409095) {
                i2 = 460150209 ^ i2;
                player.sendMessage(ocxrlycawm(nypkkhueclmawzs(), i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1655196017) {
                    int i3 = 1965551132 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -879281774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (498254341 ^ i2)) {
                int i4 = 1893759207 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1788352010 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1277848233 ^ i2)) {
                    int i5 = 150811266 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1655196017 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (790545243 ^ i2)) {
                        int i6 = 1150010966 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1178409095 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (374322558 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 710556373 ^ i2;
        throw new IllegalAccessException();
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
        mdbbnbzouj = xskkqjgfhgxbjra();
        gSaXN5h7Ie = 1226409971 ^ new Random(-1450382353857728375L).nextInt();
    }

    public static String ocxrlycawm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ mdbbnbzouj[i3 % mdbbnbzouj.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] xskkqjgfhgxbjra() {
        return new byte[]{83, 4, 26, 38, 111, 66, 57, 77, 43, 24, 3, 32, 9, 9, 89, 65, 32, 113, 43, 118, 61, 84, 119, 70, 64, 58, 74, 98, 65, 31, 94, 31, 73, 64, 10, 29, 76, 28, 36, 33, 118, 25};
    }

    private static byte[] hbhbbvegfwctqtm() {
        return new byte[]{-102, -54, 46, -77, 90, 22, 1, 58, 28, 78, 50, 125, 59, 80, 110, 28, 17, 34, 28, 103, 9, 18, 66, 30, 120, 43, 125, 62, 112, 66, 108, 73, 126, 19, 59, 10, 123, 93, 16, Byte.MAX_VALUE, 67, 79, 107, 76, 45, 116, 94, 4, 11, 86, 28, 0, 50, 71, 62, 84, 109, 22, 21, 39, 19, 52, 10, 6, 70, 82, 114, 123, 125, 40, 112, 81, 105, 14, 125, 19, 63, 77, 116, 76, 19, Byte.MAX_VALUE, 71, 67, 97, 31};
    }

    private static byte[] sgflabxhkaxtguo() {
        return new byte[]{-100, -55, 44, 109, 87, 10, 8, 21, 31, 78, 50, 107, 63, 92, 97, 11, 17, 56};
    }

    private static byte[] zqogfrmkbaeefjq() {
        return new byte[]{-104, -53, 46, 100, 91, 1, 13, 22, 18, 76, 51, 109, 48, 88, 106, 7, 23, 53};
    }

    private static byte[] nypkkhueclmawzs() {
        return new byte[]{-102, -49, 41, -74, 88, 69, 13, 55, 31, 70, 55, 112, 62, 85, 105, 85, 17, 38, 28, 35, 14, 13, 64, 21, 116, 110, 126, 57, 117, 64, 105, 77, 121, 16, 59, 7};
    }

    private static int zdfszhwfxrriywnw(int i, int i2) {
        return i2 ^ i;
    }
}
