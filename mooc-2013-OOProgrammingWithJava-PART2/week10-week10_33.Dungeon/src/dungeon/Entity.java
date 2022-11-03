/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author klazutin
 */
public class Entity implements Comparable<Entity> {
    
    private int x;
    private int y;
    private EntityType type;
    
    public Entity(EntityType type, int x, int y) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public String symbol(){
        return this.type.symbol();
    }
    
    @Override
    public String toString() {
        return this.type.symbol() + " " + this.x + " " + this.y;
    }

    @Override
    public int compareTo(Entity other) {
        if (this.getX() > other.getX() && this.getY() > other.getY()) {
            return 1;
        } else if (this.getX() < other.getX() && this.getY() < other.getY()) {
            return -1;
        } else {
            return 0;
        }
    }
    
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Entity)) return false;
        Entity e = (Entity) other;
        return this.getX() == e.getX() && this.getY() == e.getY();
    }

    
    
}
