package herencia9;

public class Movil extends Terminal{

    private String tarifa;
    private double coste;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.coste = 0;
    }

    @Override
    public void llama(Terminal t, int segundosDeLlamada) {
        super.llama(t, segundosDeLlamada);
        double minutos = (double) segundosDeLlamada / 60;
        switch (this.tarifa) {
            case "rata" ->
                this.coste += minutos * 0.06;
            case "mono" ->
                this.coste += minutos * 0.12;
            case "bisonte" ->
                this.coste += minutos * 0.30;
        }
    }

    @Override
    public String toString() {
        return "Nº " + this.getNumero()
                + " - " + this.getTiempoDeConversacion()
                + "s de conversación - tarificados "
                + this.coste + " euros";
    }
}

