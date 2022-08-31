package co.edu.javeriana.proxy;

public class Cartero {


    private String nombre;

    private RutaRepartoProxy rutaRepartoProxy;

    public RutaRepartoProxy getRutaRepartoProxy() {
        return rutaRepartoProxy;
    }

    public void setRutaRepartoProxy(RutaRepartoProxy rutaRepartoProxy) {
        this.rutaRepartoProxy = rutaRepartoProxy;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
