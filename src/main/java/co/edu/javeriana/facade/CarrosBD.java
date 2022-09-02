package co.edu.javeriana.facade;

import java.util.ArrayList;
import java.util.List;

public class CarrosBD {

    private List<String> carros;

    public CarrosBD(){
        this.carros = new ArrayList<>();
    }

    public List<String> getCarros() {
        return carros;
    }

    public void setCarros(List<String> carros) {
        this.carros = carros;
    }
}
