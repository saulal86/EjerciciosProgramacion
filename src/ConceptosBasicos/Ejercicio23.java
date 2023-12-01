package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la coordenada x: ");
        double x = scanner.nextDouble();
        System.out.print("Introduce la coordenada y: ");
        double y = scanner.nextDouble();
        double[] coordenadasPolares = transformacionCoordenadasPolares(x, y);
        System.out.println("Coordenadas polares: (r = " + coordenadasPolares[0] + ", theta = " + coordenadasPolares[1] + " rad)");
    }

    public static double[] transformacionCoordenadasPolares(double x, double y) {
        // Calcula r y theta
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        // Almacena r y theta en un arreglo
        double[] coordenadasPolares = {r, theta};
        return coordenadasPolares;
    }
}


