/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import wormgame.Direction;
import wormgame.domain.Worm;

/**
 *
 * @author klazutin
 */
public class KeyboardListener implements KeyListener{
    
    private Worm worm;
    
    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int keyCode = ke.getKeyCode();
        switch(keyCode) {
            case KeyEvent.VK_UP:
                this.worm.setDirection(Direction.UP);
                break;
            case KeyEvent.VK_DOWN:
                this.worm.setDirection(Direction.DOWN);
                break;
            case KeyEvent.VK_LEFT:
                this.worm.setDirection(Direction.LEFT);
                break;
            case KeyEvent.VK_RIGHT:
                this.worm.setDirection(Direction.RIGHT);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        
    }
}
