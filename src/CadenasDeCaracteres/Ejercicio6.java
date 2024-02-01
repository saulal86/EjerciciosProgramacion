package CadenasDeCaracteres;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 e = new Ejercicio6();
        Scanner scanner = new Scanner(System.in);
        String secuencia = " ";
        float total = 0;
        while (!secuencia.equals("")) {
            System.out.println("Introduce una secuencia: ");
            secuencia = scanner.nextLine();
            if (!secuencia.equals("")) {
                String trozos[] = secuencia.split(" ");
                for (int i = 0; i < trozos.length; i++) {
                    String linea = trozos[i];
                    total += e.tratarSecuencias(linea);
                }
            }
            scanner = new Scanner(System.in);
        }
        System.out.println(total);
    }

    public float tratarSecuencias(String secuencia) {
        char primero = secuencia.charAt(0);
        char ultimo = secuencia.charAt(secuencia.length() - 1);
        String medio = secuencia.substring(1, secuencia.length() - 1);
        int numeroMedio = Integer.parseInt(medio);
        int valorLetra = 0;
        int calculo = 0;
        float resultado = 0;
        if (Character.isUpperCase(primero)) {
            valorLetra = primero;
            calculo = numeroMedio * valorLetra;
        } else {
            valorLetra = primero;
            calculo = numeroMedio / valorLetra;
        }
        if (Character.isLetter(ultimo)) {
            resultado = (float) Math.sqrt(calculo);
        } else if (Character.isDigit(ultimo)) {
            resultado = (float) Math.log(calculo);
        } else {
            resultado = (float) Math.exp(calculo);
        }
        return resultado;
    }
}
