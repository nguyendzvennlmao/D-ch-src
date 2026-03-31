package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import com.kammoun.utils.jackson.core.io.NumberInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class JsonPointer implements Serializable {
    public static final char ESC = '~';
    public static final String ESC_SLASH = "~1";
    public static final String ESC_TILDE = "~0";
    private static final long serialVersionUID = 1;
    public static final char SEPARATOR = '/';
    protected static final JsonPointer EMPTY = new JsonPointer();
    protected final JsonPointer _nextSegment;
    protected volatile JsonPointer _head;
    protected final String _asString;
    protected final int _asStringOffset;
    protected final String _matchingPropertyName;
    protected final int _matchingElementIndex;
    protected int _hashCode;

    public static class PointerParent {
        public final PointerParent parent;
        public final int fullPathOffset;
        public final String segment;

        PointerParent(PointerParent pointerParent, int i, String str) {
            this.parent = pointerParent;
            this.fullPathOffset = i;
            this.segment = str;
        }
    }

    public static class PointerSegment {
        public final PointerSegment next;
        public final String property;
        public final int index;
        public int pathOffset;
        public PointerSegment prev;

        public PointerSegment(PointerSegment pointerSegment, String str, int i) {
            this.next = pointerSegment;
            this.property = str;
            this.index = i;
            if (pointerSegment != null) {
                pointerSegment.prev = this;
            }
        }
    }

    static class Serialization implements Externalizable {
        private String _fullPath;

        public Serialization() {
        }

        Serialization(String str) {
            this._fullPath = str;
        }

        @Override
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this._fullPath);
        }

        @Override
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            this._fullPath = objectInput.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return JsonPointer.compile(this._fullPath);
        }
    }

    protected JsonPointer() {
        this._nextSegment = null;
        this._matchingPropertyName = null;
        this._matchingElementIndex = -1;
        this._asString = JsonProperty.USE_DEFAULT_NAME;
        this._asStringOffset = 0;
    }

    protected JsonPointer(String str, int i, String str2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = _parseIndex(str2);
    }

    protected JsonPointer(String str, int i, String str2, int i2, JsonPointer jsonPointer) {
        this._asString = str;
        this._asStringOffset = i;
        this._nextSegment = jsonPointer;
        this._matchingPropertyName = str2;
        this._matchingElementIndex = i2;
    }

    public static JsonPointer compile(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return EMPTY;
        }
        if (str.charAt(0) != '/') {
            throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
        }
        return _parseTail(str);
    }

    public static JsonPointer valueOf(String str) {
        return compile(str);
    }

    public static JsonPointer empty() {
        return EMPTY;
    }

    public static JsonPointer forPath(JsonStreamContext jsonStreamContext, boolean z) {
        JsonPointer jsonPointer;
        if (jsonStreamContext == null) {
            return EMPTY;
        }
        if (!jsonStreamContext.hasPathSegment() && (!z || !jsonStreamContext.inRoot() || !jsonStreamContext.hasCurrentIndex())) {
            jsonStreamContext = jsonStreamContext.getParent();
        }
        PointerSegment pointerSegment = null;
        int i = 0;
        while (jsonStreamContext != null) {
            if (jsonStreamContext.inObject()) {
                String currentName = jsonStreamContext.getCurrentName();
                if (currentName == null) {
                    currentName = JsonProperty.USE_DEFAULT_NAME;
                }
                i += 2 + currentName.length();
                pointerSegment = new PointerSegment(pointerSegment, currentName, -1);
            } else if (jsonStreamContext.inArray() || z) {
                i += 6;
                pointerSegment = new PointerSegment(pointerSegment, null, jsonStreamContext.getCurrentIndex());
            }
            jsonStreamContext = jsonStreamContext.getParent();
        }
        if (pointerSegment == null) {
            return EMPTY;
        }
        StringBuilder sb = new StringBuilder(i);
        PointerSegment pointerSegment2 = null;
        while (pointerSegment != null) {
            pointerSegment2 = pointerSegment;
            pointerSegment.pathOffset = sb.length();
            sb.append('/');
            if (pointerSegment.property != null) {
                _appendEscaped(sb, pointerSegment.property);
            } else {
                sb.append(pointerSegment.index);
            }
            pointerSegment = pointerSegment.next;
        }
        String sb2 = sb.toString();
        JsonPointer jsonPointer2 = EMPTY;
        for (PointerSegment pointerSegment3 = pointerSegment2; pointerSegment3 != null; pointerSegment3 = pointerSegment3.prev) {
            if (pointerSegment3.property != null) {
                jsonPointer = new JsonPointer(sb2, pointerSegment3.pathOffset, pointerSegment3.property, jsonPointer2);
            } else {
                int i2 = pointerSegment3.index;
                jsonPointer = new JsonPointer(sb2, pointerSegment3.pathOffset, String.valueOf(i2), i2, jsonPointer2);
            }
            jsonPointer2 = jsonPointer;
        }
        return jsonPointer2;
    }

    private static void _appendEscaped(StringBuilder sb, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '/') {
                sb.append(ESC_SLASH);
            } else if (charAt == '~') {
                sb.append(ESC_TILDE);
            } else {
                sb.append(charAt);
            }
        }
    }

    public int length() {
        return this._asString.length() - this._asStringOffset;
    }

    public boolean matches() {
        return this._nextSegment == null;
    }

    public String getMatchingProperty() {
        return this._matchingPropertyName;
    }

    public int getMatchingIndex() {
        return this._matchingElementIndex;
    }

    public boolean mayMatchProperty() {
        return this._matchingPropertyName != null;
    }

    public boolean mayMatchElement() {
        return this._matchingElementIndex >= 0;
    }

    public JsonPointer last() {
        JsonPointer jsonPointer = this;
        if (jsonPointer == EMPTY) {
            return null;
        }
        while (true) {
            JsonPointer jsonPointer2 = jsonPointer._nextSegment;
            if (jsonPointer2 == EMPTY) {
                return jsonPointer;
            }
            jsonPointer = jsonPointer2;
        }
    }

    public JsonPointer append(JsonPointer jsonPointer) {
        if (this == EMPTY) {
            return jsonPointer;
        }
        if (jsonPointer == EMPTY) {
            return this;
        }
        return compile(toString() + jsonPointer.toString());
    }

    public JsonPointer appendProperty(String str) {
        if (str == null) {
            return this;
        }
        StringBuilder append = toStringBuilder(str.length() + 2).append('/');
        _appendEscaped(append, str);
        return compile(append.toString());
    }

    public JsonPointer appendIndex(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative index cannot be appended");
        }
        return compile(toStringBuilder(8).append('/').append(i).toString());
    }

    public boolean matchesProperty(String str) {
        return this._nextSegment != null && this._matchingPropertyName.equals(str);
    }

    public JsonPointer matchProperty(String str) {
        if (this._nextSegment == null || !this._matchingPropertyName.equals(str)) {
            return null;
        }
        return this._nextSegment;
    }

    public boolean matchesElement(int i) {
        return i == this._matchingElementIndex && i >= 0;
    }

    public JsonPointer matchElement(int i) {
        if (i != this._matchingElementIndex || i < 0) {
            return null;
        }
        return this._nextSegment;
    }

    public JsonPointer tail() {
        return this._nextSegment;
    }

    public JsonPointer head() {
        JsonPointer jsonPointer = this._head;
        if (jsonPointer == null) {
            if (this != EMPTY) {
                jsonPointer = _constructHead();
            }
            this._head = jsonPointer;
        }
        return jsonPointer;
    }

    public String toString() {
        return this._asStringOffset <= 0 ? this._asString : this._asString.substring(this._asStringOffset);
    }

    protected StringBuilder toStringBuilder(int i) {
        if (this._asStringOffset <= 0) {
            return new StringBuilder(this._asString);
        }
        int length = this._asString.length();
        StringBuilder sb = new StringBuilder((length - this._asStringOffset) + i);
        sb.append((CharSequence) this._asString, this._asStringOffset, length);
        return sb;
    }

    public int hashCode() {
        int i = this._hashCode;
        if (i == 0) {
            i = toString().hashCode();
            if (i == 0) {
                i = -1;
            }
            this._hashCode = i;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonPointer)) {
            return false;
        }
        JsonPointer jsonPointer = (JsonPointer) obj;
        return _compare(this._asString, this._asStringOffset, jsonPointer._asString, jsonPointer._asStringOffset);
    }

    private final boolean _compare(String str, int i, String str2, int i2) {
        int length = str.length();
        if (length - i != str2.length() - i2) {
            return false;
        }
        while (i < length) {
            int i3 = i;
            i++;
            int i4 = i2;
            i2++;
            if (str.charAt(i3) != str2.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    private static final int _parseIndex(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char charAt = str.charAt(0);
        if (charAt <= '0') {
            return (length == 1 && charAt == '0') ? 0 : -1;
        }
        if (charAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 > '9' || charAt2 < '0') {
                return -1;
            }
        }
        if (length != 10) {
            return NumberInput.parseInt(str);
        }
        long parseLong = Long.parseLong(str);
        if (parseLong > 2147483647L) {
            return -1;
        }
        return (int) parseLong;
    }

    protected static JsonPointer _parseTail(String str) {
        PointerParent pointerParent = null;
        int i = 1;
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '/') {
                pointerParent = new PointerParent(pointerParent, i2, str.substring(i2 + 1, i));
                i2 = i;
                i++;
            } else {
                i++;
                if (charAt == '~' && i < length) {
                    StringBuilder sb = new StringBuilder(32);
                    int _extractEscapedSegment = _extractEscapedSegment(str, i2 + 1, i, sb);
                    String sb2 = sb.toString();
                    if (_extractEscapedSegment < 0) {
                        return _buildPath(str, i2, sb2, pointerParent);
                    }
                    pointerParent = new PointerParent(pointerParent, i2, sb2);
                    i2 = _extractEscapedSegment;
                    i = _extractEscapedSegment + 1;
                }
            }
        }
        return _buildPath(str, i2, str.substring(i2 + 1), pointerParent);
    }

    private static JsonPointer _buildPath(String str, int i, String str2, PointerParent pointerParent) {
        JsonPointer jsonPointer = new JsonPointer(str, i, str2, EMPTY);
        while (pointerParent != null) {
            jsonPointer = new JsonPointer(str, pointerParent.fullPathOffset, pointerParent.segment, jsonPointer);
            pointerParent = pointerParent.parent;
        }
        return jsonPointer;
    }

    protected static int _extractEscapedSegment(String str, int i, int i2, StringBuilder sb) {
        int length = str.length();
        if ((i2 - 1) - i > 0) {
            sb.append((CharSequence) str, i, i2 - 1);
        }
        int i3 = i2 + 1;
        _appendEscape(sb, str.charAt(i2));
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt == '/') {
                return i3;
            }
            i3++;
            if (charAt != '~' || i3 >= length) {
                sb.append(charAt);
            } else {
                i3++;
                _appendEscape(sb, str.charAt(i3));
            }
        }
        return -1;
    }

    private static void _appendEscape(StringBuilder sb, char c) {
        if (c == '0') {
            c = '~';
        } else if (c == '1') {
            c = '/';
        } else {
            sb.append('~');
        }
        sb.append(c);
    }

    protected JsonPointer _constructHead() {
        JsonPointer last = last();
        if (last == this) {
            return EMPTY;
        }
        int length = last.length();
        JsonPointer jsonPointer = this._nextSegment;
        String jsonPointer2 = toString();
        return new JsonPointer(jsonPointer2.substring(0, jsonPointer2.length() - length), 0, this._matchingPropertyName, this._matchingElementIndex, jsonPointer._constructHead(length, last));
    }

    protected JsonPointer _constructHead(int i, JsonPointer jsonPointer) {
        if (this == jsonPointer) {
            return EMPTY;
        }
        JsonPointer jsonPointer2 = this._nextSegment;
        String jsonPointer3 = toString();
        return new JsonPointer(jsonPointer3.substring(0, jsonPointer3.length() - i), 0, this._matchingPropertyName, this._matchingElementIndex, jsonPointer2._constructHead(i, jsonPointer));
    }

    private Object writeReplace() {
        return new Serialization(toString());
    }
}
