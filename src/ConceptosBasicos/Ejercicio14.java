package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int DNI = 0;
        System.out.println("Introduce tu DNI: ");
        DNI = scanner.nextInt();
        String letra = String.valueOf("TRWAGMYFPDXBNJZSQVHLCKE".charAt(DNI % 23));
        System.out.println(letra);
    }
}
