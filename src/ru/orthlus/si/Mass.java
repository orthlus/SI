package ru.orthlus.si;

import java.util.ArrayList;

/**
 * Library for transformation operations in International System of Units
 */
public abstract class Mass {
    public static class Kilogram {
        private double value;
        private Prefix prefix;

        public double getValue() {
            return value;
        }

        public Kilogram(double value) {
            this.value = value;
            this.prefix = Prefix.KILO;
        }
        public Kilogram(double value, Prefix prefix) {
            this.value = value;
            this.prefix = prefix;
        }
    }

    public static class Gram {
        private double value;
        private Prefix prefix;

        public double getValue() {
            return value;
        }

        public Gram(double value) {
            this.value = value;
            this.prefix = Prefix.NonePrefix;
        }
        public Gram(double value, Prefix prefix) {
            this.value = value;
            this.prefix = prefix;
        }
    }

    public static class MilliGram {
        private double value;
        private Prefix prefix;

        public double getValue() {
            return value;
        }

        public MilliGram(double value) {
            this.value = value;
            this.prefix = Prefix.NonePrefix;
        }
        public MilliGram(double value, Prefix prefix) {
            this.value = value;
            this.prefix = prefix;
        }
    }

    public static class Tonne {
        private double value;
        private Prefix prefix;

        public double getValue() {
            return value;
        }

        public Tonne(double value) {
            this.value = value;
            this.prefix = Prefix.NonePrefix;
        }
        public Tonne(double value, Prefix prefix) {
            this.value = value;
            this.prefix = prefix;
        }
    }

    public static class Pound {
        private double value;
        private Prefix prefix;

        public double getValue() {
            return value;
        }

        public Pound(double value) {
            this.value = value;
            this.prefix = Prefix.NonePrefix;
        }
        public Pound(double value, Prefix prefix) {
            this.value = value;
            this.prefix = prefix;
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.value * 0.4535923745);
        }
    }
}
