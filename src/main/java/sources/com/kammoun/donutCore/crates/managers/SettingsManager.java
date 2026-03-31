package com.kammoun.donutCore.crates.managers;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import lombok.Generated;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.entity.Player;

public class SettingsManager {
    private final DonutModule plugin;
    private int autoKeyTime;
    private Map<String, Integer> autoKeyKeys;
    private boolean autoKeyAlertEnabled;
    private String autoKeyAlertSound;
    private String autoKeyAlertActionbar;
    private String autoKeyAlertChatMessage;
    private String storageMethod;
    private String mysqlHost;
    private int mysqlPort;
    private String mysqlDatabase;
    private String mysqlUsername;
    private String mysqlPassword;
    private String prefix;
    private final Map<String, String> messages;
    private final Pattern TAG_PATTERN;
    private static int CmYbFvaJvR = 0;
    private transient int HOZ3qlNv1T = 2099847502;
    private static String snlmvasdfv;
    private static String[] nothing_to_see_here = new String[13];

    public SettingsManager(com.kammoun.donutCore.api.module.DonutModule r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.SettingsManager.<init>(com.kammoun.donutCore.api.module.DonutModule, int):void");
    }

    public void reloadSettings(int i) {
        int i2 = 2140127266 ^ (339878299 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 888284963) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 888284963 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1633272529 ^ i2)) {
                    int i3 = 1905164819 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1535748469 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1394395860 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 416827284 ^ i2;
            throw new RuntimeException();
        }
        int i5 = 827029559 ^ i2;
        loadSettings(1929545123);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1096161638) {
            int i6 = 593229314 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1096161638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (212630633 ^ i5)) {
                break;
            }
        }
        int i7 = 348226975 ^ i5;
        throw new RuntimeException("double");
    }

    private void loadSettings(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.SettingsManager.loadSettings(int):void");
    }

    public java.lang.String getMessage(java.lang.String r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.SettingsManager.getMessage(java.lang.String, java.lang.String[], int):java.lang.String");
    }

    public String getMessageWithPrefix(String str, String[] strArr, int i) {
        int i2 = 643397904 ^ (373000247 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -376790063) {
            int i3 = 1695128071 ^ i2;
            return ChatFormater.color(this.prefix) + getMessage(str, strArr, 1670444521);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -376790063 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (738601154 ^ i2)) {
                int i4 = 1551324013 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1043958806 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (967999322 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1893955464 ^ i2;
        throw new IllegalAccessException();
    }

    public void sendKeyAllAlert(Player player, int i, String str, int i2) {
        int i3 = 1998038585 ^ (2074344582 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 255852304) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 255852304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (23085569 ^ i3)) {
                    break;
                }
            }
            int i4 = 418811732 ^ i3;
            throw new IOException("double");
        }
        int i5 = 1752911870 ^ i3;
        if (this.autoKeyAlertChatMessage == null) {
            int i6 = 711099780 ^ i5;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1290109155) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1290109155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1417600401 ^ i5)) {
                    break;
                }
            }
            int i7 = 1601247705 ^ i5;
            throw new IllegalAccessException("double");
        }
        int i8 = 1164157630 ^ i5;
        if (this.autoKeyAlertChatMessage.isEmpty() == (754913954 ^ i8)) {
            i8 = inszhsxephnjkgqi(i8, 665349536);
            String str2 = ChatFormater.color(this.prefix) + this.autoKeyAlertChatMessage;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1522268176) {
                i8 = 139945978 ^ i8;
                String replace = str2.replace(oywvznuvak(cwcjwkdakdipzma(), i8), String.valueOf(i));
                String oywvznuvak = oywvznuvak(inqbzopvfdbapor(), i8);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 402704320) {
                    int i9 = 1642778469 ^ i8;
                    String replace2 = replace.replace(oywvznuvak, str);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 391560427) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 391560427 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (242883555 ^ i9)) {
                                break;
                            }
                        }
                        int i10 = 512265310 ^ i9;
                        throw new IllegalAccessException("double");
                    }
                    i8 = 1256422777 ^ i9;
                    String color = ChatFormater.color(replace2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1078810401) {
                        i8 = 911067750 ^ i8;
                        List parseComponents = parseComponents(color, 371129574);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -232586224) {
                            i8 = 2023878309 ^ i8;
                            player.spigot().sendMessage((BaseComponent[]) parseComponents.toArray(new BaseComponent[(byte) (1726320167 ^ i8)]));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 925659451) {
                                int i11 = 874847195 ^ i8;
                                return;
                            }
                        }
                    }
                }
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1744344337) {
            int i12 = 1862346554 ^ i8;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 535932098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1872919531 ^ i8)) {
                int i13 = 146083495 ^ i8;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -232586224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (553207914 ^ i8)) {
                    int i14 = 1548886024 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1078810401 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1565019580 ^ i8)) {
                        int i15 = 338247806 ^ i8;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 925659451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (397283912 ^ i8)) {
                            int i16 = 2107958337 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 402704320 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (223805119 ^ i8)) {
                                int i17 = 832969616 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1522268176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2041145309 ^ i8)) {
                                    int i18 = 2066087154 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1744344337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (26639135 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i19 = 2061672540 ^ i8;
        throw new IllegalAccessException();
    }

    private java.util.List parseComponents(java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.managers.SettingsManager.parseComponents(java.lang.String, int):java.util.List");
    }

    @Generated
    public DonutModule getPlugin() {
        int i = 2138001094 ^ (1600236224 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1793723097) {
            int i2 = 204497893 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1793723097 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1628917373 ^ i)) {
                int i3 = 482129062 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 191436273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1922410643 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1612121301 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getAutoKeyTime(int i) {
        int i2 = 55581047 ^ (335528185 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -270276968) {
            int i3 = 186159585 ^ i2;
            return this.autoKeyTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1222153840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1055114362 ^ i2)) {
                int i4 = 621687569 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -270276968 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1956110672 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1760602937 ^ i2;
        throw new IOException();
    }

    @Generated
    public Map getAutoKeyKeys(int i) {
        int i2 = 1416398243 ^ (1164460124 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -491059952) {
            int i3 = 1304190491 ^ i2;
            return this.autoKeyKeys;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1889929782 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2101138644 ^ i2)) {
                int i4 = 665390659 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -491059952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (486369634 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 775072272 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isAutoKeyAlertEnabled(int i) {
        int i2 = 912225610 ^ (1772981863 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1794444414) {
            int i3 = 1446697171 ^ i2;
            return this.autoKeyAlertEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 618411288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1290016074 ^ i2)) {
                int i4 = 474187018 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1794444414 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1392510387 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 726023446 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getAutoKeyAlertSound(int i) {
        int i2 = 333830873 ^ (304270103 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1688577176) {
            int i3 = 1575424758 ^ i2;
            return this.autoKeyAlertSound;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1952632022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1357605134 ^ i2)) {
                int i4 = 706513173 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1688577176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1789893909 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 50620148 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getAutoKeyAlertActionbar(int i) {
        int i2 = 1621670750 ^ (1262240446 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 909829609) {
            int i3 = 323030651 ^ i2;
            return this.autoKeyAlertActionbar;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 909829609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (750784414 ^ i2)) {
                int i4 = 1004353117 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1405970895 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1249261329 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 823930582 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public String getAutoKeyAlertChatMessage() {
        int i = 654703071 ^ (736007202 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 205931776) {
            int i2 = 1379107366 ^ i;
            return this.autoKeyAlertChatMessage;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 205931776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1564766440 ^ i)) {
                int i3 = 1387028801 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1646635982 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (786582669 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1206616280 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getStorageMethod() {
        int i = 941041497 ^ (82055621 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1929077239) {
            int i2 = 1473111488 ^ i;
            return this.storageMethod;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 862695435 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (372621298 ^ i)) {
                int i3 = 1133275641 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1929077239 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (393535815 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1869983923 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getMysqlHost() {
        int i = 869605096 ^ (401363421 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1264014145) {
            int i2 = 466337944 ^ i;
            return this.mysqlHost;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1794549887 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (232450644 ^ i)) {
                int i3 = 976859062 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1264014145 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2144534126 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1979144854 ^ i;
        throw new IOException();
    }

    @Generated
    public int getMysqlPort() {
        int i = 1492051852 ^ (1812304693 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -842625247) {
            int i2 = 75132019 ^ i;
            return this.mysqlPort;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -300553031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1770202631 ^ i)) {
                int i3 = 294749272 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -842625247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1527982476 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1063674003 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getMysqlDatabase() {
        int i = 1663086330 ^ (1596003610 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1970211351) {
            int i2 = 485634299 ^ i;
            return this.mysqlDatabase;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1828811313 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1735509791 ^ i)) {
                int i3 = 1058185065 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1970211351 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1981816212 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1562174185 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getMysqlUsername() {
        int i = 88799172 ^ (607149529 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1632139777) {
            int i2 = 1989813075 ^ i;
            return this.mysqlUsername;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1632139777 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (518892291 ^ i)) {
                int i3 = 388904266 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -711368550 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (678443146 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1755072838 ^ i;
        throw new IOException();
    }

    @Generated
    public String getMysqlPassword() {
        int i = 176112077 ^ (127308574 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 97762416) {
            int i2 = 1066960006 ^ i;
            return this.mysqlPassword;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -115894207 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1650173853 ^ i)) {
                int i3 = 1430134392 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 97762416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2067769623 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 200555230 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public String getPrefix() {
        int i = 47568030 ^ (48934955 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1801850688) {
            int i2 = 407271872 ^ i;
            return this.prefix;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1801850688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (36147345 ^ i)) {
                int i3 = 1903977443 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1453997760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1450788267 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1569569829 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public Map<String, String> getMessages() {
        int i = 1459735059 ^ (175975609 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2122702918) {
            int i2 = 2045403473 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1311315249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1838541617 ^ i)) {
                int i3 = 2023910131 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2122702918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1301831622 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1343776581 ^ i;
        throw new IOException();
    }

    @Generated
    public Pattern getTAG_PATTERN() {
        int i = 88104884 ^ (1168286767 ^ 223585629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1837823538) {
            int i2 = 837198215 ^ i;
            return this.TAG_PATTERN;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -490735093 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1570169228 ^ i)) {
                int i3 = 782710009 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1837823538 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (678625692 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 69937772 ^ i;
        throw new IllegalAccessException();
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
        snlmvasdfv = ByteBuffer.wrap(kovcdlvjkucquyy()).asCharBuffer().toString();
        CmYbFvaJvR = 468205785 ^ new Random(5665683894261234738L).nextInt();
    }

    public static String oywvznuvak(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = snlmvasdfv.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] yrwvcopbiinjmtb() {
        return new byte[]{0, 0, 0, 27, 0, 0, 0, 0};
    }

    private static byte[] mwbwzvzzsiroyjr() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 27};
    }

    private static byte[] ekoztdqeripainu() {
        return new byte[]{0, 0, 0, 31, 0, 0, 0, 31};
    }

    private static byte[] mblmdrwoillhlgb() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 62};
    }

    private static byte[] gyhmjimabfwgkfn() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 70};
    }

    private static byte[] cdlzfccmosigkdh() {
        return new byte[]{0, 0, 0, 46, 0, 0, 0, 85};
    }

    private static byte[] ulqknbrikyazgxo() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -125};
    }

    private static byte[] fprnhubumoghwpi() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -103};
    }

    private static byte[] cuxtqncoxdchssh() {
        return new byte[]{0, 0, 0, 33, 0, 0, 0, -81};
    }

    private static byte[] mgnjngvkkarzmcn() {
        return new byte[]{0, 0, 0, 0, 0, 0, 0, -48};
    }

    private static byte[] qvnrfpfcfskjpgg() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, -48};
    }

    private static byte[] zwcqclyrynssjbn() {
        return new byte[]{0, 0, 0, 29, 0, 0, 0, -42};
    }

    private static byte[] umonhxwmtwhwycs() {
        return new byte[]{0, 0, 0, 28, 0, 0, 0, -13};
    }

    private static byte[] froeqktsmewxavm() {
        return new byte[]{0, 0, 0, 27, 0, 0, 1, 15};
    }

    private static byte[] npmrvgmgvfkfiwp() {
        return new byte[]{0, 0, 0, 4, 0, 0, 1, 42};
    }

    private static byte[] hdafgepatrqntrg() {
        return new byte[]{0, 0, 0, 23, 0, 0, 1, 46};
    }

    private static byte[] xpwnliszspiribl() {
        return new byte[]{0, 0, 0, 27, 0, 0, 1, 69};
    }

    private static byte[] tbwqvbfivzjbbwd() {
        return new byte[]{0, 0, 0, 0, 0, 0, 1, 96};
    }

    private static byte[] nvianypowbdwiaa() {
        return new byte[]{0, 0, 0, 23, 0, 0, 1, 96};
    }

    private static byte[] vracjjvdeonsklx() {
        return new byte[]{0, 0, 0, 9, 0, 0, 1, 119};
    }

    private static byte[] qygnupadiezrwfz() {
        return new byte[]{0, 0, 0, 36, 0, 0, 1, Byte.MIN_VALUE};
    }

    private static byte[] caceavoiqkvrozs() {
        return new byte[]{0, 0, 0, 0, 0, 0, 1, -92};
    }

    private static byte[] xsgsmgtgafefdym() {
        return new byte[]{0, 0, 0, 19, 0, 0, 1, -92};
    }

    private static byte[] oqxobcqjnqfpxyg() {
        return new byte[]{0, 0, 0, 6, 0, 0, 1, -73};
    }

    private static byte[] rrpxztycwmdwzoz() {
        return new byte[]{0, 0, 0, 0, 0, 0, 1, -67};
    }

    private static byte[] cwcjwkdakdipzma() {
        return new byte[]{0, 0, 0, 8, 0, 0, 1, -67};
    }

    private static byte[] inqbzopvfdbapor() {
        return new byte[]{0, 0, 0, 7, 0, 0, 1, -59};
    }

    private static byte[] zjtpdttbsbfgund() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, -52};
    }

    private static byte[] zghfdrjzrkjrduk() {
        return new byte[]{0, 0, 0, 5, 0, 0, 1, -47};
    }

    private static byte[] kovcdlvjkucquyy() {
        return new byte[]{52, 83, 52, 83, 54, 65, 48, 85, 55, 25, 55, 71, 50, 66, 53, 95, 52, 69, 52, 86, 52, 85, 54, 80, 48, 26, 55, 89, 55, 77, 50, 69, 53, 65, 52, 91, 52, 25, 52, 86, 54, 84, 48, 64, 55, 85, 55, 86, 50, 87, 53, 67, 52, 82, 52, 67, 52, 87, 54, 70, 48, 64, 52, 89, 49, 69, 55, 77, 48, 93, 56, 89, 56, 80, 48, 67, 57, 89, 50, 91, 52, 21, 49, 91, 55, 92, 48, 75, 56, 25, 56, 80, 48, 91, 57, 92, 50, 22, 52, 89, 49, 92, 55, 92, 48, 64, 56, 64, 56, 31, 48, 82, 57, 94, 50, 89, 52, 90, 49, 92, 55, 92, 48, 86, 49, 85, 48, 92, 56, 75, 57, 64, 54, 80, 56, 87, 57, 93, 56, 74, 51, 92, 51, 85, 51, 71, 57, 64, 56, 82, 49, 84, 48, 86, 52, 74, 51, 22, 51, 65, 51, 66, 51, 81, 57, 85, 56, 90, 49, 75, 51, 13, 51, 87, 51, 70, 57, 82, 56, 87, 49, 90, 48, 86, 52, 87, 51, 76, 51, 11, 51, 19, 51, 7, 57, 7, 56, 10, 49, 11, 48, 87, 52, 91, 51, 2, 51, 18, 51, 9, 51, 86, 57, 6, 56, 10, 49, 81, 48, 5, 52, 7, 51, 99, 51, 114, 51, 66, 51, 85, 57, 71, 56, 86, 49, 64, 48, 110, 52, 5, 51, 23, 51, 86, 51, 66, 51, 85, 57, 87, 56, 90, 49, 86, 48, 93, 52, 77, 51, 6, 51, 17, 51, 87, 53, 65, 49, 65, 48, 91, 51, 94, 54, 84, 52, 69, 53, 89, 52, 80, 51, 27, 53, 95, 49, 80, 48, 77, 51, 30, 54, 84, 52, 93, 53, 92, 52, 29, 51, 66, 53, 93, 49, 88, 48, 81, 49, 87, 48, 76, 57, 65, 56, 95, 49, 92, 54, 81, 57, 77, 53, 81, 48, 82, 49, 27, 48, 82, 57, 80, 56, 73, 49, 28, 54, 81, 57, 85, 53, 84, 48, 31, 49, 93, 48, 92, 57, 76, 56, 67, 53, 89, 51, 69, 55, 68, 49, 93, 48, 88, 56, 82, 48, 67, 48, 88, 50, 83, 53, 21, 51, 91, 55, 85, 49, 75, 48, 24, 56, 82, 48, 91, 48, 93, 50, 30, 53, 89, 51, 92, 55, 85, 49, 64, 48, 65, 56, 29, 48, 86, 48, 82, 50, 68, 53, 81, 51, 95, 55, 94, 49, 80, 48, 84, 56, 65, 52, 64, 53, 68, 57, 93, 53, 84, 51, 93, 48, 77, 49, 85, 50, 67, 56, 69, 52, 88, 53, 91, 49, 85, 50, 66, 56, 88, 52, 84, 53, 27, 49, 95, 50, 83, 56, 72, 52, 26, 53, 87, 49, 88, 50, 90, 56, 31, 52, 86, 53, 90, 49, 81, 50, 68, 56, 69, 52, 25, 53, 69, 49, 91, 50, 67, 56, 95, 52, 83, 49, 113, 50, 120, 56, 101, 52, 126, 53, 98, 49, 109, 50, 105, 56, 116, 52, 111, 53, 102, 49, 113, 50, 100, 56, 120, 52, 114, 53, 120, 49, 119, 50, 115, 56, 110, 52, 120, 53, 100, 49, 118, 50, 105, 56, 97, 52, 126, 53, 117, 49, Byte.MAX_VALUE, 50, 99, 56, 97, 55, 93, 54, 80, 53, 71, 48, 82, 55, 26, 57, 69, 49, 65, 51, 95, 51, 69, 55, 88, 54, 86, 53, 86, 48, 29, 55, 90, 57, 79, 49, 70, 51, 65, 51, 91, 55, 23, 54, 68, 53, 64, 48, 86, 55, 69, 57, 88, 49, 84, 51, 93, 51, 82, 55, 75, 54, 94, 53, 92, 48, 71, 50, 84, 56, 86, 51, 67, 57, 89, 49, 25, 50, 67, 56, 67, 51, 88, 57, 74, 49, 85, 50, 87, 56, 82, 51, 25, 57, 85, 49, 77, 50, 67, 56, 70, 51, 91, 57, 22, 49, 68, 50, 95, 56, 69, 51, 67, 50, 84, 53, 85, 52, 70, 57, 82, 49, 30, 50, 67, 53, 64, 52, 93, 57, 65, 49, 82, 50, 87, 53, 81, 52, 28, 57, 94, 49, 74, 50, 67, 53, 69, 52, 94, 57, 29, 49, 67, 50, 81, 53, 71, 52, 65, 57, 68, 49, 92, 50, 66, 53, 80, 51, 82, 53, 83, 57, 69, 50, 84, 56, 30, 54, 70, 50, 77, 49, 93, 53, 74, 51, 87, 53, 85, 57, 84, 50, 27, 56, 94, 54, 76, 50, 74, 49, 67, 53, 84, 51, 24, 53, 90, 57, 94, 50, 70, 56, 71, 51, 90, 53, 93, 57, 82, 50, 84, 56, 95, 54, 93, 50, 86, 49, 65, 53, 76, 49, 83, 54, 67, 51, 68, 51, 92, 50, 88, 49, 83, 54, 66, 51, 89, 51, 80, 50, 24, 49, 89, 54, 83, 51, 73, 51, 30, 50, 84, 49, 94, 54, 90, 51, 30, 51, 82, 50, 89, 49, 87, 54, 68, 51, 68, 51, 29, 50, 86, 49, 90, 54, 87, 51, 68, 51, 30, 50, 88, 49, 87, 54, 69, 51, 67, 51, 82, 50, 82, 49, 87, 49, 84, 51, 82, 57, 66, 56, 89, 56, 24, 49, 67, 51, 71, 57, 89, 56, 74, 56, 84, 49, 87, 51, 86, 57, 24, 56, 85, 56, 80, 49, 68, 51, 91, 57, 89, 56, 92, 49, 99, 51, 98, 57, 122, 56, 113, 56, 97, 49, 117, 53, 21, 51, 82, 56, 93, 52, 95, 53, 69, 51, 93, 56, 68, 52, 21, 53, 21, 51, 80, 56, 66, 52, 81, 53, 68, 51, 86, 56, 21, 49, 83, 53, 94, 49, 93, 49, 83, 57, 88, 49, 95, 57, 89, 53, 68, 53, 80, 50, 70};
    }

    private static int inszhsxephnjkgqi(int i, int i2) {
        return i2 ^ i;
    }
}
