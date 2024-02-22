package Arrays;

public class Ejercicio13 {
    public static void ordenarPorInsercionDirecta(int[] vector) {
        int n = vector.length;

        for (int i = 1; i < n; i++) {
            int clave = vector[i];
            int j = i - 1;

            while (j >= 0 && vector[j] > clave) {
                vector[j + 1] = vector[j];
                j--;
            }

            vector[j + 1] = clave;
        }
    }

    public static void ordenarPorSeleccionDirecta(int[] vector) {
        int n = vector.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (vector[j] < vector[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int temp = vector[indiceMinimo];
            vector[indiceMinimo] = vector[i];
            vector[i] = temp;
        }
    }

    public static void ordenarPorIntercambioDirecto(int[] vector) {
        int n = vector.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vector = {5, 2, 9, 1, 5, 6};

        System.out.println("Vector original:");
        imprimirVector(vector);

        ordenarPorInsercionDirecta(vector.clone());
        System.out.println("Ordenado por inserción directa:");
        imprimirVector(vector);

        ordenarPorSeleccionDirecta(vector.clone());
        System.out.println("Ordenado por selección directa:");
        imprimirVector(vector);

        ordenarPorIntercambioDirecto(vector.clone());
        System.out.println("Ordenado por intercambio directo:");
        imprimirVector(vector);
    }
}


