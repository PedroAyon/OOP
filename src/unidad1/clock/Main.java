package unidad1.clock;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock);

        clock.setTime(13);
        System.out.println(clock);

        clock.setTime(13, 8);
        System.out.println(clock);

        clock.setTime(13, 8, 7);
        System.out.println(clock);

        clock.setTime(25, -1, 96);

        clock.setTime();
        System.out.println(clock);
    }
}
