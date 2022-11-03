
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Jumper implements Comparable<Jumper>{
    
    private String name;
    private int points;
    private ArrayList<Integer> lengths = new ArrayList<Integer>();
    private ArrayList<ArrayList<Integer>> votes;
    
    public Jumper(String name) {
        this.name = name;
        this.votes = new ArrayList<ArrayList<Integer>>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public void addPoints(int newPoints) {
        this.points += newPoints;
    }
    
    public ArrayList<Integer> getLengths(){
        return this.lengths;
    }
    
    public void addLength(int length){
        this.lengths.add(length);
    }
    
    public String toString() {
        return this.getName();
    }
    
    public ArrayList<Integer> getVotesForRound(int roundNum) {
        return this.votes.get(roundNum);
    }
    
    public void addVotes(ArrayList<Integer> votes) {
        this.votes.add(votes);
    }

    @Override
    public int compareTo(Jumper other) {
        if (this.getPoints() > other.getPoints()) {
            return -1;
        } else if (this.getPoints() < other.getPoints()) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
