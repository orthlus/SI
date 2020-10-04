package test;

import ru.orthlus.si.Mass;

import java.util.Scanner;

/**
 * калькулятор - вычислить объем вещества (бензина) по массе в фунтах
 */
public class Test {
    public static void main(String[] args) {
        double densityPetrol = 0.7;
        double mass = new Scanner(System.in).nextDouble();
        Mass.Pound m = new Mass.Pound(mass);
        System.out.println(densityPetrol * m.toKilogram().getValue());

    }
}
