package ConceptosBasicos;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edades = 0;
        int cont18 = 0;
        int sumaTotal = 0;
        double media = 0;
        int cont = 0;
        System.out.println("Introduce edades de los alumnos: ");
        edades = scanner.nextInt();
        while(edades>0){
            System.out.println("Siga introduciendo edades, si en algún momento deseae parar introduzca un número negativo: ");
            edades = scanner.nextInt();
            cont++;
            sumaTotal += edades;
            media = (double) sumaTotal /cont;
            if(edades>17) {
                cont18++;
            }
        }
        System.out.println("La media es: " + media + ", la suma total de edades es: " + sumaTotal + "y el numero de alumnos que hay con mas de 18 años es: " + cont18);
    }
}
