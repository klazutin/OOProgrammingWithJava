
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
public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    
    public Container(int weightLimit){
        this.weightLimit = weightLimit;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
        for (Suitcase sc : this.suitcases){
            totalWeight += sc.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= this.weightLimit){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        if (this.suitcases.isEmpty()){
            return "empty (0 kg)";
        } else {
            int totalWeight = 0;
            for (Suitcase suitcase : this.suitcases){
                totalWeight += suitcase.totalWeight();
            }
            return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
        }
    }
    
    public void printThings(){
        for (Suitcase suitcase : this.suitcases){
            suitcase.printThings();
        }
    }
}
