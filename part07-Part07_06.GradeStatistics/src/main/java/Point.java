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

public class Point {
    
    private ArrayList<Integer> points;

    
    public Point() {
        this.points = new ArrayList<>();
    }
    
    public ArrayList<Integer> getPoints() {
        return this.points;
    }
    
    public double average() {
        int sum = 0;
        for(Integer point : this.points) {
            sum += point;
        }
        double average = sum / this.points.size();
        return average;
    }
    
    
    public double passingPercentage() {
        int count = 0;
        for(Integer point : this.points) {
            if(point >= 50) {
                count++;
            }
        }
        double percentage = ((double) count/this.points.size()) * 100;
        return percentage;
    }
    
    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for(Integer point : this.points) {
            if(point >= 90 && point <= 100) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
        System.out.print("4: ");
        for(Integer point : this.points) {
            if(point >= 80 && point < 90) {
                System.out.print("*");
            }
        }    
        System.out.println(" ");
        System.out.print("3: ");
        for(Integer point : this.points) {
            if(point >= 70 && point < 80) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
        System.out.print("2: ");
        for(Integer point : this.points) {
            if(point >= 60 && point < 70) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
        System.out.print("1: ");
        for(Integer point : this.points) {
            if(point >= 50 && point < 60) {
                System.out.print("*");
            }
        }
        System.out.println(" ");
        System.out.print("0: ");
        for(Integer point : this.points) {
            if(point < 50 && point >= 0) {
                System.out.print("*");
            }
        }
        
    }

    
}
