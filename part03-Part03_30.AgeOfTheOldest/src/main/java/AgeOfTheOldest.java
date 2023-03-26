
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        ArrayList<Integer> ages = new ArrayList<Integer>(); 
        
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            } else {
                String[] parts = input.split(",");
                age = Integer.valueOf(parts[1]);
                ages.add(age);
            }
        }
        
        int oldest = 0;
        for(int i = 0; i < ages.size(); i++) {
            if(ages.get(i) > oldest) {
                oldest = ages.get(i);
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
