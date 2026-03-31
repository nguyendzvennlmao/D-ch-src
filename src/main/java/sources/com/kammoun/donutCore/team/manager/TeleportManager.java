package com.kammoun.donutCore.team.manager;

import com.kammoun.donutCore.api.runables.SchedulerUtil;
import com.kammoun.donutCore.team.TeamPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class TeleportManager implements Listener {
    private final HashMap<UUID, SchedulerUtil.Task> tasks;
    private final TeamPlugin plugin;

    private static int f1180VgYnSok0S = 0;
    private transient int Nfrblezx0K = 95596830;
    private static byte[] puogldvrmn;
    private static String[] nothing_to_see_here = new String[15];

    public TeleportManager(TeamPlugin teamPlugin, int i) {
        zarlhwjpkjbwhcpz(1599622807 ^ 653907583, 1376828358);
        int parseInt = 1325363200 ^ (857235000 ^ Integer.parseInt("1448480022"));
        this.Nfrblezx0K = 95596830 ^ f1180VgYnSok0S;
        this.tasks = new HashMap<>();
        this.plugin = teamPlugin;
        Bukkit.getPluginManager().registerEvents(this, teamPlugin.getApi(2142241109));
        int i2 = 984513625 ^ (544377967 ^ (2014197912 ^ (1534596055 ^ (838930311 ^ parseInt))));
    }

    public void teleportWithCountdown(Player player, Location location, int i) {
        int i2 = 97370180 ^ (960900853 ^ 184158159);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1282454543) {
            int i3 = 2044003660 ^ i2;
            UUID uniqueId = player.getUniqueId();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 2099732882) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 2099732882 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (470447565 ^ i3)) {
                        break;
                    }
                }
                int i4 = 134565000 ^ i3;
                throw new IOException("double");
            }
            int i5 = 373540068 ^ i3;
            cancelTeleport(uniqueId, 1349874200);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -818329934) {
                int i6 = 624052955 ^ i5;
                int[] iArr = new int[(byte) (2094359052 ^ i6)];
                iArr[(byte) (2094359053 ^ i6)] = (byte) (2094359048 ^ i6);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -424996757) {
                    i5 = 9691965 ^ i6;
                    SchedulerUtil.Task[] taskArr = new SchedulerUtil.Task[(byte) (2084995377 ^ i5)];
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -499906173) {
                        i5 = 959465657 ^ i5;
                        Runnable runnable = ()
                        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeleportManager.teleportWithCountdown(org.bukkit.entity.Player, org.bukkit.Location, int):void");
                    }

                    private void cancelTeleport(UUID uuid, int i) {
                        int i2 = 589329257 ^ (1038116827 ^ 184158159);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1580164120) {
                            int i3 = 1852294293 ^ i2;
                            SchedulerUtil.Task remove = this.tasks.remove(uuid);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != -756105405) {
                                while (true) {
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -756105405 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (684487676 ^ i3)) {
                                        int i4 = 200579816 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 318034386 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (534928418 ^ i3)) {
                                            break;
                                        }
                                    }
                                }
                                int i5 = 1681788354 ^ i3;
                                throw new IllegalAccessException("double");
                            }
                            i2 = 733249755 ^ i3;
                            if (remove == null) {
                                int i6 = 330812681 ^ i2;
                                return;
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1890928230) {
                                i2 = 1489805927 ^ i2;
                                remove.cancel(1520188267);
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1227860640) {
                                    int i7 = 1266380654 ^ i2;
                                    return;
                                }
                            }
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1580164120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (909254559 ^ i2)) {
                                int i8 = 795640413 ^ i2;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1227860640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1704876264 ^ i2)) {
                                    int i9 = 993469463 ^ i2;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1890928230 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (166461321 ^ i2)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i10 = 202857296 ^ i2;
                        throw new IllegalAccessException();
                    }

                    @org.bukkit.event.EventHandler
                    public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent r7) {
                        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.team.manager.TeleportManager.onPlayerMove(org.bukkit.event.player.PlayerMoveEvent):void");
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
                        puogldvrmn = egcjuqlnychqgob();
                        f1180VgYnSok0S = (-96999494) ^ new Random(-8288523527041525609L).nextInt();
                    }

                    public static String oywqysinod(byte[] bArr, int i) {
                        byte[] bytes = Integer.toString(i).getBytes();
                        int i2 = 0;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= bArr.length) {
                                return new String(bArr, StandardCharsets.UTF_16);
                            }
                            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                            bArr[i3] = (byte) (bArr[i3] ^ puogldvrmn[i3 % puogldvrmn.length]);
                            i2 = i3 + 1;
                        }
                    }

                    private static byte[] egcjuqlnychqgob() {
                        return new byte[]{78, 18, 126, 56, 21, 3, 45, 108, 108, 35, 125, 33, 35, 105, 28, 119, 59, 108, 10, 88, 53, 21, 63, 75, 93, 114, 61, 115, 63, 21, 48, 68, 105, 4, 101, 83, 73, 10, 80, 98};
                    }

                    private static byte[] uxcuamjvrevydnm() {
                        return new byte[]{-127, -36, 78, 104, 39, 91, 31, 60, 90, 122, 76, 98, 19, 61, 46, 32, 9, 46, 60, 7, 4, 75, 15, 28, 111, 105, 15, 38, 9, 79, 1, 28, 89, 94, 87, 14};
                    }

                    private static byte[] jcskcdohsthpjlf() {
                        return new byte[]{-127, -40, 70, 40, 38, 69, 26, 61, 95, 117, 76, 123, 27, 50, 47, 38, 12, 43, 57, 72};
                    }

                    private static byte[] gmqwrhucsjghlqe() {
                        return new byte[]{-127, -36, 77, 120, 45, 83, 26, 51, 85, 119, 76, 96, 16, 50, 36, 48, 12, 43, 51, 68, 4, 87, 12, 10, 101, 36, 10, 35, 6, 65, 1, 6, 90, 67};
                    }

                    private static byte[] ohmnvmntuxiichg() {
                        return new byte[]{-127, -35, 77, 42, 36, 72, 24, 57, 92, 119, 76, 126, 16, 48, 45, 43, 14, 47, 58, 74};
                    }

                    private static byte[] uhwdfivshchxevz() {
                        return new byte[]{-126, -37, 75, 126, 36, 87, 29, 54, 94, 112, 72, 99, 18, 55, 44, 51, 9, 46, 63, 71, 4, 71, 15, 28, 111, 42, 8, 34, 14, 65, 0, 30};
                    }

                    private static int zarlhwjpkjbwhcpz(int i, int i2) {
                        return i ^ i2;
                    }
                }
