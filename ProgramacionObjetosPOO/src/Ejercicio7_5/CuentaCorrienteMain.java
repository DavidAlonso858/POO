package Ejercicio7_5;

public class CuentaCorrienteMain {

    public static void main(String[] args) {

        CuentaCorriente n1 = new CuentaCorriente("95923724A", "Paco Gutierrez", 20);
        GestorCuenta n2 = new GestorCuenta("Juan Garcia", 10000);

        CuentaCorriente.setBanco("Santander");
        
        GestorCuenta.setTelefono(77777777);

        n1.setGestor(n2);
        System.out.println(n1.toString());

    }
}
