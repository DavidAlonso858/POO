package herencia12;

public class Publicacion {

    private String isbn;
    private String titulo;
    private int año;

    public Publicacion(String isbn, String titulo, int año) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.año = año;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + año;
    }
}
