package co.edu.javeriana.proxy;

import co.edu.javeriana.adaptador.Carta;

import java.util.List;

public class RutaReparto {

    Oficina oficina;
    List<Carta> cartaList;
    boolean isCompleted;

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public List<Carta> getCartaList() {
        return cartaList;
    }

    public void setCartaList(List<Carta> cartaList) {
        this.cartaList = cartaList;
    }
}
