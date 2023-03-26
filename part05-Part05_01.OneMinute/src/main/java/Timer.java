/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Timer {
    
    private ClockHand cents;
    private ClockHand seconds;
    
    public Timer() {
        this.cents = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.cents.advance();
        if(this.cents.value() == 0) {
            this.seconds.advance();
        }                
    }
    
    public String toString() {
        return seconds.toString() + ":" + cents.toString();
    }
    
}
