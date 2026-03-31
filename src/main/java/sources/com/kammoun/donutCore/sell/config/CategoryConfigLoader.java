package com.kammoun.donutCore.sell.config;

import com.kammoun.donutCore.sell.model.SellCategory;
import com.kammoun.donutCore.sell.service.Enums.Category;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class CategoryConfigLoader {
    private final JavaPlugin plugin;
    private final Map<Category, SellCategory> categories;
    private static int BoSfs2JtIM = 0;
    private transient int SvXJQXpvnF = 193318795;
    private static String xlzlksudsd;
    private static String[] nothing_to_see_here = new String[18];

    public CategoryConfigLoader(JavaPlugin javaPlugin, int i) {
        int i2 = 361533966 ^ 1961831158;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 212948739:
                    int i3 = 1075197892 ^ i2;
                    break;
                case 753965098:
                case 832429848:
                    break;
                case 1070787535:
                default:
                    throw new IllegalAccessException();
            }
        }
        int parseInt = 2103503309 ^ (947150356 ^ Integer.parseInt("1684093157"));
        this.SvXJQXpvnF = 193318795 ^ BoSfs2JtIM;
        this.plugin = javaPlugin;
        this.categories = new HashMap();
        loadCategories(1317683536);
        int i4 = 496383404 ^ (836686551 ^ (1649826334 ^ (2096681432 ^ (1665725914 ^ parseInt))));
    }

    private void loadCategories(int i) {
        int i2 = 2099367837 ^ (1611875350 ^ 1143286568);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -927136486) {
            i2 = 1992992246 ^ i2;
            this.categories.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2129144489) {
                int i3 = 923912882 ^ i2;
                Category[] values = Category.values();
                int length = values.length;
                int i4 = (byte) (416075751 ^ i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -966361288) {
                    int i5 = 863610733 ^ i3;
                    while (true) {
                        i2 = i5;
                        if (i4 >= length) {
                            int i6 = 1213327429 ^ i2;
                            return;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1571505233) {
                            i2 = 683707307 ^ i2;
                            Category category = values[i4];
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 464460040) {
                                i3 = 679549513 ^ i2;
                                String str = category.name().toLowerCase() + ".yml";
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1604832065) {
                                    int i7 = 156743670 ^ i3;
                                    File file = new File(this.plugin.getDataFolder(), "Sell/Gui's/Multiplier/" + str);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 354055409) {
                                        i2 = 620090706 ^ i7;
                                        YamlConfiguration loadConfiguration = YamlConfiguration.loadConfiguration(file);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 850714208) {
                                            i2 = 1299616986 ^ i2;
                                            this.categories.put(category, SellCategory.fromConfig(category, loadConfiguration, 196557442));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1493203122) {
                                                i2 = 890261811 ^ i2;
                                                i4 += 2117099044 ^ i2;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -243076821) {
                                                    int i8 = 1007464076 ^ i2;
                                                    try {
                                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) == 5656699) {
                                                            throw new RuntimeException();
                                                        }
                                                        throw null;
                                                    } catch (RuntimeException e) {
                                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                            case 300385610:
                                                                i3 = 1900064655 ^ i8;
                                                                break;
                                                            case 581223291:
                                                                i3 = 1462290249 ^ i8;
                                                                break;
                                                            default:
                                                                throw new IllegalAccessException("Error in hash");
                                                        }
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1679623887) {
                                                            i5 = pmdanstkfjrxatdm(i3, 415840172);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 354055409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1444949680 ^ i7)) {
                                                int i9 = 2030911635 ^ i7;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1679623887 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (847139096 ^ i3)) {
                        int i10 = 1611724928 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -966361288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1893952351 ^ i3)) {
                            int i11 = 1997362468 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1604832065 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (461602296 ^ i3)) {
                                int i12 = 558070384 ^ i3;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -927136486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (983099589 ^ i2)) {
                int i13 = 1052192002 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2129144489 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (187496266 ^ i2)) {
                    int i14 = 439231174 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 850714208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (873547290 ^ i2)) {
                        int i15 = 2060359091 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1493203122 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (125381359 ^ i2)) {
                            int i16 = 858353376 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1571505233 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1177261017 ^ i2)) {
                                int i17 = 511704190 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -243076821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (673256987 ^ i2)) {
                                    int i18 = 937334121 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 464460040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1487984802 ^ i2)) {
                                        int i19 = 1913228889 ^ i2;
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

    public SellCategory getCategory(Category category, int i) {
        int i2 = 352869926 ^ (690603164 ^ 1143286568);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1071281005) {
            int i3 = 1901990350 ^ i2;
            return this.categories.get(category);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1255473888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (164587965 ^ i2)) {
                int i4 = 939261472 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1071281005 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2098154490 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 437555501 ^ i2;
        throw new RuntimeException();
    }

    public SellCategory getCategoryForItem(Material material, int i) {
        int i2 = 1644880074 ^ (226399361 ^ 1143286568);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1519057689) {
            int i3 = 1395418577 ^ i2;
            Iterator<SellCategory> it = this.categories.values().iterator();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1008085613) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1008085613 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1166106080 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1719911559 ^ i3;
                throw new IllegalAccessException("double");
            }
            int i5 = 1148229791;
            while (true) {
                int i6 = i5 ^ i3;
                if (it.hasNext() == (1007526445 ^ i6)) {
                    pmdanstkfjrxatdm(i6, 768700521);
                    return null;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -529723031) {
                    int i7 = 374060329 ^ i6;
                    SellCategory next = it.next();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1378924577) {
                        i2 = 753407819 ^ i7;
                        if (next.getAllowedItems(682220414).containsKey(material) == (112066639 ^ i2)) {
                            int pmdanstkfjrxatdm = pmdanstkfjrxatdm(i2, 463183769);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmdanstkfjrxatdm) == -374538576) {
                                int pmdanstkfjrxatdm2 = pmdanstkfjrxatdm(pmdanstkfjrxatdm, 659770206);
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(pmdanstkfjrxatdm2) != 19333537) {
                                        throw null;
                                    }
                                    throw new IllegalAccessException();
                                } catch (IllegalAccessException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -751393727:
                                            i3 = pmdanstkfjrxatdm(pmdanstkfjrxatdm2, 409684518);
                                            break;
                                        case -279353645:
                                            i3 = pmdanstkfjrxatdm(pmdanstkfjrxatdm2, 1608954484);
                                            break;
                                        default:
                                            throw new IllegalAccessException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 275576177) {
                                        i5 = 503331971;
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 275576177 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1791978984 ^ i3)) {
                                                int i8 = 1921037129 ^ i3;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmdanstkfjrxatdm) == -374538576 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(pmdanstkfjrxatdm) == (1217690840 ^ pmdanstkfjrxatdm)) {
                                        int i9 = 1361944901 ^ pmdanstkfjrxatdm;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 896533112) {
                            int i10 = 683915588 ^ i2;
                            return next;
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1378924577 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (614093729 ^ i7)) {
                                int i11 = 634404430 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1897491936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (110268307 ^ i7)) {
                                    int i12 = 670509529 ^ i7;
                                    throw new IOException("double");
                                }
                            }
                        }
                    }
                } else {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -529723031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1347030245 ^ i6)) {
                            int i13 = 266890805 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -751393727 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1942933687 ^ i6)) {
                                int i14 = 3721847 ^ i6;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 896533112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (127261390 ^ i2)) {
                int i15 = 430156212 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1519057689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (167507371 ^ i2)) {
                    int i16 = 393585642 ^ i2;
                    throw new RuntimeException("double");
                }
            }
        }
    }

    public double getMaterialPrice(Material material, int i) {
        int i2 = 892580597 ^ (189492700 ^ 1143286568);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -756047861) {
            int i3 = 1323737345 ^ i2;
            SellCategory categoryForItem = getCategoryForItem(material, 704769776);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1512396799) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1218961089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1079425292 ^ i3)) {
                        int i4 = 1954934660 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1512396799 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1432038077 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 825405499 ^ i3;
                throw new IOException("double");
            }
            i2 = 479562895 ^ i3;
            if (categoryForItem != null) {
                int i6 = 20587095 ^ i2;
                return categoryForItem.getPrice(material, 1510155842);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1098304633) {
                int i7 = 1497544643 ^ i2;
                return 0.0d;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1956416925 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (425497029 ^ i2)) {
                int i8 = 145660895 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1098304633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (913410842 ^ i2)) {
                    int i9 = 184604858 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -756047861 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1723016910 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i10 = 1641007988 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Map getCategories(int i) {
        int i2 = 702036083 ^ (334481033 ^ 1143286568);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -258560365) {
            int i3 = 142949524 ^ i2;
            return this.categories;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -258560365 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1664050507 ^ i2)) {
                int i4 = 1970986828 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1262532045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (488685676 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1676643560 ^ i2;
        throw new RuntimeException();
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
        xlzlksudsd = ByteBuffer.wrap(bzkwofgixyjjzxx()).asCharBuffer().toString();
        BoSfs2JtIM = 1072893142 ^ new Random(-7239994059728786599L).nextInt();
    }

    public static String juhwxwlrva(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = xlzlksudsd.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] bzkwofgixyjjzxx() {
        return new byte[0];
    }

    private static int pmdanstkfjrxatdm(int i, int i2) {
        return i ^ i2;
    }
}
