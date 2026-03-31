package com.kammoun.donutCore.api.configuration;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Generated;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class KConfigLoader {
    protected final JavaPlugin plugin;
    private final File file;
    private final String fileName;
    protected FileConfiguration config;
    private static int PO9oNLDfz9 = 0;

    private transient int f14CnjlqBHpT = 966134965;
    private static String[] nothing_to_see_here = new String[15];

    public KConfigLoader(JavaPlugin javaPlugin, String str, int i) {
        int i2 = 1443803894 ^ 1768805746;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 181446636:
                    int i3 = 1244564708 ^ i2;
                    break;
                case 1457839116:
                case 1970344317:
                default:
                    throw new IOException();
                case 2121481776:
                    break;
            }
        }
        int parseInt = 359411219 ^ (39451491 ^ Integer.parseInt("1652047376"));
        this.f14CnjlqBHpT = 966134965 ^ PO9oNLDfz9;
        this.plugin = javaPlugin;
        this.fileName = str;
        this.file = new File(javaPlugin.getDataFolder(), str);
        load(797630875);
        int i4 = 745596983 ^ (1544365658 ^ (2054359488 ^ (798933975 ^ (322046734 ^ (67333648 ^ parseInt)))));
    }

    public final void load(int i) {
        int i2 = 59223035 ^ (1937611266 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1077595509) {
            i2 = 528581252 ^ i2;
            if (this.file.exists() == (1752769749 ^ i2)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1137256107) {
                    i2 = 1458180783 ^ i2;
                    this.plugin.getDataFolder().mkdirs();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -191253551) {
                        i2 = 1809591168 ^ i2;
                        this.plugin.saveResource(this.fileName, (byte) (1431248378 ^ i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1434914862) {
                            i2 = 1226632518 ^ i2;
                            this.config = YamlConfiguration.loadConfiguration(this.file);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -492861984) {
                                int i3 = 1343962792 ^ i2;
                                return;
                            }
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 174776101:
                        i2 = 1948963945 ^ i2;
                        break;
                    case 1377819328:
                        break;
                    case 1795176740:
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1137256107 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1581391655 ^ i2)) {
                int i4 = 1139960494 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -191253551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (418224011 ^ i2)) {
                    int i5 = 699925001 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -492861984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1328417163 ^ i2)) {
                        int i6 = 1375734990 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1434914862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1712079031 ^ i2)) {
                            int i7 = 940710004 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1077595509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1387952254 ^ i2)) {
                                int i8 = 1819100611 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1648783522 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1394677917 ^ i2)) {
                                    int i9 = 773049405 ^ i2;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void save() {
        int i = 1556358998 ^ (1056115277 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 699258267) {
            ?? r0 = 1268941776 ^ i;
            i = r0;
            try {
                this.config.save(this.file);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1958333209) {
                    i = 1622171394 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1899705098) {
                        int egnytqjeqxcquhhn = egnytqjeqxcquhhn(i, 1855435740);
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(egnytqjeqxcquhhn) == 257343150) {
                                throw new IOException();
                            }
                            throw null;
                        } catch (IOException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -1823993613:
                                    i = egnytqjeqxcquhhn(egnytqjeqxcquhhn, 1145084221);
                                    break;
                                case 92712425:
                                    i = egnytqjeqxcquhhn(egnytqjeqxcquhhn, 379145886);
                                    break;
                                default:
                                    throw new IllegalAccessException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1320363751) {
                                int i2 = 1836162332 ^ i;
                                return;
                            }
                        }
                    }
                }
            } catch (IOException e2) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                    case 1958333209:
                        i = egnytqjeqxcquhhn(i, 1050441791);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2141582624) {
                            i = 1995358435 ^ i;
                            this.plugin.getLogger().severe("Could not save config file: " + this.fileName);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 925634043) {
                                int i3 = 1691264911 ^ i;
                                r0.printStackTrace();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 291058048) {
                                    int i4 = 1500717071 ^ i3;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 291058048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1686027829 ^ i3)) {
                                        int i5 = 767715686 ^ i3;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        throw new IllegalAccessException("Error in hash");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2141582624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1586904387 ^ i)) {
                    int i6 = 1881817859 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 925634043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (743055410 ^ i)) {
                        int i7 = 412962103 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1958333209 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1333976634 ^ i)) {
                            int i8 = 210870171 ^ i;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -624938502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1040845812 ^ i)) {
                int i9 = 241842702 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1899705098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (225939769 ^ i)) {
                    int i10 = 24919520 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1320363751 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1361860078 ^ i)) {
                        int i11 = 63485618 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1823993613 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (121999506 ^ i)) {
                            int i12 = 713690017 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 699258267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (838351000 ^ i)) {
                                int i13 = 2026544669 ^ i;
                                throw new IllegalAccessException();
                            }
                        }
                    }
                }
            }
        }
    }

    public String getString(String str, int i) {
        int i2 = 1039228705 ^ (1216497227 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1819511277) {
            int i3 = 485577408 ^ i2;
            return this.config.getString(str, "Path not found: " + str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1819511277 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (712625437 ^ i2)) {
                int i4 = 1593613891 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1946607635 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1810657900 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1976154935 ^ i2;
        throw new IllegalAccessException();
    }

    public String getString(String str, String str2) {
        int i = 191529073 ^ (1719059130 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1358342939) {
            int i2 = 1174767451 ^ i;
            return this.config.getString(str, str2);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1624936897 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (878343924 ^ i)) {
                int i3 = 2125306624 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1358342939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1055441849 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 386138788 ^ i;
        throw new RuntimeException();
    }

    public String getFormattedString(String str) {
        int i = 447840002 ^ (1181904582 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -569625758) {
            int i2 = 1946087951 ^ i;
            return ChatFormater.color(getString(str, 1167187963));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1107010329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (590964205 ^ i)) {
                int i3 = 1475756788 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -569625758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1809397617 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 751132777 ^ i;
        throw new IllegalAccessException();
    }

    public int getInt(String str) {
        int i = 175817006 ^ (769608824 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 87611377) {
            return this.config.getInt(str, (byte) (870215957 ^ (326724587 ^ i)));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 87611377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (611251433 ^ i)) {
                int i2 = 378354219 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1628206935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (413556164 ^ i)) {
                    break;
                }
            }
        }
        int i3 = 1576238802 ^ i;
        throw new RuntimeException();
    }

    public boolean getBoolean(String str) {
        int i = 1026303144 ^ (2060966283 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 130765914) {
            return this.config.getBoolean(str, (byte) (137379741 ^ (1221154070 ^ i)));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1099037928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (237956937 ^ i)) {
                int i2 = 772194791 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 130765914 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (485939208 ^ i)) {
                    break;
                }
            }
        }
        int i3 = 1036380269 ^ i;
        throw new IOException();
    }

    public List getStringList(String str, int i) {
        int i2 = 433563257 ^ (1261659451 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1355634862) {
            int i3 = 56340247 ^ i2;
            return this.config.getStringList(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1242570774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (122649128 ^ i2)) {
                int i4 = 9260574 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1355634862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1072723380 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1099993360 ^ i2;
        throw new IllegalAccessException();
    }

    public List<String> getFormattedStringList(String str) {
        int i = 1241789210 ^ (856514716 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -262266509) {
            i = 1537527377 ^ i;
            Stream stream = getStringList(str, 228709628).stream();
            Function function = ChatFormater::color;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 762860537) {
                int i2 = 1309503812 ^ i;
                Stream map = stream.map(function);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1561582043) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1561582043 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (999033729 ^ i2)) {
                            break;
                        }
                    }
                    int i3 = 885576428 ^ i2;
                    throw new IllegalAccessException("double");
                }
                i = 1078631747 ^ i2;
                List<String> list = (List) map.collect(Collectors.toList());
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1598501825) {
                    int i4 = 492869279 ^ i;
                    return list;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 762860537 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (815793703 ^ i)) {
                int i5 = 218107921 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -262266509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1814603628 ^ i)) {
                    int i6 = 2102251028 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1598501825 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1702344031 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i7 = 185074846 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public FileConfiguration getConfig(int i) {
        int i2 = 1236311945 ^ (928058813 ^ 117610408);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -820499229) {
            int i3 = 89677806 ^ i2;
            return this.config;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -438643821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (472125624 ^ i2)) {
                int i4 = 490787240 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -820499229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (581341830 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1057943626 ^ i2;
        throw new RuntimeException();
    }

    static {
        nothing_to_see_here[0] = " ⠁⡼⠋⠀⣆⠀⠀⣰⣿⣫⣾⢿⣿⣿⠍⢠⠠⠀⠀⢀⠰⢾⣺⣻⣿⣿⣿⣷⡀⠀";
        nothing_to_see_here[1] = "⣥⠀⠀⠀⠁⠀⠠⢻⢬⠁⣠⣾⠛⠁⠀⠀⠀⠀⠀⠀⠀⠐⠱⠏⡉⠙⣿⣿⡇⠀";
        nothing_to_see_here[2] = "⢳⠀⢰⡖⠀⠀⠈⠀⣺⢰⣿⢻⣾⣶⣿⣿⣶⣶⣤⣤⣴⣾⣿⣷⣼⡆⢸⣿⣧⠀";
        nothing_to_see_here[3] = "⠈⠀⠜⠈⣀⣔⣦⢨⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣅⣼⠛⢹⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⢋⡿⡿⣯⣭⡟⣟⣿⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡘⠀";
        nothing_to_see_here[5] = "⡀⠐⠀⠀⠀⣿⣯⡿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣉⢽⣿⡆⠀⠀";
        nothing_to_see_here[6] = "⢳⠀⠄⠀⢀⣿⣿⣿⣿⣿⣿⣿⠙⠉⠉⠉⠛⣻⢛⣿⠛⠃⠀⠐⠛⠻⣿⡇⠀⠀";
        nothing_to_see_here[7] = "⣾⠄⠀⠀⢸⣿⣿⡿⠟⠛⠁⢀⠀⢀⡄⣀⣠⣾⣿⣿⡠⣴⣎⣀⣠⣠⣿⡇⠀⠀";
        nothing_to_see_here[8] = "⣧⠀⣴⣄⣽⣿⣿⣿⣶⣶⣖⣶⣬⣾⣿⣾⣿⣿⣿⣿⣽⣿⣿⣿⣿⣿⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⣿⣶⣈⡯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⣹⢧⣿⣿⣿⣄⠙⢿⣿⣿⣿⠇⠀⠀";
        nothing_to_see_here[10] = "⠹⣿⣿⣧⢌⢽⣻⢿⣯⣿⣿⣿⣿⠟⣠⡘⠿⠟⠛⠛⠟⠛⣧⡈⠻⣾⣿⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠈⠉⣷⡿⣽⠶⡾⢿⣿⣿⣿⢃⣤⣿⣷⣤⣤⣄⣄⣠⣼⡿⢷⢀⣿⡏⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⢀⣿⣷⠌⣈⣏⣝⠽⡿⣷⣾⣏⣀⣉⣉⣀⣀⣀⣠⣠⣄⡸⣾⣿⠃⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⣰⡿⣿⣧⡐⠄⠱⣿⣺⣽⢟⣿⣿⢿⣿⣍⠉⢀⣀⣐⣼⣯⡗⠟⡏⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⣰⣿⠀⣿⣿⣴⡀⠂⠘⢹⣭⡂⡚⠿⢿⣿⣿⣿⡿⢿⢿⡿⠿⢁⣴⣿⣷⣶⣦⣤";
        PO9oNLDfz9 = 356152521 ^ new Random(-9015957567540186675L).nextInt();
    }

    public static String rvhcjdhdub(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] iefcehpumeyhhvu() {
        return new byte[]{8, 46, 117, 23, 20, 1, 86, 86, 121, 47, 61, 80, 91, 34, 93, 55, 2, 44, 115, 68, 39, 46, 48, Byte.MAX_VALUE, 46, 122, 45, 73, 52, 71, 3, 79, 126, 113, 76, 18, 47, 122, 49, 10, 27, 31, 68, 62, 56, 24, 83, 113, 55, 1, 38, 15, 34, 92, 2, 94, 59, 16, 114, 110, 84, 52, 114, 79, 66, 47, 67, 67, 14, 26, 56, 19, 86, 10, 45, 104, Byte.MAX_VALUE, 11, 55, Byte.MAX_VALUE, 125, 89, 93, 84, 110, 62, 99, 115, 80, 80};
    }

    private static int egnytqjeqxcquhhn(int i, int i2) {
        return i2 ^ i;
    }
}
