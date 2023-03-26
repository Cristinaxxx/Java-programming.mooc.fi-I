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

public class Hold {
    
    private ArrayList<Suitcase> suitcaseList;
    private int maximumWeight;
    
    public Hold(int maximumWeight) {
        this.suitcaseList = new ArrayList<>();
        this.maximumWeight = maximumWeight; 
        
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if((totalWeight() + suitcase.totalWeight()) <= maximumWeight) {
            this.suitcaseList.add(suitcase);
        }          
    }
    
    public int totalWeight() {
        int totWeight = 0;
        for(Suitcase suitcase: this.suitcaseList) {
            totWeight += suitcase.totalWeight();
        }
        return totWeight;
    }
    
    public String toString() {
        return suitcaseList.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for(Suitcase suitcase : this.suitcaseList) {
            suitcase.printItems();
        }
    }
    
}
