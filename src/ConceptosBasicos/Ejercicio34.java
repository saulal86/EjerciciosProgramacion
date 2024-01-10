package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio34 {
    private static int contarEspaciosEnBlanco(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        int contadorEspacios = contarEspaciosEnBlanco(frase);
        System.out.println("La frase tiene " + contadorEspacios + " espacio(s) en blanco.");
    }
}
