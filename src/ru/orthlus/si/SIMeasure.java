package ru.orthlus.si;

/**
 * единицы измерения, которые входят в СИ
 */
public abstract class SIMeasure extends Measure {
    public SIMeasure(double value) {
        super(value);
    }

    public SIMeasure(double value, Prefix prefix) {
        super(value, prefix);
    }
    public abstract SIMeasure toSI(Measure measure);
}
