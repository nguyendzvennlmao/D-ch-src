package com.kammoun.donutCore.api.utils.title;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class KTitle {
    private final String title;
    private final String subtitle;
    private int fadeIn;
    private int stay;
    private int fadeOut;

    private static int f1552l2zaxGeL = 0;
    private transient int g7RDfvp7lV = 1084702977;
    private static byte[] mkslvfkwpd;
    private static String[] nothing_to_see_here = new String[15];

    public KTitle(@Nullable String str, @Nullable String str2, int i) {
        hspgiiwlcdfznoxv(1258312057 ^ 971094762, 1150954927);
        int parseInt = 628687286 ^ (574419630 ^ Integer.parseInt("826160420"));
        this.g7RDfvp7lV = 1084702977 ^ f1552l2zaxGeL;
        int hspgiiwlcdfznoxv = 1721326148 ^ hspgiiwlcdfznoxv(parseInt, 608045960);
        this.title = str;
        this.subtitle = str2;
        this.fadeIn = 10;
        this.stay = 70;
        this.fadeOut = 20;
        int i2 = 1595276453 ^ (47291163 ^ (328893845 ^ (34705858 ^ (2002894188 ^ hspgiiwlcdfznoxv))));
    }

    public KTitle fadeIn(int i, int i2) {
        int i3 = 1850563967 ^ (928493394 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 421919538) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1834790827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1085480715 ^ i3)) {
                    int i4 = 692471259 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 421919538 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (231760507 ^ i3)) {
                        break;
                    }
                }
            }
            int i5 = 258792090 ^ i3;
            throw new RuntimeException();
        }
        int i6 = 1652936951 ^ i3;
        this.fadeIn = i;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 218856585) {
            int i7 = 1275787876 ^ i6;
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 218856585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1778468927 ^ i6)) {
                break;
            }
        }
        int i8 = 1503023383 ^ i6;
        throw new IllegalAccessException("double");
    }

    public KTitle stay(int i, int i2) {
        int i3 = 1125443304 ^ (402898491 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 155757762) {
            i3 = 648700071 ^ i3;
            this.stay = i;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1008445947) {
                int i4 = 1075866109 ^ i3;
                return this;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1008445947 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1404632196 ^ i3)) {
                int i5 = 688216540 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1025041937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2078440351 ^ i3)) {
                    int i6 = 2113126473 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 155757762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (162310780 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 727617378 ^ i3;
        throw new RuntimeException();
    }

    public KTitle fadeOut(int i, int i2) {
        int i3 = 235311249 ^ (407426707 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 1669356104) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1669356104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1227994143 ^ i3)) {
                    break;
                }
            }
            int i4 = 442739154 ^ i3;
            throw new IOException("double");
        }
        int i5 = 1224330401 ^ i3;
        this.fadeOut = i;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 609107778) {
            int i6 = 1895465099 ^ i5;
            return this;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1550173415 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1849867694 ^ i5)) {
                int i7 = 1155013506 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 609107778 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1792752146 ^ i5)) {
                    break;
                }
            }
        }
        int i8 = 459186648 ^ i5;
        throw new IllegalAccessException();
    }

    public void send(@NotNull Player player) {
        int i;
        String frqjicdxru;
        int i2;
        String frqjicdxru2;
        int i3 = 1080555912 ^ (385647955 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1697221762) {
            int i4 = 716714571 ^ i3;
            if (this.title == null) {
                i = 921581293 ^ i4;
                frqjicdxru = frqjicdxru(adsjwavhmpmjizs(), i);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2019972686) {
                    i2 = 133716950 ^ i;
                    String str = frqjicdxru;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1201965310) {
                        i2 = 1525831489 ^ i2;
                        if (this.subtitle == null) {
                            i2 = hspgiiwlcdfznoxv(i2, 1037159019);
                            frqjicdxru2 = frqjicdxru(lwzwozpzibxopmn(), i2);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2126012847) {
                                i3 = 1104847777 ^ i2;
                                String str2 = frqjicdxru2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1886223525) {
                                    int i5 = 1995006371 ^ i3;
                                    player.sendTitle(str, str2, this.fadeIn, this.stay, this.fadeOut);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 953781824) {
                                        int i6 = 1095033478 ^ i5;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 953781824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2058874485 ^ i5)) {
                                            int i7 = 2137297144 ^ i5;
                                            throw new RuntimeException("double");
                                        }
                                    }
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1875496200) {
                            int i8 = 693815647 ^ i2;
                            frqjicdxru2 = ChatFormater.color(this.subtitle);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 622823409) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 622823409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (608076166 ^ i8)) {
                                        int i9 = 1594032099 ^ i8;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8)) {
                                    case 117278287:
                                        i8 = 1654885640 ^ i8;
                                    case 101879475:
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) == 127971852) {
                                                throw new RuntimeException();
                                            }
                                            throw null;
                                        } catch (RuntimeException e) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                case -1419488632:
                                                    i2 = hspgiiwlcdfznoxv(i8, 874481038);
                                                    break;
                                                case 805564338:
                                                    i2 = 1735619113 ^ i8;
                                                    break;
                                                default:
                                                    throw new RuntimeException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 194543353) {
                                                i3 = hspgiiwlcdfznoxv(i2, 1350655924);
                                                break;
                                            }
                                        }
                                        break;
                                    case 1159849494:
                                    case 1782414798:
                                    default:
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 805564338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1336200201 ^ i8)) {
                                                int i10 = 652723596 ^ i8;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1875496200) {
                            int i11 = 1804887843 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -2126012847) {
                                continue;
                            } else {
                                int i12 = 192824524 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1201965310) {
                                    continue;
                                } else {
                                    int i13 = 1130409336 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 855546482) {
                                        continue;
                                    } else {
                                        int i14 = 1278999302 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 194543353) {
                                            continue;
                                        } else {
                                            int i15 = 46987553 ^ i2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -428303350) {
                                                int i16 = 1680114142 ^ i2;
                                                throw new IllegalAccessException();
                                            }
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -719898247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (302101927 ^ i)) {
                        int i17 = 981724462 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2019972686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (948399871 ^ i)) {
                            int i18 = 786508752 ^ i;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            } else {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 820518619) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 820518619 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1165351829 ^ i4)) {
                            break;
                        }
                    }
                    int i19 = 1277280239 ^ i4;
                    throw new IOException("double");
                }
                i2 = 986845274 ^ i4;
                frqjicdxru = ChatFormater.color(this.title);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -428303350) {
                    int i20 = 685214320 ^ i2;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i20) == 15720026) {
                            throw new RuntimeException();
                        }
                        throw null;
                    } catch (RuntimeException e2) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                            case -1597714549:
                                i = 1320845022 ^ i20;
                                break;
                            case 1732198545:
                                i = 373624637 ^ i20;
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -719898247) {
                            i2 = hspgiiwlcdfznoxv(i, 1839827407);
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1875496200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (600399479 ^ i2)) {
                        int i112 = 1804887843 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -2126012847 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (341007374 ^ i2)) {
                            int i122 = 192824524 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1201965310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (975643767 ^ i2)) {
                                int i132 = 1130409336 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 855546482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (278550765 ^ i2)) {
                                    int i142 = 1278999302 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 194543353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (298701117 ^ i2)) {
                                        int i152 = 46987553 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -428303350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1778747783 ^ i2)) {
                                            int i162 = 1680114142 ^ i2;
                                            throw new IllegalAccessException();
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
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1697221762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1449702195 ^ i3)) {
                int i21 = 407076386 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1886223525 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (422907471 ^ i3)) {
                    int i22 = 113887825 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
    }

    public com.kammoun.donutCore.api.utils.title.KTitle withPlaceholders(java.lang.String... r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.title.KTitle.withPlaceholders(java.lang.String[]):com.kammoun.donutCore.api.utils.title.KTitle");
    }

    public static KTitle fromConfig(@NotNull ConfigurationSection configurationSection) {
        int i = 1660683892 ^ (1737398872 ^ 1519979594);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -10714318) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -10714318 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (476434851 ^ i)) {
                    break;
                }
            }
            int i2 = 1207671965 ^ i;
            throw new RuntimeException("double");
        }
        int i3 = 915409223 ^ i;
        String string = configurationSection.getString(frqjicdxru(buzbpkszfcvzsso(), i3));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1272760587) {
            i3 = 508353012 ^ i3;
            String string2 = configurationSection.getString(frqjicdxru(gmmuhsrvneoonkv(), i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1178990933) {
                i3 = 1370891549 ^ i3;
                KTitle kTitle = new KTitle(string, string2, 945775164);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 873147969) {
                    i3 = 634276980 ^ i3;
                    kTitle.fadeIn(configurationSection.getInt(frqjicdxru(svmqncklcciystq(), i3), kTitle.getFadeIn(2081510602)), 1012093368);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 444157408) {
                        i3 = 690382358 ^ i3;
                        kTitle.stay(configurationSection.getInt(frqjicdxru(dwcnuqkinpddcdt(), i3), kTitle.getStay(761747402)), 1800013823);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1397390673) {
                            int i4 = 544016314 ^ i3;
                            kTitle.fadeOut(configurationSection.getInt(frqjicdxru(kgelmyecefsiyqs(), i4), kTitle.getFadeOut(552178041)), 1892524331);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1344422016) {
                                int i5 = 569821955 ^ i4;
                                return kTitle;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1344422016 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (192300012 ^ i4)) {
                                    break;
                                }
                            }
                            int i6 = 984493547 ^ i4;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 873147969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1691906194 ^ i3)) {
                int i7 = 752598794 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1397390673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1694830716 ^ i3)) {
                    int i8 = 503496272 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 444157408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1009745170 ^ i3)) {
                        int i9 = 1399026191 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1178990933 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (66156510 ^ i3)) {
                            int i10 = 2035479435 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1272760587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1202446858 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i11 = 1982942127 ^ i3;
        throw new RuntimeException();
    }

    @Generated
    public String getTitle() {
        int i = 489060742 ^ (1352462720 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1138349462) {
            int i2 = 664961117 ^ i;
            return this.title;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1138349462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2059450650 ^ i)) {
                int i3 = 2093443911 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2127419261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (853871629 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1349350495 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public String getSubtitle() {
        int i = 773218340 ^ (2115538562 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1367678826) {
            int i2 = 1080821291 ^ i;
            return this.subtitle;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1367678826 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2042438660 ^ i)) {
                int i3 = 1961153205 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1390751280 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1136205886 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 53931557 ^ i;
        throw new IOException();
    }

    @Generated
    public int getFadeIn(int i) {
        int i2 = 1924677471 ^ (685155537 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 42382890) {
            int i3 = 790636873 ^ i2;
            return this.fadeIn;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2072509539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (838788710 ^ i2)) {
                int i4 = 1176473838 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 42382890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2089137443 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 565390969 ^ i2;
        throw new IOException();
    }

    @Generated
    public int getStay(int i) {
        int i2 = 1499207397 ^ (1400174009 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2135592776) {
            int i3 = 1492232239 ^ i2;
            return this.stay;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2135592776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (628544586 ^ i2)) {
                int i4 = 1030211008 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1194865090 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1504084003 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1611370533 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getFadeOut(int i) {
        int i2 = 158216083 ^ (955428792 ^ 440290635);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1561750273) {
            int i3 = 1797202689 ^ i2;
            return this.fadeOut;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 99578634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (765972538 ^ i2)) {
                int i4 = 1658763696 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1561750273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1279395206 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 418406405 ^ i2;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⠄⠄⠄⡀⠄⢀⣿⣿⠄⠄⠄⢸⡇⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄";
        nothing_to_see_here[2] = "⠄⠄⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄";
        nothing_to_see_here[3] = "⠄⠄⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄";
        nothing_to_see_here[4] = "⠄⢀⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰";
        nothing_to_see_here[5] = "⠄⣼⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤";
        nothing_to_see_here[6] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗";
        nothing_to_see_here[7] = "⢀⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄";
        nothing_to_see_here[8] = "⢸⣿⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄";
        nothing_to_see_here[9] = "⠘⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄";
        nothing_to_see_here[10] = "⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄";
        nothing_to_see_here[11] = "⠄⠄⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄";
        nothing_to_see_here[13] = "⠄⠄⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴";
        nothing_to_see_here[14] = "⣿⣿⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⣠⣴⣿⣿⣿";
        mkslvfkwpd = bgacbdqmpcjnhab();
        f1552l2zaxGeL = 196656310 ^ new Random(-1805109463684725322L).nextInt();
    }

    public static String frqjicdxru(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ mkslvfkwpd[i3 % mkslvfkwpd.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] bgacbdqmpcjnhab() {
        return new byte[]{33, 67, 103, 87, 41, 70, 20, 1, 41, 40, 94, 37, 97, 66, 70, 9, 112, 123, 112, 42, 101, 29, 72, 71, 105, 16, 94, Byte.MAX_VALUE, 87, 60, 110, 109, 88, 23, 85, 81, 6, 7, 110};
    }

    private static byte[] buzbpkszfcvzsso() {
        return new byte[]{-18, -117, 81, 6, 30, 19, 35, 88, 25, 117, 111, 119, 87, 9};
    }

    private static byte[] gmmuhsrvneoonkv() {
        return new byte[]{-19, -116, 87, 1, 24, 25, 45, 89, 17, 109, 108, 112, 81, 0};
    }

    private static byte[] svmqncklcciystq() {
        return new byte[]{-22, -119, 82, 0, 16, 17, 35, 83, 28, 120, 107, 75, 88, 29, 113, 81};
    }

    private static byte[] dwcnuqkinpddcdt() {
        return new byte[]{-24, -115, 86, 17, 29, 6, 35, 84, 31, 102};
    }

    private static byte[] kgelmyecefsiyqs() {
        return new byte[]{-18, -118, 95, 1, 28, 21, 35, 80, 27, 124, 104, 66, 81, 24, 116, 75, 69, 61};
    }

    private static byte[] lwzwozpzibxopmn() {
        return new byte[0];
    }

    private static byte[] adsjwavhmpmjizs() {
        return new byte[0];
    }

    private static int hspgiiwlcdfznoxv(int i, int i2) {
        return i2 ^ i;
    }
}
