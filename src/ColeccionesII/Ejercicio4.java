package ColeccionesII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ejercicio4 {
    HashMap<String, Integer> mapa = new HashMap<>();
    public void rellenaMapa(ArrayList<String> lista) {
        for (String palabra : lista) {
            if (mapa.containsKey(palabra)) {
                int n = mapa.get(palabra);
                mapa.put(palabra, n+1);
            }else{
                mapa.put(palabra,1);
            }
        }
    }
    public boolean algunaSeRepiteAlMenos3Veces(){
        Iterator it = mapa.keySet().iterator();
        while (it.hasNext()){
            String palabra = (String) it.next();
            int n = mapa.get(palabra);
            if (n>3){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        ArrayList<String>lista = new ArrayList<>();
        lista.add("hola");
        lista.add("adios");
        lista.add("hola");
        lista.add("hola");
        lista.add("hola");
        lista.add("pedro");
        Ejercicio4 e = new Ejercicio4();
        e.rellenaMapa(lista);
        System.out.println(e.algunaSeRepiteAlMenos3Veces());
    }
}

