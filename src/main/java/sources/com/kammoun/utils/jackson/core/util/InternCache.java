package com.kammoun.utils.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

public final class InternCache extends ConcurrentHashMap<String, String> {
    private static final long serialVersionUID = 1;
    private static final int MAX_ENTRIES = 180;
    public static final InternCache instance = new InternCache();
    private final Object lock;

    public InternCache() {
        this(MAX_ENTRIES, 0.8f, 4);
    }

    public InternCache(int i, float f, int i2) {
        super(i, f, i2);
        this.lock = new Object();
    }

    public String intern(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= MAX_ENTRIES) {
            synchronized (this.lock) {
                if (size() >= MAX_ENTRIES) {
                    clear();
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
