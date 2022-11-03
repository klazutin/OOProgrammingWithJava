
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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    private void add(){
        System.out.print("In Finnish: ");
        String fin = this.reader.nextLine();
        System.out.print("Translation: ");
        String trn = this.reader.nextLine();
        if (fin != null && trn != null){
            this.dictionary.add(fin, trn);
        }        
    }
    
    private void translate(){
        System.out.print("Give a word: ");
        String wrd = this.reader.nextLine();
        if (this.dictionary.translate(wrd) != null) {
            System.out.println("Translation: " + this.dictionary.translate(wrd));
        }
    }
    
    public void start(){
        while (true){
            System.out.print("Statement: ");
            String statement = this.reader.nextLine();
            if (statement.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")){
                this.add();
            } else if (statement.equals("translate")){
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}