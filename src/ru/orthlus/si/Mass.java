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
    }

    public static class Gram extends AbstractMeasure {
    }

    public static class MilliGram extends AbstractMeasure {

    }

    public static class Tonne extends AbstractMeasure {

    }

    public static class Pound extends AbstractMeasure {
        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * 0.4535923745);
        }
    }
}
