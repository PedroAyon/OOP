package unidad1y2.car;

/**
 * @author Pedro Ayon
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model S");
        car.turnOn();
        car.acelerate(50);
        car.acelerate(100);
        car.acelerate(100);
        System.out.println(car);
        car.decelerate(100);
        car.turnOff();
        car.turnOnAlarm();
        car.turnOffAlarm();
        car.decelerate(120);
        car.turnOff();
    }
}
