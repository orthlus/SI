package ru.orthlus.si;

import java.util.ArrayList;

/**
 * Library for transformation operations in International System of Units
 */
public abstract class Mass {
    public static class Kilogram extends AbstractMeasure {
        public Kilogram(double value) {
            super(value, Prefix.KILO);
        }

        public Kilogram(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Gram extends AbstractMeasure {
        public Gram(double value) {
            super(value);
        }

        public Gram(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class MilliGram extends AbstractMeasure {

        public MilliGram(double value) {
            super(value);
        }

        public MilliGram(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Tonne extends AbstractMeasure {

        public Tonne(double value) {
            super(value);
        }

        public Tonne(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Pound extends AbstractMeasure {
        public Pound(double value) {
            super(value);
        }

        public Pound(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * 0.4535923745);
        }
    }
}
