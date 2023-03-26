import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Title: ");
            String title = reader.nextLine();
            if(title.isEmpty()) {
                break;
            } else {
                System.out.println("Pages: ");
                int pages = Integer.valueOf(reader.nextLine());
                System.out.println("Publication year: ");
                int year = Integer.valueOf(reader.nextLine());
                books.add(new Book(title, pages, year));
            }
        }
        
        System.out.println("What information will be printed?");
        String answer = reader.nextLine();
        if(answer.equals("everything")) {
            for(Book book : books) {
                System.out.println(book);
            }
        } else if(answer.equals("name")) {
            for(Book book : books) {
                System.out.println(book.getTitle());
            }
        }
       

    }
}
