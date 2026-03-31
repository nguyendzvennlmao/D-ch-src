package com.kammoun.utils.jackson.core.io.doubleparser;

import com.kammoun.utils.jackson.core.ErrorReportConfiguration;
import java.util.Arrays;

abstract class AbstractNumberParser {
    public static final String ILLEGAL_OFFSET_OR_ILLEGAL_LENGTH = "offset < 0 or length > str.length";
    public static final String SYNTAX_ERROR = "illegal syntax";
    public static final String VALUE_EXCEEDS_LIMITS = "value exceeds limits";
    static final byte DECIMAL_POINT_CLASS = -4;
    static final byte OTHER_CLASS = -1;
    static final byte[] CHAR_TO_HEX_MAP = new byte[ErrorReportConfiguration.DEFAULT_MAX_ERROR_TOKEN_LENGTH];

    public static byte charAt(byte[] bArr, int i, int i2) {
        if (i < i2) {
            return bArr[i];
        }
        return (byte) 0;
    }

    public static char charAt(char[] cArr, int i, int i2) {
        if (i < i2) {
            return cArr[i];
        }
        return (char) 0;
    }

    public static char charAt(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            return charSequence.charAt(i);
        }
        return (char) 0;
    }

    public static int lookupHex(byte b) {
        return CHAR_TO_HEX_MAP[b & 255];
    }

    public static int lookupHex(char c) {
        if (c < 128) {
            return CHAR_TO_HEX_MAP[c];
        }
        return -1;
    }

    protected static int checkBounds(int i, int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new NumberFormatException(VALUE_EXCEEDS_LIMITS);
        }
        return checkBounds(i, i2, i3);
    }

    public static int checkBounds(int i, int i2, int i3) {
        if ((i2 | i3 | ((i - i3) - i2)) < 0) {
            throw new IllegalArgumentException(ILLEGAL_OFFSET_OR_ILLEGAL_LENGTH);
        }
        return i3 + i2;
    }

    static {
        Arrays.fill(CHAR_TO_HEX_MAP, (byte) -1);
        char c = '0';
        while (true) {
            char c2 = c;
            if (c2 > '9') {
                break;
            }
            CHAR_TO_HEX_MAP[c2] = (byte) (c2 - '0');
            c = (char) (c2 + 1);
        }
        char c3 = 'A';
        while (true) {
            char c4 = c3;
            if (c4 > 'F') {
                break;
            }
            CHAR_TO_HEX_MAP[c4] = (byte) ((c4 - 'A') + 10);
            c3 = (char) (c4 + 1);
        }
        char c5 = 'a';
        while (true) {
            char c6 = c5;
            if (c6 > 'f') {
                CHAR_TO_HEX_MAP[46] = DECIMAL_POINT_CLASS;
                return;
            } else {
                CHAR_TO_HEX_MAP[c6] = (byte) ((c6 - 'a') + 10);
                c5 = (char) (c6 + 1);
            }
        }
    }
}
