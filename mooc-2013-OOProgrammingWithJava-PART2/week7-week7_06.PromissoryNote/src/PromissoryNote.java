/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> debt = new HashMap<String, Double>();
    
    public PromissoryNote(){
        
    }
    
    public void setLoan(String toWhom, double value){
        this.debt.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if (this.debt.containsKey(whose)){
            return this.debt.get(whose);
        } else {
            return 0;
        }
    }
}
