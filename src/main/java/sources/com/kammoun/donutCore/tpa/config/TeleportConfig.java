package com.kammoun.donutCore.tpa.config;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.tpa.TeleportPlugin;
import com.kammoun.donutCore.tpa.service.Enums.Messages;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import lombok.Generated;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class TeleportConfig {
    private final FileConfiguration config;
    private boolean safeTeleport;
    private int teleportLimitations;
    private int clearTime;
    private Map<String, String> worldNicknames;
    private Map<String, Sound> sounds;
    private Map<Messages, String> messages;
    private final Pattern TAG_PATTERN;

    private static int f1244XBEQr1m49 = 0;
    private transient int bsrOfdi6cX = 1268449739;
    private static String ujfrwfdfqw;
    private static String[] nothing_to_see_here = new String[15];

    public TeleportConfig(TeleportPlugin teleportPlugin, int i) {
        int i2 = 1382678901 ^ (1867853333 ^ 865895711);
        int parseInt = 1499270043 ^ (292946523 ^ Integer.parseInt("1183359935"));
        this.bsrOfdi6cX = 1268449739 ^ f1244XBEQr1m49;
        int thdtnpxyaopwqluc = 1111016281 ^ thdtnpxyaopwqluc(parseInt, 229958009);
        this.TAG_PATTERN = Pattern.compile("<(click|hover):([^:]+):(['\"]?)(.*?)\\3>(.*?)</\\1>", 32);
        this.config = teleportPlugin.getConfig(127597628);
        loadConfiguration(1262886346);
        int i3 = 1814816641 ^ (224343997 ^ (728043723 ^ thdtnpxyaopwqluc));
    }

    public void reload(int i) {
        int i2 = 1093707306 ^ (217164314 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1944906552) {
            int i3 = 1623418626 ^ i2;
            this.worldNicknames.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1979175723) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1979175723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1399482897 ^ i3)) {
                        break;
                    }
                }
                int i4 = 915420261 ^ i3;
                throw new IOException("double");
            }
            int i5 = 1926704888 ^ i3;
            this.sounds.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -481385240) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -481385240 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2101318318 ^ i5)) {
                        break;
                    }
                }
                int i6 = 241902571 ^ i5;
                throw new IllegalAccessException("double");
            }
            i2 = 1296868189 ^ i5;
            this.messages.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993622014) {
                i2 = 262206412 ^ i2;
                loadConfiguration(1262886346);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -198434718) {
                    int i7 = 827428056 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1944906552 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1800921330 ^ i2)) {
                int i8 = 225891210 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -198434718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (853581715 ^ i2)) {
                    int i9 = 2031562630 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1993622014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (658499853 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i10 = 1657531323 ^ i2;
        throw new RuntimeException();
    }

    private void loadConfiguration(int i) {
        int i2 = 1221285706 ^ (1970907211 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -260869453) {
            int i3 = 519961443 ^ i2;
            this.safeTeleport = this.config.getBoolean(puzslqmghl(mzkybizdzlizqcv(), i3), (byte) (1626576180 ^ i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 127707563) {
                i2 = 1133266380 ^ i3;
                this.teleportLimitations = this.config.getInt(puzslqmghl(ocmimcjcazwokko(), i2), 417667334 ^ i2);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469665737) {
                    int i4 = 859364182 ^ i2;
                    this.clearTime = this.config.getInt(puzslqmghl(yqfpxakejkfhgta(), i4), (byte) (273091543 ^ i4));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -2110235272) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2110235272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1240790228 ^ i4)) {
                                break;
                            }
                        }
                        int i5 = 957879491 ^ i4;
                        throw new IllegalAccessException("double");
                    }
                    i3 = 933565675 ^ i4;
                    loadWorldNicknames(2065753075);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1058077217) {
                        int i6 = 1948561270 ^ i3;
                        loadSounds(1290278733);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1640660590) {
                            i6 = 1145634695 ^ i6;
                            loadMessages(540256604);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1133347416) {
                                int i7 = 53435967 ^ i6;
                                return;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1133347416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (134205044 ^ i6)) {
                                int i8 = 69110278 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1640660590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (619089366 ^ i6)) {
                                    break;
                                }
                            }
                        }
                        int i9 = 364958537 ^ i6;
                        throw new IllegalAccessException();
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1058077217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1313500981 ^ i3)) {
                    int i10 = 1477872505 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 127707563 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1292751302 ^ i3)) {
                        break;
                    }
                }
            }
            int i11 = 1658738810 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -260869453 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (456416211 ^ i2)) {
                int i12 = 859246981 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 469665737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (807142554 ^ i2)) {
                    break;
                }
            }
        }
        int i13 = 719202384 ^ i2;
        throw new IOException("double");
    }

    private void loadWorldNicknames(int i) {
        int i2 = 1269461959 ^ (1762749956 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 138175651) {
            int i3 = 1457024323 ^ i2;
            this.worldNicknames = new HashMap();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1090580807) {
                i2 = 1122780687 ^ i3;
                if (this.config.isConfigurationSection(puzslqmghl(miplvwklsakdoia(), i2)) == (1966319576 ^ i2)) {
                    thdtnpxyaopwqluc(i2, 413898260);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1449312573) {
                    i2 = 1686518017 ^ i2;
                    Iterator it = this.config.getConfigurationSection(puzslqmghl(dortffsaoxqbggu(), i2)).getKeys((byte) (297115353 ^ i2)).iterator();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1918044472) {
                        int i4 = 1043495700 ^ i2;
                        while (true) {
                            int i5 = i4;
                            if (it.hasNext() == (797435341 ^ i5)) {
                                thdtnpxyaopwqluc(i5, 1109382145);
                                return;
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2084515433) {
                                int i6 = 1021284977 ^ i5;
                                String str = (String) it.next();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1698447904) {
                                    int i7 = 1956060409 ^ i6;
                                    this.worldNicknames.put(str, this.config.getString("world-nicknames." + str));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1048271403) {
                                        int i8 = 890058737 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1777146462) {
                                            int thdtnpxyaopwqluc = thdtnpxyaopwqluc(i8, 1219756186);
                                            try {
                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(thdtnpxyaopwqluc) == 54872303) {
                                                    throw new IOException();
                                                }
                                                throw null;
                                            } catch (IOException e) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                    case -1641312750:
                                                        i3 = 300011097 ^ thdtnpxyaopwqluc;
                                                        break;
                                                    case -743251600:
                                                        i3 = 1481827253 ^ thdtnpxyaopwqluc;
                                                        break;
                                                    default:
                                                        throw new IllegalAccessException("Error in hash");
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 287702234) {
                                                    i4 = thdtnpxyaopwqluc(i3, 1839422038);
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1777146462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2050984638 ^ i8)) {
                                                    int i9 = 2107861618 ^ i8;
                                                    throw new IOException("double");
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1048271403 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1060130867 ^ i7)) {
                                                int i10 = 965743448 ^ i7;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1698447904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1746922034 ^ i6)) {
                                            int i11 = 1607274736 ^ i6;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2084515433 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1217742733 ^ i5)) {
                                        int i12 = 1892365490 ^ i5;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 287702234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1293809931 ^ i3)) {
                    int i13 = 784411414 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1641312750 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (768790812 ^ i3)) {
                        int i14 = 634157717 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1090580807 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (238350859 ^ i3)) {
                            int i15 = 1201386024 ^ i3;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 138175651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (380632035 ^ i2)) {
                int i16 = 502881152 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1449312573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1386502326 ^ i2)) {
                    int i17 = 380075874 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1918044472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (492849579 ^ i2)) {
                        int i18 = 468771748 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -743251600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1966939605 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i19 = 710067963 ^ i2;
        throw new IllegalAccessException();
    }

    private void loadSounds(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.config.TeleportConfig.loadSounds(int):void");
    }

    private void loadMessages(int i) {
        int i2;
        int i3 = 726654339 ^ (1186655501 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1917652681) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -953189966 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (56443738 ^ i3)) {
                    int i4 = 1044955868 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1917652681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1561408878 ^ i3)) {
                        int i5 = 1098621822 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -998946366 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1369887486 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i6 = 202924715 ^ i3;
            throw new IllegalAccessException();
        }
        int i7 = 1874596110 ^ i3;
        this.messages = new HashMap();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 263030458) {
            int i8 = 1147264088 ^ i7;
            Messages[] values = Messages.values();
            int length = values.length;
            int i9 = (byte) (93613199 ^ i8);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 748905592) {
                int i10 = 741996113 ^ i8;
                while (true) {
                    i7 = i10;
                    if (i9 >= length) {
                        int i11 = 1900574184 ^ i7;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1298978545) {
                        int i12 = 497292105 ^ i7;
                        Messages messages = values[i9];
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1605612359) {
                            i2 = 1946058807 ^ i12;
                            String string = this.config.getString("messages." + messages.getPath(), messages.getDefaultMessage());
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1069042946) {
                                i2 = 631316784 ^ i2;
                                this.messages.put(messages, string);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 313607299) {
                                    i8 = 6105964 ^ i2;
                                    i9 += 1644889085 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 274210787) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 274210787 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (530335284 ^ i8)) {
                                                int i13 = 1884885562 ^ i8;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8)) {
                                            case 78527671:
                                                break;
                                            case 145433291:
                                            case 234173875:
                                                i8 = 1291841850 ^ i8;
                                                break;
                                        }
                                    }
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) == 184203435) {
                                            throw new IllegalAccessException();
                                        }
                                        throw null;
                                    } catch (IllegalAccessException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -998946366:
                                                i12 = 2095976271 ^ i8;
                                                break;
                                            case 2007471665:
                                                i12 = thdtnpxyaopwqluc(i8, 177493169);
                                                break;
                                            default:
                                                throw new RuntimeException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 587543481) {
                                            i10 = thdtnpxyaopwqluc(i12, 231554217);
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1605612359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1435846617 ^ i12)) {
                                                    int i14 = 1724004047 ^ i12;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 587543481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1501311778 ^ i12)) {
                                                        int i15 = 1250684837 ^ i12;
                                                        throw new IllegalAccessException("double");
                                                    }
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
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2007471665 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1306021375 ^ i2)) {
                        int i16 = 1081448073 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 313607299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (455408216 ^ i2)) {
                            int i17 = 1034528060 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1069042946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1057856821 ^ i2)) {
                                int i18 = 469810648 ^ i2;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 748905592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (804606046 ^ i8)) {
                    int i19 = 2091586105 ^ i8;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1298978545 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1875893912 ^ i7)) {
                int i20 = 1636820489 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 263030458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (292913297 ^ i7)) {
                    int i21 = 1228260178 ^ i7;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    public String getMessage(Messages messages, int i) {
        int i2 = 1532611370 ^ (1880038640 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1196569707) {
            int i3 = 1611339417 ^ i2;
            return this.messages.getOrDefault(messages, messages.getDefaultMessage());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1191870624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1753904823 ^ i2)) {
                int i4 = 910970835 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1196569707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (541223032 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 903642917 ^ i2;
        throw new IllegalAccessException();
    }

    public Sound getSound(String str, int i) {
        int i2 = 2086093365 ^ (466708232 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 567649105) {
            int i3 = 2022342021 ^ i2;
            return this.sounds.getOrDefault(str, Sound.ENTITY_VILLAGER_NO);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 567649105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (315894938 ^ i2)) {
                int i4 = 1042794457 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -444182662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1964204089 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 541564579 ^ i2;
        throw new IllegalAccessException();
    }

    public String getWorldNickname(String str, int i) {
        int i2 = 1981297116 ^ (1329118050 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -723460277) {
            int i3 = 957330231 ^ i2;
            return this.worldNicknames.getOrDefault(str, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -723460277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (528402517 ^ i2)) {
                int i4 = 1220832899 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 480069362 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (259401885 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 60434859 ^ i2;
        throw new RuntimeException();
    }

    public void sendMessage(Player player, Messages messages, String[] strArr, int i) {
        int i2 = 698772504 ^ (197503290 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 251306923) {
            i2 = 1246576770 ^ i2;
            String message = getMessage(messages, 1156495702);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1552983993) {
                i2 = 1269289440 ^ i2;
                player.sendMessage(ChatFormater.color(PlaceHolderHelper.parsePlaceholders(message, strArr, 887737915)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 28190907) {
                    int i3 = 677478285 ^ i2;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1118164178 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (510645910 ^ i2)) {
                int i4 = 1457287804 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1552983993 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2002289400 ^ i2)) {
                    int i5 = 1839095714 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 251306923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1298958182 ^ i2)) {
                        int i6 = 1236670152 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 28190907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (768554367 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 1084973482 ^ i2;
        throw new IOException();
    }

    public void sendActionBar(Player player, Messages messages, String[] strArr, int i) {
        int i2 = 1298232487 ^ (1614303046 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1999459763) {
            i2 = 955779799 ^ i2;
            String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(getMessage(messages, 1156495702), strArr, 887737915));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1326644470) {
                i2 = 355605560 ^ i2;
                Player.Spigot spigot = player.spigot();
                ChatMessageType chatMessageType = ChatMessageType.ACTION_BAR;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 427680458) {
                    i2 = 1877899877 ^ i2;
                    BaseComponent[] fromLegacyText = TextComponent.fromLegacyText(color);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1712206305) {
                        i2 = 269879157 ^ i2;
                        spigot.sendMessage(chatMessageType, fromLegacyText);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -423753143) {
                            int i3 = 593923727 ^ i2;
                            return;
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -41255376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (449931044 ^ i2)) {
                int i4 = 1951238982 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1999459763 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1531902739 ^ i2)) {
                    int i5 = 288997230 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1326644470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (441098300 ^ i2)) {
                        int i6 = 423762077 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1712206305 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1713401143 ^ i2)) {
                            int i7 = 617615053 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 427680458 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (609930370 ^ i2)) {
                                int i8 = 2025335635 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -423753143 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (483477488 ^ i2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i9 = 73393640 ^ i2;
        throw new RuntimeException();
    }

    public void sendTeleportMessage(Player player, Messages messages, String[] strArr, int i) {
        int i2 = 1199098753 ^ (1327577174 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1596658690) {
            int i3 = 1651942988 ^ i2;
            String message = getMessage(messages, 1156495702);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1285432929) {
                i2 = 960379002 ^ i3;
                String parsePlaceholders = PlaceHolderHelper.parsePlaceholders(message, strArr, 887737915);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2056264272) {
                    i3 = 810604092 ^ i2;
                    String color = ChatFormater.color(parsePlaceholders);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 132731985) {
                        i2 = 515222367 ^ i3;
                        List parseComponents = parseComponents(color, 668316288);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -230420823) {
                            i2 = 1358906793 ^ i2;
                            player.spigot().sendMessage((BaseComponent[]) parseComponents.toArray(new BaseComponent[(byte) (1857537148 ^ i2)]));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1975395299) {
                                int i4 = 279215353 ^ i2;
                                return;
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 132731985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (946163191 ^ i3)) {
                    int i5 = 1584302725 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1285432929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (877456676 ^ i3)) {
                        break;
                    }
                }
            }
            int i6 = 1612591560 ^ i3;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1975395299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (905458045 ^ i2)) {
                int i7 = 1849551134 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2056264272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (490481985 ^ i2)) {
                    int i8 = 1336818960 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1596658690 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (384393871 ^ i2)) {
                        int i9 = 1999274245 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -230420823 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (414214144 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 966192548 ^ i2;
        throw new IllegalAccessException();
    }

    public void playSound(org.bukkit.entity.Player r7, java.lang.String r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.config.TeleportConfig.playSound(org.bukkit.entity.Player, java.lang.String, int):void");
    }

    private java.util.List parseComponents(java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.tpa.config.TeleportConfig.parseComponents(java.lang.String, int):java.util.List");
    }

    @Generated
    public FileConfiguration getConfig() {
        int i = 178818833 ^ (2030453705 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2137854855) {
            int i2 = 313321509 ^ i;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2137854855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (531969112 ^ i)) {
                int i3 = 1830752451 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 368422225 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1216408625 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1963353859 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public boolean isSafeTeleport() {
        int i = 460239744 ^ (736059830 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1737876725) {
            int i2 = 2070939667 ^ i;
            return this.safeTeleport;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1139432336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1334984348 ^ i)) {
                int i3 = 622483369 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1737876725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (316561745 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1239727725 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getTeleportLimitations() {
        int i = 275640690 ^ (103374041 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1346246686) {
            int i2 = 818338401 ^ i;
            return this.teleportLimitations;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 704066795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1354758642 ^ i)) {
                int i3 = 247228088 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1346246686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1213951585 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1735158808 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getClearTime(int i) {
        int i2 = 208134989 ^ (9289161 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2058780314) {
            int i3 = 926270898 ^ i2;
            return this.clearTime;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2058780314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1948189470 ^ i2)) {
                int i4 = 2120491182 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1021816053 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1472981491 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 814044002 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Map<String, String> getWorldNicknames() {
        int i = 1029448298 ^ (977532120 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 622477098) {
            int i2 = 1256236172 ^ i;
            return this.worldNicknames;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 622477098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (589063744 ^ i)) {
                int i3 = 1259024570 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1914641224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (834776391 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1271877281 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Map<String, Sound> getSounds() {
        int i = 1644580118 ^ (647801064 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 959685960) {
            int i2 = 14234867 ^ i;
            return this.sounds;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 959685960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (915860637 ^ i)) {
                int i3 = 716907563 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1073349328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (365835150 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 176012725 ^ i;
        throw new IOException();
    }

    @Generated
    public Map<Messages, String> getMessages() {
        int i = 1002633159 ^ (2051588523 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 297089496) {
            int i2 = 83854788 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 910759928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1110672782 ^ i)) {
                int i3 = 867906582 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 297089496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1893126115 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2051941965 ^ i;
        throw new IOException();
    }

    @Generated
    public Pattern getTAG_PATTERN() {
        int i = 515710785 ^ (107645212 ^ 1136431447);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -614975406) {
            int i2 = 2006411202 ^ i;
            return this.TAG_PATTERN;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1742931521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1015282909 ^ i)) {
                int i3 = 349176794 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -614975406 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1666624818 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1875758735 ^ i;
        throw new IOException();
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
        ujfrwfdfqw = ByteBuffer.wrap(dsecfphrvfrcpzl()).asCharBuffer().toString();
        f1244XBEQr1m49 = (-1493667079) ^ new Random(-3603190627371300270L).nextInt();
    }

    public static String puzslqmghl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ujfrwfdfqw.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ocmimcjcazwokko() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 0};
    }

    private static byte[] mzkybizdzlizqcv() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 20};
    }

    private static byte[] yqfpxakejkfhgta() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 33};
    }

    private static byte[] dortffsaoxqbggu() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 48};
    }

    private static byte[] miplvwklsakdoia() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 63};
    }

    private static byte[] rsallzqpoisvtfr() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 78};
    }

    private static byte[] bnwrvxmcpqkajop() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 96};
    }

    private static byte[] ecyosyvhmikoikk() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 102};
    }

    private static byte[] hodvpyphxuwncxy() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 108};
    }

    private static byte[] ehppciykznsvpdw() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 113};
    }

    private static byte[] dsecfphrvfrcpzl() {
        return new byte[]{53, 77, 53, 80, 55, 85, 49, 87, 57, 69, 57, 90, 53, 69, 57, 69, 50, 20, 53, 85, 53, 92, 55, 84, 49, 91, 57, 65, 57, 84, 53, 67, 57, 88, 50, 86, 53, 87, 53, 70, 49, 69, 50, 87, 53, 81, 54, 84, 56, 28, 49, 66, 50, 83, 53, 91, 54, 84, 56, 65, 49, 89, 50, 68, 53, 67, 50, 83, 51, 81, 57, 69, 53, 81, 51, 28, 55, 80, 48, 85, 49, 80, 48, 82, 50, 69, 51, 29, 57, 69, 53, 89, 51, 95, 55, 86, 50, 78, 55, 94, 49, 71, 51, 89, 51, 86, 57, 26, 49, 95, 53, 90, 53, 80, 50, 82, 55, 95, 49, 84, 51, 88, 51, 87, 57, 68, 49, 78, 54, 89, 51, 67, 57, 89, 55, 82, 49, 20, 54, 88, 51, 88, 57, 86, 55, 93, 49, 87, 54, 87, 51, 92, 57, 80, 55, 69, 53, 114, 53, 123, 54, 103, 57, 124, 52, 97, 55, 108, 53, 105, 51, 111, 53, 125, 53, 123, 53, 121, 54, 114, 57, 114, 52, 112, 55, 103, 53, 105, 51, 119, 53, 123, 49, 66, 53, 93, 50, 77, 49, 90, 51, 93, 49, 66, 53, 66, 50, 90, 57, 77, 48, 89, 48, 81, 49, 65, 52, 92, 49, 95, 52, 69, 54, 87, 55, 70, 49, 90, 55, 89, 49, 91, 50, 90, 50, 88};
    }

    private static int thdtnpxyaopwqluc(int i, int i2) {
        return i2 ^ i;
    }
}
