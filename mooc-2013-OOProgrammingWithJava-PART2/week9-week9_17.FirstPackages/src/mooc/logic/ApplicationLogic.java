/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author klazutin
 */
public class ApplicationLogic {
    private UserInterface u;
    
    public ApplicationLogic(UserInterface ui){
        u = ui;
    }
    
    public void execute(int howManyTimes) {
        while (howManyTimes > 0){
            System.out.println("The application logic works");
            u.update();
            howManyTimes--;
        }
        
    }
}
