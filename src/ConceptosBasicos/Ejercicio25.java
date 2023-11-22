package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio25 {
    private void invertirArray(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;
            inicio++;
            fin--;
        }
    }
    private void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    public void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array original:");
        imprimirArray(numeros);
        invertirArray(numeros);
        System.out.println("\nArray invertido:");
        imprimirArray(numeros);
    }
}




