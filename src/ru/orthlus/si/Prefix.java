package ru.orthlus.si;

public final class Prefix {
    private final String prefix;

    public Prefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return this.prefix;
    }

    /**
     * 10 ^ 0
     */
    public final static Prefix NonePrefix = new Prefix("NonePrefix");
    /**
     * 10 ^ 1
     */
    public final static Prefix DECA = new Prefix("DECA");
    public final static String DECA_MIN = "da";
    /**
     * 10 ^ 2
     */
    public final static Prefix HECTO = new Prefix("HECTO");
    public final static String HECTO_MIN = "h";
    /**
     * 10 ^ 3
     */
    public final static Prefix KILO = new Prefix("KILO");
    public final static String KILO_MIN = "k";
    /**
     * 10 ^ 6
     */
    public final static Prefix MEGA = new Prefix("MEGA");
    public final static String MEGA_MIN = "M";
    /**
     * 10 ^ 9
     */
    public final static Prefix GIGA = new Prefix("GIGA");
    public final static String GIGA_MIN = "G";
    /**
     * 10 ^ 12
     */
    public final static Prefix TERA = new Prefix("TERA");
    public final static String TERA_MIN = "T";
    /**
     * 10 ^ 15
     */
    public final static Prefix PETA = new Prefix("PETA");
    public final static String PETA_MIN = "P";
    /**
     * 10 ^ 18
     */
    public final static Prefix EXA = new Prefix("EXA");
    public final static String EXA_MIN = "E";
    /**
     * 10 ^ 21
     */
    public final static Prefix ZETTA = new Prefix("ZETTA");
    public final static String ZETTA_MIN = "Z";
    /**
     * 10 ^ 24
     */
    public final static Prefix YOTTA = new Prefix("YOTTA");
    public final static String YOTTA_MIN = "Y";
    /**
     * 10 ^ −1
     */
    public final static Prefix DECI = new Prefix("DECI");
    public final static String DECI_MIN = "d";
    /**
     * 10 ^ −2
     */
    public final static Prefix CENTI = new Prefix("CENTI");
    public final static String CENTI_MIN = "c";
    /**
     * 10 ^ −3
     */
    public final static Prefix MILLI = new Prefix("MILLI");
    public final static String MILLI_MIN = "m";
    /**
     * 10 ^ −6
     */
    public final static Prefix MICRO = new Prefix("MICRO");
    public final static String MICRO_MIN = "µ";
    /**
     * 10 ^ −9
     */
    public final static Prefix NANO = new Prefix("NANO");
    public final static String NANO_MIN = "n";
    /**
     * 10 ^ −12
     */
    public final static Prefix PICO = new Prefix("PICO");
    public final static String PICO_MIN = "p";
    /**
     * 10 ^ −15
     */
    public final static Prefix FEMTO = new Prefix("FEMTO");
    public final static String FEMTO_MIN = "f";
    /**
     * 10 ^ −18
     */
    public final static Prefix ATTO = new Prefix("ATTO");
    public final static String ATTO_MIN = "a";
    /**
     * 10 ^ −21
     */
    public final static Prefix ZEPTO = new Prefix("ZEPTO");
    public final static String ZEPTO_MIN = "z";
    /**
     * 10 ^ −24
     */
    public final static Prefix YOCTO = new Prefix("YOCTO");
    public final static String YOCTO_MIN = "y";
}
