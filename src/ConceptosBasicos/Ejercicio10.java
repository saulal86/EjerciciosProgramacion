package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0, b=0, c=0;
        System.out.println("Introduce el valor que le quieras dar a la incógnita a: ");
        a = scanner.nextInt();
        System.out.println("Introduce el valor que le quieras dar a la incógnita b: ");
        b = scanner.nextInt();
        System.out.println("Introduce el valor que le quieras dar a la incógnita c: ");
        c = scanner.nextInt();
        double formula = b*b-4*a*c;
        if (formula >= 0) {
            double ecuacionpositivo = (-b + Math.sqrt(formula)) / (2*a);
            double ecuacionnegativo = (-b - Math.sqrt(formula)) / (2*a);
            System.out.println("Solución positiva: " + ecuacionpositivo);
            System.out.println("Solución negativa: " + ecuacionnegativo);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
