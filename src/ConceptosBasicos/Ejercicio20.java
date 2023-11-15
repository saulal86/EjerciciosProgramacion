package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el lado del triángulo: ");
        int lado = scanner.nextInt();
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
