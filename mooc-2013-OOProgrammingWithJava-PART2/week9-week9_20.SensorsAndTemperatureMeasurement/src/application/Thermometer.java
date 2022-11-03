/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author klazutin
 */
public class Thermometer implements Sensor {
    private boolean state = false;

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if (this.state) {
            Random rand = new Random(); 
            return rand.nextInt((30 - -30) + 1) + -30;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
