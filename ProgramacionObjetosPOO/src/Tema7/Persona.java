package Tema7;

public class Persona {

    String nombre;

    int edad;
    double estatura;

    public void setEdad(int edad) {
        if(edad>=0)
        this.edad = edad;
    }

    
    void saludar(Persona otra) {
        System.out.println("Hola soy: " + this.nombre);
        System.out.println("Encantado de conocerte" + otra.nombre);
    }

    void cumplirAños() {
        edad++;
    }
}
