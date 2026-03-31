package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.base.GeneratorBase;
import com.kammoun.utils.jackson.core.io.doubleparser.FastDoubleMath;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class UTF32Reader extends Reader {
    protected static final int LAST_VALID_UNICODE_CHAR = 1114111;
    protected static final char NC = 0;
    protected final IOContext _context;
    protected InputStream _in;
    protected byte[] _buffer;
    protected int _ptr;
    protected int _length;
    protected final boolean _bigEndian;
    protected char _surrogate = 0;
    protected int _charCount;
    protected int _byteCount;
    protected final boolean _managedBuffers;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i;
        this._length = i2;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null;
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    @Override
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    @Override
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        if (this._buffer == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            reportBounds(cArr, i, i2);
        }
        int i5 = i;
        int i6 = i2 + i;
        if (this._surrogate != 0) {
            i5++;
            cArr[i5] = this._surrogate;
            this._surrogate = (char) 0;
        } else {
            int i7 = this._length - this._ptr;
            if (i7 < 4 && !loadMore(i7)) {
                if (i7 == 0) {
                    return -1;
                }
                reportUnexpectedEOF(this._length - this._ptr, 4);
            }
        }
        int i8 = this._length - 4;
        while (true) {
            if (i5 >= i6 || this._ptr > i8) {
                break;
            }
            int i9 = this._ptr;
            if (this._bigEndian) {
                i4 = (this._buffer[i9] << 8) | (this._buffer[i9 + 1] & 255);
                i3 = ((this._buffer[i9 + 2] & 255) << 8) | (this._buffer[i9 + 3] & 255);
            } else {
                i3 = (this._buffer[i9] & 255) | ((this._buffer[i9 + 1] & 255) << 8);
                i4 = (this._buffer[i9 + 2] & 255) | (this._buffer[i9 + 3] << 8);
            }
            this._ptr += 4;
            if (i4 != 0) {
                int i10 = i4 & 65535;
                int i11 = ((i10 - 1) << 16) | i3;
                if (i10 > 16) {
                    reportInvalid(i11, i5 - i, String.format(" (above 0x%08x)", Integer.valueOf(LAST_VALID_UNICODE_CHAR)));
                }
                int i12 = i5;
                i5++;
                cArr[i12] = (char) (GeneratorBase.SURR1_FIRST + (i11 >> 10));
                i3 = 56320 | (i11 & FastDoubleMath.DOUBLE_EXPONENT_BIAS);
                if (i5 >= i6) {
                    this._surrogate = (char) i11;
                    break;
                }
            }
            int i13 = i5;
            i5++;
            cArr[i13] = (char) i3;
        }
        int i14 = i5 - i;
        this._charCount += i14;
        return i14;
    }

    private void reportUnexpectedEOF(int i, int i2) throws IOException {
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this._charCount + ", byte #" + (this._byteCount + i) + ")");
    }

    private void reportInvalid(int i, int i2, String str) throws IOException {
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i) + str + " at char #" + (this._charCount + i2) + ", byte #" + ((this._byteCount + this._ptr) - 1) + ")");
    }

    private boolean loadMore(int i) throws IOException {
        if (this._in == null || this._buffer == null) {
            return false;
        }
        this._byteCount += this._length - i;
        if (i > 0) {
            if (this._ptr > 0) {
                System.arraycopy(this._buffer, this._ptr, this._buffer, 0, i);
                this._ptr = 0;
            }
            this._length = i;
        } else {
            this._ptr = 0;
            int read = this._in.read(this._buffer);
            if (read < 1) {
                this._length = 0;
                if (read < 0) {
                    if (!this._managedBuffers) {
                        return false;
                    }
                    freeBuffers();
                    return false;
                }
                reportStrangeStream();
            }
            this._length = read;
        }
        while (this._length < 4) {
            int read2 = this._in.read(this._buffer, this._length, this._buffer.length - this._length);
            if (read2 < 1) {
                if (read2 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += read2;
        }
        return true;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            if (this._context != null) {
                this._context.releaseReadIOBuffer(bArr);
            }
        }
    }

    private void reportBounds(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)));
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }
}
