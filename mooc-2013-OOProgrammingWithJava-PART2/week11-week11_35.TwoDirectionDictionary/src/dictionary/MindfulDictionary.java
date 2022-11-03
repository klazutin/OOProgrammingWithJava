/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author klazutin
 */
public class MindfulDictionary {
    
    private HashMap<String, String> dict;
    private String file;
    
    public MindfulDictionary() {
        this.dict = new HashMap<String, String>();
    }
    
    public MindfulDictionary (String file) {
        this();
        this.file = file;
    }
    
    public boolean load() {
        try {
            FileReader fr = new FileReader(this.file);
            Scanner fileReader = new Scanner(fr);
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(":"); 
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        try {
            FileWriter fw = new FileWriter(this.file);
            ArrayList<String> written = new ArrayList<String>();
            for (String k : this.dict.keySet()){
                if (!written.contains(k) && !written.contains(this.translate(k))){
                    String exp = k + ":" + this.dict.get(k);
                    fw.append(exp + "\n");
                    written.add(k);
                    written.add(this.translate(k));
                }
            }
            fw.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void add(String word, String translation) {
        if (!this.dict.containsKey(word)){
            this.dict.put(word, translation);
            this.dict.put(translation, word);
        }
    }
    
    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
    }
    
    public void remove(String word) {
        if (this.dict.containsKey(word) || this.dict.containsKey(this.translate(word))) {
            this.dict.remove(this.translate(word));
            this.dict.remove(word);
        }
    }
}
