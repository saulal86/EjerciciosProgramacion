package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = (int) ((Math.random() * 100) + 1);
        int r = 0;
        System.out.println("Introduce un número que creas que pueda ser el número aleatorio: ");
        r = scanner.nextInt();
        while(r != n) {
            if (r > n) {
                System.out.println("El numero introducido es mayor que el número secreto, vuelve a introducir otro número: ");
                r = scanner.nextInt();
                if (r == n) {
                    System.out.println("Felicidades has acertado");
                }
            } else if (r < n) {
                System.out.println("El numero introducido es menor que el número secreto, vuelve a introducir otro número: ");
                r = scanner.nextInt();
                if (r == n) {
                    System.out.println("Felicidades has acertado");
                }
            } else if (r == n) {
                System.out.println("Felicidades has acertado");
            }
        }
    }
}
