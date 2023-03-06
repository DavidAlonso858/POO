package Ejercicio7_9;

public class Bombilla {

    public static boolean interruptorGeneral = true;
    private boolean interruptor;

    public Bombilla() {
        interruptor = false;
    }

    public void enciende() {
        interruptor = true;

    }

    public void apaga() {
        interruptor = false;

    }

    public boolean estado() {
        return interruptorGeneral && interruptor;

    }

    @Override
    public String toString() {
        return estado() ? "Encendida" : "Apagada";
    }
}
