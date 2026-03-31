package com.kammoun.donutCore.portals;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.portals.listener.PortalListener;
import com.kammoun.donutCore.portals.models.Portal;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class PortalPlugin extends DonutModule implements Listener {
    private final Map<String, Portal> portals;
    private final Map<Player, Set<String>> playerRegions;
    private final Set<String> noEndPortalRegions;
    private static int ARlFDMlKxR = 0;
    private transient int La1EsZAu6G = 884983372;
    private static String evxfnqnkzn;
    private static String[] nothing_to_see_here = new String[13];

    public PortalPlugin() {
        super("Portals", 1095143273);
        int i = 1852060206 ^ (621432821 ^ 336635948);
        int parseInt = 1899648500 ^ (1878520797 ^ Integer.parseInt("1102279646"));
        this.La1EsZAu6G = 884983372 ^ ARlFDMlKxR;
        int qixqxkpzgmkvnykz = 1623785571 ^ qixqxkpzgmkvnykz(parseInt, 1017085722);
        this.portals = new HashMap();
        this.playerRegions = new ConcurrentHashMap();
        this.noEndPortalRegions = new HashSet();
        int i2 = 1341926590 ^ (791483538 ^ (10219330 ^ qixqxkpzgmkvnykz));
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 1782650048 ^ (861765940 ^ 2002789854);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1944420689) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1944420689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1004487202 ^ i2)) {
                    break;
                }
            }
            int i3 = 1197079358 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 893615348 ^ i2;
        loadConfig(392005859);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -637638928) {
            i4 = 1840450350 ^ i4;
            loadConfiguration(136991465);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1268367485) {
                i4 = 1086262933 ^ i4;
                Bukkit.getPluginManager().registerEvents(new PortalListener(this, 1898097715), this.api);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1315026135) {
                    int i5 = 834722947 ^ i4;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -637638928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2052701035 ^ i4)) {
                int i6 = 218692654 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1066970928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1168024407 ^ i4)) {
                    int i7 = 513734699 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1315026135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1955947099 ^ i4)) {
                        int i8 = 25272675 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1268367485 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (375260061 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 857354585 ^ i4;
        throw new IOException();
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 1184890372 ^ (671589021 ^ 2002789854);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -809252296) {
            int i3 = 1256794938 ^ i2;
            this.portals.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1735748630) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -889110671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1122563974 ^ i3)) {
                        int i4 = 945965666 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1735748630 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1671059062 ^ i3)) {
                            break;
                        }
                    }
                }
                int i5 = 2031809118 ^ i3;
                throw new IOException();
            }
            int i6 = 419397987 ^ i3;
            this.playerRegions.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1601607922) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1601607922 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1235739908 ^ i6)) {
                        break;
                    }
                }
                int i7 = 1923375220 ^ i6;
                throw new RuntimeException("double");
            }
            i2 = 974348744 ^ i6;
            this.noEndPortalRegions.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1880254797) {
                int i8 = 1218286904 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1880254797 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (515850795 ^ i2)) {
                int i9 = 310656729 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -809252296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1462684688 ^ i2)) {
                    break;
                }
            }
        }
        int i10 = 1000915770 ^ i2;
        throw new IllegalAccessException("double");
    }

    @Override
    public void reload(int i) {
        int i2 = 1889355328 ^ (1739259973 ^ 2002789854);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 45293275) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 45293275 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (809449426 ^ i2)) {
                    break;
                }
            }
            int i3 = 856232286 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 2049351287 ^ i2;
        this.portals.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -746066592) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -746066592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1550257033 ^ i4)) {
                    break;
                }
            }
            int i5 = 692545171 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 1629625765 ^ i4;
        this.playerRegions.clear();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -627638197) {
            int i7 = 363349957 ^ i6;
            this.noEndPortalRegions.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 2010463843) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 2010463843 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (56985263 ^ i7)) {
                        break;
                    }
                }
                int i8 = 749880035 ^ i7;
                throw new IOException("double");
            }
            i6 = 764035084 ^ i7;
            loadConfiguration(136991465);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 461848066) {
                int i9 = 446927293 ^ i6;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -627638197 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1821479708 ^ i6)) {
                int i10 = 540056300 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -828656662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (612906786 ^ i6)) {
                    int i11 = 1789037164 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 461848066 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (495032766 ^ i6)) {
                        break;
                    }
                }
            }
        }
        int i12 = 1984246969 ^ i6;
        throw new RuntimeException();
    }

    private void loadConfiguration(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.portals.PortalPlugin.loadConfiguration(int):void");
    }

    @Generated
    public Map getPortals(int i) {
        int i2 = 872339019 ^ (233478436 ^ 2002789854);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1268995466) {
            int i3 = 1693299064 ^ i2;
            return this.portals;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1825496649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (157441402 ^ i2)) {
                int i4 = 638728934 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1268995466 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1311660445 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 278500653 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Map getPlayerRegions(int i) {
        int i2 = 18840902 ^ (1409720239 ^ 2002789854);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 332282297) {
            int i3 = 2132830949 ^ i2;
            return this.playerRegions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -355635566 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1964947280 ^ i2)) {
                int i4 = 2050755897 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 332282297 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (49899445 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 510579787 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Set getNoEndPortalRegions(int i) {
        int i2 = 1990983595 ^ (1428672913 ^ 2002789854);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1486856414) {
            int i3 = 562244234 ^ i2;
            return this.noEndPortalRegions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1486856414 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (216200783 ^ i2)) {
                int i4 = 1036837164 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1418130573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1040036806 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 385247899 ^ i2;
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
        evxfnqnkzn = ByteBuffer.wrap(adetosfitcwcyxu()).asCharBuffer().toString();
        ARlFDMlKxR = (-645738914) ^ new Random(-3373996235749248745L).nextInt();
    }

    public static String rsstqoxhjy(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = evxfnqnkzn.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] adetosfitcwcyxu() {
        return new byte[0];
    }

    private static int qixqxkpzgmkvnykz(int i, int i2) {
        return i2 ^ i;
    }
}
