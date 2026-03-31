package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.util.ByteArrayBuilder;
import com.kammoun.utils.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.util.Arrays;

public final class JsonStringEncoder {
    private static final int SURR1_FIRST = 55296;
    private static final int SURR1_LAST = 56319;
    private static final int SURR2_FIRST = 56320;
    private static final int SURR2_LAST = 57343;
    static final int MIN_CHAR_BUFFER_SIZE = 16;
    static final int MAX_CHAR_BUFFER_SIZE = 32000;
    static final int MIN_BYTE_BUFFER_SIZE = 24;
    static final int MAX_BYTE_BUFFER_SIZE = 32000;
    private static final char[] HC = CharTypes.copyHexChars(true);
    private static final byte[] HB = CharTypes.copyHexBytes(true);
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    public char[] quoteAsString(String str) {
        int length = str.length();
        char[] cArr = new char[_initialCharBufSize(length)];
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length2 = iArr.length;
        int i = 0;
        TextBuffer textBuffer = null;
        int i2 = 0;
        char[] cArr2 = null;
        loop0: while (i < length) {
            do {
                char charAt = str.charAt(i);
                if (charAt >= length2 || iArr[charAt] == 0) {
                    if (i2 >= cArr.length) {
                        if (textBuffer == null) {
                            textBuffer = TextBuffer.fromInitial(cArr);
                        }
                        try {
                            cArr = textBuffer.finishCurrentSegment();
                            i2 = 0;
                        } catch (IOException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    int i3 = i2;
                    i2++;
                    cArr[i3] = charAt;
                    i++;
                } else {
                    if (cArr2 == null) {
                        cArr2 = _qbuf();
                    }
                    int i4 = i;
                    i++;
                    char charAt2 = str.charAt(i4);
                    int i5 = iArr[charAt2];
                    int _appendNumeric = i5 < 0 ? _appendNumeric(charAt2, cArr2) : _appendNamed(i5, cArr2);
                    if (i2 + _appendNumeric > cArr.length) {
                        int length3 = cArr.length - i2;
                        if (length3 > 0) {
                            System.arraycopy(cArr2, 0, cArr, i2, length3);
                        }
                        if (textBuffer == null) {
                            textBuffer = TextBuffer.fromInitial(cArr);
                        }
                        try {
                            cArr = textBuffer.finishCurrentSegment();
                            int i6 = _appendNumeric - length3;
                            System.arraycopy(cArr2, length3, cArr, 0, i6);
                            i2 = i6;
                        } catch (IOException e2) {
                            throw new IllegalStateException(e2);
                        }
                    } else {
                        System.arraycopy(cArr2, 0, cArr, i2, _appendNumeric);
                        i2 += _appendNumeric;
                    }
                }
            } while (i < length);
        }
        if (textBuffer == null) {
            return Arrays.copyOfRange(cArr, 0, i2);
        }
        textBuffer.setCurrentLength(i2);
        try {
            return textBuffer.contentsAsArray();
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public char[] quoteAsString(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return quoteAsString((String) charSequence);
        }
        TextBuffer textBuffer = null;
        int length = charSequence.length();
        char[] cArr = new char[_initialCharBufSize(length)];
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length2 = iArr.length;
        int i = 0;
        int i2 = 0;
        char[] cArr2 = null;
        loop0: while (i < length) {
            do {
                char charAt = charSequence.charAt(i);
                if (charAt >= length2 || iArr[charAt] == 0) {
                    if (i2 >= cArr.length) {
                        if (textBuffer == null) {
                            textBuffer = TextBuffer.fromInitial(cArr);
                        }
                        try {
                            cArr = textBuffer.finishCurrentSegment();
                            i2 = 0;
                        } catch (IOException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    int i3 = i2;
                    i2++;
                    cArr[i3] = charAt;
                    i++;
                } else {
                    if (cArr2 == null) {
                        cArr2 = _qbuf();
                    }
                    int i4 = i;
                    i++;
                    char charAt2 = charSequence.charAt(i4);
                    int i5 = iArr[charAt2];
                    int _appendNumeric = i5 < 0 ? _appendNumeric(charAt2, cArr2) : _appendNamed(i5, cArr2);
                    if (i2 + _appendNumeric > cArr.length) {
                        int length3 = cArr.length - i2;
                        if (length3 > 0) {
                            System.arraycopy(cArr2, 0, cArr, i2, length3);
                        }
                        if (textBuffer == null) {
                            textBuffer = TextBuffer.fromInitial(cArr);
                        }
                        try {
                            cArr = textBuffer.finishCurrentSegment();
                            int i6 = _appendNumeric - length3;
                            System.arraycopy(cArr2, length3, cArr, 0, i6);
                            i2 = i6;
                        } catch (IOException e2) {
                            throw new IllegalStateException(e2);
                        }
                    } else {
                        System.arraycopy(cArr2, 0, cArr, i2, _appendNumeric);
                        i2 += _appendNumeric;
                    }
                }
            } while (i < length);
        }
        if (textBuffer == null) {
            return Arrays.copyOfRange(cArr, 0, i2);
        }
        textBuffer.setCurrentLength(i2);
        try {
            return textBuffer.contentsAsArray();
        } catch (IOException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public void quoteAsString(CharSequence charSequence, StringBuilder sb) {
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length = iArr.length;
        int i = 0;
        int length2 = charSequence.length();
        char[] cArr = null;
        while (i < length2) {
            do {
                char charAt = charSequence.charAt(i);
                if (charAt >= length || iArr[charAt] == 0) {
                    sb.append(charAt);
                    i++;
                } else {
                    if (cArr == null) {
                        cArr = _qbuf();
                    }
                    int i2 = i;
                    i++;
                    char charAt2 = charSequence.charAt(i2);
                    int i3 = iArr[charAt2];
                    sb.append(cArr, 0, i3 < 0 ? _appendNumeric(charAt2, cArr) : _appendNamed(i3, cArr));
                }
            } while (i < length2);
            return;
        }
    }

    public byte[] quoteAsUTF8(String str) {
        int i;
        int i2;
        int i3 = 0;
        int length = str.length();
        int i4 = 0;
        byte[] bArr = new byte[_initialByteBufSize(length)];
        ByteArrayBuilder byteArrayBuilder = null;
        loop0: while (i3 < length) {
            int[] iArr = CharTypes.get7BitOutputEscapes();
            do {
                char charAt = str.charAt(i3);
                if (charAt > 127 || iArr[charAt] != 0) {
                    if (byteArrayBuilder == null) {
                        byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i4);
                    }
                    if (i4 >= bArr.length) {
                        bArr = byteArrayBuilder.finishCurrentSegment();
                        i4 = 0;
                    }
                    int i5 = i3;
                    i3++;
                    char charAt2 = str.charAt(i5);
                    if (charAt2 <= 127) {
                        i4 = _appendByte(charAt2, iArr[charAt2], byteArrayBuilder, i4);
                        bArr = byteArrayBuilder.getCurrentSegment();
                    } else {
                        if (charAt2 <= 2047) {
                            int i6 = i4;
                            i = i4 + 1;
                            bArr[i6] = (byte) (192 | (charAt2 >> 6));
                            i2 = 128 | (charAt2 & '?');
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            int i7 = i4;
                            int i8 = i4 + 1;
                            bArr[i7] = (byte) (224 | (charAt2 >> '\f'));
                            if (i8 >= bArr.length) {
                                bArr = byteArrayBuilder.finishCurrentSegment();
                                i8 = 0;
                            }
                            int i9 = i8;
                            i = i8 + 1;
                            bArr[i9] = (byte) (128 | ((charAt2 >> 6) & 63));
                            i2 = 128 | (charAt2 & '?');
                        } else {
                            if (charAt2 > 56319) {
                                _illegal(charAt2);
                            }
                            if (i3 >= length) {
                                _illegal(charAt2);
                            }
                            i3++;
                            int _convert = _convert(charAt2, str.charAt(i3));
                            if (_convert > 1114111) {
                                _illegal(_convert);
                            }
                            int i10 = i4;
                            int i11 = i4 + 1;
                            bArr[i10] = (byte) (240 | (_convert >> 18));
                            if (i11 >= bArr.length) {
                                bArr = byteArrayBuilder.finishCurrentSegment();
                                i11 = 0;
                            }
                            int i12 = i11;
                            int i13 = i11 + 1;
                            bArr[i12] = (byte) (128 | ((_convert >> 12) & 63));
                            if (i13 >= bArr.length) {
                                bArr = byteArrayBuilder.finishCurrentSegment();
                                i13 = 0;
                            }
                            int i14 = i13;
                            i = i13 + 1;
                            bArr[i14] = (byte) (128 | ((_convert >> 6) & 63));
                            i2 = 128 | (_convert & 63);
                        }
                        if (i >= bArr.length) {
                            bArr = byteArrayBuilder.finishCurrentSegment();
                            i = 0;
                        }
                        int i15 = i;
                        i4 = i + 1;
                        bArr[i15] = (byte) i2;
                    }
                } else {
                    if (i4 >= bArr.length) {
                        if (byteArrayBuilder == null) {
                            byteArrayBuilder = ByteArrayBuilder.fromInitial(bArr, i4);
                        }
                        bArr = byteArrayBuilder.finishCurrentSegment();
                        i4 = 0;
                    }
                    int i16 = i4;
                    i4++;
                    bArr[i16] = (byte) charAt;
                    i3++;
                }
            } while (i3 < length);
        }
        return byteArrayBuilder == null ? Arrays.copyOfRange(bArr, 0, i4) : byteArrayBuilder.completeAndCoalesce(i4);
    }

    public byte[] encodeAsUTF8(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    public byte[] encodeAsUTF8(java.lang.CharSequence r7) {
        throw new UnsupportedOperationException("Method not decompiled: com.kammoun.utils.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.CharSequence):byte[]");
    }

    private char[] _qbuf() {
        return new char[]{'\\', 0, '0', '0'};
    }

    private int _appendNumeric(int i, char[] cArr) {
        cArr[1] = 'u';
        cArr[4] = HC[i >> 4];
        cArr[5] = HC[i & 15];
        return 6;
    }

    private int _appendNamed(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int _appendByte(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                int i4 = i >> 8;
                byteArrayBuilder.append(HB[i4 >> 4]);
                byteArrayBuilder.append(HB[i4 & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byteArrayBuilder.append(HB[i >> 4]);
            byteArrayBuilder.append(HB[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private static int _convert(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
        }
        return (i << 10) + i2 + UTF8Writer.SURROGATE_BASE;
    }

    private static void _illegal(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    static int _initialCharBufSize(int i) {
        return Math.min(Math.max(16, i + Math.min(6 + (i >> 3), 1000)), 32000);
    }

    static int _initialByteBufSize(int i) {
        return Math.min(Math.max(MIN_BYTE_BUFFER_SIZE, i + 6 + (i >> 1)), 32000);
    }
}
