package unidad1.AC;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CREAMOS EL CLIMA1");
        AC ac1 = new AC(15, 30);
        System.out.println("Temperatura actual:" + ac1.getTemperature());
        ac1.warm();
        ac1.warm();
        ac1.warm();
        ac1.warm();
        ac1.cool();
        ac1.setIncrement(-1);
        ac1.cool();
        ac1.cool();
        ac1.cool();
        ac1.cool();
        ac1.setIncrement(2);
        ac1.cool();
        ac1.cool();
        ac1.cool();
        ac1.cool();
        ac1.cool();
        ac1.cool();
        ac1.printData();
        System.out.println("*************************");
        System.out.println("CREAMOS EL CLIMA2");
        AC ac2 = new AC(15, 30);
        System.out.println("Temperatura actual:" + ac2.getTemperature());
        ac2.warm();
        ac2.cool();
        ac2.printData();
    }
}
