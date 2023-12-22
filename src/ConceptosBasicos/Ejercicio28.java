package ConceptosBasicos;

public class Ejercicio28 {
    private int [][]matriz;
    public Ejercicio28 (int f, int c){
        matriz = new int[f][c];
    }
    public void rellenar(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = i+j;
            }
        }
    }
    public void mostrar(){
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int sumaP(){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma+=matriz[i][i];
        }
        return suma;
    }
    public static void main(String[] args) {
        Ejercicio28 e = new Ejercicio28(4, 4);
        e.rellenar();
        e.mostrar();
        System.out.println("La suma de la diagonal principal es : " + e.sumaP());
    }
}
