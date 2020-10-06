package ru.orthlus.si;

public class SIMeasureMass extends SIMeasure {
    public SIMeasureMass(double value) {
        super(value);
    }

    public SIMeasureMass(double value, Prefix prefix) {
        super(value, prefix);
    }

    @Override
    public SIMeasure toSI(Measure measure) {
        return null;
    }
}
