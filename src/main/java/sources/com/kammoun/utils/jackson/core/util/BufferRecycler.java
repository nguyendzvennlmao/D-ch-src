package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.util.RecyclerPool;
import com.kammoun.utils.jackson.databind.deser.DeserializerCache;
import com.kammoun.utils.jackson.databind.type.TypeFactory;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class BufferRecycler implements RecyclerPool.WithPool<BufferRecycler> {
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    public static final int CHAR_TOKEN_BUFFER = 0;
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, DeserializerCache.DEFAULT_MAX_CACHE_SIZE, DeserializerCache.DEFAULT_MAX_CACHE_SIZE};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, TypeFactory.DEFAULT_MAX_CACHE_SIZE, TypeFactory.DEFAULT_MAX_CACHE_SIZE};
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;
    private RecyclerPool<BufferRecycler> _pool;

    public interface Gettable {
        BufferRecycler bufferRecycler();
    }

    public BufferRecycler() {
        this(4, 4);
    }

    protected BufferRecycler(int i, int i2) {
        this._byteBuffers = new AtomicReferenceArray<>(i);
        this._charBuffers = new AtomicReferenceArray<>(i2);
    }

    public boolean isLinkedWithPool() {
        return this._pool != null;
    }

    public final byte[] allocByteBuffer(int i) {
        return allocByteBuffer(i, 0);
    }

    public byte[] allocByteBuffer(int i, int i2) {
        int byteBufferLength = byteBufferLength(i);
        if (i2 < byteBufferLength) {
            i2 = byteBufferLength;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i, null);
        if (andSet == null || andSet.length < i2) {
            andSet = balloc(i2);
        }
        return andSet;
    }

    public void releaseByteBuffer(int i, byte[] bArr) {
        byte[] bArr2 = this._byteBuffers.get(i);
        if (bArr2 == null || bArr.length > bArr2.length) {
            this._byteBuffers.set(i, bArr);
        }
    }

    public final char[] allocCharBuffer(int i) {
        return allocCharBuffer(i, 0);
    }

    public char[] allocCharBuffer(int i, int i2) {
        int charBufferLength = charBufferLength(i);
        if (i2 < charBufferLength) {
            i2 = charBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i, null);
        if (andSet == null || andSet.length < i2) {
            andSet = calloc(i2);
        }
        return andSet;
    }

    public void releaseCharBuffer(int i, char[] cArr) {
        char[] cArr2 = this._charBuffers.get(i);
        if (cArr2 == null || cArr.length > cArr2.length) {
            this._charBuffers.set(i, cArr);
        }
    }

    protected int byteBufferLength(int i) {
        return BYTE_BUFFER_LENGTHS[i];
    }

    protected int charBufferLength(int i) {
        return CHAR_BUFFER_LENGTHS[i];
    }

    protected byte[] balloc(int i) {
        return new byte[i];
    }

    protected char[] calloc(int i) {
        return new char[i];
    }

    @Override
    public BufferRecycler withPool(RecyclerPool<BufferRecycler> recyclerPool) {
        if (this._pool != null) {
            throw new IllegalStateException("BufferRecycler already linked to pool: " + recyclerPool);
        }
        this._pool = (RecyclerPool) Objects.requireNonNull(recyclerPool);
        return this;
    }

    @Override
    public void releaseToPool() {
        if (this._pool != null) {
            RecyclerPool<BufferRecycler> recyclerPool = this._pool;
            this._pool = null;
            recyclerPool.releasePooled(this);
        }
    }
}
