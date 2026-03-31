package com.kammoun.utils.lib.folialib.enums;

import com.kammoun.utils.lib.folialib.util.ImplementationTestsUtil;
import java.util.function.Supplier;

public enum ImplementationType {
    FOLIA("FoliaImplementation", new Supplier[0], "io.papermc.paper.threadedregions.RegionizedServer"),
    PAPER("PaperImplementation", new Supplier[]{ImplementationTestsUtil::isTaskConsumersSupported}, "com.destroystokyo.paper.PaperConfig", "io.papermc.paper.configuration.Configuration"),
    LEGACY_PAPER("LegacyPaperImplementation", new Supplier[0], "com.destroystokyo.paper.PaperConfig", "io.papermc.paper.configuration.Configuration"),
    SPIGOT("SpigotImplementation", new Supplier[]{ImplementationTestsUtil::isTaskConsumersSupported}, "org.spigotmc.SpigotConfig"),
    LEGACY_SPIGOT("LegacySpigotImplementation", new Supplier[0], "org.spigotmc.SpigotConfig"),
    UNKNOWN("UnsupportedImplementation", new Supplier[0], new String[0]);

    private final String implementationClassName;
    private final Supplier<Boolean>[] tests;
    private final String[] classNames;

    ImplementationType(String str, Supplier[] supplierArr, String... strArr) {
        this.implementationClassName = str;
        this.tests = supplierArr;
        this.classNames = strArr;
    }

    public String getImplementationClassName() {
        return this.implementationClassName;
    }

    public Supplier<Boolean>[] getTests() {
        return this.tests;
    }

    public String[] getClassNames() {
        return this.classNames;
    }

    public boolean selfCheck() {
        for (Supplier<Boolean> supplier : getTests()) {
            if (!supplier.get().booleanValue()) {
                return false;
            }
        }
        for (String str : getClassNames()) {
            try {
                Class.forName(str);
                return true;
            } catch (ClassNotFoundException e) {
            }
        }
        return false;
    }
}
