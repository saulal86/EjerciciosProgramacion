package Arrays;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(491) + 10;
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(201) - 100;
        }

        System.out.println("Tamaño del vector: " + size);

        if (size <= 50) {
            System.out.println("Contenido del vector:");
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int countSequences = countRepeatedSequences(nums);
        System.out.println("Número de secuencias de números repetidos: " + countSequences);
    }

    public static int countRepeatedSequences(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return count;
    }
}


