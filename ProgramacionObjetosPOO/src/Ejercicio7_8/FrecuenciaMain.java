package Ejercicio7_8;

public class FrecuenciaMain {

    public static void main(String[] args) {
        SintonizadorFrecuencia n1 = new SintonizadorFrecuencia(99);
        SintonizadorFrecuencia n2 = new SintonizadorFrecuencia(70);

        System.out.println(n2.toString());
        System.out.println("\n" + n1.toString());

        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        n1.subirFrecuencia();
        //La he subido 5.0"

        System.out.println(n1.toString());
        n1.bajarFrecuencia();
        n1.bajarFrecuencia();
        n1.bajarFrecuencia();
        n1.bajarFrecuencia();
        //La he bajado 2.0"

        System.out.println(n1.toString());
    }

}
