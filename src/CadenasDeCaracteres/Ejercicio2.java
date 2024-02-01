package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio2 {
    public void contarRepeticiones(String cadenaPrincipal, String cadena2) {
        int cont = 0;
        for (int i = 0; i <= cadenaPrincipal.length() - cadena2.length(); i++) {
            String aux = cadenaPrincipal.substring(i, cadena2.length() + i);
            if (aux.equals(cadena2)) {
                cont++;
            }
        }
        System.out.println("La primera palabra se repite: " + cont + " veces");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la cadena principal: ");
        String cadenaPrincipal = scanner.nextLine();
        System.out.println("Escribe la cadena a comparar: ");
        String cadena2 = scanner.nextLine();
        Ejercicio2 e = new Ejercicio2();
        e.contarRepeticiones(cadenaPrincipal, cadena2);
    }
}
