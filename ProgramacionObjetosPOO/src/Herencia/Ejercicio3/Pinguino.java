package Herencia.Ejercicio3;

public class Pinguino extends Ave {


    public void nada(){
        System.out.println("Estoy nadando");
    }
    public void esquivoFocas(){
        System.out.println("uff");
    }

    @Override
    public void vuela() {
        System.out.println("No puede volar");;
    }
    
}
