package co.edu.javeriana.adaptador;

public class Main {
    public static void main(String[] args) {
        Carta carta1 = new Carta();
        carta1.setRemitente("Vigna");
        carta1.setDestinatario("Vigna");

        Carta carta2 = new Carta();
        carta2.setRemitente("Camilo");
        carta2.setDestinatario("Camilo");

        AdaptadorAuditoria adaptadorAuditoria = new AdaptadorAuditoria();

        CartaAdaptada cartaAdaptada1 = adaptadorAuditoria.adaptarCarta(carta1);
        CartaAdaptada cartaAdaptada2 = adaptadorAuditoria.adaptarCarta(carta2);

        System.out.println("wait");
    }
}
