package com.kammoun.donutCore.home.managers;

import com.kammoun.donutCore.api.utils.PlaceHolderHelper;
import com.kammoun.donutCore.api.utils.chat.ChatFormater;
import com.kammoun.donutCore.home.HomePlugin;
import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import lombok.Generated;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessagesManager {
    private final HomePlugin plugin;
    private final Map<String, String> messages;
    private static int MHca3atf9p = 0;
    private transient int vVERgiFr6h = 1231478933;
    private static String ewmkvfxlcy;
    private static String[] nothing_to_see_here = new String[15];

    public static final class MessageKey {
        public static final MessageKey MOVE_CANCEL_TELEPORT;
        public static final MessageKey TELEPORT_SUCCESS;
        public static final MessageKey TELEPORTING;
        public static final MessageKey HOME_REACHED_LIMIT;
        public static final MessageKey SET_HOME_BLOCK_REGION;
        public static final MessageKey HOME_SET;
        public static final MessageKey HOME_NOT_EXIST;
        public static final MessageKey HOME_DELETED;
        public static final MessageKey HOME_NOT_FOUND;
        public static final MessageKey HOME_CONFIRM;
        public static final MessageKey HOME_RENAME;
        public static final MessageKey TELEPORT_NO_PERMISSION;
        private final String key;
        private static final MessageKey[] $VALUES;
        private static byte[] vtkwhanjje;

        public static MessageKey[] values() {
            int i = 1938254554 ^ (1534127988 ^ (445369648 ^ 1342384710));
            return (MessageKey[]) $VALUES.clone();
        }

        public static MessageKey valueOf(String str) {
            int i = 179684425 ^ (815866248 ^ 1342384710);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1354660923) {
                int i2 = 1936638925 ^ i;
                return (MessageKey) Enum.valueOf(MessageKey.class, str);
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1354660923 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2135217463 ^ i)) {
                    int i3 = 1069871945 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -876060080 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (837942093 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1503301619 ^ i;
            throw new RuntimeException();
        }

        private MessageKey(java.lang.String r5, int r6, java.lang.String r7) {
            throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.MessagesManager.MessageKey.<init>(java.lang.String, int, java.lang.String):void");
        }

        public String getKey() {
            int i = 293160845 ^ (518762141 ^ 29581359);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1921796600) {
                int i2 = 480613101 ^ i;
                return this.key;
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1751064944 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1386019480 ^ i)) {
                    int i3 = 1145567272 ^ i;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1921796600 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1203163700 ^ i)) {
                        break;
                    }
                }
            }
            int i4 = 1124249206 ^ i;
            throw new IOException();
        }

        private static MessageKey[] $values() {
            int i = 1820264502 ^ (1874533350 ^ (517082770 ^ 1342384710));
            MessageKey[] messageKeyArr = new MessageKey[(byte) (1293235976 ^ i)];
            messageKeyArr[(byte) (1293235972 ^ i)] = MOVE_CANCEL_TELEPORT;
            messageKeyArr[(byte) (1293235973 ^ i)] = TELEPORT_SUCCESS;
            messageKeyArr[(byte) (1293235974 ^ i)] = TELEPORTING;
            messageKeyArr[(byte) (1293235975 ^ i)] = HOME_REACHED_LIMIT;
            messageKeyArr[(byte) (1293235968 ^ i)] = SET_HOME_BLOCK_REGION;
            messageKeyArr[(byte) (1293235969 ^ i)] = HOME_SET;
            messageKeyArr[(byte) (1293235970 ^ i)] = HOME_NOT_EXIST;
            messageKeyArr[(byte) (1293235971 ^ i)] = HOME_DELETED;
            messageKeyArr[(byte) (1293235980 ^ i)] = HOME_NOT_FOUND;
            messageKeyArr[(byte) (1293235981 ^ i)] = HOME_CONFIRM;
            messageKeyArr[(byte) (1293235982 ^ i)] = HOME_RENAME;
            messageKeyArr[(byte) (1293235983 ^ i)] = TELEPORT_NO_PERMISSION;
            return messageKeyArr;
        }

        static {
            int parseInt = 268518219 ^ (2044576645 ^ Integer.parseInt("1731574802"));
            vtkwhanjje = zmsflumtaeeqlhz();
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 2001331936) {
                parseInt = 1335974129 ^ parseInt;
                MOVE_CANCEL_TELEPORT = new MessageKey(fdknfzlhlf(bmidklhprffyana(), parseInt), (byte) (1095263277 ^ parseInt), fdknfzlhlf(hsgyomuwdpifzlg(), parseInt));
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 172171626) {
                    parseInt = 864420406 ^ parseInt;
                    TELEPORT_SUCCESS = new MessageKey(fdknfzlhlf(mglsjzywrxcwsyz(), parseInt), (byte) (1926129178 ^ parseInt), fdknfzlhlf(qhhptloovacmaja(), parseInt));
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1770835749) {
                        int i = 691880689 ^ parseInt;
                        TELEPORTING = new MessageKey(fdknfzlhlf(uthdysrhyizcgnk(), i), (byte) (1542661352 ^ i), fdknfzlhlf(nlczmomgtnylkeb(), i));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) != -543611054) {
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -543611054 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2072784752 ^ i)) {
                                    break;
                                }
                            }
                            int i2 = 169162673 ^ i;
                            throw new IOException("double");
                        }
                        parseInt = 30640611 ^ i;
                        HOME_REACHED_LIMIT = new MessageKey(fdknfzlhlf(bwfobtdijkdmzuk(), parseInt), (byte) (1512090890 ^ parseInt), fdknfzlhlf(ecxegqtodptarkm(), parseInt));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -788174774) {
                            int i3 = 1913882304 ^ parseInt;
                            SET_HOME_BLOCK_REGION = new MessageKey(fdknfzlhlf(cnqejphnkqcxxox(), i3), (byte) (674442189 ^ i3), fdknfzlhlf(qogneyrokuoonzr(), i3));
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1100570185) {
                                i3 = 455553307 ^ i3;
                                HOME_SET = new MessageKey(fdknfzlhlf(bdnapnqnixegnco(), i3), (byte) (856955607 ^ i3), fdknfzlhlf(wvhfhlaguwbsabn(), i3));
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1734289775) {
                                    int i4 = 1888862601 ^ i3;
                                    HOME_NOT_EXIST = new MessageKey(fdknfzlhlf(ettmcbgvusgdxpy(), i4), (byte) (1132583773 ^ i4), fdknfzlhlf(pslupljkjqcxwwk(), i4));
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 470735578) {
                                        i4 = 18073322 ^ i4;
                                        HOME_DELETED = new MessageKey(fdknfzlhlf(qxdjrrwljijeoxt(), i4), (byte) (1116872118 ^ i4), fdknfzlhlf(xayxfjzqtyyxvnv(), i4));
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 345042314) {
                                            parseInt = 1868601817 ^ i4;
                                            HOME_NOT_FOUND = new MessageKey(fdknfzlhlf(glkhwekpxnlxfsa(), parseInt), (byte) (770868320 ^ parseInt), fdknfzlhlf(fjbfxwjmyreyfkr(), parseInt));
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1871979329) {
                                                parseInt = 1898045067 ^ parseInt;
                                                HOME_CONFIRM = new MessageKey(fdknfzlhlf(jivodcizjrztmcs(), parseInt), (byte) (1557355242 ^ parseInt), fdknfzlhlf(gywnmoudleirsng(), parseInt));
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -426060006) {
                                                    int i5 = 1614043756 ^ parseInt;
                                                    HOME_RENAME = new MessageKey(fdknfzlhlf(alijbqncrcfefuk(), i5), (byte) (1021771909 ^ i5), fdknfzlhlf(jhjnkzodzqvfzja(), i5));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) != -415759239) {
                                                        while (true) {
                                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -415759239 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (504871744 ^ i5)) {
                                                                break;
                                                            }
                                                        }
                                                        int i6 = 990653938 ^ i5;
                                                        throw new RuntimeException("double");
                                                    }
                                                    i4 = 750213378 ^ i5;
                                                    TELEPORT_NO_PERMISSION = new MessageKey(fdknfzlhlf(pjtgfrrnzdenjtq(), i4), (byte) (273701254 ^ i4), fdknfzlhlf(yvqmksugwygiazl(), i4));
                                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2105357208) {
                                                        int i7 = 1961393222 ^ i4;
                                                        $VALUES = $values();
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    while (true) {
                                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 470735578 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (546145027 ^ i4)) {
                                            int i8 = 587661213 ^ i4;
                                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == -2105357208 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1625131844 ^ i4)) {
                                                int i9 = 1375442907 ^ i4;
                                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 345042314 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (257707944 ^ i4)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    int i10 = 1734711517 ^ i4;
                                    throw new IOException("double");
                                }
                            }
                            while (true) {
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == 1100570185 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (1841749627 ^ i3)) {
                                    int i11 = 1478217471 ^ i3;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1734289775 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (642345604 ^ i3)) {
                                        break;
                                    }
                                }
                            }
                            int i12 = 2058633511 ^ i3;
                            throw new IOException("double");
                        }
                    }
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 1871979329 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (924319601 ^ parseInt)) {
                    int i13 = 2004387125 ^ parseInt;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -426060006 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1726486417 ^ parseInt)) {
                        int i14 = 1997074197 ^ parseInt;
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -1770835749 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (694818458 ^ parseInt)) {
                            int i15 = 1777445229 ^ parseInt;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 2001331936 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (725378159 ^ parseInt)) {
                                int i16 = 572737216 ^ parseInt;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == -788174774 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1829485961 ^ parseInt)) {
                                    int i17 = 218899154 ^ parseInt;
                                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == 172171626 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(parseInt) == (1812221333 ^ parseInt)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i18 = 1760109917 ^ parseInt;
            throw new IllegalAccessException();
        }

        public static String fdknfzlhlf(byte[] bArr, int i) {
            byte[] bytes = Integer.toString(i).getBytes();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= bArr.length) {
                    return new String(bArr, StandardCharsets.UTF_16);
                }
                bArr[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
                bArr[i3] = (byte) (bArr[i3] ^ vtkwhanjje[i3 % vtkwhanjje.length]);
                i2 = i3 + 1;
            }
        }

        private static byte[] zmsflumtaeeqlhz() {
            return new byte[]{98, 117, 66, 43, 62, 56, 13, 48, 3, 53, 21, 84, 69, 122, 50, 39, 69, 20, 1, 71, 17, 43, 88, 54, 3, 4, 83, 106, 86, 35, 95, 106, 106, 59, 9, 88, 79, 98, 116, 73, 99, 77, 27, 87, 71, 93, 46, 53, 38, Byte.MAX_VALUE, 58, 32, 121, 121, 77, 22, 74, 3, 76, 28, 37, 26, 97, 102, 75, 31, 82, 14, 3, 9, 4, 86, 60, 9, 55, 72, 99, 90, 4, 91, 24, 27, 79, 126, 70, 47};
        }

        private static byte[] bmidklhprffyana() {
            return new byte[]{-83, -70, 123, 83, 12, 65, 62, 84, 52, 71, 36, 59, 124, 12, 0, 80, 118, 104, 54, 51, 32, 94, 97, 79, 49, 109, 96, 12, 97, 81, 110, 22, 83, 75, 59, 62, 124, 31, 67, 44, 82, 41};
        }

        private static byte[] hsgyomuwdpifzlg() {
            return new byte[]{-83, -70, 123, 115, 12, 97, 62, 116, 52, 103, 36, 73, 124, 44, 0, 112, 118, 72, 54, 19, 32, 126, 97, 111, 49, 31, 96, 44, 97, 113, 110, 54, 83, 107, 59, 30, 124, 63, 67, 12, 82, 9};
        }

        private static byte[] bwfobtdijkdmzuk() {
            return new byte[]{-83, -65, 115, 81, 14, 78, 61, 69, 59, 73, 36, 62, 116, 26, 2, 91, 117, 109, 57, 61, 32, 86, 105, 65, 51, 121, 99, 13, 110, 86, 110, 22, 91, 68, 57, 40, Byte.MAX_VALUE, 14};
        }

        private static byte[] ecxegqtodptarkm() {
            return new byte[]{-83, -65, 115, 113, 14, 110, 61, 101, 59, 105, 36, 76, 116, 58, 2, 123, 117, 77, 57, 29, 32, 118, 105, 97, 51, 89, 99, Byte.MAX_VALUE, 110, 118, 110, 54, 91, 100, 57, 8, Byte.MAX_VALUE, 46};
        }

        private static byte[] qxdjrrwljijeoxt() {
            return new byte[]{-83, -69, 115, 85, 6, 64, 63, 76, 50, 67, 36, 58, 116, 8, 10, 85, 119, 105, 48, 49, 32, 78, 105, 69, 59, 119};
        }

        private static byte[] xayxfjzqtyyxvnv() {
            return new byte[]{-83, -69, 115, 117, 6, 96, 63, 108, 50, 99, 36, 72, 116, 40, 10, 117, 119, 73, 48, 17, 32, 110, 105, 101, 59, 87};
        }

        private static byte[] bdnapnqnixegnco() {
            return new byte[]{-92, -65, 116, 90, 11, 66, 59, 77, 49, 72, 32, 61, 124, 28, 7, 84, 117, 114};
        }

        private static byte[] wvhfhlaguwbsabn() {
            return new byte[]{-92, -65, 116, 122, 11, 98, 59, 109, 49, 104, 32, 79, 124, 60, 7, 116, 117, 82};
        }

        private static byte[] mglsjzywrxcwsyz() {
            return new byte[]{-83, -77, 112, 73, 15, 79, 52, 77, 52, 73, 36, 61, 119, 3, 3, 71, 124, 113, 54, 33, 32, 65, 106, 85, 50, 117, 106, 24, 97, 95, 110, 0, 88, 94};
        }

        private static byte[] qhhptloovacmaja() {
            return new byte[]{-83, -77, 112, 105, 15, 111, 52, 109, 52, 105, 36, 29, 119, 35, 3, 103, 124, 81, 54, 83, 32, 97, 106, 117, 50, 85, 106, 56, 97, Byte.MAX_VALUE, 110, 32, 88, 126};
        }

        private static byte[] pjtgfrrnzdenjtq() {
            return new byte[]{-82, -67, 113, 72, 14, 76, 63, 74, 50, 66, 34, 55, 114, 5, 3, 71, 115, 113, 51, 47, 34, 82, 104, 72, 49, 109, 98, 8, 97, 85, 104, 8, 91, 68, 63, 32, 125, 6, 71, 45, 83, 53, 41, 46, 118, 33};
        }

        private static byte[] yvqmksugwygiazl() {
            return new byte[]{-82, -67, 113, 104, 14, 108, 63, 106, 50, 98, 34, 23, 114, 37, 3, 103, 115, 81, 51, 93, 34, 114, 104, 104, 49, 31, 98, 40, 97, 117, 104, 40, 91, 100, 63, 0, 125, 38, 71, 13, 83, 21, 41, 14, 118, 1};
        }

        private static byte[] uthdysrhyizcgnk() {
            return new byte[]{-83, -65, 118, 77, 8, 75, 60, 79, 54, 68, 36, 49, 113, 7, 4, 67, 116, 115, 52, 58, 32, 80, 108, 67};
        }

        private static byte[] nlczmomgtnylkeb() {
            return new byte[]{-83, -65, 118, 109, 8, 107, 60, 111, 54, 100, 36, 17, 113, 39, 4, 99, 116, 83, 52, 26, 32, 112, 108, 99};
        }

        private static byte[] jivodcizjrztmcs() {
            return new byte[]{-83, -65, 119, 84, 13, 66, 56, 79, 48, 69, 36, 62, 112, 14, 1, 93, 112, 104, 50, 52, 32, 87, 109, 83, 48, 124};
        }

        private static byte[] gywnmoudleirsng() {
            return new byte[]{-83, -65, 119, 116, 13, 98, 56, 111, 48, 101, 36, 76, 112, 46, 1, 125, 112, 72, 50, 20, 32, 119, 109, 115, 48, 92};
        }

        private static byte[] alijbqncrcfefuk() {
            return new byte[]{-83, -70, 112, 82, 9, 64, 60, 68, 50, 73, 36, 59, 119, 25, 5, 85, 116, 99, 48, 63, 32, 86, 106, 66};
        }

        private static byte[] jhjnkzodzqvfzja() {
            return new byte[]{-83, -70, 112, 114, 9, 96, 60, 100, 50, 105, 36, 73, 119, 57, 5, 117, 116, 67, 48, 31, 32, 118, 106, 98};
        }

        private static byte[] cnqejphnkqcxxox() {
            return new byte[]{-86, -67, 118, 76, 10, 79, 60, 92, 54, 92, 34, 40, 113, 1, 0, 91, 125, 100, 55, 47, 37, 93, 108, 72, 50, 115, 102, 31, 97, 92, 107, 1, 88, 88, 49, 40, 121, 18, 64, 52, 87, 48, 42, 33};
        }

        private static byte[] qogneyrokuoonzr() {
            return new byte[]{-86, -67, 118, 108, 10, 111, 60, 124, 54, 46, 34, 8, 113, 33, 0, 123, 125, 68, 55, 93, 37, 125, 108, 104, 50, 83, 102, 63, 97, 124, 107, 115, 88, 120, 49, 8, 121, 50, 64, 20, 87, 16, 42, 1};
        }

        private static byte[] glkhwekpxnlxfsa() {
            return new byte[]{-85, -67, 114, 91, 8, 79, 62, 79, 59, 71, 34, 59, 125, 2, 10, 91, 119, 120, 54, 47, 33, 85, 110, 65, 48, 99, 107, 19, 97, 87};
        }

        private static byte[] fjbfxwjmyreyfkr() {
            return new byte[]{-85, -67, 114, 123, 8, 111, 62, 111, 59, 103, 34, 73, 125, 34, 10, 123, 119, 88, 54, 93, 33, 117, 110, 97, 48, 67, 107, 51, 97, 119};
        }

        private static byte[] ettmcbgvusgdxpy() {
            return new byte[]{-83, -69, 113, 81, 11, 79, 62, 74, 52, 65, 36, 58, 118, 6, 7, 80, 118, 119, 54, 41, 32, 95, 107, 92, 54, 117, 96, 14, 97, 70};
        }

        private static byte[] pslupljkjqcxwwk() {
            return new byte[]{-83, -69, 113, 113, 11, 111, 62, 106, 52, 97, 36, 72, 118, 38, 7, 112, 118, 87, 54, 91, 32, Byte.MAX_VALUE, 107, 124, 54, 85, 96, 46, 97, 102};
        }

        private static int ruanyfeffjihhvnp(int i, int i2) {
            return i ^ i2;
        }
    }

    public MessagesManager(HomePlugin homePlugin, int i) {
        int i2 = 1187092289 ^ (1465134597 ^ 122512915);
        int parseInt = 538237831 ^ (62879179 ^ Integer.parseInt("896758043"));
        this.vVERgiFr6h = 1231478933 ^ MHca3atf9p;
        int morzllnhiwmzzvec = 73806501 ^ morzllnhiwmzzvec(parseInt, 968706111);
        this.messages = new HashMap();
        this.plugin = homePlugin;
        int i3 = 1792403278 ^ (310971239 ^ morzllnhiwmzzvec);
    }

    public void loadMessages(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.home.managers.MessagesManager.loadMessages(int):void");
    }

    public String get(String str, int i) {
        int i2 = 1869430097 ^ (2139616845 ^ 1733740325);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1109368373) {
            int i3 = 1602149527 ^ i2;
            return this.messages.getOrDefault(str, "§cMissing message: " + str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == -1109368373 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (260466060 ^ i2)) {
                int i4 = 2113473359 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1175881073 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (766054287 ^ i2)) {
                    break;
                }
            }
        }
        int i5 = 1248862229 ^ i2;
        throw new IOException();
    }

    public void sendMessage(Player player, MessageKey messageKey, String[] strArr, int i) {
        int i2 = 983319617 ^ (982395019 ^ 1733740325);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 975527803) {
            int i3 = 1975012459 ^ i2;
            String str = get(messageKey.getKey(), 1634103045);
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1746453472) {
                i2 = 1937700288 ^ i3;
                if (str == null) {
                    int i4 = 253563560 ^ i2;
                    return;
                }
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 202412579) {
                    int i5 = 260160881 ^ i2;
                    if (str.isEmpty() == (1845735221 ^ i5)) {
                        i5 = morzllnhiwmzzvec(i5, 2059271486);
                        String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(str, strArr, 887737915));
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1510829992) {
                            i3 = 1090781859 ^ i5;
                            player.sendMessage(color);
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1378712254) {
                                int i6 = 27869539 ^ i3;
                                return;
                            }
                        }
                    } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1880979883) {
                        int i7 = 10268633 ^ i5;
                        return;
                    }
                    while (true) {
                        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1510829992 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (1629848422 ^ i5)) {
                            int i8 = 550027516 ^ i5;
                            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == -1600614822 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (659024827 ^ i5)) {
                                int i9 = 548680942 ^ i5;
                                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == 1880979883 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i5) == (332559192 ^ i5)) {
                                    break;
                                }
                            }
                        }
                    }
                    int i10 = 542953081 ^ i5;
                    throw new RuntimeException();
                }
            }
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1746453472 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (255940300 ^ i3)) {
                    int i11 = 1713749309 ^ i3;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == -1378712254 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i3) == (444548372 ^ i3)) {
                        break;
                    }
                }
            }
            int i12 = 1334788871 ^ i3;
            throw new RuntimeException("double");
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 202412579 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (118537015 ^ i2)) {
                int i13 = 1946982776 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 975527803 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (314408606 ^ i2)) {
                    break;
                }
            }
        }
        int i14 = 1538025692 ^ i2;
        throw new IOException("double");
    }

    public void sendActionBar(Player player, MessageKey messageKey, String[] strArr, int i) {
        int i2 = 1069115765 ^ (1987648009 ^ 1733740325);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) != 1958060745) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1958060745 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (569938494 ^ i2)) {
                    break;
                }
            }
            int i3 = 2084259580 ^ i2;
            throw new RuntimeException("double");
        }
        int i4 = 1779454142 ^ i2;
        String str = get(messageKey.getKey(), 1634103045);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) != 607594298) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == 607594298 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i4) == (1896003704 ^ i4)) {
                    break;
                }
            }
            int i5 = 1750750698 ^ i4;
            throw new IllegalAccessException("double");
        }
        int i6 = 712059105 ^ i4;
        if (str == null) {
            morzllnhiwmzzvec(i6, 1218583924);
            return;
        }
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) != 2008965171) {
            while (true) {
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == 2008965171 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i6) == (430802121 ^ i6)) {
                    break;
                }
            }
            int i7 = 1663525350 ^ i6;
            throw new IOException("double");
        }
        int i8 = 385249210 ^ i6;
        if (str.isEmpty() == (2013373372 ^ i8)) {
            i8 = 786735117 ^ i8;
            String color = ChatFormater.color(PlaceHolderHelper.parsePlaceholders(str, strArr, 887737915));
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1222107766) {
                i8 = 816485623 ^ i8;
                player.sendActionBar(color);
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 847034931) {
                    int i9 = 944943692 ^ i8;
                    return;
                }
            }
        } else if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1072882205) {
            int i10 = 1582592718 ^ i8;
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1222107766 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1492595617 ^ i8)) {
                int i11 = 1720307853 ^ i8;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == 847034931 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (542263665 ^ i8)) {
                    int i12 = 669576782 ^ i8;
                    if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == -1072882205 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i8) == (1520530169 ^ i8)) {
                        break;
                    }
                }
            }
        }
        int i13 = 826392392 ^ i8;
        throw new RuntimeException();
    }

    private String colorize(String str, int i) {
        int i2 = 588667302 ^ (670577627 ^ 1733740325);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 499477187) {
            return ChatColor.translateAlternateColorCodes((char) ((byte) (218668666 ^ (1857041156 ^ i2))), str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 1749349088 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (106029622 ^ i2)) {
                int i3 = 799862661 ^ i2;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == 499477187 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i2) == (236416359 ^ i2)) {
                    break;
                }
            }
        }
        int i4 = 1335864431 ^ i2;
        throw new IOException();
    }

    @Generated
    public HomePlugin getPlugin() {
        int i = 2018820809 ^ (167803333 ^ 1733740325);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1475092152) {
            int i2 = 929518830 ^ i;
            return this.plugin;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 321472057 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (999918715 ^ i)) {
                int i3 = 1739829654 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -1475092152 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (979840373 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1097666412 ^ i;
        throw new IllegalAccessException();
    }

    @Generated
    public Map<String, String> getMessages() {
        int i = 53216170 ^ (172147734 ^ 1733740325);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1908409547) {
            int i2 = 517134259 ^ i;
            return this.messages;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -2024359597 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (2040033485 ^ i)) {
                int i3 = 505106108 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 1908409547 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (943075752 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 111110718 ^ i;
        throw new IllegalAccessException();
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
        ewmkvfxlcy = ByteBuffer.wrap(cvaqvppmgrgthgt()).asCharBuffer().toString();
        MHca3atf9p = 1664656796 ^ new Random(-732546018279757289L).nextInt();
    }

    public static String ufqkdiyhpr(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = ewmkvfxlcy.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] bafwslpvspacgkj() {
        return new byte[]{0, 0, 0, 8, 0, 0, 0, 0};
    }

    private static byte[] zpebixriucbfdlb() {
        return new byte[]{0, 0, 0, 42, 0, 0, 0, 8};
    }

    private static byte[] cvaqvppmgrgthgt() {
        return new byte[]{51, 90, 53, 83, 53, 68, 48, 65, 57, 82, 55, 82, 54, 80, 55, 67, 49, 119, 52, 87, 56, 23, 49, 17, 55, 92, 57, 81, 56, 75, 55, 66, 54, 86, 49, 94, 52, 93, 56, 68, 49, 17, 55, 17, 57, 71, 56, 93, 55, 82, 54, 67, 49, 80, 52, 87, 56, 89, 49, 22, 55, 87, 57, 91, 56, 77, 55, 95, 54, 83, 49, 25, 52, 81, 56, 89, 49, 22, 55, 82, 57, 91, 56, 86, 55, 87, 54, 94, 49, 94, 52, 22, 56, 78, 49, 91, 55, 93, 57, 26};
    }

    private static int morzllnhiwmzzvec(int i, int i2) {
        return i ^ i2;
    }
}
