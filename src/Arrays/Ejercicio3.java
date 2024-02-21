package Arrays;

import java.util.Scanner;

public class Ejercicio3 {
    int[] numeros;

    public void tamañoArray(int tamaño){

        numeros = new int[tamaño];
    }
    public float rellenarArray(){
        float tiempoP = System.nanoTime();
        for (int i = 0; i < numeros.length; i++) {
            int random = (int) ((Math.random() * 1999999) - 999999);
            numeros[i] = random;
        }
        float tiempoF = System.nanoTime();
        float tiempo = tiempoF - tiempoP;
        return tiempo;
    }
    public int encontrarMaximo() {
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    public int encontrarMinimo() {
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio3 e = new Ejercicio3();
        System.out.println("Introduce el tamaño del array entre 10 y 1000000");
        int tamaño = scanner.nextInt();
        e.tamañoArray(tamaño);
        System.out.println("El tamaño del vector es: " + tamaño );
        e.rellenarArray();
        int tiempoP = (int) System.nanoTime();
        int num = e.encontrarMinimo()-e.encontrarMaximo();
        int tiempoF = (int) System.nanoTime();
        int tiempo = tiempoF - tiempoP;
        System.out.println("La diferencia entre el numero maximo y el numero minimo es: " + num);
        System.out.println("El tiempo que tarda en calcular la diferencia es: " + tiempo);
    }

}
