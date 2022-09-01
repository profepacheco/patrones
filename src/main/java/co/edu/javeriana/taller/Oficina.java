package co.edu.javeriana.taller;

public class Oficina {

    private int id;

    private String nombre;

    public static Oficina createOficina(int id, String nombre){
        return new Oficina(id, nombre);
    }

    private Oficina() {
    }

    private Oficina(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Oficina( id : ");
        stringBuilder.append(id);
        stringBuilder.append(" , nombre : '");
        stringBuilder.append(nombre);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}
