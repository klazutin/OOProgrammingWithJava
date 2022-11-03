/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author klazutin
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file) {
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        int wordCount = 0;
        while (reader.hasNext()) {
            wordCount++;
            reader.next();
        }
        return wordCount;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(this.file);
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.contains("z")){
                words.add(word);
            }
        }
        return words;
    }    
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(this.file);
        while (reader.hasNext()) {
            String word = reader.next();
            if (word.endsWith("l")){
                words.add(word);
            }
        }
        return words;
    }
    
    public List<String> palindromes() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(this.file);
        while (reader.hasNext()) {
            String word = reader.next();
            String inverse = new StringBuilder(word).reverse().toString();
            if (word.equals(inverse)){
                words.add(word);
            }
        }
        return words;        
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");
        while (reader.hasNext()) {
            String word = reader.next();
            System.out.println(word);
            String vowelString = "aeiouyäö";
            char[] vowels = vowelString.toCharArray();
            boolean allVowels = false;
            
            for (char v : vowels) {
                System.out.println("testing " + v);
                if (word.contains("" + v)) {
                    allVowels = true;
                    System.out.println("Match!");
                } else {
                    allVowels = false;
                    break;
                }
            }
            if (allVowels) {
                words.add(word);
            }
            System.out.println("");
        }
        System.out.println(words);
        return words;        
    }
}
