package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.print("INtroduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double perimetro = 2 * PI * radio;
        double area = PI * radio * radio;
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
        System.out.println("El área de la circunferencia es: " + area);
    }

}
