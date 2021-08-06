/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonEight;



/**
 *
 * @author User
 */
public class league {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creating players
        player player1 = new player();
        player1.playerName = "George Eliot";
        player player2 = new player();
        player2.playerName = "Geoffrey Chaucer";
        player player3 = new player();
        player3.playerName = "Graham Greene";
        
        //array that holds players
        player [] thePlayers = {player1, player2, player3};
        
        //creating the first team and assigning players
        team team1 = new team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        //creating the second team and assigning players
        team team2 = new team();
        team2.teamName = "The Reds";
        
        team2.playerArray = new player[3];
        team2.playerArray[0] = new player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        //starting a new game/match
        game currGame = new game();
        currGame.hometeam = team1;
        currGame.awayteam = team2;
        
        //creating a goal
        goal goal1 = new goal();
        goal1.thePlayer = currGame.hometeam.playerArray[2];
        goal1.theTeam = currGame.hometeam;
        goal1.theTime = 55;
        
        //storing the goal
        goal [] theGoals = {goal1};
        currGame.goals = theGoals;
        
        //printing the highlight of the goal
        System.out.println("Goal scored after " + currGame.goals[0].theTime + 
                " mins by " + currGame.goals[0].thePlayer.playerName + " of" +
                currGame.goals[0].theTeam.teamName);
        
        //searching for players and splitting names
        for (player thePlayer: team2.playerArray) {
            if (thePlayer.playerName.matches(".*Sab.*")) {
                System.out.println("Found: " + thePlayer.playerName);
                System.out.println("Last name is: " + thePlayer.playerName.split(" ")[1]);
            }
        }
        
        //creating object that will hold and seperate the names
        StringBuilder familyNameFirst = new StringBuilder();
        
        //printing restructerd names
        for (player thePlayer: team1.playerArray) {
            String name[] = thePlayer.playerName.split(" ");
            familyNameFirst.append(name[1]);
            familyNameFirst.append(", ");
            familyNameFirst.append(name[0]);
            System.out.println(familyNameFirst);
            familyNameFirst.delete(0, familyNameFirst.length());
        }
    }
    
    public static Game[] createGames(Team[] theTeams) {
        team[] theTeams = {team1,team2};
    }
    
}
