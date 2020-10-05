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
    public static class Centner extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_CENTNER = 100;

        public Centner(double value) {
            super(value);
        }

        public Centner(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_CENTNER);
        }
    }
    public static class Carat extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_CARAT = 0.0002;

        public Carat(double value) {
            super(value);
        }

        public Carat(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_CARAT);
        }
    }
    public static class Ounce extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_OUNCE = 0.031_103_48;

        public Ounce(double value) {
            super(value);
        }

        public Ounce(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_OUNCE);
        }
    }
    public static class Stone extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_STONE = 6.350_293_18;

        public Stone(double value) {
            super(value);
        }

        public Stone(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_STONE);
        }
    }

    /**
     * unified atomic mass unit
     */
    public static class Dalton extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_DALTON = 1.660_539_066_60E-27;

        public Dalton(double value) {
            super(value);
        }

        public Dalton(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_DALTON);
        }
    }

    /**
     * The solar mass (M☉) is a standard unit of mass in astronomy, equal to approximately 2×1030 kg.
     */
    public static class SolarMass extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_SOLAR_MASS = 1.988_47E+30;

        public SolarMass(double value) {
            super(value);
        }

        public SolarMass(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_SOLAR_MASS);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Electronvolt
     */
    public static class Electronvolt extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_ELECTRONVOLT = 1.782_661_845E-36;

        public Electronvolt(double value) {
            super(value);
        }

        public Electronvolt(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_ELECTRONVOLT);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Electron
     */
    public static class ElectronMass extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_ELECTRON_MASS = 9.109_382_91E-31;

        public ElectronMass(double value) {
            super(value);
        }

        public ElectronMass(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_ELECTRON_MASS);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Proton
     */
    public static class ProtonMass extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_PROTON_MASS = 1.672_621_777E-27;

        public ProtonMass(double value) {
            super(value);
        }

        public ProtonMass(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_PROTON_MASS);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Planck_mass
     */
    public static class PlanckMass extends AbstractMeasure implements AbstractMeasureToSI {
        public final double KILOGRAMS_IN_PLANCK_MASS = 2.176_51E-8;

        public PlanckMass(double value) {
            super(value);
        }

        public PlanckMass(double value, Prefix prefix) {
            super(value, prefix);
        }

        public Kilogram toKilogram() {
            return new Kilogram(this.getValue() * KILOGRAMS_IN_PLANCK_MASS);
        }
    }
}
