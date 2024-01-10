package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio29 {
    int[] notas = new int[10];
    public void rellenarArray(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce las notas: ");
            notas[i] = scanner.nextInt();
        }
    }
    public int mediaNotas(){
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        int media = suma/notas.length   ;
        return media;
    }

    public static void main(String[] args) {
        Ejercicio29 e = new Ejercicio29();
        e.rellenarArray();
        System.out.println("La media de las notas introducidas es: " + e.mediaNotas());
    }
}
