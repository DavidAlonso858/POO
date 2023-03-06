package Ejercicio7_5;

class GestorCuenta {
    
    public String nombre;
    private static int telefono;
    double impMaximo;

    public GestorCuenta(String nombre, double impMaximo) {
        this.nombre = nombre;
        this.impMaximo = impMaximo;
    }

    public static void setTelefono(int telefono) {
        GestorCuenta.telefono = telefono;
    }
    
    public static int getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString(){
        return "\nGestor: " + nombre + "\ntelefono: " + telefono + 
                "\nimporte: " + impMaximo;
    }
}

    