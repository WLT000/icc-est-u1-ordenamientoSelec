import java.util.Arrays;
import java.util.Comparator;

import models.Estudiante;

public class App {
      //Walter Loza
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        //runEjemplosObjetos();
        runComparators();

    }
    
    private static void runComparators() {
        Integer[] original = {6, 5, 4, 1, 2, 3};
        //Arrays.sort - ORDENA ARREGLOS POR SU FORMA NATURAL
        Arrays.sort(original);
        for (int i = 0 ; i < original.length; i++){
            System.out.println(original[i]);
        }
    System.out.println("----------------------------");

    
        Arrays.sort(original, Comparator.reverseOrder());
        for (int i = 0 ; i < original.length; i++){
            System.out.println(original[i]);
        }

    }

    private static void runEjemplosObjetos(){
        //Creo un estudiante y lo guardo en una variable
        Estudiante e1 = new Estudiante("Juan", 10);

        Estudiante[] estudiantes = {e1,
                                    new Estudiante("Maria", 7),
                                    new Estudiante("Diego", 3.5),
                                    new Estudiante("Pedro", 6.8),

        };

        Bubble bubble = new Bubble();
        System.out.println("Original");
        bubble.sortEstudiantesNOTA(estudiantes);
        printEstudiantes(estudiantes);

    }


    public static void runEjemplosPrimitivos(){
        int[] original = {6, 5, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        //USAR METODO DEL ARCHIVO (clase) BUBBLE
        //INSTANCIAR el archivo BUBBLE
        //INSTANCIA la clase Bubble
        Bubble bubble = new Bubble();

        // EJECUTAR CODIGO DEL ARCHIVO BUBBLE USO LA INSTANCIA

        System.out.println("Bubble");

        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Selection");

        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Insertion");

        Insertion insertion = new Insertion();
        System.out.println("Original");
        printArreglo(d);
        insertion.sort(d);
        System.out.println("Ordenado des");
        printArreglo(d);




    }

    public static void printArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + "-");
        System.out.println();
    }

    public static void printEstudiantes(Estudiante[] estudiante) {
        for (int i = 0; i < estudiante.length; i++) 
            System.out.print(estudiante[i] + "-");
        System.out.println();
    }

 }
    

