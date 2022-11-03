/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Bird {
    private String name;
    private String latinName;
    private int observed = 0;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void observe(){
        this.observed++;
    }
    
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
}
