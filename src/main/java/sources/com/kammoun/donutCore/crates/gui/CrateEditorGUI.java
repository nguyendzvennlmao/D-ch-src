package com.kammoun.donutCore.crates.gui;

import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.crates.Crates;
import com.kammoun.donutCore.crates.models.Crate;
import com.kammoun.donutCore.crates.models.CrateItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CrateEditorGUI implements InventoryHolder {
    private static final Set<UUID> processingPlayers;
    private static final List<Integer> EDITABLE_SLOTS;
    private static final int INFO_SLOT = 4;
    private static final int SAVE_BUTTON_SLOT = 49;
    private static final int CANCEL_BUTTON_SLOT = 45;
    private static final Material PLACEHOLDER_MATERIAL;
    private static final Material FILLER_MATERIAL;
    private final Crates plugin;
    private final Crate crate;
    private final Player editor;
    private final File crateConfigFile;
    private final Inventory inventory;
    private final Map<Integer, ItemStack> slotToItem;
    private boolean hasUnsavedChanges;
    private static int Lfdlerj6Qz = 0;
    private transient int suuEHxcaFa = 211274223;
    private static String[] nothing_to_see_here = new String[15];

    public CrateEditorGUI(com.kammoun.donutCore.crates.Crates r5, com.kammoun.donutCore.crates.models.Crate r6, org.bukkit.entity.Player r7, java.io.File r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateEditorGUI.<init>(com.kammoun.donutCore.crates.Crates, com.kammoun.donutCore.crates.models.Crate, org.bukkit.entity.Player, java.io.File, int):void");
    }

    private void setupGui(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateEditorGUI.setupGui(int):void");
    }

    private void loadExistingRewards(int i) {
        int i2;
        int i3;
        int i4 = 1912982891 ^ (576399548 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1495672112) {
            int i5 = 323564945 ^ i4;
            Iterator it = this.crate.getRewards(962326601).iterator();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1016100424) {
                int i6 = 2129518190;
                while (true) {
                    i4 = i6 ^ i5;
                    if (it.hasNext() == (1719676761 ^ i4)) {
                        int i7 = 1007526655 ^ i4;
                        return;
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 872512203) {
                        i2 = 1354784045 ^ i4;
                        CrateItem crateItem = (CrateItem) it.next();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1308388447) {
                            i5 = 1613187108 ^ i2;
                            Integer slot = crateItem.getRewardItem(687656027).getSlot(1791774489);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1288056190) {
                                i2 = 835957429 ^ i5;
                                if (slot == null) {
                                    i3 = 839759749 ^ i2;
                                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1034176299) {
                                    i5 = 616759581 ^ i2;
                                    if (EDITABLE_SLOTS.contains(slot) == (1131907576 ^ i5)) {
                                        i3 = fuwimtuxevfpwlbl(i5, 382645912);
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 465326018) {
                                        i5 = 1230239564 ^ i5;
                                        ItemStack clone = crateItem.getRewardItem(687656027).getItemStack(1475551979).clone();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1361311136) {
                                            i5 = 1754358950 ^ i5;
                                            this.inventory.setItem(slot.intValue(), clone);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 363384979) {
                                                i2 = 1981669497 ^ i5;
                                                this.slotToItem.put(slot, clone);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1522019496) {
                                                    i3 = 1091683595 ^ i2;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1379271934) {
                                    int i8 = 802847156 ^ i3;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) == 220210009) {
                                            throw new RuntimeException();
                                        }
                                        throw null;
                                    } catch (RuntimeException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -753256797:
                                                i5 = fuwimtuxevfpwlbl(i8, 91421127);
                                                break;
                                            case 817272496:
                                                i5 = 2030529989 ^ i8;
                                                break;
                                            default:
                                                throw new IOException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -124913509) {
                                            i6 = 428970058;
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 465326018 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (296070962 ^ i5)) {
                                                    int i9 = 409846400 ^ i5;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -124913509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (389228631 ^ i5)) {
                                                        int i10 = 1736419716 ^ i5;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1379271934 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (70230946 ^ i3)) {
                                            int i11 = 5502310 ^ i3;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1034176299 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (413069842 ^ i2)) {
                        int i12 = 1405203661 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1308388447 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (914104197 ^ i2)) {
                            int i13 = 439921748 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1522019496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1670092679 ^ i2)) {
                                int i14 = 189184346 ^ i2;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 363384979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1058719784 ^ i5)) {
                    int i15 = 1041401052 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -731091662 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1378485904 ^ i5)) {
                        int i16 = 382199237 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 817272496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (752106259 ^ i5)) {
                            int i17 = 2079024854 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1361311136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1140474910 ^ i5)) {
                                int i18 = 141055411 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1016100424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (913016620 ^ i5)) {
                                    int i19 = 1741371370 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1288056190 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (374591942 ^ i5)) {
                                        int i20 = 184245002 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -753256797 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (345403557 ^ i5)) {
                                            int i21 = 1070805874 ^ i5;
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
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1495672112 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (485643422 ^ i4)) {
                int i22 = 548494799 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 872512203 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (394637958 ^ i4)) {
                    int i23 = 1592430946 ^ i4;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    public void open(int i) {
        int i2 = 61083618 ^ (381348894 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1931875434) {
            i2 = 1444677459 ^ i2;
            this.editor.openInventory(this.inventory);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1010422032) {
                int i3 = 1624171675 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1931875434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (725872959 ^ i2)) {
                int i4 = 897526167 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1010422032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1029509398 ^ i2)) {
                    int i5 = 1508024635 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -978253269 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (505327801 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 1046537523 ^ i2;
        throw new IllegalAccessException();
    }

    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateEditorGUI.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private void handleEditableSlot(org.bukkit.entity.Player r7, int r8, org.bukkit.inventory.ItemStack r9, org.bukkit.inventory.ItemStack r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateEditorGUI.handleEditableSlot(org.bukkit.entity.Player, int, org.bukkit.inventory.ItemStack, org.bukkit.inventory.ItemStack, int):void");
    }

    private void addItem(int i, ItemStack itemStack, int i2) {
        int i3 = 370170665 ^ (510920923 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1728867302) {
            int i4 = 227580127 ^ i3;
            this.slotToItem.put(Integer.valueOf(i), itemStack);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -193506590) {
                i3 = 2065693887 ^ i4;
                this.inventory.setItem(i, itemStack);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 747157273) {
                    i4 = 785884909 ^ i3;
                    this.hasUnsavedChanges = (byte) (189181967 ^ i4);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1513455728) {
                        int i5 = 939134874 ^ i4;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -437912415 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (340638117 ^ i4)) {
                    int i6 = 1672788922 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1513455728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (46048347 ^ i4)) {
                        int i7 = 204844980 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -193506590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (723127295 ^ i4)) {
                            break;
                        }
                    }
                }
            }
            int i8 = 661023721 ^ i4;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 747157273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1259950509 ^ i3)) {
                int i9 = 805445699 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1728867302 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1670547407 ^ i3)) {
                    break;
                }
            }
        }
        int i10 = 871978127 ^ i3;
        throw new IllegalAccessException("double");
    }

    private void removeItem(int i, int i2) {
        int i3 = 1921010121 ^ (1555709912 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1442661629) {
            i3 = 1013086084 ^ i3;
            this.slotToItem.remove(Integer.valueOf(i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1225852706) {
                int i4 = 1445590723 ^ i3;
                KItem kItem = new KItem(PLACEHOLDER_MATERIAL, 1181456562);
                String xepboqakxm = xepboqakxm(fsufoghefypbfko(), gwgmscppjekijrh(), i4);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -128011976) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -128011976 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (732012286 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1412004664 ^ i4;
                    throw new IOException("double");
                }
                i3 = 755970583 ^ i4;
                KItem name = kItem.name(xepboqakxm, 1455274667);
                String[] strArr = new String[(byte) (839181361 ^ i3)];
                strArr[(byte) (839181360 ^ i3)] = xepboqakxm(rwswkqbpnnjxhgh(), gwgmscppjekijrh(), i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1876483711) {
                    i3 = 1663379473 ^ i3;
                    KItem lore = name.lore(strArr, 30135326);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1995546358) {
                        i3 = 1444355829 ^ i3;
                        ItemStack itemStack = lore.getItemStack(1475551979);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 968267424) {
                            int i6 = 1152023025 ^ i3;
                            this.inventory.setItem(i, itemStack);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 484792618) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1372496776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1401652103 ^ i6)) {
                                        int i7 = 509227769 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 484792618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1656181625 ^ i6)) {
                                            break;
                                        }
                                    }
                                }
                                int i8 = 978935404 ^ i6;
                                throw new IllegalAccessException("double");
                            }
                            int i9 = 2057091453 ^ i6;
                            this.hasUnsavedChanges = (byte) (956306009 ^ i9);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -939486527) {
                                int i10 = 859424297 ^ i9;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -939486527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (474236590 ^ i9)) {
                                    break;
                                }
                            }
                            int i11 = 569061224 ^ i9;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1876483711 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (50881661 ^ i3)) {
                int i12 = 569223410 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1225852706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1410496121 ^ i3)) {
                    int i13 = 1787305933 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1442661629 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1315080967 ^ i3)) {
                        int i14 = 680206040 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1995546358 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2146248934 ^ i3)) {
                            int i15 = 1861619826 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 968267424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1041337873 ^ i3)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i16 = 861741777 ^ i3;
        throw new IllegalAccessException();
    }

    private void saveChanges(int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateEditorGUI.saveChanges(int):void");
    }

    private void discardChanges(int i) {
        int i2 = 108459721 ^ (1158686172 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1058565344) {
            i2 = 1276382530 ^ i2;
            this.editor.sendMessage(ChatFormater.color(xepboqakxm(ojsknyojsgnnxfl(), gwgmscppjekijrh(), i2)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1605895886) {
                i2 = 1137341095 ^ i2;
                this.editor.playSound(this.editor.getLocation(), Sound.ENTITY_ITEM_BREAK, 0.5f, 1.0f);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1105957880) {
                    i2 = 1391155058 ^ i2;
                    this.editor.closeInventory();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 693032858) {
                        int i3 = 1214882905 ^ i2;
                        return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1778644304 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1502141776 ^ i2)) {
                int i4 = 1045277664 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 693032858 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (993636473 ^ i2)) {
                    int i5 = 1220453687 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1605895886 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1940927023 ^ i2)) {
                        int i6 = 984389783 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1058565344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (995586270 ^ i2)) {
                            int i7 = 974584294 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1105957880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1657333976 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i8 = 1545696386 ^ i2;
        throw new IllegalAccessException();
    }

    public void handleDrag(org.bukkit.event.inventory.InventoryDragEvent r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.gui.CrateEditorGUI.handleDrag(org.bukkit.event.inventory.InventoryDragEvent, int):void");
    }

    @NotNull
    public Inventory getInventory() {
        int i = 1372564245 ^ (576637466 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1197081585) {
            int i2 = 1604808984 ^ i;
            return this.inventory;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1168012493 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1293936685 ^ i)) {
                int i3 = 1490902997 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1197081585 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2060316407 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 249918094 ^ i;
        throw new IOException();
    }

    @Generated
    public Crates getPlugin() {
        int i = 1320265620 ^ (1195637510 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1807487206) {
            int i2 = 2101344531 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1807487206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1988405276 ^ i)) {
                int i3 = 616145355 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2109482881 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (404170833 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1194833264 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Crate getCrate() {
        int i = 1965298933 ^ (932284649 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -830608536) {
            int i2 = 1541296179 ^ i;
            return this.crate;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -830608536 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (989925965 ^ i)) {
                int i3 = 1527671106 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 277834482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1815886992 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 312804467 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Player getEditor() {
        int i = 1405199741 ^ (834296413 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -938544503) {
            int i2 = 1060684453 ^ i;
            return this.editor;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 835250080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (258566420 ^ i)) {
                int i3 = 1242026511 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -938544503 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (207858178 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1468142415 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public File getCrateConfigFile() {
        int i = 15637576 ^ (1724276253 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -359196383) {
            int i2 = 1087787882 ^ i;
            return this.crateConfigFile;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -359196383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (205742333 ^ i)) {
                int i3 = 1772064746 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -333086093 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2015264089 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 965687229 ^ i;
        throw new IOException();
    }

    @Generated
    public Map<Integer, ItemStack> getSlotToItem() {
        int i = 534995986 ^ (1322068807 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1386443040) {
            int i2 = 248724909 ^ i;
            return this.slotToItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 607820872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1258329401 ^ i)) {
                int i3 = 221644543 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1386443040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (579454045 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 70049845 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isHasUnsavedChanges() {
        int i = 1712379474 ^ (804140634 ^ 1534730609);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1809445944) {
            int i2 = 1849482247 ^ i;
            return this.hasUnsavedChanges;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -440341517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1290325492 ^ i)) {
                int i3 = 364100947 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1809445944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (30141628 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1097318441 ^ i;
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
        int parseInt = 1385510917 ^ (1523705765 ^ Integer.parseInt("441662185"));
        Lfdlerj6Qz = (-1178364184) ^ new Random(8920333011273155713L).nextInt();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1866519992) {
            int i = 763001260 ^ parseInt;
            processingPlayers = new HashSet();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -76749015) {
                parseInt = 1978777352 ^ i;
                Integer[] numArr = new Integer[(byte) (1251746801 ^ parseInt)];
                byte b = (byte) (1251746797 ^ parseInt);
                byte b2 = (byte) (1251746791 ^ parseInt);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1424039786) {
                    i = 403711914 ^ parseInt;
                    numArr[b] = Integer.valueOf(b2);
                    numArr[(byte) (1384907846 ^ i)] = Integer.valueOf((byte) (1384907852 ^ i));
                    numArr[(byte) (1384907845 ^ i)] = Integer.valueOf((byte) (1384907851 ^ i));
                    numArr[(byte) (1384907844 ^ i)] = Integer.valueOf((byte) (1384907850 ^ i));
                    numArr[(byte) (1384907843 ^ i)] = Integer.valueOf((byte) (1384907849 ^ i));
                    numArr[(byte) (1384907842 ^ i)] = Integer.valueOf((byte) (1384907848 ^ i));
                    numArr[(byte) (1384907841 ^ i)] = Integer.valueOf((byte) (1384907863 ^ i));
                    byte b3 = (byte) (1384907840 ^ i);
                    byte b4 = (byte) (1384907860 ^ i);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1805639110) {
                        parseInt = 1479885326 ^ i;
                        numArr[b3] = Integer.valueOf(b4);
                        numArr[(byte) (179914305 ^ parseInt)] = Integer.valueOf((byte) (179914333 ^ parseInt));
                        numArr[(byte) (179914304 ^ parseInt)] = Integer.valueOf((byte) (179914332 ^ parseInt));
                        numArr[(byte) (179914307 ^ parseInt)] = Integer.valueOf((byte) (179914335 ^ parseInt));
                        numArr[(byte) (179914306 ^ parseInt)] = Integer.valueOf((byte) (179914334 ^ parseInt));
                        numArr[(byte) (179914309 ^ parseInt)] = Integer.valueOf((byte) (179914321 ^ parseInt));
                        numArr[(byte) (179914308 ^ parseInt)] = Integer.valueOf((byte) (179914320 ^ parseInt));
                        byte b5 = (byte) (179914311 ^ parseInt);
                        byte b6 = (byte) (179914325 ^ parseInt);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1439314504) {
                            i = 614454272 ^ parseInt;
                            numArr[b5] = Integer.valueOf(b6);
                            numArr[(byte) (774279750 ^ i)] = Integer.valueOf((byte) (774279764 ^ i));
                            numArr[(byte) (774279769 ^ i)] = Integer.valueOf((byte) (774279767 ^ i));
                            numArr[(byte) (774279768 ^ i)] = Integer.valueOf((byte) (774279766 ^ i));
                            numArr[(byte) (774279771 ^ i)] = Integer.valueOf((byte) (774279785 ^ i));
                            numArr[(byte) (774279770 ^ i)] = Integer.valueOf((byte) (774279784 ^ i));
                            numArr[(byte) (774279773 ^ i)] = Integer.valueOf((byte) (774279787 ^ i));
                            byte b7 = (byte) (774279772 ^ i);
                            byte b8 = (byte) (774279788 ^ i);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1899270729) {
                                int i2 = 650346118 ^ i;
                                numArr[b7] = Integer.valueOf(b8);
                                numArr[(byte) (149286105 ^ i2)] = Integer.valueOf((byte) (149286121 ^ i2));
                                numArr[(byte) (149286104 ^ i2)] = Integer.valueOf((byte) (149286120 ^ i2));
                                numArr[(byte) (149286103 ^ i2)] = Integer.valueOf((byte) (149286119 ^ i2));
                                numArr[(byte) (149286102 ^ i2)] = Integer.valueOf((byte) (149286118 ^ i2));
                                numArr[(byte) (149286101 ^ i2)] = Integer.valueOf((byte) (149286117 ^ i2));
                                numArr[(byte) (149286100 ^ i2)] = Integer.valueOf((byte) (149286116 ^ i2));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1194288760) {
                                    parseInt = 1153734358 ^ i2;
                                    EDITABLE_SLOTS = Arrays.asList(numArr);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1628164298) {
                                        i2 = 157812366 ^ parseInt;
                                        PLACEHOLDER_MATERIAL = Material.LIGHT_GRAY_STAINED_GLASS_PANE;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 709616826) {
                                            int i3 = 662031445 ^ i2;
                                            FILLER_MATERIAL = Material.BLACK_STAINED_GLASS_PANE;
                                            return;
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 709616826 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2088139631 ^ i2)) {
                                        int i4 = 2117324184 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1194288760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (192658031 ^ i2)) {
                                            break;
                                        }
                                    }
                                }
                                int i5 = 1650909130 ^ i2;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1805639110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (939073850 ^ i)) {
                    int i6 = 1777071528 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -76749015 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1625536181 ^ i)) {
                        int i7 = 1911608673 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1899270729 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (101873731 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i8 = 880640463 ^ i;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 300254739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1644360821 ^ parseInt)) {
                int i9 = 367012421 ^ parseInt;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1866519992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1303276806 ^ parseInt)) {
                    int i10 = 1973212058 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1424039786 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (522348026 ^ parseInt)) {
                        int i11 = 1941457579 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1439314504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1599740737 ^ parseInt)) {
                            int i12 = 1295754249 ^ parseInt;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1628164298 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (382717835 ^ parseInt)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i13 = 1321577825 ^ parseInt;
        throw new IllegalAccessException();
    }

    public static String xepboqakxm(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] gwgmscppjekijrh() {
        return new byte[]{52, 114, 70, 44, 102, 104, 20, 62, 32, 99, 26, 63, 109, 11, 28, 63, 88, 126, 14, 95, 35, 75, 8, 122, 25, 53};
    }

    private static byte[] wkwpoaikqimrgnl() {
        return new byte[]{-1, -76, 126, 60};
    }

    private static byte[] rrqrokismoqsivw() {
        return new byte[]{-5, -68, 117, 57, 86, 62, 44, 46, 21, 62, 43, 79, 94, 122, 41, 73, 110, 8, 63, 43, 16, 52};
    }

    private static byte[] fujotcfrzrryiha() {
        return new byte[0];
    }

    private static byte[] bendgnpnoczpwku() {
        return new byte[]{-5, -69, 126, 62, 85, 57, 32, 93, 17, 61, 43, 41, 85, 94, 47, 111, 108, CANCEL_BUTTON_SLOT, 63, 78, 18, 28, 48, 32, 42, 33, 0, 44, 119, 105, 87, 59, 44, 103, 19, 109};
    }

    private static byte[] jxdyzzixorpstbg() {
        return new byte[]{-5, -69, 126, 62, 85, 107, 32, 89, 17, 59, 43, 106, 85, 84, 47, 43, 108, 60, 63, 30, 18, 93, 48, 39, 42, 117, 0, 32, 119, 112, 87, 126, 44, 108, 19, 37, 46, 103, 92, 87, CANCEL_BUTTON_SLOT, 41, 96, 35, 61, 5, 23, 10, 57, 46, 40, 109, 12, 50, 117, 119, 82, CANCEL_BUTTON_SLOT, 37, 118};
    }

    private static byte[] chkiwoszefefuof() {
        return new byte[]{-5, -69, 126, 62, 85, 107, 32, 104, 17, 60, 43, 109, 85, 31, 47, 104, 108, 37, 63, 7, 18, 30, 48, 37, 42, 33, 0, 42, 119, 115, 87, 126, 44, 107, 19, 57, 46, 40, 92, 95, CANCEL_BUTTON_SLOT, 100, 96, 58, 61, 31, 23, 5, 57, 107, 40, 112, 12, 42, 117, 119, 82, 43};
    }

    private static byte[] fwuikzuofvsvplf() {
        return new byte[0];
    }

    private static byte[] vycvhxajrozcucy() {
        return new byte[]{-5, -69, 126, 62, 85, 57, 32, 93, 17, 61, 43, 41, 85, 77, 47, 110, 108, 36, 63, 1, 18, 11, 48, 43, 42, 33, 0, 36, 119, 115, 87, 126, 44, 99, 19, 35, 46, 109, 92, 87, CANCEL_BUTTON_SLOT, 51};
    }

    private static byte[] hdgxbnvghnjlnrw() {
        return new byte[]{-5, -69, 126, 62, 85, 107, 32, 74, 17, 62, 43, 96, 85, 92, 47, 96, 108, 105, 63, 1, 18, 19, 48, 110, 42, 117, 0, CANCEL_BUTTON_SLOT, 119, 120, 87, 126, 44, 99, 19, 35, 46, 109, 92, 87, CANCEL_BUTTON_SLOT, 41, 96, 62, 61, 4, 23, 92, 57, 57, 40, 102, 12, 43, 117, 119, 82, 41, 37, 106, 17, 117, 34, 98, 94, 75};
    }

    private static byte[] ktksbypysjhnaup() {
        return new byte[0];
    }

    private static byte[] ppegtdylmcxrekr() {
        return new byte[]{-5, -69, 126, 62, 85, 107, 32, 74, 17, 62, 43, 96, 85, 92, 47, 96, 108, 105, 63, 72, 18, 28, 48, 104, 42, 109, 0, 22, 119, 92, 87, 8, 44, 79, 19, 119, 46, 46, 92, 13, CANCEL_BUTTON_SLOT, 126, 96, 34, 61, 14, 23, 18, 57, 107, 40, 103, 12, 41, 117, 118, 82, 58, 37, 46};
    }

    private static byte[] vzitwzequubhjlx() {
        return new byte[]{-4, -70, 117, 51, 85, 59, 33, 47, 21, 57, CANCEL_BUTTON_SLOT, 95, 84, 121, 46, 92, 111, 14, 56, 72, 16, SAVE_BUTTON_SLOT, 59, 0, 44, 67, 1, 10, 113, 88, 95, 30, 38, 88};
    }

    private static byte[] obktibgzthbycvq() {
        return new byte[]{-5, -65, 118, 63, 86, 98, 33, 66, 25, 41, 43, 98, 93, 78, 44, CANCEL_BUTTON_SLOT, 109, 39, 55, 9, 18, 89, 56, 38, 41, 115, 1, 47, Byte.MAX_VALUE, 121, 87, 122, 36, 99, 16, 52, 47, 117, 84, 86, CANCEL_BUTTON_SLOT, CANCEL_BUTTON_SLOT, 104, 63, 62, 2, 22, 83, SAVE_BUTTON_SLOT, 35, 40, 99, 4, 35, 118, 62, 83, SAVE_BUTTON_SLOT, CANCEL_BUTTON_SLOT, 117, 17, 113, 42, 120, 93, 92, 41, 112, 97, 39, 63, 31, 19, 26};
    }

    private static byte[] wpeiblrlbucfskd() {
        return new byte[]{-7, -70, 126, 50, 82, 110, 35, 79, 16, 60, CANCEL_BUTTON_SLOT, 110, 85, 92, CANCEL_BUTTON_SLOT, 99, 106, 110, 61, 28, 27, 28, 60, 107, 46, 99, 4, 40, 113, 103, 94, 63, 37, 104, 18, 33, 41, 108, 85, 19, 40, 109, 111, 36, 62, 13, 20, 29, 48, 41, 40, 103, 6, SAVE_BUTTON_SLOT};
    }

    private static byte[] akfemivddqvsvlq() {
        return new byte[]{-7, -70, 126, 50, 82, 110, 35, 109, 16, 62, CANCEL_BUTTON_SLOT, 99, 85, 31, CANCEL_BUTTON_SLOT, 107, 106, 34, 61, 7, 27, 0, 60, 46, 46, 39, 4, 53, 113, 124, 94, 57, 37, 41, 18, 54, 41, 108, 85, 90, 40, 122, 111, 35, 62, 30};
    }

    private static byte[] yrweqnvcjczcnmw() {
        return new byte[]{-5, -66, 114, 62, 84, 103, 39, 79, 17, 59, 43, 124, 89, 75, 46, 126, 107, 106, 63, 57, 18, 20, 60, 33, 43, 121};
    }

    private static byte[] ostpiltcezmphtv() {
        return new byte[]{-8, -65, 119, 57, 81, 108, 36, 43, 23, 61, 40, 77, 94, 78, 46, 110, 107, 61, 60, 8, 18, 88, 63, 13, 41, 98, 3, 41, 116, 105, 85, 48, 38, 124};
    }

    private static byte[] kluuukrcmpigxqs() {
        return new byte[]{-5, -76, 112, 62, 84, 104, 44, 74, 22, 59, 43, 111, 91, 92, 46, 99, 96, 105, 56, 31, 18, 29, 62, 110, 43, 113, 12, 36, 112, 110, 87, 52, 34, 42, 18, 53, 34, 100, 91, 83, CANCEL_BUTTON_SLOT, 38, 110, 41, 60, 0, 27, 29, 62, 32, 40, 107, 2, 35, 116, 104};
    }

    private static byte[] npupaeysnfufhls() {
        return new byte[]{-5, -76, 112, 62, 84, 104, 44, 125, 22, 56, 43, 38, 91, 75, 46, 96, 96, 32, 56, 24, 18, 82, 62, CANCEL_BUTTON_SLOT, 43, 112, 12, 36, 112, 108, 87, 52, 34, CANCEL_BUTTON_SLOT, 18, 39, 34, 40, 91, 77, CANCEL_BUTTON_SLOT, 99, 110, 61, 60, 9, 27, 14, 62, 42, 40, Byte.MAX_VALUE};
    }

    private static byte[] okiaivajslfaoab() {
        return new byte[0];
    }

    private static byte[] fsufoghefypbfko() {
        return new byte[]{-1, -65, 118, 50, 80, 102, 32, 74, 21, 59, 40, Byte.MAX_VALUE, 85, 73, 37, 114, 105, 107, 59, 62, 19, 31, 62, 44, CANCEL_BUTTON_SLOT, 112};
    }

    private static byte[] rwswkqbpnnjxhgh() {
        return new byte[]{-14, -66, Byte.MAX_VALUE, 59, 94, 97, 39, 76, 16, 41, 41, 105, 92, 67, CANCEL_BUTTON_SLOT, 44, 110, 47, 54, 2, 26, 90, 48, 34, 42, 119, 4, 47, 117, 120, 87, 112, 37, 101, 22, 54, 34, 126, 84, 95, 36, 46, 107, 60, 62, 8, 16, 82, 57, 35, 40, 98, 2, 38, 126, 63, 95, 56, 44, 124, 19, 117, 42, 117, 94, 87, CANCEL_BUTTON_SLOT, 112, 105, 44, 56, 29, 27, 28};
    }

    private static byte[] sgwfbucyrslscgi() {
        return new byte[]{-5, -71, Byte.MAX_VALUE, 105, 85, 60, 32, 125, 24, 48, 43, 121, 84, 88, 47, 125};
    }

    private static byte[] xhucfjiwubytjbn() {
        return new byte[]{-7, -75, 112, 108, 87, 63, 36, 122, 20, SAVE_BUTTON_SLOT, 34, 123, 95, 94, 46, 124};
    }

    private static byte[] xpgivzsrwrnuqcg() {
        return new byte[]{-14, -65, 115, Byte.MAX_VALUE, 86, 50, 34, 125, 16, 62, 40, 39, 89, 82, 47, 106, 109, 33, 54, 3};
    }

    private static byte[] giyqeopikrzlysb() {
        return new byte[]{-4, -69, 116, 117, 94, 42, 36, 108, 25, 56};
    }

    private static byte[] tkqqwlpznhjjwwc() {
        return new byte[]{-4, -65, Byte.MAX_VALUE, 60, 82, 57, 36, 78, 22, 39, 40, 103, 91, 75, 44, 106, 107, 104, 56, 31, 26, 24, 60, 61, 41, 103, 2, 54, 116, 113, 80, 47, 36, 46, 19, 38, 44, 108, 84, 75, 40, 106, 104, 41, 56, 73, 17, 1, 62, 59, 41, 102, 7, 39, 112, 123, 95, CANCEL_BUTTON_SLOT, 32, 125, 16, 54, 44, 124, 95, 94, 42, 103, 104, 55, 61, 72};
    }

    private static byte[] ldzmyrssuuhpnui() {
        return new byte[]{-7, -68, 113, 110, 87, 61, 37, 97, 20, 36};
    }

    private static byte[] ojsknyojsgnnxfl() {
        return new byte[]{-5, -71, 118, 51, 94, 60, 33, 74, 21, 59, 43, 106, 93, 92, 36, 111, 109, 44, 59, 28, 18, 95, 56, 39, 33, 107, 1, 54, 115, Byte.MAX_VALUE, 87, 61, 36, 117, 24, 48, 47, 109, 88, 95, CANCEL_BUTTON_SLOT, 37};
    }

    private static int fuwimtuxevfpwlbl(int i, int i2) {
        return i2 ^ i;
    }
}
