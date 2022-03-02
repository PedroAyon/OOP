package unidad1y2.tv;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        Television tv = new Television("LG", "Smart TV");
        System.out.println(tv);

        tv.powerButton();
        tv.printVolume();
        tv.increaseVolume();
        tv.muteButton();
        tv.decreaseVolume();

        for (int i = 0; i <= 10; i++) {
            tv.decreaseVolume();
        }

        for (int i = 0; i <= 15; i++) {
            tv.increaseVolume();
        }

        tv.display();
        for (int i = 0; i <= 6; i++) {
            tv.nextChannel();
            tv.display();
        }

        tv.powerButton();
        tv.display();
    }
}
