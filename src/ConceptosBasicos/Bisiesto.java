package ConceptosBasicos;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el año");
        int year = scanner.nextInt();
        if((year % 100 !=0 & year % 4 == 0) |  year % 400 == 0 )
            System.out.print("Año bisiesto");
        else
            System.out.print("Año no bisisesto");
    }
}
