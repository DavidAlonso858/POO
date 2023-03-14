package interfaz9_7;

public class Socio implements Comparable {

    private String Nombre;
    private int id;

    public Socio(String Nombre, int id) {
        this.Nombre = Nombre;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return this.id - ((Socio) o).id;
    }

    @Override
    public String toString() {
        return "Socio{" + "Nombre=" + Nombre + ", id=" + id + '}';
    }

}
