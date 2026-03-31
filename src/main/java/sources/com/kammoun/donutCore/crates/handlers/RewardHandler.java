package com.kammoun.donutCore.crates.handlers;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.crates.models.CrateItem;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class RewardHandler {
    private final DonutModule plugin;
    private static int SGKd5ewC6h = 0;
    private transient int SjADWi5EAT = 1191133841;
    private static String[] nothing_to_see_here = new String[19];

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$com$kammoun$donutCore$api$utils$items$KItem$CommandType;

        private static int f468YaegNNeQt = 0;
        private transient int vacmwCJF3a = 1877810101;
        private static String[] nothing_to_see_here = new String[15];

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.handlers.RewardHandler.AnonymousClass1.m143clinit():void");
        }

        public static String ocglwkomcm(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] gjqmjazwdcbdgra() {
            return new byte[]{5};
        }

        private static int xgygkeeolkdqgoav(int i, int i2) {
            return i2 ^ i;
        }
    }

    public RewardHandler(com.kammoun.donutCore.api.module.DonutModule r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.handlers.RewardHandler.<init>(com.kammoun.donutCore.api.module.DonutModule, int):void");
    }

    public void giveReward(Player player, CrateItem crateItem, int i) {
        int i2 = 823315460 ^ (799038549 ^ 901965146);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1535354969) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1535354969 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1031417624 ^ i2)) {
                    break;
                }
            }
            int i3 = 764009829 ^ i2;
            throw new IOException("double");
        }
        int i4 = 2034443909 ^ i2;
        SchedulerUtil.runAtEntity(player, () -> {
            int i5;
            int i6 = 1091070529 ^ (1811194526 ^ 901965146);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -101618648) {
                int i7 = 510963443 ^ i6;
                if (crateItem.isGiveIcon(788212499) != (21660534 ^ i7)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 173284272) {
                        int i8 = 1539707248 ^ i7;
                        ItemStack itemStack = crateItem.getRewardItem(687656027).getItemStack(1475551979);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -731606990) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -731606990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (71027698 ^ i8)) {
                                    break;
                                }
                            }
                            int i9 = 1958788354 ^ i8;
                            throw new RuntimeException("double");
                        }
                        i6 = 647284609 ^ i8;
                        PlayerInventory inventory = player.getInventory();
                        ItemStack[] itemStackArr = new ItemStack[(byte) (2081969542 ^ i6)];
                        itemStackArr[(byte) (2081969543 ^ i6)] = itemStack;
                        HashMap addItem = inventory.addItem(itemStackArr);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -524112837) {
                            i5 = 290617573 ^ i6;
                            if (addItem.isEmpty() == (1833577826 ^ i5)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1783720723) {
                                    i6 = 1711717701 ^ i5;
                                    Iterator it = addItem.values().iterator();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1516536120) {
                                        int i10 = 834986884;
                                        while (true) {
                                            i6 = i10 ^ i6;
                                            if (it.hasNext() == (982021027 ^ i6)) {
                                                while (true) {
                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                                                        case 23616131:
                                                            i6 = 1657784394 ^ i6;
                                                            break;
                                                        case 115220212:
                                                        case 1278166015:
                                                            break;
                                                    }
                                                }
                                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -733766375) {
                                                i6 = 1551307293 ^ i6;
                                                ItemStack itemStack2 = (ItemStack) it.next();
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 939199987) {
                                                    i6 = 1699978552 ^ i6;
                                                    player.getWorld().dropItem(player.getLocation(), itemStack2);
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 493347888) {
                                                        i7 = 245979722 ^ i6;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1747793504) {
                                                            int i11 = 1620866106 ^ i7;
                                                            try {
                                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i11) == 73032997) {
                                                                    throw new IOException();
                                                                }
                                                                throw null;
                                                            } catch (IOException e) {
                                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                    case -169402021:
                                                                        i6 = 722795929 ^ i11;
                                                                        break;
                                                                    case 1825478579:
                                                                        i6 = ulpbjzajzlrreirr(i11, 942787396);
                                                                        break;
                                                                    default:
                                                                        throw new RuntimeException("Error in hash");
                                                                }
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1388261998) {
                                                                    i10 = 1864395281;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -733766375 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2141762532 ^ i6)) {
                                                int i12 = 406197445 ^ i6;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1388261998 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1739852616 ^ i6)) {
                                                    int i13 = 336976774 ^ i6;
                                                    throw new RuntimeException("double");
                                                }
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1825478579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1242740938 ^ i5)) {
                                        int i14 = 1856149023 ^ i5;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1760722080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (586061772 ^ i5)) {
                                            int i15 = 1795100710 ^ i5;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1783720723 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1222483142 ^ i5)) {
                                                int i16 = 1413299803 ^ i5;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                }
                            } else {
                                i5 = 1616143094 ^ i5;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1747793504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2057199365 ^ i7)) {
                            int i17 = 218202003 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 173284272 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (18331751 ^ i7)) {
                                int i18 = 470720452 ^ i7;
                                throw new IOException("double");
                            }
                        }
                    }
                } else {
                    i5 = 206884066 ^ i7;
                }
                executeCommands(player, crateItem.getRewardItem(687656027), 1695733922);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1760722080) {
                    int i19 = 540066272 ^ i5;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1825478579) {
                        int i142 = 1856149023 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1760722080) {
                            continue;
                        } else {
                            int i152 = 1795100710 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1783720723) {
                                int i162 = 1413299803 ^ i5;
                                throw new IOException("double");
                            }
                            continue;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 939199987 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2056995159 ^ i6)) {
                    int i20 = 882187492 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1516536120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (111740917 ^ i6)) {
                        int i21 = 1800460596 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -169402021 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2021566257 ^ i6)) {
                            int i22 = 914337962 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -101618648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2135292285 ^ i6)) {
                                int i23 = 669212427 ^ i6;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -524112837 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1580473335 ^ i6)) {
                                    int i24 = 50505856 ^ i6;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            }
        }, 1442337497);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1852138382) {
            int i5 = 1922929011 ^ i4;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 91625449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1008911135 ^ i4)) {
                int i6 = 2002973858 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1852138382 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (751495269 ^ i4)) {
                    break;
                }
            }
        }
        int i7 = 210512026 ^ i4;
        throw new IOException();
    }

    private void executeCommands(org.bukkit.entity.Player r6, com.kammoun.donutCore.api.utils.items.KItem r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.crates.handlers.RewardHandler.executeCommands(org.bukkit.entity.Player, com.kammoun.donutCore.api.utils.items.KItem, int):void");
    }

    static {
        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀";
        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀";
        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀";
        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀";
        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀";
        nothing_to_see_here[5] = "⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀";
        nothing_to_see_here[6] = "⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀";
        nothing_to_see_here[7] = "⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀";
        nothing_to_see_here[8] = "⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀";
        nothing_to_see_here[9] = "⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀";
        nothing_to_see_here[10] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[11] = "⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀";
        nothing_to_see_here[12] = "⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀";
        nothing_to_see_here[13] = "⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀";
        nothing_to_see_here[14] = "⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀";
        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀";
        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀";
        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀";
        nothing_to_see_here[18] = "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        SGKd5ewC6h = (-250809173) ^ new Random(-5517853855638054583L).nextInt();
    }

    public static String tvmyqwwylr(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] rkuucoyvqvzybnm() {
        return new byte[]{111, 62, 90, 91, 98, 19, 77, 90, 9, 125, 69, 57, 113, 125, 55, 5, 59, 117, 125, 78, 123, 56, 51, Byte.MAX_VALUE, 64, 27, 73, 54, 76, 29, 44, 100, 32, 97, 126, 115, 61, 51, 108, 45, 45, 99, 80, 7, 73, 103, 126, 123, 52, Byte.MAX_VALUE, 108, 21, 48, 84, 34, 95, 100, 85, 124, 78, 78, 78, 111, 42, 83, 90, 24, 114, 28, 38, 52, 97, 32, 101, 82, 33, 110, 38, 78};
    }

    private static byte[] jjdsspepkjeoqkh() {
        return new byte[]{-96, -8, 110, 74, 80, 82, Byte.MAX_VALUE, 3, 57, 45, 124, 116, 69, 42, 6, 69, 14, 96};
    }

    private static byte[] rjtjoxpvnxumulw() {
        return new byte[]{-96, -8, 110, 74, 80, 82, Byte.MAX_VALUE, 3, 57, 45, 124, 116, 69, 42, 6, 69, 14, 26, 76, 2, 79, 121, 1, 39, 114, 74, 121, 34};
    }

    private static int ulpbjzajzlrreirr(int i, int i2) {
        return i ^ i2;
    }
}
