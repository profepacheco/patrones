package co.edu.javeriana.ejemplo;

import java.util.Date;

public class Estudiante {

    private int id;

    private String nombre;

    private Date estampa;

    protected Estudiante(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getEstampa() {
        return estampa;
    }

    public void setEstampa(Date estampa) {
        this.estampa = estampa;
    }
}
