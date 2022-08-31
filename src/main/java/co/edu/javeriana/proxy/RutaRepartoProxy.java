package co.edu.javeriana.proxy;

public class RutaRepartoProxy {

    private RutaReparto rutaReparto;

    public void completarRuta(){
        rutaReparto.setCompleted(true);
    }

    public RutaReparto getRutaReparto() {
        return rutaReparto;
    }

    public void setRutaReparto(RutaReparto rutaReparto) {
        this.rutaReparto = rutaReparto;
    }
}
