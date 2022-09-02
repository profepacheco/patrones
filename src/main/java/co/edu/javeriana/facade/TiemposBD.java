package co.edu.javeriana.facade;

import java.util.ArrayList;
import java.util.List;

public class TiemposBD {

    private List<String> tiempos;

    public TiemposBD() {
        this.tiempos = new ArrayList<>();
    }

    public List<String> getTiempos() {
        return tiempos;
    }

    public void setTiempos(List<String> tiempos) {
        this.tiempos = tiempos;
    }
}
