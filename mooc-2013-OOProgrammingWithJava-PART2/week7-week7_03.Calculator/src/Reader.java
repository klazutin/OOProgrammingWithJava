/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
import java.util.Scanner;

public class Reader {
    private Scanner reader = new Scanner(System.in);
    
    public Reader(){
        
    }
    
    public String readString(){
        return reader.nextLine();
    }
    
    public int readInteger(){
        return Integer.parseInt(this.readString());
    }
}
