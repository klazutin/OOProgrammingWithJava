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
public enum EntityType {
    PLAYER ("@"), VAMPIRE ("v");
    
    private final String symbol;
    
    private EntityType(String symbol) {
        this.symbol = symbol;
    }
    
    public String symbol() {
        return this.symbol;
    }
    
}
