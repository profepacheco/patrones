package co.edu.javeriana.facade;

public class Main {

    public static void main(String[] args) {
        ParkingFacade parkingFacade = new ParkingFacade();
        System.out.println(parkingFacade.getParkingReport());
    }

}
