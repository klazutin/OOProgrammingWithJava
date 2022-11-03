
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
public class RingingCentre {
    private HashMap<Bird, ArrayList<String>> observationsList = new HashMap<Bird, ArrayList<String>>();
    
    public RingingCentre() {
        
    }
    
    public void observe(Bird bird, String place) {
        if (!this.observationsList.containsKey(bird)) {
            this.observationsList.put(bird, new ArrayList<String>());
        }
        this.observationsList.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
        
        for (Bird b : this.observationsList.keySet()) {
            if (b.equals(bird)) {
                ArrayList<String> locations = this.observationsList.get(b);
                System.out.println(bird.toString() + " observations: " + locations.size());
                for (String location : locations) {
                    System.out.println(location);
                }
                break;
            }
        }
        System.out.println(bird.toString() + " observations: 0");
    }
}
