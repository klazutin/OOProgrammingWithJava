 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class UI {
    private Scanner scanner;
    private ArrayList<Jumper> jumpers = new ArrayList<Jumper>();
    
    public UI(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public ArrayList<Jumper> getJumpers() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        String jumperName = "a";
       
        while (!jumperName.equals("")){
            System.out.print("  Participant name: ");
            jumperName = this.scanner.nextLine();
            if (!jumperName.equals("")) this.jumpers.add(new Jumper(jumperName));
        }
        System.out.println("");
        
        System.out.println("The tournament begins!");
        System.out.println("");
        return this.jumpers;
    }
    
    public boolean nextRound() {
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String command = this.scanner.nextLine();
        return command.equals("jump");
    }
    
    public void printRoundSummary(int roundNumber){
        System.out.println("");
        System.out.println("Round " + roundNumber);
        System.out.println("");
        System.out.println("Jumping order:");
        for (int i = 0; i < this.jumpers.size(); i++) {
            System.out.println(String.format("  %1$s. %2$s (%3$s points)", i+1, this.jumpers.get(i), this.jumpers.get(i).getPoints()));
        }
        System.out.println("");
    }
    
    public void printRoundAftermath(int roundNum) {
        System.out.println("Results of round " + roundNum);
        for (int i = 0 ; i < this.jumpers.size(); i++) {
            System.out.println("  " + this.jumpers.get(i).getName());
            System.out.println("    length: " + this.jumpers.get(i).getLengths().get(roundNum-1));
            System.out.println("    judge votes: " + this.jumpers.get(i).getVotesForRound(roundNum-1));
        }
        System.out.println("");
    }
    
    public void printTournamentResults() {
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (int i = 0; i < this.jumpers.size(); i++) {
            System.out.println(i+1 + "           " + this.jumpers.get(i) + " (" + this.jumpers.get(i).getPoints() + " points)");
            System.out.print("            jump lengths: ");
            for (int j = 0; j < this.jumpers.get(i).getLengths().size(); j++) {
                System.out.print(this.jumpers.get(i).getLengths().get(j) + " m");
                if (j != this.jumpers.get(i).getLengths().size()-1) System.out.print(", ");
            }
            System.out.println("\n");
        }
    }
}
