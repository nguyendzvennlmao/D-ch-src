package org.erdtman.jcs;

import com.kammoun.utils.jackson.core.JsonFactory;
import com.kammoun.utils.jackson.databind.deser.std.StdKeyDeserializer;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class JsonCanonicalizer {
    StringBuilder buffer;

    public JsonCanonicalizer(String str) throws IOException {
        this.buffer = new StringBuilder();
        serialize(new JsonDecoder(str).root);
    }

    public JsonCanonicalizer(byte[] bArr) throws IOException {
        this(new String(bArr, "utf-8"));
    }

    private void escape(char c) {
        this.buffer.append('\\').append(c);
    }

    private void serializeString(String str) {
        this.buffer.append('\"');
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            char c = charArray[i];
            switch (c) {
                case '\b':
                    escape('b');
                    break;
                case '\t':
                    escape('t');
                    break;
                case '\n':
                    escape('n');
                    break;
                case '\f':
                    escape('f');
                    break;
                case StdKeyDeserializer.TYPE_URI:
                    escape('r');
                    break;
                case JsonFactory.DEFAULT_QUOTE_CHAR:
                case '\\':
                    escape(c);
                    break;
                default:
                    if (c < ' ') {
                        escape('u');
                        for (int i2 = 0; i2 < 4; i2++) {
                            int i3 = c >>> '\f';
                            this.buffer.append((char) (i3 > 9 ? (i3 + 97) - 10 : i3 + 48));
                            c = (char) (c << 4);
                        }
                        break;
                    } else {
                        this.buffer.append(c);
                        break;
                    }
            }
        }
        this.buffer.append('\"');
    }

    void serialize(Object obj) throws IOException {
        if (obj instanceof TreeMap) {
            this.buffer.append('{');
            boolean z = false;
            for (Map.Entry entry : ((TreeMap) obj).entrySet()) {
                if (z) {
                    this.buffer.append(',');
                }
                z = true;
                serializeString((String) entry.getKey());
                this.buffer.append(':');
                serialize(entry.getValue());
            }
            this.buffer.append('}');
            return;
        }
        if (!(obj instanceof Vector)) {
            if (obj == null) {
                this.buffer.append("null");
                return;
            }
            if (obj instanceof String) {
                serializeString((String) obj);
                return;
            } else if (obj instanceof Boolean) {
                this.buffer.append((Boolean) obj);
                return;
            } else {
                if (!(obj instanceof Double)) {
                    throw new InternalError("Unknown object: " + obj);
                }
                this.buffer.append(NumberToJSON.serializeNumber(((Double) obj).doubleValue()));
                return;
            }
        }
        this.buffer.append('[');
        boolean z2 = false;
        for (Object obj2 : ((Vector) obj).toArray()) {
            if (z2) {
                this.buffer.append(',');
            }
            z2 = true;
            serialize(obj2);
        }
        this.buffer.append(']');
    }

    public String getEncodedString() {
        return this.buffer.toString();
    }

    public byte[] getEncodedUTF8() throws IOException {
        return getEncodedString().getBytes("utf-8");
    }
}
