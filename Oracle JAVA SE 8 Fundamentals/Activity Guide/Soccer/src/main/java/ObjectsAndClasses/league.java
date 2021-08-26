/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectsAndClasses;

/**
 *
 * @author User
 */
public class league {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        player player1 = new player();
        player1.playerName = "George Eliot";
        player player2 = new player();
        player2.playerName = "Geoffrey Chaucer";
        player player3 = new player();
        player3.playerName = "Graham Greene";
        
        player [] thePlayers = {player1, player2, player3};
        
        team team1 = new team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        team team2 = new team();
        team2.teamName = "The Reds";
        
        team2.playerArray = new player[3];
        team2.playerArray[0] = new player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        game currGame = new game();
        currGame.hometeam = team1;
        currGame.awayteam = team2;
        
        goal goal1 = new goal();
        goal1.thePlayer = currGame.hometeam.playerArray[2];
        goal1.theTeam = currGame.hometeam;
        goal1.theTime = 55;
        
        goal [] theGoals = {goal1};
        currGame.goals = theGoals;
        
        System.out.println("Goal scored after " + currGame.goals[0].theTime + 
                " mins by " + currGame.goals[0].thePlayer.playerName + " of" +
                currGame.goals[0].theTeam.teamName);
        
    }
    
}
