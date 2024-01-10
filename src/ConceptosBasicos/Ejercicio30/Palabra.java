package ConceptosBasicos.Ejercicio30;

public class Palabra implements Comparable<Palabra>{
    String palabra;
    int longitud;

    public Palabra(String palabra, int longitud) {
        this.palabra = palabra;
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    @Override
    public int compareTo(Palabra o) {
        return longitud - o.getLongitud();
    }

    @Override
    public String toString() {
        return "La palabra es: " + palabra + " y la longitud es: " + longitud;
    }
}
