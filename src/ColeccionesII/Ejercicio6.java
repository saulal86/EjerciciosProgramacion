package ColeccionesII;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ejercicio6 {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int rellenaMapa(ArrayList<Integer> list){
        if (!list.isEmpty()){
            for (Integer n: list) {
                if (map.containsKey(n)){
                    int num = map.get(n);
                    map.put(n,num+1);
                }else{
                    map.put(n,1);

                }
            }
            return 1;
        }
        return 0;
    }
    public String moda(){
        int max = 0;
        int n = 0;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            int numero = (Integer) it.next();
            int value = map.get(numero);
            if(value > max){
                max = value;
                n = numero;

            }
        }
        return "la moda es " + n;
    }


    public static void main(String[] args) {
        Ejercicio6 e = new Ejercicio6();
        ArrayList<Integer> repeticiones = new ArrayList<>();
        repeticiones.add(7, 5);
        repeticiones.add(2, 1);
        repeticiones.add(3, 6);
        repeticiones.add(1, 2);
        repeticiones.add(4, 1);
        if( e.rellenaMapa(repeticiones)==0)
        {
            System.out.println("La moda es "+ 0);
        }else {
            System.out.println(e.moda());
        }


    }
}
