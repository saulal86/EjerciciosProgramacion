package ConceptosBasicos;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre = "";
        String direccion = "";
        int edad = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno: ");
        nombre = scanner.nextLine();
        System.out.println("Introduce la dirección del alumno: ");
        direccion = scanner.nextLine();
        System.out.println("Introduce la edad del alumno");
        edad = scanner.nextInt();
        System.out.println("El nombre del alumno es: " + nombre);
        System.out.println("La dirección del alumno es: " + direccion);
        System.out.println("La edad del alumno es: " + edad);
    }
}
