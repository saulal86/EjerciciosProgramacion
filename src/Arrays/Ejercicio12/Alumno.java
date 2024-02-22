package Arrays.Ejercicio12;

public class Alumno {
    String nombre;
    double[] calificaciones;

    public Alumno(String nombre, int numEvaluaciones) {
        this.nombre = nombre;
        this.calificaciones = new double[numEvaluaciones];
    }

    public double calcularNotaMedia() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public double obtenerCalificacion(int evaluacion) {
        return calificaciones[evaluacion - 1];
    }
}
