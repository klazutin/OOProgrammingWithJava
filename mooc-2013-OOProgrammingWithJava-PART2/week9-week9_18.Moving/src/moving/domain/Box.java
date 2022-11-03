/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author klazutin
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> contents = new ArrayList<Thing>();
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
    
    public boolean addThing(Thing thing){
        if (this.getVolume() + thing.getVolume() <= this.maximumCapacity){
            contents.add(thing);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getVolume() {
        int currentCapacity = 0;
        for (Thing t : contents){
            currentCapacity += t.getVolume();
        }        
        return currentCapacity;
    }
}
