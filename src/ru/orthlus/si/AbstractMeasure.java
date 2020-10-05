package ru.orthlus.si;

import java.math.BigDecimal;

public abstract class AbstractMeasure {
    private double value;
    private BigDecimal valueBigDecimal;
    private Prefix prefix;
    public double IN_KILOGRAMS;

    public double getValue() {
        return valuePowerByPrefix(this.value);
    }
    public double get_IN_KILOGRAMS(){
        return IN_KILOGRAMS;
    }
    public BigDecimal getValueBigDecimal() {
        return valuePowerByPrefix(this.valueBigDecimal);
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

    public AbstractMeasure(BigDecimal value) {
        this.valueBigDecimal = value;
        this.prefix = Prefix.NonePrefix;
    }

    public AbstractMeasure(BigDecimal value, Prefix prefix) {
        this.valueBigDecimal = value;
        this.prefix = prefix;
    }

    private double valuePowerByPrefix(double a) {
        if (Prefix.NonePrefix.equals(prefix)) return a;
        else if (Prefix.DECA.equals(prefix)) return a * 10;
        else if (Prefix.HECTO.equals(prefix)) return a * 100;
        else if (Prefix.KILO.equals(prefix)) return a * 1000;
        else if (Prefix.MEGA.equals(prefix)) return a * Math.pow(10, 6);
        else if (Prefix.GIGA.equals(prefix)) return a * Math.pow(10, 9);
        else if (Prefix.TERA.equals(prefix)) return a * Math.pow(10, 12);
        else if (Prefix.PETA.equals(prefix)) return a * Math.pow(10, 15);
        else if (Prefix.EXA.equals(prefix)) return a * Math.pow(10, 18);
        else if (Prefix.ZETTA.equals(prefix)) return a * Math.pow(10, 21);
        else if (Prefix.YOTTA.equals(prefix)) return a * Math.pow(10, 24);
        else if (Prefix.DECI.equals(prefix)) return a * Math.pow(10, -1);
        else if (Prefix.CENTI.equals(prefix)) return a * Math.pow(10, -2);
        else if (Prefix.MILLI.equals(prefix)) return a * Math.pow(10, -3);
        else if (Prefix.MICRO.equals(prefix)) return a * Math.pow(10, -6);
        else if (Prefix.NANO.equals(prefix)) return a * Math.pow(10, -9);
        else if (Prefix.PICO.equals(prefix)) return a * Math.pow(10, -12);
        else if (Prefix.FEMTO.equals(prefix)) return a * Math.pow(10, -15);
        else if (Prefix.ATTO.equals(prefix)) return a * Math.pow(10, -18);
        else if (Prefix.ZEPTO.equals(prefix)) return a * Math.pow(10, -21);
        return a;
    }
    private BigDecimal valuePowerByPrefix(BigDecimal a) {
        if (Prefix.NonePrefix.equals(prefix)) return a;
        else if (Prefix.DECA.equals(prefix)) return a.multiply(new BigDecimal(10));
        else if (Prefix.HECTO.equals(prefix)) return a.multiply(new BigDecimal(100));
        else if (Prefix.KILO.equals(prefix)) return a.multiply(new BigDecimal(1000));
        else if (Prefix.MEGA.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, 6)));
        else if (Prefix.GIGA.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, 9)));
        else if (Prefix.TERA.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, 12)));
        else if (Prefix.PETA.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, 15)));
        else if (Prefix.EXA.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, 18)));
        else if (Prefix.ZETTA.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, 21)));
        else if (Prefix.YOTTA.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, 24)));
        else if (Prefix.DECI.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -1)));
        else if (Prefix.CENTI.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -2)));
        else if (Prefix.MILLI.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -3)));
        else if (Prefix.MICRO.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -6)));
        else if (Prefix.NANO.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -9)));
        else if (Prefix.PICO.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -12)));
        else if (Prefix.FEMTO.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -15)));
        else if (Prefix.ATTO.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -18)));
        else if (Prefix.ZEPTO.equals(prefix)) return a.multiply(BigDecimal.valueOf(Math.pow(10, -21)));
        return a;
    }

}
