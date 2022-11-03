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

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public Phonebook (){
    }
    
    public void add(String name, String number){
        persons.add(new Person(name, number));
    }
    
    public void printAll(){
        for (Person p : this.persons){
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name){
        String result = "";
        for (Person p : this.persons){
            if (p.getName() == name){
                result = p.getNumber();
            }
        }
        if (result.isEmpty()){
            result = "number not known";
        }
        return result;
    }
}
