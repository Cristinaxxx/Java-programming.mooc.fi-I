/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
import java.util.ArrayList;
        
        
public class Suitcase {
    
    private int maximumWeight;
    private ArrayList<Item> list;
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.list = new ArrayList<>();
    }
    
    public void addItem(Item item) {        
        if((totalWeight() + item.getWeight()) <= maximumWeight) {
            this.list.add(item);
        }        
    }
    
    public int totalWeight() {
        int totWeight = 0;
        for(Item item1: this.list) {
            totWeight += item1.getWeight();
        }
        return totWeight;
    }
    
    public String toString() { 
        if(this.list.isEmpty()) {
            return "no items (0 kg)";
        }
        if(this.list.size() == 1) {
            return "1 item (" + this.list.get(0).getWeight() + " kg)";
        } else return this.list.size() + " items (" + totalWeight() + " kg)";   
    }
    
    public void printItems() {
        for(Item thing: this.list) {
            System.out.println(thing.getName() + " (" + thing.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if(this.list.isEmpty()) {
            return null;
        }
        Item heaviest = this.list.get(0);
        for(Item thing : this.list) {
            if(thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
}
