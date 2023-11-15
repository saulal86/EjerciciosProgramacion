package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Introduce el número al cual quieres que llegue la suma: ");
        n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("La suma final es: "+ suma);
    }
}
