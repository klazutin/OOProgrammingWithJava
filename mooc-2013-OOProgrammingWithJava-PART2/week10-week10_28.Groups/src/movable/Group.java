/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author klazutin
 */
public class Group implements Movable {
    private ArrayList<Organism> members;
    
    public Group() {
        this.members = new ArrayList<Organism>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Organism o : this.members) {
            o.move(dx, dy);
        }
    }
    
    public void addToGroup(Movable movable) {
        this.members.add((Organism) movable);
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Organism o : this.members) {
            result += o.toString() + "\n";
        }
        return result;
    }
}
