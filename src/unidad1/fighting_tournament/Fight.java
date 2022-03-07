package unidad1.fighting_tournament;

/**
 * @author Pedro Ayon
 */
public class Fight {
    private final Fighter fighter1;
    private final Fighter fighter2;
    private Integer fighter1Points = 0;
    private Integer fighter2Points = 0;

    public Fight(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public Fighter start() {
        System.out.printf("Fight: %s vs %s\n", fighter1.name(), fighter2.name());
        rounds();
        return getWinner();
    }

    private void rounds() {
        for (int round = 1; !thereIsAWinner(); round++)
            if (Round.start(round, fighter1, fighter2) == fighter1) fighter1Points++;
            else fighter2Points++;
    }

    private Fighter getWinner() {
        Fighter winner = fighter1Points == 3 ? fighter1 : fighter2;
        System.out.printf("Fight winner: %s\nScore: %d - %d\n", winner.name(), fighter1Points, fighter2Points);
        return winner;
    }

    private boolean thereIsAWinner() {
        return fighter1Points == 3 || fighter2Points == 3;
    }
}
