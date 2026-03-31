package com.kammoun.utils.nbtapi.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PathUtil {
    private static final Pattern pattern = Pattern.compile("[^\\\\](\\.)");
    private static final Pattern indexPattern = Pattern.compile(".*\\[(-?[0-9]+)\\]");

    public static class PathSegment {
        private final String path;
        private final Integer index;

        private PathSegment(String str) {
            Matcher matcher = PathUtil.indexPattern.matcher(str);
            if (matcher.find()) {
                this.path = str.substring(0, str.indexOf("["));
                this.index = Integer.valueOf(Integer.parseInt(matcher.group(1)));
            } else {
                this.path = str;
                this.index = null;
            }
        }

        public String getPath() {
            return this.path;
        }

        public int getIndex() {
            return this.index.intValue();
        }

        public boolean hasIndex() {
            return this.index != null;
        }

        public String toString() {
            return "PathSegment [path=" + this.path + ", index=" + this.index + "]";
        }
    }

    public static List<PathSegment> splitPath(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (true) {
            int i2 = i;
            if (!matcher.find(i2)) {
                arrayList.add(new PathSegment(str.substring(i2).replace("\\.", ".")));
                return arrayList;
            }
            arrayList.add(new PathSegment(str.substring(i2, matcher.end() - 1).replace("\\.", ".")));
            i = matcher.end();
        }
    }
}
