package com.kammoun.donutCore.home.gui;

import com.kammoun.donutCore.api.utils.items.KItem;
import com.kammoun.donutCore.api.utils.menu.KMenu;
import com.kammoun.donutCore.home.HomePlugin;
import com.kammoun.donutCore.home.managers.HomeManager;
import com.kammoun.donutCore.home.managers.MessagesManager;
import com.kammoun.donutCore.home.models.HomePlayer;
import com.kammoun.donutCore.home.models.MenuHolder;
import com.kammoun.donutCore.team.TeamPlugin;
import com.kammoun.donutCore.team.data.TeamTable;
import com.kammoun.donutCore.team.models.Enums.Permissions;
import com.kammoun.donutCore.team.models.Team;
import com.kammoun.donutCore.team.models.TeamMember;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public class HomeMenu extends KMenu implements Listener {
    private static final String HOME_NAME_KEY = "home_name";
    private static final int DYE_OFFSET = 9;
    private static final String HOME_ID_PLACEHOLDER = "%home_id%";
    private final HomeManager homeManager;
    private final MessagesManager messagesManager;
    private final HomeItems homeItems;
    private final TeamItems teamItems;
    private final DeleteHomeConfirm deleteHomeConfirm;
    private final DeleteTeamHomeConfirm deleteTeamHomeConfirm;
    private final List<Integer> homeSlots;
    private static int bEyMKQvamz = 0;
    private transient int mONbnyfcpe = 1625889128;
    private static String zaxrfmhuzg;
    private static String[] nothing_to_see_here = new String[19];

    public class HomeItems {
        final KItem bedHasHome;
        final KItem bedNoHome;
        final KItem bedNoPermission;
        final KItem dyeHasHome;
        final KItem dyeNoHome;
        final KItem dyeNoPermission;
        private static int WIkXoyll0M = 0;
        private transient int WHaVBLEDGm = 768152683;
        private static String[] nothing_to_see_here = new String[15];

        HomeItems(HomeMenu homeMenu, int i) {
            rncnvwddxumhchee(5093780 ^ 372015898, 974958707);
            int parseInt = 969452918 ^ (1198482973 ^ Integer.parseInt("1390035350"));
            this.WHaVBLEDGm = 768152683 ^ WIkXoyll0M;
            this.bedHasHome = homeMenu.getConfigurableItem("Homes.Bed.HAS_HOME", 344394593);
            this.bedNoHome = homeMenu.getConfigurableItem("Homes.Bed.NO_HOME", 344394593);
            this.bedNoPermission = homeMenu.getConfigurableItem("Homes.Bed.NO_PERMISSION", 344394593);
            this.dyeHasHome = homeMenu.getConfigurableItem("Homes.Dye.HAS_HOME", 344394593);
            this.dyeNoHome = homeMenu.getConfigurableItem("Homes.Dye.NO_HOME", 344394593);
            this.dyeNoPermission = homeMenu.getConfigurableItem("Homes.Dye.NO_PERMISSION", 344394593);
            int i2 = 298464239 ^ (1659248585 ^ (704720130 ^ (544623933 ^ (1286949947 ^ (1123870743 ^ (324189859 ^ (2071117779 ^ parseInt)))))));
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
            WIkXoyll0M = (-1483964531) ^ new Random(-7539865265118511970L).nextInt();
        }

        private static int rncnvwddxumhchee(int i, int i2) {
            return i ^ i2;
        }
    }

    public static final class HomeSlotState {
        public static final HomeSlotState HAS_HOME;
        public static final HomeSlotState NO_HOME;
        public static final HomeSlotState NO_PERMISSION;
        private static final HomeSlotState[] $VALUES;
        private static String yxwqxlyqbe;

        public static HomeSlotState[] values() {
            int i = 1866830942 ^ (1296049421 ^ (1993682504 ^ 298783685));
            return (HomeSlotState[]) $VALUES.clone();
        }

        public static HomeSlotState valueOf(String str) {
            int i = 50044596 ^ (1605701934 ^ 298783685);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1678566138) {
                int i2 = 960725586 ^ i;
                return (HomeSlotState) Enum.valueOf(HomeSlotState.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1374621589 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1329737011 ^ i)) {
                    int i3 = 1054311461 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1678566138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1412265988 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 134732398 ^ i;
            throw new IOException();
        }

        private HomeSlotState(String str, int i) {
            fonbcdbdtpbawwwu(1124857498 ^ 1761306065, 1483849913);
            fonbcdbdtpbawwwu(1305779331 ^ (1619656577 ^ Integer.parseInt("1591488752")), 14328468);
        }

        private static HomeSlotState[] $values() {
            int i = 384871699 ^ (1116145430 ^ (876083306 ^ 298783685));
            HomeSlotState[] homeSlotStateArr = new HomeSlotState[(byte) (1905213865 ^ i)];
            homeSlotStateArr[(byte) (1905213866 ^ i)] = HAS_HOME;
            homeSlotStateArr[(byte) (1905213867 ^ i)] = NO_HOME;
            homeSlotStateArr[(byte) (1905213864 ^ i)] = NO_PERMISSION;
            return homeSlotStateArr;
        }

        static {
            int parseInt = 1930814276 ^ (923306567 ^ Integer.parseInt("1591488752"));
            yxwqxlyqbe = ByteBuffer.wrap(tfuzjbhnuuikffw()).asCharBuffer().toString();
            int i = 533980963 ^ parseInt;
            HAS_HOME = new HomeSlotState(vemrffilym(hjnxxlsacanqwsw(), i), (byte) (85114576 ^ i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 680916608) {
                i = 435697259 ^ i;
                NO_HOME = new HomeSlotState(vemrffilym(atisuvujxlmhssj(), i), (byte) (485132474 ^ i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -413907496) {
                    int i2 = 1186003582 ^ i;
                    NO_PERMISSION = new HomeSlotState(vemrffilym(ataadutioxftsnm(), i2), (byte) (1515877063 ^ i2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -757885398) {
                        int i3 = 1285577726 ^ i2;
                        $VALUES = $values();
                        return;
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -757885398 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1377315904 ^ i2)) {
                                break;
                            }
                        }
                        int i4 = 1154906814 ^ i2;
                        throw new IllegalAccessException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 680916608 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1797160549 ^ i)) {
                    int i5 = 241822613 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1211020840 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (247718637 ^ i)) {
                        int i6 = 951520169 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -413907496 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1226246816 ^ i)) {
                            break;
                        }
                    }
                }
            }
            int i7 = 576897387 ^ i;
            throw new RuntimeException();
        }

        public static String vemrffilym(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = yxwqxlyqbe.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] atisuvujxlmhssj() {
            return new byte[]{0, 0, 0, 7, 0, 0, 0, 0};
        }

        private static byte[] hjnxxlsacanqwsw() {
            return new byte[]{0, 0, 0, 8, 0, 0, 0, 7};
        }

        private static byte[] ataadutioxftsnm() {
            return new byte[]{0, 0, 0, 13, 0, 0, 0, 15};
        }

        private static byte[] tfuzjbhnuuikffw() {
            return new byte[]{52, 118, 53, 126, 51, 109, 52, Byte.MAX_VALUE, 53, 123, 56, 120, 49, 118, 56, 125, 49, 112, 52, 102, 55, 105, 56, 125, 49, 126, 52, 120, 55, 115, 49, 123, 49, 122, 56, 104, 55, 96, 54, 116, 49, 103, 49, 120, 56, 126, 55, 99, 54, 98, 49, 124, 49, 122, 56, 121};
        }

        private static int fonbcdbdtpbawwwu(int i, int i2) {
            return i ^ i2;
        }
    }

    public class TeamItems {
        final KItem noHome;
        final KItem hasHome;
        final KItem noPermission;
        final KItem dyeNoHome;
        final KItem dyeHasHome;
        final KItem dyeNoPermission;
        private final int slot;
        private final int dyeSlot;
        private static int bd9j3G0XOB = 0;
        private transient int lbzylDV4qk = 727132010;
        private static String[] nothing_to_see_here = new String[15];

        TeamItems(com.kammoun.donutCore.home.gui.HomeMenu r5, int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.TeamItems.<init>(com.kammoun.donutCore.home.gui.HomeMenu, int):void");
        }

        int getSlot(int i) {
            int i2 = 1836284070 ^ (710047230 ^ 1384056172);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1427095136) {
                int i3 = 1299957416 ^ i2;
                return this.slot;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1427095136 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (395875146 ^ i2)) {
                    int i4 = 1886917486 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1053920030 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1007338464 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 940495391 ^ i2;
            throw new IllegalAccessException();
        }

        int getDyeSlot(int i) {
            int i2 = 839631691 ^ (1927376363 ^ 1384056172);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1800577440) {
                int i3 = 1923111859 ^ i2;
                return this.dyeSlot;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 28279803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (731786376 ^ i2)) {
                    int i4 = 1012294857 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1800577440 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1771692331 ^ i2)) {
                        break;
                    }
                }
            }
            int i5 = 1665314550 ^ i2;
            throw new IOException();
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
            bd9j3G0XOB = (-1247049453) ^ new Random(-3634544083489026996L).nextInt();
        }

        public static String msjnzmpysp(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] ltvwhpylmhzylah() {
            return new byte[]{65, 74, 33, 1, 77, 47, 43, 78, 122, 7, 73, 92, 73, 101, 51, 6, Byte.MAX_VALUE, 77, 95, 37, 24, 119, 62, 125, 56, 23, 83, 102, 57, 81, 91, 89, 96, 124, 67, 51, 57, 91, 37, 70, 43, 61, 16, 7, 90, 58, 80, 41, 103, 45, 18, 106, 118, 21, 68, 116, 66, 92, 111, 88, 14, 74, 61, 106, 56, 32, 23, 68, 47, 47, 70, 45, 67, 53, 47, 30, 30, 122, 54, 48, 84, 74, 40, 108, 98, 65, 31, Byte.MAX_VALUE, 89, 78, 62, 27, 6, 43, 68, 23, 77, 8, 122, 113, 93, 45, 27, 120, 87, 8, 31};
        }

        private static int bmoureahqzuvwwne(int i, int i2) {
            return i2 ^ i;
        }
    }

    public HomeMenu(org.bukkit.plugin.java.JavaPlugin r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.<init>(org.bukkit.plugin.java.JavaPlugin, int):void");
    }

    public void openMenu(Player player, int i) {
        int i2 = 2114210124 ^ (201526219 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1844611392) {
            i2 = 1181971235 ^ i2;
            loadInventory(new MenuHolder(), new String[(byte) (1412619771 ^ i2)], 408434007);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1583943718) {
                i2 = 1377805541 ^ i2;
                populateMenu(player, 72850532);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 829147376) {
                    int i3 = 1899896874 ^ i2;
                    player.openInventory(this.inventory);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1197815389) {
                        int i4 = 949642849 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1197815389 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (673449658 ^ i3)) {
                            break;
                        }
                    }
                    int i5 = 603743625 ^ i3;
                    throw new IOException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 829147376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1807854696 ^ i2)) {
                int i6 = 828793009 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1583943718 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1149041792 ^ i2)) {
                    int i7 = 1220746341 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1844611392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1717246895 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1852137623 ^ i2;
        throw new RuntimeException();
    }

    private void populateMenu(Player player, int i) {
        int i2 = 649017248 ^ (1993906784 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2121659143) {
            int i3 = 204180134 ^ i2;
            HomePlayer homePlayer = this.homeManager.getHomePlayer(player, 969395781);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -522823223) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -522823223 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (521913651 ^ i3)) {
                        break;
                    }
                }
                int i4 = 1133481222 ^ i3;
                throw new IllegalAccessException("double");
            }
            i2 = 1648788022 ^ i3;
            int maxHomes = this.homeManager.getMaxHomes(player, 1970986734);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -220051334) {
                int i5 = 880028164 ^ i2;
                clearHomeSlots(130681914);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1363351643) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1363351643 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (488675932 ^ i5)) {
                            break;
                        }
                    }
                    int i6 = 381581288 ^ i5;
                    throw new IOException("double");
                }
                int i7 = 238159262 ^ i5;
                List extractHomeNames = extractHomeNames(homePlayer, 1446526857);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != 550712491) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 550712491 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1286610696 ^ i7)) {
                            break;
                        }
                    }
                    int i8 = 402089108 ^ i7;
                    throw new RuntimeException("double");
                }
                int i9 = 1965717639 ^ i7;
                populateHomeSlots(player, extractHomeNames, maxHomes, 99715435);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -1988038512) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 641462866 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (2053379574 ^ i9)) {
                            int i10 = 570564232 ^ i9;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -1988038512 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1881823 ^ i9)) {
                                break;
                            }
                        }
                    }
                    int i11 = 1737390594 ^ i9;
                    throw new RuntimeException("double");
                }
                int i12 = 771647422 ^ i9;
                populateTeamHomeIcon(player, 287828410);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -428618399) {
                    int i13 = 2013857766 ^ i12;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -428618399 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (561833200 ^ i12)) {
                        break;
                    }
                }
                int i14 = 363283902 ^ i12;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -2121659143 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1434100133 ^ i2)) {
                int i15 = 1963862029 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -220051334 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (898857886 ^ i2)) {
                    break;
                }
            }
        }
        int i16 = 1105455797 ^ i2;
        throw new RuntimeException();
    }

    private void clearHomeSlots(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.clearHomeSlots(int):void");
    }

    private void clearSlot(int i, int i2) {
        int i3 = 983734873 ^ (1764695357 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1638180391) {
            i3 = 456794239 ^ i3;
            if (isValidSlot(i, 1564943828) == (686902084 ^ i3)) {
                cnhquyheaczkessm(i3, 2094232916);
                return;
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1200249377) {
                i3 = 1212031760 ^ i3;
                this.inventory.setItem(i, (ItemStack) null);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 108741283) {
                    int i4 = 887969348 ^ i3;
                    return;
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1638180391 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1749803812 ^ i3)) {
                int i5 = 1661688969 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1200249377 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2133389564 ^ i3)) {
                    int i6 = 690569015 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1592659838 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2047678900 ^ i3)) {
                        int i7 = 1475784120 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 108741283 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (279675384 ^ i3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i8 = 1772593161 ^ i3;
        throw new IOException();
    }

    private boolean isValidSlot(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.isValidSlot(int, int):boolean");
    }

    private List extractHomeNames(@Nullable HomePlayer homePlayer, int i) {
        int i2 = 1852833556 ^ (1673560956 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1867284923) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1867284923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1973824298 ^ i2)) {
                    break;
                }
            }
            int i3 = 1650199695 ^ i2;
            throw new IOException("double");
        }
        int i4 = 360902803 ^ i2;
        if (homePlayer != null) {
            i4 = 257315636 ^ i4;
            Stream stream = homePlayer.getHomes(1804827425).values().stream();
            Function function = (v0) -> {
                return v0.getCreatedAt();
            };
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1175872381) {
                i4 = 1538948222 ^ i4;
                Stream sorted = stream.sorted(Comparator.comparing(function));
                Function function2 = (v0) -> {
                    return v0.getName();
                };
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1681555313) {
                    i4 = 821868177 ^ i4;
                    Stream map = sorted.map(function2);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -471872520) {
                        i4 = 216112891 ^ i4;
                        List list = (List) map.collect(Collectors.toList());
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2066531296) {
                            int i5 = 929081988 ^ i4;
                            return list;
                        }
                    }
                }
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1017445085) {
            int i6 = 567184420 ^ i4;
            return new ArrayList();
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1017445085 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (66256762 ^ i4)) {
                int i7 = 913856680 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -471872520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (853204181 ^ i4)) {
                    int i8 = 1238860406 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1681555313 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (75558365 ^ i4)) {
                        int i9 = 644315362 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1175872381 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1083761336 ^ i4)) {
                            int i10 = 1171660346 ^ i4;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -852532222 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (466428561 ^ i4)) {
                                int i11 = 1249863731 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1071015937 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1316420665 ^ i4)) {
                                    int i12 = 751138301 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2066531296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1761321138 ^ i4)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i13 = 686752843 ^ i4;
        throw new RuntimeException();
    }

    private void populateHomeSlots(Player player, List list, int i, int i2) {
        int cnhquyheaczkessm;
        int i3;
        int i4 = 1129414672 ^ (311601275 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1943133791) {
            int i5 = 1944776072 ^ i4;
            List subList = list.subList((byte) (1114581436 ^ i5), Math.min(list.size(), i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 326716898) {
                i5 = 1798170947 ^ i5;
                int i6 = (byte) (692240639 ^ i5);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1242957817) {
                    int i7 = 295647103;
                    while (true) {
                        i5 = i7 ^ i5;
                        if (i6 >= this.homeSlots.size()) {
                            int i8 = 574689723 ^ i5;
                            return;
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -957367295) {
                            int i9 = 1719889892 ^ i5;
                            int intValue = this.homeSlots.get(i6).intValue();
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -218840286) {
                                int i10 = 1036463948 ^ i9;
                                int i11 = intValue + ((byte) (1671018273 ^ i10));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 483244355) {
                                    i4 = 2083799835 ^ i10;
                                    if (isValidSlot(intValue, 1564943828) == (531493939 ^ i4)) {
                                        cnhquyheaczkessm = cnhquyheaczkessm(i4, 2117038541);
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -43015784) {
                                        i5 = 338976307 ^ i4;
                                        if (isValidSlot(i11, 1564943828) == (194619904 ^ i5)) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1556959232) {
                                                i5 = 114667243 ^ i5;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1784686424) {
                                                    int i12 = 25789718 ^ i5;
                                                    try {
                                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i12) == 146712351) {
                                                            throw new IOException();
                                                        }
                                                        throw null;
                                                    } catch (IOException e) {
                                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                            case 278556978:
                                                                i3 = 1891844024 ^ i12;
                                                                break;
                                                            case 1714163688:
                                                                i3 = 1041625187 ^ i12;
                                                                break;
                                                            default:
                                                                throw new IOException("Error in hash");
                                                        }
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1769763599) {
                                                            cnhquyheaczkessm = 1397945440 ^ i3;
                                                        } else {
                                                            while (true) {
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1769763599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (457487014 ^ i3)) {
                                                                    int i13 = 876015893 ^ i3;
                                                                    throw new IllegalAccessException("double");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1556959232 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (658529916 ^ i5)) {
                                                        int i14 = 165877551 ^ i5;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -723045928 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (594660205 ^ i5)) {
                                                            int i15 = 1986347964 ^ i5;
                                                            throw new RuntimeException("double");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                                                case 13802477:
                                                    break;
                                                case 108638969:
                                                    i5 = 1406522530 ^ i5;
                                                    break;
                                                case 1138781340:
                                            }
                                        }
                                        HomeSlotState determineSlotState = determineSlotState(i6, subList.size(), i, 1006454859);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1033636590) {
                                            int i16 = 1111036001 ^ i5;
                                            populateSingleHomeSlot(intValue, i11, i6, determineSlotState, subList, 122342777);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -743737832) {
                                                cnhquyheaczkessm = 2079845181 ^ i16;
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == -743737832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i16) == (831908517 ^ i16)) {
                                                        int i17 = 699488368 ^ i16;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i6 += 1635943935 ^ cnhquyheaczkessm;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 202649587) {
                                        int cnhquyheaczkessm2 = cnhquyheaczkessm(cnhquyheaczkessm, 764470466);
                                        try {
                                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(cnhquyheaczkessm2) == 56873078) {
                                                throw new RuntimeException();
                                            }
                                            throw null;
                                        } catch (RuntimeException e2) {
                                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                                case -233801718:
                                                    i5 = cnhquyheaczkessm(cnhquyheaczkessm2, 1586242476);
                                                    break;
                                                case 1620249058:
                                                    i5 = 1289506193 ^ cnhquyheaczkessm2;
                                                    break;
                                                default:
                                                    throw new RuntimeException("Error in hash");
                                            }
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 108094824) {
                                                i7 = 940825389;
                                            } else {
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 108094824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (367733498 ^ i5)) {
                                                        int i18 = 1375559439 ^ i5;
                                                        throw new RuntimeException("double");
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1714163688 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (1989566690 ^ cnhquyheaczkessm)) {
                                                int i19 = 1555966385 ^ cnhquyheaczkessm;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 202649587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (2038581238 ^ cnhquyheaczkessm)) {
                                                    int i20 = 1559876491 ^ cnhquyheaczkessm;
                                                    throw new IOException("double");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 483244355 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1480234158 ^ i10)) {
                                            int i21 = 1780787933 ^ i10;
                                            throw new IOException("double");
                                        }
                                    }
                                }
                            } else {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -218840286 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (1917201293 ^ i9)) {
                                        int i22 = 1058390088 ^ i9;
                                        throw new RuntimeException("double");
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -957367295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1216342302 ^ i5)) {
                            int i23 = 2033127224 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1033636590 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1832061066 ^ i5)) {
                                int i24 = 921206402 ^ i5;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1784686424 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (128782124 ^ i5)) {
                    int i25 = 1600059881 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1242957817 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1091734503 ^ i5)) {
                        int i26 = 1980823694 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 326716898 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1016126584 ^ i5)) {
                            int i27 = 173416090 ^ i5;
                            throw new IllegalAccessException("double");
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1943133791 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1285110903 ^ i4)) {
                int i28 = 157779209 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 278556978 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2010517902 ^ i4)) {
                    int i29 = 1775595103 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -43015784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (194020415 ^ i4)) {
                        int i30 = 654652398 ^ i4;
                        throw new IOException();
                    }
                }
            }
        }
    }

    private com.kammoun.donutCore.home.gui.HomeMenu.HomeSlotState determineSlotState(int r6, int r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.determineSlotState(int, int, int, int):com.kammoun.donutCore.home.gui.HomeMenu$HomeSlotState");
    }

    private void populateSingleHomeSlot(int r7, int r8, int r9, com.kammoun.donutCore.home.gui.HomeMenu.HomeSlotState r10, java.util.List r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.populateSingleHomeSlot(int, int, int, com.kammoun.donutCore.home.gui.HomeMenu$HomeSlotState, java.util.List, int):void");
    }

    private org.bukkit.inventory.ItemStack createBedItem(com.kammoun.donutCore.home.gui.HomeMenu.HomeSlotState r6, @org.jetbrains.annotations.Nullable java.lang.String r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.createBedItem(com.kammoun.donutCore.home.gui.HomeMenu$HomeSlotState, java.lang.String, int, int):org.bukkit.inventory.ItemStack");
    }

    private org.bukkit.inventory.ItemStack createDyeItem(com.kammoun.donutCore.home.gui.HomeMenu.HomeSlotState r6, @org.jetbrains.annotations.Nullable java.lang.String r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.createDyeItem(com.kammoun.donutCore.home.gui.HomeMenu$HomeSlotState, java.lang.String, int):org.bukkit.inventory.ItemStack");
    }

    private void populateTeamHomeIcon(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.populateTeamHomeIcon(org.bukkit.entity.Player, int):void");
    }

    @org.bukkit.event.EventHandler
    public void onInvClick(org.bukkit.event.inventory.InventoryClickEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.onInvClick(org.bukkit.event.inventory.InventoryClickEvent):void");
    }

    @Override
    public void handleClick(org.bukkit.event.inventory.InventoryClickEvent r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.handleClick(org.bukkit.event.inventory.InventoryClickEvent, int):void");
    }

    private boolean handleBedClick(Player player, int i, InventoryClickEvent inventoryClickEvent, int i2) {
        int i3 = 807740172 ^ (1404134273 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 513107600) {
            int i4 = 2087194902 ^ i3;
            if (this.homeSlots.contains(Integer.valueOf(i)) == (2142944708 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -36311517) {
                    return (byte) (1336387974 ^ (807212098 ^ i4));
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -36311517 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1014154976 ^ i4)) {
                        break;
                    }
                }
                int i5 = 136270022 ^ i4;
                throw new IllegalAccessException("double");
            }
            int cnhquyheaczkessm = cnhquyheaczkessm(i4, 182211448);
            String extractHomeName = extractHomeName(inventoryClickEvent.getCurrentItem(), 1290863683);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) != -1422428701) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 183837483 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (781897473 ^ cnhquyheaczkessm)) {
                        int i6 = 916291404 ^ cnhquyheaczkessm;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == -1422428701 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (1748676883 ^ cnhquyheaczkessm)) {
                            break;
                        }
                    }
                }
                int i7 = 2100333618 ^ cnhquyheaczkessm;
                throw new IOException("double");
            }
            i3 = 1024664563 ^ cnhquyheaczkessm;
            if (extractHomeName != null) {
                i3 = cnhquyheaczkessm(i3, 1152229914);
                if (inventoryClickEvent.isLeftClick() == (215510869 ^ i3)) {
                    return (byte) (1701172289 ^ cnhquyheaczkessm(i3, 1774041876));
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1724086952) {
                    int i8 = 2042570354 ^ i3;
                    teleportToHome(player, extractHomeName, 692184057);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1422243525) {
                        return (byte) (1633592420 ^ (339340610 ^ i8));
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 724476427 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1239983268 ^ i8)) {
                            int i9 = 57000216 ^ i8;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1579728312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1621135926 ^ i8)) {
                                int i10 = 1648031345 ^ i8;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 2101169202 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (864444290 ^ i8)) {
                                    int i11 = 1739275816 ^ i8;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1422243525 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (44740875 ^ i8)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i12 = 706526915 ^ i8;
                    throw new IllegalAccessException();
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1135503994) {
                return (byte) (197466039 ^ (1135663864 ^ i3));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1724086952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1724556985 ^ i3)) {
                int i13 = 199097930 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1135503994 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1661960093 ^ i3)) {
                    int i14 = 1919095491 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 513107600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1409247716 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i15 = 2100478776 ^ i3;
        throw new IOException("double");
    }

    private void teleportToHome(Player player, String str, int i) {
        int i2 = 1874547674 ^ (431532011 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1305951376) {
            int i3 = 1303353233 ^ i2;
            player.closeInventory();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -548110342) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -548110342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (848215785 ^ i3)) {
                        break;
                    }
                }
                int i4 = 2069312904 ^ i3;
                throw new RuntimeException("double");
            }
            i2 = 259551089 ^ i3;
            HomeManager.HomeResult teleportToHome = this.homeManager.teleportToHome(player, str, 2146640127);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1533606798) {
                i2 = 911376166 ^ i2;
                if (teleportToHome == HomeManager.HomeResult.HOME_NOT_FOUND) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 369425731) {
                        i2 = 1999214274 ^ i2;
                        this.messagesManager.sendMessage(player, MessagesManager.MessageKey.HOME_NOT_FOUND, new String[(byte) (367593834 ^ i2)], 553750940);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1354216624) {
                            int i5 = 488067382 ^ i2;
                            return;
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                        case 257251221:
                            int i6 = 1782499316 ^ i2;
                            return;
                        case 505141209:
                        case 1734418229:
                            return;
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 369425731 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1073372101 ^ i2)) {
                int i7 = 554414192 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1207091936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (972956380 ^ i2)) {
                    int i8 = 804105956 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1354216624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1689658474 ^ i2)) {
                        int i9 = 541301749 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1305951376 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1394171216 ^ i2)) {
                            int i10 = 16341332 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1533606798 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1054204071 ^ i2)) {
                                int i11 = 1434317723 ^ i2;
                                throw new IOException();
                            }
                        }
                    }
                }
            }
        }
    }

    private void handleDyeClick(Player player, int i, InventoryClickEvent inventoryClickEvent, int i2) {
        int i3;
        int i4 = 1067549939 ^ (1109667249 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -300275480) {
            int i5 = 1231298305 ^ i4;
            OptionalInt dyeSlotIndex = getDyeSlotIndex(i, 2004305112);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1522872094) {
                i5 = 1378991700 ^ i5;
                if (dyeSlotIndex.isEmpty() == (110552136 ^ i5)) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 884417088) {
                        int i6 = 1110804708 ^ i5;
                        if (inventoryClickEvent.isLeftClick() == (1151560876 ^ i6)) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 622552418) {
                                int i7 = 1043466309 ^ i6;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 213634578 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (522787063 ^ i6)) {
                                    int i8 = 625722138 ^ i6;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -729077941 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (852601178 ^ i6)) {
                                        int i9 = 1796939962 ^ i6;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 622552418 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1564089116 ^ i6)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            int i10 = 215223653 ^ i6;
                            throw new IllegalAccessException("double");
                        }
                        int cnhquyheaczkessm = cnhquyheaczkessm(i6, 1218006963);
                        int asInt = dyeSlotIndex.getAsInt();
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1641093368) {
                            int i11 = 381576099 ^ cnhquyheaczkessm;
                            HomePlayer homePlayer = this.homeManager.getHomePlayer(player, 969395781);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -735967776) {
                                int i12 = 1362517439 ^ i11;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1569777690) {
                                    i4 = 2079918605 ^ i12;
                                    if (homePlayer == null) {
                                        int cnhquyheaczkessm2 = cnhquyheaczkessm(i4, 1051565487);
                                        i3 = (byte) (249989793 ^ cnhquyheaczkessm2);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) != 1999918344) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) == 1999918344 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) == (1192811058 ^ cnhquyheaczkessm2)) {
                                                    break;
                                                }
                                            }
                                            int i13 = 1095017080 ^ cnhquyheaczkessm2;
                                            throw new IOException("double");
                                        }
                                        cnhquyheaczkessm = 642240787 ^ cnhquyheaczkessm2;
                                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2108114831) {
                                        i4 = 1700817781 ^ i4;
                                        i3 = homePlayer.getHomes(1804827425).size();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1453595686) {
                                            while (true) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1453595686 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1788897762 ^ i4)) {
                                                    break;
                                                }
                                            }
                                            int i14 = 198547004 ^ i4;
                                            throw new IOException("double");
                                        }
                                        while (true) {
                                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                case 84153349:
                                                    i4 = 76406480 ^ i4;
                                                case 427252582:
                                                    try {
                                                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4) == 238193293) {
                                                            throw new RuntimeException();
                                                        }
                                                        throw null;
                                                    } catch (RuntimeException e) {
                                                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                            case -1925900966:
                                                                i11 = cnhquyheaczkessm(i4, 438821875);
                                                                break;
                                                            case -694683911:
                                                                i11 = 1901313927 ^ i4;
                                                                break;
                                                            default:
                                                                throw new IllegalAccessException("Error in hash");
                                                        }
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1544161986) {
                                                            cnhquyheaczkessm = cnhquyheaczkessm(i11, 1663048426);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 481269770:
                                            }
                                        }
                                    }
                                    HomeManager homeManager = this.homeManager;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1158339985) {
                                        cnhquyheaczkessm = 1321700856 ^ cnhquyheaczkessm;
                                        int maxHomes = homeManager.getMaxHomes(player, 1970986734);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 859222611) {
                                            i5 = 2089631815 ^ cnhquyheaczkessm;
                                            HomeSlotState determineSlotState = determineSlotState(asInt, i3, maxHomes, 1006454859);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -681791384) {
                                                i12 = 336409273 ^ i5;
                                                executeDyeAction(player, determineSlotState, asInt, homePlayer, 1038664695);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1999971744) {
                                                    int i15 = 1332862326 ^ i12;
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1569777690 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1261551582 ^ i12)) {
                                        int i16 = 588867268 ^ i12;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == 1999971744 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (938390136 ^ i12)) {
                                            int i17 = 83836904 ^ i12;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 1544161986 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (198773999 ^ i11)) {
                                    int i18 = 462127898 ^ i11;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -735967776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (1369584606 ^ i11)) {
                                        int i19 = 631206250 ^ i11;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1158339985 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (779621339 ^ cnhquyheaczkessm)) {
                                int i20 = 984214631 ^ cnhquyheaczkessm;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1641093368 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (1302863732 ^ cnhquyheaczkessm)) {
                                    int i21 = 1140389923 ^ cnhquyheaczkessm;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 859222611 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (177681832 ^ cnhquyheaczkessm)) {
                                        int i22 = 629842488 ^ cnhquyheaczkessm;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -694683911 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (256727740 ^ i5)) {
                            int i23 = 985830641 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -681791384 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (369676420 ^ i5)) {
                                int i24 = 899323016 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 884417088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (962141957 ^ i5)) {
                                    int i25 = 1234202918 ^ i5;
                                    throw new IOException();
                                }
                            }
                        }
                    }
                }
                while (true) {
                    switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i5)) {
                        case 103641237:
                            int i26 = 2080866465 ^ i5;
                            return;
                        case 739060869:
                        case 1064800281:
                            return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1522872094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1643831137 ^ i5)) {
                    int i27 = 777764946 ^ i5;
                    throw new RuntimeException("double");
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2108114831 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (570653894 ^ i4)) {
                int i28 = 101027876 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -300275480 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2075738691 ^ i4)) {
                    int i29 = 1174117789 ^ i4;
                    throw new RuntimeException("double");
                }
            }
        }
    }

    private boolean handleTeamHomeClick(org.bukkit.entity.Player r8, int r9, org.bukkit.event.inventory.InventoryClickEvent r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.handleTeamHomeClick(org.bukkit.entity.Player, int, org.bukkit.event.inventory.InventoryClickEvent, int):boolean");
    }

    private void handleTeamHomeTeleport(org.bukkit.entity.Player r7, com.kammoun.donutCore.team.models.Team r8, com.kammoun.donutCore.team.models.TeamMember r9, boolean r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.handleTeamHomeTeleport(org.bukkit.entity.Player, com.kammoun.donutCore.team.models.Team, com.kammoun.donutCore.team.models.TeamMember, boolean, int):void");
    }

    private void handleTeamHomeManagement(Player player, Team team, TeamMember teamMember, boolean z, int i) {
        int i2;
        int i3 = 1827740155 ^ (1150369517 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1094081098) {
            int i4 = 1169104754 ^ i3;
            if (z == (227136571 ^ i4)) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1817092568) {
                    i3 = 958220457 ^ i4;
                    if (teamMember != null) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1532697455) {
                            i3 = 1565493648 ^ i3;
                            if (teamMember.hasPermission(Permissions.EDIT_HOME, 1929852220) != (1775965442 ^ i3)) {
                                i2 = cnhquyheaczkessm(i3, 1084942621);
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1322821651) {
                                i3 = 1181720615 ^ i3;
                                player.closeInventory();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2108008745) {
                                    int i5 = 724449743 ^ i3;
                                    this.messagesManager.sendMessage(player, MessagesManager.MessageKey.HOME_REACHED_LIMIT, new String[(byte) (77237482 ^ i5)], 553750940);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 617899856) {
                                        int i6 = 442221129 ^ i5;
                                        return;
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 617899856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (729593769 ^ i5)) {
                                            int i7 = 1981965488 ^ i5;
                                            throw new IllegalAccessException("double");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                            case 84546407:
                            case 98556878:
                                i3 = 455092663 ^ i3;
                                break;
                            case 1075470669:
                                break;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1817092568 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1114273451 ^ i4)) {
                        int i8 = 304924588 ^ i4;
                        throw new IllegalAccessException("double");
                    }
                }
            } else {
                i2 = 620242980 ^ i4;
            }
            player.closeInventory();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1267720441) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1267720441 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1027210675 ^ i2)) {
                        break;
                    }
                }
                int i9 = 1194077741 ^ i2;
                throw new IllegalAccessException("double");
            }
            i3 = 2039501633 ^ i2;
            if (team.isHomeLocationSet(325764637) == (1356967774 ^ i3)) {
                i3 = cnhquyheaczkessm(i3, 641664439);
                player.performCommand(pkkdwqipwp(mhpdnvlqvorkgno(), i3));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1225435317) {
                    int i10 = 455701532 ^ i3;
                    return;
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2029159694) {
                int i11 = 2007030236 ^ i3;
                this.deleteTeamHomeConfirm.openMenu(player, 112848442);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) != 973845521) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 973845521 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (589303974 ^ i11)) {
                            break;
                        }
                    }
                    int i12 = 871409522 ^ i11;
                    throw new RuntimeException("double");
                }
                int cnhquyheaczkessm = cnhquyheaczkessm(i11, 2020222250);
                try {
                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(cnhquyheaczkessm) == 140750142) {
                        throw new IOException();
                    }
                    throw null;
                } catch (IOException e) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                        case -2054381967:
                            i4 = 23436029 ^ cnhquyheaczkessm;
                            break;
                        case -111502014:
                            i4 = 1862228635 ^ cnhquyheaczkessm;
                            break;
                        default:
                            throw new IllegalAccessException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -1902098023) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1902098023 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (48001155 ^ i4)) {
                                int i13 = 1780207114 ^ i4;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                            case 9101318:
                                int i14 = 1545852870 ^ i4;
                                return;
                            case 1630686057:
                                return;
                            case 1835995860:
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1532697455 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1673883604 ^ i3)) {
                int i15 = 1086564791 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1094081098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (856814150 ^ i3)) {
                    int i16 = 559804932 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -167086824 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1373120819 ^ i3)) {
                        int i17 = 187946075 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1322821651 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (29616600 ^ i3)) {
                            int i18 = 690679339 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2108008745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1204274338 ^ i3)) {
                                int i19 = 1652046679 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2029159694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1807575135 ^ i3)) {
                                    int i20 = 2102740101 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1225435317 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (235265074 ^ i3)) {
                                        int i21 = 718535786 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2054381967 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (46484869 ^ i3)) {
                                            int i22 = 354844784 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -111502014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1412852573 ^ i3)) {
                                                int i23 = 479710539 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1874786219 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1445967005 ^ i3)) {
                                                    int i24 = 852476181 ^ i3;
                                                    throw new RuntimeException();
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

    private Optional getPlayerTeam(Player player, int i) {
        int i2 = 1329075393 ^ (457393445 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1578242599) {
            i2 = 333727627 ^ i2;
            HomePlugin homePlugin = HomePlugin.getInstance(1471891934);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1053806977) {
                int i3 = 1658299085 ^ i2;
                TeamPlugin teamPlugin = homePlugin.getTeamPlugin(50038093);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 678610922) {
                    i2 = 907845122 ^ i3;
                    TeamTable teamTable = teamPlugin.getTeamTable(261175650);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1734985733) {
                        i3 = 2109610704 ^ i2;
                        Optional teamByMemberSync = teamTable.getTeamByMemberSync(player.getUniqueId(), 2118511223);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1969676664) {
                            int i4 = 454254499 ^ i3;
                            return teamByMemberSync;
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1969676664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1501585336 ^ i3)) {
                        int i5 = 1592068859 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 678610922 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (121251844 ^ i3)) {
                            break;
                        }
                    }
                }
                int i6 = 470015838 ^ i3;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1734985733 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1468195054 ^ i2)) {
                int i7 = 2136925815 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1375986592 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1898227444 ^ i2)) {
                    int i8 = 17839491 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1053806977 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1047146118 ^ i2)) {
                        int i9 = 743879722 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1578242599 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (78509827 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = 430828842 ^ i2;
        throw new IllegalAccessException();
    }

    private void executeDyeAction(Player player, HomeSlotState homeSlotState, int i, @Nullable HomePlayer homePlayer, int i2) {
        int cnhquyheaczkessm;
        int cnhquyheaczkessm2;
        int i3 = 1128039736 ^ (2097192384 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -203971270) {
            int i4 = 120286508 ^ i3;
            player.closeInventory();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != -896742310) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -896742310 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1686880685 ^ i4)) {
                        break;
                    }
                }
                int i5 = 1024305147 ^ i4;
                throw new IOException("double");
            }
            int i6 = 1949698024 ^ i4;
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(homeSlotState.ordinal() ^ i6)) {
                case 133754808:
                    cnhquyheaczkessm = cnhquyheaczkessm(i6, 1736229866);
                    openDeleteConfirmation(player, homePlayer, i, 981296000);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1356524618) {
                        int cnhquyheaczkessm3 = cnhquyheaczkessm(cnhquyheaczkessm, 1410405983);
                        try {
                            if (jnbwyqufydqqceyf.njpwuppmebnxznmg(cnhquyheaczkessm3) == 171175140) {
                                throw new IOException();
                            }
                            throw null;
                        } catch (IOException e) {
                            switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                case -263037264:
                                    cnhquyheaczkessm2 = cnhquyheaczkessm(cnhquyheaczkessm3, 1469360038);
                                    break;
                                case -49109342:
                                    cnhquyheaczkessm2 = cnhquyheaczkessm(cnhquyheaczkessm3, 373078180);
                                    break;
                                default:
                                    throw new IOException("Error in hash");
                            }
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) == 1291281282) {
                                cnhquyheaczkessm(cnhquyheaczkessm2, 1087831760);
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) == 1245746432 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) == (1373335657 ^ cnhquyheaczkessm2)) {
                                    int i7 = 478395507 ^ cnhquyheaczkessm2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) == 1291281282 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm2) == (329651888 ^ cnhquyheaczkessm2)) {
                                        int i8 = 34157771 ^ cnhquyheaczkessm2;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1356524618 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (1461661736 ^ cnhquyheaczkessm)) {
                            int i9 = 1931863310 ^ cnhquyheaczkessm;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) != 1977377633 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (262586311 ^ cnhquyheaczkessm)) {
                                int i10 = 831572308 ^ cnhquyheaczkessm;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == -49109342 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == (1365308355 ^ cnhquyheaczkessm)) {
                                    int i11 = 1248288469 ^ cnhquyheaczkessm;
                                    throw new RuntimeException("double");
                                }
                            }
                        }
                    }
                    break;
                case 133754810:
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                            case 133754808:
                                i6 = 981066874 ^ i6;
                                break;
                            case 366305006:
                            case 1554542250:
                            default:
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -263037264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1611682227 ^ i6)) {
                                        int i12 = 268103731 ^ i6;
                                        throw new RuntimeException("double");
                                    }
                                }
                                break;
                            case 2053933073:
                                break;
                        }
                    }
                    player.performCommand("sethome " + generateHomeName(player, 1193785669));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -1191980856) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1191980856 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (359405849 ^ i6)) {
                                int i13 = 128180271 ^ i6;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6)) {
                            case 112631927:
                            case 214637454:
                                i6 = 1033527996 ^ i6;
                            case 466511408:
                                try {
                                    if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i6) == 39830843) {
                                        throw new IOException();
                                    }
                                    throw null;
                                } catch (IOException e2) {
                                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                                        case -462745671:
                                            i3 = cnhquyheaczkessm(i6, 219471880);
                                            break;
                                        case 1411433769:
                                            i3 = cnhquyheaczkessm(i6, 454924634);
                                            break;
                                        default:
                                            throw new IllegalAccessException("Error in hash");
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -1932783623) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1932783623 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1131476151 ^ i3)) {
                                                int i14 = 366004000 ^ i3;
                                                throw new IOException("double");
                                            }
                                        }
                                    }
                                    while (true) {
                                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i3)) {
                                            case 1661511:
                                                int i15 = 953258847 ^ i3;
                                                return;
                                            case 1441723402:
                                                return;
                                            case 1768660540:
                                        }
                                    }
                                }
                                break;
                            case 735853569:
                            default:
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1411433769 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1381789304 ^ i6)) {
                                        int i16 = 273879776 ^ i6;
                                        throw new RuntimeException("double");
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 133754812:
                    cnhquyheaczkessm = cnhquyheaczkessm(i6, 64754191);
                    this.messagesManager.sendMessage(player, MessagesManager.MessageKey.HOME_REACHED_LIMIT, new String[(byte) (784043116 ^ cnhquyheaczkessm)], 553750940);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1977377633) {
                        int i17 = 670277324 ^ cnhquyheaczkessm;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == 1356524618) {
                            int i92 = 1931863310 ^ cnhquyheaczkessm;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) != 1977377633) {
                                continue;
                            } else {
                                int i102 = 831572308 ^ cnhquyheaczkessm;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(cnhquyheaczkessm) == -49109342) {
                                    int i112 = 1248288469 ^ cnhquyheaczkessm;
                                    throw new RuntimeException("double");
                                }
                                continue;
                            }
                        }
                    }
                default:
                    int i18 = 607096003 ^ i6;
                    return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -203971270 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1732212671 ^ i3)) {
                int i19 = 1380289712 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -462745671 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (832580647 ^ i3)) {
                    int i20 = 351266148 ^ i3;
                    throw new RuntimeException();
                }
            }
        }
    }

    private void openDeleteConfirmation(Player player, @Nullable HomePlayer homePlayer, int i, int i2) {
        int i3;
        int i4;
        int i5 = 1752098107 ^ (307721750 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -738460784) {
            int i6 = 1892617964 ^ i5;
            if (homePlayer == null) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1434684659) {
                    i3 = 1871360931 ^ i6;
                    this.messagesManager.sendMessage(player, MessagesManager.MessageKey.HOME_NOT_FOUND, new String[(byte) (87736893 ^ i3)], 553750940);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 701895144) {
                        int i7 = 1399756561 ^ i3;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 701895144 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (907251119 ^ i3)) {
                            int i8 = 2094699295 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1989866296 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1971511446 ^ i3)) {
                                int i9 = 285137988 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1999454301 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (342506581 ^ i3)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i10 = 1613105107 ^ i3;
                    throw new RuntimeException("double");
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 206130907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1238394832 ^ i6)) {
                        int i11 = 1159454628 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1356387673 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (2135939758 ^ i6)) {
                            int i12 = 1666993150 ^ i6;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1434684659 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (421305015 ^ i6)) {
                                break;
                            }
                        }
                    }
                }
                int i13 = 2069269502 ^ i6;
                throw new RuntimeException("double");
            }
            i6 = cnhquyheaczkessm(i6, 1084975925);
            ArrayList arrayList = new ArrayList(homePlayer.getHomes(1804827425).keySet());
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1356387673) {
                i5 = 763398288 ^ i6;
                if (i >= arrayList.size()) {
                    i5 = 1053428729 ^ i5;
                    this.messagesManager.sendMessage(player, MessagesManager.MessageKey.HOME_NOT_FOUND, new String[(byte) (961649090 ^ i5)], 553750940);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -896741871) {
                        int i14 = 1490595865 ^ i5;
                        return;
                    }
                } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1021088216) {
                    int i15 = 1552698245 ^ i5;
                    String str = (String) arrayList.get(i);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -658584078) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -658584078 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (824594337 ^ i15)) {
                                break;
                            }
                        }
                        int i16 = 78465305 ^ i15;
                        throw new IllegalAccessException("double");
                    }
                    i5 = 319069341 ^ i15;
                    this.deleteHomeConfirm.openMenu(player, str, 1146256918);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1083844890) {
                        i3 = 956895959 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1999454301) {
                            int i17 = 1826482553 ^ i3;
                            try {
                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i17) == 162733302) {
                                    throw new IllegalAccessException();
                                }
                                throw null;
                            } catch (IllegalAccessException e) {
                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                    case -297929624:
                                        i4 = cnhquyheaczkessm(i17, 768210840);
                                        break;
                                    case 1989866296:
                                        i4 = 1054676850 ^ i17;
                                        break;
                                    default:
                                        throw new IOException("Error in hash");
                                }
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2139993943) {
                                    int i18 = 1367826638 ^ i4;
                                    return;
                                }
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2139993943 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1962809185 ^ i4)) {
                                        int i19 = 78159112 ^ i4;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 701895144) {
                                int i82 = 2094699295 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1989866296) {
                                    int i92 = 285137988 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1999454301) {
                                        break;
                                        break;
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                        }
                        int i102 = 1613105107 ^ i3;
                        throw new RuntimeException("double");
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 206130907) {
                    int i112 = 1159454628 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1356387673) {
                        int i122 = 1666993150 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 1434684659) {
                            break;
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
            int i132 = 2069269502 ^ i6;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -738460784 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (525365562 ^ i5)) {
                int i20 = 2113111280 ^ i5;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1297962654 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2032202940 ^ i5)) {
                    int i21 = 86144803 ^ i5;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1083844890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1556468650 ^ i5)) {
                        int i22 = 1863393174 ^ i5;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -896741871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (377546108 ^ i5)) {
                            int i23 = 268795556 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1021088216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (92533474 ^ i5)) {
                                int i24 = 717970639 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -297929624 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (2048277180 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i25 = 504981060 ^ i5;
        throw new IllegalAccessException();
    }

    @Override
    protected void setMenuItems(String[] strArr, int i) {
        int i2 = 1068030448 ^ (1027224175 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 379600387) {
            int i3 = 1345550532 ^ i2;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1757677535 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (705794050 ^ i2)) {
                int i4 = 362807695 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 379600387 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1467286565 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 852289334 ^ i2;
        throw new IllegalAccessException();
    }

    private com.kammoun.donutCore.api.utils.items.KItem getTeamHomeIcon(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.getTeamHomeIcon(org.bukkit.entity.Player, int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    private com.kammoun.donutCore.api.utils.items.KItem getTeamHomeDyeIcon(org.bukkit.entity.Player r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.getTeamHomeDyeIcon(org.bukkit.entity.Player, int):com.kammoun.donutCore.api.utils.items.KItem");
    }

    private org.bukkit.inventory.ItemStack attachHomeName(org.bukkit.inventory.ItemStack r5, java.lang.String r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.attachHomeName(org.bukkit.inventory.ItemStack, java.lang.String, int):org.bukkit.inventory.ItemStack");
    }

    @org.jetbrains.annotations.Nullable
    private java.lang.String extractHomeName(org.bukkit.inventory.ItemStack r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.extractHomeName(org.bukkit.inventory.ItemStack, int):java.lang.String");
    }

    private java.util.OptionalInt getDyeSlotIndex(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.getDyeSlotIndex(int, int):java.util.OptionalInt");
    }

    private KItem getConfigurableItem(String str, int i) {
        int i2;
        int i3 = 1595692017 ^ (887353492 ^ 1615260767);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1573550544) {
            ?? r0 = 2145291325 ^ i3;
            i3 = r0;
            try {
            } catch (Exception e) {
                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                    case -1556780262:
                        i2 = cnhquyheaczkessm(i3, 1415173172);
                        break;
                    case -1556211653:
                        i2 = 1951971920 ^ i3;
                        break;
                    default:
                        throw new RuntimeException("Error in hash");
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 33278648) {
                    int i4 = 1346127440 ^ i2;
                    Bukkit.getLogger().warning("[HomeMenu] Failed to load KItem from config path: " + str + " - " + r0.getMessage());
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2145781702) {
                        int i5 = 1527070734 ^ i4;
                        return null;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2145781702 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (206029152 ^ i4)) {
                            int i6 = 8641523 ^ i4;
                            throw new RuntimeException("double");
                        }
                    }
                }
            }
            if (getConfig(533900686).isConfigurationSection(str) == (1952957191 ^ i3)) {
                i3 = cnhquyheaczkessm(i3, 619079647);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2079512894) {
                    int cnhquyheaczkessm = cnhquyheaczkessm(i3, 1040012112);
                    try {
                        if (jnbwyqufydqqceyf.njpwuppmebnxznmg(cnhquyheaczkessm) != 69366507) {
                            throw null;
                        }
                        throw new IOException();
                    } catch (IOException e2) {
                        switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                            case 1810349123:
                                i3 = cnhquyheaczkessm(cnhquyheaczkessm, 101148668);
                                break;
                            case 1952909105:
                                i3 = 1173844114 ^ cnhquyheaczkessm;
                                break;
                            default:
                                throw new IOException("Error in hash");
                        }
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1541178275) {
                            cnhquyheaczkessm(i3, 1618866045);
                            return null;
                        }
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1556211653) {
                i2 = 536964708 ^ i3;
                KItem fromConfig = KItem.fromConfig(getConfig(533900686).getConfigurationSection(str), 2126963651);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1556780262) {
                    i3 = 924367185 ^ i2;
                    return fromConfig;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 33278648 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (9014694 ^ i2)) {
                        int i7 = 943535270 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1556780262 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (283757877 ^ i2)) {
                            int i8 = 1955889312 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1952909105 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (204024604 ^ i2)) {
                                int i9 = 711859051 ^ i2;
                                throw new IOException("double");
                            }
                        }
                    }
                }
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1810349123 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (511372273 ^ i3)) {
                int i10 = 297189103 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1573550544 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (475560015 ^ i3)) {
                    int i11 = 747383842 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1541178275 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1643699954 ^ i3)) {
                        int i12 = 451247140 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1556211653 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1606887185 ^ i3)) {
                            int i13 = 1070904672 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -2079512894 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1710666454 ^ i3)) {
                                int i14 = 572675928 ^ i3;
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        }
    }

    private java.lang.String generateHomeName(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.gui.HomeMenu.generateHomeName(org.bukkit.entity.Player, int):java.lang.String");
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
        zaxrfmhuzg = ByteBuffer.wrap(uvjklmcyoktxdwc()).asCharBuffer().toString();
        bEyMKQvamz = 529215257 ^ new Random(-5001818131056036336L).nextInt();
    }

    public static String pkkdwqipwp(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = zaxrfmhuzg.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] boxdltxeoxzjigw() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 0};
    }

    private static byte[] kyxpmfvayztooii() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 9};
    }

    private static byte[] mhpdnvlqvorkgno() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 18};
    }

    private static byte[] rpjqusjiejvpqrv() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 30};
    }

    private static byte[] jolazihnkqfkgjz() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 39};
    }

    private static byte[] nzaltcbvndzgpgs() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 48};
    }

    private static byte[] uvjklmcyoktxdwc() {
        return new byte[]{49, 18, 49, 90, 49, 94, 50, 84, 50, 85, 49, 104, 49, 91, 49, 85, 50, 28, 53, 65, 56, 85, 56, 80, 56, 94, 51, 21, 53, 80, 48, 87, 49, 85, 51, 86, 49, 77, 57, 81, 51, 81, 52, 95, 51, 19, 49, 74, 57, 81, 51, 68, 52, 90, 51, 92, 49, 84, 57, 81, 55, 89, 49, 90, 56, 95, 48, 87, 54, 104, 49, 95, 53, 89, 50, 93, 50, 83, 49, 93, 57, 95, 48, 91, 50, 85, 53, 104, 49, 91, 57, 81, 48, 91, 50, 85, 57, 90, 50, 86, 52, 89, 51, 85, 56, 102, 50, 92, 57, 85, 52, 94, 48, 93};
    }

    private static int cnhquyheaczkessm(int i, int i2) {
        return i2 ^ i;
    }
}
