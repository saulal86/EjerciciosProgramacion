package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        String fraseEnMayusculas = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es: " + fraseEnMayusculas);
    }
}
