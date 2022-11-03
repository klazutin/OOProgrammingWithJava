/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author klazutin
 */
public class Item implements Thing, Comparable {
    private String name;
    private Integer volume;
    
    public Item (String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + String.valueOf(this.volume) + " dm^3)";
    }
    
    public int compareTo(Item comparable){
//        Item otherItem = (Item) other;
//        int otherVol = otherItem.volume;
        return this.volume.compareTo(comparable.volume);
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
