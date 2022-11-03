/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author klazutin
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.size() == 0) {return 0;};
        double max = 0;
        for (double h : this.history) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
    
    public double minValue() {
        if (this.history.size() == 0) {return 0;};
        double min = this.maxValue();
        for (double h : this.history) {
            if (h < min) {
                min = h;
            }
        }
        return min;        
    }
    
    public double average() {
        if (this.history.size() == 0) {return 0;};
        double sum = 0;
        for (double h : this.history) {
            sum += h;
        }
        return sum / this.history.size();
    }
    
    public double greatestFluctuation() {
        if (this.history.size() <= 1) {return 0;};
        double greatest = 0;
        for (int h = 1; h < this.history.size(); h++){
            double current = Math.abs(this.history.get(h) - this.history.get(h-1));
            if (current > greatest) {
                greatest = current;
            }
        }
        return greatest;
    }
    
    public double variance() {
        double sums = 0;
        for (double h : this.history){
            sums += Math.pow(h - this.average(), 2);
        }
        return sums / (this.history.size() - 1);
    }
}
