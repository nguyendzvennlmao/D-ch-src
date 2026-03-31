package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.core.io.ContentReference;
import java.io.Serializable;

public class JsonLocation implements Serializable {
    private static final long serialVersionUID = 2;

    @Deprecated
    public static final int MAX_CONTENT_SNIPPET = 500;
    public static final JsonLocation NA = new JsonLocation(ContentReference.unknown(), -1L, -1L, -1, -1);
    protected final long _totalBytes;
    protected final long _totalChars;
    protected final int _lineNr;
    protected final int _columnNr;
    protected final ContentReference _contentReference;
    protected transient String _sourceDescription;

    public JsonLocation(ContentReference contentReference, long j, int i, int i2) {
        this(contentReference, -1L, j, i, i2);
    }

    public JsonLocation(ContentReference contentReference, long j, long j2, int i, int i2) {
        this._contentReference = contentReference == null ? ContentReference.unknown() : contentReference;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }

    @Deprecated
    public JsonLocation(Object obj, long j, int i, int i2) {
        this(_wrap(obj), j, i, i2);
    }

    @Deprecated
    public JsonLocation(Object obj, long j, long j2, int i, int i2) {
        this(_wrap(obj), j, j2, i, i2);
    }

    protected static ContentReference _wrap(Object obj) {
        return obj instanceof ContentReference ? (ContentReference) obj : ContentReference.construct(false, obj, ErrorReportConfiguration.defaults());
    }

    public ContentReference contentReference() {
        return this._contentReference;
    }

    @Deprecated
    public Object getSourceRef() {
        return this._contentReference.getRawContent();
    }

    public int getLineNr() {
        return this._lineNr;
    }

    public int getColumnNr() {
        return this._columnNr;
    }

    public long getCharOffset() {
        return this._totalChars;
    }

    public long getByteOffset() {
        return this._totalBytes;
    }

    public String sourceDescription() {
        if (this._sourceDescription == null) {
            this._sourceDescription = this._contentReference.buildSourceDescription();
        }
        return this._sourceDescription;
    }

    public String offsetDescription() {
        return appendOffsetDescription(new StringBuilder(40)).toString();
    }

    public StringBuilder appendOffsetDescription(StringBuilder sb) {
        if (this._contentReference.hasTextualContent()) {
            sb.append("line: ");
            if (this._lineNr >= 0) {
                sb.append(this._lineNr);
            } else {
                sb.append("UNKNOWN");
            }
            sb.append(", column: ");
            if (this._columnNr >= 0) {
                sb.append(this._columnNr);
            } else {
                sb.append("UNKNOWN");
            }
        } else if (this._lineNr > 0) {
            sb.append("line: ").append(this._lineNr);
            if (this._columnNr > 0) {
                sb.append(", column: ");
                sb.append(this._columnNr);
            }
        } else {
            sb.append("byte offset: #");
            if (this._totalBytes >= 0) {
                sb.append(this._totalBytes);
            } else {
                sb.append("UNKNOWN");
            }
        }
        return sb;
    }

    public int hashCode() {
        return ((((this._contentReference == null ? 1 : 2) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        if (this._contentReference == null) {
            if (jsonLocation._contentReference != null) {
                return false;
            }
        } else if (!this._contentReference.equals(jsonLocation._contentReference)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && this._totalBytes == jsonLocation._totalBytes;
    }

    public String toString() {
        String sourceDescription = sourceDescription();
        return appendOffsetDescription(new StringBuilder(40 + sourceDescription.length()).append("[Source: ").append(sourceDescription).append("; ")).append(']').toString();
    }
}
