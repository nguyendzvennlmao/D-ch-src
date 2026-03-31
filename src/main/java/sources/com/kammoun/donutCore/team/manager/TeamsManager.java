package com.kammoun.donutCore.team.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.team.TeamPlugin;
import com.kammoun.donutCore.team.models.Enums.Permissions;
import com.kammoun.donutCore.team.models.Team;
import com.kammoun.donutCore.team.models.TeamMember;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.entity.Player;

public class TeamsManager {
    private final TeamPlugin plugin;
    private final ConcurrentHashMap<UUID, Team> loadedTeams;
    private final ConcurrentHashMap<UUID, UUID> playerToTeam;
    private static int CW6mI5EqmY = 0;
    private transient int nFYvZzVCbz = 251225696;
    private static byte[] yoqzirzlnl;
    private static String[] nothing_to_see_here = new String[19];

    public TeamsManager(TeamPlugin teamPlugin, int i) {
        int i2 = 175291832 ^ 2098379071;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 122322853:
                    int i3 = 1473733803 ^ i2;
                    break;
                case 625465258:
                case 1419775922:
                    break;
                case 1546655627:
                default:
                    throw new IOException();
            }
        }
        int parseInt = 332386287 ^ (2021234207 ^ Integer.parseInt("1258371548"));
        this.nFYvZzVCbz = 251225696 ^ CW6mI5EqmY;
        int ntehtmludgioeviu = 2057642084 ^ ntehtmludgioeviu(parseInt, 1743170662);
        this.loadedTeams = new ConcurrentHashMap<>();
        this.playerToTeam = new ConcurrentHashMap<>();
        this.plugin = teamPlugin;
        int i4 = 1790216441 ^ (1774439021 ^ (1868017855 ^ ntehtmludgioeviu));
    }

    public void loadTeam(Player player, int i) {
        int i2 = 171617970 ^ (674611977 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -861905016) {
            i2 = 1774237426 ^ i2;
            loadTeam(player.getUniqueId(), 1728885926);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2103056357) {
                int i3 = 224392143 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -861905016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (139226092 ^ i2)) {
                int i4 = 1233990522 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2103056357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1844236447 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2070536750 ^ i2;
        throw new IOException();
    }

    public void loadTeam(UUID uuid, int i) {
        int i2 = 1166569504 ^ (443171415 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 600482283) {
            i2 = 1053542908 ^ i2;
            if (this.playerToTeam.containsKey(uuid) == (1521655233 ^ i2)) {
                i2 = 427135893 ^ i2;
                SchedulerUtil.runAsync(() -> {
                    int i3;
                    Optional teamByMemberSync;
                    int i4;
                    int i5 = 933647554 ^ (1781927533 ^ 1000040010);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 811198251) {
                        int i6 = 351206282 ^ i5;
                        i5 = i6;
                        try {
                            teamByMemberSync = this.plugin.getTeamTable(261175650).getTeamByMemberSync(uuid, 2118511223);
                        } catch (Exception e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1819449725:
                                    i3 = 384070655 ^ i5;
                                    break;
                                case -1758577797:
                                    i3 = 376444992 ^ i5;
                                    break;
                                case 721181898:
                                    i3 = 566908086 ^ i5;
                                    break;
                                case 1879803913:
                                    i3 = 1251257902 ^ i5;
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                            ?? r21 = i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 615446907) {
                                i5 = 509948372 ^ i3;
                                r21.printStackTrace();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -678987813) {
                                    int i7 = 878107397 ^ i5;
                                    return;
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 615446907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2093510598 ^ i3)) {
                                        int i8 = 2141649974 ^ i3;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1758577797) {
                            i5 = 934956278 ^ i5;
                            if (teamByMemberSync.isPresent() != (1163889561 ^ i5)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 721181898) {
                                    int i9 = 1801386648 ^ i5;
                                    Team team = (Team) teamByMemberSync.get();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 1879803913) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1879803913 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1837847029 ^ i9)) {
                                                break;
                                            }
                                        }
                                        int i10 = 1749425882 ^ i9;
                                        throw new IllegalAccessException("double");
                                    }
                                    i5 = 1550900689 ^ i9;
                                    SchedulerUtil.run(() -> {
                                        int i11 = 1963908891 ^ (993232445 ^ 1000040010);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1389233309) {
                                            i11 = 1105360365 ^ i11;
                                            this.loadedTeams.put(team.getTeamID(659316535), team);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1574808567) {
                                                i11 = 2134301290 ^ i11;
                                                this.playerToTeam.put(team.getLeaderID(248178949), team.getTeamID(659316535));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1536460634) {
                                                    i11 = 938833930 ^ i11;
                                                    Iterator it = team.getMembers(1643494441).iterator();
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -465615093) {
                                                        i11 = 1531858221 ^ i11;
                                                        while (it.hasNext() != (667526604 ^ i11)) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1045245537) {
                                                                i11 = 387977645 ^ i11;
                                                                TeamMember teamMember = (TeamMember) it.next();
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -2024955127) {
                                                                    i11 = 1906476104 ^ i11;
                                                                    this.playerToTeam.put(teamMember.getMemberID(629337533), team.getTeamID(659316535));
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 173637962) {
                                                                        int i12 = 1271493978 ^ i11;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1410476952) {
                                                                            int i13 = 267350836 ^ i12;
                                                                            try {
                                                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i13) == 85354383) {
                                                                                    throw new IOException();
                                                                                }
                                                                                throw null;
                                                                            } catch (IOException e2) {
                                                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                                                                    case 728347192:
                                                                                        i11 = ntehtmludgioeviu(i13, 1851321651);
                                                                                        break;
                                                                                    case 940611049:
                                                                                        i11 = ntehtmludgioeviu(i13, 1278724553);
                                                                                        break;
                                                                                    default:
                                                                                        throw new IOException("Error in hash");
                                                                                }
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1504631715) {
                                                                                }
                                                                                while (true) {
                                                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i11)) {
                                                                                        case 263729669:
                                                                                            i11 = 1291615928 ^ i11;
                                                                                            break;
                                                                                        case 1556487856:
                                                                                        case 1893231853:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            while (true) {
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1410476952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1882993001 ^ i12)) {
                                                                                    int i14 = 152749972 ^ i12;
                                                                                    throw new IOException("double");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int i15 = 519923975 ^ i11;
                                                        return;
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -911841703 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (2060091434 ^ i11)) {
                                                            int i16 = 465724853 ^ i11;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -2024955127 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1777854095 ^ i11)) {
                                                                int i17 = 1716760775 ^ i11;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 173637962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (115279923 ^ i11)) {
                                                                    int i18 = 449135799 ^ i11;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1045245537 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (467678363 ^ i11)) {
                                                                        int i19 = 835786832 ^ i11;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 728347192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (600366778 ^ i11)) {
                                                                            int i20 = 1697767310 ^ i11;
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -465615093 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1806424517 ^ i11)) {
                                                                                int i21 = 953109734 ^ i11;
                                                                                throw new RuntimeException();
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1574808567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1225006317 ^ i11)) {
                                                    int i22 = 72988236 ^ i11;
                                                    throw new RuntimeException("double");
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1504631715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (87320219 ^ i11)) {
                                                int i23 = 913477661 ^ i11;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1389233309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1608883474 ^ i11)) {
                                                    int i24 = 95639845 ^ i11;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1536460634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1219364684 ^ i11)) {
                                                        int i25 = 62741815 ^ i11;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }, 1403588420);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1819449725) {
                                        i6 = 649953887 ^ i5;
                                        i5 = i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1503562630) {
                                            int i11 = 2049601305 ^ i5;
                                            try {
                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i11) == 182333940) {
                                                    throw new IOException();
                                                }
                                                throw null;
                                            } catch (IOException e2) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                                    case 625335203:
                                                        i4 = 125502742 ^ i11;
                                                        break;
                                                    case 1999768753:
                                                        i4 = 1295384564 ^ i11;
                                                        break;
                                                    default:
                                                        throw new IllegalAccessException("Error in hash");
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 513667859) {
                                                    int i12 = 762678172 ^ i4;
                                                    return;
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 513667859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (943947145 ^ i4)) {
                                                        int i13 = 852222308 ^ i4;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -678987813 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (551699157 ^ i5)) {
                                                int i14 = 809223647 ^ i5;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1503562630 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (500217726 ^ i5)) {
                                                    int i15 = 1462529468 ^ i5;
                                                    throw new RuntimeException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 721181898 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (668481441 ^ i5)) {
                                        int i16 = 1780240940 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1819449725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (554672602 ^ i5)) {
                                            int i17 = 378121164 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 625335203 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2044135072 ^ i5)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                int i18 = 2095943270 ^ i5;
                                throw new RuntimeException();
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                                    case 107567911:
                                        i5 = 294888726 ^ i5;
                                        break;
                                    case 133688973:
                                    case 247855430:
                                        break;
                                    case 1351075517:
                                    default:
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1999768753 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1058083945 ^ i5)) {
                                                int i19 = 1817116821 ^ i5;
                                                throw new IOException("double");
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1758577797 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1904059072 ^ i5)) {
                            int i20 = 68718544 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 811198251 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (133998479 ^ i5)) {
                                break;
                            }
                        }
                    }
                    int i21 = 241779792 ^ i5;
                    throw new IllegalAccessException("double");
                }, 1163669431);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 507015842) {
                    int i3 = 1484763568 ^ i2;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -711660022) {
                int i4 = 2044128235 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 600482283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (856359636 ^ i2)) {
                int i5 = 372718057 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 507015842 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1861742883 ^ i2)) {
                    int i6 = 1847291263 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -574226656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1036703413 ^ i2)) {
                        int i7 = 1132472191 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 455323985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (997521379 ^ i2)) {
                            int i8 = 1876338418 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -711660022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (276852181 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i9 = 368703454 ^ i2;
        throw new RuntimeException();
    }

    public java.util.concurrent.CompletableFuture createTeam(org.bukkit.entity.Player r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeamsManager.createTeam(org.bukkit.entity.Player, java.lang.String, int):java.util.concurrent.CompletableFuture");
    }

    public java.util.concurrent.CompletableFuture addMember(java.util.UUID r7, java.util.UUID r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeamsManager.addMember(java.util.UUID, java.util.UUID, int):java.util.concurrent.CompletableFuture");
    }

    public java.util.concurrent.CompletableFuture leaveTeam(java.util.UUID r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeamsManager.leaveTeam(java.util.UUID, int):java.util.concurrent.CompletableFuture");
    }

    public java.util.concurrent.CompletableFuture kickMember(java.util.UUID r7, java.util.UUID r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeamsManager.kickMember(java.util.UUID, java.util.UUID, int):java.util.concurrent.CompletableFuture");
    }

    public CompletableFuture setMemberPermission(UUID uuid, UUID uuid2, Permissions permissions, boolean z, int i) {
        int i2 = 518372995 ^ (1121548258 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1027438939) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1027438939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (397597133 ^ i2)) {
                    int i3 = 987910359 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -31308005 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (312802430 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 774607207 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i5 = 256626994 ^ i2;
        UUID uuid3 = this.playerToTeam.get(uuid);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1197732043) {
            int i6 = 1621167884 ^ i5;
            if (uuid3 == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1114343592) {
                    return CompletableFuture.completedFuture(Boolean.valueOf((boolean) ((byte) (2143570147 ^ (2005481974 ^ i6)))));
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1114343592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (321848830 ^ i6)) {
                        break;
                    }
                }
                int i7 = 1270914486 ^ i6;
                throw new RuntimeException("double");
            }
            int i8 = 1624187826 ^ i6;
            Team team = this.loadedTeams.get(uuid3);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1142068539) {
                i5 = 664864009 ^ i8;
                if (team != null) {
                    int i9 = 100302110 ^ i5;
                    if (team.updateMemberPermissions(uuid, uuid2, permissions, z, 1927970481) == (1255746224 ^ i9)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1456035202) {
                            return CompletableFuture.completedFuture(Boolean.valueOf((boolean) ((byte) (1701853707 ^ (799609019 ^ i9)))));
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1828459554 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (2014550534 ^ i9)) {
                                int i10 = 358996513 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1456035202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1296762599 ^ i9)) {
                                    break;
                                }
                            }
                        }
                        int i11 = 1756981094 ^ i9;
                        throw new RuntimeException("double");
                    }
                    i8 = ntehtmludgioeviu(i9, 244524630);
                    CompletableFuture completableFuture = new CompletableFuture();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 575694642) {
                        i5 = 520206633 ^ i8;
                        SchedulerUtil.runAsync(() -> {
                            int ntehtmludgioeviu;
                            int i12;
                            int i13 = 1674650313 ^ (1002211601 ^ 1000040010);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != 532049043) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 532049043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (71791035 ^ i13)) {
                                        break;
                                    }
                                }
                                int i14 = 833198923 ^ i13;
                                throw new RuntimeException("double");
                            }
                            ?? r0 = 344456586 ^ i13;
                            int i15 = r0;
                            try {
                                boolean permissionSync = this.plugin.getTeamTable(261175650).setPermissionSync(uuid3, uuid2, permissions, z, 1516586990);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -1148616509) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1148616509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1835598220 ^ i15)) {
                                            break;
                                        }
                                    }
                                    int i16 = 2057428520 ^ i15;
                                    throw new IllegalAccessException("double");
                                }
                                int i17 = 343282251 ^ i15;
                                completableFuture.complete(Boolean.valueOf(permissionSync));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != 406393499) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == 406393499 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (2001886864 ^ i17)) {
                                            break;
                                        }
                                    }
                                    int i18 = 1458855251 ^ i17;
                                    throw new IllegalAccessException("double");
                                }
                                i15 = 1539029255 ^ i17;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -974857567) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -974857567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (133096826 ^ i15)) {
                                            break;
                                        }
                                    }
                                    int i19 = 1786611962 ^ i15;
                                    throw new IllegalAccessException("double");
                                }
                                int i20 = 75716594 ^ i15;
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i20) == 79405246) {
                                        throw new IllegalAccessException();
                                    }
                                    throw null;
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -503421647:
                                            i12 = ntehtmludgioeviu(i20, 2106158917);
                                            break;
                                        case 1895914011:
                                            i12 = 798394528 ^ i20;
                                            break;
                                        default:
                                            throw new IllegalAccessException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 229973786) {
                                        ntehtmludgioeviu(i12, 1135399750);
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 503500273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (581176215 ^ i12)) {
                                            int i21 = 1061515197 ^ i12;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -503421647 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1082075506 ^ i12)) {
                                                int i22 = 595597 ^ i12;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 229973786 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1178281656 ^ i12)) {
                                                    int i23 = 1450348107 ^ i12;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1895914011 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1031560270 ^ i12)) {
                                                        int i24 = 827623842 ^ i12;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 282297640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1724076926 ^ i12)) {
                                                            int i25 = 1565285049 ^ i12;
                                                            throw new IOException();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                    case -1148616509:
                                        ntehtmludgioeviu = 1230146588 ^ i15;
                                        break;
                                    case 406393499:
                                        ntehtmludgioeviu = ntehtmludgioeviu(i15, 1562680919);
                                        break;
                                    default:
                                        throw new IllegalAccessException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu) == -249700319) {
                                    i12 = 501474746 ^ ntehtmludgioeviu;
                                    r0.printStackTrace();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 503500273) {
                                        int i26 = 650423531 ^ i12;
                                        completableFuture.complete(Boolean.valueOf((boolean) ((byte) (84211029 ^ i26))));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == 673688232) {
                                            int i27 = 119440880 ^ i26;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == 673688232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i26) == (1202205058 ^ i26)) {
                                                int i28 = 1900218215 ^ i26;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu) == -249700319 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu) == (820918329 ^ ntehtmludgioeviu)) {
                                            int i29 = 1297621334 ^ ntehtmludgioeviu;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            }
                        }, 1163669431);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -631394694) {
                            int i12 = 383006539 ^ i5;
                            return completableFuture;
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2031795570) {
                    return CompletableFuture.completedFuture(Boolean.valueOf((boolean) ((byte) (1454869065 ^ (429186535 ^ i5)))));
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 575694642 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2035724511 ^ i8)) {
                    int i13 = 1923648815 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1142068539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (811777805 ^ i8)) {
                        break;
                    }
                }
            }
            int i14 = 567036653 ^ i8;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -631394694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (769134345 ^ i5)) {
                int i15 = 1832360862 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1197732043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (302408283 ^ i5)) {
                    int i16 = 1199679800 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2031795570 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (457559450 ^ i5)) {
                        break;
                    }
                }
            }
        }
        int i17 = 2051066945 ^ i5;
        throw new IllegalAccessException();
    }

    public java.util.concurrent.CompletableFuture setHomeLocation(java.util.UUID r6, com.kammoun.donutCore.api.utils.location.Klocation r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeamsManager.setHomeLocation(java.util.UUID, com.kammoun.donutCore.api.utils.location.Klocation, int):java.util.concurrent.CompletableFuture");
    }

    public CompletableFuture togglePvP(UUID uuid, int i) {
        int ntehtmludgioeviu;
        int i2 = 66117381 ^ (1948334602 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1649678890) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1649678890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1983914455 ^ i2)) {
                    break;
                }
            }
            int i3 = 319280562 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1929207962 ^ i2;
        UUID uuid2 = this.playerToTeam.get(uuid);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -172024071) {
            int i5 = 1045854015 ^ i4;
            if (uuid2 != null) {
                int i6 = 1394063030 ^ i5;
                Team team = this.loadedTeams.get(uuid2);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1615785294) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1615785294 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (661374995 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 298900867 ^ i6;
                    throw new RuntimeException("double");
                }
                i5 = 953226372 ^ i6;
                if (team != null) {
                    i4 = 1588526468 ^ i5;
                    if (team.isLeader(uuid, 1680523716) == (898222934 ^ i4)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1404151119) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1404151119 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (792872337 ^ i4)) {
                                    break;
                                }
                            }
                            int i8 = 420603007 ^ i4;
                            throw new IOException("double");
                        }
                        int i9 = 134461282 ^ i4;
                        Optional member = team.getMember(uuid, 1918692774);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -330047071) {
                            int i10 = 814453662 ^ i9;
                            if (member.isEmpty() != (218230698 ^ i10)) {
                                ntehtmludgioeviu = ntehtmludgioeviu(i10, 332627385);
                            } else {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 1745845584) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1745845584 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1905323810 ^ i10)) {
                                            break;
                                        }
                                    }
                                    int i11 = 108389033 ^ i10;
                                    throw new RuntimeException("double");
                                }
                                i9 = 832407024 ^ i10;
                                if (((TeamMember) member.get()).hasPermission(Permissions.TOGGLE_PVP, 1929852220) != (1016883802 ^ i9)) {
                                    i4 = 1571868172 ^ i9;
                                    team.changePvPState(175392490);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 157622963) {
                                        i9 = 963689110 ^ i4;
                                        CompletableFuture completableFuture = new CompletableFuture();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1025444350) {
                                            i5 = 1229812103 ^ i9;
                                            SchedulerUtil.runAsync(() -> {
                                                int ntehtmludgioeviu2;
                                                int i12 = 2041829616 ^ (2138062771 ^ 1000040010);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != -356251575) {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -356251575 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (597862777 ^ i12)) {
                                                            break;
                                                        }
                                                    }
                                                    int i13 = 190183899 ^ i12;
                                                    throw new IllegalAccessException("double");
                                                }
                                                ?? r0 = 676032264 ^ i12;
                                                int i14 = r0;
                                                try {
                                                    boolean updatePvPStateSync = this.plugin.getTeamTable(261175650).updatePvPStateSync(uuid2, team.isPvpEnabled(1027710617), 286693129);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -1465946104) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1465946104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1077570166 ^ i14)) {
                                                                int i15 = 769493281 ^ i14;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 588553251 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1564866218 ^ i14)) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        int i16 = 219800761 ^ i14;
                                                        throw new IOException("double");
                                                    }
                                                    int i17 = 799077353 ^ i14;
                                                    completableFuture.complete(Boolean.valueOf(updatePvPStateSync));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != -711397567) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -711397567 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1757411443 ^ i17)) {
                                                                int i18 = 965712777 ^ i17;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -1645399766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1640519844 ^ i17)) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        int i19 = 999502026 ^ i17;
                                                        throw new RuntimeException("double");
                                                    }
                                                    i14 = 738967003 ^ i17;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -1245380200) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1245380200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1155603880 ^ i14)) {
                                                                int i20 = 1323025209 ^ i14;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1042057662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1717511132 ^ i14)) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        int i21 = 1465199105 ^ i14;
                                                        throw new RuntimeException("double");
                                                    }
                                                    int ntehtmludgioeviu3 = ntehtmludgioeviu(i14, 1926902711);
                                                    try {
                                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(ntehtmludgioeviu3) == 41851309) {
                                                            throw new RuntimeException();
                                                        }
                                                        throw null;
                                                    } catch (RuntimeException e) {
                                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                            case -1042057662:
                                                                ntehtmludgioeviu2 = 547372404 ^ ntehtmludgioeviu3;
                                                                break;
                                                            case 588553251:
                                                                ntehtmludgioeviu2 = ntehtmludgioeviu(ntehtmludgioeviu3, 486457400);
                                                                break;
                                                            default:
                                                                throw new IllegalAccessException("Error in hash");
                                                        }
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu2) == -991781405) {
                                                            ntehtmludgioeviu(ntehtmludgioeviu2, 723645849);
                                                            return;
                                                        }
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu2) == -991781405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu2) == (649897521 ^ ntehtmludgioeviu2)) {
                                                                int i22 = 950139402 ^ ntehtmludgioeviu2;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu2) == -769759669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu2) == (873151091 ^ ntehtmludgioeviu2)) {
                                                                    int i23 = 713993207 ^ ntehtmludgioeviu2;
                                                                    throw new IOException();
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e2) {
                                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                                        case -1465946104:
                                                            ntehtmludgioeviu2 = ntehtmludgioeviu(i14, 1867522760);
                                                            break;
                                                        case -711397567:
                                                            ntehtmludgioeviu2 = 1089524001 ^ i14;
                                                            break;
                                                        default:
                                                            throw new IllegalAccessException("Error in hash");
                                                    }
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ntehtmludgioeviu2) == -769759669) {
                                                        int i24 = 2003893566 ^ ntehtmludgioeviu2;
                                                        r0.printStackTrace();
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i24) == 1771671480) {
                                                            int i25 = 1272376093 ^ i24;
                                                            completableFuture.complete(Boolean.valueOf((boolean) ((byte) (1189468906 ^ i25))));
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i25) == 925816658) {
                                                                int i26 = 358120655 ^ i25;
                                                                return;
                                                            }
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i25) == 925816658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i25) == (1565704681 ^ i25)) {
                                                                    int i27 = 1724789731 ^ i25;
                                                                    throw new IllegalAccessException("double");
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i24) == 1771671480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i24) == (2144471814 ^ i24)) {
                                                                    int i28 = 879596012 ^ i24;
                                                                    throw new RuntimeException("double");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }, 1163669431);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2004125128) {
                                                int i12 = 1357716815 ^ i5;
                                                return completableFuture;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 157622963 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (498632151 ^ i4)) {
                                                int i13 = 198693337 ^ i4;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -454864175) {
                                    ntehtmludgioeviu = 575600713 ^ i9;
                                }
                            }
                            return CompletableFuture.completedFuture(Boolean.valueOf((boolean) ((byte) (517116435 ^ ntehtmludgioeviu))));
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -454864175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1203773588 ^ i9)) {
                                int i14 = 602836505 ^ i9;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 309208858 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1162489068 ^ i9)) {
                                    int i15 = 2119680927 ^ i9;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1025444350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (55473865 ^ i9)) {
                                        int i16 = 1263701728 ^ i9;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -330047071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (39398720 ^ i9)) {
                                            int i17 = 649272188 ^ i9;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                            case 129682559:
                                i4 = 1420128000 ^ i4;
                                break;
                            case 787705411:
                            case 1700662073:
                                break;
                        }
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1496954515) {
                    return CompletableFuture.completedFuture(Boolean.valueOf((boolean) ((byte) (1112392931 ^ (694874673 ^ i5)))));
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 118269696) {
                return CompletableFuture.completedFuture(Boolean.valueOf((boolean) ((byte) (153254661 ^ (163835877 ^ i5)))));
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2004125128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (105129040 ^ i5)) {
                    int i18 = 1435444359 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1496954515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2044829166 ^ i5)) {
                        int i19 = 2133015366 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 118269696 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (59534142 ^ i5)) {
                            int i20 = 314746098 ^ i5;
                            throw new IOException();
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -172024071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (185448780 ^ i4)) {
                int i21 = 675657474 ^ i4;
                throw new IOException("double");
            }
        }
    }

    public java.util.concurrent.CompletableFuture deleteTeam(java.util.UUID r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeamsManager.deleteTeam(java.util.UUID, int):java.util.concurrent.CompletableFuture");
    }

    public Optional getTeam(UUID uuid, int i) {
        Optional empty;
        int i2;
        int i3 = 1804293646 ^ (49158116 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1745797886) {
            int i4 = 1953783173 ^ i3;
            UUID uuid2 = this.playerToTeam.get(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 877908265) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 877908265 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1603528628 ^ i4)) {
                        break;
                    }
                }
                int i5 = 1291224901 ^ i4;
                throw new IOException("double");
            }
            i3 = 1941885829 ^ i4;
            if (uuid2 == null) {
                int i6 = 273378302 ^ i3;
                empty = Optional.empty();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 738071282) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 738071282 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (218615051 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 1728932567 ^ i6;
                    throw new IllegalAccessException("double");
                }
                int i8 = 1821336520 ^ i6;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1448784638) {
                i3 = 398406541 ^ i3;
                empty = Optional.ofNullable(this.loadedTeams.get(uuid2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 341627242) {
                    int ntehtmludgioeviu = ntehtmludgioeviu(i3, 944257163);
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(ntehtmludgioeviu) != 232485346) {
                            throw null;
                        }
                        throw new IOException();
                    } catch (IOException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -702737101:
                                i2 = ntehtmludgioeviu(ntehtmludgioeviu, 1565635088);
                                break;
                            case 689898163:
                                i2 = 1118957792 ^ ntehtmludgioeviu;
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1016104369) {
                            int i9 = 241348896 ^ i2;
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1334119601 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1691891460 ^ i2)) {
                                    int i10 = 1924050387 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1016104369 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (657783069 ^ i2)) {
                                        int i11 = 1709371663 ^ i2;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return empty;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -702737101 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1452275373 ^ i3)) {
                int i12 = 900185808 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 341627242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (380804812 ^ i3)) {
                    int i13 = 859115232 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1745797886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (90119862 ^ i3)) {
                        int i14 = 1897773542 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1448784638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (928912931 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i15 = 152382191 ^ i3;
        throw new IllegalAccessException();
    }

    public Optional getTeamById(UUID uuid, int i) {
        int i2 = 1710667315 ^ (733579801 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1365060861) {
            int i3 = 1246886379 ^ i2;
            return Optional.ofNullable(this.loadedTeams.get(uuid));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1365060861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1905754433 ^ i2)) {
                int i4 = 1438213801 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -64152487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (298027149 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 410131786 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean isInTeam(UUID uuid, int i) {
        int i2 = 477918723 ^ (1581419020 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -852700629) {
            int i3 = 192811414 ^ i2;
            return this.playerToTeam.containsKey(uuid);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -852700629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1927800230 ^ i2)) {
                int i4 = 894802194 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1763942757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2139680354 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1454122715 ^ i2;
        throw new IOException();
    }

    public boolean areInSameTeam(java.util.UUID r6, java.util.UUID r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeamsManager.areInSameTeam(java.util.UUID, java.util.UUID, int):boolean");
    }

    public void unloadTeam(UUID uuid) {
        int i = 425396442 ^ (1844988592 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2042700034) {
            int i2 = 528154270 ^ i;
            Team remove = this.loadedTeams.remove(uuid);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -2112432654) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2112432654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (905115495 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1090566397 ^ i2;
                throw new RuntimeException("double");
            }
            int i4 = 1090033306 ^ i2;
            if (remove == null) {
                int i5 = 1909550659 ^ i4;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -2049810144) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2049810144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (43458011 ^ i4)) {
                        break;
                    }
                }
                int i6 = 1756604457 ^ i4;
                throw new IllegalAccessException("double");
            }
            i = 481297132 ^ i4;
            this.playerToTeam.remove(remove.getLeaderID(248178949));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1616016960) {
                int i7 = 154158802 ^ i;
                remove.getMembers(1643494441).forEach(teamMember -> {
                    int i8 = 1243714251 ^ (618290427 ^ 1000040010);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1425718318) {
                        int i9 = 1775310369 ^ i8;
                        this.playerToTeam.remove(teamMember.getMemberID(629337533));
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -443682087 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2142974708 ^ i8)) {
                            int i10 = 306927787 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1425718318 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (278971483 ^ i8)) {
                                break;
                            }
                        }
                    }
                    int i11 = 1058907410 ^ i8;
                    throw new IllegalAccessException();
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 701513936) {
                    int i8 = 1683040893 ^ i7;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 701513936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1685449524 ^ i7)) {
                        break;
                    }
                }
                int i9 = 523821328 ^ i7;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2042700034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1499438942 ^ i)) {
                int i10 = 64863771 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1616016960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1277996719 ^ i)) {
                    break;
                }
            }
        }
        int i11 = 1709088650 ^ i;
        throw new IllegalAccessException();
    }

    public void unloadAllTeams(int i) {
        int i2 = 865905989 ^ (1377630456 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -791044166) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -791044166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (666277232 ^ i2)) {
                    break;
                }
            }
            int i3 = 1850962536 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1845091357 ^ i2;
        this.loadedTeams.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1088979119) {
            i4 = 926690447 ^ i4;
            this.playerToTeam.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 116792104) {
                int i5 = 654791060 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1088979119 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (389385228 ^ i4)) {
                int i6 = 962307350 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 116792104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (524338724 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 589319776 ^ i4;
        throw new IOException();
    }

    public Collection<Team> getAllLoadedTeams() {
        int i = 247875973 ^ (1801209264 ^ 1000040010);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -267693062) {
            int i2 = 906253282 ^ i;
            return Collections.unmodifiableCollection(this.loadedTeams.values());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -267693062 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1839419517 ^ i)) {
                int i3 = 1519299274 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1076481259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2085840250 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 502172553 ^ i;
        throw new RuntimeException();
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
        yoqzirzlnl = uxsljekpozekbmm();
        CW6mI5EqmY = 1450754479 ^ new Random(6361063523692051794L).nextInt();
    }

    public static String gfrhoqtzrg(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ yoqzirzlnl[i3 % yoqzirzlnl.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] uxsljekpozekbmm() {
        return new byte[]{26, 14, 85, 80, 119, 1, 12, 63, 5, 39, 101, 75, 10, 43, 26, 15, 104, 77, 62, 47, 111, 120, 15, 4, 110, 10, 113, 62, 85, 95, 94, 72, 19, 65, 58, 102, 31, 75, 10, 113, 99, 59, 15, 45, Byte.MAX_VALUE, 69, 73, 3, 97, 74, 111, 52, 126, 5, 90, 122, 72, 47, 70, 109, 11, 39, 72, 38, 41, 54, 41, 84, 26, 8};
    }

    private static int ntehtmludgioeviu(int i, int i2) {
        return i ^ i2;
    }
}
