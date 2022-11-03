/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author klazutin
 */
public class PersonalBoard extends GameOfLifeBoard {
    
    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        Random rnd = new Random();
        boolean[][] board = super.getBoard();
        for (int x = 0; x < super.getWidth(); x++) {
            for (int y = 0; y < super.getHeight(); y++) {
                boolean nxt = rnd.nextDouble() < probabilityForEachCell;
                board[x][y] = nxt;
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {
            boolean[][] board = super.getBoard();
            return board[x][y];
        } else {
            return false;
        }
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (x >= 0 && x <= super.getWidth() && y >= 0 && y <= super.getHeight()) {
            boolean[][] board = super.getBoard();
            board[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x >= 0 && x <= super.getWidth() && y >= 0 && y <= super.getHeight()) {
            boolean[][] board = super.getBoard();
            board[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int result = 0;
        boolean[][] board = super.getBoard();
        for (int testX = x-1; testX <= x+1; testX++) {
            for (int testY = y-1; testY <= y+1; testY++ ) {
                if (testX >= 0 && testX < super.getWidth() && testY >= 0 && testY < super.getHeight()){
                    if (!(testX == x && testY == y)){
                        if (board[testX][testY] == true) {
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (livingNeighbours < 2 || livingNeighbours > 3) {
            this.turnToDead(x, y);
        } else if (livingNeighbours == 3) {
            this.turnToLiving(x, y);
        }
    }
    
}
