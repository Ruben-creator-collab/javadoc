package rivas;

import java.util.Objects;

public class Libro {
    private String isbn; // identificador único
    private String titulo;
    private String autor;
    private float precio;

    public Libro(String isbn, String titulo, String autor, float precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    // getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public float getPrecio() {
    	return precio;
    }

    @Override
    public String toString() {
        return isbn + ";" + titulo + ";" + autor + ";" + precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    
}
