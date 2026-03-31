package com.kammoun.donutCore.core.managers;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandAliasManager {
    private final JavaPlugin plugin;
    private final Map<String, List<String>> aliases;
    private File configFile;
    private FileConfiguration config;
    private static int nNOnjr13B4 = 0;
    private transient int J2GQQ1x3Vg = 2065935240;
    private static String gefxdayblo;
    private static String[] nothing_to_see_here = new String[15];

    public CommandAliasManager(JavaPlugin javaPlugin, int i) {
        msfjdlyppiemsevt(2078649117 ^ 1206973658, 152877288);
        int parseInt = 1816038992 ^ (766047840 ^ Integer.parseInt("1956618015"));
        this.J2GQQ1x3Vg = 2065935240 ^ nNOnjr13B4;
        this.plugin = javaPlugin;
        this.aliases = new HashMap();
        this.configFile = new File(javaPlugin.getDataFolder(), "command-alias.yml");
        loadAliases(1128456444);
        int i2 = 427177897 ^ (59078143 ^ (26552048 ^ (4047117 ^ (475269292 ^ (1592856986 ^ parseInt)))));
    }

    public void loadAliases(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.CommandAliasManager.loadAliases(int):void");
    }

    private void createDefaultConfig(int i) {
        int i2 = 1658057081 ^ (767128047 ^ 471305789);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1679264422) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1679264422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (211765728 ^ i2)) {
                    int i3 = 386743673 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -203722038 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (941404320 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 481801175 ^ i2;
            throw new IOException("double");
        }
        int i5 = 48433955 ^ i2;
        this.config = YamlConfiguration.loadConfiguration(this.configFile);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1930417086) {
            i5 = 10669579 ^ i5;
            this.config.set(egtpqfojfp(mtmeesaboaqtbor(), i5), egtpqfojfp(qwyivdwacuknmsv(), i5));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1981391846) {
                int i6 = 705644711 ^ i5;
                saveConfig(1180629620);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -644081373) {
                    int i7 = 625536381 ^ i6;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -644081373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (289220686 ^ i6)) {
                        break;
                    }
                }
                int i8 = 1706882599 ^ i6;
                throw new IllegalAccessException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1981391846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (137848647 ^ i5)) {
                int i9 = 1393874358 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1930417086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1547285196 ^ i5)) {
                    break;
                }
            }
        }
        int i10 = 1846538839 ^ i5;
        throw new RuntimeException();
    }

    public void saveConfig(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.CommandAliasManager.saveConfig(int):void");
    }

    public List getCommands(String str, int i) {
        int i2 = 1982740124 ^ (1074198117 ^ 471305789);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1375368737) {
            int i3 = 187801873 ^ i2;
            return this.aliases.get(str.toLowerCase());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 142048937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1486779232 ^ i2)) {
                int i4 = 2103791049 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1375368737 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1387304296 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1678768676 ^ i2;
        throw new RuntimeException();
    }

    public boolean hasAlias(String str, int i) {
        int i2 = 315932541 ^ (1732489085 ^ 471305789);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1275392491) {
            int i3 = 2087155468 ^ i2;
            return this.aliases.containsKey(str.toLowerCase());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1354806904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (156161584 ^ i2)) {
                int i4 = 1463580018 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1275392491 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (105726804 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 544924268 ^ i2;
        throw new RuntimeException();
    }

    public void addAlias(java.lang.String r6, java.util.List<java.lang.String> r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.managers.CommandAliasManager.addAlias(java.lang.String, java.util.List):void");
    }

    public boolean removeAlias(String str) {
        int i = 1066884126 ^ (367289661 ^ 471305789);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1289373455) {
            int i2 = 697492682 ^ i;
            if (this.aliases.remove(str.toLowerCase()) == null) {
                return (byte) (1690134175 ^ msfjdlyppiemsevt(i2, 2068526411));
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -5071200) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -5071200 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1470738924 ^ i2)) {
                        break;
                    }
                }
                int i3 = 1427438879 ^ i2;
                throw new IOException("double");
            }
            i = 180116973 ^ i2;
            this.config.set("aliases." + str.toLowerCase(), (Object) null);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1437568568) {
                i = 805016863 ^ i;
                saveConfig(1180629620);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -712189647) {
                    return (byte) (331835520 ^ (695661479 ^ i));
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1640283128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1755409524 ^ i)) {
                int i4 = 970334745 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1437568568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1229620861 ^ i)) {
                    int i5 = 1354975079 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -712189647 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (613259148 ^ i)) {
                        int i6 = 16602068 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1289373455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1405360815 ^ i)) {
                            break;
                        }
                    }
                }
            }
        }
        int i7 = 2086892567 ^ i;
        throw new RuntimeException();
    }

    public Set<String> getAllAliases() {
        int i = 1175023869 ^ (1575431327 ^ 471305789);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1070502648) {
            int i2 = 563066172 ^ i;
            return new HashSet(this.aliases.keySet());
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 867384089 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1117597328 ^ i)) {
                int i3 = 1574173572 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1070502648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (346895789 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 8341434 ^ i;
        throw new IOException();
    }

    public void reload() {
        int i = 1548606902 ^ (2086488874 ^ 471305789);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -533150455) {
            i = 560691873 ^ i;
            loadAliases(1128456444);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -345829376) {
                int i2 = 397906230 ^ i;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -533150455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1280146586 ^ i)) {
                int i3 = 294423886 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1457494448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (587984112 ^ i)) {
                    int i4 = 1570595750 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -345829376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (454044527 ^ i)) {
                        break;
                    }
                }
            }
        }
        int i5 = 1434452490 ^ i;
        throw new IOException();
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
        gefxdayblo = ByteBuffer.wrap(gidraiieazyuggy()).asCharBuffer().toString();
        nNOnjr13B4 = 1749369480 ^ new Random(4883346405065572469L).nextInt();
    }

    public static String egtpqfojfp(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = gefxdayblo.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] muhrvphgmpmalqo() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 0};
    }

    private static byte[] amkzgefvntuiceq() {
        return new byte[]{0, 0, 0, 34, 0, 0, 0, 7};
    }

    private static byte[] mtmeesaboaqtbor() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 41};
    }

    private static byte[] qwyivdwacuknmsv() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 55};
    }

    private static byte[] qvfjwhanacuhgtu() {
        return new byte[]{0, 0, 0, 32, 0, 0, 0, 65};
    }

    private static byte[] gidraiieazyuggy() {
        return new byte[]{49, 89, 55, 89, 49, 92, 51, 80, 49, 66, 49, 93, 55, 70, 50, 115, 50, 88, 55, 65, 51, 95, 55, 92, 50, 16, 50, 89, 55, 91, 51, 71, 55, 24, 50, 83, 50, 69, 55, 81, 51, 82, 55, 76, 50, 85, 50, 23, 55, 87, 51, 92, 55, 85, 50, 93, 50, 86, 55, 90, 51, 87, 55, 21, 50, 81, 50, 91, 55, 93, 51, 82, 55, 75, 50, 30, 50, 78, 55, 89, 51, 95, 49, 82, 54, 94, 57, 90, 56, 86, 53, 70, 49, 86, 54, 65, 57, 29, 56, 85, 53, 90, 49, 70, 54, 92, 57, 71, 56, 78, 49, 81, 54, 93, 57, 70, 56, 89, 53, 65, 49, 74, 54, 18, 57, 84, 56, 66, 53, 92, 49, 114, 54, 95, 54, 68, 55, 88, 54, 84, 49, 17, 54, 94, 54, 94, 55, 64, 54, 16, 49, 66, 54, 81, 54, 71, 55, 81, 54, 16, 49, 82, 54, 95, 54, 92, 55, 89, 54, 81, 49, 95, 54, 84, 54, 28, 55, 85, 54, 92, 49, 88, 54, 81, 54, 66, 55, 26, 54, 73, 49, 92, 54, 92};
    }

    private static int msfjdlyppiemsevt(int i, int i2) {
        return i2 ^ i;
    }
}
