package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.io.NumberInput;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class TextBuffer {
    static final char[] NO_CHARS = new char[0];
    static final int MIN_SEGMENT_LEN = 500;
    static final int MAX_SEGMENT_LEN = 65536;
    private final BufferRecycler _allocator;
    private char[] _inputBuffer;
    private int _inputStart;
    private int _inputLen;
    private ArrayList<char[]> _segments;
    private boolean _hasSegments;
    private int _segmentSize;
    private char[] _currentSegment;
    private int _currentSize;
    private String _resultString;
    private char[] _resultArray;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this._allocator = bufferRecycler;
    }

    protected TextBuffer(BufferRecycler bufferRecycler, char[] cArr) {
        this(bufferRecycler);
        this._currentSegment = cArr;
        this._currentSize = cArr.length;
        this._inputStart = -1;
    }

    public static TextBuffer fromInitial(char[] cArr) {
        return new TextBuffer(null, cArr);
    }

    public void releaseBuffers() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        if (this._allocator == null || this._currentSegment == null) {
            return;
        }
        char[] cArr = this._currentSegment;
        this._currentSegment = null;
        this._allocator.releaseCharBuffer(2, cArr);
    }

    public void resetWithEmpty() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWith(char c) {
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(1);
        }
        this._currentSegment[0] = c;
        this._segmentSize = 1;
        this._currentSize = 1;
    }

    public void resetWithShared(char[] cArr, int i, int i2) {
        this._resultString = null;
        this._resultArray = null;
        this._inputBuffer = cArr;
        this._inputStart = i;
        this._inputLen = i2;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithCopy(char[] cArr, int i, int i2) throws IOException {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i2);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(cArr, i, i2);
    }

    public void resetWithCopy(String str, int i, int i2) throws IOException {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i2);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(str, i, i2);
    }

    public void resetWithString(String str) throws IOException {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        validateStringLength(str.length());
        this._resultString = str;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        this._currentSize = 0;
    }

    public char[] getBufferWithoutReset() {
        return this._currentSegment;
    }

    private char[] buf(int i) {
        return this._allocator != null ? this._allocator.allocCharBuffer(2, i) : new char[Math.max(i, 500)];
    }

    private void clearSegments() {
        this._hasSegments = false;
        this._segments.clear();
        this._segmentSize = 0;
        this._currentSize = 0;
    }

    public BufferRecycler bufferRecycler() {
        return this._allocator;
    }

    public int size() {
        return this._inputStart >= 0 ? this._inputLen : this._resultArray != null ? this._resultArray.length : this._resultString != null ? this._resultString.length() : this._segmentSize + this._currentSize;
    }

    public int getTextOffset() {
        if (this._inputStart >= 0) {
            return this._inputStart;
        }
        return 0;
    }

    public boolean hasTextAsCharacters() {
        return this._inputStart >= 0 || this._resultArray != null || this._resultString == null;
    }

    public char[] getTextBuffer() throws IOException {
        if (this._inputStart >= 0) {
            return this._inputBuffer;
        }
        if (this._resultArray != null) {
            return this._resultArray;
        }
        if (this._resultString == null) {
            return !this._hasSegments ? this._currentSegment == null ? NO_CHARS : this._currentSegment : contentsAsArray();
        }
        char[] charArray = this._resultString.toCharArray();
        this._resultArray = charArray;
        return charArray;
    }

    public String contentsAsString() throws IOException {
        if (this._resultString == null) {
            if (this._resultArray != null) {
                this._resultString = new String(this._resultArray);
            } else if (this._inputStart < 0) {
                int i = this._segmentSize;
                int i2 = this._currentSize;
                if (i != 0) {
                    int i3 = i + i2;
                    if (i3 < 0) {
                        _reportBufferOverflow(i, i2);
                    }
                    validateStringLength(i3);
                    StringBuilder sb = new StringBuilder(i3);
                    if (this._segments != null) {
                        int size = this._segments.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            char[] cArr = this._segments.get(i4);
                            sb.append(cArr, 0, cArr.length);
                        }
                    }
                    sb.append(this._currentSegment, 0, this._currentSize);
                    this._resultString = sb.toString();
                } else if (i2 == 0) {
                    this._resultString = JsonProperty.USE_DEFAULT_NAME;
                } else {
                    validateStringLength(i2);
                    this._resultString = new String(this._currentSegment, 0, i2);
                }
            } else {
                if (this._inputLen < 1) {
                    this._resultString = JsonProperty.USE_DEFAULT_NAME;
                    return JsonProperty.USE_DEFAULT_NAME;
                }
                validateStringLength(this._inputLen);
                this._resultString = new String(this._inputBuffer, this._inputStart, this._inputLen);
            }
        }
        return this._resultString;
    }

    public char[] contentsAsArray() throws IOException {
        char[] cArr = this._resultArray;
        if (cArr == null) {
            char[] resultArray = resultArray();
            cArr = resultArray;
            this._resultArray = resultArray;
        }
        return cArr;
    }

    public double contentsAsDouble(boolean z) throws NumberFormatException {
        try {
            return NumberInput.parseDouble(contentsAsString(), z);
        } catch (IOException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @Deprecated
    public double contentsAsDouble() throws NumberFormatException {
        return contentsAsDouble(false);
    }

    @Deprecated
    public float contentsAsFloat() throws NumberFormatException {
        return contentsAsFloat(false);
    }

    public float contentsAsFloat(boolean z) throws NumberFormatException {
        try {
            return NumberInput.parseFloat(contentsAsString(), z);
        } catch (IOException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @Deprecated
    public BigDecimal contentsAsDecimal() throws NumberFormatException {
        try {
            return NumberInput.parseBigDecimal(contentsAsArray());
        } catch (IOException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public int contentsAsInt(boolean z) {
        return (this._inputStart < 0 || this._inputBuffer == null) ? z ? -NumberInput.parseInt(this._currentSegment, 1, this._currentSize - 1) : NumberInput.parseInt(this._currentSegment, 0, this._currentSize) : z ? -NumberInput.parseInt(this._inputBuffer, this._inputStart + 1, this._inputLen - 1) : NumberInput.parseInt(this._inputBuffer, this._inputStart, this._inputLen);
    }

    public long contentsAsLong(boolean z) {
        return (this._inputStart < 0 || this._inputBuffer == null) ? z ? -NumberInput.parseLong(this._currentSegment, 1, this._currentSize - 1) : NumberInput.parseLong(this._currentSegment, 0, this._currentSize) : z ? -NumberInput.parseLong(this._inputBuffer, this._inputStart + 1, this._inputLen - 1) : NumberInput.parseLong(this._inputBuffer, this._inputStart, this._inputLen);
    }

    public int contentsToWriter(Writer writer) throws IOException {
        if (this._resultArray != null) {
            writer.write(this._resultArray);
            return this._resultArray.length;
        }
        if (this._resultString != null) {
            writer.write(this._resultString);
            return this._resultString.length();
        }
        if (this._inputStart >= 0) {
            int i = this._inputLen;
            if (i > 0) {
                writer.write(this._inputBuffer, this._inputStart, i);
            }
            return i;
        }
        int i2 = 0;
        if (this._segments != null) {
            int size = this._segments.size();
            for (int i3 = 0; i3 < size; i3++) {
                char[] cArr = this._segments.get(i3);
                int length = cArr.length;
                i2 += length;
                writer.write(cArr, 0, length);
            }
        }
        int i4 = this._currentSize;
        if (i4 > 0) {
            i2 += i4;
            writer.write(this._currentSegment, 0, i4);
        }
        return i2;
    }

    public void ensureNotShared() {
        if (this._inputStart >= 0) {
            unshare(16);
        }
    }

    public void append(char c) throws IOException {
        if (this._inputStart >= 0) {
            unshare(16);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        if (this._currentSize >= cArr.length) {
            validateAppend(1);
            expand();
            cArr = this._currentSegment;
        }
        int i = this._currentSize;
        this._currentSize = i + 1;
        cArr[i] = c;
    }

    public void append(char[] cArr, int i, int i2) throws IOException {
        if (this._inputStart >= 0) {
            unshare(i2);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr2 = this._currentSegment;
        int length = cArr2.length - this._currentSize;
        if (length >= i2) {
            System.arraycopy(cArr, i, cArr2, this._currentSize, i2);
            this._currentSize += i2;
            return;
        }
        validateAppend(i2);
        if (length > 0) {
            System.arraycopy(cArr, i, cArr2, this._currentSize, length);
            i += length;
            i2 -= length;
        }
        do {
            expand();
            int min = Math.min(this._currentSegment.length, i2);
            System.arraycopy(cArr, i, this._currentSegment, 0, min);
            this._currentSize += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public void append(String str, int i, int i2) throws IOException {
        if (this._inputStart >= 0) {
            unshare(i2);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        int length = cArr.length - this._currentSize;
        if (length >= i2) {
            str.getChars(i, i + i2, cArr, this._currentSize);
            this._currentSize += i2;
            return;
        }
        validateAppend(i2);
        if (length > 0) {
            str.getChars(i, i + length, cArr, this._currentSize);
            i2 -= length;
            i += length;
        }
        do {
            expand();
            int min = Math.min(this._currentSegment.length, i2);
            str.getChars(i, i + min, this._currentSegment, 0);
            this._currentSize += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private void validateAppend(int i) throws IOException {
        int i2 = this._segmentSize + this._currentSize + i;
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        validateStringLength(i2);
    }

    public char[] getCurrentSegment() {
        if (this._inputStart >= 0) {
            unshare(1);
        } else {
            char[] cArr = this._currentSegment;
            if (cArr == null) {
                this._currentSegment = buf(0);
            } else if (this._currentSize >= cArr.length) {
                expand();
            }
        }
        return this._currentSegment;
    }

    public char[] emptyAndGetCurrentSegment() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        char[] cArr = this._currentSegment;
        if (cArr == null) {
            char[] buf = buf(0);
            cArr = buf;
            this._currentSegment = buf;
        }
        return cArr;
    }

    public int getCurrentSegmentSize() {
        return this._currentSize;
    }

    public void setCurrentLength(int i) {
        this._currentSize = i;
    }

    public String setCurrentAndReturn(int i) throws IOException {
        this._currentSize = i;
        if (this._segmentSize > 0) {
            return contentsAsString();
        }
        int i2 = this._currentSize;
        validateStringLength(i2);
        String str = i2 == 0 ? JsonProperty.USE_DEFAULT_NAME : new String(this._currentSegment, 0, i2);
        this._resultString = str;
        return str;
    }

    public char[] finishCurrentSegment() throws IOException {
        if (this._segments == null) {
            this._segments = new ArrayList<>();
        }
        this._hasSegments = true;
        this._segments.add(this._currentSegment);
        int length = this._currentSegment.length;
        this._segmentSize += length;
        if (this._segmentSize < 0) {
            _reportBufferOverflow(this._segmentSize - length, length);
        }
        this._currentSize = 0;
        validateStringLength(this._segmentSize);
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > MAX_SEGMENT_LEN) {
            i = MAX_SEGMENT_LEN;
        }
        char[] carr = carr(i);
        this._currentSegment = carr;
        return carr;
    }

    public String finishAndReturn(int i, boolean z) throws IOException {
        int i2;
        if (z && ((i2 = i - 1) < 0 || this._currentSegment[i2] <= ' ')) {
            return _doTrim(i2);
        }
        this._currentSize = i;
        return contentsAsString();
    }

    private String _doTrim(int i) throws IOException {
        while (true) {
            char[] cArr = this._currentSegment;
            do {
                i--;
                if (i < 0) {
                    if (this._segments == null || this._segments.isEmpty()) {
                        break;
                    }
                    this._currentSegment = this._segments.remove(this._segments.size() - 1);
                    i = this._currentSegment.length;
                }
            } while (cArr[i] <= ' ');
            this._currentSize = i + 1;
            return contentsAsString();
        }
        this._currentSize = 0;
        this._hasSegments = false;
        return contentsAsString();
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i = length + (length >> 1);
        if (i > MAX_SEGMENT_LEN) {
            i = length + (length >> 2);
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this._currentSegment = copyOf;
        return copyOf;
    }

    public char[] expandCurrentSegment(int i) {
        char[] cArr = this._currentSegment;
        if (cArr.length >= i) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this._currentSegment = copyOf;
        return copyOf;
    }

    public String toString() {
        try {
            return contentsAsString();
        } catch (IOException e) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    private void unshare(int i) {
        int i2 = this._inputLen;
        this._inputLen = 0;
        char[] cArr = this._inputBuffer;
        this._inputBuffer = null;
        int i3 = this._inputStart;
        this._inputStart = -1;
        int i4 = i2 + i;
        if (this._currentSegment == null || i4 > this._currentSegment.length) {
            this._currentSegment = buf(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this._currentSegment, 0, i2);
        }
        this._segmentSize = 0;
        this._currentSize = i2;
    }

    private void expand() {
        if (this._segments == null) {
            this._segments = new ArrayList<>();
        }
        char[] cArr = this._currentSegment;
        this._hasSegments = true;
        this._segments.add(cArr);
        this._segmentSize += cArr.length;
        if (this._segmentSize < 0) {
            _reportBufferOverflow(this._segmentSize - cArr.length, cArr.length);
        }
        this._currentSize = 0;
        int length = cArr.length;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > MAX_SEGMENT_LEN) {
            i = MAX_SEGMENT_LEN;
        }
        this._currentSegment = carr(i);
    }

    private char[] resultArray() throws IOException {
        if (this._resultString != null) {
            return this._resultString.toCharArray();
        }
        if (this._inputStart >= 0) {
            int i = this._inputLen;
            if (i < 1) {
                return NO_CHARS;
            }
            validateStringLength(i);
            int i2 = this._inputStart;
            return i2 == 0 ? Arrays.copyOf(this._inputBuffer, i) : Arrays.copyOfRange(this._inputBuffer, i2, i2 + i);
        }
        int size = size();
        if (size < 1) {
            if (size < 0) {
                _reportBufferOverflow(this._segmentSize, this._currentSize);
            }
            return NO_CHARS;
        }
        validateStringLength(size);
        int i3 = 0;
        char[] carr = carr(size);
        if (this._segments != null) {
            int size2 = this._segments.size();
            for (int i4 = 0; i4 < size2; i4++) {
                char[] cArr = this._segments.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, carr, i3, length);
                i3 += length;
            }
        }
        System.arraycopy(this._currentSegment, 0, carr, i3, this._currentSize);
        return carr;
    }

    private char[] carr(int i) {
        return new char[i];
    }

    protected void _reportBufferOverflow(int i, int i2) {
        throw new IllegalStateException("TextBuffer overrun: size reached (" + (i + i2) + ") exceeds maximum of 2147483647");
    }

    protected void validateStringLength(int i) throws IOException {
    }
}
