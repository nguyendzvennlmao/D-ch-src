package com.kammoun.donutCore.settings.packets.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.reflect.StructureModifier;
import com.kammoun.donutCore.DonutCore;
import com.kammoun.donutCore.settings.SettingsPlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class TotemStatusBlocker {
    private final SettingsPlugin plugin;
    private static int TIPtfYCCkP = 0;
    private transient int AbEgU0w0d3 = 1222385916;
    private static String[] nothing_to_see_here = new String[15];

    public TotemStatusBlocker(SettingsPlugin settingsPlugin, int i) {
        int i2 = 1642135406 ^ 943628465;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i2)) {
                case 91262306:
                case 236879902:
                    int i3 = 454121380 ^ i2;
                    break;
                case 641938619:
                default:
                    throw new IllegalAccessException();
                case 1694425803:
                    break;
            }
        }
        int parseInt = 1409857344 ^ (1081235277 ^ Integer.parseInt("1454762102"));
        this.AbEgU0w0d3 = 1222385916 ^ TIPtfYCCkP;
        this.plugin = settingsPlugin;
        int i4 = 577477122 ^ (962519731 ^ (1601884749 ^ parseInt));
    }

    public void register(int i) {
        int i2 = 44807947 ^ (1071742316 ^ 822188198);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1650103816) {
            i2 = 1838083832 ^ i2;
            ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 237887947) {
                int i3 = 794038773 ^ i2;
                DonutCore api = this.plugin.getApi(2142241109);
                ListenerPriority listenerPriority = ListenerPriority.HIGH;
                PacketType[] packetTypeArr = new PacketType[(byte) (1318170061 ^ i3)];
                packetTypeArr[(byte) (1318170060 ^ i3)] = PacketType.Play.Server.ENTITY_STATUS;
                protocolManager.addPacketListener(new PacketAdapter(api, listenerPriority, packetTypeArr, 1861937279) {
                    private static int eB9rsuVC3d = 0;
                    private transient int RIpiITByvA = 1970823094;
                    private static byte[] jnnepsojpt;
                    private static String[] nothing_to_see_here = new String[13];

                    {
                        tdytabauyamxdmtc(1947898224 ^ 886585005, 166270750);
                        int parseInt = 789681714 ^ (1794086803 ^ Integer.parseInt("215331170"));
                        this.RIpiITByvA = 1970823094 ^ eB9rsuVC3d;
                        while (true) {
                            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                                case 231010130:
                                    int i4 = 2072394291 ^ parseInt;
                                    return;
                                case 941036643:
                                case 1172240206:
                                default:
                                    throw new RuntimeException();
                                case 1689732019:
                                    return;
                            }
                        }
                    }

                    public void onPacketSending(PacketEvent packetEvent) {
                        int i4 = 993585547 ^ (1182730485 ^ 819428335);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1820644490) {
                            i4 = 151987699 ^ i4;
                            if (TotemStatusBlocker.this.canReceive(packetEvent.getPlayer(), 11140431) == (1151319906 ^ i4)) {
                                i4 = tdytabauyamxdmtc(i4, 822552657);
                                PacketContainer packet = packetEvent.getPacket();
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1396393573) {
                                    i4 = 167039990 ^ i4;
                                    StructureModifier bytes = packet.getBytes();
                                    byte b = (byte) (2087470277 ^ i4);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -480106965) {
                                        i4 = 326422539 ^ i4;
                                        byte byteValue = ((Byte) bytes.readSafely(b)).byteValue();
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2026153587) {
                                            i4 = 618752939 ^ i4;
                                            if (byteValue == ((byte) (1274675014 ^ i4))) {
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1607465770) {
                                                    i4 = 301266675 ^ i4;
                                                    packetEvent.setCancelled((byte) (1510803863 ^ i4));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -798470990) {
                                                        int i5 = 1728033703 ^ i4;
                                                        return;
                                                    }
                                                }
                                            }
                                            while (true) {
                                                switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                                                    case 53744938:
                                                        int i6 = 1997227348 ^ i4;
                                                        return;
                                                    case 1018552046:
                                                        return;
                                                    case 2026508176:
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 620624658) {
                                int i7 = 1068149805 ^ i4;
                                return;
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -798470990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (851992926 ^ i4)) {
                                    int i8 = 152942892 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1607465770 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (767768345 ^ i4)) {
                                        int i9 = 862083440 ^ i4;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -480106965 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (17353111 ^ i4)) {
                                            int i10 = 187558399 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 620624658 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1773959351 ^ i4)) {
                                                int i11 = 482506899 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -643261829 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (719776506 ^ i4)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            int i12 = 1180493606 ^ i4;
                            throw new RuntimeException();
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1396393573 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (472618538 ^ i4)) {
                                int i13 = 1200858372 ^ i4;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 2026153587 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (461455442 ^ i4)) {
                                    int i14 = 2028958605 ^ i4;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1820644490 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1787205558 ^ i4)) {
                                        int i15 = 121054556 ^ i4;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
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
                        jnnepsojpt = djrqpejmsjedgkp();
                        eB9rsuVC3d = (-1168826580) ^ new Random(3869189146706799793L).nextInt();
                    }

                    public static String hqvoslfmkt(byte[] bArr, int i4) {
                        byte[] bytes = Integer.toString(i4).getBytes();
                        int i5 = 0;
                        while (true) {
                            int i6 = i5;
                            if (i6 >= bArr.length) {
                                return new String(bArr, StandardCharsets.UTF_16);
                            }
                            bArr[i6] = (byte) (bArr[i6] ^ bytes[i6 % bytes.length]);
                            bArr[i6] = (byte) (bArr[i6] ^ jnnepsojpt[i6 % jnnepsojpt.length]);
                            i5 = i6 + 1;
                        }
                    }

                    private static byte[] djrqpejmsjedgkp() {
                        return new byte[]{100, 31, 125, 118, 40, 58, 34, 97, 31, 107, 5, 60, 126, 4, 37, 77, 6, 74, 124, 24, 93, 31, 95, 5, 21, 109, 77, 68, 2, 92, 43, 1, 122, 102, 101, 114, 26, 33, 7, 88, 68, 18, 55, 86, 44, 34, 45, 96, 58, 50, 108, 59, 7, 121, 6, 77, 67, 53, 26, 79, 95, 111, 64, 58, 116, 83};
                    }

                    private static int tdytabauyamxdmtc(int i4, int i5) {
                        return i5 ^ i4;
                    }
                });
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1955425890) {
                    int i4 = 1121875122 ^ i3;
                    return;
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1955425890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1576348256 ^ i3)) {
                        break;
                    }
                }
                int i5 = 1116961912 ^ i3;
                throw new IOException("double");
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1652476912 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1701948938 ^ i2)) {
                int i6 = 1736500581 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 237887947 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2074895117 ^ i2)) {
                    int i7 = 1612572740 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1650103816 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1543604640 ^ i2)) {
                        break;
                    }
                }
            }
        }
        int i8 = 1340232059 ^ i2;
        throw new IOException();
    }

    private boolean canReceive(org.bukkit.entity.Player r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.packets.utils.TotemStatusBlocker.canReceive(org.bukkit.entity.Player, int):boolean");
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
        TIPtfYCCkP = (-1779403237) ^ new Random(6178509758778616602L).nextInt();
    }

    public static String ohybkvxcxb(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] kdtudsynyrjrxai() {
        return new byte[]{97, 81, 66, 42, 73, 32, 116, 121, 90, 23, 37, 68, 67, 104, 66, 99, 18, 21, 32, 114, 75, 108, 97, 66, 126, 45, 61, 12, 1, 35, 12, 40, 37, 46, 109, 115, 23, 108, 81, 122, 41, 15, 85, 6, 10, 3, 25, 59, 79, 1, 113, 89, 12, 30, 115, 55, 103, 82, 4, 22, 65, 107, 91, 121, 44, 27, 58, 10, 49, 100, 95, 22, 9, 44, 49, 108, 51, 3, 103, 44, 63, 90, 85, 107, 101, 73, 55, 75, 87, 19, 28, 80, 27, 56, 53, 102, 119, 47, 47, 10, 29, 98, 99, 88, 60, 51, 34, 125, 61, 64, 94};
    }
}
