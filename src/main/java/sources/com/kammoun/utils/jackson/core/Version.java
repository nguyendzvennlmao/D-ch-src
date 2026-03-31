package com.kammoun.utils.jackson.core;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Objects;

public class Version implements Comparable<Version>, Serializable {
    private static final long serialVersionUID = 1;
    private static final Version UNKNOWN_VERSION = new Version(0, 0, 0, null, null, null);
    protected final int _majorVersion;
    protected final int _minorVersion;
    protected final int _patchLevel;
    protected final String _groupId;
    protected final String _artifactId;
    protected final String _snapshotInfo;

    @Deprecated
    public Version(int i, int i2, int i3, String str) {
        this(i, i2, i3, str, null, null);
    }

    public Version(int i, int i2, int i3, String str, String str2, String str3) {
        this._majorVersion = i;
        this._minorVersion = i2;
        this._patchLevel = i3;
        this._snapshotInfo = str;
        this._groupId = str2 == null ? JsonProperty.USE_DEFAULT_NAME : str2;
        this._artifactId = str3 == null ? JsonProperty.USE_DEFAULT_NAME : str3;
    }

    public static Version unknownVersion() {
        return UNKNOWN_VERSION;
    }

    public boolean isUnknownVersion() {
        return this == UNKNOWN_VERSION;
    }

    public boolean isSnapshot() {
        return (this._snapshotInfo == null || this._snapshotInfo.isEmpty()) ? false : true;
    }

    @Deprecated
    public boolean isUknownVersion() {
        return isUnknownVersion();
    }

    public int getMajorVersion() {
        return this._majorVersion;
    }

    public int getMinorVersion() {
        return this._minorVersion;
    }

    public int getPatchLevel() {
        return this._patchLevel;
    }

    public String getGroupId() {
        return this._groupId;
    }

    public String getArtifactId() {
        return this._artifactId;
    }

    public String toFullString() {
        return this._groupId + '/' + this._artifactId + '/' + toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._majorVersion).append('.');
        sb.append(this._minorVersion).append('.');
        sb.append(this._patchLevel);
        if (isSnapshot()) {
            sb.append('-').append(this._snapshotInfo);
        }
        return sb.toString();
    }

    public int hashCode() {
        return (this._artifactId.hashCode() ^ this._groupId.hashCode()) ^ (((Objects.hashCode(this._snapshotInfo) + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return version._majorVersion == this._majorVersion && version._minorVersion == this._minorVersion && version._patchLevel == this._patchLevel && Objects.equals(version._snapshotInfo, this._snapshotInfo) && version._artifactId.equals(this._artifactId) && version._groupId.equals(this._groupId);
    }

    @Override
    public int compareTo(Version version) {
        if (version == this) {
            return 0;
        }
        int compareTo = this._groupId.compareTo(version._groupId);
        if (compareTo == 0) {
            compareTo = this._artifactId.compareTo(version._artifactId);
            if (compareTo == 0) {
                compareTo = this._majorVersion - version._majorVersion;
                if (compareTo == 0) {
                    compareTo = this._minorVersion - version._minorVersion;
                    if (compareTo == 0) {
                        compareTo = this._patchLevel - version._patchLevel;
                        if (compareTo == 0) {
                            compareTo = isSnapshot() ? version.isSnapshot() ? this._snapshotInfo.compareTo(version._snapshotInfo) : -1 : version.isSnapshot() ? 1 : 0;
                        }
                    }
                }
            }
        }
        return compareTo;
    }
}
