package ru.orthlus.si;

public abstract class Measure {
    protected double value;
    protected Prefix prefix;

    public Measure(double value, Prefix prefix) {
        this.value = value;
        this.prefix = prefix;
    }

    /**
     * this.prefix set to Prefix.NonePrefix
     */
    public Measure(double value) {
        this.value = value;
        this.prefix = Prefix.NonePrefix;
    }

    public double getValue() {
        return value;
    }
}
