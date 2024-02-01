package ExpresionesRegulares;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static boolean validarCompra(String ticket){
        String regex = "^(>>[a-zA-z])<<(\\d):(\\d)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ticket);
        return matcher.matches();
    }

    public void compra(String ticket){
        System.out.println("Compra: ");
        String[] mueble = ticket.split("<<");
        mueble[0] = mueble[0].replaceAll(">>", "");
        String[] precio = mueble[1].split(":");
        String[] cantidad = mueble[1].split(":");
        System.out.println(mueble[0] + "(" + cantidad[1] + ")" + "\n" + "Precio final: " + precio[0] + "€");
    }
    public static void main(String[] args) {
        Ejercicio3 e = new Ejercicio3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el ticket de la compra: ");
        String ticket = scanner.nextLine();
        if (validarCompra(ticket)){
            e.compra(ticket);
        }else{
            System.out.println("El ticket no es válido");
        }
    }
}
