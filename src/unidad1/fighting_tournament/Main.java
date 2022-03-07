package unidad1.fighting_tournament;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        Tournament tournament = new Tournament(
                new ArrayList<>() {
                    {
                        add(new Fighter("Fighter 1", 50));
                        add(new Fighter("Fighter 2", 20));
                        add(new Fighter("Fighter 3", 80));
                        add(new Fighter("Fighter 4", 30));
                        add(new Fighter("Fighter 5", 90));
                        add(new Fighter("Fighter 6", 40));
                        add(new Fighter("Fighter 7", 100));
                        add(new Fighter("Fighter 8", 10));
                        add(new Fighter("Fighter 9", 110));
                        add(new Fighter("Fighter 10", 60));
                        add(new Fighter("Fighter 11", 50));
                    }
                }
        );
        tournament.start();
    }
}
