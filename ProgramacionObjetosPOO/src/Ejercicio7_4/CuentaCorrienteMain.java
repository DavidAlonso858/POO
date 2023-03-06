package Ejercicio7_4;

public class CuentaCorrienteMain {
    
    public static void main(String[] args) {

        
        CuentaCorriente n1 = new CuentaCorriente("95923724A", "Paco Gutierrez", 20);
           
           
         CuentaCorriente.setBanco("Santander");
           System.out.println("\n" + n1.toString());
          
          CuentaCorriente.setBanco("Bankia");
          System.out.println("\n" + n1.toString());
           
    }
}