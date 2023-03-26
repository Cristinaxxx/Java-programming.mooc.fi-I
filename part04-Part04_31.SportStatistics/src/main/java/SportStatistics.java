
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Games> games = new ArrayList<>();
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();        
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");                
                String team1 = parts[0];
                String team2 = parts[1];                
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);   
                if(team1.equals(teamName) || team2.equals(teamName)) {
                    count++;
                }                
                games.add(new Games(team1, team2, score1, score2));                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + count);
        
        for(Games game : games) {            
            if(game.getTeam1().equals(teamName)) {
                if(game.getScore1() > game.getScore2()) {
                    wins++;
                } else {
                    losses++;
                }                    
            } else if(game.getTeam2().equals(teamName)) {
                if(game.getScore2() > game.getScore1()) {
                    wins++;                    
                } else {
                    losses++;
                }
            }
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}















