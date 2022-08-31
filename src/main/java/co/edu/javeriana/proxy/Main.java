package co.edu.javeriana.proxy;

import co.edu.javeriana.adaptador.Carta;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Oficina  oficina = new Oficina();
        oficina.setNombre("Javeriana");


        Carta carta1 = new Carta();
        carta1.setRemitente("Juan");
        carta1.setDestinatario("Santiago");

        Carta carta2 = new Carta();
        carta2.setRemitente("Alberto");
        carta2.setDestinatario("Camilo");

        List<Carta> cartas = new ArrayList<>();
        cartas.add(carta1);
        cartas.add(carta2);

        RutaReparto  rutaReparto = new RutaReparto();
        rutaReparto.setCartaList(cartas);
        rutaReparto.setOficina(oficina);

        RutaRepartoProxy rutaRepartoProxy = new RutaRepartoProxy();
        rutaRepartoProxy.setRutaReparto(rutaReparto);

        Cartero cartero = new Cartero();
        cartero.setNombre("Juanito");
        cartero.setRutaRepartoProxy(rutaRepartoProxy);

        System.out.println("1.Se completo la ruta ? "+ cartero.getRutaRepartoProxy().getRutaReparto().isCompleted());

        cartero.getRutaRepartoProxy().completarRuta();

        System.out.println("2.Se completo la ruta ? "+ cartero.getRutaRepartoProxy().getRutaReparto().isCompleted());

    }

}
