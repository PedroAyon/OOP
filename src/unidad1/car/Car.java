package unidad1.car;

/**
 * @author Pedro Ayon
 */
public class Car {
    private final String brand;
    private final String model;
    private final int kphLimit = 220;
    private int speed = 0;
    private boolean power = false;
    private boolean alarm = false;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        if (!this.power) {
            this.power = true;
            System.out.println("Vehicle on");
        }
    }

    public void turnOff() {
        if (this.speed == 0) {
            this.power = false;
            System.out.println("Vehicle off");
        } else System.out.println("Can't turn off, the vehicle is moving");
    }

    public void turnOnAlarm() {
        this.alarm = true;
        System.out.println("Alarm on");
    }

    public void turnOffAlarm() {
        this.alarm = false;
        System.out.println("Alarm off");
    }

    public void acelerate(int kph) {
        if (this.power) {
            for (int i = 0; i < kph; i++) {
                System.out.println("Speed: " + this.speed);
                if (this.speed < this.kphLimit)
                    this.speed++;
                else {
                    System.out.println("Speed limit reached (" + this.kphLimit + " kph)");
                    break;
                }
            }
        } else System.out.println("Vehicle is off");
    }

    public void decelerate(int kph) {
        if (this.power) {
            for (int i = 0; i < kph; i++) {
                System.out.println("Speed: " + this.speed);
                if (this.speed > 0)
                    this.speed--;
                else {
                    System.out.println("Vehicle stopped moving");
                    break;
                }
            }
        } else System.out.println("Vehicle is off");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", kphLimit=" + kphLimit +
                ", speed=" + speed +
                ", power=" + power +
                ", alarm=" + alarm +
                '}';
    }
}
