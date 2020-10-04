package ru.orthlus.si;

import java.util.ArrayList;

/**
 * Library for transformation operations in International System of Units
 */
public class Mass {

    public static class Kilogram{
        private double value;

        public double getValue() { return value; }

        public Kilogram(double value){
            this.value = value;
            System.out.println();
        }
    }
    public static class Gram{
        private double value;

        public double getValue() { return value; }

        public Gram(double value){
            this.value = value;
        }
    }
    public static class MilliGram{
        private double value;

        public double getValue() { return value; }

        public MilliGram(double value){
            this.value = value;
        }
    }
    public static class Tonne{
        private double value;

        public double getValue() { return value; }

        public Tonne(double value){
            this.value = value;
        }
    }
    public static class Pound{
        private double value;

        public double getValue() { return value; }

        public Pound(double value){
            this.value = value;
        }
        public Kilogram toKilogram(){
            return new Kilogram(this.value * 0.4535923745);
        }
    }
}
