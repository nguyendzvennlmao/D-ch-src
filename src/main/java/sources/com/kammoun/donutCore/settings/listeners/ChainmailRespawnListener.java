package com.kammoun.donutCore.settings.listeners;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.settings.SettingsPlugin;
import com.kammoun.donutCore.settings.manager.SettingsManager;
import com.kammoun.donutCore.settings.models.enums.SettingType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class ChainmailRespawnListener implements Listener {
    private final SettingsPlugin plugin;

    private static int f936qdVpTR0Ll = 0;
    private transient int rK4OiPqbrs = 1395932111;
    private static String qbwyiuhakx;
    private static String[] nothing_to_see_here = new String[15];

    public ChainmailRespawnListener(com.kammoun.donutCore.settings.SettingsPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.listeners.ChainmailRespawnListener.<init>(com.kammoun.donutCore.settings.SettingsPlugin, int):void");
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerRespawn(PlayerRespawnEvent playerRespawnEvent) {
        int i = 312591734 ^ (515785880 ^ 1121014165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1987478490) {
            int i2 = 494348455 ^ i;
            Player player = playerRespawnEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1647327518) {
                i = 77466974 ^ i2;
                if (playerRespawnEvent.getRespawnReason() != PlayerRespawnEvent.RespawnReason.END_PORTAL) {
                    int fikpicekozqpmrxc = fikpicekozqpmrxc(i, 324603661);
                    SettingsManager settingsManager = this.plugin.getSettingsManager(115064052);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fikpicekozqpmrxc) != 603444346) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fikpicekozqpmrxc) == 603444346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fikpicekozqpmrxc) == (1833969610 ^ fikpicekozqpmrxc)) {
                                break;
                            }
                        }
                        int i3 = 371379649 ^ fikpicekozqpmrxc;
                        throw new RuntimeException("double");
                    }
                    i2 = 1210391658 ^ fikpicekozqpmrxc;
                    boolean setting = settingsManager.getSetting(player.getUniqueId(), SettingType.CHAINMAIL_ON_RESPAWN, 1934918589);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1658795816) {
                        i2 = 935726802 ^ i2;
                        if (setting != (1000204343 ^ i2)) {
                            int fikpicekozqpmrxc2 = fikpicekozqpmrxc(i2, 37841485);
                            giveChainmailArmor(player, 968116537);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fikpicekozqpmrxc2) == -823913519) {
                                int i4 = 617772361 ^ fikpicekozqpmrxc2;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fikpicekozqpmrxc2) == -823913519 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fikpicekozqpmrxc2) == (1621552477 ^ fikpicekozqpmrxc2)) {
                                    break;
                                }
                            }
                            int i5 = 708004570 ^ fikpicekozqpmrxc2;
                            throw new IllegalAccessException("double");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -588299847) {
                            int i6 = 1289826906 ^ i2;
                            return;
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1187009518) {
                    int i7 = 197961153 ^ i;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1647327518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2076915919 ^ i2)) {
                    int i8 = 1010474086 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1142500501 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1980331293 ^ i2)) {
                        int i9 = 743037384 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1658795816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (757698700 ^ i2)) {
                            int i10 = 7523124 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -413498854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (634271264 ^ i2)) {
                                int i11 = 739247130 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -588299847 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1916286639 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            int i12 = 900011240 ^ i2;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1187009518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (155448215 ^ i)) {
                int i13 = 212510515 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1987478490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (380290924 ^ i)) {
                    break;
                }
            }
        }
        int i14 = 879937614 ^ i;
        throw new IOException("double");
    }

    @EventHandler
    public void onPlayerFirstJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 586396473 ^ (1106702115 ^ 1121014165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 245394553) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 245394553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (878744250 ^ i)) {
                    int i2 = 1689169086 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1517782323 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (519546323 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 410679556 ^ i;
            throw new RuntimeException("double");
        }
        int i4 = 829301611 ^ i;
        if (playerJoinEvent.getPlayer().hasPlayedBefore() != (280637156 ^ i4)) {
            int i5 = 2079645250 ^ i4;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2049870048) {
            i4 = 2051114270 ^ i4;
            giveChainmailArmor(playerJoinEvent.getPlayer(), 968116537);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1474125779) {
                int i6 = 1456702734 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2049870048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (424717360 ^ i4)) {
                int i7 = 1228904880 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1474125779 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1591215235 ^ i4)) {
                    break;
                }
            }
        }
        int i8 = 1892606717 ^ i4;
        throw new IOException();
    }

    private void giveChainmailArmor(Player player, int i) {
        int i2 = 1006056810 ^ (590448995 ^ 1121014165);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -792761118) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -792761118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1650292790 ^ i2)) {
                    break;
                }
            }
            int i3 = 1432859214 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 42744943 ^ i2;
        SchedulerUtil.runLater(()
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.listeners.ChainmailRespawnListener.giveChainmailArmor(org.bukkit.entity.Player, int):void");
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
        qbwyiuhakx = ByteBuffer.wrap(ndovibchaltgxec()).asCharBuffer().toString();
        f936qdVpTR0Ll = 1036521423 ^ new Random(-8476313490349671080L).nextInt();
    }

    public static String szphrzaawl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = qbwyiuhakx.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ndovibchaltgxec() {
        return new byte[0];
    }

    private static int fikpicekozqpmrxc(int i, int i2) {
        return i ^ i2;
    }
}
