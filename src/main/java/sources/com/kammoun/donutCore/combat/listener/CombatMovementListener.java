package com.kammoun.donutCore.combat.listener;

import com.kammoun.donutCore.combat.CombatPlugin;
import com.kammoun.donutCore.combat.config.CombatConfig;
import com.kammoun.donutCore.combat.manager.CombatManager;
import com.kammoun.donutCore.combat.utils.WorldGuardUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

public class CombatMovementListener implements Listener {
    private final CombatPlugin plugin;
    private final CombatManager combatManager;
    private final CombatConfig config;
    private final WorldGuardUtil worldGuardUtil;

    private static int f211PHd06TH74 = 0;
    private transient int uowAmdglfx = 1290464921;
    private static String[] nothing_to_see_here = new String[15];

    public CombatMovementListener(CombatPlugin combatPlugin, int i) {
        int i2 = 2111197233 ^ (1820685608 ^ 369836084);
        int parseInt = 411071848 ^ (313882437 ^ Integer.parseInt("225273600"));
        this.uowAmdglfx = 1290464921 ^ f211PHd06TH74;
        this.plugin = combatPlugin;
        this.combatManager = combatPlugin.getCombatManager(1742848135);
        this.config = combatPlugin.getCombatConfig(1983292249);
        this.worldGuardUtil = combatPlugin.getWorldGuardUtil(812440072);
        int i3 = 1814400783 ^ (1742364971 ^ (392175939 ^ (61391857 ^ (78829732 ^ (1130772178 ^ parseInt)))));
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onToggleGlide(EntityToggleGlideEvent entityToggleGlideEvent) {
        int i;
        int i2 = 337316302 ^ (909022603 ^ 1752804074);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1382135162) {
            int i3 = 1985791211 ^ i2;
            Player entity = entityToggleGlideEvent.getEntity();
            if ((entity instanceof Player) == (1007743556 ^ i3)) {
                tcftyzrhlhytdzuj(i3, 2044674415);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -527986143) {
                int i4 = 2035629683 ^ i3;
                Player player = entity;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 707682746) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 707682746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (133895497 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 356011541 ^ i4;
                    throw new RuntimeException("double");
                }
                i2 = 1184145600 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 512452536) {
                    int i6 = 659134329 ^ i2;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 115885051) {
                            throw new IOException();
                        }
                        throw null;
                    } catch (IOException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case 617077873:
                                i = 1602896663 ^ i6;
                                break;
                            case 1925313403:
                                i = 357205750 ^ i6;
                                break;
                            default:
                                throw new IOException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -661273397) {
                            int tcftyzrhlhytdzuj = tcftyzrhlhytdzuj(i, 93026539);
                            if (this.config.isDisableElytra(261834895) != (2124005490 ^ tcftyzrhlhytdzuj)) {
                                int i7 = 763569759 ^ tcftyzrhlhytdzuj;
                                if (this.combatManager.isInCombat(player, 452342611) != (1394271789 ^ i7)) {
                                    int tcftyzrhlhytdzuj2 = tcftyzrhlhytdzuj(i7, 49806125);
                                    if (entityToggleGlideEvent.isGliding() == (1374493952 ^ tcftyzrhlhytdzuj2)) {
                                        int i8 = 339059864 ^ tcftyzrhlhytdzuj2;
                                        return;
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(tcftyzrhlhytdzuj2) == -1888950270) {
                                        i2 = 559473744 ^ tcftyzrhlhytdzuj2;
                                        entityToggleGlideEvent.setCancelled((byte) (1890974033 ^ i2));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2052076925) {
                                            i3 = 2025266129 ^ i2;
                                            this.config.sendMessage(player, this.config.getElytraBlockedMessage(453415669), 888239100);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1075254280) {
                                                int i9 = 1306155801 ^ i3;
                                                return;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(tcftyzrhlhytdzuj2) == -1888950270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(tcftyzrhlhytdzuj2) == (71234093 ^ tcftyzrhlhytdzuj2)) {
                                                int i10 = 1882167629 ^ tcftyzrhlhytdzuj2;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                } else {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1730727574) {
                                        int i11 = 24527367 ^ i7;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1730727574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1534283071 ^ i7)) {
                                            int i12 = 1150997448 ^ i7;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            } else {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(tcftyzrhlhytdzuj) == -187825261) {
                                    int i13 = 878130035 ^ tcftyzrhlhytdzuj;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(tcftyzrhlhytdzuj) == -187825261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(tcftyzrhlhytdzuj) == (1501653230 ^ tcftyzrhlhytdzuj)) {
                                        int i14 = 846349607 ^ tcftyzrhlhytdzuj;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -661273397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1460563473 ^ i)) {
                                    int i15 = 1789832429 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 617077873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (550530468 ^ i)) {
                                        int i16 = 1205434854 ^ i;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1925313403 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1251595580 ^ i)) {
                                            int i17 = 1426677730 ^ i;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1075254280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2009212583 ^ i3)) {
                    int i18 = 2092403590 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -527986143 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1944388265 ^ i3)) {
                        int i19 = 802218581 ^ i3;
                        throw new RuntimeException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 512452536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1577881579 ^ i2)) {
                int i20 = 861830178 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1382135162 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1941270424 ^ i2)) {
                    int i21 = 637973012 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2052076925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (616671688 ^ i2)) {
                        int i22 = 1336758683 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 779983194 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1227990561 ^ i2)) {
                            int i23 = 1793298704 ^ i2;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.listener.CombatMovementListener.onPlayerMove(org.bukkit.event.player.PlayerMoveEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.listener.CombatMovementListener.onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent):void");
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
        f211PHd06TH74 = (-252495795) ^ new Random(2537793247848800231L).nextInt();
    }

    public static String gbmxiidloq(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ftyxfgdspwncetf() {
        return new byte[]{34, Byte.MAX_VALUE, 38, 6, 66, Byte.MAX_VALUE, 88, 15, 91, 108, 90, 84, 56, 34, 109, 106, 118, Byte.MAX_VALUE, 98, 121, 47, 83, 36, 45, 58, 100, 85, 100, 122, 120, 4, 29, 105, 68, 89, 40, 96, 42, 5, 51, 118, 5, 58, 44, 30, 77, 95, 63, 111, 116, 72};
    }

    private static int tcftyzrhlhytdzuj(int i, int i2) {
        return i ^ i2;
    }
}
