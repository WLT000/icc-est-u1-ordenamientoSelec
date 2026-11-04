package models;

    // Una clase Estudiante
    //

public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private double nota;

    //constructor lleno
    public Estudiante(String nombre, double nota){
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

    /**
     * Orden natural
     * 1.Nota Ascendente
     * 2.Nombre Ascendente en el caso de que las notas sean iguales
     * @param oObjeto tipo Estudiante con el cual voy a comparar
     * @return indice de comparacion(+, -, 0)
     */
    @Override
    public int compareTo(Estudiante e2) {
        int compNota = Double.compare(this.getNota(), e2.getNota());
        if ( compNota != 0)
            return compNota;
        return this.getNombre().compareTo(e2.getNombre());



    }
    
    

}
