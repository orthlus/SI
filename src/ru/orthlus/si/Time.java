package ru.orthlus.si;

public class Time {
    public static class MilliSecond extends OldAbstractMeasure {
        private long value;

        public MilliSecond(long value) {
            super(value, Prefix.MILLI);
        }
    }

    public static class Second extends OldAbstractMeasure {
        private long value;
        public final int MILLISECONDS_IN_SECOND = 1000;

        public Second(long value) {
            super(value);
        }
    }

    public static class Minute extends OldAbstractMeasure {
        private long value;
        public final int SECONDS_IN_MINUTE = 60;

        public Minute(long value) {
            super(value);
        }
    }

    public static class Hour extends OldAbstractMeasure {
        private long value;
        public final int MINUTES_IN_HOUR = 60;

        public Hour(long value) {
            super(value);
        }
    }

    public static class Day extends OldAbstractMeasure {
        private long value;
        public final int HOURS_IN_DAY = 24;

        public Day(long value) {
            super(value);
        }
    }

    public static class Week extends OldAbstractMeasure {
        private long value;
        public final int DAYS_IN_WEEK = 7;

        public Week(long value) {
            super(value);
        }
    }
}
