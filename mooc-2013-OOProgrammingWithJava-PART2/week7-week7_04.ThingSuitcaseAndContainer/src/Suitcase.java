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

public class Suitcase {
    private int weightLimit;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase(int weightLimit){
        this.weightLimit = weightLimit;
    }
    
    public void addThing(Thing thing){
        int totalWeight = 0;
        for (Thing t : things){
            totalWeight += t.getWeight();
        }
        if (totalWeight + thing.getWeight() <= this.weightLimit){
            this.things.add(thing);
        }        
    }
    
    public String toString(){
        if (this.things.isEmpty()){
            return "empty (0 kg)"; 
        } else {
            int totalWeight = 0;
            for (Thing thing : this.things){
                totalWeight += thing.getWeight();
            }
            return this.things.size() + " " + ((this.things.size() == 1) ? "thing" : "things") + " (" + totalWeight + " kg)";
        }
    }
    
    public void printThings(){
        for (Thing thing : this.things){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Thing thing : this.things){
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        if (this.things.isEmpty()){
            return null;
        } else {
            Thing heaviest = this.things.get(0);
            for (Thing thing : things){
                if (thing.getWeight() > heaviest.getWeight()){
                    heaviest = thing;
                }
            }
            return heaviest;
        }
    }
}
