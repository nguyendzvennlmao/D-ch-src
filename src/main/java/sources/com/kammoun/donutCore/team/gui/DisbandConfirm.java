package com.kammoun.donutCore.team.gui;

import com.kammoun.donutCore.team.TeamPlugin;
import com.kammoun.utils.jackson.annotation.JsonProperty;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class DisbandConfirm extends ConfirmationMenu implements Listener {
    private final TeamPlugin teamPlugin;
    private static int XIAErMYfx5 = 0;
    private transient int GrtFzkXO1K = 2122635695;
    private static String ytvzrzrxdb;
    private static String[] nothing_to_see_here = new String[15];

    public DisbandConfirm(TeamPlugin teamPlugin, int i) {
        super("&c&lDisband Team", "&a&lConfirm Disband", "&c&lCancel", new String[]{"&7Click to confirm", "&7that you want to", "&cdisband your team", JsonProperty.USE_DEFAULT_NAME, "&c&lThis cannot be undone!"}, new String[]{"&7Click to cancel", "&7and keep your team"}, 1166003717);
        int i2 = 19738665 ^ (1351269166 ^ 49737734);
        int parseInt = 1552598324 ^ (361920751 ^ Integer.parseInt("441042650"));
        this.GrtFzkXO1K = 2122635695 ^ XIAErMYfx5;
        int tpzjfiqgehofjycd = 930706275 ^ tpzjfiqgehofjycd(parseInt, 311991206);
        this.teamPlugin = teamPlugin;
        Bukkit.getPluginManager().registerEvents(this, teamPlugin.getApi(2142241109));
        int i3 = 222100832 ^ (695017785 ^ tpzjfiqgehofjycd);
    }

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent inventoryClickEvent) {
        int i = 647874752 ^ (833176641 ^ 1325796150);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1047249478) {
            i = 34615615 ^ i;
            handleClick(inventoryClickEvent, 1096720832);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -787106750) {
                int i2 = 581015313 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1004991285 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1277112451 ^ i)) {
                int i3 = 1348915155 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1047249478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1476431475 ^ i)) {
                    int i4 = 375177592 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -787106750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2074370234 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 187663597 ^ i;
        throw new IOException();
    }

    @Override
    public void onConfirm(org.bukkit.entity.Player r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.gui.DisbandConfirm.onConfirm(org.bukkit.entity.Player, int):void");
    }

    @Override
    public void onDecline(Player player, int i) {
        int i2 = 2083417831 ^ (935408477 ^ 1325796150);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 659207264) {
            i2 = 1357650329 ^ i2;
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1.0f, 1.0f);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1607829334) {
                int i3 = 1440011546 ^ i2;
                player.sendMessage(eeufpruohh(bjiaruzaiklhvci(), i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 244109432) {
                    int i4 = 2083521761 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 244109432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (198513227 ^ i3)) {
                        break;
                    }
                }
                int i5 = 207180002 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 659207264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (813540072 ^ i2)) {
                int i6 = 1006751064 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -284362893 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (256569465 ^ i2)) {
                    int i7 = 399544322 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1607829334 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1083473111 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1524668686 ^ i2;
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
        ytvzrzrxdb = ByteBuffer.wrap(vsvdkjirfxvluzb()).asCharBuffer().toString();
        XIAErMYfx5 = 1482376294 ^ new Random(-4152652009156423953L).nextInt();
    }

    public static String eeufpruohh(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ytvzrzrxdb.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ctdlutcepftpwon() {
        return new byte[]{0, 0, 0, 58, 0, 0, 0, 0};
    }

    private static byte[] sbicgcokdvnhidk() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 58};
    }

    private static byte[] bjiaruzaiklhvci() {
        return new byte[]{0, 0, 0, 25, 0, 0, 0, 64};
    }

    private static byte[] vsvdkjirfxvluzb() {
        return new byte[]{49, -105, 56, 91, 51, 115, 50, 82, 55, 80, 49, 92, 56, 93, 51, 81, 50, 19, 55, 77, 49, 95, 56, 24, 51, 81, 50, 90, 55, 74, 49, 82, 56, 89, 51, 91, 50, 87, 55, 25, 49, 68, 56, 93, 51, 84, 50, 94, 55, 23, 49, 16, 56, 104, 51, 89, 50, 86, 55, 88, 49, 67, 56, 93, 51, 21, 50, 80, 55, 86, 49, 94, 56, 76, 51, 84, 50, 80, 55, 77, 49, 16, 56, 89, 51, 91, 50, 19, 55, 88, 49, 84, 56, 85, 51, 92, 50, 93, 55, 80, 49, 67, 56, 76, 51, 71, 50, 82, 55, 77, 49, 95, 56, 74, 51, 27, 55, 29, 51, 71, 48, 92, 49, 80, 52, 90, 56, 22, 51, -105, 53, 6, 51, 98, 55, 92, 51, 81, 53, 92, 51, 22, 55, 93, 51, 89, 53, 66, 51, 84, 55, 88, 51, 94, 53, 85, 51, 22, 55, 90, 51, 81, 53, 95, 51, 85, 55, 92, 51, 92, 53, 93, 51, 83, 55, 93, 51, 30};
    }

    private static int tpzjfiqgehofjycd(int i, int i2) {
        return i2 ^ i;
    }
}
