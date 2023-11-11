package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double velocidadInicial = 5;
        double aceleracion = 2;
        double espacioInicial = 5;
        double tiempo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introudce el tiempo: ");
        tiempo = scanner.nextDouble();
        double espacioRecorrido = espacioInicial + (velocidadInicial * tiempo) + (0.5 * aceleracion * tiempo * tiempo);
        System.out.println("El espacio recorrido es: " + espacioRecorrido + " metros");
    }
}
