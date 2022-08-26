package co.edu.javeriana.adaptador;

public class CartaAdaptada {

    private Carta carta;

    private String oficina;

    public CartaAdaptada() {
    }

    public CartaAdaptada(Carta carta, String oficina) {
        this.carta = carta;
        this.oficina = oficina;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }
}
