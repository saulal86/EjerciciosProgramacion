package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Introduce un numero aleatorio: ");
        if(n>0){
            System.out.println("El número introducido es positivo");
        } else if (n<0) {
            System.out.println("El número introducido es negativo");
        } else if (n==0) {
            System.out.println("El número es igual a 0");
        }
    }
}

