package com.kammoun.donutCore.spawner.models;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.utils.nbtapi.NBTItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

public class Spawner {
    private final String name;
    private final String inventoryTitle;
    private final KItem iconItem;
    private final KItem spawnerItem;
    private final int spawnDelay;
    private final int xpDrop;
    private final List<Material> itemLayoutOrder;
    private final Map<Material, Integer> drops;
    private final Map<Material, Double> dropPrices;
    private final List<String> hologram;
    private final double hologramOffset;
    private final int maxItems;
    private static int mbeBrMXHh7 = 0;
    private transient int PDOXEvtwhO = 140170057;
    private static String eqtwqslyij;
    private static String[] nothing_to_see_here = new String[13];

    public Spawner(java.lang.String r5, java.lang.String r6, java.lang.String r7, com.kammoun.donutCore.api.utils.items.KItem r8, com.kammoun.donutCore.api.utils.items.KItem r9, int r10, int r11, java.util.List<org.bukkit.Material> r12, java.util.Map<org.bukkit.Material, java.lang.Integer> r13, java.util.Map<org.bukkit.Material, java.lang.Double> r14, java.util.List<java.lang.String> r15, double r16, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.models.Spawner.<init>(java.lang.String, java.lang.String, com.kammoun.donutCore.api.utils.items.KItem, com.kammoun.donutCore.api.utils.items.KItem, int, int, java.util.List, java.util.Map, java.util.Map, java.util.List, double, int, int):void");
    }

    public static Spawner fromConfig(ConfigurationSection configurationSection, int i) {
        int i2 = 835031897 ^ (880398504 ^ 1842142023);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1132774835) {
            int i3 = 762210388 ^ i2;
            String string = configurationSection.getString(eepicnfubg(nixxhwwjojgawuz(), i3));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 687310610) {
                int i4 = 1345734645 ^ i3;
                String string2 = configurationSection.getString(eepicnfubg(okegddgcyqbytup(), i4));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1455048520) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1455048520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (29791488 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 1828418082 ^ i4;
                    throw new RuntimeException("double");
                }
                i3 = 600696631 ^ i4;
                KItem fromConfig = KItem.fromConfig(configurationSection.getConfigurationSection(eepicnfubg(reaajxaxvmlnibw(), i3)), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1221951231) {
                    i2 = 1176678373 ^ i3;
                    KItem fromConfig2 = KItem.fromConfig(configurationSection.getConfigurationSection(eepicnfubg(vfxytyepszjiirq(), i2)), 2126963651);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2042626517) {
                        int i6 = 784651850 ^ i2;
                        int i7 = configurationSection.getInt(eepicnfubg(qnkmrzwwsxqwept(), i6));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -266777478) {
                            i6 = 320699655 ^ i6;
                            int i8 = configurationSection.getInt(eepicnfubg(ysqsstqzqrlxeot(), i6));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1760732226) {
                                int i9 = 1158671873 ^ i6;
                                List stringList = configurationSection.getStringList(eepicnfubg(binaiadqogzkwnm(), i9));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1083036744) {
                                    int i10 = 1853728749 ^ i9;
                                    Stream stream = stringList.stream();
                                    Function function = Material::valueOf;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 861989667) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 861989667 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (2006393853 ^ i10)) {
                                                break;
                                            }
                                        }
                                        int i11 = 1980500662 ^ i10;
                                        throw new IOException("double");
                                    }
                                    int i12 = 2015787373 ^ i10;
                                    Stream map = stream.map(function);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != -229433272) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -229433272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1731601821 ^ i12)) {
                                                break;
                                            }
                                        }
                                        int i13 = 774447306 ^ i12;
                                        throw new IllegalAccessException("double");
                                    }
                                    i2 = 749847823 ^ i12;
                                    List list = (List) map.collect(Collectors.toList());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1747122127) {
                                        i2 = 1985952358 ^ i2;
                                        ConfigurationSection configurationSection2 = configurationSection.getConfigurationSection(eepicnfubg(obbtxvyulcxsyix(), i2));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 623172354) {
                                            int i14 = 1718575857 ^ i2;
                                            Set keys = configurationSection2.getKeys((byte) (583793041 ^ i14));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) != 375377033) {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 375377033 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1238791987 ^ i14)) {
                                                        int i15 = 946727188 ^ i14;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1297754904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (542002623 ^ i14)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                int i16 = 942348372 ^ i14;
                                                throw new IOException("double");
                                            }
                                            i9 = 109896041 ^ i14;
                                            Stream stream2 = keys.stream();
                                            Function function2 = Material::valueOf;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 574146497) {
                                                int i17 = 990956025 ^ i9;
                                                Objects.requireNonNull(configurationSection2);
                                                Function function3 = configurationSection2::getInt;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -88176632) {
                                                    int i18 = 963630410 ^ i17;
                                                    Map map2 = (Map) stream2.collect(Collectors.toMap(function2, function3));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 834675289) {
                                                        i18 = 237422934 ^ i18;
                                                        ConfigurationSection configurationSection3 = configurationSection.getConfigurationSection(eepicnfubg(fzkpvejpzwnsjbj(), i18));
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1089890537) {
                                                            i6 = 1923961670 ^ i18;
                                                            Set keys2 = configurationSection3.getKeys((byte) (1521720923 ^ i6));
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -711134502) {
                                                                i17 = 1700610292 ^ i6;
                                                                Stream stream3 = keys2.stream();
                                                                Function function4 = Material::valueOf;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -8981127) {
                                                                    int i19 = 1228276580 ^ i17;
                                                                    Objects.requireNonNull(configurationSection3);
                                                                    Function function5 = configurationSection3::getDouble;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) != -1228476837) {
                                                                        while (true) {
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == -1228476837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i19) == (659310606 ^ i19)) {
                                                                                break;
                                                                            }
                                                                        }
                                                                        int i20 = 499651271 ^ i19;
                                                                        throw new RuntimeException("double");
                                                                    }
                                                                    i9 = 1254190467 ^ i19;
                                                                    Map map3 = (Map) stream3.collect(Collectors.toMap(function4, function5));
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -523402687) {
                                                                        int i21 = 784284411 ^ i9;
                                                                        List stringList2 = configurationSection.getStringList(eepicnfubg(zhqilsaizgojwle(), i21));
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) != -1791732328) {
                                                                            while (true) {
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == -1791732328 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i21) == (1787110906 ^ i21)) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            int i22 = 491896765 ^ i21;
                                                                            throw new RuntimeException("double");
                                                                        }
                                                                        i6 = 1900390256 ^ i21;
                                                                        double d = configurationSection.getDouble(eepicnfubg(cjfegzekrwkemyu(), i6));
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 521760283) {
                                                                            i3 = 1621995310 ^ i6;
                                                                            int i23 = configurationSection.getInt(eepicnfubg(ifeyoumpnqtjxeu(), i3), (short) (55485949 ^ i3));
                                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 443815784) {
                                                                                int i24 = 182830990 ^ i3;
                                                                                return new Spawner(string, string2, fromConfig2, fromConfig, i7, i8, list, map2, map3, stringList2, d, i23, 1855505292);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 1089890537 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1257510192 ^ i18)) {
                                                            int i25 = 82844944 ^ i18;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == 834675289 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i18) == (1483193215 ^ i18)) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    int i26 = 1929605388 ^ i18;
                                                    throw new RuntimeException("double");
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -8981127 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1143403648 ^ i17)) {
                                                        int i27 = 1019837431 ^ i17;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -88176632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (578914630 ^ i17)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                int i28 = 1446010470 ^ i17;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1083036744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (364041611 ^ i9)) {
                                        int i29 = 480230763 ^ i9;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -523402687 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (967347555 ^ i9)) {
                                            int i30 = 238892621 ^ i9;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 574146497 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1945260460 ^ i9)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                int i31 = 1292176040 ^ i9;
                                throw new IOException("double");
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -711134502 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (312156969 ^ i6)) {
                                int i32 = 788604879 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1760732226 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (614310992 ^ i6)) {
                                    int i33 = 395524133 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 521760283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2076731474 ^ i6)) {
                                        int i34 = 424675082 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -266777478 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (410109775 ^ i6)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        int i35 = 1169799595 ^ i6;
                        throw new IllegalAccessException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 443815784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1215706560 ^ i3)) {
                    int i36 = 819806704 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1221951231 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2050745728 ^ i3)) {
                        int i37 = 2074407577 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 687310610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1974777353 ^ i3)) {
                            break;
                        }
                    }
                }
            }
            int i38 = 2057882686 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1747122127 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (397799434 ^ i2)) {
                int i39 = 519111463 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 623172354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (790918859 ^ i2)) {
                    int i40 = 129496252 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1132774835 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1750159208 ^ i2)) {
                        int i41 = 1757476390 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2042626517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1227142421 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i42 = 68064743 ^ i2;
        throw new IOException();
    }

    public ItemStack getSpawnerItem(int i, int i2) {
        int i3 = 1771518171 ^ (1278254457 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 26045794) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 26045794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1754951741 ^ i3)) {
                    break;
                }
            }
            int i4 = 900211880 ^ i3;
            throw new RuntimeException("double");
        }
        int i5 = 202420105 ^ i3;
        NBTItem nBTItem = new NBTItem(this.spawnerItem.getItemStack(1475551979));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1627918634) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1988121944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (218135954 ^ i5)) {
                    int i6 = 296604306 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1627918634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (79398827 ^ i5)) {
                        break;
                    }
                }
            }
            int i7 = 1527993826 ^ i5;
            throw new IllegalAccessException();
        }
        int i8 = 1439247321 ^ i5;
        nBTItem.setString(eepicnfubg(iqunxphgxytewzn(), i8), getName());
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -817803296) {
            i8 = 1423218471 ^ i8;
            nBTItem.setInteger(eepicnfubg(bftxuswghvangro(), i8), Integer.valueOf(i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1776678618) {
                int i9 = 1139586160 ^ i8;
                return nBTItem.getItem();
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -817803296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (864506647 ^ i8)) {
                int i10 = 1489194737 ^ i8;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1776678618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2131511026 ^ i8)) {
                    break;
                }
            }
        }
        int i11 = 145307495 ^ i8;
        throw new RuntimeException("double");
    }

    @Generated
    public String getName() {
        int i = 155753086 ^ (1276234229 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 108715049) {
            int i2 = 141698886 ^ i;
            return this.name;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1173087769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (857852604 ^ i)) {
                int i3 = 535847259 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 108715049 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (890159885 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 911876736 ^ i;
        throw new IOException();
    }

    @Generated
    public String getInventoryTitle(int i) {
        int i2 = 2140964545 ^ (443179766 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 50815432) {
            int i3 = 1368120725 ^ i2;
            return this.inventoryTitle;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1889956510 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1773529291 ^ i2)) {
                int i4 = 1455988719 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 50815432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2088842782 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1210872186 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public KItem getIconItem(int i) {
        int i2 = 87318060 ^ (390037332 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1125561421) {
            int i3 = 1305664572 ^ i2;
            return this.iconItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1125561421 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (970422669 ^ i2)) {
                int i4 = 1851583464 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -763385263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (956333675 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 257174757 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public KItem getSpawnerItem() {
        int i = 149257758 ^ (799748686 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 381821682) {
            int i2 = 2123890394 ^ i;
            return this.spawnerItem;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -495070175 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1263900724 ^ i)) {
                int i3 = 319981941 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 381821682 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1797574295 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1437416040 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public int getSpawnDelay(int i) {
        int i2 = 398078909 ^ (924812462 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 698218730) {
            int i3 = 1583379266 ^ i2;
            return this.spawnDelay;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -627154184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1087000376 ^ i2)) {
                int i4 = 858993918 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 698218730 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1370227106 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 531267628 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getXpDrop(int i) {
        int i2 = 668637040 ^ (1774924614 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1547526593) {
            int i3 = 416687934 ^ i2;
            return this.xpDrop;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1702078415 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1985143102 ^ i2)) {
                int i4 = 238387363 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1547526593 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1191777401 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1478856407 ^ i2;
        throw new IOException();
    }

    @Generated
    public List getItemLayoutOrder(int i) {
        int i2 = 1882518228 ^ (1020938794 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1271236481) {
            int i3 = 218836835 ^ i2;
            return this.itemLayoutOrder;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1271236481 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (317846874 ^ i2)) {
                int i4 = 965363188 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 597490841 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1808941766 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1440821465 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public Map getDrops(int i) {
        int i2 = 1513700564 ^ (1200156048 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1052849581) {
            int i3 = 1031451995 ^ i2;
            return this.drops;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1052849581 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (388102144 ^ i2)) {
                int i4 = 667424967 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 720068746 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (820413113 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 843921778 ^ i2;
        throw new IOException();
    }

    @Generated
    public Map getDropPrices(int i) {
        int i2 = 480601459 ^ (907596035 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2036196338) {
            int i3 = 1796640246 ^ i2;
            return this.dropPrices;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2036196338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2063281403 ^ i2)) {
                int i4 = 1462832468 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 568953921 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2128143490 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1107406412 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public List getHologram(int i) {
        int i2 = 646009698 ^ (430715955 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -707036422) {
            int i3 = 943828103 ^ i2;
            return this.hologram;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 399908547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1244851754 ^ i2)) {
                int i4 = 1655419464 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -707036422 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1616943850 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1050954869 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public double getHologramOffset(int i) {
        int i2 = 45878880 ^ (1339363931 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1207476649) {
            int i3 = 235275271 ^ i2;
            return this.hologramOffset;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1207476649 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (225402649 ^ i2)) {
                int i4 = 1841523407 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 935887249 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (420860604 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1496834941 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public int getMaxItems(int i) {
        int i2 = 1265669103 ^ (1761298798 ^ 1704331278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 820941946) {
            int i3 = 250549794 ^ i2;
            return this.maxItems;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 820941946 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (268538628 ^ i2)) {
                int i4 = 568612646 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1201022314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2061035886 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2115046763 ^ i2;
        throw new RuntimeException();
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
        eqtwqslyij = ByteBuffer.wrap(nldgevyorglvwuq()).asCharBuffer().toString();
        mbeBrMXHh7 = 457045867 ^ new Random(1067585799914561531L).nextInt();
    }

    public static String eepicnfubg(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = eqtwqslyij.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] vfxytyepszjiirq() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 0};
    }

    private static byte[] qnkmrzwwsxqwept() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 8};
    }

    private static byte[] obbtxvyulcxsyix() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 12};
    }

    private static byte[] cjfegzekrwkemyu() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 22};
    }

    private static byte[] nixxhwwjojgawuz() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 37};
    }

    private static byte[] ysqsstqzqrlxeot() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 49};
    }

    private static byte[] reaajxaxvmlnibw() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 58};
    }

    private static byte[] zhqilsaizgojwle() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 68};
    }

    private static byte[] ifeyoumpnqtjxeu() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 82};
    }

    private static byte[] okegddgcyqbytup() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 91};
    }

    private static byte[] fzkpvejpzwnsjbj() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 96};
    }

    private static byte[] binaiadqogzkwnm() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 107};
    }

    private static byte[] bftxuswghvangro() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, 118};
    }

    private static byte[] iqunxphgxytewzn() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, -124};
    }

    private static byte[] nldgevyorglvwuq() {
        return new byte[]{49, 95, 57, 71, 49, 92, 53, 30, 51, 90, 49, 91, 57, 93, 49, 91, 49, 65, 55, 94, 50, 91, 53, 80, 49, 88, 53, 69, 54, 86, 56, 94, 54, 22, 49, 85, 53, 67, 54, 92, 56, 67, 54, 75, 49, 94, 55, 90, 56, 95, 50, 88, 55, 86, 49, 68, 55, 84, 56, 94, 50, 25, 55, 94, 49, 80, 55, 83, 56, 64, 50, 82, 55, 69, 49, 66, 53, 73, 54, 84, 53, 65, 53, 94, 49, 84, 53, 75, 54, 24, 53, 88, 53, 81, 49, 92, 53, 92, 49, 74, 57, 67, 56, 30, 51, 82, 53, 95, 49, 93, 57, 70, 56, 93, 51, 71, 57, 66, 48, 85, 57, 86, 57, 81, 48, 92, 50, 29, 57, 80, 55, 77, 50, 85, 57, 95, 51, 89, 50, 86, 48, 88, 51, 88, 49, 84, 49, 64, 57, 81, 52, 94, 55, 31, 51, 93, 50, 80, 48, 90, 51, 82, 49, 64, 53, 88, 52, 86, 54, 65, 55, 30, 53, 92, 52, 67, 54, 92, 55, 94, 53, 70, 51, 65, 52, 80, 56, 77, 56, 88, 55, 86, 54, 94, 51, 69, 48, 82, 50, 95, 57, 24, 55, 67, 49, 66, 55, 91, 50, 90, 54, 82, 51, 66, 49, 90, 53, 71, 55, 92, 53, 84, 51, 31, 51, 89, 51, 86, 57, 76, 57, 92, 49, 70, 53, 71, 49, 65, 57, 69, 56, 83, 54, 65, 53, 95, 49, 87, 57, 71, 56, 31, 54, 87, 53, 92, 49, 93, 57, 64, 56, 92, 54, 66, 52, 64, 52, 70, 52, 84, 53, 71, 48, 90, 51, 81, 54, 70, 53, 24, 48, 68, 52, 74, 52, 70, 52, 80};
    }
}
