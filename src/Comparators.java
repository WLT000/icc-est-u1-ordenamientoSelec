import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class Comparators {
    private List<Estudiante> estList;
    private Estudiante[] estArray;

    public Comparators(){
        Estudiante e1 = new Estudiante("Juan", 10);
        estArray = new Estudiante[]{e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 7),
            new Estudiante("Pedro", 6.8),
        };
        estList = new ArrayList<>(List.of(estArray));
        
        //Llamada de los ejemplos
        ejemplo1();
        ejemplo2();
        ejemplo3();
        ejemplo4();
        ejemplo5();
        ejemplo6();
        ejemplo9();
    }

    private void print(List<Estudiante> list){
        for (Estudiante e : list){
            System.out.println(e);
        }
    }

    /*  
    *lamba extractora directa directamente: nota ascendente
    *comparator -> por VALOR
    */
    public void ejemplo1(){
        //copiar arreglo global
        List<Estudiante> lista = new ArrayList<>(estList);
        //comparador -> obj != (Emvolvente de primitivo ni String)
        Comparator<Estudiante> comparador = Comparator.comparingDouble(x ->x.getNota());
        lista.sort(comparador);
    }

    /*  
    *Ordenar Ascendentemente
    Comparator -> por valor
    *Referencia
    */


    public void ejemplo2(){
        System.out.println("Ejemplo 2:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(comparator);
        print(lista);

    }
    /*  
    Ordenar por nota desendente
    Comparator -> por valor
    Referencia
    */
    private void ejemplo3(){
        System.out.println("Ejemplo 3:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparingDouble(Estudiante :: getNota). reversed();
        lista.sort(comparator);
        print(lista);

   }
   /*   
   Ordenar por Nombre desendente
   comparador -> por valor
   Referencia
    */
   private void ejemplo4(){
        System.out.println("Ejemplo 4:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator.comparing(Estudiante :: getNombre);
        lista.sort(comparator);
        print(lista);

   }
   /*Ordenar por nota asendente 
   COmparator -> comparar DOS ITEMS
   lambda
    */
   private void ejemplo5(){
        System.out.println("Ejemplo 5:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2)-> Double.compare(e1.getNota(), e2.getNota());
        lista.sort(comparator);
        print(lista);
   }
   /*Ordenar por nombre asendente 
   COmparator -> comparar DOS ITEMS
   lambda
    */
   private void ejemplo6(){
        System.out.println("Ejemplo 6:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2)-> e1.getNombre().compareTo(e2.getNombre());
        lista.sort(comparator);
        print(lista);
   }
   /*Ordenar por nota DESENDENTE 
   COmparator -> comparar DOS ITEMS
   lambda
    */
   private void ejemplo7(){
        System.out.println("Ejemplo 7:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2)-> Double.compare(e2.getNota(), e1.getNota());
        lista.sort(comparator);
        print(lista);
   }
   /*Ordenar por nota ASENDENTE Y POR NOMBRE DESENDENTE 
    *COmparator -> comparar DOS ITEMS
    *lambda
    */
   private void ejemplo8(){
        System.out.println("Ejemplo 8:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = (e1, e2)->{
            int comp = Double.compare(e1.getNota(), e2.getNota());
            if (comp != 0)
                return comp;

            return e1.getName().compareTo;
        }
   }
   /*Ordenar por nota ASENDENTE Y POR NOMBRE ASCENDENTE 
    *COmparator -> POR VALOR    
    *REFERENCIAS 2 comparadores
    */
   private void ejemplo9(){
        System.out.println("Ejemplo 9:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
            .comparingDouble(Estudiante ::getNota)
            .thenComparing(Estudiante ::getNombre);
        lista.sort(comparator);
        print(lista);
   }
   /*Ordenar por NOTA DESENDENTE Y POR NOMBRE ASCENDENTE 
    *COmparator -> POR VALOR    
    *1 COMPARADOR lambda
    2 comparator referencia
    */
    private void ejemplo10(){
        System.out.println("Ejemplo 10:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
                .<Estudiante>comparingDouble(e -> e.getNota())
                .reversed()
                .thenComparing(Estudiante::getNombre);
       lista.sort(comparator);
        print(lista);
    }
    /** 
     * Ordenar por nota ajustada ASCENDENTE y NOMBRE DESCENDENTE.
     * Sumar 2 puntos si la nota es menor que 7
     * La nota maxima permitida es 10.
     * Comparator -> por valor calculado.
     * 1 comparator lamba con bloque de Instrucciones.
     * 2 compartor referencia con orden inverso.
     */
    private void ejemplo11(){
        System.out.println("Ejemplo 11:");
        List<Estudiante> lista = new ArrayList<>(estList);
        Comparator<Estudiante> comparator = Comparator
                .<Estudiante>comparingDouble(e -> e.getNota())
                .reversed()
                .thenComparing(Estudiante::getNombre);
       lista.sort(comparator);
        print(lista);
    }



}
