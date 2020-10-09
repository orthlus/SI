package test;

import ru.orthlus.si.OldMass;
//import ru.orthlus.si.Prefix;
//import ru.orthlus.si.Mass;
import ru.orthlus.siwithoutprefix.Prefix;
import ru.orthlus.siwithoutprefix.Mass;

/**
 * калькулятор - вычислить объем вещества (бензина) по массе в фунтах
 */
public class Test {
    public static void main(String[] args) {
        /*табличное значение*/
        double densityPetrol = 0.7;
        /*входное значение калькулятора*/
//        double mass = new Scanner(System.in).nextDouble();
        double mass = 500.09;
        OldMass.Pound m = new OldMass.Pound(mass);
        System.out.println("Объем " + mass + " фунтов бензина равен " + densityPetrol * OldMass.toSI(m).getValue());

        Mass.Carat mc = new Mass.Carat(mass);
        System.out.println("Объем " + mass + " каратт бензина равен " + densityPetrol * mc.toSI().getValue());

        Prefix prefix = Prefix.KILO;
        System.out.println(Prefix.DECA.equals(prefix));

        System.out.println();

        Mass.Gram gram = new Mass.Gram(2000);
        System.out.println(gram);
        System.out.println(gram.toSI());
        System.out.println(Prefix.toPrefix(gram.getValue(), Prefix.MEGA));
    }
}
