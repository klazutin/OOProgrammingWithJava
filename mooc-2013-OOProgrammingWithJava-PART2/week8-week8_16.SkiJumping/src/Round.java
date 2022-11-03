
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Round {
    private ArrayList<Jumper> jumpers;
    private int numberOfJudges = 5;
    
    public Round(ArrayList<Jumper> jumpers) {
        this.jumpers = jumpers;
    }
    
    private void jump(Jumper jumper) {
        int jumpLength = ThreadLocalRandom.current().nextInt(60, 120 + 1);
        jumper.addLength(jumpLength);
        
        ArrayList<Integer> points = new ArrayList<Integer>();
        int judgeNumber = 0;
        while (judgeNumber < numberOfJudges) {
            int score = ThreadLocalRandom.current().nextInt(10, 20 + 1);
            points.add(score);
            judgeNumber++;
        }
        jumper.addVotes(points);
        
        Collections.sort(points);
        int averagePoints = 0;
        // discard smallest and largest points
        for (int i = 1; i < points.size() - 1; i++) {
            averagePoints += points.get(i);
        }
        jumper.addPoints(averagePoints + jumpLength);
    }
    
    public void conductRound() {
        for (Jumper j : this.jumpers){
            this.jump(j);
        }
    }
}
