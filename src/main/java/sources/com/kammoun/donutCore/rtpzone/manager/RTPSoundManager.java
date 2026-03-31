package com.kammoun.donutCore.rtpzone.manager;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class RTPSoundManager {
    private final com.kammoun.donutCore.rtpzone.config.RTPConfigManager configManager;
    private Sound enterRegionSound;
    private float enterRegionPitch;
    private Sound countdownSound;
    private float countdownPitch;
    private Sound exitRegionSound;
    private float exitRegionPitch;
    private Sound teleportedSound;
    private float teleportedPitch;
    private static int isvYkR2uK4 = 0;
    private transient int koaCpnDFOn = 234955230;
    private static String[] nothing_to_see_here = new String[13];

    public RTPSoundManager(com.kammoun.donutCore.rtpzone.config.RTPConfigManager rTPConfigManager, int i) {
        hxzvmuenzlaieroy(91290736 ^ 2049413000, 242482059);
        int parseInt = 882047374 ^ (1156741058 ^ Integer.parseInt("21235263"));
        this.koaCpnDFOn = 234955230 ^ isvYkR2uK4;
        this.configManager = rTPConfigManager;
        loadSounds(338290588);
        int i2 = 1113719218 ^ (901910858 ^ (1166594522 ^ (1364992426 ^ parseInt)));
    }

    public void loadSounds(int i) {
        int i2 = 1641930431 ^ (552540548 ^ 1301179784);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1709528472) {
            i2 = 1746486396 ^ i2;
            this.enterRegionSound = getSound(this.configManager.getConfig(210859674).getString(cedfhvlykv(izbpnsmbngvuyur(), hpcvosftjkvinii(), i2), cedfhvlykv(wznufebpbddexje(), hpcvosftjkvinii(), i2)), 1070406739);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 623867515) {
                i2 = 1593465426 ^ i2;
                this.enterRegionPitch = (float) this.configManager.getConfig(210859674).getDouble(cedfhvlykv(qbexddufqgbyrys(), hpcvosftjkvinii(), i2), 0.5d);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -755129111) {
                    int i3 = 766622844 ^ i2;
                    this.countdownSound = getSound(this.configManager.getConfig(210859674).getString(cedfhvlykv(rxxiywnhoepgylu(), hpcvosftjkvinii(), i3), cedfhvlykv(ktvrryelruwnyfp(), hpcvosftjkvinii(), i3)), 1070406739);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1083160824) {
                        i3 = 1736305181 ^ i3;
                        this.countdownPitch = (float) this.configManager.getConfig(210859674).getDouble(cedfhvlykv(rvdxdgbnlijrgum(), hpcvosftjkvinii(), i3), 0.5d);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2069948445) {
                            i2 = 914417843 ^ i3;
                            this.exitRegionSound = getSound(this.configManager.getConfig(210859674).getString(cedfhvlykv(gvvetfmlsovumwu(), hpcvosftjkvinii(), i2), cedfhvlykv(dkccweehdwxekda(), hpcvosftjkvinii(), i2)), 1070406739);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 815288954) {
                                i2 = 1850743175 ^ i2;
                                this.exitRegionPitch = (float) this.configManager.getConfig(210859674).getDouble(cedfhvlykv(oelajofkdoksrsd(), hpcvosftjkvinii(), i2), 0.5d);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1108909633) {
                                    i2 = 1332080289 ^ i2;
                                    this.teleportedSound = getSound(this.configManager.getConfig(210859674).getString(cedfhvlykv(uvnkbyhdychcnmr(), hpcvosftjkvinii(), i2), cedfhvlykv(zaaclwjwbobutws(), hpcvosftjkvinii(), i2)), 1070406739);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 959966027) {
                                        i3 = 872803465 ^ i2;
                                        this.teleportedPitch = (float) this.configManager.getConfig(210859674).getDouble(cedfhvlykv(pvtgzskjeqxhpyz(), hpcvosftjkvinii(), i3), 0.5d);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1726443774) {
                                            i3 = 223533095 ^ i3;
                                            if (this.enterRegionSound == null) {
                                                i3 = hxzvmuenzlaieroy(i3, 1643331985);
                                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -208777670) {
                                                i2 = 1255891735 ^ i3;
                                                if (this.countdownSound == null) {
                                                    i3 = hxzvmuenzlaieroy(i2, 724050566);
                                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1521133952) {
                                                    i2 = 271494344 ^ i2;
                                                    if (this.exitRegionSound == null) {
                                                        i3 = hxzvmuenzlaieroy(i2, 990285390);
                                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 606089408) {
                                                        i2 = 1388175354 ^ i2;
                                                        if (this.teleportedSound == null) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1311846638) {
                                                                while (true) {
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1311846638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1717977650 ^ i2)) {
                                                                        break;
                                                                    }
                                                                }
                                                                int i4 = 1993830940 ^ i2;
                                                                throw new IOException("double");
                                                            }
                                                            i3 = 1773883828 ^ i2;
                                                        }
                                                        while (true) {
                                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                                                case 118505500:
                                                                    int i5 = 14542929 ^ i2;
                                                                    return;
                                                                case 1578951493:
                                                                    return;
                                                                case 1645271316:
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Bukkit.getLogger().severe(cedfhvlykv(icwrsuclaoblwzg(), hpcvosftjkvinii(), i3));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -65781071) {
                                                int i6 = 1768339941 ^ i3;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1726443774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1741294053 ^ i3)) {
                            int i7 = 1352838683 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -65781071 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (142842575 ^ i3)) {
                                int i8 = 2064769171 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1083160824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1763958578 ^ i3)) {
                                    int i9 = 1589815737 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2069948445 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2091987248 ^ i3)) {
                                        int i10 = 481466103 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -208777670 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (51446076 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i11 = 1560663652 ^ i3;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 606089408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1864928617 ^ i2)) {
                int i12 = 601167655 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 815288954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1093797236 ^ i2)) {
                    int i13 = 1933277953 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1521133952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2099232302 ^ i2)) {
                        int i14 = 1117215993 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 959966027 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (226806968 ^ i2)) {
                            int i15 = 1064671762 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -755129111 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1494538840 ^ i2)) {
                                int i16 = 837399359 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1709528472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1146652397 ^ i2)) {
                                    int i17 = 1862050726 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1108909633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1268939748 ^ i2)) {
                                        int i18 = 1096180386 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 623867515 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (886547818 ^ i2)) {
                                            int i19 = 12301750 ^ i2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1222537830 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1396270724 ^ i2)) {
                                                int i20 = 1092206473 ^ i2;
                                                throw new IOException();
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
    }

    private Sound getSound(String str, int i) {
        int i2 = 788748438 ^ (243152358 ^ 1301179784);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1738016707) {
            i2 = 1087542636 ^ i2;
            if (str != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1628220577) {
                    int i3 = 1633018702 ^ i2;
                    if (str.isEmpty() != (1299478234 ^ i3)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1805891282) {
                            int i4 = 26916193 ^ i3;
                            return null;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1805891282 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (716032529 ^ i3)) {
                                int i5 = 383733243 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1307006039 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (465320074 ^ i3)) {
                                    break;
                                }
                            }
                        }
                        int i6 = 334207584 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                    int hxzvmuenzlaieroy = hxzvmuenzlaieroy(i3, 2047028123);
                    i2 = hxzvmuenzlaieroy;
                    try {
                        Sound valueOf = Sound.valueOf(str.toUpperCase());
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1145378295) {
                            i2 = 793365432 ^ i2;
                            return valueOf;
                        }
                    } catch (IllegalArgumentException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case -1145378295:
                                i2 = 1391057491 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 754202771) {
                                    i2 = 1386842042 ^ i2;
                                    Bukkit.getLogger().severe("[RtpZone] Invalid sound specified in config.yml: " + str);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1179122367) {
                                        int i7 = 24384989 ^ i2;
                                        return null;
                                    }
                                }
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 92356079:
                        int i8 = 1624200751 ^ i2;
                        break;
                    case 128483094:
                        break;
                    case 1908251561:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1628220577 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1447371663 ^ i2)) {
                int i9 = 840837027 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 754202771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (568651006 ^ i2)) {
                    int i10 = 827911024 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1145378295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1088581364 ^ i2)) {
                        int i11 = 922080318 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1738016707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (814539118 ^ i2)) {
                            int i12 = 138341406 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1040926776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (811955944 ^ i2)) {
                                int i13 = 1487835734 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1179122367 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (24338057 ^ i2)) {
                                    int i14 = 1678825374 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1735794138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1020398419 ^ i2)) {
                                        int i15 = 1876190460 ^ i2;
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

    public void playEnterSound(Player player, int i) {
        int i2 = 1208873339 ^ (309643546 ^ 1301179784);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1078284472) {
            int i3 = 586948031 ^ i2;
            if (this.enterRegionSound == null) {
                hxzvmuenzlaieroy(i3, 1456019946);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1470479695) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1470479695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1558455853 ^ i3)) {
                        break;
                    }
                }
                int i4 = 270894249 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 179216086 ^ i3;
            player.playSound(player.getLocation(), this.enterRegionSound, 1.0f, this.enterRegionPitch);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -47270911) {
                int i5 = 1550288700 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1078284472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2099157250 ^ i2)) {
                int i6 = 2127310848 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -47270911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (202054284 ^ i2)) {
                    int i7 = 869102823 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 504532451 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (247836047 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1250456196 ^ i2;
        throw new IOException();
    }

    public void playCountdownSound(Player player, int i) {
        int i2 = 756545767 ^ (17580707 ^ 1301179784);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 212778595) {
            i2 = 1383578098 ^ i2;
            if (this.countdownSound != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1626115599) {
                    i2 = 204651826 ^ i2;
                    player.playSound(player.getLocation(), this.countdownSound, 1.0f, this.countdownPitch);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -24733599) {
                        int i3 = 427356187 ^ i2;
                        return;
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 75925114:
                        int i4 = 357190953 ^ i2;
                        return;
                    case 638020024:
                        return;
                    case 1552740462:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 212778595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1975653765 ^ i2)) {
                int i5 = 407371510 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -24733599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1963798473 ^ i2)) {
                    int i6 = 1770247425 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893458617 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (32150667 ^ i2)) {
                        int i7 = 257569962 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1626115599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (80732633 ^ i2)) {
                            int i8 = 259493838 ^ i2;
                            throw new IllegalAccessException();
                        }
                    }
                }
            }
        }
    }

    public void playExitSound(Player player, int i) {
        int i2 = 101534996 ^ (1036579008 ^ 1301179784);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1302428957) {
            i2 = 1876616992 ^ i2;
            if (this.exitRegionSound == null) {
                int i3 = 971265183 ^ i2;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -863388704) {
                int i4 = 636608810 ^ i2;
                player.playSound(player.getLocation(), this.exitRegionSound, 1.0f, this.exitRegionPitch);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -486100303) {
                    int i5 = 471184821 ^ i4;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -486100303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1410709074 ^ i4)) {
                        break;
                    }
                }
                int i6 = 388792270 ^ i4;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 61546265 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (915474047 ^ i2)) {
                int i7 = 956729759 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1302428957 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1081322727 ^ i2)) {
                    int i8 = 1771981445 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -863388704 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (408847057 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i9 = 1199477423 ^ i2;
        throw new IllegalAccessException();
    }

    public void playTeleportedSound(Player player, int i) {
        int i2 = 444450977 ^ (1471762904 ^ 1301179784);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 39298952) {
            i2 = 632646955 ^ i2;
            if (this.teleportedSound != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 805097169) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 685325048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1290502817 ^ i2)) {
                            int i3 = 1074073145 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 805097169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (468732426 ^ i2)) {
                                break;
                            }
                        }
                    }
                    int i4 = 631521326 ^ i2;
                    throw new RuntimeException();
                }
                int i5 = 1025154212 ^ i2;
                player.playSound(player.getLocation(), this.teleportedSound, 1.0f, this.teleportedPitch);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -953668624) {
                    int i6 = 503194145 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -953668624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1780969916 ^ i5)) {
                        break;
                    }
                }
                int i7 = 1667538455 ^ i5;
                throw new RuntimeException("double");
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 155714803:
                        return;
                    case 161423337:
                        int i8 = 551861893 ^ i2;
                        return;
                    case 1238154070:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 39298952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (625217719 ^ i2)) {
                int i9 = 1477426763 ^ i2;
                throw new IOException("double");
            }
        }
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
        isvYkR2uK4 = 2056600491 ^ new Random(7585671828066769844L).nextInt();
    }

    public static String cedfhvlykv(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] hpcvosftjkvinii() {
        return new byte[]{106, 110, 55, 25};
    }

    private static byte[] izbpnsmbngvuyur() {
        return new byte[]{-91, -89, 15, 82, 95, 56, 1, 93, 93, 53, 6, 75, 82, 37, 2, 14, 92, 58, 0, 66, 91, 44, 15, 68, 95, 37, 1, 119, 93, 41, 6, 74, 82, 49, 2, 73, 92, 48, 0, 66, 91, 118, 15, 82, 95, 56, 1, 93, 93, 53, 6, 75};
    }

    private static byte[] wznufebpbddexje() {
        return new byte[]{-91, -89, 15, 99, 95, 27, 1, 103, 93, 24, 6, 100, 82, 9, 2, 98, 92, 26, 0, 109, 91, 27, 15, 110, 95, 25, 1, 119, 93, 11, 6, 96, 82, 1, 2, 101, 92, 13, 0, 115, 91, 11, 15, 100, 95, 27, 1, 109, 93, 24, 6, 123};
    }

    private static byte[] oelajofkdoksrsd() {
        return new byte[]{-94, -90, 2, 94, 82, 53, 1, 93, 92, 54, 0, 72, 94, 37, 3, 1, 91, 61, 1, 86, 95, 51, 15, 89, 92, 0, 1, 93, 93, 62, 3, 70, 94, 49, 6, 64, 92, 55, 2, 3, 82, 42, 1, 65, 92, 44, 0, 79, 94, 62};
    }

    private static byte[] qbexddufqgbyrys() {
        return new byte[]{-83, -90, 14, 89, 95, 49, 1, 84, 95, 57, 0, 68, 89, 40, 7, 1, 82, 62, 14, 64, 83, 41, 2, 76, 92, 36, 2, Byte.MAX_VALUE, 93, 37, 4, 73, 90, 63, 15, 69, 83, 54, 14, 68, 95, 112, 1, 81, 95, 62, 0, 84, 89, 56, 7, 71};
    }

    private static byte[] rvdxdgbnlijrgum() {
        return new byte[]{-91, -87, 15, 82, 93, 53, 7, 92, 83, 50, 6, 69, 82, 37, 0, 3, 90, 61, 14, 68, 91, 35, 15, 79, 93, 46, 7, 77, 83, 51, 6, 86, 82, 56, 0, 3, 90, 46, 14, 66, 91, 34, 15, 66, 93, 50};
    }

    private static byte[] uvnkbyhdychcnmr() {
        return new byte[]{-91, -90, 4, 90, 92, 49, 15, 88, 82, 57, 6, 74, 89, 45, 1, 7, 82, 46, 15, 69, 91, 53, 4, 76, 92, 46, 15, 66, 82, 37, 6, 90, 89, 59, 1, 77, 82, 116, 15, 83, 91, 54, 4, 92, 92, 48, 15, 73};
    }

    private static byte[] zaaclwjwbobutws() {
        return new byte[]{-91, -90, 4, 107, 92, 18, 15, 98, 82, 20, 6, 101, 89, 1, 1, 108, 82, 20, 15, 100, 91, 6, 4, 110, 92, 31, 15, 121, 82, 18, 6, 121, 89, 31, 1, 112, 82, 5, 15, 115, 91, 9, 4, 104, 92, 9, 15, 99};
    }

    private static byte[] rxxiywnhoepgylu() {
        return new byte[]{-96, -95, 6, 94, 93, 52, 15, 92, 83, 52, 7, 76, 94, 42, 2, 15, 90, 52, 3, 70, 91, 47, 0, 66, 82, 42, 14, 73, 90, 48, 3, 89, 95, 56, 7, 14, 94, 45, 6, 66, 93, 46, 15, 71, 83, 62};
    }

    private static byte[] ktvrryelruwnyfp() {
        return new byte[]{-96, -95, 6, 111, 93, 23, 15, 102, 83, 25, 7, 99, 94, 6, 2, 99, 90, 18, 3, 104, 91, 25, 0, 99, 82, 16, 14, 114, 90, 30, 3, 99, 95, 20, 7, 105, 94, 27, 6, 99, 93, 15};
    }

    private static byte[] icwrsuclaoblwzg() {
        return new byte[]{-91, -95, 1, 119, 95, 13, 14, 92, 83, 46, 6, 115, 92, 52, 2, 70, 83, 58, 14, 116, 91, 126, 1, 101, 95, 49, 14, 94, 83, 63, 6, 69, 92, 50, 2, 76, 83, Byte.MAX_VALUE, 14, 90, 91, 49, 1, 89, 95, 49, 14, 76, 83, 126, 6, 90, 92, 43, 2, 77, 83, 60, 14, 64, 91, 56, 1, 69, 95, 58, 14, 76, 83, 126, 6, 64, 92, 53, 2, 8, 83, 60, 14, 70, 91, 48, 1, 74, 95, 54, 14, 79, 83, 112, 6, 80, 92, 54, 2, 68, 83, 126, 14, 9, 91, 13, 1, 67, 95, 50, 14, 77, 83, 126, 6, 90, 92, 52, 2, 93, 83, 49, 14, 77, 91, 45, 1, 12, 95, 50, 14, 73, 83, 39, 6, 9, 92, 53, 2, 71, 83, 43, 14, 9, 91, 46, 1, 64, 95, 62, 14, 81, 83, 112};
    }

    private static byte[] gvvetfmlsovumwu() {
        return new byte[]{-91, -96, 0, 95, 92, 52, 5, 85, 94, 51, 6, 76, 93, 40, 1, 2, 88, 50, 3, 82, 91, 54, 0, 88, 92, 4, 5, 82, 94, 56, 6, 79, 93, 50, 1, 67, 88, 57, 3, 4, 91, 44, 0, 67, 92, 46, 5, 78, 94, 57};
    }

    private static byte[] dkccweehdwxekda() {
        return new byte[]{-91, -96, 0, 110, 92, 23, 5, 111, 94, 30, 6, 99, 93, 4, 1, 110, 88, 18, 3, 107, 91, 28, 0, 99, 92, 21, 5, Byte.MAX_VALUE, 94, 25, 6, 109, 93, 26, 1, 111, 88, 3, 3, 99, 91, 9, 0, 109, 92, 15, 5, 101};
    }

    private static byte[] pvtgzskjeqxhpyz() {
        return new byte[]{-91, -94, 14, 94, 82, 49, 0, 94, 92, 52, 6, 78, 83, 41, 15, 7, 93, 40, 1, 72, 91, 49, 14, 72, 82, 46, 0, 68, 92, 40, 6, 94, 83, 63, 15, 77, 93, 114, 1, 93, 91, 52, 14, 89, 82, 61, 0, 67};
    }

    private static int hxzvmuenzlaieroy(int i, int i2) {
        return i ^ i2;
    }
}
