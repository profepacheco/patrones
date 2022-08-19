package co.edu.javeriana.ejemplo;

public class Estudiante {

    private static Estudiante INSTANCE = null;

    private int id;

    private String nombre;

    private Estudiante(){

    }

    static Estudiante getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Estudiante();
        }
        return INSTANCE;
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

    @Override
    public boolean equals(Object o){
        return this.id == ((Estudiante)o).getId() &&
                this.nombre.equals(((Estudiante)o).getNombre());
    }
}
