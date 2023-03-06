package Tema7;

class CuentaCorriente {

    String dni;
    String nombreTitular;
    int saldo;

    CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;

    }
    
    CuentaCorriente(String dni, String nombre_titular, int saldo) {
        this.dni = dni;
        this.nombreTitular = nombre_titular;
        this.saldo = saldo;

    }

    boolean SacarDinero(int puede) {
        boolean operacion;
        if (saldo >= puede) {
            saldo -= puede;
            operacion = true;
        } else {
               operacion = false; 
        }
        return operacion;
    }

    void IngresarDinero(int dinero) {
        this.saldo = dinero;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombreTitular + "\nDNI: " + dni + "\nsaldo: " + saldo;
    }
}