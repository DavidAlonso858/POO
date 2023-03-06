package Ejercicio7_8;

public class SintonizadorFrecuencia {

    private double frecuencia;
    private double MIN_FRECUENCIA = 80.0;
    private double MAX_FRECUENCIA = 108.0;
    private double SALTO = 0.5;

    public SintonizadorFrecuencia(double frecuenciaInicial) {
        if (frecuenciaInicial >= MIN_FRECUENCIA && frecuenciaInicial <= MAX_FRECUENCIA) {
            frecuencia = frecuenciaInicial;
        } else {
            frecuencia = MIN_FRECUENCIA;
        }
    }

    public void subirFrecuencia() {
        frecuencia += SALTO;
        if (frecuencia > MAX_FRECUENCIA) {
            frecuencia = MIN_FRECUENCIA;
        }
    }

    public void bajarFrecuencia() {
        frecuencia -= SALTO;
        if (frecuencia < MIN_FRECUENCIA) {
            frecuencia = MAX_FRECUENCIA;
        }
    }

    @Override
    public String toString() {
        return "La frecuencia es de: " + frecuencia + " MHz";
    }
}
