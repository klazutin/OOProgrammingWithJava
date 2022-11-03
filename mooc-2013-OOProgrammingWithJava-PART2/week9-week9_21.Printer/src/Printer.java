
import java.io.File;
import java.io.FileNotFoundException;
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
public class Printer {
    private File f;
    
    public Printer(String filename) throws Exception {
        this.f = new File(filename);
    }
    
    public void printLinesWhichContain (String word) throws Exception {
        Scanner reader = new Scanner(this.f);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if (line.contains(word) || word == "") {
                System.out.println(line);
            }
        }
    }
}
