
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        
        String output = "";        
        
        if(this.elements.isEmpty()) {
            output = "The collection " + this.name + " is empty.";
            
        } else if(this.elements.size() == 1) {             
            output = "The collection " + this.name + " has " + elements.size() + " element:" + "\n" + this.elements.get(0);            
            
        } else {            
            output = "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n";
            for(int i = 0; i < elements.size(); i++) {
                output += elements.get(i) + "\n";
            }
        }
        
        return output;
        
        
    }
    
}
