package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        String palabraMenosCaracteres = (palabra1.length() < palabra2.length()) ? palabra1 : palabra2;
        System.out.println("La palabra con menos caracteres es: " + palabraMenosCaracteres);
    }
}
