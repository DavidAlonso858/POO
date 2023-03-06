package Herencia;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, int edad, double estatura, int codigoEstudiante, float notaFinal) {
        super(nombre, edad, estatura);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "El nombre es: " + super.getNombre()
                + "\nLa estatura es: " + super.getEstatura()
                + "\nLa edad es: " + super.getEdad()
                + "\nEl codigo de estudiante es: " + codigoEstudiante
                + "\nLa nota final es : " + notaFinal;
    }

}
