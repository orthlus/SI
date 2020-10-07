package ru.orthlus.si;

public abstract class SIMeasureMass extends Measure {
    public SIMeasureMass(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return getValue() + " " + min;
    }
}
