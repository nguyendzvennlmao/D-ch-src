package com.kammoun.donutCore.team.commands;

import com.kammoun.donutCore.api.commands.KCommand;
import com.kammoun.donutCore.team.TeamPlugin;
import com.kammoun.donutCore.team.gui.DisbandConfirm;
import com.kammoun.donutCore.team.models.Enums.Messages;
import com.kammoun.donutCore.team.models.Enums.Permissions;
import com.kammoun.donutCore.team.models.Team;
import com.kammoun.donutCore.team.models.TeamMember;
import com.kammoun.donutCore.team.models.TeamRequest;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class TeamCommand extends KCommand {
    private final TeamPlugin teamPlugin;
    private final DisbandConfirm disbandConfirm;
    private static int kuKmZuWYjL = 0;
    private transient int qtVajfpuO2 = 996108833;
    private static byte[] jtwvxvpube;
    private static String[] nothing_to_see_here = new String[13];

    public TeamCommand(TeamPlugin teamPlugin, int i) {
        super("team", 1543881941);
        cwcogvllbjrlvmtn(1256678290 ^ 1374470429, 943368804);
        int parseInt = 170674492 ^ (1126000497 ^ Integer.parseInt("1778394790"));
        this.qtVajfpuO2 = 996108833 ^ kuKmZuWYjL;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 70197878:
                    parseInt = 1154057416 ^ parseInt;
                    break;
                case 192120649:
                case 918561396:
                    break;
                case 1818501190:
                default:
                    throw new RuntimeException();
            }
        }
        this.teamPlugin = teamPlugin;
        this.disbandConfirm = new DisbandConfirm(teamPlugin, 106197345);
        int i2 = 1579101517 ^ (401247534 ^ (1507793747 ^ parseInt));
    }

    @Override
    public void execute(org.bukkit.command.CommandSender r8, java.lang.String[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.commands.TeamCommand.execute(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleDeleteHome(Player player, Team team, int i) {
        int i2;
        int i3 = 1502122030 ^ (833155432 ^ 873376100);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -512343790) {
            int i4 = 970672937 ^ i3;
            TeamMember teamMember = (TeamMember) team.getMember(player.getUniqueId(), 1918692774).orElse(null);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 799807579) {
                int i5 = 391244469 ^ i4;
                if (teamMember == null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1792848397) {
                        i5 = 842675935 ^ i5;
                        if (team.isLeader(player.getUniqueId(), 1680523716) != (1084120929 ^ i5)) {
                            i3 = 59466271 ^ i5;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 83032842) {
                            int i6 = 217812283 ^ i5;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1663996626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1232103682 ^ i5)) {
                            int i7 = 87735773 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1382050918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (947352635 ^ i5)) {
                                int i8 = 1865677607 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1792848397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1965088157 ^ i5)) {
                                    int i9 = 921683203 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 83032842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (696135189 ^ i5)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i10 = 958239007 ^ i5;
                    throw new IOException();
                }
                i3 = cwcogvllbjrlvmtn(i5, 833705152);
                if (teamMember == null) {
                    i2 = 854500790 ^ i3;
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 413789170) {
                    int i11 = 562496439 ^ i3;
                    if (teamMember.hasPermission(Permissions.EDIT_HOME, 1929852220) != (1653751497 ^ i11)) {
                        i2 = 325690881 ^ i11;
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 345110091) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 345110091 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (502943970 ^ i11)) {
                                    int i12 = 59886775 ^ i11;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -912330600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (32511801 ^ i11)) {
                                        break;
                                    }
                                }
                            }
                            int i13 = 804785221 ^ i11;
                            throw new IOException("double");
                        }
                        i3 = 1338744591 ^ i11;
                        this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.noPermissionCommand, new String[(byte) (760848838 ^ i3)], 570565429);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1791823409) {
                            int i14 = 2028622773 ^ i3;
                            return;
                        }
                    }
                }
                team.setHomeLocation(null, 1255269160);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1881356733) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1881356733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1653308460 ^ i2)) {
                            break;
                        }
                    }
                    int i15 = 678606965 ^ i2;
                    throw new RuntimeException("double");
                }
                i4 = 2062045922 ^ i2;
                this.teamPlugin.getTeamsManager(995299140).setHomeLocation(player.getUniqueId(), null, 1069595489);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1486770512) {
                    i3 = 595623458 ^ i4;
                    this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.teamHomeDeleted, new String[(byte) (680768520 ^ i3)], 570565429);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1151180865) {
                        int i16 = 832596507 ^ i3;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1486770512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1163905315 ^ i4)) {
                    int i17 = 1262618322 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 799807579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2040089943 ^ i4)) {
                        break;
                    }
                }
            }
            int i18 = 100533267 ^ i4;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1791823409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (129824620 ^ i3)) {
                int i19 = 1789538174 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1151180865 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (304609725 ^ i3)) {
                    int i20 = 1223375423 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -512343790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (192125380 ^ i3)) {
                        int i21 = 1487945174 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 413789170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (931797291 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i22 = 1208560531 ^ i3;
        throw new RuntimeException("double");
    }

    private void handleCreate(Player player, String[] strArr, int i) {
        int i2;
        int i3 = 817210759 ^ (1780794411 ^ 873376100);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1962821187) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 668581977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1997935181 ^ i3)) {
                    int i4 = 1233449589 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1962821187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (33959517 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 1840552064 ^ i3;
            throw new RuntimeException("double");
        }
        int i6 = 51265909 ^ i3;
        if (this.teamPlugin.getTeamsManager(995299140).isInTeam(player.getUniqueId(), 1585543528) == (1838254525 ^ i6)) {
            int i7 = 875261689 ^ i6;
            if (strArr.length >= ((byte) (1505421126 ^ i7))) {
                i7 = 1635345597 ^ i7;
                String str = strArr[(byte) (952337400 ^ i7)];
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -971235383) {
                    int i8 = 1272646931 ^ i7;
                    this.teamPlugin.getTeamsManager(995299140).createTeam(player, str, 1485776648).thenAccept(bool -> {
                        int i9;
                        int i10 = 1141529609 ^ (169601788 ^ 873376100);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -788988789) {
                            i10 = 1490079719 ^ i10;
                            if (bool.booleanValue() == (584044662 ^ i10)) {
                                i9 = 1845129870 ^ i10;
                                this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.teamTakenName, new String[(byte) (1328915192 ^ i9)], 570565429);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2041386946) {
                                    int i11 = 1263707004 ^ i9;
                                    return;
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 377390001) {
                                i10 = 571231884 ^ i10;
                                this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.teamCreated, new String[(byte) (12820218 ^ i10)], 570565429);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 102561744) {
                                    i9 = 919915469 ^ i10;
                                    player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1329944135) {
                                        int i12 = 152152829 ^ i9;
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) == 169717905) {
                                                throw new IOException();
                                            }
                                            throw null;
                                        } catch (IOException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case -130548143:
                                                    i10 = 590550573 ^ i12;
                                                    break;
                                                case 254598881:
                                                    i10 = 1037070907 ^ i12;
                                                    break;
                                                default:
                                                    throw new IllegalAccessException("Error in hash");
                                            }
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1329944135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (625008803 ^ i9)) {
                                    int i13 = 829023182 ^ i9;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 2041386946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1485078598 ^ i9)) {
                                        break;
                                    }
                                }
                            }
                            int i14 = 1873564677 ^ i9;
                            throw new IllegalAccessException("double");
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -508604616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (625984104 ^ i10)) {
                                int i15 = 430132539 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 254598881 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (2109752179 ^ i10)) {
                                    int i16 = 488110395 ^ i10;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 102561744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (587971599 ^ i10)) {
                                        int i17 = 1220116867 ^ i10;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 377390001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (557863235 ^ i10)) {
                                            int i18 = 561781573 ^ i10;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -130548143 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (615281727 ^ i10)) {
                                                int i19 = 1238654449 ^ i10;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -788988789 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1245612309 ^ i10)) {
                                                    int i20 = 2073542960 ^ i10;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 590875680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (565159714 ^ i10)) {
                                                        int i21 = 224562171 ^ i10;
                                                        throw new RuntimeException();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    });
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1731954861) {
                        int i9 = 366530587 ^ i8;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1731954861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (716764674 ^ i8)) {
                            break;
                        }
                    }
                    int i10 = 941226076 ^ i8;
                    throw new IllegalAccessException("double");
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -841532894) {
                i2 = 1378703811 ^ i7;
                player.sendMessage(ekbvmxttht(ndhsbrqblckaynm(), i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1555952696) {
                    int i11 = 795641484 ^ i2;
                    return;
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2010152520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (922272683 ^ i7)) {
                    int i12 = 2001979392 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -841532894 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (813666092 ^ i7)) {
                        int i13 = 1085558251 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -971235383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (300068678 ^ i7)) {
                            break;
                        }
                    }
                }
            }
            int i14 = 1199290033 ^ i7;
            throw new IOException();
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1821134315) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1821134315 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1067912231 ^ i6)) {
                    break;
                }
            }
            int i15 = 1225500208 ^ i6;
            throw new IllegalAccessException("double");
        }
        i2 = 1502400068 ^ i6;
        this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.alreadyHaveTeam, new String[(byte) (874334201 ^ i2)], 570565429);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1595260983) {
            int i16 = 622376910 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 906164107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1132437077 ^ i2)) {
                int i17 = 1709740552 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1595260983 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (623033057 ^ i2)) {
                    int i18 = 427341806 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1555952696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1975400458 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i19 = 190727715 ^ i2;
        throw new IOException("double");
    }

    private void handleInvite(org.bukkit.entity.Player r8, com.kammoun.donutCore.team.models.Team r9, java.lang.String[] r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.commands.TeamCommand.handleInvite(org.bukkit.entity.Player, com.kammoun.donutCore.team.models.Team, java.lang.String[], int):void");
    }

    private void handleAccept(org.bukkit.entity.Player r7, java.lang.String[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.commands.TeamCommand.handleAccept(org.bukkit.entity.Player, java.lang.String[], int):void");
    }

    private void handleDisband(Player player, Team team, int i) {
        int i2 = 115180123 ^ (846083463 ^ 873376100);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 99153344) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1238480838 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1273017009 ^ i2)) {
                    int i3 = 1333880553 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 99153344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2090537376 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1589485330 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i5 = 179023181 ^ i2;
        if (team.isLeader(player.getUniqueId(), 1680523716) != (169260021 ^ i5)) {
            int i6 = 1251018990 ^ i5;
            this.disbandConfirm.openInventory(player, 1990777478);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 71162074) {
                int i7 = 373453340 ^ i6;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 71162074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2030484737 ^ i6)) {
                    break;
                }
            }
            int i8 = 1235050735 ^ i6;
            throw new IllegalAccessException("double");
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1354080168) {
            i5 = 1897620535 ^ i5;
            this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.noLeader, new String[(byte) (2064504770 ^ i5)], 570565429);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -663831021) {
                int i9 = 506465096 ^ i5;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -663831021 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (555154724 ^ i5)) {
                int i10 = 1461289931 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 703521875 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (443779228 ^ i5)) {
                    int i11 = 869448830 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1354080168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1711956645 ^ i5)) {
                        break;
                    }
                }
            }
        }
        int i12 = 453161937 ^ i5;
        throw new RuntimeException();
    }

    private void handleLeave(Player player, Team team, int i) {
        int i2 = 2016661453 ^ (1153852272 ^ 873376100);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1205350088) {
            i2 = 1622210895 ^ i2;
            if (team.isLeader(player.getUniqueId(), 1680523716) == (1749810326 ^ i2)) {
                i2 = cwcogvllbjrlvmtn(i2, 2119669829);
                this.teamPlugin.getTeamsManager(995299140).leaveTeam(player.getUniqueId(), 1621478235).thenAccept(bool -> {
                    int i3 = 2102914599 ^ (87632932 ^ 873376100);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1661164346) {
                        i3 = 1184646944 ^ i3;
                        if (bool.booleanValue() == (184298567 ^ i3)) {
                            int i4 = 1947611668 ^ i3;
                            player.sendMessage(ekbvmxttht(fozcsuemxzerogr(), i4));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -145689957) {
                                int i5 = 920845153 ^ i4;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -145689957 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1408678040 ^ i4)) {
                                    break;
                                }
                            }
                            int i6 = 1605494659 ^ i4;
                            throw new IOException("double");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1474388536) {
                            i3 = 1748943082 ^ i3;
                            this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.teamLeft, new String[(byte) (1656941741 ^ i3)], 570565429);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 370632043) {
                                int i7 = 1800343275 ^ i3;
                                player.playSound(player.getLocation(), Sound.BLOCK_PORTAL_TRAVEL, 1.0f, 1.5f);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 1282347568) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1282347568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1271082147 ^ i7)) {
                                            break;
                                        }
                                    }
                                    int i8 = 322136312 ^ i7;
                                    throw new IOException("double");
                                }
                                int i9 = 1999029151 ^ i7;
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i9) == 90959679) {
                                        throw new IOException();
                                    }
                                    throw null;
                                } catch (IOException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -734736688:
                                            i3 = 175846815 ^ i9;
                                            break;
                                        case -178712885:
                                            i3 = cwcogvllbjrlvmtn(i9, 1851166108);
                                            break;
                                        default:
                                            throw new IllegalAccessException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2014485976) {
                                        cwcogvllbjrlvmtn(i3, 1492470135);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -734736688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1229414840 ^ i3)) {
                            int i10 = 1719273105 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -178712885 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (888989579 ^ i3)) {
                                int i11 = 824745163 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1078405522 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (203494573 ^ i3)) {
                                    int i12 = 2080287118 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1474388536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1568169973 ^ i3)) {
                                        int i13 = 1221667253 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1661164346 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (885026747 ^ i3)) {
                                            int i14 = 1475060562 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2014485976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1630503356 ^ i3)) {
                                                int i15 = 748785955 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 370632043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1135211997 ^ i3)) {
                                                    int i16 = 1600918481 ^ i3;
                                                    throw new IOException();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1327290728) {
                    int i3 = 135968484 ^ i2;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1113580723) {
                i2 = 1593819987 ^ i2;
                this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.noLeader, new String[(byte) (917782469 ^ i2)], 570565429);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1247674839) {
                    i2 = 1939381157 ^ i2;
                    player.sendMessage(ekbvmxttht(mmnlvtuvmxdclmu(), i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 694493954) {
                        int i4 = 1180555453 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1113580723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (221574592 ^ i2)) {
                int i5 = 1512877251 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1327290728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (479875646 ^ i2)) {
                    int i6 = 335681289 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1205350088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (584389944 ^ i2)) {
                        int i7 = 727631705 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 694493954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1192645085 ^ i2)) {
                            int i8 = 813080704 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1247674839 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1123365960 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i9 = 111351033 ^ i2;
        throw new IOException();
    }

    private void handleKick(org.bukkit.entity.Player r7, com.kammoun.donutCore.team.models.Team r8, java.lang.String[] r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.commands.TeamCommand.handleKick(org.bukkit.entity.Player, com.kammoun.donutCore.team.models.Team, java.lang.String[], int):void");
    }

    private void handleSetHome(Player player, Team team, int i) {
        int cwcogvllbjrlvmtn;
        int i2 = 851121810 ^ (1547804714 ^ 873376100);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -677314846) {
            i2 = 935211350 ^ i2;
            TeamMember teamMember = (TeamMember) team.getMember(player.getUniqueId(), 1918692774).orElse(null);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1783723091) {
                i2 = 1198545303 ^ i2;
                if (teamMember != null) {
                    cwcogvllbjrlvmtn = cwcogvllbjrlvmtn(i2, 245217333);
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1372829929) {
                    i2 = 1366425125 ^ i2;
                    if (team.isLeader(player.getUniqueId(), 1680523716) != (2068547896 ^ i2)) {
                        cwcogvllbjrlvmtn = 1609319952 ^ i2;
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -631486013) {
                        int i3 = 1761621605 ^ i2;
                        return;
                    }
                }
                if (teamMember == null) {
                    i2 = 2121004233 ^ cwcogvllbjrlvmtn;
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) != 624851265) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == 624851265 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == (401833922 ^ cwcogvllbjrlvmtn)) {
                                break;
                            }
                        }
                        int i4 = 1547476733 ^ cwcogvllbjrlvmtn;
                        throw new IllegalAccessException("double");
                    }
                    int i5 = 687260104 ^ cwcogvllbjrlvmtn;
                    if (teamMember.hasPermission(Permissions.EDIT_HOME, 1929852220) == (206638816 ^ i5)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1653110528) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1653110528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1421514429 ^ i5)) {
                                    break;
                                }
                            }
                            int i6 = 973449262 ^ i5;
                            throw new RuntimeException("double");
                        }
                        int i7 = 1531518868 ^ i5;
                        this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.noPermissionCommand, new String[(byte) (1461195124 ^ i7)], 570565429);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1195340894) {
                            int i8 = 1821868259 ^ i7;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1195340894 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1893731566 ^ i7)) {
                                break;
                            }
                        }
                        int i9 = 1453473961 ^ i7;
                        throw new RuntimeException("double");
                    }
                    i2 = cwcogvllbjrlvmtn(i5, 1453143297);
                }
                team.setHomeLocation(player.getLocation(), 1255269160);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -698228982) {
                    i2 = 1573291322 ^ i2;
                    this.teamPlugin.getTeamsManager(995299140).setHomeLocation(player.getUniqueId(), team.getHomeLocation(1958141463), 1069595489);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 945157848) {
                        int i10 = 481864517 ^ i2;
                        this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.teamHomeSet, new String[(byte) (464655774 ^ i10)], 570565429);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -577721104) {
                            int i11 = 504206695 ^ i10;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -577721104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1450718231 ^ i10)) {
                                int i12 = 1024403979 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -595817287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (502580811 ^ i10)) {
                                    break;
                                }
                            }
                        }
                        int i13 = 1086025836 ^ i10;
                        throw new IOException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -631486013 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (817933143 ^ i2)) {
                int i14 = 533074187 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -677314846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (678570122 ^ i2)) {
                    int i15 = 1181436921 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 945157848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1571190521 ^ i2)) {
                        int i16 = 1538037314 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 771491784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (967993804 ^ i2)) {
                            int i17 = 1552966018 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1372829929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (152147989 ^ i2)) {
                                int i18 = 1051549750 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -698228982 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (501470918 ^ i2)) {
                                    int i19 = 1549028628 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1783723091 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (100725376 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i20 = 50565512 ^ i2;
        throw new IOException();
    }

    private void handleHome(org.bukkit.entity.Player r7, com.kammoun.donutCore.team.models.Team r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.commands.TeamCommand.handleHome(org.bukkit.entity.Player, com.kammoun.donutCore.team.models.Team, int):void");
    }

    private void handleChat(Player player, Team team, String[] strArr, int i) {
        int i2;
        int i3;
        int i4 = 897240500 ^ (1438702278 ^ 873376100);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1515851598) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1515851598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1465098339 ^ i4)) {
                    break;
                }
            }
            int i5 = 1413406557 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 943545868 ^ i4;
        TeamMember teamMember = (TeamMember) team.getMember(player.getUniqueId(), 1918692774).orElse(null);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1682899155) {
            i6 = 357952266 ^ i6;
            if (teamMember != null) {
                i6 = 735105167 ^ i6;
                if (teamMember.hasPermission(Permissions.USE_TEAM_CHAT, 1929852220) != (1376574367 ^ i6)) {
                    i2 = 1768693747 ^ i6;
                    if (strArr.length >= ((byte) (996197486 ^ i2))) {
                        int i7 = 285834659 ^ i2;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -620354719) {
                        int i8 = 669983688 ^ i2;
                        teamMember.changeTeamChatStatus(1980188473);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -461423328) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1397608057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (781082442 ^ i8)) {
                                    int i9 = 1264822772 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -461423328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (139540395 ^ i8)) {
                                        int i10 = 1636468028 ^ i8;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1140838306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (718357590 ^ i8)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            int i11 = 966617193 ^ i8;
                            throw new IllegalAccessException("double");
                        }
                        i6 = 394536759 ^ i8;
                        if (teamMember.isTeamChatEnabled(619530006) != (185319571 ^ i6)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1482556568) {
                                int i12 = 126766147 ^ i6;
                                this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.teamChatEnabled, new String[(byte) (210078928 ^ i12)], 570565429);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 1680631424) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 1680631424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1021890484 ^ i12)) {
                                            int i13 = 799427773 ^ i12;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12)) {
                                        case 138595414:
                                            i12 = 1155616885 ^ i12;
                                        case 459592097:
                                            try {
                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) == 205726491) {
                                                    throw new RuntimeException();
                                                }
                                                throw null;
                                            } catch (RuntimeException e) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                    case 1126622506:
                                                        i3 = 1380318275 ^ i12;
                                                        break;
                                                    case 1140838306:
                                                        i3 = 1381947666 ^ i12;
                                                        break;
                                                    default:
                                                        throw new RuntimeException("Error in hash");
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -787937488) {
                                                    int i14 = 810064169 ^ i3;
                                                    return;
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -787937488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (874784842 ^ i3)) {
                                                        int i15 = 2127812181 ^ i3;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                            break;
                                        case 560860344:
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 1680631424) {
                                    }
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                case 90623511:
                                    i6 = 547638001 ^ i6;
                                    break;
                                case 1810978627:
                                case 1897257198:
                                    break;
                                case 1940584637:
                                default:
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1126622506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2019078565 ^ i6)) {
                                            int i16 = 955448913 ^ i6;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                    break;
                            }
                        }
                        this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.teamChatDisabled, new String[(byte) (732924514 ^ i6)], 570565429);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1568428817) {
                            int i17 = 29766573 ^ i6;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1568428817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1413213976 ^ i6)) {
                                int i18 = 1206075316 ^ i6;
                                throw new IOException("double");
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -620354719) {
                            int i19 = 182585618 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1458616226) {
                                int i20 = 1181963347 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -176246400) {
                                    break;
                                    break;
                                }
                                continue;
                            } else {
                                continue;
                            }
                        }
                    }
                    int i21 = 481596634 ^ i2;
                    throw new IllegalAccessException("double");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1872306950) {
                    i2 = 416468331 ^ i6;
                    this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.noPermissionCommand, new String[(byte) (1256068852 ^ i2)], 570565429);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1458616226) {
                        int i22 = 1416741060 ^ i2;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -620354719 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (188637975 ^ i2)) {
                            int i192 = 182585618 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1458616226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1346313250 ^ i2)) {
                                int i202 = 1181963347 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -176246400 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (755506331 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i212 = 481596634 ^ i2;
                    throw new IllegalAccessException("double");
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -824158077) {
                int i23 = 639488723 ^ i6;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1872306950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (247488832 ^ i6)) {
                int i24 = 1908266518 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -824158077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (964678173 ^ i6)) {
                    int i25 = 417472216 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1682899155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (596155352 ^ i6)) {
                        int i26 = 1469482461 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1482556568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1349564924 ^ i6)) {
                            break;
                        }
                    }
                }
            }
        }
        int i27 = 1202388923 ^ i6;
        throw new RuntimeException();
    }

    private void handleDeny(Player player, String[] strArr, int i) {
        int i2;
        int cwcogvllbjrlvmtn;
        int i3 = 1354066359 ^ (812907816 ^ 873376100);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1505628198) {
            int i4 = 826194726 ^ i3;
            List invites = this.teamPlugin.getRequestManager(1259714136).getInvites(player.getUniqueId(), 1108844738);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 800339691) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 800339691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (768017037 ^ i4)) {
                        break;
                    }
                }
                int i5 = 750387711 ^ i4;
                throw new IOException("double");
            }
            int i6 = 1306342950 ^ i4;
            if (invites.isEmpty() != (673951995 ^ i6)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1096648665) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1096648665 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1296729341 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 262605541 ^ i6;
                    throw new IllegalAccessException("double");
                }
                int i8 = 1383991720 ^ i6;
                this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.noPendingInvite, new String[(byte) (2052438355 ^ i8)], 570565429);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -760362341) {
                    int i9 = 1408800807 ^ i8;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1045577715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1634465432 ^ i8)) {
                        int i10 = 277055950 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -760362341 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1015838020 ^ i8)) {
                            break;
                        }
                    }
                }
                int i11 = 424759667 ^ i8;
                throw new IllegalAccessException("double");
            }
            int cwcogvllbjrlvmtn2 = cwcogvllbjrlvmtn(i6, 448509000);
            if (strArr.length < ((byte) (848299185 ^ cwcogvllbjrlvmtn2))) {
                int cwcogvllbjrlvmtn3 = cwcogvllbjrlvmtn(cwcogvllbjrlvmtn2, 974650816);
                this.teamPlugin.getRequestManager(1259714136).clearPlayerInvites(player.getUniqueId(), 1709709312);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn3) != 1145031576) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn3) == 1145031576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn3) == (1853708012 ^ cwcogvllbjrlvmtn3)) {
                            break;
                        }
                    }
                    int i12 = 2135748889 ^ cwcogvllbjrlvmtn3;
                    throw new RuntimeException("double");
                }
                i2 = 1076449817 ^ cwcogvllbjrlvmtn3;
                this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.inviteDenied, new String[(byte) (1219406698 ^ i2)], 570565429);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1165318994) {
                    int i13 = 1318464005 ^ i2;
                    return;
                }
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn2) != -1803541095) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn2) == -1803541095 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn2) == (1289113421 ^ cwcogvllbjrlvmtn2)) {
                            break;
                        }
                    }
                    int i14 = 1159746688 ^ cwcogvllbjrlvmtn2;
                    throw new IOException("double");
                }
                i3 = 1293473103 ^ cwcogvllbjrlvmtn2;
                String str = strArr[(byte) (2139673085 ^ i3)];
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -62484509) {
                    int i15 = 1284885700 ^ i3;
                    Stream stream = invites.stream();
                    Predicate predicate = teamRequest -> {
                        int i16 = 685808391 ^ (2124246219 ^ 257016645);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -916347830) {
                            int i17 = 1231013836 ^ i16;
                            return teamRequest.getTeamName().equalsIgnoreCase(str);
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -2086692312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (612707512 ^ i16)) {
                                int i18 = 1713612732 ^ i16;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -916347830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (1700368402 ^ i16)) {
                                    break;
                                }
                            }
                        }
                        int i19 = 538106380 ^ i16;
                        throw new IOException();
                    };
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -1729566271) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1729566271 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1775971623 ^ i15)) {
                                break;
                            }
                        }
                        int i16 = 584561439 ^ i15;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 1925697137 ^ i15;
                    Stream filter = stream.filter(predicate);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 248945226) {
                        i2 = 1322026821 ^ i2;
                        Optional findFirst = filter.findFirst();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2024972384) {
                            int i17 = 1293476916 ^ i2;
                            TeamRequest teamRequest2 = (TeamRequest) findFirst.orElse(null);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != 276136386) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 276136386 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (2022597858 ^ i17)) {
                                        int i18 = 554645825 ^ i17;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 834931576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (611239822 ^ i17)) {
                                            break;
                                        }
                                    }
                                }
                                int i19 = 1165862849 ^ i17;
                                throw new RuntimeException("double");
                            }
                            i3 = 1414767329 ^ i17;
                            if (teamRequest2 == null) {
                                cwcogvllbjrlvmtn = cwcogvllbjrlvmtn(i3, 146833219);
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1293379896) {
                                int i20 = 345698889 ^ i3;
                                this.teamPlugin.getRequestManager(1259714136).denyInvite(player.getUniqueId(), teamRequest2.getTeamId(347416235), 1472849189);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) != 373228672) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == 373228672 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == (1044599231 ^ i20)) {
                                            break;
                                        }
                                    }
                                    int i21 = 1431455552 ^ i20;
                                    throw new IOException("double");
                                }
                                cwcogvllbjrlvmtn = 1078743986 ^ i20;
                                this.teamPlugin.getConfigManager(152482212).sendMessage(player, Messages.inviteDenied, new String[(byte) (1116451618 ^ cwcogvllbjrlvmtn)], 570565429);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == 341678354) {
                                    cwcogvllbjrlvmtn = 1545002680 ^ cwcogvllbjrlvmtn;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == -185897776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == (909048596 ^ cwcogvllbjrlvmtn)) {
                                        int i22 = 321105336 ^ cwcogvllbjrlvmtn;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == 341678354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == (823250347 ^ cwcogvllbjrlvmtn)) {
                                            break;
                                        }
                                    }
                                }
                                int i23 = 199074351 ^ cwcogvllbjrlvmtn;
                                throw new IOException("double");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == -185897776) {
                                int cwcogvllbjrlvmtn4 = cwcogvllbjrlvmtn(cwcogvllbjrlvmtn, 1277719733);
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(cwcogvllbjrlvmtn4) == 4108926) {
                                        throw new IOException();
                                    }
                                    throw null;
                                } catch (IOException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -1784100486:
                                            i2 = cwcogvllbjrlvmtn(cwcogvllbjrlvmtn4, 2141124086);
                                            break;
                                        case 1045577715:
                                            i2 = cwcogvllbjrlvmtn(cwcogvllbjrlvmtn4, 1256303399);
                                            break;
                                        default:
                                            throw new IllegalAccessException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1767859913) {
                                        cwcogvllbjrlvmtn(i2, 722693558);
                                        return;
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == -185897776) {
                                    int i222 = 321105336 ^ cwcogvllbjrlvmtn;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cwcogvllbjrlvmtn) == 341678354) {
                                        break;
                                        break;
                                    }
                                    continue;
                                }
                            }
                            int i232 = 199074351 ^ cwcogvllbjrlvmtn;
                            throw new IOException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2024972384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (93269455 ^ i2)) {
                    int i24 = 1093488924 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1165318994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (61468595 ^ i2)) {
                        int i25 = 423580771 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 248945226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1966997955 ^ i2)) {
                            int i26 = 1312619448 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1767859913 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1180211971 ^ i2)) {
                                int i27 = 259088066 ^ i2;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -62484509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1227419771 ^ i3)) {
                int i28 = 787959127 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1293379896 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2081877418 ^ i3)) {
                    int i29 = 301137369 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1505628198 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1972750565 ^ i3)) {
                        int i30 = 1538270630 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1784100486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (908843075 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i31 = 89975388 ^ i3;
        throw new IOException("double");
    }

    @Override
    public java.util.List onTab(org.bukkit.command.CommandSender r10, java.lang.String[] r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.commands.TeamCommand.onTab(org.bukkit.command.CommandSender, java.lang.String[], int):java.util.List");
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
        jtwvxvpube = wpsvzxclluhokkx();
        kuKmZuWYjL = (-1282050266) ^ new Random(7879641201302238176L).nextInt();
    }

    public static String ekbvmxttht(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ jtwvxvpube[i3 % jtwvxvpube.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] wpsvzxclluhokkx() {
        return new byte[]{25, 26, 121, 27, 125, 39, 106, 102, 60, 50, 16, 17, 84, 45, 1, 94, 57, 76, 56, 114, 120, 93, 108, 14, 102};
    }

    private static byte[] jzlsmhdzalkhbsj() {
        return new byte[]{-42, -44, 64, 82, 77, 102, 89, 58, 15, 98, 33, 89, 109, 122, 49, 29, 10, 1};
    }

    private static byte[] yqzdjiehmplhrmp() {
        return new byte[]{-33, -35, 73, -115, 73, 115, 83, 24, 15, 107, 40, 72, 101, 117, 54, 2, 1, 27, 0, 106, 72, 24, 88, 86, 95, 1, 41, 42, 35, 36, 22, 61, 81, 110, 10, 3, 41, 28, 29, 92, 106, 111, 117, 121, 65, 37, 101, 46, 63, 124, 46, 3, 65, 120, 69, 115, 90, 50, 8, 100, 41, 90, 103, 112, 57, 78, 8, 12, 15, 57, 64, 23, 84, 22, 86, 73, 46, 41, 34, 36, 20, 59, 94, 98, 3, 10};
    }

    private static byte[] fozcsuemxzerogr() {
        return new byte[]{-43, -44, 75, -123, 79, 115, 88, 20, 12, 96, 34, 73, 102, 120, 51, 12, 11, 28, 8, 97, 74, 24, 94, 88, 84, 14, 40, 33, 43, 43, 21, 58, 84, 115, 0, 66, 35, 64, 29, 70, 108, 109, 126, 96, 64, 34, 111, 118, 62, 117, 43, 123, 75, 78, 79, 117, 88, 51, 12, 114, 34, 69, 102, 52, 51, 10, 11, 23, 8, 47, 74, 24, 94, 86, 84, 77, 40, 57, 43, 110, 21, 58, 84, 107, 0, 7, 35, 1, 29, 86, 108, 101, 126, 104, 64, 33, 111, 49, 62, 38, 43, 95, 75, 80, 79, 113, 88, 38, 12, 110, 34, 82, 102, 58};
    }

    private static byte[] vxtyzuvtdcgqspu() {
        return new byte[]{-42, -36, 77, -118, 68, 113, 94, 25, 5, 96, 33, 65, 96, 119, 56, 14, 13, 17, 1, 97, 73, 16, 88, 87, 95, 12, 46, 42, 34, 33, 22, 58, 82, 100, 11, 5, 37, 25, 20, 87, 111, 97, 120, 99, 75, 99, 105, 117, 55, 5, 40, 79, 77, 72, 68, 115, 94, 44, 5, 100, 33, 8, 96, 111, 56, 25, 13, 12, 1, 97, 73, 5, 88, 95, 95, 77, 46, 41, 34, 32, 22, 125};
    }

    private static byte[] owcheugxddqriao() {
        return new byte[]{-46, -41, 72, 89, 78, 107, 92, 59, 5, 102, 34, 77, 109, 99};
    }

    private static byte[] ltouyikoyjuclzv() {
        return new byte[]{-42, -41, 74, 84, 79, 99, 82, 58, 15, 97, 33, 90, 103, 124, 51, 24, 1, 1};
    }

    private static byte[] hdskshwnibkwctu() {
        return new byte[]{-46, -35, 72, 89, 76, 103, 91, 56, 10, 102, 40, 89, 109, 121, 49, 29, 11, 7};
    }

    private static byte[] bfpgnchprcpjwqn() {
        return new byte[]{-33, -35, 65, 72, 76, 122, 95, 48, 10, 126};
    }

    private static byte[] dcwsptqggxhtayh() {
        return new byte[]{-46, -47, 78, 90, 78, 114, 92, 38, 11, 111, 36, 73, 102, 115, 49, 13};
    }

    private static byte[] bftntlbktzgybno() {
        return new byte[]{-34, -45, 73, 64, 75, 121, 90, 49, 11, 96};
    }

    private static byte[] izybqhjehjdedjh() {
        return new byte[]{-47, -41, 78, 77, 76, 101, 93, 52, 5, 101, 34, 82, 97, 121};
    }

    private static byte[] oidozxwsjysbyco() {
        return new byte[]{-47, -47, 79, 67, 73, 122, 82, 55, 5, 114, 36, 66};
    }

    private static byte[] oopktgfmavnydxo() {
        return new byte[]{-46, -46, 78, 77, 76, 116, 93, 56, 4, 126};
    }

    private static byte[] xzpghvolzkzhlhd() {
        return new byte[]{-45, -43, 64, 68, 68, 125, 89, 50, 8, 99};
    }

    private static byte[] ctokmzilchzwuhs() {
        return new byte[]{-42, -46, 75, 75, 69, 113, 88, 63, 10, 96, 33, 82, 102, 124, 57, 5, 11, 22, 14, 40, 73, 15};
    }

    private static byte[] vycfdufoyhwxpzk() {
        return new byte[]{-42, -45, 65, 64, 72, 122, 95, 35, 4, 105, 33, 83, 108, 122};
    }

    private static byte[] oprrfjojgnfibnx() {
        return new byte[]{-42, -36, 75, 73, 75, 125, 83, 39, 14, 98, 33, 73, 102, 117, 55, 9};
    }

    private static byte[] lfbcvmhexaltcqd() {
        return new byte[]{-42, -42, 77, 74, 73, 119, 93, 52, 15, 103, 33, 82, 96, 105};
    }

    private static byte[] ndhsbrqblckaynm() {
        return new byte[]{-42, -36, 77, -120, 68, 112, 90, 11, 11, 112, 41, 68, 96, 115, 53, 11, 1, 65, 9, 107, 76, 70, 85, 78, 86, 68, 45, 41, 34, 36, 19, 115, 82, 111, 10, 85, 32, 8, 25, 84, 103, 121, 124, 101, 69, 105, 100, 100, 58, 49, 45, 75, 65, 65, 76, 123, 94, 108};
    }

    private static byte[] izbbrezhuabsoxb() {
        return new byte[]{-46, -42, 75, 86, 72, 110, 94, 62, 11, 102, 35, 90, 98, 125, 56, 24, 13, 6};
    }

    private static byte[] gvovspsdmjjeqgz() {
        return new byte[]{-42, -47, 79, 81, 78, 103, 95, 57, 8, 100, 33, 92, 98, 121, 50, 28, 12, 2};
    }

    private static byte[] arpwlihqzsjieym() {
        return new byte[]{-42, -35, 74, 83, 74, 118, 94, 60, 15, 107, 33, 68, 103, Byte.MAX_VALUE, 54, 2, 13, 29, 11, 59};
    }

    private static byte[] psiivfpazxzgfus() {
        return new byte[]{-42, -36, 76, 82, 78, 98, 88, 54, 12, 96, 33, 69, 97, 98};
    }

    private static byte[] goiirfwgzebpfac() {
        return new byte[]{-42, -35, 64, 80, 73, 100, 90, 52, 10, 106, 33, 68, 109, 96};
    }

    private static byte[] sytazujaehjylqf() {
        return new byte[]{-42, -35, 64, 74, 73, 126, 90, 40, 10, 43, 33, 93, 109, 120, 53, 8, 9, 22};
    }

    private static byte[] nlyyknorlnondjd() {
        return new byte[]{-33, -48, 65, 81, 77, 96, 82, 51, 14, 107, 37, 68, 101, 96};
    }

    private static byte[] mmnlvtuvmxdclmu() {
        return new byte[]{-42, -44, 79, -116, 72, 113, 89, 10, 10, 101, 33, 85, 98, 61, 52, 6, 10, 12, 14, 57, 73, 24, 90, 30, 83, 72, 41, 37, 45, 54, 22, 57, 80, 109, 7, 75, 34, 5, 27, 25, 111, 124, 122, 96, 71, 40, 110, 121, 56, 42, 40, 78, 79, 74, 72, Byte.MAX_VALUE, 89, 115, 10, 101, 33, 82, 98, 61, 52, 31, 10, 11, 14, 43, 73, 2, 90, 77, 83, 74, 41, 41, 45, 55, 22, 123, 80, 96, 7, 64, 34, 0, 27, 93, 111, 109, 122, 122, 71, 62, 110, 49, 56, 55, 40, 91, 79, 11, 72, 116, 89, 58, 10, 120, 33, 83, 98, 105, 52, 69};
    }

    private static byte[] lhftbviasxvqghc() {
        return new byte[]{-42, -35, 78, 89, 72, 96, 91, 63, 5, 96, 33, 80, 99, 113, 52, 27, 8, 4};
    }

    private static byte[] bgmssfyqdmocgit() {
        return new byte[]{-42, -46, 72, 77, 68, 119, 82, 48, 13, 99, 33, 86, 101, 110};
    }

    private static byte[] ibocyxstknxvvhb() {
        return new byte[]{-45, -41, 64, 65, 75, 123, 95, 36, 13, 111, 34, 92, 103, 126};
    }

    private static byte[] qhmpkjjxigkgmxj() {
        return new byte[]{-42, -44, 73, 79, 69, Byte.MAX_VALUE, 90, 35, 14, 96, 33, 65, 100, 115, 57, 11};
    }

    private static byte[] rdrjcgwlruknbiu() {
        return new byte[]{-42, -44, 73, 71, 69, 115, 90, 49, 14, 116, 33, 69};
    }

    private static byte[] xfabnjofszqkrkb() {
        return new byte[]{-42, -44, 73, 64, 69, Byte.MAX_VALUE, 90, 51, 14, 105};
    }

    private static byte[] wcprvlgnmycvpgb() {
        return new byte[]{-42, -44, 73, 66, 69, 120, 90, 38, 14, 107, 33, 84, 100, 120};
    }

    private static byte[] ibyeflcnbhflkcl() {
        return new byte[]{-42, -44, 73, 88, 69, 115, 90, 36, 14, 106, 33, 79, 100, 112, 57, 10};
    }

    private static byte[] pvqrynmsjvxjuko() {
        return new byte[]{-42, -44, 73, 67, 69, 121, 90, 61, 14, 103};
    }

    private static byte[] nsgccskzebrsett() {
        return new byte[]{-42, -44, 73, 72, 69, 126, 90, 49, 14, 118};
    }

    private static byte[] rtoflsexftjjslm() {
        return new byte[]{-42, -44, 73, 79, 69, 115, 90, 60, 14, 103, 33, 84, 100, 120, 57, 7, 9, 21, 10, 47, 73, 9};
    }

    private static byte[] xfukeajgucbcids() {
        return new byte[]{-43, -48, 74, 65, 69, 109, 93, 48, 9, 97, 37, 86, 109, 112};
    }

    private static byte[] kubzjvhniqwuldl() {
        return new byte[]{-42, -47, 64, 76, 74, 123, 90, 62, 4, 115};
    }

    private static byte[] vhzwnnwppptnjql() {
        return new byte[]{-34, -41, 64, 68, 68, 118, 92, 52, 10, 96};
    }

    private static byte[] bffriepwsyuguzd() {
        return new byte[]{-42, -48, 64, 76, 77, 118, 89, 61, 9, 102, 37, 88, 98, 105};
    }

    private static byte[] uebdmpgvuqtyzyb() {
        return new byte[]{-42, -43, 76, 74, 75, 114, 93, 58, 14, 122};
    }

    private static int cwcogvllbjrlvmtn(int i, int i2) {
        return i ^ i2;
    }
}
