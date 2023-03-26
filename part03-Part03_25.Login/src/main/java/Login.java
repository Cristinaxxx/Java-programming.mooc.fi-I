
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username1 = "alex";
        String password1 = "sunshine";
        String username2 = "emma";
        String password2 = "haskell";
        
        System.out.println("Enter username:");
        String enteredUser = scanner.nextLine();
        System.out.println("Enter password:");
        String enteredPassword = scanner.nextLine();
        
        if((enteredUser.equals(username1) && enteredPassword.equals(password1)) || 
            (enteredUser.equals(username2) && enteredPassword.equals(password2))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
            
        
    
                

    }
}
