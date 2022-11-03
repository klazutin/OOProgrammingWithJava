
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Storehouse {
    private Map<String, Integer> priceMap = new HashMap<String, Integer>();
    private Map<String, Integer> stockMap = new HashMap<String, Integer>();
        
    public Storehouse(){
    };
    
    public void addProduct(String product, int price, int stock){
        priceMap.put(product, price);
        stockMap.put(product, stock);
    };
    
    public int price(String product){
        if (priceMap.containsKey(product)){
            return priceMap.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product){
        if (stockMap.containsKey(product)){
            return stockMap.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product){
        if (stockMap.containsKey(product)){
            int currentStock = stockMap.get(product);
            if (currentStock > 0) {
                stockMap.replace(product, currentStock - 1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        return priceMap.keySet();
    }
       
}
