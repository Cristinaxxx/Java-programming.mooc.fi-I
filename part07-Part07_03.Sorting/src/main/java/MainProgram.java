
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {        
       
        int[] array = {3, 7, 1, 5, 99, 3, 12};
        int startIndex = 3;
        
        int result = smallest(array);
        System.out.println(result);
        int indexOfsmallest = indexOfSmallest(array);
        System.out.println(indexOfsmallest);
        int indexOfSmallestFrom = indexOfSmallestFrom(array, startIndex);
        System.out.println(indexOfSmallestFrom);
        
        swap(array, 4, 6);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        
        sort(array);
  
     
    }
    
    public static int smallest(int[] array) {
        int smallestInt = array[0];
        for(int i = 0; i < array.length; i++) {
            if(smallestInt > array[i]) {
                smallestInt = array[i];
            }
        }
        return smallestInt;
    }
    
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallestInt = array[0];
        for(int i = 0; i < array.length; i++) {
            if(smallestInt > array[i]) {
                smallestInt = array[i];
                index = i;
            }
        }        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        int smallestInt = array[startIndex];
        for(int i = startIndex; i < array.length; i++) {
            if(smallestInt > array[i]) {
                smallestInt = array[i];     
                index = i;
            }            
        }        
        return index;    
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];  
        array[index1] = array[index2];
        array[index2] = temp;     
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, smallestIndex, i);
            System.out.println(Arrays.toString(array));
        } 
        
    }

}
