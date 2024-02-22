package Arrays;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        System.out.println("Introduce los nombres de 10 personas:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        String longestName = findLongestString(names);
        System.out.println("El nombre más largo es: " + longestName);
    }

    public static String findLongestString(String[] strings) {
        String longestString = "";
        for (String str : strings) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }
}


