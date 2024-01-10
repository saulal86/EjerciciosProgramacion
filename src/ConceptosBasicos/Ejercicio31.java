package ConceptosBasicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> vocales = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        System.out.println("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if(vocales.contains(cadena.charAt(i))){
                System.out.println("Se ha encontrado una vocal en la posicion: " + i);
            }
        }
    }
}
