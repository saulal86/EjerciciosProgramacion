package ExpresionesRegulares.Ejercicio3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

    LinkedList<Compra> compras = new LinkedList<>();

    public static boolean validarCompra(String ticket){
        String regex =">>([a-zA-Z]+)<<((\\d+\\.\\d+)|(\\d+\\d+)):(\\d+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ticket);
        return matcher.matches();
    }

    public void compra(String ticket){
        System.out.println("Introduce otro mueble: ");
        String[] mueble = ticket.split("<<");
        mueble[0] = mueble[0].replaceAll(">>", "");
        float precio = Float.parseFloat(mueble[1].split(":")[0]);
        int cantidad = Integer.parseInt(mueble[1].split(":")[1]);
        Compra compra = new Compra(mueble[0], cantidad, precio);
        compras.add(compra);
    }
    public void tratarCompras(){
        float precioTot = 0;
        for(Compra c : compras){
            System.out.println(c.getMueble() + "(" + c.getCantidad() + ")");
            precioTot += c.getPrecio()*c.getCantidad();
        }
        System.out.println("Importe total: \n" + precioTot);
    }

    public static void main(String[] args) {
        Ejercicio3 e = new Ejercicio3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el ticket de la compra: ");
        String ticket ="";
        scanner = new Scanner(System.in);
        while(!ticket.equals("comprar")) {
            ticket = scanner.nextLine();
            if (validarCompra(ticket)) {
                e.compra(ticket);

            } else {
                System.out.println("El ticket no es válido o la compra se ha realizado con exito");
            }
            scanner = new Scanner(System.in);


        }
        e.tratarCompras();
    }
}
