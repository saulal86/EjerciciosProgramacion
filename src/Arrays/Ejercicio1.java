package Arrays;

import java.util.Scanner;

public class Ejercicio1 {
    private int[] lanzamientos;
    private int[] caras;

    public void lanzaDados(int tiradas) {
        lanzamientos = new int[tiradas];
        caras = new int[6];

        for (int i = 0; i < tiradas; i++) {
            int random = (int) ((Math.random() * 6) + 1);
            lanzamientos[i] = random;
            caras[random - 1]++;
        }

        for (int i = 0; i < lanzamientos.length; i++) {
            System.out.println("Tirada " + (i + 1) + ": " + lanzamientos[i]);
        }

        System.out.println("\nFrecuencia de cada cara:");
        for (int i = 0; i < caras.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + caras[i] + " veces");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio1 e = new Ejercicio1();
        System.out.println("Introduce el número de veces que quieres tirar los dados: ");
        int tiradas = scanner.nextInt();
        e.lanzaDados(tiradas);
    }
}


