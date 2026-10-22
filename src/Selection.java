public class Selection{
// Walter Loza
// Walter Loza
    public void sort(int[] arreglo){
        int cambios = 0;
        int comparaciones = 0;
        System.out.println("Metodo selection");
        for(int i = 0; i < arreglo.length - 1 ; i ++){
            int minimo = i;
            System.out.println("Pasada" + i + "|" + "cambio: " + arreglo[i] );
            for (int j = i + 1; j < arreglo.length; j++ ){
                comparaciones++;
                if (arreglo[j] < arreglo[minimo]){
                    minimo = j;
                    
                }
            }
            
            if (minimo != i){
                int aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;

                cambios++;

            
          
            }
            System.out.println("==>" + cambios);
            
        }
        System.out.println("cambios:" + cambios);
        System.out.println("Comparaciones: " + comparaciones);
    }
}