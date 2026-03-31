package com.kammoun.donutCore.leaderboard3.commands;

import com.kammoun.donutCore.leaderboard3.LeaderBoardPlugin3;
import com.kammoun.donutCore.leaderboard3.manager.LeaderboardManager;
import com.kammoun.donutCore.leaderboard3.model.LeaderboardType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class LeaderboardCommand implements CommandExecutor, TabCompleter {
    private final LeaderBoardPlugin3 plugin;
    private final LeaderboardManager manager;
    private static int kzOVyGgAjR = 0;
    private transient int MZs65pzK6k = 144431673;
    private static String qbvrtfnphl;
    private static String[] nothing_to_see_here = new String[13];

    public LeaderboardCommand(LeaderBoardPlugin3 leaderBoardPlugin3, LeaderboardManager leaderboardManager, int i) {
        int i2 = 1361086154 ^ (1253001581 ^ 1038847334);
        int parseInt = 1199182819 ^ (1335305341 ^ Integer.parseInt("780760415"));
        this.MZs65pzK6k = 144431673 ^ kzOVyGgAjR;
        this.plugin = leaderBoardPlugin3;
        this.manager = leaderboardManager;
        int i3 = 552086495 ^ (864763862 ^ (1982565135 ^ (1022496847 ^ parseInt)));
    }

    public boolean onCommand(CommandSender commandSender, Command command, String str, String[] strArr) {
        int i;
        int i2 = 1603974466 ^ (741907175 ^ 462603775);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1099387603) {
            int i3 = 524142569 ^ i2;
            if ((commandSender instanceof Player) == (1997352371 ^ i3)) {
                i = 1200551077 ^ i3;
                commandSender.sendMessage(hawuvxrmub(suhuushskngfsjq(), i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2078357327) {
                    return (byte) (2055584302 ^ (1241932601 ^ i));
                }
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1201050213) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -735194757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2070039316 ^ i3)) {
                            int i4 = 1948643929 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1201050213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (170789536 ^ i3)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1163636439 ^ i3;
                    throw new IllegalAccessException("double");
                }
                int i6 = 1223087914 ^ i3;
                Player player = (Player) commandSender;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -10496823) {
                    int i7 = 185246098 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1492461479) {
                        int i8 = 1142337300 ^ i7;
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) != 182458379) {
                                throw null;
                            }
                            throw new IllegalAccessException();
                        } catch (IllegalAccessException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -2017484549:
                                    i = 366464135 ^ i8;
                                    break;
                                case 938987058:
                                    i = eiaorrzyyromqvst(i8, 601801054);
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 687981763) {
                                i6 = 1369384194 ^ i;
                                if (strArr.length < ((byte) (884940187 ^ i6))) {
                                    i7 = eiaorrzyyromqvst(i6, 620607559);
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1510413103) {
                                    i2 = 303099202 ^ i6;
                                    LeaderboardType fromName = LeaderboardType.fromName(strArr[(byte) (649064664 ^ i2)].toUpperCase());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 897550017) {
                                        i7 = 575467290 ^ i2;
                                        if (fromName != null) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 655949328) {
                                                i2 = 1460324833 ^ i7;
                                                this.manager.openPage(player, fromName, (byte) (1407833635 ^ i2), 32567426);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1622232806) {
                                                    return (byte) (107730378 ^ (1434584040 ^ i2));
                                                }
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 655949328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1468954572 ^ i7)) {
                                                        int i9 = 1113433549 ^ i7;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i7)) {
                                                case 76867878:
                                                    i7 = 346143263 ^ i7;
                                                    break;
                                                case 608618568:
                                                case 778151188:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                this.manager.openMenu(player, 1646499794);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2112540952) {
                                    return (byte) (1982608992 ^ (1718522812 ^ i7));
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2112540952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2132265211 ^ i7)) {
                                        int i10 = 670622181 ^ i7;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1492461479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1215585787 ^ i7)) {
                            int i11 = 1305269701 ^ i7;
                            throw new IOException("double");
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1510413103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1882011445 ^ i6)) {
                        int i12 = 1814459649 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -10496823 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1369723945 ^ i6)) {
                            int i13 = 724254095 ^ i6;
                            throw new IOException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 687981763 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1608805274 ^ i)) {
                    int i14 = 428832235 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2078357327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1774624629 ^ i)) {
                        int i15 = 1224098990 ^ i;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1622232806 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (951549281 ^ i2)) {
                int i16 = 2082156741 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 897550017 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2146263444 ^ i2)) {
                    int i17 = 1277578039 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1099387603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (102947641 ^ i2)) {
                        int i18 = 1984213378 ^ i2;
                        throw new RuntimeException();
                    }
                }
            }
        }
    }

    public java.util.List<java.lang.String> onTabComplete(org.bukkit.command.CommandSender r6, org.bukkit.command.Command r7, java.lang.String r8, java.lang.String[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.leaderboard3.commands.LeaderboardCommand.onTabComplete(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):java.util.List");
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
        qbvrtfnphl = ByteBuffer.wrap(tkhvpobkeejxfzd()).asCharBuffer().toString();
        kzOVyGgAjR = (-2063478566) ^ new Random(7286553486769301780L).nextInt();
    }

    public static String hawuvxrmub(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = qbvrtfnphl.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] suhuushskngfsjq() {
        return new byte[]{0, 0, 0, 34, 0, 0, 0, 0};
    }

    private static byte[] tkhvpobkeejxfzd() {
        return new byte[]{56, 126, 51, 87, 52, 91, 49, 76, 56, 24, 49, 67, 57, 88, 55, 80, 53, 65, 56, 84, 51, 75, 52, 68, 49, 21, 56, 91, 49, 82, 57, 90, 55, 17, 53, 77, 56, 66, 51, 92, 52, 23, 49, 65, 56, 80, 49, 90, 57, 71, 55, 17, 53, 91, 56, 94, 51, 84, 52, 90, 49, 84, 56, 86, 49, 87, 57, 26};
    }

    private static int eiaorrzyyromqvst(int i, int i2) {
        return i ^ i2;
    }
}
