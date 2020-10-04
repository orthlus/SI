package ru.orthlus.si;

public class Time {
    public static class MilliSecond{
        private long value;
        public MilliSecond(long value){
            this.value = value;
        }
    }
    public static class Second{
        private long value;
        public final int milliSecondsInSecond = 1000;
        public Second(long value){
            this.value = value;
        }
    }
    public static class Minute{
        private long value;
        public final int secondsInMinute = 60;
        public Minute(long value){
            this.value = value;
        }
    }
    public static class Hour{
        private long value;
        public final int minutesInHour = 60;
        public Hour(long value){
            this.value = value;
        }
    }
    public static class Day{
        private long value;
        public final int hoursInDay = 24;
        public Day(long value){
            this.value = value;
        }
    }
    public static class Week{
        private long value;
        public final int daysInWeek = 7;
        public Week(long value){
            this.value = value;
        }
    }
}
