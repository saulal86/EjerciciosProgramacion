package Arrays;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de secuencias: ");
        int numSequences = scanner.nextInt();

        int totalNumbers = 0;
        int[] numbers;

        for (int i = 0; i < numSequences; i++) {
            System.out.print("Introduce la cantidad de números de la secuencia " + (i + 1) + ": ");
            int sequenceLength = scanner.nextInt();
            totalNumbers += sequenceLength;
        }

        numbers = new int[totalNumbers];

        int index = 0;
        for (int i = 0; i < numSequences; i++) {
            System.out.println("Introduce los números de la secuencia " + (i + 1) + ":");
            int sequenceLength = scanner.nextInt();
            for (int j = 0; j < sequenceLength; j++) {
                numbers[index++] = scanner.nextInt();
            }
        }

        System.out.println("Secuencias de números almacenadas:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
