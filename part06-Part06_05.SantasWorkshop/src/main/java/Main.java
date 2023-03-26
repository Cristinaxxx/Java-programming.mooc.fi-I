
public class Main {

    public static void main(String[] args) {


        Gift book = new Gift("Il gattopardo", 1);
        Gift book2 = new Gift("Il maestro e Margherita", 2);
        
        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
        
        Package myPackage = new Package();
        
        myPackage.addGift(book);
        myPackage.addGift(book2);
        System.out.println(myPackage.totalWeight());

    }
}
