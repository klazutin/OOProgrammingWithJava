/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Player {
    private String playerName;
    private int numGoals;

    public Player(String playerName) {
        this(playerName, 0);
    }

    public Player(String playerName, int numGoals) {
        this.playerName = playerName;
        this.numGoals = numGoals;
    }
    
    public String getName(){
        return this.playerName;
    }
    
    public int goals(){
        return this.numGoals;
    }
    
    public String toString(){
        return this.playerName + ", goals " + this.numGoals;
    }
}
