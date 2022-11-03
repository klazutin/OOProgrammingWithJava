/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author klazutin
 */
public class MaxWeightBox extends Box {
    private int maxWeight;
    private Collection<Thing> contents;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<Thing>();
    }
    
    private double totalWeight(){
        double res = 0;
        for (Thing t : this.contents) {
            res += t.getWeight();
        }
        return res;
    }

    @Override
    public void add(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            this.contents.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing t : this.contents){
            if (t.equals(thing)) {
                return true;
            }
        }
        return false;
    }
    
}
