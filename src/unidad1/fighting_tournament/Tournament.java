package unidad1.fighting_tournament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pedro Ayon
 */
public class Tournament {
    List<Fighter> fighters;

    public Tournament(List<Fighter> fighters) {
        this.fighters = fighters;
    }

    public void start() {
        while (fighters.size() != 1) tournamentRound();
        System.out.printf("ABSOLUTE WINNER: %s!\n", fighters.get(0).name());
    }

    private void tournamentRound() {
        List<Fighter> roundWinners = new ArrayList<>();
        for (int i = 0; i < fighters.size() - 1; i += 2) {
            Fight fight = new Fight(fighters.get(i), fighters.get(i + 1));
            roundWinners.add(fight.start());
            System.out.println();
        }
        if (fighters.size() % 2 != 0) roundWinners.add(fighters.get(fighters.size() - 1));
        Collections.shuffle(roundWinners);
        fighters = roundWinners;
    }
}
