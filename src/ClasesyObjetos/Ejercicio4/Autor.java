package ClasesyObjetos.Ejercicio4;

class Autor {
    private String nombre;
    private String email;
    private String genero;

    public Autor(String nombre, String email, String genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public void setEmail(String nuevoEmail) {
        this.email = nuevoEmail;
    }

    @Override
    public String toString() {
        return nombre + " (" + genero + ") " + email;
    }
}
