package Ejercicio7_9;

public class BombillaMain {

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        
        
        b1.enciende();
        b1.apaga();
        b1.enciende();
        b2.enciende();
        System.out.println("b1: " + b1.toString());
        System.out.println("b2: " + b2.toString());
        Bombilla.interruptorGeneral = false;
        System.out.println("b1: " + b1.toString());
        
        
    }

}
