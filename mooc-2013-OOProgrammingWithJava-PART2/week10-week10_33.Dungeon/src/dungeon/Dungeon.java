/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author klazutin
 */
public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private Entity player;
    private ArrayList<Entity> vampireList;
    private Scanner scanner;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.vampireList = new ArrayList<Entity>();
        this.scanner = new Scanner(System.in);
    }
    
    private void initialSetup() {
        this.player = new Entity(EntityType.PLAYER, 0, 0);
        
        for (int i = 0; i < this.vampires; i++){
            int x = ThreadLocalRandom.current().nextInt(1, this.length);
            int y = ThreadLocalRandom.current().nextInt(1, this.height);
            Entity vampire = new Entity(EntityType.VAMPIRE, x, y);
            this.vampireList.add(vampire);
        }
    }
    
    private void printStatus() {
        System.out.println(this.moves);
        System.out.println("");
        System.out.println(this.player);
        for (Entity vampire : this.vampireList){
            System.out.println(vampire);
        }
        System.out.println("");
    }
    
    private void printMap() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.length; j++) {
                boolean done = false;
                if (j == this.player.getX() && i == this.player.getY()) {
                    System.out.print(this.player.symbol());
                    done = true;
                }                
                for (Entity vampire : this.vampireList) {
                    if (j == vampire.getX() && i == vampire.getY()) {
                        System.out.print(vampire.symbol());
                        done = true;
                        break;
                    }
                }
                if (!done) System.out.print(".");
                if (j == this.length-1) System.out.print("\n");
            }
        }        
        System.out.println("");
    }
    
    private void getUserInput() {
        String input = this.scanner.nextLine();
        for (char c : input.toCharArray()) {
            int newCoord = 0;
            switch (c) {
                case 'w':
                    newCoord = this.player.getY() - 1;
                    if (newCoord >= 0 && newCoord < this.height) {
                        this.player.setY(newCoord);
                    }
                    break;
                case 's':
                    newCoord = this.player.getY() + 1;
                    if (newCoord >= 0 && newCoord < this.height) {
                        this.player.setY(newCoord);
                    }
                    break;
                case 'a':
                    newCoord = this.player.getX() - 1;
                    if (newCoord >= 0 && newCoord < this.length) {
                        this.player.setX(newCoord);
                        newCoord = 0;
                        break;
                    }
                case 'd':
                    newCoord = this.player.getX() + 1;
                    if (newCoord >= 0 && newCoord < this.length) {
                        this.player.setX(newCoord);
                        newCoord = 0;
                        break;
                    }
            }
        }
    }
    
    private void checkCollisions() {
        ArrayList<Entity> toDelete = new ArrayList<Entity>();
        for (Entity vampire : this.vampireList) {
            if (this.player.equals(vampire)) {
                toDelete.add(vampire);
            }
        }
        this.vampireList.removeAll(toDelete);
        if (this.vampireList.size() == 0) {
            System.out.println("YOU WIN");
        }        
    }
    
    private void moveVampires() {
        if (!this.vampiresMove) return;
        ArrayList<Integer> usedX = new ArrayList<Integer>();
        ArrayList<Integer> usedY = new ArrayList<Integer>();
        for (Entity vampire : this.vampireList) {
            int x = ThreadLocalRandom.current().nextInt(1, this.length);
            int y = ThreadLocalRandom.current().nextInt(1, this.height);
            vampire.setX(x);
            vampire.setY(y);
        }
    }
    
    public void run() {
        this.initialSetup();
        do {
            this.printStatus();
            this.printMap();            
            this.getUserInput();
            this.checkCollisions();
            this.moveVampires();
            this.moves--;
        } while (this.moves > 0);
        System.out.println("YOU LOSE");
    }
}