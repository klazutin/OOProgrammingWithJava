/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Calculator {
    private int currentValue;
    
    public Calculator() {
        
    }
    
    public void add(int operand) {
        this.currentValue += operand;
    }
    
    public void subtract(int operand) {
        this.currentValue -= operand;
    }
    
    public int getValue() {
        return this.currentValue;
    }
}
