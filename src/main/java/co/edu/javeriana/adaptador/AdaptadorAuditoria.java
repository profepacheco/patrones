package co.edu.javeriana.adaptador;

public class AdaptadorAuditoria {

    public CartaAdaptada adaptarCarta( Carta carta){
        CartaAdaptada cartaAdaptada = new CartaAdaptada();
        cartaAdaptada.setCarta(carta);
        cartaAdaptada.setOficina("OFICINA AUDITORIA");
        return cartaAdaptada;
    }

}
