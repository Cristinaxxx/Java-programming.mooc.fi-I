
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 0;
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            }
            
            list.add(number);
            count++;
        }
        
        int sum = 0;        
        for(int number: list) {
            sum = sum + number;            
        }
        
        double average = (double) sum / count;
        System.out.println(average);
        
        
        
    }
}
