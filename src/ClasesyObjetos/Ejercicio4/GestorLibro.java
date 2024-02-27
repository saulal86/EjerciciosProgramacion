package ClasesyObjetos.Ejercicio4;

import java.util.List;

public class GestorLibro {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor1", "autor1@mail.com", "Masculino");
        Autor autor2 = new Autor("Autor2", "autor2@mail.com", "Femenino");
        Libro libro1 = new Libro("Libro1", List.of(autor1, autor2), 25.5f);
        Libro libro2 = new Libro("Libro2", List.of(autor1, autor2), 30.0f, 50);
        System.out.println(libro1);
        System.out.println(libro2);
        libro1.setPrecio(22.0f);
        libro1.setStock(10);
        System.out.println(libro1);
    }
}
