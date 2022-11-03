import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        Grades grades = new Grades();
        while(true){
            int points = lukija.nextInt();
            if (points >= 0 && points <= 29) {
                grades.addGrade(0);
            } else if (points >= 30 && points <= 34) {
                grades.addGrade(1);
            } else if (points >= 35 && points <= 39) {
                grades.addGrade(2);
            } else if (points >= 40 && points <= 44) {
                grades.addGrade(3);
            } else if (points >= 45 && points <= 49) {
                grades.addGrade(4);
            } else if (points >= 50 && points <= 60) {
                grades.addGrade(5);
            }             
            if(points == -1){
                break;
            }
        }
        grades.printGrades();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
