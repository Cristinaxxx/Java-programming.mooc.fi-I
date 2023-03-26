
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        Point listOfPoints = new Point();
        Point passingPoints = new Point();
        
        System.out.println("Enter point totals, -1 stops:");        
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                System.out.println("Point average (all): " + listOfPoints.average());
                System.out.println("Point average (passing): " + passingPoints.average());
                System.out.println("Pass percentage: " + listOfPoints.passingPercentage());
                listOfPoints.gradeDistribution();
                break;
            }
            if(input >= 0 && input <= 49) {
                listOfPoints.getPoints().add(input);  
                continue;
            }
            if(input >= 50 && input <= 100) {
                listOfPoints.getPoints().add(input);
                passingPoints.getPoints().add(input);
                continue;
            } else continue;
        }
        
  
        
    }
}
