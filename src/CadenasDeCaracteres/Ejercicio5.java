package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Ejercicio5 e = new Ejercicio5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String nombre = scanner.nextLine();
        e.caracteres(nombre);
    }
    public void caracteres(String nombre){
        nombre = nombre.replaceAll("\\s", "");
        String primCar = nombre.substring(0,1);
        String ultiCar = nombre.substring(nombre.length()-1, nombre.length());
        String aux = nombre.substring(1, nombre.length() -1 );
        String resultado = primCar + aux.replaceAll("[a-z]", "*") + ultiCar;
        System.out.println(resultado);
    }
}
