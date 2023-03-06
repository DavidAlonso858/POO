package Herencia.Ejercicio12;

public class Libro extends Publicacion {

    private boolean prestado;

    public Libro(String isbn, String titulo, int anio) {
        super(isbn, titulo, anio);
        this.prestado = false;
    }

    public void presta() {
        if (this.estaPrestado()) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        } else {
            this.prestado = true;
        }
    }

    public void devuelve() {
        this.prestado = false;
    }

    public boolean estaPrestado() {
        return this.prestado;
    }
}
    


