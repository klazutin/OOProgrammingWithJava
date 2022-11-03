/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
    private Reader reader = new Reader();
    private int count;
    
    public Calculator(){
        
    }
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }    
    
    private void sum(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("sum of the values " + (value1 + value2));
        count++;
    }
    
    private void difference(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("difference of the values " + (value1 - value2));
        count++;
    }
    
    private void product(){
        ArrayList<Integer> res = ask();
        int value1 = res.get(0);
        int value2 = res.get(1);
        System.out.println("product of the values " + (value1 * value2));
        count++;
    }    

    private void statistics(){
        System.out.println("Calculations done " + this.count);
    }    
    
    private ArrayList<Integer> ask(){
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        return new ArrayList<Integer>(Arrays.asList(value1, value2));
    }
}
