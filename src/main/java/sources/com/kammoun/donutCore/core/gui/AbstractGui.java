package com.kammoun.donutCore.core.gui;

import com.kammoun.donutCore.core.CorePlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.annotation.Nullable;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public abstract class AbstractGui {
    private final CorePlugin plugin;
    private static int NeLbRtKj8f = 0;

    private transient int f3198oABG1XLA = 583214107;
    private static String[] nothing_to_see_here = new String[15];

    public AbstractGui(com.kammoun.donutCore.core.CorePlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.AbstractGui.<init>(com.kammoun.donutCore.core.CorePlugin, int):void");
    }

    public abstract void click(WrappedClickEvent wrappedClickEvent, int i);

    public void onClose(Player player, @Nullable InventoryCloseEvent inventoryCloseEvent, int i) {
        int i2 = 1194006629 ^ (1828100192 ^ 305695024);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -819443287) {
            int i3 = 768925023 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1584487600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (81041657 ^ i2)) {
                int i4 = 635992186 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -819443287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (671264753 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 628170056 ^ i2;
        throw new RuntimeException();
    }

    public CorePlugin plugin(int i) {
        int i2 = 354212187 ^ (671830338 ^ 305695024);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2037909833) {
            int i3 = 1921570946 ^ i2;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -314651302 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (20528546 ^ i2)) {
                int i4 = 162674375 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2037909833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (747105472 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1067789761 ^ i2;
        throw new IllegalAccessException();
    }

    public abstract boolean isInGUI(Player player);

    public abstract void remove(Player player, int i);

    public void open(Player player, Object[] objArr, int i) {
        int i2 = 982151111 ^ (2036389711 ^ 305695024);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1903063614) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1903063614 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1434196982 ^ i2)) {
                    break;
                }
            }
            int i3 = 1691013854 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 2140996757 ^ i2;
        Inventory generateInventory = generateInventory(player, objArr, 1473941027);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1920575849) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1920575849 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1847178717 ^ i4)) {
                    int i5 = 998728195 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1399047974 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (227758207 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 1810128413 ^ i4;
            throw new RuntimeException("double");
        }
        int i7 = 185164129 ^ i4;
        if (generateInventory != null) {
            i7 = uuoippqnbbteplid(i7, 1956931696);
            player.openInventory(generateInventory);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1894653470) {
                i7 = 1277931472 ^ i7;
                addToOpened(player, objArr, 1534449034);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -296968352) {
                    int i8 = 1889051595 ^ i7;
                    return;
                }
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 707961441) {
            int i9 = 1893061463 ^ i7;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -296968352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1898533201 ^ i7)) {
                int i10 = 97054574 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1787396411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (508229349 ^ i7)) {
                    int i11 = 1065112743 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1894653470 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1412851548 ^ i7)) {
                        int i12 = 1972717312 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 707961441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (622393451 ^ i7)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 1509843521 ^ i7;
        throw new IllegalAccessException();
    }

    public CorePlugin getPlugin() {
        int i = 969998180 ^ (2034740346 ^ 305695024);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1786850958) {
            int i2 = 1166833095 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1189249208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1496798116 ^ i)) {
                int i3 = 429026847 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1786850958 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1005233049 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 336734174 ^ i;
        throw new RuntimeException();
    }

    public abstract void addToOpened(Player player, Object[] objArr, int i);

    public abstract Inventory generateInventory(Player player, Object[] objArr, int i);

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
        NeLbRtKj8f = (-2039822293) ^ new Random(8726411848569166229L).nextInt();
    }

    public static String rrkjdtljss(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] sqbdemrujpvabfy() {
        return new byte[]{114, 112, 81, 65, 53, 110, 80, 87, 82, 60, 88, 24, 80, 20, 82, 51, 81, 26, 51, 68, 33, 92, 98, 95, 117, 49, 78, 48, 12};
    }

    private static int uuoippqnbbteplid(int i, int i2) {
        return i ^ i2;
    }
}
