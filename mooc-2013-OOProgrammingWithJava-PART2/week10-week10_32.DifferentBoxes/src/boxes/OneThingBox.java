/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author klazutin
 */
public class OneThingBox extends Box {
    private Thing thing = null;
    
    public OneThingBox() {
//        this.thing = null;
    }

    @Override
    public void add(Thing thing) {
        if (this.thing == null){
            this.thing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (this.thing == null) {
            return false;
        }        
        return this.thing.equals(thing);
    }    
}
