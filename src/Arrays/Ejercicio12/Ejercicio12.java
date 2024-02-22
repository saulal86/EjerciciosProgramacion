package Arrays.Ejercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {
    public class GestionCalificaciones {
        static ArrayList<Alumno> alumnos = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int numEvaluaciones = 3; // Ajusta esto según tus necesidades

            while (true) {
                mostrarMenu();
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        mostrarNotaMediaTodos();
                        break;
                    case 2:
                        mostrarNotaMediaAlumno();
                        break;
                    case 3:
                        visualizarNotasPorEvaluacion();
                        break;
                    case 4:
                        visualizarNotasPorEvaluacionAlumno();
                        break;
                    case 5:
                        calcularNotaMediaCurso();
                        break;
                    case 6:
                        encontrarNotaExtrema();
                        break;
                    case 7:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            }
        }

        private static void mostrarMenu() {
            System.out.println("\n*** Menú ***");
            System.out.println("1. Mostrar la nota media de todos los alumnos");
            System.out.println("2. Mostrar la nota media de un alumno determinado");
            System.out.println("3. Visualizar las notas por evaluación y la nota final de cada evaluación");
            System.out.println("4. Visualizar las notas por evaluación y la nota final de un alumno determinado");
            System.out.println("5. Calcular la nota media del curso");
            System.out.println("6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
        }

        private static void mostrarNotaMediaTodos() {
            for (Alumno alumno : alumnos) {
                System.out.println(alumno.nombre + ": " + alumno.calcularNotaMedia());
            }
        }

        private static void mostrarNotaMediaAlumno() {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.next();

            for (Alumno alumno : alumnos) {
                if (alumno.nombre.equals(nombre)) {
                    System.out.println("Nota media de " + nombre + ": " + alumno.calcularNotaMedia());
                    return;
                }
            }

            System.out.println("Alumno no encontrado.");
        }

        private static void visualizarNotasPorEvaluacion() {
            for (int i = 0; i < 3; i++) { // Ajusta 3 según tus necesidades
                System.out.println("Evaluación " + (i + 1) + ":");
                for (Alumno alumno : alumnos) {
                    System.out.println(alumno.nombre + ": " + alumno.obtenerCalificacion(i + 1));
                }
            }
        }

        private static void visualizarNotasPorEvaluacionAlumno() {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.next();

            for (Alumno alumno : alumnos) {
                if (alumno.nombre.equals(nombre)) {
                    System.out.println("Notas de " + nombre + " por evaluación:");
                    for (int i = 0; i < 3; i++) { // Ajusta 3 según tus necesidades
                        System.out.println("Evaluación " + (i + 1) + ": " + alumno.obtenerCalificacion(i + 1));
                    }
                    return;
                }
            }

            System.out.println("Alumno no encontrado.");
        }

        private static void calcularNotaMediaCurso() {
            double suma = 0;
            for (Alumno alumno : alumnos) {
                suma += alumno.calcularNotaMedia();
            }
            System.out.println("Nota media del curso: " + (suma / alumnos.size()));
        }

        private static void encontrarNotaExtrema() {
            double notaMaxima = 0;
            double notaMinima = Double.MAX_VALUE;
            String nombreMaxima = "";
            String nombreMinima = "";
            int evaluacionMaxima = 0;
            int evaluacionMinima = 0;

            for (Alumno alumno : alumnos) {
                for (int i = 0; i < alumno.calificaciones.length; i++) {
                    if (alumno.calificaciones[i] > notaMaxima) {
                        notaMaxima = alumno.calificaciones[i];
                        nombreMaxima = alumno.nombre;
                        evaluacionMaxima = i + 1;
                    }

                    if (alumno.calificaciones[i] < notaMinima) {
                        notaMinima = alumno.calificaciones[i];
                        nombreMinima = alumno.nombre;
                        evaluacionMinima = i + 1;
                    }
                }
            }

            System.out.println("Nota más alta: " + notaMaxima + " - Alumno: " + nombreMaxima + " - Evaluación: " + evaluacionMaxima);
            System.out.println("Nota más baja: " + notaMinima + " - Alumno: " + nombreMinima + " - Evaluación: " + evaluacionMinima);
        }
    }

}
