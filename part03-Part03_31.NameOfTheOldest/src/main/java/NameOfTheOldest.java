
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        String name = "";
        ArrayList<Integer> ages = new ArrayList<Integer>();   
        ArrayList<String> names = new ArrayList<String>(); 
        
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            } else {
                String[] parts = input.split(",");                 
                age = Integer.valueOf(parts[1]);  
                name = parts[0];
                ages.add(age);  
                names.add(name);
            }
        }
        
        int oldest = 0;
        for(int i = 0; i < ages.size(); i++) {
            if(ages.get(i) > oldest)  {
                oldest = ages.get(i);
            }
        }
        
        int indexOldest = ages.indexOf(oldest);
        System.out.println("Name of the oldest: " + names.get(indexOldest));
       

    }
}
