/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Interfaces.PlayerDatabase;
import java.time.*;
import java.util.*;

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
        Team[] theTeams = theLeague.createTeams("Liverpool,Chelsea,Arsenal", 3);
        Game[] theGames = theLeague.createGames(theTeams);

        System.out.println(theLeague.getLeagueAnnouncment(theGames));

        // creating a new match and printing match description
        for (Game currGame : theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }

        theLeague.showBestTeam(theTeams);

    }

    public Team[] createTeams(String teamNames, int teamSize) {
        // creating teams and assigning players
        PlayerDatabase playerDB = new PlayerDatabase();
        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];

        for (int i = 0; i < theTeams.length; i++) {
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }
        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        // creating matches and assigning teams
        int daysBetweenGames = 0;
        ArrayList<Game> theGames = new ArrayList();

        for (Team homeTeam : theTeams) {
            for (Team awayTeam : theTeams) {
                if (homeTeam != awayTeam) {
                    daysBetweenGames += 7;
                    theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
                }
            }
        }
        return (Game[]) theGames.toArray(new Game[1]);
    }

    public void showBestTeam(Team[] theTeams) {
        Team currBestTeam = theTeams[0];

        System.out.println("\nTeam Points");

        for (Team currTeam : theTeams) {
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getPointsTotal() + ":" + currTeam.getGoalsTotal());
            if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            } else if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal()) {
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }
        System.out.println("Winner of the league is " + currBestTeam.getTeamName());
    }

    public String getLeagueAnnouncment(Game[] theGames) {
        Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(),
                theGames[theGames.length - 1].getTheDateTime().toLocalDate());

        return "The league is scheduled to run for " + thePeriod.getMonths() + " months(s), and "
                + thePeriod.getDays() + " days(s)\n";
    }

}
