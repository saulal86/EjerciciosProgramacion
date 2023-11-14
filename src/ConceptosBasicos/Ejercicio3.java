package ConceptosBasicos;

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        int euros = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los euros que quieras pasar a dolares: ");
        euros = scanner.nextInt();
        double dolares = euros * 1.07;
        System.out.printf("Al cambio " + euros + "son " + "%.2f", dolares);
    }

}
