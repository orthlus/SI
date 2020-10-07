package ru.orthlus.si;


/**
 * Library for transformation operations in International System of Units
 */
public abstract class OldMass {
    public static Kilogram toSI(OldAbstractMeasure a) {
        if (a instanceof Kilogram)
            return (Kilogram) a;
        return new Kilogram(a.getValue() * a.IN_KILOGRAMS);
    }

    public static class Kilogram extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 1;
        }

        public Kilogram(double value) {
            super(value, Prefix.KILO);
        }

        /*
        //для килограмма недоступен конструктор с префиксом, т.к. сам килограм уже с префиксом
        public Kilogram(double value, Prefix prefix) { super(value, prefix); }
        */
    }

    public static class Gram extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 0.001;
        }

        public Gram(double value) {
            super(value);
        }

        public Gram(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Tonne extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 1000;
        }

        public Tonne(double value) {
            super(value);
        }

        public Tonne(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Pound extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 0.4535923745;
        }

        public Pound(double value) {
            super(value);
        }

        public Pound(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Centner extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 100;
        }

        public Centner(double value) {
            super(value);
        }

        public Centner(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Carat extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 0.0002;
        }

        public Carat(double value) {
            super(value);
        }

        public Carat(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Ounce extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 0.031_103_48;
        }

        public Ounce(double value) {
            super(value);
        }

        public Ounce(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    public static class Stone extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 6.350_293_18;
        }

        public Stone(double value) {
            super(value);
        }

        public Stone(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    /**
     * unified atomic mass unit
     */
    public static class Dalton extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 1.660_539_066_60E-27;
        }

        public Dalton(double value) {
            super(value);
        }

        public Dalton(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    /**
     * The solar mass (M☉) is a standard unit of mass in astronomy, equal to approximately 2×1030 kg.
     */
    public static class SolarMass extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 1.988_47E+30;
        }

        public SolarMass(double value) {
            super(value);
        }

        public SolarMass(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Electronvolt
     */
    public static class Electronvolt extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 1.782_661_845E-36;
        }

        public Electronvolt(double value) {
            super(value);
        }

        public Electronvolt(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Electron
     */
    public static class ElectronMass extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 9.109_382_91E-31;
        }

        public ElectronMass(double value) {
            super(value);
        }

        public ElectronMass(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Proton
     */
    public static class ProtonMass extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 1.672_621_777E-27;
        }

        public ProtonMass(double value) {
            super(value);
        }

        public ProtonMass(double value, Prefix prefix) {
            super(value, prefix);
        }
    }

    /**
     * https://en.wikipedia.org/wiki/Planck_mass
     */
    public static class PlanckMass extends OldAbstractMeasure {
        {
            IN_KILOGRAMS = 2.176_51E-8;
        }

        public PlanckMass(double value) {
            super(value);
        }

        public PlanckMass(double value, Prefix prefix) {
            super(value, prefix);
        }
    }
}
