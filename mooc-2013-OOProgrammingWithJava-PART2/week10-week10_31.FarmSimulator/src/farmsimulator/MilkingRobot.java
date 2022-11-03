/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author klazutin
 */
public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot() {
        
    }
    
    public BulkTank getBulkTank(){
        if (this.tank != null) {
            return this.tank;
        } else {
            return null;
        }
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) throws IllegalStateException {
        if (this.tank == null) {
            throw new IllegalStateException();
        }
        double m = milkable.milk();
        this.tank.addToTank(m);
    }
    
}
