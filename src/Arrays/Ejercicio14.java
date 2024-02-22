package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] vector1 = generarVectorAleatorio();
        int[] vector2 = generarVectorAleatorio();
        Arrays.sort(vector1);
        Arrays.sort(vector2);

        int[] vectorMezclado = mezclarVectoresOrdenados(vector1, vector2);

        System.out.println("Vector 1 ordenado: " + Arrays.toString(vector1));
        System.out.println("Vector 2 ordenado: " + Arrays.toString(vector2));
        System.out.println("Vector mezclado: " + Arrays.toString(vectorMezclado));
    }

    private static int[] generarVectorAleatorio() {
        Random random = new Random();
        int longitud = random.nextInt(91) + 10;
        int[] vector = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            vector[i] = random.nextInt(1000);
        }

        return vector;
    }

    private static int[] mezclarVectoresOrdenados(int[] vector1, int[] vector2) {
        int[] vectorMezclado = new int[vector1.length + vector2.length];
        int i = 0, j = 0, k = 0;

        while (i < vector1.length && j < vector2.length) {
            vectorMezclado[k++] = (vector1[i] < vector2[j]) ? vector1[i++] : vector2[j++];
        }

        while (i < vector1.length) {
            vectorMezclado[k++] = vector1[i++];
        }

        while (j < vector2.length) {
            vectorMezclado[k++] = vector2[j++];
        }

        return vectorMezclado;
    }
}


