package com.kammoun.donutCore.team.manager;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.team.TeamPlugin;
import com.kammoun.donutCore.team.models.Enums.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class ConfigManager {
    private final TeamPlugin plugin;
    private int maxTeamMembers;
    private final HashMap<Messages, String> messagesHashMap;
    private final HashMap<String, Sound> soundsHashMap;
    private String teamChatFormat;
    private static int ndNCZSJdiM = 0;
    private transient int i58ReK2lX1 = 932706948;
    private static String nkkhqhtppz;
    private static String[] nothing_to_see_here = new String[18];

    public ConfigManager(TeamPlugin teamPlugin, int i) {
        azvcgsddzqihllhs(1985213171 ^ 302242110, 405887476);
        int parseInt = 655087587 ^ (10683936 ^ Integer.parseInt("1539941370"));
        this.i58ReK2lX1 = 932706948 ^ ndNCZSJdiM;
        this.messagesHashMap = new HashMap<>();
        this.soundsHashMap = new HashMap<>();
        this.teamChatFormat = "&#00c1fe[TEAM] {player}: &f{message}";
        this.plugin = teamPlugin;
        loadConfig(706388656);
        int i2 = 1978701066 ^ (1862135778 ^ (152501607 ^ (1841180269 ^ (2110267217 ^ (1337139898 ^ (1863839196 ^ parseInt))))));
    }

    private void loadConfig(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.ConfigManager.loadConfig(int):void");
    }

    private String getMessage(Messages messages, int i) {
        int i2 = 1900961199 ^ (1695665752 ^ 2036028667);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1747335267) {
            int i3 = 1980113638 ^ i2;
            return this.messagesHashMap.getOrDefault(messages, messages.getDefaultMessage());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1747335267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1335691080 ^ i2)) {
                int i4 = 2041223572 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -669569200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1394025639 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 233419112 ^ i2;
        throw new IllegalAccessException();
    }

    public void sendMessage(Player player, Messages messages, String[] strArr, int i) {
        int i2 = 150673934 ^ (1963663446 ^ 2036028667);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 626750744) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 626750744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1211768245 ^ i2)) {
                    break;
                }
            }
            int i3 = 1254424899 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 399283768 ^ i2;
        String message = getMessage(messages, 1396729968);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1690319656) {
            i4 = 211931793 ^ i4;
            player.sendMessage(ChatFormater.color(PlaceHolderHelper.parsePlaceholders(message, strArr, 887737915)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -30322608) {
                int i5 = 989393817 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -30322608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1763800093 ^ i4)) {
                int i6 = 1094589060 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 704040089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (748789256 ^ i4)) {
                    int i7 = 882258774 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1690319656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1223675379 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 648496605 ^ i4;
        throw new IOException();
    }

    public void sendActionBar(Player player, Messages messages, String[] strArr, int i) {
        int i2 = 33041577 ^ (1999304045 ^ 2036028667);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2085382648) {
            i2 = 1653435063 ^ i2;
            String message = getMessage(messages, 1396729968);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1747401795) {
                i2 = 1485489778 ^ i2;
                player.sendActionBar(ChatFormater.color(PlaceHolderHelper.parsePlaceholders(message, strArr, 887737915)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1401876527) {
                    int i3 = 1838993973 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2085382648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (830973565 ^ i2)) {
                int i4 = 1294447930 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1747401795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (46845416 ^ i2)) {
                    int i5 = 1524607597 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1401876527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (25712191 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2042617041 ^ i2;
        throw new IllegalAccessException();
    }

    public void playSound(Player player, String str, int i) {
        int i2 = 306457222 ^ (347350497 ^ 2036028667);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -44376861) {
            i2 = 1730659236 ^ i2;
            Sound sound = this.soundsHashMap.get(str);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1000029760) {
                i2 = 518653564 ^ i2;
                if (sound != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 859107872) {
                        int i3 = 1925020769 ^ i2;
                        player.playSound(player.getLocation(), sound, 1.0f, 1.0f);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1495330517) {
                            int i4 = 1199492202 ^ i3;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1495330517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (910301307 ^ i3)) {
                                break;
                            }
                        }
                        int i5 = 212210733 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 100676153:
                            int i6 = 902017035 ^ i2;
                            return;
                        case 941347422:
                            return;
                        case 1045800077:
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1000029760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (509096308 ^ i2)) {
                int i7 = 787732373 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1658228103 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1345366607 ^ i2)) {
                    int i8 = 1042762004 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 859107872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (365407042 ^ i2)) {
                        int i9 = 645302098 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -44376861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (433046332 ^ i2)) {
                            int i10 = 665552725 ^ i2;
                            throw new IOException();
                        }
                    }
                }
            }
        }
    }

    @Generated
    public int getMaxTeamMembers(int i) {
        int i2 = 857342070 ^ (428978561 ^ 2036028667);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1635309470) {
            int i3 = 650945743 ^ i2;
            return this.maxTeamMembers;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1461580261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (933987137 ^ i2)) {
                int i4 = 1262361351 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1635309470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1489889070 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1664723236 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getTeamChatFormat(int i) {
        int i2 = 422968248 ^ (427982704 ^ 2036028667);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -815365733) {
            int i3 = 52479546 ^ i2;
            return this.teamChatFormat;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -698306485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1315929157 ^ i2)) {
                int i4 = 489950200 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -815365733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (769823183 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1271892979 ^ i2;
        throw new IOException();
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
        nkkhqhtppz = ByteBuffer.wrap(duuwsiceqkxokhb()).asCharBuffer().toString();
        ndNCZSJdiM = 1940372721 ^ new Random(245204116817792993L).nextInt();
    }

    public static String yujbvxvllm(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = nkkhqhtppz.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] mnjumafkpnrvaxg() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, 0};
    }

    private static byte[] fndscnzkiojzisr() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 16};
    }

    private static byte[] tzrvubezmxnutsd() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, 21};
    }

    private static byte[] duuwsiceqkxokhb() {
        return new byte[]{53, 101, 53, 85, 54, 81, 56, 95, 50, 24, 49, 118, 48, 94, 48, 89, 50, 70, 53, 28, 53, 118, 54, 95, 56, 64, 50, 88, 49, 84, 48, 66, 49, 101, 54, 92, 56, 67, 48, 86, 49, 85, 55, 95, 51, 81, 50, 74, 52, 26, 56, 67, 50, 86, 48, 83, 50, 89, 55, 21, 55, 95, 51, 85, 50, 95, 52, 85, 56, 82, 50, 65, 48, 65};
    }

    private static int azvcgsddzqihllhs(int i, int i2) {
        return i ^ i2;
    }
}
