/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Games {
    
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    
    public Games(String team1, String team2, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
        this.score2 = score2;          
    }
    
    public String getTeam1() {
        return team1;
    }
    
    public String getTeam2() {
        return team2;
    }
    
    public int getScore1() {
        return score1;
    }
    
    public int getScore2() {
        return score2;
    }
    
    
}
