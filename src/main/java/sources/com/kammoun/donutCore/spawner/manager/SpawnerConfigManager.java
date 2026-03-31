package com.kammoun.donutCore.spawner.manager;

import com.kammoun.donutCore.api.module.DonutModule;
import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;
import lombok.Generated;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class SpawnerConfigManager {
    private final HashMap<Messages, String> messages;
    private final HashMap<SpawnerSounds, Sound> sounds;
    private final DonutModule module;
    private int maxSpawnersPerStack;
    private int activationDistance;
    private boolean spawnerPlaceParticles;
    private boolean canSpawnerBlowUp;
    private boolean useDonutSell;
    private boolean useHolograms;
    private int hologramDistance;
    private boolean silktouchNeeded;
    private boolean useSilktouchPermissions;
    private boolean ownershipEnabled;
    private boolean convertNaturalSpawners;
    private static int QVfnm7ck2h = 0;
    private transient int Q3QGntG6Hd = 1609367122;
    private static byte[] ssunwmagcv;
    private static String[] nothing_to_see_here = new String[15];

    public static final class Messages {
        public static final Messages NO_SILK;
        public static final Messages CREATIVE_CONFIRM;
        public static final Messages SELL_ACTIONBAR;
        public static final Messages SELL_CHAT;
        public static final Messages XP_ACTIONBAR;
        public static final Messages ADD_SPAWNER_ACTIONBAR;
        public static final Messages INVENTORY_FULL;
        public static final Messages NOT_OWNER;
        public static final Messages STORAGE_IN_USE;
        public static final Messages STACK_LIMIT;
        public static final Messages STACK_LIMIT_PARTIAL;
        private static final Messages[] $VALUES;
        private static String azpwikptao;

        public static Messages[] values() {
            int i = 288451275 ^ (778356484 ^ (441033617 ^ 693678932));
            return (Messages[]) $VALUES.clone();
        }

        public static Messages valueOf(String str) {
            int i = 998532917 ^ (736403255 ^ 693678932);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -910009679) {
                int i2 = 850414797 ^ i;
                return (Messages) Enum.valueOf(Messages.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -910009679 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (173817339 ^ i)) {
                    int i3 = 1796003351 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1547713752 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1178669577 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 389127351 ^ i;
            throw new IllegalAccessException();
        }

        private Messages(java.lang.String r5, int r6) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.SpawnerConfigManager.Messages.<init>(java.lang.String, int):void");
        }

        private static Messages[] $values() {
            int i = 89349546 ^ (1210779895 ^ (775424503 ^ 693678932));
            Messages[] messagesArr = new Messages[(byte) (1243148277 ^ i)];
            messagesArr[(byte) (1243148286 ^ i)] = NO_SILK;
            messagesArr[(byte) (1243148287 ^ i)] = CREATIVE_CONFIRM;
            messagesArr[(byte) (1243148284 ^ i)] = SELL_ACTIONBAR;
            messagesArr[(byte) (1243148285 ^ i)] = SELL_CHAT;
            messagesArr[(byte) (1243148282 ^ i)] = XP_ACTIONBAR;
            messagesArr[(byte) (1243148283 ^ i)] = ADD_SPAWNER_ACTIONBAR;
            messagesArr[(byte) (1243148280 ^ i)] = INVENTORY_FULL;
            messagesArr[(byte) (1243148281 ^ i)] = NOT_OWNER;
            messagesArr[(byte) (1243148278 ^ i)] = STORAGE_IN_USE;
            messagesArr[(byte) (1243148279 ^ i)] = STACK_LIMIT;
            messagesArr[(byte) (1243148276 ^ i)] = STACK_LIMIT_PARTIAL;
            return messagesArr;
        }

        static {
            int parseInt = 569591556 ^ (366724811 ^ Integer.parseInt("750669067"));
            azpwikptao = ByteBuffer.wrap(wxxvhimplbqnorh()).asCharBuffer().toString();
            int i = 1023013518 ^ parseInt;
            NO_SILK = new Messages(brqigtcghj(oliomxrstglqjgu(), i), (byte) (611270218 ^ i));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 595194449) {
                int i2 = 1196362546 ^ i;
                CREATIVE_CONFIRM = new Messages(brqigtcghj(lswnwmjlksmluhf(), i2), (byte) (1663055225 ^ i2));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 419539907) {
                    i = 713361346 ^ i2;
                    SELL_ACTIONBAR = new Messages(brqigtcghj(afqfbtdnfhumgix(), i), (byte) (1235563192 ^ i));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1294570962) {
                        i = 165873660 ^ i;
                        SELL_CHAT = new Messages(brqigtcghj(kffbtltdauoglua(), i), (byte) (1078342981 ^ i));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 36809266) {
                            i2 = 957428681 ^ i;
                            XP_ACTIONBAR = new Messages(brqigtcghj(iqvwgrljsllbpbd(), i2), (byte) (2035746443 ^ i2));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -893897605) {
                                i = 1346972119 ^ i2;
                                ADD_SPAWNER_ACTIONBAR = new Messages(brqigtcghj(uktcppljowwbkov(), i), (byte) (689844061 ^ i));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1223785153) {
                                    i = 1772272909 ^ i;
                                    INVENTORY_FULL = new Messages(brqigtcghj(nlpropucsfkmwyb(), i), (byte) (1086100051 ^ i));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 98865834) {
                                        int i3 = 784014618 ^ i;
                                        NOT_OWNER = new Messages(brqigtcghj(tqxntroktnshodn(), i3), (byte) (1845989192 ^ i3));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1883011707) {
                                            i2 = 961360107 ^ i3;
                                            STORAGE_IN_USE = new Messages(brqigtcghj(hftymwkigqxeeje(), i2), (byte) (1464516524 ^ i2));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1168769758) {
                                                i3 = 1051341766 ^ i2;
                                                STACK_LIMIT = new Messages(brqigtcghj(vpfasnubsmxqghw(), i3), (byte) (1776323691 ^ i3));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1325687571) {
                                                    int i4 = 70935198 ^ i3;
                                                    STACK_LIMIT_PARTIAL = new Messages(brqigtcghj(tutayrnbkfkgwxx(), i4), (byte) (1843064566 ^ i4));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1859614691) {
                                                        int i5 = 1504949874 ^ i4;
                                                        $VALUES = $values();
                                                        return;
                                                    } else {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 1859614691 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (215850909 ^ i4)) {
                                                                break;
                                                            }
                                                        }
                                                        int i6 = 555898200 ^ i4;
                                                        throw new IllegalAccessException("double");
                                                    }
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1325687571 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (131586692 ^ i3)) {
                                                int i7 = 1152707885 ^ i3;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1883011707 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (916910861 ^ i3)) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i8 = 310645011 ^ i3;
                                        throw new IllegalAccessException("double");
                                    }
                                }
                            }
                        }
                    }
                }
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -893897605 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (353113859 ^ i2)) {
                        int i9 = 485666438 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1168769758 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1378254030 ^ i2)) {
                            int i10 = 320521992 ^ i2;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 419539907 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (162515279 ^ i2)) {
                                break;
                            }
                        }
                    }
                }
                int i11 = 939131144 ^ i2;
                throw new RuntimeException("double");
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 98865834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (305619170 ^ i)) {
                    int i12 = 495698258 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1555381135 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (702999628 ^ i)) {
                        int i13 = 675976892 ^ i;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1223785153 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1833970772 ^ i)) {
                            int i14 = 453036892 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 36809266 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1550571389 ^ i)) {
                                int i15 = 2041704406 ^ i;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1294570962 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (491110287 ^ i)) {
                                    int i16 = 1246411705 ^ i;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 595194449 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1675941103 ^ i)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i17 = 1728800176 ^ i;
            throw new RuntimeException();
        }

        public static String brqigtcghj(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            byte[] bytes2 = azpwikptao.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

        private static byte[] oliomxrstglqjgu() {
            return new byte[]{0, 0, 0, 7, 0, 0, 0, 0};
        }

        private static byte[] afqfbtdnfhumgix() {
            return new byte[]{0, 0, 0, 14, 0, 0, 0, 7};
        }

        private static byte[] kffbtltdauoglua() {
            return new byte[]{0, 0, 0, 9, 0, 0, 0, 21};
        }

        private static byte[] uktcppljowwbkov() {
            return new byte[]{0, 0, 0, 21, 0, 0, 0, 30};
        }

        private static byte[] lswnwmjlksmluhf() {
            return new byte[]{0, 0, 0, 16, 0, 0, 0, 51};
        }

        private static byte[] tqxntroktnshodn() {
            return new byte[]{0, 0, 0, 9, 0, 0, 0, 67};
        }

        private static byte[] hftymwkigqxeeje() {
            return new byte[]{0, 0, 0, 14, 0, 0, 0, 76};
        }

        private static byte[] vpfasnubsmxqghw() {
            return new byte[]{0, 0, 0, 11, 0, 0, 0, 90};
        }

        private static byte[] iqvwgrljsllbpbd() {
            return new byte[]{0, 0, 0, 12, 0, 0, 0, 101};
        }

        private static byte[] nlpropucsfkmwyb() {
            return new byte[]{0, 0, 0, 14, 0, 0, 0, 113};
        }

        private static byte[] tutayrnbkfkgwxx() {
            return new byte[]{0, 0, 0, 19, 0, 0, 0, Byte.MAX_VALUE};
        }

        private static byte[] wxxvhimplbqnorh() {
            return new byte[]{54, Byte.MAX_VALUE, 49, 125, 55, 111, 50, 98, 56, Byte.MAX_VALUE, 49, 125, 50, 124, 49, 97, 51, 112, 53, 122, 51, 125, 57, 107, 49, 115, 51, 118, 53, 98, 51, 120, 57, 123, 49, 124, 51, 119, 53, 119, 51, 99, 49, 99, 55, 125, 51, 120, 50, 117, 56, 109, 49, 115, 55, 112, 51, 117, 50, 109, 54, 121, 57, 124, 52, 112, 48, 106, 54, 101, 56, 105, 56, 117, 52, 103, 53, 120, 54, 125, 57, 106, 52, 107, 48, 116, 54, 117, 56, 109, 56, 125, 52, Byte.MAX_VALUE, 53, 120, 54, 122, 57, 121, 52, 102, 49, 117, 54, 97, 48, 112, 53, 115, 50, 96, 49, Byte.MAX_VALUE, 54, 101, 48, 112, 53, 109, 50, 119, 49, 121, 54, 125, 48, 115, 53, 123, 50, 102, 49, 123, 49, 118, 52, 122, 57, 108, 57, 110, 57, 118, 49, 111, 52, 123, 57, 125, 57, 99, 49, 103, 54, 96, 53, 126, 54, 103, 49, 119, 49, 115, 54, 113, 53, 110, 54, 124, 49, 120, 49, 107, 54, 97, 53, 98, 54, 112, 49, 100, 55, 98, 51, 115, 51, 117, 56, 121, 49, 104, 55, 122, 51, 123, 51, 123, 56, 123, 49, 99, 50, 104, 51, 101, 55, 107, 54, 117, 52, 116, 50, 100, 51, 124, 55, 123, 54, 122, 52, 117, 50, 113, 51, 103, 49, 121, 56, 120, 49, 102, 48, 117, 53, 125, 49, 100, 56, 121, 49, 98, 48, 105, 53, 108, 49, 118, 56, 99, 49, 124, 48, 124, 49, 107, 52, 103, 48, 119, 52, 118, 55, 121, 49, 103, 52, Byte.MAX_VALUE, 48, Byte.MAX_VALUE, 52, 120, 55, 123, 49, 108, 52, 108, 48, 102, 52, 116, 55, 96, 49, 108, 52, 122, 48, 119, 52, 121};
        }
    }

    public static final class SpawnerSounds {
        public static final SpawnerSounds SILKTOUCH_NEEDED;
        public static final SpawnerSounds PAGE_SWITCH;
        public static final SpawnerSounds BUTTON_CLICK;
        public static final SpawnerSounds INVENTORY_FULL;
        public static final SpawnerSounds LIMIT_REACHED;
        private static final SpawnerSounds[] $VALUES;

        public static SpawnerSounds[] values() {
            int i = 727606646 ^ (1744048818 ^ (1735243650 ^ 334466070));
            return (SpawnerSounds[]) $VALUES.clone();
        }

        public static SpawnerSounds valueOf(String str) {
            int i = 948319803 ^ (1059721841 ^ 334466070);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1575140640) {
                int i2 = 1562638803 ^ i;
                return (SpawnerSounds) Enum.valueOf(SpawnerSounds.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1575140640 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (175704841 ^ i)) {
                    int i3 = 859400090 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1258458234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (312011803 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 620195914 ^ i;
            throw new RuntimeException();
        }

        private SpawnerSounds(String str, int i) {
            int i2 = 1999501794 ^ (1709365097 ^ 2098307240);
            kzoqmpgavxremkqw(1368080722 ^ (1305536550 ^ Integer.parseInt("1938106199")), 1742025806);
        }

        private static SpawnerSounds[] $values() {
            int i = 1285936177 ^ (1523729703 ^ (41991942 ^ 334466070));
            SpawnerSounds[] spawnerSoundsArr = new SpawnerSounds[(byte) (119054851 ^ i)];
            spawnerSoundsArr[(byte) (119054854 ^ i)] = SILKTOUCH_NEEDED;
            spawnerSoundsArr[(byte) (119054855 ^ i)] = PAGE_SWITCH;
            spawnerSoundsArr[(byte) (119054852 ^ i)] = BUTTON_CLICK;
            spawnerSoundsArr[(byte) (119054853 ^ i)] = INVENTORY_FULL;
            spawnerSoundsArr[(byte) (119054850 ^ i)] = LIMIT_REACHED;
            return spawnerSoundsArr;
        }

        static {
            int parseInt = 1927096158 ^ (2139154881 ^ (800577615 ^ Integer.parseInt("1938106199")));
            SILKTOUCH_NEEDED = new SpawnerSounds(kfuebxejzk(vnbnxezozosagsu(), mdiviviwfvjmqss(), parseInt), (byte) (1366241671 ^ parseInt));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1954968518) {
                int i = 1695220281 ^ parseInt;
                PAGE_SWITCH = new SpawnerSounds(kfuebxejzk(baosaatcgdakckb(), mdiviviwfvjmqss(), i), (byte) (878982079 ^ i));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -1558077967) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 550248465 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (774265655 ^ i)) {
                            int i2 = 330781207 ^ i;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1558077967 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1107747936 ^ i)) {
                                break;
                            }
                        }
                    }
                    int i3 = 683623683 ^ i;
                    throw new RuntimeException("double");
                }
                parseInt = 1627031224 ^ i;
                BUTTON_CLICK = new SpawnerSounds(kfuebxejzk(srfvbamheupflaf(), mdiviviwfvjmqss(), parseInt), (byte) (1419687172 ^ parseInt));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1527404494) {
                    parseInt = 151587577 ^ parseInt;
                    INVENTORY_FULL = new SpawnerSounds(kfuebxejzk(veqoavjnoyuiqkb(), mdiviviwfvjmqss(), parseInt), (byte) (1570226172 ^ parseInt));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -323092486) {
                        parseInt = 433189451 ^ parseInt;
                        LIMIT_REACHED = new SpawnerSounds(kfuebxejzk(qqkknkjvawadcqu(), mdiviviwfvjmqss(), parseInt), (byte) (1145458096 ^ parseInt));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 573730210) {
                            int i4 = 1616890294 ^ parseInt;
                            $VALUES = $values();
                            return;
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1527404494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (526409153 ^ parseInt)) {
                    int i5 = 919885761 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -323092486 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1726825063 ^ parseInt)) {
                        int i6 = 998351852 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1954968518 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1784001562 ^ parseInt)) {
                            int i7 = 1336984587 ^ parseInt;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 573730210 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1753920153 ^ parseInt)) {
                                break;
                            }
                        }
                    }
                }
            }
            int i8 = 1417697480 ^ parseInt;
            throw new IllegalAccessException();
        }

        public static String kfuebxejzk(byte[] bArr, byte[] bArr2, int i) {
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

        private static byte[] mdiviviwfvjmqss() {
            return new byte[]{32, 126, 49, 90, 104, 59, 57, 76, 61, 60, 62, 6, 108, 27, 17, 86, 40, 79, 114, 95, 104, 99, 1, 88, 34, 122, 96, 42, 99, 103, 22, 18, 104, 118, 49, 116, 4, 114, 35, 25, 43, 33, 107, 120, 46, 47, 76, 114, 44, 120, 62, 37, 21, 23, 32, 122, 70, 51, 53, 33, 48, 7, 62, 53, 22, 88, 91, 115, 37, 42, 72, 48, 100, 125, 23, 55, 12, 113, 20, 41, 62, 59, 1, 124, 86, 69, 1, 100, 114, 57, 10, 75, 36, 14, 79, 5, 126, 76, 61, 79, 72, 121, 56, 58, 55, 19, 119, 111, 9, 96, 1, 104, 8, 3, 11, 42};
        }

        private static byte[] qqkknkjvawadcqu() {
            return new byte[]{-17, -80, 5, 35, 92, 71, 1, 48, 13, 69, 15, 99, 88, 113, 37, 49, 16, 59, 66, 46, 89, 17, 53, 37, 22, 10, 88, 95};
        }

        private static byte[] vnbnxezozosagsu() {
            return new byte[]{-17, -78, 7, 63, 90, 70, 8, 54, 10, 70, 15, 97, 90, 98, 35, 55, 25, 58, 69, 38, 89, 15, 55, 32, 16, 11, 81, 89, 84, 18, 39, 100, 94, 4};
        }

        private static byte[] veqoavjnoyuiqkb() {
            return new byte[]{-17, -76, 6, 35, 90, 71, 15, 43, 10, 76, 15, 125, 91, Byte.MAX_VALUE, 35, 43, 30, 44, 69, 51, 89, 9, 54, 46, 16, 29, 86, 87, 84, 30};
        }

        private static byte[] baosaatcgdakckb() {
            return new byte[]{-26, -74, 9, 51, 80, 72, 9, 60, 5, 65, 9, 97, 85, 112, 35, 49, 31, 62, 74, 60, 80, 25, 57, 34};
        }

        private static byte[] srfvbamheupflaf() {
            return new byte[]{-17, -75, 0, 33, 94, 86, 14, 41, 10, 92, 15, 125, 93, 108, 39, 49, 31, 61, 69, 39, 89, 30, 48, 34, 20, 9};
        }

        private static int kzoqmpgavxremkqw(int i, int i2) {
            return i ^ i2;
        }
    }

    public SpawnerConfigManager(DonutModule donutModule, int i) {
        imlepcvduzrupxqp(597634716 ^ 1001455805, 1873540485);
        int parseInt = 2062243619 ^ (1957871344 ^ Integer.parseInt("2044473975"));
        this.Q3QGntG6Hd = 1609367122 ^ QVfnm7ck2h;
        while (true) {
            switch (jnbwyqufydqqceyf.njpwuppmebnxznmg(parseInt)) {
                case 11795352:
                case 127086088:
                    parseInt = 1376704911 ^ parseInt;
                    break;
                case 647441046:
                default:
                    throw new IllegalAccessException();
                case 2075153017:
                    break;
            }
        }
        this.messages = new HashMap<>();
        this.sounds = new HashMap<>();
        this.module = donutModule;
        loadConfig(1028228880);
        int i2 = 2087656484 ^ (184667075 ^ (2122140723 ^ (497836926 ^ (1534427256 ^ parseInt))));
    }

    public void loadConfig(int i) {
        int i2 = 84705888 ^ (1916101573 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -614891181) {
            int i3 = 1500973992 ^ i2;
            FileConfiguration config = this.module.getConfig(127597628);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) != 283237393) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 283237393 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (2050277137 ^ i3)) {
                        break;
                    }
                }
                int i4 = 70368690 ^ i3;
                throw new RuntimeException("double");
            }
            int i5 = 312752603 ^ i3;
            this.maxSpawnersPerStack = config.getInt(lbgoptunlv(aovaeljtxfnmilv(), i5), 817464569 ^ i5);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -2051009847) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -2051009847 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1345857849 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1878404066 ^ i5;
                throw new IOException("double");
            }
            int i7 = 553602369 ^ i5;
            this.activationDistance = config.getInt(lbgoptunlv(fkmqisscsgpxsnx(), i7), (byte) (273108737 ^ i7));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) != -2110097216) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -2110097216 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (2026201876 ^ i7)) {
                        break;
                    }
                }
                int i8 = 1444952948 ^ i7;
                throw new IOException("double");
            }
            int i9 = 1779815779 ^ i7;
            this.spawnerPlaceParticles = config.getBoolean(lbgoptunlv(ocauzdobkdupiqt(), i9), (byte) (2052233851 ^ i9));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) != -761998373) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == -761998373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i9) == (307380204 ^ i9)) {
                        break;
                    }
                }
                int i10 = 127019928 ^ i9;
                throw new IllegalAccessException("double");
            }
            int i11 = 1837744933 ^ i9;
            this.canSpawnerBlowUp = config.getBoolean(lbgoptunlv(nphplwsqysiroog(), i11), (byte) (400251230 ^ i11));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1092957456) {
                int i12 = 2812476 ^ i11;
                this.useDonutSell = config.getBoolean(lbgoptunlv(bnsbtikrahroqiq(), i12), (byte) (401716066 ^ i12));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) != -1081238768) {
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == -1081238768 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i12) == (1275972782 ^ i12)) {
                            break;
                        }
                    }
                    int i13 = 1563346948 ^ i12;
                    throw new RuntimeException("double");
                }
                i11 = 2016293241 ^ i12;
                this.useHolograms = config.getBoolean(lbgoptunlv(dxjrtjcqzmbcixe(), i11), (byte) (1876918811 ^ i11));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 2130448603) {
                    int i14 = 1903498739 ^ i11;
                    this.hologramDistance = config.getInt(lbgoptunlv(lftumoyzydshlho(), i14), (byte) (514496487 ^ i14));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -178995392) {
                        i2 = 533529863 ^ i14;
                        this.silktouchNeeded = config.getBoolean(lbgoptunlv(gekuxaknyaykazd(), i2), (byte) (23565038 ^ i2));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 188520312) {
                            i2 = 1342459524 ^ i2;
                            this.useSilktouchPermissions = config.getBoolean(lbgoptunlv(vobcovvisgbhzeu(), i2), (byte) (1365498986 ^ i2));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1960909990) {
                                int i15 = 644606914 ^ i2;
                                this.ownershipEnabled = config.getBoolean(lbgoptunlv(jrgbdffvvtaflwf(), i15), (byte) (1997027241 ^ i15));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) != -1203651253) {
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == -1203651253 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i15) == (233800553 ^ i15)) {
                                            break;
                                        }
                                    }
                                    int i16 = 1345662105 ^ i15;
                                    throw new IllegalAccessException("double");
                                }
                                i14 = 982487599 ^ i15;
                                this.convertNaturalSpawners = config.getBoolean(lbgoptunlv(unffisugzvjkezb(), i14), (byte) (1300735367 ^ i14));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1815948338) {
                                    i2 = 18084083 ^ i14;
                                    loadMessages(config, 83439657);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1688382378) {
                                        int i17 = 1910401414 ^ i2;
                                        loadSounds(config, 765792222);
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -363731047) {
                                            int i18 = 1553469395 ^ i17;
                                            return;
                                        }
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == -363731047 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i17) == (1988774379 ^ i17)) {
                                                break;
                                            }
                                        }
                                        int i19 = 134715108 ^ i17;
                                        throw new IOException("double");
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == -178995392 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (1834846632 ^ i14)) {
                            int i20 = 1548351277 ^ i14;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == 1815948338 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i14) == (265805151 ^ i14)) {
                                break;
                            }
                        }
                    }
                    int i21 = 503709061 ^ i14;
                    throw new RuntimeException("double");
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == 2130448603 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (78460119 ^ i11)) {
                    int i22 = 1099396050 ^ i11;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == -1092957456 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i11) == (136657890 ^ i11)) {
                        break;
                    }
                }
            }
            int i23 = 1697230761 ^ i11;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 188520312 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1656590356 ^ i2)) {
                int i24 = 1443028559 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -614891181 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (271825699 ^ i2)) {
                    int i25 = 1301044692 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1688382378 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (717946620 ^ i2)) {
                        int i26 = 1740125927 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1960909990 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2108524269 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i27 = 187597802 ^ i2;
        throw new IllegalAccessException();
    }

    private void loadMessages(org.bukkit.configuration.file.FileConfiguration r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.SpawnerConfigManager.loadMessages(org.bukkit.configuration.file.FileConfiguration, int):void");
    }

    private void loadSounds(FileConfiguration fileConfiguration, int i) {
        int i2;
        int i3 = 220784349 ^ (78559608 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 782528848) {
            int i4 = 942002573 ^ i3;
            this.sounds.clear();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -276103879) {
                ?? r0 = 321369047 ^ i4;
                int i5 = r0;
                try {
                    HashMap<SpawnerSounds, Sound> hashMap = this.sounds;
                    SpawnerSounds spawnerSounds = SpawnerSounds.SILKTOUCH_NEEDED;
                    String lbgoptunlv = lbgoptunlv(mwjiuunceyciosq(), i5);
                    String lbgoptunlv2 = lbgoptunlv(dzbtzguzmxrcmmr(), i5);
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1991730049) {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1991730049 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1615501372 ^ i5)) {
                                break;
                            }
                        }
                        int i6 = 2000705312 ^ i5;
                        throw new IllegalAccessException("double");
                    }
                    int i7 = 603167397 ^ i5;
                    Sound valueOf = Sound.valueOf(fileConfiguration.getString(lbgoptunlv, lbgoptunlv2));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1764472488) {
                        i3 = 444062101 ^ i7;
                        hashMap.put(spawnerSounds, valueOf);
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1164609024) {
                            i4 = 1428306218 ^ i3;
                            HashMap<SpawnerSounds, Sound> hashMap2 = this.sounds;
                            SpawnerSounds spawnerSounds2 = SpawnerSounds.PAGE_SWITCH;
                            String lbgoptunlv3 = lbgoptunlv(dgzitnmjytmwwxm(), i4);
                            String lbgoptunlv4 = lbgoptunlv(hcoxslabcjiljfi(), i4);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 327463762) {
                                i7 = 436034085 ^ i4;
                                Sound valueOf2 = Sound.valueOf(fileConfiguration.getString(lbgoptunlv3, lbgoptunlv4));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -596745606) {
                                    int i8 = 282906106 ^ i7;
                                    hashMap2.put(spawnerSounds2, valueOf2);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) != 1518865834) {
                                        while (true) {
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 1518865834 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (62342244 ^ i8)) {
                                                break;
                                            }
                                        }
                                        int i9 = 408856423 ^ i8;
                                        throw new RuntimeException("double");
                                    }
                                    i3 = 1377127044 ^ i8;
                                    HashMap<SpawnerSounds, Sound> hashMap3 = this.sounds;
                                    SpawnerSounds spawnerSounds3 = SpawnerSounds.BUTTON_CLICK;
                                    String lbgoptunlv5 = lbgoptunlv(legwogtlmwxqnxl(), i3);
                                    String lbgoptunlv6 = lbgoptunlv(noevyqqkuxtefpv(), i3);
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -903718520) {
                                        i4 = 1758188779 ^ i3;
                                        Sound valueOf3 = Sound.valueOf(fileConfiguration.getString(lbgoptunlv5, lbgoptunlv6));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1937965357) {
                                            i3 = 1269309405 ^ i4;
                                            hashMap3.put(spawnerSounds3, valueOf3);
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -784596935) {
                                                i5 = 1148788776 ^ i3;
                                                HashMap<SpawnerSounds, Sound> hashMap4 = this.sounds;
                                                SpawnerSounds spawnerSounds4 = SpawnerSounds.INVENTORY_FULL;
                                                String lbgoptunlv7 = lbgoptunlv(qlwtwnqufyincpr(), i5);
                                                String lbgoptunlv8 = lbgoptunlv(nrccawxwjkbfoiz(), i5);
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -218824325) {
                                                    i5 = 1080071852 ^ i5;
                                                    Sound valueOf4 = Sound.valueOf(fileConfiguration.getString(lbgoptunlv7, lbgoptunlv8));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -235817959) {
                                                        i7 = 740267824 ^ i5;
                                                        hashMap4.put(spawnerSounds4, valueOf4);
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1861415528) {
                                                            i5 = 1255249918 ^ i7;
                                                            HashMap<SpawnerSounds, Sound> hashMap5 = this.sounds;
                                                            SpawnerSounds spawnerSounds5 = SpawnerSounds.LIMIT_REACHED;
                                                            String lbgoptunlv9 = lbgoptunlv(lwahbexmvgxdoyy(), i5);
                                                            String lbgoptunlv10 = lbgoptunlv(iemqbmgabnmvdpf(), i5);
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -947801494) {
                                                                i5 = 999519523 ^ i5;
                                                                Sound valueOf5 = Sound.valueOf(fileConfiguration.getString(lbgoptunlv9, lbgoptunlv10));
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 454695795) {
                                                                    i3 = 304950861 ^ i5;
                                                                    hashMap5.put(spawnerSounds5, valueOf5);
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1972147941) {
                                                                        i5 = 1910090589 ^ i3;
                                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 79574000) {
                                                                            int i10 = 901507561 ^ i5;
                                                                            try {
                                                                                if (jnbwyqufydqqceyf.njpwuppmebnxznmg(i10) == 117811480) {
                                                                                    throw new IllegalAccessException();
                                                                                }
                                                                                throw null;
                                                                            } catch (IllegalAccessException e) {
                                                                                switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e)) {
                                                                                    case -1598815790:
                                                                                        i3 = imlepcvduzrupxqp(i10, 478424989);
                                                                                        break;
                                                                                    case -1453228871:
                                                                                        i3 = 2109636656 ^ i10;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IOException("Error in hash");
                                                                                }
                                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1150647610) {
                                                                                    imlepcvduzrupxqp(i3, 361100840);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -218824325 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (484494968 ^ i5)) {
                                                        int i11 = 2097826816 ^ i5;
                                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -947801494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1944733459 ^ i5)) {
                                                            int i12 = 1958477653 ^ i5;
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 454695795 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1011370067 ^ i5)) {
                                                                int i13 = 1091991199 ^ i5;
                                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -235817959 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (67086355 ^ i5)) {
                                                                    int i14 = 1575688575 ^ i5;
                                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 79574000 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (170076824 ^ i5)) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                int i15 = 1230939637 ^ i5;
                                                throw new IllegalAccessException("double");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == 1764472488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (68169153 ^ i7)) {
                            int i16 = 1619156880 ^ i7;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1861415528 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1677950392 ^ i7)) {
                                int i17 = 1778014355 ^ i7;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -596745606 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (1964703604 ^ i7)) {
                                    int i18 = 74404807 ^ i7;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == -1598815790 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i7) == (768349356 ^ i7)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    int i19 = 2038631507 ^ i7;
                    throw new IllegalAccessException("double");
                } catch (IllegalArgumentException e2) {
                    switch (jnbwyqufydqqceyf.tvwdihyzqyfxvqab(e2)) {
                        case -1972147941:
                            i2 = 832059222 ^ i5;
                            break;
                        case -1937965357:
                            i2 = 827966895 ^ i5;
                            break;
                        case -1861415528:
                            i2 = 1391983558 ^ i5;
                            break;
                        case -1164609024:
                            i2 = 1468331317 ^ i5;
                            break;
                        case -947801494:
                            i2 = 405171256 ^ i5;
                            break;
                        case -903718520:
                            i2 = 1502744900 ^ i5;
                            break;
                        case -784596935:
                            i2 = 2062670450 ^ i5;
                            break;
                        case -596745606:
                            i2 = 458987066 ^ i5;
                            break;
                        case -235817959:
                            i2 = 2129161462 ^ i5;
                            break;
                        case -218824325:
                            i2 = imlepcvduzrupxqp(i5, 1049164378);
                            break;
                        case 327463762:
                            i2 = 44485663 ^ i5;
                            break;
                        case 454695795:
                            i2 = imlepcvduzrupxqp(i5, 599071003);
                            break;
                        case 1518865834:
                            i2 = 193420224 ^ i5;
                            break;
                        case 1764472488:
                            i2 = 1307782304 ^ i5;
                            break;
                        case 1991730049:
                            i2 = imlepcvduzrupxqp(i5, 1845540357);
                            break;
                        default:
                            throw new IllegalAccessException("Error in hash");
                    }
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 112382890) {
                        i3 = 389556931 ^ i2;
                        this.module.getLogger(583940502).warning("Invalid sound name in config: " + r0.getMessage());
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1082948174) {
                            int i20 = 184101177 ^ i3;
                            return;
                        }
                    } else {
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 112382890 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (763664338 ^ i2)) {
                                int i21 = 1732189526 ^ i2;
                                throw new IllegalAccessException("double");
                            }
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -276103879 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (195678817 ^ i4)) {
                    int i22 = 54540877 ^ i4;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1937965357 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (177218733 ^ i4)) {
                        int i23 = 1199725101 ^ i4;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 327463762 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1236746070 ^ i4)) {
                            break;
                        }
                    }
                }
            }
            int i24 = 319695477 ^ i4;
            throw new IllegalAccessException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1150647610 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1729819773 ^ i3)) {
                int i25 = 826231880 ^ i3;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1453228871 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (797598247 ^ i3)) {
                    int i26 = 1061043438 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1082948174 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (810737659 ^ i3)) {
                        int i27 = 2093776376 ^ i3;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -784596935 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1115454971 ^ i3)) {
                            int i28 = 1389727506 ^ i3;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -903718520 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (365235101 ^ i3)) {
                                int i29 = 452136634 ^ i3;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1164609024 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1394173161 ^ i3)) {
                                    int i30 = 498554812 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 782528848 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1707052666 ^ i3)) {
                                        int i31 = 366359737 ^ i3;
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1972147941 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (317886506 ^ i3)) {
                                            int i32 = 1453876546 ^ i3;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -390411142 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1715894393 ^ i3)) {
                                                int i33 = 1539057181 ^ i3;
                                                throw new IllegalAccessException();
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

    public void sendMessage(Player player, Messages messages, String[] strArr, int i) {
        int i2 = 365718481 ^ (2045297459 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 62114667) {
            int i3 = 875615236 ^ i2;
            String message = getMessage(messages, 2084640006);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1573557430) {
                i3 = 2141198366 ^ i3;
                if (message == null) {
                    imlepcvduzrupxqp(i3, 705593285);
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1597352889) {
                    int i4 = 1042381238 ^ i3;
                    if (message.isEmpty() != (365415617 ^ i4)) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1371642360) {
                            int i5 = 338626163 ^ i4;
                            return;
                        }
                        while (true) {
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1371642360 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1004333119 ^ i4)) {
                                break;
                            }
                        }
                        int i6 = 1341087023 ^ i4;
                        throw new IllegalAccessException("double");
                    }
                    i2 = 2082303044 ^ i4;
                    player.sendMessage(ChatFormater.color(PlaceHolderHelper.parsePlaceholders(message, strArr, 887737915)));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1322583083) {
                        int i7 = 930587762 ^ i2;
                        return;
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1573557430 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1468311756 ^ i3)) {
                    int i8 = 1962539181 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1597352889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1375596344 ^ i3)) {
                        break;
                    }
                }
            }
            int i9 = 203878997 ^ i3;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -177723462 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1839610911 ^ i2)) {
                int i10 = 1225908242 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1322583083 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1644328241 ^ i2)) {
                    int i11 = 1275237064 ^ i2;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 62114667 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (249093097 ^ i2)) {
                        int i12 = 1753240784 ^ i2;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 256267664 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (137692965 ^ i2)) {
                            break;
                        }
                    }
                }
            }
        }
        int i13 = 1745742030 ^ i2;
        throw new RuntimeException();
    }

    public void sendActionBar(org.bukkit.entity.Player r5, com.kammoun.donutCore.spawner.manager.SpawnerConfigManager.Messages r6, java.lang.String[] r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.spawner.manager.SpawnerConfigManager.sendActionBar(org.bukkit.entity.Player, com.kammoun.donutCore.spawner.manager.SpawnerConfigManager$Messages, java.lang.String[], int):void");
    }

    private String getMessage(Messages messages, int i) {
        int i2 = 868598701 ^ (721284389 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1420298184) {
            return this.messages.getOrDefault(messages, lbgoptunlv(cbtitpqxeeyzabo(), 1175706352 ^ i2));
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1420298184 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (371459881 ^ i2)) {
                int i3 = 1233184856 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1681313862 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1932794815 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 881914996 ^ i2;
        throw new IllegalAccessException();
    }

    public void playSound(Player player, SpawnerSounds spawnerSounds, int i) {
        int i2 = 1358056426 ^ (1741814647 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != -611645295) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -611645295 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1276531378 ^ i2)) {
                    break;
                }
            }
            int i3 = 1709098264 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1230593609 ^ i2;
        Sound sound = getSound(spawnerSounds, 278285784);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1857946917) {
            int i5 = 1595132987 ^ i4;
            if (sound == null) {
                imlepcvduzrupxqp(i5, 1569186468);
                return;
            }
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != 1776261889) {
                while (true) {
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1776261889 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1872245226 ^ i5)) {
                        break;
                    }
                }
                int i6 = 1289894921 ^ i5;
                throw new RuntimeException("double");
            }
            i4 = 510540865 ^ i5;
            player.playSound(player.getLocation(), sound, 1.0f, 1.0f);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1699841783) {
                int i7 = 1139400421 ^ i4;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1699841783 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1471504724 ^ i4)) {
                int i8 = 1073645047 ^ i4;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -1857946917 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (130553808 ^ i4)) {
                    break;
                }
            }
        }
        int i9 = 1651844665 ^ i4;
        throw new RuntimeException();
    }

    private Sound getSound(SpawnerSounds spawnerSounds, int i) {
        int i2 = 957677082 ^ (1592071406 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1561975771) {
            int i3 = 666973053 ^ i2;
            return this.sounds.get(spawnerSounds);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1662009394 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (662125500 ^ i2)) {
                int i4 = 1298659122 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1561975771 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (785115249 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1255508313 ^ i2;
        throw new IllegalAccessException();
    }

    public void reload(int i) {
        int i2 = 712582943 ^ (1926569972 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1476965598) {
            i2 = 1081999195 ^ i2;
            loadConfig(1028228880);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1541885448) {
                int i3 = 1674918796 ^ i2;
                return;
            }
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1541885448 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (37388797 ^ i2)) {
                int i4 = 1370265487 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1476965598 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1397207154 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1340827492 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public HashMap<Messages, String> getMessages() {
        int i = 910543163 ^ (1993409791 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1714479706) {
            int i2 = 87730428 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1340450234 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1290152883 ^ i)) {
                int i3 = 1260683717 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1714479706 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (49400815 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1610640290 ^ i;
        throw new IOException();
    }

    @Generated
    public HashMap<SpawnerSounds, Sound> getSounds() {
        int i = 1920495798 ^ (1312513729 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2138046527) {
            int i2 = 758409994 ^ i;
            return this.sounds;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2138046527 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (222833179 ^ i)) {
                int i3 = 16407530 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -382949488 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2077799210 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1222592510 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public DonutModule getModule() {
        int i = 746829395 ^ (1576801122 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -378821133) {
            int i2 = 188419239 ^ i;
            return this.module;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1330396981 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1758914714 ^ i)) {
                int i3 = 763264993 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -378821133 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (105729001 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1324088053 ^ i;
        throw new RuntimeException();
    }

    @Generated
    public int getMaxSpawnersPerStack(int i) {
        int i2 = 1482639467 ^ (1210092025 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -513244952) {
            int i3 = 279574535 ^ i2;
            return this.maxSpawnersPerStack;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -513244952 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (493998550 ^ i2)) {
                int i4 = 1325192362 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1680294096 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (445578195 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1448157791 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getActivationDistance(int i) {
        int i2 = 1307475911 ^ (1079590410 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 254575120) {
            int i3 = 675147649 ^ i2;
            return this.activationDistance;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 254575120 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1249835033 ^ i2)) {
                int i4 = 1649120627 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1321467417 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1179224152 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2061575264 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isSpawnerPlaceParticles(int i) {
        int i2 = 220316982 ^ (2116638497 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -86893373) {
            int i3 = 1284384516 ^ i2;
            return this.spawnerPlaceParticles;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -86893373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2143368379 ^ i2)) {
                int i4 = 1065559588 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1633475359 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (196870929 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 210628435 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isCanSpawnerBlowUp(int i) {
        int i2 = 292269581 ^ (1196184585 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -743875494) {
            int i3 = 837268976 ^ i2;
            return this.canSpawnerBlowUp;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1553265627 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (43573580 ^ i2)) {
                int i4 = 2021542911 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -743875494 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1339663969 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1345643372 ^ i2;
        throw new IOException();
    }

    @Generated
    public boolean isUseDonutSell(int i) {
        int i2 = 716175982 ^ (2024924142 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -228179846) {
            int i3 = 222330934 ^ i2;
            return this.useDonutSell;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1738391094 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1777686897 ^ i2)) {
                int i4 = 1644457664 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -228179846 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (588815200 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1073312380 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isUseHolograms(int i) {
        int i2 = 317459381 ^ (1265218457 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1363456742) {
            int i3 = 401281387 ^ i2;
            return this.useHolograms;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 300140098 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (364533594 ^ i2)) {
                int i4 = 898415073 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1363456742 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (308993694 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 502790800 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public int getHologramDistance(int i) {
        int i2 = 119640252 ^ (815832011 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -560015423) {
            int i3 = 65125047 ^ i2;
            return this.hologramDistance;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -560015423 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1230638476 ^ i2)) {
                int i4 = 757661524 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1047330183 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1346348811 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1623638096 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isSilktouchNeeded(int i) {
        int i2 = 1827230497 ^ (359040043 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1360514005) {
            int i3 = 1359260713 ^ i2;
            return this.silktouchNeeded;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1360514005 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1679389307 ^ i2)) {
                int i4 = 873422619 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 650990945 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1053953959 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1804315401 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isUseSilktouchPermissions(int i) {
        int i2 = 1213711653 ^ (856467375 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1202874325) {
            int i3 = 1437031232 ^ i2;
            return this.useSilktouchPermissions;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1202874325 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1778744650 ^ i2)) {
                int i4 = 545038009 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 360137257 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (792015383 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 876253731 ^ i2;
        throw new IllegalAccessException();
    }

    @Generated
    public boolean isOwnershipEnabled(int i) {
        int i2 = 1664704800 ^ (1902864398 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -267991800) {
            int i3 = 679247368 ^ i2;
            return this.ownershipEnabled;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -267991800 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (2132980037 ^ i2)) {
                int i4 = 585952237 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1276824247 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1050436725 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 2091706533 ^ i2;
        throw new RuntimeException();
    }

    @Generated
    public boolean isConvertNaturalSpawners(int i) {
        int i2 = 1860594768 ^ (1027273250 ^ 206754191);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -59605014) {
            int i3 = 132739008 ^ i2;
            return this.convertNaturalSpawners;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -59605014 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (1850821776 ^ i2)) {
                int i4 = 1161319976 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1019674134 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (668515305 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1501783385 ^ i2;
        throw new RuntimeException();
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
        ssunwmagcv = hzpaofzmdukjtoc();
        QVfnm7ck2h = (-1283787177) ^ new Random(-4544776792483701041L).nextInt();
    }

    public static String lbgoptunlv(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bArr.length) {
                return new String(bArr, StandardCharsets.UTF_16);
            }
            bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
            bArr[i3] = (byte) (bArr[i3] ^ ssunwmagcv[i3 % ssunwmagcv.length]);
            i2 = i3 + 1;
        }
    }

    private static byte[] hzpaofzmdukjtoc() {
        return new byte[]{11, 111, 63, 119, 4, 71, 123, 46, 112, 116, 11, 94, 70, 94, 114, 77, 97, 54, 43, 116, 12, 99, 115, 81, 111, 86, 102, 12, 27, 126, 14, 9, 75, 3, 125, 101, 38, 16, 105, 63, 113, 113, 36, 20, 11, 75, 19, 51, 2, 5, 106, 66, 73, 99, 59, 96, 57, 125, 21, 90, 115, 43, 37, 93, 72, 117, 100, 85, 1, 88, 16, 109, 126, 77, 35, 36, 107, 78, 90, 126, 75, 63, 108, 85, 20, 45, 17, 76, 92, 51, 80, 67, 74, 12, 64, 126, 63, 61, 121, 26, 60, 75, 15, 7, 59, 11, 64, 1, 112, 41, 113, 108, 81};
    }

    private static byte[] vobcovvisgbhzeu() {
        return new byte[]{-60, -93, 9, 55, 48, 13, 67, 114, 72, 110, 58, 30, 112, 2, 70, 24, 89, 100, 19, 55, 61, 63, 69, 17, 91, 12, 94, 93, 35, 100, 63, 74, 125, 83, 73, 46, 30, 68, 81, 97, 64, 49, 18, 82, 63, 27, 43, 101, 58, 92, 91, 2};
    }

    private static byte[] gekuxaknyaykazd() {
        return new byte[]{-57, -93, 10, 50, 49, 30, 72, 123, 66, 44, 62, 28, 115, 1, 65, 1, 83, 102, 30, 42, 57, 126, 64, 6, 93, 0, 83, 95, 46, 42, 61, 85, 121, 84};
    }

    private static byte[] nphplwsqysiroog() {
        return new byte[]{-63, -96, 15, 38, 49, 23, 73, 115, 64, 109, 59, 29, 116, 27, 67, 30, 82, 113, 31, 42, 60, 52, 70, 18, 93, 72, 86, 90, 43, 34, 60, 83, 122, 70, 78, 120, 18, 85, 89, 125};
    }

    private static byte[] unffisugzvjkezb() {
        return new byte[]{-60, -93, 15, 36, 51, 27, 78, 115, 70, 52, 58, 8, 118, 28, 69, 10, 84, 40, 29, 44, 61, 49, 67, 21, 88, 16, 83, 77, 45, 41, 63, 86, 123, 30, 74, 37, 19, 83, 95, 104, 64, 53, 20, 74, 60, 29, 38, 114, 52, 64};
    }

    private static byte[] aovaeljtxfnmilv() {
        return new byte[]{-51, -95, 8, 41, 50, 19, 78, 111, 67, 97, 58, 26, 117, 24, 71, 25, 88, 114, 19, 43, 59, 53, 69, 22, 90, 28, 85, 25, 42, 57, 61, 90, 126, 68, 68, 123, 30, 82, 94, 120, 71, 37, 17, 78, 56, 24};
    }

    private static byte[] lftumoyzydshlho() {
        return new byte[]{-64, -95, 11, 43, 61, 30, 79, 122, 72, 46, 58, 13, 114, 21, 68, 24, 89, 99, 30, 104, 56, 51, 74, 14, 91, 29, 94, 77, 42, 43, 58, 94, 125, 84, 69, 56};
    }

    private static byte[] bnsbtikrahroqiq() {
        return new byte[]{-63, -96, 14, 53, 53, 2, 75, 125, 70, 109, 59, 11, 113, 0, 68, 19, 87, 117, 31, 48, 61, 39, 66, 2, 95, 12, 80, 84};
    }

    private static byte[] fkmqisscsgpxsnx() {
        return new byte[]{-57, -89, 12, 39, 52, 28, 76, 108, 64, 47, 60, 27, 119, 15, 74, 14, 87, 111, 25, 44, 63, 60, 67, 68, 88, 4, 86, 87, 44, 62, 63, 77, 115, 85, 75, 59, 20, 68, 90, 107};
    }

    private static byte[] ocauzdobkdupiqt() {
        return new byte[]{-57, -96, 10, 54, 54, 4, 72, 119, 69, 50, 57, 0, 115, 9, 64, 12, 82, 35, 30, 53, 62, 63, 70, 2, 93, 6, 85, 81, 46, 98, 60, 73, 126, 80, 79, 36, 21, 92, 92, 103, 67, 34, 17, 74, 57, 29, 32, 120};
    }

    private static byte[] dxjrtjcqzmbcixe() {
        return new byte[]{-60, -88, 8, 52, 61, 5, 67, 115, 65, 104, 58, 14, 113, 7, 75, 16, 89, 97, 26, 34, 61, 41, 68, 6, 86, 10, 94, 71};
    }

    private static byte[] jrgbdffvvtaflwf() {
        return new byte[]{-60, -87, 6, 47, 52, 2, 76, 114, 68, 32, 58, 21, Byte.MAX_VALUE, 26, 66, 23, 86, 109, 31, 53, 61, 119, 74, 3, 95, 10, 81, 95, 47, 45, 63, 92, 114, 81, 77, 51};
    }

    private static byte[] keatisyhwpwkxxg() {
        return new byte[]{-60, -87, 12, 44, 54, 18, 78, 105, 73, 54, 58, 6, 117, 15, 64, 24, 84, 113, 18, 107, 61, 41, 64, 2, 93, 10, 83, 84, 34, 98, 63, 81, 120, 86, 79, 33, 19, 77, 80, 97, 64, 38, 23, 64, 57, 26, 38, 117};
    }

    private static byte[] dsnqdlwmyxdbzpc() {
        return new byte[]{-60, -87, 12, 103, 54, 84, 78, 41, 73, 125, 58, 1, 117, 94, 64, 76, 84, 52, 18, 110, 61, 126, 64, 66, 93, 7, 83, 85, 34, 32, 63, 69, 120, 91, 79, 33, 19, 1};
    }

    private static byte[] aenmauqlngsxznn() {
        return new byte[]{-60, -90, 9, 46, 52, 19, 73, 104, 66, 51, 58, 9, 112, 13, 66, 25, 83, 112, 25, 110, 61, 60, 69, 11, 95, 17, 84, 92, 41, 36, 63, 75, 125, 88, 77, 38, 20, 92, 91, 38, 64, 33, 18, 85, 59, 22, 33, 106};
    }

    private static byte[] xuhwvinpaqhhxnu() {
        return new byte[]{-60, -90, 9, 101, 52, 21, 73, 66, 66, 47, 58, 29, 112, 24, 66, 92, 83, 106, 25, 46, 61, 35, 69, 0, 95, 9, 84, 77, 41, 37, 63, 77, 125, 78, 77, 116, 20, 76, 91, 120, 64, 103, 18, 70, 59, 15, 33, 106, 48, 93, 91, 85};
    }

    private static byte[] siehjrrgzipdmwr() {
        return new byte[]{-60, -96, 11, 43, 49, 26, 73, 107, 70, 62, 58, 15, 114, 8, 71, 16, 83, 115, 29, 99, 61, 61, 71, 15, 90, 26, 84, 23, 45, 40, 63, 78, Byte.MAX_VALUE, 92, 72, 56, 20, 84};
    }

    private static byte[] srbuvzqvlsdffgo() {
        return new byte[]{-60, -96, 11, 96, 49, 28, 73, 65, 70, 34, 58, 27, 114, 79, 71, 17, 83, 111, 29, 109, 61, 61, 71, 15, 90, 26, 84, 26, 45, 40, 63, 78, Byte.MAX_VALUE, 92, 72, 125, 20, 82, 95, 110, 64, 40, 16, 86, 62, 83, 33, 118, 52, 76, 91, 19, 125, 37, 14, 54, 11, 46, 35, 17, 66, 58};
    }

    private static byte[] bxoikniwtitvqaw() {
        return new byte[]{-60, -87, 14, 40, 61, 26, 73, 111, 66, 51, 58, 6, 119, 11, 75, 16, 83, 119, 25, 110, 61, 59, 66, 7, 86, 10, 84, 19, 41, 57, 63, 64, 122, 80, 68, 42, 20, 76, 91, 110, 64, 58, 21, 11, 50, 18, 33, 98, 48, 69, 91, 18, 120, 62, 2, 54, 11, 45, 39, 15, 66, 96};
    }

    private static byte[] bsafddfzkkwjfgb() {
        return new byte[]{-60, -87, 14, 99, 61, 92, 73, 121, 66, 37, 58, 84, 119, 88, 75, 69, 83, 102, 25, 25, 61, 53, 66, 22, 86, 78, 84, 84, 41, 63, 63, 67, 122, 69, 68, 125, 20, 67, 91, 111, 64, 44, 21, 67, 50, 23, 33, 33, 48, 80, 91, 21, 120, 62, 2, 44, 11, 39, 39, 11, 66, 96, 20, 79, 113, 62, 86, 23, 51, 13, 33, 35, 79, 17, 26, 121, 89, 14, 104, 107, 122, 38, 93, 51, 45, 125, 35, 27, 110, 117, 97, 31, 123, 30, 121, 39, 13, 125, 75, 75, 13, 82, 62, 91, 2, 92, 114, 68, 66, 61, 64, 112, 96, 77, 86, 104, 69, 66, 117, 46, 31, 37, 69, 28, 103, 94, 108, 51, Byte.MAX_VALUE, 37, 7, 115, 69, 73, 90, 37, 99, 56, 100, 32, 61, 81, 79, 28, 48, 26, 49, 33, 87, 50, 33, 36, 14, 43, 72, 121, 38, 25, 121, 84, 2, 79, 52, 57, 123, 18, 81, 98, 82, 35};
    }

    private static byte[] cfhsoshrpemviot() {
        return new byte[]{-60, -91, 11, 41, 49, 18, 78, 109, 66, 52, 58, 10, 114, 10, 71, 24, 84, 117, 25, 105, 61, 37, 71, 22, 90, 9, 83, 78, 41, 44, 63, 91, Byte.MAX_VALUE, 85, 72, 120, 19, 73, 91, 98, 64, 105, 16, 82, 62, 8, 38, 102};
    }

    private static byte[] kneklleoqfzslry() {
        return new byte[]{-60, -91, 11, 98, 49, 20, 78, 77, 66, 40, 58, 6, 114, 8, 71, 18, 84, 104, 25, 34, 61, 118, 71, 11, 90, 21, 83, 28, 41, 44, 63, 80, Byte.MAX_VALUE, 66, 72, 48, 19, 65, 91, 104, 64, 61, 16, 7, 62, 14, 38, 112, 48, 95, 91, 25, 125, 55, 14, 112, 12, 57, 39, 1, 66, 119, 17, 29, 125, 101, 81, 22, 51, 27, 33, 57, 74, 9, 22, 122, 94, 27, 104, 63, 122, 45, 88, 21, 33, 61, 36, 15, 110, 116, 97, 25, 126, 77, 117, 47, 10, 106, 75, 76, 13, 80};
    }

    private static byte[] vmkoiwazmaatetc() {
        return new byte[]{-60, -94, 11, 40, 53, 27, 72, 104, 67, 54, 57, 11, 116, 8, 75, 27, 84, 118, 26, 104, 56, 34, 66, 28, 92, 2, 85, 94, 41, 33, 60, 21, 114, 92, 72, 63, 23, 79, 93, 100, 64, 60};
    }

    private static byte[] syhejcundkumlvd() {
        return new byte[]{-60, -94, 11, 99, 53, 29, 72, 79, 67, 45, 57, 3, 116, 28, 75, 94, 84, 118, 26, 54, 56, 48, 66, 31, 92, 13, 85, 88, 41, 56, 60, 24, 114, 67, 72, 34, 23, 67, 93, 110, 64, 35, 23, 1, 56, 19, 33, 116, 48, 20, 83, 16, 124, 36, 10, 114, 13, 59, 36, 11, 64, 123, 22, 76, 122, 45, 86, 13, 56, 6, 37, 55, 79, 11, 23, 54, 90, 95, 105, 109, 120, 104, 94, 68, 38, 113, 40, 30, 105, 120, 97, 84, 126, 24, 113, 36, 12, 33, 74, 5};
    }

    private static byte[] avhdkzfcjoscmug() {
        return new byte[]{-62, -88, 13, 44, 49, 23, 67, 105, 66, 48, 51, 13, 112, 12, 71, 16, 85, 119, 28, 98, 62, 45, 70, 20, 87, 79, 84, 90, 35, 47, 56, 72, 126, 82, 73, 56, 17, 70, 91, 107, 68, 37, 28, 82};
    }

    private static byte[] sgybdgyegllnyrv() {
        return new byte[]{-62, -88, 13, 103, 49, 81, 67, 34, 66, 115, 51, 9, 112, 14, 71, 69, 85, 102, 28, 103, 62, 112, 70, 28, 87, 18, 84, 30, 35, 108, 56, 100, 126, 107};
    }

    private static byte[] oibazvmalibrpbw() {
        return new byte[]{-60, -91, 11, 34, 54, 17, 74, 107, 69, 53, 58, 10, 114, 1, 64, 27, 80, 115, 30, 104, 61, 53, 71, 27, 93, 0, 87, 91, 46, 56, 63, 85, Byte.MAX_VALUE, 77, 79, 51, 23, 11, 92, 110, 64, 43, 16, 66, 57, 30, 34, 108, 55, 69, 91, 26};
    }

    private static byte[] lngxftnmtwkrhvu() {
        return new byte[]{-60, -91, 11, 105, 54, 17, 74, 92, 69, 35, 58, 24, 114, 18, 64, 12, 80, 111, 30, 63, 61, 118, 71, 29, 93, 13, 87, 95, 46, 108, 63, 79, Byte.MAX_VALUE, 75, 79, 55, 23, 81, 92, 99, 64, 33, 16, 94, 57, 88, 34, 100, 55, 80, 91, 22, 125, 50, 9, 61, 8, 107, 32, 28, 66, 113, 17, 69, 122, 37, 85, 12, 52, 4, 33, 62, 74, 28, 17, 101, 90, 21, 111, 108, 122, 126, 88, 5, 38, 119, 32, 9, 105, 33, 97, 1, 126, 85, 114, 62, 14, 43, 76, 70, 13, 17, 59, 75, 9, 24, 113, 86, 69, 59, 64, 52, 101, 90, 93, Byte.MAX_VALUE, 70, 70, 114, 40, 31, 46, 64, 86, 108, 84};
    }

    private static byte[] lkcndpynlnbivyy() {
        return new byte[]{-60, -93, 7, 47, 49, 22, 77, 110, 66, 53, 58, 12, 126, 12, 71, 28, 87, 118, 25, 104, 61, 35, 75, 1, 90, 14, 80, 83, 41, 97, 63, 89, 115, 94, 72, 48, 16, 87};
    }

    private static byte[] kgepgzlhnavzzis() {
        return new byte[]{-60, -93, 7, 100, 49, 80, 77, 46, 66, 126, 58, 11, 126, 93, 71, 72, 87, 51, 25, 109, 61, 116, 75, 65, 90, 3, 80, 82, 41, 35, 63, 79, 115, 88, 72, 37, 16, 6};
    }

    private static byte[] npccijobcxdidgc() {
        return new byte[]{-64, -94, 7, 40, 60, 26, 67, 108, 68, 50, 57, 7, 116, 1, 74, 16, 80, 113, 30, 104, 52, 34, 75, 29, 87, 6, 82, 90, 41, 45, 60, 28, 115, 87, 76, 56, 19, 79, 81, 100, 73, 61, 28, 8, 63, 14, 33, 106, 48, 79, 82, 14, 120, 62, 14, 51, 1, 35};
    }

    private static byte[] lnrjgdnnxqfgdia() {
        return new byte[]{-64, -94, 7, 99, 60, 26, 67, 80, 68, 47, 57, 10, 116, 31, 74, 85, 80, 36, 30, 32, 52, 116, 75, 8, 87, 3, 82, 93, 41, 35, 60, 85, 115, 30, 76, 119, 19, 71, 81, 45, 73, 42, 28, 74, 63, 11, 33, 103, 48, 89, 82, 90, 120, 53, 14, 55, 1, 111, 45, 3, 75, 126, 17, 12, 122, 40, 86, 9, 57, 64, 33, 113, 75, 19, 27, Byte.MAX_VALUE, 83, 27, 98, 38, Byte.MAX_VALUE, 126, 94, 77, 38, 51, 41, 18, 109, 34, 101, 28, 114, 95, 120, 62, 7, 41, 77, 9, 14, 22, 61, 22, 3, 29};
    }

    private static byte[] bewarldygqrtxdl() {
        return new byte[]{-62, -91, 8, 45, 49, 20, 76, 100, 65, 48, 62, 8, 113, 12, 68, 31, 88, 116, 28, 111, 59, 58, 70, 8, 88, 66, 87, 72, 46, 32, 57, 80, 125, 95};
    }

    private static byte[] yjvpwhvmseeqcxk() {
        return new byte[]{-62, -91, 8, 102, 49, 18, 76, 78, 65, 44, 62, 28, 113, 75, 68, 25, 88, 102, 28, 47, 59, 58, 70, 8, 88, 27, 87, 27, 46, 43, 57, 78, 125, 81, 68, 53, 17, 78, 94, 40, 68, 51, 19, 69, 58, 21, 38, 119, 53, 16, 92, 6, 112, 34, 12, 52, 14, 61, 32, 2, 68, 119, 20, 24, 125, 98, 83, 23, 55, 6, 41, 40, 73, 16, 20, 124, 94, 13, 109, 51, 122, 40, 89, 17, 35, 113, 39, 23, 101, 105, 103, 2, 125, 84, 117, 61, 8, 103, 72, 69, 9, 93};
    }

    private static byte[] legwogtlmwxqnxl() {
        return new byte[]{-63, -94, 12, 61, 52, 30, 75, 98, 71, 46, 57, 9, Byte.MAX_VALUE, 29, 68, 83, 88, 99, 31, 51, 63, 46, 67, 19, 95, 0, 81, 86, 41, 96, 55, 90, 125, 95, 68, 59, 18, 65, 90, 109};
    }

    private static byte[] noevyqqkuxtefpv() {
        return new byte[]{-63, -94, 12, 27, 52, 56, 75, 72, 71, 2, 57, 56, Byte.MAX_VALUE, 58, 68, 41, 88, 78, 31, 8, 63, 5, 67, 36, 95, 35, 81, 113, 41, 14, 55, 114};
    }

    private static byte[] dgzitnmjytmwwxm() {
        return new byte[]{-60, -95, 14, 48, 50, 31, 79, 108, 73, 46, 58, 11, 119, 25, 68, 84, 85, 113, 18, 33, 61, 53, 66, 0, 89, 76, 82, 72, 34, 61, 63, 81, 122, 67, 75, 49, 18, 79};
    }

    private static byte[] hcoxslabcjiljfi() {
        return new byte[]{-60, -95, 14, 10, 50, 36, 79, 92, 73, 13, 58, 48, 119, 40, 68, 53, 85, 78, 18, 11, 61, 13, 66, 53, 89, 32, 82, 124, 34, 15, 63, 103, 122, 99, 75, 7, 18, 117, 80, 69};
    }

    private static byte[] lwahbexmvgxdoyy() {
        return new byte[]{-60, -92, 6, 54, 53, 27, 76, 110, 68, 35, 58, 14, Byte.MAX_VALUE, 31, 67, 80, 86, 111, 31, 36, 61, 58, 74, 10, 94, 17, 81, 20, 47, 53, 63, 88, 114, 80, 76, 53, 17, 77, 93, 99, 64, 33};
    }

    private static byte[] iemqbmgabnmvdpf() {
        return new byte[]{-60, -92, 6, 0, 53, 58, 76, 79, 68, 4, 58, 62, Byte.MAX_VALUE, 53, 67, 33, 86, 85, 31, 4, 61, 27, 74, 47, 94, 36, 81, 126, 47, 2, 63, 111, 114, 110, 76, 24, 17, 106};
    }

    private static byte[] mwjiuunceyciosq() {
        return new byte[]{-62, -88, 10, 60, 55, 31, 74, 109, 72, 45, 51, 15, 126, 30, 69, 82, 87, 125, 28, 37, 57, 55, 64, 13, 94, 20, 94, 84, 35, 62, 54, 89, 124, 90, 75, 112, 17, 70, 92, 98, 66, 35, 21, 70, 51, 25, 43, 98};
    }

    private static byte[] dzbtzguzmxrcmmr() {
        return new byte[]{-62, -88, 10, 10, 55, 62, 74, 76, 72, 10, 51, 63, 126, 52, 69, 35, 87, 88, 28, 5, 57, 23, 64, 42, 94, 33, 94, 124, 35, 14, 54, 104, 124, 109, 75, 19, 17, 103};
    }

    private static byte[] qlwtwnqufyincpr() {
        return new byte[]{-57, -95, 13, 52, 53, 27, 75, 109, 64, 45, 57, 11, 116, 29, 67, 80, 81, 105, 27, 45, 62, 36, 65, 4, 94, 11, 86, 78, 43, 38, 60, 74, 121, 74, 76, 123, 22, 64, 89, 125, 67, 44, 22, 72};
    }

    private static byte[] nrccawxwjkbfoiz() {
        return new byte[]{-57, -95, 13, 2, 53, 58, 75, 76, 64, 10, 57, 59, 116, 55, 67, 33, 81, 86, 27, 10, 62, 30, 65, 45, 94, 36, 86, 125, 43, 12, 60, 106, 121, 108, 76, 24, 22, 105};
    }

    private static byte[] cbtitpqxeeyzabo() {
        return new byte[0];
    }

    private static int imlepcvduzrupxqp(int i, int i2) {
        return i2 ^ i;
    }
}
