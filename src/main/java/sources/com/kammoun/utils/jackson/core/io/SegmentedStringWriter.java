package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.util.BufferRecycler;
import com.kammoun.utils.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.Writer;

public final class SegmentedStringWriter extends Writer implements BufferRecycler.Gettable {
    private final TextBuffer _buffer;

    public SegmentedStringWriter(BufferRecycler bufferRecycler) {
        this._buffer = new TextBuffer(bufferRecycler);
    }

    @Override
    public BufferRecycler bufferRecycler() {
        return this._buffer.bufferRecycler();
    }

    @Override
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence) throws IOException {
        String charSequence2 = charSequence.toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this._buffer.append(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void write(char[] cArr) throws IOException {
        this._buffer.append(cArr, 0, cArr.length);
    }

    @Override
    public void write(char[] cArr, int i, int i2) throws IOException {
        this._buffer.append(cArr, i, i2);
    }

    @Override
    public void write(int i) throws IOException {
        this._buffer.append((char) i);
    }

    @Override
    public void write(String str) throws IOException {
        this._buffer.append(str, 0, str.length());
    }

    @Override
    public void write(String str, int i, int i2) throws IOException {
        this._buffer.append(str, i, i2);
    }

    public String getAndClear() throws IOException {
        String contentsAsString = this._buffer.contentsAsString();
        this._buffer.releaseBuffers();
        return contentsAsString;
    }
}
