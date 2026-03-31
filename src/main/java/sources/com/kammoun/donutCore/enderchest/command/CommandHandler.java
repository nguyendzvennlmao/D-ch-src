package com.kammoun.donutCore.enderchest.command;

import com.kammoun.donutCore.enderchest.CustomEnderChest;
import com.kammoun.donutCore.enderchest.util.MessageUtil;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor, TabCompleter {
    private final CustomEnderChest plugin;
    private static int MW8SFWi8yv = 0;
    private transient int zy6vwTMdc9 = 977114477;
    private static String israjqpuhh;
    private static String[] nothing_to_see_here = new String[13];

    public CommandHandler(CustomEnderChest customEnderChest, int i) {
        int i2 = 2136193129 ^ 2043984388;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 26238770:
                    break;
                case 102667457:
                    int i3 = 478968243 ^ i2;
                    break;
                case 560153650:
                case 813052976:
                default:
                    throw new IllegalAccessException();
            }
        }
        int parseInt = 1939965671 ^ (1858436479 ^ Integer.parseInt("124747846"));
        this.zy6vwTMdc9 = 977114477 ^ MW8SFWi8yv;
        this.plugin = customEnderChest;
        int i4 = 30931536 ^ (394931844 ^ (1152518746 ^ parseInt));
    }

    public boolean onCommand(@org.jetbrains.annotations.NotNull org.bukkit.command.CommandSender r6, @org.jetbrains.annotations.NotNull org.bukkit.command.Command r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String[] r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.command.CommandHandler.onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):boolean");
    }

    private void handleOpenSelf(Player player, int i) {
        int i2 = 1354936662 ^ (8763848 ^ 293136920);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 167711794) {
            i2 = 146224669 ^ i2;
            if (player.hasPermission(ibbpufayjn(rzcruczmstaongf(), i2)) != (1233704091 ^ i2)) {
                i2 = nvwlwtyfxqzdzmip(i2, 906892206);
                int playerEnderChestSize = this.plugin.getEnderChestManager(1051175380).getPlayerEnderChestSize(player, 1984967578);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -63555157) {
                    i2 = 2110301589 ^ i2;
                    if (playerEnderChestSize != (38691488 ^ i2)) {
                        int nvwlwtyfxqzdzmip = nvwlwtyfxqzdzmip(i2, 330679158);
                        this.plugin.getEnderChestManager(1051175380).openEnderChest(player, 1747330587);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(nvwlwtyfxqzdzmip) == -1881338192) {
                            nvwlwtyfxqzdzmip = 721481751 ^ nvwlwtyfxqzdzmip;
                            MessageUtil.send(player, this.plugin.getConfigManager(63154297).getMessageWithPrefix(ibbpufayjn(jcrwnwittzxmejq(), nvwlwtyfxqzdzmip), 1006056144), 1123076097);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(nvwlwtyfxqzdzmip) == -673542647) {
                                int i3 = 2071402544 ^ nvwlwtyfxqzdzmip;
                                return;
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(nvwlwtyfxqzdzmip) == -1881338192 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(nvwlwtyfxqzdzmip) == (1623561552 ^ nvwlwtyfxqzdzmip)) {
                                int i4 = 1503750028 ^ nvwlwtyfxqzdzmip;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(nvwlwtyfxqzdzmip) == -673542647 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(nvwlwtyfxqzdzmip) == (1674211589 ^ nvwlwtyfxqzdzmip)) {
                                    break;
                                }
                            }
                        }
                        int i5 = 1360820045 ^ nvwlwtyfxqzdzmip;
                        throw new IOException("double");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 309531904) {
                        int i6 = 370380822 ^ i2;
                        MessageUtil.send(player, this.plugin.getConfigManager(63154297).getMessageWithPrefix(ibbpufayjn(zufnucyzzywowin(), i6), 1006056144), 1123076097);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1561356880) {
                            int i7 = 737883442 ^ i6;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1561356880 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (348519088 ^ i6)) {
                                break;
                            }
                        }
                        int i8 = 1902655417 ^ i6;
                        throw new IllegalAccessException("double");
                    }
                }
            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1279698138) {
                int i9 = 1668510180 ^ i2;
                MessageUtil.send(player, this.plugin.getConfigManager(63154297).getMessageWithPrefix(ibbpufayjn(eorhgtnbzxcuper(), i9), 1006056144), 1123076097);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1474112505) {
                    int i10 = 2098809680 ^ i9;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == 1474112505 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (949091063 ^ i9)) {
                        break;
                    }
                }
                int i11 = 1884985027 ^ i9;
                throw new RuntimeException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -46777311 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1130737460 ^ i2)) {
                int i12 = 1862740976 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 309531904 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1330123665 ^ i2)) {
                    int i13 = 200647700 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1279698138 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (311990059 ^ i2)) {
                        int i14 = 1382718739 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -63555157 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1159111676 ^ i2)) {
                            int i15 = 1620680048 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 167711794 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (855625130 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        int i16 = 1074107264 ^ i2;
        throw new IllegalAccessException();
    }

    private void handleOpenCommand(org.bukkit.command.CommandSender r7, java.lang.String[] r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.command.CommandHandler.handleOpenCommand(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleDeleteCommand(org.bukkit.command.CommandSender r5, java.lang.String[] r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.command.CommandHandler.handleDeleteCommand(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void handleReloadCommand(org.bukkit.command.CommandSender r5, java.lang.String[] r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.command.CommandHandler.handleReloadCommand(org.bukkit.command.CommandSender, java.lang.String[], int):void");
    }

    private void sendUsage(CommandSender commandSender, int i) {
        int i2 = 1287512249 ^ (457239651 ^ 293136920);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 875509266) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 875509266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1252637782 ^ i2)) {
                    break;
                }
            }
            int i3 = 571279240 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 57099612 ^ i2;
        if (commandSender.hasPermission(ibbpufayjn(ebdlwmnydunwhmn(), i4)) == (1172480926 ^ i4)) {
            int i5 = 845576391 ^ i4;
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 789912818) {
            int i6 = 922685764 ^ i4;
            MessageUtil.send(commandSender, ibbpufayjn(sbldhsbrojxkcmr(), i6), 1123076097);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1729259821) {
                i4 = 1206311587 ^ i6;
                MessageUtil.send(commandSender, ibbpufayjn(amluuonfancfcex(), i4), 1123076097);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1478802487) {
                    int i7 = 718461966 ^ i4;
                    MessageUtil.send(commandSender, ibbpufayjn(qdnhvgpkpbhlffo(), i7), 1123076097);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -246570056) {
                        i4 = 1222868997 ^ i7;
                        MessageUtil.send(commandSender, ibbpufayjn(bshjycohjtwgret(), i4), 1123076097);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1236163694) {
                            int i8 = 631870136 ^ i4;
                            MessageUtil.send(commandSender, ibbpufayjn(yvqbtkcyvqxuwbc(), i8), 1123076097);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != -1692584365) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1692584365 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (805749797 ^ i8)) {
                                        break;
                                    }
                                }
                                int i9 = 1365054875 ^ i8;
                                throw new IOException("double");
                            }
                            int i10 = 1582651882 ^ i8;
                            MessageUtil.send(commandSender, ibbpufayjn(brxcgepncnteseu(), i10), 1123076097);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) != 1773664513) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == 1773664513 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i10) == (1476181192 ^ i10)) {
                                        break;
                                    }
                                }
                                int i11 = 1668975345 ^ i10;
                                throw new RuntimeException("double");
                            }
                            i7 = 1216300076 ^ i10;
                            MessageUtil.send(commandSender, ibbpufayjn(pzdunrcfbfqsigd(), i7), 1123076097);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 709744739) {
                                i7 = 441912746 ^ i7;
                                MessageUtil.send(commandSender, ibbpufayjn(nididkuosrvjoog(), i7), 1123076097);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -118115021) {
                                    i6 = 1911404922 ^ i7;
                                    MessageUtil.send(commandSender, ibbpufayjn(csyopkqtlzabkoy(), i6), 1123076097);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2006482656) {
                                        i7 = 1403679272 ^ i6;
                                        MessageUtil.send(commandSender, ibbpufayjn(gnvktyxjsrjmgrw(), i7), 1123076097);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -355733598) {
                                            int i12 = 719169197 ^ i7;
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 709744739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1428537485 ^ i7)) {
                            int i13 = 1662275823 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -355733598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (248521148 ^ i7)) {
                                int i14 = 1086657761 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -246570056 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (127422473 ^ i7)) {
                                    int i15 = 1383801578 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -118115021 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1860701068 ^ i7)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i16 = 586450851 ^ i7;
                    throw new IOException();
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2006482656 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1762833615 ^ i6)) {
                    int i17 = 73536891 ^ i6;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1729259821 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1589519401 ^ i6)) {
                        int i18 = 1243527750 ^ i6;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -1138304309 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1873097117 ^ i6)) {
                            break;
                        }
                    }
                }
            }
            int i19 = 172637622 ^ i6;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 789912818 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (2115421969 ^ i4)) {
                int i20 = 696896607 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1478802487 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (448411307 ^ i4)) {
                    int i21 = 2575561 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1236163694 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1848367514 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i22 = 483655510 ^ i4;
        throw new IOException("double");
    }

    @org.jetbrains.annotations.Nullable
    public java.util.List<java.lang.String> onTabComplete(@org.jetbrains.annotations.NotNull org.bukkit.command.CommandSender r5, @org.jetbrains.annotations.NotNull org.bukkit.command.Command r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.enderchest.command.CommandHandler.onTabComplete(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[]):java.util.List");
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
        israjqpuhh = ByteBuffer.wrap(vgqhpvxifptdzea()).asCharBuffer().toString();
        MW8SFWi8yv = 2092556776 ^ new Random(-4903048172627112774L).nextInt();
    }

    public static String ibbpufayjn(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = israjqpuhh.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] skfmzshzykjukre() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 0};
    }

    private static byte[] tllvehbidxhxmzq() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 7};
    }

    private static byte[] sxjwfrivtuxxkmi() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 13};
    }

    private static byte[] owjtaekghzdjlnt() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 19};
    }

    private static byte[] cfwiucsgpxyhlsc() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 23};
    }

    private static byte[] nkzqdwhsfombjeo() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 29};
    }

    private static byte[] xswehdxgltfniov() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 33};
    }

    private static byte[] rzcruczmstaongf() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, 44};
    }

    private static byte[] eorhgtnbzxcuper() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 68};
    }

    private static byte[] jcrwnwittzxmejq() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 81};
    }

    private static byte[] zufnucyzzywowin() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 87};
    }

    private static byte[] vgvfhlyroswawrn() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, 100};
    }

    private static byte[] sahvtnuempmlrml() {
        return new byte[]{0, 0, 0, 11, 0, 0, 0, 116};
    }

    private static byte[] xeyplqyiahyltiz() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, Byte.MAX_VALUE};
    }

    private static byte[] zvtukwwresptter() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, -117};
    }

    private static byte[] fiqdehayhvlkbez() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -111};
    }

    private static byte[] kleatjteaalwwfu() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, -89};
    }

    private static byte[] gzlglryepbcwgtr() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -76};
    }

    private static byte[] eseywoujgpfikdv() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, -54};
    }

    private static byte[] ahlcjwvqkahlagt() {
        return new byte[]{0, 0, 0, 16, 0, 0, 0, -41};
    }

    private static byte[] azoouytubkmcbya() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, -25};
    }

    private static byte[] sbxxodciabpajqm() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, -12};
    }

    private static byte[] uazdxwocdjcoepw() {
        return new byte[]{0, 0, 0, 22, 0, 0, 0, -6};
    }

    private static byte[] nididkuosrvjoog() {
        return new byte[]{0, 0, 0, 68, 0, 0, 1, 16};
    }

    private static byte[] qdnhvgpkpbhlffo() {
        return new byte[]{0, 0, 0, 0, 0, 0, 1, 84};
    }

    private static byte[] bshjycohjtwgret() {
        return new byte[]{0, 0, 0, 36, 0, 0, 1, 84};
    }

    private static byte[] gnvktyxjsrjmgrw() {
        return new byte[]{0, 0, 0, 40, 0, 0, 1, 120};
    }

    private static byte[] amluuonfancfcex() {
        return new byte[]{0, 0, 0, 31, 0, 0, 1, -96};
    }

    private static byte[] ebdlwmnydunwhmn() {
        return new byte[]{0, 0, 0, 22, 0, 0, 1, -65};
    }

    private static byte[] brxcgepncnteseu() {
        return new byte[]{0, 0, 0, 44, 0, 0, 1, -43};
    }

    private static byte[] sbldhsbrojxkcmr() {
        return new byte[]{0, 0, 0, 40, 0, 0, 2, 1};
    }

    private static byte[] yvqbtkcyvqxuwbc() {
        return new byte[]{0, 0, 0, 41, 0, 0, 2, 41};
    }

    private static byte[] pzdunrcfbfqsigd() {
        return new byte[]{0, 0, 0, 64, 0, 0, 2, 82};
    }

    private static byte[] csyopkqtlzabkoy() {
        return new byte[]{0, 0, 0, 53, 0, 0, 2, -110};
    }

    private static byte[] mkpstsxpdbcrkav() {
        return new byte[]{0, 0, 0, 22, 0, 0, 2, -57};
    }

    private static byte[] zyewayowfpkdzql() {
        return new byte[]{0, 0, 0, 6, 0, 0, 2, -35};
    }

    private static byte[] qhbxglvjjgqhahc() {
        return new byte[]{0, 0, 0, 4, 0, 0, 2, -29};
    }

    private static byte[] nowoyzxfvureflk() {
        return new byte[]{0, 0, 0, 4, 0, 0, 2, -25};
    }

    private static byte[] vyihzygjhbtzyis() {
        return new byte[]{0, 0, 0, 6, 0, 0, 2, -21};
    }

    private static byte[] tdgjcooaxnepiii() {
        return new byte[]{0, 0, 0, 6, 0, 0, 2, -15};
    }

    private static byte[] dpsjbfwxlapqfct() {
        return new byte[]{0, 0, 0, 4, 0, 0, 2, -9};
    }

    private static byte[] pvvsgggfzffbobw() {
        return new byte[]{0, 0, 0, 22, 0, 0, 2, -5};
    }

    private static byte[] vgqhpvxifptdzea() {
        return new byte[]{49, 83, 49, 87, 48, 85, 52, 80, 53, 70, 49, 82, 49, 86, 49, 71, 49, 94, 48, 88, 52, 76, 53, 87, 49, 69, 52, 75, 52, 81, 52, 84, 50, 91, 49, 85, 57, 80, 49, 81, 54, 80, 48, 91, 52, 65, 49, 92, 55, 81, 52, 89, 54, 84, 51, 71, 49, 93, 49, 92, 57, 73, 55, 86, 51, 87, 53, 73, 53, 95, 54, 86, 49, 64, 50, 80, 57, 71, 51, 105, 55, 94, 57, 92, 53, 85, 53, 74, 49, 113, 51, 70, 55, 67, 52, 68, 57, 94, 49, 95, 51, 118, 55, 94, 52, 84, 57, 84, 49, 64, 51, 112, 55, 88, 52, 85, 57, 66, 49, 70, 51, 29, 55, 83, 52, 95, 57, 92, 49, 95, 51, 82, 55, 94, 52, 84, 55, 92, 49, 94, 51, 107, 57, 71, 53, 82, 50, 67, 49, 94, 52, 80, 55, 70, 55, 65, 49, 88, 51, 91, 57, 89, 57, 87, 57, 69, 52, 93, 57, 87, 51, 92, 56, 93, 51, 90, 49, 88, 48, 110, 51, 64, 50, 86, 52, 67, 55, 93, 49, 90, 48, 65, 51, 71, 49, 94, 48, 94, 51, 94, 49, 68, 50, 89, 55, 87, 54, 65, 54, 80, 49, 70, 50, 106, 55, 88, 54, 87, 54, 65, 49, 107, 50, 83, 55, 89, 54, 77, 54, 91, 49, 80, 55, 66, 51, 94, 48, 83, 50, 72, 56, 82, 50, 65, 50, 111, 50, 93, 49, 86, 55, 94, 51, 75, 49, 89, 56, 87, 49, 89, 52, 95, 50, 95, 49, 103, 56, 92, 49, 68, 52, 83, 50, 95, 49, 93, 56, 87, 49, 72, 56, 95, 49, 85, 52, 79, 50, 84, 49, 74, 49, 116, 52, 67, 51, 71, 53, 64, 57, 89, 49, 90, 52, 115, 51, 90, 53, 80, 57, 83, 49, 69, 52, 117, 51, 92, 53, 81, 57, 69, 49, 67, 52, 24, 51, 85, 53, 80, 57, 91, 49, 94, 52, 88, 49, 94, 49, 92, 48, 106, 53, 68, 57, 80, 49, 66, 49, 94, 48, 92, 53, 71, 57, 70, 49, 89, 49, 92, 48, 91, 50, 115, 53, 65, 51, 68, 57, 77, 53, 93, 50, 93, 53, 113, 51, 89, 57, 93, 53, 87, 50, 66, 53, 119, 51, 95, 57, 92, 53, 65, 50, 68, 53, 26, 51, 86, 57, 93, 53, 95, 50, 89, 53, 90, 52, 89, 48, 92, 52, 107, 49, 66, 54, 81, 55, 66, 51, 89, 52, 88, 50, 69, 52, 68, 48, 90, 52, 91, 49, 92, 49, 65, 52, 88, 53, 87, 56, 73, 54, 81, 49, 67, 52, 107, 53, 88, 56, 95, 54, 64, 49, 110, 52, 82, 53, 89, 56, 69, 54, 90, 49, 85, 55, 87, 50, 94, 53, 106, 48, 67, 48, 82, 57, 64, 49, 88, 53, 89, 51, 67, 55, 74, 50, 88, 53, 90, 48, 93, 49, 67, 57, 86, 57, 91, 50, 86, 54, 86, 49, 85, 50, 119, 48, 69, 49, 68, 49, 70, 51, 93, 52, 93, 48, 116, 55, 95, 50, 87, 50, 81, 48, 66, 49, 116, 49, 90, 51, 87, 52, 67, 48, 69, 55, 31, 50, 82, 50, 80, 48, 93, 49, 94, 49, 92, 50, 23, 51, 87, 55, 30, 57, 81, 55, 69, 50, 66, 51, 70, 55, 94, 57, 95, 55, 85, 50, 82, 51, 18, 55, 85, 57, 87, 55, 92, 50, 84, 51, 70, 55, 84, 57, 18, 55, 12, 50, 65, 51, 94, 55, 80, 57, 75, 55, 85, 50, 67, 51, 12, 55, 17, 57, 20, 55, 7, 50, 28, 51, 18, 55, 117, 57, 87, 55, 92, 50, 84, 51, 70, 55, 84, 57, 18, 55, 64, 50, 93, 51, 83, 55, 72, 57, 87, 55, 66, 50, 22, 51, 65, 55, 17, 57, 119, 55, 94, 50, 85, 51, 87, 55, 67, 57, 113, 55, 88, 50, 84, 51, 65, 55, 69, 57, 18, 55, 22, 50, 9, 51, 26, 55, 112, 57, 86, 55, 93, 50, 88, 51, 92, 55, 24, 49, 18, 53, 83, 48, 22, 50, 81, 55, 65, 49, 71, 53, 66, 48, 86, 50, 95, 55, 81, 49, 87, 53, 22, 48, 31, 50, 5, 55, 25, 49, 20, 53, 121, 48, 73, 50, 87, 55, 90, 49, 20, 53, 79, 48, 86, 50, 71, 55, 70, 49, 20, 53, 115, 48, 87, 50, 86, 55, 81, 49, 70, 53, 117, 48, 81, 50, 87, 55, 71, 49, 64, 49, 19, 54, 14, 49, 18, 54, 93, 51, 22, 49, 21, 54, 22, 49, 20, 54, 16, 51, 22, 49, 21, 54, 22, 49, 20, 54, 16, 51, 22, 49, 21, 54, 22, 49, 20, 54, 16, 51, 22, 49, 21, 54, 22, 49, 20, 54, 16, 51, 22, 49, 21, 54, 22, 49, 20, 54, 16, 51, 22, 49, 21, 54, 22, 49, 20, 54, 16, 51, 22, 49, 21, 54, 22, 49, 20, 54, 16, 51, 22, 56, 30, 56, 14, 57, 114, 53, 68, 51, 75, 56, 76, 56, 86, 49, 88, 49, 118, 56, 86, 56, 92, 57, 84, 53, 67, 51, 123, 56, 80, 56, 92, 49, 70, 49, 71, 56, 24, 56, 30, 57, 6, 53, 28, 51, 24, 56, 123, 56, 86, 49, 88, 49, 94, 56, 89, 56, 86, 57, 85, 53, 66, 49, 114, 55, 71, 52, 75, 48, 77, 50, 89, 49, 92, 55, 119, 52, 86, 48, 93, 50, 83, 49, 67, 55, 113, 52, 80, 48, 92, 50, 69, 49, 69, 55, 28, 52, 89, 48, 93, 50, 91, 49, 88, 55, 92, 55, 19, 56, 80, 55, 23, 57, 84, 54, 66, 53, 75, 53, 67, 56, 86, 55, 91, 55, 80, 56, 86, 55, 24, 57, 95, 54, 82, 53, 84, 53, 71, 56, 25, 55, 16, 55, 2, 56, 24, 55, 24, 57, 100, 54, 95, 53, 87, 53, 64, 56, 74, 55, 22, 55, 65, 56, 93, 55, 81, 57, 68, 
        54, 23, 53, 80, 53, 82, 56, 85, 55, 70, 55, 21, 56, 88, 55, 93, 57, 68, 54, 68, 53, 89, 53, 80, 56, 92, 49, 31, 51, 9, 51, 20, 54, 92, 55, 16, 49, 25, 51, 17, 51, 18, 54, 17, 55, 16, 49, 25, 51, 17, 51, 18, 54, 17, 55, 16, 49, 25, 51, 17, 51, 18, 54, 17, 55, 16, 49, 25, 51, 17, 51, 18, 54, 17, 55, 16, 49, 25, 51, 17, 51, 18, 54, 17, 55, 16, 49, 25, 51, 17, 51, 18, 54, 17, 55, 16, 49, 25, 51, 17, 51, 18, 54, 17, 55, 16, 49, 31, 51, 80, 57, 30, 48, 85, 48, 71, 49, 74, 51, 65, 57, 94, 48, 91, 48, 87, 49, 90, 51, 21, 57, 94, 48, 70, 48, 87, 49, 87, 51, 21, 57, 23, 48, 1, 48, 31, 49, 25, 51, 122, 57, 65, 48, 83, 48, 92, 49, 25, 51, 76, 57, 94, 48, 67, 48, 64, 49, 25, 51, 112, 57, 95, 48, 82, 48, 87, 49, 75, 51, 118, 57, 89, 48, 83, 48, 65, 49, 77, 49, 16, 57, 92, 51, 28, 48, 91, 50, 77, 49, 69, 57, 77, 51, 92, 48, 85, 50, 93, 49, 85, 57, 25, 51, 92, 48, 72, 50, 93, 49, 88, 57, 25, 51, 15, 48, 72, 50, 84, 49, 87, 57, 64, 51, 86, 48, 74, 50, 6, 49, 22, 57, 31, 51, 4, 48, 21, 50, 24, 49, 121, 57, 73, 51, 86, 48, 86, 50, 24, 49, 70, 57, 85, 51, 82, 48, 65, 50, 93, 49, 68, 57, 30, 51, 64, 48, 24, 50, 125, 49, 88, 57, 93, 51, 86, 48, 74, 50, 123, 49, 94, 57, 92, 51, 64, 48, 76, 50, 24, 49, 16, 57, 1, 51, 27, 48, 121, 50, 92, 49, 91, 57, 80, 51, 93, 48, 17, 50, 19, 48, 93, 49, 31, 51, 80, 50, 71, 53, 67, 56, 69, 48, 92, 51, 95, 50, 80, 48, 91, 49, 16, 51, 65, 50, 87, 53, 92, 56, 94, 48, 82, 51, 86, 50, 21, 48, 30, 49, 7, 51, 30, 50, 18, 53, 98, 56, 84, 48, 95, 51, 93, 50, 84, 48, 92, 49, 16, 51, 80, 50, 93, 53, 94, 56, 87, 48, 90, 51, 85, 50, 64, 48, 74, 49, 81, 51, 71, 50, 91, 53, 95, 56, 95, 48, 19, 51, 20, 50, 13, 48, 16, 49, 113, 51, 87, 50, 95, 53, 89, 56, 95, 48, 26, 54, 114, 57, 66, 48, 64, 57, 65, 54, 94, 57, 90, 48, 118, 57, 91, 54, 85, 57, 82, 48, 65, 57, 118, 54, 89, 57, 82, 48, 64, 57, 65, 54, 31, 57, 86, 48, 87, 57, 88, 54, 88, 57, 89, 49, 71, 48, 82, 51, 88, 51, 91, 55, 80, 53, 84, 49, 86, 53, 69, 53, 83, 48, 91, 50, 94, 52, 67, 49, 86, 52, 93, 57, 83, 50, 87, 51, 91, 49, 93, 56, 77, 55, 87, 53, 83, 49, 86, 48, 91, 48, 93, 53, 65, 55, 84, 49, 94, 49, 82, 53, 91, 53, 71, 49, 114, 52, 65, 48, 75, 48, 65, 50, 88, 49, 92, 52, 113, 48, 86, 48, 81, 50, 82, 49, 67, 52, 119, 48, 80, 48, 80, 50, 68, 49, 69, 52, 26, 48, 89, 48, 81, 50, 90, 49, 88, 52, 90};
    }

    private static int nvwlwtyfxqzdzmip(int i, int i2) {
        return i2 ^ i;
    }
}
