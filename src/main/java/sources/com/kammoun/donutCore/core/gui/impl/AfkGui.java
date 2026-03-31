package com.kammoun.donutCore.core.gui.impl;

import com.kammoun.donutCore.core.CorePlugin;
import com.kammoun.donutCore.core.gui.AbstractGui;
import com.kammoun.donutCore.core.models.SpawnData;
import com.kammoun.donutCore.core.utils.ColorFormater;
import com.kammoun.donutCore.core.utils.ItemBuilder;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.managers.RegionManager;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class AfkGui extends AbstractGui {
    private final Map<Player, Object[]> opened;
    private static int jRqJeKBEiz = 0;
    private transient int TC0sIiiVig = 1727934328;
    private static String[] nothing_to_see_here = new String[15];

    public AfkGui(CorePlugin corePlugin, int i) {
        super(corePlugin, 541483473);
        hwydmtbnlreqmplg(2062342655 ^ 385647711, 1603373332);
        int parseInt = 2145236095 ^ (2070246610 ^ Integer.parseInt("926487577"));
        this.TC0sIiiVig = 1727934328 ^ jRqJeKBEiz;
        this.opened = new HashMap();
        int i2 = 418124625 ^ (594325773 ^ (1147814615 ^ parseInt));
    }

    @Override
    public void click(com.kammoun.donutCore.core.gui.WrappedClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.AfkGui.click(com.kammoun.donutCore.core.gui.WrappedClickEvent, int):void");
    }

    @Override
    public Inventory generateInventory(Player player, Object[] objArr, int i) {
        int hwydmtbnlreqmplg;
        byte b;
        int i2;
        int i3 = 1659387358 ^ (1896193791 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 308018953) {
            i3 = 873052711 ^ i3;
            if (objArr.length <= (373474758 ^ i3)) {
                hwydmtbnlreqmplg = hwydmtbnlreqmplg(i3, 870586653);
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1307169232) {
                int i4 = 1783172275 ^ i3;
                if ((objArr[(byte) (2081147253 ^ i4)] instanceof Integer) == (2081147253 ^ i4)) {
                    hwydmtbnlreqmplg = 1504515502 ^ i4;
                } else {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -530691157) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -530691157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (666218507 ^ i4)) {
                                break;
                            }
                        }
                        int i5 = 2109795607 ^ i4;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 1339228477 ^ i4;
                    b = ((Integer) objArr[(byte) (869845064 ^ i2)]).intValue();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1631174079) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1631174079 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (716304110 ^ i2)) {
                                break;
                            }
                        }
                        int i6 = 1038166778 ^ i2;
                        throw new RuntimeException("double");
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                            case 74725331:
                                i2 = 1479167677 ^ i2;
                            case 499062136:
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2) != 19238536) {
                                        throw null;
                                    }
                                    throw new RuntimeException();
                                } catch (RuntimeException e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -1413676735:
                                            i2 = hwydmtbnlreqmplg(i2, 1302294095);
                                            break;
                                        case 1603549099:
                                            i2 = 320489618 ^ i2;
                                            break;
                                        default:
                                            throw new IOException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -951684293) {
                                        i2 = 810929208 ^ i2;
                                        break;
                                    }
                                }
                                break;
                            case 1046891029:
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -375462646 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1388885734 ^ i2)) {
                            int i7 = 838157874 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 920661747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1160859353 ^ i2)) {
                                int i8 = 257452387 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1172837114 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (522793102 ^ i2)) {
                                    int i9 = 2123486283 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -951684293 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1708939563 ^ i2)) {
                                        int i10 = 910766501 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 711792658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (938750965 ^ i2)) {
                                            int i11 = 1003846092 ^ i2;
                                            throw new IllegalAccessException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b = (byte) (631692507 ^ hwydmtbnlreqmplg);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hwydmtbnlreqmplg) != 758572761) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hwydmtbnlreqmplg) == 758572761 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(hwydmtbnlreqmplg) == (89762631 ^ hwydmtbnlreqmplg)) {
                        break;
                    }
                }
                int i12 = 1005606831 ^ hwydmtbnlreqmplg;
                throw new IllegalAccessException("double");
            }
            i2 = 1830542980 ^ hwydmtbnlreqmplg;
            byte b2 = b;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1172837114) {
                i2 = 778110849 ^ i2;
                FileConfiguration afkGuiConfig = plugin(1313228421).getConfigurationManager(2125977720).getAfkGuiConfig(373755197);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 920661747) {
                    i2 = 596747996 ^ i2;
                    Inventory createInventory = Bukkit.createInventory((InventoryHolder) null, (byte) (1162715956 ^ i2), ColorFormater.hex(afkGuiConfig.getString(ueoeyovkcv(nwolkycftnmfvnv(), xeulhsqfahtiljr(), i2), ueoeyovkcv(rfrhlsrdtcubats(), xeulhsqfahtiljr(), i2))));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 711792658) {
                        i3 = 1917359080 ^ i2;
                        int maxPlayersPerAfk = plugin(1313228421).getCoreSettings(836036925).getMaxPlayersPerAfk(1616259202);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1205237935) {
                            int i13 = 1445134658 ^ i3;
                            List list = plugin(1313228421).getAfkConfig(787593477).getAfkDataMap(1777698461).entrySet().stream().toList();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 154242371) {
                                int i14 = 103726267 ^ i13;
                                populateAfkItems(createInventory, list, b2, maxPlayersPerAfk, afkGuiConfig, player, 1076858314);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 944007323) {
                                    int i15 = 1269328399 ^ i14;
                                    addNavigationItems(createInventory, b2, list, afkGuiConfig, 1335074486);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1694972129) {
                                        int i16 = 1763132733 ^ i15;
                                        addRandomAfkItem(createInventory, afkGuiConfig, 417849639);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 767365386) {
                                            int i17 = 411336320 ^ i16;
                                            return createInventory;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 767365386 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (1470412240 ^ i16)) {
                                                int i18 = 150302324 ^ i16;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == 1694972129 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (813242216 ^ i15)) {
                                                int i19 = 2126249057 ^ i15;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 944007323 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (5167759 ^ i14)) {
                                            int i20 = 2093297773 ^ i14;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1603549099 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (228074736 ^ i14)) {
                                                int i21 = 1342990941 ^ i14;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 154242371 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1519517583 ^ i13)) {
                                        int i22 = 1224554381 ^ i13;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -375462646) {
                    int i72 = 838157874 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 920661747) {
                        continue;
                    } else {
                        int i82 = 257452387 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1172837114) {
                            continue;
                        } else {
                            int i92 = 2123486283 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -951684293) {
                                continue;
                            } else {
                                int i102 = 910766501 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 711792658) {
                                    int i112 = 1003846092 ^ i2;
                                    throw new IllegalAccessException();
                                }
                                continue;
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1307169232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1086732643 ^ i3)) {
                int i23 = 1223908682 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1205237935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1034090167 ^ i3)) {
                    int i24 = 1005037707 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 308018953 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (994446905 ^ i3)) {
                        int i25 = 1442789981 ^ i3;
                        throw new IllegalAccessException("double");
                    }
                }
            }
        }
    }

    private void populateAfkItems(org.bukkit.inventory.Inventory r9, java.util.List r10, int r11, int r12, org.bukkit.configuration.file.FileConfiguration r13, org.bukkit.entity.Player r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.AfkGui.populateAfkItems(org.bukkit.inventory.Inventory, java.util.List, int, int, org.bukkit.configuration.file.FileConfiguration, org.bukkit.entity.Player, int):void");
    }

    private ItemStack createAfkItem(int i, int i2, int i3, boolean z, FileConfiguration fileConfiguration, int i4) {
        int i5 = 1654210939 ^ (550136899 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1615884349) {
            i5 = 1388744186 ^ i5;
            if (i2 < i3) {
                hwydmtbnlreqmplg(i5, 207648523);
                return createAvailableAfkItem(i, i2, i3, z, fileConfiguration, 340662617);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 161210385) {
                int i6 = 112775244 ^ i5;
                return createMaxedAfkItem(i, i2, i3, fileConfiguration, 1293250706);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1615884349 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (757501751 ^ i5)) {
                int i7 = 666014336 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1788368969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (490265840 ^ i5)) {
                    int i8 = 142827088 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 161210385 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (301808241 ^ i5)) {
                        break;
                    }
                }
            }
        }
        int i9 = 50001196 ^ i5;
        throw new RuntimeException();
    }

    private ItemStack createMaxedAfkItem(int i, int i2, int i3, FileConfiguration fileConfiguration, int i4) {
        int i5 = 1772769182 ^ (673512769 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -2126286597) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2126286597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (447356074 ^ i5)) {
                    break;
                }
            }
            int i6 = 98549598 ^ i5;
            throw new IllegalAccessException("double");
        }
        int i7 = 2024538179 ^ i5;
        Material valueOf = Material.valueOf(fileConfiguration.getString(ueoeyovkcv(jqczaqztalbkzaz(), xeulhsqfahtiljr(), i7)));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1143173856) {
            int i8 = 1844757772 ^ i7;
            String string = fileConfiguration.getString(ueoeyovkcv(psdcxqhuapddhsw(), xeulhsqfahtiljr(), i8));
            String ueoeyovkcv = ueoeyovkcv(ayzuywfknatnvrd(), xeulhsqfahtiljr(), i8);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 730159747) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 730159747 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (123325016 ^ i8)) {
                        break;
                    }
                }
                int i9 = 1857891456 ^ i8;
                throw new IOException("double");
            }
            int i10 = 1100919137 ^ i8;
            String replace = string.replace(ueoeyovkcv, String.valueOf(i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 661705097) {
                int i11 = 670673509 ^ i10;
                Stream stream = fileConfiguration.getStringList(ueoeyovkcv(vzjjvdpjyirctuh(), xeulhsqfahtiljr(), i11)).stream();
                Function function = str -> {
                    int i12 = 1127715691 ^ (821980596 ^ 1465447352);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 612920121) {
                        int i13 = 1036567979 ^ i12;
                        String replace2 = str.replace(ueoeyovkcv(qsxhborqnaxkxgp(), xeulhsqfahtiljr(), i13), String.valueOf(i2));
                        String ueoeyovkcv2 = ueoeyovkcv(jtgrxybloxgnbrf(), xeulhsqfahtiljr(), i13);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) != -892451232) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == -892451232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (601098602 ^ i13)) {
                                    break;
                                }
                            }
                            int i14 = 1940039760 ^ i13;
                            throw new IllegalAccessException("double");
                        }
                        i12 = 861362152 ^ i13;
                        String replace3 = replace2.replace(ueoeyovkcv2, String.valueOf(i3));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1349843233) {
                            int i15 = 1832634899 ^ i12;
                            return replace3;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 612920121 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (220239373 ^ i12)) {
                            int i16 = 1181453119 ^ i12;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1349843233 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1654240863 ^ i12)) {
                                break;
                            }
                        }
                    }
                    int i17 = 527791673 ^ i12;
                    throw new IllegalAccessException();
                };
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 415072928) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 415072928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (17226254 ^ i11)) {
                            break;
                        }
                    }
                    int i12 = 329872369 ^ i11;
                    throw new RuntimeException("double");
                }
                i7 = 765599364 ^ i11;
                Stream map = stream.map(function);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1974302337) {
                    i10 = 2084195962 ^ i7;
                    List list = (List) map.collect(Collectors.toList());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1803614894) {
                        i7 = 1773370473 ^ i10;
                        ItemBuilder itemBuilder = new ItemBuilder(valueOf);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -639310311) {
                            int i13 = 1476275412 ^ i7;
                            ItemBuilder name = itemBuilder.name(ColorFormater.hex(replace), 1646492606);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1712685243) {
                                i13 = 542027109 ^ i13;
                                ItemBuilder defLore = name.defLore(ColorFormater.hex(list, 185435491), 685184902);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1684073362) {
                                    i10 = 1776657477 ^ i13;
                                    ItemStack build = defLore.build(891921829);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 726518201) {
                                        int i14 = 1889570499 ^ i10;
                                        return build;
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1684073362 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (1334709557 ^ i13)) {
                                    int i15 = 1170776216 ^ i13;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1712685243 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (264828751 ^ i13)) {
                                        break;
                                    }
                                }
                            }
                            int i16 = 180491663 ^ i13;
                            throw new IOException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -1803614894 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1159213053 ^ i10)) {
                    int i17 = 665983513 ^ i10;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 726518201 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1442633699 ^ i10)) {
                        int i18 = 175047130 ^ i10;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 661705097 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (124618772 ^ i10)) {
                            break;
                        }
                    }
                }
            }
            int i19 = 599160918 ^ i10;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1370898526 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (106606195 ^ i7)) {
                int i20 = 269532328 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1974302337 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1222392590 ^ i7)) {
                    int i21 = 844908246 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -639310311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1784166230 ^ i7)) {
                        int i22 = 113570383 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1143173856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1143895564 ^ i7)) {
                            break;
                        }
                    }
                }
            }
        }
        int i23 = 1688115054 ^ i7;
        throw new IOException();
    }

    private org.bukkit.inventory.ItemStack createAvailableAfkItem(int r6, int r7, int r8, boolean r9, org.bukkit.configuration.file.FileConfiguration r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.AfkGui.createAvailableAfkItem(int, int, int, boolean, org.bukkit.configuration.file.FileConfiguration, int):org.bukkit.inventory.ItemStack");
    }

    private void addNavigationItems(org.bukkit.inventory.Inventory r5, int r6, java.util.List r7, org.bukkit.configuration.file.FileConfiguration r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.AfkGui.addNavigationItems(org.bukkit.inventory.Inventory, int, java.util.List, org.bukkit.configuration.file.FileConfiguration, int):void");
    }

    private void addRandomAfkItem(Inventory inventory, FileConfiguration fileConfiguration, int i) {
        int i2 = 1937679671 ^ (1522151730 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1022212568) {
            i2 = 970920703 ^ i2;
            ItemBuilder itemBuilder = new ItemBuilder(Material.valueOf(fileConfiguration.getString(ueoeyovkcv(gutqsyxqnhbpnhm(), xeulhsqfahtiljr(), i2))));
            String ueoeyovkcv = ueoeyovkcv(mampuwyrdmcogyw(), xeulhsqfahtiljr(), i2);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 233492945) {
                int i3 = 1244763133 ^ i2;
                ItemBuilder name = itemBuilder.name(ColorFormater.hex(fileConfiguration.getString(ueoeyovkcv)), 1646492606);
                String ueoeyovkcv2 = ueoeyovkcv(kxwbvgnlwhyajdb(), xeulhsqfahtiljr(), i3);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1550208571) {
                    int i4 = 21610059 ^ i3;
                    ItemBuilder defLore = name.defLore(ColorFormater.hex(fileConfiguration.getStringList(ueoeyovkcv2), 185435491), 685184902);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1445706851) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1445706851 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (592569405 ^ i4)) {
                                break;
                            }
                        }
                        int i5 = 1924166892 ^ i4;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 622791385 ^ i4;
                    ItemStack build = defLore.build(891921829);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2127817386) {
                        i3 = 1199677048 ^ i2;
                        inventory.setItem((byte) (140239644 ^ i3), build);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1121917288) {
                            int i6 = 674841684 ^ i3;
                            return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1550208571 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (567099876 ^ i3)) {
                        int i7 = 1083456318 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1121917288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (644711854 ^ i3)) {
                            break;
                        }
                    }
                }
                int i8 = 486240514 ^ i3;
                throw new IllegalAccessException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 51723209 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1495766680 ^ i2)) {
                int i9 = 951729642 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2127817386 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (460335543 ^ i2)) {
                    int i10 = 660741296 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 233492945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (684281421 ^ i2)) {
                        int i11 = 31279055 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1022212568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1212273955 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = 92866297 ^ i2;
        throw new IllegalAccessException();
    }

    private void handleRandomAfkTeleport(Player player, int i) {
        int i2 = 1552839974 ^ (787118655 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 504798922) {
            int i3 = 2007396211 ^ i2;
            Map afkDataMap = plugin(1313228421).getAfkConfig(787593477).getAfkDataMap(1777698461);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1557797551) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1557797551 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (342096930 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1123760431 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 17389518 ^ i3;
            if (afkDataMap.isEmpty() == (896396132 ^ i2)) {
                i2 = hwydmtbnlreqmplg(i2, 1744091976);
                List list = afkDataMap.keySet().stream().toList();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1798667934) {
                    int i5 = 920630675 ^ i2;
                    int random = (int) (Math.random() * list.size());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 574041595) {
                        i5 = 1559733203 ^ i5;
                        SpawnData spawnData = (SpawnData) afkDataMap.get(list.get(random));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -980798623) {
                            int i6 = 660983722 ^ i5;
                            if (spawnData == null) {
                                int i7 = 1939144839 ^ i6;
                                return;
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -22786512) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -22786512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1332992520 ^ i6)) {
                                        break;
                                    }
                                }
                                int i8 = 291460736 ^ i6;
                                throw new RuntimeException("double");
                            }
                            i5 = 1771587526 ^ i6;
                            player.closeInventory();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1301909501) {
                                int i9 = 2002863160 ^ i5;
                                plugin(1313228421).getTeleportCountdown(430735881).teleportWithCountdown(player, spawnData.getSpawnLocation(253111385).getLocation(1859864587), 1138368260);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 158093760) {
                                    int i10 = 1835795321 ^ i9;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 158093760 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1215403214 ^ i9)) {
                                        break;
                                    }
                                }
                                int i11 = 1992234547 ^ i9;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 574041595 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2060181942 ^ i5)) {
                            int i12 = 1168978274 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -980798623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1031212617 ^ i5)) {
                                int i13 = 430074541 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -883911336 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (610843769 ^ i5)) {
                                    int i14 = 443143173 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1301909501 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (729464663 ^ i5)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i15 = 740273321 ^ i5;
                    throw new RuntimeException("double");
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1418765535) {
                int i16 = 665708558 ^ i2;
                plugin(1313228421).getMessageSender(1613368349).sendMessage(player, ueoeyovkcv(lruxzowscmkijou(), xeulhsqfahtiljr(), i16), new String[(byte) (314573674 ^ i16)], 1707865585);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -1778377904) {
                    int i17 = 195695041 ^ i16;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -1778377904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (867834187 ^ i16)) {
                        break;
                    }
                }
                int i18 = 1626602551 ^ i16;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 504798922 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1101616542 ^ i2)) {
                int i19 = 1556230225 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1798667934 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (684271700 ^ i2)) {
                    int i20 = 2067844859 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1418765535 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (507044358 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i21 = 2102378919 ^ i2;
        throw new IOException();
    }

    private void handleAfkTeleport(org.bukkit.entity.Player r7, com.kammoun.donutCore.core.models.SpawnData r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.AfkGui.handleAfkTeleport(org.bukkit.entity.Player, com.kammoun.donutCore.core.models.SpawnData, int):void");
    }

    private int getPlayersInRegion(String str, String str2, int i) {
        int i2 = 293142122 ^ (1146672765 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 607626939) {
            int i3 = 1487849811 ^ i2;
            int i4 = i3;
            try {
                RegionContainer regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -515773407) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -515773407 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (726558977 ^ i4)) {
                            int i5 = 1562292939 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2081593192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1177236953 ^ i4)) {
                                break;
                            }
                        }
                    }
                    int i6 = 1862358465 ^ i4;
                    throw new IOException("double");
                }
                i2 = 1347591445 ^ i4;
                RegionManager regionManager = regionContainer.get(BukkitAdapter.adapt(Bukkit.getWorld(str2)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1674904715) {
                    i2 = 13663089 ^ i2;
                    if (regionManager != null) {
                        i3 = 858045358 ^ i2;
                        i2 = i3;
                        try {
                            ProtectedRegion region = regionManager.getRegion(str);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -59571598) {
                                int i7 = 1507839844 ^ i2;
                                if (region == null) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 848132432) {
                                        i2 = 1423839001 ^ i7;
                                        byte b = (byte) (1385144371 ^ i2);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1803746918) {
                                            i2 = 1123159328 ^ i2;
                                            return b;
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1309698643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1552510538 ^ i7)) {
                                            int i8 = 467124209 ^ i7;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1833466434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1751132875 ^ i7)) {
                                                int i9 = 561140321 ^ i7;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 848132432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1869154571 ^ i7)) {
                                                    int i10 = 935744113 ^ i7;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1551165833 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1665664085 ^ i7)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int i11 = 914211401 ^ i7;
                                    throw new IllegalAccessException("double");
                                }
                                i3 = 1274585186 ^ i7;
                                i7 = i3;
                                try {
                                    Stream stream = Bukkit.getOnlinePlayers().stream();
                                    Predicate predicate = player -> {
                                        int i12 = 1907220156 ^ (1387281586 ^ 1465447352);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1574400589) {
                                            int i13 = 732886788 ^ i12;
                                            return player.getWorld().getName().equals(str2);
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1574400589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1564752737 ^ i12)) {
                                                int i14 = 95536852 ^ i12;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -10537582 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (236447676 ^ i12)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i15 = 481072073 ^ i12;
                                        throw new IllegalAccessException();
                                    };
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1833466434) {
                                        int i12 = 1957533575 ^ i7;
                                        Stream filter = stream.filter(predicate);
                                        Predicate predicate2 = player2 -> {
                                            int i13 = 1425445607 ^ (1870719943 ^ 1465447352);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1635013827) {
                                                int i14 = 50991955 ^ i13;
                                                return region.contains(BukkitAdapter.asBlockVector(player2.getLocation()));
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 2032455259 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (153866964 ^ i13)) {
                                                    int i15 = 2140484057 ^ i13;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1635013827 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (873905778 ^ i13)) {
                                                        break;
                                                    }
                                                }
                                            }
                                            int i16 = 1498679762 ^ i13;
                                            throw new IOException();
                                        };
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != -937113991) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -937113991 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1819676838 ^ i12)) {
                                                    break;
                                                }
                                            }
                                            int i13 = 1132003696 ^ i12;
                                            throw new IOException("double");
                                        }
                                        i2 = 348542804 ^ i12;
                                        Stream filter2 = filter.filter(predicate2);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1846967513) {
                                            int i14 = 977302030 ^ i2;
                                            int count = (int) filter2.count();
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1139413848) {
                                                i7 = 1181233477 ^ i14;
                                                return count;
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -1139413848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (357686758 ^ i14)) {
                                                    break;
                                                }
                                            }
                                            int i15 = 2014189293 ^ i14;
                                            throw new IOException("double");
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1309698643) {
                                            int i82 = 467124209 ^ i7;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1833466434) {
                                                int i92 = 561140321 ^ i7;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 848132432) {
                                                    int i102 = 935744113 ^ i7;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1551165833) {
                                                        break;
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                    int i112 = 914211401 ^ i7;
                                    throw new IllegalAccessException("double");
                                } catch (Exception e) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                        case -1139413848:
                                            i2 = 1830752892 ^ i7;
                                            break;
                                        case -937113991:
                                            i2 = 1134114598 ^ i7;
                                            break;
                                        case 1833466434:
                                            i2 = 926195873 ^ i7;
                                            break;
                                        case 1846967513:
                                            i2 = hwydmtbnlreqmplg(i7, 1465868402);
                                            break;
                                        default:
                                            throw new IllegalAccessException("Error in hash");
                                    }
                                    ?? r22 = i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -722632885) {
                                        int i16 = 1626216784 ^ i2;
                                        plugin(1313228421).getLogger(583940502).warning("Error counting players in region " + str + ": " + r22.getMessage());
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -744639032) {
                                            return (byte) (730766641 ^ (838675336 ^ i16));
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -744639032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (1816748854 ^ i16)) {
                                                int i17 = 1743062152 ^ i16;
                                                throw new RuntimeException("double");
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1674904715) {
                                            int i18 = 1123855794 ^ i2;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1700192003) {
                                                continue;
                                            } else {
                                                int i19 = 695971811 ^ i2;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -722632885) {
                                                    continue;
                                                } else {
                                                    int i20 = 1048655683 ^ i2;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -59571598) {
                                                        continue;
                                                    } else {
                                                        int i21 = 123206272 ^ i2;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 658257881) {
                                                            continue;
                                                        } else {
                                                            int i22 = 1158720060 ^ i2;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1803746918) {
                                                                continue;
                                                            } else {
                                                                int i23 = 702103569 ^ i2;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1846967513) {
                                                                    continue;
                                                                } else {
                                                                    int i24 = 1456501695 ^ i2;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 607626939) {
                                                                        int i25 = 1568829128 ^ i2;
                                                                        throw new IOException();
                                                                    }
                                                                    continue;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                case -1803746918:
                                    i2 = 672272346 ^ i2;
                                    break;
                                case -59571598:
                                    i2 = hwydmtbnlreqmplg(i2, 622055335);
                                    break;
                                case 848132432:
                                    i2 = hwydmtbnlreqmplg(i2, 2093744323);
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1700192003) {
                        i2 = 1213029659 ^ i2;
                        byte b2 = (byte) (619153147 ^ i2);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 658257881) {
                            i4 = 1294306225 ^ i2;
                            return b2;
                        }
                    }
                }
            } catch (Exception e3) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e3)) {
                    case -515773407:
                        i2 = 1186304621 ^ i4;
                        break;
                    case 658257881:
                        i2 = hwydmtbnlreqmplg(i4, 1585064210);
                        break;
                    case 1674904715:
                        i2 = hwydmtbnlreqmplg(i4, 384241528);
                        break;
                    case 1700192003:
                        i2 = 372732937 ^ i4;
                        break;
                    default:
                        throw new RuntimeException("Error in hash");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1674904715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1613241446 ^ i2)) {
                int i182 = 1123855794 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1700192003 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (50260682 ^ i2)) {
                    int i192 = 695971811 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -722632885 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (193509569 ^ i2)) {
                        int i202 = 1048655683 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -59571598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1926966121 ^ i2)) {
                            int i212 = 123206272 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 658257881 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1243107919 ^ i2)) {
                                int i222 = 1158720060 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1803746918 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (128370184 ^ i2)) {
                                    int i232 = 702103569 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1846967513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2050478040 ^ i2)) {
                                        int i242 = 1456501695 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 607626939 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (423852059 ^ i2)) {
                                            int i252 = 1568829128 ^ i2;
                                            throw new IOException();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean isPlayerInRegion(org.bukkit.entity.Player r6, java.lang.String r7, java.lang.String r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.AfkGui.isPlayerInRegion(org.bukkit.entity.Player, java.lang.String, java.lang.String, int):boolean");
    }

    @Override
    public boolean isInGUI(Player player) {
        int i = 184049378 ^ (355918228 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1933778353) {
            int i2 = 2133930927 ^ i;
            return this.opened.containsKey(player);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1933778353 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1002181719 ^ i)) {
                int i3 = 320778090 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1966440246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1463361238 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 2045885773 ^ i;
        throw new RuntimeException();
    }

    @Override
    public void remove(Player player, int i) {
        int i2 = 648437917 ^ (1284154101 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -598674110) {
            i2 = 608566177 ^ i2;
            this.opened.remove(player);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -25221045) {
                int i3 = 190281941 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -598674110 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1000656364 ^ i2)) {
                int i4 = 450879353 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -25221045 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1415131971 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1903148869 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void addToOpened(Player player, Object[] objArr, int i) {
        int i2 = 1358680040 ^ (1206000485 ^ 833019072);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 905462377) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 905462377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1711421981 ^ i2)) {
                    int i3 = 317140536 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1137672723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (324878699 ^ i2)) {
                        break;
                    }
                }
            }
            int i4 = 405082676 ^ i2;
            throw new IllegalAccessException();
        }
        int i5 = 494313770 ^ i2;
        this.opened.put(player, objArr);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -565359815) {
            int i6 = 1404066085 ^ i5;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -565359815 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1939276446 ^ i5)) {
                break;
            }
        }
        int i7 = 1218601381 ^ i5;
        throw new IOException("double");
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
        jRqJeKBEiz = 1404880690 ^ new Random(-2739365268214493029L).nextInt();
    }

    public static String ueoeyovkcv(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] xeulhsqfahtiljr() {
        return new byte[]{8, 97, 97, 14, 56, 72, 6, 54, 21, 89, 64, 115, 25, 14, 70, 98, 85, 112, 24, 25, 48, 43, 46, 45, 50, 89, 33, 2, 80, 98, 125, 86, 79, 10, 3, 69, 32, 25, 9, 14, 33, 19, 126, 84, 4, 115, 48, 126, 120, 105, 48, 67, 45, 126, 15, 19, 8, 68, 107, 25, 53, 11, 13, 67, 109, 103, 35, 107, 10, 91, 20, 82, 9, 117, 52, 32, 115, 41, 125, 116, 117};
    }

    private static byte[] ieyetkzzikdoekl() {
        return new byte[]{-50, -81, 81, 28, 0, 19, 49, 119, 35, 19, 113, 49, 46, 83, 126, 59, 97, 50, 32, 119, 0, 108, 22, 121, 5, 12, 23, 67, 97, 55, 74, 28, 119, 78, 55, 86};
    }

    private static byte[] mnmmzzgisbxxphk() {
        return new byte[]{-50, -81, 81, 28, 0, 29, 49, 99, 35, 25, 113, 28, 46, 70, 126, 57, 97, 39, 32, 81, 0, 121, 22, 103, 5, 30, 23, 31};
    }

    private static byte[] qsxhborqnaxkxgp() {
        return new byte[]{-62, -84, 84, 24, 9, 31, 51, 115, 45, 31, 114, 52, 42, 90, 114, 57, 101, 60, 44, 116, 5, 104, 31, 117, 7, 8, 25, 79, 98, 50, 78, 21, 123, 76, 51, 88};
    }

    private static byte[] jtgrxybloxgnbrf() {
        return new byte[]{-62, -84, 84, 24, 9, 17, 51, 103, 45, 21, 114, 25, 42, 79, 114, 59, 101, 41, 44, 82, 5, 125, 31, 107, 7, 26, 25, 19};
    }

    private static byte[] nwolkycftnmfvnv() {
        return new byte[]{-57, -81, 87, 72, 15, 16, 51, 123, 37, 3, 113, 39};
    }

    private static byte[] rfrhlsrdtcubats() {
        return new byte[0];
    }

    private static byte[] jqczaqztalbkzaz() {
        return new byte[]{-57, -86, 83, 95, 1, 10, 49, 96, 39, 5, 116, 50, 33, 25, 112, 56, 102, 35, 41, 85, 2, 118, 23, Byte.MAX_VALUE, 5, 71, 19, 67, 100, 60, 69, 14, 121, 68, 48, 18, 17, 95, 59, 69, 24, 11, 73, 10, 54, 35, 4, 56, 64, 53, 6, 6, 30, 37, 62, 70, 58, 16};
    }

    private static byte[] vzjjvdpjyirctuh() {
        return new byte[]{-61, -81, 89, 95, 12, 13, 55, 101, 32, 5, 120, 56, 45, 17, 119, 57, 96, 32, 32, 89, 4, Byte.MAX_VALUE, 31, Byte.MAX_VALUE, 7, 69, 25, 74, 100, 63, 76, 1, 122, 66, 59, 24, 20, 90, 56, 75, 20, 12, 70, 0, 48, 45, 1, 58, 77, 61};
    }

    private static byte[] psdcxqhuapddhsw() {
        return new byte[]{-57, -87, 81, 86, 0, 4, 52, 100, 37, 0, 113, 55, 41, 17, 126, 55, 103, 38, 40, 85, 1, 121, 30, 120, 10, 76, 19, 69, 96, 58, 76, 0, Byte.MAX_VALUE, 66, 59, 24, 18, 92, 57, 73, 16, 10, 78, 1, 60, 34, 2, 58, 72, 45, 1, 24, 29, 46, 55, 82, 58, 61, 91, 76, 4, 81, 61, 23};
    }

    private static byte[] ayzuywfknatnvrd() {
        return new byte[]{-57, -87, 81, 26, 0, 30, 52, 116, 37, 0, 113, 38, 41, 90, 126, 40, 103, 98};
    }

    private static byte[] nicosehwhijgohr() {
        return new byte[]{-60, -87, 82, 86, 0, 8, 51, 103, 38, 6, 119, 51, 40, 24, 114, 54, 97, 37, 42, 69, 3, 52, 22, 117, 7, 2, 18, 66, 103, 52};
    }

    private static byte[] aceletdbkukyvex() {
        return new byte[]{-57, -86, 84, 86, 13, 15, 55, 106, 35, 5, 116, 53, 40, 21, 117, 50, 108, 32, 41, 70, 5, 52, 27, 122, 3, 9, 23, 64, 100, 39, 76, 15, 124, 90, 58, 10, 17, 99, 60, 94, 20, 77, 79, 8};
    }

    private static byte[] geblupogbiatwuz() {
        return new byte[]{-57, -86, 84, 26, 13, 21, 55, 122, 35, 5, 116, 36, 40, 94, 117, 33, 108, 99};
    }

    private static byte[] lxbrisnvztcoado() {
        return new byte[]{-63, -84, 87, 82, 12, 14, 54, 102, 34, 3, 114, 54, 44, 20, 116, 48, 96, 38, 47, 72, 6, 117, 26, 49, 2, 0, 22, 90, 98, 38, 72, 7};
    }

    private static byte[] zzbkvaajtgracyq() {
        return new byte[]{-57, -81, 87, 82, 10, 9, 62, 97, 36, 12, 113, 49, 47, 21, 116, 57, 109, 39, 41, 89, 1, 110, 24, 54, 0, 0, 25, 95, 97, 40, 76, 2};
    }

    private static byte[] cinugmwxepxkuml() {
        return new byte[]{-57, -81, 87, 86, 10, 15, 54, 103, 37, 3, 113, 49, 47, 17, 116, 51, 101, 37, 40, 77, 1, 113, 24, 50, 0, 7, 17, 87, 96, 33, 76, 2, 121, 73, 49, 31, 16, 76, 57, 85};
    }

    private static byte[] pwtpsggbsoggnej() {
        return new byte[]{-57, -81, 87, 86, 10, 15, 54, 103, 37, 3, 113, 49, 47, 17, 116, 51, 101, 37, 40, 77, 1, 113, 24, 50, 0, 14, 17, 95, 96, 38, 76, 23, 121, 87, 49, 23, 16, 84, 57, 119, 16, 67, 72, 8, 54, 37};
    }

    private static byte[] rtvijkeesdaqqrz() {
        return new byte[]{-57, -84, 87, 84, 9, 15, 55, 99, 37, 3, 113, 50, 47, 19, 119, 63, 100, 37, 40, 86, 1, 109, 24, 48, 3, 7, 16, 83, 96, 33, 76, 1, 121, 75, 50, 31, 17, 72, 57, 85};
    }

    private static byte[] poarrnktoremfcb() {
        return new byte[]{-57, -84, 87, 84, 9, 15, 55, 99, 37, 3, 113, 50, 47, 19, 119, 63, 100, 37, 40, 86, 1, 109, 24, 48, 3, 14, 16, 91, 96, 38, 76, 20, 121, 85, 50, 23, 17, 80, 57, 119, 16, 64, 72, 10, 53, 37};
    }

    private static byte[] gutqsyxqnhbpnhm() {
        return new byte[]{-61, -88, 87, 87, 13, 11, 51, 96, 37, 1, 118, 54, 41, 21, 113, 37, 102, 33, 45, 65, 6, Byte.MAX_VALUE, 27, 117, 7, 7, 17, 26, 102, 53, 77, 5, 120, 84, 48, 91, 21, 66, 63, 95, 20, 80, 75, 2, 52, 52, 6, 33, 72, 61, 7, 26};
    }

    private static byte[] mampuwyrdmcogyw() {
        return new byte[]{-61, -88, 87, 87, 13, 11, 51, 96, 37, 1, 118, 54, 41, 21, 113, 37, 102, 33, 45, 65, 6, Byte.MAX_VALUE, 27, 117, 7, 7, 17, 26, 102, 53, 77, 5, 120, 84, 48, 91, 21, 75, 63, 87, 20, 87, 75, 23, 52, 42, 6, 41, 72, 37, 7, 56, 30, 47, 58, 72, 62, 17};
    }

    private static byte[] kxwbvgnlwhyajdb() {
        return new byte[]{-57, -90, 81, 83, 11, 4, 62, 107, 37, 3, 113, 56, 41, 20, 117, 40, 109, 41, 40, 64, 1, 119, 30, 118, 1, 12, 25, 23, 96, 52, 76, 8, Byte.MAX_VALUE, 85, 48, 83, 24, 77, 57, 86, 16, 89, 78, 5};
    }

    private static byte[] lruxzowscmkijou() {
        return new byte[]{-59, -81, 85, 90, 15, 29, 48, 106, 33, 71, 113, 41, 44, 86, 117, 32, 98, 105, 43, 91, 4, 123, 25, 106};
    }

    private static byte[] javgiywnxehjrbh() {
        return new byte[]{-57, -85, 80, 91, 8, 27, 55, 111, 44, 77, 113, 47, 40, 73, 118, 122, 100, 36, 33, 85, 1, 114, 31, 117};
    }

    private static int hwydmtbnlreqmplg(int i, int i2) {
        return i ^ i2;
    }
}
