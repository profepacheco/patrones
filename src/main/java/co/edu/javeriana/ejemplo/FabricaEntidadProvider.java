package co.edu.javeriana.ejemplo;

public class FabricaEntidadProvider {

    public static final String ANIMALES = "animales";

    public static final String ESTUDIANTES = "estudiantes";

    public static AbstractFactory getFactory(String s){
        if(s.equals(ANIMALES)){
            return new AnimalesFactory();
        }else if(s.equals(ESTUDIANTES)){
            return new EstudianteFactory();
        }
        throw new RuntimeException("Unsupported Entity");
    }

}
