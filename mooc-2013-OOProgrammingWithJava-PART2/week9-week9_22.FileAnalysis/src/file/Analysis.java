/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author klazutin
 */
public class Analysis {
    private File file;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() throws Exception {
        Scanner reader = new Scanner(this.file);
        int lines = 0;
        while(reader.hasNextLine()) {
            lines++;
            reader.nextLine();
        }
        return lines;
    }
    
    public int characters() throws Exception {
        Scanner reader = new Scanner(this.file);
        int chars = 0;
        while(reader.hasNextLine()) {
            chars += reader.nextLine().length();
            chars++;  // counts line breaks as symbols
        }
        return chars;        
    }
}
