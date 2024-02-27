package ClasesyObjetos.Ejercicio4;

import java.util.Collection;

class Libro {
    private String titulo;
    private Collection<Autor> autores;
    private float precio;
    private int stock;

    // Constructor con datos parciales
    public Libro(String titulo, Collection<Autor> autores, float precio) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
        this.stock = 0;  // Valor por defecto para stock
    }

    // Constructor con todos los atributos
    public Libro(String titulo, Collection<Autor> autores, float precio, int stock) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Collection<Autor> getAutores() {
        return autores;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setPrecio(float nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public void setStock(int nuevoStock) {
        this.stock = nuevoStock;
    }

    @Override
    public String toString() {
        StringBuilder autoresStr = new StringBuilder();
        for (Autor autor : autores) {
            autoresStr.append(autor.getNombre()).append(", ");
        }
        autoresStr.delete(autoresStr.length() - 2, autoresStr.length());  // Eliminar la coma final

        return titulo + " (" + autoresStr + ") " + precio + " € - " + stock + " unidades en stock";
    }
}
