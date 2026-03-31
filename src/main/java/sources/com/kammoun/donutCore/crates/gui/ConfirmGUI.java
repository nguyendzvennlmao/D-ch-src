package com.kammoun.donutCore.crates.gui;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.crates.Crates;
import com.kammoun.donutCore.crates.handlers.RewardHandler;
import com.kammoun.donutCore.crates.managers.KeyManager;
import com.kammoun.donutCore.crates.models.Crate;
import com.kammoun.donutCore.crates.models.CrateItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class ConfirmGUI implements InventoryHolder {
    private static final Set<UUID> processingPlayers;
    private final Inventory inventory;
    private final Crate crate;
    private final CrateItem selectedReward;
    private final KeyManager keyManager;
    private final RewardHandler rewardHandler;
    private final Player player;
    private final KItem acceptButton;
    private final KItem denyButton;
    private static int Z44b3fGqsm = 0;
    private transient int BJNo9FGjXA = 280778215;
    private static String[] nothing_to_see_here = new String[18];

    public ConfirmGUI(Player player, Crate crate, CrateItem crateItem, KeyManager keyManager, RewardHandler rewardHandler, int i) {
        int afvcdiheusrtlcoj;
        int i2 = 1122068808 ^ 741112414;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 112015927:
                    int i3 = 313702894 ^ i2;
                    break;
                case 961469577:
                default:
                    throw new IllegalAccessException();
                case 1378529523:
                    break;
                case 1568861048:
            }
        }
        int parseInt = 1730558697 ^ (838585535 ^ Integer.parseInt("715283630"));
        this.BJNo9FGjXA = 280778215 ^ Z44b3fGqsm;
        int afvcdiheusrtlcoj2 = 480041348 ^ afvcdiheusrtlcoj(parseInt, 1695519966);
        this.player = player;
        this.crate = crate;
        this.selectedReward = crateItem;
        this.keyManager = keyManager;
        this.rewardHandler = rewardHandler;
        int i4 = 1398865017 ^ (24803575 ^ (1436346349 ^ (1614336393 ^ (1722561956 ^ afvcdiheusrtlcoj2))));
        File file = new File(String.valueOf(Crates.getInstance(1887315151).getDataFolder(44993446)) + "/Gui", "confirm-gui.yml");
        int i5 = 1415223058 ^ i4;
        if (file.exists()) {
            afvcdiheusrtlcoj = afvcdiheusrtlcoj(i5, 1745954862);
        } else {
            Crates.getInstance(1887315151).saveConfig("confirm-gui.yml", 1620467835);
            afvcdiheusrtlcoj = 2112322362 ^ (368464660 ^ i5);
        }
        YamlConfiguration loadConfiguration = YamlConfiguration.loadConfiguration(file);
        String color = ChatFormater.color(loadConfiguration.getString("Title", "&8&lConfirm Purchase"));
        int i6 = loadConfiguration.getInt("Size", 27);
        this.inventory = Bukkit.createInventory(this, i6, color);
        this.acceptButton = KItem.fromConfig(loadConfiguration.getConfigurationSection("Navigation.Accept"), 2126963651);
        this.denyButton = KItem.fromConfig(loadConfiguration.getConfigurationSection("Navigation.Deny"), 2126963651);
        setupInventory(loadConfiguration, 1037581246);
        int i7 = 11560866 ^ (1081282199 ^ (1790981436 ^ (112912339 ^ (280650387 ^ (179670002 ^ (2105564585 ^ afvcdiheusrtlcoj))))));
    }

    private void setupInventory(org.bukkit.configuration.file.FileConfiguration r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.ConfirmGUI.setupInventory(org.bukkit.configuration.file.FileConfiguration, int):void");
    }

    public void open(int i) {
        int i2 = 221129273 ^ (1565280650 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 495694929) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 495694929 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2006745730 ^ i2)) {
                    int i3 = 801298101 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1244767454 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (534226923 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 827930975 ^ i2;
            throw new IOException();
        }
        int i5 = 529167079 ^ i2;
        this.player.openInventory(this.inventory);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -505928855) {
            int i6 = 1786957577 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -505928855 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1477110071 ^ i5)) {
                break;
            }
        }
        int i7 = 1251623231 ^ i5;
        throw new IllegalAccessException("double");
    }

    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.ConfirmGUI.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private void handleAccept(org.bukkit.entity.Player r7, java.util.UUID r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.ConfirmGUI.handleAccept(org.bukkit.entity.Player, java.util.UUID, int):void");
    }

    private void handleDeny(Player player, int i) {
        int i2 = 659009368 ^ (1096824919 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1348202064) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1348202064 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1627375010 ^ i2)) {
                    break;
                }
            }
            int i3 = 457175825 ^ i2;
            throw new IOException("double");
        }
        int i4 = 949427116 ^ i2;
        player.closeInventory();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1797049553) {
            int i5 = 1131826519 ^ i4;
            player.playSound(player.getLocation(), Sound.ENTITY_ITEM_BREAK, 0.5f, 1.0f);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1890494059) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1890494059 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1238372383 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1700418102 ^ i5;
                throw new IllegalAccessException("double");
            }
            i4 = 854345944 ^ i5;
            CrateGUI crateGUI = new CrateGUI(this.crate, this.keyManager, this.rewardHandler, 1755910713);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -406003542) {
                int i7 = 1100574499 ^ i4;
                SchedulerUtil.runLater(() -> {
                    int i8 = 1466728518 ^ (1660318371 ^ 1668235486);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1213361702) {
                        int i9 = 660138060 ^ i8;
                        crateGUI.open(player, 1983395784);
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1922378821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (864055824 ^ i8)) {
                            int i10 = 473050404 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1213361702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (430559610 ^ i8)) {
                                break;
                            }
                        }
                    }
                    int i11 = 17100550 ^ i8;
                    throw new IllegalAccessException();
                }, 2L, 1577269415);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -351823440) {
                    int i8 = 1703770076 ^ i7;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -351823440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (250884474 ^ i7)) {
                        break;
                    }
                }
                int i9 = 1589360233 ^ i7;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -949213357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1125262039 ^ i4)) {
                int i10 = 557022270 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -406003542 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1620392309 ^ i4)) {
                    int i11 = 1448048106 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1797049553 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2094942503 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i12 = 28758230 ^ i4;
        throw new IllegalAccessException();
    }

    @NotNull
    public Inventory getInventory() {
        int i = 1545095395 ^ (184024658 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 702880833) {
            int i2 = 1991307383 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 702880833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1975124347 ^ i)) {
                int i3 = 705415263 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1671258118 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1140175678 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 341959915 ^ i;
        throw new IOException();
    }

    @Generated
    public Crate getCrate() {
        int i = 1977549439 ^ (1118843726 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 635510850) {
            int i2 = 1581139715 ^ i;
            return this.crate;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -736946088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (138343913 ^ i)) {
                int i3 = 357767430 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 635510850 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (923870706 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2142979434 ^ i;
        throw new IOException();
    }

    @Generated
    public CrateItem getSelectedReward() {
        int i = 689534560 ^ (454140960 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 249445322) {
            int i2 = 1391494922 ^ i;
            return this.selectedReward;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1722154088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1207568719 ^ i)) {
                int i3 = 122003326 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 249445322 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (220717136 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1625531233 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public KeyManager getKeyManager() {
        int i = 268078139 ^ (1499453335 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 733115561) {
            int i2 = 2046940573 ^ i;
            return this.keyManager;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -71509950 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1722389609 ^ i)) {
                int i3 = 279180236 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 733115561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (735335018 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1522586306 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public RewardHandler getRewardHandler() {
        int i = 1122189620 ^ (850150195 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 484489712) {
            int i2 = 202949425 ^ i;
            return this.rewardHandler;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2082906232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1430787412 ^ i)) {
                int i3 = 795532687 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 484489712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1585154715 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2044358337 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public Player getPlayer() {
        int i = 1967911920 ^ (626160624 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 508864969) {
            int i2 = 1372717637 ^ i;
            return this.player;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1866155037 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2032504031 ^ i)) {
                int i3 = 1590191948 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 508864969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2018146376 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 664248852 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public KItem getAcceptButton() {
        int i = 917584005 ^ (1252953706 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2120556208) {
            int i2 = 753237743 ^ i;
            return this.acceptButton;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 424602057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2086141919 ^ i)) {
                int i3 = 337663208 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2120556208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (693279857 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 960094005 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public KItem getDenyButton() {
        int i = 807581195 ^ (1229417011 ^ 1943213369);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1438009352) {
            int i2 = 42890822 ^ i;
            return this.denyButton;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1103493688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1092132291 ^ i)) {
                int i3 = 234791817 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1438009352 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (559575296 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1867678045 ^ i;
        throw new IllegalAccessException();
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
        int parseInt = 1700495922 ^ (598229631 ^ Integer.parseInt("715283630"));
        Z44b3fGqsm = (-1576718615) ^ new Random(7318767981249197572L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1653401371) {
            int i = 514866655 ^ parseInt;
            processingPlayers = new HashSet();
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1653401371 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (707693776 ^ parseInt)) {
                int i2 = 1693591543 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1760753181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (609929579 ^ parseInt)) {
                    break;
                }
            }
        }
        int i3 = 1459105137 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String kvpsnkgbnx(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] nufqbdpfqazvkyb() {
        return new byte[]{58, 17, 49, 116, 106, 54, 76, 104, 55, 122, 39, 98, 80, 18, 102, 28, Byte.MAX_VALUE, 81, 14, 113, 34, 98, 18, 15, 98, 64, 75, 89, 45, 37, 77, 43, 1};
    }

    private static byte[] mixzvqxqkxufgpw() {
        return new byte[]{-11, -36, 1, 14, 93, 99, 126, 47, 1, 35, 22, 55, 96, 71, 81, 92, 77, 9, 56, 46, 19, 62, 34, 21, 85, 61, 121, 6, 27, 115, 124, 118, 49, 32, 38, 118, 70, 55, 0, 19, 89, 113};
    }

    private static int afvcdiheusrtlcoj(int i, int i2) {
        return i2 ^ i;
    }
}
