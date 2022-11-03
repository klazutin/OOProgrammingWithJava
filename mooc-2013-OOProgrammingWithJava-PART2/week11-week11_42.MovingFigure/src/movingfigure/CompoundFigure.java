/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author klazutin
 */
public class CompoundFigure extends Figure {
    private ArrayList<Figure> array;
    
    public CompoundFigure() {
        super(0,0);
        this.array = new ArrayList<Figure>();
    }
    
    public void add(Figure f) {
        array.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure f : array) {
            f.draw(graphics);
        }
    }
    
    public void move(int x, int y) {
        for (Figure f : array) {
            f.move(x, y);
        }
    }
    
}
