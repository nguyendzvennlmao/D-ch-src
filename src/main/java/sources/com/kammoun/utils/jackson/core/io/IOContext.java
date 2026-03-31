package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.ErrorReportConfiguration;
import com.kammoun.utils.jackson.core.JsonEncoding;
import com.kammoun.utils.jackson.core.StreamReadConstraints;
import com.kammoun.utils.jackson.core.StreamWriteConstraints;
import com.kammoun.utils.jackson.core.util.BufferRecycler;
import com.kammoun.utils.jackson.core.util.ReadConstrainedTextBuffer;
import com.kammoun.utils.jackson.core.util.TextBuffer;

public class IOContext implements AutoCloseable {
    protected final ContentReference _contentReference;

    @Deprecated
    protected final Object _sourceRef;
    protected JsonEncoding _encoding;
    protected final boolean _managedResource;
    protected final BufferRecycler _bufferRecycler;
    protected boolean _releaseRecycler;
    protected final StreamReadConstraints _streamReadConstraints;
    protected final StreamWriteConstraints _streamWriteConstraints;
    protected final ErrorReportConfiguration _errorReportConfiguration;
    protected byte[] _readIOBuffer;
    protected byte[] _writeEncodingBuffer;
    protected byte[] _base64Buffer;
    protected char[] _tokenCBuffer;
    protected char[] _concatCBuffer;
    protected char[] _nameCopyBuffer;
    private boolean _closed;

    public IOContext(StreamReadConstraints streamReadConstraints, StreamWriteConstraints streamWriteConstraints, ErrorReportConfiguration errorReportConfiguration, BufferRecycler bufferRecycler, ContentReference contentReference, boolean z) {
        this._releaseRecycler = true;
        this._closed = false;
        this._streamReadConstraints = streamReadConstraints;
        this._streamWriteConstraints = streamWriteConstraints;
        this._errorReportConfiguration = errorReportConfiguration;
        this._bufferRecycler = bufferRecycler;
        this._contentReference = contentReference;
        this._sourceRef = contentReference.getRawContent();
        this._managedResource = z;
    }

    @Deprecated
    public IOContext(StreamReadConstraints streamReadConstraints, BufferRecycler bufferRecycler, ContentReference contentReference, boolean z) {
        this(streamReadConstraints, StreamWriteConstraints.defaults(), ErrorReportConfiguration.defaults(), bufferRecycler, contentReference, z);
    }

    @Deprecated
    public IOContext(BufferRecycler bufferRecycler, ContentReference contentReference, boolean z) {
        this(StreamReadConstraints.defaults(), StreamWriteConstraints.defaults(), ErrorReportConfiguration.defaults(), bufferRecycler, contentReference, z);
    }

    @Deprecated
    public IOContext(BufferRecycler bufferRecycler, Object obj, boolean z) {
        this(bufferRecycler, ContentReference.rawReference(obj), z);
    }

    public IOContext markBufferRecyclerReleased() {
        this._releaseRecycler = false;
        return this;
    }

    public StreamReadConstraints streamReadConstraints() {
        return this._streamReadConstraints;
    }

    public StreamWriteConstraints streamWriteConstraints() {
        return this._streamWriteConstraints;
    }

    public ErrorReportConfiguration errorReportConfiguration() {
        return this._errorReportConfiguration;
    }

    public void setEncoding(JsonEncoding jsonEncoding) {
        this._encoding = jsonEncoding;
    }

    public IOContext withEncoding(JsonEncoding jsonEncoding) {
        this._encoding = jsonEncoding;
        return this;
    }

    public JsonEncoding getEncoding() {
        return this._encoding;
    }

    public boolean isResourceManaged() {
        return this._managedResource;
    }

    public ContentReference contentReference() {
        return this._contentReference;
    }

    @Deprecated
    public Object getSourceReference() {
        return this._sourceRef;
    }

    public BufferRecycler bufferRecycler() {
        return this._bufferRecycler;
    }

    public TextBuffer constructTextBuffer() {
        return new TextBuffer(this._bufferRecycler);
    }

    public TextBuffer constructReadConstrainedTextBuffer() {
        return new ReadConstrainedTextBuffer(this._streamReadConstraints, this._bufferRecycler);
    }

    public byte[] allocReadIOBuffer() {
        _verifyAlloc(this._readIOBuffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(0);
        this._readIOBuffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public byte[] allocReadIOBuffer(int i) {
        _verifyAlloc(this._readIOBuffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(0, i);
        this._readIOBuffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public byte[] allocWriteEncodingBuffer() {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(1);
        this._writeEncodingBuffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public byte[] allocWriteEncodingBuffer(int i) {
        _verifyAlloc(this._writeEncodingBuffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(1, i);
        this._writeEncodingBuffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public byte[] allocBase64Buffer() {
        _verifyAlloc(this._base64Buffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(3);
        this._base64Buffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public byte[] allocBase64Buffer(int i) {
        _verifyAlloc(this._base64Buffer);
        byte[] allocByteBuffer = this._bufferRecycler.allocByteBuffer(3, i);
        this._base64Buffer = allocByteBuffer;
        return allocByteBuffer;
    }

    public char[] allocTokenBuffer() {
        _verifyAlloc(this._tokenCBuffer);
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(0);
        this._tokenCBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public char[] allocTokenBuffer(int i) {
        _verifyAlloc(this._tokenCBuffer);
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(0, i);
        this._tokenCBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public char[] allocConcatBuffer() {
        _verifyAlloc(this._concatCBuffer);
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(1);
        this._concatCBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public char[] allocNameCopyBuffer(int i) {
        _verifyAlloc(this._nameCopyBuffer);
        char[] allocCharBuffer = this._bufferRecycler.allocCharBuffer(3, i);
        this._nameCopyBuffer = allocCharBuffer;
        return allocCharBuffer;
    }

    public void releaseReadIOBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._readIOBuffer);
            this._readIOBuffer = null;
            this._bufferRecycler.releaseByteBuffer(0, bArr);
        }
    }

    public void releaseWriteEncodingBuffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._writeEncodingBuffer);
            this._writeEncodingBuffer = null;
            this._bufferRecycler.releaseByteBuffer(1, bArr);
        }
    }

    public void releaseBase64Buffer(byte[] bArr) {
        if (bArr != null) {
            _verifyRelease(bArr, this._base64Buffer);
            this._base64Buffer = null;
            this._bufferRecycler.releaseByteBuffer(3, bArr);
        }
    }

    public void releaseTokenBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._tokenCBuffer);
            this._tokenCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(0, cArr);
        }
    }

    public void releaseConcatBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._concatCBuffer);
            this._concatCBuffer = null;
            this._bufferRecycler.releaseCharBuffer(1, cArr);
        }
    }

    public void releaseNameCopyBuffer(char[] cArr) {
        if (cArr != null) {
            _verifyRelease(cArr, this._nameCopyBuffer);
            this._nameCopyBuffer = null;
            this._bufferRecycler.releaseCharBuffer(3, cArr);
        }
    }

    protected final void _verifyAlloc(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void _verifyRelease(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw wrongBuf();
        }
    }

    protected final void _verifyRelease(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw wrongBuf();
        }
    }

    private IllegalArgumentException wrongBuf() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    @Override
    public void close() {
        if (this._closed) {
            return;
        }
        this._closed = true;
        if (this._releaseRecycler) {
            this._releaseRecycler = false;
            this._bufferRecycler.releaseToPool();
        }
    }
}
