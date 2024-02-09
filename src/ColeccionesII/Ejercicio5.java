package ColeccionesII;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio5 {
    Queue<Integer> colaPos = new LinkedList<>();
    Queue<Integer> colaNeg = new LinkedList<>();

    public void negativosAbajoPositivosArriba(Stack<Integer> pila){
        Stack ultimaPill = new Stack<>();
        while(!pila.empty()){
            int valor = pila.pop();
            if(valor < 0){
                colaNeg.add(valor);
            }else {
                colaPos.add(valor);
            }
        }
        while(!colaNeg.isEmpty()) {
            int valor = colaNeg.poll();
            ultimaPill.push(valor);
        }
        while(!colaPos.isEmpty()) {
            int valor = colaPos.poll();
            ultimaPill.push(valor);
        }
        System.out.println(ultimaPill);
    }

    public static void main(String[] args) {
        Ejercicio5 e = new Ejercicio5();
        Stack<Integer> pila = new Stack<>();
        pila.add(23);
        pila.add(-5);
        pila.add(37);
        pila.add(29);
        pila.add(-19);
        pila.add(-55);
        pila.add(89);
        e.negativosAbajoPositivosArriba(pila);
    }
}
