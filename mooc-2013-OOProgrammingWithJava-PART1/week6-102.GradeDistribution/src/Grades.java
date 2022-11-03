
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Grades {
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public void addGrade(int grade){
        grades.add(grade);
    }
    
    public void printGrades(){
        double ap = 0;
        double total = 0;
        System.out.println("Grade distribution:");
        System.out.println(grades);
        for (int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for(int g : grades){
                if(i == g){
                    System.out.print("*");
                }
                if(g != 0){
                    ap++;
                }
                total++;
            }
            System.out.println("");
        }
        System.out.println(ap);
        System.out.println(total);
        System.out.print("Acceptance percentage: " + ap/total*100.0);
    }
}
