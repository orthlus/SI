package ru.orthlus.si;


public abstract class OldAbstractMeasure {
    private double value;
    private Prefix prefix;
    protected double IN_KILOGRAMS;

    public double getValue() {
        return prefix.valuePowerByPrefix(this.value);
    }

    public double get_IN_KILOGRAMS() {
        return IN_KILOGRAMS;
    }

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public OldAbstractMeasure(double value) {
        this.value = value;
        this.prefix = Prefix.NonePrefix;
    }

    public OldAbstractMeasure(double value, Prefix prefix) {
        this.value = value;
        this.prefix = prefix;
    }

}
