package com.kammoun.donutCore.settings.packets.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import com.kammoun.donutCore.DonutCore;
import com.kammoun.donutCore.settings.SettingsPlugin;
import com.kammoun.donutCore.settings.models.enums.SettingType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;

public class ChatBlocker {
    private final SettingsPlugin plugin;
    private static int oAdq2COQms = 0;
    private transient int UcXPSmPnfb = 2046395952;
    private static String bcnvqxbfom;
    private static String[] nothing_to_see_here = new String[15];

    public ChatBlocker(SettingsPlugin settingsPlugin, int i) {
        yzfacyzxyzgjbksn(745651289 ^ 905091247, 658218795);
        int parseInt = 1314245966 ^ (2044635766 ^ Integer.parseInt("154393829"));
        this.UcXPSmPnfb = 2046395952 ^ oAdq2COQms;
        this.plugin = settingsPlugin;
        int i2 = 315635774 ^ (1057318206 ^ (1455025093 ^ parseInt));
    }

    public void register(int i) {
        int i2 = 1721742974 ^ (290586846 ^ 976619742);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1876816882) {
            i2 = 325702225 ^ i2;
            ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -191667846) {
                int i3 = 435819891 ^ i2;
                DonutCore api = this.plugin.getApi(2142241109);
                ListenerPriority listenerPriority = ListenerPriority.HIGH;
                PacketType[] packetTypeArr = new PacketType[(byte) (1198029149 ^ i3)];
                packetTypeArr[(byte) (1198029148 ^ i3)] = PacketType.Play.Server.CHAT;
                protocolManager.addPacketListener(new PacketAdapter(this, api, listenerPriority, packetTypeArr, 1579772455) {
                    final ChatBlocker this$0;
                    private static int iPdrruYc3h = 0;
                    private transient int BQUXQAh5L2 = 1572219216;
                    private static String[] nothing_to_see_here = new String[18];

                    {
                        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.packets.utils.ChatBlocker.AnonymousClass1.<init>(com.kammoun.donutCore.settings.packets.utils.ChatBlocker, org.bukkit.plugin.Plugin, com.comphenix.protocol.events.ListenerPriority, com.comphenix.protocol.PacketType[], int):void");
                    }

                    public void onPacketSending(PacketEvent packetEvent) {
                        int i4 = 1174577358 ^ (672164914 ^ 1589124904);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2057920863) {
                            int i5 = 1606591203 ^ i4;
                            if (this.this$0.canReceive(packetEvent.getPlayer(), 1991889617) == (1869115703 ^ i5)) {
                                i4 = dafzkoczdkuknzzn(i5, 638386835);
                                byte byteValue = ((Byte) packetEvent.getPacket().getBytes().readSafely((byte) (1231385508 ^ i4))).byteValue();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1261149474) {
                                    int i6 = 1445828155 ^ i4;
                                    if (byteValue != (524871071 ^ i6)) {
                                        dafzkoczdkuknzzn(i6, 1283046006);
                                        return;
                                    }
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != -95998728) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == -95998728 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (1749764297 ^ i6)) {
                                                break;
                                            }
                                        }
                                        int i7 = 823477704 ^ i6;
                                        throw new RuntimeException("double");
                                    }
                                    i5 = 1153640412 ^ i6;
                                    packetEvent.setCancelled((byte) (1535885890 ^ i5));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -597814758) {
                                        int i8 = 146447786 ^ i5;
                                        return;
                                    }
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2068023739) {
                                int i9 = 2014721039 ^ i5;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 2068023739 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1431062627 ^ i5)) {
                                    int i10 = 918771911 ^ i5;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -597814758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (333244750 ^ i5)) {
                                        break;
                                    }
                                }
                            }
                            int i11 = 623814702 ^ i5;
                            throw new IllegalAccessException("double");
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1141757504 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (925457007 ^ i4)) {
                                int i12 = 210099024 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2057920863 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1422468924 ^ i4)) {
                                    int i13 = 934012943 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1261149474 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (896809479 ^ i4)) {
                                        break;
                                    }
                                }
                            }
                        }
                        int i14 = 1468531911 ^ i4;
                        throw new IOException();
                    }

                    static {
                        nothing_to_see_here[0] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[1] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[2] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⠿⠟⠛⠻⣿⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[3] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣆⣀⣀⠀⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[4] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠻⣿⣿⣿⠅⠛⠋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[5] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢼⣿⣿⣿⣃⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[6] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣟⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[7] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣛⣛⣫⡄⠀⢸⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[8] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⡆⠸⣿⣿⣿⡷⠂⠨⣿⣿⣿⣿⣶⣦⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[9] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⣿⣿⣿⡇⢀⣿⡿⠋⠁⢀⡶⠪⣉⢸⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[10] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣷⣿⣿⣷⣦⡙⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[11] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣷⣦⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[12] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[13] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[14] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[15] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[16] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        nothing_to_see_here[17] = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣵⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
                        iPdrruYc3h = (-1295411623) ^ new Random(3649691229936140843L).nextInt();
                    }

                    public static String wisasmsxks(byte[] bArr, byte[] bArr2, int i4) {
                        byte[] bytes = Integer.toString(i4).getBytes();
                        int i5 = 0;
                        while (true) {
                            int i6 = i5;
                            if (i6 >= bArr.length) {
                                return new String(bArr, StandardCharsets.UTF_16);
                            }
                            bArr[i6] = (byte) (bArr[i6] ^ bytes[i6 % bytes.length]);
                            bArr[i6] = (byte) (bArr[i6] ^ bArr2[i6 % bArr2.length]);
                            i5 = i6 + 1;
                        }
                    }

                    private static byte[] vhnsjpeyvkavtla() {
                        return new byte[]{4, 87, 113, 121, 51, 7, 3, 13, 15, 34, 77, 29, 111, 16, 109, 66, 70, 4, 107, 73, 48, 18, 91, 76, 76, 12, 99, 30, 39, 82, 101, 15, 75, 84, 116, 93, 24, 35, 6, 71, 27, 51, 53, 106, 54, 8, 9, 39, 80, 71, 61, 75, 24, 101, 36, 73, 39, 23, 4, 63, 104, 19, 75, 81, 43, 60, 25, 9, 82, 89, 92, 24, 69, 92, 105, 84, 35, 79, 102, 9, 119, 76, 4, 68, 10, 108, 74};
                    }

                    private static int dafzkoczdkuknzzn(int i4, int i5) {
                        return i5 ^ i4;
                    }
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 994298594) {
                    int i4 = 948294781 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 994298594 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1814504733 ^ i3)) {
                        break;
                    }
                }
                int i5 = 25983662 ^ i3;
                throw new IllegalAccessException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1876816882 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (294256532 ^ i2)) {
                int i6 = 930187968 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -191667846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (310767662 ^ i2)) {
                    break;
                }
            }
        }
        int i7 = 191238264 ^ i2;
        throw new IOException();
    }

    private boolean canReceive(Player player, int i) {
        int i2 = 1410488997 ^ (1202154631 ^ 976619742);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1276770273) {
            i2 = 875898576 ^ i2;
            if (this.plugin.getSettingsManager(115064052) != null) {
                int i3 = 780631266 ^ i2;
                return this.plugin.getSettingsManager(115064052).isSettingEnabled(player.getUniqueId(), SettingType.CHAT_SERVER_MESSAGES, 34656076);
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -307183264) {
                return (byte) (2010105542 ^ (1786371819 ^ i2));
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -307183264 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (689384820 ^ i2)) {
                int i4 = 1525707206 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1276770273 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (943252147 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1998129353 ^ i2;
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
        bcnvqxbfom = ByteBuffer.wrap(ynodjynyyhbnqnx()).asCharBuffer().toString();
        oAdq2COQms = 154875352 ^ new Random(5016200665828495547L).nextInt();
    }

    public static String csfcvicazn(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = bcnvqxbfom.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] ynodjynyyhbnqnx() {
        return new byte[0];
    }

    private static int yzfacyzxyzgjbksn(int i, int i2) {
        return i ^ i2;
    }
}
