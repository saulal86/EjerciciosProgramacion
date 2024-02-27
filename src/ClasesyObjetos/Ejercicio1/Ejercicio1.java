package ClasesyObjetos.Ejercicio1;

import java.time.LocalDate;

public class Ejercicio1 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("León", LocalDate.of(2010, 5, 15));
        System.out.println(animal1);

        Animal animal2 = new Animal("Elefante");
        System.out.println(animal2);

        animal2.setNombre("Jirafa");
        animal2.setFecha(LocalDate.of(2015, 8, 20));
        System.out.println(animal2);
    }
}
