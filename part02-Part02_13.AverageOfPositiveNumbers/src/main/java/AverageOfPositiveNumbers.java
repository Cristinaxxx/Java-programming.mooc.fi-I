
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        int count = 0;
        int sum = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number > 0) {
                count++;
                sum = sum + number;
            }
            if(number < 0) {
                continue;
            }
            if(number == 0) {
                break;
            }  
        }
        
        double average = 1.0 * sum/count;
        
        if(sum > 0) {
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
            

    }
}
