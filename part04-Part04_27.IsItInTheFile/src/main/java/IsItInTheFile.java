
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        if(file.equals("names.txt") || file.equals("other-names.txt")) {
            try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
            } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("Reading the file " + file + " failed.");
        }
        

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        while(true) {
            if(searchedFor.isEmpty()) {
                break;
            } else if(lines.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found");
                break;
            }
        }

    }
}
