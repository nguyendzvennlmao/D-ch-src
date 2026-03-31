package com.kammoun.donutCore.api.utils.time;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public final class TimeUtils {
    private static int vx7bMU8reM = 0;
    private transient int qANaSwVGvS = 416782695;
    private static String[] nothing_to_see_here = new String[15];

    private TimeUtils() {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.time.TimeUtils.<init>():void");
    }

    public static java.lang.String format(long r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.time.TimeUtils.format(long):java.lang.String");
    }

    public static java.lang.String formatTimeHoursAndDays(long r5, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.time.TimeUtils.formatTimeHoursAndDays(long, int):java.lang.String");
    }

    public static java.lang.String formatTimeDonut(long r5, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.time.TimeUtils.formatTimeDonut(long, int):java.lang.String");
    }

    public static java.lang.String formatMillis(long r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.time.TimeUtils.formatMillis(long):java.lang.String");
    }

    public static long getDuration(java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.time.TimeUtils.getDuration(java.lang.String, int):long");
    }

    public static long parse(java.lang.String r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.donutCore.api.utils.time.TimeUtils.parse(java.lang.String, int):long");
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
        vx7bMU8reM = 1446854841 ^ new Random(-5357059015432272093L).nextInt();
    }

    public static String qlrxsioprl(byte[] bArr, byte[] bArr2, int i) {
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

    private static byte[] cpmaoqcerswmypw() {
        return new byte[]{39, 15, 125, 111, 5, 50, 65, 123, 94, 33, 43, 49, 19, 50, 80, 13, 81, 45, 8, 109, 115, 115, 50, 50, 48, 100, 63, 71, 118, 105, 51, 49, 85, 78, 119, 105, 61, 73, 17, 15, 91, 56, 10, 100, 40, 26, 125, 56, 98, 48, 89, 76, 114, 21, 2, 58, 2, 15, 4, 120, 91, 13, 4, 68, 27, 30, 99, 1, 118, 102, 118, 88, 101, 27, 122, 94, 38, 118, 114, 73, 18, 29, 32, 119, 101, 91, 45, 116, 33, 72, 46, 12, 40, 5, 8, 64, 71, 33, 107, 46, 51, 120, 16, 93, 51, 50, 49, 33, 102, 114, 14, 62, 5, 45};
    }

    private static byte[] xtljbxngvsauzgk() {
        return new byte[]{-24, -64, 77, 120, 53, 49, 120, 121, 107, 117, 26, 59, 35, 37, 96, 14, 104, 47, 61, 57};
    }

    private static byte[] uicyggitromqlpg() {
        return new byte[]{-24, -60, 69, 126, 49, 59, 118, 124, 102, 116, 26, 63, 43, 35, 100, 4, 102, 42, 48, 56, 66, 125, 10, 35, 4, 109, 8, 64, 78, 60};
    }

    private static byte[] qoeydnpgjvjajlb() {
        return new byte[]{-22, -63, 77, 58, 50, 32};
    }

    private static byte[] oiflluakzwaeioc() {
        return new byte[]{-22, -58, 69, 102, 48, 106};
    }

    private static byte[] infnctrimhquirq() {
        return new byte[]{-24, -58, 79, 51};
    }

    private static byte[] aphrijxipjnundx() {
        return new byte[]{-31, -56, 74, 62, 53, 42};
    }

    private static byte[] lrxzkdkodlbfhre() {
        return new byte[]{-19, -61, 78, 50, 49, 39};
    }

    private static byte[] htechmxuycgpoqz() {
        return new byte[]{-24, -57, 75, 49, 51, 35};
    }

    private static byte[] swixqrpweimgtfv() {
        return new byte[]{-24, -62, 76, 44};
    }

    private static byte[] sjtpfsndqhvopzg() {
        return new byte[]{-24, -61, 69, 110, 49, 117};
    }

    private static byte[] azpepimrtalskxw() {
        return new byte[]{-32, -58, 68, 52, 49, 109, 116, 35, 108, 56};
    }

    private static byte[] rnogpwroiofvdzk() {
        return new byte[]{-24, -58, 78, 108, 51, 116};
    }

    private static byte[] mamotzacpjcjmtw() {
        return new byte[]{-20, -56, 75, 122, 52, 58, 121, 126, 104, 112, 19, 61, 35, 38, 104, 5, 102, 41, 61, 49, 69, 109, 3, 47, 8, 99, 9, 65, 78, 59};
    }

    private static byte[] cupqpxeqkmjgslo() {
        return new byte[]{-32, -63, 72, 49, 48, 108, 115, 35};
    }

    private static byte[] fsqnvqrzkobekod() {
        return new byte[]{-24, -63, 79, 50, 55, 111, 120, 58, 110, 100};
    }

    private static byte[] ecdattpnwwtuwtb() {
        return new byte[]{-24, -59, 75, 33, 55, 99, 117, 42, 109, 123};
    }

    private static byte[] vyvxfemjpaqngfz() {
        return new byte[]{-24, -60, 68, 60, 61, 97, 121, 49};
    }

    private static byte[] qwqubnbnpzzrmci() {
        return new byte[]{-24, -57, 79, 12, 61, 94, 116, 126, 107, 60, 26, 63, 33, 87};
    }

    private static byte[] eqvgyqlbymccvqi() {
        return new byte[0];
    }

    private static byte[] kabtcxjqmrsfypx() {
        return new byte[]{-21, -64, 75, 55};
    }

    private static byte[] beveszlscmfqxpz() {
        return new byte[]{-24, -55, 68, 36};
    }

    private static byte[] hlxdjmzrcjzrarc() {
        return new byte[]{-18, -56, 72, 45};
    }

    private static byte[] murzlistprgubqk() {
        return new byte[]{-21, -62, 78, 55};
    }

    private static byte[] lvvkmrdcjfhuibr() {
        return new byte[]{-32, -56, 69, 57};
    }

    private static byte[] xzafzqkxyrxqzse() {
        return new byte[]{-22, -60, 77, 7, 52, 58, 120, 97, 102, 43, 31, 92};
    }

    private static byte[] yxfwlgjjhmonplp() {
        return new byte[0];
    }

    private static byte[] mvsktqxmkfrfbnl() {
        return new byte[]{-24, -57, 77, 62};
    }

    private static byte[] kmcnlqwizrwguiu() {
        return new byte[]{-22, -64, 75, 118, 50, 86, 119, 38, 108, 57, 27, 46, 34, 45, 104, 96, 104, 123, 59, 53, 69, 47, 5, 121, 6, 0, 13, 93};
    }

    private static byte[] ojwhjosgzruulvf() {
        return new byte[]{-24, -60, 75, 36};
    }

    private static byte[] yrnexezhgdvhrrq() {
        return new byte[]{-32, -60, 77, 50};
    }

    private static byte[] dibzdcnrwdoofqt() {
        return new byte[]{-24, -56, 75, 59};
    }

    private static int vzbevalqolipfmxu(int i, int i2) {
        return i2 ^ i;
    }
}
