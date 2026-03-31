package com.kammoun.donutCore.combat.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.combat.CombatPlugin;
import com.kammoun.donutCore.combat.config.CombatConfig;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CombatManager {
    private final CombatPlugin plugin;
    private final CombatConfig config;
    private final Map<UUID, Long> combatPlayers;
    private final Map<UUID, SchedulerUtil.Task> actionBarTasks;
    private static int y7RlvMet3w = 0;
    private transient int xx9OmN4IbV = 85215743;
    private static String jmpvnibinm;
    private static String[] nothing_to_see_here = new String[15];

    public CombatManager(CombatPlugin combatPlugin, int i) {
        int i2 = 2064384419 ^ 2086897387;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 116951484:
                    int i3 = 141579453 ^ i2;
                    break;
                case 644475299:
                    break;
                case 914623248:
                default:
                    throw new IOException();
                case 1988359010:
            }
        }
        int parseInt = 1559563854 ^ (1179951703 ^ Integer.parseInt("364806124"));
        this.xx9OmN4IbV = 85215743 ^ y7RlvMet3w;
        int qokvgzaoumoipyna = 1427541901 ^ qokvgzaoumoipyna(parseInt, 10160892);
        this.combatPlayers = new ConcurrentHashMap();
        this.actionBarTasks = new ConcurrentHashMap();
        this.plugin = combatPlugin;
        this.config = combatPlugin.getCombatConfig(1983292249);
        int i4 = 1625721230 ^ (1442193741 ^ (1823499288 ^ (1987579895 ^ qokvgzaoumoipyna)));
    }

    public boolean isInCombat(Player player, int i) {
        int i2 = 784665846 ^ (2074980713 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1188807235) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1188807235 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (100887313 ^ i2)) {
                    int i3 = 1300047885 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 892889401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (597468997 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 728599476 ^ i2;
            throw new RuntimeException();
        }
        int i5 = 1637587048 ^ i2;
        if (player == null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1241972992) {
                return (byte) (2125124375 ^ (2011837239 ^ i5));
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1241972992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (556460153 ^ i5)) {
                    break;
                }
            }
            int i6 = 1819219624 ^ i5;
            throw new IllegalAccessException("double");
        }
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                case 32357246:
                    int i7 = 803728647 ^ i5;
                    break;
                case 785560750:
                case 1801967047:
                default:
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -178874181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (93984072 ^ i5)) {
                            int i8 = 1849665722 ^ i5;
                            throw new IllegalAccessException("double");
                        }
                    }
                    break;
                case 1954799318:
                    break;
            }
        }
        return isInCombat(player.getUniqueId(), 1458518918);
    }

    public boolean isInCombat(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.manager.CombatManager.isInCombat(java.util.UUID, int):boolean");
    }

    public int getRemainingTime(Player player, int i) {
        int i2 = 2132036356 ^ (1984102405 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1490782543) {
            i2 = 2110713886 ^ i2;
            if (player != null) {
                qokvgzaoumoipyna(i2, 261852893);
                return getRemainingTime(player.getUniqueId(), 412069697);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1230239298) {
                return (byte) (783179706 ^ (1736712562 ^ i2));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1970470353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1539088573 ^ i2)) {
                int i3 = 1342698009 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1230239298 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1640042219 ^ i2)) {
                    int i4 = 1157594874 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 898597034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (522081528 ^ i2)) {
                        int i5 = 1089236927 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1490782543 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (271422771 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 389241657 ^ i2;
        throw new RuntimeException();
    }

    public int getRemainingTime(java.util.UUID r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.manager.CombatManager.getRemainingTime(java.util.UUID, int):int");
    }

    public void setCombat(Player player, int i) {
        int qokvgzaoumoipyna;
        int i2 = 1025489765 ^ (682330196 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1077917489) {
            int i3 = 1790970957 ^ i2;
            if (player == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 373282138) {
                    int i4 = 134441233 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 373282138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2118432976 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1468834439 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i6 = 1901664699 ^ i3;
            if (this.config.isIgnoreOp(1246729812) != (866050832 ^ i6)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1661527935) {
                    int i7 = 1303674411 ^ i6;
                    if (player.isOp() != (2116721979 ^ i7)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -246093349) {
                            int i8 = 2146299154 ^ i7;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -246093349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (663431263 ^ i7)) {
                                break;
                            }
                        }
                        int i9 = 2136471875 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    qokvgzaoumoipyna = qokvgzaoumoipyna(i7, 1400315879);
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1365337336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1746962333 ^ i6)) {
                        int i10 = 298402319 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -49835656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (637366641 ^ i6)) {
                            int i11 = 1624201389 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 238780744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1532622163 ^ i6)) {
                                int i12 = 2106560969 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1661527935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1391660294 ^ i6)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                int i13 = 875033490 ^ i6;
                throw new IOException();
            }
            qokvgzaoumoipyna = qokvgzaoumoipyna(i6, 516121036);
            UUID uniqueId = player.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qokvgzaoumoipyna) != 1793857249) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qokvgzaoumoipyna) == 1793857249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(qokvgzaoumoipyna) == (864523217 ^ qokvgzaoumoipyna)) {
                        break;
                    }
                }
                int i14 = 703459934 ^ qokvgzaoumoipyna;
                throw new IllegalAccessException("double");
            }
            int i15 = 229544886 ^ qokvgzaoumoipyna;
            boolean isInCombat = isInCombat(uniqueId, 1458518918);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 127437649) {
                i15 = 1100114510 ^ i15;
                long currentTimeMillis = System.currentTimeMillis() + (this.config.getDuration(73906755) * 1000);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 185325859) {
                    i6 = 1957865541 ^ i15;
                    this.combatPlayers.put(uniqueId, Long.valueOf(currentTimeMillis));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1365337336) {
                        i2 = 1234544025 ^ i6;
                        if (isInCombat != (1548121848 ^ i2)) {
                            qokvgzaoumoipyna(i2, 1139180759);
                            return;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -499927102) {
                            i15 = 1621899141 ^ i2;
                            this.config.sendMessage(player, this.config.getEnterCombatMessage(1030370338), 888239100);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -414053399) {
                                i2 = 1789510323 ^ i15;
                                startActionBar(player, 66018942);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1306780046) {
                                    int i16 = 1239642593 ^ i2;
                                    return;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1365337336) {
                            int i102 = 298402319 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -49835656) {
                                int i112 = 1624201389 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 238780744) {
                                    int i122 = 2106560969 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1661527935) {
                                        break;
                                        break;
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    int i132 = 875033490 ^ i6;
                    throw new IOException();
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -414053399 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (353674798 ^ i15)) {
                    int i17 = 970916227 ^ i15;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 127437649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (685654031 ^ i15)) {
                        int i18 = 2054390357 ^ i15;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 185325859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (531010825 ^ i15)) {
                            break;
                        }
                    }
                }
            }
            int i19 = 400727074 ^ i15;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1077917489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1195633862 ^ i2)) {
                int i20 = 681619241 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -499927102 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (230588448 ^ i2)) {
                    int i21 = 244091203 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1445240274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1389533976 ^ i2)) {
                        int i22 = 399549912 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1306780046 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2129348815 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i23 = 1642954526 ^ i2;
        throw new RuntimeException("double");
    }

    public void setCombat(Player player, Player player2, int i) {
        int i2 = 69322073 ^ (2000841763 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1988322666) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1988322666 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (902987906 ^ i2)) {
                    int i3 = 2146580476 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1145686321 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (462589262 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1511841952 ^ i2;
            throw new IOException();
        }
        int i5 = 1749301855 ^ i2;
        setCombat(player, 740687228);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 883079057) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 883079057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1169643970 ^ i5)) {
                    break;
                }
            }
            int i6 = 93836422 ^ i5;
            throw new IllegalAccessException("double");
        }
        int i7 = 1142941846 ^ i5;
        setCombat(player2, 740687228);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 341701411) {
            int i8 = 1241679682 ^ i7;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 341701411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1982030010 ^ i7)) {
                break;
            }
        }
        int i9 = 25020773 ^ i7;
        throw new IllegalAccessException("double");
    }

    public void removeCombat(Player player, boolean z, int i) {
        int i2 = 237644993 ^ (258712115 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -409839319) {
            int i3 = 409330768 ^ i2;
            if (player == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 616397737) {
                    int i4 = 1491170592 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 616397737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1481662762 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1164413865 ^ i3;
                throw new IOException("double");
            }
            i2 = qokvgzaoumoipyna(i3, 874310834);
            removeCombat(player.getUniqueId(), z, 2023896097);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2074468808) {
                int i6 = 1930962369 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 479932467 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1159946460 ^ i2)) {
                int i7 = 1574428609 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -409839319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1336000064 ^ i2)) {
                    int i8 = 670322593 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2074468808 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (374339741 ^ i2)) {
                        int i9 = 538578145 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -474557781 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (236132455 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 104280992 ^ i2;
        throw new RuntimeException();
    }

    public void removeCombat(UUID uuid, boolean z, int i) {
        int i2 = 301170270 ^ (19768616 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1802040585) {
            i2 = 1038952538 ^ i2;
            if (uuid != null) {
                i2 = 1807087581 ^ i2;
                this.combatPlayers.remove(uuid);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -642905805) {
                    int i3 = 317469433 ^ i2;
                    SchedulerUtil.Task remove = this.actionBarTasks.remove(uuid);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1322229499) {
                        int i4 = 2117727798 ^ i3;
                        if (remove == null) {
                            i2 = 204039387 ^ i4;
                        } else {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1090506936) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1090506936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (602107177 ^ i4)) {
                                        break;
                                    }
                                }
                                int i5 = 1273731354 ^ i4;
                                throw new RuntimeException("double");
                            }
                            int i6 = 171891965 ^ i4;
                            remove.cancel(1520188267);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -285816672) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -285816672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (479883683 ^ i6)) {
                                        break;
                                    }
                                }
                                int i7 = 231644535 ^ i6;
                                throw new IllegalAccessException("double");
                            }
                            i2 = 102217766 ^ i6;
                        }
                        if (z != (466182450 ^ i2)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -565507696) {
                                int i8 = 420400878 ^ i2;
                                Player player = Bukkit.getPlayer(uuid);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 373128928) {
                                    i3 = 1961590011 ^ i8;
                                    if (player != null) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1318676165) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1318676165 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2040847311 ^ i3)) {
                                                    break;
                                                }
                                            }
                                            int i9 = 1266379930 ^ i3;
                                            throw new IOException("double");
                                        }
                                        i8 = 938716269 ^ i3;
                                        if (player.isOnline() != (1105166154 ^ i8)) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 251394642) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 251394642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1888737804 ^ i8)) {
                                                        break;
                                                    }
                                                }
                                                int i10 = 1891210346 ^ i8;
                                                throw new IllegalAccessException("double");
                                            }
                                            i2 = 1670876446 ^ i8;
                                            this.config.sendMessage(player, this.config.getLeaveCombatMessage(1607568598), 888239100);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 306680481) {
                                                int i11 = 864564533 ^ i2;
                                                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ohkahccpbc(gzyrnltwqfbjvli(), i11)));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1912194296) {
                                                    int i12 = 1206556959 ^ i11;
                                                    return;
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1912194296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (610546464 ^ i11)) {
                                                        int i13 = 115222116 ^ i11;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1319963662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1948653158 ^ i11)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                int i14 = 507349424 ^ i11;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8)) {
                                                case 262227776:
                                                    int i15 = 401940788 ^ i8;
                                                    return;
                                                case 267940846:
                                                case 1183348170:
                                                    return;
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                            case 6148608:
                                            case 83275575:
                                                int i16 = 537300313 ^ i3;
                                                return;
                                            case 164434101:
                                                return;
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 373128928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1312654896 ^ i8)) {
                                        int i17 = 694091495 ^ i8;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                case 97925017:
                                    int i18 = 1306738508 ^ i2;
                                    return;
                                case 1131392662:
                                    return;
                                case 1195486904:
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1322229499 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (699661969 ^ i3)) {
                            int i19 = 11155484 ^ i3;
                            throw new IOException("double");
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2080262184) {
                int i20 = 1851470744 ^ i2;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -565507696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1855997402 ^ i2)) {
                    int i21 = 1426938387 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 306680481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1895696735 ^ i2)) {
                        int i22 = 1910542432 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2080262184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (626514152 ^ i2)) {
                            int i23 = 1640184745 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -153605349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1685243235 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i24 = 200783351 ^ i2;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -642905805 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2012750242 ^ i2)) {
                int i25 = 1648199382 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1802040585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (81382418 ^ i2)) {
                    int i26 = 277625826 ^ i2;
                    throw new IOException("double");
                }
            }
        }
    }

    private void startActionBar(org.bukkit.entity.Player r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.manager.CombatManager.startActionBar(org.bukkit.entity.Player, int):void");
    }

    public void handleDeath(Player player, int i) {
        int i2 = 441989576 ^ (1154413133 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 422081171) {
            i2 = 206119965 ^ i2;
            removeCombat(player, (boolean) ((byte) (1869359695 ^ i2)), 1461998274);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2069975675) {
                int i3 = 2105538452 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 422081171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (665997628 ^ i2)) {
                int i4 = 801484549 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2069975675 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1239494086 ^ i2)) {
                    int i5 = 862281269 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1868632360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1391155295 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 125647 ^ i2;
        throw new IllegalAccessException();
    }

    public void clearAll(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.manager.CombatManager.clearAll(int):void");
    }

    public void forceExpireCombat(UUID uuid, int i) {
        int i2 = 573700773 ^ (1341226058 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2087052862) {
            int i3 = 2086201500 ^ i2;
            this.combatPlayers.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1633508641) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1633508641 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (598319133 ^ i3)) {
                        break;
                    }
                }
                int i4 = 188143551 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i5 = 672395653 ^ i3;
            SchedulerUtil.Task remove = this.actionBarTasks.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 566415624) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 566415624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1260632743 ^ i5)) {
                        break;
                    }
                }
                int i6 = 2094990151 ^ i5;
                throw new IOException("double");
            }
            i2 = 1024893938 ^ i5;
            if (remove != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -914895207) {
                    i2 = 1479464363 ^ i2;
                    remove.cancel(1520188267);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 134308803) {
                        int i7 = 1451268977 ^ i2;
                        return;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 248200486:
                        int i8 = 246304474 ^ i2;
                        return;
                    case 513502213:
                    case 1976455979:
                        return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2087052862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (930911686 ^ i2)) {
                int i9 = 1085834155 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 134308803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (134483246 ^ i2)) {
                    int i10 = 1182147611 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -914895207 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1584167127 ^ i2)) {
                        int i11 = 414974276 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1140475831 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1929467779 ^ i2)) {
                            int i12 = 1381359371 ^ i2;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    @Generated
    public CombatPlugin getPlugin() {
        int i = 923064812 ^ (904426481 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -84181423) {
            int i2 = 1475984105 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1161210139 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1524214978 ^ i)) {
                int i3 = 1420777318 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -84181423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2045851386 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1195038332 ^ i;
        throw new IOException();
    }

    @Generated
    public CombatConfig getConfig() {
        int i = 671956071 ^ (716375781 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -126879063) {
            int i2 = 1467769790 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1133307739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (244782511 ^ i)) {
                int i3 = 7144443 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -126879063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (683595837 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 526018123 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Map<UUID, Long> getCombatPlayers() {
        int i = 1201356998 ^ (2096471809 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 921227392) {
            int i2 = 1472183824 ^ i;
            return this.combatPlayers;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 921227392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (301990337 ^ i)) {
                int i3 = 1169074990 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1961549822 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (819201855 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 229474408 ^ i;
        throw new IOException();
    }

    @Generated
    public Map<UUID, SchedulerUtil.Task> getActionBarTasks() {
        int i = 110890982 ^ (636931779 ^ 1035191767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -154654832) {
            int i2 = 1697913979 ^ i;
            return this.actionBarTasks;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -154654832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1118924040 ^ i)) {
                int i3 = 1259084229 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -546782133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (216864476 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1575898249 ^ i;
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
        jmpvnibinm = ByteBuffer.wrap(muzydiaxaelebbj()).asCharBuffer().toString();
        y7RlvMet3w = (-94332580) ^ new Random(2101681869205647536L).nextInt();
    }

    public static String ohkahccpbc(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = jmpvnibinm.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] zobvpiyqiemxrxs() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 0};
    }

    private static byte[] gzyrnltwqfbjvli() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, 6};
    }

    private static byte[] muzydiaxaelebbj() {
        return new byte[]{54, 79, 51, 64, 53, 89, 49, 95, 57, 83, 52, 78};
    }

    private static int qokvgzaoumoipyna(int i, int i2) {
        return i2 ^ i;
    }
}
