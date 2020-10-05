package ru.orthlus.si;

import java.util.ArrayList;

/**
 * Library for transformation operations in International System of Units
 */
public abstract class Mass {
    public static Kilogram toSI(AbstractMeasureToSI a) {
        return a.toKilogram();
    }

    public static class Kilogram extends AbstractMeasure {
        public Kilogram(double value) {
            super(value, Prefix.KILO);
        }

        /*
        //для килограмма недоступен конструктор с префиксом, т.к. сам килограм уже с префиксом
        public Kilogram(double value, Prefix prefix) { super(value, prefix); }
        */
    }

    public static class Gram extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_GRAM = 0.001;

        public Gram(double value) {
            super(value);
        }

        public Gram(double value, Prefix prefix) {
            super(value, prefix);
        }

        @Override
        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_GRAM);
        }
    }

    public static class Tonne extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_TONNE = 1000;

        public Tonne(double value) {
            super(value);
        }

        public Tonne(double value, Prefix prefix) {
            super(value, prefix);
        }

        @Override
        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_TONNE);
        }
    }

    public static class Pound extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_POUND = 0.4535923745;

        public Pound(double value) {
            super(value);
        }

        public Pound(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_POUND);
        }
    }
}
