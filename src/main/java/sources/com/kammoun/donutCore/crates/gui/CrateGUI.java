package com.kammoun.donutCore.crates.gui;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.crates.handlers.RewardHandler;
import com.kammoun.donutCore.crates.managers.KeyManager;
import com.kammoun.donutCore.crates.models.Crate;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class CrateGUI implements InventoryHolder {
    private static final Set<UUID> processingPlayers;
    private final Inventory inventory;
    private final Crate crate;
    private final KeyManager keyManager;
    private final RewardHandler rewardHandler;
    private static int JfKCeIcMwd = 0;

    private transient int f450eP0yVS8pE = 478360185;
    private static byte[] fvureychcq;
    private static String[] nothing_to_see_here = new String[15];

    public CrateGUI(Crate crate, KeyManager keyManager, RewardHandler rewardHandler, int i) {
        rfxksklwyqhtzcrp(2009146406 ^ 113324927, 1818520302);
        int parseInt = 1642045358 ^ (1533994428 ^ Integer.parseInt("668272549"));
        this.f450eP0yVS8pE = 478360185 ^ JfKCeIcMwd;
        int rfxksklwyqhtzcrp = 995720531 ^ rfxksklwyqhtzcrp(parseInt, 1098117350);
        this.crate = crate;
        this.keyManager = keyManager;
        this.rewardHandler = rewardHandler;
        this.inventory = Bukkit.createInventory(this, crate.getInventorySize(1587311664), ChatFormater.color(crate.getInventoryName(1412751023)));
        setupInventory(1860817773);
        int i2 = 874977738 ^ (809400211 ^ (1277329736 ^ (75663917 ^ (750271240 ^ rfxksklwyqhtzcrp))));
    }

    private void setupInventory(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateGUI.setupInventory(int):void");
    }

    public void open(Player player, int i) {
        int i2 = 1851727206 ^ (1475828706 ^ 1311464745);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1139221141) {
            i2 = 993050106 ^ i2;
            player.openInventory(this.inventory);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1704800954) {
                int i3 = 1531082790 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1704800954 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1081003151 ^ i2)) {
                int i4 = 883675087 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1139221141 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (551191654 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 887140044 ^ i2;
        throw new RuntimeException();
    }

    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateGUI.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    @NotNull
    public Inventory getInventory() {
        int i = 387755838 ^ (923776578 ^ 1311464745);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1908548267) {
            int i2 = 2034376088 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1143812504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (908547059 ^ i)) {
                int i3 = 856365129 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1908548267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1563449535 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 170133832 ^ i;
        throw new IOException();
    }

    @Generated
    public Crate getCrate() {
        int i = 747696133 ^ (1864501197 ^ 1311464745);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1825396488) {
            int i2 = 448697732 ^ i;
            return this.crate;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1187382488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1923463351 ^ i)) {
                int i3 = 1723507506 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1825396488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (810599942 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1341526291 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public KeyManager getKeyManager() {
        int i = 1365564967 ^ (1892533581 ^ 1311464745);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2081567259) {
            int i2 = 1184268267 ^ i;
            return this.keyManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1218563393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1657805381 ^ i)) {
                int i3 = 1668346059 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2081567259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (483041094 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2113134828 ^ i;
        throw new IOException();
    }

    @Generated
    public RewardHandler getRewardHandler() {
        int i = 1415573562 ^ (380983213 ^ 1311464745);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1712313840) {
            int i2 = 1859923194 ^ i;
            return this.rewardHandler;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 284078627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1140557521 ^ i)) {
                int i3 = 1810305653 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1712313840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (139161549 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 672042000 ^ i;
        throw new RuntimeException();
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
        int parseInt = 1017078404 ^ (898401118 ^ Integer.parseInt("668272549"));
        fvureychcq = dudsvhludvipetm();
        JfKCeIcMwd = 1966770958 ^ new Random(-5580714965010281691L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1983329273) {
            int i = 1067874613 ^ parseInt;
            processingPlayers = new HashSet();
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1962608048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (2140377482 ^ parseInt)) {
                int i2 = 1164048016 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1983329273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (959876734 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 1579298131 ^ parseInt;
        throw new IOException();
    }

    public static String libszpbyci(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ fvureychcq[i3 % fvureychcq.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] dudsvhludvipetm() {
        return new byte[]{54, 88, 16, 47, 106, 45, 97, 68, 99, 13, 84, 76, 2, 57, 92, 37, 3, 99, 24, 6, 28, 61, 85, 30, 81, 51, 55, 18, 119, 92, 66, 54, 43, 15, 3, 2, 125, 122, 44, 81, 57, 35, 11, 32, 121, 108, 102, 32};
    }

    private static int rfxksklwyqhtzcrp(int i, int i2) {
        return i ^ i2;
    }
}
