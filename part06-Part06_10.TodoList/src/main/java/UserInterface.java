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

public class UserInterface {
    
    private TodoList myList;
    private Scanner scanner;
    
    public UserInterface(TodoList myList, Scanner scanner) {
        this.myList = myList;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            } 
            if(command.equals("add")) {
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                myList.add(toAdd);
            }
            if(command.equals("list")) {                
                myList.print();
            }
            if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int number = Integer.valueOf(scanner.nextLine());
                myList.remove(number);
            }
        }
    }
    
}
