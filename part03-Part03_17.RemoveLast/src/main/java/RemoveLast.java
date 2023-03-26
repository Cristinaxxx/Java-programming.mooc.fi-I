
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(9);
        myList.add(-3);
        myList.add(12);
        myList.add(5);
        myList.add(4);
        
        System.out.println(myList);        
        removeLast(myList);        
        System.out.println(myList);
    }
    
    public static void removeLast(ArrayList<Integer> myList) {
        if(myList.size()== 0) {
            return;
        }
        myList.remove(myList.size() -1);
    }

}
