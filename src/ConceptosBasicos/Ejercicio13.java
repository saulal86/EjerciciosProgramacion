package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 0;
        int cont = 0;
        double suma = 0;
        System.out.println("Introduce un numero: ");
        n = scanner.nextDouble();
        double media = 0;
        while(n != 0){
            System.out.println("Introduce otro número, si quieres parar de introducir números introduce el 0: ");
            n = scanner.nextDouble();
            cont++;
            suma += n;
            media = suma / cont;
        }
        System.out.println("La media es: " + media);
    }
}
