package org.erdtman.jcs;

import java.io.IOException;

public class NumberToJSON {
    private NumberToJSON() {
    }

    public static String serializeNumber(double d) throws IOException {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IOException("NaN/Infinity are not permitted in JSON");
        }
        if (d == 0.0d) {
            return "0";
        }
        String numberToString = NumberFastDtoa.numberToString(d);
        if (numberToString != null) {
            return numberToString;
        }
        StringBuilder sb = new StringBuilder();
        NumberDToA.JS_dtostr(sb, 0, 0, d);
        return sb.toString();
    }
}
