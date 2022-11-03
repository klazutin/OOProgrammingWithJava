/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
import java.util.ArrayList;

public class Team {
    private String teamName;
    private int maxSize = 16;
    private ArrayList<Player> playerList = new ArrayList<Player>();
    
    public Team(String teamName){
        this.teamName = teamName;        
    }
    
    public String getName(){
        return this.teamName;
    }
    
    public void addPlayer(Player player){
        if (this.size() + 1 <= this.maxSize){
            playerList.add(player);
        }
    }
    
    public void printPlayers(){
        for (Player p : this.playerList){
            System.out.println(p.toString());
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.playerList.size();
    }
    
    public int goals(){
        int sumGoals = 0;
        for (Player p : this.playerList){
            sumGoals += p.goals();
        }
        return sumGoals;
    }
}
