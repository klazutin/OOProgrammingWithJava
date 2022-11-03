/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author klazutin
 */
public class Square extends Box {
    private int sideLength;
    
    public Square(int x, int y, int sideLength) {
        super(x, y, sideLength, sideLength);
    }

}
