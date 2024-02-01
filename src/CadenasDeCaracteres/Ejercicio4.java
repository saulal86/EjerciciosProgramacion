package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 e = new Ejercicio4();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = scanner.nextLine();
        e.subcadena(nombre);
    }
    public void subcadena(String nombre){
        for (int i = 0; i < nombre.length(); i++) {
            String subcadena = nombre.substring(0, i+1);
            System.out.println(subcadena);
        }
    }
}
