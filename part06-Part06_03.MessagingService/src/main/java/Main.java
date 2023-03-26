
public class Main {

    public static void main(String[] args) {

        MessagingService ms = new MessagingService();
        
        Message myMessage = new Message("Cristina", "message");
        ms.add(myMessage);
        
        System.out.println(ms.getMessages());
        
    }
}
