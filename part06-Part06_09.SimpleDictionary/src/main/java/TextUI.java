/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */

import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if(input.equals("end")) {
                System.out.println("Bye bye!");
                break; 
            } else if(input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                
            } else if(input.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = scanner.nextLine();                
                if(dictionary.translate(toBeTranslated) == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");   
                    break;
                } else {
                    System.out.println(dictionary.translate(toBeTranslated)); 
                }                
            } else {
                System.out.println("Unknown command");
            }            
        }
    }
    
}
