package Herencia.Ejercicio3;

public class Lagarto extends Animal {

    public void bronceado() {
        System.out.println("Tomando el Sol");
    }

    public void morder() {
        System.out.println("Plaz plaz");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo carne");

    }

}
