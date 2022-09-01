package co.edu.javeriana.taller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListadoOficinas {

    private static ListadoOficinas INSTANCE ;

    private List<Oficina> listaDeOficinas;

    private ListadoOficinas(){
        this.listaDeOficinas = new ArrayList<>();
    }

    public static ListadoOficinas getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new ListadoOficinas();
        }
        return INSTANCE;
    }

    public List<Oficina> getListaDeOficinas() {
        return listaDeOficinas;
    }

    public void setListaDeOficinas(List<Oficina> listaDeOficinas) {
        this.listaDeOficinas = listaDeOficinas;
    }
}
