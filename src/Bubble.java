import models.Estudiante;

public class Bubble {
    //Walter Loza
    public int[] sort(int[]arreglo){
        int cambios = 0;
        int comparaciones = 0;
        for(int i = 0; i < arreglo.length -1 ; i++) {
            System.out.println("Pasada" + i);
            boolean combinaciones = false;
            for(int j = 1; j < arreglo.length - 1 ; j++) {
                comparaciones ++ ;
                //COMPARACION IF

            
                if (arreglo[j-1] > arreglo[j]) {
                    cambios++;
                    combinaciones = true;
                    //INTERCAMBIO
                    int temp = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
            if (!combinaciones){
                break;
            }
            System.out.println("Cambios: " + cambios);
            System.out.println("Comparaciones: "+ comparaciones);
        }
        System.out.println("cambios" + cambios);
        System.out.println("comparaciones" + comparaciones);
        return arreglo;
    
    }

    public void sortEstudiantesNOTA(Estudiante[] estudiante){
        for (int i = 0; i < estudiante.length; i ++){
            boolean cambio = false;
            for (int j = 0; j < estudiante.length - i - 1; j++) {
                if(estudiante[j].getNota() > estudiante[j+1].getNota()){  //COMPARACIONES
                    //INTERCAMBIOS
                    Estudiante aux = estudiante[j];
                    estudiante[j] = estudiante[j + 1];
                    estudiante[j + 1] = aux;
                    cambio = true;
                }
            }
            if (!cambio)
            break;
        }
        
    }
    public void sortEstudiantesNAME(Estudiante[] estudiante){
    }
}
