package co.edu.javeriana.enumeration;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Pepe");
        estudiante.setFacultad(FacultadesEnum.INGENIERIA);
    }
}
