package Herencia;

public class Piso extends Viviendas{
    private int numPiso;
    private int portal;
            
    public Piso(int metrosCuadrados, int numCuartos, boolean tieneTerraza) {
        super(metrosCuadrados, numCuartos, tieneTerraza);
        this.numPiso = numPiso;
        this.portal = portal;
    }
    
}
