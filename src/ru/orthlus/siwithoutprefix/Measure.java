package ru.orthlus.siwithoutprefix;

import ru.orthlus.si.Prefix;

public abstract class Measure {
    protected double value;
    protected String min;

    public Measure(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return
                this.getValue()
                        + " "
                        + this.min;
    }
}
