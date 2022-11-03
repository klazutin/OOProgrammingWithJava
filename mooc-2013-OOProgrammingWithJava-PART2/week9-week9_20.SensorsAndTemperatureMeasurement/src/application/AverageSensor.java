/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author klazutin
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensorsList = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();

    @Override
    public boolean isOn() {
        boolean on = false;
        for (Sensor s : sensorsList){
            if (s.isOn()){
                on = true;
            } else {
                on = false;
            }
        }
        return on;
    }

    @Override
    public void on() {
        for (Sensor s : sensorsList){
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : sensorsList){
            s.off();
        }        
    }

    @Override
    public int measure() {
        if (this.isOn() == false || this.sensorsList.isEmpty()) {
            throw new IllegalStateException();
        }
        int totalValue = 0;
        int sensorCount = 0;
//        this.readings.clear();
        for (Sensor s : sensorsList){
            totalValue += s.measure();
            sensorCount++;
        }
        readings.add(totalValue / sensorCount);
        return totalValue / sensorCount;
    }
    
    public void addSensor(Sensor additional) {
        this.sensorsList.add(additional);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }
    
}
