package co.edu.javeriana.taller;

public class Main {
    public static void main(String[] args) {
        ListadoOficinas oficinas = ListadoOficinas.getInstance();
        oficinas.getListaDeOficinas().add(Oficina.createOficina(1, "Oficina Principal"));
        oficinas.getListaDeOficinas().add(Oficina.createOficina(2, "Oficina Barrio cercano"));
        oficinas.getListaDeOficinas().add(Oficina.createOficina(3, "Oficina Barrio Lejano"));
        oficinas.getListaDeOficinas().add(Oficina.createOficina(4, "Oficina jubilados"));
        oficinas.getListaDeOficinas().add(Oficina.createOficina(5, "Oficina Juvenil"));
        oficinas.getListaDeOficinas().add(Oficina.createOficina(6, "Oficina horario extendido"));
        oficinas.getListaDeOficinas().add(Oficina.createOficina(7, "Oficina horario corto"));

        System.out.println(oficinas.getListaDeOficinas());
    }
}
