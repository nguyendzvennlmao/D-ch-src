package com.kammoun.donutCore.combat.listener;

import com.kammoun.donutCore.combat.CombatPlugin;
import com.kammoun.donutCore.combat.manager.CombatManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class CombatListener implements Listener {
    private final CombatPlugin plugin;
    private final CombatManager combatManager;
    private static int e6UEioBQ4z = 0;
    private transient int Nk7nYNPsTJ = 990583785;
    private static String jninhzfqom;
    private static String[] nothing_to_see_here = new String[19];

    public CombatListener(com.kammoun.donutCore.combat.CombatPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.listener.CombatListener.<init>(com.kammoun.donutCore.combat.CombatPlugin, int):void");
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent entityDamageByEntityEvent) {
        int i;
        int i2 = 1630383344 ^ (1712870745 ^ 1226833199);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1901077554) {
            int i3 = 1957394683 ^ i2;
            Player entity = entityDamageByEntityEvent.getEntity();
            if ((entity instanceof Player) == (981564541 ^ i3)) {
                int i4 = 1854677760 ^ i3;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -737418263) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -737418263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (849115876 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1963670595 ^ i3;
                throw new IOException("double");
            }
            int i6 = 1327935726 ^ i3;
            Player player = entity;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1388419941) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1388419941 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (336989112 ^ i6)) {
                        break;
                    }
                }
                int i7 = 299861536 ^ i6;
                throw new RuntimeException("double");
            }
            int i8 = 510889338 ^ i6;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1587679051) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1511114114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1423345617 ^ i8)) {
                        int i9 = 1708300730 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2004695698 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (247638354 ^ i8)) {
                            int i10 = 2097538619 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1587679051 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (838717724 ^ i8)) {
                                break;
                            }
                        }
                    }
                }
                int i11 = 1566178808 ^ i8;
                throw new RuntimeException("double");
            }
            int i12 = 198019421 ^ i8;
            try {
                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) == 171021509) {
                    throw new IOException();
                }
                throw null;
            } catch (IOException e) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                    case 13518243:
                        i = 35598843 ^ i12;
                        break;
                    case 2004695698:
                        i = 753491485 ^ i12;
                        break;
                    default:
                        throw new IllegalAccessException("Error in hash");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 272091771) {
                    int i13 = 325800232 ^ i;
                    Player playerAttacker = getPlayerAttacker(entityDamageByEntityEvent.getDamager(), 471764954);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1955773637) {
                        i2 = 400403345 ^ i13;
                        if (playerAttacker != null) {
                            i2 = bxzhchmtzkjrnpzi(i2, 1867440367);
                            if (playerAttacker.equals(player) == (167699225 ^ i2)) {
                                i2 = bxzhchmtzkjrnpzi(i2, 1407401463);
                                this.combatManager.setCombat(playerAttacker, player, 1904427035);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -789645454) {
                                    int i14 = 291497566 ^ i2;
                                    return;
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1341593800) {
                                int i15 = 1056538575 ^ i2;
                                return;
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 897589171) {
                            int i16 = 1236886804 ^ i2;
                            return;
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -1955773637 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (533653316 ^ i13)) {
                                int i17 = 1538937628 ^ i13;
                                throw new IOException("double");
                            }
                        }
                    }
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 272091771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (64950874 ^ i)) {
                            int i18 = 1437966634 ^ i;
                            throw new IOException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 897589171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1695076497 ^ i2)) {
                int i19 = 190154892 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -789645454 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1552494012 ^ i2)) {
                    int i20 = 1159171570 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1341593800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (708558085 ^ i2)) {
                        int i21 = 903847918 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1901077554 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (296770292 ^ i2)) {
                            int i22 = 127004214 ^ i2;
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerDeath(PlayerDeathEvent playerDeathEvent) {
        int i = 1246043884 ^ (1442781110 ^ 1226833199);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1255169110) {
            int i2 = 567743934 ^ i;
            Player entity = playerDeathEvent.getEntity();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1147728293) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 597022304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1343014977 ^ i2)) {
                        int i3 = 248740068 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1147728293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1286860804 ^ i2)) {
                            break;
                        }
                    }
                }
                int i4 = 1974535119 ^ i2;
                throw new IllegalAccessException("double");
            }
            i = 1187687710 ^ i2;
            this.combatManager.handleDeath(entity, 299781507);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1916639575) {
                i = 785776996 ^ i;
                Player killer = entity.getKiller();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -76386936) {
                    i = 1133776470 ^ i;
                    if (killer != null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -405659846) {
                            i = 713487239 ^ i;
                            this.combatManager.removeCombat(killer.getUniqueId(), (boolean) ((byte) (1987883105 ^ i)), 2023896097);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1276804349) {
                                int i5 = 1913522860 ^ i;
                                return;
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                            case 69517173:
                                int i6 = 1485371691 ^ i;
                                return;
                            case 332229957:
                                return;
                            case 854298436:
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -405659846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1907754630 ^ i)) {
                    int i7 = 733158725 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1276804349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (388821929 ^ i)) {
                        int i8 = 1328045281 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -76386936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1891810308 ^ i)) {
                            int i9 = 759603729 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1916639575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2095962653 ^ i)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i10 = 1928452367 ^ i;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1255169110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1801177989 ^ i)) {
                int i11 = 1520363643 ^ i;
                throw new IOException("double");
            }
        }
    }

    private org.bukkit.entity.Player getPlayerAttacker(org.bukkit.entity.Entity r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.listener.CombatListener.getPlayerAttacker(org.bukkit.entity.Entity, int):org.bukkit.entity.Player");
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀";
        nothing_to_see_here[5] = "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀";
        nothing_to_see_here[6] = "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀";
        nothing_to_see_here[7] = "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀";
        nothing_to_see_here[8] = "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀";
        nothing_to_see_here[10] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[11] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[12] = "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀";
        nothing_to_see_here[13] = "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀";
        nothing_to_see_here[18] = "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        jninhzfqom = ByteBuffer.wrap(wdmexygxpybcfqk()).asCharBuffer().toString();
        e6UEioBQ4z = (-1695651457) ^ new Random(-6776539686808959771L).nextInt();
    }

    public static String xowffxclgn(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = jninhzfqom.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] wdmexygxpybcfqk() {
        return new byte[0];
    }

    private static int bxzhchmtzkjrnpzi(int i, int i2) {
        return i ^ i2;
    }
}
