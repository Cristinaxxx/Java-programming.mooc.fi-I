
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.squares);                
    }
    
    public int priceDifference(Apartment compared) {
        int price1 = this.squares * this.pricePerSquare;
        int price2 = compared.squares * compared.pricePerSquare;
        if(price1 > price2) {
            return price1 - price2;
        }
        return price2 - price1;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int price1 = this.squares * this.pricePerSquare;
        int price2 = compared.squares * compared.pricePerSquare;
        if(price1 > price2) {
            return true;
        }
        return false;
    }

}
