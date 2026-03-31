package com.kammoun.donutCore.combat.listener;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.combat.CombatPlugin;
import com.kammoun.donutCore.combat.config.CombatConfig;
import com.kammoun.donutCore.combat.manager.CombatManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class CombatLogoutListener implements Listener {
    private final CombatPlugin plugin;
    private final CombatManager combatManager;
    private final CombatConfig config;
    private static int IrYueKQiXY = 0;

    private transient int f208bpBobZRdO = 675974036;
    private static String[] nothing_to_see_here = new String[18];

    public CombatLogoutListener(CombatPlugin combatPlugin, int i) {
        ajbgnoanyqdjwpct(749098735 ^ 1106201693, 1127076108);
        int parseInt = 1655447174 ^ (2099302547 ^ Integer.parseInt("837289387"));
        this.f208bpBobZRdO = 675974036 ^ IrYueKQiXY;
        this.plugin = combatPlugin;
        this.combatManager = combatPlugin.getCombatManager(1742848135);
        this.config = combatPlugin.getCombatConfig(1983292249);
        int i2 = 410474089 ^ (701578675 ^ (208469420 ^ (1788485268 ^ (1328368502 ^ parseInt))));
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 1151233400 ^ (204125740 ^ 1026843238);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1408906861) {
            int i2 = 1744632255 ^ i;
            Player player = playerQuitEvent.getPlayer();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1813904280) {
                i = 203744396 ^ i2;
                if (this.combatManager.isInCombat(player, 452342611) != (509125633 ^ i)) {
                    int i3 = 1708947790 ^ i;
                    this.combatManager.forceExpireCombat(player.getUniqueId(), 847188178);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -601429381) {
                        int i4 = 838792090 ^ i3;
                        if (this.plugin.isServerStopping(1491055302) == (1249521365 ^ i4)) {
                            int i5 = 1264609605 ^ i4;
                            if (this.config.isKillOnLogout(1572540952) == (18499472 ^ i5)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 147995776) {
                                    int i6 = 955929980 ^ i5;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 147995776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (349648619 ^ i5)) {
                                        break;
                                    }
                                }
                                int i7 = 1800470609 ^ i5;
                                throw new IOException("double");
                            }
                            int ajbgnoanyqdjwpct = ajbgnoanyqdjwpct(i5, 1238902828);
                            player.setHealth(0.0d);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ajbgnoanyqdjwpct) != 1175682530) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ajbgnoanyqdjwpct) == 1175682530 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ajbgnoanyqdjwpct) == (818119937 ^ ajbgnoanyqdjwpct)) {
                                        break;
                                    }
                                }
                                int i8 = 607929832 ^ ajbgnoanyqdjwpct;
                                throw new IllegalAccessException("double");
                            }
                            i3 = 652734893 ^ ajbgnoanyqdjwpct;
                            String logoutDeathMessage = this.config.getLogoutDeathMessage(2108150582);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1898770571) {
                                i4 = 736245629 ^ i3;
                                if (logoutDeathMessage == null) {
                                    int i9 = 1156458506 ^ i4;
                                    return;
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 775768930) {
                                    i2 = 1360821608 ^ i4;
                                    if (logoutDeathMessage.isEmpty() != (349950980 ^ i2)) {
                                        int i10 = 368203106 ^ i2;
                                        return;
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1495359456) {
                                        int i11 = 299686847 ^ i2;
                                        String[] strArr = new String[(byte) (84348857 ^ i11)];
                                        strArr[(byte) (84348859 ^ i11)] = qkpdnmwtxz(tttrrdkyokkiaqh(), nuhuwttxqhzrwee(), i11);
                                        byte b = (byte) (84348858 ^ i11);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 674790872) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 674790872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (147647525 ^ i11)) {
                                                    break;
                                                }
                                            }
                                            int i12 = 241987762 ^ i11;
                                            throw new IllegalAccessException("double");
                                        }
                                        int i13 = 1383994348 ^ i11;
                                        strArr[b] = player.getName();
                                        String parsePlaceholders = PlaceHolderHelper.parsePlaceholders(logoutDeathMessage, strArr, 887737915);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -1144462662) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -822044831 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (383375767 ^ i13)) {
                                                    int i14 = 1562321735 ^ i13;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1144462662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (584195185 ^ i13)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i15 = 281622218 ^ i13;
                                            throw new RuntimeException("double");
                                        }
                                        int i16 = 1821993832 ^ i13;
                                        String color = ChatFormater.color(parsePlaceholders);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) != -553403911) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 1433350698 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (2035954844 ^ i16)) {
                                                    int i17 = 1359055932 ^ i16;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -553403911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (1938802507 ^ i16)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i18 = 1532696652 ^ i16;
                                            throw new IllegalAccessException("double");
                                        }
                                        i3 = 1025070738 ^ i16;
                                        Bukkit.broadcastMessage(color);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 935923048) {
                                            int i19 = 131113163 ^ i3;
                                            return;
                                        }
                                    }
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1406236330) {
                            int i20 = 14141584 ^ i4;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1406236330 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (889667363 ^ i4)) {
                                int i21 = 1605457701 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 775768930 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1789548173 ^ i4)) {
                                    break;
                                }
                            }
                        }
                        int i22 = 945493540 ^ i4;
                        throw new IOException("double");
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 935923048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2133184796 ^ i3)) {
                            int i23 = 619631266 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1548604318 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1269031613 ^ i3)) {
                                int i24 = 612924830 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 155978544 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (399470933 ^ i3)) {
                                    int i25 = 866451953 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1898770571 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (558330801 ^ i3)) {
                                        int i26 = 717485266 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -601429381 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (458020806 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i27 = 1147364587 ^ i3;
                    throw new IOException();
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -221962232) {
                    int i28 = 1244586381 ^ i;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1813904280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1996955151 ^ i2)) {
                    int i29 = 1627789556 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1495359456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1456209258 ^ i2)) {
                        break;
                    }
                }
            }
            int i30 = 324302747 ^ i2;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -221962232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (425989280 ^ i)) {
                int i31 = 1412513417 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1408906861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1804504059 ^ i)) {
                    break;
                }
            }
        }
        int i32 = 1349162927 ^ i;
        throw new IOException("double");
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠿⠟⠛⠻⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣆⣀⣀⠀⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠻⣿⣿⣿⠅⠛⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[5] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢼⣿⣿⣿⣃⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[6] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣟⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣛⣛⣫⡄⠀⢸⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡆⠸⣿⣿⣿⡷⠂⠨⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⡇⢀⣿⡿⠋⠁⢀⡶⠪⣉⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣷⣿⣿⣷⣦⡙⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣷⣦⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        IrYueKQiXY = (-886815965) ^ new Random(5870522918423678472L).nextInt();
    }

    public static String qkpdnmwtxz(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] nuhuwttxqhzrwee() {
        return new byte[]{47, 5, 89, 82, 38, 62, 15, 74, 3, 85, 4, 25, 82, 24, 72, 74, Byte.MAX_VALUE, 105, 91, 1};
    }

    private static byte[] tttrrdkyokkiaqh() {
        return new byte[]{-23, -50, 106, 29, 30, 118, 58, 31, 59, 0, 55, 84, 106, 69, 125, 1, 71, 32};
    }

    private static int ajbgnoanyqdjwpct(int i, int i2) {
        return i2 ^ i;
    }
}
