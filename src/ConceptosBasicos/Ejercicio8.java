package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        double r = 0;
        double g = 0;
        double b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la r: ");
        r = scanner.nextDouble();
        System.out.println("Introduce la g: ");
        g = scanner.nextDouble();
        System.out.println("Introduce la b: ");
        b = scanner.nextDouble();
        double y = 0.299*r + 0.587*g + 0.114*b;
        double i = 0.596*r - 0.275*g -0.321*b;
        double q = 0.212*r - 0.528*g + 0.311*b;
        System.out.println(y);
        System.out.println(i);
        System.out.println(q);
    }
}
