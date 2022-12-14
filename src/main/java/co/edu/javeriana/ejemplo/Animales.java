package co.edu.javeriana.ejemplo;

import co.edu.javeriana.zooligicos.Animal;

import java.util.Date;

public class Animales {

    private String nombre;

    private Integer nroDePatas;

    private Date estampa;

    protected Animales(String nombre, Integer nroDePatas) {
        this.nombre = nombre;
        this.nroDePatas = nroDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNroDePatas() {
        return nroDePatas;
    }

    public void setNroDePatas(Integer nroDePatas) {
        this.nroDePatas = nroDePatas;
    }

    public Date getEstampa() {
        return estampa;
    }

    public void setEstampa(Date estampa) {
        this.estampa = estampa;
    }

    public Animales copiar(){
        Animales prototipo = new Animales(this.nombre, this.nroDePatas);
        prototipo.setEstampa(new Date(System.currentTimeMillis()));
        return prototipo;
    }
}
