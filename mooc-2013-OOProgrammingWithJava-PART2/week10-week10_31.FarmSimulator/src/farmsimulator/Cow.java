/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author klazutin
 */
public class Cow implements Alive, Milkable {
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    private String name;
    private double capacity;
    private double udder;
    
    public Cow() {
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }
    
    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.capacity;
    }
    
    public double getAmount() {
        return this.udder;
    }
    
    public String toString() {
        return this.name + " " + Math.ceil(this.udder) + "/" + this.capacity;
    }

    @Override
    public void liveHour() {
        double n = (new Random().nextInt(14) + 7) / 10.0;
        if (Math.ceil(this.udder) + n <= this.capacity) {
            this.udder = this.udder + n;
        } else {
            this.udder = this.capacity;
        }
    }

    @Override
    public double milk() {
        double tmp = this.udder;
        this.udder = 0;
        return tmp;
    }
    
}
