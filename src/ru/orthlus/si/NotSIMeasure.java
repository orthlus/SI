package ru.orthlus.si;

/**
 * единицы измерения, которые не входят в СИ
 */
public abstract class NotSIMeasure extends Measure {
    public NotSIMeasure(double value) {
        super(value);
    }

    public NotSIMeasure(double value, Prefix prefix) {
        super(value, prefix);
    }
    public abstract SIMeasure toSI(Measure measure);
}
