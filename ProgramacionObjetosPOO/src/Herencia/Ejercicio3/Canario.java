package Herencia.Ejercicio3;

public class Canario extends Ave{

    public void canta(){
        System.out.println("Pio pio");
    }
    public void picotea(){
        System.out.println("pum pum");
    }

    @Override
    public void vuela() {
        super.vuela();
    }
}
