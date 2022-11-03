/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author klazutin
 */
public class Worm {
    private int y;
    private int x;
    private Direction direction;
    private ArrayList<Piece> pieces;
    private boolean growFlag;
    
    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(originalX, originalY));
    }
    
    public Direction getDirection() {
        return this.direction;
    }
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    public int getLength() {
        return this.pieces.size();
    }
    
    public List<Piece> getPieces(){
        return this.pieces;
    }
    
    public void move() {
        int deltaX = 0;
        int deltaY = 0;
        switch (this.direction) {
            case LEFT:
                deltaX = -1;
                break;
            case RIGHT:
                deltaX = 1;
                break;
            case DOWN:
                deltaY = 1;
                break;
            case UP:
                deltaY = -1;
                break;
        }
        int headX = this.pieces.get(this.pieces.size() - 1).getX();
        int headY = this.pieces.get(this.pieces.size() - 1).getY();
        this.pieces.add(new Piece(headX + deltaX, headY + deltaY));
        
        if (this.pieces.size() > 3 && !this.growFlag){
            this.pieces.remove(0);
        } else {
            this.growFlag = false;
        }
    }
    
    public void grow() {
        this.growFlag = true;
    }
    
    public boolean runsInto(Piece piece) {
        boolean result = false;
        for (Piece p : this.pieces) {
            if (p.runsInto(piece)) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    public boolean runsIntoItself() {
        Piece head = this.pieces.get(this.pieces.size() - 1);
        boolean result = false;
        for (int i = 0; i < this.pieces.size() - 2; i++) {
            if (this.pieces.get(i).runsInto(head)) {
                result = true;
                break;
            }
        }        
        return result;
    }
}
