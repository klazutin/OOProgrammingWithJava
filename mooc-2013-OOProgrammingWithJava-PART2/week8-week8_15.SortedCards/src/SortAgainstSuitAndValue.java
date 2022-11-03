
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        int suitCompare = o1.getSuit()-o2.getSuit();
        if (suitCompare != 0){
            return suitCompare;
        } else {
            return o1.getValue() - o2.getValue();
        }
    }
    
}
