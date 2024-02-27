package ClasesyObjetos.Ejercicio3;
public class GestorAutor {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Alberto Fernández", "afernandez@mail.com", "masculino");

        System.out.println("Nombre: " + autor1.getNombre());
        System.out.println("Email: " + autor1.getEmail());
        System.out.println("Género: " + autor1.getGenero());

        autor1.setEmail("alberto.fernandez@mail.com");

        System.out.println(autor1);
    }
}

