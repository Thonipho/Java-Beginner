/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreOnConditionals;

import Utility.GameUtils;

/**
 *
 * @author User
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        League theLeague = new League();

        // creating arrays to store the teams of the game
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);

        // creating a new match and printing match description
        for (Game currGame : theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        
        theLeague.showBestTeam(theTeams);

    }

    public Team[] createTeams() {
        // creating and assigining team players

        Player player1 = new Player("Roberto Firmino");
        Player player2 = new Player("Sadio Mane");
        Player player3 = new Player("Mo Salah");
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team("Liverpool", thePlayers);

        // Create team2
        Team team2 = new Team();
        team2.setTeamName("Chelsea");
        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player("Tino Werner");
        team2.getPlayerArray()[1] = new Player("Romeru Lukaku");
        team2.getPlayerArray()[2] = new Player("Mateo Kovatic");

        Team[] theTeams = {team1, team2};
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        // assigning teams to the match

        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game theGame3 = new Game(theTeams[0], theTeams[1]);
        Game theGame4 = new Game(theTeams[1], theTeams[0]);
        Game[] theGames = {theGame, theGame2, theGame3, theGame4};
        return theGames;
    }
    
    public void showBestTeam(Team [] theTeams) {
        Team currBestTeam = theTeams[0];
        
        System.out.println("\nTeam Points");
        
        for(Team currTeam: theTeams) {
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getPointsTotal() + ":" + currTeam.getGoalsTotal());
            if(currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            }
            else if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal()) {
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }
        System.out.println("Winner of the league is " + currBestTeam.getTeamName());
    }

}
