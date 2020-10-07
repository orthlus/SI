package ru.orthlus.si;

public abstract class SIMeasureMass extends Measure {
    public SIMeasureMass(double value) {
        super(value);
    }

    public SIMeasureMass(double value, Prefix prefix) {
        super(value, prefix);
    }

}
