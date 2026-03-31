package com.kammoun.donutCore.crates.listeners;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.crates.gui.CrateEditorGUI;
import com.kammoun.donutCore.crates.handlers.RewardHandler;
import com.kammoun.donutCore.crates.managers.KeyManager;
import com.kammoun.donutCore.crates.managers.crate.CrateManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.InventoryHolder;

public class CrateListener implements Listener {
    private final DonutModule plugin;
    private final CrateManager crateManager;
    private final KeyManager keyManager;
    private final RewardHandler rewardHandler;
    private static int BGxjEic6hA = 0;
    private transient int NwOvi5Habo = 360388938;
    private static String[] nothing_to_see_here = new String[18];

    public CrateListener(DonutModule donutModule, CrateManager crateManager, KeyManager keyManager, RewardHandler rewardHandler, int i) {
        int i2 = 1081879137 ^ (1516337806 ^ 1910335691);
        int parseInt = 333411199 ^ (444113845 ^ Integer.parseInt("1650977006"));
        this.NwOvi5Habo = 360388938 ^ BGxjEic6hA;
        int qcfexpwnuwlgoxaz = 131932962 ^ qcfexpwnuwlgoxaz(parseInt, 1578126968);
        this.plugin = donutModule;
        this.crateManager = crateManager;
        this.keyManager = keyManager;
        this.rewardHandler = rewardHandler;
        int i3 = 212458613 ^ (1909256650 ^ (1877317689 ^ (193931526 ^ qcfexpwnuwlgoxaz)));
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        int i = 1555835758 ^ (773144044 ^ 976161622);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 1144057506) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1144057506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1065774440 ^ i)) {
                    int i2 = 1055665993 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 448977643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (169668160 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 1248921304 ^ i;
            throw new RuntimeException();
        }
        int i4 = 221758942 ^ i;
        this.keyManager.loadPlayerKeys(playerJoinEvent.getPlayer().getUniqueId(), 1268201748);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 764330066) {
            int i5 = 652837719 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 764330066 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (862511262 ^ i4)) {
                break;
            }
        }
        int i6 = 1289868161 ^ i4;
        throw new IllegalAccessException("double");
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        int i = 20151154 ^ (229879262 ^ 976161622);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1249972271) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1249972271 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1231933660 ^ i)) {
                    int i2 = 638602955 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1506122474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (58035668 ^ i)) {
                        break;
                    }
                }
            }
            int i3 = 1718945951 ^ i;
            throw new IllegalAccessException();
        }
        int i4 = 1588843917 ^ i;
        this.keyManager.unloadPlayer(playerQuitEvent.getPlayer().getUniqueId(), 994157648);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1088439227) {
            int i5 = 589609770 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1088439227 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1224294939 ^ i4)) {
                break;
            }
        }
        int i6 = 957162829 ^ i4;
        throw new RuntimeException("double");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onBlockPlace(org.bukkit.event.block.BlockPlaceEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.listeners.CrateListener.onBlockPlace(org.bukkit.event.block.BlockPlaceEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.listeners.CrateListener.onBlockBreak(org.bukkit.event.block.BlockBreakEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGH)
    public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.listeners.CrateListener.onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent):void");
    }

    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.NORMAL)
    public void onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.listeners.CrateListener.onInventoryClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onInventoryDrag(InventoryDragEvent inventoryDragEvent) {
        int i = 837103020 ^ (1873009061 ^ 976161622);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 592444155) {
            i = 155058465 ^ i;
            InventoryHolder holder = inventoryDragEvent.getInventory().getHolder();
            if ((holder instanceof CrateEditorGUI) == (1834483326 ^ i)) {
                int i2 = 1463454398 ^ i;
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1790964723) {
                int i3 = 1901876602 ^ i;
                CrateEditorGUI crateEditorGUI = (CrateEditorGUI) holder;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -530753504) {
                    i3 = 509119310 ^ i3;
                    crateEditorGUI.handleDrag(inventoryDragEvent, 1353692662);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 312017488) {
                        int i4 = 943608970 ^ i3;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -747919871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1115344674 ^ i3)) {
                        int i5 = 644043083 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 312017488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1037534220 ^ i3)) {
                            int i6 = 255832913 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -530753504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2014338736 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
                int i7 = 246841395 ^ i3;
                throw new RuntimeException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1790964723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (542296976 ^ i)) {
                int i8 = 1062728962 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 592444155 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1930904576 ^ i)) {
                    break;
                }
            }
        }
        int i9 = 1182808436 ^ i;
        throw new RuntimeException("double");
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
        BGxjEic6hA = 1477852592 ^ new Random(1155955260184365497L).nextInt();
    }

    public static String rgsaqxbmtm(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] jsvmwtclruspaih() {
        return new byte[]{25, 86, 118, 11, 116, 39, 54, 85, 122, 17, 114, 11, 80, 49, 23, 19, 43, 79, 48, 102, 112, 27, 28, 86, 54, 61, 24, 113, 44, 87, 37, 77, 10, 59, 38, 123, 55, 119, 60};
    }

    private static byte[] xztixtwiiymtfbo() {
        return new byte[]{-47, -100, 78, 94, 70, 97, 0, 3, 73, 83, 71, 86, 102, 92, 35, 76, 28, 24};
    }

    private static byte[] jgrvseuuwnxxqle() {
        return new byte[]{-42, -104, 78, 89, 65, 109, 2, 0, 73, 92, 67, 95, 104, 95, 34, 66, 31, 31};
    }

    private static byte[] rroollfnyhbpctk() {
        return new byte[]{-42, -103, 64, 89, 70, 112, 3, 15, 77, 81, 67, 79, 102, 100, 37, 89, 30, 26, 7, 39, 65, 78, 42, 19, 4, 43, 45, 36, 27, 6, 20, 16, 60, 100, 20, 45};
    }

    private static byte[] bdrzomvtxcqvjzi() {
        return new byte[]{-43, -112, 68, 110, 76, 93, 4, 35, 79, 107, 75, 109};
    }

    private static int qcfexpwnuwlgoxaz(int i, int i2) {
        return i2 ^ i;
    }
}
