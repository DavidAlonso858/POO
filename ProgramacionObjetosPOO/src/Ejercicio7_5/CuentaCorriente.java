package Ejercicio7_5;
   
class CuentaCorriente {

    private String dni;
    private String nombreTitular;
    private int saldo;
    private static String banco;
    GestorCuenta gestor;

    public CuentaCorriente(String dni, String nombreTitular, int saldo, GestorCuenta gestor) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.gestor = gestor;
    }

    public void setGestor(GestorCuenta gestor) {
        this.gestor = gestor;
    }
    
    
    
    
    
    
    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public static String getBanco() {
        return banco;
    }

    
    
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
    @Override
    public String toString() {
        return "Nombre: " + nombreTitular + "\nDNI: " + dni + "\nsaldo: " + saldo + "\nbanco: " + banco + "\n" + gestor;
    }
}