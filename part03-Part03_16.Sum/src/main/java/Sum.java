
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(30);
        list.add(21);
        list.add(9);
        
        sum(list);
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum = sum + number;
        }
        
        return sum;
    }

}
