
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class PhoneBook {
    private HashMap<String, ArrayList<String>> pb = new HashMap<String, ArrayList<String>>();
    private HashMap<String, HashMap<String, String>> ab = new HashMap<String, HashMap<String, String>>();
    
    public PhoneBook() {
        
    }
    
    public void addNumber(String person, String number) {
        if (!this.pb.containsKey(person)) {
            this.pb.put(person, new ArrayList<String>());
        };
        this.pb.get(person).add(number);
    }
    
    public ArrayList<String> getNumber(String person) {
        if (this.pb.containsKey(person)) {
            return this.pb.get(person);
        } else {
            return null;
        }   
    }
    
    public String getPerson(String number) {
        for (String person : pb.keySet()) {
            for (String num : pb.get(person)) {
                if (num.equals(number)) {
                    return person;
                }
            }
        }
        return null;
    }
    
    public void addAddress(String name, String street, String city) {
        if (!this.ab.containsKey(name)){
            this.ab.put(name, new HashMap<String, String>());
        }
        this.ab.get(name).put("street", street);
        this.ab.get(name).put("city", city);
    }
    
    public HashMap<String, String> getAddress(String name) {
        if (!this.ab.containsKey(name)){
            return null;
        } else {
            return this.ab.get(name);
        }    
    }
    
    public void deletePersonalInformation(String name){
        if (this.pb.containsKey(name)) {
            this.pb.remove(name);
        };
        if (this.ab.containsKey(name)) {
            this.ab.remove(name);
        }
    }
    
    public ArrayList<String> searchByKeyword(String keyword) {
        if (keyword == "") {
            return new ArrayList<String>(ab.keySet());
        }
        
        ArrayList<String> result = new ArrayList<String>();
        for (String name : ab.keySet()) {
            if (name.contains(keyword) || ab.get(name).get("street").contains(keyword) || ab.get(name).get("city").contains(keyword)){
                result.add(name);
            }
        }
        for (String name : pb.keySet()) {
            if (name.contains(keyword)){
                result.add(name);
            }
        }        

        Collections.sort(result);
        return result;
    }
    
}
