package com.kammoun.utils.jackson.core.util;

import com.kammoun.utils.jackson.core.util.JacksonFeature;
import java.io.Serializable;

public final class JacksonFeatureSet<F extends JacksonFeature> implements Serializable {
    private static final long serialVersionUID = 1;
    protected int _enabled;

    protected JacksonFeatureSet(int i) {
        this._enabled = i;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int i = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                i |= f.getMask();
            }
        }
        return new JacksonFeatureSet<>(i);
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromBitmask(int i) {
        return new JacksonFeatureSet<>(i);
    }

    public JacksonFeatureSet<F> with(F f) {
        int mask = this._enabled | f.getMask();
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }

    public JacksonFeatureSet<F> without(F f) {
        int mask = this._enabled & (f.getMask() ^ (-1));
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }

    public boolean isEnabled(F f) {
        return (f.getMask() & this._enabled) != 0;
    }

    public int asBitmask() {
        return this._enabled;
    }
}
