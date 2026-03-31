package com.kammoun.utils.jackson.core.io;

import java.io.IOException;
import java.io.InputStream;

public final class MergedStream extends InputStream {
    private final IOContext _ctxt;
    private final InputStream _in;
    private byte[] _b;
    private int _ptr;
    private final int _end;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this._b = bArr;
        this._ptr = i;
        this._end = i2;
    }

    @Override
    public int available() throws IOException {
        return this._b != null ? this._end - this._ptr : this._in.available();
    }

    @Override
    public void close() throws IOException {
        _free();
        this._in.close();
    }

    @Override
    public synchronized void mark(int i) {
        if (this._b == null) {
            this._in.mark(i);
        }
    }

    @Override
    public boolean markSupported() {
        return this._b == null && this._in.markSupported();
    }

    @Override
    public int read() throws IOException {
        if (this._b == null) {
            return this._in.read();
        }
        byte[] bArr = this._b;
        int i = this._ptr;
        this._ptr = i + 1;
        int i2 = bArr[i] & 255;
        if (this._ptr >= this._end) {
            _free();
        }
        return i2;
    }

    @Override
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this._b == null) {
            return this._in.read(bArr, i, i2);
        }
        int i3 = this._end - this._ptr;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this._b, this._ptr, bArr, i, i2);
        this._ptr += i2;
        if (this._ptr >= this._end) {
            _free();
        }
        return i2;
    }

    @Override
    public synchronized void reset() throws IOException {
        if (this._b == null) {
            this._in.reset();
        }
    }

    @Override
    public long skip(long j) throws IOException {
        long j2 = 0;
        if (this._b != null) {
            int i = this._end - this._ptr;
            if (i > j) {
                this._ptr += (int) j;
                return j;
            }
            _free();
            j2 = 0 + i;
            j -= i;
        }
        if (j > 0) {
            j2 += this._in.skip(j);
        }
        return j2;
    }

    private void _free() {
        byte[] bArr = this._b;
        if (bArr != null) {
            this._b = null;
            if (this._ctxt != null) {
                this._ctxt.releaseReadIOBuffer(bArr);
            }
        }
    }
}
