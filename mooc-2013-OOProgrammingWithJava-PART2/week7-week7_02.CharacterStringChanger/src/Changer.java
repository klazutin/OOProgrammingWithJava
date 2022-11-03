/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();
    
    public Changer(){
        
    }
    
    public void addChange (Change change){
        changes.add(change);
    }
    
    public String change(String characterString){
        String result = characterString;
        for (Change change : changes){
            result = change.change(result);
        }
        return result;
    }
}
