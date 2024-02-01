package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static boolean validarPalabra(String palabras){
        String regex = "^[A-Z][a-z]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabras);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Ejercicio1 e = new Ejercicio1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce unas cadena de palabras separadas por comas: ");
        String palabras = scanner.nextLine();
        String trozos[] = palabras.split(",");
        if (trozos.length >= 2){
            for (int i = 0; i < trozos.length; i++) {
                if (validarPalabra(trozos[i])){
                    System.out.println("La palabra " + trozos[i] + " es valida");
                }else{
                    System.out.println("La palabra " + trozos[i] + " no es valida");
                }
            }
        }
    }
}
