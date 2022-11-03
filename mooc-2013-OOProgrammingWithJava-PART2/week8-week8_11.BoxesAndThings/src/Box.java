
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
public class Box implements ToBeStored {
    private double maxWeight;
    private double currentWeight = 0;
    private ArrayList<ToBeStored> contents = new ArrayList<ToBeStored>();
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored item){
        if (this.currentWeight + item.weight() < this.maxWeight){
            contents.add(item);
            this.currentWeight += item.weight();
        }
    }
    
    public double weight(){
        double weight = 0;
        for (ToBeStored item : contents){
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString(){
        return "Box: " + contents.size() + " things, total weight " + this.currentWeight + " kg";
    }
    
}
