/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Book {
    
    private String title;
    private int numberOfPages; 
    private int publicationYear;
    
    public Book(String title, int pages, int year) {
        this.title = title; 
        this.numberOfPages = pages;
        this.publicationYear = year;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getNumberOfPages() {
        return this.numberOfPages;
    }
    
    public int getYear() {
        return this.publicationYear;
    }
    
    public String toString() {
        return title + ", " + numberOfPages + " pages, " + publicationYear;
    }
    
    
    
}
