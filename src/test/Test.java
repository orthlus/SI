package test;

import ru.orthlus.si.Mass;

import java.util.Scanner;

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
        Mass.Pound m = new Mass.Pound(mass);
        System.out.println("Объем " + mass + " фунтов бензина равен " + densityPetrol * m.toKilogram().getValue());

    }
}
