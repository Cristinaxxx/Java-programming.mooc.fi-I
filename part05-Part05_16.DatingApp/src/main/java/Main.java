
public class Main {

    public static void main(String[] args) {
        
        SimpleDate date = new SimpleDate(13, 2, 2015);
        
        SimpleDate newDate = date.afterNumberOfDays(7);
        
        System.out.println(date);
        System.out.println(newDate);
            
    }
}
