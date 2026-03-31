package com.kammoun.utils.jackson.core.io;

import com.kammoun.utils.jackson.core.SerializableString;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class SerializedString implements SerializableString, Serializable {
    private static final long serialVersionUID = 1;
    private static final JsonStringEncoder JSON_ENCODER = JsonStringEncoder.getInstance();
    protected final String _value;
    protected byte[] _quotedUTF8Ref;
    protected byte[] _unquotedUTF8Ref;
    protected char[] _quotedChars;
    protected transient String _jdkSerializeValue;

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this._value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    protected Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    @Override
    public final String getValue() {
        return this._value;
    }

    @Override
    public final int charLength() {
        return this._value.length();
    }

    @Override
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr == null) {
            char[] quoteAsString = JSON_ENCODER.quoteAsString(this._value);
            cArr = quoteAsString;
            this._quotedChars = quoteAsString;
        }
        return cArr;
    }

    @Override
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr == null) {
            byte[] quoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            bArr = quoteAsUTF8;
            this._quotedUTF8Ref = quoteAsUTF8;
        }
        return bArr;
    }

    @Override
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr == null) {
            byte[] encodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            bArr = encodeAsUTF8;
            this._unquotedUTF8Ref = encodeAsUTF8;
        }
        return bArr;
    }

    @Override
    public int appendQuoted(char[] cArr, int i) {
        char[] cArr2 = this._quotedChars;
        if (cArr2 == null) {
            char[] quoteAsString = JSON_ENCODER.quoteAsString(this._value);
            cArr2 = quoteAsString;
            this._quotedChars = quoteAsString;
        }
        int length = cArr2.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i, length);
        return length;
    }

    @Override
    public int appendQuotedUTF8(byte[] bArr, int i) {
        byte[] bArr2 = this._quotedUTF8Ref;
        if (bArr2 == null) {
            byte[] quoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            bArr2 = quoteAsUTF8;
            this._quotedUTF8Ref = quoteAsUTF8;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    @Override
    public int appendUnquoted(char[] cArr, int i) {
        String str = this._value;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    @Override
    public int appendUnquotedUTF8(byte[] bArr, int i) {
        byte[] bArr2 = this._unquotedUTF8Ref;
        if (bArr2 == null) {
            byte[] encodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            bArr2 = encodeAsUTF8;
            this._unquotedUTF8Ref = encodeAsUTF8;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    @Override
    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr == null) {
            byte[] quoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            bArr = quoteAsUTF8;
            this._quotedUTF8Ref = quoteAsUTF8;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }

    @Override
    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr == null) {
            byte[] encodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            bArr = encodeAsUTF8;
            this._unquotedUTF8Ref = encodeAsUTF8;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }

    @Override
    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr == null) {
            byte[] quoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
            bArr = quoteAsUTF8;
            this._quotedUTF8Ref = quoteAsUTF8;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }

    @Override
    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr == null) {
            byte[] encodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
            bArr = encodeAsUTF8;
            this._unquotedUTF8Ref = encodeAsUTF8;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }

    public final String toString() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }
}
