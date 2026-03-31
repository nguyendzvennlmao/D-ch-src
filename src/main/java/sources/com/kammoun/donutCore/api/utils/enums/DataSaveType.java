package com.kammoun.donutCore.api.utils.enums;

import fvbmjnlngaegqfsf.jnbwyqufydqqceyf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public final class DataSaveType {
    public static final DataSaveType MYSQL;
    public static final DataSaveType SQLITE;
    public static final DataSaveType JSON;
    private static final DataSaveType[] $VALUES;
    private static String awltqkrjnj;

    public static DataSaveType[] values() {
        int i = 382506903 ^ (2079490608 ^ (1301263051 ^ 1304633594));
        return (DataSaveType[]) $VALUES.clone();
    }

    public static DataSaveType valueOf(String str) {
        int i = 1410360100 ^ (2071559630 ^ 1304633594);
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 357691523) {
            int i2 = 2123160760 ^ i;
            return (DataSaveType) Enum.valueOf(DataSaveType.class, str);
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 357691523 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1403559039 ^ i)) {
                int i3 = 1703092260 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == -516483776 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1527215808 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 125770298 ^ i;
        throw new RuntimeException();
    }

    private DataSaveType(String str, int i) {
        int i2 = 204967293 ^ (1722481197 ^ 239800794);
        int parseInt = 155377597 ^ (1518578171 ^ (803374951 ^ Integer.parseInt("297224214")));
    }

    private static DataSaveType[] $values() {
        int i = 1708549541 ^ (1674991503 ^ (1287845688 ^ 1304633594));
        DataSaveType[] dataSaveTypeArr = new DataSaveType[(byte) (117564907 ^ i)];
        dataSaveTypeArr[(byte) (117564904 ^ i)] = MYSQL;
        dataSaveTypeArr[(byte) (117564905 ^ i)] = SQLITE;
        dataSaveTypeArr[(byte) (117564906 ^ i)] = JSON;
        return dataSaveTypeArr;
    }

    static {
        int parseInt = 794078237 ^ (265498576 ^ Integer.parseInt("297224214"));
        awltqkrjnj = ByteBuffer.wrap(egmyhuielwbndcy()).asCharBuffer().toString();
        int i = 510568920 ^ parseInt;
        MYSQL = new DataSaveType(sdickbmmpl(tzmlgkvlwmqhnbq(), i), (byte) (794714627 ^ i));
        SQLITE = new DataSaveType(sdickbmmpl(msvicglyqlgrozn(), i), (byte) (794714626 ^ i));
        JSON = new DataSaveType(sdickbmmpl(yriuglwkaovvrik(), i), (byte) (794714625 ^ i));
        if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2062749721) {
            int i2 = 222284471 ^ i;
            $VALUES = $values();
            return;
        }
        while (true) {
            if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 319636897 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (1770123147 ^ i)) {
                int i3 = 2092608107 ^ i;
                if (jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == 2062749721 && jnbwyqufydqqceyf.tkqaqydyhjwdotpd(i) == (201101079 ^ i)) {
                    break;
                }
            }
        }
        int i4 = 1952071676 ^ i;
        throw new IOException();
    }

    public static String sdickbmmpl(byte[] bArr, int i) {
        byte[] bytes = Integer.toString(i).getBytes();
        int i2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int i3 = ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
        byte[] bytes2 = awltqkrjnj.substring(i3, i3 + i2).getBytes(StandardCharsets.UTF_16BE);
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

    private static byte[] tzmlgkvlwmqhnbq() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 0};
    }

    private static byte[] msvicglyqlgrozn() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 5};
    }

    private static byte[] yriuglwkaovvrik() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 11};
    }

    private static byte[] egmyhuielwbndcy() {
        return new byte[]{55, 116, 52, 110, 49, 103, 54, 99, 55, 123, 55, 106, 52, 102, 49, 120, 54, 123, 55, 99, 57, 113, 55, 115, 52, 100, 49, 123, 54, 124};
    }
}
