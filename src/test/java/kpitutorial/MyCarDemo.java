package kpitutorial;

/**
 * Created by kpiekos on 7/14/2017.
 */
public class MyCarDemo {
    public static void main(String[] args) {
        MyCar car1 = new MyCar(200, 5);
        MyCar car2 = new MyCar(333, 7);
        car1.setMake("BMW");
        System.out.println("car count=" + MyCar.getCarCount());


    }
}
