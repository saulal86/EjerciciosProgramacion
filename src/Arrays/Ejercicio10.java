package Arrays;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(19) + 2;
        int cols = random.nextInt(19) + 2;
        int[][] matrix = new int[rows][cols];

        System.out.println("Matriz:");
        int[] rowSums = new int[rows];
        int[] colSums = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int num = random.nextInt(101);
                matrix[i][j] = num;
                rowSums[i] += num;
                colSums[j] += num;
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        System.out.println("Suma de las filas:");
        printArray(rowSums);

        System.out.println("Suma de las columnas:");
        printArray(colSums);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


