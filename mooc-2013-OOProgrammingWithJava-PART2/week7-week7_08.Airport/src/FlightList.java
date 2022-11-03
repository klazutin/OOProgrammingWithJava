
import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class FlightList {
    private HashMap<String, String> flightDict = new HashMap<String, String>();
    private AirplaneList airplaneList;
    
    public FlightList(AirplaneList airplaneList){
        this.airplaneList = airplaneList;
    }
    
    public void add(String depDest, String planeID){
        this.flightDict.put(depDest, planeID);
    }
    
    public void printAll(){
        for (String depDest : flightDict.keySet()){
            String planeID = flightDict.get(depDest);
            int capacity = airplaneList.getCap(planeID);
            System.out.println(planeID + " (" + capacity + " ppl) " + "(" + depDest + ")");
        }
    }
}
