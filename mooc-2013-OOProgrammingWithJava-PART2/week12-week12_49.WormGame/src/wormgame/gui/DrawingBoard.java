/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

/**
 *
 * @author klazutin
 */
public class DrawingBoard extends JPanel implements Updatable {
    
    private WormGame game;
    private int pieceLength;
    
    public DrawingBoard(WormGame game, int pieceLength) {
        super();
        this.game = game;
        this.pieceLength = pieceLength;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Worm worm = game.getWorm();
        for (Piece p : worm.getPieces()) {
            g.setColor(Color.BLACK);
            g.fill3DRect(p.getX() * this.pieceLength, p.getY() * this.pieceLength, this.pieceLength, this.pieceLength, true);
        }
        Apple apple = game.getApple();
        g.setColor(Color.RED);
        g.fillOval(apple.getX() * this.pieceLength, apple.getY() * this.pieceLength, this.pieceLength, this.pieceLength);
        
    }

    @Override
    public void update() {
        super.repaint();
    }
}
