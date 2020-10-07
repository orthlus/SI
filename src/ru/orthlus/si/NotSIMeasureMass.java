package ru.orthlus.si;

public abstract class NotSIMeasureMass extends Measure {
    protected double IN_KILOGRAMS;
    public NotSIMeasureMass(double value) {
        super(value);
    }

    public NotSIMeasureMass(double value, Prefix prefix) {
        super(value, prefix);
    }

    public Mass.Kilogram toSI() {
        return new Mass.Kilogram(this.getValue() * this.IN_KILOGRAMS);
    }
}
