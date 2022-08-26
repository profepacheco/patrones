package co.edu.javeriana.enumeration;

public class Estudiante {

    private String nombre;

    private FacultadesEnum facultad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FacultadesEnum getFacultad() {
        return facultad;
    }

    public void setFacultad(FacultadesEnum facultad) {
        this.facultad = facultad;
    }
}
