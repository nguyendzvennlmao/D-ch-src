package com.kammoun.donutCore.settings.packets.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.kammoun.donutCore.DonutCore;
import com.kammoun.donutCore.settings.SettingsPlugin;
import com.kammoun.donutCore.settings.models.enums.SettingType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import org.bukkit.entity.Player;

public class ActionBarBlocker {
    private final SettingsPlugin plugin;
    private static int s9IZqBVfZY = 0;
    private transient int SsOLOStgbD = 333791643;
    private static String[] nothing_to_see_here = new String[15];

    public ActionBarBlocker(com.kammoun.donutCore.settings.SettingsPlugin r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.packets.utils.ActionBarBlocker.<init>(com.kammoun.donutCore.settings.SettingsPlugin, int):void");
    }

    public void register(int i) {
        int i2 = 118668430 ^ (1293505778 ^ 2086778047);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -1286412775) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1286412775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (998233750 ^ i2)) {
                    break;
                }
            }
            int i3 = 714141652 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1489642309 ^ i2;
        ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1963195443) {
            i4 = 391869420 ^ i4;
            DonutCore api = this.plugin.getApi(2142241109);
            ListenerPriority listenerPriority = ListenerPriority.HIGH;
            PacketType[] packetTypeArr = new PacketType[(byte) (2046495848 ^ i4)];
            packetTypeArr[(byte) (2046495850 ^ i4)] = PacketType.Play.Server.SET_ACTION_BAR_TEXT;
            packetTypeArr[(byte) (2046495851 ^ i4)] = PacketType.Play.Server.CHAT;
            protocolManager.addPacketListener(new PacketAdapter(this, api, listenerPriority, packetTypeArr, 871449022) {
                final ActionBarBlocker this$0;
                private static int C1dVsQ0gkU = 0;

                private transient int f981NMMHjMqL8 = 1321086781;
                private static String[] nothing_to_see_here = new String[15];

                {
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.packets.utils.ActionBarBlocker.AnonymousClass1.<init>(com.kammoun.donutCore.settings.packets.utils.ActionBarBlocker, org.bukkit.plugin.Plugin, com.comphenix.protocol.events.ListenerPriority, com.comphenix.protocol.PacketType[], int):void");
                }

                public void onPacketSending(com.comphenix.protocol.events.PacketEvent r5) {
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.packets.utils.ActionBarBlocker.AnonymousClass1.onPacketSending(com.comphenix.protocol.events.PacketEvent):void");
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
                    C1dVsQ0gkU = 2025212362 ^ new Random(3429276918072026181L).nextInt();
                }

                public static String ugopfovtkb(byte[] bArr, byte[] bArr2, int i5) {
                    byte[] bytes = Integer.toString(i5).getBytes();
                    int i6 = 0;
                    while (true) {
                        int i7 = i6;
                        if (i7 >= bArr.length) {
                            return new String(bArr, StandardCharsets.UTF_16);
                        }
                        bArr[i7] = (byte) (bArr[i7] ^ bytes[i7 % bytes.length]);
                        bArr[i7] = (byte) (bArr[i7] ^ bArr2[i7 % bArr2.length]);
                        i6 = i7 + 1;
                    }
                }

                private static byte[] nuqfeikkyshownq() {
                    return new byte[]{121, 51, 91, 101, 32, 20, 116, 52, 54, 90, 63, 40, 104, 29, 33, 103, 98, 73, 31, 27, 56, 72, 40, 13, 111, 117, 18, 24, 81, 90, 100, Byte.MAX_VALUE, 109, 122, 116, 106, 114, 29, 67, 52, 54, 119, 40, 65, 100, 24, 109, 52, 31, 43, 118, 59, 70, 78};
                }

                private static int uuatvlwnquoseufz(int i5, int i6) {
                    return i6 ^ i5;
                }
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -807902381) {
                int i5 = 2089247852 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1963195443 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1987247686 ^ i4)) {
                int i6 = 1407786010 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 736313392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1930044839 ^ i4)) {
                    int i7 = 465854615 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -807902381 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (258050341 ^ i4)) {
                        break;
                    }
                }
            }
        }
        int i8 = 6809135 ^ i4;
        throw new RuntimeException();
    }

    private boolean canReceive(Player player, int i) {
        int i2 = 449607014 ^ (1801624277 ^ 2086778047);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1853544544) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1853544544 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1121733717 ^ i2)) {
                    break;
                }
            }
            int i3 = 950567623 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 147743148 ^ i2;
        if (this.plugin.getSettingsManager(115064052) != null) {
            int i5 = 852367828 ^ i4;
            return this.plugin.getSettingsManager(115064052).isSettingEnabled(player.getUniqueId(), SettingType.HOTBAR_SERVER_MESSAGES, 34656076);
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 671732992) {
            return (byte) (1701855503 ^ (1618049966 ^ i4));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 671732992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (914414568 ^ i4)) {
                break;
            }
        }
        int i6 = 1448160307 ^ i4;
        throw new RuntimeException("double");
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
        s9IZqBVfZY = (-1108717658) ^ new Random(-7409141849477089885L).nextInt();
    }

    public static String baomboqdcv(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] lnjbkxwikyjeqxm() {
        return new byte[]{97, 92, 75, 84, 61, 33, 8, 1, 43, 111, 33, 83, 14, 46, 79, 73, 46, 13, 71, 71, 62, 89, 69, 1, 69, 61, 82, 71, 92, 60, 110, 48, 42, 47, 26, 22, 30, 16, 77, 121, 35, 39, 42, 81, 117, 24, 122, 31, 61, 26, 37, 24, 100, 77, 9, 96, 72, 12, 90, 122, 31, 23, 125, 116, 63, 15, 12, 76, 64, 50, 46};
    }
}
