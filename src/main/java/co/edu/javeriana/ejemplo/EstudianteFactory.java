package co.edu.javeriana.ejemplo;

import java.util.Date;

public class EstudianteFactory extends AbstractFactory<Estudiante> {


    @Override
    public Estudiante crearEntidad() {
        Estudiante estudiante = new Estudiante();
        estudiante.setEstampa(new Date(System.currentTimeMillis()));
        return estudiante;
    }
}
