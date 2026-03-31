package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.util.BufferRecycler;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

public final class ByteArrayBuilder extends OutputStream implements BufferRecycler.Gettable {
    public static final byte[] NO_BYTES = new byte[0];
    private static final int INITIAL_BLOCK_SIZE = 500;
    private static final int MAX_BLOCK_SIZE = 131072;
    static final int DEFAULT_BLOCK_ARRAY_SIZE = 40;
    private final BufferRecycler _bufferRecycler;
    private final LinkedList<byte[]> _pastBlocks;
    private int _pastLen;
    private byte[] _currBlock;
    private int _currBlockPtr;

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    public ByteArrayBuilder(int i) {
        this(null, i);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = bufferRecycler;
        this._currBlock = bufferRecycler == null ? new byte[i > MAX_BLOCK_SIZE ? MAX_BLOCK_SIZE : i] : bufferRecycler.allocByteBuffer(2);
    }

    private ByteArrayBuilder(BufferRecycler bufferRecycler, byte[] bArr, int i) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = bufferRecycler;
        this._currBlock = bArr;
        this._currBlockPtr = i;
    }

    public static ByteArrayBuilder fromInitial(byte[] bArr, int i) {
        return new ByteArrayBuilder(null, bArr, i);
    }

    public void reset() {
        this._pastLen = 0;
        this._currBlockPtr = 0;
        if (this._pastBlocks.isEmpty()) {
            return;
        }
        this._pastBlocks.clear();
    }

    public int size() {
        return this._pastLen + this._currBlockPtr;
    }

    public void release() {
        reset();
        if (this._bufferRecycler == null || this._currBlock == null) {
            return;
        }
        this._bufferRecycler.releaseByteBuffer(2, this._currBlock);
        this._currBlock = null;
    }

    public void append(int i) {
        if (this._currBlockPtr >= this._currBlock.length) {
            _allocMore();
        }
        byte[] bArr = this._currBlock;
        int i2 = this._currBlockPtr;
        this._currBlockPtr = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void appendTwoBytes(int i) {
        if (this._currBlockPtr + 1 >= this._currBlock.length) {
            append(i >> 8);
            append(i);
            return;
        }
        byte[] bArr = this._currBlock;
        int i2 = this._currBlockPtr;
        this._currBlockPtr = i2 + 1;
        bArr[i2] = (byte) (i >> 8);
        byte[] bArr2 = this._currBlock;
        int i3 = this._currBlockPtr;
        this._currBlockPtr = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public void appendThreeBytes(int i) {
        if (this._currBlockPtr + 2 >= this._currBlock.length) {
            append(i >> 16);
            append(i >> 8);
            append(i);
            return;
        }
        byte[] bArr = this._currBlock;
        int i2 = this._currBlockPtr;
        this._currBlockPtr = i2 + 1;
        bArr[i2] = (byte) (i >> 16);
        byte[] bArr2 = this._currBlock;
        int i3 = this._currBlockPtr;
        this._currBlockPtr = i3 + 1;
        bArr2[i3] = (byte) (i >> 8);
        byte[] bArr3 = this._currBlock;
        int i4 = this._currBlockPtr;
        this._currBlockPtr = i4 + 1;
        bArr3[i4] = (byte) i;
    }

    public void appendFourBytes(int i) {
        if (this._currBlockPtr + 3 >= this._currBlock.length) {
            append(i >> 24);
            append(i >> 16);
            append(i >> 8);
            append(i);
            return;
        }
        byte[] bArr = this._currBlock;
        int i2 = this._currBlockPtr;
        this._currBlockPtr = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        byte[] bArr2 = this._currBlock;
        int i3 = this._currBlockPtr;
        this._currBlockPtr = i3 + 1;
        bArr2[i3] = (byte) (i >> 16);
        byte[] bArr3 = this._currBlock;
        int i4 = this._currBlockPtr;
        this._currBlockPtr = i4 + 1;
        bArr3[i4] = (byte) (i >> 8);
        byte[] bArr4 = this._currBlock;
        int i5 = this._currBlockPtr;
        this._currBlockPtr = i5 + 1;
        bArr4[i5] = (byte) i;
    }

    public byte[] toByteArray() {
        int i = this._pastLen + this._currBlockPtr;
        if (i == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        Iterator<byte[]> it = this._pastBlocks.iterator();
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this._currBlock, 0, bArr, i2, this._currBlockPtr);
        int i3 = i2 + this._currBlockPtr;
        if (i3 != i) {
            throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
        }
        if (!this._pastBlocks.isEmpty()) {
            reset();
        }
        return bArr;
    }

    public byte[] getClearAndRelease() {
        byte[] byteArray = toByteArray();
        release();
        return byteArray;
    }

    @Override
    public BufferRecycler bufferRecycler() {
        return this._bufferRecycler;
    }

    public byte[] resetAndGetFirstSegment() {
        reset();
        return this._currBlock;
    }

    public byte[] finishCurrentSegment() {
        _allocMore();
        return this._currBlock;
    }

    public byte[] completeAndCoalesce(int i) {
        this._currBlockPtr = i;
        return toByteArray();
    }

    public byte[] getCurrentSegment() {
        return this._currBlock;
    }

    public void setCurrentSegmentLength(int i) {
        this._currBlockPtr = i;
    }

    public int getCurrentSegmentLength() {
        return this._currBlockPtr;
    }

    @Override
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int min = Math.min(this._currBlock.length - this._currBlockPtr, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, this._currBlock, this._currBlockPtr, min);
                i += min;
                this._currBlockPtr += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            } else {
                _allocMore();
            }
        }
    }

    @Override
    public void write(int i) {
        append(i);
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    private void _allocMore() {
        int length = this._pastLen + this._currBlock.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this._pastLen = length;
        int max = Math.max(this._pastLen >> 1, 1000);
        if (max > MAX_BLOCK_SIZE) {
            max = MAX_BLOCK_SIZE;
        }
        this._pastBlocks.add(this._currBlock);
        this._currBlock = new byte[max];
        this._currBlockPtr = 0;
    }
}
