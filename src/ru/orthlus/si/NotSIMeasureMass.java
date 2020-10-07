package ru.orthlus.si;

public abstract class NotSIMeasureMass extends Measure {
    protected double IN_KILOGRAMS;
    public NotSIMeasureMass(double value) {
        super(value);
    }

    public NotSIMeasureMass(double value, Prefix prefix) {
        super(value, prefix);
    }

    public NewMass.Kilogram toSI() {
        return new NewMass.Kilogram(this.getValue() * this.IN_KILOGRAMS);
    }
}
