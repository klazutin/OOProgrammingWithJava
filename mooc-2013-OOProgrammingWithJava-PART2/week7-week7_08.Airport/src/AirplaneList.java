
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
public class AirplaneList {
    private HashMap<String, Integer> airplaneDict = new HashMap<String, Integer>();
    
    public AirplaneList(){
        
    }
    
    public void add(String airplaneName, int airplaneCapacity){
        this.airplaneDict.put(airplaneName, airplaneCapacity);
    }
    
    public void printAll(){
        for (String planeID : airplaneDict.keySet()){
            System.out.println(planeID + " (" + airplaneDict.get(planeID) + " ppl)");
        }
    }
    
    public void printPlane(String planeID){
        if (airplaneDict.containsKey(planeID)){
            System.out.println(planeID + " (" + airplaneDict.get(planeID) + " ppl)");
        }
    }
    
    public int getCap(String planeID){
        if (airplaneDict.containsKey(planeID)){
            return airplaneDict.get(planeID);
        } else {
            return 0;
        }
    }
    
}
