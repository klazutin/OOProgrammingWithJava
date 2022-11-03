/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author klazutin
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow) throws IllegalStateException {
        if (this.robot == null) {
            throw new IllegalStateException();
        }
        this.robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
        if (this.robot == null) {
            throw new IllegalStateException();
        }        
        for (Cow c : cows) {
            this.robot.milk(c);
        }
    }
    
    public String toString() {
        return "Barn: " + Math.ceil(this.tank.getVolume()) + "/" + this.tank.getCapacity();
    }
}
