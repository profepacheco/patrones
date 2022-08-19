package co.edu.javeriana.ejemplo;

public class Profesores {


    private int idProfesor;

    private String nombre;

    private String materia;

    protected Profesores(int idProfesor, String nombre, String materia) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.materia = materia;
    }

    public Profesores(String materia) {
        this.materia = materia;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
