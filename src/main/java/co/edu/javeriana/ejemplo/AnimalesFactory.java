package co.edu.javeriana.ejemplo;

import java.util.Date;


public class AnimalesFactory extends AbstractFactory<Animales> {
    @Override
    public Animales crearEntidad() {
        Animales animales = new Animales("Perro", 4);
        animales.setEstampa(new Date(System.currentTimeMillis()));
        return animales;
    }
}
