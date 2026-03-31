package com.kammoun.utils.hikari.util;

import com.kammoun.utils.jackson.annotation.JsonProperty;
import java.util.concurrent.TimeUnit;

public interface ClockSource {
    public static final ClockSource CLOCK = Factory.create();
    public static final TimeUnit[] TIMEUNITS_DESCENDING = {TimeUnit.DAYS, TimeUnit.HOURS, TimeUnit.MINUTES, TimeUnit.SECONDS, TimeUnit.MILLISECONDS, TimeUnit.MICROSECONDS, TimeUnit.NANOSECONDS};
    public static final String[] TIMEUNIT_DISPLAY_VALUES = {"ns", "µs", "ms", "s", "m", "h", "d"};

    public static class Factory {
        private static ClockSource create() {
            return "Mac OS X".equals(System.getProperty("os.name")) ? new MillisecondClockSource() : new NanosecondClockSource();
        }
    }

    public static final class MillisecondClockSource implements ClockSource {
        @Override
        public long currentTime0() {
            return System.currentTimeMillis();
        }

        @Override
        public long elapsedMillis0(long j) {
            return System.currentTimeMillis() - j;
        }

        @Override
        public long elapsedMillis0(long j, long j2) {
            return j2 - j;
        }

        @Override
        public long elapsedNanos0(long j) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis() - j);
        }

        @Override
        public long elapsedNanos0(long j, long j2) {
            return TimeUnit.MILLISECONDS.toNanos(j2 - j);
        }

        @Override
        public long toMillis0(long j) {
            return j;
        }

        @Override
        public long toNanos0(long j) {
            return TimeUnit.MILLISECONDS.toNanos(j);
        }

        @Override
        public long plusMillis0(long j, long j2) {
            return j + j2;
        }

        @Override
        public TimeUnit getSourceTimeUnit0() {
            return TimeUnit.MILLISECONDS;
        }
    }

    public static class NanosecondClockSource implements ClockSource {
        @Override
        public long currentTime0() {
            return System.nanoTime();
        }

        @Override
        public long toMillis0(long j) {
            return TimeUnit.NANOSECONDS.toMillis(j);
        }

        @Override
        public long toNanos0(long j) {
            return j;
        }

        @Override
        public long elapsedMillis0(long j) {
            return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
        }

        @Override
        public long elapsedMillis0(long j, long j2) {
            return TimeUnit.NANOSECONDS.toMillis(j2 - j);
        }

        @Override
        public long elapsedNanos0(long j) {
            return System.nanoTime() - j;
        }

        @Override
        public long elapsedNanos0(long j, long j2) {
            return j2 - j;
        }

        @Override
        public long plusMillis0(long j, long j2) {
            return j + TimeUnit.MILLISECONDS.toNanos(j2);
        }

        @Override
        public TimeUnit getSourceTimeUnit0() {
            return TimeUnit.NANOSECONDS;
        }
    }

    static long currentTime() {
        return CLOCK.currentTime0();
    }

    long currentTime0();

    static long toMillis(long j) {
        return CLOCK.toMillis0(j);
    }

    long toMillis0(long j);

    static long toNanos(long j) {
        return CLOCK.toNanos0(j);
    }

    long toNanos0(long j);

    static long elapsedMillis(long j) {
        return CLOCK.elapsedMillis0(j);
    }

    long elapsedMillis0(long j);

    static long elapsedMillis(long j, long j2) {
        return CLOCK.elapsedMillis0(j, j2);
    }

    long elapsedMillis0(long j, long j2);

    static long elapsedNanos(long j) {
        return CLOCK.elapsedNanos0(j);
    }

    long elapsedNanos0(long j);

    static long elapsedNanos(long j, long j2) {
        return CLOCK.elapsedNanos0(j, j2);
    }

    long elapsedNanos0(long j, long j2);

    static long plusMillis(long j, long j2) {
        return CLOCK.plusMillis0(j, j2);
    }

    long plusMillis0(long j, long j2);

    static TimeUnit getSourceTimeUnit() {
        return CLOCK.getSourceTimeUnit0();
    }

    TimeUnit getSourceTimeUnit0();

    static String elapsedDisplayString(long j, long j2) {
        return CLOCK.elapsedDisplayString0(j, j2);
    }

    default String elapsedDisplayString0(long j, long j2) {
        long elapsedNanos0 = elapsedNanos0(j, j2);
        StringBuilder sb = new StringBuilder(elapsedNanos0 < 0 ? "-" : JsonProperty.USE_DEFAULT_NAME);
        long abs = Math.abs(elapsedNanos0);
        for (TimeUnit timeUnit : TIMEUNITS_DESCENDING) {
            long convert = timeUnit.convert(abs, TimeUnit.NANOSECONDS);
            if (convert > 0) {
                sb.append(convert).append(TIMEUNIT_DISPLAY_VALUES[timeUnit.ordinal()]);
                abs -= TimeUnit.NANOSECONDS.convert(convert, timeUnit);
            }
        }
        return sb.toString();
    }
}
