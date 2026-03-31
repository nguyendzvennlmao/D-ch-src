package com.kammoun.donutCore.mythictools.abilities;

import com.kammoun.donutCore.mythictools.MythicPlugin;
import com.kammoun.donutCore.mythictools.utils.BlocksUtils;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.util.RayTraceResult;

public class ToolAbilities {
    private final MythicPlugin plugin;
    private static int MA57XrgkcN = 0;
    private transient int m9XbJfWoqg = 315959114;
    private static byte[] nymuhjekhf;
    private static String[] nothing_to_see_here = new String[17];

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$org$bukkit$block$BlockFace;
        private static int ZvDIlPMQIe = 0;
        private transient int AXpWPvCvx2 = 1717700157;
        private static byte[] daecjzqqxo;
        private static String[] nothing_to_see_here;

        static {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.abilities.ToolAbilities.AnonymousClass1.m239clinit():void");
        }

        public static String wxaapcdnqr(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ daecjzqqxo[i3 % daecjzqqxo.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] qogkimlpafqgakz() {
            return new byte[]{45, 86, 90, 45, 119, 77, 116, 73, 57, 48, 113, 58, 29, 83, 4, 35, 5, 12, 112, 48, 31, 97, 30, 70, 93, 71, 85, 76, 66, 96, 12, 85, 46, 19, 107, 51, 113, 1, 46, 30, 96, 108, 1, 96, 45, 94, 41, 63, 40, 38, 45, 59, 37, 44, 14, 126, 51, 99, 56, 84, 104, 18, 109, 57, 97, 37, 80, 117, 19, 14, 67, 50, 55, 97, 97, 83, 95, 76, 126, 83, 105, 16, 114, 23, 69, 66, 10, 106, 87, 20, 96, 99, 123, 91, 29, 46, 105, 24, 126, 25, 108, 113, 55, 90, 10, 113, 12, 15, 71, 113, 4, 118};
        }

        private static int ejchigrigaxpvhlm(int i, int i2) {
            return i2 ^ i;
        }
    }

    public ToolAbilities(com.kammoun.donutCore.mythictools.MythicPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.abilities.ToolAbilities.<init>(com.kammoun.donutCore.mythictools.MythicPlugin, int):void");
    }

    public void useDrill(Player player, Block block, int i) {
        int i2 = 1111935470 ^ (1588256664 ^ 1509942629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 681547930) {
            int i3 = 1184154923 ^ i2;
            Location location = block.getLocation();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 473543104) {
                int i4 = 1090515460 ^ i3;
                List list = get3x3Area(block, player, 1833269635);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 465969634) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 465969634 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1388229617 ^ i4)) {
                            break;
                        }
                    }
                    int i5 = 71398941 ^ i4;
                    throw new IOException("double");
                }
                i2 = 245097377 ^ i4;
                World world = player.getWorld();
                Particle particle = Particle.FLAME;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1863924970) {
                    i3 = 339231876 ^ i2;
                    Location add = location.clone().add(0.5d, 0.5d, 0.5d);
                    byte b = (byte) (1507549959 ^ i3);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -824502070) {
                        i2 = 917879342 ^ i3;
                        world.spawnParticle(particle, add, b, 0.5d, 0.5d, 0.5d, 0.05d);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2071382459) {
                            int i6 = 994321395 ^ i2;
                            player.playSound(location, Sound.BLOCK_ANVIL_LAND, 0.5f, 2.0f);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1588079070) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1588079070 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (583290621 ^ i6)) {
                                        break;
                                    }
                                }
                                int i7 = 814748050 ^ i6;
                                throw new RuntimeException("double");
                            }
                            int i8 = 1752255758 ^ i6;
                            Iterator it = list.iterator();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -488784303) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -488784303 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (37131868 ^ i8)) {
                                        break;
                                    }
                                }
                                int i9 = 1710279542 ^ i8;
                                throw new IllegalAccessException("double");
                            }
                            i3 = 1046551737 ^ i8;
                            while (it.hasNext() != (37399411 ^ i3)) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 299195288) {
                                    i2 = 859487336 ^ i3;
                                    Block block2 = (Block) it.next();
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2013218599) {
                                        i3 = 243442663 ^ i2;
                                        if (block2.getType() == Material.AIR) {
                                            i3 = gnjktirqymkbuvog(i3, 501176580);
                                        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -65689631) {
                                            i3 = 1327216643 ^ i3;
                                            if (block2.getType() != Material.BEDROCK) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2067240965) {
                                                    i2 = 1737928293 ^ i3;
                                                    block2.breakNaturally(player.getInventory().getItemInMainHand());
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1199762224) {
                                                        i3 = 894586722 ^ i2;
                                                    }
                                                }
                                            }
                                            while (true) {
                                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                                    case 133125155:
                                                    case 170457527:
                                                        i3 = 1388634375 ^ i3;
                                                        break;
                                                    case 2067594943:
                                                        break;
                                                }
                                            }
                                        }
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 317681601) {
                                            int gnjktirqymkbuvog = gnjktirqymkbuvog(i3, 930706825);
                                            try {
                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(gnjktirqymkbuvog) == 150401662) {
                                                    throw new RuntimeException();
                                                }
                                                throw null;
                                            } catch (RuntimeException e) {
                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                    case -1457208440:
                                                        i3 = 1788730619 ^ gnjktirqymkbuvog;
                                                        break;
                                                    case 521256403:
                                                        i3 = 475755312 ^ gnjktirqymkbuvog;
                                                        break;
                                                    default:
                                                        throw new RuntimeException("Error in hash");
                                                }
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -37084077) {
                                                }
                                                while (true) {
                                                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                                        case 124852740:
                                                        case 125209458:
                                                            i3 = 2105798649 ^ i3;
                                                            break;
                                                        case 1132793272:
                                                            break;
                                                        case 1886074627:
                                                        default:
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 521256403 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1477259997 ^ i3)) {
                                                                    int i10 = 1152328293 ^ i3;
                                                                    throw new RuntimeException("double");
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1406392229 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1480697025 ^ i3)) {
                                                    int i11 = 1781692502 ^ i3;
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 317681601 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (419587502 ^ i3)) {
                                                        int i12 = 1241092672 ^ i3;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            int i13 = 2009017976 ^ i3;
                            return;
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2067240965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1007909026 ^ i3)) {
                            int i14 = 410736168 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -824502070 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (323267199 ^ i3)) {
                                int i15 = 823007782 ^ i3;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -37084077 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (686586773 ^ i3)) {
                    int i16 = 600578908 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -65689631 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1981388156 ^ i3)) {
                        int i17 = 197826964 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 473543104 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1795303267 ^ i3)) {
                            int i18 = 1727601251 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 299195288 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (986305446 ^ i3)) {
                                int i19 = 1242571756 ^ i3;
                                throw new RuntimeException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2013218599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2006897718 ^ i2)) {
                int i20 = 701057234 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1863924970 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (560363770 ^ i2)) {
                    int i21 = 1176929473 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1199762224 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1507403268 ^ i2)) {
                        int i22 = 650430457 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1457208440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1545346538 ^ i2)) {
                            int i23 = 1144013513 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2071382459 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1913109743 ^ i2)) {
                                int i24 = 364884406 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 681547930 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (124674258 ^ i2)) {
                                    int i25 = 1349862094 ^ i2;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void useSellAxe(org.bukkit.entity.Player r12, org.bukkit.block.Block r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.abilities.ToolAbilities.useSellAxe(org.bukkit.entity.Player, org.bukkit.block.Block, int):void");
    }

    public void useShovel(org.bukkit.entity.Player r15, org.bukkit.block.Block r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.abilities.ToolAbilities.useShovel(org.bukkit.entity.Player, org.bukkit.block.Block, int):void");
    }

    public org.bukkit.Material getAppropriateToolMaterial(org.bukkit.block.Block r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.abilities.ToolAbilities.getAppropriateToolMaterial(org.bukkit.block.Block, int):org.bukkit.Material");
    }

    private java.util.List get3x3Area(org.bukkit.block.Block r9, org.bukkit.entity.Player r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.abilities.ToolAbilities.get3x3Area(org.bukkit.block.Block, org.bukkit.entity.Player, int):java.util.List");
    }

    private BlockFace getTargetBlockFace(Player player, int i) {
        int i2 = 2030767351 ^ (1874464902 ^ 1509942629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2054670498) {
            i2 = 1228826777 ^ i2;
            RayTraceResult rayTraceBlocks = player.rayTraceBlocks(5.0d);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 864324712) {
                int i3 = 303673568 ^ i2;
                if (rayTraceBlocks != null) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1555494040) {
                        i3 = 698731421 ^ i3;
                        if (rayTraceBlocks.getHitBlockFace() != null) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -295217279) {
                                int i4 = 833441161 ^ i3;
                                return rayTraceBlocks.getHitBlockFace();
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -295217279 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1540095826 ^ i3)) {
                                    break;
                                }
                            }
                            int i5 = 164736735 ^ i3;
                            throw new IOException("double");
                        }
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                case 129841917:
                                    int i6 = 1325841330 ^ i3;
                                    break;
                                case 691870659:
                                case 1739928596:
                                    break;
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1555494040 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1821137485 ^ i3)) {
                            int i7 = 546467550 ^ i3;
                            throw new RuntimeException("double");
                        }
                    }
                } else {
                    gnjktirqymkbuvog(i3, 1721987119);
                }
                return BlockFace.SELF;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1661811656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1245926114 ^ i2)) {
                int i8 = 1239082659 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 864324712 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1057897484 ^ i2)) {
                    int i9 = 5955420 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 2054670498 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1185742525 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i10 = 378366326 ^ i2;
        throw new IOException();
    }

    public void useTreeChopper(Player player, Block block, int i) {
        int i2 = 146300497 ^ (2011228331 ^ 1509942629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893033721) {
            i2 = 214162066 ^ i2;
            if (BlocksUtils.isLog(block.getType(), 1555384460) != (711231757 ^ i2)) {
                i2 = 1665560476 ^ i2;
                breakTree(block, new HashSet(), player, 624749294);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1226257546) {
                    int i3 = 2038093829 ^ i2;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1394886761) {
                int i4 = 1856777428 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1226257546 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1560259759 ^ i2)) {
                int i5 = 398583962 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 893033721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1439296726 ^ i2)) {
                    int i6 = 2012107543 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1394886761 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (19732142 ^ i2)) {
                        int i7 = 196090215 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 642068170 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1451788143 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 1639661646 ^ i2;
        throw new IllegalAccessException();
    }

    private void breakTree(org.bukkit.block.Block r15, java.util.Set r16, org.bukkit.entity.Player r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.mythictools.abilities.ToolAbilities.breakTree(org.bukkit.block.Block, java.util.Set, org.bukkit.entity.Player, int):void");
    }

    private Set getAdjacentBlocks(Block block, int i) {
        int i2 = 588363768 ^ (1051166105 ^ 1509942629);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 575584290) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 575584290 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (329276243 ^ i2)) {
                    break;
                }
            }
            int i3 = 347537844 ^ i2;
            throw new IOException("double");
        }
        int i4 = 2090129380 ^ i2;
        HashSet hashSet = new HashSet();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -957872383) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -957872383 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1293433161 ^ i4)) {
                    break;
                }
            }
            int i5 = 644397916 ^ i4;
            throw new IOException("double");
        }
        int i6 = 2133068908 ^ i4;
        hashSet.add(block.getRelative((byte) (1207504013 ^ i6), (byte) (1207504012 ^ i6), (byte) (1207504012 ^ i6)));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1070097506) {
            i6 = 1258475746 ^ i6;
            hashSet.add(block.getRelative((byte) ((-217832559) ^ i6), (byte) (217832558 ^ i6), (byte) (217832558 ^ i6)));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1742660464) {
                int i7 = 1851796272 ^ i6;
                hashSet.add(block.getRelative((byte) (1654388574 ^ i7), (byte) (1654388575 ^ i7), (byte) (1654388574 ^ i7)));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 350206707) {
                    i6 = 1604500048 ^ i7;
                    hashSet.add(block.getRelative((byte) (1027165454 ^ i6), (byte) ((-1027165455) ^ i6), (byte) (1027165454 ^ i6)));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -372610959) {
                        i6 = 992491881 ^ i6;
                        hashSet.add(block.getRelative((byte) (101807207 ^ i6), (byte) (101807207 ^ i6), (byte) (101807206 ^ i6)));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 814457656) {
                            i7 = 1749875606 ^ i6;
                            hashSet.add(block.getRelative((byte) (1851625457 ^ i7), (byte) (1851625457 ^ i7), (byte) ((-1851625458) ^ i7)));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1928101771) {
                                int i8 = 1911837108 ^ i7;
                                return hashSet;
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1928101771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1386338148 ^ i7)) {
                        int i9 = 1333082467 ^ i7;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 350206707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1414351844 ^ i7)) {
                            break;
                        }
                    }
                }
                int i10 = 535070558 ^ i7;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -372610959 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (840594732 ^ i6)) {
                int i11 = 1838179811 ^ i6;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 814457656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1089106452 ^ i6)) {
                    int i12 = 117547823 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -45157848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (358187579 ^ i6)) {
                        int i13 = 1906969332 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1742660464 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (703768958 ^ i6)) {
                            int i14 = 1995832987 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1070097506 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1508714071 ^ i6)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i15 = 1339745375 ^ i6;
        throw new IllegalAccessException();
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
        nymuhjekhf = amrwavpgfffppit();
        MA57XrgkcN = 976945739 ^ new Random(-5042438073777054617L).nextInt();
    }

    public static String jcagnukfcr(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ nymuhjekhf[i3 % nymuhjekhf.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] amrwavpgfffppit() {
        return new byte[]{52, 88, 90, 48, 63, 84, 8, 99, 24, 36, 12, 25, 51, 9, 6, 15, 66, 4, 121, 14, 58, 65, 110, 124, 50, 14, 32, 111, 85, 64, 101, 74, 1, 62, 82, 17, 16, 17, 93, 77, 95, 121, 30, 70, 2, 35, 21, 121, 39, Byte.MAX_VALUE, 120, 70, 32, 119, 41, 112, 16, 36, 84, 45, 25, 62, 57, 50, 11, 81, 47, 88, 126, 51, 43, 55, 57, 18, 1, 117, 86, 113, 83, 110, 46, 49, 113, 102};
    }

    private static byte[] cfhmpxyvbqddtye() {
        return new byte[]{-13, -107, 111, 38, 13, 10, 48, 38, 44, 120, 62, 65, 0, 72, 49, 18};
    }

    private static byte[] spwpwidgbcfddaw() {
        return new byte[]{-13, -107, 111, 38, 13, 14, 48, 61, 44, 115, 62, 73, 0, 66, 49, 18};
    }

    private static byte[] bxekmhsefgctevz() {
        return new byte[]{-7, -109, 104, 76, 7, 62, 59, 30};
    }

    private static byte[] oxvxlsszqsftkhf() {
        return new byte[]{-4, -108, 107, 84, 14, 55, 58, 28, 41, 92, 63, 109};
    }

    private static int gnjktirqymkbuvog(int i, int i2) {
        return i2 ^ i;
    }
}
