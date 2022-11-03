/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author klazutin
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> boxesUsed = new ArrayList<Box>();
        Box b = new Box(this.boxesVolume);
        boxesUsed.add(b);
        for (Thing t : things) {
            int freeSpace = this.boxesVolume - b.getVolume();
            if (freeSpace >= t.getVolume()){
                b.addThing(t);
            } else {
                b = new Box(this.boxesVolume);
                boxesUsed.add(b);
                b.addThing(t);
            }
        }
        return boxesUsed;
        
    };
}
