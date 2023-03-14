package interfaz9_7;

public class App {

    public static void main(String[] args) {
        Socio ob1 = new Socio("Paco", 200);
        Socio ob2 = new Socio("Juan", 100);
        
        Socio [] t = new Socio[]{
            new Socio("Fran", 25),
            new Socio("Carlos", 15),
            new Socio("Alba", 35),
        };
        
        int resultado= ob1.compareTo(ob2);
        System.out.println(resultado);
    }
}
