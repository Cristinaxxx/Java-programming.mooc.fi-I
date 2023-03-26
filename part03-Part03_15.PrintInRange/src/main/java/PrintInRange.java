
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(2);
        myList.add(6);
        myList.add(-1);
        myList.add(5);
        myList.add(1);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(myList, 0, 5);
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for(int number : numbers) {
            if(number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
            
        } 
    
}
