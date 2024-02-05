package Arrays;

import java.util.Arrays;

public class Ejercicio2 {
    private int[] enteros;
    private int[] enterosReves;

    public void tamañoArray() {
        int tamaño = (int) (Math.random() * 41) + 10;
        enteros = new int[tamaño];
        enterosReves = new int[tamaño];
    }

    public void rellenaArray() {
        for (int i = 0; i < enteros.length; i++) {
            int randoms = (int) (Math.random() * 201) - 100;
            enteros[i] = randoms;
        }
        System.out.println("El array en orden es el siguiente: " + "\n");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }

    }

    public void revertirArray() {
        for (int i = 0; i < enteros.length; i++) {
            enterosReves[i] = enteros[enteros.length - 1 - i];
        }

        System.out.println("El array dado la vuelta es el siguiente: " + "\n");
        for (int i = 0; i < enterosReves.length; i++) {
            System.out.println(enterosReves[i]);
        }
    }

    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();
        e.tamañoArray();
        e.rellenaArray();
        e.revertirArray();
    }
}
