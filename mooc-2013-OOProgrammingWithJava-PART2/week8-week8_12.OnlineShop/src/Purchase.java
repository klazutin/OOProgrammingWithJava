/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Purchase {
    private int amount;
    private int unitPrice;
    private String product;

    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    };
    
    public int price(){
        return this.amount * this.unitPrice;
    };
    
    public void increaseAmount(){
        this.amount++;
    };
    
    public String toString(){
        return this.product + ": " + String.valueOf(this.amount);
    };
}
