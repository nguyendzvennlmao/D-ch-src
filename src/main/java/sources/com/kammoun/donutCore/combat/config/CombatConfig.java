package com.kammoun.donutCore.combat.config;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.combat.CombatPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class CombatConfig {
    private final CombatPlugin plugin;
    private final FileConfiguration config;
    private int duration;
    private boolean killOnLogout;
    private boolean disableElytra;
    private boolean disableEnderPearls;
    private boolean worldGuardBlock;
    private boolean ignoreOp;
    private boolean actionBarEnabled;
    private String actionBarMessage;
    private boolean reminderEnabled;
    private int reminderInterval;
    private List<String> blockedCommands;
    private String prefix;
    private String enterCombatMessage;
    private String leaveCombatMessage;
    private String blockedCommandMessage;
    private String elytraBlockedMessage;
    private String enderPearlBlockedMessage;
    private String regionBlockedMessage;
    private String logoutDeathMessage;
    private static int I8ikimpJ2r = 0;

    private transient int f182MIt3VQNlY = 292046610;
    private static String hsjdnnvxnf;
    private static String[] nothing_to_see_here = new String[19];

    public CombatConfig(com.kammoun.donutCore.combat.CombatPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.combat.config.CombatConfig.<init>(com.kammoun.donutCore.combat.CombatPlugin, int):void");
    }

    public void loadConfiguration(int i) {
        int i2 = 1578265753 ^ (1442840666 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1454344096) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1454344096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1869123184 ^ i2)) {
                    break;
                }
            }
            int i3 = 542226215 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 670114871 ^ i2;
        this.duration = this.config.getInt(kcuxujwdaa(kavneanhbgqucrs(), i4), (byte) (853224229 ^ i4));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1764140583) {
            i4 = 360031946 ^ i4;
            this.killOnLogout = this.config.getBoolean(kcuxujwdaa(stnwjpkvonyjvuj(), i4), (byte) (665751024 ^ i4));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1031040905) {
                int i5 = 754924165 ^ i4;
                this.disableElytra = this.config.getBoolean(kcuxujwdaa(nyjytighrjulcmr(), i5), (byte) (189904757 ^ i5));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1519238048) {
                    int i6 = 1577201218 ^ i5;
                    this.disableEnderPearls = this.config.getBoolean(kcuxujwdaa(rjyeertfvridvgz(), i6), (byte) (1431542071 ^ i6));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1432565326) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1432565326 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1429342726 ^ i6)) {
                                break;
                            }
                        }
                        int i7 = 959584526 ^ i6;
                        throw new IOException("double");
                    }
                    i5 = 706724523 ^ i6;
                    this.worldGuardBlock = this.config.getBoolean(kcuxujwdaa(xzuiotoujwtjnfg(), i5), (byte) (2135710620 ^ i5));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -94184213) {
                        int i8 = 645695553 ^ i5;
                        this.ignoreOp = this.config.getBoolean(kcuxujwdaa(xordvqpsqehwbwe(), i8), (byte) (1496372188 ^ i8));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -913924382) {
                            i5 = 887294889 ^ i8;
                            this.actionBarEnabled = this.config.getBoolean(kcuxujwdaa(klnggtmziybvomm(), i5), (byte) (1842600052 ^ i5));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1855898539) {
                                int i9 = 182344784 ^ i5;
                                this.actionBarMessage = this.config.getString(kcuxujwdaa(ysfqsmmcsboaxih(), i9), kcuxujwdaa(pfehuzxfysszmng(), i9));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 946610475) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 946610475 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1713522292 ^ i9)) {
                                            break;
                                        }
                                    }
                                    int i10 = 962755383 ^ i9;
                                    throw new IllegalAccessException("double");
                                }
                                int i11 = 286153671 ^ i9;
                                this.reminderEnabled = this.config.getBoolean(kcuxujwdaa(adlmufvkrppxqqu(), i11), (byte) (1979965410 ^ i11));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1340145901) {
                                    i5 = 1211474194 ^ i11;
                                    this.reminderInterval = this.config.getInt(kcuxujwdaa(ozinjgrkgfojlar(), i5), (byte) (1043758837 ^ i5));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -239863935) {
                                        i11 = 647733514 ^ i5;
                                        this.blockedCommands = this.config.getStringList(kcuxujwdaa(ysyfjnwszbqapzw(), i11));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -982581296) {
                                            int i12 = 1421843649 ^ i11;
                                            this.prefix = this.config.getString(kcuxujwdaa(fyntjaewlrximur(), i12), kcuxujwdaa(hljdhmxrrnxdtgl(), i12));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != 1620187610) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1620187610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (815969165 ^ i12)) {
                                                        break;
                                                    }
                                                }
                                                int i13 = 1655729851 ^ i12;
                                                throw new IllegalAccessException("double");
                                            }
                                            int i14 = 1949202071 ^ i12;
                                            this.enterCombatMessage = this.config.getString(kcuxujwdaa(udadbfxnolmsosx(), i14), kcuxujwdaa(uyycegnrjfjlbgx(), i14));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1042174623) {
                                                i14 = 757899433 ^ i14;
                                                this.leaveCombatMessage = this.config.getString(kcuxujwdaa(makaljlmgvzdzoc(), i14), kcuxujwdaa(fppecrscgeouuks(), i14));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1467701208) {
                                                    i5 = 760774901 ^ i14;
                                                    this.blockedCommandMessage = this.config.getString(kcuxujwdaa(bwyofqlasjavymy(), i5), kcuxujwdaa(fhllgwtmepwgzij(), i5));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1035948159) {
                                                        i5 = 354962216 ^ i5;
                                                        this.elytraBlockedMessage = this.config.getString(kcuxujwdaa(gsotntbnwkltdnu(), i5), kcuxujwdaa(acvfvqgovxnbnfi(), i5));
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1795356353) {
                                                            i8 = 2029351992 ^ i5;
                                                            this.enderPearlBlockedMessage = this.config.getString(kcuxujwdaa(pfhrevrdgnjjeik(), i8), kcuxujwdaa(csiqufqhhrhfyrw(), i8));
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1398188286) {
                                                                int i15 = 1606899847 ^ i8;
                                                                this.regionBlockedMessage = this.config.getString(kcuxujwdaa(lsnnrrvmzhpodxd(), i15), kcuxujwdaa(kbtzfmaeeiwxjam(), i15));
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != 1385403192) {
                                                                    while (true) {
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1385403192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (714929627 ^ i15)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    int i16 = 293374726 ^ i15;
                                                                    throw new IOException("double");
                                                                }
                                                                int i17 = 331296458 ^ i15;
                                                                this.logoutDeathMessage = this.config.getString(kcuxujwdaa(ipahwxnsecvqlgw(), i17), kcuxujwdaa(pjwhcrlxmkhlmik(), i17));
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -815078040) {
                                                                    int i18 = 1476969134 ^ i17;
                                                                    return;
                                                                }
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -815078040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1014629721 ^ i17)) {
                                                                        break;
                                                                    }
                                                                }
                                                                int i19 = 1106166700 ^ i17;
                                                                throw new IllegalAccessException("double");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1467701208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1883903905 ^ i14)) {
                                                    int i20 = 1785469697 ^ i14;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1042174623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (2065530685 ^ i14)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i21 = 1704742945 ^ i14;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1340145901 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (2050818606 ^ i11)) {
                                        int i22 = 1878321358 ^ i11;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -982581296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1032883608 ^ i11)) {
                                            break;
                                        }
                                    }
                                }
                                int i23 = 783980288 ^ i11;
                                throw new RuntimeException("double");
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1398188286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (778621793 ^ i8)) {
                                int i24 = 1830495212 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 254603290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1934799066 ^ i8)) {
                                    int i25 = 1896437188 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -913924382 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1590745460 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i26 = 837705285 ^ i8;
                        throw new IOException("double");
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1519238048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1667111758 ^ i5)) {
                        int i27 = 1279707659 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -239863935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (88402729 ^ i5)) {
                            int i28 = 552043411 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1035948159 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (273915509 ^ i5)) {
                                int i29 = 2019167947 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -94184213 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (489701505 ^ i5)) {
                                    int i30 = 1485337496 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1795356353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1035867574 ^ i5)) {
                                        int i31 = 1235695536 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1855898539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (310705625 ^ i5)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i32 = 1374621577 ^ i5;
                throw new IllegalAccessException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1031040905 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (578922341 ^ i4)) {
                int i33 = 2053002928 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1764140583 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (335633391 ^ i4)) {
                    break;
                }
            }
        }
        int i34 = 1100830287 ^ i4;
        throw new IllegalAccessException("double");
    }

    public void reload() {
        int i = 1741263675 ^ (383367254 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1631733011) {
            i = 695400469 ^ i;
            this.plugin.loadConfig(392005859);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 718636474) {
                i = 1185745144 ^ i;
                loadConfiguration(1334980401);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 532529784) {
                    int i2 = 1644806479 ^ i;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 532529784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2084678332 ^ i)) {
                int i3 = 1391413791 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 718636474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (903397951 ^ i)) {
                    int i4 = 578678826 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 267634691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (759085878 ^ i)) {
                        int i5 = 1393839568 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1631733011 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (958425793 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i6 = 828475251 ^ i;
        throw new IOException();
    }

    public void sendMessage(Player player, String str, int i) {
        int i2 = 599135751 ^ (723729644 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1385543392) {
            i2 = 2083478708 ^ i2;
            if (str == null) {
                jniensdkongitodw(i2, 764979621);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1276161155) {
                int i3 = 759974309 ^ i2;
                if (str.isEmpty() == (1154374709 ^ i3)) {
                    i3 = 1757650238 ^ i3;
                    String str2 = this.prefix + str;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1617823833) {
                        int i4 = 599302716 ^ i3;
                        player.sendMessage(ChatFormater.color(str2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2108365240) {
                            int i5 = 130962242 ^ i4;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2108365240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (267165219 ^ i4)) {
                                break;
                            }
                        }
                        int i6 = 1684602612 ^ i4;
                        throw new IOException("double");
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 645063082) {
                    int i7 = 13950976 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 645063082 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (439183887 ^ i3)) {
                        int i8 = 874098454 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 550887850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1970425788 ^ i3)) {
                            int i9 = 1183278184 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1617823833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (511113680 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i10 = 587004403 ^ i3;
                throw new IOException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1276161155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1454077700 ^ i2)) {
                int i11 = 362048428 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1385543392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1369050740 ^ i2)) {
                    break;
                }
            }
        }
        int i12 = 386841187 ^ i2;
        throw new IOException("double");
    }

    public void sendMessage(Player player, String str, String[] strArr, int i) {
        int i2 = 1061255721 ^ (1691592755 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 894799530) {
            i2 = 1965149214 ^ i2;
            if (str == null) {
                jniensdkongitodw(i2, 1110809382);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1671696807) {
                int i3 = 1023422441 ^ i2;
                if (str.isEmpty() != (244011554 ^ i3)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1952092432) {
                        int i4 = 2134226127 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1952092432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1221286015 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 2019357227 ^ i3;
                    throw new IllegalAccessException("double");
                }
                int i6 = 21381420 ^ i3;
                String str2 = this.prefix + PlaceHolderHelper.parsePlaceholders(str, strArr, 887737915);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 2120783984) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2120783984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1541672997 ^ i6)) {
                            break;
                        }
                    }
                    int i7 = 219190432 ^ i6;
                    throw new IllegalAccessException("double");
                }
                i2 = 1485586375 ^ i6;
                player.sendMessage(ChatFormater.color(str2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1173789110) {
                    int i8 = 926219075 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 61783123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1977565924 ^ i2)) {
                int i9 = 1672451263 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1173789110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1011529383 ^ i2)) {
                    int i10 = 159498025 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1671696807 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2114691405 ^ i2)) {
                        int i11 = 1650976717 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 894799530 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (146037199 ^ i2)) {
                            int i12 = 1799989075 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1913178261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (150734057 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i13 = 901936130 ^ i2;
        throw new IOException();
    }

    public String formatMessage(String str, String[] strArr, int i) {
        int i2;
        int i3 = 1431883589 ^ (554560494 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1265253155) {
            i3 = 709000241 ^ i3;
            if (str == null) {
                i2 = 1778024867 ^ i3;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 427416234) {
                int i4 = 1008325126 ^ i3;
                if (str.isEmpty() == (2134305107 ^ i4)) {
                    int i5 = 55572771 ^ i4;
                    return ChatFormater.color(PlaceHolderHelper.parsePlaceholders(str, strArr, 887737915));
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -105428325) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -105428325 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1590053693 ^ i4)) {
                            break;
                        }
                    }
                    int i6 = 1921744412 ^ i4;
                    throw new IllegalAccessException("double");
                }
                i2 = 1440961445 ^ i4;
            }
            return kcuxujwdaa(qwkqqinsfgwxjfu(), i2);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -473398397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (770905129 ^ i3)) {
                int i7 = 299899209 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 427416234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1930868519 ^ i3)) {
                    int i8 = 2034905103 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1265253155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (564920676 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i9 = 925484953 ^ i3;
        throw new IOException();
    }

    public boolean isCommandBlocked(String str, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 326059684 ^ (2019066639 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1333972189) {
            int i6 = 1245009566 ^ i5;
            if (str != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -505968687) {
                    i5 = 1582796202 ^ i6;
                    if (str.isEmpty() == (1651342672 ^ i5)) {
                        int i7 = 915418123 ^ i5;
                        String trim = str.toLowerCase().trim();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1477801254) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1477801254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (63037318 ^ i7)) {
                                    break;
                                }
                            }
                            int i8 = 1140548741 ^ i7;
                            throw new IOException("double");
                        }
                        i5 = 2108461484 ^ i7;
                        if (trim.startsWith(kcuxujwdaa(kolfdjabjuvtxkf(), i5)) == (693223671 ^ i5)) {
                            i3 = 928255032 ^ i5;
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1250822073) {
                            i4 = 1898099560 ^ i5;
                            trim = trim.substring((byte) (1483961246 ^ i4));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1013211910) {
                                i3 = 1182187344 ^ i4;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1013211910 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1121577977 ^ i4)) {
                                    int i9 = 1098585644 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1753395982 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (957097399 ^ i4)) {
                                        int i10 = 461254152 ^ i4;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                        String str2 = trim.split(kcuxujwdaa(cmzldwzqwihvfqn(), i3))[(byte) (503696591 ^ i3)];
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -265394568) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -265394568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (660082186 ^ i3)) {
                                    break;
                                }
                            }
                            int i11 = 1589861312 ^ i3;
                            throw new IllegalAccessException("double");
                        }
                        i5 = 1968629230 ^ i3;
                        Iterator<String> it = this.blockedCommands.iterator();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1519995147) {
                            int i12 = 968655039 ^ i5;
                            while (true) {
                                i4 = i12;
                                if (it.hasNext() == (1391438238 ^ i4)) {
                                    return (byte) (667577371 ^ jniensdkongitodw(i4, 1965409669));
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1753395982) {
                                    i5 = 691342328 ^ i4;
                                    String next = it.next();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -556461261) {
                                        i5 = 1391849189 ^ i5;
                                        if (next.equalsIgnoreCase(str2) != (690965635 ^ i5)) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1232757785) {
                                                return (byte) (1129225792 ^ (1784795842 ^ i5));
                                            }
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                                                case 264998162:
                                                    i5 = 1602819327 ^ i5;
                                                    break;
                                                case 1066527541:
                                                case 1629886537:
                                                    break;
                                            }
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1254964253) {
                                            int jniensdkongitodw = jniensdkongitodw(i5, 2021843216);
                                            try {
                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(jniensdkongitodw) != 191310181) {
                                                    throw null;
                                                }
                                                throw new IOException();
                                            } catch (IOException e) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                    case -610652814:
                                                        i6 = jniensdkongitodw(jniensdkongitodw, 875236768);
                                                        break;
                                                    case 1898302304:
                                                        i6 = 1635578210 ^ jniensdkongitodw;
                                                        break;
                                                    default:
                                                        throw new RuntimeException("Error in hash");
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2059550835) {
                                                    i12 = jniensdkongitodw(i6, 1035461008);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1519995147 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (516595273 ^ i5)) {
                                int i13 = 1153061147 ^ i5;
                                throw new IOException("double");
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 325839491) {
                        i2 = 2102965783 ^ i5;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 325839491 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (261361591 ^ i5)) {
                            int i14 = 2071825019 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1232757785 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1154013914 ^ i5)) {
                                int i15 = 932304083 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 443871754 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1785771226 ^ i5)) {
                                    int i16 = 365710957 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -556461261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (325779621 ^ i5)) {
                                        int i17 = 1542368117 ^ i5;
                                        throw new IOException();
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2059550835 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (462859351 ^ i6)) {
                        int i18 = 250821459 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -505968687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (117026406 ^ i6)) {
                            int i19 = 1808274695 ^ i6;
                            throw new RuntimeException("double");
                        }
                    }
                }
            } else {
                i2 = 588200893 ^ i6;
            }
            return (byte) (523619143 ^ i2);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1250822073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1615251363 ^ i5)) {
                int i20 = 1892562946 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1254964253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1197792301 ^ i5)) {
                    int i21 = 1994681815 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1333972189 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1434636318 ^ i5)) {
                        int i22 = 744155477 ^ i5;
                        throw new IOException("double");
                    }
                }
            }
        }
    }

    @Generated
    public CombatPlugin getPlugin() {
        int i = 914014638 ^ (1456090266 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -331057189) {
            int i2 = 1431949365 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1183512177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1741854452 ^ i)) {
                int i3 = 1372758705 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -331057189 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (302053344 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2000067971 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 1431196070 ^ (2028443449 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2071123327) {
            int i2 = 416359412 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1107572001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1515575570 ^ i)) {
                int i3 = 401466238 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2071123327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (371796403 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 620515882 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getDuration(int i) {
        int i2 = 1972919236 ^ (1571629255 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1469544863) {
            int i3 = 2058199796 ^ i2;
            return this.duration;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1469544863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2029341007 ^ i2)) {
                int i4 = 904206418 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2097516994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (26088242 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 405660607 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isKillOnLogout(int i) {
        int i2 = 1313825366 ^ (1138393381 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2056518176) {
            int i3 = 256859440 ^ i2;
            return this.killOnLogout;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2056518176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (352452251 ^ i2)) {
                int i4 = 1448041768 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -15274912 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1361290471 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1622486119 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isDisableElytra(int i) {
        int i2 = 636346241 ^ (14314595 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1065451159) {
            int i3 = 939179126 ^ i2;
            return this.disableElytra;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1065451159 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (517355586 ^ i2)) {
                int i4 = 392213832 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2141938392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1499571409 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1798192153 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isDisableEnderPearls(int i) {
        int i2 = 1251630123 ^ (1912163537 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 853252521) {
            int i3 = 1716702870 ^ i2;
            return this.disableEnderPearls;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 5106970 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1366321157 ^ i2)) {
                int i4 = 54910111 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 853252521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (563817132 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 826336161 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isWorldGuardBlock(int i) {
        int i2 = 1946459271 ^ (489556695 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1600672517) {
            int i3 = 142058811 ^ i2;
            return this.worldGuardBlock;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1600672517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (443365307 ^ i2)) {
                int i4 = 2129943007 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -483752669 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1723963598 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1533629302 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isIgnoreOp(int i) {
        int i2 = 494086283 ^ (396279869 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1096000568) {
            int i3 = 993165901 ^ i2;
            return this.ignoreOp;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1096000568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (347980975 ^ i2)) {
                int i4 = 1337372974 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1731742113 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1204062002 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1165128614 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isActionBarEnabled(int i) {
        int i2 = 54011958 ^ (304264782 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1628958136) {
            int i3 = 1639650756 ^ i2;
            return this.actionBarEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1628958136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1002845019 ^ i2)) {
                int i4 = 556606920 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1825522587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1325991306 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1454607698 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getActionBarMessage(int i) {
        int i2 = 455298604 ^ (1308471040 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1597249306) {
            int i3 = 273739613 ^ i2;
            return this.actionBarMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1597249306 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1684839825 ^ i2)) {
                int i4 = 1932114556 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -575443470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1771229391 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2089791224 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isReminderEnabled() {
        int i = 936417947 ^ (1898658007 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -568456166) {
            int i2 = 1169233519 ^ i;
            return this.reminderEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -208224416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1409084276 ^ i)) {
                int i3 = 1936410767 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -568456166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (995024311 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1740483738 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getReminderInterval() {
        int i = 957422050 ^ (217025111 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1178043345) {
            int i2 = 2069148682 ^ i;
            return this.reminderInterval;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1668144254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1406876130 ^ i)) {
                int i3 = 853570056 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1178043345 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (516064345 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1262954824 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public List<String> getBlockedCommands() {
        int i = 1359461521 ^ (539276830 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1624984067) {
            int i2 = 1070482647 ^ i;
            return this.blockedCommands;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1633063750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (110670121 ^ i)) {
                int i3 = 1071425728 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1624984067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1176767633 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 398502283 ^ i;
        throw new IOException();
    }

    @Generated
    public String getPrefix() {
        int i = 1043581200 ^ (1018365169 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -37392016) {
            int i2 = 960236875 ^ i;
            return this.prefix;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 874847017 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1459701462 ^ i)) {
                int i3 = 1845326801 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -37392016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (233332205 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 553447024 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getEnterCombatMessage(int i) {
        int i2 = 1422957929 ^ (1563065584 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1508633936) {
            int i3 = 911966340 ^ i2;
            return this.enterCombatMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1508633936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (916991575 ^ i2)) {
                int i4 = 752584765 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 348657297 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (570760497 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 235496303 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getLeaveCombatMessage(int i) {
        int i2 = 826297235 ^ (176712893 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 931276553) {
            int i3 = 1856929204 ^ i2;
            return this.leaveCombatMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1123142314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (446892901 ^ i2)) {
                int i4 = 99980874 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 931276553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2015316380 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1099858611 ^ i2;
        throw new IOException();
    }

    @Generated
    public String getBlockedCommandMessage(int i) {
        int i2 = 1678716668 ^ (24179028 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1036131525) {
            int i3 = 481382704 ^ i2;
            return this.blockedCommandMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 666331835 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (866115738 ^ i2)) {
                int i4 = 1704939124 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1036131525 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1198335248 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 183324145 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getElytraBlockedMessage(int i) {
        int i2 = 1339317105 ^ (21570233 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1658269638) {
            int i3 = 1100301664 ^ i2;
            return this.elytraBlockedMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1853686984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1878143900 ^ i2)) {
                int i4 = 1809447555 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1658269638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1614610398 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1164451693 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getEnderPearlBlockedMessage(int i) {
        int i2 = 1454791889 ^ (2119298347 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1359048279) {
            int i3 = 1171096237 ^ i2;
            return this.enderPearlBlockedMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1359048279 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (241124910 ^ i2)) {
                int i4 = 2104241369 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2137881405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2060307864 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1537072400 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public String getRegionBlockedMessage(int i) {
        int i2 = 1027889638 ^ (1750713794 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1093664602) {
            int i3 = 829812487 ^ i2;
            return this.regionBlockedMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -897546397 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1924103263 ^ i2)) {
                int i4 = 1597538159 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1093664602 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (211044020 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1483839061 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getLogoutDeathMessage(int i) {
        int i2 = 440844604 ^ (507435759 ^ 490234831);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -905723680) {
            int i3 = 694368675 ^ i2;
            return this.logoutDeathMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -905723680 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (668452865 ^ i2)) {
                int i4 = 941087373 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2128998919 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (580075521 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 842284463 ^ i2;
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
        hsjdnnvxnf = ByteBuffer.wrap(fgmnivjgirpflpp()).asCharBuffer().toString();
        I8ikimpJ2r = (-1917116227) ^ new Random(9066812814272935449L).nextInt();
    }

    public static String kcuxujwdaa(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = hsjdnnvxnf.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] klnggtmziybvomm() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, 0};
    }

    private static byte[] gsotntbnwkltdnu() {
        return new byte[]{0, 0, 0, 23, 0, 0, 0, 24};
    }

    private static byte[] acvfvqgovxnbnfi() {
        return new byte[]{0, 0, 0, 37, 0, 0, 0, 47};
    }

    private static byte[] xzuiotoujwtjnfg() {
        return new byte[]{0, 0, 0, 23, 0, 0, 0, 84};
    }

    private static byte[] bwyofqlasjavymy() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, 107};
    }

    private static byte[] fhllgwtmepwgzij() {
        return new byte[]{0, 0, 0, 43, 0, 0, 0, -125};
    }

    private static byte[] ipahwxnsecvqlgw() {
        return new byte[]{0, 0, 0, 21, 0, 0, 0, -82};
    }

    private static byte[] pjwhcrlxmkhlmik() {
        return new byte[]{0, 0, 0, 38, 0, 0, 0, -61};
    }

    private static byte[] fyntjaewlrximur() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, -23};
    }

    private static byte[] hljdhmxrrnxdtgl() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, -8};
    }

    private static byte[] kavneanhbgqucrs() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, -8};
    }

    private static byte[] xordvqpsqehwbwe() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, 7};
    }

    private static byte[] udadbfxnolmsosx() {
        return new byte[]{0, 0, 0, 21, 0, 0, 1, 23};
    }

    private static byte[] uyycegnrjfjlbgx() {
        return new byte[]{0, 0, 0, 26, 0, 0, 1, 44};
    }

    private static byte[] ysyfjnwszbqapzw() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, 70};
    }

    private static byte[] ysfqsmmcsboaxih() {
        return new byte[]{0, 0, 0, 24, 0, 0, 1, 86};
    }

    private static byte[] pfehuzxfysszmng() {
        return new byte[]{0, 0, 0, 27, 0, 0, 1, 110};
    }

    private static byte[] ozinjgrkgfojlar() {
        return new byte[]{0, 0, 0, 24, 0, 0, 1, -119};
    }

    private static byte[] rjyeertfvridvgz() {
        return new byte[]{0, 0, 0, 26, 0, 0, 1, -95};
    }

    private static byte[] makaljlmgvzdzoc() {
        return new byte[]{0, 0, 0, 21, 0, 0, 1, -69};
    }

    private static byte[] fppecrscgeouuks() {
        return new byte[]{0, 0, 0, 32, 0, 0, 1, -48};
    }

    private static byte[] adlmufvkrppxqqu() {
        return new byte[]{0, 0, 0, 23, 0, 0, 1, -16};
    }

    private static byte[] stnwjpkvonyjvuj() {
        return new byte[]{0, 0, 0, 21, 0, 0, 2, 7};
    }

    private static byte[] lsnnrrvmzhpodxd() {
        return new byte[]{0, 0, 0, 23, 0, 0, 2, 28};
    }

    private static byte[] kbtzfmaeeiwxjam() {
        return new byte[]{0, 0, 0, 50, 0, 0, 2, 51};
    }

    private static byte[] nyjytighrjulcmr() {
        return new byte[]{0, 0, 0, 21, 0, 0, 2, 101};
    }

    private static byte[] pfhrevrdgnjjeik() {
        return new byte[]{0, 0, 0, 27, 0, 0, 2, 122};
    }

    private static byte[] csiqufqhhrhfyrw() {
        return new byte[]{0, 0, 0, 43, 0, 0, 2, -107};
    }

    private static byte[] qwkqqinsfgwxjfu() {
        return new byte[]{0, 0, 0, 0, 0, 0, 2, -64};
    }

    private static byte[] kolfdjabjuvtxkf() {
        return new byte[]{0, 0, 0, 1, 0, 0, 2, -64};
    }

    private static byte[] cmzldwzqwihvfqn() {
        return new byte[]{0, 0, 0, 1, 0, 0, 2, -63};
    }

    private static byte[] fgmnivjgirpflpp() {
        return new byte[]{49, 91, 52, 93, 54, 93, 48, 82, 53, 82, 49, 76, 52, 28, 54, 81, 48, 83, 53, 71, 49, 81, 52, 93, 54, 94, 48, 82, 53, 82, 49, 74, 52, 28, 54, 85, 48, 94, 53, 82, 49, 90, 52, 94, 54, 85, 48, 84, 55, 91, 49, 87, 57, 67, 52, 70, 54, 86, 54, 86, 50, 92, 48, 71, 53, 24, 55, 83, 49, 94, 57, 73, 52, 65, 54, 69, 54, 80, 50, 20, 48, 86, 53, 90, 55, 89, 49, 81, 57, 91, 52, 80, 54, 83, 55, 16, 49, 81, 57, 105, 52, 90, 54, 66, 54, 17, 50, 90, 48, 85, 53, 88, 55, 17, 49, 70, 57, 16, 52, 64, 54, 68, 54, 84, 50, 25, 48, 113, 53, 90, 55, 79, 49, 70, 57, 66, 52, 84, 54, 23, 54, 85, 50, 76, 48, 70, 53, 95, 55, 88, 49, 85, 57, 16, 52, 86, 54, 88, 54, 92, 50, 91, 48, 85, 53, 66, 55, 23, 50, 82, 51, 90, 55, 92, 48, 84, 50, 80, 50, 69, 51, 27, 55, 70, 48, 89, 50, 67, 50, 93, 51, 81, 55, 86, 48, 67, 50, 80, 50, 67, 51, 81, 55, 28, 48, 84, 50, 93, 50, 94, 51, 86, 55, 90, 57, 89, 52, 87, 52, 75, 51, 67, 52, 88, 52, 83, 50, 81, 56, 64, 48, 26, 57, 86, 52, 94, 52, 87, 51, 83, 52, 82, 52, 81, 50, 80, 56, 30, 48, 87, 57, 91, 52, 95, 52, 85, 51, 81, 52, 87, 52, 80, 57, 18, 52, 81, 52, 97, 51, 95, 52, 76, 52, 20, 50, 87, 56, 82, 48, 90, 57, 19, 52, 70, 52, 24, 51, 69, 52, 74, 52, 81, 50, 20, 56, 28, 48, 79, 57, 87, 52, 93, 52, 85, 51, 93, 52, 88, 52, 90, 50, 80, 56, 78, 48, 20, 57, 67, 52, 90, 52, 81, 51, 92, 52, 92, 52, 20, 50, 93, 56, 93, 48, 20, 57, 87, 52, 93, 52, 85, 51, 82, 52, 88, 52, 64, 50, 21, 52, 94, 52, 92, 56, 69, 49, 70, 55, 85, 51, 83, 57, 93, 54, 66, 53, 25, 52, 95, 52, 86, 56, 81, 49, 90, 55, 65, 51, 64, 57, 21, 54, 85, 53, 82, 52, 82, 52, 77, 56, 94, 52, 21, 52, 13, 30, 22, 49, 21, 55, 79, 51, 68, 57, 84, 54, 80, 53, 78, 52, 86, 52, 75, 56, 75, 49, 21, 55, 88, 51, 91, 57, 95, 54, 86, 53, 82, 52, 87, 52, 25, 56, 89, 49, 64, 55, 64, 51, 20, 57, 92, 54, 68, 53, 69, 52, 90, 52, 87, 56, 81, 49, 21, 55, 87, 51, 91, 57, 85, 54, 83, 53, 86, 52, 71, 52, 24, 49, 95, 55, 83, 50, 69, 53, 65, 55, 84, 49, 85, 55, 83, 50, 69, 53, 28, 55, 69, 49, 64, 55, 83, 50, 80, 53, 91, 55, 77, 56, 86, 51, 93, 50, 89, 50, 87, 49, 89, 53, 71, 50, 28, 52, 86, 53, 68, 56, 71, 51, 83, 50, 64, 50, 92, 49, 87, 53, 93, 49, 87, 57, 89, 51, 90, 50, 83, 56, 89, 49, 64, 57, 24, 51, 94, 50, 86, 56, 86, 49, 91, 57, 68, 51, 82, 50, 28, 56, 87, 49, 68, 57, 89, 51, 81, 54, 74, 57, 74, 54, 88, 52, 84, 52, 83, 57, 74, 57, 24, 57, 81, 51, 90, 54, 77, 57, 92, 54, 75, 52, 30, 52, 85, 57, 86, 57, 91, 57, 86, 51, 85, 54, 77, 57, 18, 51, 87, 16, -83, 57, 25, 54, 96, 52, 92, 52, 67, 57, 25, 57, 87, 57, 70, 51, 81, 54, 25, 57, 87, 54, 86, 52, 68, 52, 22, 57, 80, 57, 88, 57, 20, 51, 87, 54, 86, 57, 84, 54, 91, 52, 82, 52, 66, 57, 24, 52, 83, 52, 92, 52, 87, 50, 86, 48, 95, 49, 81, 48, 80, 56, 31, 53, 83, 52, 94, 52, 93, 52, 85, 50, 84, 48, 90, 49, 80, 48, 71, 49, 84, 50, 87, 57, 94, 57, 82, 52, 84, 49, 67, 50, 22, 57, 82, 57, 83, 52, 65, 49, 94, 50, 87, 57, 93, 57, 82, 52, 84, 49, 69, 50, 22, 57, 94, 57, 85, 52, 70, 49, 68, 50, 89, 57, 84, 57, 85, 49, 17, 50, 91, 31, -89, 57, 16, 52, 124, 49, 89, 50, 24, 57, 80, 57, 95, 52, 88, 49, 85, 50, 89, 57, 71, 57, 16, 52, 83, 49, 88, 50, 74, 57, 19, 57, 22, 52, 80, 49, 76, 50, 76, 57, 90, 57, 93, 52, 80, 49, 74, 50, 75, 49, 83, 52, 92, 55, 88, 56, 90, 51, 83, 49, 68, 52, 29, 55, 71, 56, 93, 51, 95, 49, 89, 52, 93, 55, 81, 56, 93, 51, 64, 49, 30, 52, 90, 55, 91, 56, 76, 51, 87, 49, 66, 52, 69, 55, 84, 56, 84, 49, 87, 51, 94, 53, 89, 50, 82, 55, 81, 49, 64, 51, 31, 53, 80, 50, 89, 55, 67, 49, 85, 51, 83, 53, 88, 50, 85, 55, 29, 49, 81, 51, 95, 53, 80, 50, 85, 55, 66, 49, 68, 51, 84, 53, 85, 50, 66, 55, 92, 49, 71, 51, 88, 51, 81, 48, 75, 50, 69, 49, 82, 53, 84, 52, 85, 56, 65, 54, 31, 51, 89, 51, 81, 48, 89, 50, 64, 49, 86, 53, 30, 52, 83, 56, 93, 54, 92, 51, 87, 51, 85, 48, 76, 51, 19, 51, 85, 23, 44, 50, 22, 49, 106, 53, 92, 52, 69, 56, 18, 54, 80, 51, 71, 51, 81, 48, 24, 50, 88, 49, 92, 53, 19, 52, 92, 56, 93, 54, 95, 51, 82, 51, 81, 48, 74, 50, 22, 49, 90, 53, 93, 52, 16, 56, 81, 54, 94, 51, 88, 51, 86, 48, 89, 50, 66, 49, 29, 49, 90, 55, 86, 57, 91, 53, 86, 
        49, 81, 49, 77, 55, 23, 57, 68, 53, 81, 49, 93, 49, 80, 55, 87, 57, 82, 53, 81, 49, 66, 49, 23, 55, 92, 57, 88, 53, 85, 49, 82, 49, 85, 55, 92, 57, 82, 54, 85, 53, 88, 53, 92, 48, 80, 53, 87, 54, 65, 55, 27, 49, 91, 50, 92, 54, 90, 53, 91, 53, 28, 48, 93, 53, 88, 54, 24, 55, 89, 49, 95, 50, 82, 54, 89, 53, 66, 53, 69, 49, 90, 51, 84, 55, 70, 51, 74, 57, 80, 55, 84, 49, 82, 53, 64, 57, 23, 49, 69, 51, 84, 55, 82, 51, 80, 57, 94, 55, 93, 49, 26, 53, 81, 57, 85, 49, 88, 51, 82, 55, 94, 51, 92, 57, 85, 49, 17, 51, 82, 55, 108, 51, 86, 57, 68, 55, 19, 49, 84, 53, 82, 57, 87, 49, 16, 51, 69, 55, 21, 51, 92, 57, 95, 55, 71, 49, 82, 53, 65, 57, 25, 49, 71, 51, 67, 55, 90, 51, 77, 57, 84, 55, 80, 49, 67, 53, 86, 57, 93, 49, 23, 51, 80, 55, 71, 51, 92, 57, 80, 55, 64, 49, 23, 53, 68, 57, 81, 49, 94, 51, 93, 55, 80, 51, 25, 57, 88, 55, 93, 49, 23, 53, 80, 57, 86, 49, 90, 51, 83, 55, 84, 51, 77, 57, 16, 49, 91, 57, 86, 48, 89, 55, 87, 54, 80, 56, 77, 57, 30, 52, 83, 53, 95, 49, 75, 57, 88, 48, 86, 55, 89, 54, 84, 56, 20, 57, 85, 52, 91, 53, 79, 49, 76, 57, 75, 48, 85, 49, 89, 51, 80, 56, 64, 57, 65, 48, 81, 49, 83, 51, 80, 56, 64, 57, 28, 48, 85, 49, 90, 51, 81, 56, 86, 57, 64, 48, 64, 49, 81, 51, 84, 56, 65, 57, 94, 48, 29, 49, 86, 51, 89, 56, 92, 57, 81, 48, 91, 49, 81, 51, 81, 49, 18, 51, 86, 56, 106, 57, 93, 48, 69, 49, 20, 51, 86, 56, 82, 57, 92, 48, 23, 49, 64, 51, 21, 56, 70, 57, 65, 48, 85, 49, 20, 51, 112, 56, 93, 57, 86, 48, 85, 49, 70, 51, 21, 56, 99, 57, 87, 48, 81, 49, 70, 51, 89, 56, 64, 57, 18, 48, 84, 49, 65, 51, 71, 56, 90, 57, 92, 48, 87, 49, 20, 51, 86, 56, 92, 57, 95, 48, 82, 49, 85, 51, 65, 56, 18, 54, 22, 53, 16};
    }

    private static int jniensdkongitodw(int i, int i2) {
        return i2 ^ i;
    }
}
