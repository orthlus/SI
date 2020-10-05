package ru.orthlus.si;

import java.math.BigDecimal;

public abstract class AbstractMeasure {
    private double value;
    private BigDecimal valueBigDecimal;
    private Prefix prefix;
    public double IN_KILOGRAMS;

    public double getValue() {
        return prefix.valuePowerByPrefix(this.value);
    }
    public double get_IN_KILOGRAMS(){
        return IN_KILOGRAMS;
    }
    public BigDecimal getValueBigDecimal() {
        return prefix.valuePowerByPrefix(this.valueBigDecimal);
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

}
