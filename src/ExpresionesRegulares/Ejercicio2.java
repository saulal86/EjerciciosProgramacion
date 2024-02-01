package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static boolean validarFecha(String fecha){
        String regex = "^(\\d{2}[/\\-])([a-zA-Z]{3}|\\d{2})[/\\-]\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha: ");
        String fecha = scanner.nextLine();
        if (validarFecha(fecha)){
            System.out.println("La fecha " + fecha + " es válida.");
        }else{
            System.out.println("La fecha " + fecha + "no es válida");
        }
    }
}
