package ru.orthlus.si;

import java.math.BigDecimal;

public final class Prefix {
    private final String prefix;
    private double exponent;

    public Prefix(String prefix, double exponent) {
        this.prefix = prefix;
        this.exponent = exponent;
    }

    /**
     * @return Symbol Prefix<br>
     * 'k' for Kilo <br>
     * 'M' for Mega <br>
     * 'm' for Milli
     */
    @Override
    public String toString() {
        return this.prefix;
    }

    /**
     * 10 ^ 0
     */
    public final static Prefix NonePrefix = new Prefix("", 0);
    /**
     * 10 ^ 1
     */
    public final static Prefix DECA = new Prefix("da", 1);
    /**
     * 10 ^ 2
     */
    public final static Prefix HECTO = new Prefix("h", 2);
    /**
     * 10 ^ 3
     */
    public final static Prefix KILO = new Prefix("k", 3);
    /**
     * 10 ^ 6
     */
    public final static Prefix MEGA = new Prefix("M", 6);
    /**
     * 10 ^ 9
     */
    public final static Prefix GIGA = new Prefix("G", 9);
    /**
     * 10 ^ 12
     */
    public final static Prefix TERA = new Prefix("T", 12);
    /**
     * 10 ^ 15
     */
    public final static Prefix PETA = new Prefix("P", 15);
    /**
     * 10 ^ 18
     */
    public final static Prefix EXA = new Prefix("E", 18);
    /**
     * 10 ^ 21
     */
    public final static Prefix ZETTA = new Prefix("Z", 21);
    /**
     * 10 ^ 24
     */
    public final static Prefix YOTTA = new Prefix("Y", 24);
    /**
     * 10 ^ −1
     */
    public final static Prefix DECI = new Prefix("d", -1);
    /**
     * 10 ^ −2
     */
    public final static Prefix CENTI = new Prefix("c", -2);
    /**
     * 10 ^ −3
     */
    public final static Prefix MILLI = new Prefix("m", -3);
    /**
     * 10 ^ −6
     */
    public final static Prefix MICRO = new Prefix("µ", -6);
    /**
     * 10 ^ −9
     */
    public final static Prefix NANO = new Prefix("n", -9);
    /**
     * 10 ^ −12
     */
    public final static Prefix PICO = new Prefix("p", -12);
    /**
     * 10 ^ −15
     */
    public final static Prefix FEMTO = new Prefix("f", -15);
    /**
     * 10 ^ −18
     */
    public final static Prefix ATTO = new Prefix("a", -18);
    /**
     * 10 ^ −21
     */
    public final static Prefix ZEPTO = new Prefix("z", -21);
    /**
     * 10 ^ −24
     */
    public final static Prefix YOCTO = new Prefix("y", -24);

    double valuePowerByPrefix(double a) {
        return a * Math.pow(10, this.exponent);
    }
}
