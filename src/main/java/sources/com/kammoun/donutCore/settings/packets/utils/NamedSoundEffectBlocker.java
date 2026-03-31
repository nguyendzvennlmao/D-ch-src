package com.kammoun.donutCore.settings.packets.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.kammoun.donutCore.DonutCore;
import com.kammoun.donutCore.settings.SettingsPlugin;
import com.kammoun.donutCore.settings.manager.SettingsManager;
import com.kammoun.donutCore.settings.models.enums.SettingType;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;
import org.bukkit.entity.Player;

public class NamedSoundEffectBlocker {
    private final SettingsPlugin plugin;
    private static int LIVGbBCDPJ = 0;
    private transient int nYrcQdVE4T = 2146618839;
    private static String[] nothing_to_see_here = new String[18];

    public NamedSoundEffectBlocker(com.kammoun.donutCore.settings.SettingsPlugin r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.packets.utils.NamedSoundEffectBlocker.<init>(com.kammoun.donutCore.settings.SettingsPlugin):void");
    }

    public void register() {
        int i = 498498956 ^ (1736489566 ^ 1585855278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != 629663713) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 629663713 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (590488575 ^ i)) {
                    break;
                }
            }
            int i2 = 489694126 ^ i;
            throw new IllegalAccessException("double");
        }
        int i3 = 865727337 ^ i;
        ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1186431832) {
            i3 = 1569371242 ^ i3;
            DonutCore api = this.plugin.getApi(2142241109);
            ListenerPriority listenerPriority = ListenerPriority.NORMAL;
            PacketType[] packetTypeArr = new PacketType[(byte) (1252244478 ^ i3)];
            packetTypeArr[(byte) (1252244479 ^ i3)] = PacketType.Play.Server.NAMED_SOUND_EFFECT;
            protocolManager.addPacketListener(new PacketAdapter(this, api, listenerPriority, packetTypeArr, 2078460409) {
                final NamedSoundEffectBlocker this$0;

                private static int f996o25pIR8Gr = 0;
                private transient int Z2jUamnX3I = 1637585149;
                private static String yvfpchgyjg;
                private static String[] nothing_to_see_here = new String[13];

                {
                    int i4 = 1793946775 ^ 1308506345;
                    this.this$0 = this;
                    while (true) {
                        switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(i4)) {
                            case 153355938:
                            default:
                                throw new RuntimeException();
                            case 196428583:
                                int i5 = 1234443599 ^ i4;
                                break;
                            case 448021422:
                            case 748317045:
                                break;
                        }
                    }
                    int parseInt = 675954036 ^ (1055815313 ^ Integer.parseInt("2015566548"));
                    this.Z2jUamnX3I = 1637585149 ^ f996o25pIR8Gr;
                    int i6 = 233283592 ^ parseInt;
                }

                public void onPacketSending(com.comphenix.protocol.events.PacketEvent r6) {
                    throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.settings.packets.utils.NamedSoundEffectBlocker.AnonymousClass1.onPacketSending(com.comphenix.protocol.events.PacketEvent):void");
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
                    yvfpchgyjg = ByteBuffer.wrap(fjnbagrbgvhjdtc()).asCharBuffer().toString();
                    f996o25pIR8Gr = 2134026629 ^ new Random(-4557859447165636290L).nextInt();
                }

                public static String jxqzlnfvqi(byte[] bArr, int i4) {
                    byte[] bytes = Integer.toString(i4).getBytes();
                    int i5 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    int i6 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
                    byte[] bytes2 = yvfpchgyjg.substring(i6, i6 + i5).getBytes(StandardCharsets.UTF_16BE);
                    int i7 = 0;
                    while (true) {
                        int i8 = i7;
                        if (i8 >= bytes2.length) {
                            return new String(bytes2, StandardCharsets.UTF_16BE);
                        }
                        bytes2[i8] = (byte) (bytes2[i8] ^ bytes[i8 % bytes.length]);
                        i7 = i8 + 1;
                    }
                }

                private static byte[] tuddrkljshkghgz() {
                    return new byte[]{0, 0, 0, 6, 0, 0, 0, 0};
                }

                private static byte[] fjnbagrbgvhjdtc() {
                    return new byte[]{57, 81, 54, 74, 50, 66, 52, 93, 57, 91, 54, 86};
                }

                private static int ctnssmwjwkncswns(int i4, int i5) {
                    return i5 ^ i4;
                }
            });
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1428021242) {
                int i4 = 515590699 ^ i3;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1186431832 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (305838539 ^ i3)) {
                int i5 = 643275342 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1597534558 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2059878430 ^ i3)) {
                    int i6 = 867003923 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1428021242 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2078215809 ^ i3)) {
                        break;
                    }
                }
            }
        }
        int i7 = 160044483 ^ i3;
        throw new IOException();
    }

    private boolean canReceive(Player player, int i) {
        int i2 = 809657043 ^ (767594172 ^ 1585855278);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 405191178) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 405191178 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2016668899 ^ i2)) {
                    break;
                }
            }
            int i3 = 1709454669 ^ i2;
            throw new IllegalAccessException("double");
        }
        int i4 = 1391979048 ^ i2;
        if (this.plugin.getSettingsManager(115064052) == null) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1885738168) {
                return (byte) (451260665 ^ (186027409 ^ i4));
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1885738168 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1742891230 ^ i4)) {
                    int i5 = 1033058057 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1261116407 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1919647084 ^ i4)) {
                        break;
                    }
                }
            }
            int i6 = 1152532391 ^ i4;
            throw new IOException("double");
        }
        int ibkowndfgvtxmmwd = ibkowndfgvtxmmwd(i4, 125877401);
        SettingsManager settingsManager = this.plugin.getSettingsManager(115064052);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == -1281618048) {
            ibkowndfgvtxmmwd = 2014860125 ^ ibkowndfgvtxmmwd;
            UUID uniqueId = player.getUniqueId();
            SettingType settingType = SettingType.EXPLOSION_SOUNDS;
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == 1935578475) {
                int i7 = 1492209196 ^ ibkowndfgvtxmmwd;
                return settingsManager.isSettingEnabled(uniqueId, settingType, 34656076);
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == -684881984 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == (904419768 ^ ibkowndfgvtxmmwd)) {
                int i8 = 1807593796 ^ ibkowndfgvtxmmwd;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == -1281618048 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == (894116843 ^ ibkowndfgvtxmmwd)) {
                    int i9 = 1197968488 ^ ibkowndfgvtxmmwd;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == 1935578475 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(ibkowndfgvtxmmwd) == (118168643 ^ ibkowndfgvtxmmwd)) {
                        break;
                    }
                }
            }
        }
        int i10 = 1840751989 ^ ibkowndfgvtxmmwd;
        throw new RuntimeException();
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
        LIVGbBCDPJ = (-411046070) ^ new Random(7114403736990770713L).nextInt();
    }

    public static String hrapejshvm(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] vskwwyfhmshtbat() {
        return new byte[]{6, 101, 87, Byte.MAX_VALUE, 75, 43, 23, 100, 72, 44, 62, 4, 73, 92, 51, 86, 80, 18, 95, 36, 48, 19, 54, 33, 89, 57, 18, 85, 36, 95, 89, 41, 26, 97, 98, 54, 82, 75, 46, 104, 126, 121, 85, 114, 29, 89, 49, 54, 123, 112, 78, 56, 119, 95, 39, 1, 53, 15, 81, 115, 71, 33, 125, 71, 7, 55, 51, 65, 85, 33, 52, 32, 21, 117, 19, 23, 109, 57, 86, 66, 101, 31, 14, 57, 59, 1, 65, 116, 38, 46, 26, 82, 30, 119, 40, 8, 112, 100, 5, 115, 25, 105, 8, 57, 112, 81, 32, 7, 99, 109, 91};
    }

    private static int ibkowndfgvtxmmwd(int i, int i2) {
        return i2 ^ i;
    }
}
