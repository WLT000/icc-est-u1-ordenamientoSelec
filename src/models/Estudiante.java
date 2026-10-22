package models;

    // Una clase Estudiante
    //

public class Estudiante {
    private String nombre;
    private double nota;

    //constructor lleno
    public Estudiante(String name, double nota){
        this.nombre = nombre;
        this.nota = nota;

    }

    // Contructor vacio
    //Sobrecarga de metodos
    public Estudiante(){

    }
    
    // (control + .) crear getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [" + nombre + ", " + nota + "]";
    }
    
    

}
