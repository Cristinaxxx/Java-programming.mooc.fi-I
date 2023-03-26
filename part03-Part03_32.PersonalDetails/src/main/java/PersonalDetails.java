
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countYears = 0;
        ArrayList<Integer> years = new ArrayList<>();   
        ArrayList<String> names = new ArrayList<>(); 
        
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            } else {              
                String[] parts = input.split(",");                 
                int year = Integer.valueOf(parts[1]);  
                String name = parts[0];
                years.add(year);  
                countYears++;
                names.add(name);
            }
        }
        
        
        String name = "";
        for(int i = 0; i < names.size(); i++) {        
            if(names.get(i).length() > name.length()) {
                name = names.get(i);
            }
        }    

        System.out.println("Longest name: " + name);    
     
        int sum = 0;
        for(int i = 0; i < years.size(); i++) {
            sum = sum + years.get(i);
        }
        
        double average = (double) sum/countYears;
        System.out.println(average);
     
    }
}

