package unidad1.AC;

import java.util.stream.IntStream;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CREAMOS EL CLIMA1");
        AC ac1 = new AC(10, 30);
        IntStream.range(0, 4).forEach(i -> ac1.warm());
        IntStream.range(0, 5).forEach(i -> ac1.cool());
        ac1.setIncrement(10);
        IntStream.range(0, 3).forEach(i -> ac1.warm());
        IntStream.range(0, 3).forEach(i -> ac1.cool());

        System.out.println("============================");

        System.out.println("CREAMOS EL CLIMA1");
        AC ac2 = new AC(10, 30);
        IntStream.range(0, 4).forEach(i -> ac2.warm());
        IntStream.range(0, 5).forEach(i -> ac2.cool());
        ac2.setIncrement(-10);
        IntStream.range(0, 3).forEach(i -> ac2.warm());
        IntStream.range(0, 3).forEach(i -> ac2.cool());
    }
}
