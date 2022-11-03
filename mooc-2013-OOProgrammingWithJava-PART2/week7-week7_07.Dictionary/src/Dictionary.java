
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Dictionary {
    
    private HashMap<String, String> hm = new HashMap<String, String>();
    
    public Dictionary(){
        
    }
    
    public String translate(String word) {
        return hm.get(word);
    }
    
    public void add(String word, String translation) {
        hm.put(word, translation);
    }
    
    public int amountOfWords() {
        return hm.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> result = new ArrayList<String>();
        for ( String key : hm.keySet() ) {
            result.add(key + " = " + hm.get(key) );
        }
        return result;
    }
               
}
