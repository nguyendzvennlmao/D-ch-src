package com.kammoun.utils.jackson.core.json;

import com.kammoun.utils.jackson.core.Version;
import com.kammoun.utils.jackson.core.Versioned;
import com.kammoun.utils.jackson.core.util.VersionUtil;

public final class PackageVersion implements Versioned {
    public static final Version VERSION = VersionUtil.parseVersion("2.17.0", "com.kammoun.utils.jackson.core", "jackson-core");

    @Override
    public Version version() {
        return VERSION;
    }
}
