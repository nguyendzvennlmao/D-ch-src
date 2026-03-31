package com.kammoun.donutCore.mythictools.utils;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.mythictools.MythicPlugin;
import com.kammoun.utils.nbtapi.NBTItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ToolsHelper {
    private static int LmZDZJsOKm = 0;
    private transient int VtfJHrsrnf = 654271066;
    private static String tepybcufez;
    private static String[] nothing_to_see_here = new String[17];

    public ToolsHelper() {
        int i = 590129585 ^ (394965050 ^ 1849645731);
        int parseInt = 1960690475 ^ (1869646194 ^ Integer.parseInt("1093929329"));
        this.VtfJHrsrnf = 654271066 ^ LmZDZJsOKm;
        int i2 = 515197422 ^ parseInt;
    }

    public static java.lang.String formatTimeNoSeconds(long r5, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.utils.ToolsHelper.formatTimeNoSeconds(long, int):java.lang.String");
    }

    public static void updateItemMaterialInMainHand(Player player, Material material, int i) {
        int i2 = 1458657338 ^ (694654240 ^ 674936847);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1117542230) {
            i2 = 1776738804 ^ i2;
            ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -229333239) {
                int i3 = 1513148077 ^ i2;
                player.getInventory().setItemInMainHand(updateItemMaterial(itemInMainHand, material, 1172478127));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 601018979) {
                    int i4 = 1110804679 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 601018979 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2061677535 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1740108381 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1117542230 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1241515995 ^ i2)) {
                int i6 = 1796138000 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 847156313 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2018371128 ^ i2)) {
                    int i7 = 76679446 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -229333239 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (566689710 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 852925712 ^ i2;
        throw new RuntimeException();
    }

    public static void updateItemLore(org.bukkit.entity.Player r6, int r7, org.bukkit.inventory.ItemStack r8, long r9, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.utils.ToolsHelper.updateItemLore(org.bukkit.entity.Player, int, org.bukkit.inventory.ItemStack, long, int):void");
    }

    public static org.bukkit.inventory.ItemStack applyTimedExpiration(org.bukkit.inventory.ItemStack r7, long r8, boolean r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.utils.ToolsHelper.applyTimedExpiration(org.bukkit.inventory.ItemStack, long, boolean, int):org.bukkit.inventory.ItemStack");
    }

    private static ItemStack updateItemMaterial(ItemStack itemStack, Material material, int i) {
        ArrayList arrayList;
        int i2;
        int i3 = 1563772970 ^ (2053919669 ^ 674936847);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2065505408) {
            int i4 = 226919604 ^ i3;
            if (itemStack != null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 388577568) {
                    i4 = 406104221 ^ i4;
                    if (itemStack.hasItemMeta() != (449941433 ^ i4)) {
                        i4 = fqjaupoiaxidxmhc(i4, 1593261822);
                        NBTItem nBTItem = new NBTItem(itemStack);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 557156922) {
                            int i5 = 1106910356 ^ i4;
                            KItem kItem = new KItem(itemStack, 1697153028);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 786787992) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 786787992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (965805362 ^ i5)) {
                                        break;
                                    }
                                }
                                int i6 = 745504528 ^ i5;
                                throw new IOException("double");
                            }
                            i4 = 1221165478 ^ i5;
                            if (itemStack.getItemMeta().hasLore() != (1293233269 ^ i4)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1755931562) {
                                    int i7 = 1049593999 ^ i4;
                                    arrayList = new ArrayList(itemStack.getItemMeta().getLore());
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -1663752237) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1663752237 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1456079038 ^ i7)) {
                                                break;
                                            }
                                        }
                                        int i8 = 2036494944 ^ i7;
                                        throw new RuntimeException("double");
                                    }
                                    int i9 = 249133445 ^ i7;
                                    try {
                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i9) != 45285477) {
                                            throw null;
                                        }
                                        throw new IOException();
                                    } catch (IOException e) {
                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                            case -1892970120:
                                                i3 = 374974883 ^ i9;
                                                break;
                                            case -367072261:
                                                i3 = fqjaupoiaxidxmhc(i9, 2063533811);
                                                break;
                                            default:
                                                throw new IOException("Error in hash");
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1038539872) {
                                            i2 = fqjaupoiaxidxmhc(i3, 256323923);
                                        }
                                    }
                                }
                            }
                            while (true) {
                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                    case 89738039:
                                        i4 = 2134061038 ^ i4;
                                        break;
                                    case 463999559:
                                    case 688623421:
                                    default:
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 7675632 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (986784507 ^ i4)) {
                                                int i10 = 734353424 ^ i4;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                        break;
                                    case 936896850:
                                        break;
                                }
                            }
                            arrayList = new ArrayList();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1859117863) {
                                i2 = 987621700 ^ i4;
                                ArrayList arrayList2 = arrayList;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1205819128) {
                                    i2 = 304142288 ^ i2;
                                    kItem.lore(arrayList2, 882542907);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -690362248) {
                                        i3 = 1681049993 ^ i2;
                                        ItemStack itemStack2 = kItem.getItemStack(1475551979);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -145775565) {
                                            i4 = 1562410763 ^ i3;
                                            itemStack2.setType(material);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 508320873) {
                                                int i11 = 99255368 ^ i4;
                                                return preserveNBTData(nBTItem, itemStack2, 1195537005);
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -690362248 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1659790309 ^ i2)) {
                                        int i12 = 1321815397 ^ i2;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1205819128 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1408645659 ^ i2)) {
                                            int i13 = 763753815 ^ i2;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 557156922 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (397355873 ^ i4)) {
                                int i14 = 1241103838 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1755931562 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (874767948 ^ i4)) {
                                    int i15 = 1282255570 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 508320873 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1981076917 ^ i4)) {
                                        int i16 = 1372051351 ^ i4;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -695435832) {
                        int i17 = 450833511 ^ i4;
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1859117863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1198633263 ^ i4)) {
                        int i18 = 1580451269 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 388577568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (169578307 ^ i4)) {
                            int i19 = 382313260 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -695435832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (198636216 ^ i4)) {
                                int i20 = 1737886326 ^ i4;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            } else {
                int i21 = 48989434 ^ i4;
            }
            return null;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 823688745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1021987000 ^ i3)) {
                int i22 = 478150669 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -145775565 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (333003555 ^ i3)) {
                    int i23 = 1128856487 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2065505408 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (724904601 ^ i3)) {
                        int i24 = 1088865741 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1038539872 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (122687861 ^ i3)) {
                            int i25 = 1429151831 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -367072261 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1000769081 ^ i3)) {
                                int i26 = 544263626 ^ i3;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
    }

    private static java.util.List getLoreWithoutTimer(org.bukkit.inventory.ItemStack r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.utils.ToolsHelper.getLoreWithoutTimer(org.bukkit.inventory.ItemStack, int):java.util.List");
    }

    private static void addTimerLore(List list, NBTItem nBTItem, long j, int i) {
        byte b;
        int i2;
        int i3 = 1027248642 ^ (1445633981 ^ 674936847);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 425045378) {
            int i4 = 388834148 ^ i3;
            if (nBTItem.hasKey(yczbigkzmb(xdomjijzekpxoww(), i4)).booleanValue() != (1409783508 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1606633822) {
                    i4 = 1574940000 ^ i4;
                    if (nBTItem.getBoolean(yczbigkzmb(nqzkwynonqcnqny(), i4)).booleanValue() == (165166004 ^ i4)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1321328032) {
                            int i5 = 1478114700 ^ i4;
                            b = (byte) (1371670073 ^ i5);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -1911541310) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1911541310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1738850801 ^ i5)) {
                                        int i6 = 895535309 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -110056574 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (361001693 ^ i5)) {
                                            break;
                                        }
                                    }
                                }
                                int i7 = 905531795 ^ i5;
                                throw new RuntimeException("double");
                            }
                            int i8 = 1007217447 ^ i5;
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i8) == 79251110) {
                                    throw new IOException();
                                }
                                throw null;
                            } catch (IOException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -110056574:
                                        i4 = 1494359721 ^ i8;
                                        break;
                                    case 1851222267:
                                        i4 = fqjaupoiaxidxmhc(i8, 1811343046);
                                        break;
                                    default:
                                        throw new RuntimeException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 836787912) {
                                    i2 = 727814692 ^ i4;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1851222267 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1652198542 ^ i4)) {
                                int i9 = 1716032389 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 836787912 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (110636429 ^ i4)) {
                                    int i10 = 1118988165 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 403299338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (983197747 ^ i4)) {
                                        int i11 = 15807886 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1405008888 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1369964317 ^ i4)) {
                                            int i12 = 66092937 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1009953278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (289850051 ^ i4)) {
                                                int i13 = 225970180 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1321328032 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1203169806 ^ i4)) {
                                                    int i14 = 1021983956 ^ i4;
                                                    throw new RuntimeException();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                            case 51575412:
                                i4 = 1255735349 ^ i4;
                                break;
                            case 171455730:
                                break;
                            case 366930772:
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1697472479 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (154152661 ^ i4)) {
                        int i15 = 1987665849 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1606633822 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1836193676 ^ i4)) {
                            int i16 = 1069526427 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1043060722 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1497641734 ^ i4)) {
                                int i17 = 1752926525 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 901893713 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (209535891 ^ i4)) {
                                    int i18 = 1355876312 ^ i4;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                }
            } else {
                i4 = 386313557 ^ i4;
            }
            b = (byte) (1124154241 ^ i4);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 403299338) {
                i2 = 1851564668 ^ i4;
                byte b2 = b;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1793904617) {
                    i3 = 814381977 ^ i2;
                    if (b2 == (500687460 ^ i3)) {
                        i4 = 396375323 ^ i3;
                        list.add(MythicPlugin.getInstance(1824260241).getConfig(127597628).getString(yczbigkzmb(pejuyvzkjmgdukx(), i4), yczbigkzmb(nfjsgscouqefvnk(), i4)) + formatTimeNoSeconds(j, 1319567150));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1405008888) {
                            int i19 = 751824565 ^ i4;
                            return;
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -289467616) {
                        i2 = 1429291358 ^ i3;
                        list.add(MythicPlugin.getInstance(1824260241).getConfig(127597628).getString(yczbigkzmb(yyimkgurhkfevcr(), i2), yczbigkzmb(uvbfdlayjlosuaq(), i2)));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1194662354) {
                            i4 = 254007748 ^ i2;
                            list.add(MythicPlugin.getInstance(1824260241).getConfig(127597628).getString(yczbigkzmb(vcrubppfjcppqjq(), i4), yczbigkzmb(difimwqjxveadys(), i4)) + formatTimeNoSeconds(j, 1319567150));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1043060722) {
                                int i20 = 1956589306 ^ i4;
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i20) == 58667421) {
                                        throw new RuntimeException();
                                    }
                                    throw null;
                                } catch (RuntimeException e2) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                        case -1697472479:
                                            i4 = 1797521092 ^ i20;
                                            break;
                                        case -817841232:
                                            i4 = 1100070326 ^ i20;
                                            break;
                                        default:
                                            throw new RuntimeException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1009953278) {
                                        fqjaupoiaxidxmhc(i4, 2126615306);
                                        return;
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1697472479) {
                                    int i152 = 1987665849 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1606633822) {
                                        continue;
                                    } else {
                                        int i162 = 1069526427 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1043060722) {
                                            continue;
                                        } else {
                                            int i172 = 1752926525 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 901893713) {
                                                int i182 = 1355876312 ^ i4;
                                                throw new RuntimeException("double");
                                            }
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1194662354 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1485266472 ^ i2)) {
                        int i21 = 1532681282 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1793904617 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1126739408 ^ i2)) {
                            int i22 = 307252079 ^ i2;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1851222267) {
                    int i92 = 1716032389 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 836787912) {
                        continue;
                    } else {
                        int i102 = 1118988165 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 403299338) {
                            continue;
                        } else {
                            int i112 = 15807886 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 1405008888) {
                                continue;
                            } else {
                                int i122 = 66092937 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1009953278) {
                                    continue;
                                } else {
                                    int i132 = 225970180 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1321328032) {
                                        int i142 = 1021983956 ^ i4;
                                        throw new RuntimeException();
                                    }
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 425045378 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1360276050 ^ i3)) {
                int i23 = 731329475 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -289467616 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2041693545 ^ i3)) {
                    int i24 = 650771589 ^ i3;
                    throw new IllegalAccessException("double");
                }
            }
        }
    }

    private static ItemStack preserveNBTData(NBTItem nBTItem, ItemStack itemStack, int i) {
        int i2;
        int i3;
        int fqjaupoiaxidxmhc;
        int i4 = 998748632 ^ (1160050812 ^ 674936847);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1261466278) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1261466278 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1518452068 ^ i4)) {
                    break;
                }
            }
            int i5 = 596382551 ^ i4;
            throw new RuntimeException("double");
        }
        int i6 = 2016476309 ^ i4;
        NBTItem nBTItem2 = new NBTItem(itemStack);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 1967679985) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1967679985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (454759730 ^ i6)) {
                    break;
                }
            }
            int i7 = 1083034759 ^ i6;
            throw new IllegalAccessException("double");
        }
        int i8 = 244544945 ^ i6;
        if (nBTItem.hasKey(yczbigkzmb(nnqbaokvyrofbrr(), i8)).booleanValue() != (540702863 ^ i8)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 30655609) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 30655609 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (63721850 ^ i8)) {
                        break;
                    }
                }
                int i9 = 962147329 ^ i8;
                throw new IllegalAccessException("double");
            }
            i3 = 1468817749 ^ i8;
            nBTItem2.setString(yczbigkzmb(zbpessynkieozoi(), i3), nBTItem.getString(yczbigkzmb(fhvfpipetoevtse(), i3)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1112486189) {
                i2 = 2040819403 ^ i3;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1112486189 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (791388737 ^ i3)) {
                    int i10 = 1806010122 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 186106874 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (924948915 ^ i3)) {
                        break;
                    }
                }
            }
            int i11 = 1498476995 ^ i3;
            throw new IOException("double");
        }
        i2 = 774377374 ^ i8;
        if (nBTItem.hasKey(yczbigkzmb(ssvirvqrmbyajmr(), i2)).booleanValue() != (236091153 ^ i2)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1888729224) {
                fqjaupoiaxidxmhc = 2019372328 ^ i2;
                nBTItem2.setLong(yczbigkzmb(wmkzyshuyqrgjcx(), fqjaupoiaxidxmhc), nBTItem.getLong(yczbigkzmb(ramgagjalxwcncf(), fqjaupoiaxidxmhc)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fqjaupoiaxidxmhc) == -1300573749) {
                    fqjaupoiaxidxmhc = 798078322 ^ fqjaupoiaxidxmhc;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fqjaupoiaxidxmhc) != -1300573749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fqjaupoiaxidxmhc) == (1183462821 ^ fqjaupoiaxidxmhc)) {
                        int i12 = 1666008325 ^ fqjaupoiaxidxmhc;
                        throw new RuntimeException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1334471302 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (388526865 ^ i2)) {
                    int i13 = 669607370 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1888729224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1113106593 ^ i2)) {
                        int i14 = 779377592 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -868879006 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (574456713 ^ i2)) {
                            break;
                        }
                    }
                }
            }
            int i15 = 1246455122 ^ i2;
            throw new RuntimeException();
        }
        fqjaupoiaxidxmhc = fqjaupoiaxidxmhc(i2, 1473026138);
        if (nBTItem.hasKey(yczbigkzmb(vrorkyypqlyfssm(), fqjaupoiaxidxmhc)).booleanValue() != (1507782475 ^ fqjaupoiaxidxmhc)) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fqjaupoiaxidxmhc) != -822642086) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fqjaupoiaxidxmhc) == -822642086 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fqjaupoiaxidxmhc) == (1134325855 ^ fqjaupoiaxidxmhc)) {
                        break;
                    }
                }
                int i16 = 1998747149 ^ fqjaupoiaxidxmhc;
                throw new RuntimeException("double");
            }
            i3 = 414979892 ^ fqjaupoiaxidxmhc;
            nBTItem2.setBoolean(yczbigkzmb(zfxstqrdcqtgdxa(), i3), nBTItem.getBoolean(yczbigkzmb(pfalwwaitctohnq(), i3)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 186106874) {
                i2 = 392973008 ^ i3;
                nBTItem2.setBoolean(yczbigkzmb(vosvatllvftkmuj(), i2), nBTItem.getBoolean(yczbigkzmb(bvxngtzckynvvfz(), i2)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1334471302) {
                    int i17 = 260574211 ^ i2;
                    return nBTItem2.getItem();
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1334471302) {
                        int i132 = 669607370 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1888729224) {
                            int i142 = 779377592 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -868879006) {
                                break;
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
                int i152 = 1246455122 ^ i2;
                throw new RuntimeException();
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1112486189) {
                    int i102 = 1806010122 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 186106874) {
                        break;
                        break;
                    }
                    continue;
                }
            }
            int i112 = 1498476995 ^ i3;
            throw new IOException("double");
        }
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(fqjaupoiaxidxmhc)) {
                case 236959359:
                    int i18 = 5788135 ^ fqjaupoiaxidxmhc;
                    break;
                case 385157389:
                    break;
                case 610391174:
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(fqjaupoiaxidxmhc) != -1300573749) {
            }
        }
    }

    public static com.kammoun.donutCore.mythictools.models.Tools.ToolsType getToolType(org.bukkit.inventory.ItemStack r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.utils.ToolsHelper.getToolType(org.bukkit.inventory.ItemStack, int):com.kammoun.donutCore.mythictools.models.Tools.ToolsType");
    }

    static {
        nothing_to_see_here[0] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣠⣤⣶⣶⣶⣤⣄⣀⣀⠄⠄⠄⠄⠄";
        nothing_to_see_here[1] = "⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣟⢿⣿⣿⣿⣶⣤⡀⠄";
        nothing_to_see_here[2] = "⠄⠄⠄⠄⠄⠄⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣜⠿⠿⣿⣿⣧⢓";
        nothing_to_see_here[3] = "⠄⠄⠄⠄⠄⡠⢛⣿⣿⣿⡟⣿⣿⣽⣋⠻⢻⣿⣿⣿⣿⡻⣧⡠⣭⣭⣿⡧";
        nothing_to_see_here[4] = "⠄⠄⠄⠄⠄⢠⣿⡟⣿⢻⠃⣻⣨⣻⠿⡀⣝⡿⣿⣿⣷⣜⣜⢿⣝⡿⡻⢔";
        nothing_to_see_here[5] = "⠄⠄⠄⠄⠄⢸⡟⣷⢿⢈⣚⣓⡡⣻⣿⣶⣬⣛⣓⣉⡻⢿⣎⠢⠻⣴⡾⠫";
        nothing_to_see_here[6] = "⠄⠄⠄⠄⠄⢸⠃⢹⡼⢸⣿⣿⣿⣦⣹⣿⣿⣿⠿⠿⠿⠷⣎⡼⠆⣿⠵⣫";
        nothing_to_see_here[7] = "⠄⠄⠄⠄⠄⠈⠄⠸⡟⡜⣩⡄⠄⣿⣿⣿⣿⣶⢀⢀⣿⣷⣿⣿⡐⡇⡄⣿";
        nothing_to_see_here[8] = "⠄⠄⠄⠄⠄⠄⠄⠄⠁⢶⢻⣧⣖⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣇⡟⣇⣷⣿";
        nothing_to_see_here[9] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣆⣤⣽⣿⡿⠿⠿⣿⣿⣦⣴⡇⣿⢨⣾⣿⢹⢸";
        nothing_to_see_here[10] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⠊⡛⢿⣿⣿⣿⣿⡿⣫⢱⢺⡇⡏⣿⣿⣸⡼";
        nothing_to_see_here[11] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⡿⠄⣿⣷⣾⡍⣭⣶⣿⣿⡌⣼⣹⢱⠹⣿⣇⣧";
        nothing_to_see_here[12] = "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣼⠁⣤⣭⣭⡌⢁⣼⣿⣿⣿⢹⡇⣭⣤⣶⣤⡝⡼";
        nothing_to_see_here[13] = "⠄⣀⠤⡀⠄⠄⠄⠄⠄⡏⣈⡻⡿⠃⢀⣾⣿⣿⣿⡿⡼⠁⣿⣿⣿⡿⢷⢸";
        nothing_to_see_here[14] = "⢰⣷⡧⡢⠄⠄⠄⠄⠠⢠⡛⠿⠄⠠⠬⠿⣿⠭⠭⢱⣇⣀⣭⡅⠶⣾⣷⣶";
        nothing_to_see_here[15] = "⠈⢿⣿⣧⠄⠄⠄⠄⢀⡛⠿⠄⠄⠄⠄⢠⠃⠄⠄⡜⠄⠄⣤⢀⣶⣮⡍⣴";
        nothing_to_see_here[16] = "⠄⠈⣿⣿⡀⠄⠄⠄⢩⣝⠃⠄⠄⢀⡄⡎⠄⠄⠄⠇⠄⠄⠅⣴⣶⣶⠄⣶";
        tepybcufez = ByteBuffer.wrap(ypzkoklqdgnxqrp()).asCharBuffer().toString();
        LmZDZJsOKm = 2118242526 ^ new Random(8427543417391432873L).nextInt();
    }

    public static String yczbigkzmb(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = tepybcufez.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] akosxetpfrkkyzc() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, 0};
    }

    private static byte[] vcfsfktaclcjkqk() {
        return new byte[]{0, 0, 0, 2, 0, 0, 0, 2};
    }

    private static byte[] ruqwfwffffrrxlt() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 4};
    }

    private static byte[] ubxyevyvfaqzloh() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 5};
    }

    private static byte[] ydpnxilukfpnzkr() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 25};
    }

    private static byte[] ebcgsxgoyoxtgdu() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 45};
    }

    private static byte[] vtyqkkikfprejqd() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 63};
    }

    private static byte[] nqzkwynonqcnqny() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, 81};
    }

    private static byte[] pejuyvzkjmgdukx() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, 101};
    }

    private static byte[] nfjsgscouqefvnk() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 119};
    }

    private static byte[] vcrubppfjcppqjq() {
        return new byte[]{0, 0, 0, 27, 0, 0, 0, -124};
    }

    private static byte[] difimwqjxveadys() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, -97};
    }

    private static byte[] xdomjijzekpxoww() {
        return new byte[]{0, 0, 0, 20, 0, 0, 0, -83};
    }

    private static byte[] yyimkgurhkfevcr() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, -63};
    }

    private static byte[] uvbfdlayjlosuaq() {
        return new byte[]{0, 0, 0, 30, 0, 0, 0, -39};
    }

    private static byte[] ssvirvqrmbyajmr() {
        return new byte[]{0, 0, 0, 18, 0, 0, 0, -9};
    }

    private static byte[] wmkzyshuyqrgjcx() {
        return new byte[]{0, 0, 0, 18, 0, 0, 1, 9};
    }

    private static byte[] ramgagjalxwcncf() {
        return new byte[]{0, 0, 0, 18, 0, 0, 1, 27};
    }

    private static byte[] vosvatllvftkmuj() {
        return new byte[]{0, 0, 0, 20, 0, 0, 1, 45};
    }

    private static byte[] bvxngtzckynvvfz() {
        return new byte[]{0, 0, 0, 20, 0, 0, 1, 65};
    }

    private static byte[] zfxstqrdcqtgdxa() {
        return new byte[]{0, 0, 0, 20, 0, 0, 1, 85};
    }

    private static byte[] pfalwwaitctohnq() {
        return new byte[]{0, 0, 0, 20, 0, 0, 1, 105};
    }

    private static byte[] nnqbaokvyrofbrr() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, 125};
    }

    private static byte[] vrorkyypqlyfssm() {
        return new byte[]{0, 0, 0, 20, 0, 0, 1, -115};
    }

    private static byte[] zbpessynkieozoi() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, -95};
    }

    private static byte[] fhvfpipetoevtse() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, -79};
    }

    private static byte[] joomnumugnpmpkc() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, -63};
    }

    private static byte[] mdhipxdmnvjvums() {
        return new byte[]{0, 0, 0, 16, 0, 0, 1, -47};
    }

    private static byte[] xneieiffjkivynh() {
        return new byte[]{0, 0, 0, 27, 0, 0, 1, -31};
    }

    private static byte[] nquisyaksltemvo() {
        return new byte[]{0, 0, 0, 14, 0, 0, 1, -4};
    }

    private static byte[] oozhfsmaalsmsgl() {
        return new byte[]{0, 0, 0, 18, 0, 0, 2, 10};
    }

    private static byte[] uiflrxskdzgxqyo() {
        return new byte[]{0, 0, 0, 13, 0, 0, 2, 28};
    }

    private static byte[] euqbyyzerlktwnz() {
        return new byte[]{0, 0, 0, 24, 0, 0, 2, 41};
    }

    private static byte[] gnwcdqguipbyzzk() {
        return new byte[]{0, 0, 0, 30, 0, 0, 2, 65};
    }

    private static byte[] ypzkoklqdgnxqrp() {
        return new byte[]{49, 80, 54, 21, 49, 91, 53, 17, 49, 91, 50, 93, 50, 78, 49, 76, 49, 90, 51, 93, 50, 83, 50, 104, 49, 92, 49, 87, 51, 88, 50, 81, 50, 78, 49, 93, 49, 86, 51, 107, 50, 67, 50, 67, 49, 89, 49, 64, 51, 64, 56, 92, 48, 76, 55, 65, 52, 89, 48, 81, 49, 83, 53, 104, 53, 64, 49, 89, 56, 92, 48, 80, 55, 71, 52, 110, 48, 75, 49, 68, 53, 86, 53, 70, 49, 68, 56, 84, 48, 81, 49, 84, 48, 65, 49, 66, 56, 91, 52, 91, 49, 90, 48, 103, 49, 83, 56, 75, 52, 66, 49, 80, 48, 74, 49, 79, 56, 108, 52, 70, 49, 80, 48, 85, 49, 83, 49, 93, 49, 74, 54, 69, 53, 95, 55, 95, 49, 83, 49, 108, 54, 84, 53, 79, 55, 70, 49, 89, 49, 65, 54, 72, 53, 104, 55, 66, 49, 89, 49, 94, 54, 84, 49, 91, 53, 72, 54, 66, 48, 88, 52, 88, 54, 86, 49, 105, 54, 68, 48, 93, 49, 91, 53, 84, 54, 68, 48, 111, 52, 66, 54, 65, 49, 87, 54, 66, 48, 64, 49, 83, 53, 85, 49, 67, 53, 95, 50, 91, 49, 84, 49, 67, 55, 24, 54, 94, 54, 94, 49, 67, 49, 82, 53, 24, 50, 83, 49, 73, 49, 65, 55, 92, 54, 64, 54, 84, 49, 66, 49, -112, 53, 1, 50, 115, 49, 73, 49, 65, 55, 92, 54, 64, 54, 84, 49, 66, 49, 13, 53, 22, 50, -111, 49, 82, 49, 70, 48, 93, 49, 95, 52, 81, 49, 70, 49, 31, 48, 88, 49, 93, 52, 70, 49, 81, 49, 28, 48, 80, 49, 87, 52, 88, 49, 85, 49, 75, 48, 81, 49, 86, 52, 25, 49, 80, 49, 71, 48, 70, 49, 83, 52, 64, 49, 93, 49, 93, 48, 90, 49, -107, 48, 3, 49, 118, 52, 65, 49, 70, 49, 83, 48, 64, 49, 91, 52, 91, 49, 90, 49, 8, 48, 20, 49, -107, 52, 85, 49, 89, 48, 64, 55, 76, 51, 93, 48, 81, 49, 87, 48, 102, 55, 92, 51, 80, 48, 84, 49, 85, 48, 64, 55, 93, 51, 81, 48, 103, 49, 71, 48, 77, 55, 89, 51, 71, 48, 76, 49, 70, 50, 90, 48, 90, 52, 83, 49, 74, 49, 31, 50, 95, 48, 88, 52, 68, 49, 93, 49, 28, 50, 87, 48, 82, 52, 90, 49, 89, 49, 75, 50, 86, 48, 83, 52, 27, 49, 76, 49, 91, 50, 94, 48, 82, 52, 68, 49, -107, 50, 4, 48, 99, 52, 95, 49, 85, 49, 87, 50, 65, 48, 13, 52, 22, 49, -97, 49, 87, 50, 96, 48, 67, 52, 87, 49, 74, 49, 70, 50, 64, 48, 23, 52, 89, 49, 86, 49, 18, 50, 85, 48, 94, 52, 68, 49, 75, 49, 70, 50, 19, 48, 66, 52, 69, 49, 93, 50, 94, 54, 73, 57, 69, 49, 93, 51, 91, 51, 85, 48, 102, 49, 84, 53, 75, 50, 67, 54, 89, 57, 67, 49, 76, 51, 109, 51, 66, 48, 80, 49, 92, 53, 86, 49, 84, 56, 77, 57, 69, 49, 81, 50, 80, 49, 90, 56, 107, 57, 84, 49, 65, 50, 73, 49, 80, 56, 70, 57, 72, 49, 102, 50, 77, 49, 80, 56, 89, 57, 84, 49, 84, 56, 77, 57, 69, 49, 81, 50, 80, 49, 90, 56, 107, 57, 84, 49, 65, 50, 73, 49, 80, 56, 70, 57, 72, 49, 102, 50, 77, 49, 80, 56, 89, 57, 84, 49, 89, 52, 74, 56, 68, 51, 80, 50, 90, 49, 87, 52, 108, 56, 68, 51, 81, 50, 94, 49, 81, 52, 65, 56, 111, 51, 75, 50, 71, 49, 85, 52, 65, 56, 68, 51, 93, 50, 87, 49, 89, 52, 74, 56, 68, 51, 80, 50, 90, 49, 87, 52, 108, 56, 68, 51, 81, 50, 94, 49, 81, 52, 65, 56, 111, 51, 75, 50, 71, 49, 85, 52, 65, 56, 68, 51, 93, 50, 87, 49, 93, 57, 78, 48, 68, 53, 89, 56, 90, 49, 83, 57, 104, 48, 84, 53, 84, 56, 95, 49, 81, 57, 78, 48, 85, 53, 85, 56, 108, 49, 67, 57, 67, 48, 81, 53, 67, 56, 71, 49, 93, 57, 78, 48, 68, 53, 89, 56, 90, 49, 83, 57, 104, 48, 84, 53, 84, 56, 95, 49, 81, 57, 78, 48, 85, 53, 85, 56, 108, 49, 67, 57, 67, 48, 81, 53, 67, 56, 71, 53, 89, 48, 78, 48, 70, 56, 94, 51, 92, 52, 83, 55, 111, 50, 76, 54, 92, 53, 91, 48, 91, 48, 109, 56, 66, 51, 76, 52, 64, 55, 85, 49, 88, 48, 78, 55, 76, 50, 92, 55, 92, 49, 86, 48, 104, 55, 92, 50, 81, 55, 89, 49, 84, 48, 78, 55, 93, 50, 80, 55, 106, 49, 70, 48, 67, 55, 89, 50, 70, 55, 65, 50, 93, 48, 65, 52, 70, 50, 80, 55, 93, 50, 83, 48, 103, 52, 70, 50, 87, 55, 91, 50, 92, 48, 103, 52, 70, 50, 65, 55, 68, 50, 85, 50, 93, 48, 65, 52, 70, 50, 80, 55, 93, 50, 83, 48, 103, 52, 70, 50, 87, 55, 91, 50, 92, 48, 103, 52, 70, 50, 65, 55, 68, 50, 85, 50, 84, 50, 75, 52, 68, 55, 93, 57, 91, 57, 81, 50, 107, 48, 67, 53, 86, 50, 86, 50, 94, 52, 111, 55, 65, 57, 75, 57, 66, 50, 81, 49, 92, 50, 64, 51, 68, 48, 92, 48, 90, 49, 82, 50, 102, 51, 68, 48, 91, 48, 92, 49, 93, 50, 102, 51, 68, 48, 77, 48, 67, 49, 84, 54, 66, 57, 94, 55, 94, 55, 93, 55, 68, 54, 20, 55, 91, 51, 88, 56, 69, 54, 83, 57, 25, 55, 87, 55, 93, 55, 90, 54, 88, 55, 78, 51, 82, 56, 83, 54, 27, 
        57, 83, 55, 70, 55, 74, 55, 87, 54, 77, 55, 94, 51, 88, 56, 89, 54, -111, 57, 0, 55, 119, 55, 77, 55, 68, 54, 88, 55, 67, 51, 94, 56, 88, 54, 88, 57, 13, 55, 19, 55, -97, 55, 87, 49, 76, 56, 94, 54, 95, 54, 93, 57, 68, 49, 21, 56, 91, 54, 93, 54, 74, 57, 83, 49, 22, 56, 82, 54, 74, 54, 72, 57, 95, 49, 74, 56, 82, 54, 65, 49, -97, 56, 0, 54, 119, 54, 64, 57, 70, 49, 81, 56, 69, 54, 87, 54, 75, 57, 12, 49, 24, 56, -112, 54, 81, 50, 68, 53, 81, 48, 91, 57, 87, 52, 65, 50, 29, 53, 84, 48, 89, 57, 64, 52, 86, 50, 30, 53, 92, 48, 83, 57, 94, 52, 82, 50, 73, 53, 93, 48, 82, 57, 31, 52, 71, 50, 89, 53, 85, 48, 83, 57, 64, 50, -105, 53, 15, 48, 98, 57, 91, 52, 94, 50, 85, 53, 74, 48, 12, 57, 18, 52, -108, 50, 85, 53, 107, 48, 66, 57, 83, 52, 65, 50, 68, 53, 75, 48, 22, 57, 93, 52, 93, 50, 16, 53, 94, 48, 95, 57, 64, 52, 64, 50, 68, 53, 24, 48, 67, 57, 65, 52, 86};
    }

    private static int fqjaupoiaxidxmhc(int i, int i2) {
        return i2 ^ i;
    }
}
