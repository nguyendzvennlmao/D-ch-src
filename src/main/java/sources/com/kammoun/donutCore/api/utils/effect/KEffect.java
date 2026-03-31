package com.kammoun.donutCore.api.utils.effect;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Random;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class KEffect {
    private final PotionEffectType type;
    private int duration;
    private int amplifier;
    private boolean ambient;
    private boolean particles;
    private static int MgrnbKVfGD = 0;
    private transient int g2fvYk9k7B = 475137602;
    private static byte[] odlqfmqyys;
    private static String[] nothing_to_see_here = new String[13];

    public KEffect(@NotNull PotionEffectType potionEffectType, int i) {
        irbbfqrzgadclvev(1219866137 ^ 529610866, 1431036455);
        int parseInt = 731802690 ^ (950219998 ^ Integer.parseInt("290598096"));
        this.g2fvYk9k7B = 475137602 ^ MgrnbKVfGD;
        int irbbfqrzgadclvev = 1189902002 ^ irbbfqrzgadclvev(parseInt, 2043369094);
        this.type = potionEffectType;
        this.duration = 30;
        this.amplifier = 0;
        this.ambient = false;
        this.particles = true;
        int i2 = 829123798 ^ (1064467213 ^ (658031595 ^ (616714199 ^ (1136343010 ^ irbbfqrzgadclvev))));
    }

    public void duration(int i, int i2) {
        int i3 = 656644004 ^ (78571308 ^ 1772945711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1359187258) {
            i3 = 1990511416 ^ i3;
            this.duration = i;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -467282695) {
                int i4 = 2113407734 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -467282695 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (765908856 ^ i3)) {
                int i5 = 1769475330 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1359187258 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2134095749 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 347784994 ^ i3;
        throw new IOException();
    }

    public void amplifier(int i, int i2) {
        int i3 = 1744666042 ^ (1138746857 ^ 1772945711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1820117986) {
            i3 = 1999304746 ^ i3;
            this.amplifier = i;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -718599503) {
                int i4 = 1676156505 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -718599503 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (81200396 ^ i3)) {
                int i5 = 2063537627 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1820117986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (905837961 ^ i3)) {
                    break;
                }
            }
        }
        int i6 = 2143632445 ^ i3;
        throw new IOException();
    }

    public void ambient(boolean z, int i) {
        int i2 = 1204377205 ^ (344110082 ^ 1772945711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -684254527) {
            i2 = 1688947301 ^ i2;
            this.ambient = z;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -227718678) {
                int i3 = 1477442221 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -684254527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1015573791 ^ i2)) {
                int i4 = 552459093 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -227718678 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (552164162 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 700675183 ^ i2;
        throw new IOException();
    }

    public void particles(boolean z, int i) {
        int i2 = 906299158 ^ (2026582144 ^ 1772945711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 991540681) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -118032879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (291578948 ^ i2)) {
                    int i3 = 653292624 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 991540681 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1911711932 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 1901235964 ^ i2;
            throw new RuntimeException();
        }
        int i5 = 1144220984 ^ i2;
        this.particles = z;
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 444783627) {
            int i6 = 1548649795 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 444783627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (714721281 ^ i5)) {
                break;
            }
        }
        int i7 = 1841177173 ^ i5;
        throw new RuntimeException("double");
    }

    public PotionEffect build(int i) {
        int i2 = 396228196 ^ (926122936 ^ 1772945711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1209771930) {
            return new PotionEffect(this.type, this.duration * ((byte) (1755829831 ^ (564437664 ^ i2))), this.amplifier, this.ambient, this.particles);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1161736859 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (364573636 ^ i2)) {
                int i3 = 2067233796 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1209771930 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (784517992 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1286901171 ^ i2;
        throw new IllegalAccessException();
    }

    public void apply(@NotNull Player player) {
        int i = 1241454087 ^ (690605702 ^ 1772945711);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1272892784) {
            i = 1039462383 ^ i;
            player.addPotionEffect(build(1835291769));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1535528439) {
                int i2 = 1898983924 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1535528439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1272244976 ^ i)) {
                int i3 = 1140802160 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 771243434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (588864018 ^ i)) {
                    int i4 = 823575548 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1272892784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1871549715 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1586387455 ^ i;
        throw new IOException();
    }

    public static void clearAll(@NotNull Player player) {
        int i = 2139268565 ^ (1555582692 ^ 1979647853);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1238408478) {
            i = 469239936 ^ i;
            Iterator it = player.getActivePotionEffects().iterator();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1777280738) {
                i = 1687197243 ^ i;
                while (it.hasNext() != (699232999 ^ i)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1298896697) {
                        i = 1533501390 ^ i;
                        PotionEffect potionEffect = (PotionEffect) it.next();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1773049525) {
                            i = 591005775 ^ i;
                            player.removePotionEffect(potionEffect.getType());
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1887360206) {
                                int i2 = 453353192 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1471011954) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1471011954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1642583734 ^ i2)) {
                                            int i3 = 2106951780 ^ i2;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                                while (true) {
                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                        case 20730262:
                                            i2 = 171691314 ^ i2;
                                            break;
                                        case 769869580:
                                            break;
                                        case 2033328073:
                                    }
                                }
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2) == 227559106) {
                                        throw new IllegalAccessException();
                                    }
                                    throw null;
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case 108246498:
                                            i = 1323164391 ^ i2;
                                            break;
                                        case 1200742867:
                                            i = 1726064737 ^ i2;
                                            break;
                                        default:
                                            throw new IOException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1889313496) {
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i)) {
                                            case 189129059:
                                                i = 666822332 ^ i;
                                                break;
                                            case 629134345:
                                            case 1778892532:
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i4 = 1948228235 ^ i;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1777280738 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1299235069 ^ i)) {
                    int i5 = 357950822 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1889313496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1562498178 ^ i)) {
                        int i6 = 1948932449 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 108246498 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (298423686 ^ i)) {
                            int i7 = 1369869268 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1200742867 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1302027626 ^ i)) {
                                int i8 = 1990267501 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1773049525 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (664408377 ^ i)) {
                                    int i9 = 1121053275 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -308853918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1718753538 ^ i)) {
                                        int i10 = 297763704 ^ i;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1887360206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (486941267 ^ i)) {
                                            int i11 = 1063502475 ^ i;
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
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1238408478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1697123792 ^ i)) {
                int i12 = 465301188 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1298896697 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (983035723 ^ i)) {
                    int i13 = 343341468 ^ i;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    public static KEffect fromConfig(@NotNull ConfigurationSection configurationSection) {
        int i = 661945912 ^ (1321540831 ^ 1979647853);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -495768496) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -495768496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1140304388 ^ i)) {
                    break;
                }
            }
            int i2 = 1154810039 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 2058206004 ^ i;
        PotionEffectType byName = PotionEffectType.getByName(configurationSection.getString(oibtqemgop(iciqkipzqwcfdsl(), i3), oibtqemgop(unymguwsbpdmsgq(), i3)));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 924775923) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 924775923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1764890819 ^ i3)) {
                    break;
                }
            }
            int i4 = 960573796 ^ i3;
            throw new IOException("double");
        }
        int i5 = 1757749280 ^ i3;
        if (byName == null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1899492592) {
                int i6 = 1271972550 ^ i5;
                return null;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1899492592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (467290188 ^ i5)) {
                    break;
                }
            }
            int i7 = 376237322 ^ i5;
            throw new RuntimeException("double");
        }
        int i8 = 1667986898 ^ i5;
        KEffect kEffect = new KEffect(byName, 881055570);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1785485923) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1785485923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1924392118 ^ i8)) {
                    break;
                }
            }
            int i9 = 253050505 ^ i8;
            throw new IOException("double");
        }
        int i10 = 162897598 ^ i8;
        kEffect.duration(configurationSection.getInt(oibtqemgop(wekhkwyddyagrby(), i10), (byte) (1693980140 ^ i10)), 1998706863);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 666939283) {
            i10 = 452743279 ^ i10;
            kEffect.amplifier(configurationSection.getInt(oibtqemgop(ecgkvougdqaiyqn(), i10), (byte) (2114209181 ^ i10)), 985464860);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -266195733) {
                i10 = 1636449914 ^ i10;
                kEffect.ambient(configurationSection.getBoolean(oibtqemgop(umghgdyyvvgqgev(), i10), (byte) (529431527 ^ i10)), 819124450);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -59515080) {
                    i10 = 1622955603 ^ i10;
                    kEffect.particles(configurationSection.getBoolean(oibtqemgop(pqdigncltqnlyrg(), i10), (byte) (2133994933 ^ i10)), 880632930);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -107909725) {
                        int i11 = 199861684 ^ i10;
                        return kEffect;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 666939283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (2098516345 ^ i10)) {
                int i12 = 1057916291 ^ i10;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -107909725 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (619358903 ^ i10)) {
                    int i13 = 392612610 ^ i10;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1495515133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (176610584 ^ i10)) {
                        int i14 = 1953440564 ^ i10;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 800187074 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1625823540 ^ i10)) {
                            int i15 = 1908786014 ^ i10;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -266195733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1398175046 ^ i10)) {
                                int i16 = 135759726 ^ i10;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -59515080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (863641372 ^ i10)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i17 = 2047328248 ^ i10;
        throw new IOException();
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
        odlqfmqyys = rlacstxoenujzbu();
        MgrnbKVfGD = 1769546435 ^ new Random(-7085001744706801364L).nextInt();
    }

    public static String oibtqemgop(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ odlqfmqyys[i3 % odlqfmqyys.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] rlacstxoenujzbu() {
        return new byte[]{75, 29, 74, 34, 104, 41, 122, 12, 117, 80, 20, 20, 20, 38, 120, 21, 54, 56, 65, 79, 38, 74, 9, 64, 66, 85, 118, 78, 57, 91, 13, 71, 75, 94, 24, 43, 78, 88, 58, 8, 34, 78, 71, 37, 98, 124, 50, 62, 28, 35, 81, 35, 53, 57, 34, 15, 58, 121, 51, 70, 31, 93, 84, 13, 29, 6, 68, Byte.MAX_VALUE, 108, 107, 38, 26, 58, 69, 13, 55, 87, 28, 90, 73, 41, 92, 36, 82, 68, 32, 21, 15, 37, 10, 116, 28, 73, 20, 62, 6, 69, 60};
    }

    private static byte[] umghgdyyvvgqgev() {
        return new byte[]{Byte.MIN_VALUE, -48, 115, 119, 91, 117, 79, 92, 66, 12, 38, 72, 32, 123, 73, 84};
    }

    private static byte[] ecgkvougdqaiyqn() {
        return new byte[]{-121, -45, 123, 119, 90, 116, 67, 77, 77, 13, 38, 76, 37, 116, 74, 76, 15, 108, 121, 12};
    }

    private static byte[] pqdigncltqnlyrg() {
        return new byte[]{-121, -45, 121, 97, 81, 113, 78, 71, 70, 22, 38, 76, 39, 118, 65, 64, 2, 100, 114, 14};
    }

    private static byte[] wekhkwyddyagrby() {
        return new byte[]{-124, -44, 115, 117, 81, 100, 74, 79, 65, 7, 37, 86, 45, 124, 65, 66, 6, 103};
    }

    private static byte[] iciqkipzqwcfdsl() {
        return new byte[]{-124, -43, 120, 96, 90, 96, 67, 75, 71, 3};
    }

    private static byte[] unymguwsbpdmsgq() {
        return new byte[0];
    }

    private static int irbbfqrzgadclvev(int i, int i2) {
        return i ^ i2;
    }
}
