package unidad1.fighting_tournament;

import java.util.Random;

/**
 * @author Pedro Ayon
 */
public class Round {
    private static final Random random = new Random();

    public static Fighter start(int roundNumber, Fighter fighter1, Fighter fighter2) {
        int randomNumber = random.nextInt(1, fighter1.powerLevel() + fighter2.powerLevel() + 1);
        Fighter winner = randomNumber <= fighter1.powerLevel() ? fighter1 : fighter2;
        System.out.printf("Round %d, %s wins!\n", roundNumber, winner.name());
        return winner;
    }
}
