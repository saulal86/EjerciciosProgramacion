package ConceptosBasicos;

import java.util.ArrayList;

public class Ejercicio26 {
    ArrayList<Integer> vectorPrimos= new ArrayList<>();
    private boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
     private void rellenaArray(){
        int contP = 0;
        int n = 1;
        while (contP < 20){
            if(esPrimo(n)){
                contP++;
                vectorPrimos.add(n);
            }
            n++;
        }
     }
     private String mostrarArray(){
         String cadena = "";
         for (Integer c:vectorPrimos) {
             cadena+= c+" ";
         }
         return cadena;
     }
    public static void main(String[] args) {
        Ejercicio26 e = new Ejercicio26();
        e.rellenaArray();
        System.out.println(e.mostrarArray());
    }
}
