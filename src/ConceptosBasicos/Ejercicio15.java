package ConceptosBasicos;


public class Ejercicio15 {
    public static void main(String[] args) {
        int n = 50;
        long resultado = 1;
        for (int i = 1; i <= n * 2; i += 2) {
            resultado *= i;}
        System.out.println("El producto de los 50 primeros números impares es: " + resultado);
    }
}

