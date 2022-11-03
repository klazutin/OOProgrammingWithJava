/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author klazutin
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    
    private Map<String, Set<String>> dict = new HashMap<String, Set<String>>();

    @Override
    public void add(String word, String entry) {
        if (!dict.containsKey(word)) {
            dict.put(word, new HashSet<String>());
            
        }
        dict.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (dict.containsKey(word)) {
            return dict.get(word);
        } else {
            return null;
        }
    }

    @Override
    public void remove(String word) {
        if (dict.containsKey(word)) {
            dict.remove(word);
        }
    }
    
}
