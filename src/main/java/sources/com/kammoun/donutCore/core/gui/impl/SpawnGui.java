package com.kammoun.donutCore.core.gui.impl;

import com.kammoun.donutCore.core.CorePlugin;
import com.kammoun.donutCore.core.gui.AbstractGui;
import com.kammoun.donutCore.core.models.SpawnData;
import com.kammoun.donutCore.core.utils.ColorFormater;
import com.kammoun.donutCore.core.utils.ItemBuilder;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SpawnGui extends AbstractGui {
    private final Map<Player, Object[]> opened;
    private static int B45U28yHy7 = 0;
    private transient int IuCPDcmuUJ = 191151682;
    private static String[] nothing_to_see_here = new String[15];

    public SpawnGui(CorePlugin corePlugin, int i) {
        super(corePlugin, 541483473);
        czfewngrkrdnoipg(1175353926 ^ 358496528, 1610333215);
        int parseInt = 1089970050 ^ (736241487 ^ Integer.parseInt("1740523396"));
        this.IuCPDcmuUJ = 191151682 ^ B45U28yHy7;
        this.opened = new HashMap();
        int i2 = 12140891 ^ (959490428 ^ (1798976854 ^ parseInt));
    }

    @Override
    public org.bukkit.inventory.Inventory generateInventory(org.bukkit.entity.Player r10, java.lang.Object[] r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.SpawnGui.generateInventory(org.bukkit.entity.Player, java.lang.Object[], int):org.bukkit.inventory.Inventory");
    }

    @Override
    public void click(com.kammoun.donutCore.core.gui.WrappedClickEvent r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.SpawnGui.click(com.kammoun.donutCore.core.gui.WrappedClickEvent, int):void");
    }

    private void populateSpawnItems(org.bukkit.inventory.Inventory r9, java.util.List r10, int r11, int r12, org.bukkit.configuration.file.FileConfiguration r13, org.bukkit.entity.Player r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.SpawnGui.populateSpawnItems(org.bukkit.inventory.Inventory, java.util.List, int, int, org.bukkit.configuration.file.FileConfiguration, org.bukkit.entity.Player, int):void");
    }

    private ItemStack createSpawnItem(int i, int i2, int i3, boolean z, FileConfiguration fileConfiguration, int i4) {
        int i5 = 233888566 ^ (1368582540 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1653734152) {
            i5 = 1026350357 ^ i5;
            if (i2 < i3) {
                int i6 = 1097501756 ^ i5;
                return createAvailableSpawnItem(i, i2, i3, z, fileConfiguration, 676960614);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1946741841) {
                int i7 = 849821280 ^ i5;
                return createMaxedSpawnItem(i, i2, i3, fileConfiguration, 990816162);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1653734152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (802868011 ^ i5)) {
                int i8 = 624186258 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1946741841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (517101458 ^ i5)) {
                    break;
                }
            }
        }
        int i9 = 731576736 ^ i5;
        throw new IOException();
    }

    private ItemStack createMaxedSpawnItem(int i, int i2, int i3, FileConfiguration fileConfiguration, int i4) {
        int i5 = 1671030172 ^ (1636311438 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1861333434) {
            int i6 = 1016975162 ^ i5;
            Material valueOf = Material.valueOf(fileConfiguration.getString(zurvukrwad(pvniqgnqrfwnire(), qwhbqzzvxczuxsm(), i6)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1977628565) {
                i6 = 464642861 ^ i6;
                String string = fileConfiguration.getString(zurvukrwad(wlcnhqbbjpzmvos(), qwhbqzzvxczuxsm(), i6));
                String zurvukrwad = zurvukrwad(trywqpwkhwpmter(), qwhbqzzvxczuxsm(), i6);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1469108483) {
                    int i7 = 1468873220 ^ i6;
                    String replace = string.replace(zurvukrwad, String.valueOf(i));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -336002783) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -498661422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (382075826 ^ i7)) {
                                int i8 = 1748853473 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -336002783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1932402095 ^ i7)) {
                                    break;
                                }
                            }
                        }
                        int i9 = 1978778060 ^ i7;
                        throw new IllegalAccessException("double");
                    }
                    int i10 = 650634400 ^ i7;
                    Stream stream = fileConfiguration.getStringList(zurvukrwad(iehzglccysucmwd(), qwhbqzzvxczuxsm(), i10)).stream();
                    Function function = str -> {
                        int i11 = 516434786 ^ (1063013189 ^ 1152076903);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 704209411) {
                            i11 = 1927362774 ^ i11;
                            String replace2 = str.replace(zurvukrwad(unsyjrlwmhdmjuy(), qwhbqzzvxczuxsm(), i11), String.valueOf(i2));
                            String zurvukrwad2 = zurvukrwad(wnzgousdtgaowgd(), qwhbqzzvxczuxsm(), i11);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1091525456) {
                                i11 = 2116128966 ^ i11;
                                String replace3 = replace2.replace(zurvukrwad2, String.valueOf(i3));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1341923971) {
                                    int i12 = 295157272 ^ i11;
                                    return replace3;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1019096509 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1291002220 ^ i11)) {
                                int i13 = 1053745200 ^ i11;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1341923971 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (575996366 ^ i11)) {
                                    int i14 = 985105995 ^ i11;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1091525456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1717648339 ^ i11)) {
                                        int i15 = 1651473212 ^ i11;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 704209411 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1774672974 ^ i11)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i16 = 1126690690 ^ i11;
                        throw new IOException();
                    };
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != -574217184) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == -574217184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1111750390 ^ i10)) {
                                break;
                            }
                        }
                        int i11 = 305247630 ^ i10;
                        throw new IOException("double");
                    }
                    int i12 = 163649633 ^ i10;
                    Stream map = stream.map(function);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != -1815156952) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1815156952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1779762245 ^ i12)) {
                                break;
                            }
                        }
                        int i13 = 1566145230 ^ i12;
                        throw new IOException("double");
                    }
                    int i14 = 1420385422 ^ i12;
                    List list = (List) map.collect(Collectors.toList());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 914621274) {
                        int i15 = 1026463711 ^ i14;
                        ItemBuilder itemBuilder = new ItemBuilder(valueOf);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -537870941) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -537870941 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (1531227985 ^ i15)) {
                                    break;
                                }
                            }
                            int i16 = 526985936 ^ i15;
                            throw new RuntimeException("double");
                        }
                        i5 = 1304312925 ^ i15;
                        ItemBuilder name = itemBuilder.name(ColorFormater.hex(replace), 1646492606);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1308532919) {
                            int i17 = 1786647606 ^ i5;
                            ItemBuilder defLore = name.defLore(ColorFormater.hex(list, 185435491), 685184902);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) != -504234246) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -504234246 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (241022054 ^ i17)) {
                                        break;
                                    }
                                }
                                int i18 = 1242100005 ^ i17;
                                throw new IOException("double");
                            }
                            i14 = 840709984 ^ i17;
                            ItemStack build = defLore.build(891921829);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1896891899) {
                                int i19 = 845867077 ^ i14;
                                return build;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 914621274 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (221843136 ^ i14)) {
                            int i20 = 1161916126 ^ i14;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1896891899 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1047167296 ^ i14)) {
                                break;
                            }
                        }
                    }
                    int i21 = 1267029204 ^ i14;
                    throw new RuntimeException("double");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1469108483 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1931029974 ^ i6)) {
                    int i22 = 817952558 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1977628565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1547284039 ^ i6)) {
                        break;
                    }
                }
            }
            int i23 = 1213562642 ^ i6;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1861333434 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1461442978 ^ i5)) {
                int i24 = 525309001 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1308532919 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1976836810 ^ i5)) {
                    break;
                }
            }
        }
        int i25 = 1696363051 ^ i5;
        throw new IllegalAccessException();
    }

    private ItemStack createAvailableSpawnItem(int i, int i2, int i3, boolean z, FileConfiguration fileConfiguration, int i4) {
        Material material;
        int i5;
        int i6;
        int i7 = 659112217 ^ (467248220 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1694975229) {
            i7 = 1605865779 ^ i7;
            if (z == (753436243 ^ i7)) {
                i7 = czfewngrkrdnoipg(i7, 793906479);
                material = Material.ITEM_FRAME;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 500456416) {
                    i5 = 398432565 ^ i7;
                    Material material2 = material;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1607953848) {
                        i5 = 1497386375 ^ i5;
                        String replace = fileConfiguration.getString(zurvukrwad(riihkwwzempdnzz(), qwhbqzzvxczuxsm(), i5)).replace(zurvukrwad(uqkwmfuegtwuqac(), qwhbqzzvxczuxsm(), i5), String.valueOf(i));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1781202546) {
                            i7 = 763261650 ^ i5;
                            Stream stream = fileConfiguration.getStringList(zurvukrwad(jocsghapwipcnll(), qwhbqzzvxczuxsm(), i7)).stream();
                            Function function = str -> {
                                int i8 = 1549722249 ^ (1174620514 ^ 1152076903);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -138986398) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -138986398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1034071629 ^ i8)) {
                                            break;
                                        }
                                    }
                                    int i9 = 299145967 ^ i8;
                                    throw new IllegalAccessException("double");
                                }
                                int i10 = 1548078462 ^ i8;
                                String replace2 = str.replace(zurvukrwad(mxjjbdejhvcxivs(), qwhbqzzvxczuxsm(), i10), String.valueOf(i2));
                                String zurvukrwad = zurvukrwad(tosjuyhezgluhkm(), qwhbqzzvxczuxsm(), i10);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 362370960) {
                                    i10 = 649437412 ^ i10;
                                    String replace3 = replace2.replace(zurvukrwad, String.valueOf(i3));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 540299441) {
                                        int i11 = 1834570054 ^ i10;
                                        return replace3;
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 540299441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (669819288 ^ i10)) {
                                        int i12 = 1003063890 ^ i10;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1258216066 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1270141870 ^ i10)) {
                                            int i13 = 914624957 ^ i10;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 362370960 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (642041810 ^ i10)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                int i14 = 347123518 ^ i10;
                                throw new RuntimeException();
                            };
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 31025379) {
                                int i8 = 1483605397 ^ i7;
                                Stream map = stream.map(function);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1029094327) {
                                    i7 = 2036290701 ^ i8;
                                    List list = (List) map.collect(Collectors.toList());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 139714594) {
                                        i7 = 1259097162 ^ i7;
                                        ItemBuilder itemBuilder = new ItemBuilder(material2);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1345421936) {
                                            i6 = 155406159 ^ i7;
                                            ItemBuilder name = itemBuilder.name(ColorFormater.hex(replace), 1646492606);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 439089160) {
                                                int i9 = 898148673 ^ i6;
                                                ItemBuilder defLore = name.defLore(ColorFormater.hex(list, 185435491), 685184902);
                                                byte b = (byte) (919459393 ^ i9);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1234259455) {
                                                    int i10 = 2025998824 ^ i9;
                                                    ItemBuilder amount = defLore.amount(Math.max((int) b, i), 710858308);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1887239490) {
                                                        i7 = 276573670 ^ i10;
                                                        ItemStack build = amount.build(891921829);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -207777166) {
                                                            int i11 = 1037854964 ^ i7;
                                                            return build;
                                                        }
                                                    } else {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1887239490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1656955950 ^ i10)) {
                                                                int i12 = 1950844327 ^ i10;
                                                                throw new IOException("double");
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1234259455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1767616547 ^ i9)) {
                                                            int i13 = 270564512 ^ i9;
                                                            throw new IOException("double");
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1522920648) {
                                                    int i14 = 1584723565 ^ i6;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1869927745) {
                                                        continue;
                                                    } else {
                                                        int i15 = 552552505 ^ i6;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 439089160) {
                                                            int i16 = 554538982 ^ i6;
                                                            throw new IOException("double");
                                                        }
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1029094327 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1071167017 ^ i8)) {
                                            int i17 = 1800130159 ^ i8;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1781202546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (643813966 ^ i5)) {
                            int i18 = 2085233406 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1607953848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1686908135 ^ i5)) {
                                int i19 = 5725657 ^ i5;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1732522649) {
                i6 = 665861066 ^ i7;
                material = Material.GLOW_ITEM_FRAME;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1522920648) {
                    int i20 = 649471793 ^ i6;
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i20) != 150890059) {
                            throw null;
                        }
                        throw new IllegalAccessException();
                    } catch (IllegalAccessException e) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                            case 207284633:
                                i7 = 2098821076 ^ i20;
                                break;
                            case 1869927745:
                                i7 = czfewngrkrdnoipg(i20, 1903997007);
                                break;
                            default:
                                throw new IllegalAccessException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -460236998) {
                            i5 = 1217869998 ^ i7;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1522920648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (812277524 ^ i6)) {
                        int i142 = 1584723565 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1869927745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (340412091 ^ i6)) {
                            int i152 = 552552505 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 439089160 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (285533348 ^ i6)) {
                                int i162 = 554538982 ^ i6;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -460236998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1285392161 ^ i7)) {
                int i21 = 1393570867 ^ i7;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 500456416 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1103230622 ^ i7)) {
                    int i22 = 1603939442 ^ i7;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1732522649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (679039125 ^ i7)) {
                        int i23 = 1814591568 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 494851539 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1925090746 ^ i7)) {
                            int i24 = 428673197 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -207777166 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1960263409 ^ i7)) {
                                int i25 = 1775779281 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 139714594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1765757741 ^ i7)) {
                                    int i26 = 1515822503 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1694975229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (310396475 ^ i7)) {
                                        int i27 = 1970279871 ^ i7;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1345421936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1376966900 ^ i7)) {
                                            int i28 = 1410301970 ^ i7;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 207284633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (407640553 ^ i7)) {
                                                int i29 = 807741968 ^ i7;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 31025379 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (273668976 ^ i7)) {
                                                    int i30 = 1279331826 ^ i7;
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
        }
    }

    private void addNavigationItems(org.bukkit.inventory.Inventory r5, int r6, java.util.List r7, org.bukkit.configuration.file.FileConfiguration r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.SpawnGui.addNavigationItems(org.bukkit.inventory.Inventory, int, java.util.List, org.bukkit.configuration.file.FileConfiguration, int):void");
    }

    private void addRandomSpawnItem(Inventory inventory, FileConfiguration fileConfiguration, int i) {
        int i2 = 1876181146 ^ (794467660 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 2047442840) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2047442840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1823806057 ^ i2)) {
                    break;
                }
            }
            int i3 = 1602558562 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1728799623 ^ i2;
        ItemBuilder itemBuilder = new ItemBuilder(Material.valueOf(fileConfiguration.getString(zurvukrwad(gdqsgfzvamuechf(), qwhbqzzvxczuxsm(), i4))));
        String zurvukrwad = zurvukrwad(bxdotfnrgavqrcb(), qwhbqzzvxczuxsm(), i4);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1112695715) {
            i4 = 2086161269 ^ i4;
            ItemBuilder name = itemBuilder.name(ColorFormater.hex(fileConfiguration.getString(zurvukrwad)), 1646492606);
            String zurvukrwad2 = zurvukrwad(oprcvoumocthnda(), qwhbqzzvxczuxsm(), i4);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1601161208) {
                int i5 = 603411366 ^ i4;
                ItemBuilder defLore = name.defLore(ColorFormater.hex(fileConfiguration.getStringList(zurvukrwad2), 185435491), 685184902);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1087724231) {
                    int i6 = 492196653 ^ i5;
                    ItemStack build = defLore.build(891921829);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1436040273) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1436040273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (85657522 ^ i6)) {
                                break;
                            }
                        }
                        int i7 = 1923554345 ^ i6;
                        throw new IllegalAccessException("double");
                    }
                    i5 = 345917422 ^ i6;
                    inventory.setItem((byte) (1043152981 ^ i5), build);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -244710623) {
                        int i8 = 244003571 ^ i5;
                        return;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1087724231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (204714273 ^ i5)) {
                        int i9 = 593085304 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -244710623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1685328845 ^ i5)) {
                            break;
                        }
                    }
                }
                int i10 = 1018327091 ^ i5;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1112695715 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1835528736 ^ i4)) {
                int i11 = 566170805 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1601161208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1198761751 ^ i4)) {
                    break;
                }
            }
        }
        int i12 = 724248599 ^ i4;
        throw new IllegalAccessException();
    }

    private void handleRandomSpawnTeleport(Player player, int i) {
        int i2 = 237958091 ^ (1862535027 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1999123689) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1999123689 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (886997276 ^ i2)) {
                    break;
                }
            }
            int i3 = 1999945877 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1524249529 ^ i2;
        Map spawnDataMap = plugin(1313228421).getSpawnConfig(105438400).getSpawnDataMap(504221650);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1577473757) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1577473757 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1952208082 ^ i4)) {
                    break;
                }
            }
            int i5 = 1177336079 ^ i4;
            throw new IOException("double");
        }
        int i6 = 510542663 ^ i4;
        if (spawnDataMap.isEmpty() == (1783723619 ^ i6)) {
            i6 = czfewngrkrdnoipg(i6, 1843553400);
            List list = spawnDataMap.keySet().stream().toList();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1033408728) {
                int i7 = 1446527608 ^ i6;
                int random = (int) (Math.random() * list.size());
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1940225254) {
                    int i8 = 1964986711 ^ i7;
                    SpawnData spawnData = (SpawnData) spawnDataMap.get(list.get(random));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 614468001) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 614468001 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (136491593 ^ i8)) {
                                break;
                            }
                        }
                        int i9 = 1358290811 ^ i8;
                        throw new IOException("double");
                    }
                    i7 = 526963269 ^ i8;
                    if (spawnData != null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -538535031) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -538535031 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (699642820 ^ i7)) {
                                    break;
                                }
                            }
                            int i10 = 1959269701 ^ i7;
                            throw new IOException("double");
                        }
                        int i11 = 1881126000 ^ i7;
                        player.closeInventory();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 1595619338) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1595619338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1979094795 ^ i11)) {
                                    break;
                                }
                            }
                            int i12 = 1620454440 ^ i11;
                            throw new IOException("double");
                        }
                        int i13 = 644425681 ^ i11;
                        plugin(1313228421).getTeleportCountdown(430735881).teleportWithCountdown(player, spawnData.getSpawnLocation(253111385).getLocation(1859864587), 1138368260);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1817314947) {
                            int i14 = 1125731604 ^ i13;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == 1817314947 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i13) == (2135484420 ^ i13)) {
                                break;
                            }
                        }
                        int i15 = 350297429 ^ i13;
                        throw new IllegalAccessException("double");
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i7)) {
                            case 70902358:
                                int i16 = 359653045 ^ i7;
                                return;
                            case 815826553:
                            case 1220068298:
                                return;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1940225254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (122063839 ^ i7)) {
                        int i17 = 361971403 ^ i7;
                        throw new IOException("double");
                    }
                }
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1384887067) {
            int i18 = 1196832034 ^ i6;
            plugin(1313228421).getMessageSender(1613368349).sendMessage(player, zurvukrwad(hixoexmadfwbmht(), qwhbqzzvxczuxsm(), i18), new String[(byte) (755450689 ^ i18)], 1707865585);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1748638217) {
                int i19 = 4015692 ^ i18;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1956146721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1234972833 ^ i18)) {
                    int i20 = 1450327882 ^ i18;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1748638217 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (753589622 ^ i18)) {
                        break;
                    }
                }
            }
            int i21 = 1397201843 ^ i18;
            throw new IOException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1033408728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1625393689 ^ i6)) {
                int i22 = 651215480 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1384887067 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1616454633 ^ i6)) {
                    break;
                }
            }
        }
        int i23 = 632118573 ^ i6;
        throw new RuntimeException("double");
    }

    private void handleSpawnTeleport(Player player, SpawnData spawnData, int i) {
        int i2 = 484255196 ^ (475682640 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2051278154) {
            int i3 = 1606135364 ^ i2;
            if (spawnData != null) {
                int czfewngrkrdnoipg = czfewngrkrdnoipg(i3, 1372011291);
                int maxPlayersPerSpawn = plugin(1313228421).getCoreSettings(836036925).getMaxPlayersPerSpawn(433904145);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(czfewngrkrdnoipg) != 161525682) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(czfewngrkrdnoipg) == 161525682 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(czfewngrkrdnoipg) == (811413245 ^ czfewngrkrdnoipg)) {
                            int i4 = 752408599 ^ czfewngrkrdnoipg;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(czfewngrkrdnoipg) == 1150131890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(czfewngrkrdnoipg) == (1841221840 ^ czfewngrkrdnoipg)) {
                                break;
                            }
                        }
                    }
                    int i5 = 1286737361 ^ czfewngrkrdnoipg;
                    throw new IllegalAccessException("double");
                }
                i3 = 1992177736 ^ czfewngrkrdnoipg;
                int playersInRegion = getPlayersInRegion(spawnData.getRegionName(862433890), spawnData.getSpawnLocation(253111385).getWorld(1848383015), 181173517);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1135514127) {
                    int i6 = 1867564463 ^ i3;
                    if (playersInRegion < maxPlayersPerSpawn) {
                        i3 = czfewngrkrdnoipg(i6, 762475672);
                        player.closeInventory();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1387994037) {
                            i2 = 20910920 ^ i3;
                            plugin(1313228421).getTeleportCountdown(430735881).teleportWithCountdown(player, spawnData.getSpawnLocation(253111385).getLocation(1859864587), 1138368260);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1531150837) {
                                int i7 = 1007041559 ^ i2;
                                return;
                            }
                        }
                    } else {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -958971766) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -958971766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1459506200 ^ i6)) {
                                    break;
                                }
                            }
                            int i8 = 515057233 ^ i6;
                            throw new RuntimeException("double");
                        }
                        int i9 = 1589446381 ^ i6;
                        plugin(1313228421).getMessageSender(1613368349).sendMessage(player, zurvukrwad(cxhojwaswifxxik(), qwhbqzzvxczuxsm(), i9), new String[(byte) (107474684 ^ i9)], 1707865585);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != 859797472) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 859797472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1390932332 ^ i9)) {
                                    break;
                                }
                            }
                            int i10 = 861135822 ^ i9;
                            throw new IllegalAccessException("double");
                        }
                        i2 = 1215925560 ^ i9;
                        player.closeInventory();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1894981154) {
                            int i11 = 329249286 ^ i2;
                            return;
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2019985560) {
                int i12 = 589333020 ^ i3;
                return;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1135514127 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (524263697 ^ i3)) {
                    int i13 = 745139099 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1387994037 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (208083133 ^ i3)) {
                        int i14 = 1225227131 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2019985560 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1177977493 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i15 = 842148425 ^ i3;
            throw new IllegalAccessException();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1531150837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1240123365 ^ i2)) {
                int i16 = 1316650198 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1894981154 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (603022728 ^ i2)) {
                    int i17 = 867269540 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2051278154 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1276652168 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i18 = 1355514504 ^ i2;
        throw new IllegalAccessException("double");
    }

    private int getPlayersInRegion(java.lang.String r6, java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.SpawnGui.getPlayersInRegion(java.lang.String, java.lang.String, int):int");
    }

    private boolean isPlayerInRegion(org.bukkit.entity.Player r6, java.lang.String r7, java.lang.String r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.core.gui.impl.SpawnGui.isPlayerInRegion(org.bukkit.entity.Player, java.lang.String, java.lang.String, int):boolean");
    }

    @Override
    public boolean isInGUI(Player player) {
        int i = 1155487433 ^ (1801441137 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 41639147) {
            int i2 = 1452217820 ^ i;
            return this.opened.containsKey(player);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 41639147 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1719528502 ^ i)) {
                int i3 = 282311587 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1241255415 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1467264645 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1178494255 ^ i;
        throw new IllegalAccessException();
    }

    @Override
    public void remove(Player player, int i) {
        int i2 = 1611758499 ^ (853773328 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -370660176) {
            i2 = 1334053148 ^ i2;
            this.opened.remove(player);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1782029230) {
                int i3 = 1217308273 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -776120360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (636102345 ^ i2)) {
                int i4 = 751678000 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1782029230 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1739359415 ^ i2)) {
                    int i5 = 1259567216 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -370660176 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1374630717 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i6 = 2041113279 ^ i2;
        throw new RuntimeException();
    }

    @Override
    public void addToOpened(Player player, Object[] objArr, int i) {
        int i2 = 930675307 ^ (965424512 ^ 1339028005);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 165801586) {
            i2 = 64256932 ^ i2;
            this.opened.put(player, objArr);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 390214482) {
                int i3 = 1740457298 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 165801586 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1599075845 ^ i2)) {
                int i4 = 200347686 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 390214482 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1873074778 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 345914215 ^ i2;
        throw new IOException();
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
        B45U28yHy7 = (-1878175395) ^ new Random(-973681486263012114L).nextInt();
    }

    public static String zurvukrwad(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] qwhbqzzvxczuxsm() {
        return new byte[]{114, 51, 22, 122, 53, 77, 88, 62, 64, 94, 104, 125, 43, 64, 62, 15, 50, 60, 72, 95, 111, 112, 80, 53, 73, 19, 6, 41, 66, 91, 105, 70, 29, 93, 65, 101, 32, 70, 100, 81, 34, 121, 54, 71, 27, 7, 68, 104};
    }

    private static byte[] mxjjbdejhvcxivs() {
        return new byte[]{-72, -7, 36, 102, 3, 29, 111, 123, 116, 25, 90, 54, 29, 22, 9, 81, 6, 125, 122, 57, 89, 51, 103, 105, 125, 71, 52, 105, 116, 13, 94, 4, 41, 27, 115, 121};
    }

    private static byte[] tosjuyhezgluhkm() {
        return new byte[]{-72, -7, 36, 102, 3, 19, 111, 111, 116, 19, 90, 27, 29, 3, 9, 83, 6, 104, 122, 31, 89, 38, 103, 119, 125, 85, 52, 53};
    }

    private static byte[] unsyjrlwmhdmjuy() {
        return new byte[]{-72, -4, 38, 107, 6, 30, 106, 120, 112, 24, 88, 63, 31, 22, 14, 83, 1, 120, 124, 48, 95, 52, 99, 105, 123, 65, 54, 100, 114, 14, 93, 7, 45, 28, 114, 112};
    }

    private static byte[] wnzgousdtgaowgd() {
        return new byte[]{-72, -4, 38, 107, 6, 16, 106, 108, 112, 18, 88, 18, 31, 3, 14, 81, 1, 109, 124, 22, 95, 33, 99, 119, 123, 83, 54, 56};
    }

    private static byte[] qubtsuaqvwmvnoy() {
        return new byte[]{-66, -4, 38, 54, 0, 23, 105, 115, 121, 1, 90, 40};
    }

    private static byte[] ohztzwosvekthuh() {
        return new byte[0];
    }

    private static byte[] pvniqgnqrfwnire() {
        return new byte[]{-67, -11, 38, 35, 7, 1, 104, 107, 119, 4, 89, 55, 27, 94, 12, 90, 2, 109, Byte.MAX_VALUE, 16, 94, 44, 96, 97, 123, 6, 54, 105, 117, 0, 88, 30, 45, 20, 115, 56, 16, 4, 83, 21, 19, 110, 6, 26, 41, 94, 116, 44, 69, 97, 39, 49, 5, 20, 106, 103, 112, 2};
    }

    private static byte[] wlcnhqbbjpzmvos() {
        return new byte[]{-67, -5, 47, 39, 7, 12, 105, 105, 121, 5, 89, 57, 18, 90, 12, 87, 3, 111, 113, 17, 94, 34, 105, 101, 123, 11, 55, 107, 123, 1, 88, 16, 36, 16, 115, 53, 17, 6, 93, 20, 19, 96, 15, 23, 41, 91, 117, 41, 75, 117, 39, 33, 12, 24, 106, 114, 113, 34, 81, 42, 26, 26, 7, 94};
    }

    private static byte[] trywqpwkhwpmter() {
        return new byte[]{-67, -5, 47, 107, 7, 22, 105, 121, 121, 5, 89, 40, 18, 17, 12, 72, 3, 43};
    }

    private static byte[] iehzglccysucmwd() {
        return new byte[]{-72, -6, 35, 35, 12, 10, 111, 109, 116, 7, 94, 59, 27, 87, 13, 85, 4, 105, 124, 17, 90, 37, 105, 98, 126, 8, 50, 109, 116, 2, 89, 30, 46, 19, 119, 52, 20, 2, 81, 18, 27, 100, 1, 29, 47, 92, 114, 47, 66, 111};
    }

    private static byte[] jocsghapwipcnll() {
        return new byte[]{-67, -6, 39, 39, 1, 0, 104, 98, 112, 11, 89, 56, 26, 90, 10, 69, 2, 117, 120, 6, 94, 49, 97, 111, 125, 4, 54, 124, 114, 12, 88, 2, 44, 12};
    }

    private static byte[] riihkwwzempdnzz() {
        return new byte[]{-67, -2, 47, 37, 6, 0, 106, 106, 116, 1, 89, 60, 18, 88, 13, 69, 0, 125, 124, 12, 94, 53, 105, 109, 122, 4, 52, 124, 118, 0, 88, 7, 36, 27, 114, 48, 18, 22, 80, 26, 19, 5, 15, 16, 40, 83, 118, 60};
    }

    private static byte[] uqkwmfuegtwuqac() {
        return new byte[]{-67, -2, 47, 105, 6, 26, 106, 122, 116, 1, 89, 45, 18, 19, 13, 68, 0, 40};
    }

    private static byte[] zhujbbijpboezxv() {
        return new byte[]{-65, -4, 36, 42, 1, 11, 96, 110, 113, 0, 88, 60, 18, 90, 12, 89, 7, 104, 123, 23, 93, 61, 100, 41, 113, 75, 55, 123, 114, 29, 80, 23, 47, 23, 116, 61, 19, 23, 86, 4};
    }

    private static byte[] xpnxbazqqrpcfwx() {
        return new byte[]{-65, -4, 36, 42, 1, 11, 96, 110, 113, 0, 88, 60, 18, 90, 12, 89, 7, 104, 123, 23, 93, 61, 100, 41, 113, 66, 55, 115, 114, 26, 80, 2, 47, 9, 116, 53, 19, 15, 86, 38, 22, 42, 14, 31, 42, 81};
    }

    private static byte[] doxwhonzodhbahe() {
        return new byte[]{-67, -4, 34, 35, 5, 14, 96, 106, 114, 1, 89, 62, 31, 94, 14, 90, 10, 108, 122, 14, 94, 43, 100, 43, 121, 73, 62, 121, 112, 29, 88, 19, 41, 31, 113, 59, 24, 22, 86, 15};
    }

    private static byte[] qnvsycgguozxgnx() {
        return new byte[]{-67, -4, 34, 35, 5, 14, 96, 106, 114, 1, 89, 62, 31, 94, 14, 90, 10, 108, 122, 14, 94, 43, 100, 43, 121, 64, 62, 113, 112, 26, 88, 6, 41, 1, 113, 51, 24, 14, 86, 45, 19, 40, 2, 26, 43, 85};
    }

    private static byte[] oqxmwtmukbrnbxh() {
        return new byte[]{-67, -5, 38, 37, 6, 1, 97, 108, 113, 5, 89, 57, 27, 88, 13, 85, 11, 106, 121, 10, 94, 44, 96, 45, 122, 71, 63, 113, 115, 31, 88, 20};
    }

    private static byte[] cbwzwuxyasstdbk() {
        return new byte[]{-66, -4, 32, 34, 12, 12, 109, 108, 121, 1, 90, 62, 29, 95, 7, 84, 7, 110, 113, 21, 93, 52, 102, 42, 112, 74, 51, 113, 123, 27, 91, 19};
    }

    private static byte[] oprcvoumocthnda() {
        return new byte[]{-65, -1, 32, 36, 7, 12, 111, 109, 113, 0, 91, 56, 28, 92, 11, 74, 4, 108, 123, 2, 89, 35, 98, 111, 126, 72, 55, 55, 113, 30, 94, 4, 40, 11, 119, 35, 19, 27, 82, 72, 16, 32, 1, 30, 42, 70, 119, 59};
    }

    private static byte[] gdqsgfzvamuechf() {
        return new byte[]{-67, -5, 34, 42, 3, 0, 97, 108, 112, 3, 89, 57, 31, 87, 8, 68, 11, 106, 120, 1, 94, 35, 100, 99, Byte.MAX_VALUE, 71, 63, 51, 114, 24, 88, 1, 41, 5, 119, 43, 25, 31, 84, 79, 19, 35, 2, 31, 45, 74, 125, 58, 66, 113, 39, 36, 1, 21, 110, 107};
    }

    private static byte[] bxdotfnrgavqrcb() {
        return new byte[]{-67, -5, 34, 42, 3, 0, 97, 108, 112, 3, 89, 57, 31, 87, 8, 68, 11, 106, 120, 1, 94, 35, 100, 99, Byte.MAX_VALUE, 71, 63, 51, 114, 24, 88, 1, 41, 5, 119, 43, 25, 31, 84, 79, 19, 42, 2, 23, 45, 77, 125, 47, 66, 111, 39, 44, 1, 13, 110, 73, 121, 8, 88, 32, 26, 18};
    }

    private static byte[] hixoexmadfwbmht() {
        return new byte[]{-69, -7, 35, 61, 0, 13, 110, 103, 121, 30, 93, 38, 31, 88, 14, 87, 10, 106, Byte.MAX_VALUE, 30, 90, 105, 101, 118, Byte.MAX_VALUE, 78, 63, 106};
    }

    private static byte[] cxhojwaswifxxik() {
        return new byte[]{-67, -4, 33, 61, 2, 9, 110, 103, 116, 24, 88, 36, 31, 90, 10, 80, 10, 123, 121, 66, 88, 34, 103, 116, Byte.MAX_VALUE, 71, 50, 116};
    }

    private static int czfewngrkrdnoipg(int i, int i2) {
        return i ^ i2;
    }
}
