package Tema7;

public class CuentaCorrienteMain {

    public static void main(String[] args) {

        CuentaCorriente n1 = new CuentaCorriente("75923724B", "David Alonso");

        System.out.println(n1.saldo);
        n1.IngresarDinero(50);
        System.out.println(n1.saldo);
        n1.SacarDinero(20);
        System.out.println(n1.toString());
        n1 = new CuentaCorriente("95923724A",  "Paco Gutierrez", 20);
        n1.SacarDinero(10);
        System.out.println(n1.toString());
    }
}