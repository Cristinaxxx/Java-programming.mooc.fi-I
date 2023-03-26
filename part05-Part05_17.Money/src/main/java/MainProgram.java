
public class MainProgram {

    public static void main(String[] args) {
        
       /* Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);
        
        c = a.minus(b); */
        
        Money first = new Money(2, 50);
        Money second = new Money(2, 0);
        Money firstMinusSecond = first.minus(second);
        
        System.out.println(firstMinusSecond);
        
    }
}
