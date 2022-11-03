/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author klazutin
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> entries = new HashSet<String>();
    private int dupCount = 0;

    @Override
    public void add(String characterString) {
        if (this.entries.contains(characterString)) {
            this.dupCount++;
        } else {
            this.entries.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.dupCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.entries;
    }

    @Override
    public void empty() {
        this.entries.clear();
        this.dupCount = 0;
    }
    
}
