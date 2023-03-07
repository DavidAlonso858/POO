package herencia3;

public class Prueba {

    public static void main(String[] args) {
        Pinguino p1 = new Pinguino();

        p1.nada();
        p1.vuela();
        System.out.println("\n");
        Lagarto l1 = new Lagarto();

        l1.comer();
        l1.bronceado();
        System.out.println("\n");
        Canario c1 = new Canario();

        c1.canta();
        c1.picotea();
        System.out.println("\n");
        Gato g1 = new Gato();

        g1.comer();
        
        g1.ronronear();
    }
}
