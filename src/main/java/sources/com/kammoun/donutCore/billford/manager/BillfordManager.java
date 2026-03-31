package com.kammoun.donutCore.billford.manager;

import com.kammoun.donutCore.billford.BillFordPlugin;
import com.kammoun.donutCore.billford.config.BillfordConfig;
import com.kammoun.donutCore.billford.models.BillfordPreset;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class BillfordManager {
    private final BillFordPlugin plugin;
    private final BillfordConfig config;
    private final Map<String, BillfordPreset> presets;
    private BillfordPreset currentPreset;
    private static int iCsKt69qgP = 0;
    private transient int pa5yurX1S3 = 1200965466;
    private static byte[] klmnssjtpj;
    private static String[] nothing_to_see_here = new String[15];

    public BillfordManager(com.kammoun.donutCore.billford.BillFordPlugin r5, com.kammoun.donutCore.billford.config.BillfordConfig r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.BillfordManager.<init>(com.kammoun.donutCore.billford.BillFordPlugin, com.kammoun.donutCore.billford.config.BillfordConfig, int):void");
    }

    public void loadAllPresets(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.BillfordManager.loadAllPresets(int):void");
    }

    private void loadCurrentPreset(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.BillfordManager.loadCurrentPreset(int):void");
    }

    public boolean switchPreset(java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.BillfordManager.switchPreset(java.lang.String, int):boolean");
    }

    public BillfordPreset createPreset(String str, int i) {
        int i2 = 2093344592 ^ (238880792 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 669877115) {
            int i3 = 527313070 ^ i2;
            if (this.presets.containsKey(str) != (2073270465 ^ i3)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -593705461) {
                    int i4 = 430616158 ^ i3;
                    return null;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -593705461 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1649702810 ^ i3)) {
                        break;
                    }
                }
                int i5 = 36261487 ^ i3;
                throw new IOException("double");
            }
            int slwymquzcylcpufz = slwymquzcylcpufz(i3, 1365938496);
            BillfordPreset billfordPreset = new BillfordPreset(str, 1778200714);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slwymquzcylcpufz) != 1472744457) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slwymquzcylcpufz) == 1472744457 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slwymquzcylcpufz) == (358522689 ^ slwymquzcylcpufz)) {
                        int i6 = 2125528495 ^ slwymquzcylcpufz;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slwymquzcylcpufz) == 1677977561 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(slwymquzcylcpufz) == (26381924 ^ slwymquzcylcpufz)) {
                            break;
                        }
                    }
                }
                int i7 = 1830965104 ^ slwymquzcylcpufz;
                throw new IOException("double");
            }
            int i8 = 1406064317 ^ slwymquzcylcpufz;
            this.presets.put(str, billfordPreset);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -910231069) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -910231069 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (2133502762 ^ i8)) {
                        break;
                    }
                }
                int i9 = 802923322 ^ i8;
                throw new RuntimeException("double");
            }
            i2 = 655426956 ^ i8;
            this.config.addPreset(str, 776011753);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -248064638) {
                int i10 = 1923524171 ^ i2;
                return billfordPreset;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -248064638 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1810120361 ^ i2)) {
                int i11 = 1070330109 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 669877115 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1462844423 ^ i2)) {
                    break;
                }
            }
        }
        int i12 = 1041676681 ^ i2;
        throw new IllegalAccessException();
    }

    public boolean deletePreset(java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.BillfordManager.deletePreset(java.lang.String, int):boolean");
    }

    public BillfordPreset getPreset(String str, int i) {
        int i2 = 1608535038 ^ (1458245551 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -126821456) {
            int i3 = 652177224 ^ i2;
            return this.presets.get(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -829709839 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1959590632 ^ i2)) {
                int i4 = 1815859574 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -126821456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1673374031 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1219797148 ^ i2;
        throw new IOException();
    }

    public boolean presetExists(String str, int i) {
        int i2 = 1840272505 ^ (354274039 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1967525195) {
            int i3 = 386959470 ^ i2;
            return this.presets.containsKey(str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1967525195 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1287947282 ^ i2)) {
                int i4 = 740471112 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -842904005 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (829934231 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 380028614 ^ i2;
        throw new IllegalAccessException();
    }

    public void reload(int i) {
        int i2 = 1650826509 ^ (2064515130 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 2071335040) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2071335040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (367732278 ^ i2)) {
                    break;
                }
            }
            int i3 = 373215514 ^ i2;
            throw new IOException("double");
        }
        int i4 = 1883991675 ^ i2;
        loadAllPresets(1831430146);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -114465957) {
            i4 = 1512830220 ^ i4;
            loadCurrentPreset(1771201482);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 678611769) {
                int i5 = 441515481 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -84597263 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (500939762 ^ i4)) {
                int i6 = 694686736 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 678611769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (994589523 ^ i4)) {
                    int i7 = 921423019 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -114465957 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (965561145 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1415417055 ^ i4;
        throw new IOException();
    }

    private void createDefaultPreset(int i) {
        int i2;
        int i3 = 1826061049 ^ (1373112821 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1481728345) {
            int i4 = 1925600812 ^ i3;
            BillfordPreset billfordPreset = new BillfordPreset(clfskqmfnl(yisnpemohczyqlc(), i4), 1778200714);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -832319430) {
                i3 = 1664334733 ^ i4;
                ItemStack itemStack = new ItemStack(Material.DIAMOND, (byte) (989839759 ^ i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -671216559) {
                    int i5 = 364739365 ^ i3;
                    billfordPreset.getRequiredItems(327452427).add(itemStack);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 2048251257) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2048251257 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1409717101 ^ i5)) {
                                int i6 = 744560528 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -207369479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1136471083 ^ i5)) {
                                    break;
                                }
                            }
                        }
                        int i7 = 1424459476 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    int i8 = 1119272390 ^ i5;
                    ItemStack itemStack2 = new ItemStack(Material.GOLD_INGOT, (byte) (1844709219 ^ i8));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1872771915) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1872771915 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1547737843 ^ i8)) {
                                break;
                            }
                        }
                        int i9 = 1746986172 ^ i8;
                        throw new IllegalAccessException("double");
                    }
                    i3 = 1933829058 ^ i8;
                    billfordPreset.getRequiredItems(327452427).add(itemStack2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -172022440) {
                        int i10 = 1375427262 ^ i3;
                        ItemStack itemStack3 = new ItemStack(Material.EMERALD, (byte) (1330429460 ^ i10));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 2053501098) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 2053501098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1680082845 ^ i10)) {
                                    break;
                                }
                            }
                            int i11 = 461125275 ^ i10;
                            throw new RuntimeException("double");
                        }
                        i3 = 1256275859 ^ i10;
                        billfordPreset.setTradeItem(itemStack3, 1208638453);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 762055728) {
                            ?? r0 = 1109350987 ^ i3;
                            i3 = r0;
                            try {
                                File file = new File(this.plugin.getModuleDataFolder(493044696), clfskqmfnl(keifrhjzvwhkmzd(), i3));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1033297514) {
                                    i3 = 1886149652 ^ i3;
                                    file.getParentFile().mkdirs();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1091289399) {
                                        i3 = 155964098 ^ i3;
                                        billfordPreset.saveToFile(file, 1781542032);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -190142247) {
                                            i3 = 523971475 ^ i3;
                                            this.presets.put(clfskqmfnl(gosmdojvyvplsln(), i3), billfordPreset);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 225702977) {
                                                i4 = 2012129521 ^ i3;
                                                this.config.addPreset(clfskqmfnl(mwjtaqmnyqjfgrt(), i4), 776011753);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1308183606) {
                                                    i3 = 276179991 ^ i4;
                                                    this.config.setCurrentPreset(clfskqmfnl(wridmhiwvxrirpf(), i3), 1497965819);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 834130802) {
                                                        i3 = 2113024405 ^ i3;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -567910439) {
                                                            int i12 = 95466148 ^ i3;
                                                            try {
                                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) == 151098716) {
                                                                    throw new RuntimeException();
                                                                }
                                                                throw null;
                                                            } catch (RuntimeException e) {
                                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                    case -207369479:
                                                                        i2 = 559514923 ^ i12;
                                                                        break;
                                                                    case 1443643440:
                                                                        i2 = 367817842 ^ i12;
                                                                        break;
                                                                    default:
                                                                        throw new IOException("Error in hash");
                                                                }
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -110107744) {
                                                                    while (true) {
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -110107744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (732941006 ^ i2)) {
                                                                            int i13 = 1803977177 ^ i2;
                                                                            throw new IllegalAccessException("double");
                                                                        }
                                                                    }
                                                                }
                                                                while (true) {
                                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                                                                        case 109781547:
                                                                            return;
                                                                        case 208209421:
                                                                            int i14 = 715679842 ^ i2;
                                                                            return;
                                                                        case 271675645:
                                                                        case 1309141936:
                                                                        default:
                                                                            while (true) {
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1443643440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1246988218 ^ i2)) {
                                                                                    int i15 = 402407405 ^ i2;
                                                                                    throw new IOException("double");
                                                                                }
                                                                            }
                                                                            break;
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
                                    case -1308183606:
                                        i3 = slwymquzcylcpufz(i3, 1996259178);
                                        break;
                                    case -1091289399:
                                        i3 = 392310474 ^ i3;
                                        break;
                                    case -190142247:
                                        i3 = 506067976 ^ i3;
                                        break;
                                    case 225702977:
                                        i3 = 18012059 ^ i3;
                                        break;
                                    case 834130802:
                                        i3 = 1720341373 ^ i3;
                                        break;
                                    case 1033297514:
                                        i3 = 1729000158 ^ i3;
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 98912409) {
                                    i3 = 2024377309 ^ i3;
                                    this.plugin.getLogger(583940502).severe("Failed to create default preset: " + r0.getMessage());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1062660494) {
                                        int i16 = 325635320 ^ i3;
                                        r0.printStackTrace();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 1542418866) {
                                            int i17 = 2130213408 ^ i16;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == 1542418866 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (149682010 ^ i16)) {
                                                int i18 = 200573688 ^ i16;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -172022440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (615935483 ^ i3)) {
                        int i19 = 301181862 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -190142247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (119629214 ^ i3)) {
                            int i20 = 1738077312 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 834130802 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (677947670 ^ i3)) {
                                int i21 = 838625929 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 225702977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (944707408 ^ i3)) {
                                    int i22 = 1781640656 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1033297514 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1040150333 ^ i3)) {
                                        int i23 = 546261523 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -671216559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (972087879 ^ i3)) {
                                            int i24 = 1333782059 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1091289399 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (347031603 ^ i3)) {
                                                int i25 = 2062080788 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1406361423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (42563118 ^ i3)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int i26 = 1089867868 ^ i3;
                throw new IllegalAccessException();
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1308183606 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (67167164 ^ i4)) {
                    int i27 = 115224708 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -832319430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (988688972 ^ i4)) {
                        break;
                    }
                }
            }
            int i28 = 1770634871 ^ i4;
            throw new IOException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1062660494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (810277196 ^ i3)) {
                int i29 = 1720198920 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1481728345 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1263204109 ^ i3)) {
                    int i30 = 1496939618 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -567910439 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1974988564 ^ i3)) {
                        int i31 = 1389609357 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 762055728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2003163995 ^ i3)) {
                            int i32 = 1768728631 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 98912409 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1693076792 ^ i3)) {
                                int i33 = 1657290186 ^ i3;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
        }
    }

    public long getTimeUntilNextChange(int i) {
        int i2 = 594256746 ^ (201526533 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -881882559) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -881882559 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (941744957 ^ i2)) {
                    break;
                }
            }
            int i3 = 752038106 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 2090975296 ^ i2;
        long lastPresetChange = this.config.getLastPresetChange(669247356);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 778143810) {
            int i5 = 497478208 ^ i4;
            String presetChangeInterval = this.config.getPresetChangeInterval(1301247373);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1017718206) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1017718206 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1603235382 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1802209941 ^ i5;
                throw new RuntimeException("double");
            }
            i4 = 1607964231 ^ i5;
            long parseInterval = parseInterval(presetChangeInterval, 1116006446);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1038772344) {
                i4 = 1840816525 ^ i4;
                long j = lastPresetChange + parseInterval;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1345283091) {
                    i4 = 1948055280 ^ i4;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -255274096) {
                        int i7 = 1569002837 ^ i4;
                        return Math.max(0L, j - currentTimeMillis);
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -255274096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1112262997 ^ i4)) {
                int i8 = 1314225083 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 778143810 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1470894423 ^ i4)) {
                    int i9 = 2123160961 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1038772344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1261282964 ^ i4)) {
                        int i10 = 1109837437 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1345283091 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (860618320 ^ i4)) {
                            break;
                        }
                    }
                }
            }
        }
        int i11 = 82501744 ^ i4;
        throw new IllegalAccessException();
    }

    private long parseInterval(java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.billford.manager.BillfordManager.parseInterval(java.lang.String, int):long");
    }

    @Generated
    public Map getPresets(int i) {
        int i2 = 488097875 ^ (576391725 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1246554825) {
            int i3 = 12029503 ^ i2;
            return this.presets;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1341168433 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1128542895 ^ i2)) {
                int i4 = 1527797209 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1246554825 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2108633154 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 482416067 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public BillfordPreset getCurrentPreset(int i) {
        int i2 = 1632551908 ^ (48682107 ^ 369450791);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1385544253) {
            int i3 = 572049612 ^ i2;
            return this.currentPreset;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1385544253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (339135386 ^ i2)) {
                int i4 = 902723302 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1112800350 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1111893516 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1268603353 ^ i2;
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here[0] = "⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆";
        nothing_to_see_here[5] = "⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿";
        nothing_to_see_here[6] = "⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀";
        nothing_to_see_here[7] = "⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[8] = "⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉              ";
        klmnssjtpj = rwkzafpeyrtajog();
        iCsKt69qgP = 789430512 ^ new Random(998931037808083035L).nextInt();
    }

    public static String clfskqmfnl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ klmnssjtpj[i3 % klmnssjtpj.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] rwkzafpeyrtajog() {
        return new byte[]{25, 2, 28, 48, 32, 91, 24, 41, 43, 99, 117, 14, 53, 126, 40, 117, 89, 81, 126, 57, 68, Byte.MAX_VALUE, 93, 41};
    }

    private static byte[] ojtwsiytocyhpup() {
        return new byte[]{-42, -56, 47, 45, 17, 18, 33, 118, 27, 54};
    }

    private static byte[] dltpjgrqgncmsoe() {
        return new byte[]{-42, -55, 43, 114, 21, 26, 32, 117, 29, 33, 68, 95, 2, 56, 29, 53};
    }

    private static byte[] pqtrhwglvlbwklv() {
        return new byte[]{-42, -52, 43, 71, 20, 4, 33, 49, 29, 34, 68, 75, 12, 47, 24, 63, 97, 2, 79, 124, 115, 53, 105, 57, 32, 91, 42, 119, 17, 13, 33, 116, 27, 54, 77, 89, 4, 45, 31, 32, 109, 4, 71, 32};
    }

    private static byte[] keifrhjzvwhkmzd() {
        return new byte[]{-42, -49, 44, 114, 25, 25, 44, 124, 26, 35, 68, 89, 5, 56, 17, 54, 109, 78, 79, 111, 117, 53, 109, 122, 32, 95, 40, 112, 17, 4, 41, 126, 27, Byte.MAX_VALUE, 76, 71, 1, 35, 25, 42};
    }

    private static byte[] gosmdojvyvplsln() {
        return new byte[]{-46, -53, 41, 101, 24, 16, 47, 112, 31, 59, 67, 75, 5, 42, 27, 39};
    }

    private static byte[] wridmhiwvxrirpf() {
        return new byte[]{-42, -52, 43, 109, 16, 19, 32, 121, 28, 58, 68, 79, 2, 42, 24, 32};
    }

    private static byte[] yisnpemohczyqlc() {
        return new byte[]{-42, -56, 44, 99, 21, 20, 42, 112, 27, 57, 68, 75, 5, 36, 29, 39};
    }

    private static byte[] mwjtaqmnyqjfgrt() {
        return new byte[]{-42, -55, 40, 98, 16, 27, 33, Byte.MAX_VALUE, 19, 59, 68, 74, 1, 37, 24, 40};
    }

    private static byte[] lewcrgykmljjpfd() {
        return new byte[]{-46, -60, 44, 115};
    }

    private static byte[] olvmksghkosdpdr() {
        return new byte[]{-42, -60, 41, 83, 23, 60, 44, 45, 18, 121, 68, 14, 0, 27};
    }

    private static byte[] mryvzxdzgddjglz() {
        return new byte[0];
    }

    private static byte[] cbvklcgijefkict() {
        return new byte[]{-43, -53, 44, 101};
    }

    private static byte[] ifgoxupahioozsp() {
        return new byte[]{-42, -52, 36, 96};
    }

    private static byte[] jalmdswzcbwssts() {
        return new byte[]{-42, -59, 41, 89, 24, 92, 46, 60, 28, 109, 68, 107};
    }

    private static byte[] ayvjzwcallrzxqe() {
        return new byte[0];
    }

    private static byte[] nliknublopokwcd() {
        return new byte[]{-42, -54, 43, 106};
    }

    private static int slwymquzcylcpufz(int i, int i2) {
        return i ^ i2;
    }
}
