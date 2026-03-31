package com.kammoun.donutCore.fly.cmd;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.fly.FlyPlugin;
import com.kammoun.donutCore.fly.manager.DatabaseManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Sound;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {
    private final FlyPlugin plugin;
    private final DatabaseManager databaseManager;
    private static int a3CzRTUU1a = 0;
    private transient int EzsiH8HiOH = 481714165;
    private static String[] nothing_to_see_here = new String[15];

    public CommandHandler(FlyPlugin flyPlugin, DatabaseManager databaseManager, int i) {
        eenjcsryrzrjxuuy(797395786 ^ 177452997, 904776579);
        int parseInt = 613098634 ^ (643480227 ^ Integer.parseInt("304654629"));
        this.EzsiH8HiOH = 481714165 ^ a3CzRTUU1a;
        int eenjcsryrzrjxuuy = 745303020 ^ eenjcsryrzrjxuuy(parseInt, 771191253);
        this.plugin = flyPlugin;
        this.databaseManager = databaseManager;
        int i2 = 1068231807 ^ (1817105235 ^ eenjcsryrzrjxuuy);
    }

    public boolean onCommand(@org.jetbrains.annotations.NotNull org.bukkit.command.CommandSender r7, @org.jetbrains.annotations.NotNull org.bukkit.command.Command r8, @org.jetbrains.annotations.NotNull java.lang.String r9, java.lang.String[] r10) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.fly.cmd.CommandHandler.onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):boolean");
    }

    private void sendFeedback(Player player, String str, String str2, int i) {
        int i2;
        int i3 = 1014725443 ^ (383382537 ^ 1294143070);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1007421603) {
            int i4 = 1786484925 ^ i3;
            String color = ChatFormater.color(str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1875955016) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1875955016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1266142761 ^ i4)) {
                        break;
                    }
                }
                int i5 = 471710477 ^ i4;
                throw new IOException("double");
            }
            int i6 = 1683397424 ^ i4;
            if (this.plugin.isChatMessagesEnabled(2101809224) != (1772913305 ^ i6)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1298404555) {
                    int i7 = 707244954 ^ i6;
                    player.sendMessage(color);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 475629594) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 475629594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1677444411 ^ i7)) {
                                break;
                            }
                        }
                        int i8 = 730142457 ^ i7;
                        throw new IOException("double");
                    }
                    i6 = 1036427025 ^ i7;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1298404555 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2007275125 ^ i6)) {
                        int i9 = 1675258745 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -227708781 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (705497233 ^ i6)) {
                            break;
                        }
                    }
                }
                int i10 = 1773338408 ^ i6;
                throw new IllegalAccessException("double");
            }
            i6 = eenjcsryrzrjxuuy(i6, 400632971);
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(color));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -227708781) {
                int i11 = 409894994 ^ i6;
                i3 = i11;
                try {
                    Sound valueOf = Sound.valueOf(str2.toUpperCase());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 823751171) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1066151417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (351562063 ^ i3)) {
                                int i12 = 742765211 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 823751171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1474581920 ^ i3)) {
                                    break;
                                }
                            }
                        }
                        int i13 = 1052308954 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                    int i14 = 2131867632 ^ i3;
                    player.playSound(player.getLocation(), valueOf, 1.0f, 1.0f);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != -912994944) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -912994944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1964281724 ^ i14)) {
                                break;
                            }
                        }
                        int i15 = 275312519 ^ i14;
                        throw new IOException("double");
                    }
                    i3 = 356028521 ^ i14;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1615875784) {
                        int i16 = 1344055117 ^ i3;
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i16) == 40611368) {
                                throw new IOException();
                            }
                            throw null;
                        } catch (IOException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -524979038:
                                    i2 = 680608915 ^ i16;
                                    break;
                                case 1066151417:
                                    i2 = 1400270776 ^ i16;
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1539354565) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1539354565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1025326403 ^ i2)) {
                                        int i17 = 1528797734 ^ i2;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                    case 29827562:
                                        int i18 = 1609337507 ^ i2;
                                        return;
                                    case 1057734194:
                                        return;
                                    case 1247971763:
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 533144681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (754621548 ^ i2)) {
                                    int i19 = 767788483 ^ i2;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                        case -912994944:
                            i2 = 986348861 ^ i3;
                            break;
                        case 823751171:
                            i2 = 1172032205 ^ i3;
                            break;
                        default:
                            throw new IOException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 533144681) {
                        int i20 = 125219199 ^ i2;
                        this.plugin.getLogger(583940502).warning("Invalid sound: " + str2);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == 611495825) {
                            int i21 = 266679638 ^ i20;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == 611495825 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i20) == (66928185 ^ i20)) {
                                int i22 = 946510564 ^ i20;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1298404555) {
                    int i92 = 1675258745 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -227708781) {
                        break;
                        break;
                    }
                    continue;
                }
            }
            int i102 = 1773338408 ^ i6;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1007421603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1768842353 ^ i3)) {
                int i23 = 466163861 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1615875784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2105245668 ^ i3)) {
                    break;
                }
            }
        }
        int i24 = 1012452147 ^ i3;
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
        a3CzRTUU1a = 2117489067 ^ new Random(164201694880878442L).nextInt();
    }

    public static String lgfbnzafkj(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] ariwndmajlpgqjw() {
        return new byte[]{124, 54, 49, 16, 118, 77, 110, 69, 20, 107, 3, 76, 101, 8, 28, 108};
    }

    private static byte[] snqzczocbtkjysc() {
        return new byte[]{-75, -1, 0, -124, 65, 25, 94, 58, 34, 50, 53, 17, 86, 70, 43, 124, 76, 112, 6, 74, 71, 31, 89, 11, 36, 62, 53, 9, 83, 74, 47, 123, 75, 101, 1, 71, 65, 21, 95, 86, 35, 41, 51, 15, 83, 90, 42, 125, 79, 117, 6, 72, 70, 18, 89, 0, 37, 120, 52, 24, 85, 87, 42, 54, 74, 106, 2, 70, 65, 19, 94, 23, 35, 115};
    }

    private static int eenjcsryrzrjxuuy(int i, int i2) {
        return i2 ^ i;
    }
}
