package Ejercicio7_3;

class CuentaCorriente {

     private String dni;
     private String nombreTitular;
     private int saldo;

    void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    String getDni() {
        return dni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    private int getSaldo() {
        return saldo;
    }

    
    CuentaCorriente(String dni, int saldo) {
        this.dni = dni;
        this.saldo = saldo;

    }

    CuentaCorriente(String dni, String nombreTitular, int saldo) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
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
    public String toString() {
        return "Nombre: " + nombreTitular + "\nDNI: " + dni + "\nsaldo: " + saldo;
    }
}