package co.edu.javeriana.ejemplo;

public class ProfesoresFactory {

    public static Profesores crearProfesorIngesoft(){
        Profesores profesores = new Profesores("Fundamentos de INgeniería de Software");
        return  profesores;
    }


    public static Profesores crearProfesorEstructurasDeDatost(){
        Profesores profesores = new Profesores("Estructuras de Datos");
        return  profesores;
    }
}
