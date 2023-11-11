package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double G = 6.672e-8;
        double m1 = 0;
        System.out.println("Introduce la masa 1 en kg: ");
        m1 = scanner.nextDouble();
        double m2 = 0;
        System.out.println("Introduce la masa 2 kg: ");
        m2 = scanner.nextDouble();
        double d = 0;
        System.out.println("Introduce la distancia entre las masas :");
        d = scanner.nextDouble();
        double F = G*((m1*m2)/d*d);
        System.out.println("La gravitacion universal con los datos introducidos es: " + F + "m/s^2");
    }
}
