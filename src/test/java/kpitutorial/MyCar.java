package kpitutorial;

/**
 * Created by kpiekos on 7/14/2017.
 */
public class MyCar {
    private static int carCount;
    int speed;
    int gear;
    boolean lightsOn;
    private String make;

    public MyCar() {
        this.speed = 1;
        this.gear = 1;
        System.out.println("construct without args");
    }

    public MyCar(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        carCount++;
        System.out.println("construct with 2 args");

    }

    public MyCar(int speed, int gear, boolean lightsOn) {
        this(speed, gear);
        this.lightsOn = lightsOn;
        System.out.println("Contruct with calling another construct");
    }

    public static int getCarCount() {
        return carCount;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
