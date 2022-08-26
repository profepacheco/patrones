package co.edu.javeriana.adaptador;

public class Carta {

    private String remitente;

    private String destinatario;

    public void enviar(){
        System.out.println(String.format("Enviando la carta de [%s] a [%s]", remitente, destinatario));
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
