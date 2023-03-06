package Tema7;

public class PersonaMain {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.setEdad (21);
        p2.setEdad(18);
        p1.estatura = 1.79;
        p2.estatura = 1.59;
        p1.nombre = "Juan";
        p2.nombre = "David";

        System.out.println(p1.edad);
        p1.cumplirAños();
        System.out.println(p1.edad);
    }
}
