package ru.orthlus.si;

public abstract class Measure {
    protected double value;
    protected Prefix prefix;
    protected String min;
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
        return prefix.valuePowerByPrefix(value);
    }

    @Override
    public String toString() {
        return
                this.getValue()
                + " "
                + this.prefix.toString()
                + this.min;
    }
}
