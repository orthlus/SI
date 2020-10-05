package ru.orthlus.si;

public abstract class AbstractMeasure {
    private double value;
    private Prefix prefix;

    public double getValue() {
        return valuePowerByPrefix();
    }

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public AbstractMeasure(double value) {
        this.value = value;
        this.prefix = Prefix.NonePrefix;
    }

    public AbstractMeasure(double value, Prefix prefix) {
        this.value = value;
        this.prefix = prefix;
    }

    private double valuePowerByPrefix() {
        if (Prefix.NonePrefix.equals(prefix)) return value;
        else if (Prefix.DECA.equals(prefix)) return value * 10;
        else if (Prefix.HECTO.equals(prefix)) return value * 100;
        else if (Prefix.KILO.equals(prefix)) return value * 1000;
        else if (Prefix.MEGA.equals(prefix)) return value * Math.pow(10, 6);
        else if (Prefix.GIGA.equals(prefix)) return value * Math.pow(10, 9);
        else if (Prefix.TERA.equals(prefix)) return value * Math.pow(10, 12);
        else if (Prefix.PETA.equals(prefix)) return value * Math.pow(10, 15);
        else if (Prefix.EXA.equals(prefix)) return value * Math.pow(10, 18);
        else if (Prefix.ZETTA.equals(prefix)) return value * Math.pow(10, 21);
        else if (Prefix.YOTTA.equals(prefix)) return value * Math.pow(10, 24);
        else if (Prefix.DECI.equals(prefix)) return value * Math.pow(10, -1);
        else if (Prefix.CENTI.equals(prefix)) return value * Math.pow(10, -2);
        else if (Prefix.MILLI.equals(prefix)) return value * Math.pow(10, -3);
        else if (Prefix.MICRO.equals(prefix)) return value * Math.pow(10, -6);
        else if (Prefix.NANO.equals(prefix)) return value * Math.pow(10, -9);
        else if (Prefix.PICO.equals(prefix)) return value * Math.pow(10, -12);
        else if (Prefix.FEMTO.equals(prefix)) return value * Math.pow(10, -15);
        else if (Prefix.ATTO.equals(prefix)) return value * Math.pow(10, -18);
        else if (Prefix.ZEPTO.equals(prefix)) return value * Math.pow(10, -21);
        return value;
    }

}
