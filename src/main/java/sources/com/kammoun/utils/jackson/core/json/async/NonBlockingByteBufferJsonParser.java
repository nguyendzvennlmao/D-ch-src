package com.kammoun.utils.jackson.core.json.async;

import com.kammoun.utils.jackson.core.async.ByteBufferFeeder;
import com.kammoun.utils.jackson.core.async.NonBlockingInputFeeder;
import com.kammoun.utils.jackson.core.io.IOContext;
import com.kammoun.utils.jackson.core.sym.ByteQuadsCanonicalizer;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class NonBlockingByteBufferJsonParser extends NonBlockingUtf8JsonParserBase implements ByteBufferFeeder {
    private ByteBuffer _inputBuffer;

    public NonBlockingByteBufferJsonParser(IOContext iOContext, int i, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i, byteQuadsCanonicalizer);
        this._inputBuffer = ByteBuffer.wrap(NO_BYTES);
    }

    @Override
    public NonBlockingInputFeeder getNonBlockingInputFeeder() {
        return this;
    }

    @Override
    public void feedInput(ByteBuffer byteBuffer) throws IOException {
        if (this._inputPtr < this._inputEnd) {
            _reportError("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(this._inputEnd - this._inputPtr));
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        if (limit < position) {
            _reportError("Input end (%d) may not be before start (%d)", Integer.valueOf(limit), Integer.valueOf(position));
        }
        if (this._endOfInput) {
            _reportError("Already closed, can not feed more input");
        }
        this._currInputProcessed += this._origBufferLen;
        streamReadConstraints().validateDocumentLength(this._currInputProcessed);
        this._currInputRowStart = position - (this._inputEnd - this._currInputRowStart);
        this._currBufferStart = position;
        this._inputBuffer = byteBuffer;
        this._inputPtr = position;
        this._inputEnd = limit;
        this._origBufferLen = limit - position;
    }

    @Override
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd - this._inputPtr;
        if (i > 0) {
            Channels.newChannel(outputStream).write(this._inputBuffer);
        }
        return i;
    }

    @Override
    protected byte getNextSignedByteFromBuffer() {
        ByteBuffer byteBuffer = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return byteBuffer.get(i);
    }

    @Override
    protected int getNextUnsignedByteFromBuffer() {
        ByteBuffer byteBuffer = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return byteBuffer.get(i) & 255;
    }

    @Override
    protected byte getByteFromBuffer(int i) {
        return this._inputBuffer.get(i);
    }
}
