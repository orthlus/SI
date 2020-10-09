package ru.orthlus.siwithoutprefix;

/**
 * Library for transformation operations in International System of Units
 */
public abstract class Mass {
    public static class Kilogram extends SIMeasureMass {
        {
            min = "kg";
        }

        public Kilogram(double value) {
            super(value);
        }

    }

    public static class Gram extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 0.001;
            min = "g";
        }


        public Gram(double value) {
            super(value);
        }

    }

    public static class Tonne extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 1000;
            min = "t";
        }


        public Tonne(double value) {
            super(value);
        }
    }

    public static class Centner extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 100;
            min = "centner";
        }


        public Centner(double value) {
            super(value);
        }
    }

    public static class Pound extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 0.4535923745;
            min = "lb";
        }


        public Pound(double value) {
            super(value);
        }

    }


    public static class Carat extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 0.0002;
            min = "ct";
        }


        public Carat(double value) {
            super(value);
        }

    }

    /**
     * https://en.wikipedia.org/wiki/Troy_weight
     */
    public static class Ounce extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 0.031_103_48;
            min = "t oz";
        }


        public Ounce(double value) {
            super(value);
        }

    }

    public static class Stone extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 6.350_293_18;
            min = "st";
        }


        public Stone(double value) {
            super(value);
        }

    }

    /**
     * unified atomic mass unit
     */
    public static class Dalton extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 1.660_539_066_60E-27;
            min = "Da";
        }


        public Dalton(double value) {
            super(value);
        }

    }

    /**
     * The solar mass (M☉) is a standard unit of mass in astronomy, equal to approximately 2×1030 kg.
     */
    public static class SolarMass extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 1.988_47E+30;
            min = "M☉";
        }


        public SolarMass(double value) {
            super(value);
        }

    }

    /**
     * https://en.wikipedia.org/wiki/Electronvolt
     */
    public static class Electronvolt extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 1.782_661_845E-36;
            min = "eV";
        }


        public Electronvolt(double value) {
            super(value);
        }

    }

    /**
     * https://en.wikipedia.org/wiki/Electron
     */
    public static class ElectronMass extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 9.109_382_91E-31;
            min = "m_electron";
        }


        public ElectronMass(double value) {
            super(value);
        }

    }

    /**
     * https://en.wikipedia.org/wiki/Proton
     */
    public static class ProtonMass extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 1.672_621_777E-27;
            min = "m_proton";
        }


        public ProtonMass(double value) {
            super(value);
        }

    }

    /**
     * https://en.wikipedia.org/wiki/Planck_mass
     */
    public static class PlanckMass extends NotSIMeasureMass {
        {
            IN_KILOGRAMS = 2.176_51E-8;
            min = "m_Planck";
        }


        public PlanckMass(double value) {
            super(value);
        }

    }
}

