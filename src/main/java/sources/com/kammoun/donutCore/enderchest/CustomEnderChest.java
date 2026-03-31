package com.kammoun.donutCore.enderchest;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.enderchest.gui.GUIHandler;
import com.kammoun.donutCore.enderchest.listener.ChestListener;
import com.kammoun.donutCore.enderchest.listener.InventoryListener;
import com.kammoun.donutCore.enderchest.listener.PlayerListener;
import com.kammoun.donutCore.enderchest.manager.ConfigManager;
import com.kammoun.donutCore.enderchest.manager.DataManager;
import com.kammoun.donutCore.enderchest.manager.EnderChestManager;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Bukkit;

public final class CustomEnderChest extends DonutModule {
    private static CustomEnderChest instance;
    private ConfigManager configManager;
    private DataManager dataManager;
    private EnderChestManager enderChestManager;
    private GUIHandler guiHandler;
    private static int AaAtogiDPR = 0;
    private transient int KUdiyIBNRB = 1274243907;
    private static byte[] exkorxrgxm;
    private static String[] nothing_to_see_here = new String[13];

    public CustomEnderChest() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.CustomEnderChest.<init>():void");
    }

    @Override
    public void onModuleEnable(int i) {
        int i2 = 819560399 ^ (1354593998 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1490626261) {
            i2 = 587241572 ^ i2;
            instance = this;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1088284150) {
                int i3 = 768783175 ^ i2;
                this.configManager = new ConfigManager(this, 1319181045);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -776503245) {
                    i2 = 1127582630 ^ i3;
                    this.configManager.loadConfigs(1118309511);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -937698047) {
                        i3 = 591831831 ^ i2;
                        this.dataManager = new DataManager(this, 203880933);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -768686664) {
                            int i4 = 273199475 ^ i3;
                            this.dataManager.initialize(1483209923);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1349209632) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1349209632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1453674169 ^ i4)) {
                                        break;
                                    }
                                }
                                int i5 = 361145717 ^ i4;
                                throw new IOException("double");
                            }
                            int i6 = 1101761157 ^ i4;
                            this.enderChestManager = new EnderChestManager(this, 744455849);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1563892234) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1563892234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1992194441 ^ i6)) {
                                        break;
                                    }
                                }
                                int i7 = 1208604020 ^ i6;
                                throw new IOException("double");
                            }
                            i3 = 2043023756 ^ i6;
                            this.guiHandler = new GUIHandler();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1828219287) {
                                i3 = 642464582 ^ i3;
                                registerCommands(899765103);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1587655592) {
                                    i3 = 1016025465 ^ i3;
                                    registerListeners(2062169198);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1160038289) {
                                        int i8 = 1076148797 ^ i3;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1587655592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1113552880 ^ i3)) {
                        int i9 = 927048841 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -776503245 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1022789670 ^ i3)) {
                            int i10 = 1512830322 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1160038289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1916886376 ^ i3)) {
                                int i11 = 817899630 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -768686664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1562201117 ^ i3)) {
                                    int i12 = 11559268 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1828219287 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (742445646 ^ i3)) {
                                        int i13 = 1165544444 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1140921979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1595679468 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i14 = 608160264 ^ i3;
                throw new IOException();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -937698047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (192524935 ^ i2)) {
                int i15 = 1853759838 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1088284150 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1853603282 ^ i2)) {
                    int i16 = 1314657321 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1490626261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1451800387 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i17 = 1538836375 ^ i2;
        throw new IllegalAccessException("double");
    }

    @Override
    public void onModuleDisable(int i) {
        int i2 = 179864554 ^ (1273451879 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1359469238) {
            i2 = 2129198834 ^ i2;
            if (this.enderChestManager != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1505743577) {
                    i2 = 1216433214 ^ i2;
                    this.enderChestManager.shutdown(1913119352);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 498447147) {
                        i2 = 756132042 ^ i2;
                        if (this.dataManager != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1966667130) {
                                i2 = 321404952 ^ i2;
                                this.dataManager.shutdown(822209642);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -327486022) {
                                    int i3 = 2073588039 ^ i2;
                                    return;
                                }
                            }
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                case 140740052:
                                    int i4 = 1756377439 ^ i2;
                                    return;
                                case 374866251:
                                case 1775377614:
                                    return;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 498447147 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1357867907 ^ i2)) {
                            int i5 = 1693103829 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 817463169 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1432699767 ^ i2)) {
                                int i6 = 1050317328 ^ i2;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                    case 62676519:
                        i2 = 1703994612 ^ i2;
                        break;
                    case 236126863:
                    case 1080907942:
                        break;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1359469238 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1029876846 ^ i2)) {
                int i7 = 317899066 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -327486022 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (45074353 ^ i2)) {
                    int i8 = 1410735919 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1966667130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1681290222 ^ i2)) {
                        int i9 = 985702535 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1505743577 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2007325633 ^ i2)) {
                            int i10 = 1443853931 ^ i2;
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    private void registerCommands(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.CustomEnderChest.registerCommands(int):void");
    }

    private void registerListeners(int i) {
        int i2 = 1079716500 ^ (1898545797 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 798216617) {
            i2 = 1976573861 ^ i2;
            Bukkit.getPluginManager().registerEvents(new PlayerListener(this, 1016989430), this.api);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2129449854) {
                i2 = 565230870 ^ i2;
                Bukkit.getPluginManager().registerEvents(new ChestListener(this, 479168414), this.api);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1936276429) {
                    int i3 = 1283083240 ^ i2;
                    Bukkit.getPluginManager().registerEvents(new InventoryListener(this, 1805682110), this.api);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -280716431) {
                        int i4 = 632202538 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -280716431 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (69973865 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 691594259 ^ i3;
                    throw new IllegalAccessException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1036930528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (978529098 ^ i2)) {
                int i6 = 1373254834 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 798216617 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (782403254 ^ i2)) {
                    int i7 = 2102023674 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1936276429 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1619126221 ^ i2)) {
                        int i8 = 1935018549 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2129449854 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (379137681 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i9 = 1030432415 ^ i2;
        throw new IOException();
    }

    @Override
    public void reload(int i) {
        int i2 = 782554575 ^ (72087487 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -209747295) {
            int i3 = 1007484378 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 320367728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1836533315 ^ i2)) {
                int i4 = 1308221456 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -209747295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (736037298 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1252094671 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public ConfigManager getConfigManager(int i) {
        int i2 = 572033845 ^ (45045969 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1581773311) {
            int i3 = 279327092 ^ i2;
            return this.configManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 612992417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1102411185 ^ i2)) {
                int i4 = 1352716817 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1581773311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1053675237 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 381426108 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public DataManager getDataManager(int i) {
        int i2 = 1243033222 ^ (373658207 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1184069610) {
            int i3 = 2395079 ^ i2;
            return this.dataManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1184069610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1571480104 ^ i2)) {
                int i4 = 676832248 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1203186130 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1883316390 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1101171680 ^ i2;
        throw new IOException();
    }

    @Generated
    public EnderChestManager getEnderChestManager(int i) {
        int i2 = 1601571135 ^ (210412079 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1004784034) {
            int i3 = 1850420115 ^ i2;
            return this.enderChestManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1236964665 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (868633849 ^ i2)) {
                int i4 = 1883454515 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1004784034 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (533759534 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 841998536 ^ i2;
        throw new IOException();
    }

    @Generated
    public GUIHandler getGuiHandler(int i) {
        int i2 = 1385852892 ^ (972778172 ^ 343986724);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -15812061) {
            int i3 = 326794577 ^ i2;
            return this.guiHandler;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1692225707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (878009707 ^ i2)) {
                int i4 = 1954089091 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -15812061 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1276605541 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 73697198 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public static CustomEnderChest getInstance() {
        int i = 1895523300 ^ (1522064379 ^ (1954318320 ^ 1601419623));
        return instance;
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
        exkorxrgxm = nswxxyjqeuasrlj();
        AaAtogiDPR = (-871843693) ^ new Random(-1779140353710728496L).nextInt();
    }

    public static String vuseoyqimh(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ exkorxrgxm[i3 % exkorxrgxm.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] nswxxyjqeuasrlj() {
        return new byte[]{21, 74, 64, 17, 24, 118, 5, 122, 80, 21, 61, 43, 108, 110, 31, 96, 114, 54, 22, 80, 40, 2, 94, 90, 48, 116, 45, 75, 55, 30, 117, 2, 101, 67, 93, 65, 59, 69, 64, 94, 50, 126, 86, 43, 83, 15, 8, 4, 109, 122, 32, 55, 97, 35, 50, 40, 42, 16, 8, 108, 8, 87, 57, 4, 85, 3, 60, 80, 22, 3};
    }

    private static byte[] uuakphujlenibjy() {
        return new byte[]{-38, -124, 112, 64, 44, 54, 54, 58, 103, 87, 12, 117, 92, 49, 43, 48, 65, 102};
    }

    private static byte[] fufpfpeenykhfvk() {
        return new byte[]{-40, -121, 119, 66, 43, 33};
    }

    private static byte[] hgvotyxxwqqxvwt() {
        return new byte[]{-46, -124, 113, 68, 46, 37};
    }

    private static byte[] ieyczljocknkoqg() {
        return new byte[]{-34, -116, 116, 77, 45, 44, 53, 38, 101, 69, 4, 109, 85, 56, 43, 56, 74, 102, 35, 26, 28, 79};
    }

    private static int mylerqivurajyyxc(int i, int i2) {
        return i ^ i2;
    }
}
