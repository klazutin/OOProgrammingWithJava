
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand = new ArrayList<Card>();
    
    public Hand(){
        
    }
    
    public void add (Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for (Card c : this.hand){
            System.out.println(Card.VALUES[c.getValue()] + " of " + Card.SUITS[c.getSuit()]);
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand o) {
        int thisValue = 0;
        for (Card c : this.hand){
            thisValue += c.getValue();
        }
        int otherValue = 0;
        for (Card c: o.hand){
            otherValue += c.getValue();
        }
        if (thisValue > otherValue){
            return 1;
        } else if (thisValue < otherValue){
            return -1;
        } else {
            return 0;
        }
    }
}
