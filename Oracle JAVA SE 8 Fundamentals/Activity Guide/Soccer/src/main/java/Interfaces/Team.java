/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author User
 */
public class Team implements Comparable {

    private String teamName;
    private Player[] playerArray;
    private int pointsTotal;
    private int goalsTotal;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }

    public Team() {
    }

    public void incPointsTotal(int pointsTotal) {
        this.pointsTotal += pointsTotal;
    }

    public void incGoalsTotal(int goals) {
        this.goalsTotal += goals;
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public int getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public int getGoalsTotal() {
        return goalsTotal;
    }

    public void setGoalsTotal(int goalsTotal) {
        this.goalsTotal = goalsTotal;
    }
    
    public int compareTo(Object theTeam) {
        int returnValue = -1;
        if (this.getPointsTotal() < ((Team)theTeam).getPointsTotal()) {
            returnValue = 1;
        } 
        else if (this.getPointsTotal() == ((Team)theTeam).getPointsTotal()) {
            if (this.getGoalsTotal() < ((Team)theTeam).getGoalsTotal()) {
                returnValue = 1;
            }
        }
        return returnValue;
    }
}
