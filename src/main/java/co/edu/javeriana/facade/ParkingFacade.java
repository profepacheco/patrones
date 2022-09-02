package co.edu.javeriana.facade;

import java.util.ArrayList;
import java.util.List;

public class ParkingFacade {

    private CarrosBD carrosBD;

    private TiemposBD tiemposBD;

    public ParkingFacade() {
        carrosBD = new CarrosBD();
        tiemposBD = new TiemposBD();
        carrosBD.getCarros().add("Carro 1 ");
        carrosBD.getCarros().add("Carro 2 ");
        carrosBD.getCarros().add("Carro 3 ");
        carrosBD.getCarros().add("Carro 4 ");
        carrosBD.getCarros().add("Carro 5 ");
        tiemposBD.getTiempos().add("Tiempo 1");
        tiemposBD.getTiempos().add("Tiempo 2");
        tiemposBD.getTiempos().add("Tiempo 3");
        tiemposBD.getTiempos().add("Tiempo 4");
        tiemposBD.getTiempos().add("Tiempo 5");

    }

    public List<String> getParkingReport(){
        List<String> report = new ArrayList<>();
        for(int i = 0 ; i < carrosBD.getCarros().size(); i++){
            report.add(carrosBD.getCarros().get(i)+ " - "+tiemposBD.getTiempos().get(i));
        }
        return  report;
    }

    public CarrosBD getCarrosBD() {
        return carrosBD;
    }

    public void setCarrosBD(CarrosBD carrosBD) {
        this.carrosBD = carrosBD;
    }

    public TiemposBD getTiemposBD() {
        return tiemposBD;
    }

    public void setTiemposBD(TiemposBD tiemposBD) {
        this.tiemposBD = tiemposBD;
    }
}
