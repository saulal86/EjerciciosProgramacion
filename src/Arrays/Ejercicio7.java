package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del vector (entre 10 y 20): ");
        int size = scanner.nextInt();

        if (size < 10 || size > 20) {
            System.out.println("Tamaño inválido. Debe estar entre 10 y 20.");
            return;
        }

        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(101); // Números aleatorios entre 0 y 100
        }

        System.out.println("Contenido del vector:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int minDiff = minAdjacentDifference(nums);
        System.out.println("Mínima diferencia entre valores adyacentes: " + minDiff);
    }

    public static int minAdjacentDifference(int[] nums) {
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i - 1]);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }
}


