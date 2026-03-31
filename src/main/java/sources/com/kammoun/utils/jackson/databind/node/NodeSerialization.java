package com.kammoun.utils.jackson.databind.node;

import com.kammoun.utils.jackson.core.util.ByteArrayBuilder;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class NodeSerialization implements Serializable, Externalizable {
    protected static final int LONGEST_EAGER_ALLOC = 100000;
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }

    protected Object readResolve() {
        try {
            return InternalNodeMapper.bytesToNode(this.json);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e.getMessage(), e);
        }
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(InternalNodeMapper.valueToBytes(obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e.getMessage(), e);
        }
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        this.json = _read(objectInput, objectInput.readInt());
    }

    private byte[] _read(ObjectInput objectInput, int i) throws IOException {
        if (i <= LONGEST_EAGER_ALLOC) {
            byte[] bArr = new byte[i];
            objectInput.readFully(bArr, 0, i);
            return bArr;
        }
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(LONGEST_EAGER_ALLOC);
        Throwable th = null;
        try {
            try {
                byte[] resetAndGetFirstSegment = byteArrayBuilder.resetAndGetFirstSegment();
                int i2 = 0;
                while (true) {
                    int min = Math.min(resetAndGetFirstSegment.length - i2, i);
                    objectInput.readFully(resetAndGetFirstSegment, 0, min);
                    i -= min;
                    i2 += min;
                    if (i == 0) {
                        break;
                    }
                    if (i2 == resetAndGetFirstSegment.length) {
                        resetAndGetFirstSegment = byteArrayBuilder.finishCurrentSegment();
                        i2 = 0;
                    }
                }
                byte[] completeAndCoalesce = byteArrayBuilder.completeAndCoalesce(i2);
                if (byteArrayBuilder != null) {
                    if (0 != 0) {
                        try {
                            byteArrayBuilder.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    } else {
                        byteArrayBuilder.close();
                    }
                }
                return completeAndCoalesce;
            } finally {
            }
        } catch (Throwable th3) {
            if (byteArrayBuilder != null) {
                if (th != null) {
                    try {
                        byteArrayBuilder.close();
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                } else {
                    byteArrayBuilder.close();
                }
            }
            throw th3;
        }
    }
}
