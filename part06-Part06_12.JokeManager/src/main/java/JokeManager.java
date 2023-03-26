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
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {    
        String joke = "";
        if(jokes.isEmpty()) {
            return "Jokes are in short supply.";             
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            joke = this.jokes.get(index);
        }        
        return joke;
    }
    
    public void printJokes() {
        for(int i = 0; i < this.jokes.size(); i++) {
            System.out.println(this.jokes.get(i));
        }
    }
    
}
