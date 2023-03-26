
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> myList = new ArrayList<>();        
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999) {
                break;
            }
            
            myList.add(number);
        }
        
        System.out.println("");
        
        int smallest = myList.get(0);
        for(int i = 0; i < myList.size(); i++) {
            if(smallest > myList.get(i)) {
                smallest = myList.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for(int i = 0; i < myList.size(); i++) {
            if(smallest == myList.get(i)) {
                System.out.println("Found at index:  " + i);
            }
        }
            
         
    }
}
