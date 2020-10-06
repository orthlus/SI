package ru.orthlus.si;

public class NotSIMeasureMass extends NotSIMeasure {
    public NotSIMeasureMass(double value) {
        super(value);
    }

    public NotSIMeasureMass(double value, Prefix prefix) {
        super(value, prefix);
    }

    @Override
    public SIMeasure toSI(Measure measure) {
        return null;
    }
}
