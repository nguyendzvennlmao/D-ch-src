package com.kammoun.donutCore.team.models;

import com.kammoun.donutCore.team.models.Enums.Permissions;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class TeamMember {
    private final UUID memberID;
    private final HashMap<Permissions, Boolean> memberPermissions;
    private final Timestamp joinDate;
    private boolean teamChatEnabled;
    private static int y3A5Enbdml = 0;
    private transient int Zse5ZgQKlt = 603808752;
    private static String enofdwzual;
    private static String[] nothing_to_see_here = new String[17];

    public TeamMember(UUID uuid, UUID uuid2, HashMap<Permissions, Boolean> hashMap, Timestamp timestamp) {
        int i = 791249168 ^ (1112626216 ^ 1235855205);
        int parseInt = 711036509 ^ (1614125900 ^ Integer.parseInt("1854236492"));
        this.Zse5ZgQKlt = 603808752 ^ y3A5Enbdml;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 123070789:
                    parseInt = 1727137458 ^ parseInt;
                    break;
                case 232534514:
                case 1877786206:
                    break;
                case 2042116945:
                default:
                    throw new RuntimeException();
            }
        }
        this.memberID = uuid;
        this.memberPermissions = uuid2;
        this.joinDate = hashMap;
        int i2 = 802630917 ^ (1107931886 ^ (1431349942 ^ (982070434 ^ parseInt)));
    }

    public boolean hasPermission(Permissions permissions, int i) {
        int i2 = 608954250 ^ (1792701677 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 57430232) {
            return this.memberPermissions.getOrDefault(permissions, Boolean.valueOf((boolean) ((byte) (1384706689 ^ (1390770330 ^ i2))))).booleanValue();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1807248374 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1387989280 ^ i2)) {
                int i3 = 951259776 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 57430232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1294295549 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1699781863 ^ i2;
        throw new IOException();
    }

    public void setPermission(Permissions permissions, boolean z, int i) {
        int i2 = 1743425318 ^ (1422822959 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -289356885) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -289356885 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1351846983 ^ i2)) {
                    break;
                }
            }
            int i3 = 1217998304 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1450249687 ^ i2;
        this.memberPermissions.put(permissions, Boolean.valueOf(z));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1565043985) {
            int i5 = 1094683083 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1421140811 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (817416704 ^ i4)) {
                int i6 = 1171394492 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1565043985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (858599307 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 601096451 ^ i4;
        throw new RuntimeException();
    }

    public void removePermission(Permissions permissions) {
        int i = 907843516 ^ (500797012 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 700974243) {
            i = 1803343858 ^ i;
            this.memberPermissions.remove(permissions);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1915665200) {
                int i2 = 779689709 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 700974243 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1078638257 ^ i)) {
                int i3 = 1272618639 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 31870041 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1493919393 ^ i)) {
                    int i4 = 216883852 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1915665200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1836441824 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1173945175 ^ i;
        throw new RuntimeException();
    }

    public OfflinePlayer getOfflinePlayer(int i) {
        int i2 = 773473266 ^ (68832929 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 669032827) {
            int i3 = 1356511714 ^ i2;
            return Bukkit.getOfflinePlayer(this.memberID);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 669032827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1991446476 ^ i2)) {
                int i4 = 1771152179 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1590333847 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1792724953 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 244750864 ^ i2;
        throw new IllegalAccessException();
    }

    public int getPermissionLevel() {
        int i = 41647550 ^ (1996899804 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -603387663) {
            int i2 = 539047799 ^ i;
            return this.memberPermissions.values().stream().filter((v0) -> {
                return v0.booleanValue();
            }).toList().size();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -587156664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (198031388 ^ i)) {
                int i3 = 992007633 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -603387663 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (966635962 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1698238059 ^ i;
        throw new IllegalAccessException();
    }

    public double getBalance() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.models.TeamMember.getBalance():double");
    }

    public String getMemberName() {
        int i = 1441934337 ^ (1918634520 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1251081003) {
            int i2 = 400870006 ^ i;
            return getOfflinePlayer(1528252123).getName();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -172513125 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (886512353 ^ i)) {
                int i3 = 848876632 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1251081003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2141493200 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 817331446 ^ i;
        throw new RuntimeException();
    }

    public void changeTeamChatStatus(int i) {
        int gznexbubnpwrbjno;
        byte b;
        int i2;
        int i3 = 859464143 ^ (215859095 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1998702301) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1998702301 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (672626262 ^ i3)) {
                    break;
                }
            }
            int i4 = 1459295123 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 80575424 ^ i3;
        if (this.teamChatEnabled == (1977007332 ^ i5)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1363810525) {
                i5 = 323915475 ^ i5;
                b = (byte) (1721250358 ^ i5);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 885100987) {
                    int i6 = 1757498066 ^ i5;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 198005858) {
                            throw new IllegalAccessException();
                        }
                        throw null;
                    } catch (IllegalAccessException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -93469526:
                                i2 = gznexbubnpwrbjno(i6, 706989159);
                                break;
                            case 1925957416:
                                i2 = 2067205143 ^ i6;
                                break;
                            default:
                                throw new RuntimeException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1418483821) {
                            gznexbubnpwrbjno = gznexbubnpwrbjno(i2, 1887731815);
                        } else {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1925957416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (743762597 ^ i2)) {
                                    int i7 = 1936669485 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1506054370 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1399514976 ^ i2)) {
                                        int i8 = 900044410 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1418483821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2096635579 ^ i2)) {
                                            int i9 = 1044065684 ^ i2;
                                            throw new RuntimeException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 885100987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1349753141 ^ i5)) {
                    int i10 = 1768349807 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1363810525 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (723807626 ^ i5)) {
                        break;
                    }
                }
            }
            int i11 = 1920800421 ^ i5;
            throw new RuntimeException("double");
        }
        gznexbubnpwrbjno = gznexbubnpwrbjno(i5, 993589016);
        b = (byte) (1324239868 ^ gznexbubnpwrbjno);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == 2003984354) {
            gznexbubnpwrbjno = 1258602345 ^ gznexbubnpwrbjno;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == 794272936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == (811295710 ^ gznexbubnpwrbjno)) {
                int i12 = 451058493 ^ gznexbubnpwrbjno;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) != 2003984354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == (246595502 ^ gznexbubnpwrbjno)) {
                    int i13 = 147537105 ^ gznexbubnpwrbjno;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == -93469526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == (1888148334 ^ gznexbubnpwrbjno)) {
                        int i14 = 583131103 ^ gznexbubnpwrbjno;
                        throw new RuntimeException("double");
                    }
                }
            }
        }
        this.teamChatEnabled = b;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == 794272936) {
            int i15 = 1322411657 ^ gznexbubnpwrbjno;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == 794272936) {
                int i122 = 451058493 ^ gznexbubnpwrbjno;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) != 2003984354) {
                    continue;
                } else {
                    int i132 = 147537105 ^ gznexbubnpwrbjno;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(gznexbubnpwrbjno) == -93469526) {
                        int i142 = 583131103 ^ gznexbubnpwrbjno;
                        throw new RuntimeException("double");
                    }
                    continue;
                }
            }
        }
    }

    public boolean isOnline(int i) {
        int i2 = 1723321482 ^ (1947406223 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -490286134) {
            int i3 = 59617121 ^ i2;
            return getOfflinePlayer(1528252123).isOnline();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -490286134 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1452812483 ^ i2)) {
                int i4 = 1976351068 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -22304574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1812223523 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1444187466 ^ i2;
        throw new IOException();
    }

    public Player getPlayer(int i) {
        int i2 = 1246160905 ^ (220433259 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1288425712) {
            int i3 = 1156432472 ^ i2;
            return getOfflinePlayer(1528252123).getPlayer();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1806025266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (288280102 ^ i2)) {
                int i4 = 2089308599 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1288425712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1831796407 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 106877892 ^ i2;
        throw new IOException();
    }

    @Generated
    public UUID getMemberID(int i) {
        int i2 = 461526388 ^ (1578219484 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1535106720) {
            int i3 = 528499378 ^ i2;
            return this.memberID;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1484928208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1339976312 ^ i2)) {
                int i4 = 1681132379 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1535106720 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (952035981 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 193834870 ^ i2;
        throw new IOException();
    }

    @Generated
    public HashMap<Permissions, Boolean> getMemberPermissions() {
        int i = 533956072 ^ (621494013 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1591405749) {
            int i2 = 523928956 ^ i;
            return this.memberPermissions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1492203691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (357072592 ^ i)) {
                int i3 = 1342200528 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1591405749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1737343584 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2082959726 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public Timestamp getJoinDate() {
        int i = 2136635307 ^ (703410725 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1034229872) {
            int i2 = 450787069 ^ i;
            return this.joinDate;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 346640504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (188456474 ^ i)) {
                int i3 = 1520966783 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1034229872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (620260963 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 203225713 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public boolean isTeamChatEnabled(int i) {
        int i2 = 1848356845 ^ (1053599035 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -254239408) {
            int i3 = 536064202 ^ i2;
            return this.teamChatEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 256187136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (169906912 ^ i2)) {
                int i4 = 2020273956 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -254239408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (840190032 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 998895452 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public void setTeamChatEnabled(boolean z) {
        int i = 2007891870 ^ (381009468 ^ 1325144444);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2132985585) {
            int i2 = 416120235 ^ i;
            this.teamChatEnabled = z;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2132985585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (945476233 ^ i)) {
                int i3 = 506861663 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1186387031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (670851821 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2063972991 ^ i;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
        nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
        nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
        nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
        nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
        nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
        nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
        nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
        nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
        nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
        nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
        nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
        nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
        nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
        nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
        enofdwzual = ByteBuffer.wrap(pfwfsnrynkgksyr()).asCharBuffer().toString();
        y3A5Enbdml = (-62912666) ^ new Random(1099880387101523039L).nextInt();
    }

    public static String waewittfpo(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = enofdwzual.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] pfwfsnrynkgksyr() {
        return new byte[0];
    }

    private static int gznexbubnpwrbjno(int i, int i2) {
        return i ^ i2;
    }
}
