/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int setValue) {
        if (setValue > 0 && setValue <= this.upperLimit){
            this.value = setValue;
        }
    }
    
    public void next(){
        this.value+=1;
        if (this.value > this.upperLimit) {this.value = 0;}
    }
    
    public String toString(){
        if (this.value < 10) {
            return "0" + String.valueOf(this.value);
        } else {
            return String.valueOf(this.value);
        }
    }
}
