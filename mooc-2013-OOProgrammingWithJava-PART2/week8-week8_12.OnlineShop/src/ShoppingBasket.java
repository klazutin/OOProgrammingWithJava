
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class ShoppingBasket {
    private List<Purchase> sb = new ArrayList<Purchase>();
    
    public ShoppingBasket(){
        
    }
    
    public void add(String product, int price){

        boolean had = false;
        for (Purchase p : sb){
            if (p.toString().contains(product)){
                p.increaseAmount();
                had = true;
            };
        }
        if (!had) {
            Purchase newPurchase = new Purchase(product, 1, price);
            sb.add(newPurchase);        
        }
    };
    
    public int price(){
        int totalPrice = 0;
        for (Purchase p : sb){
            totalPrice += p.price();
        }
        return totalPrice;
    };
    
    public void print(){
        for (Purchase p : sb){
            System.out.println(p.toString());
        }
    }
}
