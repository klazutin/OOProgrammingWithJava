/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author klazutin
 */
public class KeyboardListener implements KeyListener {
    private Component component;
    private Figure figure;
    
    public KeyboardListener(Component component, Figure figure) {
        this.component = component;
        this.figure = figure;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.figure.move(-1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.figure.move(1, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.figure.move(0, -1);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.figure.move(0, 1);
        }       
        this.component.repaint();
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
