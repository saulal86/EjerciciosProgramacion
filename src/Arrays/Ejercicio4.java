package Arrays;

public class Ejercicio4 {
    int[] numeros;

    public void tamañoArray(int tamaño) {
        numeros = new int[tamaño];
    }

    public void rellenarArray() {
        for (int i = 0; i < numeros.length; i++) {
            int random = (int) ((Math.random() * 201) - 100);
            numeros[i] = random;
        }
    }

    public void suma() {
        int suma = 0;
        int numerosNoSumados = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 13) {
                int limite = Math.min(i + 13, numeros.length);
                boolean sumar = true;

                for (int j = i; j < limite; j++) {
                    suma += numeros[j];
                    if (numeros[j] == 13) {
                        sumar = false;
                    }
                }

                if (sumar && suma != 7) {
                    numerosNoSumados += limite - i;
                }

                i = limite - 1;
            } else {
                suma += numeros[i];
            }
        }

        System.out.println("Contenido del vector:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Suma de los números almacenados: " + suma);
        System.out.println("Cantidad de números no sumados: " + numerosNoSumados);
    }

    public static void main(String[] args) {
        Ejercicio4 e = new Ejercicio4();
        e.tamañoArray(20);
        e.rellenarArray();
        e.suma();

    }
}
