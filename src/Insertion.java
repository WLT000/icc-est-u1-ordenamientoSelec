
public class Insertion {
    public static void sort(int[] areglo){
        for (int i = 1; i < areglo.length; i++){
            int key = areglo[i];
            int j = i - 1;
            while (j >= 0 && areglo[j] < key){
                areglo[j + 1] = areglo[j];
                j--;
                
            }
            areglo[j+1] = key;
            System.out.println("EL aux " + areglo[j + 1] + " inserta en pos " + (j+1));

            
        }
    }

    
}
