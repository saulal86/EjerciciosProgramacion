package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cadena principal: ");
        String cadenaPrincipal = scanner.nextLine();
        System.out.print("Ingrese la subcadena a buscar: ");
        String subcadena = scanner.nextLine();
        int ocurrencias = contarOcurrencias(cadenaPrincipal, subcadena);
        System.out.println("La subcadena '" + subcadena + "' aparece " + ocurrencias + " veces en la cadena principal.");
        scanner.close();
    }

    public static int contarOcurrencias(String cadenaPrincipal, String subcadena) {
        int contador = 0;
        int inicio = 0;
        while (inicio < cadenaPrincipal.length()) {
            int indice = cadenaPrincipal.indexOf(subcadena, inicio);
            if (indice != -1) {
                contador++;
                inicio = indice + 1;
            } else {
                break;
            }
        }
        return contador;
    }
}
