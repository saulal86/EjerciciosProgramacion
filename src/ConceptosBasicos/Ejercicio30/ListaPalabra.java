package ConceptosBasicos.Ejercicio30;

import java.util.Arrays;
import java.util.Scanner;

public class ListaPalabra {
    Palabra[] palabras = new Palabra[10];

    public void rellenar(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce una linea: ");
            String linea = scanner.nextLine();
            Palabra p = new Palabra(linea, linea.length());
            palabras [i] = p;
        }
    }
    public void ordenar(){
        Arrays.sort(palabras);
    }
    public void mostrar(){
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }

    public static void main(String[] args) {
        ListaPalabra e = new ListaPalabra();
        e.rellenar();
        e.ordenar();
        e.mostrar();
    }
}
