package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.io.doubleparser.JavaDoubleParser;
import com.kammoun.utils.jackson.core.io.doubleparser.JavaFloatParser;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

public final class NumberInput {

    @Deprecated
    public static final String NASTY_SMALL_DOUBLE = "2.2250738585072012e-308";
    static final long L_BILLION = 1000000000;
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);
    static final String MAX_LONG_STR = String.valueOf(Long.MAX_VALUE);
    private static final Pattern PATTERN_FLOAT = Pattern.compile("[+-]?[0-9]+(\\.[0-9]+)?([eE][+-]?[0-9]+)?");

    public static int parseInt(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                int i4 = i;
                i++;
                i3 += (cArr[i4] - '0') * 100000000;
            case 8:
                int i5 = i;
                i++;
                i3 += (cArr[i5] - '0') * 10000000;
            case 7:
                int i6 = i;
                i++;
                i3 += (cArr[i6] - '0') * 1000000;
            case 6:
                int i7 = i;
                i++;
                i3 += (cArr[i7] - '0') * 100000;
            case 5:
                int i8 = i;
                i++;
                i3 += (cArr[i8] - '0') * 10000;
            case 4:
                int i9 = i;
                i++;
                i3 += (cArr[i9] - '0') * 1000;
            case 3:
                int i10 = i;
                i++;
                i3 += (cArr[i10] - '0') * 100;
            case 2:
                i3 += (cArr[i] - '0') * 10;
                break;
        }
        return i3;
    }

    public static int parseInt(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }

    public static long parseLong(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (parseInt(cArr, i, i3) * L_BILLION) + parseInt(cArr, i + i3, 9);
    }

    public static long parseLong19(char[] cArr, int i, boolean z) {
        long j = 0;
        for (int i2 = 0; i2 < 19; i2++) {
            j = (j * 10) + (cArr[i + i2] - '0');
        }
        return z ? -j : j;
    }

    public static long parseLong(String str) {
        return str.length() <= 9 ? parseInt(str) : Long.parseLong(str);
    }

    public static boolean inLongRange(char[] cArr, int i, int i2, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static boolean inLongRange(String str, boolean z) {
        String str2 = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            int charAt = str.charAt(i) - str2.charAt(i);
            if (charAt != 0) {
                return charAt < 0;
            }
        }
        return true;
    }

    public static int parseAsInt(String str, int i) {
        if (str == null) {
            return i;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length == 0) {
            return i;
        }
        int i2 = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            char charAt2 = trim.charAt(i2);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (int) parseDouble(trim, true);
                } catch (NumberFormatException e) {
                    return i;
                }
            }
            i2++;
        }
        try {
            return Integer.parseInt(trim);
        } catch (NumberFormatException e2) {
            return i;
        }
    }

    public static long parseAsLong(String str, long j) {
        if (str == null) {
            return j;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length == 0) {
            return j;
        }
        int i = 0;
        char charAt = trim.charAt(0);
        if (charAt == '+') {
            trim = trim.substring(1);
            length = trim.length();
        } else if (charAt == '-') {
            i = 1;
        }
        while (i < length) {
            char charAt2 = trim.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                try {
                    return (long) parseDouble(trim, true);
                } catch (NumberFormatException e) {
                    return j;
                }
            }
            i++;
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException e2) {
            return j;
        }
    }

    public static double parseAsDouble(String str, double d) {
        return parseAsDouble(str, d, false);
    }

    public static double parseAsDouble(String str, double d, boolean z) {
        if (str == null) {
            return d;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return d;
        }
        try {
            return parseDouble(trim, z);
        } catch (NumberFormatException e) {
            return d;
        }
    }

    @Deprecated
    public static double parseDouble(String str) throws NumberFormatException {
        return parseDouble(str, false);
    }

    public static double parseDouble(String str, boolean z) throws NumberFormatException {
        return z ? JavaDoubleParser.parseDouble(str) : Double.parseDouble(str);
    }

    @Deprecated
    public static float parseFloat(String str) throws NumberFormatException {
        return parseFloat(str, false);
    }

    public static float parseFloat(String str, boolean z) throws NumberFormatException {
        return z ? JavaFloatParser.parseFloat(str) : Float.parseFloat(str);
    }

    @Deprecated
    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        return parseBigDecimal(str, false);
    }

    public static BigDecimal parseBigDecimal(String str, boolean z) throws NumberFormatException {
        return z ? BigDecimalParser.parseWithFastParser(str) : BigDecimalParser.parse(str);
    }

    @Deprecated
    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2) throws NumberFormatException {
        return BigDecimalParser.parse(cArr, i, i2);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i, int i2, boolean z) throws NumberFormatException {
        return z ? BigDecimalParser.parseWithFastParser(cArr, i, i2) : BigDecimalParser.parse(cArr, i, i2);
    }

    @Deprecated
    public static BigDecimal parseBigDecimal(char[] cArr) throws NumberFormatException {
        return BigDecimalParser.parse(cArr);
    }

    public static BigDecimal parseBigDecimal(char[] cArr, boolean z) throws NumberFormatException {
        return z ? BigDecimalParser.parseWithFastParser(cArr, 0, cArr.length) : BigDecimalParser.parse(cArr);
    }

    @Deprecated
    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        return parseBigInteger(str, false);
    }

    public static BigInteger parseBigInteger(String str, boolean z) throws NumberFormatException {
        return z ? BigIntegerParser.parseWithFastParser(str) : new BigInteger(str);
    }

    public static BigInteger parseBigIntegerWithRadix(String str, int i, boolean z) throws NumberFormatException {
        return z ? BigIntegerParser.parseWithFastParser(str, i) : new BigInteger(str, i);
    }

    public static boolean looksLikeValidNumber(String str) {
        return str != null && PATTERN_FLOAT.matcher(str).matches();
    }
}
