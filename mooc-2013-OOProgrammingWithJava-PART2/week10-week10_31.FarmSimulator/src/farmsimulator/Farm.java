/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author klazutin
 */
public class Farm {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void liveHour(){
        for (Cow c: cows) {
            c.liveHour();
        }
    }
    
    public void manageCows() {
        this.barn.takeCareOf(cows);
    }
    
    public String toString() {
        String cowString;
        if (this.cows.isEmpty()){
            cowString = "No cows.";
        } else {
            cowString = "Animals: \n";
            for (Cow c : this.cows){
                cowString += "        " + c.getName() + " " + Math.ceil(c.getAmount()) + "/" + Math.ceil(c.getCapacity()) + "\n";
            }
        }
        return "Farm owner: " + this.owner + "\n"
                + "Barn bulk tank: " + Math.ceil(this.barn.getBulkTank().getVolume()) + "/"
                + this.barn.getBulkTank().getCapacity() + "\n"
                + cowString;
    }
    
}
