
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Tournament {
    private UI ui;
    private ArrayList<Jumper> jumpers;
    
    public Tournament(UI ui) {
        this.ui = ui;
    }
    
    public void begin() {
        this.jumpers = this.ui.getJumpers();
        if (jumpers.isEmpty()) System.exit(0);
        int roundNumber = 1;
        while (ui.nextRound()) {
            Round round = new Round(this.jumpers);
            ui.printRoundSummary(roundNumber);
            round.conductRound();
            ui.printRoundAftermath(roundNumber);
            Collections.sort(this.jumpers);
            Collections.reverse(this.jumpers);
            roundNumber++;
        }
        Collections.sort(this.jumpers);
        ui.printTournamentResults();
    }
}
