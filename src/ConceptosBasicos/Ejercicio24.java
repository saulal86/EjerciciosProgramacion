package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio24 {
    public void mates(double examenM, double tarea1M, double tarea2M, double tarea3M) {
        double mediaTarea = (tarea1M + tarea2M + tarea3M) / 3;
        double notaFinal = examenM * 0.9 + mediaTarea * 0.1;
        System.out.println("La nota final de Matemáticas es: " + notaFinal);
    }

    public void fisica(double examenF, double tarea1F, double tarea2F) {
        double mediaTarea = (tarea1F + tarea2F) / 2;
        double notaFinal = examenF * 0.8 + mediaTarea * 0.2;
        System.out.println("La nota final de Física es: " + notaFinal);
    }

    public void quimica(double examenQ, double tarea1Q, double tarea2Q, double tarea3Q) {
        double mediaTarea = (tarea1Q + tarea2Q + tarea3Q) / 3;
        double notaFinal = examenQ * 0.85 + mediaTarea * 0.15;
        System.out.println("La nota final de Química es: " + notaFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota del examen de Matemáticas: ");
        double examenM = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 1: ");
        double tarea1M = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 2: ");
        double tarea2M = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 3: ");
        double tarea3M = scanner.nextDouble();
        System.out.println("Introduce la nota del examen de Física: ");
        double examenF = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 1: ");
        double tarea1F = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 2: ");
        double tarea2F = scanner.nextDouble();
        System.out.println("Introduce la nota del examen de Química: ");
        double examenQ = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 1: ");
        double tarea1Q = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 2: ");
        double tarea2Q = scanner.nextDouble();
        System.out.println("Introduce la nota de la tarea 3: ");
        double tarea3Q = scanner.nextDouble();
        Ejercicio24 e = new Ejercicio24();
        e.mates(examenM, tarea1M, tarea2M, tarea3M);
        e.fisica(examenF, tarea1F, tarea2F);
        e.quimica(examenQ, tarea1Q, tarea2Q, tarea3Q);

    }
}


