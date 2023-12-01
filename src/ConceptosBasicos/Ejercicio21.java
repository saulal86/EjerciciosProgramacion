package ConceptosBasicos;

public class Ejercicio21 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        int resultado = fibonacci(n);
        System.out.println("El " + n + "-ésimo término de la serie de Fibonacci es: " + resultado);
    }
}


