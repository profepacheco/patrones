package co.edu.javeriana.principal;

import co.edu.javeriana.ejemplo.AbstractFactory;
import co.edu.javeriana.ejemplo.Animales;
import co.edu.javeriana.ejemplo.FabricaEntidadProvider;

public class Main {

    public static void main(String[] args) {

        AbstractFactory estudiante = FabricaEntidadProvider
                .getFactory(FabricaEntidadProvider.ESTUDIANTES);

        System.out.println(estudiante.crearEntidad());

        AbstractFactory animal = FabricaEntidadProvider
                .getFactory(FabricaEntidadProvider.ANIMALES);

        Animales animales = (Animales) animal.crearEntidad();
        Animales copia = animales.copiar();


        System.out.println(copia);
    }

}
