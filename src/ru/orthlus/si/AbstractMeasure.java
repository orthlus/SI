package ru.orthlus.si;

public abstract class AbstractMeasure {
    private double value;
    private Prefix prefix;

    public double getValue() {
        return value;
    }

    public AbstractMeasure(double value) {
        this.value = value;
        this.prefix = Prefix.NonePrefix;
    }
    public AbstractMeasure(double value, Prefix prefix) {
        this.value = value;
        this.prefix = prefix;
    }
}
