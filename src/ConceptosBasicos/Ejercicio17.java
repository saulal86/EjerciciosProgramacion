package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inicio = System.currentTimeMillis();
        String nombre = "";
        System.out.println("Introduce tu nombre: ");
        nombre = scanner.nextLine();
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        System.out.println(tiempo + " milisegundos");
    }
}
